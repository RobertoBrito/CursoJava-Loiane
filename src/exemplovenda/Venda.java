package exemplovenda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String descricao;
	private String enderecovenda;
	private Long id;
	private String nomeCliente;
	private BigDecimal valorTotal;
	private String data;

	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEnderecovenda() {
		return enderecovenda;
	}

	public void setEnderecovenda(String enderecovenda) {
		this.enderecovenda = enderecovenda;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public BigDecimal getvalorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());

		return valorTotal;
	}

	public void setvalorTotal(BigDecimal valor) {
		this.valorTotal = valor;
	}
	
	private double totalVenda() {
		double total=0.0;
		for (Produto produto : listaProdutos) {
			total+= produto.getValor().doubleValue();
		}
		//this.valorTotal= BigDecimal.valueOf(total);
		return total;
	}

	@Override
	public String toString() {
		return "Venda [descricao=" + descricao + ", enderecovenda=" + enderecovenda + ", id=" + id + ", nomeCliente="
				+ nomeCliente + ", valor=" + valorTotal + ", data=" + data + ", listaProdutos=" + listaProdutos + "]";
	}

	
	
}
