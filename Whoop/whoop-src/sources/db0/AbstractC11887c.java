package db0;

import a01.C0086f;
import a01.EnumC0093m;
import ab0.AbstractC0706a;
import am2.C1008b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1910d;
import az1.C2165f;
import b01.C2192m;
import b30.C2476a1;
import b91.C2886a;
import bb0.AbstractC2922b;
import bb0.AbstractC2924d;
import bb0.C2921a;
import bc3.InterfaceC2994c0;
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
import com.whoop.profile.view.C9813i;
import com.whoop.whoopaction.domain.models.Action;
import d11.C11473h;
import d71.C11757c;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ep0.C13404j;
import f01.C13869j;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import j21.AbstractC21243b;
import java.util.List;
import k11.AbstractC22122e;
import kd0.C22383c;
import kd0.InterfaceC22381a;
import kf0.AbstractC22431f;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lf0.AbstractC23959q0;
import lf0.AbstractC23962r;
import md0.AbstractC25450e;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
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
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q11.AbstractC29791a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s01.C32048d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: db0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a{\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001ao\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00102\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0087\u0001\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0017\u001a\u00020\u001b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a?\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b!\u0010\"¨\u0006$²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u001c8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lbb0/d;", "viewState", "", "source", "Lkotlin/Function1;", "Lbb0/b;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whoopaction/domain/models/Action;", "onAction", "Lkd0/a$c;", "onAnalyticsEvent", "Lab0/a;", "onNavigationEvent", "O", "(Lbb0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lbb0/d$c;", "v", "(Lbb0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lbb0/a;", "L", "(Lbb0/a;Landroidx/compose/runtime/Composer;I)V", "Lkd0/a;", NotificationCompat.CATEGORY_EVENT, "V", "(Lkd0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "biomarkerId", "", "Lkd0/c$b;", "onShowDialog", "W", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lk11/e;", "X", "(Lk11/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "dialogFromButton", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11887c {

    /* JADX INFO: renamed from: db0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsScreenKt$BiomarkerDetailsScreen$7$1", m100430f = "BiomarkerDetailsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f38856w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f38857x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC2924d f38858y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f38859z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, AbstractC2924d abstractC2924d, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38857x = function1;
            this.f38858y = abstractC2924d;
            this.f38859z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f38857x, this.f38858y, this.f38859z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f38856w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f38857x.invoke(new InterfaceC22381a.d0(((AbstractC2924d.c) this.f38858y).getAnalyticsData(), this.f38859z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m31866A(AbstractC0706a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final C22383c.b m31867B(InterfaceC28601c1 interfaceC28601c1) {
        return (C22383c.b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m31868C(InterfaceC28601c1 interfaceC28601c1, C22383c.b bVar) {
        interfaceC28601c1.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m31869D(InterfaceC28601c1 interfaceC28601c1) {
        m31868C(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m31870E(Function1 function1, Function1 function2, InterfaceC22381a advancedLabsEvent) {
        AbstractC22676k.m65750j(advancedLabsEvent, "advancedLabsEvent");
        m31887V(advancedLabsEvent, function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Modifier m31871F(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15673b0.m44038g0(applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Modifier m31872G(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15673b0.m44054o0(applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final Modifier m31873H(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15673b0.m44072x0(applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m31874I(Function1 function1) {
        function1.invoke(AbstractC0706a.b.f2682a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m31875J(AbstractC2924d.c cVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC28601c1 interfaceC28601c1, Object event) {
        C22383c.b bVarM74805c;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AnyModal) {
            Modal modal = ((AnyModal) event).getModal();
            DialogModel dialogModel = modal instanceof DialogModel ? (DialogModel) modal : null;
            if (dialogModel != null && (bVarM74805c = AbstractC25450e.m74805c(dialogModel)) != null) {
                m31868C(interfaceC28601c1, bVarM74805c);
            }
        } else {
            m31888W(cVar.getBiomarkerId(), function1, function2, function3, event, function4, new C1910d(20, interfaceC28601c1));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m31876K(InterfaceC28601c1 interfaceC28601c1, C22383c.b it) {
        AbstractC22676k.m65750j(it, "it");
        m31868C(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    public static final void m31877L(C2921a viewState, Composer composer, int i13) {
        int i14;
        C2921a c2921a;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2002111002);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 2;
            float f14 = 8;
            float f15 = f13 * f14;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
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
            String strM8513c = viewState.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8416N = c38072d.m121952e(c28655q, i15).getT1();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 1 * f14, 5), "BiomarkerDetails_Title");
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM8513c, modifierM44101d, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 0, i16, 196600);
            AbstractC30795n.m94707h(viewState.getSubtitle(), AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7), "BiomarkerDetails_Subtitle"), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196600);
            c28655q = c28655q;
            if (viewState.m8511a().isEmpty()) {
                c2921a = viewState;
                c28655q.m87150e0(1246769766);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1245912554);
                float f16 = 4;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16 * f14, 7);
                float f17 = f13 * f16;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f17);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f17);
                c2921a = viewState;
                AbstractC22960g2.m66729a(modifierM3398t, c22971kM66746i, c22971kM66746i2, null, 0, 0, AbstractC37817c.m121344e(892822620, c28655q, new C2476a1(c2921a, 13)), c28655q, 1573302, 56);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c2921a = viewState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(c2921a, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m31878M(C2921a c2921a, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (String str : c2921a.m8511a()) {
                float f13 = 4;
                float f14 = 3 * f13;
                Modifier modifierM118994r = AbstractC37056f.m118994r(C2314t.f9131w, AbstractC33253j.m105489e(f14));
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, i14).getWhite5(), AbstractC17918w0.f69621a), f14, 2 * f13);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m31879N(C2921a c2921a, int i13, Composer composer, int i14) {
        m31877L(c2921a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0162  */
    /* JADX WARN: Code duplicated, block: B:102:0x0166  */
    /* JADX WARN: Code duplicated, block: B:105:0x0179  */
    /* JADX WARN: Code duplicated, block: B:107:0x0187  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:115:0x0206  */
    /* JADX WARN: Code duplicated, block: B:118:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0210  */
    /* JADX WARN: Code duplicated, block: B:121:0x0247  */
    /* JADX WARN: Code duplicated, block: B:123:0x024d  */
    /* JADX WARN: Code duplicated, block: B:125:0x025c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0260  */
    /* JADX WARN: Code duplicated, block: B:129:0x0264  */
    /* JADX WARN: Code duplicated, block: B:130:0x0267  */
    /* JADX WARN: Code duplicated, block: B:134:0x0270  */
    /* JADX WARN: Code duplicated, block: B:137:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX INFO: renamed from: O */
    public static final void m31880O(AbstractC2924d viewState, String str, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        int i24;
        Function1 function7;
        int i25;
        int i26;
        Function1 function8;
        int i27;
        boolean z4;
        Function1 function9;
        String str3;
        Function1 function10;
        Function1 function11;
        Function1 function12;
        C28677v1 c28677v1M87180u;
        List list;
        C28676v0 c28676v0;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        int i28;
        ?? r24;
        ?? r10;
        ?? r14;
        ?? r15;
        Object objM87133R;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        ?? r25;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        ?? r16;
        ?? r17;
        ?? r18;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-358043958);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function1;
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
                        function6 = function2;
                        if (c28655q.m87157i(function6)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            function7 = function3;
                            if (c28655q.m87157i(function7)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                            function8 = function4;
                        } else {
                            function8 = function4;
                            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                                if (c28655q.m87157i(function8)) {
                                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                                } else {
                                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                                }
                                i15 |= i27;
                            }
                        }
                        if ((i15 & 74899) != 74898) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z4)) {
                            list = null;
                            r18 = 0;
                            r17 = 0;
                            r16 = 0;
                            if (i29 != 0) {
                                str2 = null;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C11473h(16);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                function13 = (Function1) objM87133R6;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C11473h(22);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                function14 = (Function1) objM87133R5;
                            } else {
                                function14 = function6;
                            }
                            if (i24 != 0) {
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C11473h(23);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                function15 = (Function1) objM87133R4;
                            } else {
                                function15 = function7;
                            }
                            if (i26 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C11473h(24);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                function8 = (Function1) objM87133R3;
                            }
                            i28 = i15 & 14;
                            AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                            if (viewState instanceof AbstractC2924d.b) {
                                c28655q.m87150e0(-2083246207);
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                                function18 = function15;
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC2924d.a) {
                                    c28655q.m87150e0(-2082858118);
                                    int i34 = 2;
                                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i34, r16 == true ? 1 : 0), false, null, 6, null);
                                    r25 = true;
                                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                    Function1 function19 = function15;
                                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i34, r18 == true ? 1 : 0);
                                    if ((i15 & 458752) != 131072) {
                                        r25 = false;
                                    }
                                    objM87133R2 = c28655q.m87133R();
                                    if (r25 == true || objM87133R2 == c28676v0) {
                                        objM87133R2 = new C9813i(function8, 10);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    function18 = function19;
                                    AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    r24 = true;
                                    if (viewState instanceof AbstractC2924d.c) {
                                        throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                                    }
                                    c28655q.m87150e0(-2082428241);
                                    if ((i15 & 57344) == 16384) {
                                        r10 = true;
                                    } else {
                                        r10 = false;
                                    }
                                    if (i28 == 4) {
                                        r14 = true;
                                    } else {
                                        r14 = false;
                                    }
                                    ?? r19 = r10 | r14;
                                    if ((i15 & 112) != 32) {
                                        r24 = false;
                                    }
                                    r15 = (r19 == true ? 1 : 0) | r24;
                                    objM87133R = c28655q.m87133R();
                                    if (r15 == true || objM87133R == c28676v0) {
                                        objM87133R = new a(function15, viewState, str2, null);
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                    int i35 = i15 >> 3;
                                    function16 = function8;
                                    function5 = function13;
                                    function17 = function14;
                                    m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (i35 & 57344), 0);
                                    function18 = function15;
                                    c28655q.m87173q(false);
                                }
                                function11 = function18;
                                str3 = str2;
                                function10 = function17;
                                function9 = function16;
                            }
                            function16 = function8;
                            function5 = function13;
                            function17 = function14;
                            function11 = function18;
                            str3 = str2;
                            function10 = function17;
                            function9 = function16;
                        } else {
                            c28655q.m87138X();
                            String str4 = str2;
                            function9 = function8;
                            str3 = str4;
                            function10 = function6;
                            function11 = function7;
                        }
                        function12 = function5;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                        }
                    }
                    i15 |= 24576;
                    function7 = function3;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function8 = function4;
                    } else {
                        function8 = function4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87157i(function8)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        list = null;
                        r18 = 0;
                        r17 = 0;
                        r16 = 0;
                        if (i29 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C11473h(16);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function13 = (Function1) objM87133R6;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C11473h(22);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function14 = (Function1) objM87133R5;
                        } else {
                            function14 = function6;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C11473h(23);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function15 = (Function1) objM87133R4;
                        } else {
                            function15 = function7;
                        }
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C11473h(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function8 = (Function1) objM87133R3;
                        }
                        i28 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                        if (viewState instanceof AbstractC2924d.b) {
                            c28655q.m87150e0(-2083246207);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                            function18 = function15;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC2924d.a) {
                                c28655q.m87150e0(-2082858118);
                                int i36 = 2;
                                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i36, r16 == true ? 1 : 0), false, null, 6, null);
                                r25 = true;
                                TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                                Function1 function110 = function15;
                                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i36, r18 == true ? 1 : 0);
                                if ((i15 & 458752) != 131072) {
                                    r25 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (r25 == true) {
                                    objM87133R2 = new C9813i(function8, 10);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C9813i(function8, 10);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                function18 = function110;
                                AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                r24 = true;
                                if (viewState instanceof AbstractC2924d.c) {
                                    throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                                }
                                c28655q.m87150e0(-2082428241);
                                if ((i15 & 57344) == 16384) {
                                    r10 = true;
                                } else {
                                    r10 = false;
                                }
                                if (i28 == 4) {
                                    r14 = true;
                                } else {
                                    r14 = false;
                                }
                                ?? r110 = r10 | r14;
                                if ((i15 & 112) != 32) {
                                    r24 = false;
                                }
                                r15 = (r110 == true ? 1 : 0) | r24;
                                objM87133R = c28655q.m87133R();
                                if (r15 == true) {
                                    objM87133R = new a(function15, viewState, str2, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new a(function15, viewState, str2, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                int i37 = i15 >> 3;
                                function16 = function8;
                                function5 = function13;
                                function17 = function14;
                                m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i37 & 112) | (i37 & 896) | (i37 & 7168) | (i37 & 57344), 0);
                                function18 = function15;
                                c28655q.m87173q(false);
                            }
                            function11 = function18;
                            str3 = str2;
                            function10 = function17;
                            function9 = function16;
                        }
                        function16 = function8;
                        function5 = function13;
                        function17 = function14;
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    } else {
                        c28655q.m87138X();
                        String str5 = str2;
                        function9 = function8;
                        str3 = str5;
                        function10 = function6;
                        function11 = function7;
                    }
                    function12 = function5;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                    }
                }
                i15 |= 3072;
                function6 = function2;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function7 = function3;
                        if (c28655q.m87157i(function7)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function8 = function4;
                    } else {
                        function8 = function4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87157i(function8)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        list = null;
                        r18 = 0;
                        r17 = 0;
                        r16 = 0;
                        if (i29 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C11473h(16);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function13 = (Function1) objM87133R6;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C11473h(22);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function14 = (Function1) objM87133R5;
                        } else {
                            function14 = function6;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C11473h(23);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function15 = (Function1) objM87133R4;
                        } else {
                            function15 = function7;
                        }
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C11473h(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function8 = (Function1) objM87133R3;
                        }
                        i28 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                        if (viewState instanceof AbstractC2924d.b) {
                            c28655q.m87150e0(-2083246207);
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            function18 = function15;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC2924d.a) {
                                c28655q.m87150e0(-2082858118);
                                int i38 = 2;
                                AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i38, r16 == true ? 1 : 0), false, null, 6, null);
                                r25 = true;
                                TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                                Function1 function111 = function15;
                                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i38, r18 == true ? 1 : 0);
                                if ((i15 & 458752) != 131072) {
                                    r25 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (r25 == true) {
                                    objM87133R2 = new C9813i(function8, 10);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C9813i(function8, 10);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                function18 = function111;
                                AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                r24 = true;
                                if (viewState instanceof AbstractC2924d.c) {
                                    throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                                }
                                c28655q.m87150e0(-2082428241);
                                if ((i15 & 57344) == 16384) {
                                    r10 = true;
                                } else {
                                    r10 = false;
                                }
                                if (i28 == 4) {
                                    r14 = true;
                                } else {
                                    r14 = false;
                                }
                                ?? r111 = r10 | r14;
                                if ((i15 & 112) != 32) {
                                    r24 = false;
                                }
                                r15 = (r111 == true ? 1 : 0) | r24;
                                objM87133R = c28655q.m87133R();
                                if (r15 == true) {
                                    objM87133R = new a(function15, viewState, str2, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new a(function15, viewState, str2, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                int i39 = i15 >> 3;
                                function16 = function8;
                                function5 = function13;
                                function17 = function14;
                                m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i39 & 112) | (i39 & 896) | (i39 & 7168) | (i39 & 57344), 0);
                                function18 = function15;
                                c28655q.m87173q(false);
                            }
                            function11 = function18;
                            str3 = str2;
                            function10 = function17;
                            function9 = function16;
                        }
                        function16 = function8;
                        function5 = function13;
                        function17 = function14;
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    } else {
                        c28655q.m87138X();
                        String str6 = str2;
                        function9 = function8;
                        str3 = str6;
                        function10 = function6;
                        function11 = function7;
                    }
                    function12 = function5;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                    }
                }
                i15 |= 24576;
                function7 = function3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    r18 = 0;
                    r17 = 0;
                    r16 = 0;
                    if (i29 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C11473h(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function13 = (Function1) objM87133R6;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(22);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function14 = (Function1) objM87133R5;
                    } else {
                        function14 = function6;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function15 = (Function1) objM87133R4;
                    } else {
                        function15 = function7;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C11473h(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC2924d.b) {
                        c28655q.m87150e0(-2083246207);
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                        function18 = function15;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC2924d.a) {
                            c28655q.m87150e0(-2082858118);
                            int i310 = 2;
                            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i310, r16 == true ? 1 : 0), false, null, 6, null);
                            r25 = true;
                            TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                            Function1 function112 = function15;
                            TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i310, r18 == true ? 1 : 0);
                            if ((i15 & 458752) != 131072) {
                                r25 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (r25 == true) {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function18 = function112;
                            AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            r24 = true;
                            if (viewState instanceof AbstractC2924d.c) {
                                throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                            }
                            c28655q.m87150e0(-2082428241);
                            if ((i15 & 57344) == 16384) {
                                r10 = true;
                            } else {
                                r10 = false;
                            }
                            if (i28 == 4) {
                                r14 = true;
                            } else {
                                r14 = false;
                            }
                            ?? r112 = r10 | r14;
                            if ((i15 & 112) != 32) {
                                r24 = false;
                            }
                            r15 = (r112 == true ? 1 : 0) | r24;
                            objM87133R = c28655q.m87133R();
                            if (r15 == true) {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i311 = i15 >> 3;
                            function16 = function8;
                            function5 = function13;
                            function17 = function14;
                            m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i311 & 112) | (i311 & 896) | (i311 & 7168) | (i311 & 57344), 0);
                            function18 = function15;
                            c28655q.m87173q(false);
                        }
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    }
                    function16 = function8;
                    function5 = function13;
                    function17 = function14;
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    String str7 = str2;
                    function9 = function8;
                    str3 = str7;
                    function10 = function6;
                    function11 = function7;
                }
                function12 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                }
            }
            i15 |= 384;
            function5 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function2;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function7 = function3;
                        if (c28655q.m87157i(function7)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function8 = function4;
                    } else {
                        function8 = function4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87157i(function8)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        list = null;
                        r18 = 0;
                        r17 = 0;
                        r16 = 0;
                        if (i29 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C11473h(16);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function13 = (Function1) objM87133R6;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C11473h(22);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function14 = (Function1) objM87133R5;
                        } else {
                            function14 = function6;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C11473h(23);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function15 = (Function1) objM87133R4;
                        } else {
                            function15 = function7;
                        }
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C11473h(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function8 = (Function1) objM87133R3;
                        }
                        i28 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                        if (viewState instanceof AbstractC2924d.b) {
                            c28655q.m87150e0(-2083246207);
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                            function18 = function15;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC2924d.a) {
                                c28655q.m87150e0(-2082858118);
                                int i312 = 2;
                                AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i312, r16 == true ? 1 : 0), false, null, 6, null);
                                r25 = true;
                                TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                                Function1 function113 = function15;
                                TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i312, r18 == true ? 1 : 0);
                                if ((i15 & 458752) != 131072) {
                                    r25 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (r25 == true) {
                                    objM87133R2 = new C9813i(function8, 10);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C9813i(function8, 10);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                function18 = function113;
                                AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b5, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                r24 = true;
                                if (viewState instanceof AbstractC2924d.c) {
                                    throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                                }
                                c28655q.m87150e0(-2082428241);
                                if ((i15 & 57344) == 16384) {
                                    r10 = true;
                                } else {
                                    r10 = false;
                                }
                                if (i28 == 4) {
                                    r14 = true;
                                } else {
                                    r14 = false;
                                }
                                ?? r113 = r10 | r14;
                                if ((i15 & 112) != 32) {
                                    r24 = false;
                                }
                                r15 = (r113 == true ? 1 : 0) | r24;
                                objM87133R = c28655q.m87133R();
                                if (r15 == true) {
                                    objM87133R = new a(function15, viewState, str2, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new a(function15, viewState, str2, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                int i313 = i15 >> 3;
                                function16 = function8;
                                function5 = function13;
                                function17 = function14;
                                m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i313 & 112) | (i313 & 896) | (i313 & 7168) | (i313 & 57344), 0);
                                function18 = function15;
                                c28655q.m87173q(false);
                            }
                            function11 = function18;
                            str3 = str2;
                            function10 = function17;
                            function9 = function16;
                        }
                        function16 = function8;
                        function5 = function13;
                        function17 = function14;
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    } else {
                        c28655q.m87138X();
                        String str8 = str2;
                        function9 = function8;
                        str3 = str8;
                        function10 = function6;
                        function11 = function7;
                    }
                    function12 = function5;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                    }
                }
                i15 |= 24576;
                function7 = function3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    r18 = 0;
                    r17 = 0;
                    r16 = 0;
                    if (i29 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C11473h(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function13 = (Function1) objM87133R6;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(22);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function14 = (Function1) objM87133R5;
                    } else {
                        function14 = function6;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function15 = (Function1) objM87133R4;
                    } else {
                        function15 = function7;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C11473h(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC2924d.b) {
                        c28655q.m87150e0(-2083246207);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                        function18 = function15;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC2924d.a) {
                            c28655q.m87150e0(-2082858118);
                            int i314 = 2;
                            AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i314, r16 == true ? 1 : 0), false, null, 6, null);
                            r25 = true;
                            TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                            Function1 function114 = function15;
                            TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i314, r18 == true ? 1 : 0);
                            if ((i15 & 458752) != 131072) {
                                r25 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (r25 == true) {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function18 = function114;
                            AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b6, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            r24 = true;
                            if (viewState instanceof AbstractC2924d.c) {
                                throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                            }
                            c28655q.m87150e0(-2082428241);
                            if ((i15 & 57344) == 16384) {
                                r10 = true;
                            } else {
                                r10 = false;
                            }
                            if (i28 == 4) {
                                r14 = true;
                            } else {
                                r14 = false;
                            }
                            ?? r114 = r10 | r14;
                            if ((i15 & 112) != 32) {
                                r24 = false;
                            }
                            r15 = (r114 == true ? 1 : 0) | r24;
                            objM87133R = c28655q.m87133R();
                            if (r15 == true) {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i315 = i15 >> 3;
                            function16 = function8;
                            function5 = function13;
                            function17 = function14;
                            m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i315 & 112) | (i315 & 896) | (i315 & 7168) | (i315 & 57344), 0);
                            function18 = function15;
                            c28655q.m87173q(false);
                        }
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    }
                    function16 = function8;
                    function5 = function13;
                    function17 = function14;
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    String str9 = str2;
                    function9 = function8;
                    str3 = str9;
                    function10 = function6;
                    function11 = function7;
                }
                function12 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                }
            }
            i15 |= 3072;
            function6 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function7 = function3;
                    if (c28655q.m87157i(function7)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    r18 = 0;
                    r17 = 0;
                    r16 = 0;
                    if (i29 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C11473h(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function13 = (Function1) objM87133R6;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(22);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function14 = (Function1) objM87133R5;
                    } else {
                        function14 = function6;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function15 = (Function1) objM87133R4;
                    } else {
                        function15 = function7;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C11473h(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC2924d.b) {
                        c28655q.m87150e0(-2083246207);
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                        function18 = function15;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC2924d.a) {
                            c28655q.m87150e0(-2082858118);
                            int i316 = 2;
                            AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i316, r16 == true ? 1 : 0), false, null, 6, null);
                            r25 = true;
                            TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                            Function1 function115 = function15;
                            TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i316, r18 == true ? 1 : 0);
                            if ((i15 & 458752) != 131072) {
                                r25 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (r25 == true) {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function18 = function115;
                            AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b7, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            r24 = true;
                            if (viewState instanceof AbstractC2924d.c) {
                                throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                            }
                            c28655q.m87150e0(-2082428241);
                            if ((i15 & 57344) == 16384) {
                                r10 = true;
                            } else {
                                r10 = false;
                            }
                            if (i28 == 4) {
                                r14 = true;
                            } else {
                                r14 = false;
                            }
                            ?? r115 = r10 | r14;
                            if ((i15 & 112) != 32) {
                                r24 = false;
                            }
                            r15 = (r115 == true ? 1 : 0) | r24;
                            objM87133R = c28655q.m87133R();
                            if (r15 == true) {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i317 = i15 >> 3;
                            function16 = function8;
                            function5 = function13;
                            function17 = function14;
                            m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i317 & 112) | (i317 & 896) | (i317 & 7168) | (i317 & 57344), 0);
                            function18 = function15;
                            c28655q.m87173q(false);
                        }
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    }
                    function16 = function8;
                    function5 = function13;
                    function17 = function14;
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    String str10 = str2;
                    function9 = function8;
                    str3 = str10;
                    function10 = function6;
                    function11 = function7;
                }
                function12 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                }
            }
            i15 |= 24576;
            function7 = function3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function8)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                list = null;
                r18 = 0;
                r17 = 0;
                r16 = 0;
                if (i29 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C11473h(16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function13 = (Function1) objM87133R6;
                } else {
                    function13 = function5;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C11473h(22);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function14 = (Function1) objM87133R5;
                } else {
                    function14 = function6;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function15 = (Function1) objM87133R4;
                } else {
                    function15 = function7;
                }
                if (i26 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11473h(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                }
                i28 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                if (viewState instanceof AbstractC2924d.b) {
                    c28655q.m87150e0(-2083246207);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                    function18 = function15;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC2924d.a) {
                        c28655q.m87150e0(-2082858118);
                        int i318 = 2;
                        AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i318, r16 == true ? 1 : 0), false, null, 6, null);
                        r25 = true;
                        TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                        Function1 function116 = function15;
                        TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i318, r18 == true ? 1 : 0);
                        if ((i15 & 458752) != 131072) {
                            r25 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (r25 == true) {
                            objM87133R2 = new C9813i(function8, 10);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C9813i(function8, 10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function18 = function116;
                        AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b8, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        r24 = true;
                        if (viewState instanceof AbstractC2924d.c) {
                            throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                        }
                        c28655q.m87150e0(-2082428241);
                        if ((i15 & 57344) == 16384) {
                            r10 = true;
                        } else {
                            r10 = false;
                        }
                        if (i28 == 4) {
                            r14 = true;
                        } else {
                            r14 = false;
                        }
                        ?? r116 = r10 | r14;
                        if ((i15 & 112) != 32) {
                            r24 = false;
                        }
                        r15 = (r116 == true ? 1 : 0) | r24;
                        objM87133R = c28655q.m87133R();
                        if (r15 == true) {
                            objM87133R = new a(function15, viewState, str2, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function15, viewState, str2, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        int i319 = i15 >> 3;
                        function16 = function8;
                        function5 = function13;
                        function17 = function14;
                        m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i319 & 112) | (i319 & 896) | (i319 & 7168) | (i319 & 57344), 0);
                        function18 = function15;
                        c28655q.m87173q(false);
                    }
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                }
                function16 = function8;
                function5 = function13;
                function17 = function14;
                function11 = function18;
                str3 = str2;
                function10 = function17;
                function9 = function16;
            } else {
                c28655q.m87138X();
                String str11 = str2;
                function9 = function8;
                str3 = str11;
                function10 = function6;
                function11 = function7;
            }
            function12 = function5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function1;
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
                    function6 = function2;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function7 = function3;
                        if (c28655q.m87157i(function7)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        function8 = function4;
                    } else {
                        function8 = function4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87157i(function8)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    if ((i15 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        list = null;
                        r18 = 0;
                        r17 = 0;
                        r16 = 0;
                        if (i29 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C11473h(16);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function13 = (Function1) objM87133R6;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C11473h(22);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function14 = (Function1) objM87133R5;
                        } else {
                            function14 = function6;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C11473h(23);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function15 = (Function1) objM87133R4;
                        } else {
                            function15 = function7;
                        }
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C11473h(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function8 = (Function1) objM87133R3;
                        }
                        i28 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                        if (viewState instanceof AbstractC2924d.b) {
                            c28655q.m87150e0(-2083246207);
                            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                            function18 = function15;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC2924d.a) {
                                c28655q.m87150e0(-2082858118);
                                int i3110 = 2;
                                AbstractC33208p0.b bVar9 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i3110, r16 == true ? 1 : 0), false, null, 6, null);
                                r25 = true;
                                TextResource textResourceM21267a9 = AbstractC8693b.m21267a();
                                Function1 function117 = function15;
                                TextResource.C8688b c8688b9 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i3110, r18 == true ? 1 : 0);
                                if ((i15 & 458752) != 131072) {
                                    r25 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (r25 == true) {
                                    objM87133R2 = new C9813i(function8, 10);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C9813i(function8, 10);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                function18 = function117;
                                AbstractC33199m0.m105214F(bVar9, textResourceM21267a9, null, c8688b9, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                r24 = true;
                                if (viewState instanceof AbstractC2924d.c) {
                                    throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                                }
                                c28655q.m87150e0(-2082428241);
                                if ((i15 & 57344) == 16384) {
                                    r10 = true;
                                } else {
                                    r10 = false;
                                }
                                if (i28 == 4) {
                                    r14 = true;
                                } else {
                                    r14 = false;
                                }
                                ?? r117 = r10 | r14;
                                if ((i15 & 112) != 32) {
                                    r24 = false;
                                }
                                r15 = (r117 == true ? 1 : 0) | r24;
                                objM87133R = c28655q.m87133R();
                                if (r15 == true) {
                                    objM87133R = new a(function15, viewState, str2, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new a(function15, viewState, str2, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                int i3111 = i15 >> 3;
                                function16 = function8;
                                function5 = function13;
                                function17 = function14;
                                m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i3111 & 112) | (i3111 & 896) | (i3111 & 7168) | (i3111 & 57344), 0);
                                function18 = function15;
                                c28655q.m87173q(false);
                            }
                            function11 = function18;
                            str3 = str2;
                            function10 = function17;
                            function9 = function16;
                        }
                        function16 = function8;
                        function5 = function13;
                        function17 = function14;
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    } else {
                        c28655q.m87138X();
                        String str12 = str2;
                        function9 = function8;
                        str3 = str12;
                        function10 = function6;
                        function11 = function7;
                    }
                    function12 = function5;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                    }
                }
                i15 |= 24576;
                function7 = function3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    r18 = 0;
                    r17 = 0;
                    r16 = 0;
                    if (i29 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C11473h(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function13 = (Function1) objM87133R6;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(22);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function14 = (Function1) objM87133R5;
                    } else {
                        function14 = function6;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function15 = (Function1) objM87133R4;
                    } else {
                        function15 = function7;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C11473h(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC2924d.b) {
                        c28655q.m87150e0(-2083246207);
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                        function18 = function15;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC2924d.a) {
                            c28655q.m87150e0(-2082858118);
                            int i3112 = 2;
                            AbstractC33208p0.b bVar10 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i3112, r16 == true ? 1 : 0), false, null, 6, null);
                            r25 = true;
                            TextResource textResourceM21267a10 = AbstractC8693b.m21267a();
                            Function1 function118 = function15;
                            TextResource.C8688b c8688b10 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i3112, r18 == true ? 1 : 0);
                            if ((i15 & 458752) != 131072) {
                                r25 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (r25 == true) {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function18 = function118;
                            AbstractC33199m0.m105214F(bVar10, textResourceM21267a10, null, c8688b10, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            r24 = true;
                            if (viewState instanceof AbstractC2924d.c) {
                                throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                            }
                            c28655q.m87150e0(-2082428241);
                            if ((i15 & 57344) == 16384) {
                                r10 = true;
                            } else {
                                r10 = false;
                            }
                            if (i28 == 4) {
                                r14 = true;
                            } else {
                                r14 = false;
                            }
                            ?? r118 = r10 | r14;
                            if ((i15 & 112) != 32) {
                                r24 = false;
                            }
                            r15 = (r118 == true ? 1 : 0) | r24;
                            objM87133R = c28655q.m87133R();
                            if (r15 == true) {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i3113 = i15 >> 3;
                            function16 = function8;
                            function5 = function13;
                            function17 = function14;
                            m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i3113 & 112) | (i3113 & 896) | (i3113 & 7168) | (i3113 & 57344), 0);
                            function18 = function15;
                            c28655q.m87173q(false);
                        }
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    }
                    function16 = function8;
                    function5 = function13;
                    function17 = function14;
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    String str13 = str2;
                    function9 = function8;
                    str3 = str13;
                    function10 = function6;
                    function11 = function7;
                }
                function12 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                }
            }
            i15 |= 3072;
            function6 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function7 = function3;
                    if (c28655q.m87157i(function7)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    r18 = 0;
                    r17 = 0;
                    r16 = 0;
                    if (i29 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C11473h(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function13 = (Function1) objM87133R6;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(22);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function14 = (Function1) objM87133R5;
                    } else {
                        function14 = function6;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function15 = (Function1) objM87133R4;
                    } else {
                        function15 = function7;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C11473h(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC2924d.b) {
                        c28655q.m87150e0(-2083246207);
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                        function18 = function15;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC2924d.a) {
                            c28655q.m87150e0(-2082858118);
                            int i3114 = 2;
                            AbstractC33208p0.b bVar11 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i3114, r16 == true ? 1 : 0), false, null, 6, null);
                            r25 = true;
                            TextResource textResourceM21267a11 = AbstractC8693b.m21267a();
                            Function1 function119 = function15;
                            TextResource.C8688b c8688b11 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i3114, r18 == true ? 1 : 0);
                            if ((i15 & 458752) != 131072) {
                                r25 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (r25 == true) {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function18 = function119;
                            AbstractC33199m0.m105214F(bVar11, textResourceM21267a11, null, c8688b11, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            r24 = true;
                            if (viewState instanceof AbstractC2924d.c) {
                                throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                            }
                            c28655q.m87150e0(-2082428241);
                            if ((i15 & 57344) == 16384) {
                                r10 = true;
                            } else {
                                r10 = false;
                            }
                            if (i28 == 4) {
                                r14 = true;
                            } else {
                                r14 = false;
                            }
                            ?? r119 = r10 | r14;
                            if ((i15 & 112) != 32) {
                                r24 = false;
                            }
                            r15 = (r119 == true ? 1 : 0) | r24;
                            objM87133R = c28655q.m87133R();
                            if (r15 == true) {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i3115 = i15 >> 3;
                            function16 = function8;
                            function5 = function13;
                            function17 = function14;
                            m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i3115 & 112) | (i3115 & 896) | (i3115 & 7168) | (i3115 & 57344), 0);
                            function18 = function15;
                            c28655q.m87173q(false);
                        }
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    }
                    function16 = function8;
                    function5 = function13;
                    function17 = function14;
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    String str14 = str2;
                    function9 = function8;
                    str3 = str14;
                    function10 = function6;
                    function11 = function7;
                }
                function12 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                }
            }
            i15 |= 24576;
            function7 = function3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function8)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                list = null;
                r18 = 0;
                r17 = 0;
                r16 = 0;
                if (i29 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C11473h(16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function13 = (Function1) objM87133R6;
                } else {
                    function13 = function5;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C11473h(22);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function14 = (Function1) objM87133R5;
                } else {
                    function14 = function6;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function15 = (Function1) objM87133R4;
                } else {
                    function15 = function7;
                }
                if (i26 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11473h(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                }
                i28 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                if (viewState instanceof AbstractC2924d.b) {
                    c28655q.m87150e0(-2083246207);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                    function18 = function15;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC2924d.a) {
                        c28655q.m87150e0(-2082858118);
                        int i3116 = 2;
                        AbstractC33208p0.b bVar12 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i3116, r16 == true ? 1 : 0), false, null, 6, null);
                        r25 = true;
                        TextResource textResourceM21267a12 = AbstractC8693b.m21267a();
                        Function1 function1110 = function15;
                        TextResource.C8688b c8688b12 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i3116, r18 == true ? 1 : 0);
                        if ((i15 & 458752) != 131072) {
                            r25 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (r25 == true) {
                            objM87133R2 = new C9813i(function8, 10);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C9813i(function8, 10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function18 = function1110;
                        AbstractC33199m0.m105214F(bVar12, textResourceM21267a12, null, c8688b12, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        r24 = true;
                        if (viewState instanceof AbstractC2924d.c) {
                            throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                        }
                        c28655q.m87150e0(-2082428241);
                        if ((i15 & 57344) == 16384) {
                            r10 = true;
                        } else {
                            r10 = false;
                        }
                        if (i28 == 4) {
                            r14 = true;
                        } else {
                            r14 = false;
                        }
                        ?? r1110 = r10 | r14;
                        if ((i15 & 112) != 32) {
                            r24 = false;
                        }
                        r15 = (r1110 == true ? 1 : 0) | r24;
                        objM87133R = c28655q.m87133R();
                        if (r15 == true) {
                            objM87133R = new a(function15, viewState, str2, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function15, viewState, str2, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        int i3117 = i15 >> 3;
                        function16 = function8;
                        function5 = function13;
                        function17 = function14;
                        m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i3117 & 112) | (i3117 & 896) | (i3117 & 7168) | (i3117 & 57344), 0);
                        function18 = function15;
                        c28655q.m87173q(false);
                    }
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                }
                function16 = function8;
                function5 = function13;
                function17 = function14;
                function11 = function18;
                str3 = str2;
                function10 = function17;
                function9 = function16;
            } else {
                c28655q.m87138X();
                String str15 = str2;
                function9 = function8;
                str3 = str15;
                function10 = function6;
                function11 = function7;
            }
            function12 = function5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
            }
        }
        i15 |= 384;
        function5 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function2;
                if (c28655q.m87157i(function6)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function7 = function3;
                    if (c28655q.m87157i(function7)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function8)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                if ((i15 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    r18 = 0;
                    r17 = 0;
                    r16 = 0;
                    if (i29 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C11473h(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function13 = (Function1) objM87133R6;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(22);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function14 = (Function1) objM87133R5;
                    } else {
                        function14 = function6;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function15 = (Function1) objM87133R4;
                    } else {
                        function15 = function7;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C11473h(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC2924d.b) {
                        c28655q.m87150e0(-2083246207);
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a13);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                        function18 = function15;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC2924d.a) {
                            c28655q.m87150e0(-2082858118);
                            int i3118 = 2;
                            AbstractC33208p0.b bVar13 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i3118, r16 == true ? 1 : 0), false, null, 6, null);
                            r25 = true;
                            TextResource textResourceM21267a13 = AbstractC8693b.m21267a();
                            Function1 function1111 = function15;
                            TextResource.C8688b c8688b13 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i3118, r18 == true ? 1 : 0);
                            if ((i15 & 458752) != 131072) {
                                r25 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (r25 == true) {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C9813i(function8, 10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function18 = function1111;
                            AbstractC33199m0.m105214F(bVar13, textResourceM21267a13, null, c8688b13, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            r24 = true;
                            if (viewState instanceof AbstractC2924d.c) {
                                throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                            }
                            c28655q.m87150e0(-2082428241);
                            if ((i15 & 57344) == 16384) {
                                r10 = true;
                            } else {
                                r10 = false;
                            }
                            if (i28 == 4) {
                                r14 = true;
                            } else {
                                r14 = false;
                            }
                            ?? r1111 = r10 | r14;
                            if ((i15 & 112) != 32) {
                                r24 = false;
                            }
                            r15 = (r1111 == true ? 1 : 0) | r24;
                            objM87133R = c28655q.m87133R();
                            if (r15 == true) {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function15, viewState, str2, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i3119 = i15 >> 3;
                            function16 = function8;
                            function5 = function13;
                            function17 = function14;
                            m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i3119 & 112) | (i3119 & 896) | (i3119 & 7168) | (i3119 & 57344), 0);
                            function18 = function15;
                            c28655q.m87173q(false);
                        }
                        function11 = function18;
                        str3 = str2;
                        function10 = function17;
                        function9 = function16;
                    }
                    function16 = function8;
                    function5 = function13;
                    function17 = function14;
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    String str16 = str2;
                    function9 = function8;
                    str3 = str16;
                    function10 = function6;
                    function11 = function7;
                }
                function12 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
                }
            }
            i15 |= 24576;
            function7 = function3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function8)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                list = null;
                r18 = 0;
                r17 = 0;
                r16 = 0;
                if (i29 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C11473h(16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function13 = (Function1) objM87133R6;
                } else {
                    function13 = function5;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C11473h(22);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function14 = (Function1) objM87133R5;
                } else {
                    function14 = function6;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function15 = (Function1) objM87133R4;
                } else {
                    function15 = function7;
                }
                if (i26 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11473h(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                }
                i28 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                if (viewState instanceof AbstractC2924d.b) {
                    c28655q.m87150e0(-2083246207);
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                    function18 = function15;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC2924d.a) {
                        c28655q.m87150e0(-2082858118);
                        int i31110 = 2;
                        AbstractC33208p0.b bVar14 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i31110, r16 == true ? 1 : 0), false, null, 6, null);
                        r25 = true;
                        TextResource textResourceM21267a14 = AbstractC8693b.m21267a();
                        Function1 function1112 = function15;
                        TextResource.C8688b c8688b14 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i31110, r18 == true ? 1 : 0);
                        if ((i15 & 458752) != 131072) {
                            r25 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (r25 == true) {
                            objM87133R2 = new C9813i(function8, 10);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C9813i(function8, 10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function18 = function1112;
                        AbstractC33199m0.m105214F(bVar14, textResourceM21267a14, null, c8688b14, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        r24 = true;
                        if (viewState instanceof AbstractC2924d.c) {
                            throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                        }
                        c28655q.m87150e0(-2082428241);
                        if ((i15 & 57344) == 16384) {
                            r10 = true;
                        } else {
                            r10 = false;
                        }
                        if (i28 == 4) {
                            r14 = true;
                        } else {
                            r14 = false;
                        }
                        ?? r1112 = r10 | r14;
                        if ((i15 & 112) != 32) {
                            r24 = false;
                        }
                        r15 = (r1112 == true ? 1 : 0) | r24;
                        objM87133R = c28655q.m87133R();
                        if (r15 == true) {
                            objM87133R = new a(function15, viewState, str2, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function15, viewState, str2, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        int i31111 = i15 >> 3;
                        function16 = function8;
                        function5 = function13;
                        function17 = function14;
                        m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i31111 & 112) | (i31111 & 896) | (i31111 & 7168) | (i31111 & 57344), 0);
                        function18 = function15;
                        c28655q.m87173q(false);
                    }
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                }
                function16 = function8;
                function5 = function13;
                function17 = function14;
                function11 = function18;
                str3 = str2;
                function10 = function17;
                function9 = function16;
            } else {
                c28655q.m87138X();
                String str17 = str2;
                function9 = function8;
                str3 = str17;
                function10 = function6;
                function11 = function7;
            }
            function12 = function5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
            }
        }
        i15 |= 3072;
        function6 = function2;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                function7 = function3;
                if (c28655q.m87157i(function7)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function8)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            if ((i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                list = null;
                r18 = 0;
                r17 = 0;
                r16 = 0;
                if (i29 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C11473h(16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function13 = (Function1) objM87133R6;
                } else {
                    function13 = function5;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C11473h(22);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function14 = (Function1) objM87133R5;
                } else {
                    function14 = function6;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function15 = (Function1) objM87133R4;
                } else {
                    function15 = function7;
                }
                if (i26 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11473h(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                }
                i28 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
                if (viewState instanceof AbstractC2924d.b) {
                    c28655q.m87150e0(-2083246207);
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                    function18 = function15;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC2924d.a) {
                        c28655q.m87150e0(-2082858118);
                        int i31112 = 2;
                        AbstractC33208p0.b bVar15 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i31112, r16 == true ? 1 : 0), false, null, 6, null);
                        r25 = true;
                        TextResource textResourceM21267a15 = AbstractC8693b.m21267a();
                        Function1 function1113 = function15;
                        TextResource.C8688b c8688b15 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i31112, r18 == true ? 1 : 0);
                        if ((i15 & 458752) != 131072) {
                            r25 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (r25 == true) {
                            objM87133R2 = new C9813i(function8, 10);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C9813i(function8, 10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function18 = function1113;
                        AbstractC33199m0.m105214F(bVar15, textResourceM21267a15, null, c8688b15, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        r24 = true;
                        if (viewState instanceof AbstractC2924d.c) {
                            throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                        }
                        c28655q.m87150e0(-2082428241);
                        if ((i15 & 57344) == 16384) {
                            r10 = true;
                        } else {
                            r10 = false;
                        }
                        if (i28 == 4) {
                            r14 = true;
                        } else {
                            r14 = false;
                        }
                        ?? r1113 = r10 | r14;
                        if ((i15 & 112) != 32) {
                            r24 = false;
                        }
                        r15 = (r1113 == true ? 1 : 0) | r24;
                        objM87133R = c28655q.m87133R();
                        if (r15 == true) {
                            objM87133R = new a(function15, viewState, str2, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function15, viewState, str2, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        int i31113 = i15 >> 3;
                        function16 = function8;
                        function5 = function13;
                        function17 = function14;
                        m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i31113 & 112) | (i31113 & 896) | (i31113 & 7168) | (i31113 & 57344), 0);
                        function18 = function15;
                        c28655q.m87173q(false);
                    }
                    function11 = function18;
                    str3 = str2;
                    function10 = function17;
                    function9 = function16;
                }
                function16 = function8;
                function5 = function13;
                function17 = function14;
                function11 = function18;
                str3 = str2;
                function10 = function17;
                function9 = function16;
            } else {
                c28655q.m87138X();
                String str18 = str2;
                function9 = function8;
                str3 = str18;
                function10 = function6;
                function11 = function7;
            }
            function12 = function5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
            }
        }
        i15 |= 24576;
        function7 = function3;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function8 = function4;
        } else {
            function8 = function4;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function8)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
        }
        if ((i15 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            list = null;
            r18 = 0;
            r17 = 0;
            r16 = 0;
            if (i29 != 0) {
                str2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C11473h(16);
                    c28655q.m87172p0(objM87133R6);
                }
                function13 = (Function1) objM87133R6;
            } else {
                function13 = function5;
            }
            if (i18 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C11473h(22);
                    c28655q.m87172p0(objM87133R5);
                }
                function14 = (Function1) objM87133R5;
            } else {
                function14 = function6;
            }
            if (i24 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C11473h(23);
                    c28655q.m87172p0(objM87133R4);
                }
                function15 = (Function1) objM87133R4;
            } else {
                function15 = function7;
            }
            if (i26 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C11473h(24);
                    c28655q.m87172p0(objM87133R3);
                }
                function8 = (Function1) objM87133R3;
            }
            i28 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_biomarkers_details", c28655q, i28 | 48);
            if (viewState instanceof AbstractC2924d.b) {
                c28655q.m87150e0(-2083246207);
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                function18 = function15;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                if (viewState instanceof AbstractC2924d.a) {
                    c28655q.m87150e0(-2082858118);
                    int i31114 = 2;
                    AbstractC33208p0.b bVar16 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i31114, r16 == true ? 1 : 0), false, null, 6, null);
                    r25 = true;
                    TextResource textResourceM21267a16 = AbstractC8693b.m21267a();
                    Function1 function1114 = function15;
                    TextResource.C8688b c8688b16 = new TextResource.C8688b(AbstractC35283c.f150167E, r17 == true ? 1 : 0, i31114, r18 == true ? 1 : 0);
                    if ((i15 & 458752) != 131072) {
                        r25 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (r25 == true) {
                        objM87133R2 = new C9813i(function8, 10);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C9813i(function8, 10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function18 = function1114;
                    AbstractC33199m0.m105214F(bVar16, textResourceM21267a16, null, c8688b16, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    r24 = true;
                    if (viewState instanceof AbstractC2924d.c) {
                        throw AbstractC11895b.m32003v(-482844623, c28655q, false);
                    }
                    c28655q.m87150e0(-2082428241);
                    if ((i15 & 57344) == 16384) {
                        r10 = true;
                    } else {
                        r10 = false;
                    }
                    if (i28 == 4) {
                        r14 = true;
                    } else {
                        r14 = false;
                    }
                    ?? r1114 = r10 | r14;
                    if ((i15 & 112) != 32) {
                        r24 = false;
                    }
                    r15 = (r1114 == true ? 1 : 0) | r24;
                    objM87133R = c28655q.m87133R();
                    if (r15 == true) {
                        objM87133R = new a(function15, viewState, str2, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(function15, viewState, str2, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                    int i31115 = i15 >> 3;
                    function16 = function8;
                    function5 = function13;
                    function17 = function14;
                    m31911v((AbstractC2924d.c) viewState, function5, function17, function15, function16, c28655q, i28 | (i31115 & 112) | (i31115 & 896) | (i31115 & 7168) | (i31115 & 57344), 0);
                    function18 = function15;
                    c28655q.m87173q(false);
                }
                function11 = function18;
                str3 = str2;
                function10 = function17;
                function9 = function16;
            }
            function16 = function8;
            function5 = function13;
            function17 = function14;
            function11 = function18;
            str3 = str2;
            function10 = function17;
            function9 = function16;
        } else {
            c28655q.m87138X();
            String str19 = str2;
            function9 = function8;
            str3 = str19;
            function10 = function6;
            function11 = function7;
        }
        function12 = function5;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) str3, function12, function10, function11, (InterfaceC23459e) function9, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m31881P(AbstractC2922b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m31882Q(Action it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m31883R(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m31884S(AbstractC0706a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m31885T(Function1 function1) {
        function1.invoke(AbstractC0706a.b.f2682a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m31886U(AbstractC2924d abstractC2924d, String str, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i13, int i14, Composer composer, int i15) {
        m31880O(abstractC2924d, str, function1, function2, function3, function4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V */
    public static final void m31887V(InterfaceC22381a event, Function1 onAction, Function1 onNavigationEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onAction, "onAction");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        InterfaceC22381a.x xVar = event instanceof InterfaceC22381a.x ? (InterfaceC22381a.x) event : null;
        if (xVar != null) {
            Object objM64346d = xVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            if (objM64346d instanceof C9598e) {
                onNavigationEvent.invoke(new AbstractC0706a.c((C9598e) objM64346d));
            } else if (objM64346d instanceof Action) {
                onAction.invoke(objM64346d);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public static final void m31888W(String biomarkerId, Function1 onViewEvent, Function1 onAction, Function1 onNavigationEvent, Object event, Function1 onAnalyticsEvent, Function1 onShowDialog) {
        C22383c.b bVarM74805c;
        AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAction, "onAction");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onShowDialog, "onShowDialog");
        if (event instanceof AnyModal) {
            Modal modal = ((AnyModal) event).getModal();
            DialogModel dialogModel = modal instanceof DialogModel ? (DialogModel) modal : null;
            if (dialogModel == null || (bVarM74805c = AbstractC25450e.m74805c(dialogModel)) == null) {
                return;
            }
            onShowDialog.invoke(bVarM74805c);
            return;
        }
        if (event instanceof C9598e) {
            C9598e c9598e = (C9598e) event;
            if (c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9440w0) {
                onAnalyticsEvent.invoke(InterfaceC22381a.l.f87422a);
            }
            onNavigationEvent.invoke(new AbstractC0706a.c(c9598e));
            return;
        }
        if (event instanceof AbstractC22122e) {
            m31889X((AbstractC22122e) event, onNavigationEvent, onAction);
            return;
        }
        if (event instanceof ArticleTileModelEvent.Url) {
            onNavigationEvent.invoke(new AbstractC0706a.a((ArticleTileModelEvent.Url) event));
            return;
        }
        if (event instanceof AbstractC21243b.b) {
            onNavigationEvent.invoke(new AbstractC0706a.c(((AbstractC21243b.b) event).getDestination()));
            return;
        }
        if (event instanceof C32048d) {
            C32048d c32048d = (C32048d) event;
            C9598e c9598eM99591c = c32048d.getDestination();
            if (c9598eM99591c != null) {
                onNavigationEvent.invoke(new AbstractC0706a.c(c9598eM99591c));
                return;
            } else {
                onNavigationEvent.invoke(new AbstractC0706a.d(AbstractC8693b.m21268b(c32048d.getVow())));
                return;
            }
        }
        if (event instanceof C27256h) {
            onNavigationEvent.invoke(new AbstractC0706a.c(((C27256h) event).getDestination()));
            return;
        }
        if (event instanceof AbstractC29791a.b) {
            AbstractC29791a.b bVar = (AbstractC29791a.b) event;
            if (bVar.getIsExpanded()) {
                onAnalyticsEvent.invoke(new InterfaceC22381a.e0(bVar.getIndex()));
                return;
            }
            return;
        }
        if (event instanceof AbstractC23962r) {
            AbstractC23962r abstractC23962r = (AbstractC23962r) event;
            if (abstractC23962r instanceof AbstractC23962r.a) {
                onViewEvent.invoke(new AbstractC2922b.b(biomarkerId, ((AbstractC23962r.a) event).getDateToken()));
                return;
            }
            if (abstractC23962r instanceof AbstractC23962r.d) {
                onAnalyticsEvent.invoke(new InterfaceC22381a.a1(biomarkerId));
                return;
            } else {
                if (abstractC23962r instanceof AbstractC23962r.c) {
                    return;
                }
                if (!(abstractC23962r instanceof AbstractC23962r.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                m31888W(biomarkerId, onViewEvent, onAction, onNavigationEvent, ((AbstractC23962r.b) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), onAnalyticsEvent, onShowDialog);
                return;
            }
        }
        if (event instanceof AbstractC23959q0.b) {
            onAnalyticsEvent.invoke(new InterfaceC22381a.v(biomarkerId));
            return;
        }
        if (event instanceof AbstractC23959q0.a) {
            onAnalyticsEvent.invoke(InterfaceC22381a.u.f87448a);
            onNavigationEvent.invoke(new AbstractC0706a.c(((AbstractC23959q0.a) event).getNavigationAction()));
        } else if (event instanceof C13869j) {
            onViewEvent.invoke(new AbstractC2922b.a(((C13869j) event).getCardId()));
        } else if (event instanceof Action) {
            onAction.invoke(event);
        }
    }

    /* JADX INFO: renamed from: X */
    public static final void m31889X(AbstractC22122e event, Function1 onNavigationEvent, Function1 onAction) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAction, "onAction");
        if (event instanceof AbstractC22122e.a) {
            onAction.invoke(((AbstractC22122e.a) event).getAction());
        } else {
            if (!(event instanceof AbstractC22122e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            onNavigationEvent.invoke(new AbstractC0706a.c(((AbstractC22122e.b) event).getDestination()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x014c  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:112:0x01db  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:120:0x0203  */
    /* JADX WARN: Code duplicated, block: B:121:0x0210  */
    /* JADX WARN: Code duplicated, block: B:124:0x0220  */
    /* JADX WARN: Code duplicated, block: B:125:0x0222  */
    /* JADX WARN: Code duplicated, block: B:128:0x0229  */
    /* JADX WARN: Code duplicated, block: B:131:0x0241  */
    /* JADX WARN: Code duplicated, block: B:132:0x0243  */
    /* JADX WARN: Code duplicated, block: B:135:0x024a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0287  */
    /* JADX WARN: Code duplicated, block: B:139:0x028b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0298  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:156:0x0345  */
    /* JADX WARN: Code duplicated, block: B:159:0x038a  */
    /* JADX WARN: Code duplicated, block: B:160:0x038e  */
    /* JADX WARN: Code duplicated, block: B:163:0x039b  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:174:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:176:0x0405  */
    /* JADX WARN: Code duplicated, block: B:180:0x0421  */
    /* JADX WARN: Code duplicated, block: B:182:0x0434  */
    /* JADX WARN: Code duplicated, block: B:183:0x0436  */
    /* JADX WARN: Code duplicated, block: B:186:0x043e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0440  */
    /* JADX WARN: Code duplicated, block: B:190:0x0448  */
    /* JADX WARN: Code duplicated, block: B:191:0x044a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0454  */
    /* JADX WARN: Code duplicated, block: B:195:0x0456  */
    /* JADX WARN: Code duplicated, block: B:198:0x045e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0462  */
    /* JADX WARN: Code duplicated, block: B:201:0x0465  */
    /* JADX WARN: Code duplicated, block: B:202:0x047b A[PHI: r24
      0x047b: PHI (r24v4 java.lang.Object) = (r24v2 java.lang.Object), (r24v7 java.lang.Object) binds: [B:197:0x045c, B:200:0x0462] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:205:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:208:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:93:0x0131  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static final void m31911v(AbstractC2924d.c viewState, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Composer composer, int i13, int i14) {
        Function1 function5;
        int i15;
        Function1 function6;
        int i16;
        int i17;
        Function1 function7;
        int i18;
        int i19;
        int i24;
        boolean z4;
        Function1 function8;
        Function1 function9;
        Function1 function10;
        Function1 function11;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        Object objM87133R;
        Object obj2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        Object obj3;
        int i25;
        boolean z13;
        int i26;
        boolean z14;
        boolean z15;
        Object obj4;
        Function1 function16;
        InterfaceC28601c1 interfaceC28601c2;
        int i27;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        Function1 function17;
        boolean z16;
        Object objM87133R3;
        Object obj5;
        boolean z17;
        Object objM87133R4;
        Object obj6;
        boolean z18;
        Object objM87133R5;
        Object obj7;
        int i28;
        int iHashCode2;
        boolean z19;
        Object obj8;
        int i29;
        Object obj9;
        Function1 function18;
        C28655q c28655q2;
        int iHashCode3;
        int i34;
        int iHashCode4;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        Object objM87133R6;
        Object c1008b;
        InterfaceC28601c1 interfaceC28601c3;
        Function1 function19;
        Function1 function20;
        Function1 function21;
        int i45;
        Object obj10;
        Object objM87133R7;
        Object obj11;
        Object objM87133R8;
        Object obj12;
        Object objM87133R9;
        Object obj13;
        Object objM87133R10;
        Object obj14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1367769859);
        int i46 = (i13 & 6) == 0 ? (c28655q3.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i47 = i14 & 2;
        if (i47 == 0) {
            if ((i13 & 48) == 0) {
                function5 = function1;
                i46 |= c28655q3.m87157i(function5) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function6 = function2;
                    if (c28655q3.m87157i(function6)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i46 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        function7 = function3;
                        if (c28655q3.m87157i(function7)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i46 |= i18;
                    }
                    i19 = i14 & 16;
                    if (i19 != 0) {
                        if ((i13 & 24576) == 0) {
                            if (c28655q3.m87157i(function4)) {
                                i24 = 16384;
                            } else {
                                i24 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i46 |= i24;
                        }
                        if ((i46 & 9363) != 9362) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q3.m87135U(i46 & 1, z4)) {
                            obj = C28635l.f115821a;
                            if (i47 != 0) {
                                objM87133R10 = c28655q3.m87133R();
                                if (objM87133R10 == obj) {
                                    obj14 = objM87133R10;
                                    Object c11473h = new C11473h(25);
                                    c28655q3.m87172p0(c11473h);
                                    obj14 = c11473h;
                                }
                                obj14 = objM87133R10;
                                function12 = (Function1) obj14;
                            } else {
                                function12 = function5;
                            }
                            if (i15 != 0) {
                                objM87133R9 = c28655q3.m87133R();
                                if (objM87133R9 == obj) {
                                    obj13 = objM87133R9;
                                    Object c11473h2 = new C11473h(26);
                                    c28655q3.m87172p0(c11473h2);
                                    obj13 = c11473h2;
                                }
                                obj13 = objM87133R9;
                                function13 = (Function1) obj13;
                            } else {
                                function13 = function6;
                            }
                            if (i17 != 0) {
                                objM87133R8 = c28655q3.m87133R();
                                if (objM87133R8 == obj) {
                                    obj12 = objM87133R8;
                                    Object c11473h3 = new C11473h(17);
                                    c28655q3.m87172p0(c11473h3);
                                    obj12 = c11473h3;
                                }
                                obj12 = objM87133R8;
                                function14 = (Function1) obj12;
                            } else {
                                function14 = function7;
                            }
                            if (i19 != 0) {
                                objM87133R7 = c28655q3.m87133R();
                                if (objM87133R7 == obj) {
                                    obj11 = objM87133R7;
                                    Object c11473h4 = new C11473h(18);
                                    c28655q3.m87172p0(c11473h4);
                                    obj11 = c11473h4;
                                }
                                obj11 = objM87133R7;
                                function15 = (Function1) obj11;
                            } else {
                                function15 = function4;
                            }
                            objM87133R = c28655q3.m87133R();
                            obj2 = objM87133R;
                            if (objM87133R == obj) {
                                Object objM87272z = AbstractC28683x.m87272z(null);
                                c28655q3.m87172p0(objM87272z);
                                obj2 = objM87272z;
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) obj2;
                            C22383c.b bVarM31867B = m31867B(interfaceC28601c1);
                            objM87133R2 = c28655q3.m87133R();
                            obj3 = objM87133R2;
                            if (objM87133R2 == obj) {
                                Object c2192m = new C2192m(22, interfaceC28601c1);
                                c28655q3.m87172p0(c2192m);
                                obj3 = c2192m;
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj3;
                            i25 = i46 & 896;
                            if (i25 == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i26 = i46 & 57344;
                            if (i26 == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z13 | z14;
                            Object objM87133R11 = c28655q3.m87133R();
                            obj4 = objM87133R11;
                            if (z15 || objM87133R11 == obj) {
                                Object c2777c = new C2777c(function13, 3, function15);
                                c28655q3.m87172p0(c2777c);
                                obj4 = c2777c;
                            }
                            int i48 = TextResource.$stable;
                            int i49 = C27256h.f109055z;
                            AbstractC22431f.m64651Z(bVarM31867B, interfaceC4339a2, (Function1) obj4, c28655q3, i48 | i49 | i49 | 48);
                            C2314t c2314t = C2314t.f9131w;
                            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                            C13404j c13404jM8528f = viewState.getScreenContextMetadata();
                            int i54 = C13404j.f46947x << 3;
                            function16 = function14;
                            interfaceC28601c2 = interfaceC28601c1;
                            i27 = i25;
                            Modifier modifierM34129b = AbstractC12250f.m34129b(modifierM44028b0, c13404jM8528f, false, c28655q3, i54, 2);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM34129b);
                            InterfaceC0221l.f734a.getClass();
                            interfaceC4339a = C0217k.f724b;
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a);
                            } else {
                                c28655q3.m87178s0();
                            }
                            C0209i c0209i2 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d);
                            C0209i c0209i3 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q3.f115903S) {
                                function17 = function13;
                            } else {
                                function17 = function13;
                                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i4 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                                Modifier modifierM3411h = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t));
                                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R3 = c28655q3.m87133R();
                                if (objM87133R3 == obj) {
                                    Object c11473h5 = new C11473h(19);
                                    c28655q3.m87172p0(c11473h5);
                                    obj5 = c11473h5;
                                } else {
                                    obj5 = objM87133R3;
                                }
                                Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3411h, z16, (Function1) obj5);
                                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R4 = c28655q3.m87133R();
                                obj6 = objM87133R4;
                                if (objM87133R4 == obj) {
                                    Object c11473h6 = new C11473h(20);
                                    c28655q3.m87172p0(c11473h6);
                                    obj6 = c11473h6;
                                }
                                Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM44099b, z17, (Function1) obj6);
                                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objM87133R5 = c28655q3.m87133R();
                                obj7 = objM87133R5;
                                if (objM87133R5 == obj) {
                                    Object c11473h7 = new C11473h(21);
                                    c28655q3.m87172p0(c11473h7);
                                    obj7 = c11473h7;
                                }
                                AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b2, z18, (Function1) obj7), c28655q3, 0);
                                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
                                C22957g c22957g = AbstractC22977m.f90652c;
                                C2305k c2305k = C2299e.f9110M;
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                                i28 = i46;
                                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM66724m);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(interfaceC4339a);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
                                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                                AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                                if (i26 == 16384) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                Object objM87133R12 = c28655q3.m87133R();
                                obj8 = objM87133R12;
                                if (z19 || objM87133R12 == obj) {
                                    Object c9813i = new C9813i(function15, 9);
                                    c28655q3.m87172p0(c9813i);
                                    obj8 = c9813i;
                                }
                                i29 = i26;
                                obj9 = obj;
                                function18 = function15;
                                AbstractC6719b.m20143d(modifierM3409f, aVar, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                Modifier modifierM34108a = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i54, 6);
                                c28655q2 = c28655q3;
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM34108a);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(interfaceC4339a);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                                float f13 = 8;
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f13, c2314t));
                                i34 = 0;
                                m31877L(viewState.getHeader(), c28655q2, 0);
                                C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, 4, c2305k, c28655q2, 6);
                                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(interfaceC4339a);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM73381n);
                                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                                c28655q2.m87150e0(565095534);
                                for (InterfaceC25312u interfaceC25312u : viewState.m8529g()) {
                                    boolean zM87157i = c28655q2.m87157i(viewState);
                                    if ((i28 & 112) == 32) {
                                        i35 = 1;
                                    } else {
                                        i35 = i34;
                                    }
                                    int i55 = (zM87157i ? 1 : 0) | i35;
                                    i36 = i27;
                                    if (i36 == 256) {
                                        i37 = 1;
                                    } else {
                                        i37 = i34;
                                    }
                                    int i56 = i55 | i37;
                                    i29 = i29;
                                    if (i29 == 16384) {
                                        i38 = 1;
                                    } else {
                                        i38 = i34;
                                    }
                                    int i57 = i56 | i38;
                                    i28 = i28;
                                    if ((i28 & 7168) == 2048) {
                                        i39 = 1;
                                    } else {
                                        i39 = 0;
                                    }
                                    i44 = i57 | i39;
                                    objM87133R6 = c28655q2.m87133R();
                                    if (i44 != 0) {
                                        interfaceC28601c3 = interfaceC28601c2;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                        c28655q2.m87172p0(c1008b);
                                    } else {
                                        obj10 = obj9;
                                        if (objM87133R6 == obj10) {
                                            obj9 = obj10;
                                            interfaceC28601c3 = interfaceC28601c2;
                                            function19 = function12;
                                            function20 = function18;
                                            function21 = function17;
                                            i45 = 0;
                                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                            c28655q2.m87172p0(c1008b);
                                        } else {
                                            obj9 = obj10;
                                            c1008b = objM87133R6;
                                            function19 = function12;
                                            function20 = function18;
                                            function21 = function17;
                                            i45 = 0;
                                            interfaceC28601c3 = interfaceC28601c2;
                                        }
                                    }
                                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                                    function12 = function19;
                                    function17 = function21;
                                    function18 = function20;
                                    interfaceC28601c2 = interfaceC28601c3;
                                    i27 = i36;
                                    i34 = i45;
                                }
                                function9 = function12;
                                function10 = function17;
                                c28655q2.m87173q(i34);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7));
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(true);
                                function8 = function18;
                                function11 = function16;
                                c28655q = c28655q2;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
                            Modifier modifierM3411h2 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t));
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == obj) {
                                Object c11473h8 = new C11473h(19);
                                c28655q3.m87172p0(c11473h8);
                                obj5 = c11473h8;
                            } else {
                                obj5 = objM87133R3;
                            }
                            Modifier modifierM44099b3 = AbstractC15676d.m44099b(modifierM3411h2, z16, (Function1) obj5);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            obj6 = objM87133R4;
                            if (objM87133R4 == obj) {
                                Object c11473h9 = new C11473h(20);
                                c28655q3.m87172p0(c11473h9);
                                obj6 = c11473h9;
                            }
                            Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM44099b3, z17, (Function1) obj6);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R5 = c28655q3.m87133R();
                            obj7 = objM87133R5;
                            if (objM87133R5 == obj) {
                                Object c11473h10 = new C11473h(21);
                                c28655q3.m87172p0(c11473h10);
                                obj7 = c11473h10;
                            }
                            AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b4, z18, (Function1) obj7), c28655q3, 0);
                            Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
                            C22957g c22957g2 = AbstractC22977m.f90652c;
                            C2305k c2305k2 = C2299e.f9110M;
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                            i28 = i46;
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM66724m2);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m5);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N5);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                            AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if (i26 == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            Object objM87133R13 = c28655q3.m87133R();
                            obj8 = objM87133R13;
                            if (z19) {
                                Object c9813i2 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i2);
                                obj8 = c9813i2;
                            } else {
                                Object c9813i3 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i3);
                                obj8 = c9813i3;
                            }
                            i29 = i26;
                            obj9 = obj;
                            function18 = function15;
                            AbstractC6719b.m20143d(modifierM3409f2, aVar2, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM34108a2 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i54, 6);
                            c28655q2 = c28655q3;
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM34108a2);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a4);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m6);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N6);
                            float f14 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f14, c2314t));
                            i34 = 0;
                            m31877L(viewState.getHeader(), c28655q2, 0);
                            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(f14, 4, c2305k2, c28655q2, 6);
                            iHashCode4 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, c2314t);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM73381n2);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m7);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N7);
                            c28655q2.m87150e0(565095534);
                            while (r10.hasNext()) {
                                boolean zM87157i2 = c28655q2.m87157i(viewState);
                                if ((i28 & 112) == 32) {
                                    i35 = 1;
                                } else {
                                    i35 = i34;
                                }
                                int i58 = (zM87157i2 ? 1 : 0) | i35;
                                i36 = i27;
                                if (i36 == 256) {
                                    i37 = 1;
                                } else {
                                    i37 = i34;
                                }
                                int i59 = i58 | i37;
                                i29 = i29;
                                if (i29 == 16384) {
                                    i38 = 1;
                                } else {
                                    i38 = i34;
                                }
                                int i510 = i59 | i38;
                                i28 = i28;
                                if ((i28 & 7168) == 2048) {
                                    i39 = 1;
                                } else {
                                    i39 = 0;
                                }
                                i44 = i510 | i39;
                                objM87133R6 = c28655q2.m87133R();
                                if (i44 != 0) {
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj10 = obj9;
                                    if (objM87133R6 == obj10) {
                                        obj9 = obj10;
                                        interfaceC28601c3 = interfaceC28601c2;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                        c28655q2.m87172p0(c1008b);
                                    } else {
                                        obj9 = obj10;
                                        c1008b = objM87133R6;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        interfaceC28601c3 = interfaceC28601c2;
                                    }
                                }
                                AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                                function12 = function19;
                                function17 = function21;
                                function18 = function20;
                                interfaceC28601c2 = interfaceC28601c3;
                                i27 = i36;
                                i34 = i45;
                            }
                            function9 = function12;
                            function10 = function17;
                            c28655q2.m87173q(i34);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f14, 7));
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            function8 = function18;
                            function11 = function16;
                            c28655q = c28655q2;
                        } else {
                            c28655q3.m87138X();
                            function8 = function4;
                            function9 = function5;
                            function10 = function6;
                            function11 = function7;
                            c28655q = c28655q3;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                        }
                    }
                    i46 |= 24576;
                    if ((i46 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i46 & 1, z4)) {
                        obj = C28635l.f115821a;
                        if (i47 != 0) {
                            objM87133R10 = c28655q3.m87133R();
                            if (objM87133R10 == obj) {
                                obj14 = objM87133R10;
                                Object c11473h11 = new C11473h(25);
                                c28655q3.m87172p0(c11473h11);
                                obj14 = c11473h11;
                            }
                            obj14 = objM87133R10;
                            function12 = (Function1) obj14;
                        } else {
                            function12 = function5;
                        }
                        if (i15 != 0) {
                            objM87133R9 = c28655q3.m87133R();
                            if (objM87133R9 == obj) {
                                obj13 = objM87133R9;
                                Object c11473h12 = new C11473h(26);
                                c28655q3.m87172p0(c11473h12);
                                obj13 = c11473h12;
                            }
                            obj13 = objM87133R9;
                            function13 = (Function1) obj13;
                        } else {
                            function13 = function6;
                        }
                        if (i17 != 0) {
                            objM87133R8 = c28655q3.m87133R();
                            if (objM87133R8 == obj) {
                                obj12 = objM87133R8;
                                Object c11473h13 = new C11473h(17);
                                c28655q3.m87172p0(c11473h13);
                                obj12 = c11473h13;
                            }
                            obj12 = objM87133R8;
                            function14 = (Function1) obj12;
                        } else {
                            function14 = function7;
                        }
                        if (i19 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == obj) {
                                obj11 = objM87133R7;
                                Object c11473h14 = new C11473h(18);
                                c28655q3.m87172p0(c11473h14);
                                obj11 = c11473h14;
                            }
                            obj11 = objM87133R7;
                            function15 = (Function1) obj11;
                        } else {
                            function15 = function4;
                        }
                        objM87133R = c28655q3.m87133R();
                        obj2 = objM87133R;
                        if (objM87133R == obj) {
                            Object objM87272z2 = AbstractC28683x.m87272z(null);
                            c28655q3.m87172p0(objM87272z2);
                            obj2 = objM87272z2;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) obj2;
                        C22383c.b bVarM31867B2 = m31867B(interfaceC28601c1);
                        objM87133R2 = c28655q3.m87133R();
                        obj3 = objM87133R2;
                        if (objM87133R2 == obj) {
                            Object c2192m2 = new C2192m(22, interfaceC28601c1);
                            c28655q3.m87172p0(c2192m2);
                            obj3 = c2192m2;
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) obj3;
                        i25 = i46 & 896;
                        if (i25 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i26 = i46 & 57344;
                        if (i26 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        Object objM87133R14 = c28655q3.m87133R();
                        obj4 = objM87133R14;
                        if (z15) {
                            Object c2777c2 = new C2777c(function13, 3, function15);
                            c28655q3.m87172p0(c2777c2);
                            obj4 = c2777c2;
                        } else {
                            Object c2777c3 = new C2777c(function13, 3, function15);
                            c28655q3.m87172p0(c2777c3);
                            obj4 = c2777c3;
                        }
                        int i410 = TextResource.$stable;
                        int i411 = C27256h.f109055z;
                        AbstractC22431f.m64651Z(bVarM31867B2, interfaceC4339a3, (Function1) obj4, c28655q3, i410 | i411 | i411 | 48);
                        C2314t c2314t2 = C2314t.f9131w;
                        Modifier modifierM44028b1 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2));
                        C13404j c13404jM8528f2 = viewState.getScreenContextMetadata();
                        int i511 = C13404j.f46947x << 3;
                        function16 = function14;
                        interfaceC28601c2 = interfaceC28601c1;
                        i27 = i25;
                        Modifier modifierM34129b2 = AbstractC12250f.m34129b(modifierM44028b1, c13404jM8528f2, false, c28655q3, i511, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM34129b2);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i6 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC39127r0M66763d2);
                        C0209i c0209i7 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m8);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            function17 = function13;
                            if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i8 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N8);
                            Modifier modifierM3411h3 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t2));
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == obj) {
                                Object c11473h15 = new C11473h(19);
                                c28655q3.m87172p0(c11473h15);
                                obj5 = c11473h15;
                            } else {
                                obj5 = objM87133R3;
                            }
                            Modifier modifierM44099b5 = AbstractC15676d.m44099b(modifierM3411h3, z16, (Function1) obj5);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            obj6 = objM87133R4;
                            if (objM87133R4 == obj) {
                                Object c11473h16 = new C11473h(20);
                                c28655q3.m87172p0(c11473h16);
                                obj6 = c11473h16;
                            }
                            Modifier modifierM44099b6 = AbstractC15676d.m44099b(modifierM44099b5, z17, (Function1) obj6);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R5 = c28655q3.m87133R();
                            obj7 = objM87133R5;
                            if (objM87133R5 == obj) {
                                Object c11473h17 = new C11473h(21);
                                c28655q3.m87172p0(c11473h17);
                                obj7 = c11473h17;
                            }
                            AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b6, z18, (Function1) obj7), c28655q3, 0);
                            Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t2));
                            C22957g c22957g3 = AbstractC22977m.f90652c;
                            C2305k c2305k3 = C2299e.f9110M;
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                            i28 = i46;
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM66724m3);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i6, c23010xM66775a5);
                            AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m9);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N9);
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                            AbstractC6721d.a aVar3 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if (i26 == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            Object objM87133R15 = c28655q3.m87133R();
                            obj8 = objM87133R15;
                            if (z19) {
                                Object c9813i4 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i4);
                                obj8 = c9813i4;
                            } else {
                                Object c9813i5 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i5);
                                obj8 = c9813i5;
                            }
                            i29 = i26;
                            obj9 = obj;
                            function18 = function15;
                            AbstractC6719b.m20143d(modifierM3409f3, aVar3, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM34108a3 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511, 6);
                            c28655q2 = c28655q3;
                            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM34108a3);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a6);
                            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m10);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N10);
                            float f15 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f15, c2314t2));
                            i34 = 0;
                            m31877L(viewState.getHeader(), c28655q2, 0);
                            C23010x c23010xM73381n3 = AbstractC25012a.m73381n(f15, 4, c2305k3, c28655q2, 6);
                            iHashCode4 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM73381n3);
                            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m11);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N11);
                            c28655q2.m87150e0(565095534);
                            while (r10.hasNext()) {
                                boolean zM87157i3 = c28655q2.m87157i(viewState);
                                if ((i28 & 112) == 32) {
                                    i35 = 1;
                                } else {
                                    i35 = i34;
                                }
                                int i512 = (zM87157i3 ? 1 : 0) | i35;
                                i36 = i27;
                                if (i36 == 256) {
                                    i37 = 1;
                                } else {
                                    i37 = i34;
                                }
                                int i513 = i512 | i37;
                                i29 = i29;
                                if (i29 == 16384) {
                                    i38 = 1;
                                } else {
                                    i38 = i34;
                                }
                                int i514 = i513 | i38;
                                i28 = i28;
                                if ((i28 & 7168) == 2048) {
                                    i39 = 1;
                                } else {
                                    i39 = 0;
                                }
                                i44 = i514 | i39;
                                objM87133R6 = c28655q2.m87133R();
                                if (i44 != 0) {
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj10 = obj9;
                                    if (objM87133R6 == obj10) {
                                        obj9 = obj10;
                                        interfaceC28601c3 = interfaceC28601c2;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                        c28655q2.m87172p0(c1008b);
                                    } else {
                                        obj9 = obj10;
                                        c1008b = objM87133R6;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        interfaceC28601c3 = interfaceC28601c2;
                                    }
                                }
                                AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                                function12 = function19;
                                function17 = function21;
                                function18 = function20;
                                interfaceC28601c2 = interfaceC28601c3;
                                i27 = i36;
                                i34 = i45;
                            }
                            function9 = function12;
                            function10 = function17;
                            c28655q2.m87173q(i34);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 2 * f15, 7));
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            function8 = function18;
                            function11 = function16;
                            c28655q = c28655q2;
                        } else {
                            function17 = function13;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N8);
                        Modifier modifierM3411h4 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t2));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h18 = new C11473h(19);
                            c28655q3.m87172p0(c11473h18);
                            obj5 = c11473h18;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b7 = AbstractC15676d.m44099b(modifierM3411h4, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h19 = new C11473h(20);
                            c28655q3.m87172p0(c11473h19);
                            obj6 = c11473h19;
                        }
                        Modifier modifierM44099b8 = AbstractC15676d.m44099b(modifierM44099b7, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h110 = new C11473h(21);
                            c28655q3.m87172p0(c11473h110);
                            obj7 = c11473h110;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b8, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m4 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t2));
                        C22957g c22957g4 = AbstractC22977m.f90652c;
                        C2305k c2305k4 = C2299e.f9110M;
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q3.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q3, modifierM66724m4);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i6, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m12);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N12);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        AbstractC6721d.a aVar4 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R16 = c28655q3.m87133R();
                        obj8 = objM87133R16;
                        if (z19) {
                            Object c9813i6 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i6);
                            obj8 = c9813i6;
                        } else {
                            Object c9813i7 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i7);
                            obj8 = c9813i7;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f4, aVar4, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a4 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM34108a4);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m13);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N13);
                        float f16 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f16, c2314t2));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n4 = AbstractC25012a.m73381n(f16, 4, c2305k4, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM73381n4);
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m14);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N14);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i4 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i515 = (zM87157i4 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i516 = i515 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i517 = i516 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i517 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 2 * f16, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        c28655q3.m87138X();
                        function8 = function4;
                        function9 = function5;
                        function10 = function6;
                        function11 = function7;
                        c28655q = c28655q3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                    }
                }
                i46 |= 3072;
                function7 = function3;
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q3.m87157i(function4)) {
                            i24 = 16384;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i46 |= i24;
                    }
                    if ((i46 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i46 & 1, z4)) {
                        obj = C28635l.f115821a;
                        if (i47 != 0) {
                            objM87133R10 = c28655q3.m87133R();
                            if (objM87133R10 == obj) {
                                obj14 = objM87133R10;
                                Object c11473h111 = new C11473h(25);
                                c28655q3.m87172p0(c11473h111);
                                obj14 = c11473h111;
                            }
                            obj14 = objM87133R10;
                            function12 = (Function1) obj14;
                        } else {
                            function12 = function5;
                        }
                        if (i15 != 0) {
                            objM87133R9 = c28655q3.m87133R();
                            if (objM87133R9 == obj) {
                                obj13 = objM87133R9;
                                Object c11473h112 = new C11473h(26);
                                c28655q3.m87172p0(c11473h112);
                                obj13 = c11473h112;
                            }
                            obj13 = objM87133R9;
                            function13 = (Function1) obj13;
                        } else {
                            function13 = function6;
                        }
                        if (i17 != 0) {
                            objM87133R8 = c28655q3.m87133R();
                            if (objM87133R8 == obj) {
                                obj12 = objM87133R8;
                                Object c11473h113 = new C11473h(17);
                                c28655q3.m87172p0(c11473h113);
                                obj12 = c11473h113;
                            }
                            obj12 = objM87133R8;
                            function14 = (Function1) obj12;
                        } else {
                            function14 = function7;
                        }
                        if (i19 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == obj) {
                                obj11 = objM87133R7;
                                Object c11473h114 = new C11473h(18);
                                c28655q3.m87172p0(c11473h114);
                                obj11 = c11473h114;
                            }
                            obj11 = objM87133R7;
                            function15 = (Function1) obj11;
                        } else {
                            function15 = function4;
                        }
                        objM87133R = c28655q3.m87133R();
                        obj2 = objM87133R;
                        if (objM87133R == obj) {
                            Object objM87272z3 = AbstractC28683x.m87272z(null);
                            c28655q3.m87172p0(objM87272z3);
                            obj2 = objM87272z3;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) obj2;
                        C22383c.b bVarM31867B3 = m31867B(interfaceC28601c1);
                        objM87133R2 = c28655q3.m87133R();
                        obj3 = objM87133R2;
                        if (objM87133R2 == obj) {
                            Object c2192m3 = new C2192m(22, interfaceC28601c1);
                            c28655q3.m87172p0(c2192m3);
                            obj3 = c2192m3;
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) obj3;
                        i25 = i46 & 896;
                        if (i25 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i26 = i46 & 57344;
                        if (i26 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        Object objM87133R17 = c28655q3.m87133R();
                        obj4 = objM87133R17;
                        if (z15) {
                            Object c2777c4 = new C2777c(function13, 3, function15);
                            c28655q3.m87172p0(c2777c4);
                            obj4 = c2777c4;
                        } else {
                            Object c2777c5 = new C2777c(function13, 3, function15);
                            c28655q3.m87172p0(c2777c5);
                            obj4 = c2777c5;
                        }
                        int i412 = TextResource.$stable;
                        int i413 = C27256h.f109055z;
                        AbstractC22431f.m64651Z(bVarM31867B3, interfaceC4339a4, (Function1) obj4, c28655q3, i412 | i413 | i413 | 48);
                        C2314t c2314t3 = C2314t.f9131w;
                        Modifier modifierM44028b2 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t3));
                        C13404j c13404jM8528f3 = viewState.getScreenContextMetadata();
                        int i518 = C13404j.f46947x << 3;
                        function16 = function14;
                        interfaceC28601c2 = interfaceC28601c1;
                        i27 = i25;
                        Modifier modifierM34129b3 = AbstractC12250f.m34129b(modifierM44028b2, c13404jM8528f3, false, c28655q3, i518, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, modifierM34129b3);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i10 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i10, interfaceC39127r0M66763d3);
                        C0209i c0209i11 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m15);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            function17 = function13;
                            if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i12 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N15);
                            Modifier modifierM3411h5 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t3));
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == obj) {
                                Object c11473h115 = new C11473h(19);
                                c28655q3.m87172p0(c11473h115);
                                obj5 = c11473h115;
                            } else {
                                obj5 = objM87133R3;
                            }
                            Modifier modifierM44099b9 = AbstractC15676d.m44099b(modifierM3411h5, z16, (Function1) obj5);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            obj6 = objM87133R4;
                            if (objM87133R4 == obj) {
                                Object c11473h116 = new C11473h(20);
                                c28655q3.m87172p0(c11473h116);
                                obj6 = c11473h116;
                            }
                            Modifier modifierM44099b10 = AbstractC15676d.m44099b(modifierM44099b9, z17, (Function1) obj6);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R5 = c28655q3.m87133R();
                            obj7 = objM87133R5;
                            if (objM87133R5 == obj) {
                                Object c11473h117 = new C11473h(21);
                                c28655q3.m87172p0(c11473h117);
                                obj7 = c11473h117;
                            }
                            AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b10, z18, (Function1) obj7), c28655q3, 0);
                            Modifier modifierM66724m5 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t3));
                            C22957g c22957g5 = AbstractC22977m.f90652c;
                            C2305k c2305k5 = C2299e.f9110M;
                            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q3, 0);
                            i28 = i46;
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q3.m87165m();
                            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q3, modifierM66724m5);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a9);
                            AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m16);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N16);
                            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t3);
                            AbstractC6721d.a aVar5 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if (i26 == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            Object objM87133R18 = c28655q3.m87133R();
                            obj8 = objM87133R18;
                            if (z19) {
                                Object c9813i8 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i8);
                                obj8 = c9813i8;
                            } else {
                                Object c9813i9 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i9);
                                obj8 = c9813i9;
                            }
                            i29 = i26;
                            obj9 = obj;
                            function18 = function15;
                            AbstractC6719b.m20143d(modifierM3409f5, aVar5, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM34108a5 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i518, 6);
                            c28655q2 = c28655q3;
                            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q2, 0);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM34108a5);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a10);
                            AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m17);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N17);
                            float f17 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f17, c2314t3));
                            i34 = 0;
                            m31877L(viewState.getHeader(), c28655q2, 0);
                            C23010x c23010xM73381n5 = AbstractC25012a.m73381n(f17, 4, c2305k5, c28655q2, 6);
                            iHashCode4 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, c2314t3);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM73381n5);
                            AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m18);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N18);
                            c28655q2.m87150e0(565095534);
                            while (r10.hasNext()) {
                                boolean zM87157i5 = c28655q2.m87157i(viewState);
                                if ((i28 & 112) == 32) {
                                    i35 = 1;
                                } else {
                                    i35 = i34;
                                }
                                int i519 = (zM87157i5 ? 1 : 0) | i35;
                                i36 = i27;
                                if (i36 == 256) {
                                    i37 = 1;
                                } else {
                                    i37 = i34;
                                }
                                int i5110 = i519 | i37;
                                i29 = i29;
                                if (i29 == 16384) {
                                    i38 = 1;
                                } else {
                                    i38 = i34;
                                }
                                int i5111 = i5110 | i38;
                                i28 = i28;
                                if ((i28 & 7168) == 2048) {
                                    i39 = 1;
                                } else {
                                    i39 = 0;
                                }
                                i44 = i5111 | i39;
                                objM87133R6 = c28655q2.m87133R();
                                if (i44 != 0) {
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj10 = obj9;
                                    if (objM87133R6 == obj10) {
                                        obj9 = obj10;
                                        interfaceC28601c3 = interfaceC28601c2;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                        c28655q2.m87172p0(c1008b);
                                    } else {
                                        obj9 = obj10;
                                        c1008b = objM87133R6;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        interfaceC28601c3 = interfaceC28601c2;
                                    }
                                }
                                AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                                function12 = function19;
                                function17 = function21;
                                function18 = function20;
                                interfaceC28601c2 = interfaceC28601c3;
                                i27 = i36;
                                i34 = i45;
                            }
                            function9 = function12;
                            function10 = function17;
                            c28655q2.m87173q(i34);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 0.0f, 2 * f17, 7));
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            function8 = function18;
                            function11 = function16;
                            c28655q = c28655q2;
                        } else {
                            function17 = function13;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        C0209i c0209i13 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N15);
                        Modifier modifierM3411h6 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t3));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h118 = new C11473h(19);
                            c28655q3.m87172p0(c11473h118);
                            obj5 = c11473h118;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b11 = AbstractC15676d.m44099b(modifierM3411h6, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h119 = new C11473h(20);
                            c28655q3.m87172p0(c11473h119);
                            obj6 = c11473h119;
                        }
                        Modifier modifierM44099b12 = AbstractC15676d.m44099b(modifierM44099b11, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h1110 = new C11473h(21);
                            c28655q3.m87172p0(c11473h1110);
                            obj7 = c11473h1110;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b12, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m6 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t3));
                        C22957g c22957g6 = AbstractC22977m.f90652c;
                        C2305k c2305k6 = C2299e.f9110M;
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q3.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q3, modifierM66724m6);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m19);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N19);
                        Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t3);
                        AbstractC6721d.a aVar6 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R19 = c28655q3.m87133R();
                        obj8 = objM87133R19;
                        if (z19) {
                            Object c9813i10 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i10);
                            obj8 = c9813i10;
                        } else {
                            Object c9813i11 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i11);
                            obj8 = c9813i11;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f6, aVar6, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a6 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i518, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM34108a6);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a12);
                        AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m110);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N110);
                        float f18 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f18, c2314t3));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n6 = AbstractC25012a.m73381n(f18, 4, c2305k6, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, c2314t3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM73381n6);
                        AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m111);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N111);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i6 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i5112 = (zM87157i6 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i5113 = i5112 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i5114 = i5113 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i5114 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 0.0f, 2 * f18, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        c28655q3.m87138X();
                        function8 = function4;
                        function9 = function5;
                        function10 = function6;
                        function11 = function7;
                        c28655q = c28655q3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                    }
                }
                i46 |= 24576;
                if ((i46 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i46 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i47 != 0) {
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == obj) {
                            obj14 = objM87133R10;
                            Object c11473h1111 = new C11473h(25);
                            c28655q3.m87172p0(c11473h1111);
                            obj14 = c11473h1111;
                        }
                        obj14 = objM87133R10;
                        function12 = (Function1) obj14;
                    } else {
                        function12 = function5;
                    }
                    if (i15 != 0) {
                        objM87133R9 = c28655q3.m87133R();
                        if (objM87133R9 == obj) {
                            obj13 = objM87133R9;
                            Object c11473h1112 = new C11473h(26);
                            c28655q3.m87172p0(c11473h1112);
                            obj13 = c11473h1112;
                        }
                        obj13 = objM87133R9;
                        function13 = (Function1) obj13;
                    } else {
                        function13 = function6;
                    }
                    if (i17 != 0) {
                        objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == obj) {
                            obj12 = objM87133R8;
                            Object c11473h1113 = new C11473h(17);
                            c28655q3.m87172p0(c11473h1113);
                            obj12 = c11473h1113;
                        }
                        obj12 = objM87133R8;
                        function14 = (Function1) obj12;
                    } else {
                        function14 = function7;
                    }
                    if (i19 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == obj) {
                            obj11 = objM87133R7;
                            Object c11473h1114 = new C11473h(18);
                            c28655q3.m87172p0(c11473h1114);
                            obj11 = c11473h1114;
                        }
                        obj11 = objM87133R7;
                        function15 = (Function1) obj11;
                    } else {
                        function15 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    obj2 = objM87133R;
                    if (objM87133R == obj) {
                        Object objM87272z4 = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87272z4);
                        obj2 = objM87272z4;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    C22383c.b bVarM31867B4 = m31867B(interfaceC28601c1);
                    objM87133R2 = c28655q3.m87133R();
                    obj3 = objM87133R2;
                    if (objM87133R2 == obj) {
                        Object c2192m4 = new C2192m(22, interfaceC28601c1);
                        c28655q3.m87172p0(c2192m4);
                        obj3 = c2192m4;
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) obj3;
                    i25 = i46 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i26 = i46 & 57344;
                    if (i26 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R110 = c28655q3.m87133R();
                    obj4 = objM87133R110;
                    if (z15) {
                        Object c2777c6 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c6);
                        obj4 = c2777c6;
                    } else {
                        Object c2777c7 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c7);
                        obj4 = c2777c7;
                    }
                    int i414 = TextResource.$stable;
                    int i415 = C27256h.f109055z;
                    AbstractC22431f.m64651Z(bVarM31867B4, interfaceC4339a5, (Function1) obj4, c28655q3, i414 | i415 | i415 | 48);
                    C2314t c2314t4 = C2314t.f9131w;
                    Modifier modifierM44028b3 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t4));
                    C13404j c13404jM8528f4 = viewState.getScreenContextMetadata();
                    int i5115 = C13404j.f46947x << 3;
                    function16 = function14;
                    interfaceC28601c2 = interfaceC28601c1;
                    i27 = i25;
                    Modifier modifierM34129b4 = AbstractC12250f.m34129b(modifierM44028b3, c13404jM8528f4, false, c28655q3, i5115, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q3.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q3, modifierM34129b4);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC39127r0M66763d4);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m112);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        function17 = function13;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i16 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i16, modifierM118962N112);
                        Modifier modifierM3411h7 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t4));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h1115 = new C11473h(19);
                            c28655q3.m87172p0(c11473h1115);
                            obj5 = c11473h1115;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b13 = AbstractC15676d.m44099b(modifierM3411h7, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h1116 = new C11473h(20);
                            c28655q3.m87172p0(c11473h1116);
                            obj6 = c11473h1116;
                        }
                        Modifier modifierM44099b14 = AbstractC15676d.m44099b(modifierM44099b13, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h1117 = new C11473h(21);
                            c28655q3.m87172p0(c11473h1117);
                            obj7 = c11473h1117;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b14, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m7 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t4));
                        C22957g c22957g7 = AbstractC22977m.f90652c;
                        C2305k c2305k7 = C2299e.f9110M;
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q3.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q3, modifierM66724m7);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i14, c23010xM66775a13);
                        AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m113);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i16, modifierM118962N113);
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t4);
                        AbstractC6721d.a aVar7 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R111 = c28655q3.m87133R();
                        obj8 = objM87133R111;
                        if (z19) {
                            Object c9813i12 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i12);
                            obj8 = c9813i12;
                        } else {
                            Object c9813i13 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i13);
                            obj8 = c9813i13;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f7, aVar7, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a7 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i5115, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                        Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM34108a7);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a14);
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m114);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N114);
                        float f19 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f19, c2314t4));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n7 = AbstractC25012a.m73381n(f19, 4, c2305k7, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, c2314t4);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM73381n7);
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m115);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N115);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i7 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i5116 = (zM87157i7 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i5117 = i5116 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i5118 = i5117 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i5118 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, 2 * f19, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        function17 = function13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i17 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i17, modifierM118962N112);
                    Modifier modifierM3411h8 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t4));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h1118 = new C11473h(19);
                        c28655q3.m87172p0(c11473h1118);
                        obj5 = c11473h1118;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b15 = AbstractC15676d.m44099b(modifierM3411h8, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h1119 = new C11473h(20);
                        c28655q3.m87172p0(c11473h1119);
                        obj6 = c11473h1119;
                    }
                    Modifier modifierM44099b16 = AbstractC15676d.m44099b(modifierM44099b15, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h11110 = new C11473h(21);
                        c28655q3.m87172p0(c11473h11110);
                        obj7 = c11473h11110;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b16, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m8 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t4));
                    C22957g c22957g8 = AbstractC22977m.f90652c;
                    C2305k c2305k8 = C2299e.f9110M;
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q3.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q3, modifierM66724m8);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i14, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m116);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i17, modifierM118962N116);
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    AbstractC6721d.a aVar8 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R112 = c28655q3.m87133R();
                    obj8 = objM87133R112;
                    if (z19) {
                        Object c9813i14 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i14);
                        obj8 = c9813i14;
                    } else {
                        Object c9813i15 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i15);
                        obj8 = c9813i15;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f8, aVar8, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a8 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i5115, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM34108a8);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a16);
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m117);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N117);
                    float f110 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f110, c2314t4));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n8 = AbstractC25012a.m73381n(f110, 4, c2305k8, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, c2314t4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM73381n8);
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m118);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N118);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i8 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i5119 = (zM87157i8 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i51110 = i5119 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i51111 = i51110 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i51111 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, 2 * f110, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    c28655q3.m87138X();
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                    function11 = function7;
                    c28655q = c28655q3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                }
            }
            i46 |= 384;
            function6 = function2;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function7 = function3;
                    if (c28655q3.m87157i(function7)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i46 |= i18;
                }
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q3.m87157i(function4)) {
                            i24 = 16384;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i46 |= i24;
                    }
                    if ((i46 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i46 & 1, z4)) {
                        obj = C28635l.f115821a;
                        if (i47 != 0) {
                            objM87133R10 = c28655q3.m87133R();
                            if (objM87133R10 == obj) {
                                obj14 = objM87133R10;
                                Object c11473h11111 = new C11473h(25);
                                c28655q3.m87172p0(c11473h11111);
                                obj14 = c11473h11111;
                            }
                            obj14 = objM87133R10;
                            function12 = (Function1) obj14;
                        } else {
                            function12 = function5;
                        }
                        if (i15 != 0) {
                            objM87133R9 = c28655q3.m87133R();
                            if (objM87133R9 == obj) {
                                obj13 = objM87133R9;
                                Object c11473h11112 = new C11473h(26);
                                c28655q3.m87172p0(c11473h11112);
                                obj13 = c11473h11112;
                            }
                            obj13 = objM87133R9;
                            function13 = (Function1) obj13;
                        } else {
                            function13 = function6;
                        }
                        if (i17 != 0) {
                            objM87133R8 = c28655q3.m87133R();
                            if (objM87133R8 == obj) {
                                obj12 = objM87133R8;
                                Object c11473h11113 = new C11473h(17);
                                c28655q3.m87172p0(c11473h11113);
                                obj12 = c11473h11113;
                            }
                            obj12 = objM87133R8;
                            function14 = (Function1) obj12;
                        } else {
                            function14 = function7;
                        }
                        if (i19 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == obj) {
                                obj11 = objM87133R7;
                                Object c11473h11114 = new C11473h(18);
                                c28655q3.m87172p0(c11473h11114);
                                obj11 = c11473h11114;
                            }
                            obj11 = objM87133R7;
                            function15 = (Function1) obj11;
                        } else {
                            function15 = function4;
                        }
                        objM87133R = c28655q3.m87133R();
                        obj2 = objM87133R;
                        if (objM87133R == obj) {
                            Object objM87272z5 = AbstractC28683x.m87272z(null);
                            c28655q3.m87172p0(objM87272z5);
                            obj2 = objM87272z5;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) obj2;
                        C22383c.b bVarM31867B5 = m31867B(interfaceC28601c1);
                        objM87133R2 = c28655q3.m87133R();
                        obj3 = objM87133R2;
                        if (objM87133R2 == obj) {
                            Object c2192m5 = new C2192m(22, interfaceC28601c1);
                            c28655q3.m87172p0(c2192m5);
                            obj3 = c2192m5;
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) obj3;
                        i25 = i46 & 896;
                        if (i25 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i26 = i46 & 57344;
                        if (i26 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        Object objM87133R113 = c28655q3.m87133R();
                        obj4 = objM87133R113;
                        if (z15) {
                            Object c2777c8 = new C2777c(function13, 3, function15);
                            c28655q3.m87172p0(c2777c8);
                            obj4 = c2777c8;
                        } else {
                            Object c2777c9 = new C2777c(function13, 3, function15);
                            c28655q3.m87172p0(c2777c9);
                            obj4 = c2777c9;
                        }
                        int i416 = TextResource.$stable;
                        int i417 = C27256h.f109055z;
                        AbstractC22431f.m64651Z(bVarM31867B5, interfaceC4339a6, (Function1) obj4, c28655q3, i416 | i417 | i417 | 48);
                        C2314t c2314t5 = C2314t.f9131w;
                        Modifier modifierM44028b4 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t5));
                        C13404j c13404jM8528f5 = viewState.getScreenContextMetadata();
                        int i51112 = C13404j.f46947x << 3;
                        function16 = function14;
                        interfaceC28601c2 = interfaceC28601c1;
                        i27 = i25;
                        Modifier modifierM34129b5 = AbstractC12250f.m34129b(modifierM44028b4, c13404jM8528f5, false, c28655q3, i51112, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q3.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q3, modifierM34129b5);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i18 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i18, interfaceC39127r0M66763d5);
                        C0209i c0209i19 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i19, interfaceC28653p1M87165m119);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            function17 = function13;
                            if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i110 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q3, c0209i110, modifierM118962N119);
                            Modifier modifierM3411h9 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t5));
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == obj) {
                                Object c11473h11115 = new C11473h(19);
                                c28655q3.m87172p0(c11473h11115);
                                obj5 = c11473h11115;
                            } else {
                                obj5 = objM87133R3;
                            }
                            Modifier modifierM44099b17 = AbstractC15676d.m44099b(modifierM3411h9, z16, (Function1) obj5);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            obj6 = objM87133R4;
                            if (objM87133R4 == obj) {
                                Object c11473h11116 = new C11473h(20);
                                c28655q3.m87172p0(c11473h11116);
                                obj6 = c11473h11116;
                            }
                            Modifier modifierM44099b18 = AbstractC15676d.m44099b(modifierM44099b17, z17, (Function1) obj6);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R5 = c28655q3.m87133R();
                            obj7 = objM87133R5;
                            if (objM87133R5 == obj) {
                                Object c11473h11117 = new C11473h(21);
                                c28655q3.m87172p0(c11473h11117);
                                obj7 = c11473h11117;
                            }
                            AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b18, z18, (Function1) obj7), c28655q3, 0);
                            Modifier modifierM66724m9 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t5));
                            C22957g c22957g9 = AbstractC22977m.f90652c;
                            C2305k c2305k9 = C2299e.f9110M;
                            C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22957g9, c2305k9, c28655q3, 0);
                            i28 = i46;
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q3.m87165m();
                            Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q3, modifierM66724m9);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i18, c23010xM66775a17);
                            AbstractC28683x.m87239G(c28655q3, c0209i19, interfaceC28653p1M87165m1110);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i110, modifierM118962N1110);
                            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t5);
                            AbstractC6721d.a aVar9 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if (i26 == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            Object objM87133R114 = c28655q3.m87133R();
                            obj8 = objM87133R114;
                            if (z19) {
                                Object c9813i16 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i16);
                                obj8 = c9813i16;
                            } else {
                                Object c9813i17 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i17);
                                obj8 = c9813i17;
                            }
                            i29 = i26;
                            obj9 = obj;
                            function18 = function15;
                            AbstractC6719b.m20143d(modifierM3409f9, aVar9, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM34108a9 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51112, 6);
                            c28655q2 = c28655q3;
                            C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22957g9, c2305k9, c28655q2, 0);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
                            Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifierM34108a9);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM66775a18);
                            AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1111);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N1111);
                            float f111 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f111, c2314t5));
                            i34 = 0;
                            m31877L(viewState.getHeader(), c28655q2, 0);
                            C23010x c23010xM73381n9 = AbstractC25012a.m73381n(f111, 4, c2305k9, c28655q2, 6);
                            iHashCode4 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q2.m87165m();
                            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q2, c2314t5);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM73381n9);
                            AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1112);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N1112);
                            c28655q2.m87150e0(565095534);
                            while (r10.hasNext()) {
                                boolean zM87157i9 = c28655q2.m87157i(viewState);
                                if ((i28 & 112) == 32) {
                                    i35 = 1;
                                } else {
                                    i35 = i34;
                                }
                                int i51113 = (zM87157i9 ? 1 : 0) | i35;
                                i36 = i27;
                                if (i36 == 256) {
                                    i37 = 1;
                                } else {
                                    i37 = i34;
                                }
                                int i51114 = i51113 | i37;
                                i29 = i29;
                                if (i29 == 16384) {
                                    i38 = 1;
                                } else {
                                    i38 = i34;
                                }
                                int i51115 = i51114 | i38;
                                i28 = i28;
                                if ((i28 & 7168) == 2048) {
                                    i39 = 1;
                                } else {
                                    i39 = 0;
                                }
                                i44 = i51115 | i39;
                                objM87133R6 = c28655q2.m87133R();
                                if (i44 != 0) {
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj10 = obj9;
                                    if (objM87133R6 == obj10) {
                                        obj9 = obj10;
                                        interfaceC28601c3 = interfaceC28601c2;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                        c28655q2.m87172p0(c1008b);
                                    } else {
                                        obj9 = obj10;
                                        c1008b = objM87133R6;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        interfaceC28601c3 = interfaceC28601c2;
                                    }
                                }
                                AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                                function12 = function19;
                                function17 = function21;
                                function18 = function20;
                                interfaceC28601c2 = interfaceC28601c3;
                                i27 = i36;
                                i34 = i45;
                            }
                            function9 = function12;
                            function10 = function17;
                            c28655q2.m87173q(i34);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t5, 0.0f, 0.0f, 0.0f, 2 * f111, 7));
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            function8 = function18;
                            function11 = function16;
                            c28655q = c28655q2;
                        } else {
                            function17 = function13;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        C0209i c0209i111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i111, modifierM118962N119);
                        Modifier modifierM3411h10 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t5));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h11118 = new C11473h(19);
                            c28655q3.m87172p0(c11473h11118);
                            obj5 = c11473h11118;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b19 = AbstractC15676d.m44099b(modifierM3411h10, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h11119 = new C11473h(20);
                            c28655q3.m87172p0(c11473h11119);
                            obj6 = c11473h11119;
                        }
                        Modifier modifierM44099b110 = AbstractC15676d.m44099b(modifierM44099b19, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h111110 = new C11473h(21);
                            c28655q3.m87172p0(c11473h111110);
                            obj7 = c11473h111110;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b110, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m10 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t5));
                        C22957g c22957g10 = AbstractC22977m.f90652c;
                        C2305k c2305k10 = C2299e.f9110M;
                        C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g10, c2305k10, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q3.m87165m();
                        Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q3, modifierM66724m10);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i18, c23010xM66775a19);
                        AbstractC28683x.m87239G(c28655q3, c0209i19, interfaceC28653p1M87165m1113);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111, modifierM118962N1113);
                        Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t5);
                        AbstractC6721d.a aVar10 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R115 = c28655q3.m87133R();
                        obj8 = objM87133R115;
                        if (z19) {
                            Object c9813i18 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i18);
                            obj8 = c9813i18;
                        } else {
                            Object c9813i19 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i19);
                            obj8 = c9813i19;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f10, aVar10, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a10 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51112, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22957g10, c2305k10, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q2.m87165m();
                        Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q2, modifierM34108a10);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM66775a110);
                        AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1114);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N1114);
                        float f112 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f112, c2314t5));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n10 = AbstractC25012a.m73381n(f112, 4, c2305k10, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q2.m87165m();
                        Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q2, c2314t5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM73381n10);
                        AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1115);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N1115);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i10 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i51116 = (zM87157i10 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i51117 = i51116 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i51118 = i51117 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i51118 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t5, 0.0f, 0.0f, 0.0f, 2 * f112, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        c28655q3.m87138X();
                        function8 = function4;
                        function9 = function5;
                        function10 = function6;
                        function11 = function7;
                        c28655q = c28655q3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                    }
                }
                i46 |= 24576;
                if ((i46 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i46 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i47 != 0) {
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == obj) {
                            obj14 = objM87133R10;
                            Object c11473h111111 = new C11473h(25);
                            c28655q3.m87172p0(c11473h111111);
                            obj14 = c11473h111111;
                        }
                        obj14 = objM87133R10;
                        function12 = (Function1) obj14;
                    } else {
                        function12 = function5;
                    }
                    if (i15 != 0) {
                        objM87133R9 = c28655q3.m87133R();
                        if (objM87133R9 == obj) {
                            obj13 = objM87133R9;
                            Object c11473h111112 = new C11473h(26);
                            c28655q3.m87172p0(c11473h111112);
                            obj13 = c11473h111112;
                        }
                        obj13 = objM87133R9;
                        function13 = (Function1) obj13;
                    } else {
                        function13 = function6;
                    }
                    if (i17 != 0) {
                        objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == obj) {
                            obj12 = objM87133R8;
                            Object c11473h111113 = new C11473h(17);
                            c28655q3.m87172p0(c11473h111113);
                            obj12 = c11473h111113;
                        }
                        obj12 = objM87133R8;
                        function14 = (Function1) obj12;
                    } else {
                        function14 = function7;
                    }
                    if (i19 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == obj) {
                            obj11 = objM87133R7;
                            Object c11473h111114 = new C11473h(18);
                            c28655q3.m87172p0(c11473h111114);
                            obj11 = c11473h111114;
                        }
                        obj11 = objM87133R7;
                        function15 = (Function1) obj11;
                    } else {
                        function15 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    obj2 = objM87133R;
                    if (objM87133R == obj) {
                        Object objM87272z6 = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87272z6);
                        obj2 = objM87272z6;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    C22383c.b bVarM31867B6 = m31867B(interfaceC28601c1);
                    objM87133R2 = c28655q3.m87133R();
                    obj3 = objM87133R2;
                    if (objM87133R2 == obj) {
                        Object c2192m6 = new C2192m(22, interfaceC28601c1);
                        c28655q3.m87172p0(c2192m6);
                        obj3 = c2192m6;
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) obj3;
                    i25 = i46 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i26 = i46 & 57344;
                    if (i26 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R116 = c28655q3.m87133R();
                    obj4 = objM87133R116;
                    if (z15) {
                        Object c2777c10 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c10);
                        obj4 = c2777c10;
                    } else {
                        Object c2777c11 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c11);
                        obj4 = c2777c11;
                    }
                    int i418 = TextResource.$stable;
                    int i419 = C27256h.f109055z;
                    AbstractC22431f.m64651Z(bVarM31867B6, interfaceC4339a7, (Function1) obj4, c28655q3, i418 | i419 | i419 | 48);
                    C2314t c2314t6 = C2314t.f9131w;
                    Modifier modifierM44028b5 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t6));
                    C13404j c13404jM8528f6 = viewState.getScreenContextMetadata();
                    int i51119 = C13404j.f46947x << 3;
                    function16 = function14;
                    interfaceC28601c2 = interfaceC28601c1;
                    i27 = i25;
                    Modifier modifierM34129b6 = AbstractC12250f.m34129b(modifierM44028b5, c13404jM8528f6, false, c28655q3, i51119, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q3.m87165m();
                    Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q3, modifierM34129b6);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i112, interfaceC39127r0M66763d6);
                    C0209i c0209i113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i113, interfaceC28653p1M87165m1116);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        function17 = function13;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i114, modifierM118962N1116);
                        Modifier modifierM3411h11 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t6));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h111115 = new C11473h(19);
                            c28655q3.m87172p0(c11473h111115);
                            obj5 = c11473h111115;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b111 = AbstractC15676d.m44099b(modifierM3411h11, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h111116 = new C11473h(20);
                            c28655q3.m87172p0(c11473h111116);
                            obj6 = c11473h111116;
                        }
                        Modifier modifierM44099b112 = AbstractC15676d.m44099b(modifierM44099b111, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h111117 = new C11473h(21);
                            c28655q3.m87172p0(c11473h111117);
                            obj7 = c11473h111117;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b112, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m11 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t6));
                        C22957g c22957g11 = AbstractC22977m.f90652c;
                        C2305k c2305k11 = C2299e.f9110M;
                        C23010x c23010xM66775a111 = AbstractC23007w.m66775a(c22957g11, c2305k11, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q3.m87165m();
                        Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q3, modifierM66724m11);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i112, c23010xM66775a111);
                        AbstractC28683x.m87239G(c28655q3, c0209i113, interfaceC28653p1M87165m1117);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i114, modifierM118962N1117);
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t6);
                        AbstractC6721d.a aVar11 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R117 = c28655q3.m87133R();
                        obj8 = objM87133R117;
                        if (z19) {
                            Object c9813i110 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i110);
                            obj8 = c9813i110;
                        } else {
                            Object c9813i111 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i111);
                            obj8 = c9813i111;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f11, aVar11, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a11 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51119, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a112 = AbstractC23007w.m66775a(c22957g11, c2305k11, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q2.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q2, modifierM34108a11);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM66775a112);
                        AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m1118);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N1118);
                        float f113 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f113, c2314t6));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n11 = AbstractC25012a.m73381n(f113, 4, c2305k11, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q2.m87165m();
                        Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q2, c2314t6);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM73381n11);
                        AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m1119);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N1119);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i11 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i511110 = (zM87157i11 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i511111 = i511110 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i511112 = i511111 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i511112 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t6, 0.0f, 0.0f, 0.0f, 2 * f113, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        function17 = function13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i115, modifierM118962N1116);
                    Modifier modifierM3411h12 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t6));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h111118 = new C11473h(19);
                        c28655q3.m87172p0(c11473h111118);
                        obj5 = c11473h111118;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b113 = AbstractC15676d.m44099b(modifierM3411h12, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h111119 = new C11473h(20);
                        c28655q3.m87172p0(c11473h111119);
                        obj6 = c11473h111119;
                    }
                    Modifier modifierM44099b114 = AbstractC15676d.m44099b(modifierM44099b113, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h1111110 = new C11473h(21);
                        c28655q3.m87172p0(c11473h1111110);
                        obj7 = c11473h1111110;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b114, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m12 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t6));
                    C22957g c22957g12 = AbstractC22977m.f90652c;
                    C2305k c2305k12 = C2299e.f9110M;
                    C23010x c23010xM66775a113 = AbstractC23007w.m66775a(c22957g12, c2305k12, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q3.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q3, modifierM66724m12);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i112, c23010xM66775a113);
                    AbstractC28683x.m87239G(c28655q3, c0209i113, interfaceC28653p1M87165m11110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i115, modifierM118962N11110);
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t6);
                    AbstractC6721d.a aVar12 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R118 = c28655q3.m87133R();
                    obj8 = objM87133R118;
                    if (z19) {
                        Object c9813i112 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i112);
                        obj8 = c9813i112;
                    } else {
                        Object c9813i113 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i113);
                        obj8 = c9813i113;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f12, aVar12, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a12 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51119, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a114 = AbstractC23007w.m66775a(c22957g12, c2305k12, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q2.m87165m();
                    Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q2, modifierM34108a12);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM66775a114);
                    AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m11111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N11111);
                    float f114 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f114, c2314t6));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n12 = AbstractC25012a.m73381n(f114, 4, c2305k12, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q2.m87165m();
                    Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q2, c2314t6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM73381n12);
                    AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m11112);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N11112);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i12 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i511113 = (zM87157i12 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i511114 = i511113 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i511115 = i511114 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i511115 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t6, 0.0f, 0.0f, 0.0f, 2 * f114, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    c28655q3.m87138X();
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                    function11 = function7;
                    c28655q = c28655q3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                }
            }
            i46 |= 3072;
            function7 = function3;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q3.m87157i(function4)) {
                        i24 = 16384;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i46 |= i24;
                }
                if ((i46 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i46 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i47 != 0) {
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == obj) {
                            obj14 = objM87133R10;
                            Object c11473h1111111 = new C11473h(25);
                            c28655q3.m87172p0(c11473h1111111);
                            obj14 = c11473h1111111;
                        }
                        obj14 = objM87133R10;
                        function12 = (Function1) obj14;
                    } else {
                        function12 = function5;
                    }
                    if (i15 != 0) {
                        objM87133R9 = c28655q3.m87133R();
                        if (objM87133R9 == obj) {
                            obj13 = objM87133R9;
                            Object c11473h1111112 = new C11473h(26);
                            c28655q3.m87172p0(c11473h1111112);
                            obj13 = c11473h1111112;
                        }
                        obj13 = objM87133R9;
                        function13 = (Function1) obj13;
                    } else {
                        function13 = function6;
                    }
                    if (i17 != 0) {
                        objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == obj) {
                            obj12 = objM87133R8;
                            Object c11473h1111113 = new C11473h(17);
                            c28655q3.m87172p0(c11473h1111113);
                            obj12 = c11473h1111113;
                        }
                        obj12 = objM87133R8;
                        function14 = (Function1) obj12;
                    } else {
                        function14 = function7;
                    }
                    if (i19 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == obj) {
                            obj11 = objM87133R7;
                            Object c11473h1111114 = new C11473h(18);
                            c28655q3.m87172p0(c11473h1111114);
                            obj11 = c11473h1111114;
                        }
                        obj11 = objM87133R7;
                        function15 = (Function1) obj11;
                    } else {
                        function15 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    obj2 = objM87133R;
                    if (objM87133R == obj) {
                        Object objM87272z7 = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87272z7);
                        obj2 = objM87272z7;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    C22383c.b bVarM31867B7 = m31867B(interfaceC28601c1);
                    objM87133R2 = c28655q3.m87133R();
                    obj3 = objM87133R2;
                    if (objM87133R2 == obj) {
                        Object c2192m7 = new C2192m(22, interfaceC28601c1);
                        c28655q3.m87172p0(c2192m7);
                        obj3 = c2192m7;
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) obj3;
                    i25 = i46 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i26 = i46 & 57344;
                    if (i26 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R119 = c28655q3.m87133R();
                    obj4 = objM87133R119;
                    if (z15) {
                        Object c2777c12 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c12);
                        obj4 = c2777c12;
                    } else {
                        Object c2777c13 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c13);
                        obj4 = c2777c13;
                    }
                    int i4110 = TextResource.$stable;
                    int i4111 = C27256h.f109055z;
                    AbstractC22431f.m64651Z(bVarM31867B7, interfaceC4339a8, (Function1) obj4, c28655q3, i4110 | i4111 | i4111 | 48);
                    C2314t c2314t7 = C2314t.f9131w;
                    Modifier modifierM44028b6 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t7));
                    C13404j c13404jM8528f7 = viewState.getScreenContextMetadata();
                    int i511116 = C13404j.f46947x << 3;
                    function16 = function14;
                    interfaceC28601c2 = interfaceC28601c1;
                    i27 = i25;
                    Modifier modifierM34129b7 = AbstractC12250f.m34129b(modifierM44028b6, c13404jM8528f7, false, c28655q3, i511116, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q3.m87165m();
                    Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q3, modifierM34129b7);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i116 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i116, interfaceC39127r0M66763d7);
                    C0209i c0209i117 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i117, interfaceC28653p1M87165m11113);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        function17 = function13;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i118, modifierM118962N11113);
                        Modifier modifierM3411h13 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t7));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h1111115 = new C11473h(19);
                            c28655q3.m87172p0(c11473h1111115);
                            obj5 = c11473h1111115;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b115 = AbstractC15676d.m44099b(modifierM3411h13, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h1111116 = new C11473h(20);
                            c28655q3.m87172p0(c11473h1111116);
                            obj6 = c11473h1111116;
                        }
                        Modifier modifierM44099b116 = AbstractC15676d.m44099b(modifierM44099b115, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h1111117 = new C11473h(21);
                            c28655q3.m87172p0(c11473h1111117);
                            obj7 = c11473h1111117;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b116, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m13 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t7));
                        C22957g c22957g13 = AbstractC22977m.f90652c;
                        C2305k c2305k13 = C2299e.f9110M;
                        C23010x c23010xM66775a115 = AbstractC23007w.m66775a(c22957g13, c2305k13, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q3.m87165m();
                        Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q3, modifierM66724m13);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i116, c23010xM66775a115);
                        AbstractC28683x.m87239G(c28655q3, c0209i117, interfaceC28653p1M87165m11114);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i118, modifierM118962N11114);
                        Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t7);
                        AbstractC6721d.a aVar13 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R1110 = c28655q3.m87133R();
                        obj8 = objM87133R1110;
                        if (z19) {
                            Object c9813i114 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i114);
                            obj8 = c9813i114;
                        } else {
                            Object c9813i115 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i115);
                            obj8 = c9813i115;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f13, aVar13, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a13 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511116, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a116 = AbstractC23007w.m66775a(c22957g13, c2305k13, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q2.m87165m();
                        Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q2, modifierM34108a13);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM66775a116);
                        AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m11115);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N11115);
                        float f115 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f115, c2314t7));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n13 = AbstractC25012a.m73381n(f115, 4, c2305k13, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q2.m87165m();
                        Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q2, c2314t7);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM73381n13);
                        AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m11116);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N11116);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i13 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i511117 = (zM87157i13 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i511118 = i511117 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i511119 = i511118 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i511119 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t7, 0.0f, 0.0f, 0.0f, 2 * f115, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        function17 = function13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i119, modifierM118962N11113);
                    Modifier modifierM3411h14 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t7));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h1111118 = new C11473h(19);
                        c28655q3.m87172p0(c11473h1111118);
                        obj5 = c11473h1111118;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b117 = AbstractC15676d.m44099b(modifierM3411h14, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h1111119 = new C11473h(20);
                        c28655q3.m87172p0(c11473h1111119);
                        obj6 = c11473h1111119;
                    }
                    Modifier modifierM44099b118 = AbstractC15676d.m44099b(modifierM44099b117, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h11111110 = new C11473h(21);
                        c28655q3.m87172p0(c11473h11111110);
                        obj7 = c11473h11111110;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b118, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m14 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t7));
                    C22957g c22957g14 = AbstractC22977m.f90652c;
                    C2305k c2305k14 = C2299e.f9110M;
                    C23010x c23010xM66775a117 = AbstractC23007w.m66775a(c22957g14, c2305k14, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q3.m87165m();
                    Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q3, modifierM66724m14);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i116, c23010xM66775a117);
                    AbstractC28683x.m87239G(c28655q3, c0209i117, interfaceC28653p1M87165m11117);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i119, modifierM118962N11117);
                    Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t7);
                    AbstractC6721d.a aVar14 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R1111 = c28655q3.m87133R();
                    obj8 = objM87133R1111;
                    if (z19) {
                        Object c9813i116 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i116);
                        obj8 = c9813i116;
                    } else {
                        Object c9813i117 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i117);
                        obj8 = c9813i117;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f14, aVar14, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a14 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511116, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a118 = AbstractC23007w.m66775a(c22957g14, c2305k14, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q2.m87165m();
                    Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q2, modifierM34108a14);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM66775a118);
                    AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m11118);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i119, modifierM118962N11118);
                    float f116 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f116, c2314t7));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n14 = AbstractC25012a.m73381n(f116, 4, c2305k14, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q2.m87165m();
                    Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q2, c2314t7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM73381n14);
                    AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m11119);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i119, modifierM118962N11119);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i14 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i5111110 = (zM87157i14 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i5111111 = i5111110 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i5111112 = i5111111 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i5111112 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t7, 0.0f, 0.0f, 0.0f, 2 * f116, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    c28655q3.m87138X();
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                    function11 = function7;
                    c28655q = c28655q3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                }
            }
            i46 |= 24576;
            if ((i46 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i46 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i47 != 0) {
                    objM87133R10 = c28655q3.m87133R();
                    if (objM87133R10 == obj) {
                        obj14 = objM87133R10;
                        Object c11473h11111111 = new C11473h(25);
                        c28655q3.m87172p0(c11473h11111111);
                        obj14 = c11473h11111111;
                    }
                    obj14 = objM87133R10;
                    function12 = (Function1) obj14;
                } else {
                    function12 = function5;
                }
                if (i15 != 0) {
                    objM87133R9 = c28655q3.m87133R();
                    if (objM87133R9 == obj) {
                        obj13 = objM87133R9;
                        Object c11473h11111112 = new C11473h(26);
                        c28655q3.m87172p0(c11473h11111112);
                        obj13 = c11473h11111112;
                    }
                    obj13 = objM87133R9;
                    function13 = (Function1) obj13;
                } else {
                    function13 = function6;
                }
                if (i17 != 0) {
                    objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == obj) {
                        obj12 = objM87133R8;
                        Object c11473h11111113 = new C11473h(17);
                        c28655q3.m87172p0(c11473h11111113);
                        obj12 = c11473h11111113;
                    }
                    obj12 = objM87133R8;
                    function14 = (Function1) obj12;
                } else {
                    function14 = function7;
                }
                if (i19 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == obj) {
                        obj11 = objM87133R7;
                        Object c11473h11111114 = new C11473h(18);
                        c28655q3.m87172p0(c11473h11111114);
                        obj11 = c11473h11111114;
                    }
                    obj11 = objM87133R7;
                    function15 = (Function1) obj11;
                } else {
                    function15 = function4;
                }
                objM87133R = c28655q3.m87133R();
                obj2 = objM87133R;
                if (objM87133R == obj) {
                    Object objM87272z8 = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87272z8);
                    obj2 = objM87272z8;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                C22383c.b bVarM31867B8 = m31867B(interfaceC28601c1);
                objM87133R2 = c28655q3.m87133R();
                obj3 = objM87133R2;
                if (objM87133R2 == obj) {
                    Object c2192m8 = new C2192m(22, interfaceC28601c1);
                    c28655q3.m87172p0(c2192m8);
                    obj3 = c2192m8;
                }
                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) obj3;
                i25 = i46 & 896;
                if (i25 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i26 = i46 & 57344;
                if (i26 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                Object objM87133R1112 = c28655q3.m87133R();
                obj4 = objM87133R1112;
                if (z15) {
                    Object c2777c14 = new C2777c(function13, 3, function15);
                    c28655q3.m87172p0(c2777c14);
                    obj4 = c2777c14;
                } else {
                    Object c2777c15 = new C2777c(function13, 3, function15);
                    c28655q3.m87172p0(c2777c15);
                    obj4 = c2777c15;
                }
                int i4112 = TextResource.$stable;
                int i4113 = C27256h.f109055z;
                AbstractC22431f.m64651Z(bVarM31867B8, interfaceC4339a9, (Function1) obj4, c28655q3, i4112 | i4113 | i4113 | 48);
                C2314t c2314t8 = C2314t.f9131w;
                Modifier modifierM44028b7 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t8));
                C13404j c13404jM8528f8 = viewState.getScreenContextMetadata();
                int i5111113 = C13404j.f46947x << 3;
                function16 = function14;
                interfaceC28601c2 = interfaceC28601c1;
                i27 = i25;
                Modifier modifierM34129b8 = AbstractC12250f.m34129b(modifierM44028b7, c13404jM8528f8, false, c28655q3, i5111113, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q3.m87165m();
                Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q3, modifierM34129b8);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i1110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i1110, interfaceC39127r0M66763d8);
                C0209i c0209i1111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i1111, interfaceC28653p1M87165m111110);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    function17 = function13;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i1112, modifierM118962N111110);
                    Modifier modifierM3411h15 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t8));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h11111115 = new C11473h(19);
                        c28655q3.m87172p0(c11473h11111115);
                        obj5 = c11473h11111115;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b119 = AbstractC15676d.m44099b(modifierM3411h15, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h11111116 = new C11473h(20);
                        c28655q3.m87172p0(c11473h11111116);
                        obj6 = c11473h11111116;
                    }
                    Modifier modifierM44099b1110 = AbstractC15676d.m44099b(modifierM44099b119, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h11111117 = new C11473h(21);
                        c28655q3.m87172p0(c11473h11111117);
                        obj7 = c11473h11111117;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b1110, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m15 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t8));
                    C22957g c22957g15 = AbstractC22977m.f90652c;
                    C2305k c2305k15 = C2299e.f9110M;
                    C23010x c23010xM66775a119 = AbstractC23007w.m66775a(c22957g15, c2305k15, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q3.m87165m();
                    Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q3, modifierM66724m15);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1110, c23010xM66775a119);
                    AbstractC28683x.m87239G(c28655q3, c0209i1111, interfaceC28653p1M87165m111111);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1112, modifierM118962N111111);
                    Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t8);
                    AbstractC6721d.a aVar15 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R1113 = c28655q3.m87133R();
                    obj8 = objM87133R1113;
                    if (z19) {
                        Object c9813i118 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i118);
                        obj8 = c9813i118;
                    } else {
                        Object c9813i119 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i119);
                        obj8 = c9813i119;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f15, aVar15, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a15 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i5111113, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(c22957g15, c2305k15, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q2.m87165m();
                    Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q2, modifierM34108a15);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1110, c23010xM66775a1110);
                    AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m111112);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, modifierM118962N111112);
                    float f117 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f117, c2314t8));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n15 = AbstractC25012a.m73381n(f117, 4, c2305k15, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q2.m87165m();
                    Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q2, c2314t8);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1110, c23010xM73381n15);
                    AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m111113);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, modifierM118962N111113);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i15 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i5111114 = (zM87157i15 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i5111115 = i5111114 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i5111116 = i5111115 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i5111116 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t8, 0.0f, 0.0f, 0.0f, 2 * f117, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    function17 = function13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i1113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i1113, modifierM118962N111110);
                Modifier modifierM3411h16 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t8));
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == obj) {
                    Object c11473h11111118 = new C11473h(19);
                    c28655q3.m87172p0(c11473h11111118);
                    obj5 = c11473h11111118;
                } else {
                    obj5 = objM87133R3;
                }
                Modifier modifierM44099b1111 = AbstractC15676d.m44099b(modifierM3411h16, z16, (Function1) obj5);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                obj6 = objM87133R4;
                if (objM87133R4 == obj) {
                    Object c11473h11111119 = new C11473h(20);
                    c28655q3.m87172p0(c11473h11111119);
                    obj6 = c11473h11111119;
                }
                Modifier modifierM44099b1112 = AbstractC15676d.m44099b(modifierM44099b1111, z17, (Function1) obj6);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R5 = c28655q3.m87133R();
                obj7 = objM87133R5;
                if (objM87133R5 == obj) {
                    Object c11473h111111110 = new C11473h(21);
                    c28655q3.m87172p0(c11473h111111110);
                    obj7 = c11473h111111110;
                }
                AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b1112, z18, (Function1) obj7), c28655q3, 0);
                Modifier modifierM66724m16 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t8));
                C22957g c22957g16 = AbstractC22977m.f90652c;
                C2305k c2305k16 = C2299e.f9110M;
                C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(c22957g16, c2305k16, c28655q3, 0);
                i28 = i46;
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q3.m87165m();
                Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q3, modifierM66724m16);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1110, c23010xM66775a1111);
                AbstractC28683x.m87239G(c28655q3, c0209i1111, interfaceC28653p1M87165m111114);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1113, modifierM118962N111114);
                Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t8);
                AbstractC6721d.a aVar16 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if (i26 == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                Object objM87133R1114 = c28655q3.m87133R();
                obj8 = objM87133R1114;
                if (z19) {
                    Object c9813i1110 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i1110);
                    obj8 = c9813i1110;
                } else {
                    Object c9813i1111 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i1111);
                    obj8 = c9813i1111;
                }
                i29 = i26;
                obj9 = obj;
                function18 = function15;
                AbstractC6719b.m20143d(modifierM3409f16, aVar16, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM34108a16 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i5111113, 6);
                c28655q2 = c28655q3;
                C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(c22957g16, c2305k16, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q2.m87165m();
                Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q2, modifierM34108a16);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1110, c23010xM66775a1112);
                AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m111115);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1113, modifierM118962N111115);
                float f118 = 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f118, c2314t8));
                i34 = 0;
                m31877L(viewState.getHeader(), c28655q2, 0);
                C23010x c23010xM73381n16 = AbstractC25012a.m73381n(f118, 4, c2305k16, c28655q2, 6);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q2.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q2, c2314t8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1110, c23010xM73381n16);
                AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m111116);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1113, modifierM118962N111116);
                c28655q2.m87150e0(565095534);
                while (r10.hasNext()) {
                    boolean zM87157i16 = c28655q2.m87157i(viewState);
                    if ((i28 & 112) == 32) {
                        i35 = 1;
                    } else {
                        i35 = i34;
                    }
                    int i5111117 = (zM87157i16 ? 1 : 0) | i35;
                    i36 = i27;
                    if (i36 == 256) {
                        i37 = 1;
                    } else {
                        i37 = i34;
                    }
                    int i5111118 = i5111117 | i37;
                    i29 = i29;
                    if (i29 == 16384) {
                        i38 = 1;
                    } else {
                        i38 = i34;
                    }
                    int i5111119 = i5111118 | i38;
                    i28 = i28;
                    if ((i28 & 7168) == 2048) {
                        i39 = 1;
                    } else {
                        i39 = 0;
                    }
                    i44 = i5111119 | i39;
                    objM87133R6 = c28655q2.m87133R();
                    if (i44 != 0) {
                        interfaceC28601c3 = interfaceC28601c2;
                        function19 = function12;
                        function20 = function18;
                        function21 = function17;
                        i45 = 0;
                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                        c28655q2.m87172p0(c1008b);
                    } else {
                        obj10 = obj9;
                        if (objM87133R6 == obj10) {
                            obj9 = obj10;
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj9 = obj10;
                            c1008b = objM87133R6;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            interfaceC28601c3 = interfaceC28601c2;
                        }
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                    function12 = function19;
                    function17 = function21;
                    function18 = function20;
                    interfaceC28601c2 = interfaceC28601c3;
                    i27 = i36;
                    i34 = i45;
                }
                function9 = function12;
                function10 = function17;
                c28655q2.m87173q(i34);
                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t8, 0.0f, 0.0f, 0.0f, 2 * f118, 7));
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function8 = function18;
                function11 = function16;
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                function8 = function4;
                function9 = function5;
                function10 = function6;
                function11 = function7;
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
            }
        }
        i46 |= 48;
        function5 = function1;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function6 = function2;
                if (c28655q3.m87157i(function6)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i46 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function7 = function3;
                    if (c28655q3.m87157i(function7)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i46 |= i18;
                }
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q3.m87157i(function4)) {
                            i24 = 16384;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i46 |= i24;
                    }
                    if ((i46 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i46 & 1, z4)) {
                        obj = C28635l.f115821a;
                        if (i47 != 0) {
                            objM87133R10 = c28655q3.m87133R();
                            if (objM87133R10 == obj) {
                                obj14 = objM87133R10;
                                Object c11473h111111111 = new C11473h(25);
                                c28655q3.m87172p0(c11473h111111111);
                                obj14 = c11473h111111111;
                            }
                            obj14 = objM87133R10;
                            function12 = (Function1) obj14;
                        } else {
                            function12 = function5;
                        }
                        if (i15 != 0) {
                            objM87133R9 = c28655q3.m87133R();
                            if (objM87133R9 == obj) {
                                obj13 = objM87133R9;
                                Object c11473h111111112 = new C11473h(26);
                                c28655q3.m87172p0(c11473h111111112);
                                obj13 = c11473h111111112;
                            }
                            obj13 = objM87133R9;
                            function13 = (Function1) obj13;
                        } else {
                            function13 = function6;
                        }
                        if (i17 != 0) {
                            objM87133R8 = c28655q3.m87133R();
                            if (objM87133R8 == obj) {
                                obj12 = objM87133R8;
                                Object c11473h111111113 = new C11473h(17);
                                c28655q3.m87172p0(c11473h111111113);
                                obj12 = c11473h111111113;
                            }
                            obj12 = objM87133R8;
                            function14 = (Function1) obj12;
                        } else {
                            function14 = function7;
                        }
                        if (i19 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == obj) {
                                obj11 = objM87133R7;
                                Object c11473h111111114 = new C11473h(18);
                                c28655q3.m87172p0(c11473h111111114);
                                obj11 = c11473h111111114;
                            }
                            obj11 = objM87133R7;
                            function15 = (Function1) obj11;
                        } else {
                            function15 = function4;
                        }
                        objM87133R = c28655q3.m87133R();
                        obj2 = objM87133R;
                        if (objM87133R == obj) {
                            Object objM87272z9 = AbstractC28683x.m87272z(null);
                            c28655q3.m87172p0(objM87272z9);
                            obj2 = objM87272z9;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) obj2;
                        C22383c.b bVarM31867B9 = m31867B(interfaceC28601c1);
                        objM87133R2 = c28655q3.m87133R();
                        obj3 = objM87133R2;
                        if (objM87133R2 == obj) {
                            Object c2192m9 = new C2192m(22, interfaceC28601c1);
                            c28655q3.m87172p0(c2192m9);
                            obj3 = c2192m9;
                        }
                        InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) obj3;
                        i25 = i46 & 896;
                        if (i25 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i26 = i46 & 57344;
                        if (i26 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        Object objM87133R1115 = c28655q3.m87133R();
                        obj4 = objM87133R1115;
                        if (z15) {
                            Object c2777c16 = new C2777c(function13, 3, function15);
                            c28655q3.m87172p0(c2777c16);
                            obj4 = c2777c16;
                        } else {
                            Object c2777c17 = new C2777c(function13, 3, function15);
                            c28655q3.m87172p0(c2777c17);
                            obj4 = c2777c17;
                        }
                        int i4114 = TextResource.$stable;
                        int i4115 = C27256h.f109055z;
                        AbstractC22431f.m64651Z(bVarM31867B9, interfaceC4339a10, (Function1) obj4, c28655q3, i4114 | i4115 | i4115 | 48);
                        C2314t c2314t9 = C2314t.f9131w;
                        Modifier modifierM44028b8 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t9));
                        C13404j c13404jM8528f9 = viewState.getScreenContextMetadata();
                        int i51111110 = C13404j.f46947x << 3;
                        function16 = function14;
                        interfaceC28601c2 = interfaceC28601c1;
                        i27 = i25;
                        Modifier modifierM34129b9 = AbstractC12250f.m34129b(modifierM44028b8, c13404jM8528f9, false, c28655q3, i51111110, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q3.m87165m();
                        Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q3, modifierM34129b9);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i1114 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i1114, interfaceC39127r0M66763d9);
                        C0209i c0209i1115 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i1115, interfaceC28653p1M87165m111117);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            function17 = function13;
                            if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i1116 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q3, c0209i1116, modifierM118962N111117);
                            Modifier modifierM3411h17 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t9));
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == obj) {
                                Object c11473h111111115 = new C11473h(19);
                                c28655q3.m87172p0(c11473h111111115);
                                obj5 = c11473h111111115;
                            } else {
                                obj5 = objM87133R3;
                            }
                            Modifier modifierM44099b1113 = AbstractC15676d.m44099b(modifierM3411h17, z16, (Function1) obj5);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            obj6 = objM87133R4;
                            if (objM87133R4 == obj) {
                                Object c11473h111111116 = new C11473h(20);
                                c28655q3.m87172p0(c11473h111111116);
                                obj6 = c11473h111111116;
                            }
                            Modifier modifierM44099b1114 = AbstractC15676d.m44099b(modifierM44099b1113, z17, (Function1) obj6);
                            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R5 = c28655q3.m87133R();
                            obj7 = objM87133R5;
                            if (objM87133R5 == obj) {
                                Object c11473h111111117 = new C11473h(21);
                                c28655q3.m87172p0(c11473h111111117);
                                obj7 = c11473h111111117;
                            }
                            AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b1114, z18, (Function1) obj7), c28655q3, 0);
                            Modifier modifierM66724m17 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t9));
                            C22957g c22957g17 = AbstractC22977m.f90652c;
                            C2305k c2305k17 = C2299e.f9110M;
                            C23010x c23010xM66775a1113 = AbstractC23007w.m66775a(c22957g17, c2305k17, c28655q3, 0);
                            i28 = i46;
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q3.m87165m();
                            Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q3, modifierM66724m17);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(interfaceC4339a);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1114, c23010xM66775a1113);
                            AbstractC28683x.m87239G(c28655q3, c0209i1115, interfaceC28653p1M87165m111118);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i1116, modifierM118962N111118);
                            Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, c2314t9);
                            AbstractC6721d.a aVar17 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                            if (i26 == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            Object objM87133R1116 = c28655q3.m87133R();
                            obj8 = objM87133R1116;
                            if (z19) {
                                Object c9813i1112 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i1112);
                                obj8 = c9813i1112;
                            } else {
                                Object c9813i1113 = new C9813i(function15, 9);
                                c28655q3.m87172p0(c9813i1113);
                                obj8 = c9813i1113;
                            }
                            i29 = i26;
                            obj9 = obj;
                            function18 = function15;
                            AbstractC6719b.m20143d(modifierM3409f17, aVar17, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM34108a17 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51111110, 6);
                            c28655q2 = c28655q3;
                            C23010x c23010xM66775a1114 = AbstractC23007w.m66775a(c22957g17, c2305k17, c28655q2, 0);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q2.m87165m();
                            Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q2, modifierM34108a17);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i1114, c23010xM66775a1114);
                            AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m111119);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i1116, modifierM118962N111119);
                            float f119 = 8;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f119, c2314t9));
                            i34 = 0;
                            m31877L(viewState.getHeader(), c28655q2, 0);
                            C23010x c23010xM73381n17 = AbstractC25012a.m73381n(f119, 4, c2305k17, c28655q2, 6);
                            iHashCode4 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q2.m87165m();
                            Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q2, c2314t9);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i1114, c23010xM73381n17);
                            AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m1111110);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i1116, modifierM118962N1111110);
                            c28655q2.m87150e0(565095534);
                            while (r10.hasNext()) {
                                boolean zM87157i17 = c28655q2.m87157i(viewState);
                                if ((i28 & 112) == 32) {
                                    i35 = 1;
                                } else {
                                    i35 = i34;
                                }
                                int i51111111 = (zM87157i17 ? 1 : 0) | i35;
                                i36 = i27;
                                if (i36 == 256) {
                                    i37 = 1;
                                } else {
                                    i37 = i34;
                                }
                                int i51111112 = i51111111 | i37;
                                i29 = i29;
                                if (i29 == 16384) {
                                    i38 = 1;
                                } else {
                                    i38 = i34;
                                }
                                int i51111113 = i51111112 | i38;
                                i28 = i28;
                                if ((i28 & 7168) == 2048) {
                                    i39 = 1;
                                } else {
                                    i39 = 0;
                                }
                                i44 = i51111113 | i39;
                                objM87133R6 = c28655q2.m87133R();
                                if (i44 != 0) {
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj10 = obj9;
                                    if (objM87133R6 == obj10) {
                                        obj9 = obj10;
                                        interfaceC28601c3 = interfaceC28601c2;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                        c28655q2.m87172p0(c1008b);
                                    } else {
                                        obj9 = obj10;
                                        c1008b = objM87133R6;
                                        function19 = function12;
                                        function20 = function18;
                                        function21 = function17;
                                        i45 = 0;
                                        interfaceC28601c3 = interfaceC28601c2;
                                    }
                                }
                                AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                                function12 = function19;
                                function17 = function21;
                                function18 = function20;
                                interfaceC28601c2 = interfaceC28601c3;
                                i27 = i36;
                                i34 = i45;
                            }
                            function9 = function12;
                            function10 = function17;
                            c28655q2.m87173q(i34);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t9, 0.0f, 0.0f, 0.0f, 2 * f119, 7));
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            function8 = function18;
                            function11 = function16;
                            c28655q = c28655q2;
                        } else {
                            function17 = function13;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        C0209i c0209i1117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i1117, modifierM118962N111117);
                        Modifier modifierM3411h18 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t9));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h111111118 = new C11473h(19);
                            c28655q3.m87172p0(c11473h111111118);
                            obj5 = c11473h111111118;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b1115 = AbstractC15676d.m44099b(modifierM3411h18, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h111111119 = new C11473h(20);
                            c28655q3.m87172p0(c11473h111111119);
                            obj6 = c11473h111111119;
                        }
                        Modifier modifierM44099b1116 = AbstractC15676d.m44099b(modifierM44099b1115, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h1111111110 = new C11473h(21);
                            c28655q3.m87172p0(c11473h1111111110);
                            obj7 = c11473h1111111110;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b1116, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m18 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t9));
                        C22957g c22957g18 = AbstractC22977m.f90652c;
                        C2305k c2305k18 = C2299e.f9110M;
                        C23010x c23010xM66775a1115 = AbstractC23007w.m66775a(c22957g18, c2305k18, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q3.m87165m();
                        Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q3, modifierM66724m18);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1114, c23010xM66775a1115);
                        AbstractC28683x.m87239G(c28655q3, c0209i1115, interfaceC28653p1M87165m1111111);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1117, modifierM118962N1111111);
                        Modifier modifierM3409f18 = AbstractC1102d.m3409f(1.0f, c2314t9);
                        AbstractC6721d.a aVar18 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R1117 = c28655q3.m87133R();
                        obj8 = objM87133R1117;
                        if (z19) {
                            Object c9813i1114 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i1114);
                            obj8 = c9813i1114;
                        } else {
                            Object c9813i1115 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i1115);
                            obj8 = c9813i1115;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f18, aVar18, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a18 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51111110, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a1116 = AbstractC23007w.m66775a(c22957g18, c2305k18, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q2.m87165m();
                        Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q2, modifierM34108a18);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1114, c23010xM66775a1116);
                        AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m1111112);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N1111112);
                        float f1110 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1110, c2314t9));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n18 = AbstractC25012a.m73381n(f1110, 4, c2305k18, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q2.m87165m();
                        Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q2, c2314t9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1114, c23010xM73381n18);
                        AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m1111113);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N1111113);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i18 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i51111114 = (zM87157i18 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i51111115 = i51111114 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i51111116 = i51111115 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i51111116 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t9, 0.0f, 0.0f, 0.0f, 2 * f1110, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        c28655q3.m87138X();
                        function8 = function4;
                        function9 = function5;
                        function10 = function6;
                        function11 = function7;
                        c28655q = c28655q3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                    }
                }
                i46 |= 24576;
                if ((i46 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i46 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i47 != 0) {
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == obj) {
                            obj14 = objM87133R10;
                            Object c11473h1111111111 = new C11473h(25);
                            c28655q3.m87172p0(c11473h1111111111);
                            obj14 = c11473h1111111111;
                        }
                        obj14 = objM87133R10;
                        function12 = (Function1) obj14;
                    } else {
                        function12 = function5;
                    }
                    if (i15 != 0) {
                        objM87133R9 = c28655q3.m87133R();
                        if (objM87133R9 == obj) {
                            obj13 = objM87133R9;
                            Object c11473h1111111112 = new C11473h(26);
                            c28655q3.m87172p0(c11473h1111111112);
                            obj13 = c11473h1111111112;
                        }
                        obj13 = objM87133R9;
                        function13 = (Function1) obj13;
                    } else {
                        function13 = function6;
                    }
                    if (i17 != 0) {
                        objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == obj) {
                            obj12 = objM87133R8;
                            Object c11473h1111111113 = new C11473h(17);
                            c28655q3.m87172p0(c11473h1111111113);
                            obj12 = c11473h1111111113;
                        }
                        obj12 = objM87133R8;
                        function14 = (Function1) obj12;
                    } else {
                        function14 = function7;
                    }
                    if (i19 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == obj) {
                            obj11 = objM87133R7;
                            Object c11473h1111111114 = new C11473h(18);
                            c28655q3.m87172p0(c11473h1111111114);
                            obj11 = c11473h1111111114;
                        }
                        obj11 = objM87133R7;
                        function15 = (Function1) obj11;
                    } else {
                        function15 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    obj2 = objM87133R;
                    if (objM87133R == obj) {
                        Object objM87272z10 = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87272z10);
                        obj2 = objM87272z10;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    C22383c.b bVarM31867B10 = m31867B(interfaceC28601c1);
                    objM87133R2 = c28655q3.m87133R();
                    obj3 = objM87133R2;
                    if (objM87133R2 == obj) {
                        Object c2192m10 = new C2192m(22, interfaceC28601c1);
                        c28655q3.m87172p0(c2192m10);
                        obj3 = c2192m10;
                    }
                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) obj3;
                    i25 = i46 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i26 = i46 & 57344;
                    if (i26 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R1118 = c28655q3.m87133R();
                    obj4 = objM87133R1118;
                    if (z15) {
                        Object c2777c18 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c18);
                        obj4 = c2777c18;
                    } else {
                        Object c2777c19 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c19);
                        obj4 = c2777c19;
                    }
                    int i4116 = TextResource.$stable;
                    int i4117 = C27256h.f109055z;
                    AbstractC22431f.m64651Z(bVarM31867B10, interfaceC4339a11, (Function1) obj4, c28655q3, i4116 | i4117 | i4117 | 48);
                    C2314t c2314t10 = C2314t.f9131w;
                    Modifier modifierM44028b9 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t10));
                    C13404j c13404jM8528f10 = viewState.getScreenContextMetadata();
                    int i51111117 = C13404j.f46947x << 3;
                    function16 = function14;
                    interfaceC28601c2 = interfaceC28601c1;
                    i27 = i25;
                    Modifier modifierM34129b10 = AbstractC12250f.m34129b(modifierM44028b9, c13404jM8528f10, false, c28655q3, i51111117, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q3.m87165m();
                    Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q3, modifierM34129b10);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i1118 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i1118, interfaceC39127r0M66763d10);
                    C0209i c0209i1119 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i1119, interfaceC28653p1M87165m1111114);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        function17 = function13;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i11110, modifierM118962N1111114);
                        Modifier modifierM3411h19 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t10));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h1111111115 = new C11473h(19);
                            c28655q3.m87172p0(c11473h1111111115);
                            obj5 = c11473h1111111115;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b1117 = AbstractC15676d.m44099b(modifierM3411h19, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h1111111116 = new C11473h(20);
                            c28655q3.m87172p0(c11473h1111111116);
                            obj6 = c11473h1111111116;
                        }
                        Modifier modifierM44099b1118 = AbstractC15676d.m44099b(modifierM44099b1117, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h1111111117 = new C11473h(21);
                            c28655q3.m87172p0(c11473h1111111117);
                            obj7 = c11473h1111111117;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b1118, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m19 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t10));
                        C22957g c22957g19 = AbstractC22977m.f90652c;
                        C2305k c2305k19 = C2299e.f9110M;
                        C23010x c23010xM66775a1117 = AbstractC23007w.m66775a(c22957g19, c2305k19, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111115 = c28655q3.m87165m();
                        Modifier modifierM118962N1111115 = AbstractC37056f.m118962N(c28655q3, modifierM66724m19);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1118, c23010xM66775a1117);
                        AbstractC28683x.m87239G(c28655q3, c0209i1119, interfaceC28653p1M87165m1111115);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11110, modifierM118962N1111115);
                        Modifier modifierM3409f19 = AbstractC1102d.m3409f(1.0f, c2314t10);
                        AbstractC6721d.a aVar19 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R1119 = c28655q3.m87133R();
                        obj8 = objM87133R1119;
                        if (z19) {
                            Object c9813i1116 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i1116);
                            obj8 = c9813i1116;
                        } else {
                            Object c9813i1117 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i1117);
                            obj8 = c9813i1117;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f19, aVar19, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a19 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51111117, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a1118 = AbstractC23007w.m66775a(c22957g19, c2305k19, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111116 = c28655q2.m87165m();
                        Modifier modifierM118962N1111116 = AbstractC37056f.m118962N(c28655q2, modifierM34108a19);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM66775a1118);
                        AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m1111116);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N1111116);
                        float f1111 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1111, c2314t10));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n19 = AbstractC25012a.m73381n(f1111, 4, c2305k19, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111117 = c28655q2.m87165m();
                        Modifier modifierM118962N1111117 = AbstractC37056f.m118962N(c28655q2, c2314t10);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM73381n19);
                        AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m1111117);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N1111117);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i19 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i51111118 = (zM87157i19 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i51111119 = i51111118 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i511111110 = i51111119 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i511111110 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t10, 0.0f, 0.0f, 0.0f, 2 * f1111, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        function17 = function13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i11111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i11111, modifierM118962N1111114);
                    Modifier modifierM3411h110 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t10));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h1111111118 = new C11473h(19);
                        c28655q3.m87172p0(c11473h1111111118);
                        obj5 = c11473h1111111118;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b1119 = AbstractC15676d.m44099b(modifierM3411h110, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h1111111119 = new C11473h(20);
                        c28655q3.m87172p0(c11473h1111111119);
                        obj6 = c11473h1111111119;
                    }
                    Modifier modifierM44099b11110 = AbstractC15676d.m44099b(modifierM44099b1119, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h11111111110 = new C11473h(21);
                        c28655q3.m87172p0(c11473h11111111110);
                        obj7 = c11473h11111111110;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b11110, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m110 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t10));
                    C22957g c22957g110 = AbstractC22977m.f90652c;
                    C2305k c2305k110 = C2299e.f9110M;
                    C23010x c23010xM66775a1119 = AbstractC23007w.m66775a(c22957g110, c2305k110, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111118 = c28655q3.m87165m();
                    Modifier modifierM118962N1111118 = AbstractC37056f.m118962N(c28655q3, modifierM66724m110);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1118, c23010xM66775a1119);
                    AbstractC28683x.m87239G(c28655q3, c0209i1119, interfaceC28653p1M87165m1111118);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11111, modifierM118962N1111118);
                    Modifier modifierM3409f110 = AbstractC1102d.m3409f(1.0f, c2314t10);
                    AbstractC6721d.a aVar110 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R11110 = c28655q3.m87133R();
                    obj8 = objM87133R11110;
                    if (z19) {
                        Object c9813i1118 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i1118);
                        obj8 = c9813i1118;
                    } else {
                        Object c9813i1119 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i1119);
                        obj8 = c9813i1119;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f110, aVar110, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a110 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51111117, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a11110 = AbstractC23007w.m66775a(c22957g110, c2305k110, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111119 = c28655q2.m87165m();
                    Modifier modifierM118962N1111119 = AbstractC37056f.m118962N(c28655q2, modifierM34108a110);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM66775a11110);
                    AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m1111119);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11111, modifierM118962N1111119);
                    float f1112 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1112, c2314t10));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n110 = AbstractC25012a.m73381n(f1112, 4, c2305k110, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111110 = c28655q2.m87165m();
                    Modifier modifierM118962N11111110 = AbstractC37056f.m118962N(c28655q2, c2314t10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM73381n110);
                    AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m11111110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11111, modifierM118962N11111110);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i110 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i511111111 = (zM87157i110 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i511111112 = i511111111 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i511111113 = i511111112 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i511111113 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t10, 0.0f, 0.0f, 0.0f, 2 * f1112, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    c28655q3.m87138X();
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                    function11 = function7;
                    c28655q = c28655q3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                }
            }
            i46 |= 3072;
            function7 = function3;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q3.m87157i(function4)) {
                        i24 = 16384;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i46 |= i24;
                }
                if ((i46 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i46 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i47 != 0) {
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == obj) {
                            obj14 = objM87133R10;
                            Object c11473h11111111111 = new C11473h(25);
                            c28655q3.m87172p0(c11473h11111111111);
                            obj14 = c11473h11111111111;
                        }
                        obj14 = objM87133R10;
                        function12 = (Function1) obj14;
                    } else {
                        function12 = function5;
                    }
                    if (i15 != 0) {
                        objM87133R9 = c28655q3.m87133R();
                        if (objM87133R9 == obj) {
                            obj13 = objM87133R9;
                            Object c11473h11111111112 = new C11473h(26);
                            c28655q3.m87172p0(c11473h11111111112);
                            obj13 = c11473h11111111112;
                        }
                        obj13 = objM87133R9;
                        function13 = (Function1) obj13;
                    } else {
                        function13 = function6;
                    }
                    if (i17 != 0) {
                        objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == obj) {
                            obj12 = objM87133R8;
                            Object c11473h11111111113 = new C11473h(17);
                            c28655q3.m87172p0(c11473h11111111113);
                            obj12 = c11473h11111111113;
                        }
                        obj12 = objM87133R8;
                        function14 = (Function1) obj12;
                    } else {
                        function14 = function7;
                    }
                    if (i19 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == obj) {
                            obj11 = objM87133R7;
                            Object c11473h11111111114 = new C11473h(18);
                            c28655q3.m87172p0(c11473h11111111114);
                            obj11 = c11473h11111111114;
                        }
                        obj11 = objM87133R7;
                        function15 = (Function1) obj11;
                    } else {
                        function15 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    obj2 = objM87133R;
                    if (objM87133R == obj) {
                        Object objM87272z11 = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87272z11);
                        obj2 = objM87272z11;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    C22383c.b bVarM31867B11 = m31867B(interfaceC28601c1);
                    objM87133R2 = c28655q3.m87133R();
                    obj3 = objM87133R2;
                    if (objM87133R2 == obj) {
                        Object c2192m11 = new C2192m(22, interfaceC28601c1);
                        c28655q3.m87172p0(c2192m11);
                        obj3 = c2192m11;
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) obj3;
                    i25 = i46 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i26 = i46 & 57344;
                    if (i26 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R11111 = c28655q3.m87133R();
                    obj4 = objM87133R11111;
                    if (z15) {
                        Object c2777c110 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c110);
                        obj4 = c2777c110;
                    } else {
                        Object c2777c111 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c111);
                        obj4 = c2777c111;
                    }
                    int i4118 = TextResource.$stable;
                    int i4119 = C27256h.f109055z;
                    AbstractC22431f.m64651Z(bVarM31867B11, interfaceC4339a12, (Function1) obj4, c28655q3, i4118 | i4119 | i4119 | 48);
                    C2314t c2314t11 = C2314t.f9131w;
                    Modifier modifierM44028b10 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t11));
                    C13404j c13404jM8528f11 = viewState.getScreenContextMetadata();
                    int i511111114 = C13404j.f46947x << 3;
                    function16 = function14;
                    interfaceC28601c2 = interfaceC28601c1;
                    i27 = i25;
                    Modifier modifierM34129b11 = AbstractC12250f.m34129b(modifierM44028b10, c13404jM8528f11, false, c28655q3, i511111114, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111 = c28655q3.m87165m();
                    Modifier modifierM118962N11111111 = AbstractC37056f.m118962N(c28655q3, modifierM34129b11);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i11112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i11112, interfaceC39127r0M66763d11);
                    C0209i c0209i11113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i11113, interfaceC28653p1M87165m11111111);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        function17 = function13;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i11114, modifierM118962N11111111);
                        Modifier modifierM3411h111 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t11));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h11111111115 = new C11473h(19);
                            c28655q3.m87172p0(c11473h11111111115);
                            obj5 = c11473h11111111115;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b11111 = AbstractC15676d.m44099b(modifierM3411h111, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h11111111116 = new C11473h(20);
                            c28655q3.m87172p0(c11473h11111111116);
                            obj6 = c11473h11111111116;
                        }
                        Modifier modifierM44099b11112 = AbstractC15676d.m44099b(modifierM44099b11111, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h11111111117 = new C11473h(21);
                            c28655q3.m87172p0(c11473h11111111117);
                            obj7 = c11473h11111111117;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b11112, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m111 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t11));
                        C22957g c22957g111 = AbstractC22977m.f90652c;
                        C2305k c2305k111 = C2299e.f9110M;
                        C23010x c23010xM66775a11111 = AbstractC23007w.m66775a(c22957g111, c2305k111, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111112 = c28655q3.m87165m();
                        Modifier modifierM118962N11111112 = AbstractC37056f.m118962N(c28655q3, modifierM66724m111);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11112, c23010xM66775a11111);
                        AbstractC28683x.m87239G(c28655q3, c0209i11113, interfaceC28653p1M87165m11111112);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i11114, modifierM118962N11111112);
                        Modifier modifierM3409f111 = AbstractC1102d.m3409f(1.0f, c2314t11);
                        AbstractC6721d.a aVar111 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R11112 = c28655q3.m87133R();
                        obj8 = objM87133R11112;
                        if (z19) {
                            Object c9813i11110 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i11110);
                            obj8 = c9813i11110;
                        } else {
                            Object c9813i11111 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i11111);
                            obj8 = c9813i11111;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f111, aVar111, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a111 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511111114, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a11112 = AbstractC23007w.m66775a(c22957g111, c2305k111, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111113 = c28655q2.m87165m();
                        Modifier modifierM118962N11111113 = AbstractC37056f.m118962N(c28655q2, modifierM34108a111);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11112, c23010xM66775a11112);
                        AbstractC28683x.m87239G(c28655q2, c0209i11113, interfaceC28653p1M87165m11111113);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11114, modifierM118962N11111113);
                        float f1113 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1113, c2314t11));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n111 = AbstractC25012a.m73381n(f1113, 4, c2305k111, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111114 = c28655q2.m87165m();
                        Modifier modifierM118962N11111114 = AbstractC37056f.m118962N(c28655q2, c2314t11);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11112, c23010xM73381n111);
                        AbstractC28683x.m87239G(c28655q2, c0209i11113, interfaceC28653p1M87165m11111114);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11114, modifierM118962N11111114);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i111 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i511111115 = (zM87157i111 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i511111116 = i511111115 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i511111117 = i511111116 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i511111117 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t11, 0.0f, 0.0f, 0.0f, 2 * f1113, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        function17 = function13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i11115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i11115, modifierM118962N11111111);
                    Modifier modifierM3411h112 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t11));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h11111111118 = new C11473h(19);
                        c28655q3.m87172p0(c11473h11111111118);
                        obj5 = c11473h11111111118;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b11113 = AbstractC15676d.m44099b(modifierM3411h112, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h11111111119 = new C11473h(20);
                        c28655q3.m87172p0(c11473h11111111119);
                        obj6 = c11473h11111111119;
                    }
                    Modifier modifierM44099b11114 = AbstractC15676d.m44099b(modifierM44099b11113, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h111111111110 = new C11473h(21);
                        c28655q3.m87172p0(c11473h111111111110);
                        obj7 = c11473h111111111110;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b11114, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m112 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t11));
                    C22957g c22957g112 = AbstractC22977m.f90652c;
                    C2305k c2305k112 = C2299e.f9110M;
                    C23010x c23010xM66775a11113 = AbstractC23007w.m66775a(c22957g112, c2305k112, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111115 = c28655q3.m87165m();
                    Modifier modifierM118962N11111115 = AbstractC37056f.m118962N(c28655q3, modifierM66724m112);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11112, c23010xM66775a11113);
                    AbstractC28683x.m87239G(c28655q3, c0209i11113, interfaceC28653p1M87165m11111115);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11115, modifierM118962N11111115);
                    Modifier modifierM3409f112 = AbstractC1102d.m3409f(1.0f, c2314t11);
                    AbstractC6721d.a aVar112 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R11113 = c28655q3.m87133R();
                    obj8 = objM87133R11113;
                    if (z19) {
                        Object c9813i11112 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i11112);
                        obj8 = c9813i11112;
                    } else {
                        Object c9813i11113 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i11113);
                        obj8 = c9813i11113;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f112, aVar112, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a112 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511111114, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a11114 = AbstractC23007w.m66775a(c22957g112, c2305k112, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111116 = c28655q2.m87165m();
                    Modifier modifierM118962N11111116 = AbstractC37056f.m118962N(c28655q2, modifierM34108a112);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11112, c23010xM66775a11114);
                    AbstractC28683x.m87239G(c28655q2, c0209i11113, interfaceC28653p1M87165m11111116);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11115, modifierM118962N11111116);
                    float f1114 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1114, c2314t11));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n112 = AbstractC25012a.m73381n(f1114, 4, c2305k112, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111117 = c28655q2.m87165m();
                    Modifier modifierM118962N11111117 = AbstractC37056f.m118962N(c28655q2, c2314t11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11112, c23010xM73381n112);
                    AbstractC28683x.m87239G(c28655q2, c0209i11113, interfaceC28653p1M87165m11111117);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11115, modifierM118962N11111117);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i112 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i511111118 = (zM87157i112 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i511111119 = i511111118 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i5111111110 = i511111119 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i5111111110 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t11, 0.0f, 0.0f, 0.0f, 2 * f1114, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    c28655q3.m87138X();
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                    function11 = function7;
                    c28655q = c28655q3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                }
            }
            i46 |= 24576;
            if ((i46 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i46 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i47 != 0) {
                    objM87133R10 = c28655q3.m87133R();
                    if (objM87133R10 == obj) {
                        obj14 = objM87133R10;
                        Object c11473h111111111111 = new C11473h(25);
                        c28655q3.m87172p0(c11473h111111111111);
                        obj14 = c11473h111111111111;
                    }
                    obj14 = objM87133R10;
                    function12 = (Function1) obj14;
                } else {
                    function12 = function5;
                }
                if (i15 != 0) {
                    objM87133R9 = c28655q3.m87133R();
                    if (objM87133R9 == obj) {
                        obj13 = objM87133R9;
                        Object c11473h111111111112 = new C11473h(26);
                        c28655q3.m87172p0(c11473h111111111112);
                        obj13 = c11473h111111111112;
                    }
                    obj13 = objM87133R9;
                    function13 = (Function1) obj13;
                } else {
                    function13 = function6;
                }
                if (i17 != 0) {
                    objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == obj) {
                        obj12 = objM87133R8;
                        Object c11473h111111111113 = new C11473h(17);
                        c28655q3.m87172p0(c11473h111111111113);
                        obj12 = c11473h111111111113;
                    }
                    obj12 = objM87133R8;
                    function14 = (Function1) obj12;
                } else {
                    function14 = function7;
                }
                if (i19 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == obj) {
                        obj11 = objM87133R7;
                        Object c11473h111111111114 = new C11473h(18);
                        c28655q3.m87172p0(c11473h111111111114);
                        obj11 = c11473h111111111114;
                    }
                    obj11 = objM87133R7;
                    function15 = (Function1) obj11;
                } else {
                    function15 = function4;
                }
                objM87133R = c28655q3.m87133R();
                obj2 = objM87133R;
                if (objM87133R == obj) {
                    Object objM87272z12 = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87272z12);
                    obj2 = objM87272z12;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                C22383c.b bVarM31867B12 = m31867B(interfaceC28601c1);
                objM87133R2 = c28655q3.m87133R();
                obj3 = objM87133R2;
                if (objM87133R2 == obj) {
                    Object c2192m12 = new C2192m(22, interfaceC28601c1);
                    c28655q3.m87172p0(c2192m12);
                    obj3 = c2192m12;
                }
                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) obj3;
                i25 = i46 & 896;
                if (i25 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i26 = i46 & 57344;
                if (i26 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                Object objM87133R11114 = c28655q3.m87133R();
                obj4 = objM87133R11114;
                if (z15) {
                    Object c2777c112 = new C2777c(function13, 3, function15);
                    c28655q3.m87172p0(c2777c112);
                    obj4 = c2777c112;
                } else {
                    Object c2777c113 = new C2777c(function13, 3, function15);
                    c28655q3.m87172p0(c2777c113);
                    obj4 = c2777c113;
                }
                int i41110 = TextResource.$stable;
                int i41111 = C27256h.f109055z;
                AbstractC22431f.m64651Z(bVarM31867B12, interfaceC4339a13, (Function1) obj4, c28655q3, i41110 | i41111 | i41111 | 48);
                C2314t c2314t12 = C2314t.f9131w;
                Modifier modifierM44028b11 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t12));
                C13404j c13404jM8528f12 = viewState.getScreenContextMetadata();
                int i5111111111 = C13404j.f46947x << 3;
                function16 = function14;
                interfaceC28601c2 = interfaceC28601c1;
                i27 = i25;
                Modifier modifierM34129b12 = AbstractC12250f.m34129b(modifierM44028b11, c13404jM8528f12, false, c28655q3, i5111111111, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111118 = c28655q3.m87165m();
                Modifier modifierM118962N11111118 = AbstractC37056f.m118962N(c28655q3, modifierM34129b12);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i11116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i11116, interfaceC39127r0M66763d12);
                C0209i c0209i11117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i11117, interfaceC28653p1M87165m11111118);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    function17 = function13;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i11118, modifierM118962N11111118);
                    Modifier modifierM3411h113 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t12));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h111111111115 = new C11473h(19);
                        c28655q3.m87172p0(c11473h111111111115);
                        obj5 = c11473h111111111115;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b11115 = AbstractC15676d.m44099b(modifierM3411h113, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h111111111116 = new C11473h(20);
                        c28655q3.m87172p0(c11473h111111111116);
                        obj6 = c11473h111111111116;
                    }
                    Modifier modifierM44099b11116 = AbstractC15676d.m44099b(modifierM44099b11115, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h111111111117 = new C11473h(21);
                        c28655q3.m87172p0(c11473h111111111117);
                        obj7 = c11473h111111111117;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b11116, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m113 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t12));
                    C22957g c22957g113 = AbstractC22977m.f90652c;
                    C2305k c2305k113 = C2299e.f9110M;
                    C23010x c23010xM66775a11115 = AbstractC23007w.m66775a(c22957g113, c2305k113, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111119 = c28655q3.m87165m();
                    Modifier modifierM118962N11111119 = AbstractC37056f.m118962N(c28655q3, modifierM66724m113);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11116, c23010xM66775a11115);
                    AbstractC28683x.m87239G(c28655q3, c0209i11117, interfaceC28653p1M87165m11111119);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11118, modifierM118962N11111119);
                    Modifier modifierM3409f113 = AbstractC1102d.m3409f(1.0f, c2314t12);
                    AbstractC6721d.a aVar113 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R11115 = c28655q3.m87133R();
                    obj8 = objM87133R11115;
                    if (z19) {
                        Object c9813i11114 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i11114);
                        obj8 = c9813i11114;
                    } else {
                        Object c9813i11115 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i11115);
                        obj8 = c9813i11115;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f113, aVar113, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a113 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i5111111111, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a11116 = AbstractC23007w.m66775a(c22957g113, c2305k113, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111110 = c28655q2.m87165m();
                    Modifier modifierM118962N111111110 = AbstractC37056f.m118962N(c28655q2, modifierM34108a113);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11116, c23010xM66775a11116);
                    AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC28653p1M87165m111111110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11118, modifierM118962N111111110);
                    float f1115 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1115, c2314t12));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n113 = AbstractC25012a.m73381n(f1115, 4, c2305k113, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111111 = c28655q2.m87165m();
                    Modifier modifierM118962N111111111 = AbstractC37056f.m118962N(c28655q2, c2314t12);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11116, c23010xM73381n113);
                    AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC28653p1M87165m111111111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11118, modifierM118962N111111111);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i113 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i5111111112 = (zM87157i113 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i5111111113 = i5111111112 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i5111111114 = i5111111113 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i5111111114 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t12, 0.0f, 0.0f, 0.0f, 2 * f1115, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    function17 = function13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i11119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i11119, modifierM118962N11111118);
                Modifier modifierM3411h114 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t12));
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == obj) {
                    Object c11473h111111111118 = new C11473h(19);
                    c28655q3.m87172p0(c11473h111111111118);
                    obj5 = c11473h111111111118;
                } else {
                    obj5 = objM87133R3;
                }
                Modifier modifierM44099b11117 = AbstractC15676d.m44099b(modifierM3411h114, z16, (Function1) obj5);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                obj6 = objM87133R4;
                if (objM87133R4 == obj) {
                    Object c11473h111111111119 = new C11473h(20);
                    c28655q3.m87172p0(c11473h111111111119);
                    obj6 = c11473h111111111119;
                }
                Modifier modifierM44099b11118 = AbstractC15676d.m44099b(modifierM44099b11117, z17, (Function1) obj6);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R5 = c28655q3.m87133R();
                obj7 = objM87133R5;
                if (objM87133R5 == obj) {
                    Object c11473h1111111111110 = new C11473h(21);
                    c28655q3.m87172p0(c11473h1111111111110);
                    obj7 = c11473h1111111111110;
                }
                AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b11118, z18, (Function1) obj7), c28655q3, 0);
                Modifier modifierM66724m114 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t12));
                C22957g c22957g114 = AbstractC22977m.f90652c;
                C2305k c2305k114 = C2299e.f9110M;
                C23010x c23010xM66775a11117 = AbstractC23007w.m66775a(c22957g114, c2305k114, c28655q3, 0);
                i28 = i46;
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111112 = c28655q3.m87165m();
                Modifier modifierM118962N111111112 = AbstractC37056f.m118962N(c28655q3, modifierM66724m114);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11116, c23010xM66775a11117);
                AbstractC28683x.m87239G(c28655q3, c0209i11117, interfaceC28653p1M87165m111111112);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11119, modifierM118962N111111112);
                Modifier modifierM3409f114 = AbstractC1102d.m3409f(1.0f, c2314t12);
                AbstractC6721d.a aVar114 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if (i26 == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                Object objM87133R11116 = c28655q3.m87133R();
                obj8 = objM87133R11116;
                if (z19) {
                    Object c9813i11116 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i11116);
                    obj8 = c9813i11116;
                } else {
                    Object c9813i11117 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i11117);
                    obj8 = c9813i11117;
                }
                i29 = i26;
                obj9 = obj;
                function18 = function15;
                AbstractC6719b.m20143d(modifierM3409f114, aVar114, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM34108a114 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i5111111111, 6);
                c28655q2 = c28655q3;
                C23010x c23010xM66775a11118 = AbstractC23007w.m66775a(c22957g114, c2305k114, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111113 = c28655q2.m87165m();
                Modifier modifierM118962N111111113 = AbstractC37056f.m118962N(c28655q2, modifierM34108a114);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11116, c23010xM66775a11118);
                AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC28653p1M87165m111111113);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11119, modifierM118962N111111113);
                float f1116 = 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1116, c2314t12));
                i34 = 0;
                m31877L(viewState.getHeader(), c28655q2, 0);
                C23010x c23010xM73381n114 = AbstractC25012a.m73381n(f1116, 4, c2305k114, c28655q2, 6);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111114 = c28655q2.m87165m();
                Modifier modifierM118962N111111114 = AbstractC37056f.m118962N(c28655q2, c2314t12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11116, c23010xM73381n114);
                AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC28653p1M87165m111111114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11119, modifierM118962N111111114);
                c28655q2.m87150e0(565095534);
                while (r10.hasNext()) {
                    boolean zM87157i114 = c28655q2.m87157i(viewState);
                    if ((i28 & 112) == 32) {
                        i35 = 1;
                    } else {
                        i35 = i34;
                    }
                    int i5111111115 = (zM87157i114 ? 1 : 0) | i35;
                    i36 = i27;
                    if (i36 == 256) {
                        i37 = 1;
                    } else {
                        i37 = i34;
                    }
                    int i5111111116 = i5111111115 | i37;
                    i29 = i29;
                    if (i29 == 16384) {
                        i38 = 1;
                    } else {
                        i38 = i34;
                    }
                    int i5111111117 = i5111111116 | i38;
                    i28 = i28;
                    if ((i28 & 7168) == 2048) {
                        i39 = 1;
                    } else {
                        i39 = 0;
                    }
                    i44 = i5111111117 | i39;
                    objM87133R6 = c28655q2.m87133R();
                    if (i44 != 0) {
                        interfaceC28601c3 = interfaceC28601c2;
                        function19 = function12;
                        function20 = function18;
                        function21 = function17;
                        i45 = 0;
                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                        c28655q2.m87172p0(c1008b);
                    } else {
                        obj10 = obj9;
                        if (objM87133R6 == obj10) {
                            obj9 = obj10;
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj9 = obj10;
                            c1008b = objM87133R6;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            interfaceC28601c3 = interfaceC28601c2;
                        }
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                    function12 = function19;
                    function17 = function21;
                    function18 = function20;
                    interfaceC28601c2 = interfaceC28601c3;
                    i27 = i36;
                    i34 = i45;
                }
                function9 = function12;
                function10 = function17;
                c28655q2.m87173q(i34);
                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t12, 0.0f, 0.0f, 0.0f, 2 * f1116, 7));
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function8 = function18;
                function11 = function16;
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                function8 = function4;
                function9 = function5;
                function10 = function6;
                function11 = function7;
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
            }
        }
        i46 |= 384;
        function6 = function2;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                function7 = function3;
                if (c28655q3.m87157i(function7)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i46 |= i18;
            }
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q3.m87157i(function4)) {
                        i24 = 16384;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i46 |= i24;
                }
                if ((i46 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i46 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i47 != 0) {
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == obj) {
                            obj14 = objM87133R10;
                            Object c11473h1111111111111 = new C11473h(25);
                            c28655q3.m87172p0(c11473h1111111111111);
                            obj14 = c11473h1111111111111;
                        }
                        obj14 = objM87133R10;
                        function12 = (Function1) obj14;
                    } else {
                        function12 = function5;
                    }
                    if (i15 != 0) {
                        objM87133R9 = c28655q3.m87133R();
                        if (objM87133R9 == obj) {
                            obj13 = objM87133R9;
                            Object c11473h1111111111112 = new C11473h(26);
                            c28655q3.m87172p0(c11473h1111111111112);
                            obj13 = c11473h1111111111112;
                        }
                        obj13 = objM87133R9;
                        function13 = (Function1) obj13;
                    } else {
                        function13 = function6;
                    }
                    if (i17 != 0) {
                        objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == obj) {
                            obj12 = objM87133R8;
                            Object c11473h1111111111113 = new C11473h(17);
                            c28655q3.m87172p0(c11473h1111111111113);
                            obj12 = c11473h1111111111113;
                        }
                        obj12 = objM87133R8;
                        function14 = (Function1) obj12;
                    } else {
                        function14 = function7;
                    }
                    if (i19 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == obj) {
                            obj11 = objM87133R7;
                            Object c11473h1111111111114 = new C11473h(18);
                            c28655q3.m87172p0(c11473h1111111111114);
                            obj11 = c11473h1111111111114;
                        }
                        obj11 = objM87133R7;
                        function15 = (Function1) obj11;
                    } else {
                        function15 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    obj2 = objM87133R;
                    if (objM87133R == obj) {
                        Object objM87272z13 = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87272z13);
                        obj2 = objM87272z13;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) obj2;
                    C22383c.b bVarM31867B13 = m31867B(interfaceC28601c1);
                    objM87133R2 = c28655q3.m87133R();
                    obj3 = objM87133R2;
                    if (objM87133R2 == obj) {
                        Object c2192m13 = new C2192m(22, interfaceC28601c1);
                        c28655q3.m87172p0(c2192m13);
                        obj3 = c2192m13;
                    }
                    InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) obj3;
                    i25 = i46 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i26 = i46 & 57344;
                    if (i26 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R11117 = c28655q3.m87133R();
                    obj4 = objM87133R11117;
                    if (z15) {
                        Object c2777c114 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c114);
                        obj4 = c2777c114;
                    } else {
                        Object c2777c115 = new C2777c(function13, 3, function15);
                        c28655q3.m87172p0(c2777c115);
                        obj4 = c2777c115;
                    }
                    int i41112 = TextResource.$stable;
                    int i41113 = C27256h.f109055z;
                    AbstractC22431f.m64651Z(bVarM31867B13, interfaceC4339a14, (Function1) obj4, c28655q3, i41112 | i41113 | i41113 | 48);
                    C2314t c2314t13 = C2314t.f9131w;
                    Modifier modifierM44028b12 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t13));
                    C13404j c13404jM8528f13 = viewState.getScreenContextMetadata();
                    int i5111111118 = C13404j.f46947x << 3;
                    function16 = function14;
                    interfaceC28601c2 = interfaceC28601c1;
                    i27 = i25;
                    Modifier modifierM34129b13 = AbstractC12250f.m34129b(modifierM44028b12, c13404jM8528f13, false, c28655q3, i5111111118, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111115 = c28655q3.m87165m();
                    Modifier modifierM118962N111111115 = AbstractC37056f.m118962N(c28655q3, modifierM34129b13);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i111110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i111110, interfaceC39127r0M66763d13);
                    C0209i c0209i111111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i111111, interfaceC28653p1M87165m111111115);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        function17 = function13;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111112 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i111112, modifierM118962N111111115);
                        Modifier modifierM3411h115 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t13));
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == obj) {
                            Object c11473h1111111111115 = new C11473h(19);
                            c28655q3.m87172p0(c11473h1111111111115);
                            obj5 = c11473h1111111111115;
                        } else {
                            obj5 = objM87133R3;
                        }
                        Modifier modifierM44099b11119 = AbstractC15676d.m44099b(modifierM3411h115, z16, (Function1) obj5);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        obj6 = objM87133R4;
                        if (objM87133R4 == obj) {
                            Object c11473h1111111111116 = new C11473h(20);
                            c28655q3.m87172p0(c11473h1111111111116);
                            obj6 = c11473h1111111111116;
                        }
                        Modifier modifierM44099b111110 = AbstractC15676d.m44099b(modifierM44099b11119, z17, (Function1) obj6);
                        if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        obj7 = objM87133R5;
                        if (objM87133R5 == obj) {
                            Object c11473h1111111111117 = new C11473h(21);
                            c28655q3.m87172p0(c11473h1111111111117);
                            obj7 = c11473h1111111111117;
                        }
                        AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b111110, z18, (Function1) obj7), c28655q3, 0);
                        Modifier modifierM66724m115 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t13));
                        C22957g c22957g115 = AbstractC22977m.f90652c;
                        C2305k c2305k115 = C2299e.f9110M;
                        C23010x c23010xM66775a11119 = AbstractC23007w.m66775a(c22957g115, c2305k115, c28655q3, 0);
                        i28 = i46;
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111116 = c28655q3.m87165m();
                        Modifier modifierM118962N111111116 = AbstractC37056f.m118962N(c28655q3, modifierM66724m115);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(interfaceC4339a);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111110, c23010xM66775a11119);
                        AbstractC28683x.m87239G(c28655q3, c0209i111111, interfaceC28653p1M87165m111111116);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i111112, modifierM118962N111111116);
                        Modifier modifierM3409f115 = AbstractC1102d.m3409f(1.0f, c2314t13);
                        AbstractC6721d.a aVar115 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i26 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        Object objM87133R11118 = c28655q3.m87133R();
                        obj8 = objM87133R11118;
                        if (z19) {
                            Object c9813i11118 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i11118);
                            obj8 = c9813i11118;
                        } else {
                            Object c9813i11119 = new C9813i(function15, 9);
                            c28655q3.m87172p0(c9813i11119);
                            obj8 = c9813i11119;
                        }
                        i29 = i26;
                        obj9 = obj;
                        function18 = function15;
                        AbstractC6719b.m20143d(modifierM3409f115, aVar115, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM34108a115 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i5111111118, 6);
                        c28655q2 = c28655q3;
                        C23010x c23010xM66775a111110 = AbstractC23007w.m66775a(c22957g115, c2305k115, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111117 = c28655q2.m87165m();
                        Modifier modifierM118962N111111117 = AbstractC37056f.m118962N(c28655q2, modifierM34108a115);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111110, c23010xM66775a111110);
                        AbstractC28683x.m87239G(c28655q2, c0209i111111, interfaceC28653p1M87165m111111117);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111112, modifierM118962N111111117);
                        float f1117 = 8;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1117, c2314t13));
                        i34 = 0;
                        m31877L(viewState.getHeader(), c28655q2, 0);
                        C23010x c23010xM73381n115 = AbstractC25012a.m73381n(f1117, 4, c2305k115, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111118 = c28655q2.m87165m();
                        Modifier modifierM118962N111111118 = AbstractC37056f.m118962N(c28655q2, c2314t13);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111110, c23010xM73381n115);
                        AbstractC28683x.m87239G(c28655q2, c0209i111111, interfaceC28653p1M87165m111111118);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111112, modifierM118962N111111118);
                        c28655q2.m87150e0(565095534);
                        while (r10.hasNext()) {
                            boolean zM87157i115 = c28655q2.m87157i(viewState);
                            if ((i28 & 112) == 32) {
                                i35 = 1;
                            } else {
                                i35 = i34;
                            }
                            int i5111111119 = (zM87157i115 ? 1 : 0) | i35;
                            i36 = i27;
                            if (i36 == 256) {
                                i37 = 1;
                            } else {
                                i37 = i34;
                            }
                            int i51111111110 = i5111111119 | i37;
                            i29 = i29;
                            if (i29 == 16384) {
                                i38 = 1;
                            } else {
                                i38 = i34;
                            }
                            int i51111111111 = i51111111110 | i38;
                            i28 = i28;
                            if ((i28 & 7168) == 2048) {
                                i39 = 1;
                            } else {
                                i39 = 0;
                            }
                            i44 = i51111111111 | i39;
                            objM87133R6 = c28655q2.m87133R();
                            if (i44 != 0) {
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj10 = obj9;
                                if (objM87133R6 == obj10) {
                                    obj9 = obj10;
                                    interfaceC28601c3 = interfaceC28601c2;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                    c28655q2.m87172p0(c1008b);
                                } else {
                                    obj9 = obj10;
                                    c1008b = objM87133R6;
                                    function19 = function12;
                                    function20 = function18;
                                    function21 = function17;
                                    i45 = 0;
                                    interfaceC28601c3 = interfaceC28601c2;
                                }
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                            function12 = function19;
                            function17 = function21;
                            function18 = function20;
                            interfaceC28601c2 = interfaceC28601c3;
                            i27 = i36;
                            i34 = i45;
                        }
                        function9 = function12;
                        function10 = function17;
                        c28655q2.m87173q(i34);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t13, 0.0f, 0.0f, 0.0f, 2 * f1117, 7));
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function8 = function18;
                        function11 = function16;
                        c28655q = c28655q2;
                    } else {
                        function17 = function13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i111113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i111113, modifierM118962N111111115);
                    Modifier modifierM3411h116 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t13));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h1111111111118 = new C11473h(19);
                        c28655q3.m87172p0(c11473h1111111111118);
                        obj5 = c11473h1111111111118;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b111111 = AbstractC15676d.m44099b(modifierM3411h116, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h1111111111119 = new C11473h(20);
                        c28655q3.m87172p0(c11473h1111111111119);
                        obj6 = c11473h1111111111119;
                    }
                    Modifier modifierM44099b111112 = AbstractC15676d.m44099b(modifierM44099b111111, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h11111111111110 = new C11473h(21);
                        c28655q3.m87172p0(c11473h11111111111110);
                        obj7 = c11473h11111111111110;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b111112, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m116 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t13));
                    C22957g c22957g116 = AbstractC22977m.f90652c;
                    C2305k c2305k116 = C2299e.f9110M;
                    C23010x c23010xM66775a111111 = AbstractC23007w.m66775a(c22957g116, c2305k116, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111119 = c28655q3.m87165m();
                    Modifier modifierM118962N111111119 = AbstractC37056f.m118962N(c28655q3, modifierM66724m116);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111110, c23010xM66775a111111);
                    AbstractC28683x.m87239G(c28655q3, c0209i111111, interfaceC28653p1M87165m111111119);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111113, modifierM118962N111111119);
                    Modifier modifierM3409f116 = AbstractC1102d.m3409f(1.0f, c2314t13);
                    AbstractC6721d.a aVar116 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R11119 = c28655q3.m87133R();
                    obj8 = objM87133R11119;
                    if (z19) {
                        Object c9813i111110 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i111110);
                        obj8 = c9813i111110;
                    } else {
                        Object c9813i111111 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i111111);
                        obj8 = c9813i111111;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f116, aVar116, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a116 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i5111111118, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a111112 = AbstractC23007w.m66775a(c22957g116, c2305k116, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111110 = c28655q2.m87165m();
                    Modifier modifierM118962N1111111110 = AbstractC37056f.m118962N(c28655q2, modifierM34108a116);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111110, c23010xM66775a111112);
                    AbstractC28683x.m87239G(c28655q2, c0209i111111, interfaceC28653p1M87165m1111111110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111113, modifierM118962N1111111110);
                    float f1118 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1118, c2314t13));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n116 = AbstractC25012a.m73381n(f1118, 4, c2305k116, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111111 = c28655q2.m87165m();
                    Modifier modifierM118962N1111111111 = AbstractC37056f.m118962N(c28655q2, c2314t13);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111110, c23010xM73381n116);
                    AbstractC28683x.m87239G(c28655q2, c0209i111111, interfaceC28653p1M87165m1111111111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111113, modifierM118962N1111111111);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i116 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i51111111112 = (zM87157i116 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i51111111113 = i51111111112 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i51111111114 = i51111111113 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i51111111114 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t13, 0.0f, 0.0f, 0.0f, 2 * f1118, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    c28655q3.m87138X();
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                    function11 = function7;
                    c28655q = c28655q3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
                }
            }
            i46 |= 24576;
            if ((i46 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i46 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i47 != 0) {
                    objM87133R10 = c28655q3.m87133R();
                    if (objM87133R10 == obj) {
                        obj14 = objM87133R10;
                        Object c11473h11111111111111 = new C11473h(25);
                        c28655q3.m87172p0(c11473h11111111111111);
                        obj14 = c11473h11111111111111;
                    }
                    obj14 = objM87133R10;
                    function12 = (Function1) obj14;
                } else {
                    function12 = function5;
                }
                if (i15 != 0) {
                    objM87133R9 = c28655q3.m87133R();
                    if (objM87133R9 == obj) {
                        obj13 = objM87133R9;
                        Object c11473h11111111111112 = new C11473h(26);
                        c28655q3.m87172p0(c11473h11111111111112);
                        obj13 = c11473h11111111111112;
                    }
                    obj13 = objM87133R9;
                    function13 = (Function1) obj13;
                } else {
                    function13 = function6;
                }
                if (i17 != 0) {
                    objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == obj) {
                        obj12 = objM87133R8;
                        Object c11473h11111111111113 = new C11473h(17);
                        c28655q3.m87172p0(c11473h11111111111113);
                        obj12 = c11473h11111111111113;
                    }
                    obj12 = objM87133R8;
                    function14 = (Function1) obj12;
                } else {
                    function14 = function7;
                }
                if (i19 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == obj) {
                        obj11 = objM87133R7;
                        Object c11473h11111111111114 = new C11473h(18);
                        c28655q3.m87172p0(c11473h11111111111114);
                        obj11 = c11473h11111111111114;
                    }
                    obj11 = objM87133R7;
                    function15 = (Function1) obj11;
                } else {
                    function15 = function4;
                }
                objM87133R = c28655q3.m87133R();
                obj2 = objM87133R;
                if (objM87133R == obj) {
                    Object objM87272z14 = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87272z14);
                    obj2 = objM87272z14;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                C22383c.b bVarM31867B14 = m31867B(interfaceC28601c1);
                objM87133R2 = c28655q3.m87133R();
                obj3 = objM87133R2;
                if (objM87133R2 == obj) {
                    Object c2192m14 = new C2192m(22, interfaceC28601c1);
                    c28655q3.m87172p0(c2192m14);
                    obj3 = c2192m14;
                }
                InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) obj3;
                i25 = i46 & 896;
                if (i25 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i26 = i46 & 57344;
                if (i26 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                Object objM87133R111110 = c28655q3.m87133R();
                obj4 = objM87133R111110;
                if (z15) {
                    Object c2777c116 = new C2777c(function13, 3, function15);
                    c28655q3.m87172p0(c2777c116);
                    obj4 = c2777c116;
                } else {
                    Object c2777c117 = new C2777c(function13, 3, function15);
                    c28655q3.m87172p0(c2777c117);
                    obj4 = c2777c117;
                }
                int i41114 = TextResource.$stable;
                int i41115 = C27256h.f109055z;
                AbstractC22431f.m64651Z(bVarM31867B14, interfaceC4339a15, (Function1) obj4, c28655q3, i41114 | i41115 | i41115 | 48);
                C2314t c2314t14 = C2314t.f9131w;
                Modifier modifierM44028b13 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t14));
                C13404j c13404jM8528f14 = viewState.getScreenContextMetadata();
                int i51111111115 = C13404j.f46947x << 3;
                function16 = function14;
                interfaceC28601c2 = interfaceC28601c1;
                i27 = i25;
                Modifier modifierM34129b14 = AbstractC12250f.m34129b(modifierM44028b13, c13404jM8528f14, false, c28655q3, i51111111115, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111112 = c28655q3.m87165m();
                Modifier modifierM118962N1111111112 = AbstractC37056f.m118962N(c28655q3, modifierM34129b14);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i111114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i111114, interfaceC39127r0M66763d14);
                C0209i c0209i111115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i111115, interfaceC28653p1M87165m1111111112);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    function17 = function13;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i111116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i111116, modifierM118962N1111111112);
                    Modifier modifierM3411h117 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t14));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h11111111111115 = new C11473h(19);
                        c28655q3.m87172p0(c11473h11111111111115);
                        obj5 = c11473h11111111111115;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b111113 = AbstractC15676d.m44099b(modifierM3411h117, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h11111111111116 = new C11473h(20);
                        c28655q3.m87172p0(c11473h11111111111116);
                        obj6 = c11473h11111111111116;
                    }
                    Modifier modifierM44099b111114 = AbstractC15676d.m44099b(modifierM44099b111113, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h11111111111117 = new C11473h(21);
                        c28655q3.m87172p0(c11473h11111111111117);
                        obj7 = c11473h11111111111117;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b111114, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m117 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t14));
                    C22957g c22957g117 = AbstractC22977m.f90652c;
                    C2305k c2305k117 = C2299e.f9110M;
                    C23010x c23010xM66775a111113 = AbstractC23007w.m66775a(c22957g117, c2305k117, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111113 = c28655q3.m87165m();
                    Modifier modifierM118962N1111111113 = AbstractC37056f.m118962N(c28655q3, modifierM66724m117);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111114, c23010xM66775a111113);
                    AbstractC28683x.m87239G(c28655q3, c0209i111115, interfaceC28653p1M87165m1111111113);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111116, modifierM118962N1111111113);
                    Modifier modifierM3409f117 = AbstractC1102d.m3409f(1.0f, c2314t14);
                    AbstractC6721d.a aVar117 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R111111 = c28655q3.m87133R();
                    obj8 = objM87133R111111;
                    if (z19) {
                        Object c9813i111112 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i111112);
                        obj8 = c9813i111112;
                    } else {
                        Object c9813i111113 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i111113);
                        obj8 = c9813i111113;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f117, aVar117, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a117 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51111111115, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a111114 = AbstractC23007w.m66775a(c22957g117, c2305k117, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111114 = c28655q2.m87165m();
                    Modifier modifierM118962N1111111114 = AbstractC37056f.m118962N(c28655q2, modifierM34108a117);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111114, c23010xM66775a111114);
                    AbstractC28683x.m87239G(c28655q2, c0209i111115, interfaceC28653p1M87165m1111111114);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111116, modifierM118962N1111111114);
                    float f1119 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1119, c2314t14));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n117 = AbstractC25012a.m73381n(f1119, 4, c2305k117, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111115 = c28655q2.m87165m();
                    Modifier modifierM118962N1111111115 = AbstractC37056f.m118962N(c28655q2, c2314t14);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111114, c23010xM73381n117);
                    AbstractC28683x.m87239G(c28655q2, c0209i111115, interfaceC28653p1M87165m1111111115);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111116, modifierM118962N1111111115);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i117 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i51111111116 = (zM87157i117 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i51111111117 = i51111111116 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i51111111118 = i51111111117 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i51111111118 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t14, 0.0f, 0.0f, 0.0f, 2 * f1119, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    function17 = function13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i111117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i111117, modifierM118962N1111111112);
                Modifier modifierM3411h118 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t14));
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == obj) {
                    Object c11473h11111111111118 = new C11473h(19);
                    c28655q3.m87172p0(c11473h11111111111118);
                    obj5 = c11473h11111111111118;
                } else {
                    obj5 = objM87133R3;
                }
                Modifier modifierM44099b111115 = AbstractC15676d.m44099b(modifierM3411h118, z16, (Function1) obj5);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                obj6 = objM87133R4;
                if (objM87133R4 == obj) {
                    Object c11473h11111111111119 = new C11473h(20);
                    c28655q3.m87172p0(c11473h11111111111119);
                    obj6 = c11473h11111111111119;
                }
                Modifier modifierM44099b111116 = AbstractC15676d.m44099b(modifierM44099b111115, z17, (Function1) obj6);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R5 = c28655q3.m87133R();
                obj7 = objM87133R5;
                if (objM87133R5 == obj) {
                    Object c11473h111111111111110 = new C11473h(21);
                    c28655q3.m87172p0(c11473h111111111111110);
                    obj7 = c11473h111111111111110;
                }
                AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b111116, z18, (Function1) obj7), c28655q3, 0);
                Modifier modifierM66724m118 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t14));
                C22957g c22957g118 = AbstractC22977m.f90652c;
                C2305k c2305k118 = C2299e.f9110M;
                C23010x c23010xM66775a111115 = AbstractC23007w.m66775a(c22957g118, c2305k118, c28655q3, 0);
                i28 = i46;
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111116 = c28655q3.m87165m();
                Modifier modifierM118962N1111111116 = AbstractC37056f.m118962N(c28655q3, modifierM66724m118);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i111114, c23010xM66775a111115);
                AbstractC28683x.m87239G(c28655q3, c0209i111115, interfaceC28653p1M87165m1111111116);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i111117, modifierM118962N1111111116);
                Modifier modifierM3409f118 = AbstractC1102d.m3409f(1.0f, c2314t14);
                AbstractC6721d.a aVar118 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if (i26 == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                Object objM87133R111112 = c28655q3.m87133R();
                obj8 = objM87133R111112;
                if (z19) {
                    Object c9813i111114 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i111114);
                    obj8 = c9813i111114;
                } else {
                    Object c9813i111115 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i111115);
                    obj8 = c9813i111115;
                }
                i29 = i26;
                obj9 = obj;
                function18 = function15;
                AbstractC6719b.m20143d(modifierM3409f118, aVar118, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM34108a118 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i51111111115, 6);
                c28655q2 = c28655q3;
                C23010x c23010xM66775a111116 = AbstractC23007w.m66775a(c22957g118, c2305k118, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111117 = c28655q2.m87165m();
                Modifier modifierM118962N1111111117 = AbstractC37056f.m118962N(c28655q2, modifierM34108a118);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111114, c23010xM66775a111116);
                AbstractC28683x.m87239G(c28655q2, c0209i111115, interfaceC28653p1M87165m1111111117);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111117, modifierM118962N1111111117);
                float f11110 = 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f11110, c2314t14));
                i34 = 0;
                m31877L(viewState.getHeader(), c28655q2, 0);
                C23010x c23010xM73381n118 = AbstractC25012a.m73381n(f11110, 4, c2305k118, c28655q2, 6);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111118 = c28655q2.m87165m();
                Modifier modifierM118962N1111111118 = AbstractC37056f.m118962N(c28655q2, c2314t14);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111114, c23010xM73381n118);
                AbstractC28683x.m87239G(c28655q2, c0209i111115, interfaceC28653p1M87165m1111111118);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111117, modifierM118962N1111111118);
                c28655q2.m87150e0(565095534);
                while (r10.hasNext()) {
                    boolean zM87157i118 = c28655q2.m87157i(viewState);
                    if ((i28 & 112) == 32) {
                        i35 = 1;
                    } else {
                        i35 = i34;
                    }
                    int i51111111119 = (zM87157i118 ? 1 : 0) | i35;
                    i36 = i27;
                    if (i36 == 256) {
                        i37 = 1;
                    } else {
                        i37 = i34;
                    }
                    int i511111111110 = i51111111119 | i37;
                    i29 = i29;
                    if (i29 == 16384) {
                        i38 = 1;
                    } else {
                        i38 = i34;
                    }
                    int i511111111111 = i511111111110 | i38;
                    i28 = i28;
                    if ((i28 & 7168) == 2048) {
                        i39 = 1;
                    } else {
                        i39 = 0;
                    }
                    i44 = i511111111111 | i39;
                    objM87133R6 = c28655q2.m87133R();
                    if (i44 != 0) {
                        interfaceC28601c3 = interfaceC28601c2;
                        function19 = function12;
                        function20 = function18;
                        function21 = function17;
                        i45 = 0;
                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                        c28655q2.m87172p0(c1008b);
                    } else {
                        obj10 = obj9;
                        if (objM87133R6 == obj10) {
                            obj9 = obj10;
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj9 = obj10;
                            c1008b = objM87133R6;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            interfaceC28601c3 = interfaceC28601c2;
                        }
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                    function12 = function19;
                    function17 = function21;
                    function18 = function20;
                    interfaceC28601c2 = interfaceC28601c3;
                    i27 = i36;
                    i34 = i45;
                }
                function9 = function12;
                function10 = function17;
                c28655q2.m87173q(i34);
                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t14, 0.0f, 0.0f, 0.0f, 2 * f11110, 7));
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function8 = function18;
                function11 = function16;
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                function8 = function4;
                function9 = function5;
                function10 = function6;
                function11 = function7;
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
            }
        }
        i46 |= 3072;
        function7 = function3;
        i19 = i14 & 16;
        if (i19 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q3.m87157i(function4)) {
                    i24 = 16384;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i46 |= i24;
            }
            if ((i46 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i46 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i47 != 0) {
                    objM87133R10 = c28655q3.m87133R();
                    if (objM87133R10 == obj) {
                        obj14 = objM87133R10;
                        Object c11473h111111111111111 = new C11473h(25);
                        c28655q3.m87172p0(c11473h111111111111111);
                        obj14 = c11473h111111111111111;
                    }
                    obj14 = objM87133R10;
                    function12 = (Function1) obj14;
                } else {
                    function12 = function5;
                }
                if (i15 != 0) {
                    objM87133R9 = c28655q3.m87133R();
                    if (objM87133R9 == obj) {
                        obj13 = objM87133R9;
                        Object c11473h111111111111112 = new C11473h(26);
                        c28655q3.m87172p0(c11473h111111111111112);
                        obj13 = c11473h111111111111112;
                    }
                    obj13 = objM87133R9;
                    function13 = (Function1) obj13;
                } else {
                    function13 = function6;
                }
                if (i17 != 0) {
                    objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == obj) {
                        obj12 = objM87133R8;
                        Object c11473h111111111111113 = new C11473h(17);
                        c28655q3.m87172p0(c11473h111111111111113);
                        obj12 = c11473h111111111111113;
                    }
                    obj12 = objM87133R8;
                    function14 = (Function1) obj12;
                } else {
                    function14 = function7;
                }
                if (i19 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == obj) {
                        obj11 = objM87133R7;
                        Object c11473h111111111111114 = new C11473h(18);
                        c28655q3.m87172p0(c11473h111111111111114);
                        obj11 = c11473h111111111111114;
                    }
                    obj11 = objM87133R7;
                    function15 = (Function1) obj11;
                } else {
                    function15 = function4;
                }
                objM87133R = c28655q3.m87133R();
                obj2 = objM87133R;
                if (objM87133R == obj) {
                    Object objM87272z15 = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87272z15);
                    obj2 = objM87272z15;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                C22383c.b bVarM31867B15 = m31867B(interfaceC28601c1);
                objM87133R2 = c28655q3.m87133R();
                obj3 = objM87133R2;
                if (objM87133R2 == obj) {
                    Object c2192m15 = new C2192m(22, interfaceC28601c1);
                    c28655q3.m87172p0(c2192m15);
                    obj3 = c2192m15;
                }
                InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) obj3;
                i25 = i46 & 896;
                if (i25 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i26 = i46 & 57344;
                if (i26 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                Object objM87133R111113 = c28655q3.m87133R();
                obj4 = objM87133R111113;
                if (z15) {
                    Object c2777c118 = new C2777c(function13, 3, function15);
                    c28655q3.m87172p0(c2777c118);
                    obj4 = c2777c118;
                } else {
                    Object c2777c119 = new C2777c(function13, 3, function15);
                    c28655q3.m87172p0(c2777c119);
                    obj4 = c2777c119;
                }
                int i41116 = TextResource.$stable;
                int i41117 = C27256h.f109055z;
                AbstractC22431f.m64651Z(bVarM31867B15, interfaceC4339a16, (Function1) obj4, c28655q3, i41116 | i41117 | i41117 | 48);
                C2314t c2314t15 = C2314t.f9131w;
                Modifier modifierM44028b14 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t15));
                C13404j c13404jM8528f15 = viewState.getScreenContextMetadata();
                int i511111111112 = C13404j.f46947x << 3;
                function16 = function14;
                interfaceC28601c2 = interfaceC28601c1;
                i27 = i25;
                Modifier modifierM34129b15 = AbstractC12250f.m34129b(modifierM44028b14, c13404jM8528f15, false, c28655q3, i511111111112, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111111119 = c28655q3.m87165m();
                Modifier modifierM118962N1111111119 = AbstractC37056f.m118962N(c28655q3, modifierM34129b15);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i111118 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i111118, interfaceC39127r0M66763d15);
                C0209i c0209i111119 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i111119, interfaceC28653p1M87165m1111111119);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    function17 = function13;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1111110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i1111110, modifierM118962N1111111119);
                    Modifier modifierM3411h119 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t15));
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == obj) {
                        Object c11473h111111111111115 = new C11473h(19);
                        c28655q3.m87172p0(c11473h111111111111115);
                        obj5 = c11473h111111111111115;
                    } else {
                        obj5 = objM87133R3;
                    }
                    Modifier modifierM44099b111117 = AbstractC15676d.m44099b(modifierM3411h119, z16, (Function1) obj5);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    obj6 = objM87133R4;
                    if (objM87133R4 == obj) {
                        Object c11473h111111111111116 = new C11473h(20);
                        c28655q3.m87172p0(c11473h111111111111116);
                        obj6 = c11473h111111111111116;
                    }
                    Modifier modifierM44099b111118 = AbstractC15676d.m44099b(modifierM44099b111117, z17, (Function1) obj6);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    obj7 = objM87133R5;
                    if (objM87133R5 == obj) {
                        Object c11473h111111111111117 = new C11473h(21);
                        c28655q3.m87172p0(c11473h111111111111117);
                        obj7 = c11473h111111111111117;
                    }
                    AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b111118, z18, (Function1) obj7), c28655q3, 0);
                    Modifier modifierM66724m119 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t15));
                    C22957g c22957g119 = AbstractC22977m.f90652c;
                    C2305k c2305k119 = C2299e.f9110M;
                    C23010x c23010xM66775a111117 = AbstractC23007w.m66775a(c22957g119, c2305k119, c28655q3, 0);
                    i28 = i46;
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111110 = c28655q3.m87165m();
                    Modifier modifierM118962N11111111110 = AbstractC37056f.m118962N(c28655q3, modifierM66724m119);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111118, c23010xM66775a111117);
                    AbstractC28683x.m87239G(c28655q3, c0209i111119, interfaceC28653p1M87165m11111111110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111110, modifierM118962N11111111110);
                    Modifier modifierM3409f119 = AbstractC1102d.m3409f(1.0f, c2314t15);
                    AbstractC6721d.a aVar119 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i26 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object objM87133R111114 = c28655q3.m87133R();
                    obj8 = objM87133R111114;
                    if (z19) {
                        Object c9813i111116 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i111116);
                        obj8 = c9813i111116;
                    } else {
                        Object c9813i111117 = new C9813i(function15, 9);
                        c28655q3.m87172p0(c9813i111117);
                        obj8 = c9813i111117;
                    }
                    i29 = i26;
                    obj9 = obj;
                    function18 = function15;
                    AbstractC6719b.m20143d(modifierM3409f119, aVar119, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM34108a119 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511111111112, 6);
                    c28655q2 = c28655q3;
                    C23010x c23010xM66775a111118 = AbstractC23007w.m66775a(c22957g119, c2305k119, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111111 = c28655q2.m87165m();
                    Modifier modifierM118962N11111111111 = AbstractC37056f.m118962N(c28655q2, modifierM34108a119);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111118, c23010xM66775a111118);
                    AbstractC28683x.m87239G(c28655q2, c0209i111119, interfaceC28653p1M87165m11111111111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1111110, modifierM118962N11111111111);
                    float f11111 = 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f11111, c2314t15));
                    i34 = 0;
                    m31877L(viewState.getHeader(), c28655q2, 0);
                    C23010x c23010xM73381n119 = AbstractC25012a.m73381n(f11111, 4, c2305k119, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111111112 = c28655q2.m87165m();
                    Modifier modifierM118962N11111111112 = AbstractC37056f.m118962N(c28655q2, c2314t15);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111118, c23010xM73381n119);
                    AbstractC28683x.m87239G(c28655q2, c0209i111119, interfaceC28653p1M87165m11111111112);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1111110, modifierM118962N11111111112);
                    c28655q2.m87150e0(565095534);
                    while (r10.hasNext()) {
                        boolean zM87157i119 = c28655q2.m87157i(viewState);
                        if ((i28 & 112) == 32) {
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        int i511111111113 = (zM87157i119 ? 1 : 0) | i35;
                        i36 = i27;
                        if (i36 == 256) {
                            i37 = 1;
                        } else {
                            i37 = i34;
                        }
                        int i511111111114 = i511111111113 | i37;
                        i29 = i29;
                        if (i29 == 16384) {
                            i38 = 1;
                        } else {
                            i38 = i34;
                        }
                        int i511111111115 = i511111111114 | i38;
                        i28 = i28;
                        if ((i28 & 7168) == 2048) {
                            i39 = 1;
                        } else {
                            i39 = 0;
                        }
                        i44 = i511111111115 | i39;
                        objM87133R6 = c28655q2.m87133R();
                        if (i44 != 0) {
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj10 = obj9;
                            if (objM87133R6 == obj10) {
                                obj9 = obj10;
                                interfaceC28601c3 = interfaceC28601c2;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                                c28655q2.m87172p0(c1008b);
                            } else {
                                obj9 = obj10;
                                c1008b = objM87133R6;
                                function19 = function12;
                                function20 = function18;
                                function21 = function17;
                                i45 = 0;
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                        function12 = function19;
                        function17 = function21;
                        function18 = function20;
                        interfaceC28601c2 = interfaceC28601c3;
                        i27 = i36;
                        i34 = i45;
                    }
                    function9 = function12;
                    function10 = function17;
                    c28655q2.m87173q(i34);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t15, 0.0f, 0.0f, 0.0f, 2 * f11111, 7));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function8 = function18;
                    function11 = function16;
                    c28655q = c28655q2;
                } else {
                    function17 = function13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i1111111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i1111111, modifierM118962N1111111119);
                Modifier modifierM3411h1110 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t15));
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == obj) {
                    Object c11473h111111111111118 = new C11473h(19);
                    c28655q3.m87172p0(c11473h111111111111118);
                    obj5 = c11473h111111111111118;
                } else {
                    obj5 = objM87133R3;
                }
                Modifier modifierM44099b111119 = AbstractC15676d.m44099b(modifierM3411h1110, z16, (Function1) obj5);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                obj6 = objM87133R4;
                if (objM87133R4 == obj) {
                    Object c11473h111111111111119 = new C11473h(20);
                    c28655q3.m87172p0(c11473h111111111111119);
                    obj6 = c11473h111111111111119;
                }
                Modifier modifierM44099b1111110 = AbstractC15676d.m44099b(modifierM44099b111119, z17, (Function1) obj6);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R5 = c28655q3.m87133R();
                obj7 = objM87133R5;
                if (objM87133R5 == obj) {
                    Object c11473h1111111111111110 = new C11473h(21);
                    c28655q3.m87172p0(c11473h1111111111111110);
                    obj7 = c11473h1111111111111110;
                }
                AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b1111110, z18, (Function1) obj7), c28655q3, 0);
                Modifier modifierM66724m1110 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t15));
                C22957g c22957g1110 = AbstractC22977m.f90652c;
                C2305k c2305k1110 = C2299e.f9110M;
                C23010x c23010xM66775a111119 = AbstractC23007w.m66775a(c22957g1110, c2305k1110, c28655q3, 0);
                i28 = i46;
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111113 = c28655q3.m87165m();
                Modifier modifierM118962N11111111113 = AbstractC37056f.m118962N(c28655q3, modifierM66724m1110);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i111118, c23010xM66775a111119);
                AbstractC28683x.m87239G(c28655q3, c0209i111119, interfaceC28653p1M87165m11111111113);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111111, modifierM118962N11111111113);
                Modifier modifierM3409f1110 = AbstractC1102d.m3409f(1.0f, c2314t15);
                AbstractC6721d.a aVar1110 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if (i26 == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                Object objM87133R111115 = c28655q3.m87133R();
                obj8 = objM87133R111115;
                if (z19) {
                    Object c9813i111118 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i111118);
                    obj8 = c9813i111118;
                } else {
                    Object c9813i111119 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i111119);
                    obj8 = c9813i111119;
                }
                i29 = i26;
                obj9 = obj;
                function18 = function15;
                AbstractC6719b.m20143d(modifierM3409f1110, aVar1110, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM34108a1110 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511111111112, 6);
                c28655q2 = c28655q3;
                C23010x c23010xM66775a1111110 = AbstractC23007w.m66775a(c22957g1110, c2305k1110, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111114 = c28655q2.m87165m();
                Modifier modifierM118962N11111111114 = AbstractC37056f.m118962N(c28655q2, modifierM34108a1110);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111118, c23010xM66775a1111110);
                AbstractC28683x.m87239G(c28655q2, c0209i111119, interfaceC28653p1M87165m11111111114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111111, modifierM118962N11111111114);
                float f11112 = 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f11112, c2314t15));
                i34 = 0;
                m31877L(viewState.getHeader(), c28655q2, 0);
                C23010x c23010xM73381n1110 = AbstractC25012a.m73381n(f11112, 4, c2305k1110, c28655q2, 6);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111115 = c28655q2.m87165m();
                Modifier modifierM118962N11111111115 = AbstractC37056f.m118962N(c28655q2, c2314t15);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111118, c23010xM73381n1110);
                AbstractC28683x.m87239G(c28655q2, c0209i111119, interfaceC28653p1M87165m11111111115);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111111, modifierM118962N11111111115);
                c28655q2.m87150e0(565095534);
                while (r10.hasNext()) {
                    boolean zM87157i1110 = c28655q2.m87157i(viewState);
                    if ((i28 & 112) == 32) {
                        i35 = 1;
                    } else {
                        i35 = i34;
                    }
                    int i511111111116 = (zM87157i1110 ? 1 : 0) | i35;
                    i36 = i27;
                    if (i36 == 256) {
                        i37 = 1;
                    } else {
                        i37 = i34;
                    }
                    int i511111111117 = i511111111116 | i37;
                    i29 = i29;
                    if (i29 == 16384) {
                        i38 = 1;
                    } else {
                        i38 = i34;
                    }
                    int i511111111118 = i511111111117 | i38;
                    i28 = i28;
                    if ((i28 & 7168) == 2048) {
                        i39 = 1;
                    } else {
                        i39 = 0;
                    }
                    i44 = i511111111118 | i39;
                    objM87133R6 = c28655q2.m87133R();
                    if (i44 != 0) {
                        interfaceC28601c3 = interfaceC28601c2;
                        function19 = function12;
                        function20 = function18;
                        function21 = function17;
                        i45 = 0;
                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                        c28655q2.m87172p0(c1008b);
                    } else {
                        obj10 = obj9;
                        if (objM87133R6 == obj10) {
                            obj9 = obj10;
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj9 = obj10;
                            c1008b = objM87133R6;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            interfaceC28601c3 = interfaceC28601c2;
                        }
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                    function12 = function19;
                    function17 = function21;
                    function18 = function20;
                    interfaceC28601c2 = interfaceC28601c3;
                    i27 = i36;
                    i34 = i45;
                }
                function9 = function12;
                function10 = function17;
                c28655q2.m87173q(i34);
                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t15, 0.0f, 0.0f, 0.0f, 2 * f11112, 7));
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function8 = function18;
                function11 = function16;
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                function8 = function4;
                function9 = function5;
                function10 = function6;
                function11 = function7;
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
            }
        }
        i46 |= 24576;
        if ((i46 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i46 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i47 != 0) {
                objM87133R10 = c28655q3.m87133R();
                if (objM87133R10 == obj) {
                    obj14 = objM87133R10;
                    Object c11473h1111111111111111 = new C11473h(25);
                    c28655q3.m87172p0(c11473h1111111111111111);
                    obj14 = c11473h1111111111111111;
                }
                obj14 = objM87133R10;
                function12 = (Function1) obj14;
            } else {
                function12 = function5;
            }
            if (i15 != 0) {
                objM87133R9 = c28655q3.m87133R();
                if (objM87133R9 == obj) {
                    obj13 = objM87133R9;
                    Object c11473h1111111111111112 = new C11473h(26);
                    c28655q3.m87172p0(c11473h1111111111111112);
                    obj13 = c11473h1111111111111112;
                }
                obj13 = objM87133R9;
                function13 = (Function1) obj13;
            } else {
                function13 = function6;
            }
            if (i17 != 0) {
                objM87133R8 = c28655q3.m87133R();
                if (objM87133R8 == obj) {
                    obj12 = objM87133R8;
                    Object c11473h1111111111111113 = new C11473h(17);
                    c28655q3.m87172p0(c11473h1111111111111113);
                    obj12 = c11473h1111111111111113;
                }
                obj12 = objM87133R8;
                function14 = (Function1) obj12;
            } else {
                function14 = function7;
            }
            if (i19 != 0) {
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == obj) {
                    obj11 = objM87133R7;
                    Object c11473h1111111111111114 = new C11473h(18);
                    c28655q3.m87172p0(c11473h1111111111111114);
                    obj11 = c11473h1111111111111114;
                }
                obj11 = objM87133R7;
                function15 = (Function1) obj11;
            } else {
                function15 = function4;
            }
            objM87133R = c28655q3.m87133R();
            obj2 = objM87133R;
            if (objM87133R == obj) {
                Object objM87272z16 = AbstractC28683x.m87272z(null);
                c28655q3.m87172p0(objM87272z16);
                obj2 = objM87272z16;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj2;
            C22383c.b bVarM31867B16 = m31867B(interfaceC28601c1);
            objM87133R2 = c28655q3.m87133R();
            obj3 = objM87133R2;
            if (objM87133R2 == obj) {
                Object c2192m16 = new C2192m(22, interfaceC28601c1);
                c28655q3.m87172p0(c2192m16);
                obj3 = c2192m16;
            }
            InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) obj3;
            i25 = i46 & 896;
            if (i25 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            i26 = i46 & 57344;
            if (i26 == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            Object objM87133R111116 = c28655q3.m87133R();
            obj4 = objM87133R111116;
            if (z15) {
                Object c2777c1110 = new C2777c(function13, 3, function15);
                c28655q3.m87172p0(c2777c1110);
                obj4 = c2777c1110;
            } else {
                Object c2777c1111 = new C2777c(function13, 3, function15);
                c28655q3.m87172p0(c2777c1111);
                obj4 = c2777c1111;
            }
            int i41118 = TextResource.$stable;
            int i41119 = C27256h.f109055z;
            AbstractC22431f.m64651Z(bVarM31867B16, interfaceC4339a17, (Function1) obj4, c28655q3, i41118 | i41119 | i41119 | 48);
            C2314t c2314t16 = C2314t.f9131w;
            Modifier modifierM44028b15 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t16));
            C13404j c13404jM8528f16 = viewState.getScreenContextMetadata();
            int i511111111119 = C13404j.f46947x << 3;
            function16 = function14;
            interfaceC28601c2 = interfaceC28601c1;
            i27 = i25;
            Modifier modifierM34129b16 = AbstractC12250f.m34129b(modifierM44028b15, c13404jM8528f16, false, c28655q3, i511111111119, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111111116 = c28655q3.m87165m();
            Modifier modifierM118962N11111111116 = AbstractC37056f.m118962N(c28655q3, modifierM34129b16);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i1111112 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i1111112, interfaceC39127r0M66763d16);
            C0209i c0209i1111113 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i1111113, interfaceC28653p1M87165m11111111116);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                function17 = function13;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1111114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i1111114, modifierM118962N11111111116);
                Modifier modifierM3411h1111 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t16));
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == obj) {
                    Object c11473h1111111111111115 = new C11473h(19);
                    c28655q3.m87172p0(c11473h1111111111111115);
                    obj5 = c11473h1111111111111115;
                } else {
                    obj5 = objM87133R3;
                }
                Modifier modifierM44099b1111111 = AbstractC15676d.m44099b(modifierM3411h1111, z16, (Function1) obj5);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                obj6 = objM87133R4;
                if (objM87133R4 == obj) {
                    Object c11473h1111111111111116 = new C11473h(20);
                    c28655q3.m87172p0(c11473h1111111111111116);
                    obj6 = c11473h1111111111111116;
                }
                Modifier modifierM44099b1111112 = AbstractC15676d.m44099b(modifierM44099b1111111, z17, (Function1) obj6);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R5 = c28655q3.m87133R();
                obj7 = objM87133R5;
                if (objM87133R5 == obj) {
                    Object c11473h1111111111111117 = new C11473h(21);
                    c28655q3.m87172p0(c11473h1111111111111117);
                    obj7 = c11473h1111111111111117;
                }
                AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b1111112, z18, (Function1) obj7), c28655q3, 0);
                Modifier modifierM66724m1111 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t16));
                C22957g c22957g1111 = AbstractC22977m.f90652c;
                C2305k c2305k1111 = C2299e.f9110M;
                C23010x c23010xM66775a1111111 = AbstractC23007w.m66775a(c22957g1111, c2305k1111, c28655q3, 0);
                i28 = i46;
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111117 = c28655q3.m87165m();
                Modifier modifierM118962N11111111117 = AbstractC37056f.m118962N(c28655q3, modifierM66724m1111);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111112, c23010xM66775a1111111);
                AbstractC28683x.m87239G(c28655q3, c0209i1111113, interfaceC28653p1M87165m11111111117);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1111114, modifierM118962N11111111117);
                Modifier modifierM3409f1111 = AbstractC1102d.m3409f(1.0f, c2314t16);
                AbstractC6721d.a aVar1111 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if (i26 == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                Object objM87133R111117 = c28655q3.m87133R();
                obj8 = objM87133R111117;
                if (z19) {
                    Object c9813i1111110 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i1111110);
                    obj8 = c9813i1111110;
                } else {
                    Object c9813i1111111 = new C9813i(function15, 9);
                    c28655q3.m87172p0(c9813i1111111);
                    obj8 = c9813i1111111;
                }
                i29 = i26;
                obj9 = obj;
                function18 = function15;
                AbstractC6719b.m20143d(modifierM3409f1111, aVar1111, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM34108a1111 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511111111119, 6);
                c28655q2 = c28655q3;
                C23010x c23010xM66775a1111112 = AbstractC23007w.m66775a(c22957g1111, c2305k1111, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111118 = c28655q2.m87165m();
                Modifier modifierM118962N11111111118 = AbstractC37056f.m118962N(c28655q2, modifierM34108a1111);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111112, c23010xM66775a1111112);
                AbstractC28683x.m87239G(c28655q2, c0209i1111113, interfaceC28653p1M87165m11111111118);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111114, modifierM118962N11111111118);
                float f11113 = 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f11113, c2314t16));
                i34 = 0;
                m31877L(viewState.getHeader(), c28655q2, 0);
                C23010x c23010xM73381n1111 = AbstractC25012a.m73381n(f11113, 4, c2305k1111, c28655q2, 6);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111119 = c28655q2.m87165m();
                Modifier modifierM118962N11111111119 = AbstractC37056f.m118962N(c28655q2, c2314t16);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111112, c23010xM73381n1111);
                AbstractC28683x.m87239G(c28655q2, c0209i1111113, interfaceC28653p1M87165m11111111119);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111114, modifierM118962N11111111119);
                c28655q2.m87150e0(565095534);
                while (r10.hasNext()) {
                    boolean zM87157i1111 = c28655q2.m87157i(viewState);
                    if ((i28 & 112) == 32) {
                        i35 = 1;
                    } else {
                        i35 = i34;
                    }
                    int i5111111111110 = (zM87157i1111 ? 1 : 0) | i35;
                    i36 = i27;
                    if (i36 == 256) {
                        i37 = 1;
                    } else {
                        i37 = i34;
                    }
                    int i5111111111111 = i5111111111110 | i37;
                    i29 = i29;
                    if (i29 == 16384) {
                        i38 = 1;
                    } else {
                        i38 = i34;
                    }
                    int i5111111111112 = i5111111111111 | i38;
                    i28 = i28;
                    if ((i28 & 7168) == 2048) {
                        i39 = 1;
                    } else {
                        i39 = 0;
                    }
                    i44 = i5111111111112 | i39;
                    objM87133R6 = c28655q2.m87133R();
                    if (i44 != 0) {
                        interfaceC28601c3 = interfaceC28601c2;
                        function19 = function12;
                        function20 = function18;
                        function21 = function17;
                        i45 = 0;
                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                        c28655q2.m87172p0(c1008b);
                    } else {
                        obj10 = obj9;
                        if (objM87133R6 == obj10) {
                            obj9 = obj10;
                            interfaceC28601c3 = interfaceC28601c2;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                            c28655q2.m87172p0(c1008b);
                        } else {
                            obj9 = obj10;
                            c1008b = objM87133R6;
                            function19 = function12;
                            function20 = function18;
                            function21 = function17;
                            i45 = 0;
                            interfaceC28601c3 = interfaceC28601c2;
                        }
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                    function12 = function19;
                    function17 = function21;
                    function18 = function20;
                    interfaceC28601c2 = interfaceC28601c3;
                    i27 = i36;
                    i34 = i45;
                }
                function9 = function12;
                function10 = function17;
                c28655q2.m87173q(i34);
                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t16, 0.0f, 0.0f, 0.0f, 2 * f11113, 7));
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function8 = function18;
                function11 = function16;
                c28655q = c28655q2;
            } else {
                function17 = function13;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            C0209i c0209i1111115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i1111115, modifierM118962N11111111116);
            Modifier modifierM3411h1112 = AbstractC1102d.m3411h(530, AbstractC1102d.m3409f(1.0f, c2314t16));
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OPTIMAL) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R3 = c28655q3.m87133R();
            if (objM87133R3 == obj) {
                Object c11473h1111111111111118 = new C11473h(19);
                c28655q3.m87172p0(c11473h1111111111111118);
                obj5 = c11473h1111111111111118;
            } else {
                obj5 = objM87133R3;
            }
            Modifier modifierM44099b1111113 = AbstractC15676d.m44099b(modifierM3411h1112, z16, (Function1) obj5);
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.OUT_OF_RANGE) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R4 = c28655q3.m87133R();
            obj6 = objM87133R4;
            if (objM87133R4 == obj) {
                Object c11473h1111111111111119 = new C11473h(20);
                c28655q3.m87172p0(c11473h1111111111111119);
                obj6 = c11473h1111111111111119;
            }
            Modifier modifierM44099b1111114 = AbstractC15676d.m44099b(modifierM44099b1111113, z17, (Function1) obj6);
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC0093m.SUFFICIENT) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R5 = c28655q3.m87133R();
            obj7 = objM87133R5;
            if (objM87133R5 == obj) {
                Object c11473h11111111111111110 = new C11473h(21);
                c28655q3.m87172p0(c11473h11111111111111110);
                obj7 = c11473h11111111111111110;
            }
            AbstractC22989q.m66760a(AbstractC15676d.m44099b(modifierM44099b1111114, z18, (Function1) obj7), c28655q3, 0);
            Modifier modifierM66724m1112 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t16));
            C22957g c22957g1112 = AbstractC22977m.f90652c;
            C2305k c2305k1112 = C2299e.f9110M;
            C23010x c23010xM66775a1111113 = AbstractC23007w.m66775a(c22957g1112, c2305k1112, c28655q3, 0);
            i28 = i46;
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111111111110 = c28655q3.m87165m();
            Modifier modifierM118962N111111111110 = AbstractC37056f.m118962N(c28655q3, modifierM66724m1112);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i1111112, c23010xM66775a1111113);
            AbstractC28683x.m87239G(c28655q3, c0209i1111113, interfaceC28653p1M87165m111111111110);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i1111115, modifierM118962N111111111110);
            Modifier modifierM3409f1112 = AbstractC1102d.m3409f(1.0f, c2314t16);
            AbstractC6721d.a aVar1112 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            if (i26 == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            Object objM87133R111118 = c28655q3.m87133R();
            obj8 = objM87133R111118;
            if (z19) {
                Object c9813i1111112 = new C9813i(function15, 9);
                c28655q3.m87172p0(c9813i1111112);
                obj8 = c9813i1111112;
            } else {
                Object c9813i1111113 = new C9813i(function15, 9);
                c28655q3.m87172p0(c9813i1111113);
                obj8 = c9813i1111113;
            }
            i29 = i26;
            obj9 = obj;
            function18 = function15;
            AbstractC6719b.m20143d(modifierM3409f1112, aVar1112, null, (InterfaceC4339a) obj8, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM34108a1112 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(new LayoutWeightElement(1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q3, i511111111119, 6);
            c28655q2 = c28655q3;
            C23010x c23010xM66775a1111114 = AbstractC23007w.m66775a(c22957g1112, c2305k1112, c28655q2, 0);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111111111111 = c28655q2.m87165m();
            Modifier modifierM118962N111111111111 = AbstractC37056f.m118962N(c28655q2, modifierM34108a1112);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1111112, c23010xM66775a1111114);
            AbstractC28683x.m87239G(c28655q2, c0209i1111113, interfaceC28653p1M87165m111111111111);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1111115, modifierM118962N111111111111);
            float f11114 = 8;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f11114, c2314t16));
            i34 = 0;
            m31877L(viewState.getHeader(), c28655q2, 0);
            C23010x c23010xM73381n1112 = AbstractC25012a.m73381n(f11114, 4, c2305k1112, c28655q2, 6);
            iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111111111112 = c28655q2.m87165m();
            Modifier modifierM118962N111111111112 = AbstractC37056f.m118962N(c28655q2, c2314t16);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1111112, c23010xM73381n1112);
            AbstractC28683x.m87239G(c28655q2, c0209i1111113, interfaceC28653p1M87165m111111111112);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1111115, modifierM118962N111111111112);
            c28655q2.m87150e0(565095534);
            while (r10.hasNext()) {
                boolean zM87157i1112 = c28655q2.m87157i(viewState);
                if ((i28 & 112) == 32) {
                    i35 = 1;
                } else {
                    i35 = i34;
                }
                int i5111111111113 = (zM87157i1112 ? 1 : 0) | i35;
                i36 = i27;
                if (i36 == 256) {
                    i37 = 1;
                } else {
                    i37 = i34;
                }
                int i5111111111114 = i5111111111113 | i37;
                i29 = i29;
                if (i29 == 16384) {
                    i38 = 1;
                } else {
                    i38 = i34;
                }
                int i5111111111115 = i5111111111114 | i38;
                i28 = i28;
                if ((i28 & 7168) == 2048) {
                    i39 = 1;
                } else {
                    i39 = 0;
                }
                i44 = i5111111111115 | i39;
                objM87133R6 = c28655q2.m87133R();
                if (i44 != 0) {
                    interfaceC28601c3 = interfaceC28601c2;
                    function19 = function12;
                    function20 = function18;
                    function21 = function17;
                    i45 = 0;
                    c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                    c28655q2.m87172p0(c1008b);
                } else {
                    obj10 = obj9;
                    if (objM87133R6 == obj10) {
                        obj9 = obj10;
                        interfaceC28601c3 = interfaceC28601c2;
                        function19 = function12;
                        function20 = function18;
                        function21 = function17;
                        i45 = 0;
                        c1008b = new C1008b(viewState, function19, function21, function20, function16, interfaceC28601c3);
                        c28655q2.m87172p0(c1008b);
                    } else {
                        obj9 = obj10;
                        c1008b = objM87133R6;
                        function19 = function12;
                        function20 = function18;
                        function21 = function17;
                        i45 = 0;
                        interfaceC28601c3 = interfaceC28601c2;
                    }
                }
                AbstractC22431f.m64641P(interfaceC25312u, (Function1) c1008b, c28655q2, i45, i45);
                function12 = function19;
                function17 = function21;
                function18 = function20;
                interfaceC28601c2 = interfaceC28601c3;
                i27 = i36;
                i34 = i45;
            }
            function9 = function12;
            function10 = function17;
            c28655q2.m87173q(i34);
            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3398t(c2314t16, 0.0f, 0.0f, 0.0f, 2 * f11114, 7));
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            function8 = function18;
            function11 = function16;
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            function8 = function4;
            function9 = function5;
            function10 = function6;
            function11 = function7;
            c28655q = c28655q3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f((Object) viewState, function9, (Object) function10, (Object) function11, (InterfaceC23459e) function8, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m31912w(AbstractC2922b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m31913x(Action it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m31914y(AbstractC2924d.c cVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i13, int i14, Composer composer, int i15) {
        m31911v(cVar, function1, function2, function3, function4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m31915z(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
