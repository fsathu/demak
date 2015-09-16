public interface ISoundBehaviour
{
    public void makeSound();
}
public class MeowSound implements ISoundBehaviour
{
    public void makeSound()
    {
        System.out.println("Meow");
    }
}
public class RoarSound implements ISoundBehaviour
{
    public void makeSound()
    {
        System.out.println("Roar!");
    }}
public class Cat
{
    private ISoundBehaviour sound = new MeowSound();
    public void makeSound()
    {
        sound.makeSound();
    }
    public void setSoundBehaviour(ISoundBehaviour newsound)
    {
        sound = newsound;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Cat c = new Cat();
// Delegation
        c.makeSound();
// Output: Meow
// change the sound it makes
        ISoundBehaviour newsound = new RoarSound();
        c.setSoundBehaviour(newsound);
// Delegation
        c.makeSound();
// Output: Roar!
    }
}