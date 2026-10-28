package uu2;

import a81.C0556g;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1601k1;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.video.VideoActivity;
import com.whoop.weightlifting.StrengthTrainerDestination;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import cu2.AbstractC11128h;
import eu2.AbstractC13653j;
import gu2.C16214a;
import gy0.AbstractC16272a;
import gz0.AbstractC16319p0;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import jf3.C21647a;
import k21.C22160d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22575j;
import kotlin.C2026r;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import nf3.C26669a;
import oq1.C28119c;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p132f0.C13821r1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p733ry2.C31915d;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p739ui0.C35015q;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qx0.C30745a;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import re1.C31324k;
import rm2.C31603c;
import s01.C32049e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so2.C32848f;
import t80.C33592b;
import uf0.C34904e;
import um0.C35076b;
import uv0.AbstractC35283c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import xf3.C38266c;
import y71.C39274g;

/* JADX INFO: renamed from: uu2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010!\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020 2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000bH\u0003¢\u0006\u0004\b!\u0010\"\u001a+\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000bH\u0003¢\u0006\u0004\b#\u0010$¨\u0006'²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;", "navArgs", "Leb/u0;", "navController", "Leb/a0;", "globalNavController", "Ll83/a0;", "D", "(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/u0;Leb/a0;Landroidx/compose/runtime/Composer;I)V", "Luu2/b0;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "onExerciseSelected", "Luu2/c;", "onEvent", "E", "(Luu2/b0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Luu2/k0;", "screenContent", "Landroidx/compose/ui/Modifier;", "modifier", "z", "(Luu2/k0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lgu2/a;", "state", "T", "(Lgu2/a;Landroidx/compose/runtime/Composer;I)V", "Luu2/i0;", "property", "V", "(Luu2/i0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Luu2/j0;", "X", "(Luu2/j0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "c0", "(Luu2/b0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Luu2/a0;", "viewModel", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35261l {

    /* JADX INFO: renamed from: uu2.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f150007w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f150008x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f150009y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f150010z;

        /* JADX INFO: renamed from: uu2.l$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42512a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f150011w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42512a(C21647a c21647a) {
                super(0);
                this.f150011w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f150011w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f150007w = c38266c;
            this.f150008x = interfaceC35951a;
            this.f150009y = interfaceC4339a;
            this.f150010z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, uu2.a0] */
        @Override // c93.InterfaceC4339a
        public final C35240a0 invoke() {
            return AbstractC21598x.m60668X(this.f150007w, this.f150008x, new C42512a(this.f150010z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35240a0.class), null, this.f150009y);
        }
    }

    /* JADX INFO: renamed from: uu2.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsScreenKt$ExerciseDetailsScreen$2$1", m100430f = "ExerciseDetailsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150012w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ StrengthTrainerDestination.C10742e.a f150013x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f150014y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StrengthTrainerDestination.C10742e.a aVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150013x = aVar;
            this.f150014y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f150013x, this.f150014y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150012w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String exerciseId = this.f150013x.getExerciseId();
            if (exerciseId != null) {
                AbstractC35261l.m111762G(this.f150014y).m111647F(new InterfaceC35243c.d(exerciseId, this.f150013x.getShowCTA()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu2.l$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsScreenKt$ExerciseDetailsScreen$3$1", m100430f = "ExerciseDetailsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150015w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12991u0 f150016x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ StrengthTrainerDestination.C10742e.a f150017y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f150018z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12991u0 c12991u0, StrengthTrainerDestination.C10742e.a aVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150016x = c12991u0;
            this.f150017y = aVar;
            this.f150018z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f150016x, this.f150017y, this.f150018z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1601k1 c1601k1M36480b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150015w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12982q c12982qM36393h = this.f150016x.m36393h();
            if (c12982qM36393h != null && (c1601k1M36480b = c12982qM36393h.m36480b()) != null) {
                StrengthTrainerDestination.C10742e.a aVar = this.f150017y;
                InterfaceC23462h interfaceC23462h = this.f150018z;
                String str = (String) c1601k1M36480b.m5001b("exerciseDetailsRefresh");
                if (str != null) {
                    AbstractC35261l.m111762G(interfaceC23462h).m111647F(new InterfaceC35243c.d(str, aVar.getShowCTA()));
                    c1601k1M36480b.m5003d("exerciseDetailsRefresh");
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu2.l$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f150019w = new d();

        /* JADX INFO: renamed from: a */
        public final long m111816a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBlack50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111816a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uu2.l$e */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsScreenKt$ExerciseDetailsScreen$7$2$1$1$1$1$1", m100430f = "ExerciseDetailsScreen.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150020w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f150021x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f150022y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Object f150023z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15199y3 c15199y3, Function1 function1, Object obj, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150021x = c15199y3;
            this.f150022y = function1;
            this.f150023z = obj;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f150021x, this.f150022y, this.f150023z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150020w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f150021x;
                this.f150020w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f150022y.invoke(this.f150023z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu2.l$f */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsScreenKt$ExerciseDetailsScreen$7$2$1$1$2$1$1", m100430f = "ExerciseDetailsScreen.kt", m100431l = {197}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150024w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f150025x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f150026y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Object f150027z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C15199y3 c15199y3, Function1 function1, Object obj, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150025x = c15199y3;
            this.f150026y = function1;
            this.f150027z = obj;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f150025x, this.f150026y, this.f150027z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150024w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f150025x;
                this.f150024w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f150026y.invoke(this.f150027z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu2.l$g */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsScreenKt$ExerciseDetailsScreen$7$3$1$3$1$1", m100430f = "ExerciseDetailsScreen.kt", m100431l = {159}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150028w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f150029x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C15199y3 c15199y3, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150029x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f150029x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150028w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f150029x;
                this.f150028w = 1;
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

    /* JADX INFO: renamed from: uu2.l$h */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsScreenKt$FullScreenModalScreen$1$4$1", m100430f = "ExerciseDetailsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150030w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35258j0 f150031x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f150032y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C35258j0 c35258j0, Function1 function1, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150031x = c35258j0;
            this.f150032y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f150031x, this.f150032y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150030w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC35243c interfaceC35243cM111736h = this.f150031x.getFollowUpEvent();
            if (interfaceC35243cM111736h != null) {
                this.f150032y.invoke(interfaceC35243cM111736h);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Modifier m111756A(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1487205985);
        Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "ExerciseDetailsUrlImage");
        c28655q.m87173q(false);
        return modifierM3599a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m111757B(C35260k0 c35260k0, Context context, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (c35260k0.getExercise().getVideoUrl() != null) {
            Intent intent = new Intent(context, (Class<?>) VideoActivity.class);
            intent.putExtra("videoUrl", c35260k0.getExercise().getVideoUrl());
            context.startActivity(intent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m111758C(C35260k0 c35260k0, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m111815z(c35260k0, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public static final void m111759D(StrengthTrainerDestination.C10742e.a navArgs, C12991u0 navController, AbstractC12939a0 globalNavController, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navArgs, "navArgs");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1002355234);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(navArgs) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(navController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(globalNavController) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = i14 & 14;
            boolean zM87157i = (i15 == 4) | c28655q.m87157i(navController) | c28655q.m87157i(globalNavController);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C31324k(navArgs, navController, globalNavController, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R2;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m111762G(interfaceC23462h).getViewState(), C35242b0.INSTANCE.m111663a(), null, c28655q, 0, 2);
            boolean zM87157i2 = (i15 == 4) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new b(navArgs, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            C12982q c12982qM36393h = navController.m36393h();
            boolean zM87157i3 = c28655q.m87157i(navController) | c28655q.m87157i(interfaceC23462h) | (i15 == 4);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new c(navController, navArgs, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c12982qM36393h);
            C35242b0 c35242b0M111763H = m111763H(interfaceC28601c1M87260n);
            boolean zM87157i4 = c28655q.m87157i(navController);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                objM87133R5 = new C31603c(navController, 1);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function1 = (Function1) objM87133R5;
            boolean zM87157i5 = c28655q.m87157i(interfaceC23462h) | (i15 == 4) | c28655q.m87157i(navController) | c28655q.m87157i(globalNavController);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i5 || objM87133R6 == c28676v0) {
                C31915d c31915d = new C31915d(navArgs, navController, globalNavController, interfaceC23462h, 12);
                c28655q.m87172p0(c31915d);
                objM87133R6 = c31915d;
            }
            m111760E(c35242b0M111763H, function1, (Function1) objM87133R6, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(navArgs, navController, globalNavController, i13, 20);
        }
    }

    /* JADX INFO: renamed from: E */
    public static final void m111760E(C35242b0 viewState, Function1 onExerciseSelected, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onExerciseSelected, "onExerciseSelected");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(399831056);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onExerciseSelected) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(1985567861);
                m111779X(viewState.getFullScreenModal(), onEvent, c28655q, (i14 >> 3) & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1423290732);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                C35666g c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = d.f150019w;
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC35660d.m112871m(null, c35666g, aVar, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, AbstractC37817c.m121344e(1579820169, c28655q, new C2026r((Object) viewState, (Object) interfaceC2994c0, (Object) c15199y3M3460c, onEvent, 24)), false, null, null, null, false, null, AbstractC37817c.m121344e(-554266299, c28655q, new C0556g((Object) viewState, onEvent, (Object) interfaceC2994c0, (Object) c15199y3M3460c, (Object) onExerciseSelected, 22)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1426992690);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, onExerciseSelected, (InterfaceC23459e) onEvent, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m111761F(StrengthTrainerDestination.C10742e.a aVar, C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0) {
        AbstractC35268s.m111861c(aVar.getEntryPointType(), c12991u0, abstractC12939a0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C35240a0 m111762G(InterfaceC23462h interfaceC23462h) {
        return (C35240a0) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: H */
    private static final C35242b0 m111763H(InterfaceC28670t2 interfaceC28670t2) {
        return (C35242b0) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m111764I(C12991u0 c12991u0, WeightliftingExercise it) {
        AbstractC22676k.m65750j(it, "it");
        StrengthTrainerDestination.C10745h.f32788a.m28109i(c12991u0, it.getExerciseId());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m111765J(StrengthTrainerDestination.C10742e.a aVar, C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC23462h interfaceC23462h, InterfaceC35243c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC35243c.h) {
            m111762G(interfaceC23462h).m111647F((InterfaceC35243c.h) event);
        } else if (event.equals(InterfaceC35243c.c.f149936a)) {
            AbstractC35268s.m111861c(aVar.getEntryPointType(), c12991u0, abstractC12939a0);
        } else {
            if (!(event instanceof InterfaceC35243c.e)) {
                throw new NoWhenBranchMatchedException();
            }
            StrengthTrainerDestination.C10739b.f32758a.m28040f(c12991u0, ((InterfaceC35243c.e) event).getExerciseId(), "edit");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m111766K(StrengthTrainerDestination.C10742e.a aVar, C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, int i13, Composer composer, int i14) {
        m111759D(aVar, c12991u0, abstractC12939a0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m111767L(C35242b0 c35242b0, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C35239a c35239aM111749a = c35242b0.getScreenContent().getCustomExerciseItems();
            if (c35239aM111749a == null) {
                c28655q.m87150e0(171134697);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(171134698);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * 4);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66722k(C2314t.f9131w), 0.0f, 0.0f, 0.0f, 1 * 8, 7);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, C2299e.f9110M, c28655q, 6);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
                InterfaceC25312u interfaceC25312uM111626c = c35239aM111749a.getEditButton();
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C22575j(interfaceC2994c0, c15199y3, function1, 7);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312uM111626c, null, null, (Function1) objM87133R, c28655q, 0, 6);
                InterfaceC25312u interfaceC25312uM111624a = c35239aM111749a.getDeleteButton();
                boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C22575j(interfaceC2994c0, c15199y3, function1, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC25303l.m74291r(interfaceC25312uM111624a, null, null, (Function1) objM87133R2, c28655q, 0, 6);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m111768M(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC35243c) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c15199y3, function1, it, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m111769N(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC35243c) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(c15199y3, function1, it, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m111770O(C35242b0 c35242b0, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function2, Composer composer, int i13) {
        C39274g c39274gM111625b;
        C39274g c39274gM111625b2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m111787c0(c35242b0, function1, c28655q, 0);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
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
            String strM21274h = null;
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC11128h.f35483l, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
            int iM46486a = AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward();
            C35239a c35239aM111749a = c35242b0.getScreenContent().getCustomExerciseItems();
            Integer numValueOf = (c35239aM111749a == null || (c39274gM111625b2 = c35239aM111749a.getDotMenuItem()) == null) ? null : Integer.valueOf(c39274gM111625b2.getIcon());
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E);
            C35239a c35239aM111749a2 = c35242b0.getScreenContent().getCustomExerciseItems();
            TextResource textResourceM125133a = (c35239aM111749a2 == null || (c39274gM111625b = c35239aM111749a2.getDotMenuItem()) == null) ? null : c39274gM111625b.getContentDescription();
            if (textResourceM125133a == null) {
                c28655q.m87150e0(-1815438205);
            } else {
                c28655q.m87150e0(-1815438204);
                strM21274h = AbstractC8693b.m21274h(textResourceM125133a, c28655q, TextResource.$stable);
            }
            c28655q.m87173q(false);
            if (strM21274h == null) {
                strM21274h = "";
            }
            AbstractC6721d.a aVar = new AbstractC6721d.a(c8688b, null, Integer.valueOf(iM46486a), strM92103Y, numValueOf, strM21274h, null, null, false, null, null, null, null, null, null, null, 65474, null);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C34904e(function1, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C3196h(interfaceC2994c0, c15199y3, 24);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC6719b.m20143d(null, aVar, null, interfaceC4339a, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
            C28655q c28655q2 = c28655q;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90656g, c2305k, c28655q2, 6);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            C35260k0 c35260k0M111661f = c35242b0.getScreenContent();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m111815z(c35260k0M111661f, new LayoutWeightElement(1.0f, true), c28655q2, 0, 0);
            if (c35242b0.getShowCTA()) {
                c28655q2.m87150e0(2141685104);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC11128h.f35379D);
                boolean zM87153g2 = c28655q2.m87153g(function2) | c28655q2.m87157i(c35242b0);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C35015q(1, function2, c35242b0);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC13653j.m38495g(null, strM92103Y2, false, null, false, false, (InterfaceC4339a) objM87133R3, c28655q2, 0, 61);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2141993585);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m111771P(Function1 function1) {
        function1.invoke(InterfaceC35243c.c.f149936a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m111772Q(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new g(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m111773R(Function1 function1, C35242b0 c35242b0) {
        function1.invoke(c35242b0.getScreenContent().getExercise());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m111774S(C35242b0 c35242b0, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m111760E(c35242b0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final void m111775T(C16214a c16214a, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1262657306);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c16214a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16214a.getText(), c28655q2, TextResource.$stable), null, c16214a.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c16214a.getTextStyle(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35253h(c16214a, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m111776U(C16214a c16214a, int i13, Composer composer, int i14) {
        m111775T(c16214a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V */
    private static final void m111777V(C35256i0 c35256i0, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1740883913);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c35256i0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC22953f.m66715b(c28655q, modifier);
            if (c35256i0.getName() instanceof C16214a) {
                c28655q.m87150e0(-2047799861);
                m111775T((C16214a) c35256i0.getName(), c28655q, 0);
            } else {
                c28655q.m87150e0(942746425);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(1 * 4, C2314t.f9131w));
            if (c35256i0.getValue() instanceof C16214a) {
                c28655q.m87150e0(-2047795348);
                m111775T((C16214a) c35256i0.getValue(), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2047793686);
                AbstractC25303l.m74291r(c35256i0.getValue(), null, null, null, c28655q, 0, 14);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c35256i0, modifier, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m111778W(C35256i0 c35256i0, Modifier modifier, int i13, Composer composer, int i14) {
        m111777V(c35256i0, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private static final void m111779X(C35258j0 c35258j0, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1273713701);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c35258j0) : c28655q.m87157i(c35258j0) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = c35258j0.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(298504320);
                TextResource title = c35258j0.getType().getTitle();
                boolean z13 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c35258j0))) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C35255i(c35258j0, function1, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(title, 0L, (InterfaceC4339a) objM87133R, 2, null), c35258j0.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(298823744);
                int i15 = i14;
                AbstractC33208p0 abstractC33208p0M111743o = c35258j0.getType();
                TextResource textResourceM111742n = c35258j0.getSupportText();
                TextResource textResourceM111737i = c35258j0.getPrimaryButtonText();
                TextResource textResourceM111739k = c35258j0.getSecondaryButtonText();
                boolean zM111741m = c35258j0.getShowSecondaryButton();
                int i16 = i15 & 112;
                boolean zM87157i = c28655q.m87157i(c35258j0) | (i16 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C35255i(c35258j0, function1, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean zM87157i2 = c28655q.m87157i(c35258j0) | (i16 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C35255i(c35258j0, function1, 2);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                int i17 = AbstractC33208p0.f138461d;
                int i18 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M111743o, textResourceM111742n, null, textResourceM111737i, interfaceC4339a, zM111741m, false, textResourceM111739k, interfaceC4339a2, null, false, false, c28655q, i17 | (i18 << 3) | (i18 << 9) | (i18 << 21), 0, 3652);
                InterfaceC35243c interfaceC35243cM111736h = c35258j0.getFollowUpEvent();
                boolean zM87157i3 = c28655q.m87157i(c35258j0) | (i16 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    function2 = function1;
                    objM87133R4 = new h(c35258j0, function2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function2 = function1;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC35243cM111736h);
                c28655q.m87173q(false);
            }
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35257j(c35258j0, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m111780Y(C35258j0 c35258j0, Function1 function1) {
        InterfaceC35243c interfaceC35243cM111738j = c35258j0.getPrimaryClickEvent();
        if (interfaceC35243cM111738j != null) {
            function1.invoke(interfaceC35243cM111738j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m111781Z(C35258j0 c35258j0, Function1 function1) {
        InterfaceC35243c interfaceC35243cM111738j = c35258j0.getPrimaryClickEvent();
        if (interfaceC35243cM111738j != null) {
            function1.invoke(interfaceC35243cM111738j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m111783a0(C35258j0 c35258j0, Function1 function1) {
        InterfaceC35243c interfaceC35243cM111740l = c35258j0.getSecondaryClickEvent();
        if (interfaceC35243cM111740l != null) {
            function1.invoke(interfaceC35243cM111740l);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m111785b0(C35258j0 c35258j0, Function1 function1, int i13, Composer composer, int i14) {
        m111779X(c35258j0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c0 */
    private static final void m111787c0(C35242b0 c35242b0, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1893363621);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c35242b0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC29125c.m88520b(Boolean.valueOf(c35242b0.getPopUpDialog() != null), null, null, null, AbstractC37817c.m121344e(1565879194, c28655q, new C28119c(24, c35242b0, function1)), c28655q, 24576, 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c35242b0, function1, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m111789d0(C35242b0 c35242b0, final Function1 function1, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (!z4 || c35242b0.getPopUpDialog() == null) {
            c28655q.m87150e0(1467881640);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1467355973);
            final C35241b c35241bM111660e = c35242b0.getPopUpDialog();
            TextResource textResourceM111655g = c35241bM111660e.getTitle();
            TextResource textResourceM111651c = c35241bM111660e.getDescription();
            TextResource textResourceM111653e = c35241bM111660e.getPrimaryActionText();
            InterfaceC39332e interfaceC39332eM111652d = c35241bM111660e.getPrimaryActionColor();
            TextResource textResourceM111654f = c35241bM111660e.getSecondaryActionText();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c35241bM111660e);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                final int i15 = 0;
                objM87133R = new InterfaceC4339a() { // from class: uu2.k
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC35261l.m111791e0(function1, c35241bM111660e);
                            default:
                                return AbstractC35261l.m111793f0(function1, c35241bM111660e);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(c35241bM111660e);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                final int i16 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: uu2.k
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return AbstractC35261l.m111791e0(function1, c35241bM111660e);
                            default:
                                return AbstractC35261l.m111793f0(function1, c35241bM111660e);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            int i17 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM111655g, textResourceM111651c, textResourceM111653e, false, interfaceC39332eM111652d, null, null, null, textResourceM111654f, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i17 << 3) | (i17 << 6) | (i17 << 9) | (i17 << 27), 384, 0, 247459281);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m111791e0(Function1 function1, C35241b c35241b) {
        function1.invoke(c35241b.getCancelEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m111793f0(Function1 function1, C35241b c35241b) {
        function1.invoke(c35241b.getApproveEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m111795g0(C35242b0 c35242b0, Function1 function1, int i13, Composer composer, int i14) {
        m111787c0(c35242b0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x0171  */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:65:0x01da  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    private static final void m111815z(C35260k0 c35260k0, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        float f13;
        Modifier modifierM3394p;
        Context context;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier5;
        C35239a c35239aM111749a;
        C35256i0 c35256i0M111627d;
        boolean zM87157i;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2010009718);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(c35260k0) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                f13 = 4;
                modifierM3394p = AbstractC1099a.m3394p(3 * f13, c2314t);
                C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                f14 = 8;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(modifier4, 2 * f14, 0.0f, 2), c13821r1M92099U, 14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (c35260k0.getShowMedia()) {
                    c28655q.m87150e0(1100961728);
                    if (c35260k0.getMediaCardState() == null) {
                        c28655q.m87150e0(-229924799);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-229924798);
                        AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(((float) 0.5d) * f14, c2314t));
                        InterfaceC25312u interfaceC25312uM111752d = c35260k0.getMediaCardState();
                        C30745a c30745a = new C30745a(19);
                        zM87157i = c28655q.m87157i(c35260k0) | c28655q.m87157i(context);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == C28635l.f115821a) {
                            objM87133R = new C35076b(3, c35260k0, context);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC25303l.m74291r(interfaceC25312uM111752d, null, c30745a, (Function1) objM87133R, c28655q, 0, 2);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-229330590);
                    c28655q.m87173q(false);
                }
                C35256i0 c35256i0M111755g = c35260k0.getTitleAndDescription();
                if (c35260k0.getShowMedia()) {
                    modifier5 = modifierM3394p;
                } else {
                    modifier5 = modifierM3394p;
                    modifierM3394p = AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f14, 0.0f, 0.0f, 13);
                }
                m111777V(c35256i0M111755g, modifierM3394p, c28655q, 0);
                m111777V(c35260k0.getEquipment(), modifier5, c28655q, 48);
                m111777V(c35260k0.getMuscleGroup(), modifier5, c28655q, 48);
                c35239aM111749a = c35260k0.getCustomExerciseItems();
                if (c35239aM111749a != null) {
                    c35256i0M111627d = c35239aM111749a.getLinkedExercise();
                } else {
                    c35256i0M111627d = null;
                }
                if (c35256i0M111627d == null) {
                    c28655q.m87150e0(-228798321);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-228798320);
                    m111777V(c35256i0M111627d, AbstractC1099a.m3394p(f13 * f13, c2314t), c28655q, 48);
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t, 0.0f, f13 * f14, 0.0f, 0.0f, 13));
                AbstractC22403o abstractC22403oM64502k = AbstractC22404p.m64502k(AbstractC16272a.f62043a);
                String string = context.getString(AbstractC11128h.f35463e0);
                AbstractC22676k.m65749i(string, "getString(...)");
                String string2 = context.getString(AbstractC11128h.f35460d0);
                AbstractC22676k.m65749i(string2, "getString(...)");
                AbstractC25303l.m74291r(new C22160d(abstractC22403oM64502k, string, string2, null, null, null, 56, null), null, null, null, c28655q, C22160d.f85916g, 14);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(c35260k0, i13, modifier3, i14, 9);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            f13 = 4;
            modifierM3394p = AbstractC1099a.m3394p(3 * f13, c2314t);
            C13821r1 c13821r1M92099U2 = AbstractC30060g.m92099U(0, c28655q, 1);
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            f14 = 8;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(modifier4, 2 * f14, 0.0f, 2), c13821r1M92099U2, 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (c35260k0.getShowMedia()) {
                c28655q.m87150e0(1100961728);
                if (c35260k0.getMediaCardState() == null) {
                    c28655q.m87150e0(-229924799);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-229924798);
                    AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(((float) 0.5d) * f14, c2314t));
                    InterfaceC25312u interfaceC25312uM111752d2 = c35260k0.getMediaCardState();
                    C30745a c30745a2 = new C30745a(19);
                    zM87157i = c28655q.m87157i(c35260k0) | c28655q.m87157i(context);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C35076b(3, c35260k0, context);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C35076b(3, c35260k0, context);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312uM111752d2, null, c30745a2, (Function1) objM87133R, c28655q, 0, 2);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-229330590);
                c28655q.m87173q(false);
            }
            C35256i0 c35256i0M111755g2 = c35260k0.getTitleAndDescription();
            if (c35260k0.getShowMedia()) {
                modifier5 = modifierM3394p;
            } else {
                modifier5 = modifierM3394p;
                modifierM3394p = AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f14, 0.0f, 0.0f, 13);
            }
            m111777V(c35256i0M111755g2, modifierM3394p, c28655q, 0);
            m111777V(c35260k0.getEquipment(), modifier5, c28655q, 48);
            m111777V(c35260k0.getMuscleGroup(), modifier5, c28655q, 48);
            c35239aM111749a = c35260k0.getCustomExerciseItems();
            if (c35239aM111749a != null) {
                c35256i0M111627d = c35239aM111749a.getLinkedExercise();
            } else {
                c35256i0M111627d = null;
            }
            if (c35256i0M111627d == null) {
                c28655q.m87150e0(-228798321);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-228798320);
                m111777V(c35256i0M111627d, AbstractC1099a.m3394p(f13 * f13, c2314t), c28655q, 48);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t, 0.0f, f13 * f14, 0.0f, 0.0f, 13));
            AbstractC22403o abstractC22403oM64502k2 = AbstractC22404p.m64502k(AbstractC16272a.f62043a);
            String string3 = context.getString(AbstractC11128h.f35463e0);
            AbstractC22676k.m65749i(string3, "getString(...)");
            String string4 = context.getString(AbstractC11128h.f35460d0);
            AbstractC22676k.m65749i(string4, "getString(...)");
            AbstractC25303l.m74291r(new C22160d(abstractC22403oM64502k2, string3, string4, null, null, null, 56, null), null, null, null, c28655q, C22160d.f85916g, 14);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(c35260k0, i13, modifier3, i14, 9);
        }
    }
}
