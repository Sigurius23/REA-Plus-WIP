package p263jw;

import com.nimbusds.jose.KeyLengthException;
import gw.C16254e;
import gw.C16258i;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: jw.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21977c extends AbstractC21975a {

    /* JADX INFO: renamed from: f */
    public static final Set f85110f;

    static {
        Set set = AbstractC21976b.f85108a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(C16258i.f61812K);
        f85110f = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC21977c(SecretKey secretKey) throws KeyLengthException {
        Set set;
        byte[] encoded = secretKey.getEncoded();
        int length = encoded == null ? 0 : encoded.length * 8;
        if (length == 0) {
            set = C16254e.f61793w;
        } else {
            set = (Set) AbstractC21976b.f85109b.get(Integer.valueOf(length));
            if (set == null) {
                throw new KeyLengthException("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
            }
        }
        super(f85110f, set, secretKey);
    }
}
