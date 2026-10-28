package com.whoop.impacts.details.view;

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
import com.whoop.impacts.details.view.BehaviorDetailsFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gq1.C16081a;
import hq1.C17567f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kq1.AbstractC22773a;
import kq1.C22774b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lq1.AbstractC24666f;
import lq1.AbstractC24668h;
import lq1.C24667g;
import oe2.C27878c;
import oq1.AbstractC28122f;
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
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Llq1/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()Llq1/g;", "viewModel", "Lgq1/a;", "x", "B", "()Lgq1/a;", "analytics", "Lkq1/b;", "y", "Lkq1/b;", "navigationRouter", "Llq1/h;", "viewState", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BehaviorDetailsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8954c(this, null, new C8953b(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analytics = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C8952a(this, null, null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C22774b navigationRouter = new C22774b(this, m22202B());

    /* JADX INFO: renamed from: com.whoop.impacts.details.view.BehaviorDetailsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8952a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26799w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26800x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26801y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8952a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26799w = componentCallbacks;
            this.f26800x = interfaceC35951a;
            this.f26801y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gq1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C16081a invoke() {
            ComponentCallbacks componentCallbacks = this.f26799w;
            InterfaceC35951a interfaceC35951a = this.f26800x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26801y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16081a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.impacts.details.view.BehaviorDetailsFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8953b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26802w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8953b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26802w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26802w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.impacts.details.view.BehaviorDetailsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8954c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26803w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26804x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26805y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26806z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8954c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26803w = componentCallbacks;
            this.f26804x = interfaceC35951a;
            this.f26805y = interfaceC4339a;
            this.f26806z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, lq1.g] */
        @Override // c93.InterfaceC4339a
        public final C24667g invoke() {
            return AbstractC34132o.m107857B(this.f26803w, this.f26804x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24667g.class), this.f26805y, this.f26806z);
        }
    }

    /* JADX INFO: renamed from: B */
    private final C16081a m22202B() {
        return (C16081a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final C24667g m22203C() {
        return (C24667g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m22204D(final BehaviorDetailsFragment behaviorDetailsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC24668h abstractC24668hM22205E = m22205E(AbstractC28683x.m87260n(behaviorDetailsFragment.m22203C().getViewState(), AbstractC24668h.b.f96481a, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(behaviorDetailsFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(behaviorDetailsFragment) { // from class: oq1.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ BehaviorDetailsFragment f113754x;

                    {
                        this.f113754x = behaviorDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return BehaviorDetailsFragment.m22206F(this.f113754x, (AbstractC24666f) obj);
                            default:
                                return BehaviorDetailsFragment.m22207G(this.f113754x, (AbstractC22773a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(behaviorDetailsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new Function1(behaviorDetailsFragment) { // from class: oq1.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ BehaviorDetailsFragment f113754x;

                    {
                        this.f113754x = behaviorDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return BehaviorDetailsFragment.m22206F(this.f113754x, (AbstractC24666f) obj);
                            default:
                                return BehaviorDetailsFragment.m22207G(this.f113754x, (AbstractC22773a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28122f.m85060d(abstractC24668hM22205E, function1, (Function1) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final AbstractC24668h m22205E(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC24668h) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m22206F(BehaviorDetailsFragment behaviorDetailsFragment, AbstractC24666f it) {
        AbstractC22676k.m65750j(it, "it");
        behaviorDetailsFragment.m22203C().m72054n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m22207G(BehaviorDetailsFragment behaviorDetailsFragment, AbstractC22773a it) {
        AbstractC22676k.m65750j(it, "it");
        behaviorDetailsFragment.navigationRouter.m65981a(it);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        String string2;
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("impactId")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        boolean z4 = arguments2 != null ? arguments2.getBoolean("isNew") : false;
        C16081a.b.Companion companion = C16081a.b.INSTANCE;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("source")) == null) {
            string2 = "Impacts Summary";
        }
        m22203C().m72054n(new AbstractC24666f.a(new C17567f(string, companion.m45434a(string2, C16081a.b.IMPACTS_SUMMARY), z4)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 6), true, -1265425759));
    }
}
