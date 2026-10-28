package q41;

import ad3.AbstractC0770m;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.molecule.trilabelslider.TriLabelSliderBarStyle;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.profile.view.C9814j;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import e93.AbstractC12889b;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22412x;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p180h0.AbstractC16486z0;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p725ot1.C28330f;
import pt2.C29529k;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: q41.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lq41/c;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lq41/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "label", "", "value", "Lb2/f;", "alignment", "g", "(Ljava/lang/String;FLb2/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;", "barStyle", "", "isRtl", "Li2/t;", "s", "(Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;ZLandroidx/compose/runtime/Composer;I)Li2/t;", "sliderValue", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29973f {

    /* JADX INFO: renamed from: q41.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.trilabelslider.TriLabelSliderKt$TriLabelSlider$1$1", m100430f = "TriLabelSlider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122418w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29970c f122419x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f122420y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29970c c29970c, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122419x = c29970c;
            this.f122420y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f122419x, this.f122420y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f122418w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC29973f.m91680k(this.f122420y, this.f122419x.getSliderValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q41.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f122421E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ float f122422F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C29970c f122423w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f122424x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f122425y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f122426z;

        public b(C29970c c29970c, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, boolean z4, float f13) {
            this.f122423w = c29970c;
            this.f122424x = function1;
            this.f122425y = interfaceC28601c1;
            this.f122426z = interfaceC28670t2;
            this.f122421E = z4;
            this.f122422F = f13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final C23454a0 m91691c(C29970c c29970c, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
            String strM91668j = c29970c.m91668j();
            if (strM91668j != null) {
                function1.invoke(new DesignItemInteraction(new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(strM91668j, AbstractC0770m.m1840b(Float.valueOf(AbstractC29973f.m91679j(interfaceC28601c1))))), false, 2, (DefaultConstructorMarker) null), null));
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final C23454a0 m91692d(InterfaceC28670t2 interfaceC28670t2, boolean z4, C29970c c29970c, float f13, InterfaceC28601c1 interfaceC28601c1, C34472r change, float f14) {
            AbstractC22676k.m65750j(change, "change");
            change.m108946a();
            AbstractC29973f.m91680k(interfaceC28601c1, (AbstractC22412x.m64539b(Float.intBitsToFloat((int) (change.f144817c >> 32)), ((Number) interfaceC28670t2.getValue()).floatValue(), z4) * f13) + c29970c.getLowerBound());
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final C29970c c29970c = this.f122423w;
            final Function1 function1 = this.f122424x;
            final InterfaceC28601c1 interfaceC28601c1 = this.f122425y;
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: q41.g
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return AbstractC29973f.b.m91691c(c29970c, function1, interfaceC28601c1);
                }
            };
            final InterfaceC28670t2 interfaceC28670t2 = this.f122426z;
            final boolean z4 = this.f122421E;
            final float f13 = this.f122422F;
            Object objM46659h = AbstractC16486z0.m46659h(interfaceC34476v, interfaceC4339a, interfaceC4339a, new InterfaceC4351m() { // from class: q41.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    return AbstractC29973f.b.m91692d(interfaceC28670t2, z4, c29970c, f13, interfaceC28601c1, (C34472r) obj, fFloatValue);
                }
            }, interfaceC30057d, 1);
            return objM46659h == EnumC31071a.f128113w ? objM46659h : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q41.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f122427a;

        static {
            int[] iArr = new int[TriLabelSliderBarStyle.values().length];
            try {
                iArr[TriLabelSliderBarStyle.STRAIN_GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f122427a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    private static final void m91676g(String str, float f13, InterfaceC2300f interfaceC2300f, Modifier modifier, Composer composer, int i13, int i14) {
        String str2;
        int i15;
        float f14;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-523428101);
        if ((i13 & 6) == 0) {
            str2 = str;
            i15 = (c28655q2.m87153g(str2) ? 4 : 2) | i13;
        } else {
            str2 = str;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            f14 = f13;
            i15 |= c28655q2.m87147d(f14) ? 32 : 16;
        } else {
            f14 = f13;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(interfaceC2300f) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, interfaceC2300f, c28655q2, ((((i15 >> 9) & 14) | (i15 & 896)) >> 3) & 112);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                C2886a c2886aM8420a = c38072d.m121952e(c28655q2, 6).getB1();
                modifier3 = modifier4;
                AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, i15 & 14, 0, 196602);
                AbstractC30795n.m94707h(String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f14)}, 1)), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB3(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9814j(str, f13, interfaceC2300f, modifier3, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, interfaceC2300f, c28655q2, ((((i15 >> 9) & 14) | (i15 & 896)) >> 3) & 112);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q2, 6).getB1();
            modifier3 = modifier4;
            AbstractC30795n.m94707h(str2, null, c38072d2.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q2, i15 & 14, 0, 196602);
            AbstractC30795n.m94707h(String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f14)}, 1)), null, c38072d2.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB3(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9814j(str, f13, interfaceC2300f, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m91677h(String str, float f13, InterfaceC2300f interfaceC2300f, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m91676g(str, f13, interfaceC2300f, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x0215  */
    /* JADX INFO: renamed from: i */
    public static final void m91678i(Modifier modifier, final C29970c state, final Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        float f13;
        int iHashCode;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-658886206);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q2.m87153g(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Float.valueOf(state.getSliderValue()));
                c28655q2.m87172p0(objM87133R);
            }
            final InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Float fValueOf = Float.valueOf(state.getSliderValue());
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R2 = c28655q2.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new a(state, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, fValueOf);
            float fM91669k = state.getUpperBound() - state.getLowerBound();
            Float fValueOf2 = fM91669k > 0.0f ? Float.valueOf(fM91669k) : null;
            float fFloatValue = fValueOf2 != null ? fValueOf2.floatValue() : 1.0f;
            final float fM36283m = AbstractC12889b.m36283m((m91679j(interfaceC28601c1) - state.getLowerBound()) / fFloatValue, 0.0f, 1.0f);
            final float f14 = 7 * 4;
            C28674u2 c28674u2 = AbstractC2453v1.f9575n;
            boolean z13 = c28655q2.m87161k(c28674u2) == EnumC39181m.f168424x;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * 8);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q2, 6);
            final boolean z14 = z13;
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                f13 = fFloatValue;
            } else {
                f13 = fFloatValue;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                final float f15 = f13;
                Modifier modifier5 = modifier4;
                AbstractC28683x.m87247a(c28674u2.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1068059144, c28655q2, new InterfaceC4351m() { // from class: q41.d
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC29973f.m91681l(fM36283m, z14, f14, state, onViewEvent, f15, interfaceC28601c1, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 56);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                String strM91667i = state.getStartLabel();
                float fM91665g = state.getLowerBound();
                C23000t1 c23000t1 = C23000t1.f90727a;
                c28655q = c28655q2;
                m91676g(strM91667i, fM91665g, c2305k, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
                if (state.getCenterLabel() != null || state.getCenterBound() == null) {
                    c28655q.m87150e0(296407142);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(296145750);
                    m91676g(state.getCenterLabel(), state.getCenterBound().floatValue(), C2299e.f9111N, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
                    c28655q.m87173q(false);
                }
                m91676g(state.getEndLabel(), state.getUpperBound(), C2299e.f9112O, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            final float f16 = f13;
            Modifier modifier6 = modifier4;
            AbstractC28683x.m87247a(c28674u2.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1068059144, c28655q2, new InterfaceC4351m() { // from class: q41.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC29973f.m91681l(fM36283m, z14, f14, state, onViewEvent, f16, interfaceC28601c1, (Composer) obj, iIntValue);
                }
            }), c28655q2, 56);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
            String strM91667i2 = state.getStartLabel();
            float fM91665g2 = state.getLowerBound();
            C23000t1 c23000t2 = C23000t1.f90727a;
            c28655q = c28655q2;
            m91676g(strM91667i2, fM91665g2, c2305k, c23000t2.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
            if (state.getCenterLabel() != null) {
                c28655q.m87150e0(296407142);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(296407142);
                c28655q.m87173q(false);
            }
            m91676g(state.getEndLabel(), state.getUpperBound(), C2299e.f9112O, c23000t2.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier3, state, onViewEvent, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final float m91679j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m91680k(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m91681l(final float f13, final boolean z4, final float f14, final C29970c c29970c, final Function1 function1, final float f15, final InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, false, AbstractC37817c.m121344e(1317893326, c28655q, new Function3() { // from class: q41.e
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC29973f.m91682m(f13, z4, f14, c29970c, function1, f15, interfaceC28601c1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 3078, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m91682m(float f13, boolean z4, float f14, C29970c c29970c, Function1 function1, float f15, InterfaceC28601c1 interfaceC28601c1, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        float f16;
        boolean z13;
        C2307m c2307m = C2299e.f9117z;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C1101c c1101c = (C1101c) BoxWithConstraints;
            float fM3403d = c1101c.m3403d();
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(Float.valueOf(C39169a.m124765i(c1101c.f4585b)), c28655q);
            float fM8288a = AbstractC2875y.m8288a(fM3403d, f14, AbstractC22412x.m64538a(f13, z4), f14 / 2);
            if (z4) {
                f16 = fM3403d - fM8288a;
                float f17 = 0;
                if (f16 < f17) {
                    f16 = f17;
                }
            } else {
                f16 = fM8288a;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2307m c2307m2 = C2299e.f9114w;
            float f18 = f16;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String str = String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(m91679j(interfaceC28601c1))}, 1));
            C38072d c38072d = C38072d.f163053a;
            C2886a c2886aM8413K = c38072d.m121952e(c28655q, 6).getSh3();
            long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
            Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t, fM8288a, 0.0f, 2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C29529k(23);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC30795n.m94707h(str, AbstractC1127a.m3486a(modifierM3392n, (Function1) objM87133R), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8413K, null, c28655q, 0, 0, 196600);
            c28655q.m87173q(true);
            Modifier modifierM3411h = AbstractC1102d.m3411h(f14, AbstractC1102d.m3409f(1.0f, c2314t));
            Object[] objArr = {Float.valueOf(c29970c.getLowerBound()), Float.valueOf(c29970c.getUpperBound()), Boolean.valueOf(z4)};
            boolean zM87153g = c28655q.m87153g(c29970c) | c28655q.m87153g(function1) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87155h(z4) | c28655q.m87147d(f15);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                z13 = z4;
                objM87133R2 = new b(c29970c, function1, interfaceC28601c1, interfaceC28601c1M87238F, z13, f15);
                c28655q.m87172p0(objM87133R2);
            } else {
                z13 = z4;
            }
            Modifier modifierM108905d = AbstractC34452c0.m108905d(modifierM3411h, objArr, (PointerInputEventHandler) objM87133R2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM108905d);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(c29970c.getBarThickness(), AbstractC1102d.m3409f(1.0f, c2314t));
            C2307m c2307m3 = C2299e.f9102E;
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierMo3400a = c1100b.mo3400a(modifierM3411h2, c2307m3);
            long white10 = c38072d.m121949b(c28655q, 6).getWhite10();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierMo3400a, white10, c17916v0), c28655q, 0);
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(c1100b.mo3400a(AbstractC1102d.m3411h(c29970c.getBarThickness(), AbstractC1102d.m3424u(f18, c2314t)), z13 ? C2299e.f9103F : c2307m), m91688s(c29970c.getBarStyle(), z13, c28655q, 0), null, 0.0f, 6), c28655q, 0);
            Modifier modifierM3392n2 = AbstractC1099a.m3392n(c2314t, fM8288a, 0.0f, 2);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C29529k(24);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(c1100b.mo3400a(AbstractC1102d.m3419p(f14, AbstractC1127a.m3486a(modifierM3392n2, (Function1) objM87133R3)), c2307m), AbstractC33253j.f138651a), c38072d.m121949b(c28655q, 6).getBrandWhite(), c17916v0), "tri_label_slider_thumb"), c28655q, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m91683n(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51549C((-Float.intBitsToFloat((int) (c17920x0.f69653R >> 32))) / 2.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m91684o(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51549C((-Float.intBitsToFloat((int) (c17920x0.f69653R >> 32))) / 2.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m91685p(Modifier modifier, C29970c c29970c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91678i(modifier, c29970c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final AbstractC17911t m91688s(TriLabelSliderBarStyle triLabelSliderBarStyle, boolean z4, Composer composer, int i13) {
        if (c.f122427a[triLabelSliderBarStyle.ordinal()] != 1) {
            throw AbstractC11895b.m32003v(-2106313541, (C28655q) composer, false);
        }
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-871148887);
        C38072d c38072d = C38072d.f163053a;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.5f, c38072d.m121949b(c28655q, 6).getStrain())), new C17919x(c38072d.m121949b(c28655q, 6).getStrain()));
        C17909s c17909s = AbstractC17911t.f69612b;
        if (z4) {
            listM118959K = AbstractC25265s.m74143q0(listM118959K);
        }
        C17894k0 c17894k0M51483a = C17909s.m51483a(c17909s, listM118959K, 0.0f, 0.0f, 14);
        c28655q.m87173q(false);
        return c17894k0M51483a;
    }
}
