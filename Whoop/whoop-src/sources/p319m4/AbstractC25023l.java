package p319m4;

import p333n4.C26246b;
import p333n4.InterfaceC26247c;

/* JADX INFO: renamed from: m4.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25023l extends AbstractC25021j {

    /* JADX INFO: renamed from: t0 */
    public int f98028t0 = 0;

    /* JADX INFO: renamed from: u0 */
    public int f98029u0 = 0;

    /* JADX INFO: renamed from: v0 */
    public int f98030v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public int f98031w0 = 0;

    /* JADX INFO: renamed from: x0 */
    public int f98032x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public int f98033y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public boolean f98034z0 = false;

    /* JADX INFO: renamed from: A0 */
    public int f98024A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f98025B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public final C26246b f98026C0 = new C26246b();

    /* JADX INFO: renamed from: D0 */
    public InterfaceC26247c f98027D0 = null;

    @Override // p319m4.AbstractC25021j
    /* JADX INFO: renamed from: X */
    public final void mo73474X() {
        for (int i13 = 0; i13 < this.f98022s0; i13++) {
            C25016e c25016e = this.f98021r0[i13];
            if (c25016e != null) {
                c25016e.f97887G = true;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public abstract void mo67542Y(int i13, int i14, int i15, int i16);

    /* JADX INFO: renamed from: Z */
    public final void m73478Z(int i13, int i14, int i15, int i16, C25016e c25016e) {
        InterfaceC26247c interfaceC26247c;
        C25017f c25017f;
        while (true) {
            interfaceC26247c = this.f98027D0;
            if (interfaceC26247c != null || (c25017f = this.f97901U) == null) {
                break;
            } else {
                this.f98027D0 = c25017f.f97967v0;
            }
        }
        C26246b c26246b = this.f98026C0;
        c26246b.f104359a = i13;
        c26246b.f104360b = i15;
        c26246b.f104361c = i14;
        c26246b.f104362d = i16;
        interfaceC26247c.mo3624a(c25016e, c26246b);
        c25016e.m73429S(c26246b.f104363e);
        c25016e.m73424N(c26246b.f104364f);
        c25016e.f97886F = c26246b.f104366h;
        c25016e.m73420J(c26246b.f104365g);
    }
}
