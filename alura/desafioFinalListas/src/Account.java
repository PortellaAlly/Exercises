public class Account {
    private String name;
    private int limit;
    private int atualLimit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit > 0) {
            this.limit = limit;
        } else {
            System.out.println("Limite invalido");
        }
    }
}
