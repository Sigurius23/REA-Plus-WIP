package p331n2;

import p014aj.C0929d;
import p208i2.AbstractC17921y;
import p208i2.C17887h;
import p270k2.InterfaceC22131e;
import p636y3.EnumC39181m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC26165a {

    /* JADX INFO: renamed from: w */
    public C17887h f103673w;

    /* JADX INFO: renamed from: x */
    public AbstractC17921y f103674x;

    /* JADX INFO: renamed from: y */
    public float f103675y = 1.0f;

    /* JADX INFO: renamed from: z */
    public EnumC39181m f103676z = EnumC39181m.f168423w;

    /* JADX INFO: renamed from: b */
    public abstract void mo3489b(float f13);

    /* JADX INFO: renamed from: e */
    public abstract void mo3490e(AbstractC17921y abstractC17921y);

    /* JADX INFO: renamed from: f */
    public void mo15560f(EnumC39181m enumC39181m) {
    }

    /* JADX INFO: renamed from: g */
    public final void m77712g(InterfaceC22131e interfaceC22131e, long j7, float f13, AbstractC17921y abstractC17921y) {
        if (this.f103675y != f13) {
            mo3489b(f13);
            this.f103675y = f13;
        }
        if (!AbstractC22676k.m65745e(this.f103674x, abstractC17921y)) {
            mo3490e(abstractC17921y);
            this.f103674x = abstractC17921y;
        }
        EnumC39181m layoutDirection = interfaceC22131e.getLayoutDirection();
        if (this.f103676z != layoutDirection) {
            mo15560f(layoutDirection);
            this.f103676z = layoutDirection;
        }
        int i13 = (int) (j7 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) - Float.intBitsToFloat(i13);
        int i14 = (int) (j7 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) - Float.intBitsToFloat(i14);
        ((C0929d) interfaceC22131e.mo744t0().f812x).m2355o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f13 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i13) > 0.0f && Float.intBitsToFloat(i14) > 0.0f) {
                    mo3492i(interfaceC22131e);
                }
            } finally {
                ((C0929d) interfaceC22131e.mo744t0().f812x).m2355o(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract long mo3491h();

    /* JADX INFO: renamed from: i */
    public abstract void mo3492i(InterfaceC22131e interfaceC22131e);
}
