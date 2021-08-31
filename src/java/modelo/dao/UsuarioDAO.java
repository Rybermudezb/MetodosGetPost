package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.ContactoDTO;
import modelo.dto.UsuarioDTO;

public class UsuarioDAO {
    
    private static final List<UsuarioDTO> lista = new ArrayList<>();

    public UsuarioDAO() {
        
    }

    public void datosPruebas(){
           UsuarioDTO usu = new UsuarioDTO(1,"Robinson","Robinson@correo","12345",UsuarioDTO.ADMINISTRADOR);
        UsuarioDTO usu2 = new UsuarioDTO(2,"Yesid","Yesid@correo","54321",UsuarioDTO.Cliente);
         UsuarioDTO usu3 = new UsuarioDTO(3,"Bermudez","Bermudez@correo","12345",UsuarioDTO.Vendedor);
    lista.add(usu);
    lista.add(usu2);
    lista.add(usu3);
    }
    public boolean crear(UsuarioDTO c) {
        if (c != null) {
            lista.add(c);
            return true;
        } else {
            return false;
        }

    }
    public List<UsuarioDTO> readAll(){
        List<UsuarioDTO> obj= null;
        obj=UsuarioDAO.lista;
        return obj;
    }
}
