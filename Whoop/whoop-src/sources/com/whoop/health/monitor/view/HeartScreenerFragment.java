package com.whoop.health.monitor.view;

import a80.C0539c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.util.TextResource;
import com.whoop.health.monitor.view.HeartScreenerFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import pi1.AbstractC29253c;
import pi1.C29254d;
import q83.AbstractC30060g;
import ti1.AbstractC33852d;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import xi1.C38322b;
import zi1.AbstractC40679i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lcom/whoop/health/monitor/view/HeartScreenerFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lpi1/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lpi1/d;", "analyticsHelper", "", "x", "D", "()Ljava/lang/String;", "source", "Lxi1/b;", "y", "C", "()Lxi1/b;", "router", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HeartScreenerFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h router;

    /* JADX INFO: renamed from: com.whoop.health.monitor.view.HeartScreenerFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8776a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26158w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26159x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26160y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8776a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26158w = componentCallbacks;
            this.f26159x = interfaceC35951a;
            this.f26160y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pi1.d] */
        @Override // c93.InterfaceC4339a
        public final C29254d invoke() {
            ComponentCallbacks componentCallbacks = this.f26158w;
            InterfaceC35951a interfaceC35951a = this.f26159x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26160y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29254d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.health.monitor.view.HeartScreenerFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8777b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26161w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26162x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26163y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8777b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26161w = componentCallbacks;
            this.f26162x = interfaceC35951a;
            this.f26163y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xi1.b] */
        @Override // c93.InterfaceC4339a
        public final C38322b invoke() {
            ComponentCallbacks componentCallbacks = this.f26161w;
            InterfaceC35951a interfaceC35951a = this.f26162x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26163y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38322b.class), interfaceC35951a);
        }
    }

    public HeartScreenerFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8776a(this, null, null));
        final int i13 = 0;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: aj1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HeartScreenerFragment f3427x;

            {
                this.f3427x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return HeartScreenerFragment.m21508G(this.f3427x);
                    default:
                        return HeartScreenerFragment.m21507F(this.f3427x);
                }
            }
        });
        final int i14 = 1;
        this.router = AbstractC30060g.m92087G(enumC23463i, new C8777b(this, null, new InterfaceC4339a(this) { // from class: aj1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HeartScreenerFragment f3427x;

            {
                this.f3427x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return HeartScreenerFragment.m21508G(this.f3427x);
                    default:
                        return HeartScreenerFragment.m21507F(this.f3427x);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    private final C29254d m21503B() {
        return (C29254d) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final C38322b m21504C() {
        return (C38322b) this.router.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final String m21505D() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m21506E(HeartScreenerFragment heartScreenerFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC40679i.m132067c(new TextResource.C8688b(AbstractC33852d.f141769b, null, 2, null), heartScreenerFragment.m21504C(), c28655q, TextResource.C8688b.f25889c);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m21507F(HeartScreenerFragment heartScreenerFragment) {
        return AbstractC15751g.m44431K(heartScreenerFragment.requireActivity(), AbstractC5583n.m16799z(heartScreenerFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m21508G(HeartScreenerFragment heartScreenerFragment) {
        String string;
        Bundle arguments = heartScreenerFragment.getArguments();
        return (arguments == null || (string = arguments.getString("source")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        m21503B().m88876a(new AbstractC29253c.a(m21505D()));
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 3), true, -858322730));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }
}
