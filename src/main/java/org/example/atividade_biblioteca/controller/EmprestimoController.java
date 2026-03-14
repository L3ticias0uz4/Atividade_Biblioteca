@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService service;

    public EmprestimoController(EmprestimoService service) {
        this.service = service;
    }

    @PostMapping("/{usuarioId}")
    public Emprestimo criar(@PathVariable Long usuarioId,
                            @RequestBody EmprestimoRequest request){
        return service.criar(usuarioId, request);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Emprestimo> listar(@PathVariable Long usuarioId){
        return service.listarPorUsuario(usuarioId);
    }
}