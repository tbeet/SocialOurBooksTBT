import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  hide = true;

  ngOnInit(): void {
  }

  constructor() {
  }
  //loginFormControl = new FormControl('',[Validators.email])

  loginFormGroup = new FormGroup({
    nombres: new FormControl('',[Validators.minLength(2),Validators.required]),
    apellidos: new FormControl('',[Validators.minLength(2),Validators.required]),       
    correo: new FormControl('',[Validators.required, Validators.email]),
    psdUsr: new FormControl('',[Validators.required, Validators.minLength(8)]),
    psdUsrRepeat: new FormControl('',[Validators.required, Validators.minLength(8)])
    
});

  login(){}
}