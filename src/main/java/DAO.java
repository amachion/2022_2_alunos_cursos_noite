
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAO {
    public boolean existeUsuario (Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        try (Connection c = ConexaoBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    public Curso[] obtemCursos () throws Exception {
        String sql = "SELECT * FROM tb_curso";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(
             sql, ResultSet.CONCUR_READ_ONLY, 
                  ResultSet.TYPE_SCROLL_INSENSITIVE)) {
            ResultSet rs = ps.executeQuery();
            int totalCursos = rs.last()? rs.getRow(): 0;
            Curso[] cursos = new Curso[totalCursos];
            int cont = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String tipo = rs.getString("tipo");
                cursos[cont++] = new Curso(id, nome, tipo);
            }
            return cursos;
        }
    }
}











