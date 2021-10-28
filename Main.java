//поля: serialNumber, model, weight
//методы: вывод, receiveCall(String name), getNumber
//конструктор: для всех параметров, для number и model
//Классы: BabushkaPhone, SmartPhone
//метод sendMessage для SmartPhone
//переопределить метод receiveCall для бабушкафона
//придумать и добавить по 3поля для BabushkaPhone, SmartPhone
//также по 1 методу
//создать объекты всех классов и повзаимодействовать

class BabushkaPhone {
    String serialNumber;
    String model;
    int weight;
    int cost;

    public BabushkaPhone(String model, String serialNumber, int weight, int cost){
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.cost = cost;
    }

     public static void main(String[] args) {
         BabushkaPhone BabushkaPhone = new BabushkaPhone("I3346ty", "102982857623", 100, 800);
        System.out.println("Модель: " + BabushkaPhone.model + " Серийный номер: " + BabushkaPhone.serialNumber + " Вес: " + BabushkaPhone.weight + " Цена: " + BabushkaPhone.cost);
     }
}

class SmartPhone {
    String serialNumber;
    String model;
    int weight;
    int cost;

    public String sendMessage(String message){
        String mess = " Со счета списаны все деньги ";
        System.out.println(message);
        return mess;
    }

    public SmartPhone(String model, String serialNumber, int weight, int cost){
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.cost = cost;
    }

    public static void main(String[] args) {
        SmartPhone SmartPhone = new SmartPhone("I3346ty", "102982857623", 100, 2800000);
        System.out.println("Модель: " + SmartPhone.model + " Серийный номер: " + SmartPhone.serialNumber + " Вес: " + SmartPhone.weight + " Цена: " + SmartPhone.cost);

    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------|


public class Main {
    public static void main(String[] args) {

        class Phone{
            String serialNumber;
            String model;
            int weight;
            int cost;

            public Phone(String serialNumber, String model, int weight, int cost){
                this.serialNumber = serialNumber;
                this.model = model;
                this.weight = weight;
                this.cost = this.cost;
            }

            void receiveCall(){
                String message = "Message!";
                System.out.println(message);
                return;
            }
            
            class BabushkaPhone extends Phone {
                public BabushkaPhone(String serialNumber, String model, int weight) {
                    super(serialNumber, model, weight, cost);
                    BabushkaPhone bp = new BabushkaPhone("21312312", "fgd32432fsd", 100);
                    
                    System.out.println("serialNumber" + bp.serialNumber + "model" + bp.model + bp.weight + "weight");
                }
            }
            void getNumber(){
                int number = 1234567;
                System.out.println(number);
                return;
            }
            class SmartPhone extends Phone {
                public SmartPhone(String serialNumber, String model, int weight, int cost) {
                    super(serialNumber, model, weight, cost);
                    SmartPhone sp = new SmartPhone("21312312", "fgd32432fsd", 100, 1000);

                    System.out.println(" serialNumber " + sp.serialNumber + " model " + sp.model + " weight " + sp.weight + " cost " + sp.cost);
                }
            }
        }
    }
}
