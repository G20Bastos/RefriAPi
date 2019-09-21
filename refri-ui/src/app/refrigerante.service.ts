import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RefrigeranteService {

  apiUrl = 'http://localhost:8080/refrigerantes';

  constructor(private httpClient : HttpClient) { }

  listar(){
    return this.httpClient.get(this.apiUrl)
  }

  adicionar(refrigerante: any){
   
    return this.httpClient.post(this.apiUrl, refrigerante);

}
}
