import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        setRotation(90);
        setLocation(getX(), getY() +1);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        if (isTouching(plane.class)) {
            getWorld().removeObject(this);
        }
        if (isTouching(Bullet.class)) {
            getWorld().removeObject(this);
        }
    
    
    
    }
}
