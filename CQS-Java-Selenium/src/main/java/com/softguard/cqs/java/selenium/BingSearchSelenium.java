/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.softguard.cqs.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchSelenium {

    public static void main(String[] args) {
        // Caminho para o ChromeDriver (ajuste conforme necessário)
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Documents/chromedev/chromedriver-win64/chromedriver.exe");

        // Cria a instância do navegador Chrome
        WebDriver driver = new ChromeDriver();

        try {
            // 10. Abre a página inicial do Bing
            driver.get("https://www.bing.com/?cc=br");

            // 11. Pesquisa as palavras "Hello World"
            driver.findElement(By.name("q")).sendKeys("Hello World");
            driver.findElement(By.id("search_icon")).click();

            // 12. Aguarda 10 segundos
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 12. Fecha o navegador
            driver.quit();
        }
    }
}
