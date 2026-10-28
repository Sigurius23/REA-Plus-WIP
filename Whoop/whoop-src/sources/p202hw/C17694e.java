package p202hw;

import b30.C2570m;
import com.nimbusds.jose.JOSEException;
import gw.C16258i;
import gw.C16260k;
import gw.InterfaceC16259j;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import kw.C22847a;
import mw.C25972a;
import p031b9.AbstractC2875y;
import p263jw.AbstractC21976b;
import p263jw.AbstractC21979e;
import p263jw.AbstractC21981g;
import p628xw.C38672b;

/* JADX INFO: renamed from: hw.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17694e extends AbstractC21981g implements InterfaceC16259j {

    /* JADX INFO: renamed from: g */
    public final RSAPublicKey f68650g;

    /* JADX INFO: renamed from: h */
    public final Set f68651h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17694e(RSAPublicKey rSAPublicKey) {
        super(AbstractC21981g.f85118f, AbstractC21976b.f85108a, null);
        Set set = Collections.EMPTY_SET;
        Objects.requireNonNull(rSAPublicKey);
        this.f68650g = rSAPublicKey;
        this.f68651h = set;
    }

    @Override // gw.InterfaceC16259j
    /* JADX INFO: renamed from: a */
    public final C2570m mo46079a(C16260k c16260k, byte[] bArr, byte[] bArr2) throws JOSEException {
        C38672b c38672bM124049c;
        C16258i c16258i = (C16258i) c16260k.f61787w;
        if (c16258i == null) {
            throw new JOSEException("The algorithm \"alg\" header parameter must not be null");
        }
        SecretKey secretKeyM62747b = m62747b(c16260k.f61830O);
        boolean zEquals = c16258i.equals(C16258i.f61827y);
        C25972a c25972a = this.f85106c;
        RSAPublicKey rSAPublicKey = this.f68650g;
        if (zEquals) {
            Provider provider = (Provider) c25972a.f93280x;
            try {
                Cipher cipher = provider == null ? Cipher.getInstance("RSA/ECB/PKCS1Padding") : Cipher.getInstance("RSA/ECB/PKCS1Padding", provider);
                cipher.init(1, rSAPublicKey);
                c38672bM124049c = C38672b.m124049c(cipher.doFinal(secretKeyM62747b.getEncoded()));
            } catch (IllegalBlockSizeException e5) {
                throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e5);
            } catch (Exception e13) {
                throw new JOSEException(AbstractC2875y.m8298k(e13, new StringBuilder("Couldn't encrypt Content Encryption Key (CEK): ")), e13);
            }
        } else if (c16258i.equals(C16258i.f61828z)) {
            C22847a c22847aM50564c = m50564c();
            Provider provider2 = (Provider) c25972a.f93280x;
            try {
                Cipher cipher2 = provider2 == null ? Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding") : Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider2);
                cipher2.init(c22847aM50564c.f90078a, rSAPublicKey, new SecureRandom());
                c38672bM124049c = C38672b.m124049c(c22847aM50564c == C22847a.f90076c ? cipher2.wrap(secretKeyM62747b) : cipher2.doFinal(secretKeyM62747b.getEncoded()));
            } catch (InvalidKeyException e14) {
                throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e14);
            } catch (Exception e15) {
                throw new JOSEException(e15.getMessage(), e15);
            }
        } else if (c16258i.equals(C16258i.f61806E)) {
            c38672bM124049c = C38672b.m124049c(AbstractC21979e.m62754d(rSAPublicKey, secretKeyM62747b, 256, m50564c(), (Provider) c25972a.f93280x));
        } else if (c16258i.equals(C16258i.f61807F)) {
            c38672bM124049c = C38672b.m124049c(AbstractC21979e.m62754d(rSAPublicKey, secretKeyM62747b, 384, m50564c(), (Provider) c25972a.f93280x));
        } else {
            if (!c16258i.equals(C16258i.f61808G)) {
                throw new JOSEException(AbstractC21979e.m62762l(c16258i, AbstractC21981g.f85118f));
            }
            c38672bM124049c = C38672b.m124049c(AbstractC21979e.m62754d(rSAPublicKey, secretKeyM62747b, 512, m50564c(), (Provider) c25972a.f93280x));
        }
        return AbstractC21976b.m62750c(c16260k, bArr, bArr2, secretKeyM62747b, c38672bM124049c, c25972a);
    }

    /* JADX INFO: renamed from: c */
    public final C22847a m50564c() {
        Set set = this.f68651h;
        C22847a c22847a = C22847a.f90077d;
        return set.contains(c22847a) ? c22847a : C22847a.f90076c;
    }
}
