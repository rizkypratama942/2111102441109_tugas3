import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myWorld extends World
{

    /**
     * Constructor for objects of class myWorld.
     * 
     */
    public myWorld()
    {    
        // 
        super(450, 650, 1); 
        addObject(new plane(), 225, 600);
        
    }
    public void act() {
        spawnEnemy(); // Panggil metode untuk memunculkan musuh
    }
    private int score = 0;
    public void updateScore(int points) {
        score += points;
        showText("Score: " + score, 100, 30); // Menampilkan skor di layar
    }
    private int spawnInterval = 100; // Interval penampilan musuh
    private int spawnTimer = 0; // Timer untuk menghitung interval
    private int enemySpeed = 1; // Kecepatan musuh
    
    private void spawnEnemy() {
        if (spawnTimer >= spawnInterval) {
            addObject(new enemy(), Greenfoot.getRandomNumber(getWidth()), 0); // Tambahkan musuh ke dunia
            spawnTimer = 30; // Reset timer
        } else {
            spawnTimer++; // Tambahkan timer
        }
    }
}
