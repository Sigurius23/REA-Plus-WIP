package com.whoop.hormonalinsights.onboarding.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bp1.AbstractC3535b;
import bp1.C3536c;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cp1.AbstractC11022i;
import cp1.AbstractC11024k;
import cp1.C11023j;
import eg.C13161j;
import ej1.C13242h;
import ep1.AbstractC13418m;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
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
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yn1.AbstractC39672a;
import yn1.C39673b;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0006R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00102R\u001b\u00105\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b4\u0010\u0006¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "J", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcp1/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "M", "()Lcp1/j;", "viewModel", "Lzr2/a;", "x", "H", "()Lzr2/a;", "dateAndTimeProvider", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "K", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "E", "I", "featureArg", "Lyn1/b;", "F", "G", "()Lyn1/b;", "analyticsHelper", "", "Z", "isFirstTimeLoaded", "L", "screenTag", "a", "Lcp1/k;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MciOnboardingFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: J */
    public static final int f26701J = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h featureArg;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isFirstTimeLoaded;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h screenTag;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8933g(this, null, new C8932f(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8928b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26710w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26711x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26712y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8928b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26710w = componentCallbacks;
            this.f26711x = interfaceC35951a;
            this.f26712y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f26710w;
            InterfaceC35951a interfaceC35951a = this.f26711x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26712y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8929c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26713w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26714x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26715y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8929c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26713w = componentCallbacks;
            this.f26714x = interfaceC35951a;
            this.f26715y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26713w;
            InterfaceC35951a interfaceC35951a = this.f26714x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26715y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8930d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26716w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26717x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26718y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8930d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26716w = componentCallbacks;
            this.f26717x = interfaceC35951a;
            this.f26718y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f26716w;
            InterfaceC35951a interfaceC35951a = this.f26717x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26718y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8931e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26719w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26720x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26721y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8931e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26719w = componentCallbacks;
            this.f26720x = interfaceC35951a;
            this.f26721y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yn1.b] */
        @Override // c93.InterfaceC4339a
        public final C39673b invoke() {
            ComponentCallbacks componentCallbacks = this.f26719w;
            InterfaceC35951a interfaceC35951a = this.f26720x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26721y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39673b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8932f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26722w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8932f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26722w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26722w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8933g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26723w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26724x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26725y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26726z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8933g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26723w = componentCallbacks;
            this.f26724x = interfaceC35951a;
            this.f26725y = interfaceC4339a;
            this.f26726z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, cp1.j] */
        @Override // c93.InterfaceC4339a
        public final C11023j invoke() {
            return AbstractC34132o.m107857B(this.f26723w, this.f26724x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11023j.class), this.f26725y, this.f26726z);
        }
    }

    public MciOnboardingFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C8928b(this, null, null));
        final int i13 = 0;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8929c(this, null, new InterfaceC4339a(this) { // from class: ep1.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MciOnboardingFragment f46981x;

            {
                this.f46981x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return MciOnboardingFragment.m22077N(this.f46981x);
                    case 1:
                        return MciOnboardingFragment.m22069F(this.f46981x);
                    default:
                        return MciOnboardingFragment.m22083T(this.f46981x);
                }
            }
        }));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C8930d(this, null, null));
        final int i14 = 1;
        this.featureArg = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ep1.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MciOnboardingFragment f46981x;

            {
                this.f46981x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return MciOnboardingFragment.m22077N(this.f46981x);
                    case 1:
                        return MciOnboardingFragment.m22069F(this.f46981x);
                    default:
                        return MciOnboardingFragment.m22083T(this.f46981x);
                }
            }
        });
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8931e(this, null, null));
        this.isFirstTimeLoaded = true;
        final int i15 = 2;
        this.screenTag = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ep1.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MciOnboardingFragment f46981x;

            {
                this.f46981x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return MciOnboardingFragment.m22077N(this.f46981x);
                    case 1:
                        return MciOnboardingFragment.m22069F(this.f46981x);
                    default:
                        return MciOnboardingFragment.m22083T(this.f46981x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m22069F(MciOnboardingFragment mciOnboardingFragment) {
        return mciOnboardingFragment.m22073J();
    }

    /* JADX INFO: renamed from: G */
    private final C39673b m22070G() {
        return (C39673b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final InterfaceC41070a m22071H() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final String m22072I() {
        return (String) this.featureArg.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final String m22073J() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("feature");
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    private final FeatureFlagChecker m22074K() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final String m22075L() {
        return (String) this.screenTag.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C11023j m22076M() {
        return (C11023j) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C34911a m22077N(MciOnboardingFragment mciOnboardingFragment) {
        return AbstractC15751g.m44431K(mciOnboardingFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m22078O(final MciOnboardingFragment mciOnboardingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(mciOnboardingFragment.m22076M().getViewState(), AbstractC11024k.i.f34586a, null, c28655q, 48, 2);
            C3536c c3536c = new C3536c(mciOnboardingFragment, mciOnboardingFragment.getNavigator(), mciOnboardingFragment.m22074K());
            AbstractC28163g0.m85256l(mciOnboardingFragment);
            AbstractC11024k abstractC11024kM22079P = m22079P(interfaceC28601c1M87260n);
            InterfaceC41070a interfaceC41070aM22071H = mciOnboardingFragment.m22071H();
            boolean zM87157i = c28655q.m87157i(mciOnboardingFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(mciOnboardingFragment) { // from class: ep1.k

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MciOnboardingFragment f46983x;

                    {
                        this.f46983x = mciOnboardingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return MciOnboardingFragment.m22080Q(this.f46983x, (AbstractC11022i) obj);
                            default:
                                return MciOnboardingFragment.m22082S(this.f46983x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c3536c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C13161j(c3536c, 3);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(mciOnboardingFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(mciOnboardingFragment) { // from class: ep1.k

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MciOnboardingFragment f46983x;

                    {
                        this.f46983x = mciOnboardingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return MciOnboardingFragment.m22080Q(this.f46983x, (AbstractC11022i) obj);
                            default:
                                return MciOnboardingFragment.m22082S(this.f46983x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC13418m.m38007u(abstractC11024kM22079P, interfaceC41070aM22071H, function1, function2, (Function1) objM87133R3, mciOnboardingFragment.m22075L(), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final AbstractC11024k m22079P(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC11024k) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m22080Q(MciOnboardingFragment mciOnboardingFragment, AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        mciOnboardingFragment.m22076M().m29628n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m22081R(C3536c c3536c, AbstractC3535b it) {
        AbstractC22676k.m65750j(it, "it");
        c3536c.m10549a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m22082S(MciOnboardingFragment mciOnboardingFragment, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        mciOnboardingFragment.m22070G().m126872M(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final String m22083T(MciOnboardingFragment mciOnboardingFragment) {
        return AbstractC22676k.m65745e(mciOnboardingFragment.m22072I(), "PREGNANCY") ? "healthcare_womens_health_pregnancy_onboarding" : "healthcare_womens_health_hormonal_insights_onboarding";
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 3), true, -423309924));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        if (AbstractC22676k.m65745e(m22072I(), "PREGNANCY")) {
            m22076M().m29628n(new AbstractC11022i.g(true));
        } else {
            m22076M().m29628n(new AbstractC11022i.c(m22072I()));
        }
        if (this.isFirstTimeLoaded) {
            m22070G().m126872M(AbstractC39672a.t.f170768a);
            this.isFirstTimeLoaded = false;
        }
    }
}
