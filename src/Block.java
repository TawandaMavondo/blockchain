import java.security.MessageDigest;
import java.util.Date;
public class Block implements Comparable<Block> {

    public String hash;
    private  Product data;
    private long timeStamp;

    public Product getData() {
        return data;
    }

    public Block(Product data) {
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        return this.sha256();
    }

    @Override
    public int compareTo(Block block) {
        return 0;
    }

    private String sha256() {
        String input = Long.toString(timeStamp) + this.data.getDescription() + data.getFrom() +data.getTo();
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            int i = 0;

            byte[] hash = sha.digest(input.getBytes("UTF-8"));

            StringBuffer hexHash = new StringBuffer();

            while (i < hash.length) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1)
                    hexHash.append('0');
                hexHash.append(hex);
                i++;
            }

            return hexHash.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
