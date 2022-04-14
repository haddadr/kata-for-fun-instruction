import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html'
})
export class KataForFunFormComponent implements OnInit {

  @Output()
  private submitNumberOutput: EventEmitter<number> = new EventEmitter<number>();

  inputForm: FormGroup;

  constructor() {

    this.inputForm = new FormGroup({
      input: new FormControl('', [Validators.required])
    });
  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.inputForm.value.input);
  }

}
