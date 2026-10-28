package am2;

import a00.C0073h;
import a11.C0130h;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm2.AbstractC3459m;
import bm2.AbstractC3487z0;
import bm2.C3462n;
import bm2.EnumC3475t0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import cm2.AbstractC4830r;
import cm2.AbstractC4837y;
import cm2.C4828p;
import cm2.C4829q;
import cm2.EnumC4821i;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import gb1.AbstractC15673b0;
import gy0.AbstractC16276e;
import gz0.AbstractC16319p0;
import hv1.C17675e;
import hy0.AbstractC17755i2;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C13762f;
import p000.C24827m;
import p000.C28503p;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15093n7;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl2.AbstractC32706a;
import uv0.AbstractC35283c;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39282o;
import yl2.AbstractC39640g;

/* JADX INFO: renamed from: am2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0017\u001a\u00020\u0004*\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001e\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006'²\u0006\u000e\u0010 \u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010&\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lam2/p0;", "viewStateTrends", "Lkotlin/Function1;", "Lcm2/y;", "Ll83/a0;", "onViewEvent", "Lyl2/g;", "onNavigationEvent", "Lcm2/w;", "onAnalyticsEvent", "v", "(Lam2/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcm2/q;", "viewState", "A", "(Lcm2/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ln0/u;", "", "buffer", "", "nextToken", "", "onLoading", "c0", "(Ln0/u;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a0", "(Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onApprove", "onDismiss", "f0", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "isLoadingMore", "showPopUpDialog", "showEditBottomSheet", "showAddBottomSheet", "Lbm2/n;", "selectedMeasurement", "selectedMeasurementId", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1026k {

    /* JADX INFO: renamed from: am2.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.AllReportsDataScreenKt$AllReportsDataScreen$2$1", m100430f = "AllReportsDataScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3859w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f3860x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C1037p0 f3861y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C1037p0 c1037p0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3860x = function1;
            this.f3861y = c1037p0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f3860x, this.f3861y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f3859w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function1 function1 = this.f3860x;
            EnumC4821i enumC4821iM2723d = this.f3861y.getMetaData().getMeasurementType();
            if (enumC4821iM2723d == null) {
                enumC4821iM2723d = EnumC4821i.VO2_MAX;
            }
            function1.invoke(new AbstractC4837y.i(enumC4821iM2723d));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.AllReportsDataScreenKt$AllReportsSuccessScreen$1$1", m100430f = "AllReportsDataScreen.kt", m100431l = {173}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f3862E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f3863F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f3864G;

        /* JADX INFO: renamed from: w */
        int f3865w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f3866x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f3867y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f3868z;

        /* JADX INFO: renamed from: am2.k$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f3869E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f3870w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28601c1 f3871x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f3872y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f3873z;

            public a(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
                this.f3870w = function1;
                this.f3871x = interfaceC28601c1;
                this.f3872y = interfaceC28601c2;
                this.f3873z = interfaceC28601c3;
                this.f3869E = interfaceC28601c4;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (enumC15209z3 == EnumC15209z3.f57106w) {
                    AbstractC1026k.m2752Z(this.f3871x, false);
                    AbstractC1026k.m2730D(this.f3872y, false);
                    AbstractC1026k.m2732F(this.f3873z, null);
                    AbstractC1026k.m2734H(this.f3869E, null);
                    this.f3870w.invoke(new AbstractC4837y.k(InterfaceC1038q.d.f4000a));
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3866x = c15199y3;
            this.f3867y = function1;
            this.f3868z = interfaceC28601c1;
            this.f3862E = interfaceC28601c2;
            this.f3863F = interfaceC28601c3;
            this.f3864G = interfaceC28601c4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m2793h(C15199y3 c15199y3) {
            return c15199y3.m43221b();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f3866x, this.f3867y, this.f3868z, this.f3862E, this.f3863F, this.f3864G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3865w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C1028l(this.f3866x, 0));
                a aVar = new a(this.f3867y, this.f3868z, this.f3862E, this.f3863F, this.f3864G);
                this.f3865w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: am2.k$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C4828p f3874w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f3875x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f3876y;

        public c(C4828p c4828p, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f3874w = c4828p;
            this.f3875x = interfaceC28601c1;
            this.f3876y = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m2795a() {
            AbstractC1026k.m2734H(this.f3875x, ((C3462n) this.f3874w.getContent()).getId());
            AbstractC1026k.m2750X(this.f3876y, true);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2795a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.k$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4339a {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f3877E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C4828p f3878w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f3879x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f3880y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f3881z;

        public d(C4828p c4828p, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
            this.f3878w = c4828p;
            this.f3879x = interfaceC28601c1;
            this.f3880y = interfaceC28601c2;
            this.f3881z = interfaceC28601c3;
            this.f3877E = interfaceC28601c4;
        }

        /* JADX INFO: renamed from: a */
        public final void m2796a() {
            AbstractC1026k.m2734H(this.f3879x, ((C3462n) this.f3878w.getContent()).getId());
            AbstractC1026k.m2732F(this.f3880y, (C3462n) this.f3878w.getContent());
            AbstractC1026k.m2752Z(this.f3881z, true);
            AbstractC1026k.m2730D(this.f3877E, false);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2796a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.k$e */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.AllReportsDataScreenKt$AllReportsSuccessScreen$2$4$1", m100430f = "AllReportsDataScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3882w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f3883x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4829q f3884y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f3885z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC28601c1 interfaceC28601c1, C4829q c4829q, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3883x = interfaceC28601c1;
            this.f3884y = c4829q;
            this.f3885z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f3883x, this.f3884y, this.f3885z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object next;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f3882w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM2733G = AbstractC1026k.m2733G(this.f3883x);
            if (strM2733G != null) {
                C4829q c4829q = this.f3884y;
                InterfaceC28601c1 interfaceC28601c1 = this.f3885z;
                Iterator<T> it = c4829q.getSections().m15245b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((C4828p) next).getId(), strM2733G));
                C4828p c4828p = (C4828p) next;
                Object objM15246a = c4828p != null ? c4828p.getContent() : null;
                AbstractC22676k.m65748h(objM15246a, "null cannot be cast to non-null type com.whoop.trends.view.component.GenericMeasurementViewState");
                AbstractC1026k.m2732F(interfaceC28601c1, (C3462n) objM15246a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.k$f */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.AllReportsDataScreenKt$AllReportsSuccessScreen$2$7$1$1", m100430f = "AllReportsDataScreen.kt", m100431l = {337}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3886w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f3887x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f3888y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f3889z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3887x = c15199y3;
            this.f3888y = interfaceC28601c1;
            this.f3889z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f3887x, this.f3888y, this.f3889z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3886w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f3887x;
                this.f3886w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC1026k.m2730D(this.f3888y, false);
            AbstractC1026k.m2752Z(this.f3889z, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.k$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f3890w = new g();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C4828p c4828p) {
            return null;
        }
    }

    /* JADX INFO: renamed from: am2.k$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f3891w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f3892x;

        public h(Function1 function1, List list) {
            this.f3891w = function1;
            this.f3892x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m2798a(int i13) {
            return this.f3891w.invoke(this.f3892x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m2798a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: am2.k$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f3893w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f3894x;

        public i(Function1 function1, List list) {
            this.f3893w = function1;
            this.f3894x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m2799a(int i13) {
            return this.f3893w.invoke(this.f3894x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m2799a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: am2.k$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f3895E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f3896F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f3897w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f3898x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f3899y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f3900z;

        public j(List list, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5) {
            this.f3897w = list;
            this.f3898x = interfaceC28601c1;
            this.f3899y = interfaceC28601c2;
            this.f3900z = interfaceC28601c3;
            this.f3895E = interfaceC28601c4;
            this.f3896F = interfaceC28601c5;
        }

        /* JADX INFO: renamed from: a */
        public final void m2800a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
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
            C4828p c4828p = (C4828p) this.f3897w.get(i13);
            c28655q.m87150e0(1080264420);
            Object objM15246a = c4828p.getContent();
            if (objM15246a instanceof TextResource) {
                c28655q.m87150e0(1080299418);
                AbstractC17755i2.m50938j(null, null, null, (TextResource) c4828p.getContent(), null, 0L, 0L, null, c28655q, 0, 247);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (objM15246a instanceof C3462n) {
                c28655q.m87150e0(1080484643);
                C3462n c3462n = (C3462n) c4828p.getContent();
                boolean zM87157i = c28655q.m87157i(c4828p);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new c(c4828p, this.f3898x, this.f3899y);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean zM87157i2 = c28655q.m87157i(c4828p);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    d dVar = new d(c4828p, this.f3898x, this.f3900z, this.f3895E, this.f3896F);
                    c28655q.m87172p0(dVar);
                    objM87133R2 = dVar;
                }
                AbstractC3459m.m10140h(c3462n, interfaceC4339a, (InterfaceC4339a) objM87133R2, new C15093n7(EnumC3475t0.NOT_EXPANDED, null, 6), c4828p.getId(), c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1081395516);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m2800a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.k$k */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.AllReportsDataScreenKt$OnBottomReached$1$1", m100430f = "AllReportsDataScreen.kt", m100431l = {363}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3901w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f3902x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f3903y;

        /* JADX INFO: renamed from: am2.k$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f3904w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f3905x;

            public a(Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
                this.f3904w = function1;
                this.f3905x = interfaceC28670t2;
            }

            /* JADX INFO: renamed from: b */
            public final Object m2803b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f3904w.invoke(this.f3905x.getValue());
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m2803b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC28670t2 interfaceC28670t2, Function1 function1, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3902x = interfaceC28670t2;
            this.f3903y = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m2802h(InterfaceC28670t2 interfaceC28670t2) {
            return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f3902x, this.f3903y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3901w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C1030m(this.f3902x, 0));
                a aVar = new a(this.f3903y, this.f3902x);
                this.f3901w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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

    /* JADX WARN: Code duplicated, block: B:109:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:115:0x030d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0338  */
    /* JADX WARN: Code duplicated, block: B:119:0x033c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0357  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:128:0x0401  */
    /* JADX WARN: Code duplicated, block: B:130:0x0413  */
    /* JADX WARN: Code duplicated, block: B:131:0x0421  */
    /* JADX WARN: Code duplicated, block: B:138:0x0478  */
    /* JADX WARN: Code duplicated, block: B:141:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:146:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:148:0x0512  */
    /* JADX WARN: Code duplicated, block: B:151:0x0521  */
    /* JADX WARN: Code duplicated, block: B:153:0x052d  */
    /* JADX WARN: Code duplicated, block: B:154:0x053b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0545  */
    /* JADX WARN: Code duplicated, block: B:157:0x0547  */
    /* JADX WARN: Code duplicated, block: B:163:0x0561  */
    /* JADX WARN: Code duplicated, block: B:166:0x0578  */
    /* JADX WARN: Code duplicated, block: B:169:0x058f  */
    /* JADX WARN: Code duplicated, block: B:175:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:178:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:179:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:181:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:182:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:184:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:186:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:191:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:193:0x061d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0633  */
    /* JADX WARN: Code duplicated, block: B:198:0x063f  */
    /* JADX WARN: Code duplicated, block: B:200:0x064b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0655  */
    /* JADX WARN: Code duplicated, block: B:203:0x0657  */
    /* JADX WARN: Code duplicated, block: B:207:0x0660  */
    /* JADX WARN: Code duplicated, block: B:209:0x0682  */
    /* JADX WARN: Code duplicated, block: B:213:0x069f  */
    /* JADX WARN: Code duplicated, block: B:214:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:218:0x06ab  */
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
    @SuppressLint({"SuspiciousIndentation"})
    /* JADX INFO: renamed from: A */
    private static final void m2727A(C4829q c4829q, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13) {
        int i14;
        C4829q c4829q2;
        Function1 function4;
        C28655q c28655q;
        Object bVar;
        C28676v0 c28676v0;
        C15199y3 c15199y3;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        C28676v0 c28676v1;
        int iHashCode;
        int iHashCode2;
        C39282o c39282oM15248a;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c5;
        InterfaceC28601c1 interfaceC28601c6;
        C28676v0 c28676v2;
        float f13;
        C28655q c28655q2;
        boolean zM87157i;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c7;
        InterfaceC28601c1 interfaceC28601c8;
        C28655q c28655q3;
        C28676v0 c28676v3;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c9;
        InterfaceC28601c1 interfaceC28601c10;
        int i15;
        boolean zM87157i2;
        Object objM87133R4;
        InterfaceC25312u interfaceC25312u;
        C3462n c3462nM2731E;
        InterfaceC25312u interfaceC25312uM10157c;
        InterfaceC2994c0 interfaceC2994c0;
        boolean z4;
        Object objM87133R5;
        InterfaceC25312u interfaceC25312uM15249b;
        C15199y3 c15199y4;
        boolean z13;
        Object objM87133R6;
        boolean z14;
        boolean z15;
        Object objM87133R7;
        String strM2733G;
        boolean z16;
        boolean zM87157i3;
        Object c1012d;
        InterfaceC28601c1 interfaceC28601c11;
        Object objM87133R8;
        String strM15244a;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1947376275);
        if ((i13 & 6) == 0) {
            i14 = (c28655q4.m87157i(c4829q) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q4.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q4.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q4.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q4.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q4, 3);
            Object objM87133R9 = c28655q4.m87133R();
            C28676v0 c28676v4 = C28635l.f115821a;
            if (objM87133R9 == c28676v4) {
                objM87133R9 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R9);
            }
            InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R9;
            Object objM87133R10 = c28655q4.m87133R();
            if (objM87133R10 == c28676v4) {
                objM87133R10 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R10);
            }
            InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R10;
            Object objM87133R11 = c28655q4.m87133R();
            if (objM87133R11 == c28676v4) {
                objM87133R11 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R11);
            }
            InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) objM87133R11;
            Object objM87133R12 = c28655q4.m87133R();
            if (objM87133R12 == c28676v4) {
                objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R12);
            }
            InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) objM87133R12;
            Object objM87133R13 = c28655q4.m87133R();
            if (objM87133R13 == c28676v4) {
                objM87133R13 = AbstractC28683x.m87272z(null);
                c28655q4.m87172p0(objM87133R13);
            }
            InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) objM87133R13;
            Object objM87133R14 = c28655q4.m87133R();
            if (objM87133R14 == c28676v4) {
                objM87133R14 = AbstractC28683x.m87272z(null);
                c28655q4.m87172p0(objM87133R14);
            }
            InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) objM87133R14;
            Object objM87133R15 = c28655q4.m87133R();
            if (objM87133R15 == c28676v4) {
                objM87133R15 = AbstractC28683x.m87262p(c28655q4);
                c28655q4.m87172p0(objM87133R15);
            }
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R15;
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            Object objM87133R16 = c28655q4.m87133R();
            if (objM87133R16 == c28676v4) {
                objM87133R16 = new C1024j(0, interfaceC28601c14, interfaceC28601c15);
                c28655q4.m87172p0(objM87133R16);
            }
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, (Function1) objM87133R16, true, c28655q4, 3462, 2);
            int i16 = i14 & 112;
            boolean zM87157i4 = c28655q4.m87157i(c15199y3M3460c) | (i16 == 32);
            Object objM87133R17 = c28655q4.m87133R();
            if (zM87157i4 || objM87133R17 == c28676v4) {
                c28676v0 = c28676v4;
                bVar = new b(c15199y3M3460c, function1, interfaceC28601c14, interfaceC28601c15, interfaceC28601c16, interfaceC28601c17, null);
                c15199y3 = c15199y3M3460c;
                interfaceC28601c1 = interfaceC28601c14;
                interfaceC28601c2 = interfaceC28601c15;
                interfaceC28601c3 = interfaceC28601c16;
                interfaceC28601c4 = interfaceC28601c17;
                c28655q4.m87172p0(bVar);
            } else {
                interfaceC28601c3 = interfaceC28601c16;
                c28676v0 = c28676v4;
                interfaceC28601c4 = interfaceC28601c17;
                interfaceC28601c2 = interfaceC28601c15;
                interfaceC28601c1 = interfaceC28601c14;
                bVar = objM87133R17;
                c15199y3 = c15199y3M3460c;
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) bVar, c15199y3);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            C15199y3 c15199y5 = c15199y3;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c1;
            InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
            int iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM66724m);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
            AbstractC6721d.a aVar = new AbstractC6721d.a(c4829q.getNavigationBarTitle(), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward()), AbstractC30060g.m92103Y(c28655q4, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            int i17 = i14 & 896;
            boolean zM87157i5 = (i16 == 32) | c28655q4.m87157i(c4829q) | (i17 == 256);
            Object objM87133R18 = c28655q4.m87133R();
            if (zM87157i5) {
                c28676v1 = c28676v0;
            } else {
                c28676v1 = c28676v0;
                if (objM87133R18 == c28676v1) {
                }
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R18, null, null, c28655q4, AbstractC6721d.a.f25641r << 3, 53);
                float f14 = 2;
                float f15 = 4;
                AbstractC11266d.m30469w(f14, f15, c2314t, c28655q4);
                float f16 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14 * f16, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3396r);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q4, 6);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
                TextResource textResourceM15254g = c4829q.getTitle();
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM15254g, c28655q4, i18);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C2886a c2886aM8418P = c38072d.m121952e(c28655q4, i19).getT3();
                long jM125430y = c38072d.m121949b(c28655q4, i19).getBrandWhite();
                int i24 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q4, 0, i24, 196602);
                c28655q4.m87173q(true);
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(1 * f15, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4829q.getSubtitle(), c28655q4, i18), null, c38072d.m121949b(c28655q4, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, i19).getB1(), null, c28655q4, 0, i24, 196602);
                float f17 = 6 * f15;
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f17, c2314t));
                c39282oM15248a = c4829q.getAddManualMeasurement();
                if (c39282oM15248a == null) {
                    c28655q4.m87150e0(-1677297622);
                    c28655q4.m87173q(false);
                    c28676v2 = c28676v1;
                    c28655q2 = c28655q4;
                    interfaceC28601c6 = interfaceC28601c19;
                    f13 = 1.0f;
                } else {
                    c28655q4.m87150e0(-1677297621);
                    C13762f c13762f = new C13762f(5);
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v1) {
                        interfaceC28601c5 = interfaceC28601c18;
                        interfaceC28601c6 = interfaceC28601c19;
                        objM87133R = new C1024j(1, interfaceC28601c5, interfaceC28601c6);
                        c28655q4.m87172p0(objM87133R);
                    } else {
                        interfaceC28601c5 = interfaceC28601c18;
                        interfaceC28601c6 = interfaceC28601c19;
                    }
                    interfaceC28601c18 = interfaceC28601c5;
                    c28676v2 = c28676v1;
                    f13 = 1.0f;
                    AbstractC25303l.m74291r(c39282oM15248a, null, c13762f, (Function1) objM87133R, c28655q4, C39282o.f168987q | 3072, 2);
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f17, c2314t));
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(f13, c2314t), 0.0f, 0.0f, 0.0f, f15 * f16, 7);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * f15);
                zM87157i = c28655q2.m87157i(c4829q);
                objM87133R2 = c28655q2.m87133R();
                if (!zM87157i || objM87133R2 == c28676v2) {
                    InterfaceC28601c1 interfaceC28601c20 = interfaceC28601c6;
                    C1008b c1008b = new C1008b((Object) c4829q, (Object) interfaceC28601c4, (Object) interfaceC28601c13, (Object) interfaceC28601c3, (Object) interfaceC28601c18, (Object) interfaceC28601c20, 0);
                    interfaceC28601c7 = interfaceC28601c13;
                    interfaceC28601c8 = interfaceC28601c20;
                    c28655q2.m87172p0(c1008b);
                    objM87133R2 = c1008b;
                } else {
                    interfaceC28601c8 = interfaceC28601c6;
                    interfaceC28601c7 = interfaceC28601c13;
                }
                c28655q3 = c28655q2;
                c28676v3 = c28676v2;
                AbstractC22674j.m65717c(modifierM3398t, c26068uM77569a, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q3, 24582, 492);
                String strM15244a2 = r1.getSections().getNextToken();
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v3) {
                    objM87133R3 = new C1010c(0, interfaceC28601c12);
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC28601c9 = interfaceC28601c3;
                interfaceC28601c10 = interfaceC28601c4;
                m2758c0(c26068uM77569a, 0, strM15244a2, (Function1) objM87133R3, c28655q3, 3072, 1);
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                if (m2728B(interfaceC28601c12)) {
                    c28655q3.m87150e0(1760315716);
                    m2754a0(c28655q3, 0);
                    strM15244a = r1.getSections().getNextToken();
                    if (strM15244a != null) {
                        function1.invoke(new AbstractC4837y.g(c4829q.getMetaData().getGraphKey(), strM15244a));
                    }
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(1760510799);
                    c28655q3.m87173q(false);
                }
                if (m2749W(interfaceC28601c7)) {
                    c28655q3.m87150e0(195340569);
                    strM2733G = m2733G(interfaceC28601c10);
                    if (strM2733G == null) {
                        c28655q3.m87150e0(1760590344);
                        c28655q3.m87173q(false);
                        function4 = r4;
                        i15 = 32;
                        c4829q2 = r1;
                    } else {
                        c28655q3.m87150e0(1760590345);
                        i15 = 32;
                        if (i16 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87157i3 = z16 | c28655q3.m87157i(r1) | c28655q3.m87153g(strM2733G);
                        Object objM87133R19 = c28655q3.m87133R();
                        if (!zM87157i3 || objM87133R19 == c28676v3) {
                            function4 = r4;
                            InterfaceC28601c1 interfaceC28601c21 = interfaceC28601c7;
                            c1012d = new C1012d(function4, r1, strM2733G, interfaceC28601c21, 0);
                            c4829q2 = r1;
                            interfaceC28601c11 = interfaceC28601c21;
                            c28655q3.m87172p0(c1012d);
                        } else {
                            c1012d = objM87133R19;
                            function4 = r4;
                            interfaceC28601c11 = interfaceC28601c7;
                            c4829q2 = r1;
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c1012d;
                        objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == c28676v3) {
                            objM87133R8 = new C1014e(0, interfaceC28601c11);
                            c28655q3.m87172p0(objM87133R8);
                        }
                        m2764f0(interfaceC4339a, (InterfaceC4339a) objM87133R8, c28655q3, 48);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(false);
                } else {
                    function4 = r4;
                    i15 = 32;
                    c4829q2 = r1;
                    c28655q3.m87150e0(1760975055);
                    c28655q3.m87173q(false);
                }
                List<C4828p> listM15245b = c4829q2.getSections().m15245b();
                zM87157i2 = c28655q3.m87157i(c4829q2);
                objM87133R4 = c28655q3.m87133R();
                if (!zM87157i2 || objM87133R4 == c28676v3) {
                    interfaceC25312u = null;
                    objM87133R4 = new e(interfaceC28601c10, c4829q2, interfaceC28601c9, null);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    interfaceC25312u = null;
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, listM15245b);
                c3462nM2731E = m2731E(interfaceC28601c9);
                if (c3462nM2731E != null) {
                    interfaceC25312uM10157c = c3462nM2731E.getMenuSheet();
                } else {
                    interfaceC25312uM10157c = interfaceC25312u;
                }
                if (interfaceC25312uM10157c == null) {
                    c28655q3.m87150e0(1761501186);
                    c28655q3.m87173q(false);
                    function4 = function4;
                    c28655q = c28655q3;
                    interfaceC2994c0 = interfaceC2994c1;
                } else {
                    c28655q3.m87150e0(1761501187);
                    if (m2751Y(interfaceC28601c18)) {
                        c28655q3.m87150e0(-394614095);
                        C17675e c17675e = (C17675e) interfaceC25312uM10157c;
                        if (i16 == i15) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        if (z4 || objM87133R5 == c28676v3) {
                            objM87133R5 = new C1016f(function4, 0);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        Function1 function5 = (Function1) objM87133R5;
                        c28655q = c28655q3;
                        interfaceC2994c0 = interfaceC2994c1;
                        AbstractC3487z0.m10230M(c17675e, c15199y5, interfaceC2994c0, function5, null, c28655q, 64, 16);
                        c28655q.m87173q(false);
                    } else {
                        c28655q = c28655q3;
                        interfaceC2994c0 = interfaceC2994c1;
                        c28655q.m87150e0(-394235461);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                interfaceC25312uM15249b = c4829q2.getMenuSheet();
                if (interfaceC25312uM15249b == null) {
                    c28655q.m87150e0(1761989994);
                    c28655q.m87173q(false);
                    c15199y4 = c15199y5;
                } else {
                    c28655q.m87150e0(1761989995);
                    if (m2729C(interfaceC28601c8)) {
                        c28655q.m87150e0(16648289);
                        C17675e c17675e2 = (C17675e) interfaceC25312uM15249b;
                        if (i16 == i15) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z13 || objM87133R6 == c28676v3) {
                            objM87133R6 = new C1016f(function4, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        c15199y4 = c15199y5;
                        AbstractC3487z0.m10230M(c17675e2, c15199y4, interfaceC2994c0, (Function1) objM87133R6, function3, c28655q, 64 | (57344 & (i14 << 3)), 0);
                        c28655q.m87173q(false);
                    } else {
                        c15199y4 = c15199y5;
                        c28655q.m87150e0(17081700);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                boolean zM87157i6 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y4);
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i6 | z14;
                objM87133R7 = c28655q.m87133R();
                if (z15 || objM87133R7 == c28676v3) {
                    C0073h c0073h = new C0073h(interfaceC2994c0, function2, interfaceC28601c18, c15199y4, interfaceC28601c8, 2);
                    c28655q.m87172p0(c0073h);
                    objM87133R7 = c0073h;
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, false, c28655q, 0, 1);
                c28655q.m87173q(true);
            }
            objM87133R18 = new C3718c(r4, c4829q, function2, 3);
            c28655q4.m87172p0(objM87133R18);
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R18, null, null, c28655q4, AbstractC6721d.a.f25641r << 3, 53);
            float f18 = 2;
            float f19 = 4;
            AbstractC11266d.m30469w(f18, f19, c2314t, c28655q4);
            float f110 = 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f18 * f110, 0.0f, 2);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3396r2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N5);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q4, 6);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3409f2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m6);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N6);
            TextResource textResourceM15254g2 = c4829q.getTitle();
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM15254g2, c28655q4, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q4, i111).getT3();
            long jM125430y2 = c38072d2.m121949b(c28655q4, i111).getBrandWhite();
            int i25 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q4, 0, i25, 196602);
            c28655q4.m87173q(true);
            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(1 * f19, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4829q.getSubtitle(), c28655q4, i110), null, c38072d2.m121949b(c28655q4, i111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, i111).getB1(), null, c28655q4, 0, i25, 196602);
            float f111 = 6 * f19;
            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f111, c2314t));
            c39282oM15248a = c4829q.getAddManualMeasurement();
            if (c39282oM15248a == null) {
                c28655q4.m87150e0(-1677297622);
                c28655q4.m87173q(false);
                c28676v2 = c28676v1;
                c28655q2 = c28655q4;
                interfaceC28601c6 = interfaceC28601c19;
                f13 = 1.0f;
            } else {
                c28655q4.m87150e0(-1677297621);
                C13762f c13762f2 = new C13762f(5);
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v1) {
                    interfaceC28601c5 = interfaceC28601c18;
                    interfaceC28601c6 = interfaceC28601c19;
                    objM87133R = new C1024j(1, interfaceC28601c5, interfaceC28601c6);
                    c28655q4.m87172p0(objM87133R);
                } else {
                    interfaceC28601c5 = interfaceC28601c18;
                    interfaceC28601c6 = interfaceC28601c19;
                }
                interfaceC28601c18 = interfaceC28601c5;
                c28676v2 = c28676v1;
                f13 = 1.0f;
                AbstractC25303l.m74291r(c39282oM15248a, null, c13762f2, (Function1) objM87133R, c28655q4, C39282o.f168987q | 3072, 2);
                c28655q2 = c28655q4;
                c28655q2.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111, c2314t));
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(f13, c2314t), 0.0f, 0.0f, 0.0f, f19 * f110, 7);
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(3 * f19);
            zM87157i = c28655q2.m87157i(c4829q);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                InterfaceC28601c1 interfaceC28601c22 = interfaceC28601c6;
                C1008b c1008b2 = new C1008b((Object) c4829q, (Object) interfaceC28601c4, (Object) interfaceC28601c13, (Object) interfaceC28601c3, (Object) interfaceC28601c18, (Object) interfaceC28601c22, 0);
                interfaceC28601c7 = interfaceC28601c13;
                interfaceC28601c8 = interfaceC28601c22;
                c28655q2.m87172p0(c1008b2);
                objM87133R2 = c1008b2;
            } else {
                InterfaceC28601c1 interfaceC28601c23 = interfaceC28601c6;
                C1008b c1008b3 = new C1008b((Object) c4829q, (Object) interfaceC28601c4, (Object) interfaceC28601c13, (Object) interfaceC28601c3, (Object) interfaceC28601c18, (Object) interfaceC28601c23, 0);
                interfaceC28601c7 = interfaceC28601c13;
                interfaceC28601c8 = interfaceC28601c23;
                c28655q2.m87172p0(c1008b3);
                objM87133R2 = c1008b3;
            }
            c28655q3 = c28655q2;
            c28676v3 = c28676v2;
            AbstractC22674j.m65717c(modifierM3398t2, c26068uM77569a, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R2, c28655q3, 24582, 492);
            String strM15244a3 = r1.getSections().getNextToken();
            objM87133R3 = c28655q3.m87133R();
            if (objM87133R3 == c28676v3) {
                objM87133R3 = new C1010c(0, interfaceC28601c12);
                c28655q3.m87172p0(objM87133R3);
            }
            interfaceC28601c9 = interfaceC28601c3;
            interfaceC28601c10 = interfaceC28601c4;
            m2758c0(c26068uM77569a, 0, strM15244a3, (Function1) objM87133R3, c28655q3, 3072, 1);
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            if (m2728B(interfaceC28601c12)) {
                c28655q3.m87150e0(1760315716);
                m2754a0(c28655q3, 0);
                strM15244a = r1.getSections().getNextToken();
                if (strM15244a != null) {
                    function1.invoke(new AbstractC4837y.g(c4829q.getMetaData().getGraphKey(), strM15244a));
                }
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(1760510799);
                c28655q3.m87173q(false);
            }
            if (m2749W(interfaceC28601c7)) {
                c28655q3.m87150e0(195340569);
                strM2733G = m2733G(interfaceC28601c10);
                if (strM2733G == null) {
                    c28655q3.m87150e0(1760590344);
                    c28655q3.m87173q(false);
                    function4 = r4;
                    i15 = 32;
                    c4829q2 = r1;
                } else {
                    c28655q3.m87150e0(1760590345);
                    i15 = 32;
                    if (i16 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i3 = z16 | c28655q3.m87157i(r1) | c28655q3.m87153g(strM2733G);
                    Object objM87133R110 = c28655q3.m87133R();
                    if (zM87157i3) {
                        function4 = r4;
                        InterfaceC28601c1 interfaceC28601c24 = interfaceC28601c7;
                        c1012d = new C1012d(function4, r1, strM2733G, interfaceC28601c24, 0);
                        c4829q2 = r1;
                        interfaceC28601c11 = interfaceC28601c24;
                        c28655q3.m87172p0(c1012d);
                    } else {
                        function4 = r4;
                        InterfaceC28601c1 interfaceC28601c25 = interfaceC28601c7;
                        c1012d = new C1012d(function4, r1, strM2733G, interfaceC28601c25, 0);
                        c4829q2 = r1;
                        interfaceC28601c11 = interfaceC28601c25;
                        c28655q3.m87172p0(c1012d);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) c1012d;
                    objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == c28676v3) {
                        objM87133R8 = new C1014e(0, interfaceC28601c11);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    m2764f0(interfaceC4339a2, (InterfaceC4339a) objM87133R8, c28655q3, 48);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(false);
            } else {
                function4 = r4;
                i15 = 32;
                c4829q2 = r1;
                c28655q3.m87150e0(1760975055);
                c28655q3.m87173q(false);
            }
            List<C4828p> listM15245b2 = c4829q2.getSections().m15245b();
            zM87157i2 = c28655q3.m87157i(c4829q2);
            objM87133R4 = c28655q3.m87133R();
            if (zM87157i2) {
                interfaceC25312u = null;
                objM87133R4 = new e(interfaceC28601c10, c4829q2, interfaceC28601c9, null);
                c28655q3.m87172p0(objM87133R4);
            } else {
                interfaceC25312u = null;
                objM87133R4 = new e(interfaceC28601c10, c4829q2, interfaceC28601c9, null);
                c28655q3.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, listM15245b2);
            c3462nM2731E = m2731E(interfaceC28601c9);
            if (c3462nM2731E != null) {
                interfaceC25312uM10157c = c3462nM2731E.getMenuSheet();
            } else {
                interfaceC25312uM10157c = interfaceC25312u;
            }
            if (interfaceC25312uM10157c == null) {
                c28655q3.m87150e0(1761501186);
                c28655q3.m87173q(false);
                function4 = function4;
                c28655q = c28655q3;
                interfaceC2994c0 = interfaceC2994c1;
            } else {
                c28655q3.m87150e0(1761501187);
                if (m2751Y(interfaceC28601c18)) {
                    c28655q3.m87150e0(-394614095);
                    C17675e c17675e3 = (C17675e) interfaceC25312uM10157c;
                    if (i16 == i15) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    if (z4) {
                        objM87133R5 = new C1016f(function4, 0);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C1016f(function4, 0);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    Function1 function6 = (Function1) objM87133R5;
                    c28655q = c28655q3;
                    interfaceC2994c0 = interfaceC2994c1;
                    AbstractC3487z0.m10230M(c17675e3, c15199y5, interfaceC2994c0, function6, null, c28655q, 64, 16);
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q3;
                    interfaceC2994c0 = interfaceC2994c1;
                    c28655q.m87150e0(-394235461);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            interfaceC25312uM15249b = c4829q2.getMenuSheet();
            if (interfaceC25312uM15249b == null) {
                c28655q.m87150e0(1761989994);
                c28655q.m87173q(false);
                c15199y4 = c15199y5;
            } else {
                c28655q.m87150e0(1761989995);
                if (m2729C(interfaceC28601c8)) {
                    c28655q.m87150e0(16648289);
                    C17675e c17675e4 = (C17675e) interfaceC25312uM15249b;
                    if (i16 == i15) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z13) {
                        objM87133R6 = new C1016f(function4, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C1016f(function4, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    c15199y4 = c15199y5;
                    AbstractC3487z0.m10230M(c17675e4, c15199y4, interfaceC2994c0, (Function1) objM87133R6, function3, c28655q, 64 | (57344 & (i14 << 3)), 0);
                    c28655q.m87173q(false);
                } else {
                    c15199y4 = c15199y5;
                    c28655q.m87150e0(17081700);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            boolean zM87157i7 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y4);
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i7 | z14;
            objM87133R7 = c28655q.m87133R();
            if (z15) {
                C0073h c0073h2 = new C0073h(interfaceC2994c0, function2, interfaceC28601c18, c15199y4, interfaceC28601c8, 2);
                c28655q.m87172p0(c0073h2);
                objM87133R7 = c0073h2;
            } else {
                C0073h c0073h3 = new C0073h(interfaceC2994c0, function2, interfaceC28601c18, c15199y4, interfaceC28601c8, 2);
                c28655q.m87172p0(c0073h3);
                objM87133R7 = c0073h3;
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, false, c28655q, 0, 1);
            c28655q.m87173q(true);
        } else {
            c4829q2 = c4829q;
            function4 = function1;
            c28655q = c28655q4;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(i13, 6, c4829q2, function2, function3, function4);
        }
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m2728B(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m2729C(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m2730D(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: E */
    private static final C3462n m2731E(InterfaceC28601c1 interfaceC28601c1) {
        return (C3462n) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m2732F(InterfaceC28601c1 interfaceC28601c1, C3462n c3462n) {
        interfaceC28601c1.setValue(c3462n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m2733G(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m2734H(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final boolean m2735I(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, EnumC15209z3 it) {
        AbstractC22676k.m65750j(it, "it");
        if (it != EnumC15209z3.f57106w) {
            return true;
        }
        m2752Z(interfaceC28601c1, false);
        m2730D(interfaceC28601c2, false);
        return true;
    }

    /* JADX INFO: renamed from: J */
    private static final void m2736J(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m2737K(Function1 function1, C4829q c4829q, Function1 function2) {
        function1.invoke(new AbstractC4837y.n(c4829q.getMetaData().getGraphKey(), c4829q.getMetaData().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), c4829q.getMetaData().getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false, null, false, 56, null));
        function2.invoke(new AbstractC39640g.d(AbstractC39640g.b.Compose));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Modifier m2738L(C39282o it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(825538147);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 1 * 8, 1);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m2739M(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m2752Z(interfaceC28601c1, false);
        m2730D(interfaceC28601c2, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m2740N(C4829q c4829q, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C4828p> listM15245b = c4829q.getSections().m15245b();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM15245b.size(), new h(new C28503p(17), listM15245b), new i(g.f3890w, listM15245b), new C37816b(new j(listM15245b, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c5), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final Object m2741O(C4828p it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m2742P(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m2736J(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m2743Q(Function1 function1, C4829q c4829q, String str, InterfaceC28601c1 interfaceC28601c1) {
        EnumC4821i enumC4821iM2723d = c4829q.getMetaData().getMeasurementType();
        if (enumC4821iM2723d == null) {
            enumC4821iM2723d = EnumC4821i.VO2_MAX;
        }
        function1.invoke(new AbstractC4837y.c(enumC4821iM2723d, str));
        m2750X(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m2744R(InterfaceC28601c1 interfaceC28601c1) {
        m2750X(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m2745S(Function1 function1, InterfaceC1038q it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC4837y.k(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m2746T(Function1 function1, InterfaceC1038q it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC4837y.k(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m2747U(InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c2) {
        if (m2751Y(interfaceC28601c1)) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(c15199y3, interfaceC28601c2, interfaceC28601c1, null), 3);
        }
        function1.invoke(new AbstractC39640g.d(AbstractC39640g.b.Compose));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m2748V(C4829q c4829q, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m2727A(c4829q, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private static final boolean m2749W(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m2750X(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: Y */
    private static final boolean m2751Y(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m2752Z(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: a0 */
    private static final void m2754a0(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-743614829);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13 * 4, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 3 * f13, 7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(null, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 509);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m2756b0(int i13, Composer composer, int i14) {
        m2754a0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c0 */
    private static final void m2758c0(C26068u c26068u, int i13, String str, Function1 function1, Composer composer, int i14, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(217838459);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(c26068u) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            if (i17 != 0) {
                i13 = 0;
            }
            boolean z4 = (i16 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C1020h(c26068u, str, i13, 0));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2) | ((i16 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new k(interfaceC28670t2, function1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28670t2);
        } else {
            c28655q.m87138X();
        }
        int i18 = i13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1022i(c26068u, i18, str, function1, i14, i15, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d0 */
    public static final boolean m2760d0(C26068u c26068u, String str, int i13) {
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
        return (interfaceC26054g == null || str == null || ((C26062o) interfaceC26054g).f103184a < (c26068u.m77565h().f103180n - i13) - 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m2762e0(C26068u c26068u, int i13, String str, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m2758c0(c26068u, i13, str, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m2764f0(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        InterfaceC4339a onApprove = interfaceC4339a;
        InterfaceC4339a onDismiss = interfaceC4339a2;
        AbstractC22676k.m65750j(onApprove, "onApprove");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1751543037);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(onApprove) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onDismiss) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC32706a.f135945C);
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC32706a.f135944B);
            TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC32706a.f135943A);
            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC32706a.f135969w);
            int i15 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, false, null, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, null, interfaceC4339a, null, null, null, c28655q, (i15 << 3) | (i15 << 6) | (i15 << 9) | (i15 << 27), 384, ((i14 << 3) & 896) | ((i14 << 12) & 57344), 247459313);
            onDismiss = interfaceC4339a2;
            onApprove = interfaceC4339a;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(onApprove, onDismiss, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m2766g0(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m2764f0(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static final void m2787v(C1037p0 viewStateTrends, Function1 onViewEvent, Function1 onNavigationEvent, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        boolean z13;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(viewStateTrends, "viewStateTrends");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1940242896);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewStateTrends) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean zM2937B = viewStateTrends.getSuccessDeleteMeasurement();
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM2937B) {
                c28655q.m87150e0(106532509);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
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
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Boolean bool = Boolean.TRUE;
                boolean zM87157i = c28655q.m87157i(viewStateTrends) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new a(onViewEvent, viewStateTrends, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(107093330);
                AbstractC4830r abstractC4830rM2961q = viewStateTrends.getManualMeasurementRecords();
                if (abstractC4830rM2961q instanceof AbstractC4830r.e) {
                    c28655q.m87150e0(557644173);
                    m2727A(((AbstractC4830r.e) viewStateTrends.getManualMeasurementRecords()).getViewState(), onViewEvent, onNavigationEvent, onAnalyticsEvent, c28655q, i14 & 8176);
                    c28655q.m87173q(false);
                    z4 = false;
                } else {
                    if (AbstractC22676k.m65745e(abstractC4830rM2961q, AbstractC4830r.c.f19882a)) {
                        c28655q.m87150e0(557675116);
                        z13 = false;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.d(new TextResource.C8688b(AbstractC32706a.f135959m, null, 2, 0 == true ? 1 : 0)), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.d.f138473f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (AbstractC22676k.m65745e(abstractC4830rM2961q, AbstractC4830r.b.f19881a)) {
                        c28655q.m87150e0(557682998);
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC32706a.f135958l, null, 2, 0 == true ? 1 : 0);
                        boolean zM87157i2 = c28655q.m87157i(viewStateTrends) | ((i14 & 112) == 32);
                        Object objM87133R2 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C1006a(onViewEvent, viewStateTrends, 0);
                            c28655q.m87172p0(objM87133R2);
                        }
                        z13 = false;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688b, 0L, (InterfaceC4339a) objM87133R2, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (abstractC4830rM2961q instanceof AbstractC4830r.a) {
                        c28655q.m87150e0(108757441);
                        int i15 = 2;
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC32706a.f135963q, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC32706a.f135960n, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC32706a.f135962p, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC32706a.f135961o, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                        int i16 = i14 & 112;
                        boolean zM87157i3 = (i16 == 32) | c28655q.m87157i(viewStateTrends);
                        Object objM87133R3 = c28655q.m87133R();
                        if (zM87157i3 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C1006a(onViewEvent, viewStateTrends, 1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                        boolean zM87157i4 = c28655q.m87157i(viewStateTrends) | (i16 == 32);
                        Object objM87133R4 = c28655q.m87133R();
                        if (zM87157i4 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C1006a(onViewEvent, viewStateTrends, 2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i17 = 196608 | AbstractC33208p0.b.f138467h;
                        int i18 = TextResource.C8688b.f25889c;
                        int i19 = i17 | (i18 << 3) | (i18 << 9) | (i18 << 21);
                        z4 = false;
                        AbstractC33199m0.m105214F(bVar, c8688b2, null, c8688b4, interfaceC4339a, true, false, c8688b3, (InterfaceC4339a) objM87133R4, null, false, false, c28655q, i19, 0, 3652);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        z4 = false;
                        if (!AbstractC22676k.m65745e(abstractC4830rM2961q, AbstractC4830r.d.f19883a) && abstractC4830rM2961q != null) {
                            throw AbstractC11895b.m32003v(557643952, c28655q, false);
                        }
                        c28655q.m87150e0(109636787);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
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
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        C0209i c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    z4 = z13;
                }
                c28655q.m87173q(z4);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(i13, 5, viewStateTrends, onNavigationEvent, onAnalyticsEvent, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m2788w(Function1 function1, C1037p0 c1037p0) {
        EnumC4821i enumC4821iM2723d = c1037p0.getMetaData().getMeasurementType();
        if (enumC4821iM2723d == null) {
            enumC4821iM2723d = EnumC4821i.VO2_MAX;
        }
        function1.invoke(new AbstractC4837y.o(enumC4821iM2723d));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m2789x(Function1 function1, C1037p0 c1037p0) {
        EnumC4821i enumC4821iM2723d = c1037p0.getMetaData().getMeasurementType();
        if (enumC4821iM2723d == null) {
            enumC4821iM2723d = EnumC4821i.VO2_MAX;
        }
        function1.invoke(new AbstractC4837y.c(enumC4821iM2723d, ((AbstractC4830r.a) c1037p0.getManualMeasurementRecords()).getId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m2790y(Function1 function1, C1037p0 c1037p0) {
        EnumC4821i enumC4821iM2723d = c1037p0.getMetaData().getMeasurementType();
        if (enumC4821iM2723d == null) {
            enumC4821iM2723d = EnumC4821i.VO2_MAX;
        }
        function1.invoke(new AbstractC4837y.o(enumC4821iM2723d));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m2791z(C1037p0 c1037p0, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m2787v(c1037p0, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
