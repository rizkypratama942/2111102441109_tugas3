import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plane extends Actor
{
    /**
     * Act - do whatever the plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 3; // Kecepatan pergerakan

    public void act() {
        setRotation(270);
        
        movePlayer();
    
     }
    public void movePlayer() {
        if (Greenfoot.isKeyDown("A")) {
            setLocation(getX() - 5, getY()); // Gerak ke kiri
        }
        if (Greenfoot.isKeyDown("D")) {
            setLocation(getX() + 5, getY()); // Gerak ke kanan
        }
        if (Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - 5); // Gerak ke atas
        }
        if (Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + 5); // Gerak ke bawah
        }
        if (Greenfoot.mousePressed(null)) {
            shoot();
        }
    }


    
    
    public void shoot() 
    {
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY() + 10);
    }
    private void checkCollision() {
    
    
        Actor enemy = getOneIntersectingObject(enemy.class); // Cek tabrakan dengan musuh
        if (isTouching(enemy.class)) {
            getWorld().removeObject(enemy); // Hapus musuh
            // Tambahkan logika lain yang diperlukan saat pemain bertabrakan dengan musuh
            ((myWorld)getWorld()).updateScore(10); // Menambahkan skor (misalnya, 10 poin) saat pemain menghancurkan musuh
        }

    
    }
}
