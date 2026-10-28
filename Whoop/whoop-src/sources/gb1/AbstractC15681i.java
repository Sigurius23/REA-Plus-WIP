package gb1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ge3.AbstractC15751g;
import l83.C23465k;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: gb1.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Li2/t;", "b", "(Landroidx/compose/runtime/Composer;I)Li2/t;", "Landroidx/compose/ui/Modifier;", "Li2/a1;", "shape", "Ly3/f;", "width", "a", "(Landroidx/compose/ui/Modifier;Li2/a1;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15681i {
    /* JADX INFO: renamed from: a */
    public static final Modifier m44113a(Modifier floatingElementBorder, InterfaceC17869a1 shape, float f13, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(floatingElementBorder, "$this$floatingElementBorder");
        AbstractC22676k.m65750j(shape, "shape");
        if ((i14 & 2) != 0) {
            f13 = 1;
        }
        return AbstractC15751g.m44456i(f13, floatingElementBorder, m44114b(composer, 0), shape);
    }

    /* JADX INFO: renamed from: b */
    private static final AbstractC17911t m44114b(Composer composer, int i13) {
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        C38072d c38072d = C38072d.f163053a;
        return C17909s.m51490h(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(c38072d.m121949b(composer, 6).getWhite10())), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d.m121949b(composer, 6).getWhite5())), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}, 0L, 0.0f, 14);
    }
}
