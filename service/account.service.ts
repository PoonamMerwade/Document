import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Account } from '../model/account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  private baseUrl="http://localhost:9191/account";


  constructor(private http:HttpClient) { }

  getAccountByUserName(userName:String){
    return this.http.get<Account>(`${this.baseUrl}/getAccount/${userName}`);
  }

  addAccount(account:Account): Observable<any> {
    return this.http.post<any>(this.baseUrl+"/add",account);
  }

  updateAccount(account:Account):Observable<Account>{
    return this.http.put<Account>(this.baseUrl+"/update",account);
  }
}
