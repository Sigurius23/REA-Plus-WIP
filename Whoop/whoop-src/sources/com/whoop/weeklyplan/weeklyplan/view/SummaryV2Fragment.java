package com.whoop.weeklyplan.weeklyplan.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ls2.C24717b;
import o02.AbstractC27355f;
import o02.C27354e;
import o02.InterfaceC27353d;
import or2.AbstractC28163g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vt2.AbstractC36492a;
import vt2.C36493b;
import wt2.AbstractC37628i;
import wt2.AbstractC37630k;
import wt2.C37629j;
import yk2.C39611k;
import yt2.AbstractC39780k;
import yt2.C39773d;
import yt2.C39779j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b1\u00102¨\u00066²\u0006\f\u00105\u001a\u0002048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lwt2/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "J", "()Lwt2/j;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "y", "G", "()Lo02/d;", "baseNavReducer", "z", "Lo02/d;", "navigationReducer", "", "E", "H", "()Ljava/lang/String;", "planId", "Lls2/b;", "F", "()Lls2/b;", "analyticsHelper", "Lvt2/b;", "I", "()Lvt2/b;", "summaryNavigationRouter", "Lwt2/k;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SummaryV2Fragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h planId;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h summaryNavigationRouter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10731e(this, null, new C10730d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h baseNavReducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10727a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32714w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32715x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32716y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10727a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32714w = componentCallbacks;
            this.f32715x = interfaceC35951a;
            this.f32716y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32714w;
            InterfaceC35951a interfaceC35951a = this.f32715x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32716y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10728b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32717w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32718x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32719y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10728b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32717w = componentCallbacks;
            this.f32718x = interfaceC35951a;
            this.f32719y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f32717w;
            InterfaceC35951a interfaceC35951a = this.f32718x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32719y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10729c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32720w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32721x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32722y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10729c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32720w = componentCallbacks;
            this.f32721x = interfaceC35951a;
            this.f32722y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ls2.b] */
        @Override // c93.InterfaceC4339a
        public final C24717b invoke() {
            ComponentCallbacks componentCallbacks = this.f32720w;
            InterfaceC35951a interfaceC35951a = this.f32721x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32722y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24717b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10730d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32723w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10730d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32723w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32723w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10731e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32724w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32725x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32726y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32727z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10731e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32724w = componentCallbacks;
            this.f32725x = interfaceC35951a;
            this.f32726y = interfaceC4339a;
            this.f32727z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, wt2.j] */
        @Override // c93.InterfaceC4339a
        public final C37629j invoke() {
            return AbstractC34132o.m107857B(this.f32724w, this.f32725x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37629j.class), this.f32726y, this.f32727z);
        }
    }

    public SummaryV2Fragment() {
        C39773d c39773d = new C39773d(this, 0);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10727a(this, null, c39773d));
        this.baseNavReducer = AbstractC30060g.m92087G(enumC23463i, new C10728b(this, null, null));
        this.navigationReducer = AbstractC27355f.m82533a(m27991G(), new C39611k(14));
        this.planId = AbstractC30060g.m92088H(new C39773d(this, 1));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10729c(this, null, null));
        this.summaryNavigationRouter = AbstractC30060g.m92088H(new C39773d(this, 2));
    }

    /* JADX INFO: renamed from: F */
    private final C24717b m27990F() {
        return (C24717b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final InterfaceC27353d m27991G() {
        return (InterfaceC27353d) this.baseNavReducer.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final String m27992H() {
        return (String) this.planId.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C36493b m27993I() {
        return (C36493b) this.summaryNavigationRouter.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C37629j m27994J() {
        return (C37629j) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m27995K(C27354e buildNavigationReducer) {
        AbstractC22676k.m65750j(buildNavigationReducer, "$this$buildNavigationReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C34911a m27996L(SummaryV2Fragment summaryV2Fragment) {
        return AbstractC15751g.m44431K(summaryV2Fragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m27997M(final SummaryV2Fragment summaryV2Fragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC37630k abstractC37630kM27998N = m27998N(AbstractC28683x.m87260n(summaryV2Fragment.m27994J().getViewState(), AbstractC37630k.b.f161052a, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(summaryV2Fragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(summaryV2Fragment) { // from class: yt2.e

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SummaryV2Fragment f171327x;

                    {
                        this.f171327x = summaryV2Fragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return SummaryV2Fragment.m27999O(this.f171327x, (AbstractC37628i) obj);
                            default:
                                return SummaryV2Fragment.m28000P(this.f171327x, (AbstractC36492a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(summaryV2Fragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new Function1(summaryV2Fragment) { // from class: yt2.e

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SummaryV2Fragment f171327x;

                    {
                        this.f171327x = summaryV2Fragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return SummaryV2Fragment.m27999O(this.f171327x, (AbstractC37628i) obj);
                            default:
                                return SummaryV2Fragment.m28000P(this.f171327x, (AbstractC36492a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC39780k.m127382X(abstractC37630kM27998N, false, function1, (Function1) objM87133R2, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final AbstractC37630k m27998N(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC37630k) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m27999O(SummaryV2Fragment summaryV2Fragment, AbstractC37628i it) {
        AbstractC22676k.m65750j(it, "it");
        summaryV2Fragment.m27994J().m120913o(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m28000P(SummaryV2Fragment summaryV2Fragment, AbstractC36492a it) {
        AbstractC22676k.m65750j(it, "it");
        summaryV2Fragment.m27994J().m120913o(new AbstractC37628i.a(summaryV2Fragment.m27992H()));
        summaryV2Fragment.m27993I().m116952c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final String m28001Q(SummaryV2Fragment summaryV2Fragment) {
        String string = summaryV2Fragment.requireArguments().getString("planId");
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C36493b m28002R(SummaryV2Fragment summaryV2Fragment) {
        return new C36493b(AbstractC5583n.m16799z(summaryV2Fragment), summaryV2Fragment.getNavigator(), summaryV2Fragment.navigationReducer, summaryV2Fragment.m27990F());
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m27994J().m120913o(new AbstractC37628i.b(m27992H()));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C39779j(this, 1), true, 454622064));
    }
}
