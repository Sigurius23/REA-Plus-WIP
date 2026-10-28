package gl;

import a33.C0352d;
import al.C0960g;
import al.InterfaceC0955b;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import il.C18616b;
import il.C18617c;
import io.sentry.internal.debugmeta.C20378c;
import java.io.InputStream;
import p586wk.C37330h;
import p586wk.InterfaceC37332j;
import p684zk.InterfaceC40801z;
import tl.C33905d;
import tl.C33910i;

/* JADX INFO: renamed from: gl.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15934a implements InterfaceC37332j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60332a;

    /* JADX INFO: renamed from: b */
    public final Object f60333b;

    /* JADX INFO: renamed from: c */
    public final Object f60334c;

    public /* synthetic */ C15934a(int i13, Object obj, Object obj2) {
        this.f60332a = i13;
        this.f60333b = obj;
        this.f60334c = obj2;
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: a */
    public final InterfaceC40801z mo44989a(Object obj, int i13, int i14, C37330h c37330h) {
        boolean z4;
        C15956u c15956u;
        switch (this.f60332a) {
            case 0:
                return C15938c.m44995d((Resources) this.f60334c, ((InterfaceC37332j) this.f60333b).mo44989a(obj, i13, i14, c37330h));
            case 1:
                InterfaceC40801z interfaceC40801zM53888c = ((C18617c) this.f60333b).m53888c((Uri) obj);
                if (interfaceC40801zM53888c == null) {
                    return null;
                }
                return AbstractC15950o.m45018a((InterfaceC0955b) this.f60334c, (Drawable) ((C18616b) interfaceC40801zM53888c).get(), i13, i14);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C15956u) {
                    c15956u = (C15956u) inputStream;
                    z4 = false;
                } else {
                    z4 = true;
                    c15956u = new C15956u(inputStream, (C0960g) this.f60334c);
                }
                C33905d c33905dM107256b = C33905d.m107256b(c15956u);
                C33910i c33910i = new C33910i(c33905dM107256b);
                C20378c c20378c = new C20378c(16, c15956u, c33905dM107256b);
                try {
                    C15948m c15948m = (C15948m) this.f60333b;
                    return c15948m.m45016a(new C0352d(c33910i, c15948m.f60371d, c15948m.f60370c), i13, i14, c37330h, c20378c);
                } finally {
                    c33905dM107256b.m107257h();
                    if (z4) {
                        c15956u.m45022h();
                    }
                }
        }
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: b */
    public final boolean mo44990b(Object obj, C37330h c37330h) {
        switch (this.f60332a) {
            case 0:
                return ((InterfaceC37332j) this.f60333b).mo44990b(obj, c37330h);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public C15934a(Resources resources, InterfaceC37332j interfaceC37332j) {
        this.f60332a = 0;
        this.f60334c = resources;
        this.f60333b = interfaceC37332j;
    }
}
