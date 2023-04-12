package org.example;

import repo.*;

public class Main {

    public static void main(String[] args) {
        Document document1 = new Document("Doc 1",4.6,".pdf");
        Autor autor= new Autor("Ivan Vazov");
        Book book1= new Book("pod igoto",5.3,".txt",autor,"A123");

        System.out.println(document1);
        System.out.println(book1);

        Novel novel = new Novel("novel 1",2.3,".pdf",autor,"V12","abstract");
        System.out.println(novel);

        Newspaper newspaper = new Newspaper("24 4asa",3.4,".txt",31);
        System.out.println(newspaper);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//interface
        Document documentRef;
        documentRef = newspaper;
        System.out.println(documentRef.toString());
        documentRef = book1;
        System.out.println(documentRef.toString());
        documentRef = novel;
        System.out.println(documentRef.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//repo
        Repo repo = new Repo(10);
        System.out.println(repo);
        repo.uploadDocument(document1);
        repo.uploadDocument(book1);
        repo.uploadDocument(novel);
        System.out.println(repo);

    }
}