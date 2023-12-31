package bean;
// Generated 16/10/2023 09:17:23 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MslfJogo generated by hbm2java
 */
@Entity
@Table(name="MSLF_Jogo"
    ,catalog="db_mateus_fonseca"
)
public class MslfJogo  implements java.io.Serializable {


     private int mslfIdJogo;
     private String mslfNome;
     private String mslfEmpresa;
     private Date mslfAno;
     private String mslfPreco;
     private String mslfGenero;
     private String mslfIdioma;
     private String mslfAvaliacaoGeral;
     private String mslfEdicao;
     private String mslfEstoque;
     private String mslfBrinde;
     private String mslfDesconto;
     private String mslfClassificacao;

    public MslfJogo() {
    }

	
    public MslfJogo(int mslfIdJogo, String mslfNome, String mslfEmpresa, Date mslfAno, String mslfPreco, String mslfGenero, String mslfIdioma, String mslfAvaliacaoGeral, String mslfEdicao, String mslfEstoque, String mslfClassificacao) {
        this.mslfIdJogo = mslfIdJogo;
        this.mslfNome = mslfNome;
        this.mslfEmpresa = mslfEmpresa;
        this.mslfAno = mslfAno;
        this.mslfPreco = mslfPreco;
        this.mslfGenero = mslfGenero;
        this.mslfIdioma = mslfIdioma;
        this.mslfAvaliacaoGeral = mslfAvaliacaoGeral;
        this.mslfEdicao = mslfEdicao;
        this.mslfEstoque = mslfEstoque;
        this.mslfClassificacao = mslfClassificacao;
    }
    public MslfJogo(int mslfIdJogo, String mslfNome, String mslfEmpresa, Date mslfAno, String mslfPreco, String mslfGenero, String mslfIdioma, String mslfAvaliacaoGeral, String mslfEdicao, String mslfEstoque, String mslfBrinde, String mslfDesconto, String mslfClassificacao) {
       this.mslfIdJogo = mslfIdJogo;
       this.mslfNome = mslfNome;
       this.mslfEmpresa = mslfEmpresa;
       this.mslfAno = mslfAno;
       this.mslfPreco = mslfPreco;
       this.mslfGenero = mslfGenero;
       this.mslfIdioma = mslfIdioma;
       this.mslfAvaliacaoGeral = mslfAvaliacaoGeral;
       this.mslfEdicao = mslfEdicao;
       this.mslfEstoque = mslfEstoque;
       this.mslfBrinde = mslfBrinde;
       this.mslfDesconto = mslfDesconto;
       this.mslfClassificacao = mslfClassificacao;
    }
   
     @Id 

    
    @Column(name="MSLF_idJogo", unique=true, nullable=false)
    public int getMslfIdJogo() {
        return this.mslfIdJogo;
    }
    
    public void setMslfIdJogo(int mslfIdJogo) {
        this.mslfIdJogo = mslfIdJogo;
    }

    
    @Column(name="MSLF_nome", nullable=false, length=100)
    public String getMslfNome() {
        return this.mslfNome;
    }
    
    public void setMslfNome(String mslfNome) {
        this.mslfNome = mslfNome;
    }

    
    @Column(name="MSLF_empresa", nullable=false, length=100)
    public String getMslfEmpresa() {
        return this.mslfEmpresa;
    }
    
    public void setMslfEmpresa(String mslfEmpresa) {
        this.mslfEmpresa = mslfEmpresa;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MSLF_ano", nullable=false, length=10)
    public Date getMslfAno() {
        return this.mslfAno;
    }
    
    public void setMslfAno(Date mslfAno) {
        this.mslfAno = mslfAno;
    }

    
    @Column(name="MSLF_preco", nullable=false, length=45)
    public String getMslfPreco() {
        return this.mslfPreco;
    }
    
    public void setMslfPreco(String mslfPreco) {
        this.mslfPreco = mslfPreco;
    }

    
    @Column(name="MSLF_genero", nullable=false, length=45)
    public String getMslfGenero() {
        return this.mslfGenero;
    }
    
    public void setMslfGenero(String mslfGenero) {
        this.mslfGenero = mslfGenero;
    }

    
    @Column(name="MSLF_idioma", nullable=false, length=45)
    public String getMslfIdioma() {
        return this.mslfIdioma;
    }
    
    public void setMslfIdioma(String mslfIdioma) {
        this.mslfIdioma = mslfIdioma;
    }

    
    @Column(name="MSLF_avaliacao_geral", nullable=false, length=45)
    public String getMslfAvaliacaoGeral() {
        return this.mslfAvaliacaoGeral;
    }
    
    public void setMslfAvaliacaoGeral(String mslfAvaliacaoGeral) {
        this.mslfAvaliacaoGeral = mslfAvaliacaoGeral;
    }

    
    @Column(name="MSLF_edicao", nullable=false, length=45)
    public String getMslfEdicao() {
        return this.mslfEdicao;
    }
    
    public void setMslfEdicao(String mslfEdicao) {
        this.mslfEdicao = mslfEdicao;
    }

    
    @Column(name="MSLF_estoque", nullable=false, length=45)
    public String getMslfEstoque() {
        return this.mslfEstoque;
    }
    
    public void setMslfEstoque(String mslfEstoque) {
        this.mslfEstoque = mslfEstoque;
    }

    
    @Column(name="MSLF_brinde", length=45)
    public String getMslfBrinde() {
        return this.mslfBrinde;
    }
    
    public void setMslfBrinde(String mslfBrinde) {
        this.mslfBrinde = mslfBrinde;
    }

    
    @Column(name="MSLF_desconto", length=45)
    public String getMslfDesconto() {
        return this.mslfDesconto;
    }
    
    public void setMslfDesconto(String mslfDesconto) {
        this.mslfDesconto = mslfDesconto;
    }

    
    @Column(name="MSLF_classificacao", nullable=false, length=45)
    public String getMslfClassificacao() {
        return this.mslfClassificacao;
    }
    
    public void setMslfClassificacao(String mslfClassificacao) {
        this.mslfClassificacao = mslfClassificacao;
    }




}


