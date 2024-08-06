import { Component, importProvidersFrom } from '@angular/core';
import { Atchayam } from './model/Atchayam';
import { SpeciesService } from './species.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'atchayam';
  volunteer:Atchayam;
  result : string;
  volArr: Atchayam[];
  flag: boolean;

  constructor(private service : SpeciesService){
    this.volunteer=new Atchayam();
    this.result="";
    this.volArr=[];
    this.flag=false;
  }

  updatevol(data:any){
    this.volunteer.id=data.speId;
    this.volunteer.speName=data.speName;
    this.volunteer.spePlace=data.spePlace;
    this.result=this.service.updatevol(this.volunteer)
  }

  deletevol(data:any){
    this.result=this.service.deletevol(data.speId);
  }

  savevol(data:any){
    this.volunteer.id=data.speId;
    this.volunteer.speName=data.speName;
    this.volunteer.spePlace=data.spePlace;
    this.result=this.service.savevol(this.volunteer);
  }

  findvol(data:any){
    this.volunteer=this.service.findvol(data.speId);
    this.result=this.volunteer.id+" "+this.volunteer.speName+" "+this.volunteer.spePlace;
  }

  findallvol(){
    this.volArr=this.service.findallvol();
    this.flag=true;
  }

}