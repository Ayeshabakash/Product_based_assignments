import { Component } from '@angular/core';
import { employee } from './model/employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'employee';
  employee: employee;

  constructor(){
    this.employee=new employee();
  }
  insertEmployee(data:any){
    this.employee.empId=data.empId;
    this.employee.empName=data.empName;
    this.employee.empSalary=data.empSalary;
    alert(data.empId+" "+data.empName+" "+data.empSalary);
  }
}