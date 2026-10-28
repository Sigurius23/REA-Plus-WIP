package com.whoop.weeklyplan.customizeplan.view;

import android.content.ComponentCallbacks;
import android.net.Uri;
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
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.view.CustomizePlanFragment;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kotlin.AbstractC2016m;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ls2.AbstractC24716a;
import ls2.C24717b;
import m83.C25271y;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12997x0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
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
import vf3.InterfaceC35951a;
import ws2.AbstractC37617i;
import ys2.AbstractC39758e;
import ys2.AbstractC39760g;
import ys2.C39757d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010+R \u00101\u001a\b\u0012\u0004\u0012\u00020\r0-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100¨\u00064²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lys2/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "I", "()Lys2/d;", "viewModel", "", "x", "H", "()Ljava/lang/String;", "planScreens", "y", "F", "analyticsSource", "Lls2/b;", "z", "J", "()Lls2/b;", "weeklyPlanAnalyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "G", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lkotlin/Function0;", "Lc93/a;", "getOnExit$weekly_plan_release", "()Lc93/a;", "onExit", "Lys2/e;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CustomizePlanFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC4339a onExit;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10721d(this, null, new C10720c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h planScreens;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsSource;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h weeklyPlanAnalyticsHelper;

    /* JADX INFO: renamed from: com.whoop.weeklyplan.customizeplan.view.CustomizePlanFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10718a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32677w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32678x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32679y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10718a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32677w = componentCallbacks;
            this.f32678x = interfaceC35951a;
            this.f32679y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ls2.b] */
        @Override // c93.InterfaceC4339a
        public final C24717b invoke() {
            ComponentCallbacks componentCallbacks = this.f32677w;
            InterfaceC35951a interfaceC35951a = this.f32678x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32679y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24717b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.customizeplan.view.CustomizePlanFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10719b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32680w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32681x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32682y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10719b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32680w = componentCallbacks;
            this.f32681x = interfaceC35951a;
            this.f32682y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f32680w;
            InterfaceC35951a interfaceC35951a = this.f32681x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32682y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.customizeplan.view.CustomizePlanFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10720c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32683w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10720c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32683w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32683w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.customizeplan.view.CustomizePlanFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10721d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32684w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32685x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32686y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32687z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10721d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32684w = componentCallbacks;
            this.f32685x = interfaceC35951a;
            this.f32686y = interfaceC4339a;
            this.f32687z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ys2.d] */
        @Override // c93.InterfaceC4339a
        public final C39757d invoke() {
            return AbstractC34132o.m107857B(this.f32684w, this.f32685x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39757d.class), this.f32686y, this.f32687z);
        }
    }

    public CustomizePlanFragment() {
        final int i13 = 0;
        this.planScreens = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: at2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CustomizePlanFragment f7964x;

            {
                this.f7964x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return CustomizePlanFragment.m27895P(this.f7964x);
                    case 1:
                        return CustomizePlanFragment.m27884E(this.f7964x);
                    default:
                        return CustomizePlanFragment.m27894O(this.f7964x);
                }
            }
        });
        final int i14 = 1;
        this.analyticsSource = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: at2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CustomizePlanFragment f7964x;

            {
                this.f7964x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return CustomizePlanFragment.m27895P(this.f7964x);
                    case 1:
                        return CustomizePlanFragment.m27884E(this.f7964x);
                    default:
                        return CustomizePlanFragment.m27894O(this.f7964x);
                }
            }
        });
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.weeklyPlanAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10718a(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10719b(this, null, null));
        final int i15 = 2;
        this.onExit = new InterfaceC4339a(this) { // from class: at2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CustomizePlanFragment f7964x;

            {
                this.f7964x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return CustomizePlanFragment.m27895P(this.f7964x);
                    case 1:
                        return CustomizePlanFragment.m27884E(this.f7964x);
                    default:
                        return CustomizePlanFragment.m27894O(this.f7964x);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final String m27884E(CustomizePlanFragment customizePlanFragment) {
        return customizePlanFragment.requireArguments().getString("analyticsSource");
    }

    /* JADX INFO: renamed from: F */
    private final String m27885F() {
        return (String) this.analyticsSource.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final FeatureFlagChecker m27886G() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final String m27887H() {
        return (String) this.planScreens.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C39757d m27888I() {
        return (C39757d) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C24717b m27889J() {
        return (C24717b) this.weeklyPlanAnalyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m27890K(final CustomizePlanFragment customizePlanFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC39758e abstractC39758eM27891L = m27891L(AbstractC28683x.m87260n(customizePlanFragment.m27888I().getViewState(), AbstractC39758e.c.f171182a, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(customizePlanFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(customizePlanFragment) { // from class: at2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ CustomizePlanFragment f7971x;

                    {
                        this.f7971x = customizePlanFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return CustomizePlanFragment.m27892M(this.f7971x, (AbstractC24716a) obj);
                            default:
                                return CustomizePlanFragment.m27893N(this.f7971x, (AbstractC37617i) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(customizePlanFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new Function1(customizePlanFragment) { // from class: at2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ CustomizePlanFragment f7971x;

                    {
                        this.f7971x = customizePlanFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return CustomizePlanFragment.m27892M(this.f7971x, (AbstractC24716a) obj);
                            default:
                                return CustomizePlanFragment.m27893N(this.f7971x, (AbstractC37617i) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC2016m.m6261k0(abstractC39758eM27891L, function1, (Function1) objM87133R2, customizePlanFragment.onExit, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final AbstractC39758e m27891L(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC39758e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m27892M(CustomizePlanFragment customizePlanFragment, AbstractC24716a it) {
        AbstractC22676k.m65750j(it, "it");
        customizePlanFragment.m27889J().m72377q(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m27893N(CustomizePlanFragment customizePlanFragment, AbstractC37617i viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof AbstractC37617i.i) {
            AbstractC37617i.i iVar = (AbstractC37617i.i) viewEvent;
            String strM27885F = customizePlanFragment.m27885F();
            viewEvent = AbstractC37617i.i.m120832b(iVar, null, null, 0.0d, false, strM27885F == null ? "" : strM27885F, 15, null);
        } else if (viewEvent instanceof AbstractC37617i.f) {
            AbstractC37617i.f fVar = (AbstractC37617i.f) viewEvent;
            String strM27885F2 = customizePlanFragment.m27885F();
            viewEvent = AbstractC37617i.f.m120822b(fVar, null, null, null, strM27885F2 == null ? "" : strM27885F2, 7, null);
        } else if (viewEvent instanceof AbstractC37617i.h) {
            AbstractC37617i.h hVar = (AbstractC37617i.h) viewEvent;
            String strM27885F3 = customizePlanFragment.m27885F();
            viewEvent = AbstractC37617i.h.m120827b(hVar, null, null, null, strM27885F3 == null ? "" : strM27885F3, 7, null);
        } else if (viewEvent instanceof AbstractC37617i.c) {
            AbstractC37617i.c cVar = (AbstractC37617i.c) viewEvent;
            String strM27885F4 = customizePlanFragment.m27885F();
            viewEvent = AbstractC37617i.c.m120816b(cVar, null, null, strM27885F4 == null ? "" : strM27885F4, 3, null);
        }
        customizePlanFragment.m27888I().m127179j(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m27894O(CustomizePlanFragment customizePlanFragment) {
        if (customizePlanFragment.m27886G().isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_HOME_TILE_BEHAVIOR_IMPACTS)) {
            AbstractC5583n.m16799z(customizePlanFragment).m36410z();
        } else {
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(customizePlanFragment);
            Uri uri = Uri.parse("android-app://com.whoop/coaching?tab=0");
            C12969k0 c12969k0M30854f = AbstractC11478a.m30854f(uri, "uri", uri, null, null);
            C12997x0 c12997x0 = new C12997x0(true, false, -1, false, false, -1, -1, -1, -1);
            abstractC12939a0M16799z.getClass();
            abstractC12939a0M16799z.m36409x(c12969k0M30854f, c12997x0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m27895P(CustomizePlanFragment customizePlanFragment) {
        return customizePlanFragment.requireArguments().getString("planEditScreens");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        List listM127274a;
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C39757d c39757dM27888I = m27888I();
        String strM27887H = m27887H();
        if (strM27887H == null || (listM127274a = AbstractC39760g.m127274a(strM27887H)) == null) {
            listM127274a = C25271y.f99162w;
        }
        c39757dM27888I.m127179j(new AbstractC37617i.d(listM127274a));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new InterfaceC4351m() { // from class: at2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return CustomizePlanFragment.m27890K(this.f7950w, (Composer) obj, iIntValue);
            }
        }, true, -1730845458));
    }
}
