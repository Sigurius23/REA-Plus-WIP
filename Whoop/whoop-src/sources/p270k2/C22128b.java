package p270k2;

import android.graphics.Paint;
import java.util.ArrayList;
import p005a3.C0237p;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17921y;
import p208i2.C17885g;
import p208i2.C17887h;
import p208i2.C17903p;
import p208i2.C17919x;
import p208i2.InterfaceC17906q0;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17912t0;
import p208i2.InterfaceC17915v;
import p636y3.EnumC39181m;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C22128b implements InterfaceC22131e {

    /* JADX INFO: renamed from: w */
    public final C22127a f85851w;

    /* JADX INFO: renamed from: x */
    public final C0237p f85852x;

    /* JADX INFO: renamed from: y */
    public C17887h f85853y;

    /* JADX INFO: renamed from: z */
    public C17887h f85854z;

    public C22128b() {
        EnumC39181m enumC39181m = EnumC39181m.f168423w;
        C22127a c22127a = new C22127a();
        c22127a.f85847a = AbstractC22130d.f85855a;
        c22127a.f85848b = enumC39181m;
        c22127a.f85849c = C22133g.f85856a;
        c22127a.f85850d = 0L;
        this.f85851w = c22127a;
        this.f85852x = new C0237p(this);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC17906q0 m63368a(C22128b c22128b, long j7, AbstractC22132f abstractC22132f, float f13, AbstractC17921y abstractC17921y, int i13) {
        InterfaceC17906q0 interfaceC17906q0M63372f = c22128b.m63372f(abstractC22132f);
        if (f13 != 1.0f) {
            j7 = C17919x.m51541c(C17919x.m51543e(j7) * f13, j7);
        }
        C17887h c17887h = (C17887h) interfaceC17906q0M63372f;
        Paint paint = c17887h.f69578a;
        if (!C17919x.m51542d(AbstractC17918w0.m51515c(paint.getColor()), j7)) {
            c17887h.m51447e(j7);
        }
        if (c17887h.f69580c != null) {
            c17887h.m51451i(null);
        }
        if (!AbstractC22676k.m65745e(c17887h.f69581d, abstractC17921y)) {
            c17887h.m51448f(abstractC17921y);
        }
        if (c17887h.f69579b != i13) {
            c17887h.m51446d(i13);
        }
        if (paint.isFilterBitmap()) {
            return interfaceC17906q0M63372f;
        }
        c17887h.m51449g(1);
        return interfaceC17906q0M63372f;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC17906q0 m63369c(C22128b c22128b, long j7, float f13, int i13, InterfaceC17912t0 interfaceC17912t0) {
        C17887h c17887hM51522j = c22128b.f85854z;
        if (c17887hM51522j == null) {
            c17887hM51522j = AbstractC17918w0.m51522j();
            c17887hM51522j.m51455m(1);
            c22128b.f85854z = c17887hM51522j;
        }
        Paint paint = c17887hM51522j.f69578a;
        if (!C17919x.m51542d(AbstractC17918w0.m51515c(paint.getColor()), j7)) {
            c17887hM51522j.m51447e(j7);
        }
        if (c17887hM51522j.f69580c != null) {
            c17887hM51522j.m51451i(null);
        }
        if (!AbstractC22676k.m65745e(c17887hM51522j.f69581d, null)) {
            c17887hM51522j.m51448f(null);
        }
        if (c17887hM51522j.f69579b != 3) {
            c17887hM51522j.m51446d(3);
        }
        if (paint.getStrokeWidth() != f13) {
            c17887hM51522j.m51454l(f13);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c17887hM51522j.m51443a() != i13) {
            c17887hM51522j.m51452j(i13);
        }
        if (c17887hM51522j.m51444b() != 0) {
            c17887hM51522j.m51453k(0);
        }
        if (!AbstractC22676k.m65745e(c17887hM51522j.f69582e, interfaceC17912t0)) {
            c17887hM51522j.m51450h(interfaceC17912t0);
        }
        if (paint.isFilterBitmap()) {
            return c17887hM51522j;
        }
        c17887hM51522j.m51449g(1);
        return c17887hM51522j;
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: B */
    public final void mo720B(InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, float f13, AbstractC22132f abstractC22132f, int i13) {
        this.f85851w.f85849c.mo51429t(interfaceC17910s0, m63370b(abstractC17911t, abstractC22132f, f13, null, i13, 1));
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: E0 */
    public final void mo723E0(InterfaceC17910s0 interfaceC17910s0, long j7, float f13, AbstractC22132f abstractC22132f) {
        this.f85851w.f85849c.mo51429t(interfaceC17910s0, m63368a(this, j7, abstractC22132f, f13, null, 3));
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: I */
    public final void mo725I(C17885g c17885g, long j7, long j13, long j14, float f13, AbstractC17921y abstractC17921y, int i13) {
        this.f85851w.f85849c.mo51413c(c17885g, j7, j13, j14, m63370b(null, C22134h.f85857a, f13, abstractC17921y, 3, i13));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: R */
    public final void mo727R(AbstractC17911t abstractC17911t, long j7, long j13, float f13, InterfaceC17912t0 interfaceC17912t0, float f14) {
        InterfaceC17915v interfaceC17915v = this.f85851w.f85849c;
        C17887h c17887hM51522j = this.f85854z;
        if (c17887hM51522j == null) {
            c17887hM51522j = AbstractC17918w0.m51522j();
            c17887hM51522j.m51455m(1);
            this.f85854z = c17887hM51522j;
        }
        Paint paint = c17887hM51522j.f69578a;
        if (abstractC17911t != null) {
            abstractC17911t.mo51432a(mo731d(), c17887hM51522j, f14);
        } else if (paint.getAlpha() / 255.0f != f14) {
            c17887hM51522j.m51445c(f14);
        }
        if (!AbstractC22676k.m65745e(c17887hM51522j.f69581d, null)) {
            c17887hM51522j.m51448f(null);
        }
        if (c17887hM51522j.f69579b != 3) {
            c17887hM51522j.m51446d(3);
        }
        if (paint.getStrokeWidth() != f13) {
            c17887hM51522j.m51454l(f13);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c17887hM51522j.m51443a() != 0) {
            c17887hM51522j.m51452j(0);
        }
        if (c17887hM51522j.m51444b() != 0) {
            c17887hM51522j.m51453k(0);
        }
        if (!AbstractC22676k.m65745e(c17887hM51522j.f69582e, interfaceC17912t0)) {
            c17887hM51522j.m51450h(interfaceC17912t0);
        }
        if (!paint.isFilterBitmap()) {
            c17887hM51522j.m51449g(1);
        }
        interfaceC17915v.mo51420k(j7, j13, c17887hM51522j);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: a0 */
    public final void mo729a0(AbstractC17911t abstractC17911t, long j7, long j13, float f13, AbstractC22132f abstractC22132f, int i13) {
        int i14 = (int) (j7 >> 32);
        int i15 = (int) (j7 & 4294967295L);
        this.f85851w.f85849c.mo51412b(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (4294967295L & j13)) + Float.intBitsToFloat(i15), m63370b(abstractC17911t, abstractC22132f, f13, null, i13, 1));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC17906q0 m63370b(AbstractC17911t abstractC17911t, AbstractC22132f abstractC22132f, float f13, AbstractC17921y abstractC17921y, int i13, int i14) {
        InterfaceC17906q0 interfaceC17906q0M63372f = m63372f(abstractC22132f);
        if (abstractC17911t != null) {
            abstractC17911t.mo51432a(mo731d(), interfaceC17906q0M63372f, f13);
        } else {
            C17887h c17887h = (C17887h) interfaceC17906q0M63372f;
            Paint paint = c17887h.f69578a;
            if (c17887h.f69580c != null) {
                c17887h.m51451i(null);
            }
            long jM51515c = AbstractC17918w0.m51515c(paint.getColor());
            long j7 = C17919x.f69625b;
            if (!C17919x.m51542d(jM51515c, j7)) {
                c17887h.m51447e(j7);
            }
            if (paint.getAlpha() / 255.0f != f13) {
                c17887h.m51445c(f13);
            }
        }
        C17887h c17887h2 = (C17887h) interfaceC17906q0M63372f;
        if (!AbstractC22676k.m65745e(c17887h2.f69581d, abstractC17921y)) {
            c17887h2.m51448f(abstractC17921y);
        }
        if (c17887h2.f69579b != i13) {
            c17887h2.m51446d(i13);
        }
        if (c17887h2.f69578a.isFilterBitmap() == i14) {
            return interfaceC17906q0M63372f;
        }
        c17887h2.m51449g(i14);
        return interfaceC17906q0M63372f;
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: d0 */
    public final void mo732d0(long j7, long j13, long j14, float f13, int i13, InterfaceC17912t0 interfaceC17912t0) {
        this.f85851w.f85849c.mo51420k(j13, j14, m63369c(this, j7, f13, i13, interfaceC17912t0));
    }

    /* JADX INFO: renamed from: e */
    public final void m63371e(C17885g c17885g, C17903p c17903p) {
        this.f85851w.f85849c.mo51414d(c17885g, m63370b(null, C22134h.f85857a, 1.0f, c17903p, 3, 1));
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC17906q0 m63372f(AbstractC22132f abstractC22132f) {
        if (AbstractC22676k.m65745e(abstractC22132f, C22134h.f85857a)) {
            C17887h c17887h = this.f85853y;
            if (c17887h != null) {
                return c17887h;
            }
            C17887h c17887hM51522j = AbstractC17918w0.m51522j();
            c17887hM51522j.m51455m(0);
            this.f85853y = c17887hM51522j;
            return c17887hM51522j;
        }
        if (!(abstractC22132f instanceof C22135i)) {
            throw new NoWhenBranchMatchedException();
        }
        C17887h c17887hM51522j2 = this.f85854z;
        if (c17887hM51522j2 == null) {
            c17887hM51522j2 = AbstractC17918w0.m51522j();
            c17887hM51522j2.m51455m(1);
            this.f85854z = c17887hM51522j2;
        }
        Paint paint = c17887hM51522j2.f69578a;
        float strokeWidth = paint.getStrokeWidth();
        C22135i c22135i = (C22135i) abstractC22132f;
        InterfaceC17912t0 interfaceC17912t0 = c22135i.f85862e;
        float f13 = c22135i.f85858a;
        if (strokeWidth != f13) {
            c17887hM51522j2.m51454l(f13);
        }
        int iM51443a = c17887hM51522j2.m51443a();
        int i13 = c22135i.f85860c;
        if (iM51443a != i13) {
            c17887hM51522j2.m51452j(i13);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f14 = c22135i.f85859b;
        if (strokeMiter != f14) {
            paint.setStrokeMiter(f14);
        }
        int iM51444b = c17887hM51522j2.m51444b();
        int i14 = c22135i.f85861d;
        if (iM51444b != i14) {
            c17887hM51522j2.m51453k(i14);
        }
        if (!AbstractC22676k.m65745e(c17887hM51522j2.f69582e, interfaceC17912t0)) {
            c17887hM51522j2.m51450h(interfaceC17912t0);
        }
        return c17887hM51522j2;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f85851w.f85847a.getDensity();
    }

    @Override // p270k2.InterfaceC22131e
    public final EnumC39181m getLayoutDirection() {
        return this.f85851w.f85848b;
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: k0 */
    public final void mo737k0(long j7, float f13, float f14, long j13, long j14, float f15, AbstractC22132f abstractC22132f) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        this.f85851w.f85849c.mo51430u(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i14), f13, f14, false, m63368a(this, j7, abstractC22132f, f15, null, 3));
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: m */
    public final void mo739m(AbstractC17911t abstractC17911t, long j7, long j13, long j14, float f13, AbstractC22132f abstractC22132f) {
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        this.f85851w.f85849c.mo51424o(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)), m63370b(abstractC17911t, abstractC22132f, f13, null, 3, 1));
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f85851w.f85847a.getFontScale();
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: n0 */
    public final void mo741n0(long j7, long j13, long j14, float f13, AbstractC17921y abstractC17921y, int i13) {
        int i14 = (int) (j13 >> 32);
        int i15 = (int) (j13 & 4294967295L);
        this.f85851w.f85849c.mo51412b(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i15), m63368a(this, j7, C22134h.f85857a, f13, abstractC17921y, i13));
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: t0 */
    public final C0237p mo744t0() {
        return this.f85852x;
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: u0 */
    public final void mo745u0(long j7, float f13, long j13, float f14, AbstractC22132f abstractC22132f) {
        this.f85851w.f85849c.mo51421l(j13, m63368a(this, j7, abstractC22132f, f14, null, 3), f13);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: w */
    public final void mo746w(AbstractC17911t abstractC17911t, float f13, float f14, boolean z4, long j7, long j13, AbstractC22132f abstractC22132f, int i13) {
        int i14 = (int) (j7 >> 32);
        int i15 = (int) (j7 & 4294967295L);
        this.f85851w.f85849c.mo51430u(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat(i15), f13, f14, z4, m63370b(abstractC17911t, abstractC22132f, 1.0f, null, i13, 1));
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: x */
    public final void mo747x(AbstractC17911t abstractC17911t, float f13, long j7, float f14, AbstractC22132f abstractC22132f) {
        this.f85851w.f85849c.mo51421l(j7, m63370b(abstractC17911t, abstractC22132f, f14, null, 3, 1), f13);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: y0 */
    public final void mo748y0(ArrayList arrayList, long j7, float f13) {
        this.f85851w.f85849c.mo51422m(arrayList, m63369c(this, j7, f13, 1, null));
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: z0 */
    public final void mo749z0(long j7, long j13, long j14, long j15, AbstractC22132f abstractC22132f, float f13, int i13) {
        int i14 = (int) (j13 >> 32);
        int i15 = (int) (j13 & 4294967295L);
        this.f85851w.f85849c.mo51424o(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)), m63368a(this, j7, abstractC22132f, f13, null, i13));
    }
}
