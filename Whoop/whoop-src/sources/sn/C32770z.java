package sn;

import androidx.fragment.app.RunnableC1283d;
import bv.RunnableC3666a;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p031b9.RunnableC2874x0;
import p299l9.C23537y;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;

/* JADX INFO: renamed from: sn.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C32770z {

    /* JADX INFO: renamed from: a */
    public final int f136275a;

    /* JADX INFO: renamed from: b */
    public final C32763v f136276b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f136277c;

    public /* synthetic */ C32770z(CopyOnWriteArrayList copyOnWriteArrayList, int i13, C32763v c32763v) {
        this.f136277c = copyOnWriteArrayList;
        this.f136275a = i13;
        this.f136276b = c32763v;
    }

    /* JADX INFO: renamed from: a */
    public long m102759a(long j7) {
        long jM71669G = AbstractC24567y.m71669G(j7);
        if (jM71669G == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jM71669G;
    }

    /* JADX INFO: renamed from: b */
    public void m102760b(C23537y c23537y) {
        for (C32769y c32769y : this.f136277c) {
            AbstractC24567y.m71665C(c32769y.f136273a, new RunnableC1283d(this, c32769y.f136274b, c23537y, 21));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m102761c(C32745m c32745m, int i13, int i14, C31521c0 c31521c0, int i15, Object obj, long j7, long j13) {
        m102762d(c32745m, new C23537y(i13, i14, c31521c0, i15, obj, m102759a(j7), m102759a(j13)));
    }

    /* JADX INFO: renamed from: d */
    public void m102762d(C32745m c32745m, C23537y c23537y) {
        for (C32769y c32769y : this.f136277c) {
            AbstractC24567y.m71665C(c32769y.f136273a, new RunnableC32767x(this, c32769y.f136274b, c32745m, c23537y, 2));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m102763e(C32745m c32745m, int i13, int i14, C31521c0 c31521c0, int i15, Object obj, long j7, long j13) {
        m102764f(c32745m, new C23537y(i13, i14, c31521c0, i15, obj, m102759a(j7), m102759a(j13)));
    }

    /* JADX INFO: renamed from: f */
    public void m102764f(C32745m c32745m, C23537y c23537y) {
        for (C32769y c32769y : this.f136277c) {
            AbstractC24567y.m71665C(c32769y.f136273a, new RunnableC32767x(this, c32769y.f136274b, c32745m, c23537y, 1));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m102765g(C32745m c32745m, int i13, int i14, C31521c0 c31521c0, int i15, Object obj, long j7, long j13, IOException iOException, boolean z4) {
        m102766h(c32745m, new C23537y(i13, i14, c31521c0, i15, obj, m102759a(j7), m102759a(j13)), iOException, z4);
    }

    /* JADX INFO: renamed from: h */
    public void m102766h(C32745m c32745m, C23537y c23537y, IOException iOException, boolean z4) {
        for (C32769y c32769y : this.f136277c) {
            AbstractC24567y.m71665C(c32769y.f136273a, new RunnableC2874x0(this, c32769y.f136274b, c32745m, c23537y, iOException, z4, 1));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m102767i(C32745m c32745m, int i13, int i14, C31521c0 c31521c0, int i15, Object obj, long j7, long j13) {
        m102768j(c32745m, new C23537y(i13, i14, c31521c0, i15, obj, m102759a(j7), m102759a(j13)));
    }

    /* JADX INFO: renamed from: j */
    public void m102768j(C32745m c32745m, C23537y c23537y) {
        for (C32769y c32769y : this.f136277c) {
            AbstractC24567y.m71665C(c32769y.f136273a, new RunnableC32767x(this, c32769y.f136274b, c32745m, c23537y, 0));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m102769k(C23537y c23537y) {
        C32763v c32763v = this.f136276b;
        c32763v.getClass();
        for (C32769y c32769y : this.f136277c) {
            AbstractC24567y.m71665C(c32769y.f136273a, new RunnableC3666a(this, c32769y.f136274b, c32763v, c23537y, 4));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32770z(int i13) {
        this(new CopyOnWriteArrayList(), 0, null);
        switch (i13) {
            case 1:
                this(new CopyOnWriteArrayList(), 0, null);
                break;
            default:
                break;
        }
    }
}
