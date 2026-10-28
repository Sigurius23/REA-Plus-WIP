package z41;

import a51.C0393h;
import b51.InterfaceC2739c;
import p270k2.InterfaceC22131e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z41.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lb51/c;", "Lk2/e;", "drawScope", "La51/h;", "particle", "Ll83/a0;", "a", "(Lb51/c;Lk2/e;La51/h;)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40066a {
    /* JADX INFO: renamed from: a */
    public static final void m128411a(InterfaceC2739c interfaceC2739c, InterfaceC22131e drawScope, C0393h particle) {
        AbstractC22676k.m65750j(interfaceC2739c, "<this>");
        AbstractC22676k.m65750j(drawScope, "drawScope");
        AbstractC22676k.m65750j(particle, "particle");
        float alpha = particle.getAlpha() / 255;
        float scale = particle.getScale();
        float scale2 = particle.getScale();
        float x3 = particle.getLocation().getX();
        float y13 = particle.getLocation().getY();
        if (interfaceC2739c.equals(InterfaceC2739c.a.f10770a)) {
            float f13 = scale / 2;
            InterfaceC22131e.m63379M(drawScope, particle.getColor(), f13, (((long) Float.floatToRawIntBits(x3 + f13)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(y13 + f13))), alpha, null, 112);
            return;
        }
        if (!interfaceC2739c.equals(InterfaceC2739c.b.f10773a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC22131e.m63383i0(drawScope, particle.getColor(), (((long) Float.floatToRawIntBits(x3)) << 32) | (((long) Float.floatToRawIntBits(y13)) & 4294967295L), (((long) Float.floatToRawIntBits(scale2)) & 4294967295L) | (Float.floatToRawIntBits(scale) << 32), alpha, null, 0, 112);
    }
}
