package com.whoop.healthspan.view;

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
import com.mapbox.common.HttpHeaders;
import com.squareup.wire.AbstractC5583n;
import com.whoop.healthspan.view.HealthspanFragment;
import dk1.AbstractC12112a;
import dk1.C12113b;
import ge3.AbstractC15751g;
import hk1.AbstractC17387a;
import hk1.C17389c;
import ik1.AbstractC18609f;
import ik1.C18610g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kk1.AbstractC22543d;
import kk1.C22541b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0006R\u001b\u0010\u001f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0006R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lcom/whoop/healthspan/view/HealthspanFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "I", "()Ljava/lang/String;", "K", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Lzr2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Lzr2/a;", "dateAndTimeProvider", "x", "G", HttpHeaders.DATE, "y", "J", "source", "Lik1/g;", "z", "L", "()Lik1/g;", "viewModel", "Lj02/o0;", "E", "getNavigator", "()Lj02/o0;", "navigator", "Ldk1/b;", "F", "()Ldk1/b;", "analyticsHelper", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HealthspanFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h date;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: com.whoop.healthspan.view.HealthspanFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8805a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26339w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26340x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26341y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8805a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26339w = componentCallbacks;
            this.f26340x = interfaceC35951a;
            this.f26341y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f26339w;
            InterfaceC35951a interfaceC35951a = this.f26340x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26341y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.view.HealthspanFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8806b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26342w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26343x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26344y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8806b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26342w = componentCallbacks;
            this.f26343x = interfaceC35951a;
            this.f26344y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26342w;
            InterfaceC35951a interfaceC35951a = this.f26343x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26344y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.view.HealthspanFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8807c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26345w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26346x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26347y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8807c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26345w = componentCallbacks;
            this.f26346x = interfaceC35951a;
            this.f26347y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dk1.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C12113b invoke() {
            ComponentCallbacks componentCallbacks = this.f26345w;
            InterfaceC35951a interfaceC35951a = this.f26346x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26347y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12113b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.view.HealthspanFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8808d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26348w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8808d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26348w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26348w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.view.HealthspanFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8809e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26349w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26350x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26351y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26352z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8809e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26349w = componentCallbacks;
            this.f26350x = interfaceC35951a;
            this.f26351y = interfaceC4339a;
            this.f26352z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ik1.g] */
        @Override // c93.InterfaceC4339a
        public final C18610g invoke() {
            return AbstractC34132o.m107857B(this.f26349w, this.f26350x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18610g.class), this.f26351y, this.f26352z);
        }
    }

    public HealthspanFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C8805a(this, null, null));
        final int i13 = 0;
        this.date = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: kk1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HealthspanFragment f88608x;

            {
                this.f88608x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return HealthspanFragment.m21646E(this.f88608x);
                    case 1:
                        return HealthspanFragment.m21658Q(this.f88608x);
                    default:
                        return HealthspanFragment.m21654M(this.f88608x);
                }
            }
        });
        final int i14 = 1;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: kk1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HealthspanFragment f88608x;

            {
                this.f88608x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return HealthspanFragment.m21646E(this.f88608x);
                    case 1:
                        return HealthspanFragment.m21658Q(this.f88608x);
                    default:
                        return HealthspanFragment.m21654M(this.f88608x);
                }
            }
        });
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8809e(this, null, new C8808d(this), null));
        final int i15 = 2;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8806b(this, null, new InterfaceC4339a(this) { // from class: kk1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HealthspanFragment f88608x;

            {
                this.f88608x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return HealthspanFragment.m21646E(this.f88608x);
                    case 1:
                        return HealthspanFragment.m21658Q(this.f88608x);
                    default:
                        return HealthspanFragment.m21654M(this.f88608x);
                }
            }
        }));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8807c(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final String m21646E(HealthspanFragment healthspanFragment) {
        return healthspanFragment.m21650I();
    }

    /* JADX INFO: renamed from: F */
    private final C12113b m21647F() {
        return (C12113b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final String m21648G() {
        return (String) this.date.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final InterfaceC41070a m21649H() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final String m21650I() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(HttpHeaders.DATE) : null;
        if (string != null && string.length() != 0) {
            return string;
        }
        String string2 = m21649H().mo133365d().toString("yyyy-MM-dd");
        AbstractC22676k.m65749i(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: renamed from: J */
    private final String m21651J() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final String m21652K() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("source")) == null) ? "healthspan" : string;
    }

    /* JADX INFO: renamed from: L */
    private final C18610g m21653L() {
        return (C18610g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m21654M(HealthspanFragment healthspanFragment) {
        return AbstractC15751g.m44431K(healthspanFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m21655N(HealthspanFragment healthspanFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C17389c c17389c = new C17389c(AbstractC5583n.m16799z(healthspanFragment), healthspanFragment.getNavigator(), null, healthspanFragment.m21647F(), healthspanFragment.m21651J(), 4, null);
                c28655q.m87172p0(c17389c);
                objM87133R = c17389c;
            }
            C17389c c17389c2 = (C17389c) objM87133R;
            C18610g c18610gM21653L = healthspanFragment.m21653L();
            boolean zM87157i = c28655q.m87157i(c17389c2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C19962a(c17389c2, 14);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(healthspanFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C19962a(healthspanFragment, 15);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC22543d.m65184y(c18610gM21653L, function1, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m21656O(C17389c c17389c, AbstractC17387a it) {
        AbstractC22676k.m65750j(it, "it");
        c17389c.m49213b(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m21657P(HealthspanFragment healthspanFragment, AbstractC12112a it) {
        AbstractC22676k.m65750j(it, "it");
        healthspanFragment.m21647F().m33489l(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final String m21658Q(HealthspanFragment healthspanFragment) {
        return healthspanFragment.m21652K();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m21653L().m53860n(new AbstractC18609f.d(m21648G()));
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 0), true, 245065630));
    }
}
