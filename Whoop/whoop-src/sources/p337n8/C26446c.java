package p337n8;

import bc3.InterfaceC2994c0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p249jc.C21565a;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C26446c {

    /* JADX INFO: renamed from: a */
    public final C21565a f105044a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f105045b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f105046c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f105047d;

    public C26446c() {
        this.f105044a = new C21565a(10);
        this.f105045b = new LinkedHashMap();
        this.f105046c = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: c */
    public static void m78297c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC25012a.m73390w(autoCloseable);
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m78298a(AutoCloseable closeable) {
        AbstractC22676k.m65750j(closeable, "closeable");
        if (this.f105047d) {
            m78297c(closeable);
            return;
        }
        synchronized (this.f105044a) {
            this.f105046c.add(closeable);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m78299b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        if (this.f105047d) {
            m78297c(autoCloseable);
            return;
        }
        synchronized (this.f105044a) {
            autoCloseable2 = (AutoCloseable) this.f105045b.put(str, autoCloseable);
        }
        m78297c(autoCloseable2);
    }

    public C26446c(InterfaceC2994c0 viewModelScope) {
        AbstractC22676k.m65750j(viewModelScope, "viewModelScope");
        this.f105044a = new C21565a(10);
        this.f105045b = new LinkedHashMap();
        this.f105046c = new LinkedHashSet();
        m78299b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new C26444a(viewModelScope.getCoroutineContext()));
    }
}
