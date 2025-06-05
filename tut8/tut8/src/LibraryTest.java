
    public class LibraryTest {
        public static void main(String[] args) {

            System.out.println("Welcome to " + MediaItem.libraryNAME);
            System.out.println("Maximum rental time: " + Rentable.maximumRentDays + " days\n");


            Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978-0-7432-7356-5");
            System.out.println(book1.getDisplayString());
            System.out.println("Available: " + book1.isAvailable());

            // renting
            if (book1.rent()) {
                System.out.println("Book rented!");
            }
            System.out.println("Available after rental: " + book1.isAvailable());

            // late fee calculation
            System.out.println("Late fee for 3 days: $" + Rentable.calculateLateFee(3));

            //returning a book
            book1.returnItem();
            System.out.println("Available after return: " + book1.isAvailable() + "\n");


            Movie movie1 = new Movie("Moana", "Ron Clements & John Musklr", 2016, 107);
            System.out.println(movie1.getDisplayString());


            if (movie1.rent()) {
                System.out.println("Movie rented successfully!");
            }


            if (!movie1.rent()) {
                System.out.println("Movie is already rented!");
            }
        }
    }


