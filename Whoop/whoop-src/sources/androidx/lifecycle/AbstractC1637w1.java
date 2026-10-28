package androidx.lifecycle;

import bc3.InterfaceC2994c0;
import java.io.Closeable;
import java.util.Iterator;
import l83.InterfaceC23457c;
import p337n8.C26446c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.w1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1637w1 {
    private final C26446c impl;

    public AbstractC1637w1() {
        this.impl = new C26446c();
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(closeable, "closeable");
        C26446c c26446c = this.impl;
        if (c26446c != null) {
            c26446c.m78299b(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        C26446c c26446c = this.impl;
        if (c26446c != null && !c26446c.f105047d) {
            c26446c.f105047d = true;
            synchronized (c26446c.f105044a) {
                try {
                    Iterator it = c26446c.f105045b.values().iterator();
                    while (it.hasNext()) {
                        C26446c.m78297c((AutoCloseable) it.next());
                    }
                    Iterator it3 = c26446c.f105046c.iterator();
                    while (it3.hasNext()) {
                        C26446c.m78297c((AutoCloseable) it3.next());
                    }
                    c26446c.f105046c.clear();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t14;
        AbstractC22676k.m65750j(key, "key");
        C26446c c26446c = this.impl;
        if (c26446c == null) {
            return null;
        }
        synchronized (c26446c.f105044a) {
            t14 = (T) c26446c.f105045b.get(key);
        }
        return t14;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        AbstractC22676k.m65750j(closeable, "closeable");
        C26446c c26446c = this.impl;
        if (c26446c != null) {
            c26446c.m78298a(closeable);
        }
    }

    public AbstractC1637w1(InterfaceC2994c0 viewModelScope) {
        AbstractC22676k.m65750j(viewModelScope, "viewModelScope");
        this.impl = new C26446c(viewModelScope);
    }

    @InterfaceC23457c
    public /* synthetic */ void addCloseable(Closeable closeable) {
        AbstractC22676k.m65750j(closeable, "closeable");
        C26446c c26446c = this.impl;
        if (c26446c != null) {
            c26446c.m78298a(closeable);
        }
    }
}
