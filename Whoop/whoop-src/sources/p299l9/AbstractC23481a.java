package p299l9;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p047c9.C4323n;
import p171g9.C15586c;
import p171g9.C15587d;
import p171g9.InterfaceC15588e;
import p284ko.C22631o;
import p516u8.AbstractC34609o0;
import p516u8.C34626x;
import p674z8.InterfaceC40178n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23481a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f92959a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f92960b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final C15587d f92961c;

    /* JADX INFO: renamed from: d */
    public final C15587d f92962d;

    /* JADX INFO: renamed from: e */
    public Looper f92963e;

    /* JADX INFO: renamed from: f */
    public AbstractC34609o0 f92964f;

    /* JADX INFO: renamed from: g */
    public C4323n f92965g;

    public AbstractC23481a() {
        int i13 = 0;
        C23488c0 c23488c0 = null;
        this.f92961c = new C15587d(new CopyOnWriteArrayList(), i13, c23488c0);
        this.f92962d = new C15587d(new CopyOnWriteArrayList(), i13, c23488c0);
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC23482a0 mo36144a(C23488c0 c23488c0, C22631o c22631o, long j7);

    /* JADX INFO: renamed from: b */
    public final void m68041b(InterfaceC23491d0 interfaceC23491d0) {
        HashSet hashSet = this.f92960b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC23491d0);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo68042c();
    }

    /* JADX INFO: renamed from: c */
    public void mo68042c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m68043d(InterfaceC23491d0 interfaceC23491d0) {
        this.f92963e.getClass();
        HashSet hashSet = this.f92960b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC23491d0);
        if (zIsEmpty) {
            mo68044e();
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo68044e() {
    }

    /* JADX INFO: renamed from: f */
    public AbstractC34609o0 mo68045f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract C34626x mo36145g();

    /* JADX INFO: renamed from: h */
    public boolean mo68046h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo36146i();

    /* JADX INFO: renamed from: j */
    public final void m68047j(InterfaceC23491d0 interfaceC23491d0, InterfaceC40178n interfaceC40178n, C4323n c4323n) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f92963e;
        AbstractC35849g.m113802d(looper == null || looper == looperMyLooper);
        this.f92965g = c4323n;
        AbstractC34609o0 abstractC34609o0 = this.f92964f;
        this.f92959a.add(interfaceC23491d0);
        if (this.f92963e == null) {
            this.f92963e = looperMyLooper;
            this.f92960b.add(interfaceC23491d0);
            mo36147k(interfaceC40178n);
        } else if (abstractC34609o0 != null) {
            m68043d(interfaceC23491d0);
            interfaceC23491d0.mo8284a(this, abstractC34609o0);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo36147k(InterfaceC40178n interfaceC40178n);

    /* JADX INFO: renamed from: l */
    public final void m68048l(AbstractC34609o0 abstractC34609o0) {
        this.f92964f = abstractC34609o0;
        Iterator it = this.f92959a.iterator();
        while (it.hasNext()) {
            ((InterfaceC23491d0) it.next()).mo8284a(this, abstractC34609o0);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo36148m(InterfaceC23482a0 interfaceC23482a0);

    /* JADX INFO: renamed from: n */
    public final void m68049n(InterfaceC23491d0 interfaceC23491d0) {
        ArrayList arrayList = this.f92959a;
        arrayList.remove(interfaceC23491d0);
        if (!arrayList.isEmpty()) {
            m68041b(interfaceC23491d0);
            return;
        }
        this.f92963e = null;
        this.f92964f = null;
        this.f92965g = null;
        this.f92960b.clear();
        mo36149o();
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo36149o();

    /* JADX INFO: renamed from: p */
    public final void m68050p(InterfaceC15588e interfaceC15588e) {
        CopyOnWriteArrayList<C15586c> copyOnWriteArrayList = this.f92962d.f58539c;
        for (C15586c c15586c : copyOnWriteArrayList) {
            if (c15586c.f58536a == interfaceC15588e) {
                copyOnWriteArrayList.remove(c15586c);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m68051q(InterfaceC23506i0 interfaceC23506i0) {
        CopyOnWriteArrayList<C23503h0> copyOnWriteArrayList = this.f92961c.f58539c;
        for (C23503h0 c23503h0 : copyOnWriteArrayList) {
            if (c23503h0.f93035b == interfaceC23506i0) {
                copyOnWriteArrayList.remove(c23503h0);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo36150r(C34626x c34626x);
}
