package o30;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import hm.C17417d;
import java.io.Serializable;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import l83.C23468n;
import n30.C26212c;
import n30.InterfaceC26213d;
import p263jw.AbstractC21979e;
import p477s2.AbstractC32069a;
import p505ts.AbstractC34132o;
import p628xw.AbstractC38676f;
import p628xw.C38672b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C27507e implements Serializable {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26213d f110778w;

    public C27507e(InterfaceC26213d errorReporter) {
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f110778w = errorReporter;
    }

    /* JADX INFO: renamed from: a */
    public final SecretKey m82920a(ECPublicKey acsPublicKey, ECPrivateKey eCPrivateKey, String agreementInfo) {
        Object objM107888l;
        AbstractC22676k.m65750j(acsPublicKey, "acsPublicKey");
        AbstractC22676k.m65750j(agreementInfo, "agreementInfo");
        try {
            objM107888l = new C17417d(23).m49431g(AbstractC21979e.m62753c(acsPublicKey, eCPrivateKey), C17417d.m49429i(null), C17417d.m49429i(null), C17417d.m49429i(C38672b.m124049c(agreementInfo.getBytes(AbstractC38676f.f166480a)).m124047a()), AbstractC32069a.m99659A(256), new byte[0]);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            ((C26212c) this.f110778w).m77828c(thM68037a);
        }
        Throwable thM68037a2 = C23468n.m68037a(objM107888l);
        if (thM68037a2 == null) {
            return (SecretKey) objM107888l;
        }
        throw new SDKRuntimeException(thM68037a2);
    }
}
