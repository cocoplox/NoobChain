package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Block genesisBlock = new Block("Primer bloque","0");
        System.out.println("Hash del bloque 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("2o bloque", genesisBlock.hash);
        System.out.println("Hash del bloque 2 : "+ secondBlock.hash);

        Block thirdBlock = new Block("tercer bloque", secondBlock.hash);
        System.out.println("Hash del bloque 3 : " + thirdBlock.hash);
    }
}
