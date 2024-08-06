import { Injectable } from '@angular/core';
import { Atchayam } from './model/Atchayam';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SpeciesService {

  url:string;
  volunteer:Atchayam;
  volArr : Atchayam[];


  constructor(private http: HttpClient) {
    this.url="http://localhost:3004/Species_list";
    this.volunteer=new Atchayam();
    this.volArr=[];

   }

   updatevol(volunteer:Atchayam){
    this.http.put<Atchayam>(this.url+"/"+volunteer.id,volunteer).subscribe();
    return "Volunteer Data Updated";
   }

   savevol(volunteer:Atchayam){
    this.http.post<Atchayam>(this.url,volunteer).subscribe();
    return "Volunteer Data Saved";
   }

   deletevol(speId:number){
    this.http.delete<Atchayam>(this.url+"/"+speId).subscribe();
    return "Volunteer Data Deleted";
   }

   findvol(speId:number){
    this.http.get<Atchayam>(this.url+"/"+speId).subscribe(data=>this.volunteer=data);
    return this.volunteer;
   }

   findallvol(){
    this.http.get<Atchayam[]>(this.url).subscribe(data=>this.volArr=data);
    return this.volArr;
   }


}