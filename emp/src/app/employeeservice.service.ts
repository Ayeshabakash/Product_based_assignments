import { Injectable } from '@angular/core';
import { employee } from './model/employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  url:string;

  constructor(private http: HttpClient) {
    this.url="http://localhost:3004/employees";

   }

   insertEmployee(employee : employee){
    this.http.post<employee>(this.url, employee).subscribe();
    return "Employee Details Added";
   }
   updateEmployee(employee : employee){
    this.http.put<employee>(this.url+"/"+employee.id, employee).subscribe();
    return "Employee Details Updated";
   }
   deleteEmployee(id:number){
    this.http.delete<employee>(this.url+"/"+id).subscribe();
    return "Employee Details Deleted";
   }
   
}