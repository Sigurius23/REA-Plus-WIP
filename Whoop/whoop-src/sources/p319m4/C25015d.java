package p319m4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p108e4.AbstractC12682p;
import p136f4.C14054f;
import p333n4.C26259o;
import p547v8.AbstractC35785b;

/* JADX INFO: renamed from: m4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C25015d {

    /* JADX INFO: renamed from: b */
    public int f97873b;

    /* JADX INFO: renamed from: c */
    public boolean f97874c;

    /* JADX INFO: renamed from: d */
    public final C25016e f97875d;

    /* JADX INFO: renamed from: e */
    public final int f97876e;

    /* JADX INFO: renamed from: f */
    public C25015d f97877f;

    /* JADX INFO: renamed from: i */
    public C14054f f97880i;

    /* JADX INFO: renamed from: a */
    public HashSet f97872a = null;

    /* JADX INFO: renamed from: g */
    public int f97878g = 0;

    /* JADX INFO: renamed from: h */
    public int f97879h = Integer.MIN_VALUE;

    public C25015d(C25016e c25016e, int i13) {
        this.f97875d = c25016e;
        this.f97876e = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m73399a(C25015d c25015d, int i13) {
        m73400b(c25015d, i13, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m73400b(C25015d c25015d, int i13, int i14, boolean z4) {
        if (c25015d == null) {
            m73408j();
            return true;
        }
        if (!z4 && !m73407i(c25015d)) {
            return false;
        }
        this.f97877f = c25015d;
        if (c25015d.f97872a == null) {
            c25015d.f97872a = new HashSet();
        }
        HashSet hashSet = this.f97877f.f97872a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f97878g = i13;
        this.f97879h = i14;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m73401c(int i13, ArrayList arrayList, C26259o c26259o) {
        HashSet hashSet = this.f97872a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC35785b.m113421p(((C25015d) it.next()).f97875d, i13, arrayList, c26259o);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m73402d() {
        if (this.f97874c) {
            return this.f97873b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m73403e() {
        C25015d c25015d;
        if (this.f97875d.f97922h0 == 8) {
            return 0;
        }
        int i13 = this.f97879h;
        return (i13 == Integer.MIN_VALUE || (c25015d = this.f97877f) == null || c25015d.f97875d.f97922h0 != 8) ? this.f97878g : i13;
    }

    /* JADX INFO: renamed from: f */
    public final C25015d m73404f() {
        int i13 = this.f97876e;
        int iM35485e = AbstractC12682p.m35485e(i13);
        C25016e c25016e = this.f97875d;
        switch (iM35485e) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c25016e.f97892L;
            case 2:
                return c25016e.f97893M;
            case 3:
                return c25016e.f97890J;
            case 4:
                return c25016e.f97891K;
            default:
                throw new AssertionError(AbstractC25012a.m73367C(i13));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m73405g() {
        HashSet hashSet = this.f97872a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C25015d) it.next()).m73404f().m73406h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m73406h() {
        return this.f97877f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    /* JADX INFO: renamed from: i */
    public final boolean m73407i(C25015d c25015d) {
        if (c25015d != null) {
            C25016e c25016e = c25015d.f97875d;
            int i13 = c25015d.f97876e;
            int i14 = this.f97876e;
            if (i13 != i14) {
                switch (AbstractC12682p.m35485e(i14)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z4 = i13 == 2 || i13 == 4;
                        if (!(c25016e instanceof C25020i)) {
                            return z4;
                        }
                        if (z4 || i13 == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z13 = i13 == 3 || i13 == 5;
                        if (!(c25016e instanceof C25020i)) {
                            return z13;
                        }
                        if (z13 || i13 == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i13 != 2 && i13 != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i13 != 6 && i13 != 8 && i13 != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC25012a.m73367C(i14));
                }
            } else if (i14 != 6 || (c25016e.f97886F && this.f97875d.f97886F)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m73408j() {
        HashSet hashSet;
        C25015d c25015d = this.f97877f;
        if (c25015d != null && (hashSet = c25015d.f97872a) != null) {
            hashSet.remove(this);
            if (this.f97877f.f97872a.size() == 0) {
                this.f97877f.f97872a = null;
            }
        }
        this.f97872a = null;
        this.f97877f = null;
        this.f97878g = 0;
        this.f97879h = Integer.MIN_VALUE;
        this.f97874c = false;
        this.f97873b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m73409k() {
        C14054f c14054f = this.f97880i;
        if (c14054f == null) {
            this.f97880i = new C14054f(1);
        } else {
            c14054f.m40018c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m73410l(int i13) {
        this.f97873b = i13;
        this.f97874c = true;
    }

    public final String toString() {
        return this.f97875d.f97924i0 + ":" + AbstractC25012a.m73367C(this.f97876e);
    }
}
