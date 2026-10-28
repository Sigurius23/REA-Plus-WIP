package p635y2;

import e93.AbstractC12889b;
import p293l2.C23226c;
import p636y3.C39169a;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.j1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39104j1 {

    /* JADX INFO: renamed from: w */
    public int f168211w;

    /* JADX INFO: renamed from: x */
    public int f168212x;

    /* JADX INFO: renamed from: y */
    public long f168213y;

    /* JADX INFO: renamed from: z */
    public long f168214z = AbstractC39110l1.f168221a;

    /* JADX INFO: renamed from: E */
    public long f168210E = 0;

    public AbstractC39104j1() {
        long j7 = 0;
        this.f168213y = (j7 & 4294967295L) | (j7 << 32);
    }

    /* JADX INFO: renamed from: c0 */
    public abstract int mo450c0(AbstractC39071a abstractC39071a);

    /* JADX INFO: renamed from: g0 */
    public int mo451g0() {
        return (int) (this.f168213y & 4294967295L);
    }

    /* JADX INFO: renamed from: j0 */
    public int mo452j0() {
        return (int) (this.f168213y >> 32);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m124634l0() {
        this.f168211w = AbstractC12889b.m36284n((int) (this.f168213y >> 32), C39169a.m124767k(this.f168214z), C39169a.m124765i(this.f168214z));
        int iM36284n = AbstractC12889b.m36284n((int) (this.f168213y & 4294967295L), C39169a.m124766j(this.f168214z), C39169a.m124764h(this.f168214z));
        this.f168212x = iM36284n;
        int i13 = this.f168211w;
        long j7 = this.f168213y;
        this.f168210E = (((long) ((i13 - ((int) (j7 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM36284n - ((int) (j7 & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: o0 */
    public abstract void mo453o0(long j7, float f13, Function1 function1);

    /* JADX INFO: renamed from: p */
    public Object mo454p() {
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public void mo455p0(long j7, float f13, C23226c c23226c) {
        mo453o0(j7, f13, null);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m124635r0(long j7) {
        if (C39180l.m124799a(this.f168213y, j7)) {
            return;
        }
        this.f168213y = j7;
        m124634l0();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m124636v0(long j7) {
        if (C39169a.m124759c(this.f168214z, j7)) {
            return;
        }
        this.f168214z = j7;
        m124634l0();
    }
}
