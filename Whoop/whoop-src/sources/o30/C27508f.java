package o30;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import l83.C23468n;
import n30.C26212c;
import p350nw.C27180a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C27508f {

    /* JADX INFO: renamed from: b */
    public static final String f110779b;

    /* JADX INFO: renamed from: a */
    public final C26212c f110780a;

    static {
        EnumC27503a[] enumC27503aArr = EnumC27503a.f110768x;
        f110779b = "EC";
    }

    public C27508f(C26212c c26212c) {
        this.f110780a = c26212c;
    }

    /* JADX INFO: renamed from: a */
    public final KeyPair m82921a() {
        Object objM107888l;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f110779b);
            keyPairGenerator.initialize(new ECGenParameterSpec(C27180a.f108790y.f108793x));
            objM107888l = keyPairGenerator.generateKeyPair();
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            this.f110780a.m77828c(thM68037a);
        }
        Throwable thM68037a2 = C23468n.m68037a(objM107888l);
        if (thM68037a2 != null) {
            throw new SDKRuntimeException(thM68037a2);
        }
        AbstractC22676k.m65749i(objM107888l, "getOrElse(...)");
        return (KeyPair) objM107888l;
    }
}
