package qx0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import l83.C23454a0;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.AbstractC15170v4;
import p163g1.C15077m1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.C29124b;
import q11.C29793c;
import q81.C30047e;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qx0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lqx0/i;", "viewModel", "Lkotlin/Function0;", "Ll83/a0;", "onNavigateBack", "m", "(Lqx0/i;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lqx0/c;", "experimentCard", "k", "(Lqx0/c;Landroidx/compose/runtime/Composer;I)V", "Lqx0/h;", "uiState", "debug-tools_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30751g {

    /* JADX INFO: renamed from: qx0.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.debug.experiments.ExperimentsDebugScreenKt$ExperimentsDebugScreen$1$1", m100430f = "ExperimentsDebugScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126586w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30753i f126587x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C30753i c30753i, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126587x = c30753i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f126587x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f126586w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f126587x.m94479o();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qx0.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f126588w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C30747c c30747c) {
            return null;
        }
    }

    /* JADX INFO: renamed from: qx0.g$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f126589w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f126590x;

        public c(Function1 function1, List list) {
            this.f126589w = function1;
            this.f126590x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m94471a(int i13) {
            return this.f126589w.invoke(this.f126590x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m94471a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: qx0.g$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f126591w;

        public d(List list) {
            this.f126591w = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m94472a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C30747c c30747c = (C30747c) this.f126591w.get(i13);
            c28655q.m87150e0(-449778122);
            AbstractC30751g.m94456k(c30747c, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m94472a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m94456k(C30747c c30747c, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(847164298);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c30747c) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 12;
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f14 = 16;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC15751g.m44455h(AbstractC15673b0.m44028b0(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f13))), 1, c38072d.m121949b(c28655q, i15).getWhite50(), AbstractC33253j.m105489e(f13)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            String upperCase = c30747c.getExperiment().getName().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            C2886a h7 = c38072d.m121952e(c28655q, i15).getH5();
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C28780r c28780r = C28780r.f116542I;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7);
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(upperCase, modifierM3398t, brandWhite, 0L, null, c28780r, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 196656, i16, 196568);
            AbstractC30795n.m94707h(c30747c.getCurrentVariant(), null, c38072d.m121949b(c28655q, i15).getRecoveryHighRecovery(), 0L, null, C28780r.f116540G, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH6(), null, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, i16, 196570);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(c30747c, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m94457l(C30747c c30747c, int i13, Composer composer, int i14) {
        m94456k(c30747c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m94458m(C30753i viewModel, InterfaceC4339a onNavigateBack, Composer composer, int i13) {
        int i14;
        C30753i c30753i;
        int i15;
        boolean z4;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(onNavigateBack, "onNavigateBack");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1999339822);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewModel) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigateBack) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewModel.getUiState(), c28655q, 0);
            boolean zM87157i = c28655q.m87157i(viewModel);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new a(viewModel, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l("EXPERIMENTS DEBUG");
            C38072d c38072d = C38072d.f163053a;
            AbstractC6719b.m20143d(null, new AbstractC6721d.c(null, textResourceM21278l, null, Integer.valueOf(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, Integer.valueOf(c38072d.m121951d().getLogo().getWhoop()), null, null, null, null, null, null, null, 8149, null), null, onNavigateBack, null, null, c28655q, ((i14 << 6) & 7168) | (AbstractC6721d.c.f25657p << 3), 53);
            AbstractC30752h abstractC30752hM94459n = m94459n(interfaceC28601c1M87261o);
            if (abstractC30752hM94459n instanceof AbstractC30752h.b) {
                c28655q.m87150e0(-1242144119);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
                z4 = true;
                i15 = 14;
                AbstractC15170v4.m43202b(null, c38072d.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0.0f, 0L, 0, c28655q, 0, 29);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                c30753i = viewModel;
            } else {
                i15 = 14;
                z4 = true;
                if (abstractC30752hM94459n instanceof AbstractC30752h.a) {
                    c28655q.m87150e0(-1241632774);
                    float f13 = 16;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f13, f13);
                    WeakHashMap weakHashMap = C22944c2.f90553v;
                    C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
                    c30753i = viewModel;
                    boolean zM87157i2 = c28655q.m87157i(c30753i);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C29124b(c30753i, 17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC22674j.m65717c(modifierM3395q, null, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q, 24582, 490);
                    c28655q.m87173q(false);
                } else {
                    c30753i = viewModel;
                    if (!(abstractC30752hM94459n instanceof AbstractC30752h.c)) {
                        throw AbstractC11895b.m32003v(-1979726429, c28655q, false);
                    }
                    c28655q.m87150e0(-1237495359);
                    float f14 = 16;
                    Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f14, f14);
                    WeakHashMap weakHashMap2 = C22944c2.f90553v;
                    C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7);
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14);
                    boolean zM87157i3 = c28655q.m87157i(c30753i) | c28655q.m87153g(abstractC30752hM94459n);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C29793c(i15, (AbstractC30752h.c) abstractC30752hM94459n, c30753i);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC22674j.m65717c(modifierM3395q2, null, c22976l1M3381c2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R3, c28655q, 24582, 490);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(z4);
        } else {
            c30753i = viewModel;
            i15 = 14;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(c30753i, onNavigateBack, i13, i15);
        }
    }

    /* JADX INFO: renamed from: n */
    private static final AbstractC30752h m94459n(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC30752h) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m94460o(C30753i c30753i, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C30749e(c30753i, 0), true, 91867494), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, C30746b.f126572a.m94435i(), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m94461p(C30753i c30753i, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a h7 = c38072d.m121952e(c28655q, i14).getH4();
            long brandWhite = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2314t c2314t = C2314t.f9131w;
            AbstractC30795n.m94707h("HELPERS 🔧", AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 12, 7), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 54, C2886a.f11498d << 18, 196600);
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 8, 7);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43198c = AbstractC15166v0.m43198c(c38072d.m121949b(c28655q, i14).getBrandBlack(), c38072d.m121949b(c28655q, i14).getBrandWhite(), c28655q, 4);
            float f13 = 1;
            C13825t c13825tM48880a = AbstractC17269i.m48880a(f13, c38072d.m121949b(c28655q, i14).getWhite70());
            boolean zM87157i = c28655q.m87157i(c30753i);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C30750f(c30753i, 0);
                c28655q.m87172p0(objM87133R);
            }
            C30746b c30746b = C30746b.f126572a;
            AbstractC12350b.m34582c((InterfaceC4339a) objM87133R, modifierM3398t, false, c13825tM48880a, c15077m1M43198c, c30746b.m94440n(), c28655q, 805306416, 316);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C15077m1 c15077m1M43198c2 = AbstractC15166v0.m43198c(c38072d.m121949b(c28655q, i14).getBrandBlack(), c38072d.m121949b(c28655q, i14).getBrandWhite(), c28655q, 4);
            C13825t c13825tM48880a2 = AbstractC17269i.m48880a(f13, c38072d.m121949b(c28655q, i14).getWhite70());
            boolean zM87157i2 = c28655q.m87157i(c30753i);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C30750f(c30753i, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC12350b.m34582c((InterfaceC4339a) objM87133R2, modifierM3409f, false, c13825tM48880a2, c15077m1M43198c2, c30746b.m94438l(), c28655q, 805306416, 316);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m94462q(C30753i c30753i) {
        c30753i.m94479o();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m94463r(C30753i c30753i) {
        c30753i.m94481r();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m94464s(AbstractC30752h abstractC30752h, C30753i c30753i, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C30749e(c30753i, 1), true, -1993975321), 3);
        C30746b c30746b = C30746b.f126572a;
        InterfaceC26064q.m77556b(LazyColumn, null, c30746b.m94439m(), 3);
        List<C30747c> listM94473a = ((AbstractC30752h.c) abstractC30752h).m94473a();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM94473a.size(), null, new c(b.f126588w, listM94473a), new C37816b(new d(listM94473a), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, c30746b.m94437k(), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m94465t(C30753i c30753i, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a h7 = c38072d.m121952e(c28655q, i14).getH4();
            long brandWhite = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2314t c2314t = C2314t.f9131w;
            AbstractC30795n.m94707h("HELPERS 🔧", AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 12, 7), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 54, C2886a.f11498d << 18, 196600);
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 8, 7);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43198c = AbstractC15166v0.m43198c(c38072d.m121949b(c28655q, i14).getBrandBlack(), c38072d.m121949b(c28655q, i14).getBrandWhite(), c28655q, 4);
            float f13 = 1;
            C13825t c13825tM48880a = AbstractC17269i.m48880a(f13, c38072d.m121949b(c28655q, i14).getWhite70());
            boolean zM87157i = c28655q.m87157i(c30753i);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C30750f(c30753i, 2);
                c28655q.m87172p0(objM87133R);
            }
            C30746b c30746b = C30746b.f126572a;
            AbstractC12350b.m34582c((InterfaceC4339a) objM87133R, modifierM3398t, false, c13825tM48880a, c15077m1M43198c, c30746b.m94434h(), c28655q, 805306416, 316);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C15077m1 c15077m1M43198c2 = AbstractC15166v0.m43198c(c38072d.m121949b(c28655q, i14).getBrandBlack(), c38072d.m121949b(c28655q, i14).getBrandWhite(), c28655q, 4);
            C13825t c13825tM48880a2 = AbstractC17269i.m48880a(f13, c38072d.m121949b(c28655q, i14).getWhite70());
            boolean zM87157i2 = c28655q.m87157i(c30753i);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C30750f(c30753i, 3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC12350b.m34582c((InterfaceC4339a) objM87133R2, modifierM3409f, false, c13825tM48880a2, c15077m1M43198c2, c30746b.m94436j(), c28655q, 805306416, 316);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m94466u(C30753i c30753i) {
        c30753i.m94479o();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m94467v(C30753i c30753i) {
        c30753i.m94481r();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m94468w(C30753i c30753i, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m94458m(c30753i, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
