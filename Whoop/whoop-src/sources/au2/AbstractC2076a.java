package au2;

import android.graphics.Path;
import android.graphics.RectF;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: au2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m65681d2 = {"Lk2/e;", "Ll83/a0;", "c", "(Lk2/e;)V", "b", "a", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2076a {
    /* JADX INFO: renamed from: a */
    public static final void m6561a(InterfaceC22131e interfaceC22131e) {
        AbstractC22676k.m65750j(interfaceC22131e, "<this>");
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L));
        Path path = c17891jM51478a.f69587a;
        c17891jM51478a.m51464k();
        c17891jM51478a.m51462i(0.0f, 52.0f);
        float f13 = 2;
        float f14 = f13 * 32.0f;
        float f15 = f14 + 20.0f;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF);
        rectF.set(0.0f, 20.0f, f14, f15);
        RectF rectF2 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF2);
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        float f16 = fIntBitsToFloat / f13;
        float f17 = 40.0f / f13;
        float f18 = f16 - f17;
        c17891jM51478a.m51461h(f18, 20.0f);
        c17891jM51478a.m51461h(f16, 0.0f);
        float f19 = f17 + f16;
        c17891jM51478a.m51461h(f19, 20.0f);
        c17891jM51478a.m51461h(fIntBitsToFloat - 32.0f, 20.0f);
        float f24 = fIntBitsToFloat - f14;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF3 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF3);
        rectF3.set(f24, 20.0f, fIntBitsToFloat, f15);
        RectF rectF4 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF4);
        path.arcTo(rectF4, 270.0f, 90.0f, false);
        c17891jM51478a.m51461h(fIntBitsToFloat, fIntBitsToFloat2 - 32.0f);
        float f25 = fIntBitsToFloat2 - f14;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF5 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF5);
        rectF5.set(f24, f25, fIntBitsToFloat, fIntBitsToFloat2);
        RectF rectF6 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF6);
        path.arcTo(rectF6, 0.0f, 90.0f, false);
        c17891jM51478a.m51461h(32.0f, fIntBitsToFloat2);
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF7 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF7);
        rectF7.set(0.0f, f25, f14, fIntBitsToFloat2);
        RectF rectF8 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF8);
        path.arcTo(rectF8, 90.0f, 90.0f, false);
        c17891jM51478a.m51459f();
        C17891j c17891jM51478a2 = AbstractC17897m.m51478a();
        c17891jM51478a2.m51462i(f18, 20.0f);
        c17891jM51478a2.m51461h(f16, 0.0f);
        c17891jM51478a2.m51461h(f19, 20.0f);
        c17891jM51478a2.m51459f();
        InterfaceC22131e.m63386z(interfaceC22131e, c17891jM51478a2, AbstractC17918w0.m51515c(452984831), 0.0f, null, 60);
        InterfaceC22131e.m63378L(interfaceC22131e, c17891jM51478a, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(452984831)), new C17919x(AbstractC17918w0.m51515c(234881023)), new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(AbstractC17918w0.m51515c(16777215))), 0.0f, 0.0f, 14), 0.0f, new C22135i(interfaceC22131e.mo743q0(1), 0.0f, 0, 0, null, 30), 52);
    }

    /* JADX INFO: renamed from: b */
    public static final void m6562b(InterfaceC22131e interfaceC22131e) {
        AbstractC22676k.m65750j(interfaceC22131e, "<this>");
        float fMo743q0 = interfaceC22131e.mo743q0(12);
        C17894k0 c17894k0M51493k = C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(452984831)), new C17919x(AbstractC17918w0.m51515c(234881023)), new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(AbstractC17918w0.m51515c(16777215))), 0.0f, 0.0f, 14);
        long jM47209a = C16620e.m47209a(0.0f, Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)), interfaceC22131e.mo731d(), 1);
        InterfaceC22131e.m63376J0(interfaceC22131e, c17894k0M51493k, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(20.0f)) & 4294967295L), jM47209a, (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32), 0.0f, null, 240);
    }

    /* JADX INFO: renamed from: c */
    public static final void m6563c(InterfaceC22131e interfaceC22131e) {
        AbstractC22676k.m65750j(interfaceC22131e, "<this>");
        m6562b(interfaceC22131e);
        m6561a(interfaceC22131e);
    }
}
