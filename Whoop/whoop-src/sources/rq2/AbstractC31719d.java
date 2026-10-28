package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import hb3.AbstractC17104a0;
import jr2.AbstractC21903b;
import jr2.AbstractC21904c;
import kq2.AbstractC22776b;
import l83.C23454a0;
import oq1.C28119c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: rq2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\u000e\u0010\u0007\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lrq2/a;", "step", "", "isCurrentStep", "Ll83/a0;", "c", "(Lrq2/a;ZLandroidx/compose/runtime/Composer;I)V", "animate", "", "horizontalProgress", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31719d {

    /* JADX INFO: renamed from: rq2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.HorizontalBarStepViewKt$HorizontalBarView$1$1", m100430f = "HorizontalBarStepView.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131405w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f131406x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f131407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131406x = z4;
            this.f131407y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f131406x, this.f131407y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f131405w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC31719d.m98423e(this.f131407y, this.f131406x);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m98421c(C31713a step, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1134857297);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(step) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(m98422d(interfaceC28601c1) ? step.getBarFillPercentage() : 0.0f, AbstractC11348f.m30574v(1500, 500, null, 4), null, null, c28655q, 48, 28);
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new a(z4, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(-1931694151, c28655q, new C28119c(12, step, interfaceC28670t2M30588b)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31717c(step, z4, i13, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final boolean m98422d(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m98423e(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: f */
    private static final float m98424f(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m98425g(C31713a c31713a, InterfaceC28670t2 interfaceC28670t2, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C22957g c22957g = AbstractC22977m.f90652c;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, composer, 0);
        C28655q c28655q2 = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j2 = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q2.f115906a;
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j2);
        } else {
            c28655q2.m87178s0();
        }
        C0209i c0209i2 = C0217k.f729g;
        AbstractC28683x.m87239G(composer, c0209i2, c23010xM66775a);
        C0209i c0209i3 = C0217k.f728f;
        AbstractC28683x.m87239G(composer, c0209i3, interfaceC28653p1M87165m);
        C0209i c0209i4 = C0217k.f732j;
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
        }
        C0209i c0209i5 = C0217k.f726d;
        AbstractC28683x.m87239G(composer, c0209i5, modifierM118962N);
        String title = c31713a.getTitle();
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        C2886a c2886aM8437r = c38072d.m121952e(composer, i14).getH4();
        long white50 = c38072d.m121949b(composer, i14).getWhite50();
        float f13 = 4;
        float f14 = 5 * f13;
        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, f14, 0.0f, 0.0f, 12);
        int i15 = C2886a.f11498d;
        int i16 = i15 << 18;
        AbstractC30795n.m94707h(title, modifierM3398t, white50, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, composer, 48, i16, 196600);
        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f13, c2305k), C2299e.f9107J, composer, 6);
        int iHashCode2 = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3398t2);
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c0213j = c0213j2;
            c28655q2.m87163l(c0213j);
        } else {
            c0213j = c0213j2;
            c28655q2.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i2, c22994r1M66759a);
        AbstractC28683x.m87239G(composer, c0209i3, interfaceC28653p1M87165m2);
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
            c0209i = c0209i4;
            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
        } else {
            c0209i = c0209i4;
        }
        AbstractC28683x.m87239G(composer, c0209i5, modifierM118962N2);
        String mainStatValue = c31713a.getMainStatValue();
        C2886a c2886aM8440u = c38072d.m121952e(composer, i14).getN1();
        long brandWhite = c38072d.m121949b(composer, i14).getBrandWhite();
        C39111m c39111m = AbstractC39083d.f168141b;
        C0209i c0209i6 = c0209i;
        C0213j c0213j3 = c0213j;
        AbstractC30795n.m94707h(mainStatValue, new WithAlignmentLineElement(c39111m), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8440u, null, composer, 0, i16, 196600);
        AbstractC30795n.m94707h(c31713a.getMainStatSuffix(), new WithAlignmentLineElement(c39111m), c38072d.m121949b(composer, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i14).getH1(), null, composer, 0, i16, 196600);
        c28655q2.m87173q(true);
        float f15 = 8;
        AbstractC30795n.m94707h(c31713a.getSubtitle(), AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, f13 * f15, 6), c38072d.m121949b(composer, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i14).getT3(), null, composer, 48, i16, 196600);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
        int iHashCode3 = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer, layoutWeightElement);
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j3);
        } else {
            c28655q2.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(composer, c0209i3, interfaceC28653p1M87165m3);
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
        }
        AbstractC28683x.m87239G(composer, c0209i5, modifierM118962N3);
        float f16 = 0 * f13;
        float f17 = 50 * f13;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1102d.m3412i(AbstractC34132o.m107879c(0.1f, c2314t), f16, f17));
        C2307m c2307m = C2299e.f9117z;
        C1100b c1100b = C1100b.f4583a;
        AbstractC22989q.m66760a(AbstractC21903b.m62312a(c1100b.mo3400a(modifierM3407d, c2307m), c31713a.getProgressBackground()), composer, 0);
        AbstractC22989q.m66760a(AbstractC21903b.m62312a(c1100b.mo3400a(AbstractC1102d.m3409f(m98424f(interfaceC28670t2), AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t, f16, f17))), c2307m), c31713a.getProgressBar()), composer, 0);
        c28655q2.m87173q(true);
        if (c31713a.m98375h().isEmpty()) {
            c28655q = c28655q2;
            c28655q.m87150e0(-765618352);
            Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f15, 0.0f, 2));
            TextResource footerText = c31713a.getFooterText();
            TextResource footerSubText = c31713a.getFooterSubText();
            int i17 = TextResource.$stable;
            AbstractC22776b.m65990b(modifierM38560g, footerText, footerSubText, composer, (i17 << 6) | (i17 << 3));
            c28655q.m87173q(false);
        } else {
            c28655q2.m87150e0(-765930181);
            AbstractC30795n.m94704e(AbstractC21904c.m62321i(c31713a.m98375h()), AbstractC1099a.m3397s(c2314t, f14, 10 * f13, f14, f14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(composer, i14).getT1(), composer, 0, i15 << 21, 131068);
            c28655q = c28655q2;
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m98426h(C31713a c31713a, boolean z4, int i13, Composer composer, int i14) {
        m98421c(c31713a, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
