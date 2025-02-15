import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../../environments/environment';

@Component({
  selector: 'app-manager',
  templateUrl: './manager.component.html',
  styleUrls: ['./manager.component.scss']
})
export class ManagerComponent implements OnInit {
  message = 'message';
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get(`${environment.serverUrl}/manager`).subscribe((data: any) => {this.message = data.message; });
  }

}
