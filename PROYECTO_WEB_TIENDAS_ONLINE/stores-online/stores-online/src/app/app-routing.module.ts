import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [  
  { 
    path:'login',
    loadChildren:()=> import('./modules/login/login.module').then( mod => mod.LoginModule)
  },
  {
    path:'register',
    loadChildren: () => import('./modules/register/register.module').then(mod => mod.RegisterModule)
  }
  

];

@NgModule({
  imports: [CommonModule,RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
