package io;

import p309lo.AbstractC24567y;
import p465rm.C31534g1;
import p465rm.C31564q1;

/* JADX INFO: renamed from: io.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C20712x {

    /* JADX INFO: renamed from: a */
    public final int f77581a;

    /* JADX INFO: renamed from: b */
    public final C31534g1[] f77582b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20035o[] f77583c;

    /* JADX INFO: renamed from: d */
    public final C31564q1 f77584d;

    /* JADX INFO: renamed from: e */
    public final Object f77585e;

    public C20712x(C31534g1[] c31534g1Arr, InterfaceC20035o[] interfaceC20035oArr, C31564q1 c31564q1, C20037q c20037q) {
        this.f77582b = c31534g1Arr;
        this.f77583c = (InterfaceC20035o[]) interfaceC20035oArr.clone();
        this.f77584d = c31564q1;
        this.f77585e = c20037q;
        this.f77581a = c31534g1Arr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56900a(C20712x c20712x, int i13) {
        return c20712x != null && AbstractC24567y.m71670a(this.f77582b[i13], c20712x.f77582b[i13]) && AbstractC24567y.m71670a(this.f77583c[i13], c20712x.f77583c[i13]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56901b(int i13) {
        return this.f77582b[i13] != null;
    }
}
