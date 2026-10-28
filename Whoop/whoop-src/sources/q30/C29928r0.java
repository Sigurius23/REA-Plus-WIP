package q30;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.io.Serializable;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import l83.C23468n;
import n30.C26212c;
import n30.InterfaceC26213d;
import o30.C27507e;
import o30.InterfaceC27506d;
import p505ts.AbstractC34132o;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: q30.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29928r0 implements Serializable {

    /* JADX INFO: renamed from: w */
    public final C29919n f122230w;

    public C29928r0(C29919n config) {
        AbstractC22676k.m65750j(config, "config");
        this.f122230w = config;
    }

    /* JADX INFO: renamed from: a */
    public final C29932t0 m91522a(InterfaceC26213d errorReporter, InterfaceC30063j workContext) {
        Object objM107888l;
        Object objM107888l2;
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        C38445a c38445a = new C38445a(errorReporter);
        KeyFactory keyFactory = (KeyFactory) c38445a.f164637y;
        C29919n c29919n = this.f122230w;
        InterfaceC27506d interfaceC27506d = c29919n.f122211w;
        String str = c29919n.f122212x;
        C29917m c29917m = c29919n.f122210E;
        byte[] privateKeyEncoded = c29917m.f122208w;
        AbstractC22676k.m65750j(privateKeyEncoded, "privateKeyEncoded");
        try {
            PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyEncoded));
            AbstractC22676k.m65748h(privateKeyGeneratePrivate, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
            objM107888l = (ECPrivateKey) privateKeyGeneratePrivate;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            throw new SDKRuntimeException(thM68037a);
        }
        ECPrivateKey eCPrivateKey = (ECPrivateKey) objM107888l;
        byte[] publicKeyEncoded = c29917m.f122209x;
        AbstractC22676k.m65750j(publicKeyEncoded, "publicKeyEncoded");
        try {
            PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(publicKeyEncoded));
            AbstractC22676k.m65748h(publicKeyGeneratePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            objM107888l2 = (ECPublicKey) publicKeyGeneratePublic;
        } catch (Throwable th4) {
            objM107888l2 = AbstractC34132o.m107888l(th4);
        }
        Throwable thM68037a2 = C23468n.m68037a(objM107888l2);
        if (thM68037a2 != null) {
            ((C26212c) ((InterfaceC26213d) c38445a.f164636x)).m77828c(thM68037a2);
        }
        Throwable thM68037a3 = C23468n.m68037a(objM107888l2);
        if (thM68037a3 == null) {
            return new C29932t0(interfaceC27506d, str, eCPrivateKey, (ECPublicKey) objM107888l2, c29919n.f122214z, errorReporter, new C27507e(errorReporter), workContext, this.f122230w);
        }
        throw new SDKRuntimeException(thM68037a3);
    }
}
