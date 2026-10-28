package p582wg;

import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: renamed from: wg.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37248a implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159365a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.f159365a) {
            case 0:
                return Security.getProperty("org.bouncyseoncastle.asn1.allow_unsafe_integer");
            case 1:
                return System.getProperty("org.bouncyseoncastle.asn1.allow_unsafe_integer");
            default:
                return System.getProperty("line.separator");
        }
    }
}
