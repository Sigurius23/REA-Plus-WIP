package ws;

import com.google.crypto.tink.internal.AbstractC5086e;
import java.security.spec.ECParameterSpec;

/* JADX INFO: renamed from: ws.a */
/* JADX INFO: loaded from: classes.dex */
public final class C37577a {

    /* JADX INFO: renamed from: c */
    public static final C37577a f160693c = new C37577a("NIST_P256", AbstractC5086e.f21407a);

    /* JADX INFO: renamed from: d */
    public static final C37577a f160694d = new C37577a("NIST_P384", AbstractC5086e.f21408b);

    /* JADX INFO: renamed from: e */
    public static final C37577a f160695e = new C37577a("NIST_P521", AbstractC5086e.f21409c);

    /* JADX INFO: renamed from: a */
    public final String f160696a;

    /* JADX INFO: renamed from: b */
    public final ECParameterSpec f160697b;

    public C37577a(String str, ECParameterSpec eCParameterSpec) {
        this.f160696a = str;
        this.f160697b = eCParameterSpec;
    }

    public final String toString() {
        return this.f160696a;
    }
}
