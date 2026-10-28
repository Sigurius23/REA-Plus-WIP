package t21;

import android.app.Application;
import android.content.Context;
import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import b01.C2194o;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import fc0.C14359c;
import h31.C16825r;
import i51.AbstractC18121r;
import i51.C18122s;
import jn2.AbstractC21808c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3760m1;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.C3789x;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11407v;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32627j2;
import p736sz0.C33192k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qk2.C30453i;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rq0.C31703x;
import s51.C32209f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.C32940v;
import t01.C33259e;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: t21.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u001e²\u0006\f\u0010\u0015\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lt21/h;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "P", "(Landroidx/compose/ui/Modifier;Lt21/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lt21/d;", "viewState", "Lkotlin/Function0;", "onAnimationFinished", "G", "(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "currentState", "A", "(Lt21/d;Landroidx/compose/runtime/Composer;I)V", "s", "(Lt21/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "milestonePillViewState", "Ly3/f;", "animatedHeight", "Li2/x;", "animatedBackgroundColor", "", "animatedBorderAlpha", "animatedLottieSize", "animatedIconPadding", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33349g {

    /* JADX INFO: renamed from: t21.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.milestonepill.MilestonePillWrapperKt$MilestonePill$4$1", m100430f = "MilestonePillWrapper.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f139163w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f139164x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f139164x = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f139164x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f139163w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f139163w = 1;
                if (AbstractC3034m0.m8782b(3500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f139164x.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: t21.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.milestonepill.MilestonePillWrapperKt$MilestonePillWrapper$2$1", m100430f = "MilestonePillWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f139165w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C33346d, AbstractC33344b> f139166x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33350h f139167y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC23864c<C33346d, AbstractC33344b> abstractC23864c, C33350h c33350h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f139166x = abstractC23864c;
            this.f139167y = c33350h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f139166x, this.f139167y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f139165w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f139166x.mo1216g(new AbstractC33344b.b(this.f139167y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m105724A(C33346d c33346d, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-546775769);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c33346d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float fM105706d = c33346d.getShouldAnimate() ? C33343a.f139135a.m105706d() : C33343a.f139135a.m105707e();
            C33343a c33343a = C33343a.f139135a;
            InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(fM105706d, c33343a.m105703a(), "lottie_size_animation", c28655q, 384, 8);
            InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(c33346d.getShouldAnimate() ? c33343a.m105704b() : c33343a.m105705c(), c33343a.m105703a(), "icon_padding_animation", c28655q, 384, 8);
            Boolean boolValueOf = Boolean.valueOf(c33346d.getShouldAnimate());
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C33192k(25);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1089a.m3344b(boolValueOf, null, (Function1) objM87133R, null, "MilestoneLottieDelayedSwitch", null, AbstractC37817c.m121344e(-2035500374, c28655q, new C14359c(c33346d, interfaceC28670t2M30587a2, interfaceC28670t2M30587a, 7)), c28655q, 1597824, 42);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c33346d, i13, 4);
        }
    }

    /* JADX INFO: renamed from: B */
    private static final float m105725B(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: C */
    private static final float m105726C(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C3756l0 m105727D(InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return AbstractC1089a.m3345c(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(0, 0, null, 4), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(1000, 1000, null, 4), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m105728E(C33346d c33346d, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC3764o AnimatedContent, boolean z4, Composer composer, int i13) {
        Object obj;
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        C18122s c18122sM105713c = c33346d.getDynamicLottieViewState();
        C2314t c2314t = C2314t.f9131w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = null;
        if (c18122sM105713c == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1051694742);
            c28655q.m87173q(false);
            obj = null;
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1051694743);
            AbstractC18121r.m52029d(c18122sM105713c, AbstractC1102d.m3419p(m105725B(interfaceC28670t3), AbstractC1099a.m3397s(AbstractC1136a.m3599a(c2314t, "MilestoneDynamicLottie"), 1 * 8, m105726C(interfaceC28670t2), m105726C(interfaceC28670t2), m105726C(interfaceC28670t2))), null, null, c28655q2, 0, 12);
            c28655q2.m87173q(false);
            obj = c23454a0;
        }
        if (obj == null) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(1052118761);
            InterfaceC35689r0 interfaceC35689r0M105715e = c33346d.getLottieWrapper();
            if (interfaceC35689r0M105715e == null) {
                c28655q3.m87150e0(1052118760);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(1052118761);
                AbstractC35684p.m113047h(AbstractC1102d.m3419p(m105725B(interfaceC28670t3), AbstractC1099a.m3397s(AbstractC1136a.m3599a(c2314t, z4 ? "MilestoneAnimatedLottie" : "MilestoneStaticLottieImage"), 1 * 8, m105726C(interfaceC28670t2), m105726C(interfaceC28670t2), m105726C(interfaceC28670t2))), interfaceC35689r0M105715e, false, 0.0f, 2, null, null, null, z4 ? null : Float.valueOf(1.0f), c28655q3, 24576, 236);
                c28655q3.m87173q(false);
                obj2 = c23454a0;
            }
            c28655q3.m87173q(false);
            obj = obj2;
        } else {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(-1905737409);
            c28655q4.m87173q(false);
        }
        if (obj != null) {
            C28655q c28655q5 = (C28655q) composer;
            c28655q5.m87150e0(-1905736964);
            c28655q5.m87173q(false);
            return c23454a0;
        }
        C28655q c28655q6 = (C28655q) composer;
        c28655q6.m87150e0(1052846579);
        AbstractC22403o abstractC22403oM105714d = c33346d.getImage();
        if (abstractC22403oM105714d == null) {
            c28655q6.m87150e0(1052846578);
            c28655q6.m87173q(false);
        } else {
            c28655q6.m87150e0(1052846579);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM105714d, null, null, c28655q6, 0, 3), null, AbstractC1102d.m3419p(6 * 4, AbstractC1099a.m3397s(AbstractC1136a.m3599a(c2314t, "MilestoneStaticImage"), 1 * 8, m105726C(interfaceC28670t2), m105726C(interfaceC28670t2), m105726C(interfaceC28670t2))), null, null, 0.0f, null, c28655q6, 48, 120);
            c28655q6.m87173q(false);
        }
        c28655q6.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m105729F(C33346d c33346d, int i13, Composer composer, int i14) {
        m105724A(c33346d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:135:0x030b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0318 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX INFO: renamed from: G */
    public static final void m105730G(Modifier modifier, final C33346d viewState, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        C28655q c28655q;
        final InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        final Modifier modifier3;
        final Function1 function3;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a4;
        final InterfaceC4339a interfaceC4339a5;
        final Function1 function5;
        long jM51517e;
        Modifier modifierM61736e;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1845494540);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i17 = 2048;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C33192k(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32940v(26);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (!viewState.getIsLoading() || viewState.getIsError()) {
                        interfaceC4339a5 = interfaceC4339a4;
                        function5 = function4;
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        }
                        final int i24 = 0;
                        final Modifier modifier4 = modifier2;
                        interfaceC4351m = new InterfaceC4351m() { // from class: t21.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i24) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC33349g.m105733J(modifier4, viewState, function5, interfaceC4339a5, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC33349g.m105738O(modifier4, viewState, function5, interfaceC4339a5, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    } else {
                        if (viewState.getShouldAnimate()) {
                            c28655q2.m87150e0(748840985);
                            String strM105712b = viewState.getCount();
                            boolean z13 = (i15 & 7168) == 2048;
                            Object objM87133R3 = c28655q2.m87133R();
                            if (z13 || objM87133R3 == c28676v0) {
                                objM87133R3 = new a(interfaceC4339a4, null);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, strM105712b);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(749014926);
                            c28655q2.m87173q(false);
                        }
                        InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                        InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(viewState.getShouldAnimate() ? C33343a.f139135a.m105708f() : C33343a.f139135a.m105709g(), C33343a.f139135a.m105703a(), "milestone_pill_height_animation", c28655q2, 384, 8);
                        if (viewState.getShouldAnimate()) {
                            c28655q2.m87150e0(749503517);
                            jM51517e = C38072d.f163053a.m121949b(c28655q2, 6).getBlack90();
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(749557829);
                            c28655q2.m87173q(false);
                            jM51517e = AbstractC17918w0.m51517e(4281219132L);
                        }
                        C11407v c11407v = AbstractC11333b0.f36310a;
                        Function1 function6 = function4;
                        InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(jM51517e, AbstractC11348f.m30574v(300, 0, c11407v, 2), "milestone_pill_background_color_animation", c28655q2, 384, 8);
                        InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(viewState.getShouldAnimate() ? 1.0f : 0.0f, AbstractC11348f.m30574v(300, 0, c11407v, 2), "milestone_pill_border_alpha_animation", null, c28655q2, 3072, 20);
                        c28655q = c28655q2;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3411h(m105734K(interfaceC28670t2M30587a), modifier2), m105735L(interfaceC28670t2M11569a), AbstractC33253j.m105486b(40));
                        if (viewState.getShouldAnimate()) {
                            c28655q.m87150e0(750361721);
                            modifierM61736e = AbstractC21808c.m61736e(c2314t, viewState.getAnimationAccentColor().mo134584toComposableColorWaAFU9c(c28655q, 0), m105736M(interfaceC28670t2M30588b));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(750604606);
                            c28655q.m87173q(false);
                            modifierM61736e = c2314t;
                        }
                        Modifier modifierMo3471e = modifierM3358c.mo3471e(modifierM61736e);
                        boolean zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                        Object objM87133R4 = c28655q.m87133R();
                        if (zM87157i || objM87133R4 == c28676v0) {
                            function2 = function6;
                            objM87133R4 = new C32209f(14, viewState, function2);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            function2 = function6;
                        }
                        Modifier modifierM3362g = AbstractC1092a.m3362g(modifierMo3471e, false, null, null, (InterfaceC4339a) objM87133R4, 15);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        int iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                        C0209i c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                        C0209i c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        C2306l c2306l = C2299e.f9108K;
                        Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                        int iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3406c);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        int i25 = (i15 >> 3) & 14;
                        m105724A(viewState, c28655q, i25);
                        m105762s(viewState, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.25d) * 8, 0.0f, 11), c28655q, i25 | 48, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        interfaceC4339a3 = interfaceC4339a6;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i26 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: t21.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i26) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC33349g.m105733J(modifier3, viewState, function3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC33349g.m105738O(modifier3, viewState, function3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33192k(24);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32940v(26);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState.getIsLoading()) {
                }
                interfaceC4339a5 = interfaceC4339a4;
                function5 = function4;
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    final int i27 = 0;
                    final Modifier modifier5 = modifier2;
                    interfaceC4351m = new InterfaceC4351m() { // from class: t21.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i27) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC33349g.m105733J(modifier5, viewState, function5, interfaceC4339a5, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC33349g.m105738O(modifier5, viewState, function5, interfaceC4339a5, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                return;
            }
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i28 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: t21.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i28) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33349g.m105733J(modifier3, viewState, function3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC33349g.m105738O(modifier3, viewState, function3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33192k(24);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32940v(26);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState.getIsLoading()) {
                }
                interfaceC4339a5 = interfaceC4339a4;
                function5 = function4;
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    final int i29 = 0;
                    final Modifier modifier6 = modifier2;
                    interfaceC4351m = new InterfaceC4351m() { // from class: t21.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i29) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC33349g.m105733J(modifier6, viewState, function5, interfaceC4339a5, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC33349g.m105738O(modifier6, viewState, function5, interfaceC4339a5, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                return;
            }
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i210 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: t21.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i210) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33349g.m105733J(modifier3, viewState, function3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC33349g.m105738O(modifier3, viewState, function3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C33192k(24);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32940v(26);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (viewState.getIsLoading()) {
            }
            interfaceC4339a5 = interfaceC4339a4;
            function5 = function4;
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u == null) {
                final int i211 = 0;
                final Modifier modifier7 = modifier2;
                interfaceC4351m = new InterfaceC4351m() { // from class: t21.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i211) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33349g.m105733J(modifier7, viewState, function5, interfaceC4339a5, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC33349g.m105738O(modifier7, viewState, function5, interfaceC4339a5, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            return;
        }
        c28655q = c28655q2;
        c28655q.m87138X();
        interfaceC4339a3 = interfaceC4339a2;
        modifier3 = modifier2;
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i212 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: t21.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i212) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33349g.m105733J(modifier3, viewState, function3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC33349g.m105738O(modifier3, viewState, function3, interfaceC4339a3, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m105731H(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m105732I() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m105733J(Modifier modifier, C33346d c33346d, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m105730G(modifier, c33346d, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final float m105734K(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: L */
    private static final long m105735L(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: M */
    private static final float m105736M(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m105737N(C33346d c33346d, Function1 function1) {
        C9598e c9598eM105716f = c33346d.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (c9598eM105716f != null) {
            function1.invoke(c9598eM105716f);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m105738O(Modifier modifier, C33346d c33346d, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m105730G(modifier, c33346d, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x0171  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01da  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0201  */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: P */
    public static final void m105739P(Modifier modifier, C33350h itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        C33346d c33346d;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        AbstractC23864c abstractC23864c2;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R4;
        Object obj;
        Object obj2;
        boolean zM87153g3;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1924095406);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(itemState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C33192k(19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                c33346d = new C33346d(true, false, null, null, null, null, null, null, false, null, 1022, null);
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c33346d) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c33346d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC33345c.class), null, null);
                        c33346d = c33346d;
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                } else {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c33346d) | c28655q.m87153g(null);
                        objM87133R4 = c28655q.m87133R();
                        if (!zM87153g2 || objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC33345c.class), null, new C23863b(c33346d), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            obj2 = null;
                            obj = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R4;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c33346d) | c28655q.m87153g(obj);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C23863b(c33346d);
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (C23863b) objM87133R5;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                abstractC23864c2 = abstractC23864c;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), c33346d, null, c28655q, 0, 2);
                String strM105770a = itemState.getPath();
                zM87157i = c28655q.m87157i(abstractC23864c2) | ((i15 & 112) == 32);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(abstractC23864c2, itemState, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, strM105770a);
                C33346d c33346dM105741R = m105741R(interfaceC28601c1M87260n);
                zM87157i2 = c28655q.m87157i(abstractC23864c2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C16825r(abstractC23864c2, 4);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifier4 = modifier3;
                Function1 function5 = function4;
                m105730G(modifier4, c33346dM105741R, function5, (InterfaceC4339a) objM87133R3, c28655q, i15 & 910, 0);
                c28655q = c28655q;
                modifier2 = modifier4;
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(modifier2, itemState, function3, i13, i14, 2);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C33192k(19);
                    c28655q.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            } else {
                function4 = function2;
            }
            c33346d = new C33346d(true, false, null, null, null, null, null, null, false, null, 1022, null);
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj2 = null;
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c33346d) | c28655q.m87153g(null);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC33345c.class), null, new C23863b(c33346d), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC33345c.class), null, new C23863b(c33346d), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R4);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R4;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c33346d) | c28655q.m87153g(obj);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = new C23863b(c33346d);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C23863b(c33346d);
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (C23863b) objM87133R5;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c33346d) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c33346d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC33345c.class), null, null);
                    c33346d = c33346d;
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c33346d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC33345c.class), null, null);
                    c33346d = c33346d;
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
            }
            c28655q.m87173q(false);
            abstractC23864c2 = abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), c33346d, null, c28655q, 0, 2);
            String strM105770a2 = itemState.getPath();
            zM87157i = c28655q.m87157i(abstractC23864c2) | ((i15 & 112) == 32);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new b(abstractC23864c2, itemState, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(abstractC23864c2, itemState, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, strM105770a2);
            C33346d c33346dM105741R2 = m105741R(interfaceC28601c1M87260n2);
            zM87157i2 = c28655q.m87157i(abstractC23864c2);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R3 = new C16825r(abstractC23864c2, 4);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C16825r(abstractC23864c2, 4);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifier5 = modifier3;
            Function1 function6 = function4;
            m105730G(modifier5, c33346dM105741R2, function6, (InterfaceC4339a) objM87133R3, c28655q, i15 & 910, 0);
            c28655q = c28655q;
            modifier2 = modifier5;
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier2, itemState, function3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m105740Q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private static final C33346d m105741R(InterfaceC28670t2 interfaceC28670t2) {
        return (C33346d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m105742S(AbstractC23864c abstractC23864c) {
        abstractC23864c.mo1216g(AbstractC33344b.a.f139144a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m105743T(Modifier modifier, C33350h c33350h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m105739P(modifier, c33350h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m105762s(C33346d c33346d, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1369824314);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c33346d) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            String strM105712b = c33346d.getCount();
            if (strM105712b == null) {
                c28655q.m87150e0(-1951683152);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1951683151);
                String strM21275i = AbstractC8693b.m21275i(strM105712b, c28655q, 0);
                boolean zM87157i = c28655q.m87157i(c33346d);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C31703x(c33346d, 16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC1089a.m3344b(strM21275i, null, (Function1) objM87133R, null, "milestoneCountAnimation", null, AbstractC37817c.m121344e(439018974, c28655q, new C2194o(4, c33346d, modifier)), c28655q, 1597440, 42);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(c33346d, i13, modifier2, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C3756l0 m105763t(C33346d c33346d, InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        if (!c33346d.getShouldAnimate()) {
            return AbstractC1089a.m3345c(AbstractC3730c1.f15251a, AbstractC3736e1.f15289a);
        }
        C3789x c3789x = (C3789x) AnimatedContent;
        Integer numM125932Q = AbstractC39421y.m125932Q((String) c3789x.mo11596c());
        int iIntValue = numM125932Q != null ? numM125932Q.intValue() : 0;
        Integer numM125932Q2 = AbstractC39421y.m125932Q((String) c3789x.mo11595b());
        return (numM125932Q2 != null ? numM125932Q2.intValue() : 0) >= iIntValue ? AbstractC1089a.m3345c(AbstractC3788w0.m11588p(null, new C33192k(20), 1), AbstractC3788w0.m11592t(1, new C33192k(21))) : AbstractC1089a.m3345c(AbstractC3788w0.m11588p(null, new C33192k(22), 1), AbstractC3788w0.m11592t(1, new C33192k(23)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final int m105764u(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final int m105765v(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final int m105766w(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final int m105767x(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m105768y(C33346d c33346d, Modifier modifier, InterfaceC3764o AnimatedContent, String textToDisplay, Composer composer, int i13) {
        long jMo134584toComposableColorWaAFU9c;
        C2886a c2886aM8407E;
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(textToDisplay, "textToDisplay");
        if (c33346d.getShouldAnimate()) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(638975911);
            jMo134584toComposableColorWaAFU9c = c33346d.getAnimationAccentColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(639073778);
            jMo134584toComposableColorWaAFU9c = c33346d.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            c28655q2.m87173q(false);
        }
        if (c33346d.getShouldAnimate()) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(639212100);
            c2886aM8407E = C38072d.f163053a.m121952e(c28655q3, 6).getN6();
            c28655q3.m87173q(false);
        } else {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(639281540);
            c2886aM8407E = C38072d.f163053a.m121952e(c28655q4, 6).getN8();
            c28655q4.m87173q(false);
        }
        AbstractC30795n.m94707h(textToDisplay, modifier, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8407E, null, composer, (i13 >> 3) & 14, 0, 196600);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m105769z(C33346d c33346d, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m105762s(c33346d, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
