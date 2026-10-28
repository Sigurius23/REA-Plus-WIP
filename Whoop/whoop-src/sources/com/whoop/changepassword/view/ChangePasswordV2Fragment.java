package com.whoop.changepassword.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import ci0.C4726a;
import com.whoop.changepassword.view.ChangePasswordV2Fragment;
import do0.AbstractC12230d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28153d;
import or2.AbstractC28163g0;
import or2.C28156e;
import p078d1.C11456i;
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
import tn0.C33958b;
import tn0.InterfaceC33957a;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;
import zn0.AbstractC40903a;
import zn0.C40904b;
import zn0.C40905c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "G", "C", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "contaier", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onCreate", "(Landroid/os/Bundle;)V", "Lzn0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Lzn0/b;", "viewModel", "Lor2/e;", "x", "D", "()Lor2/e;", "authAnalytics", "Ltn0/b;", "y", "E", "()Ltn0/b;", "changePasswordAnalytics", "Lzn0/c;", "viewState", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ChangePasswordV2Fragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6128d(this, null, new C6127c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h authAnalytics;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h changePasswordAnalytics;

    /* JADX INFO: renamed from: com.whoop.changepassword.view.ChangePasswordV2Fragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6125a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24339w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24340x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24341y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6125a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24339w = componentCallbacks;
            this.f24340x = interfaceC35951a;
            this.f24341y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.e] */
        @Override // c93.InterfaceC4339a
        public final C28156e invoke() {
            ComponentCallbacks componentCallbacks = this.f24339w;
            InterfaceC35951a interfaceC35951a = this.f24340x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24341y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28156e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.ChangePasswordV2Fragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6126b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24342w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24343x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24344y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6126b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24342w = componentCallbacks;
            this.f24343x = interfaceC35951a;
            this.f24344y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tn0.b] */
        @Override // c93.InterfaceC4339a
        public final C33958b invoke() {
            ComponentCallbacks componentCallbacks = this.f24342w;
            InterfaceC35951a interfaceC35951a = this.f24343x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24344y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33958b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.ChangePasswordV2Fragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6127c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24345w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6127c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24345w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24345w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.ChangePasswordV2Fragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6128d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24346w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24347x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24348y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24349z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6128d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24346w = componentCallbacks;
            this.f24347x = interfaceC35951a;
            this.f24348y = interfaceC4339a;
            this.f24349z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, zn0.b] */
        @Override // c93.InterfaceC4339a
        public final C40904b invoke() {
            return AbstractC34132o.m107857B(this.f24346w, this.f24347x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40904b.class), this.f24348y, this.f24349z);
        }
    }

    public ChangePasswordV2Fragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.authAnalytics = AbstractC30060g.m92087G(enumC23463i, new C6125a(this, null, null));
        this.changePasswordAnalytics = AbstractC30060g.m92087G(enumC23463i, new C6126b(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final void m18414C() {
        AbstractC28163g0.m85259o(this).m85343i();
    }

    /* JADX INFO: renamed from: D */
    private final C28156e m18415D() {
        return (C28156e) this.authAnalytics.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C33958b m18416E() {
        return (C33958b) this.changePasswordAnalytics.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final C40904b m18417F() {
        return (C40904b) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final void m18418G() {
        getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m18419H(final ChangePasswordV2Fragment changePasswordV2Fragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C40905c c40905cM18420I = m18420I(AbstractC28683x.m87260n(changePasswordV2Fragment.m18417F().getViewState(), new C40905c(false, false, false, false, null, null, null, null, null, null, null, null, null, false, null, 32767, null), null, c28655q, 0, 2));
            boolean zM87157i = c28655q.m87157i(changePasswordV2Fragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(changePasswordV2Fragment) { // from class: do0.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ChangePasswordV2Fragment f40935x;

                    {
                        this.f40935x = changePasswordV2Fragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return ChangePasswordV2Fragment.m18421J(this.f40935x, (AbstractC40903a) obj);
                            default:
                                return ChangePasswordV2Fragment.m18423L(this.f40935x, (InterfaceC33957a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(changePasswordV2Fragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C11456i(changePasswordV2Fragment, 9);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(changePasswordV2Fragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(changePasswordV2Fragment) { // from class: do0.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ChangePasswordV2Fragment f40935x;

                    {
                        this.f40935x = changePasswordV2Fragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return ChangePasswordV2Fragment.m18421J(this.f40935x, (AbstractC40903a) obj);
                            default:
                                return ChangePasswordV2Fragment.m18423L(this.f40935x, (InterfaceC33957a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC12230d.m34004k(c40905cM18420I, function1, interfaceC4339a, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final C40905c m18420I(InterfaceC28670t2 interfaceC28670t2) {
        return (C40905c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m18421J(ChangePasswordV2Fragment changePasswordV2Fragment, AbstractC40903a it) {
        AbstractC22676k.m65750j(it, "it");
        changePasswordV2Fragment.m18417F().m132571n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m18422K(ChangePasswordV2Fragment changePasswordV2Fragment) {
        changePasswordV2Fragment.m18414C();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m18423L(ChangePasswordV2Fragment changePasswordV2Fragment, InterfaceC33957a it) {
        AbstractC22676k.m65750j(it, "it");
        changePasswordV2Fragment.m18416E().m107407a(it);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onAttach(Context context) {
        AbstractC22676k.m65750j(context, "context");
        super.onAttach(context);
        AbstractC28163g0.m85250f(this, InterfaceC34116n.INSTANCE.m107848a("ChangePasswordV2Fragment"));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m18415D().m85206c(AbstractC28153d.e.f113835a);
        m18418G();
        AbstractC28163g0.m85256l(this);
        m18417F().m132571n(AbstractC40903a.e.f176263a);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup contaier, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 25), true, -389637183));
    }
}
