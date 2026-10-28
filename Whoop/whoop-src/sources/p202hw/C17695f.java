package p202hw;

import com.nimbusds.jose.JOSEException;
import gw.C16262m;
import gw.C16263n;
import gw.InterfaceC16266q;
import hm.C17417d;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Collections;
import la.C23548b;
import p263jw.AbstractC21979e;
import p263jw.AbstractC21982h;
import p628xw.C38672b;

/* JADX INFO: renamed from: hw.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C17695f extends AbstractC21982h implements InterfaceC16266q {

    /* JADX INFO: renamed from: e */
    public final C17417d f68652e;

    /* JADX INFO: renamed from: f */
    public final RSAPublicKey f68653f;

    public C17695f(RSAPublicKey rSAPublicKey) {
        super(AbstractC21982h.f85119d);
        C17417d c17417d = new C17417d(24);
        this.f68652e = c17417d;
        this.f68653f = rSAPublicKey;
        c17417d.f67507x = Collections.EMPTY_SET;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b A[PHI: r4
      0x006b: PHI (r4v14 java.security.Signature) = 
      (r4v7 java.security.Signature)
      (r4v8 java.security.Signature)
      (r4v10 java.security.Signature)
      (r4v11 java.security.Signature)
      (r4v13 java.security.Signature)
      (r4v15 java.security.Signature)
     binds: [B:58:0x00f1, B:53:0x00e2, B:43:0x00b6, B:38:0x00a7, B:28:0x007a, B:23:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gw.InterfaceC16266q
    /* JADX INFO: renamed from: e */
    public final boolean mo46085e(C16263n c16263n, byte[] bArr, C38672b c38672b) throws JOSEException {
        Signature signatureM62758h;
        Signature signatureM62758h2;
        if (!this.f68652e.m49432k(c16263n)) {
            return false;
        }
        C16262m c16262m = (C16262m) c16263n.f61787w;
        Provider provider = (Provider) ((C23548b) this.f9292c).f93280x;
        if ((!c16262m.equals(C16262m.f61850F) || (signatureM62758h = AbstractC21979e.m62758h("SHA256withRSA", provider, null)) == null) && ((!c16262m.equals(C16262m.f61851G) || (signatureM62758h = AbstractC21979e.m62758h("SHA384withRSA", provider, null)) == null) && (!c16262m.equals(C16262m.f61852H) || (signatureM62758h = AbstractC21979e.m62758h("SHA512withRSA", provider, null)) == null))) {
            C16262m c16262m2 = C16262m.f61857M;
            if ((c16262m.equals(c16262m2) && (signatureM62758h2 = AbstractC21979e.m62758h("RSASSA-PSS", provider, new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1))) != null) || (c16262m.equals(c16262m2) && (signatureM62758h2 = AbstractC21979e.m62758h("SHA256withRSA/PSS", provider, null)) != null)) {
                signatureM62758h = signatureM62758h2;
            } else if (!c16262m.equals(c16262m2) || (signatureM62758h = AbstractC21979e.m62758h("SHA256withRSAandMGF1", provider, null)) == null) {
                C16262m c16262m3 = C16262m.f61858N;
                if ((c16262m.equals(c16262m3) && (signatureM62758h2 = AbstractC21979e.m62758h("RSASSA-PSS", provider, new PSSParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, 48, 1))) != null) || (c16262m.equals(c16262m3) && (signatureM62758h2 = AbstractC21979e.m62758h("SHA384withRSA/PSS", provider, null)) != null)) {
                    signatureM62758h = signatureM62758h2;
                } else if (!c16262m.equals(c16262m3) || (signatureM62758h = AbstractC21979e.m62758h("SHA384withRSAandMGF1", provider, null)) == null) {
                    C16262m c16262m4 = C16262m.f61859O;
                    if ((c16262m.equals(c16262m4) && (signatureM62758h2 = AbstractC21979e.m62758h("RSASSA-PSS", provider, new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1))) != null) || (c16262m.equals(c16262m4) && (signatureM62758h2 = AbstractC21979e.m62758h("SHA512withRSA/PSS", provider, null)) != null)) {
                        signatureM62758h = signatureM62758h2;
                    } else if (!c16262m.equals(c16262m4) || (signatureM62758h = AbstractC21979e.m62758h("SHA512withRSAandMGF1", provider, null)) == null) {
                        throw new JOSEException(AbstractC21979e.m62763m(c16262m, AbstractC21982h.f85119d));
                    }
                }
            }
        }
        try {
            signatureM62758h.initVerify(this.f68653f);
            try {
                signatureM62758h.update(bArr);
                return signatureM62758h.verify(c38672b.m124047a());
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e5) {
            throw new JOSEException("Invalid public RSA key: " + e5.getMessage(), e5);
        }
    }
}
