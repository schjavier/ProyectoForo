package Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table (name = "topico")
public class Topico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaDeCreacion = LocalDateTime.now();
    private StatusTopico status = StatusTopico.NO_RESPONDIDO;
    private Usuario autor;
    private Curso curso;
    private List<Respuesta> respuestas = new ArrayList<>();
}
