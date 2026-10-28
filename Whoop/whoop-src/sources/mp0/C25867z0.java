package mp0;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import as2.AbstractC1953c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.coaching.sleepcoach.harvard.view.C6223a;
import com.whoop.coaching.sleepcoach.harvard.view.TonightSleepBar;
import com.whoop.coaching.sleepcoach.wizard.C6241c;
import com.whoop.coaching.sleepcoach.wizard.C6245g;
import com.whoop.coaching.sleepcoach.wizard.C6246h;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import ge3.AbstractC15751g;
import gf2.AbstractC15794c;
import gf2.C15808q;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ip0.C20807d;
import ip0.EnumC20804a;
import j93.InterfaceC21493z;
import jf3.C21647a;
import kp0.AbstractC22734a;
import kp0.C22736c;
import kp0.C22739f;
import kp0.C22740g;
import kp0.C22742i;
import kp0.C22747n;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import lp0.AbstractC24638i;
import lp0.C24636g;
import lp0.C24641l;
import op0.AbstractC28090h;
import op0.C28087e;
import op0.C28088f;
import op0.EnumC28083a;
import or2.C28205u0;
import org.joda.time.LocalTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qe2.AbstractC30314g;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mp0.z0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010!J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b.\u0010\u0017J\u001f\u00101\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b3\u0010\u0017J+\u00107\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\n\b\u0002\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;R\u001a\u0010@\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010F\u001a\u00020A8\u0014X\u0094D¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER+\u0010O\u001a\u00020G2\u0006\u0010H\u001a\u00020G8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001b\u0010U\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010R\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010R\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010E¨\u0006m"}, m65681d2 = {"Lmp0/z0;", "Lhj0/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lcom/whoop/coaching/sleepcoach/wizard/g;", "state", "m0", "(Lcom/whoop/coaching/sleepcoach/wizard/g;)V", "k0", "viewState", "p0", "q0", "u0", "Y", "W", "anchorView", "t0", "(Landroid/view/View;)V", "", "title", "description", "ctaLabel", "Lip0/d$a;", "T", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lip0/d$a;", "P", "Lkp0/a;", "alarmType", "s0", "(Lkp0/a;)V", "i0", "Lkp0/n;", WeeklyPlanApiKt.GOAL, "l0", "(Lcom/whoop/coaching/sleepcoach/wizard/g;Lkp0/n;)V", "j0", "Lorg/joda/time/LocalTime;", "wakeTime", "bedTime", "n0", "(Lorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Lkp0/n;)V", "Landroid/text/SpannableStringBuilder;", "S", "()Landroid/text/SpannableStringBuilder;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/c;", "<set-?>", "y", "Lcom/whoop/ui/b;", "Q", "()Lgf2/c;", "h0", "(Lgf2/c;)V", "binding", "Lcom/whoop/coaching/sleepcoach/wizard/h;", "z", "Ll83/h;", "V", "()Lcom/whoop/coaching/sleepcoach/wizard/h;", "viewModel", "Lkp0/g;", "E", "Lkp0/g;", "optimalSleepCalculation", "F", "Lkp0/a;", "currentAlarmType", "Lip0/d;", "G", "Lip0/d;", "inAppSupportButtonTooltip", "Lor2/u0;", "H", "R", "()Lor2/u0;", "localizedDateTimeFormatter", "Lop0/e;", "I", "U", "()Lop0/e;", "sleepCoachToolTipViewModel", "a0", "isUsing24HourFormat", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25867z0 extends AbstractC17354m {

    /* JADX INFO: renamed from: J */
    static final /* synthetic */ InterfaceC21493z[] f101956J = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25867z0.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/FragmentTonightsSleepContainerBinding;", 0))};

    /* JADX INFO: renamed from: K */
    public static final int f101957K = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private C22740g optimalSleepCalculation;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private AbstractC22734a currentAlarmType;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private C20807d inAppSupportButtonTooltip;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h sleepCoachToolTipViewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "TonightsSleepContainerFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: mp0.z0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101967a;

        static {
            int[] iArr = new int[EnumC28083a.values().length];
            try {
                iArr[EnumC28083a.SLEEP_NEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28083a.BED_TIME_SUGGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101967a = iArr;
        }
    }

    /* JADX INFO: renamed from: mp0.z0$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101968w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101969x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101970y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101968w = componentCallbacks;
            this.f101969x = interfaceC35951a;
            this.f101970y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f101968w;
            InterfaceC35951a interfaceC35951a = this.f101969x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101970y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: mp0.z0$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101971w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f101971w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f101971w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f101971w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: mp0.z0$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101972w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101973x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101974y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101975z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101972w = abstractComponentCallbacksC1320m0;
            this.f101973x = interfaceC35951a;
            this.f101974y = interfaceC4339a;
            this.f101975z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.coaching.sleepcoach.wizard.h] */
        @Override // c93.InterfaceC4339a
        public final C6246h invoke() {
            return AbstractC37056f.m118952D(this.f101972w, this.f101973x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C6246h.class), this.f101974y, this.f101975z);
        }
    }

    /* JADX INFO: renamed from: mp0.z0$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101976w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f101976w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f101976w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f101976w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: mp0.z0$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101977w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101978x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101979y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101980z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101977w = abstractComponentCallbacksC1320m0;
            this.f101978x = interfaceC35951a;
            this.f101979y = interfaceC4339a;
            this.f101980z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, op0.e] */
        @Override // c93.InterfaceC4339a
        public final C28087e invoke() {
            return AbstractC37056f.m118952D(this.f101977w, this.f101978x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28087e.class), this.f101979y, this.f101980z);
        }
    }

    /* JADX INFO: renamed from: mp0.z0$g */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerFragment$toolTipHandler$1$1", m100430f = "TonightsSleepContainerFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101981w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25867z0.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f101981w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C25867z0.this.m76432U().m84865D(EnumC28083a.SLEEP_NEED);
            return C23454a0.f92919a;
        }
    }

    public C25867z0() {
        c cVar = new c(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new d(this, null, cVar, null));
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new b(this, null, new C24117a(this, 15)));
        this.sleepCoachToolTipViewModel = AbstractC30060g.m92087G(enumC23463i, new f(this, null, new e(this), null));
    }

    /* JADX INFO: renamed from: P */
    private final void m76427P() {
        C20807d c20807d = this.inAppSupportButtonTooltip;
        if (c20807d != null) {
            c20807d.m57361s();
        }
    }

    /* JADX INFO: renamed from: Q */
    private final AbstractC15794c m76428Q() {
        return (AbstractC15794c) this.binding.getValue(this, f101956J[0]);
    }

    /* JADX INFO: renamed from: R */
    private final C28205u0 m76429R() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: renamed from: S */
    private final SpannableStringBuilder m76430S() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ">66");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "%");
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.5f), length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: T */
    private final C20807d.a m76431T(String title, String description, String ctaLabel) {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        return new C20807d.a(contextRequireContext, null, 0).m57372j(title).m57367e(description).m57364b(ctaLabel).m57371i(false).m57366d(true).m57369g(500L).m57365c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final C28087e m76432U() {
        return (C28087e) this.sleepCoachToolTipViewModel.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final C6246h m76433V() {
        return (C6246h) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: W */
    private final void m76434W() {
        m76427P();
        String string = getString(AbstractC30314g.f124271P);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC30314g.f124304d1);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = getString(AbstractC30314g.f124273Q);
        AbstractC22676k.m65749i(string3, "getString(...)");
        this.inAppSupportButtonTooltip = m76431T(string, string2, string3).m57370h(new ViewOnClickListenerC25865y0(this, 0)).m57368f(5, 4).m57363a();
        TextView timeToBedValue = m76428Q().f59545g;
        AbstractC22676k.m65749i(timeToBedValue, "timeToBedValue");
        m76457t0(timeToBedValue);
        C28087e c28087eM76432U = m76432U();
        String string4 = getString(AbstractC30314g.f124271P);
        AbstractC22676k.m65749i(string4, "getString(...)");
        c28087eM76432U.m84870I(4, string4, "Onboarding Tooltip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m76435X(C25867z0 c25867z0, View view) {
        c25867z0.m76432U().m84865D(EnumC28083a.ALARM_TOGGLE);
        c25867z0.m76432U().m84869H(4, "NEXT", "Next Onboarding Tooltip");
    }

    /* JADX INFO: renamed from: Y */
    private final void m76436Y() {
        m76427P();
        String string = getString(AbstractC30314g.f124275R);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC30314g.f124307e1);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = getString(AbstractC30314g.f124273Q);
        AbstractC22676k.m65749i(string3, "getString(...)");
        this.inAppSupportButtonTooltip = m76431T(string, string2, string3).m57370h(new ViewOnClickListenerC25865y0(this, 1)).m57368f(5, 1).m57363a();
        View tonightsSleepBarClickableArea = m76428Q().f59547i;
        AbstractC22676k.m65749i(tonightsSleepBarClickableArea, "tonightsSleepBarClickableArea");
        m76457t0(tonightsSleepBarClickableArea);
        C28087e c28087eM76432U = m76432U();
        String string4 = getString(AbstractC30314g.f124275R);
        AbstractC22676k.m65749i(string4, "getString(...)");
        c28087eM76432U.m84870I(1, string4, "Onboarding Tooltip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m76437Z(C25867z0 c25867z0, View view) {
        c25867z0.m76432U().m84865D(EnumC28083a.SLEEP_GOAL);
        c25867z0.m76432U().m84869H(1, "NEXT", "Next Onboarding Tooltip");
    }

    /* JADX INFO: renamed from: a0 */
    private final boolean m76438a0() {
        return m76429R().m85383l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C34911a m76439b0(C25867z0 c25867z0) {
        return AbstractC15751g.m44431K(c25867z0.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m76440c0(C25867z0 c25867z0, C6245g it) {
        AbstractC22676k.m65750j(it, "it");
        c25867z0.currentAlarmType = it.getAlarmType();
        c25867z0.m76453p0(it);
        c25867z0.m76450m0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m76441d0(C25867z0 c25867z0, C6245g it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.getTonightSleepWindow().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String().getMillis() != 0) {
            c25867z0.currentAlarmType = it.getAlarmType();
            c25867z0.m76453p0(it);
            c25867z0.m76450m0(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m76442e0(C25867z0 c25867z0, C6241c it) {
        boolean zM18656f;
        AbstractC22676k.m65750j(it, "it");
        if (c25867z0.m76432U().getSleepAdviceOnBoardingLiveData().getValue() instanceof C28088f) {
            ConstraintLayout constraintLayoutM44606b = c25867z0.m76428Q().f59541c.getRoot();
            AbstractC22676k.m65749i(constraintLayoutM44606b, "getRoot(...)");
            constraintLayoutM44606b.setVisibility(8);
        } else {
            C15808q c15808q = c25867z0.m76428Q().f59541c;
            ConstraintLayout constraintLayoutM44606b2 = c15808q.getRoot();
            AbstractC22676k.m65749i(constraintLayoutM44606b2, "getRoot(...)");
            boolean z4 = constraintLayoutM44606b2.getVisibility() == 0;
            ConstraintLayout constraintLayoutM44606b3 = c15808q.getRoot();
            AbstractC22676k.m65749i(constraintLayoutM44606b3, "getRoot(...)");
            if (it.getIsInToggleMode()) {
                ConstraintLayout constraintLayoutM44606b4 = c15808q.getRoot();
                AbstractC22676k.m65749i(constraintLayoutM44606b4, "getRoot(...)");
                zM18656f = constraintLayoutM44606b4.getVisibility() != 0;
            } else {
                zM18656f = it.getIsPopUpVisible();
            }
            constraintLayoutM44606b3.setVisibility(zM18656f ? 0 : 8);
            c15808q.f59663d.setText(c25867z0.getResources().getString(AbstractC30314g.f124336o0, C28205u0.m85379j(c25867z0.m76429R(), it.getAlarmTime(), false, 2, null)));
            C6246h c6246hM76433V = c25867z0.m76433V();
            ConstraintLayout constraintLayoutM44606b5 = c15808q.getRoot();
            AbstractC22676k.m65749i(constraintLayoutM44606b5, "getRoot(...)");
            c6246hM76433V.m18768q0(it, constraintLayoutM44606b5.getVisibility() == 0);
            C6246h c6246hM76433V2 = c25867z0.m76433V();
            ConstraintLayout constraintLayoutM44606b6 = c15808q.getRoot();
            AbstractC22676k.m65749i(constraintLayoutM44606b6, "getRoot(...)");
            boolean z13 = !(constraintLayoutM44606b6.getVisibility() == 0);
            ConstraintLayout constraintLayoutM44606b7 = c15808q.getRoot();
            AbstractC22676k.m65749i(constraintLayoutM44606b7, "getRoot(...)");
            c6246hM76433V2.m18769r0(it, z13, z4 != (constraintLayoutM44606b7.getVisibility() == 0));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m76443f0(C25867z0 c25867z0, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25867z0.m76433V().m18760Z(EnumC25842n.CLOSE_EVENT);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m76444g0(C25867z0 c25867z0, EnumC28083a enumC28083a) {
        int i13 = enumC28083a == null ? -1 : a.f101967a[enumC28083a.ordinal()];
        if (i13 == 1) {
            c25867z0.m76436Y();
        } else if (i13 != 2) {
            c25867z0.m76427P();
        } else {
            c25867z0.m76434W();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private final void m76445h0(AbstractC15794c abstractC15794c) {
        this.binding.setValue(this, f101956J[0], abstractC15794c);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m76446i0(C6245g state) {
        m76428Q().f59548j.setText(getString(AbstractC30314g.f124255H1));
        m76428Q().f59544f.setText(getString(AbstractC30314g.f124269O));
        m76452o0(this, state.getWakeTime(), state.getSleepTime(), null, 4, null);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m76447j0(C6245g viewState) {
        AbstractC15794c abstractC15794cM76428Q = m76428Q();
        abstractC15794cM76428Q.f59548j.setText(getString(AbstractC30314g.f124239C0));
        abstractC15794cM76428Q.f59544f.setText(getString(AbstractC30314g.f124269O));
        TextView textView = abstractC15794cM76428Q.f59549k;
        SpannableStringBuilder spannableStringBuilderM76430S = m76430S();
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        textView.setText(spannableStringBuilderM76430S, bufferType);
        abstractC15794cM76428Q.f59545g.setText(AbstractC10538f.m27187l(viewState.getSleepTime(), m76438a0()), bufferType);
        abstractC15794cM76428Q.f59549k.setTextColor(getResources().getColor(AbstractC36510a.f156006O, null));
        abstractC15794cM76428Q.f59548j.setTextColor(getResources().getColor(AbstractC36510a.f156009R, null));
    }

    /* JADX INFO: renamed from: k0 */
    private final void m76448k0(C6245g state) {
        C24641l c24641lM18714i = state.getTonightSleepWindow();
        C24641l c24641lM18711f = state.getOptimalTimeInBedWindow();
        C6223a.Companion aVar = C6223a.INSTANCE;
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        C6223a c6223aM18564a = aVar.m18564a(AbstractC24638i.m71990d(abstractActivityC1340r0RequireActivity), c24641lM18714i, c24641lM18711f == null ? c24641lM18714i : c24641lM18711f);
        C24636g c24636g = new C24636g(m76429R());
        Resources resources = getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        m76428Q().f59542d.m18533e(c24636g.m71986c(c6223aM18564a, c24641lM18711f, resources, state.getAlarmType()));
    }

    /* JADX INFO: renamed from: l0 */
    private final void m76449l0(C6245g state, C22747n goal) {
        m76428Q().f59548j.setText(getString(AbstractC30314g.f124274Q0));
        m76428Q().f59544f.setText(getString(AbstractC30314g.f124269O));
        m76451n0(state.getWakeTime(), state.getSleepTime(), goal);
    }

    /* JADX INFO: renamed from: m0 */
    private final void m76450m0(C6245g state) {
        m76454q0(state);
        this.optimalSleepCalculation = state.getOptimalSleepCalculation();
        m76448k0(state);
        if (state.getIsWakeupTimeImpossible()) {
            m76456s0(state.getAlarmType());
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final void m76451n0(LocalTime wakeTime, LocalTime bedTime, C22747n goal) {
        SpannableStringBuilder spannableStringBuilderM27187l = AbstractC10538f.m27187l(wakeTime, m76438a0());
        SpannableStringBuilder spannableStringBuilderM27187l2 = AbstractC10538f.m27187l(bedTime, m76438a0());
        AbstractC15794c abstractC15794cM76428Q = m76428Q();
        if (goal != null) {
            abstractC15794cM76428Q.f59549k.setText(goal.getSleepPercent().getValue() + "%");
        } else {
            abstractC15794cM76428Q.f59549k.setText(spannableStringBuilderM27187l, TextView.BufferType.SPANNABLE);
        }
        abstractC15794cM76428Q.f59549k.setTextColor(getResources().getColor(AbstractC36510a.f156006O, null));
        abstractC15794cM76428Q.f59548j.setTextColor(getResources().getColor(AbstractC36510a.f156009R, null));
        abstractC15794cM76428Q.f59545g.setText(spannableStringBuilderM27187l2, TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m76452o0(C25867z0 c25867z0, LocalTime localTime, LocalTime localTime2, C22747n c22747n, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            c22747n = null;
        }
        c25867z0.m76451n0(localTime, localTime2, c22747n);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m76453p0(C6245g viewState) {
        AbstractC22734a abstractC22734aM18708c = viewState.getAlarmType();
        if (abstractC22734aM18708c instanceof C22736c) {
            m76446i0(viewState);
        } else if (abstractC22734aM18708c instanceof C22747n) {
            m76449l0(viewState, (C22747n) viewState.getAlarmType());
        } else {
            if (!(abstractC22734aM18708c instanceof C22739f)) {
                throw new NoWhenBranchMatchedException();
            }
            m76447j0(viewState);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m76454q0(C6245g state) {
        AbstractC15794c abstractC15794cM76428Q = m76428Q();
        TonightSleepBar tonightSleepBar = abstractC15794cM76428Q.f59546h;
        C24641l c24641lM18714i = state.getTonightSleepWindow();
        C24641l c24641lM18711f = state.getOptimalTimeInBedWindow();
        if (c24641lM18711f == null) {
            c24641lM18711f = state.getTonightSleepWindow();
        }
        tonightSleepBar.m18560x(c24641lM18714i, c24641lM18711f, state.getAlarmType(), state.getRecommendedTimeInBedString(), state.getEnabled());
        m76458u0();
        View tonightsSleepBarClickableArea = abstractC15794cM76428Q.f59547i;
        AbstractC22676k.m65749i(tonightsSleepBarClickableArea, "tonightsSleepBarClickableArea");
        AbstractC1953c.m5963a(tonightsSleepBarClickableArea, new C25863x0(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m76455r0(C25867z0 c25867z0, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25867z0.m76433V().m18765j0();
        c25867z0.m76433V().m18767o0();
        C22740g c22740g = c25867z0.optimalSleepCalculation;
        if (c22740g != null) {
            C22742i.INSTANCE.m65849a(c22740g).show(c25867z0.getChildFragmentManager(), (String) null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m76456s0(AbstractC22734a alarmType) {
        AbstractC15794c abstractC15794cM76428Q = m76428Q();
        abstractC15794cM76428Q.f59545g.setText(getString(AbstractC30314g.f124311g));
        if (alarmType instanceof C22739f) {
            return;
        }
        abstractC15794cM76428Q.f59549k.setTextColor(getResources().getColor(AbstractC36510a.f156021b0, null));
        abstractC15794cM76428Q.f59548j.setTextColor(getResources().getColor(AbstractC36510a.f156019a0, null));
    }

    /* JADX INFO: renamed from: t0 */
    private final void m76457t0(View anchorView) {
        C20807d c20807d = this.inAppSupportButtonTooltip;
        if (c20807d != null) {
            c20807d.m57362v(anchorView, -1, EnumC20804a.TOP);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m76458u0() {
        observe(m76432U().getSleepAdviceOnBoardingLiveData(), new C25816a1(new C25863x0(this, 6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m76459v0(C25867z0 c25867z0, AbstractC28090h abstractC28090h) {
        if (abstractC28090h instanceof C28088f) {
            InterfaceC1585g0 viewLifecycleOwner = c25867z0.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC1613o1.m5020j(viewLifecycleOwner).m4973b(c25867z0.new g(null));
            ConstraintLayout constraintLayoutM44606b = c25867z0.m76428Q().f59541c.getRoot();
            AbstractC22676k.m65749i(constraintLayoutM44606b, "getRoot(...)");
            if (constraintLayoutM44606b.getVisibility() == 0) {
                c25867z0.m76433V().m18759W();
            }
        }
        return C23454a0.f92919a;
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
        m76433V().m18766m0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC15794c abstractC15794cM44561c = AbstractC15794c.m44561c(inflater);
        AbstractC22676k.m65749i(abstractC15794cM44561c, "inflate(...)");
        m76445h0(abstractC15794cM44561c);
        View root = m76428Q().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        super.onDestroy();
        m76427P();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        observe(m76433V().getLoadSleepGraphDto(), new C25816a1(new C25863x0(this, 0)));
        observe(m76433V().getViewStateLiveData(), new C25816a1(new C25863x0(this, 1)));
        m76433V().m18759W();
        observe(m76433V().getLowBatteryPopUpLiveData(), new C25816a1(new C25863x0(this, 2)));
        ImageView messagePopUpClose = m76428Q().f59541c.f59665f;
        AbstractC22676k.m65749i(messagePopUpClose, "messagePopUpClose");
        AbstractC1953c.m5963a(messagePopUpClose, new C25863x0(this, 3));
        observe(m76432U().getOnboardingStateLiveData(), new C25816a1(new C25863x0(this, 4)));
    }
}
