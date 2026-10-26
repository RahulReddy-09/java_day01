class Main {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}