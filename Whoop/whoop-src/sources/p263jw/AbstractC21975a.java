package p263jw;

import com.nimbusds.jose.JOSEException;
import gw.C16255f;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import mw.C25972a;

/* JADX INFO: renamed from: jw.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21975a {

    /* JADX INFO: renamed from: e */
    public static final Set f85103e = Collections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));

    /* JADX INFO: renamed from: a */
    public final Set f85104a;

    /* JADX INFO: renamed from: b */
    public final Set f85105b;

    /* JADX INFO: renamed from: c */
    public final C25972a f85106c = new C25972a(0);

    /* JADX INFO: renamed from: d */
    public final SecretKey f85107d;

    public AbstractC21975a(Set set, Set set2, SecretKey secretKey) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
        }
        this.f85104a = Collections.unmodifiableSet(set);
        if (set2 == null) {
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        this.f85105b = set2;
        if (secretKey != null && set.size() > 1 && (secretKey.getAlgorithm() == null || !f85103e.contains(secretKey.getAlgorithm()))) {
            throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
        }
        this.f85107d = secretKey;
    }

    /* JADX INFO: renamed from: b */
    public final SecretKey m62747b(C16255f c16255f) throws JOSEException {
        SecretKey secretKey = this.f85107d;
        if (secretKey != null || c16255f == null) {
            return secretKey;
        }
        SecureRandom secureRandom = new SecureRandom();
        Set set = AbstractC21976b.f85108a;
        if (!set.contains(c16255f)) {
            throw new JOSEException(AbstractC21979e.m62761k(c16255f, set));
        }
        byte[] bArr = new byte[c16255f.f61803y / 8];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
