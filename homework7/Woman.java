package homework7;

import static sun.font.FontFamily.getFamily;

public class Woman extends Human{
    public void welcomeTheFavorite() {
        System.out.printf("I love you %s\n", getFamily().getPet().getNickname());
    }
    public void makeupLove(String makeup){
        System.out.printf("My favourite %s\n brand is Zoeva", makeup );
    }
}
