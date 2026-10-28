package com.whoop.advancedlabs.testresults.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.advancedlabs.testresults.view.TestResultsFragment;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.DownloadAction;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd0.InterfaceC22381a;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se0.AbstractC32419a;
import se0.C32420b;
import te0.AbstractC33747f;
import te0.AbstractC33749h;
import te0.C33748g;
import tx0.C34238a;
import uf3.C34911a;
import uo1.C35141b;
import ve0.AbstractC35927e;
import vf3.InterfaceC35951a;
import vw2.InterfaceC36546a;
import ya0.C39355a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00106R\u0018\u00108\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00106R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00109¨\u0006<²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010;\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lte0/h;", "viewState", "Lse0/b;", "navRouter", "", "R", "(Lte0/h;Lse0/b;Landroidx/compose/runtime/Composer;I)Z", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", NotificationCompat.CATEGORY_EVENT, "J", "(Ljava/lang/Object;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "G", "()Ljava/lang/String;", "id", "Lte0/g;", "x", "I", "()Lte0/g;", "viewModel", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lya0/a;", "z", "F", "()Lya0/a;", "analyticsHelper", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "E", "H", "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Ljava/lang/String;", "currentTestId", "currentTestType", "Z", "hasNavigatedToOnboarding", "isRedirecting", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TestResultsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private String currentTestId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String currentTestType;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean hasNavigatedToOnboarding;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h id;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5887f(this, null, new C5886e(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testresults.view.TestResultsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.view.TestResultsFragment$onCreateView$1$2$1", m100430f = "TestResultsFragment.kt", m100431l = {110}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5882a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23162w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32420b f23164y;

        /* JADX INFO: renamed from: com.whoop.advancedlabs.testresults.view.TestResultsFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C32420b f23165w;

            public a(C32420b c32420b) {
                this.f23165w = c32420b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC32419a abstractC32419a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f23165w.m101220b(abstractC32419a);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5882a(C32420b c32420b, InterfaceC30057d<? super C5882a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23164y = c32420b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TestResultsFragment.this.new C5882a(this.f23164y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5882a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23162w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM106686n = TestResultsFragment.this.m17617I().getNavigationEvents();
                a aVar = new a(this.f23164y);
                this.f23162w = 1;
                if (interfaceC13058lM106686n.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testresults.view.TestResultsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5883b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23166w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23167x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23168y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5883b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23166w = componentCallbacks;
            this.f23167x = interfaceC35951a;
            this.f23168y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23166w;
            InterfaceC35951a interfaceC35951a = this.f23167x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23168y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testresults.view.TestResultsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5884c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23169w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23170x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23171y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5884c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23169w = componentCallbacks;
            this.f23170x = interfaceC35951a;
            this.f23171y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f23169w;
            InterfaceC35951a interfaceC35951a = this.f23170x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23171y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testresults.view.TestResultsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5885d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23172w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23173x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23174y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5885d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23172w = componentCallbacks;
            this.f23173x = interfaceC35951a;
            this.f23174y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.onboarding.OnboardingStatusChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final OnboardingStatusChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f23172w;
            InterfaceC35951a interfaceC35951a = this.f23173x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23174y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testresults.view.TestResultsFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5886e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23175w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5886e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23175w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23175w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testresults.view.TestResultsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5887f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23176w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23177x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23178y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23179z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5887f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23176w = componentCallbacks;
            this.f23177x = interfaceC35951a;
            this.f23178y = interfaceC4339a;
            this.f23179z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, te0.g] */
        @Override // c93.InterfaceC4339a
        public final C33748g invoke() {
            return AbstractC34132o.m107857B(this.f23176w, this.f23177x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33748g.class), this.f23178y, this.f23179z);
        }
    }

    public TestResultsFragment() {
        final int i13 = 0;
        this.id = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ve0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TestResultsFragment f152989x;

            {
                this.f152989x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return TestResultsFragment.m17618K(this.f152989x);
                    default:
                        return TestResultsFragment.m17619L(this.f152989x);
                }
            }
        });
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: ve0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TestResultsFragment f152989x;

            {
                this.f152989x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return TestResultsFragment.m17618K(this.f152989x);
                    default:
                        return TestResultsFragment.m17619L(this.f152989x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5883b(this, null, interfaceC4339a));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5884c(this, null, null));
        this.onboardingStatusChecker = AbstractC30060g.m92087G(enumC23463i, new C5885d(this, null, null));
    }

    /* JADX INFO: renamed from: F */
    private final C39355a m17614F() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final String m17615G() {
        return (String) this.id.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final OnboardingStatusChecker m17616H() {
        return (OnboardingStatusChecker) this.onboardingStatusChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final C33748g m17617I() {
        return (C33748g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final String m17618K(TestResultsFragment testResultsFragment) {
        return testResultsFragment.requireArguments().getString("testId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C34911a m17619L(TestResultsFragment testResultsFragment) {
        return AbstractC15751g.m44431K(testResultsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m17620M(final TestResultsFragment testResultsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C32420b c32420b = new C32420b(AbstractC5583n.m16799z(testResultsFragment), testResultsFragment.getNavigator(), null, 4, null);
                c28655q.m87172p0(c32420b);
                objM87133R = c32420b;
            }
            C32420b c32420b2 = (C32420b) objM87133R;
            InterfaceC13058l viewState = testResultsFragment.m17617I().getViewState();
            AbstractC33749h abstractC33749hM17621N = AbstractC33749h.d.f141229b;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, abstractC33749hM17621N, null, c28655q, 48, 2);
            AbstractC33749h abstractC33749hM17621N2 = m17621N(interfaceC28601c1M87260n);
            AbstractC33749h.e eVar = abstractC33749hM17621N2 instanceof AbstractC33749h.e ? (AbstractC33749h.e) abstractC33749hM17621N2 : null;
            if (eVar != null) {
                AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModelM106692d = eVar.getAnalyticsData();
                testResultsFragment.currentTestType = advancedLabsAnalyticsDomainModelM106692d != null ? advancedLabsAnalyticsDomainModelM106692d.getLabel() : null;
            }
            boolean zM17625R = testResultsFragment.m17625R(m17621N(interfaceC28601c1M87260n), c32420b2, c28655q, 0);
            C33748g c33748gM17617I = testResultsFragment.m17617I();
            boolean zM87157i = c28655q.m87157i(testResultsFragment) | c28655q.m87157i(c32420b2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = testResultsFragment.new C5882a(c32420b2, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c33748gM17617I);
            if (!zM17625R) {
                abstractC33749hM17621N = m17621N(interfaceC28601c1M87260n);
            }
            AbstractC33749h abstractC33749h = abstractC33749hM17621N;
            boolean zM87157i2 = c28655q.m87157i(c32420b2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C35141b(c32420b2, 7);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(testResultsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                final int i14 = 0;
                objM87133R4 = new Function1(testResultsFragment) { // from class: ve0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TestResultsFragment f152991x;

                    {
                        this.f152991x = testResultsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return TestResultsFragment.m17623P(this.f152991x, (InterfaceC22381a.c) obj);
                            default:
                                return TestResultsFragment.m17624Q(this.f152991x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(testResultsFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                final int i15 = 1;
                objM87133R5 = new Function1(testResultsFragment) { // from class: ve0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TestResultsFragment f152991x;

                    {
                        this.f152991x = testResultsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return TestResultsFragment.m17623P(this.f152991x, (InterfaceC22381a.c) obj);
                            default:
                                return TestResultsFragment.m17624Q(this.f152991x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC35927e.m114117P(abstractC33749h, function1, function2, (Function1) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final AbstractC33749h m17621N(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC33749h) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m17622O(C32420b c32420b, AbstractC32419a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c32420b.m101220b(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m17623P(TestResultsFragment testResultsFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        testResultsFragment.m17614F().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m17624Q(TestResultsFragment testResultsFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        testResultsFragment.m17630J(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private final boolean m17625R(AbstractC33749h abstractC33749h, C32420b c32420b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1924173663);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        AbstractC33749h.e eVar = abstractC33749h instanceof AbstractC33749h.e ? (AbstractC33749h.e) abstractC33749h : null;
        if (eVar != null && !this.hasNavigatedToOnboarding && "GALLERI".equalsIgnoreCase(eVar.getTestType()) && m17616H().shouldGoToFeatureEducation(FeatureEducationType.GALLERI_ONBOARDING)) {
            this.hasNavigatedToOnboarding = true;
            m17627T(interfaceC28601c1, true);
            c32420b.m101220b(AbstractC32419a.b.f134177a);
        }
        boolean zM17626S = m17626S(interfaceC28601c1);
        c28655q.m87173q(false);
        return zM17626S;
    }

    /* JADX INFO: renamed from: S */
    private static final boolean m17626S(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    private static final void m17627T(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final void m17630J(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC33747f) {
            if (event instanceof AbstractC33747f.b) {
                this.currentTestId = ((AbstractC33747f.b) event).getId();
            }
            m17617I().m106688r((AbstractC33747f) event);
        } else if (event instanceof InterfaceC36546a) {
            InterfaceC36546a interfaceC36546a = (InterfaceC36546a) event;
            Action action = interfaceC36546a.getAction();
            if (action instanceof DownloadAction) {
                m17614F().m125496e(new InterfaceC22381a.w0(this.currentTestType));
            } else if (action instanceof UpdateAction) {
                Action action2 = interfaceC36546a.getAction();
                AbstractC22676k.m65748h(action2, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.UpdateAction");
                if (AbstractC22676k.m65745e(((UpdateAction) action2).getRequest().getMethod(), "DELETE")) {
                    m17614F().m125496e(InterfaceC22381a.v0.f87451a);
                }
            }
            m17617I().m106687q(interfaceC36546a);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
        this.currentTestId = m17615G();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        String str = this.currentTestId;
        if (str != null) {
            m17617I().m106688r(new AbstractC33747f.b(str));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 19), true, -1131315400));
    }
}
