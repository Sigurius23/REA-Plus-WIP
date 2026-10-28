package com.whoop.hormonalinsights.pregnancyinsights.view;

import ad3.AbstractC0757c;
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
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mp1.C25869b;
import np1.AbstractC27030h;
import np1.AbstractC27032j;
import np1.C27029g;
import np1.C27031i;
import nq0.C27050m;
import oe2.C27878c;
import or2.AbstractC28163g0;
import or2.C28216y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
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
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import pp1.AbstractC29436i;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import yn1.AbstractC39672a;
import yn1.C39673b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR#\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0018\u001a\u0004\b3\u00104R\u001b\u00109\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0018\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b;\u0010<¨\u0006@²\u0006\f\u0010?\u001a\u00020>8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroy", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "I", "()Ljava/lang/String;", HttpHeaders.DATE, "x", "K", "id", "kotlin.jvm.PlatformType", "y", "L", "source", "Lnp1/i;", "z", "M", "()Lnp1/i;", "viewModel", "Li2/x;", "E", "Li2/x;", "statusColor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "F", "J", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lyn1/b;", "G", "H", "()Lyn1/b;", "analyticsHelper", "Lor2/y;", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lj02/o0;", "getNavigator", "()Lj02/o0;", "navigator", "Lnp1/j;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PregnancyInsightsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private C17919x statusColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h date;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h id;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8942f(this, null, new C8941e(this), null));

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8937a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26750w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26751x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26752y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8937a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26750w = componentCallbacks;
            this.f26751x = interfaceC35951a;
            this.f26752y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f26750w;
            InterfaceC35951a interfaceC35951a = this.f26751x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26752y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8938b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26753w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26754x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26755y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8938b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26753w = componentCallbacks;
            this.f26754x = interfaceC35951a;
            this.f26755y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yn1.b] */
        @Override // c93.InterfaceC4339a
        public final C39673b invoke() {
            ComponentCallbacks componentCallbacks = this.f26753w;
            InterfaceC35951a interfaceC35951a = this.f26754x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26755y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39673b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8939c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26756w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26757x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26758y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8939c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26756w = componentCallbacks;
            this.f26757x = interfaceC35951a;
            this.f26758y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f26756w;
            InterfaceC35951a interfaceC35951a = this.f26757x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26758y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8940d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26759w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26760x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26761y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8940d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26759w = componentCallbacks;
            this.f26760x = interfaceC35951a;
            this.f26761y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26759w;
            InterfaceC35951a interfaceC35951a = this.f26760x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26761y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8941e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26762w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8941e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26762w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26762w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8942f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26763w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26764x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26765y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26766z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8942f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26763w = componentCallbacks;
            this.f26764x = interfaceC35951a;
            this.f26765y = interfaceC4339a;
            this.f26766z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, np1.i] */
        @Override // c93.InterfaceC4339a
        public final C27031i invoke() {
            return AbstractC34132o.m107857B(this.f26763w, this.f26764x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27031i.class), this.f26765y, this.f26766z);
        }
    }

    public PregnancyInsightsFragment() {
        final int i13 = 0;
        this.date = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pp1.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PregnancyInsightsFragment f119491x;

            {
                this.f119491x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return PregnancyInsightsFragment.m22136G(this.f119491x);
                    case 1:
                        return PregnancyInsightsFragment.m22143N(this.f119491x);
                    case 2:
                        return PregnancyInsightsFragment.m22150U(this.f119491x);
                    default:
                        return PregnancyInsightsFragment.m22144O(this.f119491x);
                }
            }
        });
        final int i14 = 1;
        this.id = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pp1.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PregnancyInsightsFragment f119491x;

            {
                this.f119491x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return PregnancyInsightsFragment.m22136G(this.f119491x);
                    case 1:
                        return PregnancyInsightsFragment.m22143N(this.f119491x);
                    case 2:
                        return PregnancyInsightsFragment.m22150U(this.f119491x);
                    default:
                        return PregnancyInsightsFragment.m22144O(this.f119491x);
                }
            }
        });
        final int i15 = 2;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: pp1.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PregnancyInsightsFragment f119491x;

            {
                this.f119491x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return PregnancyInsightsFragment.m22136G(this.f119491x);
                    case 1:
                        return PregnancyInsightsFragment.m22143N(this.f119491x);
                    case 2:
                        return PregnancyInsightsFragment.m22150U(this.f119491x);
                    default:
                        return PregnancyInsightsFragment.m22144O(this.f119491x);
                }
            }
        });
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C8937a(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8938b(this, null, null));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C8939c(this, null, null));
        final int i16 = 3;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8940d(this, null, new InterfaceC4339a(this) { // from class: pp1.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PregnancyInsightsFragment f119491x;

            {
                this.f119491x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return PregnancyInsightsFragment.m22136G(this.f119491x);
                    case 1:
                        return PregnancyInsightsFragment.m22143N(this.f119491x);
                    case 2:
                        return PregnancyInsightsFragment.m22150U(this.f119491x);
                    default:
                        return PregnancyInsightsFragment.m22144O(this.f119491x);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m22136G(PregnancyInsightsFragment pregnancyInsightsFragment) {
        return pregnancyInsightsFragment.requireArguments().getString(HttpHeaders.DATE);
    }

    /* JADX INFO: renamed from: H */
    private final C39673b m22137H() {
        return (C39673b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final String m22138I() {
        return (String) this.date.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final FeatureFlagChecker m22139J() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final String m22140K() {
        return (String) this.id.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final String m22141L() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C27031i m22142M() {
        return (C27031i) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final String m22143N(PregnancyInsightsFragment pregnancyInsightsFragment) {
        return pregnancyInsightsFragment.requireArguments().getString("id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m22144O(PregnancyInsightsFragment pregnancyInsightsFragment) {
        return AbstractC15751g.m44431K(pregnancyInsightsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m22145P(final PregnancyInsightsFragment pregnancyInsightsFragment, Composer composer, int i13) {
        C17919x c17919xM31989h;
        C27029g state;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(pregnancyInsightsFragment.m22142M().getViewState(), AbstractC27032j.f.f107832a, null, c28655q, 48, 2);
            C25869b c25869b = new C25869b(pregnancyInsightsFragment, pregnancyInsightsFragment.getNavigator(), null, pregnancyInsightsFragment.m22139J(), pregnancyInsightsFragment.getExternalLinkNavigator(), (AbstractC0757c) AbstractC29125c.m88492A(pregnancyInsightsFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("hormonal-insights-polymorphic-json")), 4, null);
            AbstractC27032j abstractC27032jM22146Q = m22146Q(interfaceC28601c1M87260n);
            AbstractC27032j.g gVar = abstractC27032jM22146Q instanceof AbstractC27032j.g ? (AbstractC27032j.g) abstractC27032jM22146Q : null;
            InterfaceC39332e style = (gVar == null || (state = gVar.getState()) == null) ? null : state.getStyle();
            if (style == null) {
                c28655q.m87150e0(861894777);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(-1357670264);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, style.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            pregnancyInsightsFragment.statusColor = c17919xM31989h;
            if (c17919xM31989h != null) {
                AbstractC28163g0.m85255k(pregnancyInsightsFragment, AbstractC17918w0.m51506H(C17919x.m51541c(0.3f, c17919xM31989h.f69639a)), 0, 2, null);
            }
            pregnancyInsightsFragment.m22137H().m126873N(pregnancyInsightsFragment.m22141L());
            AbstractC27032j abstractC27032jM22146Q2 = m22146Q(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(pregnancyInsightsFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(pregnancyInsightsFragment) { // from class: pp1.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PregnancyInsightsFragment f119493x;

                    {
                        this.f119493x = pregnancyInsightsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return PregnancyInsightsFragment.m22147R(this.f119493x, (AbstractC27030h) obj);
                            default:
                                return PregnancyInsightsFragment.m22149T(this.f119493x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(pregnancyInsightsFragment) | c28655q.m87157i(c25869b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27050m(25, pregnancyInsightsFragment, c25869b);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(pregnancyInsightsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(pregnancyInsightsFragment) { // from class: pp1.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PregnancyInsightsFragment f119493x;

                    {
                        this.f119493x = pregnancyInsightsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return PregnancyInsightsFragment.m22147R(this.f119493x, (AbstractC27030h) obj);
                            default:
                                return PregnancyInsightsFragment.m22149T(this.f119493x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC29436i.m89770g0(abstractC27032jM22146Q2, function1, function2, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final AbstractC27032j m22146Q(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC27032j) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m22147R(PregnancyInsightsFragment pregnancyInsightsFragment, AbstractC27030h it) {
        AbstractC22676k.m65750j(it, "it");
        pregnancyInsightsFragment.m22142M().m81075p(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m22148S(PregnancyInsightsFragment pregnancyInsightsFragment, C25869b c25869b, Object it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC28163g0.m85255k(pregnancyInsightsFragment, 0, 0, 2, null);
        c25869b.m76467b(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m22149T(PregnancyInsightsFragment pregnancyInsightsFragment, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        pregnancyInsightsFragment.m22137H().m126872M(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final String m22150U(PregnancyInsightsFragment pregnancyInsightsFragment) {
        return pregnancyInsightsFragment.requireArguments().getString("source", "");
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
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
    public void onDestroy() {
        super.onDestroy();
        AbstractC28163g0.m85255k(this, 0, 0, 2, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        C17919x c17919x = this.statusColor;
        if (c17919x != null) {
            AbstractC28163g0.m85255k(this, AbstractC17918w0.m51506H(C17919x.m51541c(0.3f, c17919x.f69639a)), 0, 2, null);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        if (m22140K() == null) {
            m22142M().m81075p(new AbstractC27030h.c(m22138I(), null, null, 6, null));
        } else {
            C27031i c27031iM22142M = m22142M();
            String strM22140K = m22140K();
            AbstractC22676k.m65747g(strM22140K);
            c27031iM22142M.m81075p(new AbstractC27030h.d(strM22140K));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 20), true, -1342193419));
    }
}
