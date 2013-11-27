package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;

@Entity
@Table(name="tbl_Local")
@PrimaryKeyJoinColumn(name="idLlamada")
public class Local extends Llamada{

}
