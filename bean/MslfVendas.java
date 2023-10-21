package bean;
// Generated 20/10/2023 13:43:36 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MslfVendas generated by hbm2java
 */
@Entity
@Table(name="MslfVendas"
    ,catalog="db_mateus_fonseca"
)
public class MslfVendas  implements java.io.Serializable {


     private int mslfIdVendas;
     private MslfCliente mslfCliente;
     private MslfVendedor mslfVendedor;
     private int mslfQuantidade;
     private String mslfValorTotal;
     private Date mslfDataEHora;
     private String mslfObservacao;

    public MslfVendas() {
    }

    public MslfVendas(int mslfIdVendas, MslfCliente mslfCliente, MslfVendedor mslfVendedor, int mslfQuantidade, String mslfValorTotal, Date mslfDataEHora, String mslfObservacao) {
       this.mslfIdVendas = mslfIdVendas;
       this.mslfCliente = mslfCliente;
       this.mslfVendedor = mslfVendedor;
       this.mslfQuantidade = mslfQuantidade;
       this.mslfValorTotal = mslfValorTotal;
       this.mslfDataEHora = mslfDataEHora;
       this.mslfObservacao = mslfObservacao;
    }
   
     @Id 

    
    @Column(name="MSLF_idVendas", unique=true, nullable=false)
    public int getMslfIdVendas() {
        return this.mslfIdVendas;
    }
    
    public void setMslfIdVendas(int mslfIdVendas) {
        this.mslfIdVendas = mslfIdVendas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MSLF_idCliente", nullable=false)
    public MslfCliente getMslfCliente() {
        return this.mslfCliente;
    }
    
    public void setMslfCliente(MslfCliente mslfCliente) {
        this.mslfCliente = mslfCliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MSLF_idVendedor", nullable=false)
    public MslfVendedor getMslfVendedor() {
        return this.mslfVendedor;
    }
    
    public void setMslfVendedor(MslfVendedor mslfVendedor) {
        this.mslfVendedor = mslfVendedor;
    }

    
    @Column(name="MSLF_quantidade", nullable=false)
    public int getMslfQuantidade() {
        return this.mslfQuantidade;
    }
    
    public void setMslfQuantidade(int mslfQuantidade) {
        this.mslfQuantidade = mslfQuantidade;
    }

    
    @Column(name="MSLF_valor_total", nullable=false, length=45)
    public String getMslfValorTotal() {
        return this.mslfValorTotal;
    }
    
    public void setMslfValorTotal(String mslfValorTotal) {
        this.mslfValorTotal = mslfValorTotal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MSLF_data_e_hora", nullable=false, length=10)
    public Date getMslfDataEHora() {
        return this.mslfDataEHora;
    }
    
    public void setMslfDataEHora(Date mslfDataEHora) {
        this.mslfDataEHora = mslfDataEHora;
    }

    
    @Column(name="MSLF_observacao", nullable=false, length=300)
    public String getMslfObservacao() {
        return this.mslfObservacao;
    }
    
    public void setMslfObservacao(String mslfObservacao) {
        this.mslfObservacao = mslfObservacao;
    }




}


