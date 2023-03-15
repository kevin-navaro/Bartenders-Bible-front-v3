import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";


export abstract class HttpClientService<T> {

  protected jsonHeaders: {headers: HttpHeaders} = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      //'Authorization': 'bearer '
    })
  };

  protected constructor(
    protected httpClient: HttpClient,
    protected urlApi: string,
    protected model: string
  ) { }

  findAll(): Observable<Array<T>> {
    return this.httpClient.get<Array<T>>(this.urlApi + this.model);
  }

}
