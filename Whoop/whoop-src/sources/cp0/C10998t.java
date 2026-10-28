package cp0;

import androidx.compose.foundation.gestures.AbstractC1096a;
import c93.InterfaceC4339a;
import com.whoop.navigation.DrawerPresentation;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Arrays;
import l83.C23454a0;
import p132f0.EnumC13840z0;
import p180h0.C16390g;
import p180h0.C16402i1;
import p180h0.C16435p;
import p180h0.C16475x;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28617g1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: cp0.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0086@¢\u0006\u0004\b \u0010!J0\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0086@¢\u0006\u0004\b%\u0010&J\"\u0010(\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b(\u0010)R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0*8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-R$\u00102\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R+\u00109\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u00105\u001a\u0004\b6\u00103\"\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010;R\u0011\u0010D\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b?\u0010CR\u0011\u0010E\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010CR\u0011\u0010F\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b=\u0010CR\u0011\u0010G\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b:\u0010CR\u0011\u0010I\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bA\u0010H¨\u0006J"}, m65681d2 = {"Lcp0/t;", "", "<init>", "()V", "Ll83/a0;", "l", "", "targetOffset", "j", "(F)F", "Lcp0/l;", "from", "to", "k", "(Lcp0/l;Lcp0/l;)F", "halfDrawerExpansionSpanPx", "fullDrawerExpansionSpanPx", "barExpansionSpanPx", "gaugeExpansionSpanPx", "v", "(FFFF)V", "n", "o", "u", "(Lq83/d;)Ljava/lang/Object;", "t", "", "isBarState", "a", "(ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/navigation/DrawerPresentation;", "presentation", "s", "(Lcom/whoop/navigation/DrawerPresentation;Lq83/d;)Ljava/lang/Object;", "canOpenDrawer", "Lkotlin/Function0;", "openBottomSheet", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ZLcom/whoop/navigation/DrawerPresentation;Lc93/a;Lq83/d;)Ljava/lang/Object;", "animate", "q", "(ZZLq83/d;)Ljava/lang/Object;", "Lh0/p;", "Lh0/p;", "c", "()Lh0/p;", "draggableState", "value", "b", "Z", "isGaugeAnchorActive", "()Z", "<set-?>", "Lp1/c1;", "i", "p", "(Z)V", "isPreviewAnchorActive", "d", "F", "halfSpanPx", "e", "fullSpanPx", "f", "barSpanPx", "g", "gaugeSpanPx", "()F", "halfDrawerExpansion", "barExpansion", "fullDrawerExpansion", "fullChromeExpansion", "()Lcp0/l;", "settledDetent", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10998t {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isGaugeAnchorActive;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float halfSpanPx;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float fullSpanPx;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float barSpanPx;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float gaugeSpanPx;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16435p draggableState = new C16435p(EnumC10974l.Preview);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28601c1 isPreviewAnchorActive = AbstractC28683x.m87272z(Boolean.TRUE);

    /* JADX INFO: renamed from: j */
    private final float m29380j(float targetOffset) {
        float fM87022x = this.draggableState.f63154f.m87022x();
        if (!Float.isNaN(fM87022x) && targetOffset != 0.0f) {
            float fM36283m = AbstractC12889b.m36283m(fM87022x / targetOffset, 0.0f, 1.0f);
            if (fM36283m != 0.0f) {
                return fM36283m;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k */
    private final float m29381k(EnumC10974l from, EnumC10974l to3) {
        if (Float.isNaN(this.draggableState.f63154f.m87022x())) {
            return 0.0f;
        }
        return this.draggableState.m46615e(from, to3);
    }

    /* JADX INFO: renamed from: l */
    private final void m29382l() {
        Object value;
        float f13 = this.halfSpanPx;
        if (f13 < 1.0f) {
            f13 = 1.0f;
        }
        C16435p c16435p = this.draggableState;
        C16402i1 c16402i1 = new C16402i1();
        m29383m(-f13, this, c16402i1);
        float[] fArr = c16402i1.f63050b;
        ArrayList arrayList = c16402i1.f63049a;
        int size = arrayList.size();
        AbstractC22676k.m65750j(fArr, "<this>");
        AbstractC34132o.m107886j(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        AbstractC22676k.m65749i(fArrCopyOfRange, "copyOfRange(...)");
        C16475x c16475x = new C16475x(arrayList, fArrCopyOfRange);
        C28617g1 c28617g1 = c16435p.f63154f;
        C28612f0 c28612f0 = c16435p.f63153e;
        if (Float.isNaN(c28617g1.m87022x()) || (value = c16475x.m46646a(c16435p.f63154f.m87022x())) == null) {
            value = c28612f0.getValue();
        }
        c16435p.m46618h(c16475x, value);
    }

    /* JADX INFO: renamed from: m */
    private static final C23454a0 m29383m(float f13, C10998t c10998t, C16402i1 DraggableAnchors) {
        AbstractC22676k.m65750j(DraggableAnchors, "$this$DraggableAnchors");
        EnumC10974l enumC10974l = EnumC10974l.FullDrawer;
        float f14 = c10998t.fullSpanPx;
        if (f14 < 1.0f) {
            f14 = 1.0f;
        }
        DraggableAnchors.m46592a(enumC10974l, f13 - f14);
        if (c10998t.isGaugeAnchorActive) {
            EnumC10974l enumC10974l2 = EnumC10974l.GaugeLevel;
            float f15 = c10998t.gaugeSpanPx;
            if (f15 < 1.0f) {
                f15 = 1.0f;
            }
            DraggableAnchors.m46592a(enumC10974l2, f13 - f15);
        }
        DraggableAnchors.m46592a(EnumC10974l.HalfDrawer, f13);
        if (c10998t.m29394i()) {
            DraggableAnchors.m46592a(EnumC10974l.Preview, 0.0f);
        }
        EnumC10974l enumC10974l3 = EnumC10974l.Bar;
        float f16 = c10998t.barSpanPx;
        DraggableAnchors.m46592a(enumC10974l3, f16 >= 1.0f ? f16 : 1.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private final void m29384p(boolean z4) {
        this.isPreviewAnchorActive.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Object m29385r(C10998t c10998t, boolean z4, boolean z13, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return c10998t.m29397q(z4, z13, interfaceC30057d);
    }

    /* JADX INFO: renamed from: a */
    public final Object m29386a(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        EnumC10974l enumC10974lM29392g = m29392g();
        EnumC10974l enumC10974l = EnumC10974l.FullDrawer;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (enumC10974lM29392g == enumC10974l) {
            Object objM29400u = m29400u(interfaceC30057d);
            return objM29400u == EnumC31071a.f128113w ? objM29400u : c23454a0;
        }
        Object objM29385r = m29385r(this, z4, false, interfaceC30057d, 2, null);
        return objM29385r == EnumC31071a.f128113w ? objM29385r : c23454a0;
    }

    /* JADX INFO: renamed from: b */
    public final float m29387b() {
        float f13 = this.barSpanPx;
        if (f13 < 1.0f) {
            f13 = 1.0f;
        }
        return m29380j(f13);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C16435p getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: renamed from: d */
    public final float m29389d() {
        return this.isGaugeAnchorActive ? m29381k(EnumC10974l.GaugeLevel, EnumC10974l.FullDrawer) : m29381k(EnumC10974l.HalfDrawer, EnumC10974l.FullDrawer);
    }

    /* JADX INFO: renamed from: e */
    public final float m29390e() {
        return m29381k(EnumC10974l.HalfDrawer, EnumC10974l.FullDrawer);
    }

    /* JADX INFO: renamed from: f */
    public final float m29391f() {
        float f13 = this.halfSpanPx;
        if (f13 < 1.0f) {
            f13 = 1.0f;
        }
        return m29380j(-f13);
    }

    /* JADX INFO: renamed from: g */
    public final EnumC10974l m29392g() {
        return (EnumC10974l) this.draggableState.f63152d.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final Object m29393h(boolean z4, DrawerPresentation drawerPresentation, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            Object objM29398s = m29398s(drawerPresentation, interfaceC30057d);
            return objM29398s == EnumC31071a.f128113w ? objM29398s : c23454a0;
        }
        interfaceC4339a.invoke();
        return c23454a0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m29394i() {
        return ((Boolean) this.isPreviewAnchorActive.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m29395n() {
        if (m29394i()) {
            return;
        }
        m29384p(true);
        m29382l();
    }

    /* JADX INFO: renamed from: o */
    public final void m29396o() {
        if (m29394i()) {
            m29384p(false);
            m29382l();
        }
    }

    /* JADX INFO: renamed from: q */
    public final Object m29397q(boolean z4, boolean z13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        EnumC10974l enumC10974l = (z4 || !m29394i()) ? EnumC10974l.Bar : EnumC10974l.Preview;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z13) {
            Object objM3372c = AbstractC1096a.m3372c(this.draggableState, enumC10974l, AbstractC11004v.f34416a, interfaceC30057d);
            if (objM3372c == EnumC31071a.f128113w) {
                return objM3372c;
            }
        } else {
            Object objM46612a = this.draggableState.m46612a(enumC10974l, EnumC13840z0.f49374w, new C16390g(4, null), interfaceC30057d);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (objM46612a != enumC31071a) {
                objM46612a = c23454a0;
            }
            if (objM46612a == enumC31071a) {
                return objM46612a;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: s */
    public final Object m29398s(DrawerPresentation drawerPresentation, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        EnumC10974l enumC10974lM29408e = AbstractC11004v.m29408e(drawerPresentation);
        if (enumC10974lM29408e == EnumC10974l.GaugeLevel && !this.isGaugeAnchorActive) {
            this.isGaugeAnchorActive = true;
            m29382l();
        }
        Object objM3372c = AbstractC1096a.m3372c(this.draggableState, enumC10974lM29408e, AbstractC11004v.f34416a, interfaceC30057d);
        return objM3372c == EnumC31071a.f128113w ? objM3372c : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public final Object m29399t(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM3372c = AbstractC1096a.m3372c(this.draggableState, EnumC10974l.FullDrawer, AbstractC11004v.f34416a, interfaceC30057d);
        return objM3372c == EnumC31071a.f128113w ? objM3372c : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public final Object m29400u(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM3372c = AbstractC1096a.m3372c(this.draggableState, EnumC10974l.HalfDrawer, AbstractC11004v.f34416a, interfaceC30057d);
        return objM3372c == EnumC31071a.f128113w ? objM3372c : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public final void m29401v(float halfDrawerExpansionSpanPx, float fullDrawerExpansionSpanPx, float barExpansionSpanPx, float gaugeExpansionSpanPx) {
        this.halfSpanPx = halfDrawerExpansionSpanPx;
        this.fullSpanPx = fullDrawerExpansionSpanPx;
        this.barSpanPx = barExpansionSpanPx;
        this.gaugeSpanPx = gaugeExpansionSpanPx;
        if (this.isGaugeAnchorActive && (m29392g() == EnumC10974l.HalfDrawer || m29392g() == EnumC10974l.FullDrawer)) {
            this.isGaugeAnchorActive = false;
        }
        if (m29394i() && m29392g().isDrawerDetent()) {
            m29384p(false);
        }
        m29382l();
    }
}
