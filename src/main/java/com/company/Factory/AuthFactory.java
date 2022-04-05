package main.java.com.company.Factory;

public class AuthFactory {
    public IAuth createAuth(int authType) throws Exception {
        switch (authType) {
            case 1:
                return new FacebookAuth();
            case 2:
                return new GoogleAuth();
            default:
                throw new Exception("This auth not implement yet");
        }
    }
}
