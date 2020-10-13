import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  hide = true;
  
  ngOnInit(): void {
  }

  constructor() {
  }

  loginFormGroup = new FormGroup({
    nombres: new FormControl('',[Validators.minLength(2),Validators.required]),
    apellidos: new FormControl('',[Validators.minLength(2),Validators.required]),       
    email: new FormControl('',[Validators.required, Validators.email]),
    psdUsr: new FormControl('',[Validators.required, Validators.minLength(8)]),
    psdUsrRepeat: new FormControl('',[Validators.required, Validators.minLength(8)])
  })
}
