package com.mycompany.hibernate;

import com.mycompany.hibernate.model.Mercadoria;
import com.mycompany.hibernate.service.MercadoriaService;

public class Hibernate {

    public static void main(String[] args) {
        
        Mercadoria mercadoria = new Mercadoria("Abacate", 2, "Fruta", "Empresa A");
        Mercadoria mercadoria2 = new Mercadoria("Banana", 3, "Fruta", "Empresa B");
        
        MercadoriaService mercadoriaService = new MercadoriaService();
        
        mercadoriaService.inserirMercadoria(mercadoria);
        mercadoriaService.inserirMercadoria(mercadoria2);
        
    }
}
