package ev2;

import a81.C0557h;
import android.content.res.Configuration;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm.C3396t;
import bm2.C3466p;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.FilterItem;
import com.whoop.weightlifting.data.domain.FilterOptions;
import cu2.AbstractC11128h;
import dv2.InterfaceC12391b;
import dv2.InterfaceC12394e;
import eu2.AbstractC13653j;
import gb1.AbstractC15673b0;
import gz0.AbstractC16319p0;
import hy0.AbstractC17746g1;
import j93.AbstractC21478l0;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m12.AbstractC24936d;
import o11.AbstractC27407m;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3730c1;
import p040c0.InterfaceC3747i0;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC23013y;
import p319m4.AbstractC25012a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25291c;
import p720m91.AbstractC25303l;
import p720m91.C25287a;
import p720m91.EnumC25296e0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: ev2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001aK\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ldv2/e$b;", "viewState", "Lkotlin/Function1;", "Ldv2/b;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function3;", "", "onAnalyticsEvent", "q", "(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "s", "Landroidx/compose/ui/Modifier;", "", "percentage", "L", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "", "showFilterListBottomSheet", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13705n {

    /* JADX INFO: renamed from: ev2.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.view.SelectExercisesScreenContentKt$LoadedSelectExerciseScreenInsideBottomSheet$1$1", m100430f = "SelectExercisesScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48567w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f48568x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f48569y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48568x = c15199y3;
            this.f48569y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f48568x, this.f48569y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f48567w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f48568x.m43221b() == EnumC15209z3.f57106w && AbstractC13705n.m38704t(this.f48569y)) {
                AbstractC13705n.m38705u(this.f48569y, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ev2.n$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f48570w = new b();

        /* JADX INFO: renamed from: a */
        public final long m38711a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m38711a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ev2.n$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.view.SelectExercisesScreenContentKt$LoadedSelectExerciseScreenInsideBottomSheet$3$2$1", m100430f = "SelectExercisesScreenContent.kt", m100431l = {219}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48571w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f48572x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48572x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f48572x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48571w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f48572x;
                this.f48571w = 1;
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

    /* JADX INFO: renamed from: ev2.n$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function3 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C25287a<String, AbstractC27407m.c.b> f48573w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f48574x;

        /* JADX INFO: renamed from: ev2.n$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function3 {

            /* JADX INFO: renamed from: w */
            public static final a f48575w = new a();

            /* JADX INFO: renamed from: a */
            public final Modifier m38713a(AbstractC27407m.c.b it, Composer composer, int i13) {
                AbstractC22676k.m65750j(it, "it");
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(-431553243);
                Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 1 * 8, 0.0f, 0.0f, 13);
                c28655q.m87173q(false);
                return modifierM3398t;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m38713a((AbstractC27407m.c.b) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }

        /* JADX INFO: renamed from: ev2.n$d$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C25287a<String, AbstractC27407m.c.b> f48576w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f48577x;

            public b(C25287a<String, AbstractC27407m.c.b> c25287a, Function1 function1) {
                this.f48576w = c25287a;
                this.f48577x = function1;
            }

            /* JADX INFO: renamed from: a */
            public final void m38714a(Object event) {
                AbstractC22676k.m65750j(event, "event");
                if ((event instanceof InterfaceC12391b) && this.f48576w.m74237f() == EnumC25296e0.Visible) {
                    this.f48577x.invoke(event);
                }
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m38714a(obj);
                return C23454a0.f92919a;
            }
        }

        public d(C25287a<String, AbstractC27407m.c.b> c25287a, Function1 function1) {
            this.f48573w = c25287a;
            this.f48574x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m38712a(InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
            AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
            InterfaceC25312u interfaceC25312uM74235d = this.f48573w.m74235d();
            a aVar = a.f48575w;
            C28655q c28655q = (C28655q) composer;
            boolean zM87157i = c28655q.m87157i(this.f48573w) | c28655q.m87153g(this.f48574x);
            C25287a<String, AbstractC27407m.c.b> c25287a = this.f48573w;
            Function1 function1 = this.f48574x;
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new b(c25287a, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312uM74235d, null, aVar, (Function1) objM87133R, c28655q, AbstractC27407m.c.b.f110310H, 2);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m38712a((InterfaceC3747i0) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ev2.n$e */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.view.SelectExercisesScreenContentKt$LoadedSelectExerciseScreenInsideBottomSheet$4$1$1$2$1$1", m100430f = "SelectExercisesScreenContent.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48578w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f48579x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f48580y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48579x = c15199y3;
            this.f48580y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f48579x, this.f48580y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48578w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC13705n.m38705u(this.f48580y, false);
                C15199y3 c15199y3 = this.f48579x;
                this.f48578w = 1;
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

    /* JADX INFO: renamed from: ev2.n$f */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.view.SelectExercisesScreenContentKt$LoadedSelectExerciseScreenInsideBottomSheet$4$1$3$1$1", m100430f = "SelectExercisesScreenContent.kt", m100431l = {169}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48581w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f48582x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C15199y3 c15199y3, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48582x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f48582x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48581w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f48582x;
                this.f48581w = 1;
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

    /* JADX INFO: renamed from: ev2.n$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f48583w = new g();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C25287a<String, AbstractC27407m.c.b> c25287a) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ev2.n$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f48584w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f48585x;

        public h(Function1 function1, List list) {
            this.f48584w = function1;
            this.f48585x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m38716a(int i13) {
            return this.f48584w.invoke(this.f48585x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m38716a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ev2.n$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f48586w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f48587x;

        public i(Function1 function1, List list) {
            this.f48586w = function1;
            this.f48587x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m38717a(int i13) {
            return this.f48586w.invoke(this.f48587x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m38717a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ev2.n$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f48588w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23013y f48589x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f48590y;

        public j(List list, InterfaceC23013y interfaceC23013y, Function1 function1) {
            this.f48588w = list;
            this.f48589x = interfaceC23013y;
            this.f48590y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m38718a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C25287a c25287a = (C25287a) this.f48588w.get(i13);
            c28655q.m87150e0(466891248);
            AbstractC1090b.m3349d(this.f48589x, c25287a.getTransitionState(), null, AbstractC3730c1.f15251a, null, null, AbstractC37817c.m121344e(-489508621, c28655q, new d(c25287a, this.f48590y)), c28655q, 1572864, 26);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m38718a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m38672A(InterfaceC12394e.b bVar, Function1 function1, C26068u c26068u, InterfaceC15237i interfaceC15237i, Function3 function3, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        Function3 function4;
        Function3 function5;
        Function1 function2;
        int i14 = 2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 1 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11);
            C37816b c37816bM121344e = null;
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC11128h.f35382E, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E);
            int iM46119e = AbstractC16319p0.m46430a().getAction().getCross();
            if (bVar.mo34812c().isEmpty()) {
                function4 = function3;
                c28655q.m87150e0(1540106333);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1539280710);
                function4 = function3;
                c37816bM121344e = AbstractC37817c.m121344e(809025163, c28655q, new C13704m(bVar, function3, interfaceC15237i, interfaceC2994c0, c15199y3, interfaceC28601c1, 0));
                c28655q.m87173q(false);
            }
            AbstractC6721d.a aVar = new AbstractC6721d.a(c8688b, null, Integer.valueOf(iM46119e), strM92103Y, null, null, null, null, false, c37816bM121344e, null, null, null, null, null, null, 64994, null);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C13694c(function1, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            C28655q c28655q2 = c28655q;
            boolean zM87157i = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87153g(function4) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(function1);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C13695d c13695d = new C13695d(interfaceC15237i, function3, interfaceC2994c0, function1, interfaceC28601c1, c15199y3, 0);
                function5 = function3;
                function2 = function1;
                c28655q2.m87172p0(c13695d);
                objM87133R2 = c13695d;
            } else {
                function5 = function4;
                function2 = function1;
            }
            AbstractC13712u.m38740K0(bVar, c26068u, (Function1) objM87133R2, c28655q2, 0);
            if (bVar.mo34811b().isEmpty()) {
                c28655q2.m87150e0(1542210489);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1541141857);
                AbstractC22960g2.m66729a(AbstractC1099a.m3398t(c2314t, AbstractC13712u.m38812n1(), f13, f13, 0.0f, 8), null, null, null, 0, 0, AbstractC37817c.m121344e(-554736951, c28655q2, new C13696e(bVar, function5, function2, 0)), c28655q2, 1572864, 62);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            AbstractC13712u.m38784e0(C23016z.f90757a, c26068u, bVar, function2, c28655q2, 6);
            if (bVar.getHideCta()) {
                c28655q2.m87150e0(1542456505);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1542328692);
                AbstractC13653j.m38493e(null, bVar.mo34810a(), bVar.mo34814e(), function1, c28655q2, 0, 1);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m38673B(InterfaceC12394e.b bVar, Function3 function3, InterfaceC15237i interfaceC15237i, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(String.valueOf(bVar.mo34812c().size()));
            boolean zM87153g = c28655q.m87153g(function3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C13700i(0, function3);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C13701j(0, interfaceC2994c0, c15199y3, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC13712u.m38773a1(textResourceM21278l, function1, interfaceC15237i, (InterfaceC4339a) objM87133R2, c28655q, TextResource.$stable);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m38674C(Function3 function3, String it) {
        AbstractC22676k.m65750j(it, "it");
        function3.invoke(it, "Exercise List", "");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m38675D(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c15199y3, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m38676E(Function1 function1) {
        function1.invoke(InterfaceC12391b.b.f41903a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m38677F(InterfaceC15237i interfaceC15237i, Function3 function3, InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, InterfaceC12391b it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC12391b.l) {
            m38705u(interfaceC28601c1, true);
            ((C15240l) interfaceC15237i).m43339b(false);
            function3.invoke("Open", "Exercise Filtering", "");
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(c15199y3, null), 3);
        } else {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m38678G(InterfaceC12394e.b bVar, Function3 function3, Function1 function1, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (C23465k c23465k : bVar.mo34811b()) {
                float f13 = ((float) 1.5d) * 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, f13, f13, 0.0f, 9);
                boolean zM87153g = c28655q.m87153g(function3) | c28655q.m87153g(c23465k) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C13699h(function3, c23465k, function1, 0);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3398t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
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
                C28655q c28655q2 = c28655q;
                AbstractC17746g1.m50874j(AbstractC8693b.m21278l(((FilterItem) c23465k.f92937w).getValue()), 0L, null, 0L, null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, 0.0f, null, null, null, 0, 0, null, null, c28655q2, TextResource.$stable, C39274g.f168929c << 9, 0, 8380414);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m38679H(Function3 function3, C23465k c23465k, Function1 function1) {
        function3.invoke("Remove Filter Tag", "Exercise Filtering", ((FilterItem) c23465k.f92937w).getKey());
        function1.invoke(new InterfaceC12391b.c(c23465k));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m38680I(InterfaceC12394e.b bVar, Function1 function1, Function3 function3, int i13, Composer composer, int i14) {
        m38703s(bVar, function1, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    public static final Modifier m38683L(Modifier modifier, float f13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return AbstractC37056f.m118997u(modifier, new C13698g(f13, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Modifier m38684M(float f13, Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1122571281);
        Modifier modifierM3413j = AbstractC1102d.m3413j(composed, 0.0f, ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenHeightDp * f13, 1);
        c28655q.m87173q(false);
        return modifierM3413j;
    }

    /* JADX INFO: renamed from: q */
    public static final void m38701q(InterfaceC12394e.b viewState, Function1 onViewEvent, Function3 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1869215156);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.STRENGTH_TRAINER_SELECT_EXERCISE_BOTTOM_SHEET_LOGIC)) {
            c28655q.m87150e0(-1537421999);
            m38703s(viewState, onViewEvent, onAnalyticsEvent, c28655q, i14 & 1022);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1537316382);
            AbstractC13712u.m38828u0(viewState, onViewEvent, onAnalyticsEvent, c28655q, i14 & 1022);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13702k(viewState, onViewEvent, onAnalyticsEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m38702r(InterfaceC12394e.b bVar, Function1 function1, Function3 function3, int i13, Composer composer, int i14) {
        m38701q(bVar, function1, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m38703s(InterfaceC12394e.b viewState, Function1 onViewEvent, Function3 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1647311091);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onAnalyticsEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            C3396t c3396tM60415U = AbstractC21478l0.m60415U(0, c28655q2, 0);
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            C26068u c26068uM77569a2 = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            List<AbstractC27407m.c.b> listMo34812c = viewState.mo34812c();
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C13693b(1);
                c28655q2.m87172p0(objM87133R3);
            }
            List listM74243c = AbstractC25291c.m74243c(listMo34812c, (Function1) objM87133R3, c28655q2, 48);
            EnumC15209z3 enumC15209z3M43221b = c15199y3M3460c.m43221b();
            boolean zM87157i = c28655q2.m87157i(c15199y3M3460c);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, enumC15209z3M43221b);
            C35666g c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = b.f48570w;
                c28655q2.m87172p0(objM87133R5);
            }
            c28655q = c28655q2;
            AbstractC35660d.m112871m(null, c35666g, aVar, p745y81.Function1.m125323a((Function1) objM87133R5), null, null, null, AbstractC37817c.m121344e(951040571, c28655q2, new C13703l(viewState, c3396tM60415U, interfaceC2994c0, onViewEvent, onAnalyticsEvent, c15199y3M3460c, interfaceC28601c1, c26068uM77569a2, listM74243c, 0)), false, null, null, null, false, AbstractC1099a.m3398t(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(m38683L(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.95f))), 0.0f, 0.0f, 0.0f, 2 * 8, 7), AbstractC37817c.m121344e(-459449345, c28655q2, new C3466p(viewState, onViewEvent, c26068uM77569a, interfaceC15237i, onAnalyticsEvent, interfaceC2994c0, c15199y3M3460c, interfaceC28601c1)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 8049);
            AbstractC24936d.m73080z("OVERLAY_STRENGTH_BUILDER_EXERCISE_LIBRARY", null, false, null, null, null, null, c28655q, 0, 126);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13702k(viewState, onViewEvent, onAnalyticsEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final boolean m38704t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m38705u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final String m38706v(AbstractC27407m.c.b it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getExerciseId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m38707w(InterfaceC12394e.b bVar, C3396t c3396t, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function3 function3, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, C26068u c26068u, List list, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 17) != 16);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        boolean zM38704t = m38704t(interfaceC28601c1);
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM38704t) {
            c28655q.m87150e0(-1449542180);
            FilterOptions filterOptionsMo34816g = bVar.getFilterOptions();
            Set<C23465k> setMo34811b = bVar.mo34811b();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C13697f(function1, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC13712u.m38805l0(filterOptionsMo34816g, setMo34811b, c3396t, interfaceC2994c0, (Function1) objM87133R, function3, c28655q, 0);
            c28655q.m87173q(false);
            return c23454a0;
        }
        c28655q.m87150e0(-1449041933);
        if (bVar.mo34812c().isEmpty()) {
            c28655q.m87150e0(-1449026743);
            boolean zM87157i = c28655q.m87157i(c15199y3);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new c(c15199y3, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1448905657);
            c28655q.m87173q(false);
        }
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM66722k = AbstractC22953f.m66722k(c2314t);
        C23010x c23010xM73381n = AbstractC25012a.m73381n(2, 8, C2299e.f9111N, c28655q, 54);
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
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35385F);
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        AbstractC30795n.m94707h(strM92103Y, modifierM3409f, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 48, C2886a.f11498d << 18, 196088);
        boolean zM87157i2 = c28655q.m87157i(list) | c28655q.m87153g(function1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new C0557h(list, 2, function1);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC22674j.m65717c(null, c26068u, null, null, null, null, false, null, (Function1) objM87133R3, c28655q, 0, 509);
        c28655q.m87173q(true);
        c28655q.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m38708x(Function1 function1, Set newFilters) {
        AbstractC22676k.m65750j(newFilters, "newFilters");
        function1.invoke(new InterfaceC12391b.g(newFilters));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m38709y(List list, InterfaceC23013y interfaceC23013y, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list.size(), new h(new C13693b(0), list), new i(g.f48583w, list), new C37816b(new j(list, interfaceC23013y, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Object m38710z(C25287a it) {
        AbstractC22676k.m65750j(it, "it");
        return it.m74234c();
    }
}
