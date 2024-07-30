import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AyeshaComponent } from './ayesha.component';

describe('AyeshaComponent', () => {
  let component: AyeshaComponent;
  let fixture: ComponentFixture<AyeshaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AyeshaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AyeshaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
