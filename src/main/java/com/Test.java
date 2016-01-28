package com;


public class Test {
    public static void main(String[] args) {
        DesktopThings desktopBook = DesktopThings.BOOK;
        System.out.println("I want to take " + desktopBook);
        System.out.println();

        Desktop desktop = new Desktop("Dmitriy",DesktopThings.PEN);
        System.out.println(desktop.toString());
        System.out.println();
        DesktopThings nameOfThing = desktop.getDesktopThings();
        String nameOfOwner = desktop.getDesktopOwner();
        System.out.println(nameOfOwner + " took " + nameOfThing.toString() + " from the table.");
        System.out.println();

        for ( DesktopThings desktopThings : DesktopThings.values()){
            System.out.println("I want to take my " + desktopThings.toString());
        }

        System.out.println();

        switch (desktopBook){
            case PEN:
                System.out.println("I want to take " + desktopBook.toString());
                break;
            case CALCULATOR:
                System.out.println("I want to take " + desktopBook.toString());
                break;
            case BOOK:
                System.out.println("I want to take " + desktopBook.toString());
                System.out.println(desktopBook.toString("Hello"));  // ме лнцс онмърэ онвелс ме лнцс хяонкэгнбюрэ оепецпсгйс, йнрнпсч ъ б BOOK опнохяюк))??
                break;

        }
    }

}
