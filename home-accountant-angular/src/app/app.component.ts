import {Component,  OnInit} from '@angular/core';
import {MavenService} from "./app.service";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']


})
export class AppComponent implements OnInit {
  title = 'Home-accountant-system';
  public maven;


  constructor(private mavenService: MavenService) {

  }


  ngOnInit(): void {
    this.showMaven()
  }

  showMaven() {

    this.mavenService.getMaven()
      .subscribe(data => {
        this.maven = data;
        }
      )
  };

}












