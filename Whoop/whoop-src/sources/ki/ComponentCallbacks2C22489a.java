package ki;

import ai.C0900f;
import ai.C0904j;
import ai.InterfaceC0898d;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import p461rh.C31428q;
import p461rh.C31431t;

/* JADX INFO: renamed from: ki.a */
/* JADX INFO: loaded from: classes6.dex */
public final class ComponentCallbacks2C22489a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: w */
    public final WeakReference f88184w;

    /* JADX INFO: renamed from: x */
    public Context f88185x;

    /* JADX INFO: renamed from: y */
    public boolean f88186y;

    public ComponentCallbacks2C22489a(C31431t c31431t) {
        this.f88184w = new WeakReference(c31431t);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m64990a() {
        try {
            if (this.f88186y) {
                return;
            }
            this.f88186y = true;
            Context context = this.f88185x;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.f88184w.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C31431t) this.f88184w.get()) == null) {
            m64990a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i13) {
        InterfaceC0898d interfaceC0898d;
        long size;
        try {
            C31431t c31431t = (C31431t) this.f88184w.get();
            if (c31431t != null) {
                C31428q c31428q = c31431t.f129319a;
                if (i13 >= 40) {
                    InterfaceC0898d interfaceC0898d2 = (InterfaceC0898d) c31428q.f129303c.getValue();
                    if (interfaceC0898d2 != null) {
                        C0900f c0900f = (C0900f) interfaceC0898d2;
                        synchronized (c0900f.f3289c) {
                            c0900f.f3287a.clear();
                            C0904j c0904j = c0900f.f3288b;
                            c0904j.f3301w = 0;
                            ((LinkedHashMap) c0904j.f3302x).clear();
                        }
                    }
                } else if (i13 >= 10 && (interfaceC0898d = (InterfaceC0898d) c31428q.f129303c.getValue()) != null) {
                    C0900f c0900f2 = (C0900f) interfaceC0898d;
                    synchronized (c0900f2.f3289c) {
                        size = c0900f2.f3287a.getSize();
                    }
                    long j7 = size / ((long) 2);
                    C0900f c0900f3 = (C0900f) interfaceC0898d;
                    synchronized (c0900f3.f3289c) {
                        c0900f3.f3287a.mo2231m(j7);
                    }
                }
            } else {
                m64990a();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
