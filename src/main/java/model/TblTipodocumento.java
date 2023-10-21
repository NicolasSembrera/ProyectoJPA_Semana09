package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_tipodocumento database table.
 * 
 */
@Entity
@Table(name="tbl_tipodocumento")
@NamedQuery(name="TblTipodocumento.findAll", query="SELECT t FROM TblTipodocumento t")
public class TblTipodocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtipodocumento;

	private String descritipo;

	private String nomtipodocu;

	//bi-directional many-to-one association to TblDocumento
	@OneToMany(mappedBy="tblTipodocumento")
	private List<TblDocumento> tblDocumentos;

	public TblTipodocumento() {
	}

	public int getIdtipodocumento() {
		return this.idtipodocumento;
	}

	public void setIdtipodocumento(int idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}

	public String getDescritipo() {
		return this.descritipo;
	}

	public void setDescritipo(String descritipo) {
		this.descritipo = descritipo;
	}

	public String getNomtipodocu() {
		return this.nomtipodocu;
	}

	public void setNomtipodocu(String nomtipodocu) {
		this.nomtipodocu = nomtipodocu;
	}

	public List<TblDocumento> getTblDocumentos() {
		return this.tblDocumentos;
	}

	public void setTblDocumentos(List<TblDocumento> tblDocumentos) {
		this.tblDocumentos = tblDocumentos;
	}

	public TblDocumento addTblDocumento(TblDocumento tblDocumento) {
		getTblDocumentos().add(tblDocumento);
		tblDocumento.setTblTipodocumento(this);

		return tblDocumento;
	}

	public TblDocumento removeTblDocumento(TblDocumento tblDocumento) {
		getTblDocumentos().remove(tblDocumento);
		tblDocumento.setTblTipodocumento(null);

		return tblDocumento;
	}

}