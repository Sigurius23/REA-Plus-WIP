package com.whoop.trends.view;

import a20.C0167g;
import am2.C1009b0;
import am2.C1049z;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.AbstractC4813a0;
import cm2.AbstractC4835w;
import cm2.AbstractC4837y;
import cm2.C4838z;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.trends.view.TrendsFragment;
import com.whoop.util.TrendKey;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28205u0;
import or2.C28216y;
import or2.EnumC28166h0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p236j.InterfaceC21063b;
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
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tl2.C33920a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vl2.C36118k;
import yl2.AbstractC39639f;
import yl2.AbstractC39640g;
import yl2.C39636c;
import yl2.C39644k;
import zl2.C40880a;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010 \u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010 \u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010 \u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010 \u001a\u0004\bI\u0010JR\u001a\u0010Q\u001a\u00020L8\u0014X\u0094D¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010U\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010 \u001a\u0004\bN\u0010TR\u001c\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010_\u001a\u0010\u0012\f\u0012\n \\*\u0004\u0018\u00010[0[0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006c²\u0006\f\u0010a\u001a\u00020`8\nX\u008a\u0084\u0002²\u0006\f\u0010b\u001a\u00020L8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/trends/view/TrendsFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onCreate", "(Landroid/os/Bundle;)V", "args", "Lcom/whoop/util/TrendKey;", "r0", "(Landroid/os/Bundle;)Lcom/whoop/util/TrendKey;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lcm2/z;", "x", "Ll83/h;", "d0", "()Lcm2/z;", "viewModel", "Lor2/y;", "y", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Ltl2/a;", "z", "W", "()Ltl2/a;", "analytics", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "Y", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lcom/whoop/data/repositories/LanguageRepository;", "F", "a0", "()Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lj02/o0;", "G", "getNavigator", "()Lj02/o0;", "navigator", "Lor2/u0;", "H", "b0", "()Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "I", "X", "()Lzr2/a;", "dateAndTimeProvider", "Lzl2/a;", "J", "c0", "()Lzl2/a;", "trendArgumentsParser", "", "K", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lyl2/c;", "L", "()Lyl2/c;", "fragmentNavigationHandler", "Lkotlin/Function0;", "M", "Lc93/a;", "checkForEducationFragmentResult", "Lj/d;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "N", "Lj/d;", "videoActivityResultLauncher", "Lcm2/a0;", "viewState", "isExerciseDetailsV2ExperimentEnabled", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TrendsFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h ffChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h languageRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h trendArgumentsParser;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h fragmentNavigationHandler;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC4339a checkForEducationFragmentResult;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final AbstractC21065d videoActivityResultLauncher;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "TrendsFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10446k(this, null, new C10445j(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.TrendsFragment$onViewCreated$1", m100430f = "TrendsFragment.kt", m100431l = {126}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10436a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31480w;

        /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$a$a */
        @InterfaceC32271e(m100429c = "com.whoop.trends.view.TrendsFragment$onViewCreated$1$1", m100430f = "TrendsFragment.kt", m100431l = {127}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f31482w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ TrendsFragment f31483x;

            /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$a$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41424a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ TrendsFragment f31484w;

                public C41424a(TrendsFragment trendsFragment) {
                    this.f31484w = trendsFragment;
                }

                @Override // ec3.InterfaceC13062m
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC4835w abstractC4835w, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    this.f31484w.m26619W().m107319p(abstractC4835w);
                    return C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TrendsFragment trendsFragment, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f31483x = trendsFragment;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f31483x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f31482w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058lM15408u = this.f31483x.m26626d0().getAnalyticsEvents();
                    C41424a c41424a = new C41424a(this.f31483x);
                    this.f31482w = 1;
                    if (interfaceC13058lM15408u.collect(c41424a, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        public C10436a(InterfaceC30057d<? super C10436a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TrendsFragment.this.new C10436a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10436a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31480w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC1585g0 viewLifecycleOwner = TrendsFragment.this.getViewLifecycleOwner();
                AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                EnumC1635w enumC1635w = EnumC1635w.f6328z;
                a aVar = new a(TrendsFragment.this, null);
                this.f31480w = 1;
                if (AbstractC1613o1.m5023m(viewLifecycleOwner, enumC1635w, aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10437b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31485w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31486x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31487y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10437b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31485w = componentCallbacks;
            this.f31486x = interfaceC35951a;
            this.f31487y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f31485w;
            InterfaceC35951a interfaceC35951a = this.f31486x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31487y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10438c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31488w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31489x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31490y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10438c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31488w = componentCallbacks;
            this.f31489x = interfaceC35951a;
            this.f31490y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tl2.a] */
        @Override // c93.InterfaceC4339a
        public final C33920a invoke() {
            ComponentCallbacks componentCallbacks = this.f31488w;
            InterfaceC35951a interfaceC35951a = this.f31489x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31490y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33920a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10439d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31491w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31492x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31493y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10439d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31491w = componentCallbacks;
            this.f31492x = interfaceC35951a;
            this.f31493y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f31491w;
            InterfaceC35951a interfaceC35951a = this.f31492x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31493y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10440e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31494w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31495x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31496y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10440e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31494w = componentCallbacks;
            this.f31495x = interfaceC35951a;
            this.f31496y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.LanguageRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final LanguageRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f31494w;
            InterfaceC35951a interfaceC35951a = this.f31495x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31496y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LanguageRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10441f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31497w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31498x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31499y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10441f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31497w = componentCallbacks;
            this.f31498x = interfaceC35951a;
            this.f31499y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f31497w;
            InterfaceC35951a interfaceC35951a = this.f31498x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31499y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10442g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31500w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31501x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31502y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10442g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31500w = componentCallbacks;
            this.f31501x = interfaceC35951a;
            this.f31502y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f31500w;
            InterfaceC35951a interfaceC35951a = this.f31501x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31502y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10443h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31503w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31504x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31505y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10443h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31503w = componentCallbacks;
            this.f31504x = interfaceC35951a;
            this.f31505y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f31503w;
            InterfaceC35951a interfaceC35951a = this.f31504x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31505y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10444i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31506w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31507x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31508y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10444i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31506w = componentCallbacks;
            this.f31507x = interfaceC35951a;
            this.f31508y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zl2.a] */
        @Override // c93.InterfaceC4339a
        public final C40880a invoke() {
            ComponentCallbacks componentCallbacks = this.f31506w;
            InterfaceC35951a interfaceC35951a = this.f31507x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31508y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40880a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$j */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10445j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31509w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10445j(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31509w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31509w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trends.view.TrendsFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10446k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31510w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31511x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31512y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31513z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10446k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31510w = componentCallbacks;
            this.f31511x = interfaceC35951a;
            this.f31512y = interfaceC4339a;
            this.f31513z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, cm2.z] */
        @Override // c93.InterfaceC4339a
        public final C4838z invoke() {
            return AbstractC34132o.m107857B(this.f31510w, this.f31511x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4838z.class), this.f31512y, this.f31513z);
        }
    }

    public TrendsFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C10437b(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10438c(this, null, null));
        this.ffChecker = AbstractC30060g.m92087G(enumC23463i, new C10439d(this, null, null));
        this.languageRepository = AbstractC30060g.m92087G(enumC23463i, new C10440e(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10441f(this, null, new C1049z(this, 0)));
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(enumC23463i, new C10442g(this, null, new C1049z(this, 1)));
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C10443h(this, null, null));
        this.trendArgumentsParser = AbstractC30060g.m92087G(enumC23463i, new C10444i(this, null, null));
        this.fragmentNavigationHandler = AbstractC30060g.m92088H(new C1049z(this, 2));
        this.checkForEducationFragmentResult = new C1049z(this, 3);
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b() { // from class: am2.c0
            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                TrendsFragment.m26641s0(this.f3791w, (C21062a) obj);
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.videoActivityResultLauncher = abstractC21065dRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final TrendKey m26617U(TrendsFragment trendsFragment) {
        C1601k1 c1601k1M36480b;
        TrendKey.Companion companion = TrendKey.INSTANCE;
        C12982q c12982qM36393h = AbstractC5583n.m16799z(trendsFragment).m36393h();
        return companion.m27814b((c12982qM36393h == null || (c1601k1M36480b = c12982qM36393h.m36480b()) == null) ? null : (String) c1601k1M36480b.m5001b("EDUCATION_FRAGMENT_RESULT_TREND_NAME"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C39636c m26618V(TrendsFragment trendsFragment) {
        return new C39636c(trendsFragment, trendsFragment.getExternalLinkNavigator(), trendsFragment.videoActivityResultLauncher, trendsFragment.m26621Y(), trendsFragment.getNavigator(), trendsFragment.m26623a0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final C33920a m26619W() {
        return (C33920a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: X */
    private final InterfaceC41070a m26620X() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: Y */
    private final FeatureFlagChecker m26621Y() {
        return (FeatureFlagChecker) this.ffChecker.getValue();
    }

    /* JADX INFO: renamed from: Z */
    private final C39636c m26622Z() {
        return (C39636c) this.fragmentNavigationHandler.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    private final LanguageRepository m26623a0() {
        return (LanguageRepository) this.languageRepository.getValue();
    }

    /* JADX INFO: renamed from: b0 */
    private final C28205u0 m26624b0() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: renamed from: c0 */
    private final C40880a m26625c0() {
        return (C40880a) this.trendArgumentsParser.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public final C4838z m26626d0() {
        return (C4838z) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C34911a m26627e0(TrendsFragment trendsFragment) {
        return AbstractC15751g.m44431K(trendsFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C34911a m26628f0(TrendsFragment trendsFragment) {
        return AbstractC15751g.m44431K(trendsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m26629g0(final TrendsFragment trendsFragment, Composer composer, int i13) {
        int i14 = 2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(trendsFragment.m26626d0().getViewState(), new AbstractC4813a0.c(EnumC28166h0.NONE, null, i14, 0 == true ? 1 : 0), null, c28655q, 0, 2);
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(trendsFragment.m26626d0().getIsExerciseDetailsV2ExperimentEnabled(), c28655q, 0);
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("TrendsNavHost", null, c28655q, 6, 2);
            InterfaceC21159o0 navigator = trendsFragment.getNavigator();
            boolean zM87157i = c28655q.m87157i(trendsFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C1049z(trendsFragment, 4);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(trendsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C1049z(trendsFragment, 5);
                c28655q.m87172p0(objM87133R2);
            }
            C39644k c39644k = new C39644k(navigator, c12991u0M58963a, interfaceC4339a, (InterfaceC4339a) objM87133R2);
            AbstractC4813a0 abstractC4813a0M26630h0 = m26630h0(interfaceC28601c1M87260n);
            InterfaceC41070a interfaceC41070aM26620X = trendsFragment.m26620X();
            C28205u0 c28205u0M26624b0 = trendsFragment.m26624b0();
            boolean zM26631i0 = m26631i0(interfaceC28601c1M87261o);
            boolean zM87157i3 = c28655q.m87157i(trendsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 3;
                objM87133R3 = new Function1(trendsFragment) { // from class: am2.a0

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TrendsFragment f3779x;

                    {
                        this.f3779x = trendsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return TrendsFragment.m26636n0(this.f3779x, (AbstractC4835w) obj);
                            case 1:
                                return TrendsFragment.m26638p0(this.f3779x, (TrendKey) obj);
                            case 2:
                                return TrendsFragment.m26639q0(this.f3779x, (TrendKey) obj);
                            default:
                                return TrendsFragment.m26634l0(this.f3779x, (AbstractC4837y) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(trendsFragment) | c28655q.m87157i(c39644k);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C0167g(6, trendsFragment, c39644k);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(trendsFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                final int i16 = 0;
                objM87133R5 = new Function1(trendsFragment) { // from class: am2.a0

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TrendsFragment f3779x;

                    {
                        this.f3779x = trendsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return TrendsFragment.m26636n0(this.f3779x, (AbstractC4835w) obj);
                            case 1:
                                return TrendsFragment.m26638p0(this.f3779x, (TrendKey) obj);
                            case 2:
                                return TrendsFragment.m26639q0(this.f3779x, (TrendKey) obj);
                            default:
                                return TrendsFragment.m26634l0(this.f3779x, (AbstractC4837y) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function3 = (Function1) objM87133R5;
            boolean zM87157i6 = c28655q.m87157i(trendsFragment);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                objM87133R6 = new C1009b0(trendsFragment, 0);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R6;
            boolean zM87157i7 = c28655q.m87157i(trendsFragment);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i7 || objM87133R7 == c28676v0) {
                final int i17 = 1;
                objM87133R7 = new Function1(trendsFragment) { // from class: am2.a0

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TrendsFragment f3779x;

                    {
                        this.f3779x = trendsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                return TrendsFragment.m26636n0(this.f3779x, (AbstractC4835w) obj);
                            case 1:
                                return TrendsFragment.m26638p0(this.f3779x, (TrendKey) obj);
                            case 2:
                                return TrendsFragment.m26639q0(this.f3779x, (TrendKey) obj);
                            default:
                                return TrendsFragment.m26634l0(this.f3779x, (AbstractC4837y) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function4 = (Function1) objM87133R7;
            boolean zM87157i8 = c28655q.m87157i(trendsFragment);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i8 || objM87133R8 == c28676v0) {
                final int i18 = 2;
                objM87133R8 = new Function1(trendsFragment) { // from class: am2.a0

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TrendsFragment f3779x;

                    {
                        this.f3779x = trendsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                return TrendsFragment.m26636n0(this.f3779x, (AbstractC4835w) obj);
                            case 1:
                                return TrendsFragment.m26638p0(this.f3779x, (TrendKey) obj);
                            case 2:
                                return TrendsFragment.m26639q0(this.f3779x, (TrendKey) obj);
                            default:
                                return TrendsFragment.m26634l0(this.f3779x, (AbstractC4837y) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC39639f.m126714h(c12991u0M58963a, abstractC4813a0M26630h0, interfaceC41070aM26620X, c28205u0M26624b0, function1, function2, function3, interfaceC4351m, function4, (Function1) objM87133R8, zM26631i0, c28655q, C28205u0.f113964d << 9, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private static final AbstractC4813a0 m26630h0(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC4813a0) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private static final boolean m26631i0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m26632j0(TrendsFragment trendsFragment) {
        trendsFragment.m26622Z().m126706f();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m26633k0(TrendsFragment trendsFragment) {
        AbstractC5583n.m16799z(trendsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m26634l0(TrendsFragment trendsFragment, AbstractC4837y it) {
        AbstractC22676k.m65750j(it, "it");
        C33920a.m107310t(trendsFragment.m26619W(), it, null, 2, null);
        trendsFragment.m26626d0().m15407D(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m26635m0(TrendsFragment trendsFragment, C39644k c39644k, AbstractC39640g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC39640g.c) {
            trendsFragment.m26619W().m107315e((AbstractC39640g.c) event);
        } else if (event instanceof AbstractC39640g.a) {
            trendsFragment.m26619W().m107322s(event);
        } else {
            if (!(event instanceof AbstractC39640g.d)) {
                throw new NoWhenBranchMatchedException();
            }
            trendsFragment.m26619W().m107316g();
        }
        if (trendsFragment.m26621Y().isFeatureEnabled("android-trends-route-v2")) {
            c39644k.m126758E(event);
        } else {
            c39644k.m126759r(event).getAction().invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m26636n0(TrendsFragment trendsFragment, AbstractC4835w it) {
        AbstractC22676k.m65750j(it, "it");
        trendsFragment.m26619W().m107319p(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m26637o0(TrendsFragment trendsFragment, Object clickEvent, TrendKey trendKey) {
        AbstractC22676k.m65750j(clickEvent, "clickEvent");
        AbstractC22676k.m65750j(trendKey, "trendKey");
        trendsFragment.m26619W().m107317i(clickEvent, trendKey);
        trendsFragment.m26622Z().m126704c(clickEvent, trendKey);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m26638p0(TrendsFragment trendsFragment, TrendKey trendKey) {
        AbstractC22676k.m65750j(trendKey, "trendKey");
        trendsFragment.m26622Z().m126703b(trendKey);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m26639q0(TrendsFragment trendsFragment, TrendKey trendKey) {
        AbstractC22676k.m65750j(trendKey, "trendKey");
        trendsFragment.m26622Z().m126705e(trendKey);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r0 */
    private final TrendKey m26640r0(Bundle args) {
        InterfaceC13037f2 interfaceC13037f2M15410w = m26626d0().getSelectedTrend();
        TrendKey trendKey = interfaceC13037f2M15410w != null ? (TrendKey) interfaceC13037f2M15410w.getValue() : null;
        TrendKey trendKey2 = trendKey != null ? trendKey : null;
        if (trendKey2 != null) {
            return trendKey2;
        }
        TrendKey trendKey3 = (TrendKey) this.checkForEducationFragmentResult.invoke();
        return trendKey3 == null ? TrendKey.INSTANCE.m27813a(args.getString("trendKey")) : trendKey3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m26641s0(TrendsFragment trendsFragment, C21062a c21062a) {
        C33920a c33920aM26619W = trendsFragment.m26619W();
        Intent intent = c21062a.f79916x;
        Intent intent2 = c21062a.f79916x;
        c33920aM26619W.m107320q(intent != null ? intent.getStringExtra("ARTICLE_TITLE") : null, intent2 != null ? intent2.getStringExtra("TREND_NAME") : null, true);
        if (intent2 == null || !intent2.getBooleanExtra("USER_VIEWED_FULL_VIDEO", false)) {
            return;
        }
        trendsFragment.m26619W().m107320q(intent2 != null ? intent2.getStringExtra("ARTICLE_TITLE") : null, intent2 != null ? intent2.getStringExtra("TREND_NAME") : null, false);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10436a(null), 3);
        Bundle arguments = getArguments();
        if (arguments != null) {
            TrendKey trendKeyM26640r0 = m26640r0(arguments);
            C36118k c36118kM132498b = m26625c0().m132498b(arguments);
            AbstractC4837y.n nVar = new AbstractC4837y.n(trendKeyM26640r0.toGraphKey(), c36118kM132498b.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), c36118kM132498b.getDateString(), arguments.getBoolean("sendTileProperties", false), null, false, 48, null);
            C33920a c33920aM26619W = m26619W();
            c33920aM26619W.m107314A(c36118kM132498b.getFromLocation());
            c33920aM26619W.m107321r(nVar, c36118kM132498b.getSource());
            m26626d0().m15407D(nVar);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C1009b0(this, 1), true, 963250254));
    }
}
