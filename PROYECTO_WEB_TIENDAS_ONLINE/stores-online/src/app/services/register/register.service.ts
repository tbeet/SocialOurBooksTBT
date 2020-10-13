import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private _http: HttpClient){ }

  url = 'http://localhost:8080/createAccount';
  /*createUser( ) {
    
    const body = new HttpParams()
    .set('idUsuario','0')
    .set('nombreUsuario','0')
    .set('nombres','0')
    .set('apellidos','0')
    .set('correo','0')
    .set('pais','0')
    .set('contrasena','0')
    this.headers = this.getOptionsHeaders();
    return this._http.post('http://localhost:8080/createAccount', {body}, this.headers)
  }
*/

  createUser(){
    const body = new HttpParams()
    .set('nombre','0')

      
          //Establecemos cabeceras
      let headers = new HttpHeaders().set('Content-Type','application/json');

      return this._http.post(this.url, {body:body}, {headers: headers});
  }
}
