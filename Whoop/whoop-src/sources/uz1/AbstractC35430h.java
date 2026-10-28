package uz1;

import a80.C0545i;
import a81.C0563n;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ao2.C1877b;
import b01.C2193n;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bv2.C3675b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import dp0.AbstractC12248d;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gz0.EnumC16313m0;
import h02.C16572g;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import mz1.AbstractC26039b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27249e;
import ny0.C27256h;
import oq1.C28119c;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p31.C28801l;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33166b0;
import p736sz0.C33169c0;
import pp2.C29440d;
import q83.InterfaceC30057d;
import qf1.AbstractC30320a;
import r51.AbstractC30937e;
import r51.C30934b;
import r51.C30935c;
import r51.C30938f;
import r51.C30939g;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s90.C32290f;
import sg2.C32451b;
import so2.C32848f;
import tz1.C34279a;
import tz1.C34280b;
import tz1.C34283e;
import tz1.InterfaceC34282d;
import v41.AbstractC35662e;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39282o;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: uz1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aM\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\u000e\u0010\u001c\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "isTabRoot", "coachBarEnabled", "Ly3/f;", "E", "(ZZ)F", "Ltz1/b;", "data", "Lao2/b;", "cartIndicator", "isUpsellShop", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "p", "(Ltz1/b;Lao2/b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ltz1/a;", "footer", "m", "(Ltz1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "state", "precedesMenuItem", "D", "(Landroidx/compose/ui/Modifier;Lm91/u;Z)Landroidx/compose/ui/Modifier;", "isCountrySelectorOpen", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35430h {

    /* JADX INFO: renamed from: uz1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ boolean f150906w;

        public a(boolean z4) {
            this.f150906w = z4;
        }

        /* JADX INFO: renamed from: a */
        public final Modifier m112459a(InterfaceC25312u state, Composer composer, int i13) {
            AbstractC22676k.m65750j(state, "state");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-923780216);
            Modifier modifierM112431D = AbstractC35430h.m112431D(C2314t.f9131w, state, this.f150906w);
            c28655q.m87173q(false);
            return modifierM112431D;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m112459a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: uz1.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f150907w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC25312u f150908x;

        public b(Function1 function1, InterfaceC25312u interfaceC25312u) {
            this.f150907w = function1;
            this.f150908x = interfaceC25312u;
        }

        /* JADX INFO: renamed from: a */
        public final void m112460a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            this.f150907w.invoke(new InterfaceC34282d.h(event, this.f150908x));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m112460a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uz1.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.view.NativeStoreLoadedKt$NativeStoreLoaded$1$3$1$1$1", m100430f = "NativeStoreLoaded.kt", m100431l = {196}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150909w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f150910x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f150911y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C23196w3 c23196w3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150910x = c23196w3;
            this.f150911y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f150910x, this.f150911y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150909w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f150910x;
                this.f150909w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC35430h.m112450r(this.f150911y, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uz1.h$d */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.view.NativeStoreLoadedKt$NativeStoreLoaded$1$3$1$1$2", m100430f = "NativeStoreLoaded.kt", m100431l = {203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150912w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f150913x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f150914y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C23196w3 c23196w3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150913x = c23196w3;
            this.f150914y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f150913x, this.f150914y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150912w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f150913x;
                this.f150912w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC35430h.m112450r(this.f150914y, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uz1.h$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f150915w;

        public e(List list) {
            this.f150915w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m112461a(int i13) {
            this.f150915w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m112461a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: uz1.h$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f150916w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34283e f150917x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f150918y;

        public f(List list, C34283e c34283e, Function1 function1) {
            this.f150916w = list;
            this.f150917x = c34283e;
            this.f150918y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m112462a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f150916w.get(i13);
            c28655q.m87150e0(511876359);
            boolean z4 = AbstractC25265s.m74102I0(i13 + 1, this.f150917x.m108583a()) instanceof C39282o;
            C25307p c25307pM112411b = AbstractC35427e.m112411b();
            a aVar = new a(z4);
            boolean zM87153g = c28655q.m87153g(this.f150918y) | c28655q.m87157i(interfaceC25312u);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new b(this.f150918y, interfaceC25312u);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM112411b, aVar, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m112462a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m112428A(C34280b c34280b, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C30935c) {
            C30935c c30935c = (C30935c) event;
            String strM95184a = c30935c.getCountry().getAlpha2();
            C30939g selectedCountry = c34280b.getCountrySelector().getSelectedCountry();
            if (!AbstractC22676k.m65745e(strM95184a, selectedCountry != null ? selectedCountry.getAlpha2() : null)) {
                function1.invoke(new InterfaceC34282d.e(c30935c.getCountry().getAlpha2()));
            }
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c23196w3, interfaceC28601c1, null), 3);
        } else if (event instanceof C30934b) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c23196w3, interfaceC28601c1, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m112429B(C34280b c34280b, C1877b c1877b, boolean z4, boolean z13, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m112448p(c34280b, c1877b, z4, z13, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public static final Modifier m112431D(Modifier modifier, InterfaceC25312u state, boolean z4) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(state, "state");
        if (state instanceof C35443u) {
            return AbstractC1099a.m3396r(modifier, 2 * 8, 0.0f, 2);
        }
        if (state instanceof C35437o) {
            return AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
        }
        if (state instanceof C39282o) {
            return AbstractC1099a.m3396r(modifier, 8 * 2.5f, 0.0f, 2);
        }
        if (!(state instanceof C28801l)) {
            return modifier;
        }
        float f13 = 8;
        float f14 = 2 * f13;
        return AbstractC1099a.m3397s(modifier, f14, f14, f14, z4 ? 0 : f13 * 1.5f);
    }

    /* JADX INFO: renamed from: E */
    public static final float m112432E(boolean z4, boolean z13) {
        int i13;
        if (!z4) {
            i13 = 0;
        } else {
            if (!z13) {
                return AbstractC12248d.m34111d();
            }
            i13 = 160;
        }
        return i13;
    }

    /* JADX INFO: renamed from: m */
    private static final void m112445m(C34279a c34279a, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q;
        C2314t c2314t;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(458742743);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(c34279a) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f14, 0.0f, 2), 0.0f, 1 * f13, 0.0f, f14, 5);
            float f15 = f13 * 1.5f;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9111N, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            C33169c0 c33169c0M108558b = c34279a.getHeaderText();
            if (c33169c0M108558b == null) {
                c28655q2.m87150e0(148551814);
                c28655q2.m87173q(false);
                c2314t = c2314t2;
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(148551815);
                c28655q = c28655q2;
                c2314t = c2314t2;
                AbstractC33166b0.m105053d(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f15, 7), c33169c0M108558b, 0, 0, 0, c28655q, (C33169c0.f138321k << 3) | 6, 28);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(1113177424);
            for (C27256h c27256h : c34279a.m108557a()) {
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean zM87157i = c28655q.m87157i(c27256h) | ((i15 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0545i(c27256h, function1, 12);
                    c28655q.m87172p0(objM87133R);
                }
                C28655q c28655q3 = c28655q;
                AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R, c28655q3, (C27256h.f109055z << 3) | 6, 4);
                c28655q = c28655q3;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c34279a, function1, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m112446n(C27256h c27256h, Function1 function1) {
        C9598e destination = c27256h.getDestination();
        if (AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            destination = null;
        }
        if (destination != null) {
            function1.invoke(new InterfaceC34282d.f(destination, c27256h.getAnalyticEvent()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m112447o(C34279a c34279a, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m112445m(c34279a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:101:0x0208  */
    /* JADX WARN: Code duplicated, block: B:104:0x0241  */
    /* JADX WARN: Code duplicated, block: B:105:0x0243  */
    /* JADX WARN: Code duplicated, block: B:108:0x024a  */
    /* JADX WARN: Code duplicated, block: B:109:0x024c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0256  */
    /* JADX WARN: Code duplicated, block: B:116:0x0290  */
    /* JADX WARN: Code duplicated, block: B:117:0x0292  */
    /* JADX WARN: Code duplicated, block: B:119:0x0295  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:130:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:137:0x030d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0318  */
    /* JADX WARN: Code duplicated, block: B:141:0x0332  */
    /* JADX WARN: Code duplicated, block: B:147:0x038a  */
    /* JADX WARN: Code duplicated, block: B:149:0x039b  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x017d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Code duplicated, block: B:87:0x019c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cf  */
    /* JADX INFO: renamed from: p */
    public static final void m112448p(C34280b data, C1877b cartIndicator, boolean z4, boolean z13, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        boolean z14;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC28601c1 interfaceC28601c2;
        int iHashCode2;
        int iM125595a;
        String strM21273g;
        boolean z15;
        C37816b c37816b;
        int i16;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z19;
        Modifier modifierM44085i;
        boolean z24;
        boolean z25;
        Object objM87133R4;
        C28676v0 c28676v1;
        C34279a c34279aM108559a;
        boolean z26;
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(cartIndicator, "cartIndicator");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2039070078);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(data) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(cartIndicator) : c28655q2.m87157i(cartIndicator) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i17 = i14 & 32;
        if (i17 == 0) {
            if ((196608 & i13) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C23196w3 c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                boolean zM34112e = AbstractC12248d.m34112e((FeatureFlagChecker) c28655q2.m87161k(AbstractC30320a.m92665c()));
                Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3409f(1.0f, modifier4));
                Modifier modifier5 = modifier4;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44028b0);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    interfaceC28601c2 = interfaceC28601c1;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66723l);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    if (z13) {
                        iM125595a = EnumC16313m0.SETTINGS.toWhoopIcon();
                    } else if (z4) {
                        iM125595a = EnumC16313m0.CARET_BACKWARD.toWhoopIcon();
                    } else {
                        iM125595a = AbstractC39383f.m125595a(C38072d.f163053a);
                    }
                    if (z13) {
                        c28655q2.m87150e0(-814013063);
                        strM21273g = AbstractC8693b.m21273g(AbstractC26039b.f103024g, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-813905586);
                        strM21273g = AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                    String str = strM21273g;
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(data.getNavigationBarText());
                    if (data.getShowCartIcon()) {
                        c28655q2.m87150e0(-813612946);
                        C37816b c37816bM121344e = AbstractC37817c.m121344e(1265579717, c28655q2, new C16572g(cartIndicator, onViewEvent, 1));
                        z15 = false;
                        c28655q2.m87173q(false);
                        c37816b = c37816bM121344e;
                    } else {
                        z15 = false;
                        c28655q2.m87150e0(-813219060);
                        c28655q2.m87173q(false);
                        c37816b = null;
                    }
                    AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, Integer.valueOf(iM125595a), str, null, null, null, null, false, c37816b, null, null, null, null, null, "Shop Home Screen Title", 32242, null);
                    i16 = 57344 & i15;
                    if (i16 == 16384) {
                        z16 = true;
                    } else {
                        z16 = z15;
                    }
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    z18 = z16 | z17;
                    objM87133R3 = c28655q2.m87133R();
                    if (z18 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C3675b(onViewEvent, z13, 13);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = interfaceC28601c2;
                    AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f > 0.0d) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (!z19) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, true, 1.0f);
                    if (data.getCheckoutFooter() != null) {
                        modifierM44085i = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
                    } else {
                        modifierM44085i = AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null);
                    }
                    Modifier modifierMo3471e = modifierM31988g.mo3471e(modifierM44085i);
                    float f13 = 8;
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(1.5f * f13);
                    C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 2 * f13, 0.0f, m112432E(z13, zM34112e), 5);
                    boolean zM87157i = c28655q2.m87157i(data);
                    if (i16 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i | z24;
                    objM87133R4 = c28655q2.m87133R();
                    if (z25) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                        }
                        AbstractC22674j.m65717c(modifierMo3471e, null, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) objM87133R4, c28655q2, 24576, 490);
                        c28655q = c28655q2;
                        c34279aM108559a = data.getCheckoutFooter();
                        if (c34279aM108559a == null) {
                            c28655q.m87150e0(-811144355);
                            z26 = false;
                            c28655q.m87173q(false);
                        } else {
                            z26 = false;
                            c28655q.m87150e0(-811144354);
                            m112445m(c34279aM108559a, onViewEvent, c28655q, (i15 >> 9) & 112);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        if (m112449q(interfaceC28601c3) || data.getCountrySelector() == null) {
                            c28655q.m87150e0(-1564749814);
                            c28655q.m87173q(z26);
                        } else {
                            c28655q.m87150e0(-1566260506);
                            Object objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v1) {
                                objM87133R5 = new C35429g(0, interfaceC28601c3);
                                c28655q.m87172p0(objM87133R5);
                            }
                            AbstractC35662e.m112943g(null, c23196w3M67125g, null, null, null, null, (InterfaceC4339a) objM87133R5, null, true, null, null, false, AbstractC37817c.m121344e(964681687, c28655q, new C0563n((Object) data, onViewEvent, (Object) interfaceC2994c0, (Object) c23196w3M67125g, (Object) interfaceC28601c3, 15)), c28655q, 102236160, 384, 3773);
                            c28655q = c28655q;
                            c28655q.m87173q(z26);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier5;
                    }
                    objM87133R4 = new C32290f((Object) data, onViewEvent, (Object) interfaceC28601c3, 19);
                    c28655q2.m87172p0(objM87133R4);
                    AbstractC22674j.m65717c(modifierMo3471e, null, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) objM87133R4, c28655q2, 24576, 490);
                    c28655q = c28655q2;
                    c34279aM108559a = data.getCheckoutFooter();
                    if (c34279aM108559a == null) {
                        c28655q.m87150e0(-811144355);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        z26 = false;
                        c28655q.m87150e0(-811144354);
                        m112445m(c34279aM108559a, onViewEvent, c28655q, (i15 >> 9) & 112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (m112449q(interfaceC28601c3)) {
                        c28655q.m87150e0(-1564749814);
                        c28655q.m87173q(z26);
                    } else {
                        c28655q.m87150e0(-1564749814);
                        c28655q.m87173q(z26);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM66723l2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                if (z13) {
                    iM125595a = EnumC16313m0.SETTINGS.toWhoopIcon();
                } else if (z4) {
                    iM125595a = EnumC16313m0.CARET_BACKWARD.toWhoopIcon();
                } else {
                    iM125595a = AbstractC39383f.m125595a(C38072d.f163053a);
                }
                if (z13) {
                    c28655q2.m87150e0(-814013063);
                    strM21273g = AbstractC8693b.m21273g(AbstractC26039b.f103024g, c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-813905586);
                    strM21273g = AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                String str2 = strM21273g;
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(data.getNavigationBarText());
                if (data.getShowCartIcon()) {
                    c28655q2.m87150e0(-813612946);
                    C37816b c37816bM121344e2 = AbstractC37817c.m121344e(1265579717, c28655q2, new C16572g(cartIndicator, onViewEvent, 1));
                    z15 = false;
                    c28655q2.m87173q(false);
                    c37816b = c37816bM121344e2;
                } else {
                    z15 = false;
                    c28655q2.m87150e0(-813219060);
                    c28655q2.m87173q(false);
                    c37816b = null;
                }
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21278l2, null, Integer.valueOf(iM125595a), str2, null, null, null, null, false, c37816b, null, null, null, null, null, "Shop Home Screen Title", 32242, null);
                i16 = 57344 & i15;
                if (i16 == 16384) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                z18 = z16 | z17;
                objM87133R3 = c28655q2.m87133R();
                if (z18) {
                    objM87133R3 = new C3675b(onViewEvent, z13, 13);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3675b(onViewEvent, z13, 13);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f > 0.0d) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (!z19) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM3409f2, true, 1.0f);
                if (data.getCheckoutFooter() != null) {
                    modifierM44085i = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
                } else {
                    modifierM44085i = AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null);
                }
                Modifier modifierMo3471e2 = modifierM31988g2.mo3471e(modifierM44085i);
                float f14 = 8;
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(1.5f * f14);
                C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(0.0f, 2 * f14, 0.0f, m112432E(z13, zM34112e), 5);
                boolean zM87157i2 = c28655q2.m87157i(data);
                if (i16 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i2 | z24;
                objM87133R4 = c28655q2.m87133R();
                if (z25) {
                    c28676v1 = c28676v0;
                    if (objM87133R4 == c28676v1) {
                    }
                    AbstractC22674j.m65717c(modifierMo3471e2, null, c22976l1M3381c2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R4, c28655q2, 24576, 490);
                    c28655q = c28655q2;
                    c34279aM108559a = data.getCheckoutFooter();
                    if (c34279aM108559a == null) {
                        c28655q.m87150e0(-811144355);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        z26 = false;
                        c28655q.m87150e0(-811144354);
                        m112445m(c34279aM108559a, onViewEvent, c28655q, (i15 >> 9) & 112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (m112449q(interfaceC28601c3)) {
                        c28655q.m87150e0(-1564749814);
                        c28655q.m87173q(z26);
                    } else {
                        c28655q.m87150e0(-1564749814);
                        c28655q.m87173q(z26);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R4 = new C32290f((Object) data, onViewEvent, (Object) interfaceC28601c3, 19);
                c28655q2.m87172p0(objM87133R4);
                AbstractC22674j.m65717c(modifierMo3471e2, null, c22976l1M3381c2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R4, c28655q2, 24576, 490);
                c28655q = c28655q2;
                c34279aM108559a = data.getCheckoutFooter();
                if (c34279aM108559a == null) {
                    c28655q.m87150e0(-811144355);
                    z26 = false;
                    c28655q.m87173q(false);
                } else {
                    z26 = false;
                    c28655q.m87150e0(-811144354);
                    m112445m(c34279aM108559a, onViewEvent, c28655q, (i15 >> 9) & 112);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (m112449q(interfaceC28601c3)) {
                    c28655q.m87150e0(-1564749814);
                    c28655q.m87173q(z26);
                } else {
                    c28655q.m87150e0(-1564749814);
                    c28655q.m87173q(z26);
                }
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(data, cartIndicator, z4, z13, onViewEvent, modifier3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        if ((74899 & i15) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C23196w3 c23196w3M67125g2 = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R2;
            boolean zM34112e2 = AbstractC12248d.m34112e((FeatureFlagChecker) c28655q2.m87161k(AbstractC30320a.m92665c()));
            Modifier modifierM44028b1 = AbstractC15673b0.m44028b0(AbstractC1102d.m3409f(1.0f, modifier4));
            Modifier modifier6 = modifier4;
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM44028b1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                interfaceC28601c2 = interfaceC28601c1;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                Modifier modifierM66723l3 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM66723l3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                if (z13) {
                    iM125595a = EnumC16313m0.SETTINGS.toWhoopIcon();
                } else if (z4) {
                    iM125595a = EnumC16313m0.CARET_BACKWARD.toWhoopIcon();
                } else {
                    iM125595a = AbstractC39383f.m125595a(C38072d.f163053a);
                }
                if (z13) {
                    c28655q2.m87150e0(-814013063);
                    strM21273g = AbstractC8693b.m21273g(AbstractC26039b.f103024g, c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-813905586);
                    strM21273g = AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                String str3 = strM21273g;
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(data.getNavigationBarText());
                if (data.getShowCartIcon()) {
                    c28655q2.m87150e0(-813612946);
                    C37816b c37816bM121344e3 = AbstractC37817c.m121344e(1265579717, c28655q2, new C16572g(cartIndicator, onViewEvent, 1));
                    z15 = false;
                    c28655q2.m87173q(false);
                    c37816b = c37816bM121344e3;
                } else {
                    z15 = false;
                    c28655q2.m87150e0(-813219060);
                    c28655q2.m87173q(false);
                    c37816b = null;
                }
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(textResourceM21278l3, null, Integer.valueOf(iM125595a), str3, null, null, null, null, false, c37816b, null, null, null, null, null, "Shop Home Screen Title", 32242, null);
                i16 = 57344 & i15;
                if (i16 == 16384) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                z18 = z16 | z17;
                objM87133R3 = c28655q2.m87133R();
                if (z18) {
                    objM87133R3 = new C3675b(onViewEvent, z13, 13);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3675b(onViewEvent, z13, 13);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f > 0.0d) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (!z19) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g3 = AbstractC11895b.m31988g(modifierM3409f3, true, 1.0f);
                if (data.getCheckoutFooter() != null) {
                    modifierM44085i = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
                } else {
                    modifierM44085i = AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null);
                }
                Modifier modifierMo3471e3 = modifierM31988g3.mo3471e(modifierM44085i);
                float f15 = 8;
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(1.5f * f15);
                C22976l1 c22976l1M3381c3 = AbstractC1099a.m3381c(0.0f, 2 * f15, 0.0f, m112432E(z13, zM34112e2), 5);
                boolean zM87157i3 = c28655q2.m87157i(data);
                if (i16 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i3 | z24;
                objM87133R4 = c28655q2.m87133R();
                if (z25) {
                    c28676v1 = c28676v0;
                    if (objM87133R4 == c28676v1) {
                    }
                    AbstractC22674j.m65717c(modifierMo3471e3, null, c22976l1M3381c3, c22971kM66746i3, null, null, false, null, (Function1) objM87133R4, c28655q2, 24576, 490);
                    c28655q = c28655q2;
                    c34279aM108559a = data.getCheckoutFooter();
                    if (c34279aM108559a == null) {
                        c28655q.m87150e0(-811144355);
                        z26 = false;
                        c28655q.m87173q(false);
                    } else {
                        z26 = false;
                        c28655q.m87150e0(-811144354);
                        m112445m(c34279aM108559a, onViewEvent, c28655q, (i15 >> 9) & 112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (m112449q(interfaceC28601c3)) {
                        c28655q.m87150e0(-1564749814);
                        c28655q.m87173q(z26);
                    } else {
                        c28655q.m87150e0(-1564749814);
                        c28655q.m87173q(z26);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier6;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R4 = new C32290f((Object) data, onViewEvent, (Object) interfaceC28601c3, 19);
                c28655q2.m87172p0(objM87133R4);
                AbstractC22674j.m65717c(modifierMo3471e3, null, c22976l1M3381c3, c22971kM66746i3, null, null, false, null, (Function1) objM87133R4, c28655q2, 24576, 490);
                c28655q = c28655q2;
                c34279aM108559a = data.getCheckoutFooter();
                if (c34279aM108559a == null) {
                    c28655q.m87150e0(-811144355);
                    z26 = false;
                    c28655q.m87173q(false);
                } else {
                    z26 = false;
                    c28655q.m87150e0(-811144354);
                    m112445m(c34279aM108559a, onViewEvent, c28655q, (i15 >> 9) & 112);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (m112449q(interfaceC28601c3)) {
                    c28655q.m87150e0(-1564749814);
                    c28655q.m87173q(z26);
                } else {
                    c28655q.m87150e0(-1564749814);
                    c28655q.m87173q(z26);
                }
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                interfaceC28601c2 = interfaceC28601c1;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
            Modifier modifierM66723l4 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM66723l4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
            if (z13) {
                iM125595a = EnumC16313m0.SETTINGS.toWhoopIcon();
            } else if (z4) {
                iM125595a = EnumC16313m0.CARET_BACKWARD.toWhoopIcon();
            } else {
                iM125595a = AbstractC39383f.m125595a(C38072d.f163053a);
            }
            if (z13) {
                c28655q2.m87150e0(-814013063);
                strM21273g = AbstractC8693b.m21273g(AbstractC26039b.f103024g, c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-813905586);
                strM21273g = AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q2, 0);
                c28655q2.m87173q(false);
            }
            String str4 = strM21273g;
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(data.getNavigationBarText());
            if (data.getShowCartIcon()) {
                c28655q2.m87150e0(-813612946);
                C37816b c37816bM121344e4 = AbstractC37817c.m121344e(1265579717, c28655q2, new C16572g(cartIndicator, onViewEvent, 1));
                z15 = false;
                c28655q2.m87173q(false);
                c37816b = c37816bM121344e4;
            } else {
                z15 = false;
                c28655q2.m87150e0(-813219060);
                c28655q2.m87173q(false);
                c37816b = null;
            }
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(textResourceM21278l4, null, Integer.valueOf(iM125595a), str4, null, null, null, null, false, c37816b, null, null, null, null, null, "Shop Home Screen Title", 32242, null);
            i16 = 57344 & i15;
            if (i16 == 16384) {
                z16 = true;
            } else {
                z16 = z15;
            }
            if ((i15 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = z15;
            }
            z18 = z16 | z17;
            objM87133R3 = c28655q2.m87133R();
            if (z18) {
                objM87133R3 = new C3675b(onViewEvent, z13, 13);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3675b(onViewEvent, z13, 13);
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = interfaceC28601c2;
            AbstractC6719b.m20143d(null, aVar4, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            if (1.0f > 0.0d) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (!z19) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g4 = AbstractC11895b.m31988g(modifierM3409f4, true, 1.0f);
            if (data.getCheckoutFooter() != null) {
                modifierM44085i = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
            } else {
                modifierM44085i = AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null);
            }
            Modifier modifierMo3471e4 = modifierM31988g4.mo3471e(modifierM44085i);
            float f16 = 8;
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(1.5f * f16);
            C22976l1 c22976l1M3381c4 = AbstractC1099a.m3381c(0.0f, 2 * f16, 0.0f, m112432E(z13, zM34112e2), 5);
            boolean zM87157i4 = c28655q2.m87157i(data);
            if (i16 == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zM87157i4 | z24;
            objM87133R4 = c28655q2.m87133R();
            if (z25) {
                c28676v1 = c28676v0;
                if (objM87133R4 == c28676v1) {
                }
                AbstractC22674j.m65717c(modifierMo3471e4, null, c22976l1M3381c4, c22971kM66746i4, null, null, false, null, (Function1) objM87133R4, c28655q2, 24576, 490);
                c28655q = c28655q2;
                c34279aM108559a = data.getCheckoutFooter();
                if (c34279aM108559a == null) {
                    c28655q.m87150e0(-811144355);
                    z26 = false;
                    c28655q.m87173q(false);
                } else {
                    z26 = false;
                    c28655q.m87150e0(-811144354);
                    m112445m(c34279aM108559a, onViewEvent, c28655q, (i15 >> 9) & 112);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (m112449q(interfaceC28601c3)) {
                    c28655q.m87150e0(-1564749814);
                    c28655q.m87173q(z26);
                } else {
                    c28655q.m87150e0(-1564749814);
                    c28655q.m87173q(z26);
                }
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                c28676v1 = c28676v0;
            }
            objM87133R4 = new C32290f((Object) data, onViewEvent, (Object) interfaceC28601c3, 19);
            c28655q2.m87172p0(objM87133R4);
            AbstractC22674j.m65717c(modifierMo3471e4, null, c22976l1M3381c4, c22971kM66746i4, null, null, false, null, (Function1) objM87133R4, c28655q2, 24576, 490);
            c28655q = c28655q2;
            c34279aM108559a = data.getCheckoutFooter();
            if (c34279aM108559a == null) {
                c28655q.m87150e0(-811144355);
                z26 = false;
                c28655q.m87173q(false);
            } else {
                z26 = false;
                c28655q.m87150e0(-811144354);
                m112445m(c34279aM108559a, onViewEvent, c28655q, (i15 >> 9) & 112);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (m112449q(interfaceC28601c3)) {
                c28655q.m87150e0(-1564749814);
                c28655q.m87173q(z26);
            } else {
                c28655q.m87150e0(-1564749814);
                c28655q.m87173q(z26);
            }
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2193n(data, cartIndicator, z4, z13, onViewEvent, modifier3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: q */
    private static final boolean m112449q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m112450r(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m112451s(C1877b c1877b, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            int iM5656b = c1877b.getCount();
            C9598e c9598eM5657c = c1877b.getDestination();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C32451b(function1, 28);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35423a.m112398c(iM5656b, c9598eM5657c, (Function1) objM87133R, null, null, c28655q, C9598e.f28134d << 3, 24);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m112452t(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC34282d.d((C9598e) it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m112453u(Function1 function1, boolean z4) {
        function1.invoke(z4 ? InterfaceC34282d.l.f143999a : InterfaceC34282d.b.f143986a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m112454v(C34280b c34280b, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        for (C34283e c34283e : c34280b.m108562d()) {
            List<InterfaceC25312u> listM108583a = c34283e.m108583a();
            ((C26053f) LazyColumn).m77529r(listM108583a.size(), null, new e(listM108583a), new C37816b(new f(listM108583a, c34283e, function1), true, 2039820996));
        }
        C30938f c30938fM108560b = c34280b.getCountrySelector();
        if (c30938fM108560b != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C28119c(25, c30938fM108560b, interfaceC28601c1), true, -681742937), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m112455w(C30938f c30938f, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C27325i(29, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35425c.m112408b(c30938f, (InterfaceC4339a) objM87133R, null, c28655q, C30938f.f127649h | 48, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m112456x(InterfaceC28601c1 interfaceC28601c1) {
        m112450r(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m112457y(InterfaceC28601c1 interfaceC28601c1) {
        m112450r(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m112458z(C34280b c34280b, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3406c = AbstractC1102d.m3406c(0.8f, C2314t.f9131w);
            C30938f c30938fM95175b = C30938f.m95175b(c34280b.getCountrySelector(), null, null, null, null, null, null, null, 119, null);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i14).getT3();
            C17919x c17919x = new C17919x(c38072d.m121949b(c28655q, i14).getBrandWhite());
            float f13 = 0;
            boolean zM87157i = c28655q.m87157i(c34280b) | c28655q.m87153g(function1) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                C29440d c29440d = new C29440d(c34280b, function1, interfaceC2994c0, c23196w3, interfaceC28601c1);
                c28655q.m87172p0(c29440d);
                objM87133R = c29440d;
            }
            AbstractC30937e.m95155i(modifierM3406c, c30938fM95175b, c2886aM8418P, c17919x, f13, (Function1) objM87133R, c28655q, (C30938f.f127649h << 3) | 24582 | (C2886a.f11498d << 6), 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
