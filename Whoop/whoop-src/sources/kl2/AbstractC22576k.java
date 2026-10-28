package kl2;

import al2.AbstractC0988d;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.material3.AbstractC1123d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import il2.C18651b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.config.AbstractC20301a;
import io2.C20769k0;
import iy0.C21026a;
import j11.AbstractC21211n;
import j11.C21214q;
import jf3.C21647a;
import jl2.C21775b;
import jl2.C21776c;
import jp1.C21851c;
import jp1.C21860l;
import jp1.C21862n;
import k71.C22252i;
import kd1.C22411w;
import kg2.C22458d;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ml2.InterfaceC25676a;
import nf3.C26669a;
import nl2.C26816c;
import ny0.AbstractC27242b1;
import ny0.AbstractC27265l0;
import ny0.AbstractC27274q;
import ny0.AbstractC27282u;
import ny0.C27270o;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23138n;
import p292l1.C23083d4;
import p292l1.C23132m;
import p315m0.AbstractC24868a;
import p354o1.AbstractC27386y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.AbstractC33215r1;
import p736sz0.C33205o0;
import p736sz0.C33214r0;
import p736sz0.C33221t1;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: kl2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u0007H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006#²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"Lil2/b;", "navRouter", "Ll83/a0;", "D", "(Lil2/b;Landroidx/compose/runtime/Composer;I)V", "Lnl2/c;", "viewState", "Lkotlin/Function1;", "Lml2/a;", "onEvent", "R", "(Lnl2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "I", "Lnl2/c$f;", "content", "c0", "(Lnl2/c$f;Lkotlin/jvm/functions/Function1;)V", "Lnl2/c$c;", "T", "(Lnl2/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lnl2/c$g;", "toggleViewState", "Y", "(Lnl2/c$g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lnl2/c$e;", "item", "onItemClicked", "A", "(Lnl2/c$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "helpClick", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lnl2/c$e;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ljl2/b;", "viewModel", "training_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22576k {

    /* JADX INFO: renamed from: kl2.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f88829w = new a();

        /* JADX INFO: renamed from: a */
        public final long m65393a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m65393a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: kl2.k$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f88830w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f88831x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f88832y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f88833z;

        /* JADX INFO: renamed from: kl2.k$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f88834w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f88834w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f88834w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f88830w = c38266c;
            this.f88831x = interfaceC35951a;
            this.f88832y = interfaceC4339a;
            this.f88833z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, jl2.b] */
        @Override // c93.InterfaceC4339a
        public final C21775b invoke() {
            return AbstractC21598x.m60668X(this.f88830w, this.f88831x, new a(this.f88833z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21775b.class), null, this.f88832y);
        }
    }

    /* JADX INFO: renamed from: kl2.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.view.compose.HrSettingsScreenKt$HrSettings$1$1", m100430f = "HrSettingsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88835w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f88836x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88836x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f88836x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88835w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC22576k.m65342E(this.f88836x).m61582p(InterfaceC25676a.b.f.f100988a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kl2.k$d */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.view.compose.HrSettingsScreenKt$HrSettingsPageScreen$2$1$2$1$1$2$1$1", m100430f = "HrSettingsScreen.kt", m100431l = {169}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88837w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f88838x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15199y3 c15199y3, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88838x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f88838x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88837w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f88838x;
                this.f88837w = 1;
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

    /* JADX INFO: renamed from: kl2.k$e */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.view.compose.HrSettingsScreenKt$HrSettingsPageScreen$2$1$3$1$1", m100430f = "HrSettingsScreen.kt", m100431l = {195}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88839w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f88840x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15199y3 c15199y3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88840x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f88840x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88839w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f88840x;
                this.f88839w = 1;
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

    /* JADX INFO: renamed from: kl2.k$f */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.view.compose.HrSettingsScreenKt$HrSettingsPageScreen$3$1", m100430f = "HrSettingsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88841w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f88842x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f88843y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C15199y3 c15199y3, Function1 function1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88842x = c15199y3;
            this.f88843y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f88842x, this.f88843y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88841w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC15209z3 enumC15209z3M43221b = this.f88842x.m43221b();
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            if (enumC15209z3M43221b == enumC15209z3 && this.f88842x.m43222c() == enumC15209z3 && ((Number) this.f88842x.f57060b.f55774k.getValue()).floatValue() == 1.0f) {
                this.f88843y.invoke(InterfaceC25676a.b.a.f100981a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m65338A(C26816c.e eVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2106578553);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(eVar) : c28655q.m87157i(eVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(eVar)));
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C22572g(eVar, function1, 0);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125420t = c38072d.m121949b(c28655q, i15).getBlack50();
            C22411w c22411w = C22411w.f87680a;
            float f13 = 4;
            Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM3409f, jM125420t, c22411w.m64535a().m64090c()), ((float) 0.25d) * f13, c38072d.m121949b(c28655q, i15).getWhite30(), c22411w.m64535a().m64090c());
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44455h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21275i = AbstractC8693b.m21275i(String.valueOf(eVar.getValue()), c28655q, 0);
            float f14 = f13 * 3;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t);
            C2886a c2886aM8406D = c38072d.m121952e(c28655q, i15).getN7();
            long jMo134584toComposableColorWaAFU9c = eVar.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21275i, modifierM3394p, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8406D, null, c28655q, 48, i16, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(eVar.getUnits(), c28655q, 0), AbstractC1099a.m3394p(f14, c2314t), c38072d.m121949b(c28655q, i15).getWhite30(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, i16, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(eVar, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m65339B(C26816c.e eVar, Function1 function1) {
        if (eVar.getEditable()) {
            function1.invoke(eVar);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m65340C(C26816c.e eVar, Function1 function1, int i13, Composer composer, int i14) {
        m65338A(eVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public static final void m65341D(C18651b navRouter, Composer composer, int i13) {
        int i14;
        Object obj;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1483493072);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navRouter) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                obj = objM87133R;
                InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(interfaceC23462hM92087G);
                obj = interfaceC23462hM92087G;
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) obj;
            c28655q.m87173q(false);
            boolean z4 = false ? 1 : 0;
            boolean z13 = false ? 1 : 0;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m65342E(interfaceC23462h).getViewState(), new C26816c(new C26816c.d(C33205o0.f138451a.m105288b(), null, null, 6, null), z4, z13, null, 14, null), null, c28655q, 0, 2);
            C21775b c21775bM65342E = m65342E(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(interfaceC23462h);
            Object objM87133R2 = c28655q.m87133R();
            Object obj2 = objM87133R2;
            if (zM87157i || objM87133R2 == c28676v0) {
                c cVar = new c(interfaceC23462h, null);
                c28655q.m87172p0(cVar);
                obj2 = cVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj2, c21775bM65342E);
            C26816c c26816cM65343F = m65343F(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R3 = c28655q.m87133R();
            Object obj3 = objM87133R3;
            if (zM87157i2 || objM87133R3 == c28676v0) {
                C21851c c21851c = new C21851c(9, navRouter, interfaceC23462h);
                c28655q.m87172p0(c21851c);
                obj3 = c21851c;
            }
            m65355R(c26816cM65343F, (Function1) obj3, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(navRouter, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C21775b m65342E(InterfaceC23462h interfaceC23462h) {
        return (C21775b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: F */
    private static final C26816c m65343F(InterfaceC28670t2 interfaceC28670t2) {
        return (C26816c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m65344G(C18651b c18651b, InterfaceC23462h interfaceC23462h, InterfaceC25676a it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC25676a.b) {
            m65342E(interfaceC23462h).m61582p((InterfaceC25676a.b) it);
        } else {
            if (!(it instanceof InterfaceC25676a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c18651b.m54082a((InterfaceC25676a.a) it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m65345H(C18651b c18651b, int i13, Composer composer, int i14) {
        m65341D(c18651b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:106:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:110:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:114:0x0473  */
    /* JADX WARN: Code duplicated, block: B:115:0x0475  */
    /* JADX WARN: Code duplicated, block: B:119:0x0488  */
    /* JADX WARN: Code duplicated, block: B:123:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:126:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:127:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:132:0x051e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0561  */
    /* JADX WARN: Code duplicated, block: B:136:0x0564  */
    /* JADX WARN: Code duplicated, block: B:140:0x0570  */
    /* JADX WARN: Code duplicated, block: B:143:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:148:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x0607  */
    /* JADX WARN: Code duplicated, block: B:152:0x0609  */
    /* JADX WARN: Code duplicated, block: B:156:0x0613  */
    /* JADX WARN: Code duplicated, block: B:46:0x016d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0170  */
    /* JADX WARN: Code duplicated, block: B:53:0x0182  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0214  */
    /* JADX WARN: Code duplicated, block: B:67:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x030f  */
    /* JADX WARN: Code duplicated, block: B:79:0x032e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0343  */
    /* JADX WARN: Code duplicated, block: B:85:0x0370  */
    /* JADX WARN: Code duplicated, block: B:86:0x0374  */
    /* JADX WARN: Code duplicated, block: B:91:0x0395  */
    /* JADX WARN: Code duplicated, block: B:94:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:95:0x03a9  */
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
    /* JADX INFO: renamed from: I */
    private static final void m65346I(final C26816c c26816c, final Function1 function1, Composer composer, int i13) {
        final C26816c c26816c2;
        int i14;
        C15199y3 c15199y3;
        int i15;
        boolean z4;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC2994c0 interfaceC2994c0;
        C15199y3 c15199y4;
        int i16;
        int iHashCode;
        C0209i c0209i;
        C2305k c2305k;
        char c3;
        int iHashCode2;
        C15199y3 c15199y5;
        InterfaceC2994c0 interfaceC2994c1;
        int i17;
        boolean z14;
        boolean zM87157i;
        Object objM87133R2;
        final Function1 function2;
        int iHashCode3;
        C0213j c0213j;
        C0209i c0209i2;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        InterfaceC2994c0 interfaceC2994c2;
        int i18;
        C28676v0 c28676v1;
        boolean z17;
        boolean z18;
        Object objM87133R4;
        boolean z19;
        boolean z24;
        Object objM87133R5;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i3;
        int i19;
        boolean z25;
        boolean z26;
        Object objM87133R6;
        Function1 function3;
        boolean z27;
        InterfaceC2994c0 interfaceC2994c3;
        C15199y3 c15199y6;
        boolean zM87157i2;
        Object objM87133R7;
        Function1 function4 = function1;
        C2305k c2305k2 = C2299e.f9110M;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1446087251);
        int i24 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(c26816c) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i24 |= c28655q.m87157i(function4) ? 32 : 16;
        }
        if (c28655q.m87135U(i24 & 1, (i24 & 19) != 18)) {
            Object objM87133R8 = c28655q.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (objM87133R8 == c28676v2) {
                objM87133R8 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC2994c0 interfaceC2994c4 = (InterfaceC2994c0) objM87133R8;
            boolean z28 = true;
            boolean z29 = false;
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            C26816c.c cVarM80006c = c26816c.getDialogState();
            if (cVarM80006c == null) {
                c28655q.m87150e0(-1863027236);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1863027235);
                m65357T(cVarM80006c, function4, c28655q, i24 & 112);
                c28655q.m87173q(false);
            }
            C26816c.f fVarM80005b = c26816c.getContent();
            if (fVarM80005b == null) {
                c28655q.m87150e0(-1862792845);
                c28655q.m87173q(false);
                i14 = i24;
                c28676v1 = c28676v2;
                interfaceC2994c2 = interfaceC2994c4;
                c15199y5 = c15199y3M3460c;
                i18 = 32;
                c26816c2 = c26816c;
                function2 = function4;
            } else {
                c28655q.m87150e0(-1862792844);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC22953f.m66723l(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 0);
                int iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                C0209i c0209i6 = C0217k.f732j;
                i14 = i24;
                if (c28655q.f115903S) {
                    c15199y3 = c15199y3M3460c;
                } else {
                    c15199y3 = c15199y3M3460c;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                    AbstractC6721d.a aVar = new AbstractC6721d.a(fVarM80005b.getToolbarTitle(), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC0988d.f3672a), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    boolean zM87157i3 = c28655q.m87157i(c26816c);
                    i15 = i14 & 112;
                    if (i15 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z13 = zM87157i3 | z4;
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v2) {
                        final int i25 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: kl2.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        return AbstractC22576k.m65347J(c26816c, function1);
                                    default:
                                        return AbstractC22576k.m65353P(c26816c, function1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    c28676v0 = c28676v2;
                    interfaceC2994c0 = interfaceC2994c4;
                    c15199y4 = c15199y3;
                    i16 = i15;
                    AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                    float f13 = 2;
                    float f14 = 8;
                    float f15 = f13 * f14;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k2, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        c0209i = c0209i6;
                    } else {
                        c0209i = c0209i6;
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
                    TextResource textResourceM80040c = fVarM80005b.getIntroTitle();
                    int i26 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM80040c, c28655q, i26);
                    C38072d c38072d = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    long jM125430y = c38072d.m121949b(c28655q, i27).getBrandWhite();
                    C2886a c2886aM8419Q = c38072d.m121952e(c28655q, i27).getT4();
                    int i28 = C2886a.f11498d << 18;
                    c2305k = c2305k2;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q, 0, i28, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(fVarM80005b.getIntroBody(), c28655q, i26), null, c38072d.m121949b(c28655q, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getB2(), null, c28655q, 0, i28, 196602);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    c3 = 3;
                    float f16 = 3;
                    float f17 = 4;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16 * f17), C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    c28655q.m87150e0(1667947530);
                    for (C26816c.e eVar : fVarM80005b.m80038a()) {
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (0.5f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f2, true, 0.5f);
                        C2305k c2305k3 = c2305k;
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM31988g);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                        boolean zM87157i4 = c28655q.m87157i(eVar);
                        i19 = i16;
                        if (i19 == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = zM87157i4 | z25;
                        objM87133R6 = c28655q.m87133R();
                        C28676v0 c28676v3 = c28676v0;
                        if (!z26 || objM87133R6 == c28676v3) {
                            function3 = function1;
                            objM87133R6 = new C22572g(eVar, function3, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            function3 = function1;
                        }
                        int i29 = TextResource.$stable;
                        m65389w(eVar, (InterfaceC4339a) objM87133R6, c28655q, i29, 0);
                        if (i19 == 32) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        interfaceC2994c3 = interfaceC2994c0;
                        char c7 = c3;
                        c15199y6 = c15199y4;
                        zM87157i2 = z27 | c28655q.m87157i(interfaceC2994c3) | c28655q.m87157i(c15199y6);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R7 == c28676v3) {
                            objM87133R7 = new C22575j(function3, interfaceC2994c3, c15199y6, 0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        m65338A(eVar, (Function1) objM87133R7, c28655q, i29);
                        c28655q.m87173q(true);
                        c15199y4 = c15199y6;
                        interfaceC2994c0 = interfaceC2994c3;
                        c2305k = c2305k3;
                        i16 = i19;
                        c28676v0 = c28676v3;
                        c3 = c7;
                    }
                    c15199y5 = c15199y4;
                    interfaceC2994c1 = interfaceC2994c0;
                    C28676v0 c28676v4 = c28676v0;
                    i17 = i16;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    C26816c.g gVarM80043f = fVarM80005b.getToggleViewState();
                    int i34 = TextResource.$stable;
                    m65362Y(gVarM80043f, function1, c28655q, i34 | i17);
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17 * f17, c2314t));
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f15, 0.0f, 11);
                    C33221t1 c33221t1 = new C33221t1(fVarM80005b.getZoneViewState().getZoneHeaderText(), fVarM80005b.getZoneViewState().getZoneMinHeaderText(), fVarM80005b.getZoneViewState().getZoneMaxHeaderText(), fVarM80005b.getZoneViewState().m105397e());
                    if (i17 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | c28655q.m87157i(interfaceC2994c1) | c28655q.m87157i(c15199y5);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v4) {
                        objM87133R2 = new C22575j(function1, interfaceC2994c1, c15199y5, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function2 = function1;
                    AbstractC33215r1.m105365r(modifierM3398t, c33221t1, (Function1) objM87133R2, c28655q, (C33221t1.f138538e << 3) | 6, 0);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
                    float f18 = f16 * f14;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f18, 0.0f, f18, 5);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * f14, 0.0f, 2);
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    String strM21274h2 = AbstractC8693b.m21274h(fVarM80005b.getPrimaryButton().getTitle(), c28655q, i34);
                    boolean zM80015b = fVarM80005b.getPrimaryButton().getEnabled();
                    long jM125371X = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                    boolean zM87157i5 = c28655q.m87157i(fVarM80005b);
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i5 | z15;
                    objM87133R3 = c28655q.m87133R();
                    if (z16 || objM87133R3 == c28676v4) {
                        objM87133R3 = new C21214q(fVarM80005b, function2, 22);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2994c2 = interfaceC2994c1;
                    i18 = 32;
                    c28676v1 = c28676v4;
                    AbstractC27282u.m82292h(modifierM3396r2, enumC27284v, strM21274h2, zM80015b, jM125371X, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 96);
                    AbstractC11266d.m30469w(f13, f17, c2314t, c28655q);
                    EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                    TextResource textResourceM80016c = fVarM80005b.getSecondaryButton().getTitle();
                    boolean zM80015b2 = fVarM80005b.getSecondaryButton().getEnabled();
                    boolean zM87157i6 = c28655q.m87157i(fVarM80005b);
                    if (i17 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i6 | z17;
                    objM87133R4 = c28655q.m87133R();
                    if (z18 || objM87133R4 == c28676v1) {
                        objM87133R4 = new C21851c(10, fVarM80005b, function2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM80016c, null, null, zM80015b2, null, null, false, false, null, null, (Function1) objM87133R4, c28655q, (i34 << 6) | 48, 0, 4057);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c26816c2 = c26816c;
                    boolean zM87157i7 = c28655q.m87157i(c26816c2);
                    if (i17 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zM87157i7 | z19;
                    objM87133R5 = c28655q.m87133R();
                    if (z24 || objM87133R5 == c28676v1) {
                        final int i35 = 1;
                        objM87133R5 = new InterfaceC4339a() { // from class: kl2.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i35) {
                                    case 0:
                                        return AbstractC22576k.m65347J(c26816c2, function2);
                                    default:
                                        return AbstractC22576k.m65353P(c26816c2, function2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    z28 = true;
                    z29 = false;
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q, 0, 1);
                    c28655q.m87173q(false);
                }
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i6);
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N);
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(fVarM80005b.getToolbarTitle(), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC0988d.f3672a), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                boolean zM87157i8 = c28655q.m87157i(c26816c);
                i15 = i14 & 112;
                if (i15 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z13 = zM87157i8 | z4;
                objM87133R = c28655q.m87133R();
                if (z13) {
                    final int i210 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: kl2.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i210) {
                                case 0:
                                    return AbstractC22576k.m65347J(c26816c, function1);
                                default:
                                    return AbstractC22576k.m65353P(c26816c, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i211 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: kl2.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211) {
                                case 0:
                                    return AbstractC22576k.m65347J(c26816c, function1);
                                default:
                                    return AbstractC22576k.m65353P(c26816c, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                c28676v0 = c28676v2;
                interfaceC2994c0 = interfaceC2994c4;
                c15199y4 = c15199y3;
                i16 = i15;
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                float f19 = 2;
                float f110 = 8;
                float f111 = f19 * f110;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t));
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f111, 0.0f, 2);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f111), c2305k2, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    c0209i = c0209i6;
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    c0209i = c0209i6;
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                TextResource textResourceM80040c2 = fVarM80005b.getIntroTitle();
                int i212 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM80040c2, c28655q, i212);
                C38072d c38072d2 = C38072d.f163053a;
                int i213 = C38072d.f163054b;
                long jM125430y2 = c38072d2.m121949b(c28655q, i213).getBrandWhite();
                C2886a c2886aM8419Q2 = c38072d2.m121952e(c28655q, i213).getT4();
                int i214 = C2886a.f11498d << 18;
                c2305k = c2305k2;
                AbstractC30795n.m94707h(strM21274h3, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8419Q2, null, c28655q, 0, i214, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(fVarM80005b.getIntroBody(), c28655q, i212), null, c38072d2.m121949b(c28655q, i213).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i213).getB2(), null, c28655q, 0, i214, 196602);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                c3 = 3;
                float f112 = 3;
                float f113 = 4;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f112 * f113), C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                c28655q.m87150e0(1667947530);
                while (r0.hasNext()) {
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (0.5f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM3409f4, true, 0.5f);
                    C2305k c2305k4 = c2305k;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k4, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM31988g2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                    boolean zM87157i9 = c28655q.m87157i(eVar);
                    i19 = i16;
                    if (i19 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zM87157i9 | z25;
                    objM87133R6 = c28655q.m87133R();
                    C28676v0 c28676v5 = c28676v0;
                    if (z26) {
                        function3 = function1;
                        objM87133R6 = new C22572g(eVar, function3, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function3 = function1;
                        objM87133R6 = new C22572g(eVar, function3, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i215 = TextResource.$stable;
                    m65389w(eVar, (InterfaceC4339a) objM87133R6, c28655q, i215, 0);
                    if (i19 == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    interfaceC2994c3 = interfaceC2994c0;
                    char c14 = c3;
                    c15199y6 = c15199y4;
                    zM87157i2 = z27 | c28655q.m87157i(interfaceC2994c3) | c28655q.m87157i(c15199y6);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R7 = new C22575j(function3, interfaceC2994c3, c15199y6, 0);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C22575j(function3, interfaceC2994c3, c15199y6, 0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    m65338A(eVar, (Function1) objM87133R7, c28655q, i215);
                    c28655q.m87173q(true);
                    c15199y4 = c15199y6;
                    interfaceC2994c0 = interfaceC2994c3;
                    c2305k = c2305k4;
                    i16 = i19;
                    c28676v0 = c28676v5;
                    c3 = c14;
                }
                c15199y5 = c15199y4;
                interfaceC2994c1 = interfaceC2994c0;
                C28676v0 c28676v6 = c28676v0;
                i17 = i16;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                C26816c.g gVarM80043f2 = fVarM80005b.getToggleViewState();
                int i36 = TextResource.$stable;
                m65362Y(gVarM80043f2, function1, c28655q, i36 | i17);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f113 * f113, c2314t));
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f111, 0.0f, 11);
                C33221t1 c33221t2 = new C33221t1(fVarM80005b.getZoneViewState().getZoneHeaderText(), fVarM80005b.getZoneViewState().getZoneMinHeaderText(), fVarM80005b.getZoneViewState().getZoneMaxHeaderText(), fVarM80005b.getZoneViewState().m105397e());
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | c28655q.m87157i(interfaceC2994c1) | c28655q.m87157i(c15199y5);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C22575j(function1, interfaceC2994c1, c15199y5, 1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C22575j(function1, interfaceC2994c1, c15199y5, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = function1;
                AbstractC33215r1.m105365r(modifierM3398t3, c33221t2, (Function1) objM87133R2, c28655q, (C33221t1.f138538e << 3) | 6, 0);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
                float f114 = f112 * f110;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f114, 0.0f, f114, 5);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * f110, 0.0f, 2);
                EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                String strM21274h4 = AbstractC8693b.m21274h(fVarM80005b.getPrimaryButton().getTitle(), c28655q, i36);
                boolean zM80015b3 = fVarM80005b.getPrimaryButton().getEnabled();
                long jM125371X2 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                boolean zM87157i10 = c28655q.m87157i(fVarM80005b);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i10 | z15;
                objM87133R3 = c28655q.m87133R();
                if (z16) {
                    objM87133R3 = new C21214q(fVarM80005b, function2, 22);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C21214q(fVarM80005b, function2, 22);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2994c2 = interfaceC2994c1;
                i18 = 32;
                c28676v1 = c28676v6;
                AbstractC27282u.m82292h(modifierM3396r4, enumC27284v2, strM21274h4, zM80015b3, jM125371X2, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 96);
                AbstractC11266d.m30469w(f19, f113, c2314t, c28655q);
                EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                TextResource textResourceM80016c2 = fVarM80005b.getSecondaryButton().getTitle();
                boolean zM80015b4 = fVarM80005b.getSecondaryButton().getEnabled();
                boolean zM87157i11 = c28655q.m87157i(fVarM80005b);
                if (i17 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i11 | z17;
                objM87133R4 = c28655q.m87133R();
                if (z18) {
                    objM87133R4 = new C21851c(10, fVarM80005b, function2);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C21851c(10, fVarM80005b, function2);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC27265l0.m82217i(null, enumC27269n1, textResourceM80016c2, null, null, zM80015b4, null, null, false, false, null, null, (Function1) objM87133R4, c28655q, (i36 << 6) | 48, 0, 4057);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c26816c2 = c26816c;
                boolean zM87157i12 = c28655q.m87157i(c26816c2);
                if (i17 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87157i12 | z19;
                objM87133R5 = c28655q.m87133R();
                if (z24) {
                    final int i37 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: kl2.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i37) {
                                case 0:
                                    return AbstractC22576k.m65347J(c26816c2, function2);
                                default:
                                    return AbstractC22576k.m65353P(c26816c2, function2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    final int i38 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: kl2.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i38) {
                                case 0:
                                    return AbstractC22576k.m65347J(c26816c2, function2);
                                default:
                                    return AbstractC22576k.m65353P(c26816c2, function2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                z28 = true;
                z29 = false;
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q, 0, 1);
                c28655q.m87173q(false);
            }
            EnumC15209z3 enumC15209z3M43221b = c15199y5.m43221b();
            EnumC15209z3 enumC15209z3M43222c = c15199y5.m43222c();
            boolean zM87157i13 = c28655q.m87157i(c15199y5) | ((i14 & 112) == i18 ? z28 : z29);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i13 || objM87133R9 == c28676v1) {
                objM87133R9 = new f(c15199y5, function2, null);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87254h(enumC15209z3M43221b, enumC15209z3M43222c, (InterfaceC4351m) objM87133R9, c28655q);
            C15199y3 c15199y7 = c15199y5;
            C26816c.a aVarM80004a = c26816c2.getBottomSheetState();
            if (aVarM80004a == null) {
                c28655q.m87150e0(-1857502881);
                c28655q.m87173q(z29);
                function4 = function2;
            } else {
                c28655q.m87150e0(-1857502880);
                function4 = function2;
                AbstractC22567b.m65317h(aVarM80004a, interfaceC2994c2, c15199y7, function4, c28655q, 512 | ((i14 << 6) & 7168));
                c28655q.m87173q(z29);
            }
        } else {
            c26816c2 = c26816c;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22570e(c26816c2, function4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m65347J(C26816c c26816c, Function1 function1) {
        m65369c0(c26816c.getContent(), function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m65348K(C26816c.e eVar, Function1 function1) {
        if (eVar.getType() == C21776c.a.RESTING) {
            function1.invoke(InterfaceC25676a.b.p.f101003a);
        } else {
            function1.invoke(InterfaceC25676a.b.n.f101001a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m65349L(Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, C26816c.e it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC25676a.b.l(it.getValue(), it.getMinValue(), it.getMaxValue()));
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m65350M(Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C33214r0) {
            C33214r0 c33214r0 = (C33214r0) it;
            function1.invoke(new InterfaceC25676a.b.e(c33214r0.getId(), c33214r0.getValue(), c33214r0.getType()));
        }
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m65351N(C26816c.f fVar, Function1 function1) {
        InterfaceC25676a interfaceC25676aM80014a = fVar.getPrimaryButton().getAction();
        if (interfaceC25676aM80014a != null) {
            function1.invoke(interfaceC25676aM80014a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m65352O(C26816c.f fVar, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC25676a interfaceC25676aM80014a = fVar.getSecondaryButton().getAction();
        if (interfaceC25676aM80014a != null) {
            function1.invoke(interfaceC25676aM80014a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m65353P(C26816c c26816c, Function1 function1) {
        m65369c0(c26816c.getContent(), function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m65354Q(C26816c c26816c, Function1 function1, int i13, Composer composer, int i14) {
        m65346I(c26816c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    public static final void m65355R(C26816c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1593573636);
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
            c28655q.m87150e0(1879065561);
            AbstractC22569d.m65333e(viewState.getFullScreenModal(), onEvent, c28655q, i14 & 112);
            c28655q.m87173q(false);
        } else if (viewState.getContent() != null) {
            c28655q.m87150e0(1879068708);
            m65346I(viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1878367802);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22570e(viewState, onEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m65356S(C26816c c26816c, Function1 function1, int i13, Composer composer, int i14) {
        m65355R(c26816c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final void m65357T(final C26816c.c cVar, final Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1742763181);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            TextResource textResourceM80026j = cVar.getTitle();
            TextResource textResourceM80020d = cVar.getDescription();
            TextResource textResourceM80022f = cVar.getPrimaryActionText();
            InterfaceC39332e interfaceC39332eM80021e = cVar.getPrimaryActionColor();
            if (interfaceC39332eM80021e == null) {
                interfaceC39332eM80021e = EnumC39333f.BRAND_WHITE;
            }
            TextResource textResourceM80024h = cVar.getSecondaryActionText();
            boolean zM80025i = cVar.getShowCloseIcon();
            int i16 = i15 & 112;
            boolean z4 = i16 == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C21860l(function1, 25);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i = c28655q2.m87157i(cVar) | (i16 == 32);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                final int i17 = 0;
                objM87133R2 = new InterfaceC4339a() { // from class: kl2.h
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return AbstractC22576k.m65359V(cVar, function1);
                            default:
                                return AbstractC22576k.m65360W(cVar, function1);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i2 = c28655q2.m87157i(cVar) | (i16 == 32);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                final int i18 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: kl2.h
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return AbstractC22576k.m65359V(cVar, function1);
                            default:
                                return AbstractC22576k.m65360W(cVar, function1);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R3);
            }
            int i19 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, textResourceM80026j, textResourceM80020d, textResourceM80022f, false, interfaceC39332eM80021e, null, null, null, textResourceM80024h, null, false, zM80025i, null, null, false, 0, null, null, null, false, null, interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R3, null, null, null, c28655q, (i19 << 3) | (i19 << 6) | (i19 << 9) | (i19 << 27), 0, 0, 239070673);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(cVar, function1, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m65358U(Function1 function1) {
        function1.invoke(InterfaceC25676a.b.C42011b.f100982a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m65359V(C26816c.c cVar, Function1 function1) {
        Object objM80023g = cVar.getSecondaryAction();
        if (objM80023g == null) {
            objM80023g = InterfaceC25676a.b.C42011b.f100982a;
        }
        function1.invoke(objM80023g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m65360W(C26816c.c cVar, Function1 function1) {
        InterfaceC25676a interfaceC25676aM80019c = cVar.getApproveEvent();
        if (interfaceC25676aM80019c != null) {
            function1.invoke(interfaceC25676aM80019c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m65361X(C26816c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m65357T(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    private static final void m65362Y(C26816c.g gVar, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1167873686);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(gVar) : c28655q.m87157i(gVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (!c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            function2 = function1;
            c28655q.m87138X();
        } else if (gVar == null) {
            c28655q.m87150e0(1405277719);
            c28655q.m87173q(false);
            function2 = function1;
        } else {
            c28655q.m87150e0(1405277720);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM80047b = gVar.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM80047b, c28655q, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i17).getB1();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i18, 196602);
            Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, "manual_heart_rate_zones_toggle");
            boolean zM80048c = gVar.getToggleValue();
            long jM125377a = c38072d.m121949b(c28655q, i17).getAccentAction();
            long jM125372X0 = c38072d.m121949b(c28655q, i17).getWhite20();
            long jM125430y2 = c38072d.m121949b(c28655q, i17).getBrandWhite();
            long jM125430y3 = c38072d.m121949b(c28655q, i17).getBrandWhite();
            long j7 = C17919x.f69636m;
            long jM67118d = AbstractC23138n.m67118d(AbstractC27386y.f110084q, c28655q);
            long jM67118d2 = AbstractC23138n.m67118d(AbstractC27386y.f110091x, c28655q);
            long jM67118d3 = AbstractC23138n.m67118d(AbstractC27386y.f110066A, c28655q);
            long jM51541c = C17919x.m51541c(AbstractC27386y.f110069b, AbstractC23138n.m67118d(AbstractC27386y.f110068a, c28655q));
            C28674u2 c28674u2 = AbstractC23138n.f91494a;
            long jM51528p = AbstractC17918w0.m51528p(jM51541c, ((C23132m) c28655q.m87161k(c28674u2)).f91456p);
            long jM67118d4 = AbstractC23138n.m67118d(AbstractC27386y.f110072e, c28655q);
            float f13 = AbstractC27386y.f110073f;
            C23083d4 c23083d4 = new C23083d4(jM125430y2, jM125377a, j7, jM67118d, jM125430y3, jM125372X0, jM67118d2, jM67118d3, jM51528p, AbstractC17918w0.m51528p(C17919x.m51541c(f13, jM67118d4), ((C23132m) c28655q.m87161k(c28674u2)).f91456p), j7, AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110071d, AbstractC23138n.m67118d(AbstractC27386y.f110070c, c28655q)), ((C23132m) c28655q.m87161k(c28674u2)).f91456p), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110075h, AbstractC23138n.m67118d(AbstractC27386y.f110074g, c28655q)), ((C23132m) c28655q.m87161k(c28674u2)).f91456p), AbstractC17918w0.m51528p(C17919x.m51541c(f13, AbstractC23138n.m67118d(AbstractC27386y.f110078k, c28655q)), ((C23132m) c28655q.m87161k(c28674u2)).f91456p), AbstractC17918w0.m51528p(C17919x.m51541c(f13, AbstractC23138n.m67118d(AbstractC27386y.f110079l, c28655q)), ((C23132m) c28655q.m87161k(c28674u2)).f91456p), AbstractC17918w0.m51528p(C17919x.m51541c(AbstractC27386y.f110077j, AbstractC23138n.m67118d(AbstractC27386y.f110076i, c28655q)), ((C23132m) c28655q.m87161k(c28674u2)).f91456p));
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C21862n(function1, 18);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1123d.m3465a(zM80048c, (Function1) objM87133R, modifierM44101d, false, c23083d4, c28655q, 0, 88);
            c28655q.m87173q(true);
            function2 = function1;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(gVar.getSubtitle(), c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(gVar, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m65363Z(Function1 function1, boolean z4) {
        if (z4) {
            function1.invoke(InterfaceC25676a.b.k.f100996a);
        } else {
            function1.invoke(InterfaceC25676a.b.o.f101002a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m65365a0(C26816c.g gVar, Function1 function1, int i13, Composer composer, int i14) {
        m65362Y(gVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c0 */
    private static final void m65369c0(C26816c.f fVar, Function1 function1) {
        if (fVar.getPrimaryButton().getEnabled()) {
            function1.invoke(InterfaceC25676a.b.m.f101000a);
        } else {
            function1.invoke(InterfaceC25676a.a.C42010a.f100980a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    private static final void m65389w(C26816c.e eVar, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1495270537);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(eVar) : c28655q.m87157i(eVar) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22458d(10);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C21026a(interfaceC4339a4, 11);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(new C22971k(12, false, null), C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(eVar.getLabel(), c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                int i18 = i15;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                AbstractC27274q.g gVar = AbstractC27274q.g.f109144f;
                int whoopIcon = EnumC16313m0.TINY_INFORMATION.toWhoopIcon();
                EnumC39333f enumC39333f = EnumC39333f.GREY_L1;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = a.f88829w;
                    c28655q.m87172p0(objM87133R2);
                }
                float f13 = 4;
                AbstractC27242b1.m82092d(new C27270o(gVar, whoopIcon, enumC39333f, p745y81.Function1.m125323a((Function1) objM87133R2), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1), AbstractC1102d.m3419p(f13 * f13, c2314t), null, interfaceC4339a5, c28655q, C27270o.f109105k | 384 | ((i18 << 9) & 57344), 8);
                c28655q.m87173q(true);
                AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(eVar, i13, interfaceC4339a3, i14, 12);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C22458d(10);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C21026a(interfaceC4339a4, 11);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21026a(interfaceC4339a4, 11);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(new C22971k(12, false, null), C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            String strM21274h2 = AbstractC8693b.m21274h(eVar.getLabel(), c28655q, TextResource.$stable);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            int i110 = i15;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i19).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC27274q.g gVar2 = AbstractC27274q.g.f109144f;
            int whoopIcon2 = EnumC16313m0.TINY_INFORMATION.toWhoopIcon();
            EnumC39333f enumC39333f2 = EnumC39333f.GREY_L1;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = a.f88829w;
                c28655q.m87172p0(objM87133R2);
            }
            float f14 = 4;
            AbstractC27242b1.m82092d(new C27270o(gVar2, whoopIcon2, enumC39333f2, p745y81.Function1.m125323a((Function1) objM87133R2), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1), AbstractC1102d.m3419p(f14 * f14, c2314t2), null, interfaceC4339a6, c28655q, C27270o.f109105k | 384 | ((i110 << 9) & 57344), 8);
            c28655q.m87173q(true);
            AbstractC11266d.m30469w(1, 8, c2314t2, c28655q);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(eVar, i13, interfaceC4339a3, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m65390x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m65391y(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m65392z(C26816c.e eVar, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m65389w(eVar, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
