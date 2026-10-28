package com.whoop.coaching.sleepcoach.wizard.onboarding;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachWizarOnboardingFragment;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gf2.C15805n;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import op0.C28087e;
import op0.C28091i;
import op0.C28093k;
import op0.EnumC28085c;
import or2.AbstractC28163g0;
import p114eb.C12997x0;
import p190hc.AbstractC17145h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0003J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0014X\u0094D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R+\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010:\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u0010\u001d¨\u0006;"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;", "Lhj0/m;", "<init>", "()V", "Lop0/c;", "sleepCoachOnBoardingItem", "", "position", "Ll83/a0;", "O", "(Lop0/c;I)V", "N", "J", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/n;", "<set-?>", "y", "Lcom/whoop/ui/b;", "L", "()Lgf2/n;", "S", "(Lgf2/n;)V", "binding", "Lop0/e;", "z", "Ll83/h;", "M", "()Lop0/e;", "sleepCoachOnBoardingToolTipViewModel", "Lop0/k;", "E", "Lop0/k;", "onboardingAdapter", "F", "getEntryPoint", "entryPoint", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SleepCoachWizarOnboardingFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: G */
    static final /* synthetic */ InterfaceC21493z[] f24712G = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(SleepCoachWizarOnboardingFragment.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentSleepCoachWizardOnboardingBinding;", 0))};

    /* JADX INFO: renamed from: H */
    public static final int f24713H = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private C28093k onboardingAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h entryPoint;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h sleepCoachOnBoardingToolTipViewModel;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SleepCoachWizarOnboardingFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachWizarOnboardingFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6247a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24720a;

        static {
            int[] iArr = new int[EnumC28085c.values().length];
            try {
                iArr[EnumC28085c.ONBOARDING_SCREEN_PLANNER_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28085c.ONBOARDING_SCREEN_PLANNER_TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24720a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachWizarOnboardingFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment$b", "Lhc/h;", "", "position", "Ll83/a0;", "onPageSelected", "(I)V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6248b extends AbstractC17145h {
        public C6248b() {
        }

        @Override // p190hc.AbstractC17145h
        public void onPageSelected(int position) {
            int i13 = position + 1;
            SleepCoachWizarOnboardingFragment.this.m18782M().m84870I(i13, i13 == 1 ? "SLEEP IS THE FOUNDATION OF PERFORMANCE" : "UNLOCK THE PERFECT NIGHT’S SLEEP", "Onboarding Screen");
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachWizarOnboardingFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6249c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24722w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6249c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24722w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f24722w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f24722w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachWizarOnboardingFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6250d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24723w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24724x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24725y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24726z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6250d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24723w = abstractComponentCallbacksC1320m0;
            this.f24724x = interfaceC35951a;
            this.f24725y = interfaceC4339a;
            this.f24726z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, op0.e] */
        @Override // c93.InterfaceC4339a
        public final C28087e invoke() {
            return AbstractC37056f.m118952D(this.f24723w, this.f24724x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28087e.class), this.f24725y, this.f24726z);
        }
    }

    public SleepCoachWizarOnboardingFragment() {
        C6249c c6249c = new C6249c(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.sleepCoachOnBoardingToolTipViewModel = AbstractC30060g.m92087G(enumC23463i, new C6250d(this, null, c6249c, null));
        this.entryPoint = AbstractC30060g.m92087G(enumC23463i, new C28091i(this, 0));
    }

    /* JADX INFO: renamed from: J */
    private final void m18779J() {
        m18782M().m84868G();
        AbstractC5583n.m16799z(this).m36410z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final String m18780K(SleepCoachWizarOnboardingFragment sleepCoachWizarOnboardingFragment) {
        String string;
        Bundle arguments = sleepCoachWizarOnboardingFragment.getArguments();
        return (arguments == null || (string = arguments.getString("entryPoint")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: L */
    private final C15805n m18781L() {
        return (C15805n) this.binding.getValue(this, f24712G[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final C28087e m18782M() {
        return (C28087e) this.sleepCoachOnBoardingToolTipViewModel.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final void m18783N(EnumC28085c sleepCoachOnBoardingItem, int position) {
        if (C6247a.f24720a[sleepCoachOnBoardingItem.ordinal()] != 2) {
            throw new IllegalStateException("back click is not supported on this Onboarding state");
        }
        m18781L().f59648b.setCurrentItem(position - 1);
        m18782M().m84869H(position + 1, "BACK", " Previous Onboarding Screen");
    }

    /* JADX INFO: renamed from: O */
    private final void m18784O(EnumC28085c sleepCoachOnBoardingItem, int position) {
        int i13 = C6247a.f24720a[sleepCoachOnBoardingItem.ordinal()];
        if (i13 == 1) {
            int i14 = position + 1;
            m18781L().f59648b.setCurrentItem(i14);
            m18782M().m84869H(i14, "NEXT", "Next Onboarding Screen");
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("onNext click is not supported on this Onboarding state");
            }
            m18782M().m84869H(position + 1, "LET'S GO", "Next Onboarding Screen");
            AbstractC28163g0.m85259o(this).m85339e(Uri.parse("whoop://com.whoop/sleepCoachFragment/?entryPoint=Coaching Landing&clickType="), new C12997x0(false, false, -1, false, false, -1, -1, -1, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m18785P(SleepCoachWizarOnboardingFragment sleepCoachWizarOnboardingFragment, EnumC28085c sleepCoachOnBoardingItem, int i13) {
        AbstractC22676k.m65750j(sleepCoachOnBoardingItem, "sleepCoachOnBoardingItem");
        sleepCoachWizarOnboardingFragment.m18784O(sleepCoachOnBoardingItem, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m18786Q(SleepCoachWizarOnboardingFragment sleepCoachWizarOnboardingFragment, EnumC28085c sleepCoachOnBoardingItem, int i13) {
        AbstractC22676k.m65750j(sleepCoachOnBoardingItem, "sleepCoachOnBoardingItem");
        sleepCoachWizarOnboardingFragment.m18783N(sleepCoachOnBoardingItem, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m18787R(SleepCoachWizarOnboardingFragment sleepCoachWizarOnboardingFragment) {
        sleepCoachWizarOnboardingFragment.m18779J();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private final void m18788S(C15805n c15805n) {
        this.binding.setValue(this, f24712G[0], c15805n);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15805n c15805nM44595c = C15805n.m44595c(inflater, container, false);
        AbstractC22676k.m65749i(c15805nM44595c, "inflate(...)");
        m18788S(c15805nM44595c);
        ConstraintLayout constraintLayoutM44596b = m18781L().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM44596b, "getRoot(...)");
        return constraintLayoutM44596b;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final int i13 = 0;
        final int i14 = 1;
        this.onboardingAdapter = new C28093k(new InterfaceC4351m(this) { // from class: op0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizarOnboardingFragment f113615x;

            {
                this.f113615x = this;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int i15 = i13;
                EnumC28085c enumC28085c = (EnumC28085c) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i15) {
                    case 0:
                        return SleepCoachWizarOnboardingFragment.m18785P(this.f113615x, enumC28085c, iIntValue);
                    default:
                        return SleepCoachWizarOnboardingFragment.m18786Q(this.f113615x, enumC28085c, iIntValue);
                }
            }
        }, new InterfaceC4351m(this) { // from class: op0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizarOnboardingFragment f113615x;

            {
                this.f113615x = this;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int i15 = i14;
                EnumC28085c enumC28085c = (EnumC28085c) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i15) {
                    case 0:
                        return SleepCoachWizarOnboardingFragment.m18785P(this.f113615x, enumC28085c, iIntValue);
                    default:
                        return SleepCoachWizarOnboardingFragment.m18786Q(this.f113615x, enumC28085c, iIntValue);
                }
            }
        }, new C28091i(this, 1));
        m18781L().f59648b.setAdapter(this.onboardingAdapter);
        m18781L().f59648b.setUserInputEnabled(false);
        m18781L().f59648b.m5508b(new C6248b());
    }
}
