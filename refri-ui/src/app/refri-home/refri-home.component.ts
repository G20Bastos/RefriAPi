import { Component, OnInit } from '@angular/core';
import { RefrigeranteService } from '../refrigerante.service';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-refri-home',
  templateUrl: './refri-home.component.html',
  styleUrls: ['./refri-home.component.css']
})
export class RefriHomeComponent implements OnInit {

   refrigerante = {};
  refrigerantes = [];

  constructor(
    private refrigeranteService: RefrigeranteService,
    private messageService: MessageService
    
    ) { }

  ngOnInit() {
   this.consultar();
    
  }


    consultar(){
      this.refrigeranteService.listar()
      .subscribe(resposta => this.refrigerantes = <any> resposta)
    }

    adicionar(){
      this.refrigeranteService.adicionar(this.refrigerante)
      .subscribe(() => {
        this.refrigerante = {};
        this.consultar();

        this.messageService.add({
severity: 'success',
summary:'Refrigerante cadastrado com sucesso!'

        });
      },
      resposta => {
    let msgDefault = 'Erro inesperado. Por favor, tente novamente.'

if(resposta.error.message){
  msgDefault = resposta.error.message;
}

    this.messageService.add({
      severity: 'error',
      summary:msgDefault
      
              });

      });
    }
}
