package p733ry2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2108h;
import b30.C2572m1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.WhoopLabsScreenModel;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import gb1.AbstractC15673b0;
import hg3.AbstractC17269i;
import io.sentry.config.AbstractC20301a;
import iz0.AbstractC21048g;
import iz0.C21054m;
import j02.C21173v0;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22575j;
import kotlin.C2026r;
import kz2.AbstractC22926c;
import kz2.AbstractC22927d;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import nx1.C27225g;
import ny0.AbstractC27292z;
import ny2.AbstractC27299a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17911t;
import p208i2.C17903p;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p730qt2.C30599e;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p90.C29000h;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qn0.C30515j;
import r83.EnumC31071a;
import rx0.C31901f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sy2.AbstractC33099b;
import sy2.AbstractC33102e;
import sy2.AbstractC33103f;
import sy2.AbstractC33108k;
import sy2.AbstractC33110m;
import sy2.AbstractC33111n;
import sy2.AbstractC33113p;
import sy2.AbstractC33114q;
import sy2.AbstractC33117t;
import ty2.AbstractC34268a;
import ty2.AbstractC34269b;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ry2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lty2/a;", "viewState", "", "shouldShowWebView", "Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "u", "(Lty2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lty2/a$i;", "N", "(Lty2/a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31916e {

    /* JADX INFO: renamed from: ry2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.CampaignStepsScreenKt$CampaignStepsScreen$1$1$1$1", m100430f = "CampaignStepsScreen.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132558w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f132559x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f132559x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f132559x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132558w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f132559x;
                this.f132558w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ry2.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.CampaignStepsScreenKt$CampaignStepsScreen$2$10$1", m100430f = "CampaignStepsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132560w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f132561x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34268a f132562y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, AbstractC34268a abstractC34268a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f132561x = function1;
            this.f132562y = abstractC34268a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f132561x, this.f132562y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f132560w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C21173v0 c21173v0 = null;
            this.f132561x.invoke(new AbstractC10840c.i(new C9598e(AppScreen.C9414s6.f27926w, new WhoopLabsScreenModel(new Integer(((AbstractC34268a.b) this.f132562y).getCampaignId()), (Integer) null, (String) null, 6, (DefaultConstructorMarker) null), c21173v0, 4, 0 == true ? 1 : 0)));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ry2.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.view.CampaignStepsScreenKt$CampaignStepsScreen$modalBottomHandler$1$1$1", m100430f = "CampaignStepsScreen.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132563w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f132564x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f132564x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f132564x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132563w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f132564x;
                this.f132563w = 1;
                if (c15199y3.m43225f(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m99301A(Function1 function1) {
        function1.invoke(AbstractC10840c.g.f33264a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m99302B(Function1 function1, AbstractC34268a abstractC34268a) {
        function1.invoke(new AbstractC27299a.r(((AbstractC34268a.d) abstractC34268a).getDeviceAddress()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m99303C(Function1 function1) {
        function1.invoke(AbstractC27299a.j.f109332a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m99304D(Function1 function1) {
        function1.invoke(AbstractC27299a.i.f109331a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m99305E(Function1 function1) {
        function1.invoke(AbstractC27299a.f.f109324a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m99306F(Function1 function1, AbstractC27299a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m99307G(Function1 function1) {
        function1.invoke(AbstractC27299a.v.f109347a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m99308H(Function1 function1) {
        function1.invoke(AbstractC27299a.s.f109343a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m99309I(Function1 function1) {
        function1.invoke(AbstractC27299a.f.f109324a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m99310J(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m99311K(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m99312L() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m99313M(AbstractC34268a abstractC34268a, boolean z4, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m99337u(abstractC34268a, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x02b3  */
    /* JADX INFO: renamed from: N */
    public static final void m99314N(AbstractC34268a.i viewState, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        AbstractC34268a.i iVar;
        boolean z4;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-148489658);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 131) != 130)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.3f, null, c28655q, 221616, 72);
            Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
            C17909s c17909s = AbstractC17911t.f69612b;
            C17919x c17919x = new C17919x(C17919x.f69636m);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierMo3401b, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(c17919x, new C17919x(c38072d.m121949b(c28655q, i15).getBlack50()), new C17919x(c38072d.m121949b(c28655q, i15).getBlack70()), new C17919x(C17919x.f69625b)), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f13 * f14, 5 * f14), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(viewState.getIcon(), c28655q, 0), "", c2314t, null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q, i15).getAccentAction(), 5), c28655q, 432, 56);
            float f15 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f15, c2314t));
            TextResource textResourceM108514e = viewState.getText();
            int i16 = TextResource.$stable;
            boolean z13 = false;
            int i17 = i14;
            AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResourceM108514e, c28655q, i16), null, false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 502);
            AbstractC11266d.m30469w(11, f15, c2314t, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM108511b = viewState.getCta();
            C13825t c13825tM48880a = AbstractC17269i.m48880a(f13, c38072d.m121949b(c28655q, i15).getBrandWhite());
            float f16 = f15 * 16;
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i15).getTransparent(), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
            boolean z14 = (i17 & 896) == 256;
            if ((i17 & 14) != 4) {
                if ((i17 & 8) != 0) {
                    iVar = viewState;
                    if (c28655q.m87157i(iVar)) {
                    }
                } else {
                    iVar = viewState;
                }
                z4 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C30599e(21, onNavEvent, iVar);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, textResourceM108511b, c15077m1M43196a, null, c13825tM48880a, f16, null, null, (InterfaceC4339a) objM87133R, c28655q, (i16 << 18) | 6, 6, 6462);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                iVar = viewState;
            }
            z13 = true;
            z4 = z14 | z13;
            objM87133R = c28655q.m87133R();
            if (z4) {
                objM87133R = new C30599e(21, onNavEvent, iVar);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C30599e(21, onNavEvent, iVar);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, textResourceM108511b, c15077m1M43196a, null, c13825tM48880a, f16, null, null, (InterfaceC4339a) objM87133R, c28655q, (i16 << 18) | 6, 6, 6462);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            iVar = viewState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) iVar, onViewEvent, (InterfaceC23459e) onNavEvent, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m99315O(Function1 function1, AbstractC34268a.i iVar) {
        function1.invoke(new AbstractC10840c.i(iVar.getNavigationAction()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m99316P(AbstractC34268a.i iVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m99314N(iVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Code duplicated, block: B:61:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public static final void m99337u(AbstractC34268a viewState, boolean z4, Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC2994c0 interfaceC2994c0;
        InterfaceC2464x2 interfaceC2464x2;
        C15199y3 c15199y3M3460c;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        int i16;
        InterfaceC2994c0 interfaceC2994c1;
        C15199y3 c15199y3;
        Object objM87133R3;
        int i17;
        int i18;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1752218960);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i15 |= i18;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onNavEvent)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                boolean zM87153g = c28655q.m87153g(interfaceC2464x2) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | zM87153g;
                objM87133R2 = c28655q.m87133R();
                if (!z18 || objM87133R2 == c28676v0) {
                    i16 = 0;
                    interfaceC2994c1 = interfaceC2994c0;
                    C31915d c31915d = new C31915d(interfaceC2464x2, interfaceC2994c1, onViewEvent, c15199y3M3460c, 0);
                    c15199y3 = c15199y3M3460c;
                    c28655q.m87172p0(c31915d);
                    objM87133R2 = c31915d;
                } else {
                    interfaceC2994c1 = interfaceC2994c0;
                    c15199y3 = c15199y3M3460c;
                    i16 = 0;
                }
                boolean z19 = z16;
                int i24 = i16;
                AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3), null, null, null, null, AbstractC37817c.m121344e(563181822, c28655q, new C2026r((Object) viewState, (Object) interfaceC2994c1, (Object) c15199y3, onViewEvent, 21)), false, null, null, null, false, null, AbstractC37817c.m121344e(-601898558, c28655q, new C2572m1(viewState, onViewEvent, onNavEvent, (Function1) objM87133R2, z19)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                c28655q = c28655q;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C31901f(5);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, true, c28655q, 54, i24);
                z15 = z19;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, z15, onViewEvent, onNavEvent, i13, i14, 29);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onNavEvent)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i19 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
            boolean zM87153g2 = c28655q.m87153g(interfaceC2464x2) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z17 | zM87153g2;
            objM87133R2 = c28655q.m87133R();
            if (z18) {
                i16 = 0;
                interfaceC2994c1 = interfaceC2994c0;
                C31915d c31915d2 = new C31915d(interfaceC2464x2, interfaceC2994c1, onViewEvent, c15199y3M3460c, 0);
                c15199y3 = c15199y3M3460c;
                c28655q.m87172p0(c31915d2);
                objM87133R2 = c31915d2;
            } else {
                i16 = 0;
                interfaceC2994c1 = interfaceC2994c0;
                C31915d c31915d3 = new C31915d(interfaceC2464x2, interfaceC2994c1, onViewEvent, c15199y3M3460c, 0);
                c15199y3 = c15199y3M3460c;
                c28655q.m87172p0(c31915d3);
                objM87133R2 = c31915d3;
            }
            boolean z110 = z16;
            int i25 = i16;
            AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3), null, null, null, null, AbstractC37817c.m121344e(563181822, c28655q, new C2026r((Object) viewState, (Object) interfaceC2994c1, (Object) c15199y3, onViewEvent, 21)), false, null, null, null, false, null, AbstractC37817c.m121344e(-601898558, c28655q, new C2572m1(viewState, onViewEvent, onNavEvent, (Function1) objM87133R2, z110)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
            c28655q = c28655q;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C31901f(5);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, true, c28655q, 54, i25);
            z15 = z110;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(viewState, z15, onViewEvent, onNavEvent, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m99338v(InterfaceC2464x2 interfaceC2464x2, InterfaceC2994c0 interfaceC2994c0, Function1 function1, C15199y3 c15199y3, AbstractC27299a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC27299a.k) {
            if (interfaceC2464x2 != null) {
                ((C2463x1) interfaceC2464x2).m7442a();
            }
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c15199y3, null), 3);
        }
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m99339w(AbstractC34268a abstractC34268a, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            TextResource textResourceM108516a = AbstractC34269b.m108516a(abstractC34268a);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C22575j(interfaceC2994c0, function1, c15199y3, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31914c.m99296e(textResourceM108516a, (Function1) objM87133R, c28655q, TextResource.$stable, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m99340x(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C15199y3 c15199y3, AbstractC27299a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c15199y3, null), 3);
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m99341y(AbstractC34268a abstractC34268a, Function1 function1, Function1 function2, Function1 function3, boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (AbstractC22676k.m65745e(abstractC34268a, AbstractC34268a.g.f143930a)) {
            c28655q.m87150e0(328599156);
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q.m87173q(false);
        } else {
            boolean z13 = abstractC34268a instanceof AbstractC34268a.c;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13) {
                c28655q.m87150e0(328849450);
                AbstractC34268a.c cVar = (AbstractC34268a.c) abstractC34268a;
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(cVar.getTitle(), false, null, 6, null);
                TextResource textResourceM108490a = cVar.getBody();
                TextResource textResourceM108492c = cVar.getPrimaryCta();
                TextResource textResourceM108493d = cVar.getSecondaryCta();
                boolean zM87153g = c28655q.m87153g(abstractC34268a) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C30599e(22, function1, cVar);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean zM87153g2 = c28655q.m87153g(function2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C30515j(function2, 21);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                int i14 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i15 = TextResource.$stable;
                AbstractC33199m0.m105214F(bVar, textResourceM108490a, null, textResourceM108492c, interfaceC4339a, true, false, textResourceM108493d, interfaceC4339a2, null, true, false, c28655q, i14 | (i15 << 3) | (i15 << 9) | (i15 << 21), 6, 2628);
                c28655q.m87173q(false);
            } else if (abstractC34268a instanceof AbstractC34268a.a) {
                c28655q.m87150e0(329635982);
                AbstractC34268a.a aVar = (AbstractC34268a.a) abstractC34268a;
                if (aVar.getIsCancellingShowing()) {
                    c28655q.m87150e0(329572618);
                    TextResource textResourceM108521e = aVar.getCancelState().getTitle();
                    TextResource textResourceM108517a = aVar.getCancelState().getBody();
                    TextResource textResourceM108519c = aVar.getCancelState().getPrimaryCta();
                    boolean zM87153g3 = c28655q.m87153g(function1);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C30515j(function1, 22);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                    TextResource textResourceM108520d = aVar.getCancelState().getSecondaryCta();
                    boolean zM87153g4 = c28655q.m87153g(function1);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87153g4 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C30515j(function1, 14);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i16 = TextResource.$stable;
                    AbstractC22926c.m66686y(textResourceM108521e, textResourceM108517a, textResourceM108519c, interfaceC4339a3, textResourceM108520d, (InterfaceC4339a) objM87133R4, false, c28655q, (i16 << 3) | i16 | (i16 << 6) | (i16 << 12), 64);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(330236173);
                    if (aVar.getIsAddNoteShowing()) {
                        c28655q.m87150e0(330180683);
                        boolean zM87153g5 = c28655q.m87153g(function1);
                        Object objM87133R5 = c28655q.m87133R();
                        if (zM87153g5 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C29000h(function1, 23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Function1.m99285g((Function1) objM87133R5, c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(330323872);
                        c28655q.m87173q(false);
                    }
                    if (aVar instanceof AbstractC34268a.a.g) {
                        c28655q.m87150e0(330473416);
                        AbstractC33103f.m104898d((AbstractC34268a.a.g) abstractC34268a, function3, function2, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (aVar instanceof AbstractC34268a.a.i) {
                        c28655q.m87150e0(330886677);
                        AbstractC33117t.m105002p((AbstractC34268a.a.i) abstractC34268a, function3, function2, z4, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else if (aVar instanceof AbstractC34268a.a.c) {
                        c28655q.m87150e0(331312958);
                        AbstractC33108k.m104911j((AbstractC34268a.a.c) abstractC34268a, function3, function2, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (aVar instanceof AbstractC34268a.a.C42429a) {
                        c28655q.m87150e0(331702504);
                        AbstractC33099b.m104864d((AbstractC34268a.a.C42429a) abstractC34268a, function3, function2, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (aVar instanceof AbstractC34268a.a.e) {
                        c28655q.m87150e0(332093693);
                        AbstractC33111n.m104942d((AbstractC34268a.a.e) abstractC34268a, function3, function2, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (aVar instanceof AbstractC34268a.a.d) {
                        c28655q.m87150e0(332489780);
                        AbstractC33110m.m104932g((AbstractC34268a.a.d) abstractC34268a, function3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (aVar instanceof AbstractC34268a.a.f) {
                        c28655q.m87150e0(332830780);
                        AbstractC33113p.m104957k((AbstractC34268a.a.f) abstractC34268a, function3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (aVar instanceof AbstractC34268a.a.h) {
                        c28655q.m87150e0(333164991);
                        AbstractC33114q.m104976d((AbstractC34268a.a.h) abstractC34268a, function3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (!(aVar instanceof AbstractC34268a.a.b)) {
                            throw AbstractC11895b.m32003v(1396133058, c28655q, false);
                        }
                        c28655q.m87150e0(333500411);
                        AbstractC33102e.m104879k((AbstractC34268a.a.b) abstractC34268a, function3, c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else if (abstractC34268a instanceof AbstractC34268a.j) {
                c28655q.m87150e0(333829569);
                AbstractC22926c.m66682u(((AbstractC34268a.j) abstractC34268a).getText(), c28655q, TextResource.$stable, 0);
                c28655q.m87173q(false);
            } else if (abstractC34268a instanceof AbstractC34268a.h) {
                c28655q.m87150e0(333950748);
                AbstractC34268a.h hVar = (AbstractC34268a.h) abstractC34268a;
                TextResource textResourceM108509b = hVar.getText();
                TextResource textResourceM108508a = hVar.getSubtitle();
                boolean zM87153g6 = c28655q.m87153g(function1);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87153g6 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C30515j(function1, 15);
                    c28655q.m87172p0(objM87133R6);
                }
                int i17 = TextResource.$stable;
                AbstractC22926c.m66679r(textResourceM108509b, textResourceM108508a, (InterfaceC4339a) objM87133R6, c28655q, i17 | (i17 << 3), 0);
                c28655q.m87173q(false);
            } else if (abstractC34268a instanceof AbstractC34268a.i) {
                c28655q.m87150e0(334271660);
                m99314N((AbstractC34268a.i) abstractC34268a, function1, function2, c28655q, 0);
                c28655q.m87173q(false);
            } else if (abstractC34268a instanceof AbstractC34268a.e) {
                c28655q.m87150e0(334565199);
                AbstractC34268a.e eVar = (AbstractC34268a.e) abstractC34268a;
                TextResource textResourceM108504d = eVar.getTitle();
                TextResource textResourceM108501a = eVar.getBody();
                TextResource textResourceM108503c = eVar.getPositiveCta();
                TextResource textResourceM108502b = eVar.getNegativeCta();
                boolean zM87153g7 = c28655q.m87153g(function1);
                Object objM87133R7 = c28655q.m87133R();
                if (zM87153g7 || objM87133R7 == c28676v0) {
                    objM87133R7 = new C30515j(function1, 16);
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R7;
                boolean zM87153g8 = c28655q.m87153g(function1);
                Object objM87133R8 = c28655q.m87133R();
                if (zM87153g8 || objM87133R8 == c28676v0) {
                    objM87133R8 = new C30515j(function1, 17);
                    c28655q.m87172p0(objM87133R8);
                }
                int i18 = TextResource.$stable;
                AbstractC22926c.m66675n(interfaceC4339a4, textResourceM108503c, (InterfaceC4339a) objM87133R8, textResourceM108502b, textResourceM108504d, textResourceM108501a, false, c28655q, (i18 << 3) | (i18 << 9) | (i18 << 12) | (i18 << 15), 64);
                c28655q.m87173q(false);
            } else if (abstractC34268a instanceof AbstractC34268a.f) {
                c28655q.m87150e0(335083767);
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                EnumC21213p enumC21213p = EnumC21213p.LOTTIE;
                AbstractC34268a.f fVar = (AbstractC34268a.f) abstractC34268a;
                TextResource textResourceM108507c = fVar.getTitle();
                TextResource textResourceM108505a = fVar.getDescription();
                TextResource textResourceM108506b = fVar.getPrimaryActionText();
                boolean zM87153g9 = c28655q.m87153g(function2);
                Object objM87133R9 = c28655q.m87133R();
                if (zM87153g9 || objM87133R9 == c28676v0) {
                    objM87133R9 = new C30515j(function2, 18);
                    c28655q.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R9;
                boolean zM87153g10 = c28655q.m87153g(function2);
                Object objM87133R10 = c28655q.m87133R();
                if (zM87153g10 || objM87133R10 == c28676v0) {
                    objM87133R10 = new C30515j(function2, 19);
                    c28655q.m87172p0(objM87133R10);
                }
                int i19 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM108507c, textResourceM108505a, textResourceM108506b, true, null, null, null, null, null, null, false, false, enumC21213p, null, false, 0, null, null, null, false, null, interfaceC4339a5, null, (InterfaceC4339a) objM87133R10, null, null, null, c28655q, (i19 << 3) | 24576 | (i19 << 6) | (i19 << 9), 3072, 0, 247455713);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else if (abstractC34268a instanceof AbstractC34268a.b) {
                c28655q.m87150e0(335983883);
                boolean zM87153g11 = c28655q.m87153g(function2) | c28655q.m87153g(abstractC34268a);
                Object objM87133R11 = c28655q.m87133R();
                if (zM87153g11 || objM87133R11 == c28676v0) {
                    objM87133R11 = new b(function2, abstractC34268a, null);
                    c28655q.m87172p0(objM87133R11);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R11, abstractC34268a);
                c28655q.m87173q(false);
            } else {
                if (!(abstractC34268a instanceof AbstractC34268a.d)) {
                    throw AbstractC11895b.m32003v(1396079534, c28655q, false);
                }
                c28655q.m87150e0(336351078);
                AbstractC34268a.d dVar = (AbstractC34268a.d) abstractC34268a;
                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(dVar.getTitle(), false, null, 6, null);
                TextResource textResourceM108496a = dVar.getBody();
                TextResource textResourceM108498c = dVar.getPrimaryCta();
                TextResource textResourceM108499d = dVar.getSecondaryCta();
                boolean zM87153g12 = c28655q.m87153g(abstractC34268a) | c28655q.m87153g(function1);
                Object objM87133R12 = c28655q.m87133R();
                if (zM87153g12 || objM87133R12 == c28676v0) {
                    objM87133R12 = new C30599e(23, function1, dVar);
                    c28655q.m87172p0(objM87133R12);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R12;
                boolean zM87153g13 = c28655q.m87153g(function1);
                Object objM87133R13 = c28655q.m87133R();
                if (zM87153g13 || objM87133R13 == c28676v0) {
                    objM87133R13 = new C30515j(function1, 20);
                    c28655q.m87172p0(objM87133R13);
                }
                int i24 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i25 = TextResource.$stable;
                AbstractC33199m0.m105214F(bVar2, textResourceM108496a, null, textResourceM108498c, interfaceC4339a6, true, false, textResourceM108499d, (InterfaceC4339a) objM87133R13, null, true, false, c28655q, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 6, 2628);
                c28655q.m87173q(false);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m99342z(Function1 function1, AbstractC34268a abstractC34268a) {
        AbstractC34268a.c cVar = (AbstractC34268a.c) abstractC34268a;
        function1.invoke(new AbstractC27299a.u(cVar.getCampaignId(), cVar.getSessionId()));
        return C23454a0.f92919a;
    }
}
