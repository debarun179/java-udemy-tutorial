
class Contact {
    private String name;
    private String phoneno;

    public Contact(String name, String phoneno) {
        this.name = name;
        this.phoneno = phoneno;
    }
    public static void createContact(String name, String phoneno){
        name = name;
        phoneno = phoneno;
    }


    public String getName() {
        return name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
