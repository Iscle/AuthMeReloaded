package fr.xephi.authme.security.crypts;

import fr.xephi.authme.security.HashUtils;
import fr.xephi.authme.security.crypts.description.Recommendation;
import fr.xephi.authme.security.crypts.description.Usage;
import fr.xephi.authme.util.RandomStringUtils;

@Recommendation(Usage.DEPRECATED)
public class DynamicBungeeAuthSaltedSha512 extends SeparateSaltMethod {

    @Override
    public String computeHash(String password, String salt, String name) {
        return HashUtils.sha512(HashUtils.sha512(password) + salt);
    }

    @Override
    public String generateSalt() {
        return RandomStringUtils.generateHex(32);
    }
}
