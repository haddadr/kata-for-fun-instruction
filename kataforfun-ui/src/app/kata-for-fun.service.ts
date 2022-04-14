import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {

  // TODO can be done by interceptors
  private REST_API_SERVER = 'http://localhost:8080/kata-for-fun';

  constructor(private httpClient: HttpClient) { }

  public convert(inputNumber: number): Observable<any>{
    return this.httpClient.get(`${this.REST_API_SERVER}/${inputNumber}`);
  }

}
