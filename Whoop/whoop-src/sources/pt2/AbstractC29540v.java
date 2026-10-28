package pt2;

import am2.C1008b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bm2.C3424a0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.AbstractC12250f;
import ep0.C13404j;
import ep1.C13421p;
import f41.C14063a;
import f41.C14074l;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kotlin.C2028s;
import ks2.AbstractC22822a;
import l83.C23454a0;
import l83.C23465k;
import mt2.AbstractC25946g;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26970r0;
import no0.C26984y0;
import nt2.AbstractC27131a;
import nw0.C27198e;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import oq1.C28119c;
import ot2.AbstractC28336e;
import ot2.AbstractC28344m;
import ot2.C28347p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p698au1.C2066k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.C28958a;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p725ot1.C28325a;
import p730qt2.AbstractC30593b;
import p730qt2.AbstractC30604j;
import p730qt2.AbstractC30609o;
import p730qt2.AbstractC30614t;
import p730qt2.C30607m;
import p730qt2.C30612r;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pc3.C29096r;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
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
import ys2.C39756c;

/* JADX INFO: renamed from: pt2.v */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001a\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001ac\u0010$\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\"H\u0007¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010&\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'¨\u0006-²\u0006\u000e\u0010(\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020)8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010,\u001a\u0004\u0018\u00010+8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lot2/m;", "viewState", "", "enableUnsavedChangesDialog", "enableEndPlanDialog", "Lkotlin/Function1;", "Lnt2/a;", "Ll83/a0;", "onViewEvent", "Lmt2/g;", "onNavigationEvent", "Y", "(Lot2/m;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lot2/m$i;", "f0", "(Lot2/m$i;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lot2/p;", "S", "(Landroidx/compose/ui/Modifier;Lot2/p;Landroidx/compose/runtime/Composer;II)V", "onEnableDialogChanged", "onEnableEndPlanDialog", "U", "(Lot2/m$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "O", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lys2/c;", "dialogViewState", "Lpt2/c0;", "dialogType", "", "planId", "Lkotlin/Function0;", "onDismiss", "K0", "(Lys2/c;Lpt2/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "T0", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "enableDialog", "Lv41/g;", "bottomSheetTopBar", "Lf41/a;", "behaviorBottomSheetState", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29540v {

    /* JADX INFO: renamed from: pt2.v$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeLandingScreenKt$HubAndSpokeScreen$4$1", m100430f = "HubAndSpokeLandingScreen.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120293w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f120294x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120294x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f120294x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120293w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f120293w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f120294x.invoke(AbstractC25946g.f.f102487a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt2.v$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeLandingScreenKt$HubAndSpokeScreen$6$1", m100430f = "HubAndSpokeLandingScreen.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120295w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f120296x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120296x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f120296x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120295w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f120295w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f120296x.invoke(AbstractC25946g.d.f102485a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt2.v$c */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeLandingScreenKt$Success$4$1$1", m100430f = "HubAndSpokeLandingScreen.kt", m100431l = {218}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120297w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f120298x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC35664f.a aVar, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120298x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f120298x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120297w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f120298x.getModalBottomSheetState();
                this.f120297w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pt2.v$d */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeLandingScreenKt$Success$6$3$2$1$3$1$3$1$1", m100430f = "HubAndSpokeLandingScreen.kt", m100431l = {357}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f120299E;

        /* JADX INFO: renamed from: w */
        int f120300w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Object f120301x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35664f.a f120302y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f120303z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120301x = obj;
            this.f120302y = aVar;
            this.f120303z = interfaceC28601c1;
            this.f120299E = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f120301x, this.f120302y, this.f120303z, this.f120299E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120300w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29540v.m90428k0(this.f120303z, (C14063a) this.f120301x);
                AbstractC29540v.m90424i0(this.f120299E, new C35666g(((C14063a) this.f120301x).getBottomSheetTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                C15199y3 c15199y3M112950a = this.f120302y.getModalBottomSheetState();
                this.f120300w = 1;
                if (c15199y3M112950a.m43225f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pt2.v$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f120304a;

        static {
            int[] iArr = new int[EnumC29521c0.values().length];
            try {
                iArr[EnumC29521c0.UNSAVED_CHANGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC29521c0.END_PLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120304a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m90361A0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m90440q0(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m90363B0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m90379J0(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m90365C0(InterfaceC28601c1 interfaceC28601c1) {
        m90440q0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m90367D0(Function1 function1, AbstractC28344m.i iVar, InterfaceC28601c1 interfaceC28601c1) {
        m90440q0(interfaceC28601c1, false);
        function1.invoke(new AbstractC27131a.g(iVar.getInitialScreen().getPlanId(), iVar.getInitialScreen().getIsCustomized(), false, iVar.getInitialScreen().m86000r(), iVar.getInitialScreen().m85984b(), iVar.getInitialScreen().m85983a(), iVar.getInitialScreen().getSource(), iVar.getInitialScreen().getPresetPlanCategory(), iVar.getInitialScreen().getTemplateId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m90369E0(Function1 function1, AbstractC28344m.i iVar, InterfaceC28601c1 interfaceC28601c1) {
        m90440q0(interfaceC28601c1, false);
        function1.invoke(new AbstractC27131a.g(iVar.getInitialScreen().getPlanId(), iVar.getInitialScreen().getIsCustomized(), true, iVar.getInitialScreen().m86000r(), iVar.getInitialScreen().m85984b(), iVar.getInitialScreen().m85983a(), iVar.getInitialScreen().getSource(), iVar.getInitialScreen().getPresetPlanCategory(), iVar.getInitialScreen().getTemplateId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m90371F0(AbstractC28344m.i iVar, boolean z4, boolean z13, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m90418f0(iVar, z4, z13, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G0 */
    private static final boolean m90373G0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: H0 */
    private static final void m90375H0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: I0 */
    private static final boolean m90377I0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: J0 */
    private static final void m90379J0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:116:0x023f  */
    /* JADX WARN: Code duplicated, block: B:119:0x024b  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x017c  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0187  */
    /* JADX WARN: Code duplicated, block: B:92:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a4  */
    /* JADX INFO: renamed from: K0 */
    public static final void m90381K0(C39756c dialogViewState, EnumC29521c0 dialogType, String planId, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v1;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        Function1 function10;
        Function1 function11;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(dialogViewState, "dialogViewState");
        AbstractC22676k.m65750j(dialogType, "dialogType");
        AbstractC22676k.m65750j(planId, "planId");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(104503509);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(dialogViewState) : c28655q.m87157i(dialogViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(dialogType.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(planId) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i19 = 131072;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C29529k(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C29529k(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C29096r(17);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    }
                    TextResource textResourceM127177d = dialogViewState.getTitle();
                    TextResource textResourceM127176c = dialogViewState.getDescription();
                    TextResource textResourceM127174a = dialogViewState.getButtonConfirmTitle();
                    TextResource textResourceM127175b = dialogViewState.getButtonRejectTitle();
                    C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    function9 = function8;
                    InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
                    C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i25).getTransparent(), c38072d.m121949b(c28655q, i25).getBrandWhite(), c38072d.m121949b(c28655q, i25).getTransparent(), c38072d.m121949b(c28655q, i25).getBrandWhite(), c28655q, 0, 0);
                    C13825t c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, c38072d.m121949b(c28655q, i25).getWhite20());
                    if ((458752 & i15) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R == c28676v1) {
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((57344 & i15) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z18 = z14 | z15;
                        if ((i15 & 7168) == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z18 | z16 | ((i15 & 896) == 256);
                        objM87133R2 = c28655q.m87133R();
                        if (!z17 || objM87133R2 == c28676v1) {
                            Function1 function12 = function7;
                            C27198e c27198e = new C27198e((Object) dialogType, function9, function12, (Object) planId, 6);
                            function10 = function9;
                            function11 = function12;
                            c28655q.m87172p0(c27198e);
                            objM87133R2 = c27198e;
                        } else {
                            function10 = function9;
                            function11 = function7;
                        }
                        int i26 = TextResource.$stable;
                        AbstractC21211n.m59497o(null, textResourceM127177d, textResourceM127176c, textResourceM127174a, true, null, c15077m1M43196a, c13825tM48880a, null, textResourceM127175b, null, false, false, null, null, false, 0, null, null, null, false, null, null, interfaceC4339a5, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i26 << 3) | 100687872 | (i26 << 6) | (i26 << 9) | (i26 << 27), 384, 0, 243264545);
                        c28655q = c28655q;
                        interfaceC4339a3 = interfaceC4339a4;
                        function5 = function11;
                        function6 = function10;
                    }
                    objM87133R = new C29526h(interfaceC4339a4, 2);
                    c28655q.m87172p0(objM87133R);
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z19 = z14 | z15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z19 | z16 | ((i15 & 896) == 256);
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        Function1 function13 = function7;
                        C27198e c27198e2 = new C27198e((Object) dialogType, function9, function13, (Object) planId, 6);
                        function10 = function9;
                        function11 = function13;
                        c28655q.m87172p0(c27198e2);
                        objM87133R2 = c27198e2;
                    } else {
                        Function1 function14 = function7;
                        C27198e c27198e3 = new C27198e((Object) dialogType, function9, function14, (Object) planId, 6);
                        function10 = function9;
                        function11 = function14;
                        c28655q.m87172p0(c27198e3);
                        objM87133R2 = c27198e3;
                    }
                    int i27 = TextResource.$stable;
                    AbstractC21211n.m59497o(null, textResourceM127177d, textResourceM127176c, textResourceM127174a, true, null, c15077m1M43196a, c13825tM48880a, null, textResourceM127175b, null, false, false, null, null, false, 0, null, null, null, false, null, null, interfaceC4339a6, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i27 << 3) | 100687872 | (i27 << 6) | (i27 << 9) | (i27 << 27), 384, 0, 243264545);
                    c28655q = c28655q;
                    interfaceC4339a3 = interfaceC4339a4;
                    function5 = function11;
                    function6 = function10;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a((Object) dialogViewState, (Object) dialogType, (Object) planId, (Object) function5, (Object) function6, interfaceC4339a3, i13, i14, 1);
                }
            }
            i15 |= 24576;
            function4 = function2;
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i19 = 131072;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C29529k(5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C29529k(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C29096r(17);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                }
                TextResource textResourceM127177d2 = dialogViewState.getTitle();
                TextResource textResourceM127176c2 = dialogViewState.getDescription();
                TextResource textResourceM127174a2 = dialogViewState.getButtonConfirmTitle();
                TextResource textResourceM127175b2 = dialogViewState.getButtonRejectTitle();
                C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                C38072d c38072d2 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                function9 = function8;
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a2;
                C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q, i28).getTransparent(), c38072d2.m121949b(c28655q, i28).getBrandWhite(), c38072d2.m121949b(c28655q, i28).getTransparent(), c38072d2.m121949b(c28655q, i28).getBrandWhite(), c28655q, 0, 0);
                C13825t c13825tM48880a2 = AbstractC17269i.m48880a(((float) 0.5d) * 4, c38072d2.m121949b(c28655q, i28).getWhite20());
                if ((458752 & i15) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    c28676v1 = c28676v0;
                    if (objM87133R == c28676v1) {
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z110 = z14 | z15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z110 | z16 | ((i15 & 896) == 256);
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        Function1 function15 = function7;
                        C27198e c27198e4 = new C27198e((Object) dialogType, function9, function15, (Object) planId, 6);
                        function10 = function9;
                        function11 = function15;
                        c28655q.m87172p0(c27198e4);
                        objM87133R2 = c27198e4;
                    } else {
                        Function1 function16 = function7;
                        C27198e c27198e5 = new C27198e((Object) dialogType, function9, function16, (Object) planId, 6);
                        function10 = function9;
                        function11 = function16;
                        c28655q.m87172p0(c27198e5);
                        objM87133R2 = c27198e5;
                    }
                    int i29 = TextResource.$stable;
                    AbstractC21211n.m59497o(null, textResourceM127177d2, textResourceM127176c2, textResourceM127174a2, true, null, c15077m1M43196a2, c13825tM48880a2, null, textResourceM127175b2, null, false, false, null, null, false, 0, null, null, null, false, null, null, interfaceC4339a8, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i29 << 3) | 100687872 | (i29 << 6) | (i29 << 9) | (i29 << 27), 384, 0, 243264545);
                    c28655q = c28655q;
                    interfaceC4339a3 = interfaceC4339a7;
                    function5 = function11;
                    function6 = function10;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R = new C29526h(interfaceC4339a7, 2);
                c28655q.m87172p0(objM87133R);
                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((57344 & i15) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z111 = z14 | z15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z111 | z16 | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    Function1 function17 = function7;
                    C27198e c27198e6 = new C27198e((Object) dialogType, function9, function17, (Object) planId, 6);
                    function10 = function9;
                    function11 = function17;
                    c28655q.m87172p0(c27198e6);
                    objM87133R2 = c27198e6;
                } else {
                    Function1 function18 = function7;
                    C27198e c27198e7 = new C27198e((Object) dialogType, function9, function18, (Object) planId, 6);
                    function10 = function9;
                    function11 = function18;
                    c28655q.m87172p0(c27198e7);
                    objM87133R2 = c27198e7;
                }
                int i210 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM127177d2, textResourceM127176c2, textResourceM127174a2, true, null, c15077m1M43196a2, c13825tM48880a2, null, textResourceM127175b2, null, false, false, null, null, false, 0, null, null, null, false, null, null, interfaceC4339a9, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i210 << 3) | 100687872 | (i210 << 6) | (i210 << 9) | (i210 << 27), 384, 0, 243264545);
                c28655q = c28655q;
                interfaceC4339a3 = interfaceC4339a7;
                function5 = function11;
                function6 = function10;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a((Object) dialogViewState, (Object) dialogType, (Object) planId, (Object) function5, (Object) function6, interfaceC4339a3, i13, i14, 1);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i19 = 131072;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C29529k(5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C29529k(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C29096r(17);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                }
                TextResource textResourceM127177d3 = dialogViewState.getTitle();
                TextResource textResourceM127176c3 = dialogViewState.getDescription();
                TextResource textResourceM127174a3 = dialogViewState.getButtonConfirmTitle();
                TextResource textResourceM127175b3 = dialogViewState.getButtonRejectTitle();
                C22976l1 c22976l3 = AbstractC15166v0.f56891a;
                C38072d c38072d3 = C38072d.f163053a;
                int i211 = C38072d.f163054b;
                function9 = function8;
                InterfaceC4339a interfaceC4339a10 = interfaceC4339a2;
                C15077m1 c15077m1M43196a3 = AbstractC15166v0.m43196a(c38072d3.m121949b(c28655q, i211).getTransparent(), c38072d3.m121949b(c28655q, i211).getBrandWhite(), c38072d3.m121949b(c28655q, i211).getTransparent(), c38072d3.m121949b(c28655q, i211).getBrandWhite(), c28655q, 0, 0);
                C13825t c13825tM48880a3 = AbstractC17269i.m48880a(((float) 0.5d) * 4, c38072d3.m121949b(c28655q, i211).getWhite20());
                if ((458752 & i15) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    c28676v1 = c28676v0;
                    if (objM87133R == c28676v1) {
                    }
                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z112 = z14 | z15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z112 | z16 | ((i15 & 896) == 256);
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        Function1 function19 = function7;
                        C27198e c27198e8 = new C27198e((Object) dialogType, function9, function19, (Object) planId, 6);
                        function10 = function9;
                        function11 = function19;
                        c28655q.m87172p0(c27198e8);
                        objM87133R2 = c27198e8;
                    } else {
                        Function1 function110 = function7;
                        C27198e c27198e9 = new C27198e((Object) dialogType, function9, function110, (Object) planId, 6);
                        function10 = function9;
                        function11 = function110;
                        c28655q.m87172p0(c27198e9);
                        objM87133R2 = c27198e9;
                    }
                    int i212 = TextResource.$stable;
                    AbstractC21211n.m59497o(null, textResourceM127177d3, textResourceM127176c3, textResourceM127174a3, true, null, c15077m1M43196a3, c13825tM48880a3, null, textResourceM127175b3, null, false, false, null, null, false, 0, null, null, null, false, null, null, interfaceC4339a11, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i212 << 3) | 100687872 | (i212 << 6) | (i212 << 9) | (i212 << 27), 384, 0, 243264545);
                    c28655q = c28655q;
                    interfaceC4339a3 = interfaceC4339a10;
                    function5 = function11;
                    function6 = function10;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R = new C29526h(interfaceC4339a10, 2);
                c28655q.m87172p0(objM87133R);
                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((57344 & i15) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z113 = z14 | z15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z113 | z16 | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    Function1 function111 = function7;
                    C27198e c27198e10 = new C27198e((Object) dialogType, function9, function111, (Object) planId, 6);
                    function10 = function9;
                    function11 = function111;
                    c28655q.m87172p0(c27198e10);
                    objM87133R2 = c27198e10;
                } else {
                    Function1 function112 = function7;
                    C27198e c27198e11 = new C27198e((Object) dialogType, function9, function112, (Object) planId, 6);
                    function10 = function9;
                    function11 = function112;
                    c28655q.m87172p0(c27198e11);
                    objM87133R2 = c27198e11;
                }
                int i213 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM127177d3, textResourceM127176c3, textResourceM127174a3, true, null, c15077m1M43196a3, c13825tM48880a3, null, textResourceM127175b3, null, false, false, null, null, false, 0, null, null, null, false, null, null, interfaceC4339a12, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i213 << 3) | 100687872 | (i213 << 6) | (i213 << 9) | (i213 << 27), 384, 0, 243264545);
                c28655q = c28655q;
                interfaceC4339a3 = interfaceC4339a10;
                function5 = function11;
                function6 = function10;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a((Object) dialogViewState, (Object) dialogType, (Object) planId, (Object) function5, (Object) function6, interfaceC4339a3, i13, i14, 1);
            }
        }
        i15 |= 24576;
        function4 = function2;
        i18 = i14 & 32;
        if (i18 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i19 = 131072;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
        }
        if ((i15 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C29529k(5);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C29529k(6);
                    c28655q.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C29096r(17);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            }
            TextResource textResourceM127177d4 = dialogViewState.getTitle();
            TextResource textResourceM127176c4 = dialogViewState.getDescription();
            TextResource textResourceM127174a4 = dialogViewState.getButtonConfirmTitle();
            TextResource textResourceM127175b4 = dialogViewState.getButtonRejectTitle();
            C22976l1 c22976l4 = AbstractC15166v0.f56891a;
            C38072d c38072d4 = C38072d.f163053a;
            int i214 = C38072d.f163054b;
            function9 = function8;
            InterfaceC4339a interfaceC4339a13 = interfaceC4339a2;
            C15077m1 c15077m1M43196a4 = AbstractC15166v0.m43196a(c38072d4.m121949b(c28655q, i214).getTransparent(), c38072d4.m121949b(c28655q, i214).getBrandWhite(), c38072d4.m121949b(c28655q, i214).getTransparent(), c38072d4.m121949b(c28655q, i214).getBrandWhite(), c28655q, 0, 0);
            C13825t c13825tM48880a4 = AbstractC17269i.m48880a(((float) 0.5d) * 4, c38072d4.m121949b(c28655q, i214).getWhite20());
            if ((458752 & i15) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                c28676v1 = c28676v0;
                if (objM87133R == c28676v1) {
                }
                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((57344 & i15) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z114 = z14 | z15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z114 | z16 | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    Function1 function113 = function7;
                    C27198e c27198e12 = new C27198e((Object) dialogType, function9, function113, (Object) planId, 6);
                    function10 = function9;
                    function11 = function113;
                    c28655q.m87172p0(c27198e12);
                    objM87133R2 = c27198e12;
                } else {
                    Function1 function114 = function7;
                    C27198e c27198e13 = new C27198e((Object) dialogType, function9, function114, (Object) planId, 6);
                    function10 = function9;
                    function11 = function114;
                    c28655q.m87172p0(c27198e13);
                    objM87133R2 = c27198e13;
                }
                int i215 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM127177d4, textResourceM127176c4, textResourceM127174a4, true, null, c15077m1M43196a4, c13825tM48880a4, null, textResourceM127175b4, null, false, false, null, null, false, 0, null, null, null, false, null, null, interfaceC4339a14, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i215 << 3) | 100687872 | (i215 << 6) | (i215 << 9) | (i215 << 27), 384, 0, 243264545);
                c28655q = c28655q;
                interfaceC4339a3 = interfaceC4339a13;
                function5 = function11;
                function6 = function10;
            } else {
                c28676v1 = c28676v0;
            }
            objM87133R = new C29526h(interfaceC4339a13, 2);
            c28655q.m87172p0(objM87133R);
            InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R;
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((57344 & i15) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z115 = z14 | z15;
            if ((i15 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z115 | z16 | ((i15 & 896) == 256);
            objM87133R2 = c28655q.m87133R();
            if (z17) {
                Function1 function115 = function7;
                C27198e c27198e14 = new C27198e((Object) dialogType, function9, function115, (Object) planId, 6);
                function10 = function9;
                function11 = function115;
                c28655q.m87172p0(c27198e14);
                objM87133R2 = c27198e14;
            } else {
                Function1 function116 = function7;
                C27198e c27198e15 = new C27198e((Object) dialogType, function9, function116, (Object) planId, 6);
                function10 = function9;
                function11 = function116;
                c28655q.m87172p0(c27198e15);
                objM87133R2 = c27198e15;
            }
            int i216 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM127177d4, textResourceM127176c4, textResourceM127174a4, true, null, c15077m1M43196a4, c13825tM48880a4, null, textResourceM127175b4, null, false, false, null, null, false, 0, null, null, null, false, null, null, interfaceC4339a15, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i216 << 3) | 100687872 | (i216 << 6) | (i216 << 9) | (i216 << 27), 384, 0, 243264545);
            c28655q = c28655q;
            interfaceC4339a3 = interfaceC4339a13;
            function5 = function11;
            function6 = function10;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a((Object) dialogViewState, (Object) dialogType, (Object) planId, (Object) function5, (Object) function6, interfaceC4339a3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m90383L0(AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m90385M0(AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23454a0 m90387N0() {
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public static final void m90388O(Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        int i15;
        Function1 function3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1785448537);
        int i16 = i14 & 1;
        int i17 = 2;
        if (i16 != 0) {
            i15 = i13 | 6;
            function2 = function1;
        } else if ((i13 & 6) == 0) {
            function2 = function1;
            i15 = (c28655q.m87157i(function2) ? 4 : 2) | i13;
        } else {
            function2 = function1;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C29529k(4);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function2;
            }
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC22822a.f89935g, null, i17, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC22822a.f89932d, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC22822a.f89933e, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0);
            boolean z4 = (i15 & 14) == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29522d(function3, 1);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            int i18 = AbstractC33208p0.b.f138467h;
            int i19 = TextResource.C8688b.f25889c;
            AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, false, false, null, null, null, false, false, c28655q, i18 | (i19 << 3) | (i19 << 9), 0, 4068);
            function2 = function3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2066k(i13, i14, 4, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m90389O0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m90390P(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m90391P0(EnumC29521c0 enumC29521c0, Function1 function1, Function1 function2, String str) {
        int i13 = e.f120304a[enumC29521c0.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            function1.invoke(new AbstractC25946g.b(null, i14, 0 == true ? 1 : 0));
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function2.invoke(new AbstractC27131a.b(str));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m90392Q(Function1 function1) {
        C23454a0 c23454a0 = C23454a0.f92919a;
        function1.invoke(c23454a0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C23454a0 m90393Q0(C39756c c39756c, EnumC29521c0 enumC29521c0, String str, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m90381K0(c39756c, enumC29521c0, str, function1, function2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m90394R(Function1 function1, int i13, int i14, Composer composer, int i15) {
        m90388O(function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    public static final void m90396S(Modifier modifier, C28347p viewState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1444157431);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            if (AbstractC8693b.m21270d(viewState.getExplanationTitle())) {
                c28655q2.m87150e0(206790973);
                float f13 = 2 * 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                float f14 = 1;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC15751g.m44456i(f14, AbstractC1102d.m3409f(1.0f, modifier4), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f13)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
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
                TextResource textResourceM85992j = viewState.getExplanationTitle();
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM85992j, c28655q2, i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q2, i18).getBrandWhite();
                C2886a c2886aM8420a = c38072d.m121952e(c28655q2, i18).getB1();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, i19, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f14 * 4, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getExplanation(), c28655q2, i17), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 0, i19, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(207603979);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier3, viewState, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m90398T(Modifier modifier, C28347p c28347p, int i13, int i14, Composer composer, int i15) {
        m90396S(modifier, c28347p, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T0 */
    private static final Modifier m90399T0(Modifier modifier) {
        return AbstractC1125a.m3478a(modifier, new C29529k(7));
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: U */
    private static final void m90400U(final AbstractC28344m.i iVar, final Function1 function1, Function1 function2, final Function1 function3, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        final int i15;
        float f13;
        C28655q c28655q2;
        final Function1 function4 = function2;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-744243687);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87157i(iVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87157i(function4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q3.m87157i(function3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            float f14 = 8;
            float f15 = 2 * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66722k(c2314t), 0.0f, f15, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            float f16 = f14 * ((float) 2.5d);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2);
            TextResource textResourceM85986d = iVar.getInitialScreen().getButtonTitle();
            boolean zM85985c = iVar.getInitialScreen().getButtonEnabled();
            int i16 = i14 & 7168;
            boolean zM87157i = c28655q3.m87157i(iVar) | ((i14 & 112) == 32) | (i16 == 2048);
            Object objM87133R = c28655q3.m87133R();
            Object obj = C28635l.f115821a;
            if (zM87157i || objM87133R == obj) {
                i15 = 0;
                objM87133R = new InterfaceC4339a() { // from class: pt2.t
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC29540v.m90402V(iVar, function1, function3);
                            default:
                                return AbstractC29540v.m90403W(iVar, function1, function3);
                        }
                    }
                };
                c28655q3.m87172p0(objM87133R);
            } else {
                i15 = 0;
            }
            int i17 = (TextResource.$stable << 18) | 6;
            boolean z4 = i15;
            AbstractC27292z.m82343j(modifierM3396r, zM85985c, false, null, null, null, textResourceM85986d, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q3, i17, 0, 8124);
            C28655q c28655q4 = c28655q3;
            TextResource textResourceM85989g = iVar.getInitialScreen().getEndPlanButtonText();
            if (textResourceM85989g == null) {
                c28655q4.m87150e0(-1156203429);
                c28655q4.m87173q(z4);
                function4 = function2;
                f13 = f15;
                c28655q2 = c28655q4;
            } else {
                AbstractC31061c.m95623C(c28655q4, -1156203428, c2314t, f15, c28655q4);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2);
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q4, i18).getTransparent(), c38072d.m121949b(c28655q4, i18).getBrandWhite(), 0L, 0L, c28655q4, 0, 12);
                C13825t c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, c38072d.m121949b(c28655q4, i18).getWhite20());
                boolean zM87157i2 = ((i14 & 896) == 256) | c28655q4.m87157i(iVar) | (i16 == 2048);
                Object objM87133R2 = c28655q4.m87133R();
                if (zM87157i2 || objM87133R2 == obj) {
                    function4 = function2;
                    final int i19 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: pt2.t
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC29540v.m90402V(iVar, function4, function3);
                                default:
                                    return AbstractC29540v.m90403W(iVar, function4, function3);
                            }
                        }
                    };
                    c28655q4.m87172p0(objM87133R2);
                } else {
                    function4 = function2;
                }
                AbstractC27292z.m82343j(modifierM3396r2, false, false, null, null, null, textResourceM85989g, c15077m1M43196a, null, c13825tM48880a, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q4, i17, 0, 7486);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                f13 = f15;
                c28655q2 = c28655q5;
            }
            AbstractC25012a.m73389v(c2314t, f13, c28655q2, true);
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28325a(iVar, function1, function4, function3, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m90401U0(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51490h(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4286544383L))), new C23465k(Float.valueOf(0.5f), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4284072958L)))), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.0f, AbstractC17918w0.m51517e(4284072958L))))}, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 1.2f * Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.3f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m90402V(AbstractC28344m.i iVar, Function1 function1, Function1 function2) {
        if (!iVar.getInitialScreen().getMigrateSmartAlarm() || iVar.getInitialScreen().getCustomizePlanDialogViewState() == null) {
            function2.invoke(new AbstractC27131a.g(iVar.getInitialScreen().getPlanId(), iVar.getInitialScreen().getIsCustomized(), iVar.getInitialScreen().getMigrateSmartAlarm(), iVar.getInitialScreen().m86000r(), iVar.getInitialScreen().m85984b(), iVar.getInitialScreen().m85983a(), iVar.getInitialScreen().getSource(), iVar.getInitialScreen().getPresetPlanCategory(), iVar.getInitialScreen().getTemplateId()));
        } else {
            function1.invoke(Boolean.TRUE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m90403W(AbstractC28344m.i iVar, Function1 function1, Function1 function2) {
        if (iVar.getInitialScreen().getEndPlanDialogViewState() != null) {
            function1.invoke(Boolean.TRUE);
        } else {
            function2.invoke(new AbstractC27131a.b(iVar.getInitialScreen().getPlanId()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m90404X(AbstractC28344m.i iVar, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m90400U(iVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0182  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x0214  */
    /* JADX WARN: Code duplicated, block: B:110:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0234  */
    /* JADX WARN: Code duplicated, block: B:115:0x023d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0247  */
    /* JADX WARN: Code duplicated, block: B:118:0x024a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0251  */
    /* JADX WARN: Code duplicated, block: B:125:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x025d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0272  */
    /* JADX WARN: Code duplicated, block: B:131:0x027b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0288  */
    /* JADX WARN: Code duplicated, block: B:134:0x0290  */
    /* JADX WARN: Code duplicated, block: B:137:0x02de  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:145:0x0303  */
    /* JADX WARN: Code duplicated, block: B:147:0x030d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0310  */
    /* JADX WARN: Code duplicated, block: B:152:0x0317  */
    /* JADX WARN: Code duplicated, block: B:155:0x0321 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x0327  */
    /* JADX WARN: Code duplicated, block: B:161:0x0342  */
    /* JADX WARN: Code duplicated, block: B:163:0x034b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0359  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:93:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0167  */
    /* JADX WARN: Code duplicated, block: B:99:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static final void m90405Y(final AbstractC28344m viewState, boolean z4, boolean z13, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        int i17;
        int i18;
        Function1 function3;
        int i19;
        int i24;
        Function1 function4;
        int i25;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        boolean z19;
        boolean z24;
        C28676v0 c28676v0;
        int i26;
        final Function1 function7;
        Function1 function8;
        boolean z25;
        boolean z26;
        final Function1 function9;
        List list;
        int i27;
        Function1 function10;
        boolean z27;
        boolean z28;
        Object objM87133R;
        Object objM87133R2;
        boolean z29;
        boolean z34;
        Object objM87133R3;
        Object objM87133R4;
        Function1 function11;
        Function1 function12;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object[] objArr;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1347168866);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function3 = function1;
                        if (c28655q.m87157i(function3)) {
                            i19 = 2048;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            function4 = function2;
                            if (c28655q.m87157i(function4)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        z15 = true;
                        if ((i15 & 9363) != 9362) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z16)) {
                            if (i28 != 0) {
                                z19 = false;
                            } else {
                                z19 = z14;
                            }
                            if (i16 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i18 != 0) {
                                objM87133R7 = c28655q.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C29529k(8);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                function7 = (Function1) objM87133R7;
                                i26 = 2048;
                            } else {
                                i26 = 2048;
                                function7 = function3;
                            }
                            if (i24 != 0) {
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C29529k(9);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                function8 = (Function1) objM87133R6;
                            } else {
                                function8 = function4;
                            }
                            if (viewState instanceof AbstractC28344m.i) {
                                c28655q.m87150e0(1333620198);
                                m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                                z25 = z19;
                                z26 = z24;
                                c28655q.m87173q(false);
                            } else {
                                z25 = z19;
                                z26 = z24;
                                if (viewState instanceof AbstractC28344m.e) {
                                    c28655q.m87150e0(1333973226);
                                    function11 = function7;
                                    function12 = function8;
                                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    function9 = function7;
                                    if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                        c28655q.m87150e0(1334220885);
                                        z15 = (i15 & 7168) == i26;
                                        objM87133R5 = c28655q.m87133R();
                                        if (z15 || objM87133R5 == c28676v0) {
                                            objM87133R5 = new C29520c(function9, 4);
                                            c28655q.m87172p0(objM87133R5);
                                        }
                                        m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                        c28655q.m87150e0(1844158453);
                                        function11 = function9;
                                        function12 = function8;
                                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                        c28655q = c28655q;
                                        c28655q.m87173q(false);
                                    } else {
                                        list = null;
                                        objArr = 0;
                                        if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                            c28655q.m87150e0(1334502582);
                                            function10 = function8;
                                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                            Boolean bool = Boolean.TRUE;
                                            if ((i15 & 57344) != 16384) {
                                                c28655q = c28655q;
                                                z15 = false;
                                            }
                                            c28655q = c28655q;
                                            objM87133R4 = c28655q.m87133R();
                                            if (z15 || objM87133R4 == c28676v0) {
                                                objM87133R4 = new a(function10, null);
                                                c28655q.m87172p0(objM87133R4);
                                            }
                                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool);
                                            c28655q.m87173q(false);
                                            function7 = function9;
                                        } else {
                                            i27 = i26;
                                            function10 = function8;
                                            if (viewState instanceof AbstractC28344m.f) {
                                                c28655q.m87150e0(1334853905);
                                                if ((i15 & 7168) == i27) {
                                                    z29 = true;
                                                } else {
                                                    z29 = false;
                                                }
                                                z34 = z29 | ((i15 & 14) == 4);
                                                objM87133R3 = c28655q.m87133R();
                                                if (z34 || objM87133R3 == c28676v0) {
                                                    final int i29 = 0;
                                                    objM87133R3 = new Function1() { // from class: pt2.u
                                                        @Override // p715kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            switch (i29) {
                                                                case 0:
                                                                    return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                                default:
                                                                    return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                            }
                                                        }
                                                    };
                                                    c28655q.m87172p0(objM87133R3);
                                                }
                                                m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                                c28655q.m87173q(false);
                                            } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                                c28655q.m87150e0(1335481655);
                                                AbstractC30604j.m93897f(c28655q, 0);
                                                c28655q.m87173q(false);
                                            } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                                c28655q.m87150e0(1335591147);
                                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                                Boolean bool2 = Boolean.TRUE;
                                                if ((i15 & 57344) != 16384) {
                                                    c28655q = c28655q;
                                                    z15 = false;
                                                }
                                                c28655q = c28655q;
                                                objM87133R2 = c28655q.m87133R();
                                                if (z15 || objM87133R2 == c28676v0) {
                                                    objM87133R2 = new b(function10, null);
                                                    c28655q.m87172p0(objM87133R2);
                                                }
                                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool2);
                                                c28655q.m87173q(false);
                                                function7 = function9;
                                            } else {
                                                if (viewState instanceof AbstractC28344m.a) {
                                                    throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                                }
                                                c28655q.m87150e0(1336012313);
                                                if ((i15 & 7168) == i27) {
                                                    z27 = true;
                                                } else {
                                                    z27 = false;
                                                }
                                                z28 = z27 | ((i15 & 14) == 4);
                                                objM87133R = c28655q.m87133R();
                                                if (!z28 || objM87133R == c28676v0) {
                                                    final int i34 = 1;
                                                    function7 = function9;
                                                    objM87133R = new Function1() { // from class: pt2.u
                                                        @Override // p715kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            switch (i34) {
                                                                case 0:
                                                                    return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                                default:
                                                                    return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                            }
                                                        }
                                                    };
                                                    c28655q.m87172p0(objM87133R);
                                                } else {
                                                    function7 = function9;
                                                }
                                                m90388O((Function1) objM87133R, c28655q, 0, 0);
                                                c28655q.m87173q(false);
                                            }
                                            function7 = function9;
                                        }
                                    }
                                    boolean z35 = z25;
                                    function6 = function10;
                                    z18 = z35;
                                    function5 = function7;
                                    z17 = z26;
                                }
                                function7 = function11;
                                function10 = function12;
                                boolean z36 = z25;
                                function6 = function10;
                                z18 = z36;
                                function5 = function7;
                                z17 = z26;
                            }
                            function10 = function8;
                            boolean z37 = z25;
                            function6 = function10;
                            z18 = z37;
                            function5 = function7;
                            z17 = z26;
                        } else {
                            c28655q.m87138X();
                            z17 = z13;
                            z18 = z14;
                            function5 = function3;
                            function6 = function4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                        }
                    }
                    i15 |= 24576;
                    function4 = function2;
                    z15 = true;
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i28 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29529k(8);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function7 = (Function1) objM87133R7;
                            i26 = 2048;
                        } else {
                            i26 = 2048;
                            function7 = function3;
                        }
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C29529k(9);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function8 = (Function1) objM87133R6;
                        } else {
                            function8 = function4;
                        }
                        if (viewState instanceof AbstractC28344m.i) {
                            c28655q.m87150e0(1333620198);
                            m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                            z25 = z19;
                            z26 = z24;
                            c28655q.m87173q(false);
                        } else {
                            z25 = z19;
                            z26 = z24;
                            if (viewState instanceof AbstractC28344m.e) {
                                c28655q.m87150e0(1333973226);
                                function11 = function7;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function9 = function7;
                                if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                    c28655q.m87150e0(1334220885);
                                    if ((i15 & 7168) == i26) {
                                    }
                                    objM87133R5 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R5 = new C29520c(function9, 4);
                                        c28655q.m87172p0(objM87133R5);
                                    } else {
                                        objM87133R5 = new C29520c(function9, 4);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                    c28655q.m87150e0(1844158453);
                                    function11 = function9;
                                    function12 = function8;
                                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    list = null;
                                    objArr = 0;
                                    if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                        c28655q.m87150e0(1334502582);
                                        function10 = function8;
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool3 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R4 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R4 = new a(function10, null);
                                            c28655q.m87172p0(objM87133R4);
                                        } else {
                                            objM87133R4 = new a(function10, null);
                                            c28655q.m87172p0(objM87133R4);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool3);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        i27 = i26;
                                        function10 = function8;
                                        if (viewState instanceof AbstractC28344m.f) {
                                            c28655q.m87150e0(1334853905);
                                            if ((i15 & 7168) == i27) {
                                                z29 = true;
                                            } else {
                                                z29 = false;
                                            }
                                            z34 = z29 | ((i15 & 14) == 4);
                                            objM87133R3 = c28655q.m87133R();
                                            if (z34) {
                                                final int i210 = 0;
                                                objM87133R3 = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i210) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R3);
                                            } else {
                                                final int i211 = 0;
                                                objM87133R3 = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i211) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R3);
                                            }
                                            m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                            c28655q.m87173q(false);
                                        } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                            c28655q.m87150e0(1335481655);
                                            AbstractC30604j.m93897f(c28655q, 0);
                                            c28655q.m87173q(false);
                                        } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                            c28655q.m87150e0(1335591147);
                                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                            Boolean bool4 = Boolean.TRUE;
                                            if ((i15 & 57344) != 16384) {
                                                c28655q = c28655q;
                                                z15 = false;
                                            }
                                            c28655q = c28655q;
                                            objM87133R2 = c28655q.m87133R();
                                            if (z15) {
                                                objM87133R2 = new b(function10, null);
                                                c28655q.m87172p0(objM87133R2);
                                            } else {
                                                objM87133R2 = new b(function10, null);
                                                c28655q.m87172p0(objM87133R2);
                                            }
                                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool4);
                                            c28655q.m87173q(false);
                                            function7 = function9;
                                        } else {
                                            if (viewState instanceof AbstractC28344m.a) {
                                                throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                            }
                                            c28655q.m87150e0(1336012313);
                                            if ((i15 & 7168) == i27) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            z28 = z27 | ((i15 & 14) == 4);
                                            objM87133R = c28655q.m87133R();
                                            if (z28) {
                                                final int i35 = 1;
                                                function7 = function9;
                                                objM87133R = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i35) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R);
                                            } else {
                                                final int i36 = 1;
                                                function7 = function9;
                                                objM87133R = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i36) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R);
                                            }
                                            m90388O((Function1) objM87133R, c28655q, 0, 0);
                                            c28655q.m87173q(false);
                                        }
                                        function7 = function9;
                                    }
                                }
                                boolean z38 = z25;
                                function6 = function10;
                                z18 = z38;
                                function5 = function7;
                                z17 = z26;
                            }
                            function7 = function11;
                            function10 = function12;
                            boolean z39 = z25;
                            function6 = function10;
                            z18 = z39;
                            function5 = function7;
                            z17 = z26;
                        }
                        function10 = function8;
                        boolean z310 = z25;
                        function6 = function10;
                        z18 = z310;
                        function5 = function7;
                        z17 = z26;
                    } else {
                        c28655q.m87138X();
                        z17 = z13;
                        z18 = z14;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                    }
                }
                i15 |= 3072;
                function3 = function1;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    z15 = true;
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i28 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29529k(8);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function7 = (Function1) objM87133R7;
                            i26 = 2048;
                        } else {
                            i26 = 2048;
                            function7 = function3;
                        }
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C29529k(9);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function8 = (Function1) objM87133R6;
                        } else {
                            function8 = function4;
                        }
                        if (viewState instanceof AbstractC28344m.i) {
                            c28655q.m87150e0(1333620198);
                            m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                            z25 = z19;
                            z26 = z24;
                            c28655q.m87173q(false);
                        } else {
                            z25 = z19;
                            z26 = z24;
                            if (viewState instanceof AbstractC28344m.e) {
                                c28655q.m87150e0(1333973226);
                                function11 = function7;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function9 = function7;
                                if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                    c28655q.m87150e0(1334220885);
                                    if ((i15 & 7168) == i26) {
                                    }
                                    objM87133R5 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R5 = new C29520c(function9, 4);
                                        c28655q.m87172p0(objM87133R5);
                                    } else {
                                        objM87133R5 = new C29520c(function9, 4);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                    c28655q.m87150e0(1844158453);
                                    function11 = function9;
                                    function12 = function8;
                                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    list = null;
                                    objArr = 0;
                                    if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                        c28655q.m87150e0(1334502582);
                                        function10 = function8;
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool5 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R4 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R4 = new a(function10, null);
                                            c28655q.m87172p0(objM87133R4);
                                        } else {
                                            objM87133R4 = new a(function10, null);
                                            c28655q.m87172p0(objM87133R4);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool5);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        i27 = i26;
                                        function10 = function8;
                                        if (viewState instanceof AbstractC28344m.f) {
                                            c28655q.m87150e0(1334853905);
                                            if ((i15 & 7168) == i27) {
                                                z29 = true;
                                            } else {
                                                z29 = false;
                                            }
                                            z34 = z29 | ((i15 & 14) == 4);
                                            objM87133R3 = c28655q.m87133R();
                                            if (z34) {
                                                final int i212 = 0;
                                                objM87133R3 = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i212) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R3);
                                            } else {
                                                final int i213 = 0;
                                                objM87133R3 = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i213) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R3);
                                            }
                                            m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                            c28655q.m87173q(false);
                                        } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                            c28655q.m87150e0(1335481655);
                                            AbstractC30604j.m93897f(c28655q, 0);
                                            c28655q.m87173q(false);
                                        } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                            c28655q.m87150e0(1335591147);
                                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                            Boolean bool6 = Boolean.TRUE;
                                            if ((i15 & 57344) != 16384) {
                                                c28655q = c28655q;
                                                z15 = false;
                                            }
                                            c28655q = c28655q;
                                            objM87133R2 = c28655q.m87133R();
                                            if (z15) {
                                                objM87133R2 = new b(function10, null);
                                                c28655q.m87172p0(objM87133R2);
                                            } else {
                                                objM87133R2 = new b(function10, null);
                                                c28655q.m87172p0(objM87133R2);
                                            }
                                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool6);
                                            c28655q.m87173q(false);
                                            function7 = function9;
                                        } else {
                                            if (viewState instanceof AbstractC28344m.a) {
                                                throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                            }
                                            c28655q.m87150e0(1336012313);
                                            if ((i15 & 7168) == i27) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            z28 = z27 | ((i15 & 14) == 4);
                                            objM87133R = c28655q.m87133R();
                                            if (z28) {
                                                final int i37 = 1;
                                                function7 = function9;
                                                objM87133R = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i37) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R);
                                            } else {
                                                final int i38 = 1;
                                                function7 = function9;
                                                objM87133R = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i38) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R);
                                            }
                                            m90388O((Function1) objM87133R, c28655q, 0, 0);
                                            c28655q.m87173q(false);
                                        }
                                        function7 = function9;
                                    }
                                }
                                boolean z311 = z25;
                                function6 = function10;
                                z18 = z311;
                                function5 = function7;
                                z17 = z26;
                            }
                            function7 = function11;
                            function10 = function12;
                            boolean z312 = z25;
                            function6 = function10;
                            z18 = z312;
                            function5 = function7;
                            z17 = z26;
                        }
                        function10 = function8;
                        boolean z313 = z25;
                        function6 = function10;
                        z18 = z313;
                        function5 = function7;
                        z17 = z26;
                    } else {
                        c28655q.m87138X();
                        z17 = z13;
                        z18 = z14;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                    }
                }
                i15 |= 24576;
                function4 = function2;
                z15 = true;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i28 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29529k(8);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                        i26 = 2048;
                    } else {
                        i26 = 2048;
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29529k(9);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    if (viewState instanceof AbstractC28344m.i) {
                        c28655q.m87150e0(1333620198);
                        m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                        z25 = z19;
                        z26 = z24;
                        c28655q.m87173q(false);
                    } else {
                        z25 = z19;
                        z26 = z24;
                        if (viewState instanceof AbstractC28344m.e) {
                            c28655q.m87150e0(1333973226);
                            function11 = function7;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function9 = function7;
                            if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                c28655q.m87150e0(1334220885);
                                if ((i15 & 7168) == i26) {
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                c28655q.m87150e0(1844158453);
                                function11 = function9;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                list = null;
                                objArr = 0;
                                if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                    c28655q.m87150e0(1334502582);
                                    function10 = function8;
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool7 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool7);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    i27 = i26;
                                    function10 = function8;
                                    if (viewState instanceof AbstractC28344m.f) {
                                        c28655q.m87150e0(1334853905);
                                        if ((i15 & 7168) == i27) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        z34 = z29 | ((i15 & 14) == 4);
                                        objM87133R3 = c28655q.m87133R();
                                        if (z34) {
                                            final int i214 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i214) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        } else {
                                            final int i215 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i215) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        }
                                        m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                        c28655q.m87150e0(1335481655);
                                        AbstractC30604j.m93897f(c28655q, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                        c28655q.m87150e0(1335591147);
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool8 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R2 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        } else {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool8);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        if (viewState instanceof AbstractC28344m.a) {
                                            throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                        }
                                        c28655q.m87150e0(1336012313);
                                        if ((i15 & 7168) == i27) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        z28 = z27 | ((i15 & 14) == 4);
                                        objM87133R = c28655q.m87133R();
                                        if (z28) {
                                            final int i39 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i39) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        } else {
                                            final int i310 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i310) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        }
                                        m90388O((Function1) objM87133R, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    }
                                    function7 = function9;
                                }
                            }
                            boolean z314 = z25;
                            function6 = function10;
                            z18 = z314;
                            function5 = function7;
                            z17 = z26;
                        }
                        function7 = function11;
                        function10 = function12;
                        boolean z315 = z25;
                        function6 = function10;
                        z18 = z315;
                        function5 = function7;
                        z17 = z26;
                    }
                    function10 = function8;
                    boolean z316 = z25;
                    function6 = function10;
                    z18 = z316;
                    function5 = function7;
                    z17 = z26;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                }
            }
            i15 |= 384;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    z15 = true;
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i28 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29529k(8);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function7 = (Function1) objM87133R7;
                            i26 = 2048;
                        } else {
                            i26 = 2048;
                            function7 = function3;
                        }
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C29529k(9);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function8 = (Function1) objM87133R6;
                        } else {
                            function8 = function4;
                        }
                        if (viewState instanceof AbstractC28344m.i) {
                            c28655q.m87150e0(1333620198);
                            m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                            z25 = z19;
                            z26 = z24;
                            c28655q.m87173q(false);
                        } else {
                            z25 = z19;
                            z26 = z24;
                            if (viewState instanceof AbstractC28344m.e) {
                                c28655q.m87150e0(1333973226);
                                function11 = function7;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function9 = function7;
                                if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                    c28655q.m87150e0(1334220885);
                                    if ((i15 & 7168) == i26) {
                                    }
                                    objM87133R5 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R5 = new C29520c(function9, 4);
                                        c28655q.m87172p0(objM87133R5);
                                    } else {
                                        objM87133R5 = new C29520c(function9, 4);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                    c28655q.m87150e0(1844158453);
                                    function11 = function9;
                                    function12 = function8;
                                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    list = null;
                                    objArr = 0;
                                    if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                        c28655q.m87150e0(1334502582);
                                        function10 = function8;
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool9 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R4 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R4 = new a(function10, null);
                                            c28655q.m87172p0(objM87133R4);
                                        } else {
                                            objM87133R4 = new a(function10, null);
                                            c28655q.m87172p0(objM87133R4);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool9);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        i27 = i26;
                                        function10 = function8;
                                        if (viewState instanceof AbstractC28344m.f) {
                                            c28655q.m87150e0(1334853905);
                                            if ((i15 & 7168) == i27) {
                                                z29 = true;
                                            } else {
                                                z29 = false;
                                            }
                                            z34 = z29 | ((i15 & 14) == 4);
                                            objM87133R3 = c28655q.m87133R();
                                            if (z34) {
                                                final int i216 = 0;
                                                objM87133R3 = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i216) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R3);
                                            } else {
                                                final int i217 = 0;
                                                objM87133R3 = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i217) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R3);
                                            }
                                            m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                            c28655q.m87173q(false);
                                        } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                            c28655q.m87150e0(1335481655);
                                            AbstractC30604j.m93897f(c28655q, 0);
                                            c28655q.m87173q(false);
                                        } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                            c28655q.m87150e0(1335591147);
                                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                            Boolean bool10 = Boolean.TRUE;
                                            if ((i15 & 57344) != 16384) {
                                                c28655q = c28655q;
                                                z15 = false;
                                            }
                                            c28655q = c28655q;
                                            objM87133R2 = c28655q.m87133R();
                                            if (z15) {
                                                objM87133R2 = new b(function10, null);
                                                c28655q.m87172p0(objM87133R2);
                                            } else {
                                                objM87133R2 = new b(function10, null);
                                                c28655q.m87172p0(objM87133R2);
                                            }
                                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool10);
                                            c28655q.m87173q(false);
                                            function7 = function9;
                                        } else {
                                            if (viewState instanceof AbstractC28344m.a) {
                                                throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                            }
                                            c28655q.m87150e0(1336012313);
                                            if ((i15 & 7168) == i27) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            z28 = z27 | ((i15 & 14) == 4);
                                            objM87133R = c28655q.m87133R();
                                            if (z28) {
                                                final int i311 = 1;
                                                function7 = function9;
                                                objM87133R = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i311) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R);
                                            } else {
                                                final int i312 = 1;
                                                function7 = function9;
                                                objM87133R = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i312) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R);
                                            }
                                            m90388O((Function1) objM87133R, c28655q, 0, 0);
                                            c28655q.m87173q(false);
                                        }
                                        function7 = function9;
                                    }
                                }
                                boolean z317 = z25;
                                function6 = function10;
                                z18 = z317;
                                function5 = function7;
                                z17 = z26;
                            }
                            function7 = function11;
                            function10 = function12;
                            boolean z318 = z25;
                            function6 = function10;
                            z18 = z318;
                            function5 = function7;
                            z17 = z26;
                        }
                        function10 = function8;
                        boolean z319 = z25;
                        function6 = function10;
                        z18 = z319;
                        function5 = function7;
                        z17 = z26;
                    } else {
                        c28655q.m87138X();
                        z17 = z13;
                        z18 = z14;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                    }
                }
                i15 |= 24576;
                function4 = function2;
                z15 = true;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i28 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29529k(8);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                        i26 = 2048;
                    } else {
                        i26 = 2048;
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29529k(9);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    if (viewState instanceof AbstractC28344m.i) {
                        c28655q.m87150e0(1333620198);
                        m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                        z25 = z19;
                        z26 = z24;
                        c28655q.m87173q(false);
                    } else {
                        z25 = z19;
                        z26 = z24;
                        if (viewState instanceof AbstractC28344m.e) {
                            c28655q.m87150e0(1333973226);
                            function11 = function7;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function9 = function7;
                            if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                c28655q.m87150e0(1334220885);
                                if ((i15 & 7168) == i26) {
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                c28655q.m87150e0(1844158453);
                                function11 = function9;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                list = null;
                                objArr = 0;
                                if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                    c28655q.m87150e0(1334502582);
                                    function10 = function8;
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool11 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool11);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    i27 = i26;
                                    function10 = function8;
                                    if (viewState instanceof AbstractC28344m.f) {
                                        c28655q.m87150e0(1334853905);
                                        if ((i15 & 7168) == i27) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        z34 = z29 | ((i15 & 14) == 4);
                                        objM87133R3 = c28655q.m87133R();
                                        if (z34) {
                                            final int i218 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i218) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        } else {
                                            final int i219 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i219) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        }
                                        m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                        c28655q.m87150e0(1335481655);
                                        AbstractC30604j.m93897f(c28655q, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                        c28655q.m87150e0(1335591147);
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool12 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R2 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        } else {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool12);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        if (viewState instanceof AbstractC28344m.a) {
                                            throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                        }
                                        c28655q.m87150e0(1336012313);
                                        if ((i15 & 7168) == i27) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        z28 = z27 | ((i15 & 14) == 4);
                                        objM87133R = c28655q.m87133R();
                                        if (z28) {
                                            final int i313 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i313) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        } else {
                                            final int i314 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i314) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        }
                                        m90388O((Function1) objM87133R, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    }
                                    function7 = function9;
                                }
                            }
                            boolean z3110 = z25;
                            function6 = function10;
                            z18 = z3110;
                            function5 = function7;
                            z17 = z26;
                        }
                        function7 = function11;
                        function10 = function12;
                        boolean z3111 = z25;
                        function6 = function10;
                        z18 = z3111;
                        function5 = function7;
                        z17 = z26;
                    }
                    function10 = function8;
                    boolean z3112 = z25;
                    function6 = function10;
                    z18 = z3112;
                    function5 = function7;
                    z17 = z26;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                }
            }
            i15 |= 3072;
            function3 = function1;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                z15 = true;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i28 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29529k(8);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                        i26 = 2048;
                    } else {
                        i26 = 2048;
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29529k(9);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    if (viewState instanceof AbstractC28344m.i) {
                        c28655q.m87150e0(1333620198);
                        m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                        z25 = z19;
                        z26 = z24;
                        c28655q.m87173q(false);
                    } else {
                        z25 = z19;
                        z26 = z24;
                        if (viewState instanceof AbstractC28344m.e) {
                            c28655q.m87150e0(1333973226);
                            function11 = function7;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function9 = function7;
                            if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                c28655q.m87150e0(1334220885);
                                if ((i15 & 7168) == i26) {
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                c28655q.m87150e0(1844158453);
                                function11 = function9;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                list = null;
                                objArr = 0;
                                if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                    c28655q.m87150e0(1334502582);
                                    function10 = function8;
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool13 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool13);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    i27 = i26;
                                    function10 = function8;
                                    if (viewState instanceof AbstractC28344m.f) {
                                        c28655q.m87150e0(1334853905);
                                        if ((i15 & 7168) == i27) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        z34 = z29 | ((i15 & 14) == 4);
                                        objM87133R3 = c28655q.m87133R();
                                        if (z34) {
                                            final int i2110 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i2110) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        } else {
                                            final int i2111 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i2111) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        }
                                        m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                        c28655q.m87150e0(1335481655);
                                        AbstractC30604j.m93897f(c28655q, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                        c28655q.m87150e0(1335591147);
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool14 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R2 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        } else {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool14);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        if (viewState instanceof AbstractC28344m.a) {
                                            throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                        }
                                        c28655q.m87150e0(1336012313);
                                        if ((i15 & 7168) == i27) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        z28 = z27 | ((i15 & 14) == 4);
                                        objM87133R = c28655q.m87133R();
                                        if (z28) {
                                            final int i315 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i315) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        } else {
                                            final int i316 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i316) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        }
                                        m90388O((Function1) objM87133R, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    }
                                    function7 = function9;
                                }
                            }
                            boolean z3113 = z25;
                            function6 = function10;
                            z18 = z3113;
                            function5 = function7;
                            z17 = z26;
                        }
                        function7 = function11;
                        function10 = function12;
                        boolean z3114 = z25;
                        function6 = function10;
                        z18 = z3114;
                        function5 = function7;
                        z17 = z26;
                    }
                    function10 = function8;
                    boolean z3115 = z25;
                    function6 = function10;
                    z18 = z3115;
                    function5 = function7;
                    z17 = z26;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                }
            }
            i15 |= 24576;
            function4 = function2;
            z15 = true;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i28 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29529k(8);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                    i26 = 2048;
                } else {
                    i26 = 2048;
                    function7 = function3;
                }
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29529k(9);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                if (viewState instanceof AbstractC28344m.i) {
                    c28655q.m87150e0(1333620198);
                    m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                    z25 = z19;
                    z26 = z24;
                    c28655q.m87173q(false);
                } else {
                    z25 = z19;
                    z26 = z24;
                    if (viewState instanceof AbstractC28344m.e) {
                        c28655q.m87150e0(1333973226);
                        function11 = function7;
                        function12 = function8;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function9 = function7;
                        if (viewState.equals(AbstractC28344m.d.f114322a)) {
                            c28655q.m87150e0(1334220885);
                            if ((i15 & 7168) == i26) {
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z15) {
                                objM87133R5 = new C29520c(function9, 4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C29520c(function9, 4);
                                c28655q.m87172p0(objM87133R5);
                            }
                            m90388O((Function1) objM87133R5, c28655q, 0, 0);
                            c28655q.m87173q(false);
                            function7 = function9;
                        } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                            c28655q.m87150e0(1844158453);
                            function11 = function9;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            list = null;
                            objArr = 0;
                            if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                c28655q.m87150e0(1334502582);
                                function10 = function8;
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool15 = Boolean.TRUE;
                                if ((i15 & 57344) != 16384) {
                                    c28655q = c28655q;
                                    z15 = false;
                                }
                                c28655q = c28655q;
                                objM87133R4 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R4 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool15);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else {
                                i27 = i26;
                                function10 = function8;
                                if (viewState instanceof AbstractC28344m.f) {
                                    c28655q.m87150e0(1334853905);
                                    if ((i15 & 7168) == i27) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    z34 = z29 | ((i15 & 14) == 4);
                                    objM87133R3 = c28655q.m87133R();
                                    if (z34) {
                                        final int i2112 = 0;
                                        objM87133R3 = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i2112) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        final int i2113 = 0;
                                        objM87133R3 = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i2113) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                    c28655q.m87150e0(1335481655);
                                    AbstractC30604j.m93897f(c28655q, 0);
                                    c28655q.m87173q(false);
                                } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                    c28655q.m87150e0(1335591147);
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool16 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R2 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R2 = new b(function10, null);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        objM87133R2 = new b(function10, null);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool16);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    if (viewState instanceof AbstractC28344m.a) {
                                        throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                    }
                                    c28655q.m87150e0(1336012313);
                                    if ((i15 & 7168) == i27) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    z28 = z27 | ((i15 & 14) == 4);
                                    objM87133R = c28655q.m87133R();
                                    if (z28) {
                                        final int i317 = 1;
                                        function7 = function9;
                                        objM87133R = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i317) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    } else {
                                        final int i318 = 1;
                                        function7 = function9;
                                        objM87133R = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i318) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    m90388O((Function1) objM87133R, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                }
                                function7 = function9;
                            }
                        }
                        boolean z3116 = z25;
                        function6 = function10;
                        z18 = z3116;
                        function5 = function7;
                        z17 = z26;
                    }
                    function7 = function11;
                    function10 = function12;
                    boolean z3117 = z25;
                    function6 = function10;
                    z18 = z3117;
                    function5 = function7;
                    z17 = z26;
                }
                function10 = function8;
                boolean z3118 = z25;
                function6 = function10;
                z18 = z3118;
                function5 = function7;
                z17 = z26;
            } else {
                c28655q.m87138X();
                z17 = z13;
                z18 = z14;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
            }
        }
        i15 |= 48;
        z14 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    z15 = true;
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i28 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i16 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29529k(8);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function7 = (Function1) objM87133R7;
                            i26 = 2048;
                        } else {
                            i26 = 2048;
                            function7 = function3;
                        }
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C29529k(9);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function8 = (Function1) objM87133R6;
                        } else {
                            function8 = function4;
                        }
                        if (viewState instanceof AbstractC28344m.i) {
                            c28655q.m87150e0(1333620198);
                            m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                            z25 = z19;
                            z26 = z24;
                            c28655q.m87173q(false);
                        } else {
                            z25 = z19;
                            z26 = z24;
                            if (viewState instanceof AbstractC28344m.e) {
                                c28655q.m87150e0(1333973226);
                                function11 = function7;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function9 = function7;
                                if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                    c28655q.m87150e0(1334220885);
                                    if ((i15 & 7168) == i26) {
                                    }
                                    objM87133R5 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R5 = new C29520c(function9, 4);
                                        c28655q.m87172p0(objM87133R5);
                                    } else {
                                        objM87133R5 = new C29520c(function9, 4);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                    c28655q.m87150e0(1844158453);
                                    function11 = function9;
                                    function12 = function8;
                                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    list = null;
                                    objArr = 0;
                                    if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                        c28655q.m87150e0(1334502582);
                                        function10 = function8;
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool17 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R4 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R4 = new a(function10, null);
                                            c28655q.m87172p0(objM87133R4);
                                        } else {
                                            objM87133R4 = new a(function10, null);
                                            c28655q.m87172p0(objM87133R4);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool17);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        i27 = i26;
                                        function10 = function8;
                                        if (viewState instanceof AbstractC28344m.f) {
                                            c28655q.m87150e0(1334853905);
                                            if ((i15 & 7168) == i27) {
                                                z29 = true;
                                            } else {
                                                z29 = false;
                                            }
                                            z34 = z29 | ((i15 & 14) == 4);
                                            objM87133R3 = c28655q.m87133R();
                                            if (z34) {
                                                final int i2114 = 0;
                                                objM87133R3 = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i2114) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R3);
                                            } else {
                                                final int i2115 = 0;
                                                objM87133R3 = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i2115) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R3);
                                            }
                                            m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                            c28655q.m87173q(false);
                                        } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                            c28655q.m87150e0(1335481655);
                                            AbstractC30604j.m93897f(c28655q, 0);
                                            c28655q.m87173q(false);
                                        } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                            c28655q.m87150e0(1335591147);
                                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                            Boolean bool18 = Boolean.TRUE;
                                            if ((i15 & 57344) != 16384) {
                                                c28655q = c28655q;
                                                z15 = false;
                                            }
                                            c28655q = c28655q;
                                            objM87133R2 = c28655q.m87133R();
                                            if (z15) {
                                                objM87133R2 = new b(function10, null);
                                                c28655q.m87172p0(objM87133R2);
                                            } else {
                                                objM87133R2 = new b(function10, null);
                                                c28655q.m87172p0(objM87133R2);
                                            }
                                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool18);
                                            c28655q.m87173q(false);
                                            function7 = function9;
                                        } else {
                                            if (viewState instanceof AbstractC28344m.a) {
                                                throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                            }
                                            c28655q.m87150e0(1336012313);
                                            if ((i15 & 7168) == i27) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            z28 = z27 | ((i15 & 14) == 4);
                                            objM87133R = c28655q.m87133R();
                                            if (z28) {
                                                final int i319 = 1;
                                                function7 = function9;
                                                objM87133R = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i319) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R);
                                            } else {
                                                final int i3110 = 1;
                                                function7 = function9;
                                                objM87133R = new Function1() { // from class: pt2.u
                                                    @Override // p715kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        switch (i3110) {
                                                            case 0:
                                                                return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                            default:
                                                                return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                        }
                                                    }
                                                };
                                                c28655q.m87172p0(objM87133R);
                                            }
                                            m90388O((Function1) objM87133R, c28655q, 0, 0);
                                            c28655q.m87173q(false);
                                        }
                                        function7 = function9;
                                    }
                                }
                                boolean z3119 = z25;
                                function6 = function10;
                                z18 = z3119;
                                function5 = function7;
                                z17 = z26;
                            }
                            function7 = function11;
                            function10 = function12;
                            boolean z31110 = z25;
                            function6 = function10;
                            z18 = z31110;
                            function5 = function7;
                            z17 = z26;
                        }
                        function10 = function8;
                        boolean z31111 = z25;
                        function6 = function10;
                        z18 = z31111;
                        function5 = function7;
                        z17 = z26;
                    } else {
                        c28655q.m87138X();
                        z17 = z13;
                        z18 = z14;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                    }
                }
                i15 |= 24576;
                function4 = function2;
                z15 = true;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i28 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29529k(8);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                        i26 = 2048;
                    } else {
                        i26 = 2048;
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29529k(9);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    if (viewState instanceof AbstractC28344m.i) {
                        c28655q.m87150e0(1333620198);
                        m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                        z25 = z19;
                        z26 = z24;
                        c28655q.m87173q(false);
                    } else {
                        z25 = z19;
                        z26 = z24;
                        if (viewState instanceof AbstractC28344m.e) {
                            c28655q.m87150e0(1333973226);
                            function11 = function7;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function9 = function7;
                            if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                c28655q.m87150e0(1334220885);
                                if ((i15 & 7168) == i26) {
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                c28655q.m87150e0(1844158453);
                                function11 = function9;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                list = null;
                                objArr = 0;
                                if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                    c28655q.m87150e0(1334502582);
                                    function10 = function8;
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool19 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool19);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    i27 = i26;
                                    function10 = function8;
                                    if (viewState instanceof AbstractC28344m.f) {
                                        c28655q.m87150e0(1334853905);
                                        if ((i15 & 7168) == i27) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        z34 = z29 | ((i15 & 14) == 4);
                                        objM87133R3 = c28655q.m87133R();
                                        if (z34) {
                                            final int i2116 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i2116) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        } else {
                                            final int i2117 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i2117) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        }
                                        m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                        c28655q.m87150e0(1335481655);
                                        AbstractC30604j.m93897f(c28655q, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                        c28655q.m87150e0(1335591147);
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool110 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R2 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        } else {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool110);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        if (viewState instanceof AbstractC28344m.a) {
                                            throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                        }
                                        c28655q.m87150e0(1336012313);
                                        if ((i15 & 7168) == i27) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        z28 = z27 | ((i15 & 14) == 4);
                                        objM87133R = c28655q.m87133R();
                                        if (z28) {
                                            final int i3111 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i3111) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        } else {
                                            final int i3112 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i3112) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        }
                                        m90388O((Function1) objM87133R, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    }
                                    function7 = function9;
                                }
                            }
                            boolean z31112 = z25;
                            function6 = function10;
                            z18 = z31112;
                            function5 = function7;
                            z17 = z26;
                        }
                        function7 = function11;
                        function10 = function12;
                        boolean z31113 = z25;
                        function6 = function10;
                        z18 = z31113;
                        function5 = function7;
                        z17 = z26;
                    }
                    function10 = function8;
                    boolean z31114 = z25;
                    function6 = function10;
                    z18 = z31114;
                    function5 = function7;
                    z17 = z26;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                }
            }
            i15 |= 3072;
            function3 = function1;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                z15 = true;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i28 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29529k(8);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                        i26 = 2048;
                    } else {
                        i26 = 2048;
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29529k(9);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    if (viewState instanceof AbstractC28344m.i) {
                        c28655q.m87150e0(1333620198);
                        m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                        z25 = z19;
                        z26 = z24;
                        c28655q.m87173q(false);
                    } else {
                        z25 = z19;
                        z26 = z24;
                        if (viewState instanceof AbstractC28344m.e) {
                            c28655q.m87150e0(1333973226);
                            function11 = function7;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function9 = function7;
                            if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                c28655q.m87150e0(1334220885);
                                if ((i15 & 7168) == i26) {
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                c28655q.m87150e0(1844158453);
                                function11 = function9;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                list = null;
                                objArr = 0;
                                if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                    c28655q.m87150e0(1334502582);
                                    function10 = function8;
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool111 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool111);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    i27 = i26;
                                    function10 = function8;
                                    if (viewState instanceof AbstractC28344m.f) {
                                        c28655q.m87150e0(1334853905);
                                        if ((i15 & 7168) == i27) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        z34 = z29 | ((i15 & 14) == 4);
                                        objM87133R3 = c28655q.m87133R();
                                        if (z34) {
                                            final int i2118 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i2118) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        } else {
                                            final int i2119 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i2119) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        }
                                        m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                        c28655q.m87150e0(1335481655);
                                        AbstractC30604j.m93897f(c28655q, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                        c28655q.m87150e0(1335591147);
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool112 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R2 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        } else {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool112);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        if (viewState instanceof AbstractC28344m.a) {
                                            throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                        }
                                        c28655q.m87150e0(1336012313);
                                        if ((i15 & 7168) == i27) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        z28 = z27 | ((i15 & 14) == 4);
                                        objM87133R = c28655q.m87133R();
                                        if (z28) {
                                            final int i3113 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i3113) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        } else {
                                            final int i3114 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i3114) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        }
                                        m90388O((Function1) objM87133R, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    }
                                    function7 = function9;
                                }
                            }
                            boolean z31115 = z25;
                            function6 = function10;
                            z18 = z31115;
                            function5 = function7;
                            z17 = z26;
                        }
                        function7 = function11;
                        function10 = function12;
                        boolean z31116 = z25;
                        function6 = function10;
                        z18 = z31116;
                        function5 = function7;
                        z17 = z26;
                    }
                    function10 = function8;
                    boolean z31117 = z25;
                    function6 = function10;
                    z18 = z31117;
                    function5 = function7;
                    z17 = z26;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                }
            }
            i15 |= 24576;
            function4 = function2;
            z15 = true;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i28 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29529k(8);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                    i26 = 2048;
                } else {
                    i26 = 2048;
                    function7 = function3;
                }
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29529k(9);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                if (viewState instanceof AbstractC28344m.i) {
                    c28655q.m87150e0(1333620198);
                    m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                    z25 = z19;
                    z26 = z24;
                    c28655q.m87173q(false);
                } else {
                    z25 = z19;
                    z26 = z24;
                    if (viewState instanceof AbstractC28344m.e) {
                        c28655q.m87150e0(1333973226);
                        function11 = function7;
                        function12 = function8;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function9 = function7;
                        if (viewState.equals(AbstractC28344m.d.f114322a)) {
                            c28655q.m87150e0(1334220885);
                            if ((i15 & 7168) == i26) {
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z15) {
                                objM87133R5 = new C29520c(function9, 4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C29520c(function9, 4);
                                c28655q.m87172p0(objM87133R5);
                            }
                            m90388O((Function1) objM87133R5, c28655q, 0, 0);
                            c28655q.m87173q(false);
                            function7 = function9;
                        } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                            c28655q.m87150e0(1844158453);
                            function11 = function9;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            list = null;
                            objArr = 0;
                            if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                c28655q.m87150e0(1334502582);
                                function10 = function8;
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool113 = Boolean.TRUE;
                                if ((i15 & 57344) != 16384) {
                                    c28655q = c28655q;
                                    z15 = false;
                                }
                                c28655q = c28655q;
                                objM87133R4 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R4 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool113);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else {
                                i27 = i26;
                                function10 = function8;
                                if (viewState instanceof AbstractC28344m.f) {
                                    c28655q.m87150e0(1334853905);
                                    if ((i15 & 7168) == i27) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    z34 = z29 | ((i15 & 14) == 4);
                                    objM87133R3 = c28655q.m87133R();
                                    if (z34) {
                                        final int i21110 = 0;
                                        objM87133R3 = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i21110) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        final int i21111 = 0;
                                        objM87133R3 = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i21111) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                    c28655q.m87150e0(1335481655);
                                    AbstractC30604j.m93897f(c28655q, 0);
                                    c28655q.m87173q(false);
                                } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                    c28655q.m87150e0(1335591147);
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool114 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R2 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R2 = new b(function10, null);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        objM87133R2 = new b(function10, null);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool114);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    if (viewState instanceof AbstractC28344m.a) {
                                        throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                    }
                                    c28655q.m87150e0(1336012313);
                                    if ((i15 & 7168) == i27) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    z28 = z27 | ((i15 & 14) == 4);
                                    objM87133R = c28655q.m87133R();
                                    if (z28) {
                                        final int i3115 = 1;
                                        function7 = function9;
                                        objM87133R = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i3115) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    } else {
                                        final int i3116 = 1;
                                        function7 = function9;
                                        objM87133R = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i3116) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    m90388O((Function1) objM87133R, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                }
                                function7 = function9;
                            }
                        }
                        boolean z31118 = z25;
                        function6 = function10;
                        z18 = z31118;
                        function5 = function7;
                        z17 = z26;
                    }
                    function7 = function11;
                    function10 = function12;
                    boolean z31119 = z25;
                    function6 = function10;
                    z18 = z31119;
                    function5 = function7;
                    z17 = z26;
                }
                function10 = function8;
                boolean z311110 = z25;
                function6 = function10;
                z18 = z311110;
                function5 = function7;
                z17 = z26;
            } else {
                c28655q.m87138X();
                z17 = z13;
                z18 = z14;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
            }
        }
        i15 |= 384;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                if (c28655q.m87157i(function3)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                z15 = true;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i28 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29529k(8);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                        i26 = 2048;
                    } else {
                        i26 = 2048;
                        function7 = function3;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29529k(9);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    if (viewState instanceof AbstractC28344m.i) {
                        c28655q.m87150e0(1333620198);
                        m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                        z25 = z19;
                        z26 = z24;
                        c28655q.m87173q(false);
                    } else {
                        z25 = z19;
                        z26 = z24;
                        if (viewState instanceof AbstractC28344m.e) {
                            c28655q.m87150e0(1333973226);
                            function11 = function7;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function9 = function7;
                            if (viewState.equals(AbstractC28344m.d.f114322a)) {
                                c28655q.m87150e0(1334220885);
                                if ((i15 & 7168) == i26) {
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C29520c(function9, 4);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                m90388O((Function1) objM87133R5, c28655q, 0, 0);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                                c28655q.m87150e0(1844158453);
                                function11 = function9;
                                function12 = function8;
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                list = null;
                                objArr = 0;
                                if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                    c28655q.m87150e0(1334502582);
                                    function10 = function8;
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool115 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        objM87133R4 = new a(function10, null);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool115);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    i27 = i26;
                                    function10 = function8;
                                    if (viewState instanceof AbstractC28344m.f) {
                                        c28655q.m87150e0(1334853905);
                                        if ((i15 & 7168) == i27) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        z34 = z29 | ((i15 & 14) == 4);
                                        objM87133R3 = c28655q.m87133R();
                                        if (z34) {
                                            final int i21112 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i21112) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        } else {
                                            final int i21113 = 0;
                                            objM87133R3 = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i21113) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        }
                                        m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                        c28655q.m87150e0(1335481655);
                                        AbstractC30604j.m93897f(c28655q, 0);
                                        c28655q.m87173q(false);
                                    } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                        c28655q.m87150e0(1335591147);
                                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                        Boolean bool116 = Boolean.TRUE;
                                        if ((i15 & 57344) != 16384) {
                                            c28655q = c28655q;
                                            z15 = false;
                                        }
                                        c28655q = c28655q;
                                        objM87133R2 = c28655q.m87133R();
                                        if (z15) {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        } else {
                                            objM87133R2 = new b(function10, null);
                                            c28655q.m87172p0(objM87133R2);
                                        }
                                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool116);
                                        c28655q.m87173q(false);
                                        function7 = function9;
                                    } else {
                                        if (viewState instanceof AbstractC28344m.a) {
                                            throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                        }
                                        c28655q.m87150e0(1336012313);
                                        if ((i15 & 7168) == i27) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        z28 = z27 | ((i15 & 14) == 4);
                                        objM87133R = c28655q.m87133R();
                                        if (z28) {
                                            final int i3117 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i3117) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        } else {
                                            final int i3118 = 1;
                                            function7 = function9;
                                            objM87133R = new Function1() { // from class: pt2.u
                                                @Override // p715kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    switch (i3118) {
                                                        case 0:
                                                            return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                        default:
                                                            return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R);
                                        }
                                        m90388O((Function1) objM87133R, c28655q, 0, 0);
                                        c28655q.m87173q(false);
                                    }
                                    function7 = function9;
                                }
                            }
                            boolean z311111 = z25;
                            function6 = function10;
                            z18 = z311111;
                            function5 = function7;
                            z17 = z26;
                        }
                        function7 = function11;
                        function10 = function12;
                        boolean z311112 = z25;
                        function6 = function10;
                        z18 = z311112;
                        function5 = function7;
                        z17 = z26;
                    }
                    function10 = function8;
                    boolean z311113 = z25;
                    function6 = function10;
                    z18 = z311113;
                    function5 = function7;
                    z17 = z26;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
                }
            }
            i15 |= 24576;
            function4 = function2;
            z15 = true;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i28 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29529k(8);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                    i26 = 2048;
                } else {
                    i26 = 2048;
                    function7 = function3;
                }
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29529k(9);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                if (viewState instanceof AbstractC28344m.i) {
                    c28655q.m87150e0(1333620198);
                    m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                    z25 = z19;
                    z26 = z24;
                    c28655q.m87173q(false);
                } else {
                    z25 = z19;
                    z26 = z24;
                    if (viewState instanceof AbstractC28344m.e) {
                        c28655q.m87150e0(1333973226);
                        function11 = function7;
                        function12 = function8;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function9 = function7;
                        if (viewState.equals(AbstractC28344m.d.f114322a)) {
                            c28655q.m87150e0(1334220885);
                            if ((i15 & 7168) == i26) {
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z15) {
                                objM87133R5 = new C29520c(function9, 4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C29520c(function9, 4);
                                c28655q.m87172p0(objM87133R5);
                            }
                            m90388O((Function1) objM87133R5, c28655q, 0, 0);
                            c28655q.m87173q(false);
                            function7 = function9;
                        } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                            c28655q.m87150e0(1844158453);
                            function11 = function9;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            list = null;
                            objArr = 0;
                            if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                c28655q.m87150e0(1334502582);
                                function10 = function8;
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool117 = Boolean.TRUE;
                                if ((i15 & 57344) != 16384) {
                                    c28655q = c28655q;
                                    z15 = false;
                                }
                                c28655q = c28655q;
                                objM87133R4 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R4 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool117);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else {
                                i27 = i26;
                                function10 = function8;
                                if (viewState instanceof AbstractC28344m.f) {
                                    c28655q.m87150e0(1334853905);
                                    if ((i15 & 7168) == i27) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    z34 = z29 | ((i15 & 14) == 4);
                                    objM87133R3 = c28655q.m87133R();
                                    if (z34) {
                                        final int i21114 = 0;
                                        objM87133R3 = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i21114) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        final int i21115 = 0;
                                        objM87133R3 = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i21115) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                    c28655q.m87150e0(1335481655);
                                    AbstractC30604j.m93897f(c28655q, 0);
                                    c28655q.m87173q(false);
                                } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                    c28655q.m87150e0(1335591147);
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool118 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R2 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R2 = new b(function10, null);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        objM87133R2 = new b(function10, null);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool118);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    if (viewState instanceof AbstractC28344m.a) {
                                        throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                    }
                                    c28655q.m87150e0(1336012313);
                                    if ((i15 & 7168) == i27) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    z28 = z27 | ((i15 & 14) == 4);
                                    objM87133R = c28655q.m87133R();
                                    if (z28) {
                                        final int i3119 = 1;
                                        function7 = function9;
                                        objM87133R = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i3119) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    } else {
                                        final int i31110 = 1;
                                        function7 = function9;
                                        objM87133R = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i31110) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    m90388O((Function1) objM87133R, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                }
                                function7 = function9;
                            }
                        }
                        boolean z311114 = z25;
                        function6 = function10;
                        z18 = z311114;
                        function5 = function7;
                        z17 = z26;
                    }
                    function7 = function11;
                    function10 = function12;
                    boolean z311115 = z25;
                    function6 = function10;
                    z18 = z311115;
                    function5 = function7;
                    z17 = z26;
                }
                function10 = function8;
                boolean z311116 = z25;
                function6 = function10;
                z18 = z311116;
                function5 = function7;
                z17 = z26;
            } else {
                c28655q.m87138X();
                z17 = z13;
                z18 = z14;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            z15 = true;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i28 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29529k(8);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                    i26 = 2048;
                } else {
                    i26 = 2048;
                    function7 = function3;
                }
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29529k(9);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                if (viewState instanceof AbstractC28344m.i) {
                    c28655q.m87150e0(1333620198);
                    m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                    z25 = z19;
                    z26 = z24;
                    c28655q.m87173q(false);
                } else {
                    z25 = z19;
                    z26 = z24;
                    if (viewState instanceof AbstractC28344m.e) {
                        c28655q.m87150e0(1333973226);
                        function11 = function7;
                        function12 = function8;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function9 = function7;
                        if (viewState.equals(AbstractC28344m.d.f114322a)) {
                            c28655q.m87150e0(1334220885);
                            if ((i15 & 7168) == i26) {
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z15) {
                                objM87133R5 = new C29520c(function9, 4);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C29520c(function9, 4);
                                c28655q.m87172p0(objM87133R5);
                            }
                            m90388O((Function1) objM87133R5, c28655q, 0, 0);
                            c28655q.m87173q(false);
                            function7 = function9;
                        } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                            c28655q.m87150e0(1844158453);
                            function11 = function9;
                            function12 = function8;
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            list = null;
                            objArr = 0;
                            if (viewState.equals(AbstractC28344m.g.f114333a)) {
                                c28655q.m87150e0(1334502582);
                                function10 = function8;
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool119 = Boolean.TRUE;
                                if ((i15 & 57344) != 16384) {
                                    c28655q = c28655q;
                                    z15 = false;
                                }
                                c28655q = c28655q;
                                objM87133R4 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R4 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool119);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else {
                                i27 = i26;
                                function10 = function8;
                                if (viewState instanceof AbstractC28344m.f) {
                                    c28655q.m87150e0(1334853905);
                                    if ((i15 & 7168) == i27) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    z34 = z29 | ((i15 & 14) == 4);
                                    objM87133R3 = c28655q.m87133R();
                                    if (z34) {
                                        final int i21116 = 0;
                                        objM87133R3 = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i21116) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        final int i21117 = 0;
                                        objM87133R3 = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i21117) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function9, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                    c28655q.m87150e0(1335481655);
                                    AbstractC30604j.m93897f(c28655q, 0);
                                    c28655q.m87173q(false);
                                } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                    c28655q.m87150e0(1335591147);
                                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                    Boolean bool1110 = Boolean.TRUE;
                                    if ((i15 & 57344) != 16384) {
                                        c28655q = c28655q;
                                        z15 = false;
                                    }
                                    c28655q = c28655q;
                                    objM87133R2 = c28655q.m87133R();
                                    if (z15) {
                                        objM87133R2 = new b(function10, null);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        objM87133R2 = new b(function10, null);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool1110);
                                    c28655q.m87173q(false);
                                    function7 = function9;
                                } else {
                                    if (viewState instanceof AbstractC28344m.a) {
                                        throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                    }
                                    c28655q.m87150e0(1336012313);
                                    if ((i15 & 7168) == i27) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    z28 = z27 | ((i15 & 14) == 4);
                                    objM87133R = c28655q.m87133R();
                                    if (z28) {
                                        final int i31111 = 1;
                                        function7 = function9;
                                        objM87133R = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i31111) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    } else {
                                        final int i31112 = 1;
                                        function7 = function9;
                                        objM87133R = new Function1() { // from class: pt2.u
                                            @Override // p715kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                switch (i31112) {
                                                    case 0:
                                                        return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                    default:
                                                        return AbstractC29540v.m90414d0(function7, viewState, obj);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    m90388O((Function1) objM87133R, c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                }
                                function7 = function9;
                            }
                        }
                        boolean z311117 = z25;
                        function6 = function10;
                        z18 = z311117;
                        function5 = function7;
                        z17 = z26;
                    }
                    function7 = function11;
                    function10 = function12;
                    boolean z311118 = z25;
                    function6 = function10;
                    z18 = z311118;
                    function5 = function7;
                    z17 = z26;
                }
                function10 = function8;
                boolean z311119 = z25;
                function6 = function10;
                z18 = z311119;
                function5 = function7;
                z17 = z26;
            } else {
                c28655q.m87138X();
                z17 = z13;
                z18 = z14;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
            }
        }
        i15 |= 24576;
        function4 = function2;
        z15 = true;
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            if (i28 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i16 != 0) {
                z24 = false;
            } else {
                z24 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C29529k(8);
                    c28655q.m87172p0(objM87133R7);
                }
                function7 = (Function1) objM87133R7;
                i26 = 2048;
            } else {
                i26 = 2048;
                function7 = function3;
            }
            if (i24 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C29529k(9);
                    c28655q.m87172p0(objM87133R6);
                }
                function8 = (Function1) objM87133R6;
            } else {
                function8 = function4;
            }
            if (viewState instanceof AbstractC28344m.i) {
                c28655q.m87150e0(1333620198);
                m90418f0((AbstractC28344m.i) viewState, z19, z24, function7, function8, c28655q, i15 & 65534, 0);
                z25 = z19;
                z26 = z24;
                c28655q.m87173q(false);
            } else {
                z25 = z19;
                z26 = z24;
                if (viewState instanceof AbstractC28344m.e) {
                    c28655q.m87150e0(1333973226);
                    function11 = function7;
                    function12 = function8;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function9 = function7;
                    if (viewState.equals(AbstractC28344m.d.f114322a)) {
                        c28655q.m87150e0(1334220885);
                        if ((i15 & 7168) == i26) {
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z15) {
                            objM87133R5 = new C29520c(function9, 4);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29520c(function9, 4);
                            c28655q.m87172p0(objM87133R5);
                        }
                        m90388O((Function1) objM87133R5, c28655q, 0, 0);
                        c28655q.m87173q(false);
                        function7 = function9;
                    } else if (viewState.equals(AbstractC28344m.h.f114334a)) {
                        c28655q.m87150e0(1844158453);
                        function11 = function9;
                        function12 = function8;
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        list = null;
                        objArr = 0;
                        if (viewState.equals(AbstractC28344m.g.f114333a)) {
                            c28655q.m87150e0(1334502582);
                            function10 = function8;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool1111 = Boolean.TRUE;
                            if ((i15 & 57344) != 16384) {
                                c28655q = c28655q;
                                z15 = false;
                            }
                            c28655q = c28655q;
                            objM87133R4 = c28655q.m87133R();
                            if (z15) {
                                objM87133R4 = new a(function10, null);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new a(function10, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool1111);
                            c28655q.m87173q(false);
                            function7 = function9;
                        } else {
                            i27 = i26;
                            function10 = function8;
                            if (viewState instanceof AbstractC28344m.f) {
                                c28655q.m87150e0(1334853905);
                                if ((i15 & 7168) == i27) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                z34 = z29 | ((i15 & 14) == 4);
                                objM87133R3 = c28655q.m87133R();
                                if (z34) {
                                    final int i21118 = 0;
                                    objM87133R3 = new Function1() { // from class: pt2.u
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            switch (i21118) {
                                                case 0:
                                                    return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                default:
                                                    return AbstractC29540v.m90414d0(function9, viewState, obj);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    final int i21119 = 0;
                                    objM87133R3 = new Function1() { // from class: pt2.u
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            switch (i21119) {
                                                case 0:
                                                    return AbstractC29540v.m90412c0(function9, viewState, obj);
                                                default:
                                                    return AbstractC29540v.m90414d0(function9, viewState, obj);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m90388O((Function1) objM87133R3, c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else if (viewState.equals(AbstractC28344m.b.f114320a)) {
                                c28655q.m87150e0(1335481655);
                                AbstractC30604j.m93897f(c28655q, 0);
                                c28655q.m87173q(false);
                            } else if (viewState.equals(AbstractC28344m.c.f114321a)) {
                                c28655q.m87150e0(1335591147);
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(new TextResource.C8688b(AbstractC22822a.f89937i, list, 2, objArr == true ? 1 : 0), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool1112 = Boolean.TRUE;
                                if ((i15 & 57344) != 16384) {
                                    c28655q = c28655q;
                                    z15 = false;
                                }
                                c28655q = c28655q;
                                objM87133R2 = c28655q.m87133R();
                                if (z15) {
                                    objM87133R2 = new b(function10, null);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new b(function10, null);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool1112);
                                c28655q.m87173q(false);
                                function7 = function9;
                            } else {
                                if (viewState instanceof AbstractC28344m.a) {
                                    throw AbstractC11895b.m32003v(1844135615, c28655q, false);
                                }
                                c28655q.m87150e0(1336012313);
                                if ((i15 & 7168) == i27) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                z28 = z27 | ((i15 & 14) == 4);
                                objM87133R = c28655q.m87133R();
                                if (z28) {
                                    final int i31113 = 1;
                                    function7 = function9;
                                    objM87133R = new Function1() { // from class: pt2.u
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            switch (i31113) {
                                                case 0:
                                                    return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                default:
                                                    return AbstractC29540v.m90414d0(function7, viewState, obj);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    final int i31114 = 1;
                                    function7 = function9;
                                    objM87133R = new Function1() { // from class: pt2.u
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            switch (i31114) {
                                                case 0:
                                                    return AbstractC29540v.m90412c0(function7, viewState, obj);
                                                default:
                                                    return AbstractC29540v.m90414d0(function7, viewState, obj);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                }
                                m90388O((Function1) objM87133R, c28655q, 0, 0);
                                c28655q.m87173q(false);
                            }
                            function7 = function9;
                        }
                    }
                    boolean z3111110 = z25;
                    function6 = function10;
                    z18 = z3111110;
                    function5 = function7;
                    z17 = z26;
                }
                function7 = function11;
                function10 = function12;
                boolean z3111111 = z25;
                function6 = function10;
                z18 = z3111111;
                function5 = function7;
                z17 = z26;
            }
            function10 = function8;
            boolean z3111112 = z25;
            function6 = function10;
            z18 = z3111112;
            function5 = function7;
            z17 = z26;
        } else {
            c28655q.m87138X();
            z17 = z13;
            z18 = z14;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(viewState, z18, z17, function5, function6, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m90406Z(AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m90408a0(AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m90410b0(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(AbstractC27131a.d.f108483a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m90412c0(Function1 function1, AbstractC28344m abstractC28344m, Object it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC28344m.f fVar = (AbstractC28344m.f) abstractC28344m;
        function1.invoke(new AbstractC27131a.g(fVar.getPlanId(), fVar.getIsCustomized(), fVar.getMigrateSmartAlarm(), fVar.m85963f(), fVar.m85959b(), fVar.m85958a(), fVar.getSource(), fVar.getPresetPlanCategory(), fVar.getTemplateId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m90414d0(Function1 function1, AbstractC28344m abstractC28344m, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC27131a.b(((AbstractC28344m.a) abstractC28344m).getPlanId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m90416e0(AbstractC28344m abstractC28344m, boolean z4, boolean z13, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m90405Y(abstractC28344m, z4, z13, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021f  */
    /* JADX WARN: Code duplicated, block: B:101:0x022a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0240  */
    /* JADX WARN: Code duplicated, block: B:107:0x0266  */
    /* JADX WARN: Code duplicated, block: B:110:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0292  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:116:0x030a  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x0158  */
    /* JADX WARN: Code duplicated, block: B:79:0x015a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:86:0x017d  */
    /* JADX WARN: Code duplicated, block: B:88:0x018d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:98:0x020f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static final void m90418f0(AbstractC28344m.i viewState, boolean z4, boolean z13, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        boolean z16;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        boolean z19;
        boolean z24;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC2994c0 interfaceC2994c0;
        InterfaceC28601c1 interfaceC28601c2;
        AbstractC35664f.a aVar;
        Object objM87133R5;
        TextResource textResource;
        Object objM87133R6;
        int i18;
        boolean z25;
        boolean z26;
        Object objM87133R7;
        boolean z27;
        boolean z28;
        int i19;
        C28655q c28655q;
        C28655q c28655q2;
        boolean zM87157i;
        Object objM87133R8;
        C39756c c39756cM85990h;
        Object objM87133R9;
        C39756c c39756cM86004v;
        Object objM87133R10;
        int i24;
        int i25;
        Object[] objArr;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(2133194640);
        int i26 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z4;
                i15 |= c28655q3.m87155h(z14) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z15 = z13;
                    if (c28655q3.m87155h(z15)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q3.m87157i(onViewEvent)) {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i25;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q3.m87157i(onNavigationEvent)) {
                        i24 = 16384;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i24;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z16)) {
                    if (i27 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    objM87133R = c28655q3.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z19, c28655q3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC31061c.m95647w(z24, c28655q3);
                    }
                    InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87262p(c28655q3);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
                    interfaceC28601c2 = interfaceC28601c4;
                    aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6));
                    objM87133R5 = c28655q3.m87133R();
                    textResource = null;
                    objArr = 0;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i26, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q3.m87172p0(objM87133R5);
                    }
                    InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    boolean zM87157i2 = c28655q3.m87157i(viewState);
                    i18 = 57344 & i15;
                    if (i18 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zM87157i2 | z25;
                    objM87133R7 = c28655q3.m87133R();
                    if (z26 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C29533o(viewState, onNavigationEvent, interfaceC28601c1, 0);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    z27 = false;
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, false, c28655q3, 0, 1);
                    if (m90373G0(interfaceC28601c1)) {
                        c28655q3.m87150e0(1300694156);
                        c39756cM86004v = viewState.getInitialScreen().getUnsavedChangesDialogViewState();
                        if (c39756cM86004v == null) {
                            c28655q3.m87150e0(1666813173);
                            c28655q3.m87173q(false);
                            z28 = z19;
                            i19 = i18;
                            c28655q = c28655q3;
                        } else {
                            c28655q3.m87150e0(1666813174);
                            boolean z29 = z19;
                            EnumC29521c0 enumC29521c0 = EnumC29521c0.UNSAVED_CHANGES;
                            String strM85998p = viewState.getInitialScreen().getPlanId();
                            objM87133R10 = c28655q3.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C29534p(0, interfaceC28601c1);
                                c28655q3.m87172p0(objM87133R10);
                            }
                            z28 = z29;
                            c28655q = c28655q3;
                            i19 = i18;
                            z27 = false;
                            m90381K0(c39756cM86004v, enumC29521c0, strM85998p, onViewEvent, onNavigationEvent, (InterfaceC4339a) objM87133R10, c28655q, (i15 & 7168) | TextResource.$stable | 196656 | i18, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z27);
                    } else {
                        z28 = z19;
                        z24 = z24;
                        c28676v0 = c28676v0;
                        i19 = i18;
                        c28655q = c28655q3;
                        interfaceC28601c2 = interfaceC28601c2;
                        interfaceC28601c1 = interfaceC28601c1;
                        c28655q.m87150e0(1667184306);
                        c28655q.m87173q(false);
                    }
                    if (m90377I0(interfaceC28601c2)) {
                        c28655q.m87150e0(1300709342);
                        c39756cM85990h = viewState.getInitialScreen().getEndPlanDialogViewState();
                        if (c39756cM85990h == null) {
                            c28655q.m87150e0(1667283939);
                            c28655q.m87173q(z27);
                            c28655q2 = c28655q;
                        } else {
                            c28655q.m87150e0(1667283940);
                            EnumC29521c0 enumC29521c1 = EnumC29521c0.END_PLAN;
                            String strM85998p2 = viewState.getInitialScreen().getPlanId();
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C29534p(1, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            m90381K0(c39756cM85990h, enumC29521c1, strM85998p2, onViewEvent, onNavigationEvent, (InterfaceC4339a) objM87133R9, c28655q, (i15 & 7168) | TextResource.$stable | 196656 | i19, 0);
                            c28655q2 = c28655q;
                            c28655q2.m87173q(z27);
                        }
                        c28655q2.m87173q(z27);
                    } else {
                        c28655q2 = c28655q;
                        c28655q2.m87150e0(1667641618);
                        c28655q2.m87173q(z27);
                    }
                    InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c2;
                    C35666g c35666gM90422h0 = m90422h0(interfaceC28601c5);
                    AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i || objM87133R8 == c28676v0) {
                        objM87133R8 = new C2028s(interfaceC2994c0, aVar, 6);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    C28655q c28655q4 = c28655q2;
                    AbstractC35660d.m112871m(modifierM3407d, c35666gM90422h0, aVar, null, (InterfaceC4339a) objM87133R8, null, null, AbstractC37817c.m121344e(-1180219486, c28655q2, new C29535q(interfaceC28601c6, 0)), false, bVar, null, null, false, null, AbstractC37817c.m121344e(-96302242, c28655q4, new C14074l(viewState, onNavigationEvent, onViewEvent, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c6, interfaceC28601c5, interfaceC28601c3, interfaceC28601c7)), c28655q4, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                    c28655q3 = c28655q4;
                    z17 = z28;
                    z18 = z24;
                } else {
                    c28655q3.m87138X();
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(viewState, z17, z18, onViewEvent, onNavigationEvent, i13, i14, 12);
                }
            }
            i15 |= 384;
            z15 = z13;
            if ((i13 & 3072) == 0) {
                if (c28655q3.m87157i(onViewEvent)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i25;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q3.m87157i(onNavigationEvent)) {
                    i24 = 16384;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z16)) {
                if (i27 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                objM87133R = c28655q3.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z19, c28655q3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC31061c.m95647w(z24, c28655q3);
                }
                InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R4);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
                interfaceC28601c2 = interfaceC28601c9;
                aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6));
                objM87133R5 = c28655q3.m87133R();
                textResource = null;
                objArr = 0;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i26, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q3.m87172p0(objM87133R5);
                }
                InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87133R6);
                }
                InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R6;
                boolean zM87157i3 = c28655q3.m87157i(viewState);
                i18 = 57344 & i15;
                if (i18 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zM87157i3 | z25;
                objM87133R7 = c28655q3.m87133R();
                if (z26) {
                    objM87133R7 = new C29533o(viewState, onNavigationEvent, interfaceC28601c1, 0);
                    c28655q3.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C29533o(viewState, onNavigationEvent, interfaceC28601c1, 0);
                    c28655q3.m87172p0(objM87133R7);
                }
                z27 = false;
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, false, c28655q3, 0, 1);
                if (m90373G0(interfaceC28601c1)) {
                    c28655q3.m87150e0(1300694156);
                    c39756cM86004v = viewState.getInitialScreen().getUnsavedChangesDialogViewState();
                    if (c39756cM86004v == null) {
                        c28655q3.m87150e0(1666813173);
                        c28655q3.m87173q(false);
                        z28 = z19;
                        i19 = i18;
                        c28655q = c28655q3;
                    } else {
                        c28655q3.m87150e0(1666813174);
                        boolean z210 = z19;
                        EnumC29521c0 enumC29521c2 = EnumC29521c0.UNSAVED_CHANGES;
                        String strM85998p3 = viewState.getInitialScreen().getPlanId();
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C29534p(0, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R10);
                        }
                        z28 = z210;
                        c28655q = c28655q3;
                        i19 = i18;
                        z27 = false;
                        m90381K0(c39756cM86004v, enumC29521c2, strM85998p3, onViewEvent, onNavigationEvent, (InterfaceC4339a) objM87133R10, c28655q, (i15 & 7168) | TextResource.$stable | 196656 | i18, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z27);
                } else {
                    z28 = z19;
                    z24 = z24;
                    c28676v0 = c28676v0;
                    i19 = i18;
                    c28655q = c28655q3;
                    interfaceC28601c2 = interfaceC28601c2;
                    interfaceC28601c1 = interfaceC28601c1;
                    c28655q.m87150e0(1667184306);
                    c28655q.m87173q(false);
                }
                if (m90377I0(interfaceC28601c2)) {
                    c28655q.m87150e0(1300709342);
                    c39756cM85990h = viewState.getInitialScreen().getEndPlanDialogViewState();
                    if (c39756cM85990h == null) {
                        c28655q.m87150e0(1667283939);
                        c28655q.m87173q(z27);
                        c28655q2 = c28655q;
                    } else {
                        c28655q.m87150e0(1667283940);
                        EnumC29521c0 enumC29521c3 = EnumC29521c0.END_PLAN;
                        String strM85998p4 = viewState.getInitialScreen().getPlanId();
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29534p(1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        m90381K0(c39756cM85990h, enumC29521c3, strM85998p4, onViewEvent, onNavigationEvent, (InterfaceC4339a) objM87133R9, c28655q, (i15 & 7168) | TextResource.$stable | 196656 | i19, 0);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(z27);
                    }
                    c28655q2.m87173q(z27);
                } else {
                    c28655q2 = c28655q;
                    c28655q2.m87150e0(1667641618);
                    c28655q2.m87173q(z27);
                }
                InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c2;
                C35666g c35666gM90422h1 = m90422h0(interfaceC28601c10);
                AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new C2028s(interfaceC2994c0, aVar, 6);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C2028s(interfaceC2994c0, aVar, 6);
                    c28655q2.m87172p0(objM87133R8);
                }
                C28655q c28655q5 = c28655q2;
                AbstractC35660d.m112871m(modifierM3407d2, c35666gM90422h1, aVar, null, (InterfaceC4339a) objM87133R8, null, null, AbstractC37817c.m121344e(-1180219486, c28655q2, new C29535q(interfaceC28601c11, 0)), false, bVar2, null, null, false, null, AbstractC37817c.m121344e(-96302242, c28655q5, new C14074l(viewState, onNavigationEvent, onViewEvent, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c11, interfaceC28601c10, interfaceC28601c8, interfaceC28601c12)), c28655q5, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                c28655q3 = c28655q5;
                z17 = z28;
                z18 = z24;
            } else {
                c28655q3.m87138X();
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, z17, z18, onViewEvent, onNavigationEvent, i13, i14, 12);
            }
        }
        i15 |= 48;
        z14 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z15 = z13;
                if (c28655q3.m87155h(z15)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q3.m87157i(onViewEvent)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i25;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q3.m87157i(onNavigationEvent)) {
                    i24 = 16384;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z16)) {
                if (i27 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                objM87133R = c28655q3.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z19, c28655q3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC31061c.m95647w(z24, c28655q3);
                }
                InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R4);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
                interfaceC28601c2 = interfaceC28601c14;
                aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6));
                objM87133R5 = c28655q3.m87133R();
                textResource = null;
                objArr = 0;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i26, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q3.m87172p0(objM87133R5);
                }
                InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87133R6);
                }
                InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) objM87133R6;
                boolean zM87157i4 = c28655q3.m87157i(viewState);
                i18 = 57344 & i15;
                if (i18 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zM87157i4 | z25;
                objM87133R7 = c28655q3.m87133R();
                if (z26) {
                    objM87133R7 = new C29533o(viewState, onNavigationEvent, interfaceC28601c1, 0);
                    c28655q3.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C29533o(viewState, onNavigationEvent, interfaceC28601c1, 0);
                    c28655q3.m87172p0(objM87133R7);
                }
                z27 = false;
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, false, c28655q3, 0, 1);
                if (m90373G0(interfaceC28601c1)) {
                    c28655q3.m87150e0(1300694156);
                    c39756cM86004v = viewState.getInitialScreen().getUnsavedChangesDialogViewState();
                    if (c39756cM86004v == null) {
                        c28655q3.m87150e0(1666813173);
                        c28655q3.m87173q(false);
                        z28 = z19;
                        i19 = i18;
                        c28655q = c28655q3;
                    } else {
                        c28655q3.m87150e0(1666813174);
                        boolean z211 = z19;
                        EnumC29521c0 enumC29521c4 = EnumC29521c0.UNSAVED_CHANGES;
                        String strM85998p5 = viewState.getInitialScreen().getPlanId();
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C29534p(0, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R10);
                        }
                        z28 = z211;
                        c28655q = c28655q3;
                        i19 = i18;
                        z27 = false;
                        m90381K0(c39756cM86004v, enumC29521c4, strM85998p5, onViewEvent, onNavigationEvent, (InterfaceC4339a) objM87133R10, c28655q, (i15 & 7168) | TextResource.$stable | 196656 | i18, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z27);
                } else {
                    z28 = z19;
                    z24 = z24;
                    c28676v0 = c28676v0;
                    i19 = i18;
                    c28655q = c28655q3;
                    interfaceC28601c2 = interfaceC28601c2;
                    interfaceC28601c1 = interfaceC28601c1;
                    c28655q.m87150e0(1667184306);
                    c28655q.m87173q(false);
                }
                if (m90377I0(interfaceC28601c2)) {
                    c28655q.m87150e0(1300709342);
                    c39756cM85990h = viewState.getInitialScreen().getEndPlanDialogViewState();
                    if (c39756cM85990h == null) {
                        c28655q.m87150e0(1667283939);
                        c28655q.m87173q(z27);
                        c28655q2 = c28655q;
                    } else {
                        c28655q.m87150e0(1667283940);
                        EnumC29521c0 enumC29521c5 = EnumC29521c0.END_PLAN;
                        String strM85998p6 = viewState.getInitialScreen().getPlanId();
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C29534p(1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        m90381K0(c39756cM85990h, enumC29521c5, strM85998p6, onViewEvent, onNavigationEvent, (InterfaceC4339a) objM87133R9, c28655q, (i15 & 7168) | TextResource.$stable | 196656 | i19, 0);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(z27);
                    }
                    c28655q2.m87173q(z27);
                } else {
                    c28655q2 = c28655q;
                    c28655q2.m87150e0(1667641618);
                    c28655q2.m87173q(z27);
                }
                InterfaceC28601c1 interfaceC28601c17 = interfaceC28601c2;
                C35666g c35666gM90422h2 = m90422h0(interfaceC28601c15);
                AbstractC27274q.b bVar3 = AbstractC27274q.b.f109138f;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new C2028s(interfaceC2994c0, aVar, 6);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C2028s(interfaceC2994c0, aVar, 6);
                    c28655q2.m87172p0(objM87133R8);
                }
                C28655q c28655q6 = c28655q2;
                AbstractC35660d.m112871m(modifierM3407d3, c35666gM90422h2, aVar, null, (InterfaceC4339a) objM87133R8, null, null, AbstractC37817c.m121344e(-1180219486, c28655q2, new C29535q(interfaceC28601c16, 0)), false, bVar3, null, null, false, null, AbstractC37817c.m121344e(-96302242, c28655q6, new C14074l(viewState, onNavigationEvent, onViewEvent, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c16, interfaceC28601c15, interfaceC28601c13, interfaceC28601c17)), c28655q6, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                c28655q3 = c28655q6;
                z17 = z28;
                z18 = z24;
            } else {
                c28655q3.m87138X();
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(viewState, z17, z18, onViewEvent, onNavigationEvent, i13, i14, 12);
            }
        }
        i15 |= 384;
        z15 = z13;
        if ((i13 & 3072) == 0) {
            if (c28655q3.m87157i(onViewEvent)) {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i25;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q3.m87157i(onNavigationEvent)) {
                i24 = 16384;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i24;
        }
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z16)) {
            if (i27 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i16 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            objM87133R = c28655q3.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c18 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(z19, c28655q3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q3.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC31061c.m95647w(z24, c28655q3);
            }
            InterfaceC28601c1 interfaceC28601c19 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q3.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87262p(c28655q3);
                c28655q3.m87172p0(objM87133R4);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
            interfaceC28601c2 = interfaceC28601c19;
            aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6));
            objM87133R5 = c28655q3.m87133R();
            textResource = null;
            objArr = 0;
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i26, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                c28655q3.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c110 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q3.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(null);
                c28655q3.m87172p0(objM87133R6);
            }
            InterfaceC28601c1 interfaceC28601c111 = (InterfaceC28601c1) objM87133R6;
            boolean zM87157i5 = c28655q3.m87157i(viewState);
            i18 = 57344 & i15;
            if (i18 == 16384) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = zM87157i5 | z25;
            objM87133R7 = c28655q3.m87133R();
            if (z26) {
                objM87133R7 = new C29533o(viewState, onNavigationEvent, interfaceC28601c1, 0);
                c28655q3.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C29533o(viewState, onNavigationEvent, interfaceC28601c1, 0);
                c28655q3.m87172p0(objM87133R7);
            }
            z27 = false;
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, false, c28655q3, 0, 1);
            if (m90373G0(interfaceC28601c1)) {
                c28655q3.m87150e0(1300694156);
                c39756cM86004v = viewState.getInitialScreen().getUnsavedChangesDialogViewState();
                if (c39756cM86004v == null) {
                    c28655q3.m87150e0(1666813173);
                    c28655q3.m87173q(false);
                    z28 = z19;
                    i19 = i18;
                    c28655q = c28655q3;
                } else {
                    c28655q3.m87150e0(1666813174);
                    boolean z212 = z19;
                    EnumC29521c0 enumC29521c6 = EnumC29521c0.UNSAVED_CHANGES;
                    String strM85998p7 = viewState.getInitialScreen().getPlanId();
                    objM87133R10 = c28655q3.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C29534p(0, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R10);
                    }
                    z28 = z212;
                    c28655q = c28655q3;
                    i19 = i18;
                    z27 = false;
                    m90381K0(c39756cM86004v, enumC29521c6, strM85998p7, onViewEvent, onNavigationEvent, (InterfaceC4339a) objM87133R10, c28655q, (i15 & 7168) | TextResource.$stable | 196656 | i18, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z27);
            } else {
                z28 = z19;
                z24 = z24;
                c28676v0 = c28676v0;
                i19 = i18;
                c28655q = c28655q3;
                interfaceC28601c2 = interfaceC28601c2;
                interfaceC28601c1 = interfaceC28601c1;
                c28655q.m87150e0(1667184306);
                c28655q.m87173q(false);
            }
            if (m90377I0(interfaceC28601c2)) {
                c28655q.m87150e0(1300709342);
                c39756cM85990h = viewState.getInitialScreen().getEndPlanDialogViewState();
                if (c39756cM85990h == null) {
                    c28655q.m87150e0(1667283939);
                    c28655q.m87173q(z27);
                    c28655q2 = c28655q;
                } else {
                    c28655q.m87150e0(1667283940);
                    EnumC29521c0 enumC29521c7 = EnumC29521c0.END_PLAN;
                    String strM85998p8 = viewState.getInitialScreen().getPlanId();
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C29534p(1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    m90381K0(c39756cM85990h, enumC29521c7, strM85998p8, onViewEvent, onNavigationEvent, (InterfaceC4339a) objM87133R9, c28655q, (i15 & 7168) | TextResource.$stable | 196656 | i19, 0);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(z27);
                }
                c28655q2.m87173q(z27);
            } else {
                c28655q2 = c28655q;
                c28655q2.m87150e0(1667641618);
                c28655q2.m87173q(z27);
            }
            InterfaceC28601c1 interfaceC28601c112 = interfaceC28601c2;
            C35666g c35666gM90422h3 = m90422h0(interfaceC28601c110);
            AbstractC27274q.b bVar4 = AbstractC27274q.b.f109138f;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
            objM87133R8 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R8 = new C2028s(interfaceC2994c0, aVar, 6);
                c28655q2.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C2028s(interfaceC2994c0, aVar, 6);
                c28655q2.m87172p0(objM87133R8);
            }
            C28655q c28655q7 = c28655q2;
            AbstractC35660d.m112871m(modifierM3407d4, c35666gM90422h3, aVar, null, (InterfaceC4339a) objM87133R8, null, null, AbstractC37817c.m121344e(-1180219486, c28655q2, new C29535q(interfaceC28601c111, 0)), false, bVar4, null, null, false, null, AbstractC37817c.m121344e(-96302242, c28655q7, new C14074l(viewState, onNavigationEvent, onViewEvent, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c111, interfaceC28601c110, interfaceC28601c18, interfaceC28601c112)), c28655q7, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
            c28655q3 = c28655q7;
            z17 = z28;
            z18 = z24;
        } else {
            c28655q3.m87138X();
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(viewState, z17, z18, onViewEvent, onNavigationEvent, i13, i14, 12);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private static final boolean m90420g0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h0 */
    private static final C35666g m90422h0(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m90424i0(InterfaceC28601c1 interfaceC28601c1, C35666g c35666g) {
        interfaceC28601c1.setValue(c35666g);
    }

    /* JADX INFO: renamed from: j0 */
    private static final C14063a m90426j0(InterfaceC28601c1 interfaceC28601c1) {
        return (C14063a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m90428k0(InterfaceC28601c1 interfaceC28601c1, C14063a c14063a) {
        interfaceC28601c1.setValue(c14063a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m90430l0(AbstractC28344m.i iVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        int i13 = 1;
        if (iVar.getInitialScreen().getUnsavedChangesDialogViewState() == null || !iVar.getInitialScreen().getIsCustomized()) {
            function1.invoke(new AbstractC25946g.b(null, i13, 0 == true ? 1 : 0));
        } else {
            m90375H0(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m90432m0(InterfaceC28601c1 interfaceC28601c1) {
        m90375H0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m90434n0(InterfaceC28601c1 interfaceC28601c1) {
        m90379J0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m90436o0(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m90438p0(InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C14063a c14063aM90426j0 = m90426j0(interfaceC28601c1);
            if (c14063aM90426j0 == null) {
                c28655q.m87150e0(-1316378659);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1316378658);
                AbstractC30593b.m93841e(c14063aM90426j0, c28655q, C14063a.f50430f);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    private static final void m90440q0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m90442r0(AbstractC28344m.i iVar, Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, Composer composer, int i13) {
        Modifier modifierM44008S;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87150e0(1942828775);
            AbstractC22403o abstractC22403oM85994l = iVar.getInitialScreen().getHeaderImage();
            C2314t c2314t = C2314t.f9131w;
            if (abstractC22403oM85994l != null) {
                c28655q.m87150e0(840935378);
                modifierM44008S = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(841045800);
                c28655q.m87173q(false);
                modifierM44008S = AbstractC15673b0.m44008S(c2314t);
            }
            c28655q.m87173q(false);
            if (AbstractC8693b.m21270d(iVar.getInitialScreen().getExplanationTitle())) {
                modifierM44008S = m90399T0(modifierM44008S);
            }
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, modifierM44008S));
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22403o abstractC22403oM85994l2 = iVar.getInitialScreen().getHeaderImage();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (abstractC22403oM85994l2 == null) {
                c28655q.m87150e0(-116047645);
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(iVar.getInitialScreen().getNavTitle(), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32760, null);
                boolean zM87157i = c28655q.m87157i(iVar) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C29533o(iVar, function1, interfaceC28601c1, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-115114514);
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC12250f.m34129b(AbstractC1136a.m3599a(c2314t, "contentLazyColumn"), iVar.getScreenContextMetadata(), false, c28655q, (C13404j.f46947x << 3) | 6, 2));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, true, 1.0f);
            boolean zM87157i2 = c28655q.m87157i(iVar) | c28655q.m87153g(function1) | c28655q.m87153g(function2) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C3424a0 c3424a0 = new C3424a0((Object) iVar, (Object) function1, (Object) function2, (Object) interfaceC2994c0, (Object) aVar, interfaceC28601c2, interfaceC28601c3, 11);
                c28655q.m87172p0(c3424a0);
                objM87133R2 = c3424a0;
            }
            C28655q c28655q2 = c28655q;
            AbstractC22674j.m65717c(modifierM31988g, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q2, 0, 510);
            C28655q c28655q3 = c28655q2;
            Object objM87133R3 = c28655q3.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C29536r(interfaceC28601c4, 0);
                c28655q3.m87172p0(objM87133R3);
            }
            Function1 function3 = (Function1) objM87133R3;
            Object objM87133R4 = c28655q3.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C29536r(interfaceC28601c5, 1);
                c28655q3.m87172p0(objM87133R4);
            }
            m90400U(iVar, function3, (Function1) objM87133R4, function2, c28655q3, 432);
            if (!m90420g0(interfaceC28601c4) || iVar.getInitialScreen().getCustomizePlanDialogViewState() == null) {
                c28655q3.m87150e0(-106563474);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-109107799);
                TextResource textResourceM127177d = iVar.getInitialScreen().getCustomizePlanDialogViewState().getTitle();
                TextResource textResourceM127176c = iVar.getInitialScreen().getCustomizePlanDialogViewState().getDescription();
                TextResource textResourceM127174a = iVar.getInitialScreen().getCustomizePlanDialogViewState().getButtonConfirmTitle();
                TextResource textResourceM127175b = iVar.getInitialScreen().getCustomizePlanDialogViewState().getButtonRejectTitle();
                Object objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C29534p(2, interfaceC28601c4);
                    c28655q3.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
                boolean zM87153g = c28655q3.m87153g(function2) | c28655q3.m87157i(iVar);
                Object objM87133R6 = c28655q3.m87133R();
                if (zM87153g || objM87133R6 == c28676v0) {
                    objM87133R6 = new C29533o(function2, iVar, interfaceC28601c4, 2);
                    c28655q3.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                boolean zM87153g2 = c28655q3.m87153g(function2) | c28655q3.m87157i(iVar);
                Object objM87133R7 = c28655q3.m87133R();
                if (zM87153g2 || objM87133R7 == c28676v0) {
                    objM87133R7 = new C29533o(function2, iVar, interfaceC28601c4, 3);
                    c28655q3.m87172p0(objM87133R7);
                }
                int i14 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM127177d, textResourceM127176c, textResourceM127174a, false, null, null, null, null, textResourceM127175b, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R7, null, null, null, c28655q3, (i14 << 3) | (i14 << 6) | (i14 << 9) | (i14 << 27), 0, 384, 239074801);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m90444s0(AbstractC28344m.i iVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        int i13 = 1;
        if (iVar.getInitialScreen().getUnsavedChangesDialogViewState() == null || !iVar.getInitialScreen().getIsCustomized()) {
            function1.invoke(new AbstractC25946g.b(null, i13, 0 == true ? 1 : 0));
        } else {
            m90375H0(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m90446t0(AbstractC28344m.i iVar, Function1 function1, final Function1 function2, final InterfaceC2994c0 interfaceC2994c0, final AbstractC35664f.a aVar, final InterfaceC28601c1 interfaceC28601c1, final InterfaceC28601c1 interfaceC28601c2, InterfaceC26064q LazyColumn) {
        final Function1 function3;
        final AbstractC28344m.i iVar2 = iVar;
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        if (iVar2.getInitialScreen().getHeaderImage() == null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C29535q(iVar2, 1), true, -1626726140), 3);
            function3 = function1;
        } else {
            function3 = function1;
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C28119c(5, iVar2, function3), true, -1017933363), 3);
        }
        Iterator<InterfaceC25312u> it = iVar2.getInitialScreen().m85995m().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (it.next() instanceof C30612r) {
                break;
            }
            i13++;
        }
        final int i14 = i13;
        final int i15 = 0;
        for (Object obj : iVar2.getInitialScreen().m85995m()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            final InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: pt2.s
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC29540v.m90454x0(interfaceC25312u, i15, i14, function2, function3, interfaceC2994c0, aVar, iVar2, interfaceC28601c1, interfaceC28601c2, (InterfaceC1103a) obj2, (Composer) obj3, iIntValue);
                }
            }, true, -487583019), 3);
            iVar2 = iVar;
            function3 = function1;
            i15 = i16;
        }
        InterfaceC26064q.m77556b(LazyColumn, null, C29518b.f120155a.m90215b(), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m90448u0(AbstractC28344m.i iVar, InterfaceC1103a item, Composer composer, int i13) {
        float f13;
        C2314t c2314t;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f14 = 8;
            float f15 = 2 * f14;
            C2314t c2314t2 = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t2));
            if (iVar.getInitialScreen().getCurrentPlanTitle() != null) {
                c28655q.m87150e0(-1682263455);
                String strM21274h = AbstractC8693b.m21274h(iVar.getInitialScreen().getCurrentPlanTitle(), c28655q, TextResource.$stable);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, 3 * f14, 0.0f, 2);
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                c2314t = c2314t2;
                f13 = f14;
                AbstractC30795n.m94707h(strM21274h, modifierM3396r, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH5(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                AbstractC31061c.m95650z(1, f13, c2314t, c28655q, false);
            } else {
                f13 = f14;
                c2314t = c2314t2;
                c28655q.m87150e0(-1681774306);
                c28655q.m87173q(false);
            }
            TextResource textResourceM85993k = iVar.getInitialScreen().getHeaderDisplay();
            int i15 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM85993k, c28655q, i15);
            float f16 = 3 * f13;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2);
            C38072d c38072d2 = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d2.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8417O = c38072d2.m121952e(c28655q, i16).getT2();
            int i17 = C2886a.f11498d << 18;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM21274h2, modifierM3396r2, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 48, i17, 196600);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(1 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(iVar.getInitialScreen().getSubTitle(), c28655q2, i15), AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2), c38072d2.m121949b(c28655q2, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i16).getB1(), null, c28655q2, 48, i17, 196600);
            m90396S(AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2), iVar.getInitialScreen(), c28655q2, 6, 0);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m90450v0(AbstractC28344m.i iVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C28347p c28347pM85969c = iVar.getInitialScreen();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C29520c(function1, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC30609o.m93933f(C2314t.f9131w, c28347pM85969c, (Function1) objM87133R, c28655q, 6, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m90452w0(Function1 function1, AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m90454x0(InterfaceC25312u interfaceC25312u, int i13, int i14, Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, AbstractC28344m.i iVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC1103a item, Composer composer, int i15) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 17) != 16)) {
            boolean z4 = interfaceC25312u instanceof C30607m;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(-6256189);
                AbstractC25012a.m73389v(c2314t, (i13 == 0 ? 2 : 4) * 8, c28655q, false);
            } else {
                c28655q.m87150e0(-6114333);
                AbstractC31061c.m95650z(3, 4, c2314t, c28655q, false);
            }
            if (i13 == i14) {
                c28655q.m87150e0(-5939555);
                float f13 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, ((float) 2.5d) * f13, 0.0f, 2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                float f14 = 1 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                AbstractC30614t.m93977b(iVar.getMetricSelectionScreen().m86012e(), c28655q, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-5555155);
                c28655q.m87173q(false);
            }
            C25307p c25307pM85891b = AbstractC28336e.m85891b();
            C26970r0 c26970r0 = new C26970r0(23);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(function2) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                C1008b c1008b = new C1008b((Object) function1, (Object) function2, (Object) interfaceC2994c0, (Object) aVar, interfaceC28601c1, interfaceC28601c2, 18);
                c28655q.m87172p0(c1008b);
                objM87133R = c1008b;
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM85891b, c26970r0, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Modifier m90456y0(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1935144379);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, ((float) 2.5d) * 8, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m90458z0(Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC27131a) {
            function1.invoke(event);
        } else if (event instanceof AbstractC25946g) {
            if (event instanceof AbstractC25946g.g) {
                function1.invoke(new AbstractC27131a.q(((AbstractC25946g.g) event).getTargetGoalType()));
            }
            function2.invoke(event);
        } else if (event instanceof C14063a) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(event, aVar, interfaceC28601c1, interfaceC28601c2, null), 3);
        }
        return C23454a0.f92919a;
    }
}
