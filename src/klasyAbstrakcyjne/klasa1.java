package klasyAbstrakcyjne;

abstract class klasa1 {
    protected String DB_CONNECTION ;
    protected String DB_HOST ;
    protected String DB_DATABASE ;
    protected String DB_USERNAME;

    protected String BROADCAST_DRIVER="log1";
    protected String CACHE_DRIVER;
    protected String FILESYSTEM_DISK;

    protected void connection() {

        System.out.println(this.DB_CONNECTION="mysql ");
        System.out.println(this.DB_HOST="127.0.0.1 ");
        System.out.println(this.DB_DATABASE=" baza ");
        System.out.println(this.DB_USERNAME=" root ");
        System.out.println(this.BROADCAST_DRIVER=" log");
    }


    abstract void BROADCAST_DRIVER();

}
