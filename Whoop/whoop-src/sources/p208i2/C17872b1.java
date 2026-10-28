package p208i2;

import al.AbstractC0954a;
import m83.C25272z;
import p005a3.C0227m1;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0216j2;
import p026b2.AbstractC2316v;
import p027b3.C2442t0;
import p127ev.AbstractC13673n;
import p209i3.InterfaceC18044z;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;

/* JADX INFO: renamed from: i2.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17872b1 extends AbstractC2316v implements InterfaceC0186c0, InterfaceC0216j2 {

    /* JADX INFO: renamed from: O */
    public float f69538O;

    /* JADX INFO: renamed from: P */
    public float f69539P;

    /* JADX INFO: renamed from: Q */
    public float f69540Q;

    /* JADX INFO: renamed from: R */
    public float f69541R;

    /* JADX INFO: renamed from: S */
    public float f69542S;

    /* JADX INFO: renamed from: T */
    public float f69543T;

    /* JADX INFO: renamed from: U */
    public float f69544U;

    /* JADX INFO: renamed from: V */
    public float f69545V;

    /* JADX INFO: renamed from: W */
    public float f69546W;

    /* JADX INFO: renamed from: X */
    public long f69547X;

    /* JADX INFO: renamed from: Y */
    public InterfaceC17869a1 f69548Y;

    /* JADX INFO: renamed from: Z */
    public boolean f69549Z;

    /* JADX INFO: renamed from: a0 */
    public AbstractC0954a f69550a0;

    /* JADX INFO: renamed from: b0 */
    public long f69551b0;

    /* JADX INFO: renamed from: c0 */
    public long f69552c0;

    /* JADX INFO: renamed from: d0 */
    public int f69553d0;

    /* JADX INFO: renamed from: e0 */
    public int f69554e0;

    /* JADX INFO: renamed from: f0 */
    public C0227m1 f69555f0;

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C2442t0(9, abstractC39104j1Mo448T, this));
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: e */
    public final boolean mo543e() {
        return false;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb4.append(this.f69538O);
        sb4.append(", scaleY=");
        sb4.append(this.f69539P);
        sb4.append(", alpha = ");
        sb4.append(this.f69540Q);
        sb4.append(", translationX=");
        sb4.append(this.f69541R);
        sb4.append(", translationY=");
        sb4.append(this.f69542S);
        sb4.append(", shadowElevation=");
        sb4.append(this.f69543T);
        sb4.append(", rotationX=0.0, rotationY=");
        sb4.append(this.f69544U);
        sb4.append(", rotationZ=");
        sb4.append(this.f69545V);
        sb4.append(", cameraDistance=");
        sb4.append(this.f69546W);
        sb4.append(", transformOrigin=");
        sb4.append((Object) C17881e1.m51439d(this.f69547X));
        sb4.append(", shape=");
        sb4.append(this.f69548Y);
        sb4.append(", clip=");
        sb4.append(this.f69549Z);
        sb4.append(", renderEffect=");
        sb4.append(this.f69550a0);
        sb4.append(", ambientShadowColor=");
        AbstractC13673n.m38574u(this.f69551b0, ", spotShadowColor=", sb4);
        AbstractC13673n.m38574u(this.f69552c0, ", compositingStrategy=", sb4);
        sb4.append((Object) C17877d0.m51434a(this.f69553d0));
        sb4.append(", blendMode=");
        sb4.append((Object) C17901o.m51482a(this.f69554e0));
        sb4.append(", colorFilter=null)");
        return sb4.toString();
    }
}
