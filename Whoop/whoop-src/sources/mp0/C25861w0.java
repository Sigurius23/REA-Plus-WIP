package mp0;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import com.whoop.coaching.sleepcoach.wizard.ConductorViewState;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gf2.C15807p;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import j93.InterfaceC21493z;
import kp0.C22736c;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23459e;
import np0.C27020m;
import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import qe2.AbstractC30314g;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: mp0.w0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R+\u00102\u001a\u00020*2\u0006\u0010+\u001a\u00020*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lmp0/w0;", "Lmp0/k0;", "<init>", "()V", "", "alarmEnabled", "", "O", "(Z)Ljava/lang/String;", "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "viewState", "Ll83/a0;", "W", "(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V", "Ll83/k;", "P", "(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)Ll83/k;", "U", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "z", "Z", "timeSubmitted", "E", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lorg/joda/time/LocalTime;", "F", "Lorg/joda/time/LocalTime;", "pickedTime", "Lgf2/p;", "<set-?>", "G", "Lcom/whoop/ui/b;", "N", "()Lgf2/p;", "T", "(Lgf2/p;)V", "binding", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25861w0 extends AbstractC25837k0 {

    /* JADX INFO: renamed from: H */
    static final /* synthetic */ InterfaceC21493z[] f101939H = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25861w0.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentTimePickerWizardBinding;", 0))};

    /* JADX INFO: renamed from: I */
    public static final int f101940I = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String logTag = "TimePickerWizardFragment";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private LocalTime pickedTime = new LocalTime();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean timeSubmitted;

    /* JADX INFO: renamed from: mp0.w0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f101945w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f101945w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f101945w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101945w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: N */
    private final C15807p m76406N() {
        return (C15807p) this.binding.getValue(this, f101939H[0]);
    }

    /* JADX INFO: renamed from: O */
    private final String m76407O(boolean alarmEnabled) {
        if (alarmEnabled) {
            String string = getString(AbstractC30314g.f124268N0);
            AbstractC22676k.m65747g(string);
            return string;
        }
        String string2 = getString(AbstractC30314g.f124266M0);
        AbstractC22676k.m65747g(string2);
        return string2;
    }

    /* JADX INFO: renamed from: P */
    private final C23465k m76408P(ConductorViewState viewState) {
        LocalTime latestWakeTime = viewState.getCurrentAlarm().getLatestWakeTime();
        String str = m76283H() ? DefaultDateFormatter.TIME_FORMAT_24H : "h:mma";
        return new C23465k(latestWakeTime.minusMinutes(viewState.getWakeWindowMinutes()).toString(str), latestWakeTime.toString(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m76409Q(C25861w0 c25861w0, C27020m state) {
        AbstractC22676k.m65750j(state, "state");
        LocalTime latestWakeTime = state.getCurrentAlarm().getLatestWakeTime();
        c25861w0.m76406N().f59659e.setHour(latestWakeTime.getHourOfDay());
        c25861w0.m76406N().f59659e.setMinute(latestWakeTime.getMinuteOfHour());
        c25861w0.timeSubmitted = state.getStopListeningToTimePicker();
        c25861w0.m76406N().f59658d.setText(c25861w0.m76407O(state.getCurrentAlarm().getIsAlarmEnabled()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m76410R(C25861w0 c25861w0, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25861w0.timeSubmitted = true;
        c25861w0.m76282F().m76144Q(c25861w0.pickedTime);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m76411S(C25861w0 c25861w0, ConductorViewState it) {
        AbstractC22676k.m65750j(it, "it");
        c25861w0.m76415W(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private final void m76412T(C15807p c15807p) {
        this.binding.setValue(this, f101939H[0], c15807p);
    }

    /* JADX INFO: renamed from: U */
    private final void m76413U() {
        m76406N().f59659e.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: mp0.v0
            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker, int i13, int i14) {
                C25861w0.m76414V(this.f101930a, timePicker, i13, i14);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m76414V(C25861w0 c25861w0, TimePicker timePicker, int i13, int i14) {
        if (c25861w0.timeSubmitted) {
            return;
        }
        c25861w0.pickedTime = new LocalTime(i13, i14);
        c25861w0.m76282F().m76143P(c25861w0.pickedTime);
    }

    /* JADX INFO: renamed from: W */
    private final void m76415W(ConductorViewState viewState) {
        Resources resources = getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        int iIntValue = ((Number) AbstractC25839l0.m76289b(resources, viewState.getCurrentAlarm()).f92937w).intValue();
        C15807p c15807pM76406N = m76406N();
        if (viewState.getCurrentAlarm() instanceof C22736c) {
            c15807pM76406N.f59658d.setTextColor(AbstractC25839l0.m76288a(iIntValue, getResources().getColor(AbstractC36510a.f156011T, null)));
        } else {
            c15807pM76406N.f59658d.setTextColor(AbstractC25839l0.m76288a(iIntValue, getResources().getColor(AbstractC36510a.f156015X, null)));
        }
        C23465k c23465kM76408P = m76408P(viewState);
        String string = getString(AbstractC30314g.f124267N, c23465kM76408P.f92937w, c23465kM76408P.f92938x);
        AbstractC22676k.m65749i(string, "getString(...)");
        if (viewState.getCurrentAlarm() instanceof C22736c) {
            m76406N().f59657c.setVisibility(8);
        } else {
            m76406N().f59657c.setVisibility(0);
            m76406N().f59657c.setText(string);
        }
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15807p c15807pM44602c = C15807p.m44602c(inflater);
        AbstractC22676k.m65749i(c15807pM44602c, "inflate(...)");
        m76412T(c15807pM44602c);
        ConstraintLayout root = m76406N().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.timeSubmitted = false;
        m76406N().f59659e.setIs24HourView(Boolean.valueOf(m76283H()));
        m76413U();
        final int i13 = 0;
        observe(m76282F().getViewStateLiveData(), new a(new Function1(this) { // from class: mp0.u0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25861w0 f101919x;

            {
                this.f101919x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C25861w0.m76409Q(this.f101919x, (C27020m) obj);
                    case 1:
                        return C25861w0.m76410R(this.f101919x, (View) obj);
                    default:
                        return C25861w0.m76411S(this.f101919x, (ConductorViewState) obj);
                }
            }
        }));
        StrokedPillButton nextButton = m76406N().f59658d;
        AbstractC22676k.m65749i(nextButton, "nextButton");
        final int i14 = 1;
        AbstractC1953c.m5963a(nextButton, new Function1(this) { // from class: mp0.u0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25861w0 f101919x;

            {
                this.f101919x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C25861w0.m76409Q(this.f101919x, (C27020m) obj);
                    case 1:
                        return C25861w0.m76410R(this.f101919x, (View) obj);
                    default:
                        return C25861w0.m76411S(this.f101919x, (ConductorViewState) obj);
                }
            }
        });
        final int i15 = 2;
        observe(m76282F().m76145R(), new a(new Function1(this) { // from class: mp0.u0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25861w0 f101919x;

            {
                this.f101919x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return C25861w0.m76409Q(this.f101919x, (C27020m) obj);
                    case 1:
                        return C25861w0.m76410R(this.f101919x, (View) obj);
                    default:
                        return C25861w0.m76411S(this.f101919x, (ConductorViewState) obj);
                }
            }
        }));
    }
}
