import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../../../src/environments/environment';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {
  private message: 'message';

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get(`${environment.serverUrl}/demo`).subscribe((data: any) => {this.message = data.message; });
  }

}
