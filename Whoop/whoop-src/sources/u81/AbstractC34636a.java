package u81;

import c93.InterfaceC4352n;
import g61.C15529b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t81.C33595a;
import t81.C33612r;

/* JADX INFO: renamed from: u81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062$\u0010\r\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lt81/r;", "state", "", "currentZoom", "", "currentScrollPosition", "Lh2/b;", "doubleTapOffset", "Lkotlin/Function4;", "Lu81/d;", "Lu81/b;", "", "Ll83/a0;", "onDiscreteZoom", "a", "(Lt81/r;FIJLc93/n;)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34636a {
    /* JADX INFO: renamed from: a */
    public static final void m109471a(C33612r state, float f13, int i13, long j7, InterfaceC4352n onDiscreteZoom) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onDiscreteZoom, "onDiscreteZoom");
        C34639d c34639d = new C34639d(f13, C34638c.f145937a.m109474a(f13, state.getZoomToggleState()));
        C15529b startVerticalAxis = state.getPlaneState().getStartVerticalAxis();
        Object c34637b = new C34637b(i13, C33595a.f140188a.m106103a(j7, f13, c34639d.getEnd(), i13, (startVerticalAxis != null ? Float.valueOf(startVerticalAxis.getSize()) : Double.valueOf(0.0d)).doubleValue()));
        Object obj = Boolean.TRUE;
        onDiscreteZoom.invoke(c34639d, c34637b, obj, obj);
    }
}
