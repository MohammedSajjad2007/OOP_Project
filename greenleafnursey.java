class plant{
    private String plantid;
    private String plantname;
    private String catagory;
    private double price;
    private supplier spy;

    plant(String id, String pname, String cat, double price, supplier spy){
        this.plantid = id;
        this.plantname = pname;
        this.catagory = cat;
        this.price =  price;
    }
    public String getPlantid(){
        return plantid;
    }
    public String getPlantname(){
        return plantname;
    }
    public String getCatagory(){
        return catagory;
    }
    public double getPrice(){
        return price;
    }

}
class supplier{
    private String suppid;
    private String name;
    private String contect;

    supplier(String sid, String sname , String scon){
        this.suppid = sid;
        this.name = sname;
        this.contect = scon;
    }
    public String getName(){
        return name;
    }
    public String getSuppid(){
        return suppid;
    }
    public String getContect(){
        return contect;
    }
}
class member{
    public static void main(String args[]){
        supplier sp = new supplier("S0332","MIKE" , "077233445");
        plant pt = new plant("P01332", "Mango" , "Out Door", 200.00,sp);

        System.out.println("PlantID: " + pt.getPlantid());
        System.out.println("Plant Name: " + pt.getPlantname());
        System.out.println("Catagory: " + pt.getCatagory());
        System.out.println("Price: " + pt.getPrice());
        System.out.println("***********************");
        System.out.println("SupplierID: " + sp.getSuppid());
        System.out.println("Supplier Name: " + sp.getName());
        System.out.println("Supplier contect: " + sp.getContect());

    }
}