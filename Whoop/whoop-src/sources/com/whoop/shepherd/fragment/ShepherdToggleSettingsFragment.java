package com.whoop.shepherd.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import je2.C21623b;
import je2.InterfaceC21622a;
import je2.InterfaceC21624c;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import ke2.AbstractC22423c;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no0.C26944e0;
import nr0.C27072e;
import o02.InterfaceC27353d;
import oe2.C27876a;
import oe2.C27878c;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pe2.AbstractC29117a;
import pe2.C29118b;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'¨\u0006+²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lje2/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()Lje2/b;", "viewModel", "Lfi0/a;", "x", "getAnalytics", "()Lfi0/a;", "analytics", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "z", "getNavigatorReducer", "()Lo02/d;", "navigatorReducer", "Lje2/c;", "viewState", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ShepherdToggleSettingsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10205e(this, null, new C10204d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigatorReducer;

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10201a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30836w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30837x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30838y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10201a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30836w = componentCallbacks;
            this.f30837x = interfaceC35951a;
            this.f30838y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            ComponentCallbacks componentCallbacks = this.f30836w;
            InterfaceC35951a interfaceC35951a = this.f30837x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30838y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10202b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30839w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30840x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30841y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10202b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30839w = componentCallbacks;
            this.f30840x = interfaceC35951a;
            this.f30841y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30839w;
            InterfaceC35951a interfaceC35951a = this.f30840x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30841y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10203c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30842w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30843x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30844y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10203c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30842w = componentCallbacks;
            this.f30843x = interfaceC35951a;
            this.f30844y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f30842w;
            InterfaceC35951a interfaceC35951a = this.f30843x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30844y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10204d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30845w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10204d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30845w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30845w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10205e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30846w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30847x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30848y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30849z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10205e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30846w = componentCallbacks;
            this.f30847x = interfaceC35951a;
            this.f30848y = interfaceC4339a;
            this.f30849z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, je2.b] */
        @Override // c93.InterfaceC4339a
        public final C21623b invoke() {
            return AbstractC34132o.m107857B(this.f30846w, this.f30847x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21623b.class), this.f30848y, this.f30849z);
        }
    }

    public ShepherdToggleSettingsFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10201a(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10202b(this, null, new C27072e(this, 16)));
        this.navigatorReducer = AbstractC30060g.m92087G(enumC23463i, new C10203c(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final C21623b m25904C() {
        return (C21623b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C34911a m25905D(ShepherdToggleSettingsFragment shepherdToggleSettingsFragment) {
        return AbstractC15751g.m44431K(shepherdToggleSettingsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m25906E(ShepherdToggleSettingsFragment shepherdToggleSettingsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(shepherdToggleSettingsFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29118b(abstractC12939a0, (InterfaceC14515a) AbstractC29125c.m88492A(shepherdToggleSettingsFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null), shepherdToggleSettingsFragment.getNavigator());
                c28655q.m87172p0(objM87133R2);
            }
            C29118b c29118b = (C29118b) objM87133R2;
            InterfaceC21624c interfaceC21624cM25907F = m25907F(AbstractC28683x.m87260n(shepherdToggleSettingsFragment.m25904C().getViewState(), InterfaceC21624c.a.INSTANCE.m60854c(), null, c28655q, 0, 2));
            boolean zM87157i = c28655q.m87157i(abstractC12939a0) | c28655q.m87157i(c29118b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C27876a(abstractC12939a0, c29118b, 2);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i2 = c28655q.m87157i(shepherdToggleSettingsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C26944e0(shepherdToggleSettingsFragment, 17);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC22423c.m64566C(interfaceC21624cM25907F, function1, (Function1) objM87133R4, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final InterfaceC21624c m25907F(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC21624c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m25908G(AbstractC12939a0 abstractC12939a0, C29118b c29118b, InterfaceC21622a.e navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(InterfaceC21622a.b.f82990a)) {
            abstractC12939a0.m36410z();
        } else if (navEvent.equals(InterfaceC21622a.d.f82993a)) {
            c29118b.m88488a(new AbstractC29117a.k("arrhythmiaSettings"));
        } else {
            if (!(navEvent instanceof InterfaceC21622a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c29118b.m88488a(new AbstractC29117a.a(((InterfaceC21622a.c) navEvent).getAction()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m25909H(ShepherdToggleSettingsFragment shepherdToggleSettingsFragment, InterfaceC21622a.j viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        shepherdToggleSettingsFragment.m25904C().m60838o(viewEvent);
        return C23454a0.f92919a;
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 5), true, 1253348868));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m25904C().m60838o(InterfaceC21622a.f.f82994a);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }
}
