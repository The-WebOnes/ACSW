package com.project.controller;

import com.project.model.Client;
import com.project.model.Product;
import com.project.model.Supplier;
import com.project.services.IClientService;
import com.project.services.IProductService;
import com.project.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;


@Controller
public class ControllerView {

    @Autowired
    private IClientService iClientService;

    @Autowired
    private IProductService iProductService;

    @Autowired
    private ISupplierService iSupplierService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/manageclient")
    public String viewClients(Model model){
        var clients = iClientService.ListClient();
        String cadena = "Clientes";
        model.addAttribute("mensaje",cadena);
        model.addAttribute("clients",clients);
        return "client";
    }

    @GetMapping("/manageclient/addclient")
    public String addClient(Client client){
        return "updateclient";
    }

    @PostMapping("/manageclient/save")
    public String save(@Valid Client client, Errors errors){
        if (errors.hasErrors()){
            return "updateclient";
        }
        iClientService.saveClient(client);
        return "redirect:/manageclient";
    }

    @GetMapping("/manageclient/edit/{IdClient}")
    public String edit(Client client,Model model){
        client = iClientService.searchClient(client);
        model.addAttribute("client",client);
        return "updateclient";
    }

    @GetMapping("/manageclient/delete/{IdClient}")
    public String delete(Client client){
        iClientService.deleteClient(client);
        return "redirect:/manageclient";
    }

    //CRUD Products
    @GetMapping("/manageproduct")
    public String viewProducts(Model model){
        var products = iProductService.ListProduct();
        String cadena = "Inventario";
        model.addAttribute("mensaje",cadena);
        model.addAttribute("products",products);
        return "product";
    }


    @GetMapping("/manageproduct/addproduct")
    public String addProduct(Product product){
        return "updateProduct";
    }

    @PostMapping("/manageproduct/save")
    public String saveProduct(@Valid Product product, Errors errors){
        if (errors.hasErrors()){
            return "updateProduct";
        }
        iProductService.saveProduct(product);
        return "redirect:/manageproduct";
    }

    @GetMapping("/manageproduct/edit/{idProduct}")
    public String editProduct(Product product,Model model){
        product = iProductService.searchProduct(product);
        model.addAttribute("product",product);
        return "updateProduct";
    }

    @GetMapping("/manageproduct/delete/{IdProduct}")
    public String deleteProduct(Product product){
        iProductService.deleteProduct(product);
        return "redirect:/manageproduct";
    }

    //CRUD Suppliers

    @GetMapping("/managesupplier")
    public String viewSupplier(Model model){
        var suppliers = iSupplierService.ListSupplier();
        String cadena = "Proveedores";
        model.addAttribute("mensaje",cadena);
        model.addAttribute("suppliers",suppliers);
        return "supplier";
    }

    @GetMapping("/managesupplier/addsupplier")
    public String addSupplier(Supplier supplier){
        return "updateSupplier";
    }

    @PostMapping("/managesupplier/save")
    public String saveSupplier(@Valid Supplier supplier, Errors errors){
        if (errors.hasErrors()){
            return "updateSupplier";
        }
        iSupplierService.saveSupplier(supplier);
        return "redirect:/managesupplier";
    }

    @GetMapping("/managesupplier/edit/{IdSupplier}")
    public String editSupplier(Supplier supplier,Model model){
        supplier = iSupplierService.searchSupplier(supplier);
        model.addAttribute("supplier",supplier);
        return "updateSupplier";
    }

    @GetMapping("/managesupplier/delete/{IdSupplier}")
    public String deleteSupplier(Supplier supplier){
        iSupplierService.deleteSupplier(supplier);
        return "redirect:/managesupplier";
    }

    @GetMapping("/utilities")
    public String utilities(){
        return "utilities";
    }
}


