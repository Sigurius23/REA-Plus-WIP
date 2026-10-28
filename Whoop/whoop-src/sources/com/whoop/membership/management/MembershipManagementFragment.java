package com.whoop.membership.management;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.InterfaceC1357w1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import ax1.AbstractC2119a;
import ax1.C2120b;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.constants.FragmentResultKeys;
import com.whoop.membership.management.MembershipManagementFragment;
import com.whoop.membership.management.navigation.AbstractC9126a;
import com.whoop.membership.management.navigation.AbstractC9127b;
import com.whoop.membership.management.navigation.C9128c;
import com.whoop.membership.management.navigation.MembershipManagementNavHostDestination;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.internal.state.utils.internal.C19381d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import jf3.C21647a;
import jx1.C22011d0;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lx1.C24795f;
import lx1.InterfaceC24794e;
import o02.InterfaceC27353d;
import or2.AbstractC28163g0;
import or2.C28216y;
import p114eb.AbstractC12939a0;
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
import qm2.C30493j;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import w20.C36727q;
import yo1.C39689b;
import zw1.EnumC41176c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u00106¨\u0006:²\u0006\f\u00109\u001a\u0002088\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/membership/management/MembershipManagementFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ljx1/d0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "M", "()Ljx1/d0;", "viewModel", "Lo02/d;", "x", "I", "()Lo02/d;", "baseNavReducer", "Lax1/b;", "y", "H", "()Lax1/b;", "analytics", "Lor2/y;", "z", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lzw1/c;", "E", "L", "()Lzw1/c;", "startDestination", "", "F", "K", "()Ljava/lang/String;", "payload", "", "G", "J", "()Z", "openFamilyPlan", "Lcom/whoop/membership/management/navigation/c;", "navRouter", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MembershipManagementFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h startDestination;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h payload;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h openFamilyPlan;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9121g(this, null, new C9120f(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h baseNavReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: com.whoop.membership.management.MembershipManagementFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9115a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27255a;

        static {
            int[] iArr = new int[EnumC41176c.values().length];
            try {
                iArr[EnumC41176c.MEMBERSHIP_MANAGEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC41176c.MEMBERSHIP_ADJUSTMENT_CHECKOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC41176c.CHECKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27255a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.MembershipManagementFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9116b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27256w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27257x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27258y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9116b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27256w = componentCallbacks;
            this.f27257x = interfaceC35951a;
            this.f27258y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.membership.management.navigation.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C9128c invoke() {
            ComponentCallbacks componentCallbacks = this.f27256w;
            InterfaceC35951a interfaceC35951a = this.f27257x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27258y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9128c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.MembershipManagementFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9117c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27259w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27260x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27261y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9117c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27259w = componentCallbacks;
            this.f27260x = interfaceC35951a;
            this.f27261y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f27259w;
            InterfaceC35951a interfaceC35951a = this.f27260x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27261y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.MembershipManagementFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9118d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27262w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27263x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27264y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9118d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27262w = componentCallbacks;
            this.f27263x = interfaceC35951a;
            this.f27264y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ax1.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C2120b invoke() {
            ComponentCallbacks componentCallbacks = this.f27262w;
            InterfaceC35951a interfaceC35951a = this.f27263x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27264y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2120b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.MembershipManagementFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9119e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27265w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27266x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27267y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9119e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27265w = componentCallbacks;
            this.f27266x = interfaceC35951a;
            this.f27267y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f27265w;
            InterfaceC35951a interfaceC35951a = this.f27266x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27267y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.MembershipManagementFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9120f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27268w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9120f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27268w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27268w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.MembershipManagementFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9121g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27269w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27270x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27271y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27272z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9121g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27269w = componentCallbacks;
            this.f27270x = interfaceC35951a;
            this.f27271y = interfaceC4339a;
            this.f27272z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, jx1.d0] */
        @Override // c93.InterfaceC4339a
        public final C22011d0 invoke() {
            return AbstractC34132o.m107857B(this.f27269w, this.f27270x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22011d0.class), this.f27271y, this.f27272z);
        }
    }

    public MembershipManagementFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.baseNavReducer = AbstractC30060g.m92087G(enumC23463i, new C9117c(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C9118d(this, null, null));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C9119e(this, null, null));
        final int i13 = 0;
        this.startDestination = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: zw1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MembershipManagementFragment f177643x;

            {
                this.f177643x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return MembershipManagementFragment.m22774W(this.f177643x);
                    case 1:
                        return MembershipManagementFragment.m22773V(this.f177643x);
                    default:
                        return Boolean.valueOf(MembershipManagementFragment.m22772U(this.f177643x));
                }
            }
        });
        final int i14 = 1;
        this.payload = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: zw1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MembershipManagementFragment f177643x;

            {
                this.f177643x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return MembershipManagementFragment.m22774W(this.f177643x);
                    case 1:
                        return MembershipManagementFragment.m22773V(this.f177643x);
                    default:
                        return Boolean.valueOf(MembershipManagementFragment.m22772U(this.f177643x));
                }
            }
        });
        final int i15 = 2;
        this.openFamilyPlan = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: zw1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MembershipManagementFragment f177643x;

            {
                this.f177643x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return MembershipManagementFragment.m22774W(this.f177643x);
                    case 1:
                        return MembershipManagementFragment.m22773V(this.f177643x);
                    default:
                        return Boolean.valueOf(MembershipManagementFragment.m22772U(this.f177643x));
                }
            }
        });
    }

    /* JADX INFO: renamed from: H */
    private final C2120b m22759H() {
        return (C2120b) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final InterfaceC27353d m22760I() {
        return (InterfaceC27353d) this.baseNavReducer.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final boolean m22761J() {
        return ((Boolean) this.openFamilyPlan.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    private final String m22762K() {
        return (String) this.payload.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final EnumC41176c m22763L() {
        return (EnumC41176c) this.startDestination.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C22011d0 m22764M() {
        return (C22011d0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m22765N(final MembershipManagementFragment membershipManagementFragment, Composer composer, int i13) throws UnsupportedEncodingException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("MembershipManagementNavHost", null, c28655q, 6, 2);
            boolean zM87157i = c28655q.m87157i(membershipManagementFragment) | c28655q.m87157i(c12991u0M58963a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C39689b(28, membershipManagementFragment, c12991u0M58963a);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9116b(membershipManagementFragment, null, (InterfaceC4339a) objM87133R));
            AbstractC1329o1 parentFragmentManager = membershipManagementFragment.getParentFragmentManager();
            InterfaceC1585g0 viewLifecycleOwner = membershipManagementFragment.getViewLifecycleOwner();
            boolean zM87157i2 = c28655q.m87157i(membershipManagementFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C30493j(membershipManagementFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            parentFragmentManager.m4170g0(FragmentResultKeys.SWITCH_PLAN_DIALOG_SUCCESS, viewLifecycleOwner, (InterfaceC1357w1) objM87133R2);
            C22011d0 c22011d0M22764M = membershipManagementFragment.m22764M();
            InterfaceC1585g0 viewLifecycleOwner2 = membershipManagementFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            EnumC41176c enumC41176cM22763L = membershipManagementFragment.m22763L();
            int[] iArr = C9115a.f27255a;
            MembershipManagementNavHostDestination membershipManagementNavHostDestination = iArr[enumC41176cM22763L.ordinal()] == 1 ? MembershipManagementNavHostDestination.C9125d.f27279a : MembershipManagementNavHostDestination.C9124c.f27277a;
            boolean zM87157i3 = c28655q.m87157i(interfaceC23462hM92087G);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C19381d(interfaceC23462hM92087G, 2);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(membershipManagementFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i14 = 0;
                objM87133R4 = new Function1(membershipManagementFragment) { // from class: zw1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MembershipManagementFragment f177645x;

                    {
                        this.f177645x = membershipManagementFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return MembershipManagementFragment.m22770S(this.f177645x, (InterfaceC24794e) obj);
                            default:
                                return MembershipManagementFragment.m22771T(this.f177645x, (AbstractC2119a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(membershipManagementFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                final int i15 = 1;
                objM87133R5 = new Function1(membershipManagementFragment) { // from class: zw1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MembershipManagementFragment f177645x;

                    {
                        this.f177645x = membershipManagementFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return MembershipManagementFragment.m22770S(this.f177645x, (InterfaceC24794e) obj);
                            default:
                                return MembershipManagementFragment.m22771T(this.f177645x, (AbstractC2119a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC9126a.m22803k(c22011d0M22764M, c12991u0M58963a, viewLifecycleOwner2, membershipManagementNavHostDestination, function1, function2, (Function1) objM87133R5, c28655q, 0, 0);
            int i16 = iArr[membershipManagementFragment.m22763L().ordinal()];
            if (i16 == 2) {
                AbstractC12939a0.m36374y(c12991u0M58963a, MembershipManagementNavHostDestination.C9123b.f27275a.m22792a(membershipManagementFragment.m22762K()), null, 6);
            } else if (i16 == 3) {
                Map<String, String> mapM22816x = AbstractC9126a.m22816x(membershipManagementFragment.m22762K());
                String str = mapM22816x.get("path");
                if (str == null) {
                    str = "";
                }
                String strEncode = URLEncoder.encode(str, "UTF-8");
                MembershipManagementNavHostDestination.C9122a c9122a = MembershipManagementNavHostDestination.C9122a.f27273a;
                AbstractC22676k.m65747g(strEncode);
                String str2 = mapM22816x.get("payload");
                AbstractC12939a0.m36374y(c12991u0M58963a, c9122a.m22791a(strEncode, str2 != null ? str2 : "", null, true), null, 6);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m22766O(MembershipManagementFragment membershipManagementFragment, C12991u0 c12991u0) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(membershipManagementFragment), c12991u0, membershipManagementFragment.m22760I(), membershipManagementFragment.requireActivity());
    }

    /* JADX INFO: renamed from: P */
    private static final C9128c m22767P(InterfaceC23462h interfaceC23462h) {
        return (C9128c) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m22768Q(MembershipManagementFragment membershipManagementFragment, String str, Bundle bundle) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(bundle, "<unused var>");
        membershipManagementFragment.m22764M().m62909p(C24795f.f97043a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m22769R(InterfaceC23462h interfaceC23462h, AbstractC9127b navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        m22767P(interfaceC23462h).m22823a(navigationEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m22770S(MembershipManagementFragment membershipManagementFragment, InterfaceC24794e viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        membershipManagementFragment.m22764M().m62909p(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m22771T(MembershipManagementFragment membershipManagementFragment, AbstractC2119a analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        membershipManagementFragment.m22759H().m6690a(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final boolean m22772U(MembershipManagementFragment membershipManagementFragment) {
        Bundle arguments = membershipManagementFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("openFamilyPlan", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final String m22773V(MembershipManagementFragment membershipManagementFragment) {
        String string = membershipManagementFragment.requireArguments().getString("payload");
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002c A[RETURN] */
    /* JADX INFO: renamed from: W */
    public static final EnumC41176c m22774W(MembershipManagementFragment membershipManagementFragment) {
        String string = membershipManagementFragment.requireArguments().getString("startDestination");
        if (string == null) {
            string = "";
        }
        EnumC41176c enumC41176c = EnumC41176c.MEMBERSHIP_AND_BILLING;
        for (EnumC41176c enumC41176c2 : EnumC41176c.values()) {
            if (AbstractC22676k.m65745e(enumC41176c2.name(), string)) {
                if (enumC41176c2 == null) {
                    return enumC41176c;
                }
                return enumC41176c2;
            }
        }
        enumC41176c2 = null;
        if (enumC41176c2 == null) {
            return enumC41176c;
        }
        return enumC41176c2;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
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
        if (m22761J()) {
            C28216y externalLinkNavigator = getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            externalLinkNavigator.m85422k(abstractActivityC1340r0RequireActivity);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 29), true, 1098192522));
    }
}
