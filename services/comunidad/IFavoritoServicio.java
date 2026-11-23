import java.util.List;

public interface IFavoritoServicio {

    Favorito crear(Favorito favorito);
    Favorito buscarPorId(Long id);
    List<Favorito> listarTodos();
    Favorito actualizar(Long id, Favorito favorito);
    boolean eliminar(Long id);
    List<Favorito> listarPorIdReceta(Long idReceta);
}
