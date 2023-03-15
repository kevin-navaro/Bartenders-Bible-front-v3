import {Inject, Injectable} from '@angular/core';
import {HttpClientService} from "./http-client.service";
import {Ingredients} from "../models/ingredient";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class IngredientRepositoryService extends HttpClientService<Ingredients>{

  constructor(httpClient: HttpClient, @Inject('urlApi') urlApi: string) {
    super(httpClient, urlApi, 'ingredients');
  }

}
