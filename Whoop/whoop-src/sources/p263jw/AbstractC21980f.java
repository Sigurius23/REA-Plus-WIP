package p263jw;

import com.nimbusds.jose.KeyLengthException;
import gw.C16262m;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import p027b3.AbstractC2351b;

/* JADX INFO: renamed from: jw.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21980f extends AbstractC2351b {

    /* JADX INFO: renamed from: e */
    public static final Set f85116e;

    /* JADX INFO: renamed from: d */
    public final SecretKey f85117d;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(C16262m.f61863y);
        linkedHashSet.add(C16262m.f61864z);
        linkedHashSet.add(C16262m.f61849E);
        f85116e = Collections.unmodifiableSet(linkedHashSet);
    }

    public AbstractC21980f(SecretKey secretKey) throws KeyLengthException {
        Set setUnmodifiableSet;
        if (secretKey.getEncoded() != null) {
            byte[] encoded = secretKey.getEncoded();
            int length = encoded == null ? 0 : encoded.length * 8;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (length >= 256) {
                linkedHashSet.add(C16262m.f61863y);
            }
            if (length >= 384) {
                linkedHashSet.add(C16262m.f61864z);
            }
            if (length >= 512) {
                linkedHashSet.add(C16262m.f61849E);
            }
            setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        } else {
            setUnmodifiableSet = f85116e;
        }
        super(setUnmodifiableSet);
        if (secretKey.getEncoded() != null) {
            byte[] encoded2 = secretKey.getEncoded();
            if ((encoded2 != null ? encoded2.length * 8 : 0) < 256) {
                throw new KeyLengthException("The secret length must be at least 256 bits");
            }
        }
        this.f85117d = secretKey;
    }
}
