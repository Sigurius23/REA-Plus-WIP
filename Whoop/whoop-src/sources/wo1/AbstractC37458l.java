package wo1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import bm2.C3478v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import kotlin.C2040y;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15199y3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so1.C32818i;
import so1.C32820j;
import so1.C32822k;
import so1.C32831o0;
import ud0.C34789b;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: wo1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a[\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lso1/i;", "state", "Lg1/y3;", "modalBottomSheetState", "Lkotlin/Function1;", "", "Ll83/a0;", "onEditClick", "Lkotlin/Function0;", "onHideClick", "", "onUnhideClick", "g", "(Lso1/i;Lg1/y3;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37458l {

    /* JADX INFO: renamed from: wo1.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.components.EditCycleBottomSheetKt$EditCycleBottomSheet$1$1$1", m100430f = "EditCycleBottomSheet.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160283w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f160284x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160284x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f160284x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160283w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f160284x;
                this.f160283w = 1;
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

    /* JADX INFO: renamed from: wo1.l$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f160285w = new b();

        /* JADX INFO: renamed from: a */
        public final long m120016a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m120016a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wo1.l$c */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.components.EditCycleBottomSheetKt$EditCycleBottomSheet$2$1$1$2$1$1", m100430f = "EditCycleBottomSheet.kt", m100431l = {71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160286w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f160287x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160287x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f160287x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160286w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f160287x;
                this.f160286w = 1;
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

    /* JADX INFO: renamed from: wo1.l$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f160288w = new d();

        /* JADX INFO: renamed from: a */
        public final long m120017a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m120017a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wo1.l$e */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.components.EditCycleBottomSheetKt$EditCycleBottomSheet$2$1$2$2$1$1", m100430f = "EditCycleBottomSheet.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160289w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f160290x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15199y3 c15199y3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160290x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f160290x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160289w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f160290x;
                this.f160289w = 1;
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

    /* JADX INFO: renamed from: wo1.l$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f160291w = new f();

        /* JADX INFO: renamed from: a */
        public final long m120018a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m120018a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wo1.l$g */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.components.EditCycleBottomSheetKt$EditCycleBottomSheet$2$1$3$2$1$1", m100430f = "EditCycleBottomSheet.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160292w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f160293x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C15199y3 c15199y3, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160293x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f160293x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160292w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f160293x;
                this.f160292w = 1;
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

    /* JADX INFO: renamed from: g */
    public static final void m120009g(C32818i state, C15199y3 modalBottomSheetState, Function1 onEditClick, InterfaceC4339a onHideClick, Function1 onUnhideClick, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(modalBottomSheetState, "modalBottomSheetState");
        AbstractC22676k.m65750j(onEditClick, "onEditClick");
        AbstractC22676k.m65750j(onHideClick, "onHideClick");
        AbstractC22676k.m65750j(onUnhideClick, "onUnhideClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-624463645);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(modalBottomSheetState) : c28655q2.m87157i(modalBottomSheetState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onEditClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onHideClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onUnhideClick) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "EditCycleBottomSheetTag");
            C35666g c35666g = new C35666g(null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, null), null, null, null, 0.0f, 0.0f, 125, null);
            AbstractC35664f.a aVar = new AbstractC35664f.a(modalBottomSheetState);
            boolean zM87157i = c28655q2.m87157i(interfaceC2994c0) | ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q2.m87157i(modalBottomSheetState)));
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C3196h(interfaceC2994c0, modalBottomSheetState, 26);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC35660d.m112871m(modifierM3599a, c35666g, aVar, null, (InterfaceC4339a) objM87133R2, null, null, AbstractC37817c.m121344e(116185233, c28655q2, new C2040y(state, interfaceC2994c0, modalBottomSheetState, onEditClick, onHideClick, onUnhideClick)), false, null, null, null, false, null, C37436a.f160244a.m119845b(), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6), 24576, 16232);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34789b(state, modalBottomSheetState, onEditClick, onHideClick, onUnhideClick, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m120010h(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m120011i(C32818i c32818i, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 4;
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, f13 * 8, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9110M, c28655q, 6);
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
            C32820j editOption = c32818i.getEditOption();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (editOption == null) {
                c28655q.m87150e0(7632487);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(7632488);
                TextResource display = editOption.getDisplay();
                C39274g c39274g = new C39274g(AbstractC25012a.m73365A(C38072d.f163053a), null, 2, null);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = b.f160285w;
                    c28655q.m87172p0(objM87133R);
                }
                DefaultConstructorMarker defaultConstructorMarker = null;
                C39282o c39282o = new C39282o(null, display, null, false, false, new AbstractC39279l.b(null, null, c39274g, p745y81.Function1.m125323a((Function1) objM87133R), null, null, null, null, null, null, null, false, 4083, defaultConstructorMarker), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32733, defaultConstructorMarker);
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function1) | c28655q.m87157i(editOption);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    C27198e c27198e = new C27198e((Object) interfaceC2994c0, function1, (Object) editOption, (Object) c15199y3, 21);
                    c28655q.m87172p0(c27198e);
                    objM87133R2 = c27198e;
                }
                AbstractC39281n.m125207c(null, c39282o, (InterfaceC4339a) objM87133R2, c28655q, C39282o.f168987q << 3, 1);
                c28655q.m87173q(false);
            }
            C32822k hideOption = c32818i.getHideOption();
            if (hideOption == null) {
                c28655q.m87150e0(8321896);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(8321897);
                TextResource display2 = hideOption.getDisplay();
                C39274g c39274g2 = new C39274g(C38072d.f163053a.m121951d().getVarious().getStealthMode(), 0, 2, r11);
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = d.f160288w;
                    c28655q.m87172p0(objM87133R3);
                }
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                C39282o c39282o2 = new C39282o(null, display2, null, false, false, new AbstractC39279l.b(null, null, c39274g2, p745y81.Function1.m125323a((Function1) objM87133R3), null, null, null, null, null, null, null, false, 4083, defaultConstructorMarker2), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32733, defaultConstructorMarker2);
                boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(interfaceC4339a);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C3478v(interfaceC2994c0, interfaceC4339a, c15199y3);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC39281n.m125207c(null, c39282o2, (InterfaceC4339a) objM87133R4, c28655q, C39282o.f168987q << 3, 1);
                c28655q.m87173q(false);
            }
            C32831o0 unhideOption = c32818i.getUnhideOption();
            if (unhideOption == null) {
                c28655q.m87150e0(9012452);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(9012453);
                TextResource display3 = unhideOption.getDisplay();
                C39274g c39274g3 = new C39274g(C38072d.f163053a.m121951d().getVarious().getPrivacy(), r11, r10, r11);
                Object objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = f.f160291w;
                    c28655q.m87172p0(objM87133R5);
                }
                DefaultConstructorMarker defaultConstructorMarker3 = null;
                C39282o c39282o3 = new C39282o(null, display3, null, false, false, new AbstractC39279l.b(null, null, c39274g3, p745y81.Function1.m125323a((Function1) objM87133R5), null, null, null, null, null, null, null, false, 4083, defaultConstructorMarker3), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32733, defaultConstructorMarker3);
                boolean zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function2) | c28655q.m87157i(unhideOption);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i3 || objM87133R6 == c28676v0) {
                    C27198e c27198e2 = new C27198e((Object) interfaceC2994c0, function2, (Object) unhideOption, (Object) c15199y3, 22);
                    c28655q.m87172p0(c27198e2);
                    objM87133R6 = c27198e2;
                }
                AbstractC39281n.m125207c(null, c39282o3, (InterfaceC4339a) objM87133R6, c28655q, C39282o.f168987q << 3, 1);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m120012j(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C32820j c32820j, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c15199y3, null), 3);
        function1.invoke(c32820j.getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m120013k(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c15199y3, null), 3);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m120014l(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C32831o0 c32831o0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new g(c15199y3, null), 3);
        function1.invoke(c32831o0.m103025b());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m120015m(C32818i c32818i, C15199y3 c15199y3, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, Composer composer, int i14) {
        m120009g(c32818i, c15199y3, function1, interfaceC4339a, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
