import java.util.List;
import java.util.list;

public interface IComentarioServicio {

    Favorito crear(Favorito favorito);
    Favorito buscarPorId(Long id);
    List<Favorito> listarTodos();
    Categoria actualizar(Long id, Favorito favorito);
    boolean eliminar(Long id);
    List<Favorito> listarPorIdReceta(Long idReceta);
}
