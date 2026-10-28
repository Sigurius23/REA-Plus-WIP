package p093dl;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p586wk.C37330h;
import p618xk.C38410a;
import p618xk.C38422m;
import p618xk.InterfaceC38414e;
import sl.C32578d;

/* JADX INFO: renamed from: dl.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12140f0 implements InterfaceC12155t {

    /* JADX INFO: renamed from: b */
    public static final Set f40373b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: a */
    public final Object f40374a;

    public C12140f0(C12138e0 c12138e0) {
        this.f40374a = c12138e0;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final boolean mo33590a(Object obj) {
        return f40373b.contains(((Uri) obj).getScheme());
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        InterfaceC38414e c38410a;
        Uri uri = (Uri) obj;
        C32578d c32578d = new C32578d(uri);
        C12138e0 c12138e0 = (C12138e0) this.f40374a;
        switch (c12138e0.f40369a) {
            case 0:
                c38410a = new C38410a(c12138e0.f40370b, uri, 0);
                break;
            case 1:
                c38410a = new C38410a(c12138e0.f40370b, uri, 1);
                break;
            default:
                c38410a = new C38422m(c12138e0.f40370b, uri);
                break;
        }
        return new C12154s(c32578d, c38410a);
    }
}
