package p241j3;

import p002a0.C0023g0;
import p026b2.AbstractC2316v;
import p530up.AbstractC35148d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: j3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21267d {

    /* JADX INFO: renamed from: a */
    public final int f81200a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2316v f81201b;

    /* JADX INFO: renamed from: c */
    public final AbstractC22680m f81202c;

    /* JADX INFO: renamed from: d */
    public C21267d f81203d;

    /* JADX INFO: renamed from: e */
    public long f81204e;

    /* JADX INFO: renamed from: f */
    public long f81205f;

    /* JADX INFO: renamed from: g */
    public long f81206g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C21268e f81207h;

    /* JADX WARN: Multi-variable type inference failed */
    public C21267d(C21268e c21268e, int i13, AbstractC2316v abstractC2316v, Function1 function1) {
        this.f81207h = c21268e;
        this.f81200a = i13;
        this.f81201b = abstractC2316v;
        this.f81202c = (AbstractC22680m) function1;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: a */
    public final void m59677a(long j7, long j13, long j14, long j15, float[] fArr) {
        C21266c c21266cM111159J = AbstractC35148d.m111159J(j7, j13, j14, j15, this.f81207h.f81213f, this.f81201b, fArr);
        if (c21266cM111159J == null) {
            return;
        }
        this.f81202c.invoke(c21266cM111159J);
    }

    /* JADX INFO: renamed from: b */
    public final void m59678b() {
        C21268e c21268e = this.f81207h;
        C0023g0 c0023g0 = c21268e.f81208a;
        int i13 = this.f81200a;
        C21267d c21267d = (C21267d) c0023g0.m50g(i13);
        if (c21267d != null) {
            if (c21267d.equals(this)) {
                C21267d c21267d2 = this.f81203d;
                this.f81203d = null;
                if (c21267d2 != null) {
                    int iM47d = c0023g0.m47d(i13);
                    Object[] objArr = c0023g0.f150c;
                    Object obj = objArr[iM47d];
                    c0023g0.f149b[iM47d] = i13;
                    objArr[iM47d] = c21267d2;
                    return;
                }
                return;
            }
            int iM47d2 = c0023g0.m47d(i13);
            Object[] objArr2 = c0023g0.f150c;
            Object obj2 = objArr2[iM47d2];
            c0023g0.f149b[iM47d2] = i13;
            objArr2[iM47d2] = c21267d;
            while (true) {
                C21267d c21267d3 = c21267d.f81203d;
                if (c21267d3 == null) {
                    break;
                }
                if (c21267d3 == this) {
                    c21267d.f81203d = this.f81203d;
                    this.f81203d = null;
                    return;
                }
                c21267d = c21267d3;
            }
        }
        C21267d c21267d4 = c21268e.f81209b;
        if (c21267d4 == this) {
            c21268e.f81209b = c21267d4.f81203d;
            this.f81203d = null;
            return;
        }
        C21267d c21267d5 = c21267d4 != null ? c21267d4.f81203d : null;
        while (true) {
            C21267d c21267d6 = c21267d4;
            c21267d4 = c21267d5;
            if (c21267d4 == null) {
                return;
            }
            if (c21267d4 == this) {
                if (c21267d6 != null) {
                    c21267d6.f81203d = c21267d4.f81203d;
                }
                this.f81203d = null;
                return;
            }
            c21267d5 = c21267d4.f81203d;
        }
    }
}
