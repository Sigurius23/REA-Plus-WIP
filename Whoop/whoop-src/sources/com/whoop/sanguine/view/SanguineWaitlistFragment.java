package com.whoop.sanguine.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.sanguine.view.SanguineWaitlistFragment;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r72.AbstractC31054a;
import r72.C31055b;
import uf3.C34911a;
import v72.AbstractC35773d;
import v72.C35774e;
import vf3.InterfaceC35951a;
import w20.C36727q;
import w72.C36913f;
import x30.C37894h1;
import z72.AbstractC40161g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0006R\u001b\u0010)\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lcom/whoop/sanguine/view/SanguineWaitlistFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "G", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lw72/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "I", "()Lw72/f;", "viewModel", "Lr72/b;", "x", "E", "()Lr72/b;", "analyticsInteractor", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "z", "F", "signUpOnEntry", "", "H", "()Ljava/lang/String;", "source", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SanguineWaitlistFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9971d(this, null, new C9970c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsInteractor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h signUpOnEntry;

    /* JADX INFO: renamed from: com.whoop.sanguine.view.SanguineWaitlistFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9968a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29437w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29438x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29439y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9968a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29437w = componentCallbacks;
            this.f29438x = interfaceC35951a;
            this.f29439y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, r72.b] */
        @Override // c93.InterfaceC4339a
        public final C31055b invoke() {
            ComponentCallbacks componentCallbacks = this.f29437w;
            InterfaceC35951a interfaceC35951a = this.f29438x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29439y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31055b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sanguine.view.SanguineWaitlistFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9969b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29440w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29441x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29442y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9969b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29440w = componentCallbacks;
            this.f29441x = interfaceC35951a;
            this.f29442y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f29440w;
            InterfaceC35951a interfaceC35951a = this.f29441x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29442y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sanguine.view.SanguineWaitlistFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9970c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29443w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9970c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f29443w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f29443w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sanguine.view.SanguineWaitlistFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9971d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29444w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29445x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29446y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f29447z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9971d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f29444w = componentCallbacks;
            this.f29445x = interfaceC35951a;
            this.f29446y = interfaceC4339a;
            this.f29447z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, w72.f] */
        @Override // c93.InterfaceC4339a
        public final C36913f invoke() {
            return AbstractC34132o.m107857B(this.f29444w, this.f29445x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36913f.class), this.f29446y, this.f29447z);
        }
    }

    public SanguineWaitlistFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsInteractor = AbstractC30060g.m92087G(enumC23463i, new C9968a(this, null, null));
        final int i13 = 0;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C9969b(this, null, new InterfaceC4339a(this) { // from class: z72.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SanguineWaitlistFragment f173280x;

            {
                this.f173280x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SanguineWaitlistFragment.m24469J(this.f173280x);
                    case 1:
                        return Boolean.valueOf(SanguineWaitlistFragment.m24473N(this.f173280x));
                    default:
                        return SanguineWaitlistFragment.m24474O(this.f173280x);
                }
            }
        }));
        final int i14 = 1;
        this.signUpOnEntry = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: z72.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SanguineWaitlistFragment f173280x;

            {
                this.f173280x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return SanguineWaitlistFragment.m24469J(this.f173280x);
                    case 1:
                        return Boolean.valueOf(SanguineWaitlistFragment.m24473N(this.f173280x));
                    default:
                        return SanguineWaitlistFragment.m24474O(this.f173280x);
                }
            }
        });
        final int i15 = 2;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: z72.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SanguineWaitlistFragment f173280x;

            {
                this.f173280x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return SanguineWaitlistFragment.m24469J(this.f173280x);
                    case 1:
                        return Boolean.valueOf(SanguineWaitlistFragment.m24473N(this.f173280x));
                    default:
                        return SanguineWaitlistFragment.m24474O(this.f173280x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private final C31055b m24464E() {
        return (C31055b) this.analyticsInteractor.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final boolean m24465F() {
        return ((Boolean) this.signUpOnEntry.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    private final boolean m24466G() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("signUpOnEntry", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    private final String m24467H() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C36913f m24468I() {
        return (C36913f) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m24469J(SanguineWaitlistFragment sanguineWaitlistFragment) {
        return AbstractC15751g.m44431K(sanguineWaitlistFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m24470K(SanguineWaitlistFragment sanguineWaitlistFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C35774e c35774e = new C35774e(sanguineWaitlistFragment.getNavigator(), AbstractC5583n.m16799z(sanguineWaitlistFragment));
            C36913f c36913fM24468I = sanguineWaitlistFragment.m24468I();
            String strM24467H = sanguineWaitlistFragment.m24467H();
            boolean zM24465F = sanguineWaitlistFragment.m24465F();
            boolean zM87157i = c28655q.m87157i(sanguineWaitlistFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C37894h1(sanguineWaitlistFragment, 12);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c35774e);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C37894h1(c35774e, 13);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC40161g.m128832j0(c36913fM24468I, strM24467H, zM24465F, function1, (Function1) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m24471L(SanguineWaitlistFragment sanguineWaitlistFragment, AbstractC31054a analyticsEvent) {
        AbstractC22676k.m65750j(analyticsEvent, "analyticsEvent");
        sanguineWaitlistFragment.m24464E().m95615a(analyticsEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m24472M(C35774e c35774e, AbstractC35773d navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c35774e.m113371a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final boolean m24473N(SanguineWaitlistFragment sanguineWaitlistFragment) {
        return sanguineWaitlistFragment.m24466G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final String m24474O(SanguineWaitlistFragment sanguineWaitlistFragment) {
        String string;
        Bundle arguments = sanguineWaitlistFragment.getArguments();
        return (arguments == null || (string = arguments.getString("source")) == null) ? "health_tab" : string;
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 24), true, 1591078220));
    }
}
