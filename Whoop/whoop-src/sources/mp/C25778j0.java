package mp;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: mp.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25778j0 extends AbstractC25753b implements Serializable {

    /* JADX INFO: renamed from: E */
    public final MessageDigest f101494E;

    /* JADX INFO: renamed from: F */
    public final int f101495F;

    /* JADX INFO: renamed from: G */
    public final boolean f101496G;

    /* JADX INFO: renamed from: H */
    public final String f101497H;

    public C25778j0() {
        boolean z4;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f101494E = messageDigest;
            this.f101495F = messageDigest.getDigestLength();
            this.f101497H = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z4 = true;
            } catch (CloneNotSupportedException unused) {
                z4 = false;
            }
            this.f101496G = z4;
        } catch (NoSuchAlgorithmException e5) {
            throw new AssertionError(e5);
        }
    }

    public final String toString() {
        return this.f101497H;
    }
}
