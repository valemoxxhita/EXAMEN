package org.example;

import org.example.MODELOS.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println();
        System.out.println("************************");
        System.out.println("SEGUROS DE INMOBILIARIAS");
        System.out.println("************************");
        System.out.println("\n Bienvenido!");
        Asegurado asegurado1 = new Asegurado(12345, "83329232", "Valentina", "Galeano", "Cra 9828398",LocalDate.now(),"200000","18",false,"Soltera","Estudiante","oidfdhdh@gmail.com","Femenino", "Colombiana", "Ninguna");
        System.out.println(asegurado1);
        Asesor asesor1 = new Asesor(12345, "Juan Jose Gallego", "Venta de seguros inmobiliarios", "315836307", "2", "juanjosegallego@gmail.com", "Seguros Inmobiliaria", LocalDate.now(), "Casado", "Colombiano");
        System.out.println(asesor1);
        Inmueble inmueble1 = new Inmueble(12345, "2", 90.5, "Mansion", "Cra 16a #86-28", "17", 20000000, "Perfecto", "Ladrillo", true);
        System.out.println(inmueble1);
        Beneficiario beneficiario1 = new Beneficiario(121221, "93893298", "Nada", "2023-10-12", "Estudiante", "3828932", "cra 72 76-3", "7387387387", "jfdjfd@gmail.com", "Valentina");
        System.out.println(beneficiario1);
        Agencia agencia1 = new Agencia(939393, "Seguros Inmobiliarios", LocalDate.now(), "cra 73 #02-23", "iwiew@gmail.com", "www.jdhd.com", "Juan Serna", 29000, "837347348743","Seguros");
        System.out.println(agencia1);
        System.out.println();

        Scanner lea = new Scanner(System.in);
        Asesor asesor = new Asesor();
        System.out.println("Digite el nombre del asesor vinculado: ");
        asesor.setNombre(lea.nextLine());
        System.out.println("Digite la especialización que lleva como asesor: ");
        asesor.setEspecializacion(lea.nextLine());
        System.out.println("Digite un contacto telefonico: ");
        asesor.setNumeroTelefonico(lea.nextLine());
        System.out.println("Digite el número de años de experiencia que lleva: ");
        asesor.setAniosExperiencia(lea.nextLine());
        System.out.println("Digite el correo electronico: ");
        asesor.setCorreoElectronico(lea.nextLine());
        System.out.println("Digite a qué empresa pertenece: ");
        asesor.setEmpresa(lea.nextLine());
        System.out.println("Digite su estado civil: ");
        asesor.setEstadoCivil(lea.nextLine());
        System.out.println("Digite su nacionalidad: ");
        asesor.setNacionalidad(lea.nextLine());
        System.out.println("¿En qué año naciste?: ");
        int year = lea.nextInt();
        System.out.println("¿En qué mes naciste?: ");
        int mes = lea.nextInt();
        System.out.println("¿En qué día naciste?: ");
        int dia = lea.nextInt();
        asesor.setFechaNacimiento(LocalDate.of(year,mes,dia));
        System.out.println("EL ASESOR HA SIDO REGISTRADO :)");
        System.out.println("**********************************");
        System.out.println("\nGRACIAS!");
        System.out.println();


    }
}