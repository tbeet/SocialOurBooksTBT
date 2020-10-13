import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from '../../components/register/register.component'; 

import {MatToolbarModule} from '@angular/material/toolbar';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatCardModule} from '@angular/material/card';
import {MatIconModule} from '@angular/material/icon';
import {MatGridListModule} from '@angular/material/grid-list';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';


const routes: Routes = [ 
  {
    path:'',
    component: RegisterComponent
  }
]


@NgModule({
  declarations: [
    RegisterComponent
  ],
  imports: [
    
    
    HttpClientModule,
    /* materila */
    MatGridListModule,
    MatIconModule,
    MatCardModule,
    ReactiveFormsModule,
    FormsModule,
    MatInputModule,
    MatToolbarModule,
    MatFormFieldModule,
    CommonModule,
    RouterModule.forChild(routes)
  ], 
  providers: [ 
    HttpClientModule
  ]

})
export class RegisterModule{ }
