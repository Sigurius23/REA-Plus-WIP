package com.whoop.pairing.membershipAdjustment;

import a80.C0539c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c22.EnumC3894b;
import c93.InterfaceC4339a;
import com.whoop.pairing.membershipAdjustment.MembershipAdjustmentFragment;
import com.whoop.pairing.membershipAdjustment.navigation.MembershipAdjustmentNavHostDestination;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import f22.AbstractC14031c;
import f22.AbstractC14032d;
import f22.C14034f;
import g22.C15284d;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p003a1.C0103b;
import p114eb.C12991u0;
import p390p1.C28635l;
import p390p1.C28655q;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001dR\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lg22/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "I", "()Lg22/d;", "viewModel", "", "x", "G", "()Ljava/lang/String;", "strapSerial", "y", "H", "strapSignature", "Lc22/b;", "z", "F", "()Lc22/b;", "source", "Lf22/f;", "E", "()Lf22/f;", "navigationRouter", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MembershipAdjustmentFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h navigationRouter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9623d(this, null, new C9622c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h strapSerial;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h strapSignature;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: com.whoop.pairing.membershipAdjustment.MembershipAdjustmentFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9620a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28224a;

        static {
            int[] iArr = new int[EnumC3894b.values().length];
            try {
                iArr[EnumC3894b.PAIRING_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3894b.PAIRING_FIRST_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28224a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.membershipAdjustment.MembershipAdjustmentFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9621b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28225w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28226x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28227y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9621b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28225w = componentCallbacks;
            this.f28226x = interfaceC35951a;
            this.f28227y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [f22.f, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14034f invoke() {
            ComponentCallbacks componentCallbacks = this.f28225w;
            InterfaceC35951a interfaceC35951a = this.f28226x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28227y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14034f.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.membershipAdjustment.MembershipAdjustmentFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9622c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28228w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9622c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f28228w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f28228w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pairing.membershipAdjustment.MembershipAdjustmentFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9623d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28229w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28230x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28231y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f28232z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9623d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f28229w = componentCallbacks;
            this.f28230x = interfaceC35951a;
            this.f28231y = interfaceC4339a;
            this.f28232z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, g22.d] */
        @Override // c93.InterfaceC4339a
        public final C15284d invoke() {
            return AbstractC34132o.m107857B(this.f28229w, this.f28230x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15284d.class), this.f28231y, this.f28232z);
        }
    }

    public MembershipAdjustmentFragment() {
        final int i13 = 0;
        this.strapSerial = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: c22.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MembershipAdjustmentFragment f15939x;

            {
                this.f15939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return MembershipAdjustmentFragment.m23191N(this.f15939x);
                    case 1:
                        return MembershipAdjustmentFragment.m23192O(this.f15939x);
                    case 2:
                        return MembershipAdjustmentFragment.m23190M(this.f15939x);
                    default:
                        return MembershipAdjustmentFragment.m23187J(this.f15939x);
                }
            }
        });
        final int i14 = 1;
        this.strapSignature = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: c22.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MembershipAdjustmentFragment f15939x;

            {
                this.f15939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return MembershipAdjustmentFragment.m23191N(this.f15939x);
                    case 1:
                        return MembershipAdjustmentFragment.m23192O(this.f15939x);
                    case 2:
                        return MembershipAdjustmentFragment.m23190M(this.f15939x);
                    default:
                        return MembershipAdjustmentFragment.m23187J(this.f15939x);
                }
            }
        });
        final int i15 = 2;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: c22.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MembershipAdjustmentFragment f15939x;

            {
                this.f15939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return MembershipAdjustmentFragment.m23191N(this.f15939x);
                    case 1:
                        return MembershipAdjustmentFragment.m23192O(this.f15939x);
                    case 2:
                        return MembershipAdjustmentFragment.m23190M(this.f15939x);
                    default:
                        return MembershipAdjustmentFragment.m23187J(this.f15939x);
                }
            }
        });
        final int i16 = 3;
        this.navigationRouter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9621b(this, null, new InterfaceC4339a(this) { // from class: c22.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MembershipAdjustmentFragment f15939x;

            {
                this.f15939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return MembershipAdjustmentFragment.m23191N(this.f15939x);
                    case 1:
                        return MembershipAdjustmentFragment.m23192O(this.f15939x);
                    case 2:
                        return MembershipAdjustmentFragment.m23190M(this.f15939x);
                    default:
                        return MembershipAdjustmentFragment.m23187J(this.f15939x);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    private final C14034f m23182E() {
        return (C14034f) this.navigationRouter.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final EnumC3894b m23183F() {
        return (EnumC3894b) this.source.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final String m23184G() {
        return (String) this.strapSerial.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final String m23185H() {
        return (String) this.strapSignature.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C15284d m23186I() {
        return (C15284d) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m23187J(MembershipAdjustmentFragment membershipAdjustmentFragment) {
        return AbstractC15751g.m44431K(membershipAdjustmentFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m23188K(MembershipAdjustmentFragment membershipAdjustmentFragment, Composer composer, int i13) {
        MembershipAdjustmentNavHostDestination membershipAdjustmentNavHostDestination;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C15284d c15284dM23186I = membershipAdjustmentFragment.m23186I();
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("MembershipAdjustmentNavHost", null, c28655q, 6, 2);
            int i14 = C9620a.f28224a[membershipAdjustmentFragment.m23183F().ordinal()];
            if (i14 == 1) {
                membershipAdjustmentNavHostDestination = MembershipAdjustmentNavHostDestination.PAIRING_FLOW_MEMBERSHIP_ADJUSTMENT;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                membershipAdjustmentNavHostDestination = MembershipAdjustmentNavHostDestination.PAIRING_FIRST_FLOW_MEMBERSHIP_ADJUSTMENT;
            }
            MembershipAdjustmentNavHostDestination membershipAdjustmentNavHostDestination2 = membershipAdjustmentNavHostDestination;
            boolean zM87157i = c28655q.m87157i(membershipAdjustmentFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0103b(membershipAdjustmentFragment, 25);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1329o1 parentFragmentManager = membershipAdjustmentFragment.getParentFragmentManager();
            AbstractC22676k.m65749i(parentFragmentManager, "getParentFragmentManager(...)");
            AbstractC14031c.m39941o(c15284dM23186I, c12991u0M58963a, membershipAdjustmentNavHostDestination2, (Function1) objM87133R, parentFragmentManager, membershipAdjustmentFragment.m23184G(), membershipAdjustmentFragment.m23185H(), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m23189L(MembershipAdjustmentFragment membershipAdjustmentFragment, AbstractC14032d it) {
        AbstractC22676k.m65750j(it, "it");
        membershipAdjustmentFragment.m23182E().m39955a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002c A[RETURN] */
    /* JADX INFO: renamed from: M */
    public static final EnumC3894b m23190M(MembershipAdjustmentFragment membershipAdjustmentFragment) {
        String string = membershipAdjustmentFragment.requireArguments().getString("source");
        if (string == null) {
            string = "";
        }
        EnumC3894b enumC3894b = EnumC3894b.PAIRING_FLOW;
        for (EnumC3894b enumC3894b2 : EnumC3894b.values()) {
            if (AbstractC22676k.m65745e(enumC3894b2.name(), string)) {
                if (enumC3894b2 == null) {
                    return enumC3894b;
                }
                return enumC3894b2;
            }
        }
        enumC3894b2 = null;
        if (enumC3894b2 == null) {
            return enumC3894b;
        }
        return enumC3894b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final String m23191N(MembershipAdjustmentFragment membershipAdjustmentFragment) {
        String string = membershipAdjustmentFragment.requireArguments().getString("strapSerial");
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final String m23192O(MembershipAdjustmentFragment membershipAdjustmentFragment) {
        String string = membershipAdjustmentFragment.requireArguments().getString("strapSignature");
        return string == null ? "" : string;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 20), true, 2107107850));
    }
}
