package ve0;

import a81.C0556g;
import a81.C0563n;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.InAppBrowserScreenModel;
import com.whoop.profile.view.edit.avatar.C9768a;
import com.whoop.whoopaction.domain.models.Action;
import e81.C12840n;
import ej1.C13258u;
import fy1.AbstractC14874j;
import gb1.AbstractC15674c;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import j21.AbstractC21243b;
import java.util.List;
import kd0.C22383c;
import kd0.InterfaceC22381a;
import kf0.AbstractC22431f;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lf0.C23908d1;
import lf0.C23943m0;
import md0.AbstractC25448c;
import md0.AbstractC25450e;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p733ry2.C31915d;
import p734sl0.C32632k2;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p739ui0.C35015q;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s01.C32048d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se0.AbstractC32419a;
import te0.AbstractC33747f;
import te0.AbstractC33749h;
import te0.C33743b;
import te0.C33744c;
import te0.C33746e;
import uf0.C34904e;
import uv0.AbstractC35283c;
import uz1.C35429g;
import v01.C35509k;
import v31.C35608d;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35657b0;
import v41.C35666g;
import v90.C35813e;
import vw2.C36548c;
import wb3.AbstractC37056f;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ve0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lte0/h;", "viewState", "Lkotlin/Function1;", "Lse0/a;", "Ll83/a0;", "onNavigationEvent", "Lkd0/a$c;", "onAnalyticsEvent", "", "onViewEvent", "P", "(Lte0/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lte0/h$e;", "b0", "(Lte0/h$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_EVENT, "i0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onShowBottomSheet", "E", "(Lte0/h$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lte0/c;", "Lte0/b;", "onClick", "B", "(Lte0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkd0/c$b;", "dialogFromButton", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35927e {

    /* JADX INFO: renamed from: ve0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f152997w = new a();

        /* JADX INFO: renamed from: a */
        public final long m114163a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m114163a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ve0.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.view.TestResultsScreenKt$TestResultsScreen$10$1", m100430f = "TestResultsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152998w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f152999x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC33749h f153000y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, AbstractC33749h abstractC33749h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152999x = function1;
            this.f153000y = abstractC33749h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f152999x, this.f153000y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152998w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f152999x.invoke(new InterfaceC22381a.g1(((AbstractC33749h.e) this.f153000y).getAnalyticsData()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ve0.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.view.TestResultsScreenKt$TestResultsSuccess$2$1$1$1$1", m100430f = "TestResultsScreen.kt", m100431l = {212}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153001w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f153002x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153002x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f153002x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153001w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f153002x;
                this.f153001w = 1;
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

    /* JADX INFO: renamed from: ve0.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.view.TestResultsScreenKt$TestResultsSuccess$3$1$1$1", m100430f = "TestResultsScreen.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153003w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f153004x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15199y3 c15199y3, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153004x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f153004x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153003w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f153004x;
                this.f153003w = 1;
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

    /* JADX INFO: renamed from: B */
    public static final void m114103B(C33744c viewState, Function1 onClick, Composer composer, int i13) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-181778015);
        int i14 = 2;
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = 4;
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 8 * f13, 7);
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
            c28655q.m87150e0(-1483410300);
            for (C33743b c33743b : viewState.m106638a()) {
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c33743b.getTitle());
                EnumC16313m0 enumC16313m0M106635d = c33743b.getIcon();
                C39274g c39274g = enumC16313m0M106635d != null ? new C39274g(enumC16313m0M106635d.toWhoopIcon(), null, i14, false ? 1 : 0) : null;
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                Object obj = objM87133R;
                if (objM87133R == c28676v0) {
                    a aVar = a.f152997w;
                    c28655q.m87172p0(aVar);
                    obj = aVar;
                }
                DefaultConstructorMarker defaultConstructorMarker = null;
                C39282o c39282o = new C39282o(null, textResourceM21278l, null, false, false, new AbstractC39279l.b(AbstractC8693b.m21278l(c33743b.getDescription()), null, c39274g, p745y81.Function1.m125323a((Function1) obj), null, null, null, null, null, null, null, false, 4082, defaultConstructorMarker), false, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, null, 32733, defaultConstructorMarker);
                boolean zM87157i = ((i15 & 112) == 32) | c28655q.m87157i(c33743b);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C35015q(13, onClick, c33743b);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC39281n.m125207c(null, c39282o, (InterfaceC4339a) objM87133R2, c28655q, C39282o.f168987q << 3, 1);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(viewState, onClick, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m114104C(Function1 function1, C33743b c33743b) {
        function1.invoke(c33743b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m114105D(C33744c c33744c, Function1 function1, int i13, Composer composer, int i14) {
        m114103B(c33744c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0202  */
    /* JADX WARN: Code duplicated, block: B:105:0x0298  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:112:0x02be  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:122:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x0300  */
    /* JADX WARN: Code duplicated, block: B:125:0x0302  */
    /* JADX WARN: Code duplicated, block: B:128:0x030a  */
    /* JADX WARN: Code duplicated, block: B:131:0x030f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0314  */
    /* JADX WARN: Code duplicated, block: B:136:0x0342  */
    /* JADX WARN: Code duplicated, block: B:139:0x034c  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x012e  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:76:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01db  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ef A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: E */
    public static final void m114106E(AbstractC33749h.e viewState, Function1 function1, Function1 function2, InterfaceC4339a onShowBottomSheet, Composer composer, int i13, int i14) {
        Function1 function3;
        boolean z4;
        Function1 function4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function5;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        int i15;
        boolean z13;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function6;
        EnumC16313m0 enumC16313m0M106630b;
        Integer numValueOf;
        boolean z14;
        Object objM87133R4;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object c27198e;
        char c3;
        C28676v0 c28676v1;
        boolean z19;
        int iHashCode2;
        boolean z24;
        int i17;
        boolean z25;
        boolean z26;
        Object objM87133R5;
        C28676v0 c28676v2;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R6;
        int i18;
        Function1 onNavigationEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onShowBottomSheet, "onShowBottomSheet");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-722854309);
        int i19 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i19 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function2;
                i19 |= c28655q.m87157i(function3) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onShowBottomSheet)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i19 |= i18;
            }
            if ((i19 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i19 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C35509k(28);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function5 = (Function1) objM87133R6;
                } else {
                    function5 = function3;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C22383c.b bVarM114108G = m114108G(interfaceC28601c1);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35429g(4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                i15 = i19 & 112;
                if (i15 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C35657b0(onNavigationEvent, 2);
                    c28655q.m87172p0(objM87133R3);
                }
                int i25 = TextResource.$stable;
                int i26 = C27256h.f109055z;
                AbstractC22431f.m64651Z(bVarM114108G, interfaceC4339a, (Function1) objM87133R3, c28655q, i25 | i26 | i26 | 48);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                C22957g c22957g = AbstractC22977m.f90652c;
                interfaceC28601c2 = interfaceC28601c1;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    function6 = function5;
                } else {
                    function6 = function5;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
                    Integer numValueOf2 = Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon());
                    enumC16313m0M106630b = viewState.getNavigationBar().getNavigationRightIcon();
                    if (enumC16313m0M106630b != null) {
                        numValueOf = Integer.valueOf(enumC16313m0M106630b.toWhoopIcon());
                    } else {
                        numValueOf = null;
                    }
                    AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, numValueOf2, null, numValueOf, null, null, null, false, null, null, null, null, null, null, null, 65514, null);
                    if (i15 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z14 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C34904e(onNavigationEvent, 12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    boolean zM87157i = c28655q.m87157i(viewState);
                    i16 = i19 & 896;
                    if (i16 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z27 = zM87157i | z15;
                    if (i15 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z28 = z27 | z16;
                    if ((i19 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | z28;
                    Object objM87133R7 = c28655q.m87133R();
                    if (!z18 || objM87133R7 == c28676v0) {
                        Function1 function7 = function6;
                        c27198e = new C27198e((Object) viewState, function7, onNavigationEvent, (Object) onShowBottomSheet, 19);
                        function4 = function7;
                        onNavigationEvent = onNavigationEvent;
                        c28655q.m87172p0(c27198e);
                    } else {
                        c27198e = objM87133R7;
                        function4 = function6;
                    }
                    c3 = 3;
                    c28676v1 = c28676v0;
                    AbstractC6719b.m20143d(modifierM3409f, aVar, null, interfaceC4339a2, (InterfaceC4339a) c27198e, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 36);
                    c28655q = c28655q;
                    float f13 = 8;
                    float f14 = 3 * f13;
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                    z19 = true;
                    float f15 = 2 * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q, 1), 14), f15, 0.0f, 2), 0.0f, f14, 0.0f, f15, 5);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    c28655q.m87150e0(-878028946);
                    for (InterfaceC25312u interfaceC25312u : viewState.m106694f()) {
                        C25307p c25307pM74678B0 = AbstractC25448c.m74678B0();
                        C13258u c13258u = new C13258u(3, interfaceC25312u);
                        if (i15 == 32) {
                            z24 = z19;
                        } else {
                            z24 = false;
                        }
                        i17 = i16;
                        if (i17 == 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                        z26 = z25 | z24;
                        objM87133R5 = c28655q.m87133R();
                        if (z26) {
                            c28676v2 = c28676v1;
                        } else {
                            c28676v2 = c28676v1;
                            if (objM87133R5 == c28676v2) {
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                            c28676v1 = c28676v2;
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B0, c13258u, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                            z19 = z19;
                            interfaceC28601c2 = interfaceC28601c3;
                            i16 = i17;
                            c3 = c3;
                        }
                        interfaceC28601c3 = interfaceC28601c2;
                        objM87133R5 = new C9768a(onNavigationEvent, function4, interfaceC28601c3, 3);
                        c28655q.m87172p0(objM87133R5);
                        c28676v1 = c28676v2;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B0, c13258u, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                        z19 = z19;
                        interfaceC28601c2 = interfaceC28601c3;
                        i16 = i17;
                        c3 = c3;
                    }
                    boolean z29 = z19;
                    AbstractC25012a.m73392y(c28655q, false, z29, z29);
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
                Integer numValueOf3 = Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon());
                enumC16313m0M106630b = viewState.getNavigationBar().getNavigationRightIcon();
                if (enumC16313m0M106630b != null) {
                    numValueOf = Integer.valueOf(enumC16313m0M106630b.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21278l2, null, numValueOf3, null, numValueOf, null, null, null, false, null, null, null, null, null, null, null, 65514, null);
                if (i15 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z14) {
                    objM87133R4 = new C34904e(onNavigationEvent, 12);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C34904e(onNavigationEvent, 12);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                boolean zM87157i2 = c28655q.m87157i(viewState);
                i16 = i19 & 896;
                if (i16 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z210 = zM87157i2 | z15;
                if (i15 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z211 = z210 | z16;
                if ((i19 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | z211;
                Object objM87133R8 = c28655q.m87133R();
                if (z18) {
                    Function1 function8 = function6;
                    c27198e = new C27198e((Object) viewState, function8, onNavigationEvent, (Object) onShowBottomSheet, 19);
                    function4 = function8;
                    onNavigationEvent = onNavigationEvent;
                    c28655q.m87172p0(c27198e);
                } else {
                    Function1 function9 = function6;
                    c27198e = new C27198e((Object) viewState, function9, onNavigationEvent, (Object) onShowBottomSheet, 19);
                    function4 = function9;
                    onNavigationEvent = onNavigationEvent;
                    c28655q.m87172p0(c27198e);
                }
                c3 = 3;
                c28676v1 = c28676v0;
                AbstractC6719b.m20143d(modifierM3409f2, aVar2, null, interfaceC4339a3, (InterfaceC4339a) c27198e, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 36);
                c28655q = c28655q;
                float f16 = 8;
                float f17 = 3 * f16;
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f17);
                z19 = true;
                float f18 = 2 * f16;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q, 1), 14), f18, 0.0f, 2), 0.0f, f17, 0.0f, f18, 5);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                c28655q.m87150e0(-878028946);
                while (r0.hasNext()) {
                    C25307p c25307pM74678B1 = AbstractC25448c.m74678B0();
                    C13258u c13258u2 = new C13258u(3, interfaceC25312u);
                    if (i15 == 32) {
                        z24 = z19;
                    } else {
                        z24 = false;
                    }
                    i17 = i16;
                    if (i17 == 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objM87133R5 = c28655q.m87133R();
                    if (z26) {
                        c28676v2 = c28676v1;
                        if (objM87133R5 == c28676v2) {
                            interfaceC28601c3 = interfaceC28601c2;
                        }
                        c28676v1 = c28676v2;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B1, c13258u2, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                        z19 = z19;
                        interfaceC28601c2 = interfaceC28601c3;
                        i16 = i17;
                        c3 = c3;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    interfaceC28601c3 = interfaceC28601c2;
                    objM87133R5 = new C9768a(onNavigationEvent, function4, interfaceC28601c3, 3);
                    c28655q.m87172p0(objM87133R5);
                    c28676v1 = c28676v2;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B1, c13258u2, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                    z19 = z19;
                    interfaceC28601c2 = interfaceC28601c3;
                    i16 = i17;
                    c3 = c3;
                }
                boolean z212 = z19;
                AbstractC25012a.m73392y(c28655q, false, z212, z212);
            } else {
                c28655q.m87138X();
                function4 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, onNavigationEvent, function4, onShowBottomSheet, i13, i14, 17);
            }
        }
        i19 |= 384;
        function3 = function2;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onShowBottomSheet)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i19 |= i18;
        }
        if ((i19 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i19 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C35509k(28);
                    c28655q.m87172p0(objM87133R6);
                }
                function5 = (Function1) objM87133R6;
            } else {
                function5 = function3;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C22383c.b bVarM114108G2 = m114108G(interfaceC28601c1);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C35429g(4, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            i15 = i19 & 112;
            if (i15 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                objM87133R3 = new C35657b0(onNavigationEvent, 2);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C35657b0(onNavigationEvent, 2);
                c28655q.m87172p0(objM87133R3);
            }
            int i27 = TextResource.$stable;
            int i28 = C27256h.f109055z;
            AbstractC22431f.m64651Z(bVarM114108G2, interfaceC4339a4, (Function1) objM87133R3, c28655q, i27 | i28 | i28 | 48);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t2, 1.0f);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            interfaceC28601c2 = interfaceC28601c1;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM114675c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                function6 = function5;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
                Integer numValueOf4 = Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon());
                enumC16313m0M106630b = viewState.getNavigationBar().getNavigationRightIcon();
                if (enumC16313m0M106630b != null) {
                    numValueOf = Integer.valueOf(enumC16313m0M106630b.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(textResourceM21278l3, null, numValueOf4, null, numValueOf, null, null, null, false, null, null, null, null, null, null, null, 65514, null);
                if (i15 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z14) {
                    objM87133R4 = new C34904e(onNavigationEvent, 12);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C34904e(onNavigationEvent, 12);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R4;
                boolean zM87157i3 = c28655q.m87157i(viewState);
                i16 = i19 & 896;
                if (i16 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z213 = zM87157i3 | z15;
                if (i15 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z214 = z213 | z16;
                if ((i19 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | z214;
                Object objM87133R9 = c28655q.m87133R();
                if (z18) {
                    Function1 function10 = function6;
                    c27198e = new C27198e((Object) viewState, function10, onNavigationEvent, (Object) onShowBottomSheet, 19);
                    function4 = function10;
                    onNavigationEvent = onNavigationEvent;
                    c28655q.m87172p0(c27198e);
                } else {
                    Function1 function11 = function6;
                    c27198e = new C27198e((Object) viewState, function11, onNavigationEvent, (Object) onShowBottomSheet, 19);
                    function4 = function11;
                    onNavigationEvent = onNavigationEvent;
                    c28655q.m87172p0(c27198e);
                }
                c3 = 3;
                c28676v1 = c28676v0;
                AbstractC6719b.m20143d(modifierM3409f3, aVar3, null, interfaceC4339a5, (InterfaceC4339a) c27198e, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 36);
                c28655q = c28655q;
                float f19 = 8;
                float f110 = 3 * f19;
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f110);
                z19 = true;
                float f111 = 2 * f19;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(c2314t2, 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q, 1), 14), f111, 0.0f, 2), 0.0f, f110, 0.0f, f111, 5);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22971kM66746i3, c2305k2, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                c28655q.m87150e0(-878028946);
                while (r0.hasNext()) {
                    C25307p c25307pM74678B2 = AbstractC25448c.m74678B0();
                    C13258u c13258u3 = new C13258u(3, interfaceC25312u);
                    if (i15 == 32) {
                        z24 = z19;
                    } else {
                        z24 = false;
                    }
                    i17 = i16;
                    if (i17 == 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objM87133R5 = c28655q.m87133R();
                    if (z26) {
                        c28676v2 = c28676v1;
                        if (objM87133R5 == c28676v2) {
                            interfaceC28601c3 = interfaceC28601c2;
                        }
                        c28676v1 = c28676v2;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B2, c13258u3, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                        z19 = z19;
                        interfaceC28601c2 = interfaceC28601c3;
                        i16 = i17;
                        c3 = c3;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    interfaceC28601c3 = interfaceC28601c2;
                    objM87133R5 = new C9768a(onNavigationEvent, function4, interfaceC28601c3, 3);
                    c28655q.m87172p0(objM87133R5);
                    c28676v1 = c28676v2;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B2, c13258u3, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                    z19 = z19;
                    interfaceC28601c2 = interfaceC28601c3;
                    i16 = i17;
                    c3 = c3;
                }
                boolean z215 = z19;
                AbstractC25012a.m73392y(c28655q, false, z215, z215);
            } else {
                function6 = function5;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
            Integer numValueOf5 = Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon());
            enumC16313m0M106630b = viewState.getNavigationBar().getNavigationRightIcon();
            if (enumC16313m0M106630b != null) {
                numValueOf = Integer.valueOf(enumC16313m0M106630b.toWhoopIcon());
            } else {
                numValueOf = null;
            }
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(textResourceM21278l4, null, numValueOf5, null, numValueOf, null, null, null, false, null, null, null, null, null, null, null, 65514, null);
            if (i15 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z14) {
                objM87133R4 = new C34904e(onNavigationEvent, 12);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C34904e(onNavigationEvent, 12);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(viewState);
            i16 = i19 & 896;
            if (i16 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z216 = zM87157i4 | z15;
            if (i15 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z217 = z216 | z16;
            if ((i19 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z17 | z217;
            Object objM87133R10 = c28655q.m87133R();
            if (z18) {
                Function1 function12 = function6;
                c27198e = new C27198e((Object) viewState, function12, onNavigationEvent, (Object) onShowBottomSheet, 19);
                function4 = function12;
                onNavigationEvent = onNavigationEvent;
                c28655q.m87172p0(c27198e);
            } else {
                Function1 function13 = function6;
                c27198e = new C27198e((Object) viewState, function13, onNavigationEvent, (Object) onShowBottomSheet, 19);
                function4 = function13;
                onNavigationEvent = onNavigationEvent;
                c28655q.m87172p0(c27198e);
            }
            c3 = 3;
            c28676v1 = c28676v0;
            AbstractC6719b.m20143d(modifierM3409f4, aVar4, null, interfaceC4339a6, (InterfaceC4339a) c27198e, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 36);
            c28655q = c28655q;
            float f112 = 8;
            float f113 = 3 * f112;
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f113);
            z19 = true;
            float f114 = 2 * f112;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(c2314t2, 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q, 1), 14), f114, 0.0f, 2), 0.0f, f113, 0.0f, f114, 5);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22971kM66746i4, c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            c28655q.m87150e0(-878028946);
            while (r0.hasNext()) {
                C25307p c25307pM74678B3 = AbstractC25448c.m74678B0();
                C13258u c13258u4 = new C13258u(3, interfaceC25312u);
                if (i15 == 32) {
                    z24 = z19;
                } else {
                    z24 = false;
                }
                i17 = i16;
                if (i17 == 256) {
                    z25 = z19;
                } else {
                    z25 = false;
                }
                z26 = z25 | z24;
                objM87133R5 = c28655q.m87133R();
                if (z26) {
                    c28676v2 = c28676v1;
                    if (objM87133R5 == c28676v2) {
                        interfaceC28601c3 = interfaceC28601c2;
                    }
                    c28676v1 = c28676v2;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B3, c13258u4, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                    z19 = z19;
                    interfaceC28601c2 = interfaceC28601c3;
                    i16 = i17;
                    c3 = c3;
                } else {
                    c28676v2 = c28676v1;
                }
                interfaceC28601c3 = interfaceC28601c2;
                objM87133R5 = new C9768a(onNavigationEvent, function4, interfaceC28601c3, 3);
                c28655q.m87172p0(objM87133R5);
                c28676v1 = c28676v2;
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B3, c13258u4, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                z19 = z19;
                interfaceC28601c2 = interfaceC28601c3;
                i16 = i17;
                c3 = c3;
            }
            boolean z218 = z19;
            AbstractC25012a.m73392y(c28655q, false, z218, z218);
        } else {
            c28655q.m87138X();
            function4 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, onNavigationEvent, function4, onShowBottomSheet, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m114107F(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final C22383c.b m114108G(InterfaceC28601c1 interfaceC28601c1) {
        return (C22383c.b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: H */
    private static final void m114109H(InterfaceC28601c1 interfaceC28601c1, C22383c.b bVar) {
        interfaceC28601c1.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m114110I(InterfaceC28601c1 interfaceC28601c1) {
        m114109H(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m114111J(Function1 function1, InterfaceC22381a advancedLabsEvent) {
        AbstractC22676k.m65750j(advancedLabsEvent, "advancedLabsEvent");
        InterfaceC22381a.x xVar = advancedLabsEvent instanceof InterfaceC22381a.x ? (InterfaceC22381a.x) advancedLabsEvent : null;
        if (xVar != null) {
            Object objM64346d = xVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            if (objM64346d instanceof C9598e) {
                function1.invoke(new AbstractC32419a.c((C9598e) objM64346d));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m114112K(Function1 function1) {
        function1.invoke(AbstractC32419a.a.f134176a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m114113L(AbstractC33749h.e eVar, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a) {
        if (eVar.getBottomSheetItem() != null) {
            Action actionM106632a = eVar.getBottomSheetItem().getAction();
            if (actionM106632a != null) {
                function1.invoke(new C36548c(actionM106632a));
            } else {
                C9598e c9598eM106636e = eVar.getBottomSheetItem().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
                if (c9598eM106636e != null) {
                    function2.invoke(new AbstractC32419a.c(c9598eM106636e));
                }
            }
        } else if (eVar.getTestResultBottomSheet() != null) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Modifier m114114M(InterfaceC25312u interfaceC25312u, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-41431079);
        boolean z4 = interfaceC25312u instanceof C12840n;
        Modifier modifierM3398t = C2314t.f9131w;
        if (z4) {
            float f13 = 2 * 8;
            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, f13, 0.0f, f13, 0.0f, 10);
        }
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m114115N(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, Object event) {
        C22383c.b bVarM74805c;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AnyModal) {
            Modal modal = ((AnyModal) event).getModal();
            DialogModel dialogModel = modal instanceof DialogModel ? (DialogModel) modal : null;
            if (dialogModel != null && (bVarM74805c = AbstractC25450e.m74805c(dialogModel)) != null) {
                m114109H(interfaceC28601c1, bVarM74805c);
            }
        } else {
            m114145i0(event, function1, function2);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m114116O(AbstractC33749h.e eVar, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m114106E(eVar, function1, function2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0220  */
    /* JADX WARN: Code duplicated, block: B:102:0x0224  */
    /* JADX WARN: Code duplicated, block: B:104:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0250  */
    /* JADX WARN: Code duplicated, block: B:108:0x0263  */
    /* JADX WARN: Code duplicated, block: B:110:0x0271  */
    /* JADX WARN: Code duplicated, block: B:112:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:117:0x02df  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:123:0x0327  */
    /* JADX WARN: Code duplicated, block: B:125:0x032c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0360  */
    /* JADX WARN: Code duplicated, block: B:129:0x0363  */
    /* JADX WARN: Code duplicated, block: B:131:0x0367  */
    /* JADX WARN: Code duplicated, block: B:132:0x0369  */
    /* JADX WARN: Code duplicated, block: B:135:0x0371 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0373  */
    /* JADX WARN: Code duplicated, block: B:139:0x0385  */
    /* JADX WARN: Code duplicated, block: B:140:0x0388  */
    /* JADX WARN: Code duplicated, block: B:143:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0392  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:162:0x040c  */
    /* JADX WARN: Code duplicated, block: B:163:0x041e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0463  */
    /* JADX WARN: Code duplicated, block: B:166:0x0467  */
    /* JADX WARN: Code duplicated, block: B:169:0x047a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0488  */
    /* JADX WARN: Code duplicated, block: B:174:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:178:0x04ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:184:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:185:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:188:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:189:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:192:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0507  */
    /* JADX WARN: Code duplicated, block: B:196:0x0518  */
    /* JADX WARN: Code duplicated, block: B:197:0x051a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0524  */
    /* JADX WARN: Code duplicated, block: B:201:0x0526  */
    /* JADX WARN: Code duplicated, block: B:204:0x052e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0530  */
    /* JADX WARN: Code duplicated, block: B:209:0x059a  */
    /* JADX WARN: Code duplicated, block: B:211:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:214:0x05af  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:85:0x0199  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static final void m114117P(AbstractC33749h viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        int i24;
        boolean z13;
        C2314t c2314t;
        final Function1 function12;
        List list;
        final Function1 function13;
        Function1 function14;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        final C33746e c33746eM106696h;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i25;
        int i26;
        boolean z17;
        Object objM87133R2;
        boolean z18;
        int i27;
        boolean z19;
        boolean z24;
        Object objM87133R3;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objM87133R4;
        boolean z28;
        boolean z29;
        boolean z34;
        boolean z35;
        Object objM87133R5;
        boolean z36;
        Object objM87133R6;
        boolean z37;
        Object objM87133R7;
        Function1 function15;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        int iHashCode3;
        C0213j c0213j3;
        C0209i c0209i3;
        boolean z38;
        Object objM87133R8;
        int iHashCode4;
        C0213j c0213j4;
        C0209i c0209i4;
        Object objM87133R9;
        Object objM87133R10;
        Object objM87133R11;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1389358410);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = 2048;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C35509k(26);
                                c28655q.m87172p0(objM87133R11);
                            }
                            function10 = (Function1) objM87133R11;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C35509k(29);
                                c28655q.m87172p0(objM87133R10);
                            }
                            function5 = (Function1) objM87133R10;
                        }
                        if (i18 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C35926d(0);
                                c28655q.m87172p0(objM87133R9);
                            }
                            function11 = (Function1) objM87133R9;
                        } else {
                            function11 = function6;
                        }
                        i24 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "advanced_labs_test_results", c28655q, i24 | 48);
                        z13 = viewState instanceof AbstractC33749h.b;
                        c2314t = C2314t.f9131w;
                        if (z13) {
                            c28655q.m87150e0(-223039712);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j4 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j4);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i4 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            function12 = function10;
                            function15 = function5;
                            function13 = function11;
                            AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC33749h.a) {
                            c28655q.m87150e0(-222642447);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j3 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                            c0209i3 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62265N1);
                            if ((i15 & 112) == 32) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            objM87133R8 = c28655q.m87133R();
                            if (z38 || objM87133R8 == c28676v0) {
                                objM87133R8 = new C34904e(function10, 13);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function13 = function11;
                            function15 = function5;
                            function12 = function10;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k, 0L, (InterfaceC4339a) objM87133R8, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC33749h.d) {
                            c28655q.m87150e0(-222058655);
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i2 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            function12 = function10;
                            function13 = function11;
                            function15 = function5;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            function12 = function10;
                            list = null;
                            objArr9 = 0;
                            objArr8 = 0;
                            objArr7 = 0;
                            objArr6 = 0;
                            objArr5 = 0;
                            objArr4 = 0;
                            objArr3 = 0;
                            objArr2 = 0;
                            objArr = 0;
                            if (viewState instanceof AbstractC33749h.c) {
                                c28655q.m87150e0(-221675681);
                                int i29 = 2;
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i29, objArr == true ? 1 : 0), false, null, 6, null);
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i29, objArr3 == true ? 1 : 0);
                                if ((i15 & 112) == 32) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                objM87133R7 = c28655q.m87133R();
                                if (z37 || objM87133R7 == c28676v0) {
                                    objM87133R7 = new C34904e(function12, 14);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                function13 = function11;
                                function15 = function5;
                                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function13 = function11;
                                if (viewState instanceof AbstractC33749h.f) {
                                    c28655q.m87150e0(-221235140);
                                    int i34 = 2;
                                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr4 == true ? 1 : 0, i34, objArr5 == true ? 1 : 0), false, null, 6, null);
                                    TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr6 == true ? 1 : 0, i34, objArr7 == true ? 1 : 0);
                                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i34, objArr9 == true ? 1 : 0);
                                    if ((i15 & 7168) == 2048) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    if (i24 == 4) {
                                        z34 = true;
                                    } else {
                                        z34 = false;
                                    }
                                    z35 = z29 | z34;
                                    objM87133R5 = c28655q.m87133R();
                                    if (z35 || objM87133R5 == c28676v0) {
                                        objM87133R5 = new C35015q(14, function13, viewState);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
                                    if ((i15 & 112) == 32) {
                                        z36 = true;
                                    } else {
                                        z36 = false;
                                    }
                                    objM87133R6 = c28655q.m87133R();
                                    if (z36 || objM87133R6 == c28676v0) {
                                        objM87133R6 = new C34904e(function12, 15);
                                        c28655q.m87172p0(objM87133R6);
                                    }
                                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                                    int i35 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                                    int i36 = TextResource.C8688b.f25889c;
                                    int i37 = i35 | (i36 << 9) | (i36 << 21);
                                    function13 = function13;
                                    AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, interfaceC4339a, false, false, c8688b3, interfaceC4339a2, null, false, false, c28655q, i37, 0, 3684);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                    function14 = function5;
                                } else {
                                    function14 = function5;
                                    if (viewState instanceof AbstractC33749h.e) {
                                        throw AbstractC11895b.m32003v(-561381883, c28655q, false);
                                    }
                                    c28655q.m87150e0(-220625494);
                                    if ((i15 & 896) == 256) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (i24 == 4) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    z16 = z14 | z15;
                                    objM87133R = c28655q.m87133R();
                                    if (z16 || objM87133R == c28676v0) {
                                        objM87133R = new b(function14, viewState, null);
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                    AbstractC33749h.e eVar = (AbstractC33749h.e) viewState;
                                    c33746eM106696h = eVar.getPopUpDialog();
                                    if (c33746eM106696h == null) {
                                        c28655q.m87150e0(-220454654);
                                        c28655q.m87173q(false);
                                        i26 = i15;
                                        z28 = false;
                                        function14 = function14;
                                    } else {
                                        c28655q.m87150e0(-220454653);
                                        Modifier modifierM7154a = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
                                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                        iHashCode = Long.hashCode(c28655q.f115904T);
                                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM7154a);
                                        InterfaceC0221l.f734a.getClass();
                                        c0213j = C0217k.f724b;
                                        c28655q.m87158i0();
                                        if (c28655q.f115903S) {
                                            c28655q.m87163l(c0213j);
                                        } else {
                                            c28655q.m87178s0();
                                        }
                                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                                        c0209i = C0217k.f732j;
                                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                        }
                                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                                        Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                                        TextResource textResourceM106675h = c33746eM106696h.getTitle();
                                        TextResource textResourceM106668a = c33746eM106696h.getDescription();
                                        TextResource textResourceM106670c = c33746eM106696h.getPrimaryActionText();
                                        InterfaceC39332e interfaceC39332eM106669b = c33746eM106696h.getPrimaryActionColor();
                                        TextResource textResourceM106672e = c33746eM106696h.getSecondaryActionText();
                                        boolean zM106674g = c33746eM106696h.getShowCloseIcon();
                                        boolean zM106677j = c33746eM106696h.getUseSolidButtons();
                                        EnumC21213p enumC21213pM106676i = c33746eM106696h.getTopDialogStyle();
                                        i25 = i15 & 7168;
                                        i26 = i15;
                                        if (i25 == 2048) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        objM87133R2 = c28655q.m87133R();
                                        if (z17 || objM87133R2 == c28676v0) {
                                            objM87133R2 = new C34904e(function13, 16);
                                            c28655q.m87172p0(objM87133R2);
                                        }
                                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                                        if (i25 == 2048) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        boolean zM87157i = z18 | c28655q.m87157i(c33746eM106696h);
                                        i27 = i26 & 112;
                                        if (i27 == 32) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        z24 = zM87157i | z19;
                                        objM87133R3 = c28655q.m87133R();
                                        if (z24 || objM87133R3 == c28676v0) {
                                            final int i38 = 1;
                                            objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                                @Override // c93.InterfaceC4339a
                                                public final Object invoke() {
                                                    switch (i38) {
                                                        case 0:
                                                            return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                        default:
                                                            return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R3);
                                        }
                                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                                        if (i25 == 2048) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        boolean zM87157i2 = z25 | c28655q.m87157i(c33746eM106696h);
                                        if (i27 == 32) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        z27 = zM87157i2 | z26;
                                        objM87133R4 = c28655q.m87133R();
                                        if (z27 || objM87133R4 == c28676v0) {
                                            final int i39 = 0;
                                            objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                                @Override // c93.InterfaceC4339a
                                                public final Object invoke() {
                                                    switch (i39) {
                                                        case 0:
                                                            return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                        default:
                                                            return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                    }
                                                }
                                            };
                                            c28655q.m87172p0(objM87133R4);
                                        }
                                        int i44 = TextResource.$stable;
                                        AbstractC21211n.m59497o(modifierMo3400a, textResourceM106675h, textResourceM106668a, textResourceM106670c, zM106677j, interfaceC39332eM106669b, null, null, null, textResourceM106672e, null, false, zM106674g, enumC21213pM106676i, null, false, 0, null, null, null, false, null, interfaceC4339a3, interfaceC4339a4, (InterfaceC4339a) objM87133R4, null, null, null, c28655q, (i44 << 3) | (i44 << 6) | (i44 << 9) | (i44 << 27), 0, 0, 239062464);
                                        c28655q = c28655q;
                                        c28655q.m87173q(true);
                                        z28 = false;
                                        c28655q.m87173q(false);
                                    }
                                    m114131b0(eVar, function12, function13, c28655q, (i26 & 126) | ((i26 >> 3) & 896), 0);
                                    c28655q.m87173q(z28);
                                }
                            }
                            function7 = function12;
                            function9 = function13;
                            function8 = function14;
                        }
                        function14 = function15;
                        function7 = function12;
                        function9 = function13;
                        function8 = function14;
                    } else {
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 16);
                    }
                }
                i15 |= 3072;
                function6 = function3;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35509k(26);
                            c28655q.m87172p0(objM87133R11);
                        }
                        function10 = (Function1) objM87133R11;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C35509k(29);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function5 = (Function1) objM87133R10;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35926d(0);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function11 = (Function1) objM87133R9;
                    } else {
                        function11 = function6;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_test_results", c28655q, i24 | 48);
                    z13 = viewState instanceof AbstractC33749h.b;
                    c2314t = C2314t.f9131w;
                    if (z13) {
                        c28655q.m87150e0(-223039712);
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j4);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        function12 = function10;
                        function15 = function5;
                        function13 = function11;
                        AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC33749h.a) {
                        c28655q.m87150e0(-222642447);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC16277f.f62265N1);
                        if ((i15 & 112) == 32) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z38) {
                            objM87133R8 = new C34904e(function10, 13);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C34904e(function10, 13);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function13 = function11;
                        function15 = function5;
                        function12 = function10;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k2, 0L, (InterfaceC4339a) objM87133R8, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC33749h.d) {
                        c28655q.m87150e0(-222058655);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                        function12 = function10;
                        function13 = function11;
                        function15 = function5;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function12 = function10;
                        list = null;
                        objArr9 = 0;
                        objArr8 = 0;
                        objArr7 = 0;
                        objArr6 = 0;
                        objArr5 = 0;
                        objArr4 = 0;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (viewState instanceof AbstractC33749h.c) {
                            c28655q.m87150e0(-221675681);
                            int i210 = 2;
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i210, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i210, objArr3 == true ? 1 : 0);
                            if ((i15 & 112) == 32) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z37) {
                                objM87133R7 = new C34904e(function12, 14);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new C34904e(function12, 14);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function13 = function11;
                            function15 = function5;
                            AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b4, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function11;
                            if (viewState instanceof AbstractC33749h.f) {
                                c28655q.m87150e0(-221235140);
                                int i310 = 2;
                                AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr4 == true ? 1 : 0, i310, objArr5 == true ? 1 : 0), false, null, 6, null);
                                TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr6 == true ? 1 : 0, i310, objArr7 == true ? 1 : 0);
                                TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i310, objArr9 == true ? 1 : 0);
                                if ((i15 & 7168) == 2048) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (i24 == 4) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                z35 = z29 | z34;
                                objM87133R5 = c28655q.m87133R();
                                if (z35) {
                                    objM87133R5 = new C35015q(14, function13, viewState);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C35015q(14, function13, viewState);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R5;
                                if ((i15 & 112) == 32) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                objM87133R6 = c28655q.m87133R();
                                if (z36) {
                                    objM87133R6 = new C34904e(function12, 15);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C34904e(function12, 15);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
                                int i311 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                                int i312 = TextResource.C8688b.f25889c;
                                int i313 = i311 | (i312 << 9) | (i312 << 21);
                                function13 = function13;
                                AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b5, interfaceC4339a5, false, false, c8688b6, interfaceC4339a6, null, false, false, c28655q, i313, 0, 3684);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                function14 = function5;
                            } else {
                                function14 = function5;
                                if (viewState instanceof AbstractC33749h.e) {
                                    throw AbstractC11895b.m32003v(-561381883, c28655q, false);
                                }
                                c28655q.m87150e0(-220625494);
                                if ((i15 & 896) == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i24 == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objM87133R = c28655q.m87133R();
                                if (z16) {
                                    objM87133R = new b(function14, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new b(function14, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                AbstractC33749h.e eVar2 = (AbstractC33749h.e) viewState;
                                c33746eM106696h = eVar2.getPopUpDialog();
                                if (c33746eM106696h == null) {
                                    c28655q.m87150e0(-220454654);
                                    c28655q.m87173q(false);
                                    i26 = i15;
                                    z28 = false;
                                    function14 = function14;
                                } else {
                                    c28655q.m87150e0(-220454653);
                                    Modifier modifierM7154a2 = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
                                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                    iHashCode = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM7154a2);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j = C0217k.f724b;
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                                    c0209i = C0217k.f732j;
                                    if (c28655q.f115903S) {
                                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                    } else {
                                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                                    Modifier modifierMo3400a2 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                                    TextResource textResourceM106675h2 = c33746eM106696h.getTitle();
                                    TextResource textResourceM106668a2 = c33746eM106696h.getDescription();
                                    TextResource textResourceM106670c2 = c33746eM106696h.getPrimaryActionText();
                                    InterfaceC39332e interfaceC39332eM106669b2 = c33746eM106696h.getPrimaryActionColor();
                                    TextResource textResourceM106672e2 = c33746eM106696h.getSecondaryActionText();
                                    boolean zM106674g2 = c33746eM106696h.getShowCloseIcon();
                                    boolean zM106677j2 = c33746eM106696h.getUseSolidButtons();
                                    EnumC21213p enumC21213pM106676i2 = c33746eM106696h.getTopDialogStyle();
                                    i25 = i15 & 7168;
                                    i26 = i15;
                                    if (i25 == 2048) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    objM87133R2 = c28655q.m87133R();
                                    if (z17) {
                                        objM87133R2 = new C34904e(function13, 16);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        objM87133R2 = new C34904e(function13, 16);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                                    if (i25 == 2048) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    boolean zM87157i3 = z18 | c28655q.m87157i(c33746eM106696h);
                                    i27 = i26 & 112;
                                    if (i27 == 32) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    z24 = zM87157i3 | z19;
                                    objM87133R3 = c28655q.m87133R();
                                    if (z24) {
                                        final int i314 = 1;
                                        objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i314) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        final int i315 = 1;
                                        objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i315) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R3;
                                    if (i25 == 2048) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    boolean zM87157i4 = z25 | c28655q.m87157i(c33746eM106696h);
                                    if (i27 == 32) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    z27 = zM87157i4 | z26;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z27) {
                                        final int i316 = 0;
                                        objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i316) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        final int i317 = 0;
                                        objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i317) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    int i45 = TextResource.$stable;
                                    AbstractC21211n.m59497o(modifierMo3400a2, textResourceM106675h2, textResourceM106668a2, textResourceM106670c2, zM106677j2, interfaceC39332eM106669b2, null, null, null, textResourceM106672e2, null, false, zM106674g2, enumC21213pM106676i2, null, false, 0, null, null, null, false, null, interfaceC4339a7, interfaceC4339a8, (InterfaceC4339a) objM87133R4, null, null, null, c28655q, (i45 << 3) | (i45 << 6) | (i45 << 9) | (i45 << 27), 0, 0, 239062464);
                                    c28655q = c28655q;
                                    c28655q.m87173q(true);
                                    z28 = false;
                                    c28655q.m87173q(false);
                                }
                                m114131b0(eVar2, function12, function13, c28655q, (i26 & 126) | ((i26 >> 3) & 896), 0);
                                c28655q.m87173q(z28);
                            }
                        }
                        function7 = function12;
                        function9 = function13;
                        function8 = function14;
                    }
                    function14 = function15;
                    function7 = function12;
                    function9 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 16);
                }
            }
            i15 |= 384;
            function5 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35509k(26);
                            c28655q.m87172p0(objM87133R11);
                        }
                        function10 = (Function1) objM87133R11;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C35509k(29);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function5 = (Function1) objM87133R10;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35926d(0);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function11 = (Function1) objM87133R9;
                    } else {
                        function11 = function6;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_test_results", c28655q, i24 | 48);
                    z13 = viewState instanceof AbstractC33749h.b;
                    c2314t = C2314t.f9131w;
                    if (z13) {
                        c28655q.m87150e0(-223039712);
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j4);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                        function12 = function10;
                        function15 = function5;
                        function13 = function11;
                        AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC33749h.a) {
                        c28655q.m87150e0(-222642447);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC16277f.f62265N1);
                        if ((i15 & 112) == 32) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z38) {
                            objM87133R8 = new C34904e(function10, 13);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C34904e(function10, 13);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function13 = function11;
                        function15 = function5;
                        function12 = function10;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k3, 0L, (InterfaceC4339a) objM87133R8, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC33749h.d) {
                        c28655q.m87150e0(-222058655);
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                        function12 = function10;
                        function13 = function11;
                        function15 = function5;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function12 = function10;
                        list = null;
                        objArr9 = 0;
                        objArr8 = 0;
                        objArr7 = 0;
                        objArr6 = 0;
                        objArr5 = 0;
                        objArr4 = 0;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (viewState instanceof AbstractC33749h.c) {
                            c28655q.m87150e0(-221675681);
                            int i211 = 2;
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i211, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i211, objArr3 == true ? 1 : 0);
                            if ((i15 & 112) == 32) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z37) {
                                objM87133R7 = new C34904e(function12, 14);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new C34904e(function12, 14);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function13 = function11;
                            function15 = function5;
                            AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b7, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function11;
                            if (viewState instanceof AbstractC33749h.f) {
                                c28655q.m87150e0(-221235140);
                                int i318 = 2;
                                AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr4 == true ? 1 : 0, i318, objArr5 == true ? 1 : 0), false, null, 6, null);
                                TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr6 == true ? 1 : 0, i318, objArr7 == true ? 1 : 0);
                                TextResource.C8688b c8688b9 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i318, objArr9 == true ? 1 : 0);
                                if ((i15 & 7168) == 2048) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (i24 == 4) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                z35 = z29 | z34;
                                objM87133R5 = c28655q.m87133R();
                                if (z35) {
                                    objM87133R5 = new C35015q(14, function13, viewState);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C35015q(14, function13, viewState);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R5;
                                if ((i15 & 112) == 32) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                objM87133R6 = c28655q.m87133R();
                                if (z36) {
                                    objM87133R6 = new C34904e(function12, 15);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C34904e(function12, 15);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R6;
                                int i319 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                                int i3110 = TextResource.C8688b.f25889c;
                                int i3111 = i319 | (i3110 << 9) | (i3110 << 21);
                                function13 = function13;
                                AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b8, interfaceC4339a9, false, false, c8688b9, interfaceC4339a10, null, false, false, c28655q, i3111, 0, 3684);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                function14 = function5;
                            } else {
                                function14 = function5;
                                if (viewState instanceof AbstractC33749h.e) {
                                    throw AbstractC11895b.m32003v(-561381883, c28655q, false);
                                }
                                c28655q.m87150e0(-220625494);
                                if ((i15 & 896) == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i24 == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objM87133R = c28655q.m87133R();
                                if (z16) {
                                    objM87133R = new b(function14, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new b(function14, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                AbstractC33749h.e eVar3 = (AbstractC33749h.e) viewState;
                                c33746eM106696h = eVar3.getPopUpDialog();
                                if (c33746eM106696h == null) {
                                    c28655q.m87150e0(-220454654);
                                    c28655q.m87173q(false);
                                    i26 = i15;
                                    z28 = false;
                                    function14 = function14;
                                } else {
                                    c28655q.m87150e0(-220454653);
                                    Modifier modifierM7154a3 = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
                                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                    iHashCode = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM7154a3);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j = C0217k.f724b;
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                                    c0209i = C0217k.f732j;
                                    if (c28655q.f115903S) {
                                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                    } else {
                                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                                    Modifier modifierMo3400a3 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                                    TextResource textResourceM106675h3 = c33746eM106696h.getTitle();
                                    TextResource textResourceM106668a3 = c33746eM106696h.getDescription();
                                    TextResource textResourceM106670c3 = c33746eM106696h.getPrimaryActionText();
                                    InterfaceC39332e interfaceC39332eM106669b3 = c33746eM106696h.getPrimaryActionColor();
                                    TextResource textResourceM106672e3 = c33746eM106696h.getSecondaryActionText();
                                    boolean zM106674g3 = c33746eM106696h.getShowCloseIcon();
                                    boolean zM106677j3 = c33746eM106696h.getUseSolidButtons();
                                    EnumC21213p enumC21213pM106676i3 = c33746eM106696h.getTopDialogStyle();
                                    i25 = i15 & 7168;
                                    i26 = i15;
                                    if (i25 == 2048) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    objM87133R2 = c28655q.m87133R();
                                    if (z17) {
                                        objM87133R2 = new C34904e(function13, 16);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        objM87133R2 = new C34904e(function13, 16);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                                    if (i25 == 2048) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    boolean zM87157i5 = z18 | c28655q.m87157i(c33746eM106696h);
                                    i27 = i26 & 112;
                                    if (i27 == 32) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    z24 = zM87157i5 | z19;
                                    objM87133R3 = c28655q.m87133R();
                                    if (z24) {
                                        final int i3112 = 1;
                                        objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i3112) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        final int i3113 = 1;
                                        objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i3113) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R3;
                                    if (i25 == 2048) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    boolean zM87157i6 = z25 | c28655q.m87157i(c33746eM106696h);
                                    if (i27 == 32) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    z27 = zM87157i6 | z26;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z27) {
                                        final int i3114 = 0;
                                        objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i3114) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        final int i3115 = 0;
                                        objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i3115) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    int i46 = TextResource.$stable;
                                    AbstractC21211n.m59497o(modifierMo3400a3, textResourceM106675h3, textResourceM106668a3, textResourceM106670c3, zM106677j3, interfaceC39332eM106669b3, null, null, null, textResourceM106672e3, null, false, zM106674g3, enumC21213pM106676i3, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, (InterfaceC4339a) objM87133R4, null, null, null, c28655q, (i46 << 3) | (i46 << 6) | (i46 << 9) | (i46 << 27), 0, 0, 239062464);
                                    c28655q = c28655q;
                                    c28655q.m87173q(true);
                                    z28 = false;
                                    c28655q.m87173q(false);
                                }
                                m114131b0(eVar3, function12, function13, c28655q, (i26 & 126) | ((i26 >> 3) & 896), 0);
                                c28655q.m87173q(z28);
                            }
                        }
                        function7 = function12;
                        function9 = function13;
                        function8 = function14;
                    }
                    function14 = function15;
                    function7 = function12;
                    function9 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 16);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35509k(26);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function10 = (Function1) objM87133R11;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C35509k(29);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function5 = (Function1) objM87133R10;
                }
                if (i18 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35926d(0);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function11 = (Function1) objM87133R9;
                } else {
                    function11 = function6;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_test_results", c28655q, i24 | 48);
                z13 = viewState instanceof AbstractC33749h.b;
                c2314t = C2314t.f9131w;
                if (z13) {
                    c28655q.m87150e0(-223039712);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j4);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                    function12 = function10;
                    function15 = function5;
                    function13 = function11;
                    AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC33749h.a) {
                    c28655q.m87150e0(-222642447);
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                    TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC16277f.f62265N1);
                    if ((i15 & 112) == 32) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z38) {
                        objM87133R8 = new C34904e(function10, 13);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C34904e(function10, 13);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function13 = function11;
                    function15 = function5;
                    function12 = function10;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k4, 0L, (InterfaceC4339a) objM87133R8, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC33749h.d) {
                    c28655q.m87150e0(-222058655);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                    function12 = function10;
                    function13 = function11;
                    function15 = function5;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function12 = function10;
                    list = null;
                    objArr9 = 0;
                    objArr8 = 0;
                    objArr7 = 0;
                    objArr6 = 0;
                    objArr5 = 0;
                    objArr4 = 0;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState instanceof AbstractC33749h.c) {
                        c28655q.m87150e0(-221675681);
                        int i212 = 2;
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i212, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b10 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i212, objArr3 == true ? 1 : 0);
                        if ((i15 & 112) == 32) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z37) {
                            objM87133R7 = new C34904e(function12, 14);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C34904e(function12, 14);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function13 = function11;
                        function15 = function5;
                        AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b10, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function11;
                        if (viewState instanceof AbstractC33749h.f) {
                            c28655q.m87150e0(-221235140);
                            int i3116 = 2;
                            AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr4 == true ? 1 : 0, i3116, objArr5 == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b11 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr6 == true ? 1 : 0, i3116, objArr7 == true ? 1 : 0);
                            TextResource.C8688b c8688b12 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i3116, objArr9 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (i24 == 4) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z29 | z34;
                            objM87133R5 = c28655q.m87133R();
                            if (z35) {
                                objM87133R5 = new C35015q(14, function13, viewState);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C35015q(14, function13, viewState);
                                c28655q.m87172p0(objM87133R5);
                            }
                            InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R5;
                            if ((i15 & 112) == 32) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z36) {
                                objM87133R6 = new C34904e(function12, 15);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C34904e(function12, 15);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R6;
                            int i3117 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                            int i3118 = TextResource.C8688b.f25889c;
                            int i3119 = i3117 | (i3118 << 9) | (i3118 << 21);
                            function13 = function13;
                            AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b11, interfaceC4339a13, false, false, c8688b12, interfaceC4339a14, null, false, false, c28655q, i3119, 0, 3684);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function14 = function5;
                        } else {
                            function14 = function5;
                            if (viewState instanceof AbstractC33749h.e) {
                                throw AbstractC11895b.m32003v(-561381883, c28655q, false);
                            }
                            c28655q.m87150e0(-220625494);
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R = c28655q.m87133R();
                            if (z16) {
                                objM87133R = new b(function14, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new b(function14, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            AbstractC33749h.e eVar4 = (AbstractC33749h.e) viewState;
                            c33746eM106696h = eVar4.getPopUpDialog();
                            if (c33746eM106696h == null) {
                                c28655q.m87150e0(-220454654);
                                c28655q.m87173q(false);
                                i26 = i15;
                                z28 = false;
                                function14 = function14;
                            } else {
                                c28655q.m87150e0(-220454653);
                                Modifier modifierM7154a4 = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
                                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM7154a4);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                                Modifier modifierMo3400a4 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                                TextResource textResourceM106675h4 = c33746eM106696h.getTitle();
                                TextResource textResourceM106668a4 = c33746eM106696h.getDescription();
                                TextResource textResourceM106670c4 = c33746eM106696h.getPrimaryActionText();
                                InterfaceC39332e interfaceC39332eM106669b4 = c33746eM106696h.getPrimaryActionColor();
                                TextResource textResourceM106672e4 = c33746eM106696h.getSecondaryActionText();
                                boolean zM106674g4 = c33746eM106696h.getShowCloseIcon();
                                boolean zM106677j4 = c33746eM106696h.getUseSolidButtons();
                                EnumC21213p enumC21213pM106676i4 = c33746eM106696h.getTopDialogStyle();
                                i25 = i15 & 7168;
                                i26 = i15;
                                if (i25 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z17) {
                                    objM87133R2 = new C34904e(function13, 16);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C34904e(function13, 16);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R2;
                                if (i25 == 2048) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                boolean zM87157i7 = z18 | c28655q.m87157i(c33746eM106696h);
                                i27 = i26 & 112;
                                if (i27 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z24 = zM87157i7 | z19;
                                objM87133R3 = c28655q.m87133R();
                                if (z24) {
                                    final int i31110 = 1;
                                    objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i31110) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    final int i31111 = 1;
                                    objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i31111) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                }
                                InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                                if (i25 == 2048) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean zM87157i8 = z25 | c28655q.m87157i(c33746eM106696h);
                                if (i27 == 32) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                z27 = zM87157i8 | z26;
                                objM87133R4 = c28655q.m87133R();
                                if (z27) {
                                    final int i31112 = 0;
                                    objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i31112) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    final int i31113 = 0;
                                    objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i31113) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R4);
                                }
                                int i47 = TextResource.$stable;
                                AbstractC21211n.m59497o(modifierMo3400a4, textResourceM106675h4, textResourceM106668a4, textResourceM106670c4, zM106677j4, interfaceC39332eM106669b4, null, null, null, textResourceM106672e4, null, false, zM106674g4, enumC21213pM106676i4, null, false, 0, null, null, null, false, null, interfaceC4339a15, interfaceC4339a16, (InterfaceC4339a) objM87133R4, null, null, null, c28655q, (i47 << 3) | (i47 << 6) | (i47 << 9) | (i47 << 27), 0, 0, 239062464);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                z28 = false;
                                c28655q.m87173q(false);
                            }
                            m114131b0(eVar4, function12, function13, c28655q, (i26 & 126) | ((i26 >> 3) & 896), 0);
                            c28655q.m87173q(z28);
                        }
                    }
                    function7 = function12;
                    function9 = function13;
                    function8 = function14;
                }
                function14 = function15;
                function7 = function12;
                function9 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 16);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35509k(26);
                            c28655q.m87172p0(objM87133R11);
                        }
                        function10 = (Function1) objM87133R11;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C35509k(29);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function5 = (Function1) objM87133R10;
                    }
                    if (i18 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35926d(0);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function11 = (Function1) objM87133R9;
                    } else {
                        function11 = function6;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_test_results", c28655q, i24 | 48);
                    z13 = viewState instanceof AbstractC33749h.b;
                    c2314t = C2314t.f9131w;
                    if (z13) {
                        c28655q.m87150e0(-223039712);
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j4);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a13);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m17);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N17);
                        function12 = function10;
                        function15 = function5;
                        function13 = function11;
                        AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC33749h.a) {
                        c28655q.m87150e0(-222642447);
                        C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a14);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m18);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N18);
                        TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC16277f.f62265N1);
                        if ((i15 & 112) == 32) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z38) {
                            objM87133R8 = new C34904e(function10, 13);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C34904e(function10, 13);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function13 = function11;
                        function15 = function5;
                        function12 = function10;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k5, 0L, (InterfaceC4339a) objM87133R8, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC33749h.d) {
                        c28655q.m87150e0(-222058655);
                        C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a15);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m19);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N19);
                        function12 = function10;
                        function13 = function11;
                        function15 = function5;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function12 = function10;
                        list = null;
                        objArr9 = 0;
                        objArr8 = 0;
                        objArr7 = 0;
                        objArr6 = 0;
                        objArr5 = 0;
                        objArr4 = 0;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (viewState instanceof AbstractC33749h.c) {
                            c28655q.m87150e0(-221675681);
                            int i213 = 2;
                            AbstractC33208p0.b bVar9 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i213, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a9 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b13 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i213, objArr3 == true ? 1 : 0);
                            if ((i15 & 112) == 32) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z37) {
                                objM87133R7 = new C34904e(function12, 14);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new C34904e(function12, 14);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function13 = function11;
                            function15 = function5;
                            AbstractC33199m0.m105214F(bVar9, textResourceM21267a9, null, c8688b13, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function11;
                            if (viewState instanceof AbstractC33749h.f) {
                                c28655q.m87150e0(-221235140);
                                int i31114 = 2;
                                AbstractC33208p0.b bVar10 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr4 == true ? 1 : 0, i31114, objArr5 == true ? 1 : 0), false, null, 6, null);
                                TextResource textResourceM21267a10 = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b14 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr6 == true ? 1 : 0, i31114, objArr7 == true ? 1 : 0);
                                TextResource.C8688b c8688b15 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i31114, objArr9 == true ? 1 : 0);
                                if ((i15 & 7168) == 2048) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (i24 == 4) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                z35 = z29 | z34;
                                objM87133R5 = c28655q.m87133R();
                                if (z35) {
                                    objM87133R5 = new C35015q(14, function13, viewState);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C35015q(14, function13, viewState);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R5;
                                if ((i15 & 112) == 32) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                objM87133R6 = c28655q.m87133R();
                                if (z36) {
                                    objM87133R6 = new C34904e(function12, 15);
                                    c28655q.m87172p0(objM87133R6);
                                } else {
                                    objM87133R6 = new C34904e(function12, 15);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R6;
                                int i31115 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                                int i31116 = TextResource.C8688b.f25889c;
                                int i31117 = i31115 | (i31116 << 9) | (i31116 << 21);
                                function13 = function13;
                                AbstractC33199m0.m105214F(bVar10, textResourceM21267a10, null, c8688b14, interfaceC4339a17, false, false, c8688b15, interfaceC4339a18, null, false, false, c28655q, i31117, 0, 3684);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                function14 = function5;
                            } else {
                                function14 = function5;
                                if (viewState instanceof AbstractC33749h.e) {
                                    throw AbstractC11895b.m32003v(-561381883, c28655q, false);
                                }
                                c28655q.m87150e0(-220625494);
                                if ((i15 & 896) == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i24 == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objM87133R = c28655q.m87133R();
                                if (z16) {
                                    objM87133R = new b(function14, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new b(function14, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                AbstractC33749h.e eVar5 = (AbstractC33749h.e) viewState;
                                c33746eM106696h = eVar5.getPopUpDialog();
                                if (c33746eM106696h == null) {
                                    c28655q.m87150e0(-220454654);
                                    c28655q.m87173q(false);
                                    i26 = i15;
                                    z28 = false;
                                    function14 = function14;
                                } else {
                                    c28655q.m87150e0(-220454653);
                                    Modifier modifierM7154a5 = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
                                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                    iHashCode = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM7154a5);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j = C0217k.f724b;
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m110);
                                    c0209i = C0217k.f732j;
                                    if (c28655q.f115903S) {
                                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                    } else {
                                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                    }
                                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N110);
                                    Modifier modifierMo3400a5 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                                    TextResource textResourceM106675h5 = c33746eM106696h.getTitle();
                                    TextResource textResourceM106668a5 = c33746eM106696h.getDescription();
                                    TextResource textResourceM106670c5 = c33746eM106696h.getPrimaryActionText();
                                    InterfaceC39332e interfaceC39332eM106669b5 = c33746eM106696h.getPrimaryActionColor();
                                    TextResource textResourceM106672e5 = c33746eM106696h.getSecondaryActionText();
                                    boolean zM106674g5 = c33746eM106696h.getShowCloseIcon();
                                    boolean zM106677j5 = c33746eM106696h.getUseSolidButtons();
                                    EnumC21213p enumC21213pM106676i5 = c33746eM106696h.getTopDialogStyle();
                                    i25 = i15 & 7168;
                                    i26 = i15;
                                    if (i25 == 2048) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    objM87133R2 = c28655q.m87133R();
                                    if (z17) {
                                        objM87133R2 = new C34904e(function13, 16);
                                        c28655q.m87172p0(objM87133R2);
                                    } else {
                                        objM87133R2 = new C34904e(function13, 16);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R2;
                                    if (i25 == 2048) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    boolean zM87157i9 = z18 | c28655q.m87157i(c33746eM106696h);
                                    i27 = i26 & 112;
                                    if (i27 == 32) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    z24 = zM87157i9 | z19;
                                    objM87133R3 = c28655q.m87133R();
                                    if (z24) {
                                        final int i31118 = 1;
                                        objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i31118) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        final int i31119 = 1;
                                        objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i31119) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R3;
                                    if (i25 == 2048) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    boolean zM87157i10 = z25 | c28655q.m87157i(c33746eM106696h);
                                    if (i27 == 32) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    z27 = zM87157i10 | z26;
                                    objM87133R4 = c28655q.m87133R();
                                    if (z27) {
                                        final int i311110 = 0;
                                        objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i311110) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R4);
                                    } else {
                                        final int i311111 = 0;
                                        objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i311111) {
                                                    case 0:
                                                        return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                    default:
                                                        return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    int i48 = TextResource.$stable;
                                    AbstractC21211n.m59497o(modifierMo3400a5, textResourceM106675h5, textResourceM106668a5, textResourceM106670c5, zM106677j5, interfaceC39332eM106669b5, null, null, null, textResourceM106672e5, null, false, zM106674g5, enumC21213pM106676i5, null, false, 0, null, null, null, false, null, interfaceC4339a19, interfaceC4339a110, (InterfaceC4339a) objM87133R4, null, null, null, c28655q, (i48 << 3) | (i48 << 6) | (i48 << 9) | (i48 << 27), 0, 0, 239062464);
                                    c28655q = c28655q;
                                    c28655q.m87173q(true);
                                    z28 = false;
                                    c28655q.m87173q(false);
                                }
                                m114131b0(eVar5, function12, function13, c28655q, (i26 & 126) | ((i26 >> 3) & 896), 0);
                                c28655q.m87173q(z28);
                            }
                        }
                        function7 = function12;
                        function9 = function13;
                        function8 = function14;
                    }
                    function14 = function15;
                    function7 = function12;
                    function9 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 16);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35509k(26);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function10 = (Function1) objM87133R11;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C35509k(29);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function5 = (Function1) objM87133R10;
                }
                if (i18 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35926d(0);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function11 = (Function1) objM87133R9;
                } else {
                    function11 = function6;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_test_results", c28655q, i24 | 48);
                z13 = viewState instanceof AbstractC33749h.b;
                c2314t = C2314t.f9131w;
                if (z13) {
                    c28655q.m87150e0(-223039712);
                    C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j4);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a16);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m111);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N111);
                    function12 = function10;
                    function15 = function5;
                    function13 = function11;
                    AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC33749h.a) {
                    c28655q.m87150e0(-222642447);
                    C23010x c23010xM66775a17 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a17);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m112);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N112);
                    TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC16277f.f62265N1);
                    if ((i15 & 112) == 32) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z38) {
                        objM87133R8 = new C34904e(function10, 13);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C34904e(function10, 13);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function13 = function11;
                    function15 = function5;
                    function12 = function10;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k6, 0L, (InterfaceC4339a) objM87133R8, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC33749h.d) {
                    c28655q.m87150e0(-222058655);
                    C23010x c23010xM66775a18 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a18);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m113);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N113);
                    function12 = function10;
                    function13 = function11;
                    function15 = function5;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function12 = function10;
                    list = null;
                    objArr9 = 0;
                    objArr8 = 0;
                    objArr7 = 0;
                    objArr6 = 0;
                    objArr5 = 0;
                    objArr4 = 0;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState instanceof AbstractC33749h.c) {
                        c28655q.m87150e0(-221675681);
                        int i214 = 2;
                        AbstractC33208p0.b bVar11 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i214, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a11 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b16 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i214, objArr3 == true ? 1 : 0);
                        if ((i15 & 112) == 32) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z37) {
                            objM87133R7 = new C34904e(function12, 14);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C34904e(function12, 14);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function13 = function11;
                        function15 = function5;
                        AbstractC33199m0.m105214F(bVar11, textResourceM21267a11, null, c8688b16, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function11;
                        if (viewState instanceof AbstractC33749h.f) {
                            c28655q.m87150e0(-221235140);
                            int i311112 = 2;
                            AbstractC33208p0.b bVar12 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr4 == true ? 1 : 0, i311112, objArr5 == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a12 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b17 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr6 == true ? 1 : 0, i311112, objArr7 == true ? 1 : 0);
                            TextResource.C8688b c8688b18 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i311112, objArr9 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (i24 == 4) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z29 | z34;
                            objM87133R5 = c28655q.m87133R();
                            if (z35) {
                                objM87133R5 = new C35015q(14, function13, viewState);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C35015q(14, function13, viewState);
                                c28655q.m87172p0(objM87133R5);
                            }
                            InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R5;
                            if ((i15 & 112) == 32) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z36) {
                                objM87133R6 = new C34904e(function12, 15);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C34904e(function12, 15);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R6;
                            int i311113 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                            int i311114 = TextResource.C8688b.f25889c;
                            int i311115 = i311113 | (i311114 << 9) | (i311114 << 21);
                            function13 = function13;
                            AbstractC33199m0.m105214F(bVar12, textResourceM21267a12, null, c8688b17, interfaceC4339a111, false, false, c8688b18, interfaceC4339a112, null, false, false, c28655q, i311115, 0, 3684);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function14 = function5;
                        } else {
                            function14 = function5;
                            if (viewState instanceof AbstractC33749h.e) {
                                throw AbstractC11895b.m32003v(-561381883, c28655q, false);
                            }
                            c28655q.m87150e0(-220625494);
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R = c28655q.m87133R();
                            if (z16) {
                                objM87133R = new b(function14, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new b(function14, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            AbstractC33749h.e eVar6 = (AbstractC33749h.e) viewState;
                            c33746eM106696h = eVar6.getPopUpDialog();
                            if (c33746eM106696h == null) {
                                c28655q.m87150e0(-220454654);
                                c28655q.m87173q(false);
                                i26 = i15;
                                z28 = false;
                                function14 = function14;
                            } else {
                                c28655q.m87150e0(-220454653);
                                Modifier modifierM7154a6 = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
                                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM7154a6);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m114);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N114);
                                Modifier modifierMo3400a6 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                                TextResource textResourceM106675h6 = c33746eM106696h.getTitle();
                                TextResource textResourceM106668a6 = c33746eM106696h.getDescription();
                                TextResource textResourceM106670c6 = c33746eM106696h.getPrimaryActionText();
                                InterfaceC39332e interfaceC39332eM106669b6 = c33746eM106696h.getPrimaryActionColor();
                                TextResource textResourceM106672e6 = c33746eM106696h.getSecondaryActionText();
                                boolean zM106674g6 = c33746eM106696h.getShowCloseIcon();
                                boolean zM106677j6 = c33746eM106696h.getUseSolidButtons();
                                EnumC21213p enumC21213pM106676i6 = c33746eM106696h.getTopDialogStyle();
                                i25 = i15 & 7168;
                                i26 = i15;
                                if (i25 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z17) {
                                    objM87133R2 = new C34904e(function13, 16);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C34904e(function13, 16);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R2;
                                if (i25 == 2048) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                boolean zM87157i11 = z18 | c28655q.m87157i(c33746eM106696h);
                                i27 = i26 & 112;
                                if (i27 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z24 = zM87157i11 | z19;
                                objM87133R3 = c28655q.m87133R();
                                if (z24) {
                                    final int i311116 = 1;
                                    objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i311116) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    final int i311117 = 1;
                                    objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i311117) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                }
                                InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R3;
                                if (i25 == 2048) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean zM87157i12 = z25 | c28655q.m87157i(c33746eM106696h);
                                if (i27 == 32) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                z27 = zM87157i12 | z26;
                                objM87133R4 = c28655q.m87133R();
                                if (z27) {
                                    final int i311118 = 0;
                                    objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i311118) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    final int i311119 = 0;
                                    objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i311119) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R4);
                                }
                                int i49 = TextResource.$stable;
                                AbstractC21211n.m59497o(modifierMo3400a6, textResourceM106675h6, textResourceM106668a6, textResourceM106670c6, zM106677j6, interfaceC39332eM106669b6, null, null, null, textResourceM106672e6, null, false, zM106674g6, enumC21213pM106676i6, null, false, 0, null, null, null, false, null, interfaceC4339a113, interfaceC4339a114, (InterfaceC4339a) objM87133R4, null, null, null, c28655q, (i49 << 3) | (i49 << 6) | (i49 << 9) | (i49 << 27), 0, 0, 239062464);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                z28 = false;
                                c28655q.m87173q(false);
                            }
                            m114131b0(eVar6, function12, function13, c28655q, (i26 & 126) | ((i26 >> 3) & 896), 0);
                            c28655q.m87173q(z28);
                        }
                    }
                    function7 = function12;
                    function9 = function13;
                    function8 = function14;
                }
                function14 = function15;
                function7 = function12;
                function9 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 16);
            }
        }
        i15 |= 384;
        function5 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35509k(26);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function10 = (Function1) objM87133R11;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C35509k(29);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function5 = (Function1) objM87133R10;
                }
                if (i18 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35926d(0);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function11 = (Function1) objM87133R9;
                } else {
                    function11 = function6;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_test_results", c28655q, i24 | 48);
                z13 = viewState instanceof AbstractC33749h.b;
                c2314t = C2314t.f9131w;
                if (z13) {
                    c28655q.m87150e0(-223039712);
                    C23010x c23010xM66775a19 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j4);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a19);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m115);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N115);
                    function12 = function10;
                    function15 = function5;
                    function13 = function11;
                    AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC33749h.a) {
                    c28655q.m87150e0(-222642447);
                    C23010x c23010xM66775a110 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a110);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m116);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N116);
                    TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC16277f.f62265N1);
                    if ((i15 & 112) == 32) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z38) {
                        objM87133R8 = new C34904e(function10, 13);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C34904e(function10, 13);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function13 = function11;
                    function15 = function5;
                    function12 = function10;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k7, 0L, (InterfaceC4339a) objM87133R8, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC33749h.d) {
                    c28655q.m87150e0(-222058655);
                    C23010x c23010xM66775a111 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a111);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m117);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N117);
                    function12 = function10;
                    function13 = function11;
                    function15 = function5;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function12 = function10;
                    list = null;
                    objArr9 = 0;
                    objArr8 = 0;
                    objArr7 = 0;
                    objArr6 = 0;
                    objArr5 = 0;
                    objArr4 = 0;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState instanceof AbstractC33749h.c) {
                        c28655q.m87150e0(-221675681);
                        int i215 = 2;
                        AbstractC33208p0.b bVar13 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i215, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a13 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b19 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i215, objArr3 == true ? 1 : 0);
                        if ((i15 & 112) == 32) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z37) {
                            objM87133R7 = new C34904e(function12, 14);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C34904e(function12, 14);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function13 = function11;
                        function15 = function5;
                        AbstractC33199m0.m105214F(bVar13, textResourceM21267a13, null, c8688b19, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function11;
                        if (viewState instanceof AbstractC33749h.f) {
                            c28655q.m87150e0(-221235140);
                            int i3111110 = 2;
                            AbstractC33208p0.b bVar14 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr4 == true ? 1 : 0, i3111110, objArr5 == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a14 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b110 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr6 == true ? 1 : 0, i3111110, objArr7 == true ? 1 : 0);
                            TextResource.C8688b c8688b111 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i3111110, objArr9 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (i24 == 4) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z29 | z34;
                            objM87133R5 = c28655q.m87133R();
                            if (z35) {
                                objM87133R5 = new C35015q(14, function13, viewState);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C35015q(14, function13, viewState);
                                c28655q.m87172p0(objM87133R5);
                            }
                            InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R5;
                            if ((i15 & 112) == 32) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z36) {
                                objM87133R6 = new C34904e(function12, 15);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C34904e(function12, 15);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R6;
                            int i3111111 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                            int i3111112 = TextResource.C8688b.f25889c;
                            int i3111113 = i3111111 | (i3111112 << 9) | (i3111112 << 21);
                            function13 = function13;
                            AbstractC33199m0.m105214F(bVar14, textResourceM21267a14, null, c8688b110, interfaceC4339a115, false, false, c8688b111, interfaceC4339a116, null, false, false, c28655q, i3111113, 0, 3684);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function14 = function5;
                        } else {
                            function14 = function5;
                            if (viewState instanceof AbstractC33749h.e) {
                                throw AbstractC11895b.m32003v(-561381883, c28655q, false);
                            }
                            c28655q.m87150e0(-220625494);
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R = c28655q.m87133R();
                            if (z16) {
                                objM87133R = new b(function14, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new b(function14, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            AbstractC33749h.e eVar7 = (AbstractC33749h.e) viewState;
                            c33746eM106696h = eVar7.getPopUpDialog();
                            if (c33746eM106696h == null) {
                                c28655q.m87150e0(-220454654);
                                c28655q.m87173q(false);
                                i26 = i15;
                                z28 = false;
                                function14 = function14;
                            } else {
                                c28655q.m87150e0(-220454653);
                                Modifier modifierM7154a7 = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
                                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM7154a7);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m118);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N118);
                                Modifier modifierMo3400a7 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                                TextResource textResourceM106675h7 = c33746eM106696h.getTitle();
                                TextResource textResourceM106668a7 = c33746eM106696h.getDescription();
                                TextResource textResourceM106670c7 = c33746eM106696h.getPrimaryActionText();
                                InterfaceC39332e interfaceC39332eM106669b7 = c33746eM106696h.getPrimaryActionColor();
                                TextResource textResourceM106672e7 = c33746eM106696h.getSecondaryActionText();
                                boolean zM106674g7 = c33746eM106696h.getShowCloseIcon();
                                boolean zM106677j7 = c33746eM106696h.getUseSolidButtons();
                                EnumC21213p enumC21213pM106676i7 = c33746eM106696h.getTopDialogStyle();
                                i25 = i15 & 7168;
                                i26 = i15;
                                if (i25 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z17) {
                                    objM87133R2 = new C34904e(function13, 16);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C34904e(function13, 16);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R2;
                                if (i25 == 2048) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                boolean zM87157i13 = z18 | c28655q.m87157i(c33746eM106696h);
                                i27 = i26 & 112;
                                if (i27 == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z24 = zM87157i13 | z19;
                                objM87133R3 = c28655q.m87133R();
                                if (z24) {
                                    final int i3111114 = 1;
                                    objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i3111114) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    final int i3111115 = 1;
                                    objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i3111115) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                }
                                InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R3;
                                if (i25 == 2048) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean zM87157i14 = z25 | c28655q.m87157i(c33746eM106696h);
                                if (i27 == 32) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                z27 = zM87157i14 | z26;
                                objM87133R4 = c28655q.m87133R();
                                if (z27) {
                                    final int i3111116 = 0;
                                    objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i3111116) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    final int i3111117 = 0;
                                    objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i3111117) {
                                                case 0:
                                                    return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                                default:
                                                    return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R4);
                                }
                                int i410 = TextResource.$stable;
                                AbstractC21211n.m59497o(modifierMo3400a7, textResourceM106675h7, textResourceM106668a7, textResourceM106670c7, zM106677j7, interfaceC39332eM106669b7, null, null, null, textResourceM106672e7, null, false, zM106674g7, enumC21213pM106676i7, null, false, 0, null, null, null, false, null, interfaceC4339a117, interfaceC4339a118, (InterfaceC4339a) objM87133R4, null, null, null, c28655q, (i410 << 3) | (i410 << 6) | (i410 << 9) | (i410 << 27), 0, 0, 239062464);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                z28 = false;
                                c28655q.m87173q(false);
                            }
                            m114131b0(eVar7, function12, function13, c28655q, (i26 & 126) | ((i26 >> 3) & 896), 0);
                            c28655q.m87173q(z28);
                        }
                    }
                    function7 = function12;
                    function9 = function13;
                    function8 = function14;
                }
                function14 = function15;
                function7 = function12;
                function9 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 16);
            }
        }
        i15 |= 3072;
        function6 = function3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C35509k(26);
                    c28655q.m87172p0(objM87133R11);
                }
                function10 = (Function1) objM87133R11;
            } else {
                function10 = function4;
            }
            if (i16 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C35509k(29);
                    c28655q.m87172p0(objM87133R10);
                }
                function5 = (Function1) objM87133R10;
            }
            if (i18 != 0) {
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C35926d(0);
                    c28655q.m87172p0(objM87133R9);
                }
                function11 = (Function1) objM87133R9;
            } else {
                function11 = function6;
            }
            i24 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_test_results", c28655q, i24 | 48);
            z13 = viewState instanceof AbstractC33749h.b;
            c2314t = C2314t.f9131w;
            if (z13) {
                c28655q.m87150e0(-223039712);
                C23010x c23010xM66775a112 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j4 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j4);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a112);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m119);
                c0209i4 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N119);
                function12 = function10;
                function15 = function5;
                function13 = function11;
                AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC33749h.a) {
                c28655q.m87150e0(-222642447);
                C23010x c23010xM66775a113 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a113);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1110);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1110);
                TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC16277f.f62265N1);
                if ((i15 & 112) == 32) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z38) {
                    objM87133R8 = new C34904e(function10, 13);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C34904e(function10, 13);
                    c28655q.m87172p0(objM87133R8);
                }
                function13 = function11;
                function15 = function5;
                function12 = function10;
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k8, 0L, (InterfaceC4339a) objM87133R8, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC33749h.d) {
                c28655q.m87150e0(-222058655);
                C23010x c23010xM66775a114 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a114);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1111);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1111);
                function12 = function10;
                function13 = function11;
                function15 = function5;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                function12 = function10;
                list = null;
                objArr9 = 0;
                objArr8 = 0;
                objArr7 = 0;
                objArr6 = 0;
                objArr5 = 0;
                objArr4 = 0;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (viewState instanceof AbstractC33749h.c) {
                    c28655q.m87150e0(-221675681);
                    int i216 = 2;
                    AbstractC33208p0.b bVar15 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i216, objArr == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a15 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b112 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i216, objArr3 == true ? 1 : 0);
                    if ((i15 & 112) == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z37) {
                        objM87133R7 = new C34904e(function12, 14);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C34904e(function12, 14);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function13 = function11;
                    function15 = function5;
                    AbstractC33199m0.m105214F(bVar15, textResourceM21267a15, null, c8688b112, (InterfaceC4339a) objM87133R7, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function13 = function11;
                    if (viewState instanceof AbstractC33749h.f) {
                        c28655q.m87150e0(-221235140);
                        int i3111118 = 2;
                        AbstractC33208p0.b bVar16 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, objArr4 == true ? 1 : 0, i3111118, objArr5 == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a16 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b113 = new TextResource.C8688b(AbstractC35283c.f150176N, objArr6 == true ? 1 : 0, i3111118, objArr7 == true ? 1 : 0);
                        TextResource.C8688b c8688b114 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i3111118, objArr9 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (i24 == 4) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = z29 | z34;
                        objM87133R5 = c28655q.m87133R();
                        if (z35) {
                            objM87133R5 = new C35015q(14, function13, viewState);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C35015q(14, function13, viewState);
                            c28655q.m87172p0(objM87133R5);
                        }
                        InterfaceC4339a interfaceC4339a119 = (InterfaceC4339a) objM87133R5;
                        if ((i15 & 112) == 32) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z36) {
                            objM87133R6 = new C34904e(function12, 15);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C34904e(function12, 15);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R6;
                        int i3111119 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                        int i31111110 = TextResource.C8688b.f25889c;
                        int i31111111 = i3111119 | (i31111110 << 9) | (i31111110 << 21);
                        function13 = function13;
                        AbstractC33199m0.m105214F(bVar16, textResourceM21267a16, null, c8688b113, interfaceC4339a119, false, false, c8688b114, interfaceC4339a1110, null, false, false, c28655q, i31111111, 0, 3684);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function14 = function5;
                    } else {
                        function14 = function5;
                        if (viewState instanceof AbstractC33749h.e) {
                            throw AbstractC11895b.m32003v(-561381883, c28655q, false);
                        }
                        c28655q.m87150e0(-220625494);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            objM87133R = new b(function14, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new b(function14, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        AbstractC33749h.e eVar8 = (AbstractC33749h.e) viewState;
                        c33746eM106696h = eVar8.getPopUpDialog();
                        if (c33746eM106696h == null) {
                            c28655q.m87150e0(-220454654);
                            c28655q.m87173q(false);
                            i26 = i15;
                            z28 = false;
                            function14 = function14;
                        } else {
                            c28655q.m87150e0(-220454653);
                            Modifier modifierM7154a8 = AbstractC2294a.m7154a(Float.MAX_VALUE, AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(0.85f, C17919x.f69625b), AbstractC17918w0.f69621a));
                            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM7154a8);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1112);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1112);
                            Modifier modifierMo3400a8 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                            TextResource textResourceM106675h8 = c33746eM106696h.getTitle();
                            TextResource textResourceM106668a8 = c33746eM106696h.getDescription();
                            TextResource textResourceM106670c8 = c33746eM106696h.getPrimaryActionText();
                            InterfaceC39332e interfaceC39332eM106669b8 = c33746eM106696h.getPrimaryActionColor();
                            TextResource textResourceM106672e8 = c33746eM106696h.getSecondaryActionText();
                            boolean zM106674g8 = c33746eM106696h.getShowCloseIcon();
                            boolean zM106677j8 = c33746eM106696h.getUseSolidButtons();
                            EnumC21213p enumC21213pM106676i8 = c33746eM106696h.getTopDialogStyle();
                            i25 = i15 & 7168;
                            i26 = i15;
                            if (i25 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                objM87133R2 = new C34904e(function13, 16);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C34904e(function13, 16);
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R2;
                            if (i25 == 2048) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean zM87157i15 = z18 | c28655q.m87157i(c33746eM106696h);
                            i27 = i26 & 112;
                            if (i27 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z24 = zM87157i15 | z19;
                            objM87133R3 = c28655q.m87133R();
                            if (z24) {
                                final int i31111112 = 1;
                                objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i31111112) {
                                            case 0:
                                                return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                            default:
                                                return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                final int i31111113 = 1;
                                objM87133R3 = new InterfaceC4339a() { // from class: ve0.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i31111113) {
                                            case 0:
                                                return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                            default:
                                                return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            }
                            InterfaceC4339a interfaceC4339a1112 = (InterfaceC4339a) objM87133R3;
                            if (i25 == 2048) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            boolean zM87157i16 = z25 | c28655q.m87157i(c33746eM106696h);
                            if (i27 == 32) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = zM87157i16 | z26;
                            objM87133R4 = c28655q.m87133R();
                            if (z27) {
                                final int i31111114 = 0;
                                objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i31111114) {
                                            case 0:
                                                return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                            default:
                                                return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                final int i31111115 = 0;
                                objM87133R4 = new InterfaceC4339a() { // from class: ve0.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i31111115) {
                                            case 0:
                                                return AbstractC35927e.m114122U(function13, c33746eM106696h, function12);
                                            default:
                                                return AbstractC35927e.m114121T(function13, c33746eM106696h, function12);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i411 = TextResource.$stable;
                            AbstractC21211n.m59497o(modifierMo3400a8, textResourceM106675h8, textResourceM106668a8, textResourceM106670c8, zM106677j8, interfaceC39332eM106669b8, null, null, null, textResourceM106672e8, null, false, zM106674g8, enumC21213pM106676i8, null, false, 0, null, null, null, false, null, interfaceC4339a1111, interfaceC4339a1112, (InterfaceC4339a) objM87133R4, null, null, null, c28655q, (i411 << 3) | (i411 << 6) | (i411 << 9) | (i411 << 27), 0, 0, 239062464);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            z28 = false;
                            c28655q.m87173q(false);
                        }
                        m114131b0(eVar8, function12, function13, c28655q, (i26 & 126) | ((i26 >> 3) & 896), 0);
                        c28655q.m87173q(z28);
                    }
                }
                function7 = function12;
                function9 = function13;
                function8 = function14;
            }
            function14 = function15;
            function7 = function12;
            function9 = function13;
            function8 = function14;
        } else {
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m114118Q(AbstractC32419a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m114119R(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m114120S(Function1 function1) {
        function1.invoke(AbstractC33747f.a.f141153a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m114121T(Function1 function1, C33746e c33746e, Function1 function2) {
        function1.invoke(AbstractC33747f.a.f141153a);
        C9598e c9598eM106673f = c33746e.getSecondaryNavigationAction();
        if (c9598eM106673f != null) {
            function2.invoke(new AbstractC32419a.c(c9598eM106673f));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m114122U(Function1 function1, C33746e c33746e, Function1 function2) {
        function1.invoke(AbstractC33747f.a.f141153a);
        C9598e c9598eM106671d = c33746e.getPrimaryNavigationAction();
        if (c9598eM106671d != null) {
            function2.invoke(new AbstractC32419a.c(c9598eM106671d));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m114123V(AbstractC33749h abstractC33749h, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m114117P(abstractC33749h, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m114124W(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m114125X(Function1 function1) {
        function1.invoke(AbstractC32419a.a.f134176a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m114126Y(Function1 function1) {
        function1.invoke(AbstractC32419a.a.f134176a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m114127Z(Function1 function1, AbstractC33749h abstractC33749h) {
        function1.invoke(new C36548c(((AbstractC33749h.f) abstractC33749h).getAction()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m114129a0(Function1 function1) {
        function1.invoke(AbstractC32419a.a.f134176a);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b0 */
    public static final void m114131b0(AbstractC33749h.e viewState, Function1 onNavigationEvent, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1143880291);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35509k(27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                Function1 function5 = function4;
                function3 = function5;
                AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3M3460c), null, null, null, null, AbstractC37817c.m121344e(-857562065, c28655q, new C0563n(viewState, interfaceC2994c0, c15199y3M3460c, function5, onNavigationEvent, 16)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1445977365, c28655q, new C0556g((Object) viewState, onNavigationEvent, (Object) function3, (Object) interfaceC2994c0, (Object) c15199y3M3460c, 23)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                c28655q = c28655q;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d((Object) viewState, onNavigationEvent, (InterfaceC23459e) function3, i13, i14, 7);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35509k(27);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R;
            C15199y3 c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
            Function1 function6 = function4;
            function3 = function6;
            AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(c15199y3M3460c2), null, null, null, null, AbstractC37817c.m121344e(-857562065, c28655q, new C0563n(viewState, interfaceC2994c1, c15199y3M3460c2, function6, onNavigationEvent, 16)), false, null, null, null, false, null, AbstractC37817c.m121344e(-1445977365, c28655q, new C0556g((Object) viewState, onNavigationEvent, (Object) function3, (Object) interfaceC2994c1, (Object) c15199y3M3460c2, 23)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d((Object) viewState, onNavigationEvent, (InterfaceC23459e) function3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m114133c0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m114135d0(AbstractC33749h.e eVar, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, Function1 function2, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C33744c c33744cM106697i = eVar.getTestResultBottomSheet();
            if (c33744cM106697i == null) {
                c28655q.m87150e0(-1165931591);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1165931590);
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function1) | c28655q.m87153g(function2);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C31915d(interfaceC2994c0, c15199y3, function1, function2);
                    c28655q.m87172p0(objM87133R);
                }
                m114103B(c33744cM106697i, (Function1) objM87133R, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m114137e0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, Function1 function2, C33743b item) {
        AbstractC22676k.m65750j(item, "item");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c15199y3, null), 3);
        C33746e c33746eM106634c = item.getDialog();
        if (c33746eM106634c != null) {
            function1.invoke(new AbstractC33747f.c(c33746eM106634c));
        } else {
            Action actionM106632a = item.getAction();
            if (actionM106632a != null) {
                function1.invoke(new C36548c(actionM106632a));
            } else {
                C9598e c9598eM106636e = item.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
                if (c9598eM106636e != null) {
                    function2.invoke(new AbstractC32419a.c(c9598eM106636e));
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m114139f0(AbstractC33749h.e eVar, Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C3196h(interfaceC2994c0, c15199y3, 25);
                c28655q.m87172p0(objM87133R);
            }
            m114106E(eVar, function1, function2, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m114141g0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m114143h0(AbstractC33749h.e eVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m114131b0(eVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m114145i0(Object event, Function1 onNavigationEvent, Function1 onViewEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        if (event instanceof C9598e) {
            onNavigationEvent.invoke(new AbstractC32419a.c((C9598e) event));
            return;
        }
        if (event instanceof ArticleTileModelEvent.Url) {
            ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) event;
            if (AbstractC39414r.m125890i0(url.getUrl())) {
                return;
            }
            onNavigationEvent.invoke(new AbstractC32419a.c(new C9598e(AppScreen.C9457y2.f28061w, new InAppBrowserScreenModel(url.getUrl()), null, 4, null)));
            return;
        }
        if (event instanceof C23943m0) {
            onNavigationEvent.invoke(new AbstractC32419a.c(((C23943m0) event).getCtaButton().getNavigationAction()));
            return;
        }
        if (event instanceof AbstractC21243b.b) {
            onNavigationEvent.invoke(new AbstractC32419a.c(((AbstractC21243b.b) event).getDestination()));
            return;
        }
        if (event instanceof C32048d) {
            C9598e c9598eM99591c = ((C32048d) event).getDestination();
            if (c9598eM99591c != null) {
                onNavigationEvent.invoke(new AbstractC32419a.c(c9598eM99591c));
                return;
            }
            return;
        }
        if (event instanceof C23908d1) {
            onViewEvent.invoke(new AbstractC33747f.b(((C23908d1) event).getId()));
            return;
        }
        if (!(event instanceof C27256h)) {
            onViewEvent.invoke(event);
            return;
        }
        C27256h c27256h = (C27256h) event;
        Action action = c27256h.getAction();
        if (action != null) {
            onViewEvent.invoke(new C36548c(action));
        } else {
            onNavigationEvent.invoke(new AbstractC32419a.c(c27256h.getDestination()));
        }
    }
}
