package com.redetex.web.model.entidade;

import com.redetex.web.model.enums.SituacaoEnum;
import com.redetex.web.model.enums.TipoEnum;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_ORCAMENTOS")
@NoArgsConstructor
public class Orcamento {

    @Id
    @Column(name = "IDORCAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idOrcamento;

    @Column(name = "TPORCAMENTO")
    TipoEnum tipoOrcamento;

    @Column(name = "STORCAMENTO")
    SituacaoEnum situacaoOrcamento;

    @OneToOne
    @JoinColumn(name = "CLIENTEORCAMENTO", nullable = false)
    Cliente clienteOrcamento;

    @OneToOne
    @JoinColumn(name = "ENDERECOORCAMENTO", nullable = false)
    Endereco enderecoOrcamento;

    @OneToOne
    @JoinColumn(name = "MEDIDASORCAMENTO")
    Medida medidasOrcamento;

    @Column(name = "VALORORCAMENTO")
    Float valorOrcamento;

    @Column(name = "OBSORCAMENTO")
    String observacaoOrcamento;

    @Builder
    public Orcamento(
        Long idOrcamento,
        TipoEnum tipoOrcamento,
        SituacaoEnum situacaoOrcamento,
        Cliente clienteOrcamento,
        Endereco enderecoOrcamento,
        Medida medidasOrcamento,
        Float valorOrcamento,
        String observacaoOrcamento
    ) {
        this.idOrcamento = idOrcamento;
        this.tipoOrcamento = tipoOrcamento;
        this.situacaoOrcamento = situacaoOrcamento;
        this.clienteOrcamento = clienteOrcamento;
        this.enderecoOrcamento = enderecoOrcamento;
        this.medidasOrcamento = medidasOrcamento;
        this.valorOrcamento = valorOrcamento;
        this.observacaoOrcamento = observacaoOrcamento;
    }

}
