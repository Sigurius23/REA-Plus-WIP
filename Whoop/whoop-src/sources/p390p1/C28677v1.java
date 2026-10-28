package p390p1;

import c93.InterfaceC4351m;
import p002a0.C0039m0;
import p002a0.C0057v0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28677v1 {

    /* JADX INFO: renamed from: a */
    public C28679w f115979a;

    /* JADX INFO: renamed from: b */
    public int f115980b;

    /* JADX INFO: renamed from: c */
    public C28591a f115981c;

    /* JADX INFO: renamed from: d */
    public InterfaceC4351m f115982d;

    /* JADX INFO: renamed from: e */
    public int f115983e;

    /* JADX INFO: renamed from: f */
    public C0039m0 f115984f;

    /* JADX INFO: renamed from: g */
    public C0057v0 f115985g;

    public C28677v1(C28679w c28679w) {
        this.f115979a = c28679w;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87200a(C28612f0 c28612f0, C0057v0 c0057v0) {
        AbstractC22676k.m65748h(c28612f0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        InterfaceC28650o2 interfaceC28650o2 = c28612f0.f115754y;
        if (interfaceC28650o2 == null) {
            interfaceC28650o2 = C28676v0.f115974F;
        }
        return !interfaceC28650o2.mo87112a(c28612f0.m87013y().f115735f, c0057v0.m129g(c28612f0));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m87201b() {
        if (this.f115979a != null) {
            C28591a c28591a = this.f115981c;
            if (c28591a != null ? c28591a.m86976a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC28652p0 m87202c(Object obj) {
        EnumC28652p0 enumC28652p0M87224r;
        C28679w c28679w = this.f115979a;
        return (c28679w == null || (enumC28652p0M87224r = c28679w.m87224r(this, obj)) == null) ? EnumC28652p0.f115879w : enumC28652p0M87224r;
    }

    /* JADX INFO: renamed from: d */
    public final void m87203d() {
        C28679w c28679w = this.f115979a;
        if (c28679w != null) {
            c28679w.f115997O = true;
            c28679w.f116002T.m11153A();
        }
        this.f115979a = null;
        this.f115984f = null;
        this.f115985g = null;
        this.f115982d = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m87204e(boolean z4) {
        int i13 = this.f115980b;
        this.f115980b = z4 ? i13 | 32 : i13 & (-33);
    }

    /* JADX INFO: renamed from: f */
    public final void m87205f(InterfaceC4351m interfaceC4351m) {
        this.f115982d = interfaceC4351m;
    }
}
