package com.whoop.advancedlabs.clinicalinsights.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kb0.AbstractC22319a;
import kb0.C22320b;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lb0.AbstractC23584a;
import lb0.AbstractC23586c;
import lb0.C23585b;
import lc0.C23821c;
import live.hms.video.connection.degredation.C24117a;
import mw1.C25985a;
import nb0.AbstractC26536a;
import or2.AbstractC28163g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import ya0.C39355a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/clinicalinsights/view/ClinicalInsightsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Llb0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Llb0/b;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lya0/a;", "y", "D", "()Lya0/a;", "analyticsHelper", "Llb0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ClinicalInsightsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5808e(this, null, new C5807d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment$onCreateView$1$1$1", m100430f = "ClinicalInsightsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5804a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22915w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f22917y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5804a(String str, InterfaceC30057d<? super C5804a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22917y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ClinicalInsightsFragment.this.new C5804a(this.f22917y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5804a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22915w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ClinicalInsightsFragment.this.m17327E().m68228n(new AbstractC23584a.a(this.f22917y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5805b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22918w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22919x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22920y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5805b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22918w = componentCallbacks;
            this.f22919x = interfaceC35951a;
            this.f22920y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22918w;
            InterfaceC35951a interfaceC35951a = this.f22919x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22920y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5806c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22921w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22922x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22923y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5806c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22921w = componentCallbacks;
            this.f22922x = interfaceC35951a;
            this.f22923y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f22921w;
            InterfaceC35951a interfaceC35951a = this.f22922x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22923y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5807d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22924w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5807d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22924w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22924w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5808e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22925w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22926x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22927y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22928z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5808e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22925w = componentCallbacks;
            this.f22926x = interfaceC35951a;
            this.f22927y = interfaceC4339a;
            this.f22928z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, lb0.b] */
        @Override // c93.InterfaceC4339a
        public final C23585b invoke() {
            return AbstractC34132o.m107857B(this.f22925w, this.f22926x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23585b.class), this.f22927y, this.f22928z);
        }
    }

    public ClinicalInsightsFragment() {
        C24117a c24117a = new C24117a(this, 22);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5805b(this, null, c24117a));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5806c(this, null, null));
    }

    /* JADX INFO: renamed from: D */
    private final C39355a m17326D() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C23585b m17327E() {
        return (C23585b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m17328F(ClinicalInsightsFragment clinicalInsightsFragment) {
        return AbstractC15751g.m44431K(clinicalInsightsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m17329G(ClinicalInsightsFragment clinicalInsightsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C22320b(AbstractC5583n.m16799z(clinicalInsightsFragment), clinicalInsightsFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C22320b c22320b = (C22320b) objM87133R;
            Bundle arguments = clinicalInsightsFragment.getArguments();
            String string = arguments != null ? arguments.getString("testId") : null;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(clinicalInsightsFragment.m17327E().getViewState(), AbstractC23586c.b.f93556b, null, c28655q, 48, 2);
            C23585b c23585bM17327E = clinicalInsightsFragment.m17327E();
            boolean zM87157i = c28655q.m87157i(clinicalInsightsFragment) | c28655q.m87153g(string);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = clinicalInsightsFragment.new C5804a(string, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(c23585bM17327E, string, (InterfaceC4351m) objM87133R2, c28655q);
            AbstractC23586c abstractC23586cM17330H = m17330H(interfaceC28601c1M87260n);
            Bundle arguments2 = clinicalInsightsFragment.getArguments();
            String string2 = arguments2 != null ? arguments2.getString("source") : null;
            boolean zM87157i2 = c28655q.m87157i(clinicalInsightsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C23821c(clinicalInsightsFragment, 24);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(c22320b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C23821c(c22320b, 25);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC26536a.m78623n(abstractC23586cM17330H, string2, function1, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final AbstractC23586c m17330H(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC23586c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m17331I(ClinicalInsightsFragment clinicalInsightsFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        clinicalInsightsFragment.m17326D().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m17332J(C22320b c22320b, AbstractC22319a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c22320b.m64134a(navEvent);
        return C23454a0.f92919a;
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
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 9), true, -1398389292));
    }
}
