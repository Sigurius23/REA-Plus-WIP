package com.whoop.stories;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.stories.OnboardingStoryFragment;
import com.whoop.video.VideoActivity;
import ec3.InterfaceC13058l;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lh1.C24069a;
import lh2.C24071b;
import lh2.C24073d;
import lh2.C24074e;
import m83.AbstractC25260n;
import o12.AbstractC27417d;
import o12.C27418e;
import or2.AbstractC28163g0;
import p000.AbstractC11266d;
import p114eb.AbstractC12939a0;
import p114eb.C12962i;
import p12.AbstractC28734x;
import p12.C28714e;
import p12.C28735y;
import p12.EnumC28717g;
import p161g.AbstractC14917t;
import p161g.C14923z;
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
import tw0.AbstractC34217c;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001;\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006D²\u0006\f\u0010C\u001a\u00020B8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/stories/OnboardingStoryFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "l0", "k0", "Lp12/e;", "education", "g0", "(Lp12/e;)V", "", "Lcom/whoop/data/onboarding/FeatureEducationType;", "m0", "(Ljava/lang/String;)Lcom/whoop/data/onboarding/FeatureEducationType;", "videoUrl", "label", "h0", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Llh2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leb/i;", "R", "()Llh2/e;", "args", "Lo12/e;", "x", "Ll83/h;", "U", "()Lo12/e;", "viewModel", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "y", "S", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "", "z", "Ljava/lang/Long;", "cycleId", "Lcom/whoop/stories/c;", "E", "T", "()Lcom/whoop/stories/c;", "router", "com/whoop/stories/OnboardingStoryFragment$b", "F", "Lcom/whoop/stories/OnboardingStoryFragment$b;", "callBack", "getLogTag", "()Ljava/lang/String;", "logTag", "Lp12/y;", "viewState", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OnboardingStoryFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h router;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C10262b callBack;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24074e.class), new C10265e(this));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10267g(this, null, new C10266f(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private Long cycleId;

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoryFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10261a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31008a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f31009b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f31010c;

        static {
            int[] iArr = new int[FeatureEducationType.values().length];
            try {
                iArr[FeatureEducationType.PREGNANCY_STORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureEducationType.PREGNANCY_STORY_V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeatureEducationType.WEIGHTLIFTING_MSK_STORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeatureEducationType.DEVICE_SETUP_STORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FeatureEducationType.HEALTHSPAN_ONBOARDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FeatureEducationType.SAGE_ONBOARDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FeatureEducationType.ADVANCED_LABS_EARLY_ACCESS_ONBOARDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f31008a = iArr;
            int[] iArr2 = new int[EnumC28717g.values().length];
            try {
                iArr2[EnumC28717g.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC28717g.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f31009b = iArr2;
            int[] iArr3 = new int[EnumC3919c.values().length];
            try {
                iArr3[EnumC3919c.FILLED_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC3919c.PROGRESS_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC3919c.BACK_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f31010c = iArr3;
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoryFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/stories/OnboardingStoryFragment$b", "Lg/t;", "Ll83/a0;", "d", "()V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10262b extends AbstractC14917t {
        public C10262b() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            OnboardingStoryFragment.this.m26180l0();
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoryFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10263c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31012w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31013x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31014y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10263c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31012w = componentCallbacks;
            this.f31013x = interfaceC35951a;
            this.f31014y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f31012w;
            InterfaceC35951a interfaceC35951a = this.f31013x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31014y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoryFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10264d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31015w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31016x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31017y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10264d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31015w = componentCallbacks;
            this.f31016x = interfaceC35951a;
            this.f31017y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.stories.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C10270c invoke() {
            ComponentCallbacks componentCallbacks = this.f31015w;
            InterfaceC35951a interfaceC35951a = this.f31016x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31017y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10270c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoryFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10265e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f31018w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10265e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f31018w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f31018w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f31018w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoryFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10266f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31019w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10266f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31019w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31019w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoryFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10267g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31020w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31021x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31022y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31023z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10267g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31020w = componentCallbacks;
            this.f31021x = interfaceC35951a;
            this.f31022y = interfaceC4339a;
            this.f31023z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, o12.e] */
        @Override // c93.InterfaceC4339a
        public final C27418e invoke() {
            return AbstractC34132o.m107857B(this.f31020w, this.f31021x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27418e.class), this.f31022y, this.f31023z);
        }
    }

    public OnboardingStoryFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new C10263c(this, null, null));
        this.router = AbstractC30060g.m92087G(enumC23463i, new C10264d(this, null, new C24073d(this, 0)));
        this.callBack = new C10262b();
    }

    /* JADX INFO: renamed from: R */
    private final C24074e m26160R() {
        return (C24074e) this.args.getValue();
    }

    /* JADX INFO: renamed from: S */
    private final FeatureFlagRepository m26161S() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: T */
    private final C10270c m26162T() {
        return (C10270c) this.router.getValue();
    }

    /* JADX INFO: renamed from: U */
    private final C27418e m26163U() {
        return (C27418e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m26164V(final OnboardingStoryFragment onboardingStoryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C14923z onBackPressedDispatcher = onboardingStoryFragment.requireActivity().getOnBackPressedDispatcher();
            InterfaceC1585g0 viewLifecycleOwner = onboardingStoryFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m43015a(viewLifecycleOwner, onboardingStoryFragment.callBack);
            InterfaceC13058l viewState = onboardingStoryFragment.m26163U().getViewState();
            C28735y c28735y = new C28735y(true, false, null, false, null, 30, null);
            int i14 = C28735y.f116302f;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, c28735y, null, c28655q, i14 << 3, 2);
            onboardingStoryFragment.m26163U().m82823r();
            C28735y c28735yM26165W = m26165W(interfaceC28601c1M87260n);
            boolean zIsFeatureEnabled = onboardingStoryFragment.m26161S().isFeatureEnabled(FeatureFlagRepositoryKt.CUSTOM_BOTTOM_SHEET);
            boolean zIsFeatureEnabled2 = onboardingStoryFragment.m26161S().isFeatureEnabled(FeatureFlagRepositoryKt.FEATURE_ONBOARDING_PROGRESS_BUTTON);
            boolean zIsFeatureEnabled3 = onboardingStoryFragment.m26161S().isFeatureEnabled(FeatureFlagRepositoryKt.MEDIA_CARD_ARTICLE_TILE_MIGRATION);
            boolean zM87157i = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C24073d(onboardingStoryFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C24073d(onboardingStoryFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C24073d(onboardingStoryFragment, 3);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i15 = 2;
                objM87133R4 = new Function1(onboardingStoryFragment) { // from class: lh2.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ OnboardingStoryFragment f95114x;

                    {
                        this.f95114x = onboardingStoryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return OnboardingStoryFragment.m26173e0(this.f95114x, (AbstractC34217c) obj);
                            case 1:
                                return OnboardingStoryFragment.m26174f0(this.f95114x, (EnumC3919c) obj);
                            case 2:
                                return OnboardingStoryFragment.m26169a0(this.f95114x, (C28714e) obj);
                            case 3:
                                return OnboardingStoryFragment.m26170b0(this.f95114x, (C28714e) obj);
                            default:
                                return OnboardingStoryFragment.m26171c0(this.f95114x, (EnumC28717g) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                final int i16 = 3;
                objM87133R5 = new Function1(onboardingStoryFragment) { // from class: lh2.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ OnboardingStoryFragment f95114x;

                    {
                        this.f95114x = onboardingStoryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return OnboardingStoryFragment.m26173e0(this.f95114x, (AbstractC34217c) obj);
                            case 1:
                                return OnboardingStoryFragment.m26174f0(this.f95114x, (EnumC3919c) obj);
                            case 2:
                                return OnboardingStoryFragment.m26169a0(this.f95114x, (C28714e) obj);
                            case 3:
                                return OnboardingStoryFragment.m26170b0(this.f95114x, (C28714e) obj);
                            default:
                                return OnboardingStoryFragment.m26171c0(this.f95114x, (EnumC28717g) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function2 = (Function1) objM87133R5;
            boolean zM87157i6 = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                final int i17 = 4;
                objM87133R6 = new Function1(onboardingStoryFragment) { // from class: lh2.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ OnboardingStoryFragment f95114x;

                    {
                        this.f95114x = onboardingStoryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                return OnboardingStoryFragment.m26173e0(this.f95114x, (AbstractC34217c) obj);
                            case 1:
                                return OnboardingStoryFragment.m26174f0(this.f95114x, (EnumC3919c) obj);
                            case 2:
                                return OnboardingStoryFragment.m26169a0(this.f95114x, (C28714e) obj);
                            case 3:
                                return OnboardingStoryFragment.m26170b0(this.f95114x, (C28714e) obj);
                            default:
                                return OnboardingStoryFragment.m26171c0(this.f95114x, (EnumC28717g) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            }
            Function1 function3 = (Function1) objM87133R6;
            boolean zM87157i7 = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i7 || objM87133R7 == c28676v0) {
                objM87133R7 = new C24071b(onboardingStoryFragment, 1);
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R7;
            boolean zM87157i8 = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i8 || objM87133R8 == c28676v0) {
                final int i18 = 0;
                objM87133R8 = new Function1(onboardingStoryFragment) { // from class: lh2.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ OnboardingStoryFragment f95114x;

                    {
                        this.f95114x = onboardingStoryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                return OnboardingStoryFragment.m26173e0(this.f95114x, (AbstractC34217c) obj);
                            case 1:
                                return OnboardingStoryFragment.m26174f0(this.f95114x, (EnumC3919c) obj);
                            case 2:
                                return OnboardingStoryFragment.m26169a0(this.f95114x, (C28714e) obj);
                            case 3:
                                return OnboardingStoryFragment.m26170b0(this.f95114x, (C28714e) obj);
                            default:
                                return OnboardingStoryFragment.m26171c0(this.f95114x, (EnumC28717g) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R8);
            }
            Function1 function4 = (Function1) objM87133R8;
            boolean zM87157i9 = c28655q.m87157i(onboardingStoryFragment);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i9 || objM87133R9 == c28676v0) {
                final int i19 = 1;
                objM87133R9 = new Function1(onboardingStoryFragment) { // from class: lh2.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ OnboardingStoryFragment f95114x;

                    {
                        this.f95114x = onboardingStoryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i19) {
                            case 0:
                                return OnboardingStoryFragment.m26173e0(this.f95114x, (AbstractC34217c) obj);
                            case 1:
                                return OnboardingStoryFragment.m26174f0(this.f95114x, (EnumC3919c) obj);
                            case 2:
                                return OnboardingStoryFragment.m26169a0(this.f95114x, (C28714e) obj);
                            case 3:
                                return OnboardingStoryFragment.m26170b0(this.f95114x, (C28714e) obj);
                            default:
                                return OnboardingStoryFragment.m26171c0(this.f95114x, (EnumC28717g) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC28734x.m87404Q(c28735yM26165W, true, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, function1, function2, function3, interfaceC4351m, function4, zIsFeatureEnabled, zIsFeatureEnabled2, zIsFeatureEnabled3, (Function1) objM87133R9, c28655q, i14 | 48, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private static final C28735y m26165W(InterfaceC28670t2 interfaceC28670t2) {
        return (C28735y) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m26166X(OnboardingStoryFragment onboardingStoryFragment) {
        onboardingStoryFragment.m26180l0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m26167Y(OnboardingStoryFragment onboardingStoryFragment) {
        onboardingStoryFragment.m26179k0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m26168Z(OnboardingStoryFragment onboardingStoryFragment) {
        String strM70995c = onboardingStoryFragment.m26160R().m70995c();
        AbstractC22676k.m65749i(strM70995c, "getOnboardingStoryType(...)");
        FeatureEducationType featureEducationTypeM26181m0 = onboardingStoryFragment.m26181m0(strM70995c);
        switch (featureEducationTypeM26181m0 == null ? -1 : C10261a.f31008a[featureEducationTypeM26181m0.ordinal()]) {
            case 1:
            case 2:
                C10270c.m26196N(onboardingStoryFragment.m26162T(), featureEducationTypeM26181m0, "", 0L, 4, null).getAction().invoke();
                break;
            case 3:
                onboardingStoryFragment.m26163U().m82821p("Workout Builder", "Onboarding", "Exit Screen", "");
                AbstractC5583n.m16799z(onboardingStoryFragment).m36410z();
                break;
            case 4:
                onboardingStoryFragment.requireActivity().finish();
                break;
            case 5:
                AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(onboardingStoryFragment);
                abstractC12939a0M16799z.m36410z();
                abstractC12939a0M16799z.m36410z();
                break;
            case 6:
                AbstractC12939a0 abstractC12939a0M16799z2 = AbstractC5583n.m16799z(onboardingStoryFragment);
                abstractC12939a0M16799z2.m36410z();
                abstractC12939a0M16799z2.m36410z();
                break;
            case 7:
                if (!onboardingStoryFragment.m26161S().isFeatureEnabled("advanced-labs-onboarding-exit-tab-fix")) {
                    AbstractC12939a0 abstractC12939a0M16799z3 = AbstractC5583n.m16799z(onboardingStoryFragment);
                    abstractC12939a0M16799z3.m36410z();
                    abstractC12939a0M16799z3.m36410z();
                } else {
                    onboardingStoryFragment.m26162T().m26242u();
                }
                break;
            default:
                AbstractC5583n.m16799z(onboardingStoryFragment).m36410z();
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m26169a0(OnboardingStoryFragment onboardingStoryFragment, C28714e it) {
        AbstractC22676k.m65750j(it, "it");
        onboardingStoryFragment.m26175g0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m26170b0(OnboardingStoryFragment onboardingStoryFragment, C28714e it) {
        AbstractC22676k.m65750j(it, "it");
        onboardingStoryFragment.m26175g0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m26171c0(OnboardingStoryFragment onboardingStoryFragment, EnumC28717g it) {
        AbstractC22676k.m65750j(it, "it");
        int i13 = C10261a.f31009b[it.ordinal()];
        if (i13 == 1) {
            onboardingStoryFragment.m26179k0();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            onboardingStoryFragment.m26180l0();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m26172d0(OnboardingStoryFragment onboardingStoryFragment, String videoUrl, String label) {
        AbstractC22676k.m65750j(videoUrl, "videoUrl");
        AbstractC22676k.m65750j(label, "label");
        onboardingStoryFragment.m26176h0(videoUrl, label);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m26173e0(OnboardingStoryFragment onboardingStoryFragment, AbstractC34217c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC34217c.b) {
            onboardingStoryFragment.m26163U().m82822q(new AbstractC27417d.d("SAVE_JOURNAL"));
        } else if (event instanceof AbstractC34217c.a) {
            onboardingStoryFragment.m26163U().m82822q(new AbstractC27417d.c(((AbstractC34217c.a) event).getId()));
        } else if (event instanceof AbstractC34217c.g) {
            onboardingStoryFragment.m26163U().m82822q(AbstractC27417d.g.f110426a);
        } else if (event instanceof AbstractC34217c.d) {
            onboardingStoryFragment.m26163U().m82822q(new AbstractC27417d.b(((AbstractC34217c.d) event).getFeatureEducationId()));
        } else if (event instanceof AbstractC34217c.h) {
            onboardingStoryFragment.m26163U().m82822q(new AbstractC27417d.h(((AbstractC34217c.h) event).getQuery()));
        } else if (event instanceof AbstractC34217c.c) {
            onboardingStoryFragment.m26163U().m82822q(new AbstractC27417d.a(((AbstractC34217c.c) event).getCategoryIndex()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m26174f0(OnboardingStoryFragment onboardingStoryFragment, EnumC3919c clickType) {
        AbstractC22676k.m65750j(clickType, "clickType");
        int i13 = C10261a.f31010c[clickType.ordinal()];
        if (i13 == 1 || i13 == 2) {
            onboardingStoryFragment.m26179k0();
        } else if (i13 == 3) {
            onboardingStoryFragment.m26180l0();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m26175g0(C28714e education) {
        m26163U().m82822q(new AbstractC27417d.b(education.getId()));
        C10270c c10270cM26162T = m26162T();
        FeatureEducationType featureEducationTypeM87353b = education.getType();
        String strM70994b = m26160R().m70994b();
        AbstractC22676k.m65749i(strM70994b, "getEntryPoint(...)");
        C10270c.m26196N(c10270cM26162T, featureEducationTypeM87353b, strM70994b, 0L, 4, null).getAction().invoke();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m26176h0(String videoUrl, String label) {
        Intent intent = new Intent(getContext(), (Class<?>) VideoActivity.class);
        intent.putExtra("videoUrl", videoUrl);
        intent.putExtra("SHOULD_SUBTITLES_DEFAULT_TO_OFF", true);
        intent.putExtra("VIDEO_LABEL", label);
        requireContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C34911a m26177i0(OnboardingStoryFragment onboardingStoryFragment) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{onboardingStoryFragment, new AbstractC10269b.f(new C24069a(1)), onboardingStoryFragment.requireActivity()}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m26178j0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k0 */
    private final void m26179k0() {
        m26163U().m82822q(AbstractC27417d.f.f110425a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public final void m26180l0() {
        m26163U().m82822q(AbstractC27417d.e.f110424a);
    }

    /* JADX INFO: renamed from: m0 */
    private final FeatureEducationType m26181m0(String str) {
        for (FeatureEducationType featureEducationType : FeatureEducationType.values()) {
            if (AbstractC22676k.m65745e(featureEducationType.name(), str)) {
                return featureEducationType;
            }
        }
        return null;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return "OnboardingStoryFragment";
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        this.cycleId = Long.valueOf(m26160R().m70993a());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C24071b(this, 0), true, 1033813630));
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
        C27418e c27418eM26163U = m26163U();
        String strM70995c = m26160R().m70995c();
        AbstractC22676k.m65749i(strM70995c, "getOnboardingStoryType(...)");
        c27418eM26163U.m82822q(new AbstractC27417d.d(strM70995c));
    }
}
