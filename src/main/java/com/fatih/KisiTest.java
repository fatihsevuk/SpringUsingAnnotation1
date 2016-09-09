package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class KisiTest {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("app_config.xml");
		
		
		Adres adres=context.getBean("adresId",Adres.class);
		Meslek meslek=context.getBean("meslekId" , Meslek.class);
		Kisi kisi=context.getBean("kisiId" , Kisi.class);
		
		adres.adreEkle("yıldız", "çimen", 25, "beylikdüzü", "istanbul");
		meslek.meslekEkle("doktor", "sağlık", 6000);
		
		kisi.kisiEkle("ahmet", "can", adres, meslek);
		
		
		
		System.out.println(kisi);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
