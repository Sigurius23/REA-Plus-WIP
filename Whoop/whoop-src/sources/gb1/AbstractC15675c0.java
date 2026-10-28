package gb1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import eg2.C13168a;
import java.util.List;
import l83.C23454a0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11365j0;
import p077d0.EnumC11408v0;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gb1.c0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "", "active", "c", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "Li2/x;", "a", "J", "shimmerBase", "", "b", "Ljava/util/List;", "shimmerColors", "", NotificationCompat.CATEGORY_PROGRESS, "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15675c0 {

    /* JADX INFO: renamed from: a */
    private static final long f58850a = AbstractC17918w0.m51515c(654311423);

    /* JADX INFO: renamed from: b */
    private static final List<C17919x> f58851b;

    static {
        long j7 = C17919x.f69629f;
        f58851b = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, j7)), new C17919x(C17919x.m51541c(0.15f, j7)), new C17919x(C17919x.m51541c(0.0f, j7)));
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m44093c(Modifier modifier, boolean z4) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return !z4 ? modifier : AbstractC37056f.m118997u(modifier, new C13168a(27));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Modifier m44094d(Modifier modifier, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return m44093c(modifier, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Modifier m44095e(Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-2059018017);
        C11365j0 c11365j0M30559g = AbstractC11348f.m30559g(AbstractC11348f.m30571s("whoopShimmer", c28655q, 0), 0.0f, 1.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1500, 0, AbstractC11333b0.f36312c, 2), EnumC11408v0.f36577w, 4), "whoopShimmerProgress", c28655q, 29112, 0);
        boolean zM87153g = c28655q.m87153g(c11365j0M30559g);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C15685m(c11365j0M30559g, 3);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM3478a = AbstractC1125a.m3478a(composed, (Function1) objM87133R);
        c28655q.m87173q(false);
        return modifierM3478a;
    }

    /* JADX INFO: renamed from: f */
    private static final float m44096f(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m44097g(InterfaceC28670t2 interfaceC28670t2, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63383i0(drawBehind, f58850a, 0L, drawBehind.mo731d(), 0.0f, null, 0, 122);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)) + Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32));
        float f13 = 0.3f * fIntBitsToFloat;
        float fM44096f = (((2 * f13) + fIntBitsToFloat) * m44096f(interfaceC28670t2)) + (-f13);
        float f14 = fM44096f - f13;
        float f15 = fM44096f + f13;
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51486d(AbstractC17911t.f69612b, f58851b, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), 8), 0L, drawBehind.mo731d(), 0.0f, null, 0, 122);
        return C23454a0.f92919a;
    }
}
