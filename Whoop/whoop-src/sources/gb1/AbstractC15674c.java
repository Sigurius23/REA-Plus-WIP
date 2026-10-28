package gb1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import b01.C2190k;
import c93.InterfaceC4339a;
import ga1.C15620a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23465k;
import p005a3.C0238p0;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gb1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a+\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Ly3/f;", "fadeHeight", "Lkotlin/Function0;", "", "fadeProgress", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;FLc93/a;)Landroidx/compose/ui/Modifier;", "e", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "l", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15674c {
    /* JADX INFO: renamed from: e */
    public static final Modifier m44081e(Modifier fadeBottomEdge, float f13) {
        AbstractC22676k.m65750j(fadeBottomEdge, "$this$fadeBottomEdge");
        return AbstractC1125a.m3480c(AbstractC1127a.m3488c(fadeBottomEdge, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751), new C2190k(f13, 3));
    }

    /* JADX INFO: renamed from: f */
    public static Modifier m44082f(Modifier modifier, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 16;
        }
        return m44081e(modifier, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m44083g(float f13, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C22128b c22128b = c0238p0.f815w;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L));
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (fIntBitsToFloat <= 0.0f) {
            return c23454a0;
        }
        float fMo743q0 = c0238p0.mo743q0(f13) / Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L));
        if (fMo743q0 > 0.5f) {
            fMo743q0 = 0.5f;
        }
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(1.0f - fMo743q0), new C17919x(C17919x.f69625b)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return c23454a0;
    }

    /* JADX INFO: renamed from: h */
    public static final Modifier m44084h(Modifier fadeTopEdge, float f13, InterfaceC4339a fadeProgress) {
        AbstractC22676k.m65750j(fadeTopEdge, "$this$fadeTopEdge");
        AbstractC22676k.m65750j(fadeProgress, "fadeProgress");
        return AbstractC1125a.m3480c(AbstractC1127a.m3488c(fadeTopEdge, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751), new C15672b(f13, 0, fadeProgress));
    }

    /* JADX INFO: renamed from: i */
    public static Modifier m44085i(Modifier modifier, float f13, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 16;
        }
        if ((i13 & 2) != 0) {
            interfaceC4339a = new C15620a(3);
        }
        return m44084h(modifier, f13, interfaceC4339a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final float m44086j() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m44087k(InterfaceC4339a interfaceC4339a, float f13, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C22128b c22128b = c0238p0.f815w;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L));
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (fIntBitsToFloat > 0.0f) {
            float fFloatValue = ((Number) interfaceC4339a.invoke()).floatValue();
            if (fFloatValue > 0.0f) {
                float fMo743q0 = c0238p0.mo743q0(f13) / Float.intBitsToFloat((int) (4294967295L & c22128b.mo731d()));
                if (fMo743q0 > 0.5f) {
                    fMo743q0 = 0.5f;
                }
                C17909s c17909s = AbstractC17911t.f69612b;
                Float fValueOf = Float.valueOf(0.0f);
                long j7 = C17919x.f69625b;
                InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(C17919x.m51541c(1.0f - fFloatValue, j7))), new C23465k(Float.valueOf(fMo743q0), new C17919x(j7))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
                return c23454a0;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: l */
    public static final Modifier m44088l(Modifier fadeVerticalEdges, float f13) {
        AbstractC22676k.m65750j(fadeVerticalEdges, "$this$fadeVerticalEdges");
        return AbstractC1125a.m3480c(AbstractC1127a.m3488c(fadeVerticalEdges, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751), new C2190k(f13, 2));
    }

    /* JADX INFO: renamed from: m */
    public static Modifier m44089m(Modifier modifier, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 16;
        }
        return m44088l(modifier, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m44090n(float f13, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C22128b c22128b = c0238p0.f815w;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L));
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (fIntBitsToFloat <= 0.0f) {
            return c23454a0;
        }
        float fMo743q0 = c0238p0.mo743q0(f13) / Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L));
        if (fMo743q0 > 0.5f) {
            fMo743q0 = 0.5f;
        }
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        long j7 = C17919x.f69636m;
        C23465k c23465k = new C23465k(fValueOf, new C17919x(j7));
        Float fValueOf2 = Float.valueOf(fMo743q0);
        long j13 = C17919x.f69625b;
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(c17909s, new C23465k[]{c23465k, new C23465k(fValueOf2, new C17919x(j13)), new C23465k(Float.valueOf(1.0f - fMo743q0), new C17919x(j13)), new C23465k(Float.valueOf(1.0f), new C17919x(j7))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return c23454a0;
    }
}
