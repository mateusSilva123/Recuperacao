package bean;
// Generated 16/10/2023 09:17:23 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MslfUsuarios generated by hbm2java
 */
@Entity
@Table(name="MSLF_Usuarios"
    ,catalog="db_mateus_fonseca"
)
public class MslfUsuarios  implements java.io.Serializable {


     private int mslfIdUsuarios;
     private String mslfNome;
     private String mslfApelido;
     private String mslfCpf;
     private Date mslfDataNasc;
     private String mslfSenha;
     private int mslfNivel;
     private String mslfAtivo;

    public MslfUsuarios() {
    }

	
    public MslfUsuarios(int mslfIdUsuarios, String mslfNome, String mslfApelido, String mslfCpf, Date mslfDataNasc, String mslfSenha, int mslfNivel, String mslfAtivo) {
        this.mslfIdUsuarios = mslfIdUsuarios;
        this.mslfNome = mslfNome;
        this.mslfApelido = mslfApelido;
        this.mslfCpf = mslfCpf;
        this.mslfDataNasc = mslfDataNasc;
        this.mslfSenha = mslfSenha;
        this.mslfNivel = mslfNivel;
        this.mslfAtivo = mslfAtivo;
    }
    
     @Id 

    
    @Column(name="MSLF_idUsuarios", unique=true, nullable=false)
    public int getMslfIdUsuarios() {
        return this.mslfIdUsuarios;
    }
    
    public void setMslfIdUsuarios(int mslfIdUsuarios) {
        this.mslfIdUsuarios = mslfIdUsuarios;
    }

    
    @Column(name="MSLF_nome", nullable=false, length=100)
    public String getMslfNome() {
        return this.mslfNome;
    }
    
    public void setMslfNome(String mslfNome) {
        this.mslfNome = mslfNome;
    }

    
    @Column(name="MSLF_apelido", nullable=false, length=45)
    public String getMslfApelido() {
        return this.mslfApelido;
    }
    
    public void setMslfApelido(String mslfApelido) {
        this.mslfApelido = mslfApelido;
    }

    
    @Column(name="MSLF_cpf", nullable=false, length=30)
    public String getMslfCpf() {
        return this.mslfCpf;
    }
    
    public void setMslfCpf(String mslfCpf) {
        this.mslfCpf = mslfCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MSLF_data_nasc", nullable=false, length=10)
    public Date getMslfDataNasc() {
        return this.mslfDataNasc;
    }
    
    public void setMslfDataNasc(Date mslfDataNasc) {
        this.mslfDataNasc = mslfDataNasc;
    }

    
    @Column(name="MSLF_senha", nullable=false, length=45)
    public String getMslfSenha() {
        return this.mslfSenha;
    }
    
    public void setMslfSenha(String mslfSenha) {
        this.mslfSenha = mslfSenha;
    }

    
    @Column(name="MSLF_nivel", nullable=false)
    public int getMslfNivel() {
        return this.mslfNivel;
    }
    
    public void setMslfNivel(int mslfNivel) {
        this.mslfNivel = mslfNivel;
    }

    
    @Column(name="MSLF_ativo", nullable=false, length=45)
    public String getMslfAtivo() {
        return this.mslfAtivo;
    }
    
    public void setMslfAtivo(String mslfAtivo) {
        this.mslfAtivo = mslfAtivo;
    }

    @Override
    public String toString() {
    return getMslfNome();
    }
    
    public boolean equals(Object object) {
        if (object instanceof MslfUsuarios) {
            MslfUsuarios usuarios = (MslfUsuarios) object;
            if (this.getMslfIdUsuarios()== usuarios.getMslfIdUsuarios()) {
                return true;
            }
        }
        return false;
    }
}


