import java.util.Scanner;

class Car {
    String carName, color, model;
    int year, distancePerLitre, leaseTime;
    double fuelLevel;

    public void getCarInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car name: ");
        carName = scanner.nextLine();
        System.out.print("Enter the car model (e.g., Vitz, Demio, Harrier): ");
        model = scanner.nextLine();
        System.out.print("Enter the color of the car: ");
        color = scanner.nextLine();
        System.out.print("Enter the year of make of the car: ");
        year = scanner.nextInt();
        System.out.print("Enter the distance per litre of the car: ");
        distancePerLitre = scanner.nextInt();
        System.out.print("What's the fuel level of the car in litres: ");
        fuelLevel = scanner.nextDouble();
        System.out.print("Enter the period of lease in days: ");
        leaseTime = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
    }

    public void displayCarInfo() {
        System.out.println("Car type: " + carName + ", model: " + model + ", color: " + color);
        System.out.println("Year of make: " + year + ", Distance: " + distancePerLitre + " km/l, Fuel level: " + fuelLevel + " litres");
        System.out.println("Lease period: " + leaseTime + " days");
    }
}

class Customer {
    int phoneNumber, paidAmount, balance, rentalFee;
    String firstName, middleName, emailAddress, address;

    public void getCustomerInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name of the customer: ");
        firstName = scanner.nextLine();
        System.out.print("Enter the middle name of the customer: ");
        middleName = scanner.nextLine();
        System.out.print("Enter the email address of the customer: ");
        emailAddress = scanner.nextLine();
        System.out.print("Enter the address of the customer: ");
        address = scanner.nextLine();
        System.out.print("Enter the phone number of the customer: ");
        phoneNumber = scanner.nextInt();
        System.out.print("Enter the paid amount by the customer: ");
        paidAmount = scanner.nextInt();
        System.out.print("Enter the rental fee of the car: ");
        rentalFee = scanner.nextInt();
        balance = rentalFee - paidAmount;
    }

    public void displayCustomerInfo() {
        System.out.println("Name: " + firstName + " " + middleName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + emailAddress);
        System.out.println("Address: " + address);
        System.out.println("Balance: Ksh " + balance);
    }
}

class RentalAgency {
    String rentalName, attendantName, location;
    int attendantId;

    public void getRentalInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the rental agency: ");
        rentalName = scanner.nextLine();
        System.out.print("Enter the location of the rental agency: ");
        location = scanner.nextLine();
        System.out.print("Enter the name of the attending agent: ");
        attendantName = scanner.nextLine();
        System.out.print("Enter the work ID of the attending agent: ");
        attendantId = scanner.nextInt();
    }

    public void displayRentalInfo() {
        System.out.println("Rental name: " + rentalName);
        System.out.println("Location: " + location);
        System.out.println("Attendant name: " + attendantName);
        System.out.println("Attendant ID: " + attendantId);
    }
}

public class Rental {
    public static void main(String[] args) {
        Car car = new Car();
        car.getCarInfo();
        Customer customer = new Customer();
        customer.getCustomerInfo();
        RentalAgency rentalAgency = new RentalAgency();
        rentalAgency.getRentalInfo();

        car.displayCarInfo();
        customer.displayCustomerInfo();
        rentalAgency.displayRentalInfo();
    }
}