package com.whoop.helpcenter.view.fragment;

import al1.C0982c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bl1.C3371b;
import bl1.InterfaceC3370a;
import c93.InterfaceC4339a;
import ci0.C4726a;
import cl1.AbstractC4799b;
import cl1.C4798a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.navigation.AiAction;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28216y;
import p000.C29656q;
import p114eb.C12991u0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
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
import zk1.AbstractC40837a;
import zk1.C40839c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "Lal1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Lal1/c;", "viewModel", "Lor2/y;", "x", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lbl1/b;", "z", "C", "()Lbl1/b;", "analyticsHelper", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HelpCenterFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8814e(this, null, new C8813d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.helpcenter.view.fragment.HelpCenterFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8810a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26357w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26358x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26359y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8810a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26357w = componentCallbacks;
            this.f26358x = interfaceC35951a;
            this.f26359y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f26357w;
            InterfaceC35951a interfaceC35951a = this.f26358x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26359y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.helpcenter.view.fragment.HelpCenterFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8811b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26360w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26361x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26362y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8811b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26360w = componentCallbacks;
            this.f26361x = interfaceC35951a;
            this.f26362y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26360w;
            InterfaceC35951a interfaceC35951a = this.f26361x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26362y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.helpcenter.view.fragment.HelpCenterFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8812c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26363w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26364x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26365y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8812c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26363w = componentCallbacks;
            this.f26364x = interfaceC35951a;
            this.f26365y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bl1.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3371b invoke() {
            ComponentCallbacks componentCallbacks = this.f26363w;
            InterfaceC35951a interfaceC35951a = this.f26364x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26365y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3371b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.helpcenter.view.fragment.HelpCenterFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8813d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26366w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8813d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26366w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26366w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.helpcenter.view.fragment.HelpCenterFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8814e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26367w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26368x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26369y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26370z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8814e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26367w = componentCallbacks;
            this.f26368x = interfaceC35951a;
            this.f26369y = interfaceC4339a;
            this.f26370z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [al1.c, androidx.lifecycle.w1] */
        @Override // c93.InterfaceC4339a
        public final C0982c invoke() {
            return AbstractC34132o.m107857B(this.f26367w, this.f26368x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0982c.class), this.f26369y, this.f26370z);
        }
    }

    public HelpCenterFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C8810a(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8811b(this, null, new C4798a(this, 0)));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8812c(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final C3371b m21666C() {
        return (C3371b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C0982c m21667D() {
        return (C0982c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m21668E(HelpCenterFragment helpCenterFragment) {
        return AbstractC15751g.m44431K(helpCenterFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m21669F(HelpCenterFragment helpCenterFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("HelpCenterNavHost", null, c28655q, 6, 2);
            C28216y externalLinkNavigator = helpCenterFragment.getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = helpCenterFragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            C40839c c40839c = new C40839c(c12991u0M58963a, externalLinkNavigator, abstractActivityC1340r0RequireActivity, helpCenterFragment.getNavigator());
            helpCenterFragment.m21667D().m2675n(new InterfaceC3370a.h(null, null, null, null, null, 31, null));
            InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
            C0982c c0982cM21667D = helpCenterFragment.m21667D();
            boolean zM87157i = c28655q.m87157i(helpCenterFragment) | c28655q.m87157i(interfaceC12251g) | c28655q.m87157i(c40839c);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C29656q(helpCenterFragment, interfaceC12251g, c40839c, 17);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(helpCenterFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4798a(helpCenterFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC40837a.m132338j(c0982cM21667D, c40839c, c12991u0M58963a, function1, (InterfaceC4339a) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m21670G(HelpCenterFragment helpCenterFragment, InterfaceC12251g interfaceC12251g, C40839c c40839c, AiAction aiAction) {
        AbstractC4799b.m15162a(aiAction, helpCenterFragment.m21666C(), interfaceC12251g, c40839c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m21671H(HelpCenterFragment helpCenterFragment) {
        AbstractC5583n.m16799z(helpCenterFragment).m36410z();
        return C23454a0.f92919a;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 3), true, -2027432726));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }
}
