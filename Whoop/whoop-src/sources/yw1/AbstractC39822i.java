package yw1;

import am2.C1008b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c41.AbstractC4101q4;
import c41.C4094p4;
import c41.C4108r4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9774e;
import hy0.AbstractC17755i2;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import jx1.C22015f0;
import kotlin.C1990b0;
import l83.C23454a0;
import m83.AbstractC25267u;
import nw0.C27198e;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import pv1.AbstractC29579b;
import q21.C29850i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t20.C33334o;
import uw1.AbstractC35312e;
import uw1.C35310c;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import ww1.AbstractC37659e;
import ww1.C37662h;
import ww1.C37663i;
import ww1.C37669o;
import ww1.InterfaceC37658d;
import x81.C38072d;
import y71.C39272e;
import yb0.C39382e;
import yf1.C39516e;
import yk2.C39609i;
import yo0.C39681c;

/* JADX INFO: renamed from: yw1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0017²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Luw1/c;", "viewState", "Lkotlin/Function1;", "Lww1/c;", "Ll83/a0;", "onEvent", "G", "(Luw1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Luw1/c$c;", "o", "(Luw1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "nameText", "Lkotlin/Function0;", "onRemove", "onCancel", "I", "(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "hasViewScreenFPHAlreadySent", "Lc41/r4;", "selectedProfileViewState", "allowSheetDismiss", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39822i {

    /* JADX INFO: renamed from: yw1.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.view.screens.FamilyPlanHubScreenKt$FamilyPlanHubLoadedScreen$1$1", m100430f = "FamilyPlanHubScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171595w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f171596x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C35310c.c f171597y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f171598z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C35310c.c cVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171596x = function1;
            this.f171597y = cVar;
            this.f171598z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f171596x, this.f171597y, this.f171598z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171595w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC39822i.m127708q(this.f171598z)) {
                AbstractC39822i.m127717z(this.f171598z, true);
                this.f171596x.invoke(new C37669o(this.f171597y));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yw1.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final b f171599w = new b();

        /* JADX INFO: renamed from: a */
        public final Modifier m127718a(InterfaceC25312u it, Composer composer, int i13) {
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(235474117);
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 1 * 8, 0.0f, 2);
            c28655q.m87173q(false);
            return modifierM3396r;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m127718a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: yw1.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f171600E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f171601F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C15199y3 f171602G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f171603w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f171604x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C35310c.c f171605y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2994c0 f171606z;

        public c(InterfaceC25312u interfaceC25312u, Function1 function1, C35310c.c cVar, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C15199y3 c15199y3) {
            this.f171603w = interfaceC25312u;
            this.f171604x = function1;
            this.f171605y = cVar;
            this.f171606z = interfaceC2994c0;
            this.f171600E = interfaceC28601c1;
            this.f171601F = interfaceC28601c2;
            this.f171602G = c15199y3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m127719a(Object viewEvent) {
            List<C4108r4> listM12578a;
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (!(viewEvent instanceof AbstractC4101q4.a)) {
                this.f171604x.invoke(new C37662h(viewEvent, this.f171603w, this.f171605y));
                return;
            }
            InterfaceC25312u interfaceC25312u = this.f171603w;
            Object obj = null;
            C4094p4 c4094p4 = interfaceC25312u instanceof C4094p4 ? (C4094p4) interfaceC25312u : null;
            if (c4094p4 != null && (listM12578a = c4094p4.m12578a()) != null) {
                for (Object obj2 : listM12578a) {
                    if (AbstractC22676k.m65745e(((C4108r4) obj2).getId(), ((AbstractC4101q4.a) viewEvent).getId())) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (C4108r4) obj;
            }
            C4108r4 c4108r4 = obj;
            if (c4108r4 == 0 || c4108r4.getUserId() == null || c4108r4.getFamilyPlanId() == null) {
                return;
            }
            AbstractC39822i.m127681F(this.f171604x, this.f171606z, this.f171600E, this.f171601F, this.f171602G, c4108r4);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m127719a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yw1.i$d */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.view.screens.FamilyPlanHubScreenKt$FamilyPlanHubLoadedScreen$dismissSheetCommonActions$1$1$1", m100430f = "FamilyPlanHubScreen.kt", m100431l = {139}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171607w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f171608x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f171609y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171608x = c15199y3;
            this.f171609y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f171608x, this.f171609y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171607w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15199y3 c15199y3 = this.f171608x;
                    this.f171607w = 1;
                    if (c15199y3.m43223d(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC39822i.m127679D(this.f171609y, false);
                return C23454a0.f92919a;
            } catch (Throwable th3) {
                AbstractC39822i.m127679D(this.f171609y, false);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: yw1.i$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f171610w = new e();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C22015f0 c22015f0) {
            return null;
        }
    }

    /* JADX INFO: renamed from: yw1.i$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f171611w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f171612x;

        public f(Function1 function1, List list) {
            this.f171611w = function1;
            this.f171612x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m127721a(int i13) {
            return this.f171611w.invoke(this.f171612x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m127721a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: yw1.i$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C35310c.c f171613E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f171614F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f171615G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f171616w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f171617x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2994c0 f171618y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15199y3 f171619z;

        public g(List list, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, C35310c.c cVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f171616w = list;
            this.f171617x = function1;
            this.f171618y = interfaceC2994c0;
            this.f171619z = c15199y3;
            this.f171613E = cVar;
            this.f171614F = interfaceC28601c1;
            this.f171615G = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m127722a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            InterfaceC25312u interfaceC25312u;
            int i15 = (i14 & 6) == 0 ? i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) : i14;
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C22015f0 c22015f0 = (C22015f0) this.f171616w.get(i13);
            c28655q.m87150e0(-177260598);
            char c3 = 3;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 4), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1720860490);
            List<InterfaceC25312u> listM62922a = c22015f0.m62922a();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM62922a, 10));
            for (InterfaceC25312u interfaceC25312u2 : listM62922a) {
                if (interfaceC25312u2 instanceof C29850i) {
                    c28655q.m87150e0(-1197013349);
                    AbstractC25012a.m73388u(1, 8, c2314t, c28655q, false);
                } else {
                    c28655q.m87150e0(-1196909561);
                    c28655q.m87173q(false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                C25307p c25307pM112150c = AbstractC35312e.m112150c();
                b bVar = b.f171599w;
                boolean zM87157i = c28655q.m87157i(interfaceC25312u2) | c28655q.m87153g(this.f171617x) | c28655q.m87157i(this.f171618y) | c28655q.m87157i(this.f171619z) | c28655q.m87157i(this.f171613E);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    interfaceC25312u = interfaceC25312u2;
                    objM87133R = new c(interfaceC25312u, this.f171617x, this.f171613E, this.f171618y, this.f171614F, this.f171615G, this.f171619z);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC25312u = interfaceC25312u2;
                }
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM112150c, bVar, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
                c28655q.m87173q(true);
                arrayList.add(C23454a0.f92919a);
                c3 = c3;
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m127722a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yw1.i$h */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.view.screens.FamilyPlanHubScreenKt$FamilyPlanHubLoadedScreen$openRemoveMemberSheet$1", m100430f = "FamilyPlanHubScreen.kt", m100431l = {131}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171620w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f171621x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C15199y3 c15199y3, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171621x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f171621x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171620w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f171621x;
                this.f171620w = 1;
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

    /* JADX INFO: renamed from: A */
    private static final C4108r4 m127676A(InterfaceC28601c1 interfaceC28601c1) {
        return (C4108r4) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: B */
    private static final void m127677B(InterfaceC28601c1 interfaceC28601c1, C4108r4 c4108r4) {
        interfaceC28601c1.setValue(c4108r4);
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m127678C(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m127679D(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final boolean m127680E(InterfaceC28601c1 interfaceC28601c1, EnumC15209z3 newValue) {
        AbstractC22676k.m65750j(newValue, "newValue");
        return newValue != EnumC15209z3.f57106w || m127678C(interfaceC28601c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m127681F(Function1 function1, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C15199y3 c15199y3, C4108r4 c4108r4) {
        function1.invoke(C37663i.f161411a);
        m127677B(interfaceC28601c1, c4108r4);
        m127679D(interfaceC28601c2, false);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new h(c15199y3, null), 3);
    }

    /* JADX INFO: renamed from: G */
    public static final void m127682G(C35310c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-694675682);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState.getFullScreenModal() != null) {
            c28655q.m87150e0(-1930643800);
            AbstractC39817d.m127661i(viewState.getFullScreenModal(), onEvent, c28655q, i14 & 112);
            c28655q.m87173q(false);
        } else if (viewState.getScreenContent() != null) {
            c28655q.m87150e0(-1930440688);
            AbstractC39821h.m127670f(viewState, onEvent, c28655q, i14 & 126);
            m127706o(viewState.getScreenContent(), onEvent, c28655q, i14 & 112);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1930169500);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39819f(viewState, onEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m127683H(C35310c c35310c, Function1 function1, int i13, Composer composer, int i14) {
        m127682G(c35310c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    private static final void m127684I(String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2110471670);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a3) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 8;
            float f14 = 1 * f13;
            float f15 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, f14, f15 * f13, 2);
            C2305k c2305k = C2299e.f9111N;
            C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 1.5d, f13, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            int i15 = i14;
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f16 = f15 * f15;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f16));
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125349M = c38072d.m121949b(c28655q, i16).getGreyL8();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1092a.m3358c(modifierM118994r, jM125349M, c17916v0));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC29579b.f120724b);
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, i16).getB2();
            long jM125382b1 = c38072d.m121949b(c28655q, i16).getWhite50();
            C28780r c28780r = C28780r.f116542I;
            int i17 = C2886a.f11498d << 18;
            int i18 = 2;
            AbstractC30795n.m94707h(strM92103Y, null, jM125382b1, 0L, null, c28780r, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, i17, 196570);
            C28655q c28655q2 = c28655q;
            if (str.length() > 0) {
                c28655q2.m87150e0(-1368975453);
                AbstractC30795n.m94707h(AbstractC30060g.m92102X(AbstractC29579b.f120733k, new Object[]{str}, c28655q2), null, c38072d.m121949b(c28655q2, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB2(), null, c28655q2, 0, i17, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1368720230);
                c28655q2.m87173q(false);
            }
            C28655q c28655q3 = c28655q2;
            AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q3, 0, 255);
            c28655q = c28655q3;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29579b.f120732j, null, i18, 0 == true ? 1 : 0);
            EnumC27272p enumC27272p = EnumC27272p.FAMILY_PLAN;
            AbstractC18247a abstractC18247aM52575m = AbstractC18249c.m52575m(EnumC39333f.TRANSPARENT);
            EnumC39333f enumC39333f = EnumC39333f.ACCENT_ALERT;
            EnumC27254g enumC27254g = EnumC27254g.STANDARD;
            C27256h c27256h = new C27256h(c8688b, null, abstractC18247aM52575m, enumC39333f, null, null, enumC27272p, null, null, null, enumC27254g, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33536946, null);
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C39272e(interfaceC4339a, 8);
                c28655q.m87172p0(objM87133R);
            }
            int i19 = C27256h.f109055z << 3;
            AbstractC27249e.m82121d(null, c27256h, null, (InterfaceC4339a) objM87133R, c28655q, i19, 5);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f16)), c38072d.m121949b(c28655q, i16).getGreyL8(), c17916v0));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            C27256h c27256h2 = new C27256h(new TextResource.C8688b(AbstractC29579b.f120723a, objArr2 == true ? 1 : 0, i18, objArr == true ? 1 : 0), null, null, EnumC39333f.STRAIN, null, null, enumC27272p, null, null, null, enumC27254g, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33536950, null);
            Object[] objArr3 = (i15 & 896) == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (objArr3 == true || objM87133R2 == c28676v0) {
                interfaceC4339a3 = interfaceC4339a2;
                objM87133R2 = new C39272e(interfaceC4339a3, 9);
                c28655q.m87172p0(objM87133R2);
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            AbstractC27249e.m82121d(null, c27256h2, null, (InterfaceC4339a) objM87133R2, c28655q, i19, 5);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33334o(str, interfaceC4339a, interfaceC4339a3, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m127685J(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m127686K(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m127687L(String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m127684I(str, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    private static final void m127706o(C35310c.c cVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        boolean zM87157i;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-13590296);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R2 == c28676v1) {
                objM87133R2 = new C39681c(15);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R2, c28655q, 48);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v1) {
                objM87133R3 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v1) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v1) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v1) {
                objM87133R6 = new C39382e(7, interfaceC28601c3);
                c28655q.m87172p0(objM87133R6);
            }
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, (Function1) objM87133R6, true, c28655q, 3462, 2);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | ((i14 & 112) == 32) | c28655q.m87157i(cVar);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87153g) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R7 == c28676v0) {
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, cVar);
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C9774e(interfaceC2994c0, c15199y3M3460c, interfaceC28601c2, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC1118c.m3458a(AbstractC37817c.m121344e(579502102, c28655q, new C39818e(function1, (InterfaceC4339a) objM87133R, interfaceC28601c2)), null, c15199y3M3460c, false, null, 0.0f, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent(), C17919x.f69636m, C17919x.m51541c(0.5f, C17919x.f69625b), AbstractC37817c.m121344e(686852111, c28655q, new C1990b0(cVar, function1, interfaceC2994c0, c15199y3M3460c, interfaceC28601c2, interfaceC28601c3, 12)), c28655q, 918553094, 58);
                c28655q = c28655q;
            }
            objM87133R7 = new a(function1, cVar, interfaceC28601c1, null);
            c28655q.m87172p0(objM87133R7);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, cVar);
            zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C9774e(interfaceC2994c0, c15199y3M3460c, interfaceC28601c2, interfaceC28601c3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C9774e(interfaceC2994c0, c15199y3M3460c, interfaceC28601c2, interfaceC28601c3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1118c.m3458a(AbstractC37817c.m121344e(579502102, c28655q, new C39818e(function1, (InterfaceC4339a) objM87133R, interfaceC28601c2)), null, c15199y3M3460c, false, null, 0.0f, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent(), C17919x.f69636m, C17919x.m51541c(0.5f, C17919x.f69625b), AbstractC37817c.m121344e(686852111, c28655q, new C1990b0(cVar, function1, interfaceC2994c0, c15199y3M3460c, interfaceC28601c2, interfaceC28601c3, 12)), c28655q, 918553094, 58);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(cVar, function1, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28601c1 m127707p() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final boolean m127708q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC3027k1 m127709r(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C15199y3 c15199y3) {
        m127677B(interfaceC28601c1, null);
        m127679D(interfaceC28601c2, true);
        return AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c15199y3, interfaceC28601c2, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m127710s(Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y sheetContent, Composer composer, int i13) {
        TextResource textResourceM12664k;
        String strM12666m;
        String strM12659f;
        AbstractC22676k.m65750j(sheetContent, "$this$sheetContent");
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 17) != 16);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        C4108r4 c4108r4M127676A = m127676A(interfaceC28601c1);
        if (c4108r4M127676A == null || (textResourceM12664k = c4108r4M127676A.getTitle()) == null || (strM12666m = c4108r4M127676A.getUserId()) == null || (strM12659f = c4108r4M127676A.getFamilyPlanId()) == null) {
            return c23454a0;
        }
        String strM21274h = AbstractC8693b.m21274h(textResourceM12664k, c28655q, TextResource.$stable);
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(strM12666m) | c28655q.m87153g(strM12659f) | c28655q.m87153g(interfaceC4339a);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C27198e(function1, strM12666m, strM12659f, interfaceC4339a);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(interfaceC4339a);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C39272e(interfaceC4339a, 10);
            c28655q.m87172p0(objM87133R2);
        }
        m127684I(strM21274h, interfaceC4339a2, (InterfaceC4339a) objM87133R2, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m127711t(Function1 function1, String str, String str2, InterfaceC4339a interfaceC4339a) {
        function1.invoke(new InterfaceC37658d.d(str, str2));
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m127712u(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m127713v(C35310c.c cVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            float f13 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM94757f);
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
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getNavigationBarTitle()), null, Integer.valueOf(AbstractC18489d0.m53357C(c38072d)), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C39609i(function1, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f13, 0.0f, 2);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1099a.m3398t(modifierM3396r, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7), c38072d.m121949b(c28655q, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * 4);
            boolean zM87157i = c28655q.m87157i(cVar) | c28655q.m87153g(function1) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C1008b c1008b = new C1008b((Object) cVar, (Object) function1, (Object) interfaceC2994c0, (Object) c15199y3, interfaceC28601c1, interfaceC28601c2, 21);
                c28655q.m87172p0(c1008b);
                objM87133R2 = c1008b;
            }
            AbstractC22674j.m65717c(modifierM3358c, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q, 24576, 494);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m127714w(Function1 function1) {
        function1.invoke(AbstractC37659e.d.f161402a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m127715x(C35310c.c cVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C22015f0> listM112126b = cVar.m112126b();
        e eVar = e.f171610w;
        ((C26053f) LazyColumn).m77529r(listM112126b.size(), null, new f(eVar, listM112126b), new C37816b(new g(listM112126b, function1, interfaceC2994c0, c15199y3, cVar, interfaceC28601c1, interfaceC28601c2), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m127716y(C35310c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m127706o(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m127717z(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }
}
