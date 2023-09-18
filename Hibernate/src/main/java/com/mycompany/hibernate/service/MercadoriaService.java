package com.mycompany.hibernate.service;

import com.mycompany.hibernate.dao.MercadoriaDAO;
import com.mycompany.hibernate.model.Mercadoria;
import java.util.List;

public class MercadoriaService {
    
    private static final MercadoriaDAO mercadoriaDAO = new MercadoriaDAO();
    
    public List<Mercadoria> listarMercadorias() {
        
        return mercadoriaDAO.listAll();
    }
        
    public void inserirMercadoria(Mercadoria mercadoria) {
        
        mercadoriaDAO.add(mercadoria);
    }
    
    public void atualizarMercadoria(Mercadoria mercadoria) {
        
        mercadoriaDAO.update(mercadoria);
    }
    
    public void removerMercadoriaById(Long id) {
        
        mercadoriaDAO.removeById(id);
    }
            
}
