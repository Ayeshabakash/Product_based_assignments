import { Component } from '@angular/core';
import { employee } from './model/employee';
import { EmployeeService } from './employeeservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'employee';
  employee: employee;
  result : string;
  flag : boolean;

  constructor(private service : EmployeeService){
    this.employee=new employee();
    this.result="";
    this.flag=false;
  }
  insertEmployee(data:any){
    this.employee.id=data.empId;
    this.employee.empName=data.empName;
    this.employee.empSalary=data.empSalary;

    this.result=this.service.insertEmployee(this.employee);
  }
}