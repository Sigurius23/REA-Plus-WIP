package bu2;

import a01.C0085e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import bs1.C3595n;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C0003a0;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p180h0.AbstractC16412k1;
import p180h0.AbstractC16434o3;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16427n1;
import p181h2.C16617b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bu2.x */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001ak\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!\u001a\u001b\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u001e\u001a'\u0010%\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&¨\u0006(²\u0006\f\u0010'\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lbu2/q;", "sliderItemState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Lbu2/q;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "backgroundColor", "", "onDrag", "onDragStopped", "Lh2/b;", "onTap", "Lkotlin/Function0;", "sliderForeground", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "currentFillPercentage", "foregroundColor", "sliderHandle", "z", "(FJLc93/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "color", "B", "(JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "E", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "fillPercentage", "F", "(Landroidx/compose/ui/Modifier;FJ)Landroidx/compose/ui/Modifier;", "G", "maxHeight", "dragDelta", "D", "(FFF)F", "sliderAnimationPercentage", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3663x {

    /* JADX INFO: renamed from: bu2.x$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f14906w;

        public a(Function1 function1) {
            this.f14906w = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m11324b(Function1 function1, C16617b c16617b) {
            function1.invoke(c16617b);
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C3662w(this.f14906w, 0), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bu2.x$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.view.metricslider.SliderKt$SliderBackground$3$1", m100430f = "Slider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;F)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f14907w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ float f14908x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f14909y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f14909y = function1;
        }

        /* JADX INFO: renamed from: f */
        public final Object m11325f(InterfaceC2994c0 interfaceC2994c0, float f13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(this.f14909y, interfaceC30057d);
            bVar.f14908x = f13;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m11325f((InterfaceC2994c0) obj, ((Number) obj2).floatValue(), (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            float f13 = this.f14908x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14907w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f14909y.invoke(new Float(f13));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m11290A(float f13, long j7, InterfaceC4351m interfaceC4351m, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m11322z(f13, j7, interfaceC4351m, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m11291B(long j7, Modifier modifier, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2053609494);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 8;
            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1099a.m3394p(1 * f13, modifier), null, 3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3427x);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f14 = 4;
            float f15 = 6 * f14;
            float f16 = ((float) 0.4d) * f14;
            AbstractC22989q.m66760a(AbstractC1102d.m3421r(m11296G(modifier, j7), f15, f16), c28655q, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(((float) 0.1d) * f13, modifier));
            AbstractC22989q.m66760a(AbstractC1102d.m3421r(m11296G(modifier, j7), f15, f16), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3657r(j7, modifier, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m11292C(long j7, Modifier modifier, int i13, Composer composer, int i14) {
        m11291B(j7, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final float m11293D(float f13, float f14, float f15) {
        return AbstractC12889b.m36283m(((f14 * f13) + f15) / f13, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: E */
    private static final Modifier m11294E(Modifier modifier, long j7) {
        float f13 = 4;
        float f14 = f13 * f13;
        return AbstractC37056f.m118994r(AbstractC1099a.m3394p(((float) 0.25d) * 8, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, modifier), j7, AbstractC33253j.m105489e(f14))), AbstractC33253j.m105489e(f14));
    }

    /* JADX INFO: renamed from: F */
    private static final Modifier m11295F(Modifier modifier, float f13, long j7) {
        return AbstractC31061c.m95629e(AbstractC1102d.m3406c(f13, AbstractC1102d.m3409f(1.0f, modifier)), (float) 0.3d, 4, j7);
    }

    /* JADX INFO: renamed from: G */
    private static final Modifier m11296G(Modifier modifier, long j7) {
        return AbstractC31061c.m95629e(modifier, 1, 4, j7);
    }

    /* JADX INFO: renamed from: m */
    public static final void m11309m(C3656q sliderItemState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(sliderItemState, "sliderItemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1042665477);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(sliderItemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C3595n(12);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            AbstractC22953f.m66714a(modifier3, C2299e.f9102E, false, AbstractC37817c.m121344e(771695835, c28655q, new C22931l(7, sliderItemState, function3)), c28655q, ((i15 >> 3) & 14) | 3120, 4);
            function2 = function3;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(i13, i14, 24, modifier2, function2, sliderItemState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m11310n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m11311o(final C3656q c3656q, final Function1 function1, final InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(c3656q.getFillPercentage(), null, "Slider", null, c28655q, 3072, 22);
            long jM11284a = c3656q.getBackgroundColor();
            int i15 = i14 & 14;
            boolean zM87153g = (i15 == 4) | c28655q.m87153g(c3656q) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                final int i16 = 0;
                objM87133R = new Function1() { // from class: bu2.t
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return AbstractC3663x.m11313q(BoxWithConstraints, c3656q, function1, ((Float) obj).floatValue());
                            default:
                                return AbstractC3663x.m11315s(BoxWithConstraints, c3656q, function1, (C16617b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C3595n(13);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function3 = (Function1) objM87133R2;
            boolean zM87153g2 = c28655q.m87153g(c3656q) | (i15 == 4) | c28655q.m87153g(function1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                final int i17 = 1;
                objM87133R3 = new Function1() { // from class: bu2.t
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                return AbstractC3663x.m11313q(BoxWithConstraints, c3656q, function1, ((Float) obj).floatValue());
                            default:
                                return AbstractC3663x.m11315s(BoxWithConstraints, c3656q, function1, (C16617b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            m11319w(jM11284a, function2, function3, (Function1) objM87133R3, AbstractC37817c.m121344e(-1541460389, c28655q, new C0003a0(8, c3656q, interfaceC28670t2M30588b)), null, c28655q, 24960, 32);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final float m11312p(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m11313q(InterfaceC23004v interfaceC23004v, C3656q c3656q, Function1 function1, float f13) {
        function1.invoke(new AbstractC3638a0.a(AbstractC12889b.m36283m(m11293D(C39169a.m124764h(((C1101c) interfaceC23004v).f4585b), c3656q.getFillPercentage(), f13 * (-1)), c3656q.getMinFillPercentage(), c3656q.getMaxFillPercentage())));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m11314r(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m11315s(InterfaceC23004v interfaceC23004v, C3656q c3656q, Function1 function1, C16617b c16617b) {
        function1.invoke(new AbstractC3638a0.a(AbstractC12889b.m36283m(1 - (Float.intBitsToFloat((int) (c16617b.f63937a & 4294967295L)) / C39169a.m124764h(((C1101c) interfaceC23004v).f4585b)), c3656q.getMinFillPercentage(), c3656q.getMaxFillPercentage())));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m11316t(final C3656q c3656q, InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m11322z(m11312p(interfaceC28670t2), c3656q.getForegroundColor(), AbstractC37817c.m121344e(847553838, c28655q, new InterfaceC4351m() { // from class: bu2.u
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC3663x.m11317u(c3656q, (Composer) obj, iIntValue);
                }
            }), null, c28655q, 384, 8);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m11317u(C3656q c3656q, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m11291B(c3656q.getSliderHandleColor(), C2314t.f9131w, c28655q, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m11318v(C3656q c3656q, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m11309m(c3656q, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b  */
    /* JADX WARN: Code duplicated, block: B:90:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public static final void m11319w(long j7, Function1 onDrag, Function1 onDragStopped, Function1 onTap, InterfaceC4351m sliderForeground, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z13;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(onDrag, "onDrag");
        AbstractC22676k.m65750j(onDragStopped, "onDragStopped");
        AbstractC22676k.m65750j(onTap, "onTap");
        AbstractC22676k.m65750j(sliderForeground, "sliderForeground");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-820591874);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onDrag) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onDragStopped) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onTap) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(sliderForeground) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i16 = i14 & 32;
        if (i16 == 0) {
            if ((196608 & i13) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM11294E = m11294E(modifier4, j7);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new a(onTap);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM11294E, C23454a0.f92919a, (PointerInputEventHandler) objM87133R);
                EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C3662w(onDrag, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC16427n1 interfaceC16427n1M46599b = AbstractC16412k1.m46599b((Function1) objM87133R2, c28655q);
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15 || objM87133R3 == c28676v0) {
                    objM87133R3 = new b(onDragStopped, null);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM46598a = AbstractC16412k1.m46598a(modifierM108903b, interfaceC16427n1M46599b, enumC16377d2, false, null, false, null, (Function3) objM87133R3, false, 188);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM46598a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC11895b.m32007z((i15 >> 12) & 14, sliderForeground, c28655q, true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3661v(j7, onDrag, onDragStopped, onTap, sliderForeground, modifier3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM11294E2 = m11294E(modifier4, j7);
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13) {
                objM87133R = new a(onTap);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(onTap);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM108903b2 = AbstractC34452c0.m108903b(modifierM11294E2, C23454a0.f92919a, (PointerInputEventHandler) objM87133R);
            EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C3662w(onDrag, 2);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3662w(onDrag, 2);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC16427n1 interfaceC16427n1M46599b2 = AbstractC16412k1.m46599b((Function1) objM87133R2, c28655q);
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z15) {
                objM87133R3 = new b(onDragStopped, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(onDragStopped, null);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM46598a2 = AbstractC16412k1.m46598a(modifierM108903b2, interfaceC16427n1M46599b2, enumC16377d3, false, null, false, null, (Function3) objM87133R3, false, 188);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9105H, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM46598a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC11895b.m32007z((i15 >> 12) & 14, sliderForeground, c28655q, true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3661v(j7, onDrag, onDragStopped, onTap, sliderForeground, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m11320x(Function1 function1, float f13) {
        function1.invoke(Float.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m11321y(long j7, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m11319w(j7, function1, function2, function3, interfaceC4351m, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public static final void m11322z(float f13, long j7, InterfaceC4351m sliderHandle, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(sliderHandle, "sliderHandle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-658021696);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(sliderHandle) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
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
                Modifier modifierM11295F = m11295F(modifier3, f13, j7);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9115x, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM11295F);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(1 * 8, modifier3));
                AbstractC11895b.m32007z((i15 >> 6) & 14, sliderHandle, c28655q, true);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3658s(f13, j7, sliderHandle, modifier3, i13, i14, 0);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
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
            Modifier modifierM11295F2 = m11295F(modifier3, f13, j7);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9115x, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM11295F2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(1 * 8, modifier3));
            AbstractC11895b.m32007z((i15 >> 6) & 14, sliderHandle, c28655q, true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3658s(f13, j7, sliderHandle, modifier3, i13, i14, 0);
        }
    }
}
