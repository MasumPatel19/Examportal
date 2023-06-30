import { Component } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from 'src/app/services/user.service';
import swal from 'sweetalert2';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

  constructor(private userService: UserService, private snak: MatSnackBar) { }

  public user = {

    userName: '',
    password: '',
    firstName: '',
    lastName: '',
    email: '',
    phone: ''
  }

  formSubmit() {
    console.log(this.user);
    if (this.user.userName == '' || this.user.userName == null) {
      // alert("Username required..!");
      this.snak.open('Username is required !', '', {
        duration: 3000,
        // horizontalPosition:'left',
        // verticalPosition:'top'
      })
      return;
    }

    this.userService.addUser(this.user).subscribe(
      (data : any) => {
        console.log(data);
        // alert("Form submitted successfully");
        swal.fire(
          'Sucsess!',
          'User is registered',
          'success'
        )
      },
      (error) => {
        console.log(error);
        this.snak.open('Something went wrong','ok')
      }
    );

  }
}
