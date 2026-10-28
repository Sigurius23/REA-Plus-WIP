package ws;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: ws.n */
/* JADX INFO: loaded from: classes.dex */
public final class C37592n {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f160765e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f160766f;

    /* JADX INFO: renamed from: a */
    public Integer f160767a;

    /* JADX INFO: renamed from: b */
    public BigInteger f160768b;

    /* JADX INFO: renamed from: c */
    public C37593o f160769c;

    /* JADX INFO: renamed from: d */
    public C37594p f160770d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f160765e = bigIntegerValueOf;
        f160766f = bigIntegerValueOf.pow(256);
    }

    /* JADX INFO: renamed from: a */
    public final C37595q m120653a() throws GeneralSecurityException {
        Integer num = this.f160767a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f160768b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f160769c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f160770d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f160767a));
        }
        BigInteger bigInteger = this.f160768b;
        int iCompareTo = bigInteger.compareTo(C37595q.f160780e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f160765e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f160766f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C37595q(this.f160767a.intValue(), this.f160768b, this.f160770d, this.f160769c);
    }
}
