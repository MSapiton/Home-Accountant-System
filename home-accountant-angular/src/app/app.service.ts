import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from "rxjs/Observable";

@Injectable()
export class MavenService {
  title = 'Home-accountant-system';
  readonly URL = 'http://localhost:8080/api/version';


  constructor(private http: HttpClient) {
  }

  getMaven() {
    return this.http.get(this.URL);
  }
}
