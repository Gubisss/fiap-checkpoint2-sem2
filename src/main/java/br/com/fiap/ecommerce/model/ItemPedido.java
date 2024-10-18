package br.com.fiap.ecommerce.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(nullable = false)
    private Long idPedido;
	@Column(nullable = false)
    private Long idProduto;

    @Column(precision = 16, scale = 2)
    private BigDecimal quantidade;

    @Column(precision = 16, scale = 2)
    private BigDecimal valorTotal;

	
}
