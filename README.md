# Currency Converter
 Description
The Currency Converter is a Java console application that allows users to convert an amount from one currency to another. The user selects the base currency, target currency, and enters the amount to be converted. The application calculates and displays the converted amount using predefined exchange rates.

> **Note:** This version uses predefined exchange rates for compatibility with online Java compilers such as Programiz. In a production environment, real-time exchange rates can be obtained using a currency exchange API.
 Features
- Select base currency
- Select target currency
- Enter amount to convert
- Convert currency using exchange rates
- Display converted amount
- Console-based interface
- Input validation for supported currencies
Technologies Used
- Java
- Scanner Class
 Project Structure
CurrencyConverter.java
README.md
## Prerequisites
## How to Run

1. Clone the repository.

```bash
git clone https://github.com/your-username/CurrencyConverter.git
```

2. Navigate to the project folder.

```bash
cd CurrencyConverter
```

3. Compile the program.

```bash
javac CurrencyConverter.java
```

4. Run the program.

```bash
java CurrencyConverter
```

## Sample Output

========== Currency Converter ==========

Enter Base Currency (USD, INR, EUR): USD
Enter Target Currency (USD, INR, EUR): INR
Enter Amount: 100

========== Result ==========
100.00 USD = 8625.00 INR
 Supported Currencies

- USD – US Dollar
- INR – Indian Rupee
- EUR – Euro

Future Enhancements

- Integrate real-time exchange rates using a currency exchange API
- Support additional international currencies
- Add a graphical user interface (GUI)
- Store exchange rates in an external file or database

