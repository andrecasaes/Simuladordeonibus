// André Felipe Jambeiro Nastari
// Antonia B.Melo

public class Passageiro {
    
    private final class Relogio {
        private boolean emEspera;
        private boolean parado;
        
        private int tempoDeEspera;
        private int tempoDeViagem;
        
        Relogio() {
            zerar();
        }
        
        private void zerar() {
            emEspera = true;
            parado = true;
            desembarcou = false;
            tempoDeEspera = 0;
            tempoDeViagem = 0;
            baldeacoes = 0;
        }
        
        public void tick() {
            if (!parado) {
                if (emEspera) {
                    tempoDeEspera++;
                } else {
                    tempoDeViagem++;
                }
            }
        }
        
        public void sinalizarEmbarque() {
            emEspera = false;
        }
        
        public void sinalizarDesembarque() {
            emEspera = true;
        }
        
        public void parar() {
            parado = true;
        }
        
        public void ligar() {
            parado = false;
        }
        
        public int getTempoDeEspera() {
            return tempoDeEspera;
        }
        
        public int getTempoDeViagem() {
            return tempoDeViagem;
        }
        
        public int tempoTotal() {
            return tempoDeViagem + tempoDeEspera;
        }
        
        
    }
    
    String origem;
    String destino;
    int tempoDeEmbarque;
    int carma;
    boolean necessidadeEspecial;
    boolean malEducado;
    boolean embarcado;
    Relogio relogio;
    
    Pessoa(boolean necessidadeEspecial, boolean malEducado, String origem, String destino) {
        this.necessidadeEspecial = necessidadeEspecial;
        this.malEducado = malEducado;
        this.origem = origem;
        this.destino = destino;
        this.carma = 0;
        this.embarcado = false;
        this.relogio = new Relogio();
    }
    
    public void getTempoDeEmbarque() {
        if (necessidadeEspecial) {
            return tempoDeEmbarque * 2;
        } else {
            return tempoDeEmbarque;
        }
    }
    
    public void tick() {
        relogio.tick();
        if  (malEducado && embarcado) {
            ouvirMusicaAlto();
            naoSairDoAssentoReservado();
            carma -= 2;
        }
    }
    
    public void embarcar() {
        embarcado = true;
        relogio.sinalizarEmbarque();
    }
    
    public void desembarcar() {
        embarcado = false;
        relogio.sinalizarDesmbarque();
    }
    
    private void ouvirMusicaAto() {
        System.out.println("TCHU TCHA TCHA TCHU TCHA TCHA");
    }
    
    private void naoSairDoAssentoReservado() {
        System.out.println("MORRE LOGO SEU VELHO! EU CHEGUEI AQUI PRIMEIRO!");
    }
}
           
