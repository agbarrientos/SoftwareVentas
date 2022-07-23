package com.example.Ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name="CLIENTES")
public class Clientes {
    @Id
    @Column (name= "IDCLIENTE")
    private Integer idcliente;
    @Column (name= "DNI")
    private Integer dni;
    @Column (name= "NOMBRE")
    private String nombre;
    @Column (name= "APELLIDO")
    private String apellido;
    @Column (name= "FECHANACIMIENTO")
    private Date fechanacimiento;

    public Clientes() {
    }

    public Clientes(Integer idcliente, Integer dni, String nombre, String apellido, Date fechanacimiento) {
        this.idcliente = idcliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Entity
    @Table(name= "PRODUCTOS")
    public static class Productos {
        @Id
        @Column(name ="IDPRODUCTO")
        private Integer idproducto;

        @Column(name="DESCRIPCION")
        private String descripcion;

        @Column(name="PRECIO")
        private Float precio;

        @Column(name="STOCK")
        private Integer stock;

        @Column(name="CODIGO")
        private String codigo;

        //*********************
        //*   Constructores   *
        //*********************
        public Productos() {
        }

        public Productos(Integer idproducto, String descripcion, Float precio, Integer stock, String codigo) {
            this.idproducto = idproducto;
            this.descripcion = descripcion;
            this.precio = precio;
            this.stock = stock;
            this.codigo = codigo;
        }

        //*********************
        //*Getters and Setters*
        //*********************
        public int getIdproducto() {
            return idproducto;
        }

        public void setIdproducto(int idproducto) {
            this.idproducto = idproducto;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public Float getPrecio() {
            return precio;
        }

        public void setPrecio(Float precio) {
            this.precio = precio;
        }

        public Integer getStock() {
            return stock;
        }

        public void setStock(Integer stock) {
            this.stock = stock;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
    }
}
