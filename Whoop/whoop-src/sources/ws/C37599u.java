package ws;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: renamed from: ws.u */
/* JADX INFO: loaded from: classes.dex */
public final class C37599u {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f160802g;

    /* JADX INFO: renamed from: h */
    public static final BigInteger f160803h;

    /* JADX INFO: renamed from: a */
    public Integer f160804a;

    /* JADX INFO: renamed from: b */
    public BigInteger f160805b;

    /* JADX INFO: renamed from: c */
    public C37600v f160806c;

    /* JADX INFO: renamed from: d */
    public C37600v f160807d;

    /* JADX INFO: renamed from: e */
    public Integer f160808e;

    /* JADX INFO: renamed from: f */
    public C37601w f160809f;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f160802g = bigIntegerValueOf;
        f160803h = bigIntegerValueOf.pow(256);
    }

    /* JADX INFO: renamed from: a */
    public final C37602x m120655a() throws GeneralSecurityException {
        Integer num = this.f160804a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f160805b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f160806c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f160807d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f160809f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f160808e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f160804a, Integer.valueOf(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS)));
        }
        if (this.f160806c != this.f160807d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f160805b;
        int iCompareTo = bigInteger.compareTo(C37602x.f160819g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f160802g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f160803h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C37602x(this.f160804a.intValue(), this.f160805b, this.f160809f, this.f160806c, this.f160807d, this.f160808e.intValue());
    }

    /* JADX INFO: renamed from: b */
    public final void m120656b(int i13) throws GeneralSecurityException {
        if (i13 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i13)));
        }
        this.f160808e = Integer.valueOf(i13);
    }
}
