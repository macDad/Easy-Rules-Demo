# Easy Rules Demo with Spring Boot

This is a simple Spring Boot application that demonstrates the usage of Easy Rules to apply discount rules based on a
person's age. The application includes a REST API endpoint that takes the age as input, applies Easy Rules, and returns
the updated Person object.

## Prerequisites

- Java 8 or higher
- Maven
- Git (optional)

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/xxxxxx/easy-rules-demo.git
    ```

2. Navigate to the project directory:

    ```bash
    cd easy-rules-demo
    ```

3. Build the application:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

The application will start, and you can access the REST API endpoint
at http://localhost:8080/api/checkDiscount/{name}/{age}.

## API Endpoint

### Check Discount

- **Endpoint:** `/api/checkDiscount/{age}`
- **Method:** GET
- **Path Variable:**
    - `name` (string): Name of the person
    - `age` (integer): Age of the person

#### Example

```bash
curl -X GET http://localhost:8081/api/checkDiscount/john/25
```

## Rules

The Easy Rules are defined in the `src/main/java/com/mad/easyrules/rules` package.
The `DiscountRule` class includes conditions to determine discount eligibility based on the person's age and applies
different discounts accordingly.

## Configuration

The `RulesEngine` is configured in the `RulesEngineConfig` class, which is used to manually fire rules in
the `PersonController`.