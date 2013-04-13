package model;

public class AvaliacaoPostural {
 
	private int id;
	 
	private VistaAnterior vistaAnterior;
	 
	private VistaPosterior vistaPosterior;
	 
	private VistaLateral vistaLateral;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VistaAnterior getVistaAnterior() {
        return vistaAnterior;
    }

    public void setVistaAnterior(VistaAnterior vistaAnterior) {
        this.vistaAnterior = vistaAnterior;
    }

    public VistaPosterior getVistaPosterior() {
        return vistaPosterior;
    }

    public void setVistaPosterior(VistaPosterior vistaPosterior) {
        this.vistaPosterior = vistaPosterior;
    }

    public VistaLateral getVistaLateral() {
        return vistaLateral;
    }

    public void setVistaLateral(VistaLateral vistaLateral) {
        this.vistaLateral = vistaLateral;
    }
	 
        
}
 
