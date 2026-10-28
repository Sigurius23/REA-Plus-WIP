package mp0;

import android.R;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.coaching.sleepcoach.wizard.C6239a;
import com.whoop.coaching.sleepcoach.wizard.ConductorViewState;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.sleep.coach.data.network.model.SleepCoachInteractionModal;
import ge3.AbstractC15751g;
import gf2.C15799h;
import gt0.InterfaceC16183e;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import ip0.C20807d;
import ip0.C20811h;
import ip0.EnumC20804a;
import j93.InterfaceC21493z;
import java.util.Locale;
import jf3.C21647a;
import js2.C21930h;
import kp0.AbstractC22734a;
import kp0.AbstractC22748o;
import kp0.C22736c;
import kp0.C22737d;
import kp0.C22739f;
import kp0.C22744k;
import kp0.C22745l;
import kp0.C22746m;
import kp0.C22747n;
import kp0.C22750q;
import kp0.C22751r;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import lq0.C24656d;
import op0.AbstractC28090h;
import op0.C28087e;
import op0.C28088f;
import op0.C28089g;
import op0.EnumC28083a;
import or2.C28205u0;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import os0.AbstractC28307c;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qe2.AbstractC30311d;
import qe2.AbstractC30314g;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mp0.b0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u0003J'\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010\u0003J\u0017\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u0010\u0003J\u000f\u00108\u001a\u00020\u000eH\u0002¢\u0006\u0004\b8\u0010\u0003J'\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b?\u0010@R\u001a\u0010E\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010I\u001a\u00020\u00138\u0014X\u0094D¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u0010HR+\u0010R\u001a\u00020J2\u0006\u0010K\u001a\u00020J8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00105R\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010U\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010U\u001a\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u00105R\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010U\u001a\u0004\bq\u0010rR\u001b\u0010x\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010U\u001a\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010HR\u0014\u0010|\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010H¨\u0006}"}, m65681d2 = {"Lmp0/b0;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "nextScheduleDayLabel", "", "scheduleEnabled", "F0", "(Ljava/lang/String;Z)V", "Lkotlin/Function1;", "confirmAction", "R0", "(Lkotlin/jvm/functions/Function1;)V", "G0", "Lkp0/a;", "currentAlarm", "enabled", "B0", "(Lkp0/a;ZZ)V", "", "enabledColor", "opacityColor", "z0", "(II)V", "C0", "(Lkp0/a;)V", "A0", "(Lkp0/a;Z)V", "a0", "(Lkp0/a;)Ljava/lang/String;", "Lorg/joda/time/LocalTime;", "time", "e0", "(Lorg/joda/time/LocalTime;)Ljava/lang/String;", "E0", "Lcom/whoop/coaching/sleepcoach/wizard/a;", "collapsedDataViewState", "k0", "(Lcom/whoop/coaching/sleepcoach/wizard/a;)V", "Z", "n0", "O0", "M0", "title", "description", "ctaLabel", "Lip0/d$a;", "h0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lip0/d$a;", "Q0", "(Landroid/view/View;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "x", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/h;", "<set-?>", "y", "Lcom/whoop/ui/b;", "b0", "()Lgf2/h;", "D0", "(Lgf2/h;)V", "binding", "Lmp0/i;", "z", "Ll83/h;", "c0", "()Lmp0/i;", "collapsedConductorViewModel", "E", "isInCollapsedState", "Lor2/u0;", "F", "g0", "()Lor2/u0;", "localizedDateTimeFormatter", "Lop0/e;", "G", "i0", "()Lop0/e;", "sleepCoachToolTipViewModel", "Lip0/d;", "H", "Lip0/d;", "inAppSupportButtonTooltip", "Ltr2/n;", "I", "Ltr2/n;", "logger", "J", "isLowBatteryStrapIconVisible", "Lgt0/e;", "K", "f0", "()Lgt0/e;", "fwUpdateApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "L", "d0", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "l0", "isUsing24HourFormat", "j0", "sleepScheduleEnabled", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25818b0 extends AbstractC17354m {

    /* JADX INFO: renamed from: M */
    static final /* synthetic */ InterfaceC21493z[] f101570M = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25818b0.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentSleepCoachCollapsedBinding;", 0))};

    /* JADX INFO: renamed from: N */
    public static final int f101571N = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isInCollapsedState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h sleepCoachToolTipViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private C20807d inAppSupportButtonTooltip;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean isLowBatteryStrapIconVisible;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h fwUpdateApi;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h collapsedConductorViewModel;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SleepCoachCollapsedFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: mp0.b0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101584a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f101585b;

        static {
            int[] iArr = new int[EnumC25817b.values().length];
            try {
                iArr[EnumC25817b.COLLAPSED_STATE_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25817b.SAVING_STATE_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25817b.EMPTY_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101584a = iArr;
            int[] iArr2 = new int[EnumC28083a.values().length];
            try {
                iArr2[EnumC28083a.LATEST_WAKE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC28083a.ALARM_TOGGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f101585b = iArr2;
        }
    }

    /* JADX INFO: renamed from: mp0.b0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f101586w;

        public b(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f101586w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f101586w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101586w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: mp0.b0$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101587w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101588x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101589y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101587w = componentCallbacks;
            this.f101588x = interfaceC35951a;
            this.f101589y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f101587w;
            InterfaceC35951a interfaceC35951a = this.f101588x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101589y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: mp0.b0$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101590w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101591x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101592y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101590w = componentCallbacks;
            this.f101591x = interfaceC35951a;
            this.f101592y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gt0.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC16183e invoke() {
            ComponentCallbacks componentCallbacks = this.f101590w;
            InterfaceC35951a interfaceC35951a = this.f101591x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101592y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC16183e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: mp0.b0$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101593w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101594x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101595y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101593w = componentCallbacks;
            this.f101594x = interfaceC35951a;
            this.f101595y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f101593w;
            InterfaceC35951a interfaceC35951a = this.f101594x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101595y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: mp0.b0$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101596w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f101596w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f101596w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f101596w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: mp0.b0$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101597w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101598x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101599y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101600z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101597w = abstractComponentCallbacksC1320m0;
            this.f101598x = interfaceC35951a;
            this.f101599y = interfaceC4339a;
            this.f101600z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, op0.e] */
        @Override // c93.InterfaceC4339a
        public final C28087e invoke() {
            return AbstractC37056f.m118952D(this.f101597w, this.f101598x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28087e.class), this.f101599y, this.f101600z);
        }
    }

    /* JADX INFO: renamed from: mp0.b0$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101601w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f101601w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f101601w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: mp0.b0$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101602w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101603x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101604y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101605z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101602w = componentCallbacks;
            this.f101603x = interfaceC35951a;
            this.f101604y = interfaceC4339a;
            this.f101605z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.i] */
        @Override // c93.InterfaceC4339a
        public final C25832i invoke() {
            return AbstractC34132o.m107857B(this.f101602w, this.f101603x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25832i.class), this.f101604y, this.f101605z);
        }
    }

    public C25818b0() {
        h hVar = new h(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.collapsedConductorViewModel = AbstractC30060g.m92087G(enumC23463i, new i(this, null, hVar, null));
        this.isInCollapsedState = true;
        C25866z c25866z = new C25866z(this, 1);
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(enumC23463i2, new c(this, null, c25866z));
        this.sleepCoachToolTipViewModel = AbstractC30060g.m92087G(enumC23463i, new g(this, null, new f(this), null));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("SleepCoachCollapsedFragment");
        this.fwUpdateApi = AbstractC30060g.m92087G(enumC23463i2, new d(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i2, new e(this, null, null));
    }

    /* JADX INFO: renamed from: A0 */
    private final void m76055A0(AbstractC22734a currentAlarm, boolean enabled) {
        m76098b0().f59583b.setText(enabled ? m76097a0(currentAlarm) : getResources().getString(AbstractC30314g.f124289Y));
    }

    /* JADX INFO: renamed from: B0 */
    private final void m76056B0(AbstractC22734a currentAlarm, boolean enabled, boolean scheduleEnabled) {
        m76098b0().f59586e.setChecked(enabled);
        if (!enabled) {
            m76098b0().f59591j.setBackground(scheduleEnabled ? getResources().getDrawable(AbstractC30311d.f124051v, null) : getResources().getDrawable(AbstractC30311d.f124053x, null));
            m76122z0(getResources().getColor(AbstractC36510a.f156010S, null), getResources().getColor(AbstractC36510a.f156010S, null));
            return;
        }
        Resources resources = getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        C23465k c23465kM76289b = AbstractC25839l0.m76289b(resources, currentAlarm);
        m76122z0(((Number) c23465kM76289b.f92937w).intValue(), ((Number) c23465kM76289b.f92938x).intValue());
        m76098b0().f59591j.setBackground(scheduleEnabled ? getResources().getDrawable(AbstractC30311d.f124051v, null) : getResources().getDrawable(AbstractC30311d.f124054y, null));
    }

    /* JADX INFO: renamed from: C0 */
    private final void m76057C0(AbstractC22734a currentAlarm) {
        C15799h c15799hM76098b0 = m76098b0();
        c15799hM76098b0.f59593l.setText(currentAlarm instanceof C22736c ? getResources().getString(AbstractC30314g.f124317i) : getResources().getString(AbstractC30314g.f124320j));
        c15799hM76098b0.f59592k.setText(m76101e0(currentAlarm.getLatestWakeTime()));
    }

    /* JADX INFO: renamed from: D0 */
    private final void m76058D0(C15799h c15799h) {
        this.binding.setValue(this, f101570M[0], c15799h);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m76060E0() {
        C15799h c15799hM76098b0 = m76098b0();
        c15799hM76098b0.f59595n.setVisibility(8);
        c15799hM76098b0.f59585d.setBackground(getResources().getDrawable(AbstractC30311d.f124036g, null));
        c15799hM76098b0.f59583b.setTextColor(getResources().getColor(AbstractC36510a.f156006O, null));
    }

    /* JADX INFO: renamed from: F0 */
    private final void m76062F0(String nextScheduleDayLabel, boolean scheduleEnabled) {
        TextView textView = m76098b0().f59589h;
        textView.setText(nextScheduleDayLabel);
        textView.setVisibility(scheduleEnabled ? 0 : 8);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: G0 */
    private final void m76064G0() {
        SwitchCompat switchCompat = m76098b0().f59586e;
        switchCompat.setOnTouchListener(new ViewOnTouchListenerC25815a0());
        SleepCoachInteractionModal sleepCoachInteractionModalM76239A = m76099c0().getTurnOffAllModal();
        if (sleepCoachInteractionModalM76239A == null) {
            String string = getString(AbstractC30314g.f124364x1);
            AbstractC22676k.m65749i(string, "getString(...)");
            String string2 = getString(AbstractC30314g.f124358v1);
            AbstractC22676k.m65749i(string2, "getString(...)");
            String string3 = getString(AbstractC30314g.f124361w1);
            AbstractC22676k.m65749i(string3, "getString(...)");
            String string4 = getString(AbstractC30314g.f124245E0);
            AbstractC22676k.m65749i(string4, "getString(...)");
            sleepCoachInteractionModalM76239A = new SleepCoachInteractionModal(string, string2, string3, string4);
        }
        AbstractC1953c.m5963a(switchCompat, new C21930h(this, switchCompat, sleepCoachInteractionModalM76239A, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final boolean m76066H0(View view, MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m76068I0(C25818b0 c25818b0, SwitchCompat switchCompat, SleepCoachInteractionModal sleepCoachInteractionModal, View it) {
        AbstractC22676k.m65750j(it, "it");
        boolean zMo45720a = c25818b0.m76102f0().mo45720a();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zMo45720a) {
            switchCompat.setChecked(!switchCompat.isChecked());
            ComposeView composeView = c25818b0.m76098b0().f59590i;
            if (composeView == null) {
                composeView = null;
            }
            if (composeView != null) {
                AbstractC28307c.m85763j(composeView);
            }
            return c23454a0;
        }
        if (!c25818b0.m76106j0()) {
            c25818b0.m76096Z();
            c25818b0.m76099c0().m76245H(switchCompat.isChecked(), false);
            c25818b0.m76099c0().m76249q();
            return c23454a0;
        }
        if (switchCompat.isChecked()) {
            c25818b0.m76086R0(new C24656d(14, c25818b0, switchCompat));
            return c23454a0;
        }
        Context contextRequireContext = c25818b0.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        C20811h c20811h = new C20811h(contextRequireContext, new C24117a(switchCompat, 11));
        String modalTitleDisplay = sleepCoachInteractionModal.getModalTitleDisplay();
        Locale locale = Locale.ROOT;
        String upperCase = modalTitleDisplay.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        String modalSubtextDisplay = sleepCoachInteractionModal.getModalSubtextDisplay();
        String upperCase2 = sleepCoachInteractionModal.getButtonActionDisplayText().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
        String upperCase3 = sleepCoachInteractionModal.getDismissActionDisplayText().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
        c20811h.m57387i(upperCase, modalSubtextDisplay, upperCase3, upperCase2, new C21930h(c25818b0, switchCompat, c20811h, 19));
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m76070J0(C25818b0 c25818b0, SwitchCompat switchCompat, boolean z4) {
        c25818b0.m76099c0().m76245H(switchCompat.isChecked(), z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m76072K0(SwitchCompat switchCompat) {
        switchCompat.setChecked(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m76074L0(C25818b0 c25818b0, SwitchCompat switchCompat, C20811h c20811h, boolean z4) {
        if (z4) {
            c25818b0.m76096Z();
            c25818b0.m76099c0().m76245H(switchCompat.isChecked(), true);
            c25818b0.m76099c0().m76249q();
        } else {
            switchCompat.setChecked(true);
            c20811h.m57386g();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M0 */
    private final void m76076M0() {
        String string = getString(AbstractC30314g.f124244E);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC30314g.f124301c1);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = getString(AbstractC30314g.f124241D);
        AbstractC22676k.m65749i(string3, "getString(...)");
        this.inAppSupportButtonTooltip = m76104h0(string, string2, string3).m57370h(new ViewOnClickListenerC25864y(this, 0)).m57368f(5, 5).m57363a();
        SwitchCompat alarmSwitch = m76098b0().f59586e;
        AbstractC22676k.m65749i(alarmSwitch, "alarmSwitch");
        m76084Q0(alarmSwitch);
        C28087e c28087eM76105i0 = m76105i0();
        String string4 = getString(AbstractC30314g.f124244E);
        AbstractC22676k.m65749i(string4, "getString(...)");
        c28087eM76105i0.m84870I(5, string4, "Onboarding Tooltip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m76078N0(C25818b0 c25818b0, View view) {
        c25818b0.m76105i0().m84867F();
        c25818b0.m76105i0().m84869H(5, "FINISH", "Next Onboarding Tooltip");
    }

    /* JADX INFO: renamed from: O0 */
    private final void m76080O0() {
        String string = getString(AbstractC30314g.f124327l0);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC30314g.f124324k0);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = getString(AbstractC30314g.f124273Q);
        AbstractC22676k.m65749i(string3, "getString(...)");
        this.inAppSupportButtonTooltip = m76104h0(string, string2, string3).m57370h(new ViewOnClickListenerC25864y(this, 1)).m57368f(5, 3).m57363a();
        View wakeTimeSetToBackground = m76098b0().f59594m;
        AbstractC22676k.m65749i(wakeTimeSetToBackground, "wakeTimeSetToBackground");
        m76084Q0(wakeTimeSetToBackground);
        C28087e c28087eM76105i0 = m76105i0();
        String string4 = getString(AbstractC30314g.f124327l0);
        AbstractC22676k.m65749i(string4, "getString(...)");
        c28087eM76105i0.m84870I(3, string4, "Onboarding Tooltip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m76082P0(C25818b0 c25818b0, View view) {
        c25818b0.m76105i0().m84865D(EnumC28083a.BED_TIME_SUGGESTION);
        c25818b0.m76105i0().m84869H(3, "NEXT", "Next Onboarding Tooltip");
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m76084Q0(View view) {
        C20807d c20807d = this.inAppSupportButtonTooltip;
        if (c20807d != null) {
            c20807d.m57362v(view, -1, EnumC20804a.TOP);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private final void m76086R0(Function1 confirmAction) {
        if (!m76106j0()) {
            m76096Z();
            confirmAction.invoke(Boolean.FALSE);
            m76099c0().m76249q();
            return;
        }
        SleepCoachInteractionModal sleepCoachInteractionModalM76240B = m76099c0().getTurnOffScheduleModal();
        if (sleepCoachInteractionModalM76240B == null) {
            String string = getString(AbstractC30314g.f124234A1);
            AbstractC22676k.m65749i(string, "getString(...)");
            String string2 = getString(AbstractC30314g.f124367y1);
            AbstractC22676k.m65749i(string2, "getString(...)");
            String string3 = getString(AbstractC30314g.f124370z1);
            AbstractC22676k.m65749i(string3, "getString(...)");
            String string4 = getString(AbstractC30314g.f124245E0);
            AbstractC22676k.m65749i(string4, "getString(...)");
            sleepCoachInteractionModalM76240B = new SleepCoachInteractionModal(string, string2, string3, string4);
        }
        m76096Z();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        C20811h c20811h = new C20811h(contextRequireContext, new C25866z(this, 0));
        String modalTitleDisplay = sleepCoachInteractionModalM76240B.getModalTitleDisplay();
        Locale locale = Locale.ROOT;
        String upperCase = modalTitleDisplay.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        String modalSubtextDisplay = sleepCoachInteractionModalM76240B.getModalSubtextDisplay();
        String upperCase2 = sleepCoachInteractionModalM76240B.getButtonActionDisplayText().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
        String upperCase3 = sleepCoachInteractionModalM76240B.getDismissActionDisplayText().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
        c20811h.m57387i(upperCase, modalSubtextDisplay, upperCase3, upperCase2, new C21930h(this, confirmAction, c20811h, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m76088S0(C25818b0 c25818b0) {
        SwitchCompat switchCompat = c25818b0.m76098b0().f59586e;
        C6239a c6239a = (C6239a) c25818b0.m76099c0().getViewStateLiveData().getValue();
        switchCompat.setChecked(c6239a != null ? c6239a.getEnabled() : false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C23454a0 m76090T0(C25818b0 c25818b0, Function1 function1, C20811h c20811h, boolean z4) {
        if (z4) {
            c25818b0.m76096Z();
            function1.invoke(Boolean.TRUE);
            c25818b0.m76099c0().m76249q();
        } else {
            SwitchCompat switchCompat = c25818b0.m76098b0().f59586e;
            C6239a c6239a = (C6239a) c25818b0.m76099c0().getViewStateLiveData().getValue();
            switchCompat.setChecked(c6239a != null ? c6239a.getEnabled() : false);
            c20811h.m57386g();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private final void m76096Z() {
        if (m76099c0().getIsStrapLowBattery()) {
            m76099c0().m76251t(false, EnumC25842n.OTHER_CLICK_EVENT);
        }
    }

    /* JADX INFO: renamed from: a0 */
    private final String m76097a0(AbstractC22734a currentAlarm) {
        if (currentAlarm instanceof C22736c) {
            String string = getResources().getString(AbstractC30314g.f124353u);
            AbstractC22676k.m65747g(string);
            return string;
        }
        if (currentAlarm instanceof C22739f) {
            String string2 = getResources().getString(AbstractC30314g.f124359w);
            AbstractC22676k.m65747g(string2);
            return string2;
        }
        if (!(currentAlarm instanceof C22747n)) {
            throw new NoWhenBranchMatchedException();
        }
        if (m76100d0().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS)) {
            String string3 = getResources().getString(AbstractC30314g.f124274Q0);
            AbstractC22676k.m65747g(string3);
            return string3;
        }
        C22747n c22747n = (C22747n) currentAlarm;
        AbstractC22748o abstractC22748oM65859d = c22747n.getSleepPercent();
        if (AbstractC22676k.m65745e(abstractC22748oM65859d, C22737d.f89416z)) {
            String string4 = getResources().getString(AbstractC30314g.f124312g0);
            AbstractC22676k.m65749i(string4, "getString(...)");
            return string4;
        }
        if (AbstractC22676k.m65745e(abstractC22748oM65859d, C22745l.f89475z)) {
            String string5 = getResources().getString(AbstractC30314g.f124365y);
            AbstractC22676k.m65749i(string5, "getString(...)");
            return string5;
        }
        if (AbstractC22676k.m65745e(abstractC22748oM65859d, C22746m.f89477z)) {
            String string6 = getResources().getString(AbstractC30314g.f124363x0);
            AbstractC22676k.m65749i(string6, "getString(...)");
            return string6;
        }
        if (!(abstractC22748oM65859d instanceof C22750q) && !(abstractC22748oM65859d instanceof C22751r) && !(abstractC22748oM65859d instanceof C22744k)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
        String string7 = getResources().getString(AbstractC30314g.f124365y);
        AbstractC22676k.m65747g(string7);
        return string7;
    }

    /* JADX INFO: renamed from: b0 */
    private final C15799h m76098b0() {
        return (C15799h) this.binding.getValue(this, f101570M[0]);
    }

    /* JADX INFO: renamed from: c0 */
    private final C25832i m76099c0() {
        return (C25832i) this.collapsedConductorViewModel.getValue();
    }

    /* JADX INFO: renamed from: d0 */
    private final FeatureFlagChecker m76100d0() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: e0 */
    private final String m76101e0(LocalTime time) {
        DateTimeFormatter dateTimeFormatterForPattern;
        if (m76108l0()) {
            dateTimeFormatterForPattern = DateTimeFormat.forPattern(DefaultDateFormatter.TIME_FORMAT_24H);
            AbstractC22676k.m65747g(dateTimeFormatterForPattern);
        } else {
            dateTimeFormatterForPattern = DateTimeFormat.forPattern(DefaultDateFormatter.TIME_FORMAT_12H);
            AbstractC22676k.m65747g(dateTimeFormatterForPattern);
        }
        String string = time.toString(dateTimeFormatterForPattern);
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: f0 */
    private final InterfaceC16183e m76102f0() {
        return (InterfaceC16183e) this.fwUpdateApi.getValue();
    }

    /* JADX INFO: renamed from: g0 */
    private final C28205u0 m76103g0() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final C20807d.a m76104h0(String title, String description, String ctaLabel) {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        return new C20807d.a(contextRequireContext, null, 0).m57372j(title).m57367e(description).m57364b(ctaLabel).m57371i(false).m57366d(true).m57369g(500L).m57365c(true);
    }

    /* JADX INFO: renamed from: i0 */
    private final C28087e m76105i0() {
        return (C28087e) this.sleepCoachToolTipViewModel.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    private final boolean m76106j0() {
        return m76099c0().m76254z();
    }

    /* JADX INFO: renamed from: k0 */
    private final void m76107k0(C6239a collapsedDataViewState) {
        C15799h c15799hM76098b0 = m76098b0();
        if (!collapsedDataViewState.getIsStrapHasLowBattery()) {
            TextView lowBatteryWarning = c15799hM76098b0.f59588g;
            AbstractC22676k.m65749i(lowBatteryWarning, "lowBatteryWarning");
            lowBatteryWarning.setVisibility(8);
            this.isLowBatteryStrapIconVisible = false;
            return;
        }
        TextView lowBatteryWarning2 = c15799hM76098b0.f59588g;
        AbstractC22676k.m65749i(lowBatteryWarning2, "lowBatteryWarning");
        lowBatteryWarning2.setVisibility(0);
        if (!collapsedDataViewState.getEnabled()) {
            TextView lowBatteryWarning3 = c15799hM76098b0.f59588g;
            AbstractC22676k.m65749i(lowBatteryWarning3, "lowBatteryWarning");
            lowBatteryWarning3.setVisibility(8);
            c15799hM76098b0.f59591j.setBackground(collapsedDataViewState.getIsScheduleEnabled() ? getResources().getDrawable(AbstractC30311d.f124051v, null) : getResources().getDrawable(AbstractC30311d.f124053x, null));
            return;
        }
        if (m76105i0().getSleepAdviceOnBoardingLiveData().getValue() instanceof C28088f) {
            TextView lowBatteryWarning4 = c15799hM76098b0.f59588g;
            AbstractC22676k.m65749i(lowBatteryWarning4, "lowBatteryWarning");
            lowBatteryWarning4.setVisibility(8);
            c15799hM76098b0.f59591j.setBackground(collapsedDataViewState.getIsScheduleEnabled() ? getResources().getDrawable(AbstractC30311d.f124051v, null) : getResources().getDrawable(AbstractC30311d.f124053x, null));
            return;
        }
        c15799hM76098b0.f59588g.setText(getResources().getString(AbstractC30314g.f124333n0));
        c15799hM76098b0.f59588g.setTextColor(getResources().getColor(AbstractC36510a.f156021b0, null));
        c15799hM76098b0.f59591j.setBackground(collapsedDataViewState.getIsScheduleEnabled() ? getResources().getDrawable(AbstractC30311d.f124052w, null) : getResources().getDrawable(AbstractC30311d.f124055z, null));
        this.isLowBatteryStrapIconVisible = true;
    }

    /* JADX INFO: renamed from: l0 */
    private final boolean m76108l0() {
        return m76103g0().m85383l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C34911a m76109m0(C25818b0 c25818b0) {
        return AbstractC15751g.m44431K(c25818b0.requireContext());
    }

    /* JADX INFO: renamed from: n0 */
    private final void m76110n0() {
        C15799h c15799hM76098b0 = m76098b0();
        TextView lowBatteryWarning = c15799hM76098b0.f59588g;
        AbstractC22676k.m65749i(lowBatteryWarning, "lowBatteryWarning");
        AbstractC1953c.m5963a(lowBatteryWarning, new C25862x(this, 3));
        ImageView strapIcon = c15799hM76098b0.f59591j;
        AbstractC22676k.m65749i(strapIcon, "strapIcon");
        AbstractC1953c.m5963a(strapIcon, new C25862x(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m76111o0(C25818b0 c25818b0, View it) {
        AbstractC22676k.m65750j(it, "it");
        if (c25818b0.isLowBatteryStrapIconVisible) {
            c25818b0.m76099c0().m76251t(true, EnumC25842n.LOW_BATTERY_INDICATOR);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m76112p0(C25818b0 c25818b0, View it) {
        AbstractC22676k.m65750j(it, "it");
        if (c25818b0.isLowBatteryStrapIconVisible) {
            c25818b0.m76099c0().m76251t(true, EnumC25842n.LOW_BATTERY_INDICATOR);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m76113q0(C25818b0 c25818b0, C6239a it) {
        AbstractC22676k.m65750j(it, "it");
        c25818b0.m76056B0(it.getAlarmType(), it.getEnabled(), it.getIsScheduleEnabled());
        c25818b0.m76055A0(it.getAlarmType(), it.getEnabled());
        c25818b0.m76057C0(it.getAlarmType());
        c25818b0.m76062F0(it.getNextScheduleDayLabel(), it.getIsScheduleEnabled());
        c25818b0.m76107k0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m76114r0(C25818b0 c25818b0, ConductorViewState it) {
        AbstractC22676k.m65750j(it, "it");
        c25818b0.m76099c0().m76242E(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m76115s0(C25818b0 c25818b0, C25820c it) {
        AbstractC22676k.m65750j(it, "it");
        int i13 = a.f101584a[it.getExpendedStateFlow().ordinal()];
        if (i13 == 1) {
            c25818b0.isInCollapsedState = true;
        } else if (i13 != 2) {
            if (i13 != 3) {
                c25818b0.isInCollapsedState = false;
            } else if (c25818b0.isInCollapsedState && c25818b0.m76098b0().f59586e.isChecked()) {
                c25818b0.m76099c0().m76246I();
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m76116t0(C25818b0 c25818b0, C15799h c15799h, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25818b0.m76086R0(new C25862x(c25818b0, 2));
        c25818b0.m76099c0().m76248p(c15799h.f59583b.getText().toString());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m76117u0(C25818b0 c25818b0, boolean z4) {
        c25818b0.m76099c0().m76245H(true, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m76118v0(C25818b0 c25818b0, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25818b0.m76086R0(new C25862x(c25818b0, 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m76119w0(C25818b0 c25818b0, boolean z4) {
        c25818b0.m76099c0().m76247M(z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m76120x0(C25818b0 c25818b0, EnumC28083a enumC28083a) {
        int i13 = enumC28083a == null ? -1 : a.f101585b[enumC28083a.ordinal()];
        if (i13 == 1) {
            c25818b0.m76080O0();
        } else if (i13 != 2) {
            C20807d c20807d = c25818b0.inAppSupportButtonTooltip;
            if (c20807d != null) {
                c20807d.m57361s();
            }
        } else {
            c25818b0.m76076M0();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m76121y0(C25818b0 c25818b0, AbstractC28090h abstractC28090h) {
        if (abstractC28090h instanceof C28089g) {
            c25818b0.m76105i0().m84865D(EnumC28083a.END_ON_BOARDING);
            c25818b0.m76099c0().m76250r();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z0 */
    private final void m76122z0(int enabledColor, int opacityColor) {
        SwitchCompat switchCompat = m76098b0().f59586e;
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_pressed, R.attr.state_checked, -16842912}, new int[]{-16842913}};
        switchCompat.setTrackTintList(new ColorStateList(iArr, new int[]{opacityColor, opacityColor, opacityColor}));
        switchCompat.setThumbTintList(new ColorStateList(iArr, new int[]{enabledColor, enabledColor, enabledColor}));
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
        C15799h c15799hM44574c = C15799h.m44574c(inflater);
        AbstractC22676k.m65749i(c15799hM44574c, "inflate(...)");
        m76058D0(c15799hM44574c);
        ConstraintLayout constraintLayoutM44576b = m76098b0().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM44576b, "getRoot(...)");
        return constraintLayoutM44576b;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        observe(m76099c0().getViewStateLiveData(), new b(new C25862x(this, 0)));
        m76099c0().m76244G();
        observe(m76099c0().getParentLiveData(), new b(new C25862x(this, 5)));
        observe(m76099c0().getAlarmOptionDeepLinkLiveData(), new b(new C25862x(this, 6)));
        C15799h c15799hM76098b0 = m76098b0();
        View alarmSetToBackground = c15799hM76098b0.f59585d;
        AbstractC22676k.m65749i(alarmSetToBackground, "alarmSetToBackground");
        AbstractC1953c.m5963a(alarmSetToBackground, new C24656d(15, this, c15799hM76098b0));
        View wakeTimeSetToBackground = m76098b0().f59594m;
        AbstractC22676k.m65749i(wakeTimeSetToBackground, "wakeTimeSetToBackground");
        AbstractC1953c.m5963a(wakeTimeSetToBackground, new C25862x(this, 7));
        m76064G0();
        m76060E0();
        m76110n0();
        observe(m76105i0().getOnboardingStateLiveData(), new b(new C25862x(this, 8)));
        observe(m76105i0().getSleepAdviceOnBoardingLiveData(), new b(new C25862x(this, 9)));
    }
}
