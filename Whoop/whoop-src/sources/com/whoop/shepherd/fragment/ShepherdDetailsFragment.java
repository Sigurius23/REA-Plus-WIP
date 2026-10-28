package com.whoop.shepherd.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpHeaders;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.shepherd.fragment.ShepherdDetailsFragment;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ld2.C23866a;
import mw1.C25985a;
import o02.InterfaceC27353d;
import oe2.C27876a;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
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
import td2.C33717h;
import td2.InterfaceC33715f;
import ud2.AbstractC34796e;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b*\u0010+R\u001b\u00100\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Ljava/lang/String;", "historyDate", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "x", "F", "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Ltd2/h;", "y", "G", "()Ltd2/h;", "viewModel", "Lj02/o0;", "z", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "getNavigatorReducer", "()Lo02/d;", "navigatorReducer", "Lld2/a;", "D", "()Lld2/a;", "analytics", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ShepherdDetailsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h navigatorReducer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h historyDate;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdDetailsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10183a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30769w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30770x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30771y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10183a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30769w = componentCallbacks;
            this.f30770x = interfaceC35951a;
            this.f30771y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.onboarding.OnboardingStatusChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final OnboardingStatusChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f30769w;
            InterfaceC35951a interfaceC35951a = this.f30770x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30771y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdDetailsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10184b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30772w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30773x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30774y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10184b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30772w = componentCallbacks;
            this.f30773x = interfaceC35951a;
            this.f30774y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30772w;
            InterfaceC35951a interfaceC35951a = this.f30773x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30774y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdDetailsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10185c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30775w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30776x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30777y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10185c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30775w = componentCallbacks;
            this.f30776x = interfaceC35951a;
            this.f30777y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f30775w;
            InterfaceC35951a interfaceC35951a = this.f30776x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30777y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdDetailsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10186d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30778w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30779x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30780y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10186d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30778w = componentCallbacks;
            this.f30779x = interfaceC35951a;
            this.f30780y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ld2.a] */
        @Override // c93.InterfaceC4339a
        public final C23866a invoke() {
            ComponentCallbacks componentCallbacks = this.f30778w;
            InterfaceC35951a interfaceC35951a = this.f30779x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30780y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23866a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdDetailsFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10187e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30781w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10187e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30781w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30781w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdDetailsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10188f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30782w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30783x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30784y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30785z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10188f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30782w = componentCallbacks;
            this.f30783x = interfaceC35951a;
            this.f30784y = interfaceC4339a;
            this.f30785z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, td2.h] */
        @Override // c93.InterfaceC4339a
        public final C33717h invoke() {
            return AbstractC34132o.m107857B(this.f30782w, this.f30783x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33717h.class), this.f30784y, this.f30785z);
        }
    }

    public ShepherdDetailsFragment() {
        final int i13 = 0;
        this.historyDate = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: oe2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ShepherdDetailsFragment f112418x;

            {
                this.f112418x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ShepherdDetailsFragment.m25853H(this.f112418x);
                    case 1:
                        return ShepherdDetailsFragment.m25857L(this.f112418x);
                    default:
                        return ShepherdDetailsFragment.m25854I(this.f112418x);
                }
            }
        });
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.onboardingStatusChecker = AbstractC30060g.m92087G(enumC23463i, new C10183a(this, null, null));
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: oe2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ShepherdDetailsFragment f112418x;

            {
                this.f112418x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ShepherdDetailsFragment.m25853H(this.f112418x);
                    case 1:
                        return ShepherdDetailsFragment.m25857L(this.f112418x);
                    default:
                        return ShepherdDetailsFragment.m25854I(this.f112418x);
                }
            }
        };
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10188f(this, null, new C10187e(this), interfaceC4339a));
        final int i15 = 2;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10184b(this, null, new InterfaceC4339a(this) { // from class: oe2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ShepherdDetailsFragment f112418x;

            {
                this.f112418x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ShepherdDetailsFragment.m25853H(this.f112418x);
                    case 1:
                        return ShepherdDetailsFragment.m25857L(this.f112418x);
                    default:
                        return ShepherdDetailsFragment.m25854I(this.f112418x);
                }
            }
        }));
        this.navigatorReducer = AbstractC30060g.m92087G(enumC23463i, new C10185c(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10186d(this, null, null));
    }

    /* JADX INFO: renamed from: D */
    private final C23866a m25849D() {
        return (C23866a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final String m25850E() {
        return (String) this.historyDate.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final OnboardingStatusChecker m25851F() {
        return (OnboardingStatusChecker) this.onboardingStatusChecker.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final C33717h m25852G() {
        return (C33717h) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final String m25853H(ShepherdDetailsFragment shepherdDetailsFragment) {
        Bundle arguments = shepherdDetailsFragment.getArguments();
        if (arguments != null) {
            return arguments.getString(HttpHeaders.DATE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m25854I(ShepherdDetailsFragment shepherdDetailsFragment) {
        return AbstractC15751g.m44431K(shepherdDetailsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m25855J(ShepherdDetailsFragment shepherdDetailsFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(shepherdDetailsFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            FeatureEducationType featureEducationType = null;
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29118b(abstractC12939a0, (InterfaceC14515a) AbstractC29125c.m88492A(shepherdDetailsFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null), shepherdDetailsFragment.getNavigator());
                c28655q.m87172p0(objM87133R2);
            }
            C29118b c29118b = (C29118b) objM87133R2;
            Bundle arguments = shepherdDetailsFragment.getArguments();
            if (arguments != null && (string = arguments.getString("education_name")) != null) {
                for (FeatureEducationType featureEducationType2 : FeatureEducationType.values()) {
                    if (AbstractC22676k.m65745e(featureEducationType2.name(), string)) {
                        featureEducationType = featureEducationType2;
                        break;
                    }
                }
                if (featureEducationType != null && shepherdDetailsFragment.m25851F().shouldGoToFeatureEducation(featureEducationType)) {
                    c29118b.m88488a(new AbstractC29117a.f(string, "arrhythmiaDetails"));
                    Bundle arguments2 = shepherdDetailsFragment.getArguments();
                    if (arguments2 != null) {
                        arguments2.remove("education_name");
                    }
                }
            }
            C33717h c33717hM25852G = shepherdDetailsFragment.m25852G();
            C23866a c23866aM25849D = shepherdDetailsFragment.m25849D();
            boolean zM87157i = c28655q.m87157i(abstractC12939a0) | c28655q.m87157i(c29118b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C27876a(abstractC12939a0, c29118b, 1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC34796e.m109824F(c33717hM25852G, c23866aM25849D, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m25856K(AbstractC12939a0 abstractC12939a0, C29118b c29118b, InterfaceC33715f.f navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(InterfaceC33715f.c.f140967a) || navEvent.equals(InterfaceC33715f.i.f140973a)) {
            abstractC12939a0.m36410z();
        } else {
            if (!(navEvent instanceof InterfaceC33715f.h)) {
                throw new NoWhenBranchMatchedException();
            }
            c29118b.m88488a(new AbstractC29117a.d(((InterfaceC33715f.h) navEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C34911a m25857L(ShepherdDetailsFragment shepherdDetailsFragment) {
        return AbstractC15751g.m44431K(shepherdDetailsFragment.m25850E());
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 29), true, 719917906));
    }
}
