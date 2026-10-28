package pg3;

import g40.C15331c1;
import java.util.Objects;

/* JADX INFO: renamed from: pg3.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29183e0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final String f118158c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC29201n f118159d;

    /* JADX INFO: renamed from: e */
    public final boolean f118160e;

    public C29183e0(String str, InterfaceC29201n interfaceC29201n, boolean z4) {
        Objects.requireNonNull(str, "name == null");
        this.f118158c = str;
        this.f118159d = interfaceC29201n;
        this.f118160e = z4;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        String str;
        if (obj == null || (str = (String) this.f118159d.convert(obj)) == null) {
            return;
        }
        C15331c1 c15331c1 = c29212s0.f118223j;
        String str2 = this.f118158c;
        if (this.f118160e) {
            c15331c1.m43542b(str2, str);
        } else {
            c15331c1.m43541a(str2, str);
        }
    }
}
