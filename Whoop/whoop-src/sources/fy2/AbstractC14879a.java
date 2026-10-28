package fy2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1637w1;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import cy1.C11186b;
import cy2.AbstractC11187a;
import d30.C11558r;
import eg.C13161j;
import f01.C13845b;
import fa0.C14294a;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gy2.C16282a;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import iz0.AbstractC21048g;
import iz0.C21054m;
import jf3.C21647a;
import kz2.AbstractC22927d;
import l83.C23454a0;
import nf3.C26669a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13989w1;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p698au1.C2066k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yb0.AbstractC39383f;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: fy2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a?\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"", "campaignId", "Lkotlin/Function1;", "Lcom/whoop/whooplabs/feature/navigation/c;", "Ll83/a0;", "onNavEvent", "q", "(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lfy2/b;", "viewState", "Lcy2/a;", "onViewEvent", "j", "(Lfy2/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lfy2/b$b;", "n", "(Lfy2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "t", "(Lfy2/b$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14879a {

    /* JADX INFO: renamed from: fy2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f55521w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21647a c21647a) {
            super(0);
            this.f55521w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f55521w;
        }
    }

    /* JADX INFO: renamed from: fy2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignschedule.view.CampaignScheduleScreenKt$CampaignScheduleScreen$1$1", m100430f = "CampaignScheduleScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55522w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16282a f55523x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f55524y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C16282a c16282a, int i13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55523x = c16282a;
            this.f55524y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f55523x, this.f55524y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f55522w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f55523x.m46108q(new AbstractC11187a.a(this.f55524y));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m42928j(InterfaceC14880b viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-405978159);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavEvent) ? 256 : 128;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (viewState.equals(InterfaceC14880b.c.f55531a)) {
            c28655q2.m87150e0(132821497);
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q = c28655q2;
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q2;
            if (viewState instanceof InterfaceC14880b.a) {
                c28655q.m87150e0(133058120);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC39833e.f171727l, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC39833e.f171734s, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC39833e.f171715B, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC39833e.f171716a, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                boolean z4 = ((i14 & 112) == 32) | ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState)));
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z4 || objM87133R == c28676v0) {
                    objM87133R = new C13989w1(8, onViewEvent, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C14294a(onNavEvent, 14);
                    c28655q.m87172p0(objM87133R2);
                }
                int i16 = 196608 | AbstractC33208p0.b.f138467h;
                int i17 = TextResource.C8688b.f25889c;
                AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, true, false, c8688b3, (InterfaceC4339a) objM87133R2, null, true, false, c28655q, i16 | (i17 << 3) | (i17 << 9) | (i17 << 21), 6, 2628);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof InterfaceC14880b.b)) {
                    throw AbstractC11895b.m32003v(697020271, c28655q, false);
                }
                c28655q.m87150e0(133807514);
                m42932n((InterfaceC14880b.b) viewState, onViewEvent, onNavEvent, c28655q, i14 & 1022);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(viewState, onViewEvent, onNavEvent, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m42929k(Function1 function1, InterfaceC14880b interfaceC14880b) {
        function1.invoke(new AbstractC11187a.a(((InterfaceC14880b.a) interfaceC14880b).getCampaignId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m42930l(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m42931m(InterfaceC14880b interfaceC14880b, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m42928j(interfaceC14880b, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: n */
    public static final void m42932n(InterfaceC14880b.b viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        InterfaceC14880b.b bVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1418295715);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 131) != 130)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
            m42938t(viewState, onNavEvent, c28655q, (i14 & 14) | ((i14 >> 3) & 112));
            float f13 = 2;
            float f14 = 8;
            float f15 = f13 * f14;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q, 1), 14)), f15, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            String strM42944c = viewState.getSubtitle();
            if (strM42944c == null) {
                c28655q.m87150e0(2013460517);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2013460518);
                AbstractC21048g.m58807M(strM42944c, AbstractC1099a.m3396r(c2314t, 0.0f, f15, 1), false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                c28655q.m87173q(false);
            }
            float f16 = 4;
            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, f16 * f14, 1), EnumC17744g.SOLID, null, null, null, 0L, 0L, null, c28655q, 54, 252);
            c28655q = c28655q;
            c28655q.m87150e0(896248841);
            for (C14881c c14881c : viewState.m42943b()) {
                TextResource textResourceM42949c = c14881c.getTitle();
                if (textResourceM42949c == null) {
                    c28655q.m87150e0(713555303);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(713555304);
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM42949c, c28655q, TextResource.$stable);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i16 = C38072d.f163054b;
                    C28655q c28655q2 = c28655q;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i16).getH4(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                String strM42947a = c14881c.getSubtitle();
                if (strM42947a == null) {
                    c28655q.m87150e0(713857429);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(713857430);
                    AbstractC21048g.m58807M(strM42947a, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f14, 0.0f, 0.0f, 13), false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                    c28655q.m87173q(false);
                }
                float f17 = f16 * f16;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
                c28655q.m87150e0(896270561);
                for (C14882d c14882d : c14881c.m42948b()) {
                    C39282o c39282oM42950a = c14882d.getItemState();
                    boolean zM87157i = c28655q.m87157i(viewState) | ((i14 & 896) == 256) | c28655q.m87157i(c14882d);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C11558r(onNavEvent, viewState, c14882d, 15);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC39281n.m125207c(null, c39282oM42950a, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 1);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13 * f16, c2314t));
            }
            bVar = viewState;
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            bVar = viewState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(bVar, onViewEvent, onNavEvent, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m42933o(Function1 function1, InterfaceC14880b.b bVar, C14882d c14882d) {
        function1.invoke(new AbstractC10840c.e(bVar.getCampaignId(), Integer.valueOf(c14882d.getSessionId())));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m42934p(InterfaceC14880b.b bVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m42932n(bVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m42935q(int i13, Function1 onNavEvent, Composer composer, int i14) {
        int i15;
        C28676v0 c28676v0;
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-278874101);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87157i(onNavEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            c28655q.m87152f0(1509148315);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v1) {
                c28676v0 = c28676v1;
                objM87133R = AbstractC21598x.m60668X(c38266c, null, new a(c21647aM114690r), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16282a.class), null, null);
                c28655q.m87172p0(objM87133R);
            } else {
                c28676v0 = c28676v1;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            C16282a c16282a = (C16282a) ((AbstractC1637w1) objM87133R);
            InterfaceC14880b interfaceC14880b = (InterfaceC14880b) AbstractC28683x.m87261o(c16282a.getViewState(), c28655q, 0).getValue();
            boolean zM87157i = c28655q.m87157i(c16282a) | ((i15 & 14) == 4);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(c16282a, i13, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            boolean zM87157i2 = c28655q.m87157i(c16282a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C13161j(c16282a, 13);
                c28655q.m87172p0(objM87133R3);
            }
            m42928j(interfaceC14880b, (Function1) objM87133R3, onNavEvent, c28655q, (i15 << 3) & 896);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2066k(onNavEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m42936r(C16282a c16282a, AbstractC11187a it) {
        AbstractC22676k.m65750j(it, "it");
        c16282a.m46108q(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m42937s(int i13, Function1 function1, int i14, Composer composer, int i15) {
        m42935q(i13, function1, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    private static final void m42938t(InterfaceC14880b.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(466441066);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC22953f.m66724m(C2314t.f9131w), 1 * f13, 2 * f13);
            AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getToolbarTitle(), null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), new TextResource.C8688b(AbstractC16277f.f62257L, null, i15, 0 == true ? 1 : 0)), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C14294a(function1, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3395q, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(bVar, function1, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m42939u(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m42940v(InterfaceC14880b.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m42938t(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
