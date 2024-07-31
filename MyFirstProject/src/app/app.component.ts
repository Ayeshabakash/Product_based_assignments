import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string ;
  age : number;
  email : string;
  textcolor : string;
  fname : string="";
  flag : boolean = true;
  constructor() {
    this.name = "Siddhika";
    this.age = 21;
    this.email = "ayesha@gmail.com";
    this.textcolor = "green";
    //this flag =true;
  }
  getaddition(a : number,b : number)
  {
    let sum = a + b;
    return sum;
  }
  changename(){
    this.name = "Ayesha"
  }
  changeage(){
    this.age = 31
  }
  changemail(){
    this.email = "kalamayesha63@gmail.com.com"
  }
  changeFlag(){
    this.flag =!this.flag;
  }
  setSelectedItem(vec : string){
    this.selectedVehicle = vec;
  }
}
