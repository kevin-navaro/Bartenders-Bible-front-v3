import {Component, OnInit} from '@angular/core';
import {Recipes} from "../../models/recipes";
import {Ingredients} from "../../models/ingredient";
import {HttpClientService} from "../../services/http-client.service";
import {IngredientRepositoryService} from "../../services/ingredient-repository.service";


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit
{

  cocktails: Recipes[] = [];
  ingredients: Ingredients[] = [];


  constructor(
    private ingredientRepository: IngredientRepositoryService
  ) {
  }

  ngOnInit() : void
  {
    this.cocktails = [
      {
        id: 1,
        name: 'Mojito',
        hasAlcohol: true,
        image: '../../assets/body/mojito.jpg',
        description: 'xxx'
      },
      {
        id: 2,
        name: 'Virgin Sex on the Beach',
        hasAlcohol: false,
        image: '../../assets/body/sex-on-the-beach.jpg',
        description: 'xxx'
      },
      {
        id: 3,
        name: 'Cuba libre',
        hasAlcohol: true,
        image: '../../assets/body/cuba_libre.png',
        description: 'xxx'
      },
      {
        id: 4,
        name: 'Gin tonic',
        hasAlcohol: true,
        image: '../../assets/body/gin_tonic.jpg',
        description: 'xxx'
      },
      {
        id: 5,
        name: 'Sea and sun',
        hasAlcohol: false,
        image: '../../assets/body/sea_and_sun.jpg',
        description: 'xxx'
      },
      {
        id: 6,
        name: 'Fun cola',
        hasAlcohol: false,
        image: '../../assets/body/fun_cola.png',
        description: 'xxx'
      },
    ]

    this.ingredientRepository.findAll().subscribe((ingredients) => {
      this.ingredients = ingredients;
    })

    // this.ingredients = [
    //   {
    //     id: 1,
    //     name: 'Vodka',
    //     image: './../assets/body/vodka.jpg',
    //     hasAlcohol: true
    //   },
    //   {
    //     id: 2,
    //     name: 'Rhum',
    //     image: './../assets/body/rhum.jpg',
    //     hasAlcohol: true
    //   },
    //   {
    //     id: 3,
    //     name: 'Whisky',
    //     image: './../assets/body/whisky.jpg',
    //     hasAlcohol: true
    //   },
    //   {
    //     id: 4,
    //     name: 'Coca cola',
    //     image: './../assets/body/coca_cola.png',
    //     hasAlcohol: false
    //   },
    // ]
  }
}
