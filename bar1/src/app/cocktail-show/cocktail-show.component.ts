import {Component, Input} from '@angular/core';
import {Recipes} from "../../models/recipes";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Component({
  selector: 'app-cocktail-show',
  templateUrl: './cocktail-show.component.html',
  styleUrls: ['./cocktail-show.component.scss']


})
export class CocktailShowComponent
{
  cocktailapi : string = "http://localhost:8080/api/recipes"
  constructor(private httpClient: HttpClient) { }
  getbyid(id:number) : Observable<Recipes>
  {
    return this.httpClient.get<Recipes>(this.cocktailapi + '/' + id) ;
  }
  getApiResult() : Observable<Recipes>
  {
    return this.httpClient.get<Recipes>('')
  }


  @Input()
  recipe: Recipes|undefined;

}
