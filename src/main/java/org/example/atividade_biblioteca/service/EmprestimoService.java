public Emprestimo criar(Long usuarioId, EmprestimoRequest request){

    Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow();

    Emprestimo e = new Emprestimo();
    e.setLivro(request.getLivro());
    e.setData(LocalDate.now());
    e.setUsuario(usuario);

    return emprestimoRepository.save(e);
}