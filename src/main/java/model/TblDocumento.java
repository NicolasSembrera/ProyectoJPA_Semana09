package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_documento database table.
 * 
 */
@Entity
@Table(name="tbl_documento")
@NamedQuery(name="TblDocumento.findAll", query="SELECT t FROM TblDocumento t")
public class TblDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iddocumento;

	private String descridocu;

	private String nombdocum;

	private String nrodocumento;

	//bi-directional many-to-one association to TblTipodocumento
	@ManyToOne
	@JoinColumn(name="idtipodocument")
	private TblTipodocumento tblTipodocumento;

	public TblDocumento() {
	}

	public int getIddocumento() {
		return this.iddocumento;
	}

	public void setIddocumento(int iddocumento) {
		this.iddocumento = iddocumento;
	}

	public String getDescridocu() {
		return this.descridocu;
	}

	public void setDescridocu(String descridocu) {
		this.descridocu = descridocu;
	}

	public String getNombdocum() {
		return this.nombdocum;
	}

	public void setNombdocum(String nombdocum) {
		this.nombdocum = nombdocum;
	}

	public String getNrodocumento() {
		return this.nrodocumento;
	}

	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}

	public TblTipodocumento getTblTipodocumento() {
		return this.tblTipodocumento;
	}

	public void setTblTipodocumento(TblTipodocumento tblTipodocumento) {
		this.tblTipodocumento = tblTipodocumento;
	}

}