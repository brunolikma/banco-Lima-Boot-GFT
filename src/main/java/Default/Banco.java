package Default;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Banco {

    @Getter @Setter
    private String nome;
    @Getter @Setter
    private List<Conta> contas;

}
