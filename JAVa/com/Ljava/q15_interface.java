package com.Ljava;

interface printable {
    void print();
}

class q15_interface implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        q15_interface obj = new q15_interface();
        obj.print();
    }
}