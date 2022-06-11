package com.ar.azaharfundas.controller;

import com.ar.azaharfundas.model.Cliente;
import com.ar.azaharfundas.model.Diseño;
import com.ar.azaharfundas.model.Empleado;
import com.ar.azaharfundas.model.Empresa;
import com.ar.azaharfundas.model.Funda;
import com.ar.azaharfundas.model.Material;
import com.ar.azaharfundas.model.Modelo;
import com.ar.azaharfundas.service.IClienteService;
import com.ar.azaharfundas.service.IDiseñoService;
import com.ar.azaharfundas.service.IEmpleadoService;
import com.ar.azaharfundas.service.IEmpresaService;
import com.ar.azaharfundas.service.IFundaService;
import com.ar.azaharfundas.service.IMaterialService;
import com.ar.azaharfundas.service.IModeloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    //MÉTODOS DE "EMPRESA"
    @Autowired
    private IEmpresaService empresaServ;
    
    @PostMapping("/newEmpresa")
    public void agregarEmpresa(@RequestBody Empresa emp){
        empresaServ.crearEmpresa(emp);
    }
    
    @GetMapping("/verEmpresa")
    public List<Empresa> verEmpresa(){
        return empresaServ.verEmpresa();
    }
    
    @DeleteMapping("/eliminarEmpresa/{id}")
    public void borrarEmpresa(@PathVariable Long id){
        empresaServ.borrarEmpresa(id);
    }
    
    @PutMapping("/editarEmpresa/{id}")
    public void editarEmpresa(@PathVariable Long id,
                              @RequestBody Empresa empresaFinal){
        Empresa empresaEditar=empresaServ.traerEmpresa(id);
        empresaEditar.setNombre(empresaFinal.getNombre());
        empresaEditar.setDescripcion(empresaFinal.getDescripcion());
        empresaEditar.setLogo(empresaFinal.getLogo());
        empresaEditar.setWhatsapp(empresaFinal.getWhatsapp());
        empresaEditar.setFacebook(empresaFinal.getFacebook());
        empresaEditar.setInstagram(empresaFinal.getInstagram());
        empresaEditar.setLinkedin(empresaFinal.getLinkedin());
        empresaEditar.setAñoCreacion(empresaFinal.getAñoCreacion());
        
        empresaServ.crearEmpresa(empresaEditar);
    }
    
    //MÉTODOS DE "EMPLEADO"
    @Autowired
    private IEmpleadoService empleadoServ;
    
    @PostMapping("/newEmpleado")
    public void agregarEmpleado(@RequestBody Empleado empl){
        empleadoServ.crearEmpleado(empl);
    }
    
    @GetMapping("/verEmpleados")
    public List<Empleado> verEmpleados(){
        return empleadoServ.verEmpleados();
    }
    
    @DeleteMapping("/eliminarEmpleado/{id}")
    public void borrarEmpleado(@PathVariable Long id){
        empleadoServ.borrarEmpleado(id);
    }
    
    @PutMapping("/editarEmpleado/{id}")
    public void editarEmpleado(@PathVariable Long id,
                              @RequestBody Empleado empleadoFinal){
        
        Empleado empleadoEditar=empleadoServ.traerEmpleado(id);
        
        empleadoEditar.setNombre(empleadoFinal.getNombre());
        empleadoEditar.setApellido(empleadoFinal.getApellido());
        empleadoEditar.setAñoInicio(empleadoFinal.getAñoInicio());
        empleadoEditar.setAñoFinal(empleadoFinal.getAñoFinal());
        empleadoEditar.setFoto(empleadoFinal.getFoto());
        empleadoEditar.setMail(empleadoFinal.getMail());
        empleadoEditar.setTelefono(empleadoFinal.getTelefono());
        empleadoEditar.setDireccion(empleadoFinal.getDireccion());
        empleadoEditar.setTipoEmpleado(empleadoFinal.getTipoEmpleado());
        
        empleadoServ.crearEmpleado(empleadoEditar);
    }
    
    //MÉTODOS DE "CLIENTE"
    @Autowired
    private IClienteService clienteServ;
    
    @PostMapping("/newCliente")
    public void agregarCliente(@RequestBody Cliente cli){
        clienteServ.crearCliente(cli);
    }
    
    @GetMapping("/verClientes")
    public List<Cliente> verClientes(){
        return clienteServ.verClientes();
    }
    
    @DeleteMapping("/eliminarCliente/{id}")
    public void borrarCliente(@PathVariable Long id){
        clienteServ.borrarCliente(id);
    }
    
    @PutMapping("/editarCliente/{id}")
    public void editarCliente(@PathVariable Long id,
                              @RequestBody Cliente clienteFinal){
        
        Cliente clienteEditar=clienteServ.traerCliente(id);
        
        clienteEditar.setNombre(clienteFinal.getNombre());
        clienteEditar.setApellido(clienteFinal.getApellido());
        clienteEditar.setTelefono(clienteFinal.getTelefono());
        clienteEditar.setDireccion(clienteFinal.getDireccion());
        clienteEditar.setFacebook(clienteFinal.getFacebook());
        clienteEditar.setInstagram(clienteFinal.getInstagram());
        clienteEditar.setTipoCliente(clienteFinal.getTipoCliente());
        
        clienteServ.crearCliente(clienteEditar);
    }
    
    //MÉTODOS DE "MODELO"
    @Autowired
    private IModeloService modeloServ;
    
    @PostMapping("/newModelo")
    public void agregarModelo(@RequestBody Modelo mod){
        modeloServ.crearModelo(mod);
    }
    
    @GetMapping("/verModelos")
    public List<Modelo> verModelos(){
        return modeloServ.verModelos();
    }
    
    @DeleteMapping("/eliminarModelo/{id}")
    public void borrarModelo(@PathVariable Long id){
        modeloServ.borrarModelo(id);
    }
    
    @PutMapping("/editarModelo/{id}")
    public void editarModelo(@PathVariable Long id,
                              @RequestBody Modelo modeloFinal){
        
        Modelo modeloEditar=modeloServ.traerModelo(id);
        
        modeloEditar.setMarca(modeloFinal.getMarca());
        modeloEditar.setModelo(modeloFinal.getModelo());
        modeloEditar.setAño(modeloFinal.getAño());
        modeloEditar.setTamaño(modeloFinal.getTamaño());
        modeloEditar.setStock(modeloFinal.getStock());
        
        modeloServ.crearModelo(modeloEditar);
    }
    
    //MÉTODOS DE "DISEÑO"
    @Autowired
    private IDiseñoService diseñoServ;
    
    @PostMapping("/newDiseño")
    public void agregarDiseño(@RequestBody Diseño dis){
        diseñoServ.crearDiseño(dis);
    }
    
    @GetMapping("/verDiseños")
    public List<Diseño> verDiseños(){
        return diseñoServ.verDiseños();
    }
    
    @DeleteMapping("/eliminarDiseño/{id}")
    public void borrarDiseño(@PathVariable Long id){
        diseñoServ.borrarDiseño(id);
    }
    
    @PutMapping("/editarDiseño/{id}")
    public void editarDiseño(@PathVariable Long id,
                              @RequestBody Diseño diseñoFinal){
        
        Diseño diseñoEditar=diseñoServ.traerDiseño(id);
        
        diseñoEditar.setEstado(diseñoFinal.getEstado());
        diseñoEditar.setImagen(diseñoFinal.getImagen());
        diseñoEditar.setTipo(diseñoFinal.getTipo());
        
        diseñoServ.crearDiseño(diseñoEditar);
    }
    
    //MÉTODOS DE "MATERIAL"
    @Autowired
    private IMaterialService materialServ;
    
    @PostMapping("/newMaterial")
    public void agregarMaterial(@RequestBody Material mat){
        materialServ.crearMaterial(mat);
    }
    
    @GetMapping("/verMateriales")
    public List<Material> verMateriales(){
        return materialServ.verMateriales();
    }
    
    @DeleteMapping("/eliminarMaterial/{id}")
    public void borrarMaterial(@PathVariable Long id){
        materialServ.borrarMaterial(id);
    }
    
    @PutMapping("/editarMaterial/{id}")
    public void editarMaterial(@PathVariable Long id,
                              @RequestBody Material materialFinal){
        
        Material materialEditar=materialServ.traerMaterial(id);
        
        materialEditar.setNombre(materialFinal.getNombre());
        materialEditar.setDescripcion(materialFinal.getDescripcion());
        materialEditar.setPrecio(materialFinal.getPrecio());
        materialEditar.setEjemplo(materialFinal.getEjemplo());
        
        materialServ.crearMaterial(materialEditar);
    }
    
    //MÉTODOS DE "FUNDA"
    @Autowired
    private IFundaService fundaServ;
    
    @PostMapping("/newFunda")
    public void agregarFunda(@RequestBody Funda fun){
        fundaServ.crearFunda(fun);
    }
    
    @GetMapping("/verFundas")
    public List<Funda> verFundas(){
        return fundaServ.verFundas();
    }
    
    @DeleteMapping("/eliminarFunda/{id}")
    public void borrarFunda(@PathVariable Long id){
        fundaServ.borrarFunda(id);
    }
    
    @PutMapping("/editarFunda/{id}")
    public void editarFunda(@PathVariable Long id,
                              @RequestBody Funda fundaFinal){
        
        Funda fundaEditar=fundaServ.traerFunda(id);
        
        fundaEditar.setEstado(fundaFinal.getEstado());
        fundaEditar.setFechaPedida(fundaFinal.getFechaPedida());
        fundaEditar.setFechaEntregada(fundaFinal.getFechaEntregada());
        fundaEditar.setMaterial(fundaFinal.getMaterial());
        fundaEditar.setPrecio(fundaFinal.getPrecio());
        fundaEditar.setImagen(fundaFinal.getImagen());
        fundaEditar.setModelo(fundaFinal.getModelo());
        
        fundaServ.crearFunda(fundaEditar);
    }
            
}
