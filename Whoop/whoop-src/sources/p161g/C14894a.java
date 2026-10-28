package p161g;

import android.window.BackEvent;
import p027b3.AbstractC2378g1;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14894a {

    /* JADX INFO: renamed from: a */
    public final float f55562a;

    /* JADX INFO: renamed from: b */
    public final float f55563b;

    /* JADX INFO: renamed from: c */
    public final float f55564c;

    /* JADX INFO: renamed from: d */
    public final int f55565d;

    public C14894a(BackEvent backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
        float fM7324L = AbstractC2378g1.m7324L(backEvent);
        float fM7325M = AbstractC2378g1.m7325M(backEvent);
        float fM7341p = AbstractC2378g1.m7341p(backEvent);
        int iM7347v = AbstractC2378g1.m7347v(backEvent);
        this.f55562a = fM7324L;
        this.f55563b = fM7325M;
        this.f55564c = fM7341p;
        this.f55565d = iM7347v;
    }

    /* JADX INFO: renamed from: a */
    public final float m42995a() {
        return this.f55564c;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BackEventCompat{touchX=");
        sb4.append(this.f55562a);
        sb4.append(", touchY=");
        sb4.append(this.f55563b);
        sb4.append(", progress=");
        sb4.append(this.f55564c);
        sb4.append(", swipeEdge=");
        return AbstractC11895b.m31999r(sb4, this.f55565d, '}');
    }
}
