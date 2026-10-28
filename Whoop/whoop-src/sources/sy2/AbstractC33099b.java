package sy2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import iz0.AbstractC21048g;
import iz0.C21054m;
import kz2.AbstractC22927d;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lz2.C24826b;
import ny2.AbstractC27299a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31912a;
import p733ry2.AbstractC31917f;
import p733ry2.AbstractC31920i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s01.C32049e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ty2.AbstractC34268a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sy2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lty2/a$a$a;", "viewState", "Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "d", "(Lty2/a$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33099b {

    /* JADX INFO: renamed from: sy2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.BtHrStepScreenKt$CampaignBtHrStep$1$1", m100430f = "BtHrStepScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138067w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f138068x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138068x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f138068x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f138067w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f138068x.invoke(AbstractC27299a.d.f109322a);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x02af  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0186  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0202  */
    /* JADX WARN: Code duplicated, block: B:84:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:90:0x022f  */
    /* JADX WARN: Code duplicated, block: B:94:0x028f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0299  */
    /* JADX WARN: Code duplicated, block: B:97:0x029b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: d */
    public static final void m104864d(AbstractC34268a.a.C42429a viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        Function1 function1;
        int i14;
        int iHashCode;
        C28676v0 c28676v0;
        float f13;
        float f14;
        int iHashCode2;
        float f15;
        int iHashCode3;
        float f16;
        String strM108425f;
        ?? r10;
        C2314t c2314t;
        ?? r14;
        Object obj;
        ?? r15;
        int i15;
        Object objM87133R;
        C28676v0 c28676v1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        ?? r16 = (C28655q) composer;
        r16.m87154g0(-1624394752);
        int i16 = (i13 & 6) == 0 ? i13 | (r16.m87157i(viewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i16 |= r16.m87157i(onViewEvent) ? 32 : 16;
        }
        if (r16.m87135U(i16 & 1, (i16 & 19) != 18)) {
            int i17 = i16 & 112;
            boolean z4 = i17 == 32;
            Object objM87133R2 = r16.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            Object obj2 = objM87133R2;
            if (z4 || objM87133R2 == c28676v2) {
                a aVar = new a(onViewEvent, null);
                r16.m87172p0(aVar);
                obj2 = aVar;
            }
            AbstractC28683x.m87253g(r16, (InterfaceC4351m) obj2, C23454a0.f92919a);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t2);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode4 = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = r16.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(r16, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            r16.m87158i0();
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(r16, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (r16.f115903S) {
                i14 = i16;
            } else {
                i14 = i16;
                if (!AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode4))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N);
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t2));
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, r16, 0);
                iHashCode = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM66722k);
                r16.m87158i0();
                c28676v0 = c28676v2;
                if (r16.f115903S) {
                    r16.m87163l(c0213j);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m2);
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N2);
                AbstractC31917f.m99349g(viewState, onViewEvent, r16, i14 & 126);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                    f14 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                    f14 = Float.MAX_VALUE;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(f13, true));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r16.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r16, modifierM3409f);
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m3);
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N3);
                f15 = 8;
                float f17 = ((float) 2.5d) * f15;
                float f18 = 1 * f15;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(C1100b.f4583a.mo3400a(c2314t2, C2299e.f9105H), AbstractC30060g.m92099U(0, r16, 1), 14), f17, f18, f17, 0.0f, 8);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, r16, 48);
                iHashCode3 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = r16.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(r16, modifierM3398t);
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m4);
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N4);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > f14) {
                    f16 = f14;
                } else {
                    f16 = 1.0f;
                }
                AbstractC22953f.m66715b(r16, new LayoutWeightElement(f16, true));
                strM108425f = viewState.getContent();
                if (strM108425f == null) {
                    r16.m87150e0(-189984404);
                    r16.m87173q(false);
                    r10 = 0;
                    c2314t = c2314t2;
                } else {
                    r16.m87150e0(-189984403);
                    r10 = 0;
                    c2314t = c2314t2;
                    AbstractC21048g.m58807M(AbstractC8693b.m21275i(strM108425f, r16, 0), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), false, AbstractC22927d.m66688a(r16, 0), null, 0, 0, 0, false, r16, (C21054m.f79836p << 9) | 48, 500);
                    r16.m87173q(false);
                }
                AbstractC22953f.m66715b(r16, AbstractC1102d.m3411h(f18, c2314t));
                r16.m87150e0(-1945773350);
                for (C24826b c24826b : viewState.m108426g()) {
                    if (i17 == 32) {
                        r15 = 1;
                    } else {
                        r15 = r10;
                    }
                    i15 = (r16.m87157i(c24826b) ? 1 : 0) | r15;
                    objM87133R = r16.m87133R();
                    if (i15 == 0) {
                        c28676v1 = c28676v0;
                        if (objM87133R == c28676v1) {
                        }
                        AbstractC31912a.m99275d(c24826b, (InterfaceC4339a) objM87133R, r16, TextResource.$stable, r10);
                        c28676v0 = c28676v1;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    objM87133R = new C33107j(1, onViewEvent, c24826b);
                    r16.m87172p0(objM87133R);
                    AbstractC31912a.m99275d(c24826b, (InterfaceC4339a) objM87133R, r16, TextResource.$stable, r10);
                    c28676v0 = c28676v1;
                }
                function1 = onViewEvent;
                C28676v0 c28676v3 = c28676v0;
                r16.m87173q(r10);
                r16.m87173q(true);
                r16.m87173q(true);
                TextResource textResourceM108427h = viewState.getPrimaryButton();
                boolean zM108428i = viewState.getIsPrimaryButtonEnabled();
                if (r20 == 32) {
                    r14 = 1;
                } else {
                    r14 = r10;
                }
                Object objM87133R3 = r16.m87133R();
                obj = objM87133R3;
                if (r14 == 0 || objM87133R3 == c28676v3) {
                    C33098a c33098a = new C33098a(function1, 0);
                    r16.m87172p0(c33098a);
                    obj = c33098a;
                }
                AbstractC31920i.m99360c(textResourceM108427h, zM108428i, null, (InterfaceC4339a) obj, r16, TextResource.$stable, 4);
                r16.m87173q(true);
                r16.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode4, r16, iHashCode4, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(r16, c0209i5, modifierM118962N);
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t2));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, r16, 0);
            iHashCode = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = r16.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(r16, modifierM66722k2);
            r16.m87158i0();
            c28676v0 = c28676v2;
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m5);
            if (r16.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, r16, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(r16, c0209i5, modifierM118962N5);
            AbstractC31917f.m99349g(viewState, onViewEvent, r16, i14 & 126);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
                f14 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
                f14 = Float.MAX_VALUE;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(f13, true));
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode2 = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = r16.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(r16, modifierM3409f2);
            r16.m87158i0();
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            AbstractC28683x.m87239G(r16, c0209i, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m6);
            if (r16.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(r16, c0209i5, modifierM118962N6);
            f15 = 8;
            float f19 = ((float) 2.5d) * f15;
            float f110 = 1 * f15;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(C1100b.f4583a.mo3400a(c2314t2, C2299e.f9105H), AbstractC30060g.m92099U(0, r16, 1), 14), f19, f110, f19, 0.0f, 8);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9111N, r16, 48);
            iHashCode3 = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = r16.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(r16, modifierM3398t2);
            r16.m87158i0();
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m7);
            if (r16.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(r16, c0209i5, modifierM118962N7);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > f14) {
                f16 = f14;
            } else {
                f16 = 1.0f;
            }
            AbstractC22953f.m66715b(r16, new LayoutWeightElement(f16, true));
            strM108425f = viewState.getContent();
            if (strM108425f == null) {
                r16.m87150e0(-189984404);
                r16.m87173q(false);
                r10 = 0;
                c2314t = c2314t2;
            } else {
                r16.m87150e0(-189984403);
                r10 = 0;
                c2314t = c2314t2;
                AbstractC21048g.m58807M(AbstractC8693b.m21275i(strM108425f, r16, 0), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), false, AbstractC22927d.m66688a(r16, 0), null, 0, 0, 0, false, r16, (C21054m.f79836p << 9) | 48, 500);
                r16.m87173q(false);
            }
            AbstractC22953f.m66715b(r16, AbstractC1102d.m3411h(f110, c2314t));
            r16.m87150e0(-1945773350);
            while (r0.hasNext()) {
                if (i17 == 32) {
                    r15 = 1;
                } else {
                    r15 = r10;
                }
                i15 = (r16.m87157i(c24826b) ? 1 : 0) | r15;
                objM87133R = r16.m87133R();
                if (i15 == 0) {
                    c28676v1 = c28676v0;
                    if (objM87133R == c28676v1) {
                    }
                    AbstractC31912a.m99275d(c24826b, (InterfaceC4339a) objM87133R, r16, TextResource.$stable, r10);
                    c28676v0 = c28676v1;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R = new C33107j(1, onViewEvent, c24826b);
                r16.m87172p0(objM87133R);
                AbstractC31912a.m99275d(c24826b, (InterfaceC4339a) objM87133R, r16, TextResource.$stable, r10);
                c28676v0 = c28676v1;
            }
            function1 = onViewEvent;
            C28676v0 c28676v4 = c28676v0;
            r16.m87173q(r10);
            r16.m87173q(true);
            r16.m87173q(true);
            TextResource textResourceM108427h2 = viewState.getPrimaryButton();
            boolean zM108428i2 = viewState.getIsPrimaryButtonEnabled();
            if (r20 == 32) {
                r14 = 1;
            } else {
                r14 = r10;
            }
            Object objM87133R4 = r16.m87133R();
            obj = objM87133R4;
            if (r14 == 0) {
                C33098a c33098a2 = new C33098a(function1, 0);
                r16.m87172p0(c33098a2);
                obj = c33098a2;
            } else {
                C33098a c33098a3 = new C33098a(function1, 0);
                r16.m87172p0(c33098a3);
                obj = c33098a3;
            }
            AbstractC31920i.m99360c(textResourceM108427h2, zM108428i2, null, (InterfaceC4339a) obj, r16, TextResource.$stable, 4);
            r16.m87173q(true);
            r16.m87173q(true);
        } else {
            function1 = onViewEvent;
            r16.m87138X();
        }
        C28677v1 c28677v1M87180u = r16.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, function1, (InterfaceC23459e) onNavEvent, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104865e(Function1 function1, C24826b c24826b) {
        function1.invoke(new AbstractC27299a.c(c24826b.getAddress()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m104866f(Function1 function1) {
        function1.invoke(AbstractC27299a.o.f109339a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104867g(AbstractC34268a.a.C42429a c42429a, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m104864d(c42429a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
