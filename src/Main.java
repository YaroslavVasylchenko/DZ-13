public class Main {
    public static void main(String[] args) {
        CardRank card = CardRank.valueOf("THREE");
        switch (card) {
            case NINE:
                System.out.println("NINE" + " has number " + card.getNumber());
                break;
            case KING:
                System.out.println("KING" + " has number " + card.getNumber());
                break;
            case QUEEN:
                System.out.println("QUEEN" + " has number " + card.getNumber());
                break;
            default:
                System.out.println("value is wrong");

        }
    }
}

