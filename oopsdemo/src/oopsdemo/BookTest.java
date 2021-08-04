package oopsdemo;

public class BookTest {

	public static void main(String[] args) {
			Book b1=new Book();
			
			b1.setBookId(2435);
			b1.setBookName("Unfinished");
			b1.setPrice(457);
			b1.setPublisher("Penguin|viking");
			
			System.out.println("----book details-----");
			System.out.println(b1.getBookId());
			System.out.println(b1.getBookName());
			System.out.println(b1.getPrice());
			System.out.println(b1.getPublisher());
			
			System.out.println(b1); //invoke to string method in the instance class
			
			
		   /*       int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        } */
			
	}

}
