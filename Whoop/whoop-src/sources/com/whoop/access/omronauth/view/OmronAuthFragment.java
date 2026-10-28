package com.whoop.access.omronauth.view;

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
import com.squareup.wire.AbstractC5583n;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p664yy.C39850b0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import u50.C34540d;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import w20.C36727q;
import w50.C36834a;
import x50.C37987b;
import x50.InterfaceC37986a;
import z50.AbstractC40089e;
import z50.C40085a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lcom/whoop/access/omronauth/view/OmronAuthFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lj02/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getNavigator", "()Lj02/o0;", "navigator", "Lx50/b;", "x", "E", "()Lx50/b;", "viewModel", "Lbc3/c0;", "y", "C", "()Lbc3/c0;", "applicationScope", "Lu50/d;", "z", "D", "()Lu50/d;", "oauthPerformer", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OmronAuthFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h applicationScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h oauthPerformer;

    /* JADX INFO: renamed from: com.whoop.access.omronauth.view.OmronAuthFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5719a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22627w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22628x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22629y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5719a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22627w = componentCallbacks;
            this.f22628x = interfaceC35951a;
            this.f22629y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22627w;
            InterfaceC35951a interfaceC35951a = this.f22628x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22629y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.access.omronauth.view.OmronAuthFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5720b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22630w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22631x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22632y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5720b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22630w = componentCallbacks;
            this.f22631x = interfaceC35951a;
            this.f22632y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bc3.c0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC2994c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22630w;
            InterfaceC35951a interfaceC35951a = this.f22631x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22632y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.access.omronauth.view.OmronAuthFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5721c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22633w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22634x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22635y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5721c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22633w = componentCallbacks;
            this.f22634x = interfaceC35951a;
            this.f22635y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u50.d] */
        @Override // c93.InterfaceC4339a
        public final C34540d invoke() {
            ComponentCallbacks componentCallbacks = this.f22633w;
            InterfaceC35951a interfaceC35951a = this.f22634x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22635y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34540d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.access.omronauth.view.OmronAuthFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5722d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22636w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5722d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22636w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22636w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.access.omronauth.view.OmronAuthFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5723e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22637w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22638x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22639y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22640z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5723e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22637w = componentCallbacks;
            this.f22638x = interfaceC35951a;
            this.f22639y = interfaceC4339a;
            this.f22640z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, x50.b] */
        @Override // c93.InterfaceC4339a
        public final C37987b invoke() {
            return AbstractC34132o.m107857B(this.f22637w, this.f22638x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37987b.class), this.f22639y, this.f22640z);
        }
    }

    public OmronAuthFragment() {
        C39850b0 c39850b0 = new C39850b0(this, 5);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5719a(this, null, c39850b0));
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5723e(this, null, new C5722d(this), null));
        this.applicationScope = AbstractC30060g.m92087G(enumC23463i, new C5720b(this, null, null));
        this.oauthPerformer = AbstractC30060g.m92087G(enumC23463i, new C5721c(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final InterfaceC2994c0 m16961C() {
        return (InterfaceC2994c0) this.applicationScope.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C34540d m16962D() {
        return (C34540d) this.oauthPerformer.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C37987b m16963E() {
        return (C37987b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m16964F(OmronAuthFragment omronAuthFragment) {
        return AbstractC15751g.m44431K(omronAuthFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m16965G(OmronAuthFragment omronAuthFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C36834a(AbstractC5583n.m16799z(omronAuthFragment), omronAuthFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C36834a c36834a = (C36834a) objM87133R;
            C37987b c37987bM16963E = omronAuthFragment.m16963E();
            boolean zM87157i = c28655q.m87157i(omronAuthFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C40085a(omronAuthFragment, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC40089e.m128512e(c36834a, c37987bM16963E, (Function1) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m16966H(OmronAuthFragment omronAuthFragment, String omronUrl) {
        AbstractC22676k.m65750j(omronUrl, "omronUrl");
        omronAuthFragment.m16962D().m109151e(omronUrl, omronAuthFragment.m16961C(), new C40085a(omronAuthFragment, 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m16967I(OmronAuthFragment omronAuthFragment, InterfaceC37986a.j it) {
        AbstractC22676k.m65750j(it, "it");
        omronAuthFragment.m16963E().m121673n(it);
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        AbstractC28163g0.m85256l(this);
        m16963E().m121673n(InterfaceC37986a.i.f162653a);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 22), true, 1560889989));
    }
}
