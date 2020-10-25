import java.util.Scanner;

public class TicketCMD {

    private TicketMachine ticketMachine = new TicketMachine();

    public void ticketCMDMenu(){
        System.out.println("=========欢迎使用自动售票机==========");
        System.out.println("本机销售固定票价2元的车票");
        System.out.println("1、投币");
        System.out.println("2、打印车票");
        System.out.println("3、找零");
        System.out.println("4、退出");
    }

    public void start(){
        ticketMachine.setPrice(2);
    }

    public void run(){
        boolean exitFlag = false;
        Scanner scanner = new Scanner(System.in);
        do{
            this.ticketCMDMenu();
            String choice = scanner.nextLine();
            switch(choice){
                case "1":
                    int amount;
                    amount = scanner.nextInt();
                    if(amount > 0) {
                        ticketMachine.insertMoney(amount);
                    } else {
                        System.out.println("请正常投币。。");
                    }
                    String space = scanner.nextLine();
                    break;
                case "2":
                    if(ticketMachine.getBalance() >= ticketMachine.getPrice()){
                        ticketMachine.print();
                    } else{
                        System.out.println("余额不足，请投币。。");
                    }
                    System.out.println("当前余额：" + ticketMachine.getBalance());
                    break;
                case "3":
                    System.out.println("请收好找零：" + ticketMachine.getBalance() + "元");
                    exitFlag = true;
                    break;
                case "4":
                    exitFlag = true;
                    break;
                default:
                    System.out.println("请输入正确的数字选项。。。");
                    break;
            }
            if(exitFlag){
                break;
            }
        }while(true);
    }

    public static void main(String[] args) {
        TicketCMD ticketCMD = new TicketCMD();
        ticketCMD.start();
        ticketCMD.run();
    }
}
