package com.whoop.universalcheckout.features;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.universalcheckout.features.UniversalCheckoutFragment;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.EnumC21177x0;
import jo2.C21842e;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import oe2.C27878c;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001d\u0010\"\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001d\u0010'\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&R\u001d\u0010*\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001b\u0010/\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "L", "()Ljava/lang/String;", "payloadArg", "x", "K", "pathArg", "y", "I", "cartIdArg", "z", "J", "methodArg", "Lj02/x0;", "E", "H", "()Lj02/x0;", "autoTriggerArg", "F", "M", "receiptCartIdArg", "Ljo2/e;", "G", "N", "()Ljo2/e;", "stripeFlowControllerManager", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UniversalCheckoutFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h autoTriggerArg;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h receiptCartIdArg;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h stripeFlowControllerManager = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10634a(this, null, null));

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h payloadArg;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h pathArg;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h cartIdArg;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h methodArg;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10634a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32399w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32400x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32401y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10634a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32399w = componentCallbacks;
            this.f32400x = interfaceC35951a;
            this.f32401y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jo2.e] */
        @Override // c93.InterfaceC4339a
        public final C21842e invoke() {
            ComponentCallbacks componentCallbacks = this.f32399w;
            InterfaceC35951a interfaceC35951a = this.f32400x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32401y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21842e.class), interfaceC35951a);
        }
    }

    public UniversalCheckoutFragment() {
        final int i13 = 0;
        this.payloadArg = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalCheckoutFragment f119193x;

            {
                this.f119193x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return UniversalCheckoutFragment.m27535R(this.f119193x);
                    case 1:
                        return UniversalCheckoutFragment.m27534Q(this.f119193x);
                    case 2:
                        return UniversalCheckoutFragment.m27525G(this.f119193x);
                    case 3:
                        return UniversalCheckoutFragment.m27532O(this.f119193x);
                    case 4:
                        return UniversalCheckoutFragment.m27524F(this.f119193x);
                    default:
                        return UniversalCheckoutFragment.m27536S(this.f119193x);
                }
            }
        });
        final int i14 = 1;
        this.pathArg = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalCheckoutFragment f119193x;

            {
                this.f119193x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return UniversalCheckoutFragment.m27535R(this.f119193x);
                    case 1:
                        return UniversalCheckoutFragment.m27534Q(this.f119193x);
                    case 2:
                        return UniversalCheckoutFragment.m27525G(this.f119193x);
                    case 3:
                        return UniversalCheckoutFragment.m27532O(this.f119193x);
                    case 4:
                        return UniversalCheckoutFragment.m27524F(this.f119193x);
                    default:
                        return UniversalCheckoutFragment.m27536S(this.f119193x);
                }
            }
        });
        final int i15 = 2;
        this.cartIdArg = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalCheckoutFragment f119193x;

            {
                this.f119193x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return UniversalCheckoutFragment.m27535R(this.f119193x);
                    case 1:
                        return UniversalCheckoutFragment.m27534Q(this.f119193x);
                    case 2:
                        return UniversalCheckoutFragment.m27525G(this.f119193x);
                    case 3:
                        return UniversalCheckoutFragment.m27532O(this.f119193x);
                    case 4:
                        return UniversalCheckoutFragment.m27524F(this.f119193x);
                    default:
                        return UniversalCheckoutFragment.m27536S(this.f119193x);
                }
            }
        });
        final int i16 = 3;
        this.methodArg = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalCheckoutFragment f119193x;

            {
                this.f119193x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return UniversalCheckoutFragment.m27535R(this.f119193x);
                    case 1:
                        return UniversalCheckoutFragment.m27534Q(this.f119193x);
                    case 2:
                        return UniversalCheckoutFragment.m27525G(this.f119193x);
                    case 3:
                        return UniversalCheckoutFragment.m27532O(this.f119193x);
                    case 4:
                        return UniversalCheckoutFragment.m27524F(this.f119193x);
                    default:
                        return UniversalCheckoutFragment.m27536S(this.f119193x);
                }
            }
        });
        final int i17 = 4;
        this.autoTriggerArg = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalCheckoutFragment f119193x;

            {
                this.f119193x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return UniversalCheckoutFragment.m27535R(this.f119193x);
                    case 1:
                        return UniversalCheckoutFragment.m27534Q(this.f119193x);
                    case 2:
                        return UniversalCheckoutFragment.m27525G(this.f119193x);
                    case 3:
                        return UniversalCheckoutFragment.m27532O(this.f119193x);
                    case 4:
                        return UniversalCheckoutFragment.m27524F(this.f119193x);
                    default:
                        return UniversalCheckoutFragment.m27536S(this.f119193x);
                }
            }
        });
        final int i18 = 5;
        this.receiptCartIdArg = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalCheckoutFragment f119193x;

            {
                this.f119193x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return UniversalCheckoutFragment.m27535R(this.f119193x);
                    case 1:
                        return UniversalCheckoutFragment.m27534Q(this.f119193x);
                    case 2:
                        return UniversalCheckoutFragment.m27525G(this.f119193x);
                    case 3:
                        return UniversalCheckoutFragment.m27532O(this.f119193x);
                    case 4:
                        return UniversalCheckoutFragment.m27524F(this.f119193x);
                    default:
                        return UniversalCheckoutFragment.m27536S(this.f119193x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final EnumC21177x0 m27524F(UniversalCheckoutFragment universalCheckoutFragment) {
        EnumC21177x0.Companion companion = EnumC21177x0.INSTANCE;
        Bundle arguments = universalCheckoutFragment.getArguments();
        return companion.m59420a(arguments != null ? arguments.getString("autoTrigger") : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m27525G(UniversalCheckoutFragment universalCheckoutFragment) {
        return universalCheckoutFragment.requireArguments().getString("cartId");
    }

    /* JADX INFO: renamed from: H */
    private final EnumC21177x0 m27526H() {
        return (EnumC21177x0) this.autoTriggerArg.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final String m27527I() {
        return (String) this.cartIdArg.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final String m27528J() {
        return (String) this.methodArg.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final String m27529K() {
        return (String) this.pathArg.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final String m27530L() {
        return (String) this.payloadArg.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final String m27531M() {
        return (String) this.receiptCartIdArg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final String m27532O(UniversalCheckoutFragment universalCheckoutFragment) {
        String string = universalCheckoutFragment.requireArguments().getString("method");
        if (string != null) {
            return AbstractC28188o1.m85315e(string);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m27533P(UniversalCheckoutFragment universalCheckoutFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Bundle arguments = universalCheckoutFragment.getArguments();
            String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
            if (strM85315e == null || AbstractC39414r.m125890i0(strM85315e)) {
                strM85315e = null;
            }
            if (strM85315e == null) {
                strM85315e = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
            }
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("UniversalCheckoutNavHost", null, c28655q, 6, 2);
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(universalCheckoutFragment);
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = universalCheckoutFragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            AbstractC10635a.m27551l(c12991u0M58963a, abstractC12939a0M16799z, abstractActivityC1340r0RequireActivity, strM85315e, universalCheckoutFragment.m27529K(), universalCheckoutFragment.m27530L(), universalCheckoutFragment.m27527I(), universalCheckoutFragment.m27528J(), universalCheckoutFragment.m27526H(), universalCheckoutFragment.m27531M(), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final String m27534Q(UniversalCheckoutFragment universalCheckoutFragment) {
        String strM85315e;
        String string = universalCheckoutFragment.requireArguments().getString("path");
        return (string == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) ? "" : strM85315e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final String m27535R(UniversalCheckoutFragment universalCheckoutFragment) {
        String strM85315e;
        String string = universalCheckoutFragment.requireArguments().getString("payload");
        return (string == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) ? "" : strM85315e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final String m27536S(UniversalCheckoutFragment universalCheckoutFragment) {
        String string;
        Bundle arguments = universalCheckoutFragment.getArguments();
        if (arguments == null || (string = arguments.getString("receiptCartId")) == null || AbstractC39414r.m125890i0(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: N */
    public final C21842e m27539N() {
        return (C21842e) this.stripeFlowControllerManager.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        super.onDestroy();
        m27539N().m61817f();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        view.setImportantForAutofill(1);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 19), true, 699116135));
    }
}
