package model;

public class Avaliacao {
 
	private int id;
	 
	private Paciente paciente;
	 
	private String diagnosticoFisioterapeutico;
	 
	private String anamnese;
	 
	private String examesComplementares;
	 
	private String medicamentos;
	 
	private SinaisVitais sinaisVitais;
	 
	private Inspecao inspecao;
	 
	private int dor;
	 
	private String goniometria;
	 
	private String forcaMuscular;
	 
	private AvaliacaoPostural avaliacaoPostural;
	 
	private String testesEspecificos;
	 
	private String objetivosDoTratamento;
	 
	private String propostaDeTratamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDiagnosticoFisioterapeutico() {
        return diagnosticoFisioterapeutico;
    }

    public void setDiagnosticoFisioterapeutico(String diagnosticoFisioterapeutico) {
        this.diagnosticoFisioterapeutico = diagnosticoFisioterapeutico;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getExamesComplementares() {
        return examesComplementares;
    }

    public void setExamesComplementares(String examesComplementares) {
        this.examesComplementares = examesComplementares;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public SinaisVitais getSinaisVitais() {
        return sinaisVitais;
    }

    public void setSinaisVitais(SinaisVitais sinaisVitais) {
        this.sinaisVitais = sinaisVitais;
    }

    public Inspecao getInspecao() {
        return inspecao;
    }

    public void setInspecao(Inspecao inspecao) {
        this.inspecao = inspecao;
    }

    public int getDor() {
        return dor;
    }

    public void setDor(int dor) {
        this.dor = dor;
    }

    public String getGoniometria() {
        return goniometria;
    }

    public void setGoniometria(String goniometria) {
        this.goniometria = goniometria;
    }

    public String getForcaMuscular() {
        return forcaMuscular;
    }

    public void setForcaMuscular(String forcaMuscular) {
        this.forcaMuscular = forcaMuscular;
    }

    public AvaliacaoPostural getAvaliacaoPostural() {
        return avaliacaoPostural;
    }

    public void setAvaliacaoPostural(AvaliacaoPostural avaliacaoPostural) {
        this.avaliacaoPostural = avaliacaoPostural;
    }

    public String getTestesEspecificos() {
        return testesEspecificos;
    }

    public void setTestesEspecificos(String testesEspecificos) {
        this.testesEspecificos = testesEspecificos;
    }

    public String getObjetivosDoTratamento() {
        return objetivosDoTratamento;
    }

    public void setObjetivosDoTratamento(String objetivosDoTratamento) {
        this.objetivosDoTratamento = objetivosDoTratamento;
    }

    public String getPropostaDeTratamento() {
        return propostaDeTratamento;
    }

    public void setPropostaDeTratamento(String propostaDeTratamento) {
        this.propostaDeTratamento = propostaDeTratamento;
    }
	 
	 
}
 
