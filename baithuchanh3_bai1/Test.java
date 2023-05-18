package baithuchanh3_bai1;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hoa don: ");
        int orderID = sc.nextInt();
        System.out.print("nhap ngay hoa don (d/M/yyyy)");
        String orderDateStr = sc.next();
        DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate orderDate = LocalDate.parse(orderDateStr,datetimeformatter);
        
        Order order = new Order(orderID, orderDate);
        boolean continueAdding = true;
        while(continueAdding){
            System.out.println("Nhap ten san pham ");
            String productName =sc.next();
            sc.nextLine();
            System.out.println("Nhap ma san pham: ");
            String ProductID = sc.nextLine();
            System.out.println("Nhap don gia: ");
            double Price = sc.nextDouble();   
            System.out.println("Nhap so luong: ");
            int quantily = sc.nextInt(); 
            
            Product product = new Product(productName, ProductID, Price);
            order.addLineItems(product, quantily);
            
            System.out.print("Tiep tuc san pham ?(y/n): ");
            String choice = sc.next();
            continueAdding = choice.equalsIgnoreCase("y");
            
            
        }
        
        System.out.println("Ma hoa don: "+order.getOrderID());
        String fomattedDate = order.getOrderDate().format(datetimeformatter);
        
        System.out.println("Ngay lap hoa don: "+ fomattedDate);
        System.out.println("STT         |       Ma sp     |       Mo ta       |     Don gia     |       So luong        |       Thanh Tien      ");
        
        DecimalFormat decimalformat = new DecimalFormat("#,### VND");
        List<OrderDetail> lineItems = order.getLineItems();
        int stt = 1;
        for(OrderDetail orderDetail : lineItems){
            System.out.printf("%-10s  |         %-8s|%-19s|  %-15s|       %-15s |       %-15s\n"
                    ,stt
                    ,orderDetail.getProduct().getProductID()
                    ,orderDetail.getProduct().getDes()
                    ,decimalformat.format(orderDetail.getProduct().getPrice()),
                    orderDetail.getQuantily(),
                    decimalformat.format(orderDetail.calcTotalPrice()));
            stt++;
        }
        System.out.println("Tong thanh tien: "+decimalformat.format(order.calcTotalCharge(0)));
    }
}
