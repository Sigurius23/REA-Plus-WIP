package p91;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import e93.AbstractC12889b;
import l83.C23454a0;
import m83.C25272z;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p91.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0016\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "", "xPercent", "yPercent", "widthPercent", "heightPercent", "Lp91/a;", "anchor", "e", "(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;", "j", "(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;", "Ly2/q0;", "measurable", "Ly3/a;", "constraints", "Ly2/j1;", "i", "(FFLy2/q0;J)Ly2/j1;", "Ly2/i1;", "placeable", "Ll83/a0;", "n", "(Ly2/i1;FFLy2/j1;JLp91/a;)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29011e {
    /* JADX INFO: renamed from: e */
    public static final Modifier m88144e(Modifier modifier, final float f13, final float f14, final float f15, final float f16, final C29007a anchor) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(anchor, "anchor");
        return AbstractC1131a.m3498b(modifier, new Function3() { // from class: p91.b
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AbstractC29011e.m88146g(f15, f16, f13, f14, anchor, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Modifier m88145f(Modifier modifier, float f13, float f14, float f15, float f16, C29007a c29007a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 2) != 0) {
            f14 = 0.0f;
        }
        if ((i13 & 4) != 0) {
            f15 = 1.0f;
        }
        if ((i13 & 8) != 0) {
            f16 = 1.0f;
        }
        if ((i13 & 16) != 0) {
            c29007a = C29007a.INSTANCE.m88139d();
        }
        return m88144e(modifier, f13, f14, f15, f16, c29007a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC39130s0 m88146g(float f13, float f14, float f15, float f16, C29007a c29007a, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        AbstractC39104j1 abstractC39104j1M88148i = m88148i(f13, f14, measurable, c39169a.f168407a);
        return layout.mo86822W(abstractC39104j1M88148i.f168211w, abstractC39104j1M88148i.f168212x, C25272z.f99163w, new C29010d(f15, f16, abstractC39104j1M88148i, c39169a, c29007a, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m88147h(float f13, float f14, AbstractC39104j1 abstractC39104j1, C39169a c39169a, C29007a c29007a, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        m88153n(layout, f13, f14, abstractC39104j1, c39169a.f168407a, c29007a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC39104j1 m88148i(float f13, float f14, InterfaceC39124q0 measurable, long j7) {
        int iM124767k;
        int iM124765i;
        int iM124766j;
        int iM124764h;
        AbstractC22676k.m65750j(measurable, "measurable");
        if (C39169a.m124761e(j7)) {
            iM124767k = AbstractC12889b.m36284n(AbstractC12889b.m36258X(C39169a.m124765i(j7) * f13), C39169a.m124767k(j7), C39169a.m124765i(j7));
            iM124765i = iM124767k;
        } else {
            iM124767k = C39169a.m124767k(j7);
            iM124765i = C39169a.m124765i(j7);
        }
        if (C39169a.m124760d(j7)) {
            iM124766j = AbstractC12889b.m36284n(AbstractC12889b.m36258X(C39169a.m124764h(j7) * f14), C39169a.m124766j(j7), C39169a.m124764h(j7));
            iM124764h = iM124766j;
        } else {
            iM124766j = C39169a.m124766j(j7);
            iM124764h = C39169a.m124764h(j7);
        }
        return measurable.mo448T(AbstractC39170b.m124769a(iM124767k, iM124765i, iM124766j, iM124764h));
    }

    /* JADX INFO: renamed from: j */
    public static final Modifier m88149j(Modifier modifier, final float f13, final float f14, final C29007a anchor) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(anchor, "anchor");
        return AbstractC1131a.m3498b(modifier, new Function3() { // from class: p91.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AbstractC29011e.m88151l(f13, f14, anchor, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Modifier m88150k(Modifier modifier, float f13, float f14, C29007a c29007a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 2) != 0) {
            f14 = 0.0f;
        }
        if ((i13 & 4) != 0) {
            c29007a = C29007a.INSTANCE.m88139d();
        }
        return m88149j(modifier, f13, f14, c29007a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC39130s0 m88151l(float f13, float f14, C29007a c29007a, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(c39169a.f168407a);
        return layout.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C29010d(f13, f14, abstractC39104j1Mo448T, c39169a, c29007a, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m88152m(float f13, float f14, AbstractC39104j1 abstractC39104j1, C39169a c39169a, C29007a c29007a, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        m88153n(layout, f13, f14, abstractC39104j1, c39169a.f168407a, c29007a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m88153n(AbstractC39101i1 positionByPercent, float f13, float f14, AbstractC39104j1 placeable, long j7, C29007a anchor) {
        AbstractC22676k.m65750j(positionByPercent, "$this$positionByPercent");
        AbstractC22676k.m65750j(placeable, "placeable");
        AbstractC22676k.m65750j(anchor, "anchor");
        float fM124765i = C39169a.m124761e(j7) ? C39169a.m124765i(j7) * f13 : 0.0f;
        float fM124764h = C39169a.m124760d(j7) ? C39169a.m124764h(j7) * f14 : 0.0f;
        float fM88132g = fM124765i - (anchor.getX() * placeable.f168211w);
        float fM88133h = fM124764h - (anchor.getY() * placeable.f168212x);
        if (anchor.getIsConfinedHorizontally() && C39169a.m124761e(j7)) {
            float fM124765i2 = C39169a.m124765i(j7) - placeable.f168211w;
            if (fM124765i2 < 0.0f) {
                fM124765i2 = 0.0f;
            }
            fM88132g = AbstractC12889b.m36283m(fM88132g, 0.0f, fM124765i2);
        }
        if (anchor.getIsConfinedVertically() && C39169a.m124760d(j7)) {
            float fM124764h2 = C39169a.m124764h(j7) - placeable.f168212x;
            if (fM124764h2 < 0.0f) {
                fM124764h2 = 0.0f;
            }
            fM88133h = AbstractC12889b.m36283m(fM88133h, 0.0f, fM124764h2);
        }
        AbstractC39101i1.m124624n(placeable, AbstractC12889b.m36258X(fM88132g), AbstractC12889b.m36258X(fM88133h), positionByPercent);
    }
}
