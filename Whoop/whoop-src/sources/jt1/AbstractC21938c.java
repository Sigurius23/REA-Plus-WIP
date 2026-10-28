package jt1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ht1.EnumC17628e;
import ig0.C18464d;
import io.sentry.config.AbstractC20301a;
import it1.InterfaceC20927a;
import it1.InterfaceC20929c;
import j11.AbstractC21211n;
import j11.C21214q;
import jp1.C21852d;
import jp1.C21860l;
import jp1.C21862n;
import jp2.C21875f;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.AbstractC27289x0;
import ny0.EnumC27284v;
import ny0.EnumC27291y0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
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
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p699b70.C2777c;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rs1.AbstractC31794f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: jt1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lit1/c;", "viewState", "Lkotlin/Function1;", "Lit1/a$f;", "Ll83/a0;", "onViewEvent", "Lit1/a$d;", "onNavigationEvent", "C", "(Lit1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lit1/a;", "onEvent", "B", "(Lit1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lit1/c$b;", "p", "(Lit1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lit1/c$a;", "x", "(Lit1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21938c {

    /* JADX INFO: renamed from: jt1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.deviceloaction.view.LabradorDeviceLocationScreenKt$FullScreenModalScreens$1$3$1", m100430f = "LabradorDeviceLocationScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f84719w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC20929c.a f84720x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f84721y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC20929c.a aVar, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84720x = aVar;
            this.f84721y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f84720x, this.f84721y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f84719w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC20927a interfaceC20927aM58064b = this.f84720x.getFollowUpEvent();
            if (interfaceC20927aM58064b != null) {
                this.f84721y.invoke(interfaceC20927aM58064b);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m62489A(InterfaceC20929c.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m62520x(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m62490B(InterfaceC20929c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(190675744);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState instanceof InterfaceC20929c.a) {
            c28655q.m87150e0(-1444196576);
            m62520x((InterfaceC20929c.a) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        } else {
            if (!(viewState instanceof InterfaceC20929c.b)) {
                throw AbstractC11895b.m32003v(-1444198965, c28655q, false);
            }
            c28655q.m87150e0(-1444192802);
            m62512p((InterfaceC20929c.b) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(viewState, onEvent, i13, 19);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m62491C(InterfaceC20929c viewState, Function1 onViewEvent, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1290826893);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C21875f(9);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            int i17 = i15 & 896;
            boolean z4 = i17 == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C21860l(function1, 13);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
            boolean z13 = (i17 == 256) | ((i15 & 112) == 32);
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = new C2777c(function1, 6, onViewEvent);
                c28655q.m87172p0(objM87133R3);
            }
            m62490B(viewState, (Function1) objM87133R3, c28655q, i15 & 14);
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(i13, i14, 5, viewState, function2, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m62492D(InterfaceC20927a.d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m62493E(Function1 function1) {
        function1.invoke(InterfaceC20927a.a.f78850a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m62494F(Function1 function1, Function1 function2, InterfaceC20927a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC20927a.d) {
            function1.invoke(event);
        } else {
            if (!(event instanceof InterfaceC20927a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            function2.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m62495G(InterfaceC20929c interfaceC20929c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m62491C(interfaceC20929c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m62496H(InterfaceC20929c interfaceC20929c, Function1 function1, int i13, Composer composer, int i14) {
        m62490B(interfaceC20929c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:115:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:120:0x0531  */
    /* JADX WARN: Code duplicated, block: B:122:0x0559  */
    /* JADX WARN: Code duplicated, block: B:123:0x0565  */
    /* JADX WARN: Code duplicated, block: B:126:0x0571  */
    /* JADX WARN: Code duplicated, block: B:127:0x0573  */
    /* JADX WARN: Code duplicated, block: B:130:0x057b  */
    /* JADX WARN: Code duplicated, block: B:132:0x057f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0588  */
    /* JADX WARN: Code duplicated, block: B:137:0x058d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0599 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x0616  */
    /* JADX WARN: Code duplicated, block: B:150:0x0653  */
    /* JADX WARN: Code duplicated, block: B:157:0x0666  */
    /* JADX WARN: Code duplicated, block: B:160:0x066c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0674  */
    /* JADX WARN: Code duplicated, block: B:167:0x067c  */
    /* JADX INFO: renamed from: p */
    private static final void m62512p(InterfaceC20929c.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        InterfaceC20929c.b bVar2;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        C28676v0 c28676v0;
        C28676v0 c28676v1;
        int iHashCode;
        C28655q c28655q2;
        float f13;
        float f14;
        InterfaceC28601c1 interfaceC28601c1;
        int i15;
        C28676v0 c28676v2;
        boolean z4;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z14;
        InterfaceC20929c.b bVar3;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        Function1 function2 = function1;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1227960150);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q3.m87153g(bVar) : c28655q3.m87157i(bVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(function2) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q3.m87135U(i16 & 1, (i16 & 19) != 18)) {
            Object objM87133R4 = c28655q3.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (objM87133R4 == c28676v3) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC30802r.m94757f(c2314t, 1.0f), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q3, 54);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM92116f0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getPageTitle(), null, Integer.valueOf(bVar.getToolbarIcon()), AbstractC30060g.m92103Y(c28655q3, AbstractC31794f.f131647b), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            int i17 = i16 & 112;
            boolean z17 = i17 == 32;
            Object objM87133R5 = c28655q3.m87133R();
            if (z17 || objM87133R5 == c28676v3) {
                objM87133R5 = new C21860l(function2, 14);
                c28655q3.m87172p0(objM87133R5);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R5, null, null, c28655q3, AbstractC6721d.a.f25641r << 3, 53);
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(bVar.getImage(), c28655q3, 0), AbstractC30060g.m92103Y(c28655q3, AbstractC31794f.f131615A), AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168202d, 0.0f, null, c28655q3, 24960, 104);
            float f15 = 3;
            float f16 = 8;
            float f17 = f15 * f16;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2);
            TextResource textResourceM58087p = bVar.getToggleTitle();
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM58087p, c28655q3, i18);
            C38072d c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q3, i19).getH4();
            long jM125430y = c38072d.m121949b(c28655q3, i19).getBrandWhite();
            int i24 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3396r, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q3, 48, i24, 196600);
            AbstractC11266d.m30469w((float) 1.5d, f16, c2314t, c28655q3);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q3, 0);
            int iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3396r2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c0213j = c0213j2;
                c28655q3.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f18 = 4;
            float f19 = f15 * f18;
            Modifier modifierM118994r = AbstractC37056f.m118994r(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), AbstractC33253j.m105489e(f19));
            TextResource textResourceM58082k = bVar.getLeftToggleText();
            C0209i c0209i6 = c0209i;
            EnumC27291y0 enumC27291y0 = EnumC27291y0.TextLarge;
            boolean z18 = bVar.getSelectedWrist() == EnumC17628e.LEFT;
            boolean z19 = i17 == 32;
            Object objM87133R6 = c28655q3.m87133R();
            if (z19 || objM87133R6 == c28676v3) {
                objM87133R6 = new C21862n(function1, 8);
                c28655q3.m87172p0(objM87133R6);
            }
            int i25 = 113246208 | i18;
            C0213j c0213j3 = c0213j;
            AbstractC27289x0.m82331c(textResourceM58082k, null, null, modifierM118994r, 0L, z18, false, enumC27291y0, true, (Function1) objM87133R6, c28655q3, i25, 86);
            AbstractC38963t7.m124386p(1, f16, c2314t, c28655q3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), AbstractC33253j.m105489e(f19));
            TextResource textResourceM58085n = bVar.getRightToggleText();
            boolean z24 = bVar.getSelectedWrist() == EnumC17628e.RIGHT;
            boolean z25 = i17 == 32;
            Object objM87133R7 = c28655q3.m87133R();
            if (z25) {
                c28676v0 = c28676v3;
            } else {
                if (objM87133R7 != c28676v0) {
                    c28676v0 = c28676v3;
                }
                c28676v1 = c28676v0;
                AbstractC27289x0.m82331c(textResourceM58085n, null, null, modifierM118994r2, 0L, z24, false, enumC27291y0, true, (Function1) objM87133R7, c28655q3, i25, 86);
                c28655q3.m87173q(true);
                float f24 = 2 * f16;
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f24, c2314t));
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9108K, c28655q3, 48);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3396r3);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j3);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N3);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(bVar.getInfoIcon(), c28655q3, 6), null, AbstractC1102d.m3419p(f18 * f18, c2314t), c38072d.m121949b(c28655q3, i19).getRecovery(), c28655q3, 432, 0);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f24, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getInfoText(), c28655q3, i18), null, c38072d.m121949b(c28655q3, i19).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i19).getB2(), null, c28655q3, 0, i24, 196602);
                c28655q3.m87173q(true);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f16 * f16, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getInstruction(), c28655q3, i18), AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), c38072d.m121949b(c28655q3, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i19).getT2(), null, c28655q3, 48, i24, 196600);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f24, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getInstructionDescription(), c28655q3, i18), AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), c38072d.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i19).getB2(), null, c28655q3, 48, i24, 196600);
                c28655q2 = c28655q3;
                f13 = f18 * f16;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
                if (((Boolean) interfaceC28601c3.getValue()).booleanValue()) {
                    c28655q2.m87150e0(-1196331529);
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC31794f.f131637S);
                    TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC31794f.f131636R);
                    TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC31794f.f131679r);
                    TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC31794f.f131649c);
                    EnumC39333f enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v1) {
                        interfaceC28601c2 = interfaceC28601c3;
                        objM87133R2 = new C21937b(0, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        interfaceC28601c2 = interfaceC28601c3;
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    if (i17 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i16 & 14) != 4) {
                        if ((i16 & 8) != 0) {
                            bVar3 = bVar;
                            if (c28655q2.m87157i(bVar3)) {
                            }
                            z16 = z14 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16 || objM87133R3 == c28676v1) {
                                objM87133R3 = new C21214q(15, function1, bVar3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                            int i26 = TextResource.C8688b.f25889c;
                            interfaceC28601c1 = interfaceC28601c2;
                            i15 = i17;
                            c28676v2 = c28676v1;
                            f14 = f13;
                            AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, false, enumC39333f, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a2, null, null, null, c28655q2, (i26 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i26 << 6) | (i26 << 9) | (i26 << 27), 0, 384, 247463377);
                            c28655q2 = c28655q2;
                            z4 = false;
                            c28655q2.m87173q(false);
                        } else {
                            bVar3 = bVar;
                        }
                        z15 = false;
                        z16 = z14 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            objM87133R3 = new C21214q(15, function1, bVar3);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C21214q(15, function1, bVar3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                        int i27 = TextResource.C8688b.f25889c;
                        interfaceC28601c1 = interfaceC28601c2;
                        i15 = i17;
                        c28676v2 = c28676v1;
                        f14 = f13;
                        AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, false, enumC39333f, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a3, null, null, null, c28655q2, (i27 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i27 << 6) | (i27 << 9) | (i27 << 27), 0, 384, 247463377);
                        c28655q2 = c28655q2;
                        z4 = false;
                        c28655q2.m87173q(false);
                    } else {
                        bVar3 = bVar;
                    }
                    z15 = true;
                    z16 = z14 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        objM87133R3 = new C21214q(15, function1, bVar3);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C21214q(15, function1, bVar3);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    int i28 = TextResource.C8688b.f25889c;
                    interfaceC28601c1 = interfaceC28601c2;
                    i15 = i17;
                    c28676v2 = c28676v1;
                    f14 = f13;
                    AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, false, enumC39333f, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a4, null, null, null, c28655q2, (i28 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i28 << 6) | (i28 << 9) | (i28 << 27), 0, 384, 247463377);
                    c28655q2 = c28655q2;
                    z4 = false;
                    c28655q2.m87173q(false);
                } else {
                    f14 = f13;
                    interfaceC28601c1 = interfaceC28601c3;
                    i15 = i17;
                    c28676v2 = c28676v1;
                    z4 = false;
                    c28655q2.m87150e0(-1195665246);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f17, f14);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM21274h2 = AbstractC8693b.m21274h(bVar.getPrimaryButtonText(), c28655q2, i18);
                long jM125371X = c38072d.m121949b(c28655q2, i19).getRecovery();
                boolean zM58090s = bVar.getIsPrimaryButtonEnabled();
                if ((i16 & 14) != 4) {
                    bVar2 = bVar;
                    boolean z26 = ((i16 & 8) == 0 && c28655q2.m87157i(bVar2)) ? true : z4;
                    if (i15 == 32) {
                        z4 = true;
                    }
                    z13 = z26 | z4;
                    objM87133R = c28655q2.m87133R();
                    if (z13 || objM87133R == c28676v2) {
                        objM87133R = new C18656a0(bVar2, interfaceC28601c1, function1, 14);
                        c28655q2.m87172p0(objM87133R);
                    }
                    C28655q c28655q4 = c28655q2;
                    function2 = function1;
                    AbstractC27282u.m82292h(modifierM3395q, enumC27284v, strM21274h2, zM58090s, jM125371X, null, false, (InterfaceC4339a) objM87133R, c28655q4, 54, 96);
                    c28655q = c28655q4;
                    c28655q.m87173q(true);
                } else {
                    bVar2 = bVar;
                }
                if (i15 == 32) {
                    z4 = true;
                }
                z13 = z26 | z4;
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C18656a0(bVar2, interfaceC28601c1, function1, 14);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C18656a0(bVar2, interfaceC28601c1, function1, 14);
                    c28655q2.m87172p0(objM87133R);
                }
                C28655q c28655q5 = c28655q2;
                function2 = function1;
                AbstractC27282u.m82292h(modifierM3395q, enumC27284v, strM21274h2, zM58090s, jM125371X, null, false, (InterfaceC4339a) objM87133R, c28655q5, 54, 96);
                c28655q = c28655q5;
                c28655q.m87173q(true);
            }
            c28676v0 = c28676v3;
            objM87133R7 = new C21862n(function1, 9);
            c28655q3.m87172p0(objM87133R7);
            c28676v1 = c28676v0;
            AbstractC27289x0.m82331c(textResourceM58085n, null, null, modifierM118994r2, 0L, z24, false, enumC27291y0, true, (Function1) objM87133R7, c28655q3, i25, 86);
            c28655q3.m87173q(true);
            float f25 = 2 * f16;
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f25, c2314t));
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, C2299e.f9108K, c28655q3, 48);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3396r4);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j3);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N4);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(bVar.getInfoIcon(), c28655q3, 6), null, AbstractC1102d.m3419p(f18 * f18, c2314t), c38072d.m121949b(c28655q3, i19).getRecovery(), c28655q3, 432, 0);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f25, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getInfoText(), c28655q3, i18), null, c38072d.m121949b(c28655q3, i19).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i19).getB2(), null, c28655q3, 0, i24, 196602);
            c28655q3.m87173q(true);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f16 * f16, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getInstruction(), c28655q3, i18), AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), c38072d.m121949b(c28655q3, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i19).getT2(), null, c28655q3, 48, i24, 196600);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f25, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getInstructionDescription(), c28655q3, i18), AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), c38072d.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i19).getB2(), null, c28655q3, 48, i24, 196600);
            c28655q2 = c28655q3;
            f13 = f18 * f16;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
            if (((Boolean) interfaceC28601c3.getValue()).booleanValue()) {
                c28655q2.m87150e0(-1196331529);
                TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC31794f.f131637S);
                TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC31794f.f131636R);
                TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC31794f.f131679r);
                TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC31794f.f131649c);
                EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v1) {
                    interfaceC28601c2 = interfaceC28601c3;
                    objM87133R2 = new C21937b(0, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    interfaceC28601c2 = interfaceC28601c3;
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        bVar3 = bVar;
                        if (c28655q2.m87157i(bVar3)) {
                        }
                        z16 = z14 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            objM87133R3 = new C21214q(15, function1, bVar3);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C21214q(15, function1, bVar3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                        int i29 = TextResource.C8688b.f25889c;
                        interfaceC28601c1 = interfaceC28601c2;
                        i15 = i17;
                        c28676v2 = c28676v1;
                        f14 = f13;
                        AbstractC21211n.m59497o(null, c8688bM21277k5, c8688bM21277k6, c8688bM21277k7, false, enumC39333f2, null, null, null, c8688bM21277k8, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a5, null, interfaceC4339a6, null, null, null, c28655q2, (i29 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i29 << 6) | (i29 << 9) | (i29 << 27), 0, 384, 247463377);
                        c28655q2 = c28655q2;
                        z4 = false;
                        c28655q2.m87173q(false);
                    } else {
                        bVar3 = bVar;
                    }
                    z15 = false;
                    z16 = z14 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        objM87133R3 = new C21214q(15, function1, bVar3);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C21214q(15, function1, bVar3);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    int i210 = TextResource.C8688b.f25889c;
                    interfaceC28601c1 = interfaceC28601c2;
                    i15 = i17;
                    c28676v2 = c28676v1;
                    f14 = f13;
                    AbstractC21211n.m59497o(null, c8688bM21277k5, c8688bM21277k6, c8688bM21277k7, false, enumC39333f2, null, null, null, c8688bM21277k8, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a5, null, interfaceC4339a7, null, null, null, c28655q2, (i210 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i210 << 6) | (i210 << 9) | (i210 << 27), 0, 384, 247463377);
                    c28655q2 = c28655q2;
                    z4 = false;
                    c28655q2.m87173q(false);
                } else {
                    bVar3 = bVar;
                }
                z15 = true;
                z16 = z14 | z15;
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    objM87133R3 = new C21214q(15, function1, bVar3);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C21214q(15, function1, bVar3);
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R3;
                int i211 = TextResource.C8688b.f25889c;
                interfaceC28601c1 = interfaceC28601c2;
                i15 = i17;
                c28676v2 = c28676v1;
                f14 = f13;
                AbstractC21211n.m59497o(null, c8688bM21277k5, c8688bM21277k6, c8688bM21277k7, false, enumC39333f2, null, null, null, c8688bM21277k8, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a5, null, interfaceC4339a8, null, null, null, c28655q2, (i211 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i211 << 6) | (i211 << 9) | (i211 << 27), 0, 384, 247463377);
                c28655q2 = c28655q2;
                z4 = false;
                c28655q2.m87173q(false);
            } else {
                f14 = f13;
                interfaceC28601c1 = interfaceC28601c3;
                i15 = i17;
                c28676v2 = c28676v1;
                z4 = false;
                c28655q2.m87150e0(-1195665246);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f17, f14);
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM21274h3 = AbstractC8693b.m21274h(bVar.getPrimaryButtonText(), c28655q2, i18);
            long jM125371X2 = c38072d.m121949b(c28655q2, i19).getRecovery();
            boolean zM58090s2 = bVar.getIsPrimaryButtonEnabled();
            if ((i16 & 14) != 4) {
                bVar2 = bVar;
                if ((i16 & 8) == 0) {
                }
                if (i15 == 32) {
                    z4 = true;
                }
                z13 = z26 | z4;
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C18656a0(bVar2, interfaceC28601c1, function1, 14);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C18656a0(bVar2, interfaceC28601c1, function1, 14);
                    c28655q2.m87172p0(objM87133R);
                }
                C28655q c28655q6 = c28655q2;
                function2 = function1;
                AbstractC27282u.m82292h(modifierM3395q2, enumC27284v2, strM21274h3, zM58090s2, jM125371X2, null, false, (InterfaceC4339a) objM87133R, c28655q6, 54, 96);
                c28655q = c28655q6;
                c28655q.m87173q(true);
            } else {
                bVar2 = bVar;
            }
            if (i15 == 32) {
                z4 = true;
            }
            z13 = z26 | z4;
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C18656a0(bVar2, interfaceC28601c1, function1, 14);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C18656a0(bVar2, interfaceC28601c1, function1, 14);
                c28655q2.m87172p0(objM87133R);
            }
            C28655q c28655q7 = c28655q2;
            function2 = function1;
            AbstractC27282u.m82292h(modifierM3395q2, enumC27284v2, strM21274h3, zM58090s2, jM125371X2, null, false, (InterfaceC4339a) objM87133R, c28655q7, 54, 96);
            c28655q = c28655q7;
            c28655q.m87173q(true);
        } else {
            bVar2 = bVar;
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(bVar2, function2, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m62513q(Function1 function1) {
        function1.invoke(InterfaceC20927a.a.f78850a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m62514r(Function1 function1, boolean z4) {
        function1.invoke(new InterfaceC20927a.e(EnumC17628e.LEFT));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m62515s(Function1 function1, boolean z4) {
        function1.invoke(new InterfaceC20927a.e(EnumC17628e.RIGHT));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m62516t(InterfaceC28601c1 interfaceC28601c1) {
        interfaceC28601c1.setValue(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m62517u(Function1 function1, InterfaceC20929c.b bVar) {
        EnumC17628e enumC17628eM58086o = bVar.getSelectedWrist();
        if (enumC17628eM58086o == null) {
            enumC17628eM58086o = EnumC17628e.RIGHT;
        }
        function1.invoke(new InterfaceC20927a.c(enumC17628eM58086o.name()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m62518v(InterfaceC20929c.b bVar, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        EnumC17628e enumC17628eM58086o = bVar.getSelectedWrist();
        if (enumC17628eM58086o != null) {
            if (bVar.getWillOverwriteReading()) {
                interfaceC28601c1.setValue(Boolean.TRUE);
            } else {
                function1.invoke(new InterfaceC20927a.c(enumC17628eM58086o.name()));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m62519w(InterfaceC20929c.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m62512p(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m62520x(final InterfaceC20929c.a aVar, final Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(658996273);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            AbstractC33208p0 abstractC33208p0M58070h = aVar.getType();
            TextResource textResourceM58069g = aVar.getSupportText();
            TextResource textResourceM58066d = aVar.getPrimaryButtonText();
            int i16 = i15 & 112;
            boolean zM87157i = c28655q.m87157i(aVar) | (i16 == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i17 = 0;
                objM87133R = new InterfaceC4339a() { // from class: jt1.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return AbstractC21938c.m62521y(aVar, function1);
                            default:
                                return AbstractC21938c.m62522z(aVar, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            TextResource textResourceM58068f = aVar.getSecondaryButtonText();
            boolean zM87157i2 = c28655q.m87157i(aVar) | (i16 == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i18 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: jt1.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return AbstractC21938c.m62521y(aVar, function1);
                            default:
                                return AbstractC21938c.m62522z(aVar, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i19 = 196608 | AbstractC33208p0.f138461d;
            int i24 = TextResource.$stable;
            AbstractC33199m0.m105214F(abstractC33208p0M58070h, textResourceM58069g, null, textResourceM58066d, interfaceC4339a, true, false, textResourceM58068f, interfaceC4339a2, null, false, false, c28655q, i19 | (i24 << 3) | (i24 << 9) | (i24 << 21), 0, 3652);
            InterfaceC20927a interfaceC20927aM58064b = aVar.getFollowUpEvent();
            boolean zM87157i3 = c28655q.m87157i(aVar) | (i16 == 32);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                function2 = function1;
                objM87133R3 = new a(aVar, function2, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                function2 = function1;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, interfaceC20927aM58064b);
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(aVar, function2, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m62521y(InterfaceC20929c.a aVar, Function1 function1) {
        InterfaceC20927a interfaceC20927aM58065c = aVar.getPrimaryButtonClickEvent();
        if (interfaceC20927aM58065c != null) {
            function1.invoke(interfaceC20927aM58065c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m62522z(InterfaceC20929c.a aVar, Function1 function1) {
        InterfaceC20927a interfaceC20927aM58067e = aVar.getSecondaryButtonClickEvent();
        if (interfaceC20927aM58067e != null) {
            function1.invoke(interfaceC20927aM58067e);
        }
        return C23454a0.f92919a;
    }
}
