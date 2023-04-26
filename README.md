# Spring Boot Security

This is a secure Spring Boot Restful web application built using JWT to enforce access control by issuing an access token that expires over time.

The access token is verified through a custom authentication filter which checks against a predefined secret key. If the token is valid, the user is granted access to the application and its resources, including the AWS RDS.

The application is deployed on AWS Elastic bean and uses AWS RDS.

## Stack
```bash
Spring Boot
JWT
AWS Elastic Bean
AWS RDS
Maven
```

## Why build secure backend applications?

```bash
1.To protect User Data
2.To maintain business reputation
3.To enhance functionality, and
4.To comply with regulation(s)
```

## Usage

```bash
To run the application, clone the repository and add your AWS RDS credentials in the 'application.properties' file.
Then, build and run the project using Maven.
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
