# Newscliect

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 17.3.6. for the frontend and Spring Boot for the backend  https://github.com/kethmika96/newssite_service.git, integrated with a MySQL database. It fetches and displays the latest news articles from an external API.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Installation

To run this application locally, follow these steps:

1. Clone the repository:
2. Navigate to the project directory:
3. Install frontend dependencies:
4. Install backend dependencies:
5. No need to set up MySQL database: Configures Hibernate to automatically update the database schema based on the entity classes. Be cautious with this setting in production as it can lead to data loss or unexpected schema changes.
6. Configure database connection properties in `backend/src/main/resources/application.properties`.
7. Run the backend server:
8.  Run the frontend server:
9.  Access the application in your web browser at http://localhost:4200.

## Usage

Once the application is running, you can:
- View the latest news articles on the viewpage.
- Click on an article to read the full details.
- Add new articles on the create post page

## API Documentation

The backend exposes RESTful APIs for fetching news articles. You can find detailed API documentation at:

[API Documentation](backend/api-docs)

## Database Schema

The MySQL database schema consists of the following tables:

- `post`: id, name, content, img, postby, date. likecount, viewcount


For detailed schema information, refer to ``.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
