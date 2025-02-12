import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllTemplatefrontComponent } from './all-templatefront.component';

describe('AllTemplatefrontComponent', () => {
  let component: AllTemplatefrontComponent;
  let fixture: ComponentFixture<AllTemplatefrontComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AllTemplatefrontComponent]
    });
    fixture = TestBed.createComponent(AllTemplatefrontComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
