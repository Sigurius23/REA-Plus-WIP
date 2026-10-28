package kp0;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gf2.C15793b;
import hj0.AbstractC17352k;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.C28216y;
import p000.AbstractC11266d;
import p161g.AbstractC14917t;
import p161g.DialogC14910m;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qe2.AbstractC30314g;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: kp0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!R\u001a\u0010&\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R+\u0010/\u001a\u00020'2\u0006\u0010(\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u001b\u00108\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b:\u0010;¨\u0006>"}, m65681d2 = {"Lkp0/i;", "Lhj0/k;", "<init>", "()V", "Lkp0/g;", "optimalSleepCalculation", "Ll83/a0;", "N", "(Lkp0/g;)V", "", "source", "I", "(Ljava/lang/String;)V", "setupClickListeners", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onStart", "", "isOptimizeSleepOrWeeklyPlan", "J", "(Z)V", "G", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lgf2/b;", "<set-?>", "H", "Lcom/whoop/ui/b;", "K", "()Lgf2/b;", "O", "(Lgf2/b;)V", "binding", "Lor2/y;", "Ll83/h;", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "L", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lkp0/j;", "M", "()Lkp0/j;", "viewModel", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22742i extends AbstractC17352k {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String logTag = "OptimalSleepDialogFragment";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: M */
    static final /* synthetic */ InterfaceC21493z[] f89449M = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C22742i.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/FragmentOptimalSleepDialogBinding;", 0))};

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    public static final int f89450N = 8;

    /* JADX INFO: renamed from: kp0.i$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkp0/i$a;", "", "<init>", "()V", "Lkp0/g;", "optimalSleepCalculation", "Lkp0/i;", "a", "(Lkp0/g;)Lkp0/i;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C22742i m65849a(C22740g optimalSleepCalculation) {
            AbstractC22676k.m65750j(optimalSleepCalculation, "optimalSleepCalculation");
            C22742i c22742i = new C22742i();
            Bundle bundle = new Bundle();
            bundle.putParcelable("OPTIMAL_SLEEP_CALCULATION", optimalSleepCalculation);
            c22742i.setArguments(bundle);
            return c22742i;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kp0.i$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"kp0/i$b", "Lg/t;", "Ll83/a0;", "d", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC14917t {
        public b() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            C22742i.this.m65840I("Native Back");
        }
    }

    /* JADX INFO: renamed from: kp0.i$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f89457w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f89458x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f89459y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f89457w = componentCallbacks;
            this.f89458x = interfaceC35951a;
            this.f89459y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f89457w;
            InterfaceC35951a interfaceC35951a = this.f89458x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f89459y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: kp0.i$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f89460w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f89461x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f89462y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f89460w = componentCallbacks;
            this.f89461x = interfaceC35951a;
            this.f89462y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f89460w;
            InterfaceC35951a interfaceC35951a = this.f89461x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f89462y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: kp0.i$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f89463w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f89463w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f89463w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: kp0.i$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f89464w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f89465x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f89466y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f89467z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f89464w = componentCallbacks;
            this.f89465x = interfaceC35951a;
            this.f89466y = interfaceC4339a;
            this.f89467z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, kp0.j] */
        @Override // c93.InterfaceC4339a
        public final C22743j invoke() {
            return AbstractC34132o.m107857B(this.f89464w, this.f89465x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22743j.class), this.f89466y, this.f89467z);
        }
    }

    public C22742i() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new c(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new d(this, null, null));
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(this, null, new e(this), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m65840I(String source) {
        m65843M().m65851y(source);
        dismiss();
    }

    /* JADX INFO: renamed from: K */
    private final C15793b m65841K() {
        return (C15793b) this.binding.getValue(this, f89449M[0]);
    }

    /* JADX INFO: renamed from: L */
    private final FeatureFlagChecker m65842L() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C22743j m65843M() {
        return (C22743j) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final void m65844N(C22740g optimalSleepCalculation) {
        String strM30461o = AbstractC11266d.m30461o("+", optimalSleepCalculation.getRecentStrain());
        String strM30461o2 = AbstractC11266d.m30461o("+", optimalSleepCalculation.getSleepDebt());
        String strM30461o3 = AbstractC11266d.m30461o("-", optimalSleepCalculation.getRecentNaps());
        String strM30461o4 = AbstractC11266d.m30461o("+", optimalSleepCalculation.getAverageAwakeTime());
        C15793b c15793bM65841K = m65841K();
        c15793bM65841K.f59537v.setText(optimalSleepCalculation.getSleepNeed());
        c15793bM65841K.f59520e.setText(optimalSleepCalculation.getBaseline());
        c15793bM65841K.f59527l.setText(strM30461o);
        c15793bM65841K.f59533r.setText(strM30461o2);
        c15793bM65841K.f59525j.setText(strM30461o3);
        c15793bM65841K.f59534s.setText(getResources().getString(optimalSleepCalculation.getSleepGoalLabel()));
        c15793bM65841K.f59535t.setText(optimalSleepCalculation.getSleepGoal());
        c15793bM65841K.f59518c.setText(strM30461o4);
        c15793bM65841K.f59531p.setText(optimalSleepCalculation.getRecommendedTimeInBed());
    }

    /* JADX INFO: renamed from: O */
    private final void m65845O(C15793b c15793b) {
        this.binding.setValue(this, f89449M[0], c15793b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m65846P(C22742i c22742i, View it) {
        AbstractC22676k.m65750j(it, "it");
        c22742i.m65840I("Back Arrow");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m65847Q(C22742i c22742i, View it) {
        AbstractC22676k.m65750j(it, "it");
        c22742i.m65843M().m65852z();
        C28216y externalLinkNavigator = c22742i.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = c22742i.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85434x(abstractActivityC1340r0RequireActivity, c22742i.m65843M().getTonightsSleepUrl(), false);
        return C23454a0.f92919a;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final void setupClickListeners() {
        ImageView optimalClose = m65841K().f59523h;
        AbstractC22676k.m65749i(optimalClose, "optimalClose");
        final int i13 = 0;
        AbstractC1953c.m5963a(optimalClose, new Function1(this) { // from class: kp0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C22742i f89447x;

            {
                this.f89447x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C22742i.m65846P(this.f89447x, (View) obj);
                    default:
                        return C22742i.m65847Q(this.f89447x, (View) obj);
                }
            }
        });
        TextView learnMoreLabel = m65841K().f59522g;
        AbstractC22676k.m65749i(learnMoreLabel, "learnMoreLabel");
        final int i14 = 1;
        AbstractC1953c.m5963a(learnMoreLabel, new Function1(this) { // from class: kp0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C22742i f89447x;

            {
                this.f89447x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C22742i.m65846P(this.f89447x, (View) obj);
                    default:
                        return C22742i.m65847Q(this.f89447x, (View) obj);
                }
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m65848J(boolean isOptimizeSleepOrWeeklyPlan) {
        int i13;
        String string;
        String string2;
        C15793b c15793bM65841K = m65841K();
        ConstraintLayout constraintLayout = c15793bM65841K.f59529n;
        if (m65842L().isFeatureEnabled(FeatureFlagRepositoryKt.SLEEP_PLANNER_CEREAL_BOX)) {
            i13 = 0;
        } else {
            m65842L().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS);
            i13 = 8;
        }
        constraintLayout.setVisibility(i13);
        c15793bM65841K.f59522g.setVisibility((m65842L().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS) || m65842L().isFeatureEnabled(FeatureFlagRepositoryKt.SLEEP_PLANNER_CEREAL_BOX)) ? 8 : 0);
        TextView textView = m65841K().f59521f;
        if (m65842L().isFeatureEnabled(FeatureFlagRepositoryKt.SLEEP_PLANNER_CEREAL_BOX)) {
            string = getString(AbstractC30314g.f124321j0);
        } else {
            string = m65842L().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS) ? getString(AbstractC30314g.f124318i0) : getString(AbstractC30314g.f124315h0);
        }
        textView.setText(string);
        TextView textView2 = c15793bM65841K.f59528m;
        if (m65842L().isFeatureEnabled(FeatureFlagRepositoryKt.SLEEP_PLANNER_CEREAL_BOX) && isOptimizeSleepOrWeeklyPlan) {
            string2 = getString(AbstractC30314g.f124236B0);
        } else {
            string2 = !m65842L().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS) ? getString(AbstractC30314g.f124369z0) : getString(AbstractC30314g.f124233A0);
        }
        textView2.setText(string2);
    }

    @Override // hj0.AbstractC17352k
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        DialogC14910m dialogC14910m = new DialogC14910m(contextRequireContext, getTheme());
        dialogC14910m.getOnBackPressedDispatcher().m43015a(dialogC14910m, new b());
        return dialogC14910m;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15793b c15793bM44559c = C15793b.m44559c(inflater, container, false);
        AbstractC22676k.m65749i(c15793bM44559c, "inflate(...)");
        m65845O(c15793bM44559c);
        ConstraintLayout root = m65841K().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17352k, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }

    @Override // hj0.AbstractC17352k, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        C22740g c22740g;
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupClickListeners();
        Bundle arguments = getArguments();
        if (arguments == null || (c22740g = (C22740g) arguments.getParcelable("OPTIMAL_SLEEP_CALCULATION")) == null) {
            return;
        }
        m65844N(c22740g);
        m65848J(c22740g.getIsOptimalSleepOrWeeklyPlan());
    }
}
