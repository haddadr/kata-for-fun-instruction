import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { KataForFunService } from '../kata-for-fun.service';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'
})
export class KataForFunComponent implements OnInit, OnDestroy {

  convertedValues: NumberConverted[] = [];

  constructor(private kataForFunService: KataForFunService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.kataForFunService.convert(inputNumber).subscribe(({result}) => {
      this.convertedValues.push({numberToConvert: inputNumber, result});
      console.log(result);
    });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
