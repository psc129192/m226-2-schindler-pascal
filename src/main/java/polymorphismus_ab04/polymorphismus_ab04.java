package polymorphismus_ab04;

class Bibliothek {
    private Medium[] katalog;

    public static void main(String[] args) {
        Buch b = new Buch();
        b.sample = "book";
        b.showSample();

        Game g = new Game();
        g.sample = "game";
        g.showSample();
    }
}

abstract class Medium {
    public abstract void showSample();
}

class Buch extends Medium {
    String sample;

    @Override
    public void showSample() {
        System.out.println(sample);
    }
}

class CD extends Medium {
    Sound sample;

    @Override
    public void showSample(){
        Player p = new Player();
        p.playSound(sample);
    }
}

class DVD extends Medium {
    Video sample;

    @Override
    public void showSample(){
        Player p = new Player();
        p.playVideo(sample);
    }
}

class Game extends Medium {
    String sample;

    @Override
    public void showSample(){
        System.out.println(sample);
    }
}

class Sound extends Player {}

class Video {}

class Player {
    public void playVideo(Video v) {
// Video anzeigen ...
    }

    public void playSound(Sound s) {
// Sound spielen ...
    }
}
