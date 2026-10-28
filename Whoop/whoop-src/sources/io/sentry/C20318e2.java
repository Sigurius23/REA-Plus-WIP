package io.sentry;

import android.graphics.Matrix;
import android.graphics.Path;
import dj.AbstractC12064i;
import java.util.ArrayList;
import p319m4.AbstractC25012a;
import p372ol.C28010e;
import p586wk.InterfaceC37333k;
import si.C32534t;

/* JADX INFO: renamed from: io.sentry.e2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20318e2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f76298a;

    public C20318e2(int i13) {
        switch (i13) {
            case 1:
                this.f76298a = new ArrayList();
                break;
            case 2:
                this.f76298a = new ArrayList();
                break;
            default:
                this.f76298a = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m56474a(Path path) {
        ArrayList arrayList = this.f76298a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C32534t c32534t = (C32534t) arrayList.get(size);
            Matrix matrix = AbstractC12064i.f40031a;
            if (c32534t != null && !c32534t.f134834a) {
                AbstractC12064i.m33263a(path, c32534t.f134837d.m106991l() / 100.0f, c32534t.f134838e.m106991l() / 100.0f, c32534t.f134839f.m106991l() / 360.0f);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized InterfaceC37333k m56475b(Class cls) {
        int size = this.f76298a.size();
        for (int i13 = 0; i13 < size; i13++) {
            C28010e c28010e = (C28010e) this.f76298a.get(i13);
            if (c28010e.f112946a.isAssignableFrom(cls)) {
                return c28010e.f112947b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC20640z1 m56476c() {
        ArrayList arrayList = this.f76298a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (InterfaceC20640z1) AbstractC25012a.m73371d(arrayList, 1);
    }

    /* JADX INFO: renamed from: d */
    public boolean m56477d() {
        if (this.f76298a.size() == 1) {
            return true;
        }
        InterfaceC20640z1 interfaceC20640z1M56476c = m56476c();
        m56479f();
        if (!(m56476c() instanceof C20272c2)) {
            if (!(m56476c() instanceof C20043a2)) {
                return false;
            }
            C20043a2 c20043a2 = (C20043a2) m56476c();
            if (interfaceC20640z1M56476c == null || c20043a2 == null) {
                return false;
            }
            c20043a2.f75193a.add(interfaceC20640z1M56476c.getValue());
            return false;
        }
        C20272c2 c20272c2 = (C20272c2) m56476c();
        m56479f();
        C20260b2 c20260b2 = (C20260b2) m56476c();
        if (c20272c2 == null || interfaceC20640z1M56476c == null || c20260b2 == null) {
            return false;
        }
        c20260b2.f76084a.put(c20272c2.f76121a, interfaceC20640z1M56476c.getValue());
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m56478e(InterfaceC20632y1 interfaceC20632y1) {
        Object objMo11181d = interfaceC20632y1.mo11181d();
        if (m56476c() == null && objMo11181d != null) {
            this.f76298a.add(new C20309d2(objMo11181d));
            return true;
        }
        if (m56476c() instanceof C20272c2) {
            C20272c2 c20272c2 = (C20272c2) m56476c();
            m56479f();
            ((C20260b2) m56476c()).f76084a.put(c20272c2.f76121a, objMo11181d);
            return false;
        }
        if (!(m56476c() instanceof C20043a2)) {
            return false;
        }
        ((C20043a2) m56476c()).f75193a.add(objMo11181d);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m56479f() {
        ArrayList arrayList = this.f76298a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
