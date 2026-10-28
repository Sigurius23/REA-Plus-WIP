package com.whoop.coaching.sleepcoach.wizard;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3050q0;
import ec3.InterfaceC13058l;
import f93.InterfaceC14292d;
import hc3.AbstractC17182o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import kc3.C22365e;
import kp0.AbstractC22734a;
import kp0.AbstractC22748o;
import kp0.C22736c;
import kp0.C22745l;
import mp0.C25820c;
import mp0.C25846p;
import mp0.EnumC25817b;
import or2.AbstractC28154d0;
import org.joda.time.LocalTime;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010$\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0016R+\u0010-\u001a\u00020'2\u0006\u0010\f\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020'0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0016R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0016R+\u00108\u001a\u0002002\u0006\u0010\f\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010;\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u000100000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0016R+\u0010A\u001a\u00020<2\u0006\u0010\f\u001a\u00020<8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020<0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0016R+\u0010F\u001a\u0002002\u0006\u0010\f\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u000e\u001a\u0004\bD\u00105\"\u0004\bE\u00107R\"\u0010H\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u000100000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0016R+\u0010K\u001a\u0002002\u0006\u0010\f\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u000e\u001a\u0004\bI\u00105\"\u0004\bJ\u00107R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u0002000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0016R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000b0N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001e0N8F¢\u0006\u0006\u001a\u0004\b:\u0010PR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020'0N8F¢\u0006\u0006\u001a\u0004\bG\u0010PR\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020<0N8F¢\u0006\u0006\u001a\u0004\bB\u0010PR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u0002000N8F¢\u0006\u0006\u001a\u0004\bU\u0010PR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u0002000N8F¢\u0006\u0006\u001a\u0004\bL\u0010P¨\u0006X"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/b;", "", "Lq83/j;", "immediateContext", "<init>", "(Lq83/j;)V", "Lmp0/b;", "alarmOption", "Ll83/a0;", "u", "(Lmp0/b;)V", "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "<set-?>", "a", "Lf93/d;", "r", "()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "B", "(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V", "viewState", "Landroidx/lifecycle/u0;", "b", "Landroidx/lifecycle/u0;", "_viewStateLiveData", "Lec3/l;", "c", "Lec3/l;", "s", "()Lec3/l;", "viewStateAsFlow", "Lmp0/c;", "d", "k", "()Lmp0/c;", "v", "(Lmp0/c;)V", "alarmOptionDeepLinkViewState", "e", "_alarmOptionDeepLinkLiveData", "Lmp0/p;", "f", "o", "()Lmp0/p;", "y", "(Lmp0/p;)V", "onBackpressureHandlerViewState", "g", "_onBackpressureHandlerLiveData", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "_shouldTonightsSleepGraphLoad", "i", "getExpandedState", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Z)V", "expandedState", "kotlin.jvm.PlatformType", "j", "_expanded", "Lcom/whoop/coaching/sleepcoach/wizard/c;", "m", "()Lcom/whoop/coaching/sleepcoach/wizard/c;", "x", "(Lcom/whoop/coaching/sleepcoach/wizard/c;)V", "lowBatteryPopUpViewState", "l", "_lowBatteryPopUpLiveData", "getSleepScheduleVisibilityViewState", "A", "sleepScheduleVisibilityViewState", "n", "_sleepScheduleVisibilityLiveData", "getShouldRevertSleepEditViewState", "z", "shouldRevertSleepEditViewState", "p", "_shouldRevertSleepEditLiveData", "Landroidx/lifecycle/p0;", "t", "()Landroidx/lifecycle/p0;", "viewStateLiveData", "alarmOptionDeepLinkLiveData", "onBackpressureHandlerLiveData", "lowBatteryPopUpLiveData", "q", "sleepScheduleVisibilityLiveData", "shouldRevertSleepEditLiveData", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6240b {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: r */
    static final /* synthetic */ InterfaceC21493z[] f24566r;

    /* JADX INFO: renamed from: s */
    public static final int f24567s;

    /* JADX INFO: renamed from: t */
    private static final AbstractC22748o f24568t;

    /* JADX INFO: renamed from: u */
    private static final LocalTime f24569u;

    /* JADX INFO: renamed from: v */
    private static final AbstractC22734a f24570v;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C1630u0 _viewStateLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l viewStateAsFlow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14292d alarmOptionDeepLinkViewState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C1630u0 _alarmOptionDeepLinkLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC14292d onBackpressureHandlerViewState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C1630u0 _onBackpressureHandlerLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C1630u0 _shouldTonightsSleepGraphLoad;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC14292d expandedState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C1630u0 _expanded;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC14292d lowBatteryPopUpViewState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C1630u0 _lowBatteryPopUpLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC14292d sleepScheduleVisibilityViewState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C1630u0 _sleepScheduleVisibilityLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC14292d shouldRevertSleepEditViewState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C1630u0 _shouldRevertSleepEditLiveData;

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/b$a;", "", "<init>", "()V", "Lorg/joda/time/LocalTime;", "defaultAlarmTime", "Lorg/joda/time/LocalTime;", "a", "()Lorg/joda/time/LocalTime;", "Lkp0/a;", "defaultAlarmType", "Lkp0/a;", "b", "()Lkp0/a;", "Lkp0/o;", "defaultSleepGoal", "Lkp0/o;", "", "defaultWakeWindowDurationMinutes", "I", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final LocalTime m18649a() {
            return C6240b.f24569u;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC22734a m18650b() {
            return C6240b.f24570v;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24587a;

        static {
            int[] iArr = new int[EnumC25817b.values().length];
            try {
                iArr[EnumC25817b.LATEST_WAKE_TIME_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25817b.SLEEP_GOAL_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24587a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/b$c", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private ConductorViewState value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6240b f24589x;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, C6240b c6240b) {
            this.f24589x = c6240b;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public ConductorViewState getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, ConductorViewState value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f24589x._viewStateLiveData.postValue(value);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/b$d", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C25820c value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6240b f24591x;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, C6240b c6240b) {
            this.f24591x = c6240b;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C25820c getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C25820c value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f24591x._alarmOptionDeepLinkLiveData.postValue(value);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/b$e", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C25846p value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6240b f24593x;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, C6240b c6240b) {
            this.f24593x = c6240b;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C25846p getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C25846p value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f24593x._onBackpressureHandlerLiveData.postValue(value);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/b$f", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private Boolean value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6240b f24595x;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Object obj, C6240b c6240b) {
            this.f24595x = c6240b;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public Boolean getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, Boolean value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            Boolean bool = value;
            bool.booleanValue();
            this.f24595x._expanded.postValue(bool);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/b$g", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C6241c value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6240b f24597x;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Object obj, C6240b c6240b) {
            this.f24597x = c6240b;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C6241c getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C6241c value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f24597x._lowBatteryPopUpLiveData.postValue(value);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$h */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/b$h", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private Boolean value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6240b f24599x;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Object obj, C6240b c6240b) {
            this.f24599x = c6240b;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public Boolean getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, Boolean value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            Boolean bool = value;
            bool.booleanValue();
            this.f24599x._sleepScheduleVisibilityLiveData.postValue(bool);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.b$i */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/b$i", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private Boolean value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6240b f24601x;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Object obj, C6240b c6240b) {
            this.f24601x = c6240b;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public Boolean getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, Boolean value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            Boolean bool = value;
            bool.booleanValue();
            this.f24601x._shouldRevertSleepEditLiveData.postValue(bool);
        }
    }

    static {
        C22686q c22686q = new C22686q(C6240b.class, "viewState", "getViewState()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f24566r = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C6240b.class, "alarmOptionDeepLinkViewState", "getAlarmOptionDeepLinkViewState()Lcom/whoop/coaching/sleepcoach/wizard/AlarmOptionFlowState;", 0, c22673i0), AbstractC11895b.m31990i(C6240b.class, "onBackpressureHandlerViewState", "getOnBackpressureHandlerViewState()Lcom/whoop/coaching/sleepcoach/wizard/OnBackpressureHandler;", 0, c22673i0), AbstractC11895b.m31990i(C6240b.class, "expandedState", "getExpandedState()Z", 0, c22673i0), AbstractC11895b.m31990i(C6240b.class, "lowBatteryPopUpViewState", "getLowBatteryPopUpViewState()Lcom/whoop/coaching/sleepcoach/wizard/LowBatteryPopState;", 0, c22673i0), AbstractC11895b.m31990i(C6240b.class, "sleepScheduleVisibilityViewState", "getSleepScheduleVisibilityViewState()Z", 0, c22673i0), AbstractC11895b.m31990i(C6240b.class, "shouldRevertSleepEditViewState", "getShouldRevertSleepEditViewState()Z", 0, c22673i0)};
        INSTANCE = new Companion(null);
        f24567s = 8;
        C22745l c22745l = C22745l.f89475z;
        f24568t = c22745l;
        LocalTime localTime = new LocalTime(7, 30);
        f24569u = localTime;
        f24570v = new C22736c(localTime, c22745l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6240b(InterfaceC30063j immediateContext) {
        AbstractC22676k.m65750j(immediateContext, "immediateContext");
        boolean z4 = false;
        this.viewState = new c(new ConductorViewState(null, null, z4, false, 0, false, false, null, null, false, false, null, 4095, null), this);
        this._viewStateLiveData = new C1630u0();
        this.viewStateAsFlow = AbstractC28154d0.m85193a(m18642t(), immediateContext);
        this.alarmOptionDeepLinkViewState = new d(new C25820c(null, 1, null), this);
        this._alarmOptionDeepLinkLiveData = new C1630u0();
        this.onBackpressureHandlerViewState = new e(new C25846p(null, 1, null), this);
        this._onBackpressureHandlerLiveData = new C1630u0();
        this._shouldTonightsSleepGraphLoad = new C1630u0();
        Boolean bool = Boolean.FALSE;
        this.expandedState = new f(bool, this);
        this._expanded = new C1630u0(bool);
        Object[] objArr = 0 == true ? 1 : 0;
        this.lowBatteryPopUpViewState = new g(new C6241c(false, objArr, z4, null, 10, null), this);
        this._lowBatteryPopUpLiveData = new C1630u0();
        this.sleepScheduleVisibilityViewState = new h(bool, this);
        this._sleepScheduleVisibilityLiveData = new C1630u0(bool);
        this.shouldRevertSleepEditViewState = new i(bool, this);
        this._shouldRevertSleepEditLiveData = new C1630u0();
    }

    /* JADX INFO: renamed from: A */
    public final void m18630A(boolean z4) {
        this.sleepScheduleVisibilityViewState.setValue(this, f24566r[5], Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: B */
    public final void m18631B(ConductorViewState conductorViewState) {
        AbstractC22676k.m65750j(conductorViewState, "<set-?>");
        this.viewState.setValue(this, f24566r[0], conductorViewState);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC1615p0 m18632j() {
        return this._alarmOptionDeepLinkLiveData;
    }

    /* JADX INFO: renamed from: k */
    public final C25820c m18633k() {
        return (C25820c) this.alarmOptionDeepLinkViewState.getValue(this, f24566r[1]);
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC1615p0 m18634l() {
        return this._lowBatteryPopUpLiveData;
    }

    /* JADX INFO: renamed from: m */
    public final C6241c m18635m() {
        return (C6241c) this.lowBatteryPopUpViewState.getValue(this, f24566r[4]);
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC1615p0 m18636n() {
        return this._onBackpressureHandlerLiveData;
    }

    /* JADX INFO: renamed from: o */
    public final C25846p m18637o() {
        return (C25846p) this.onBackpressureHandlerViewState.getValue(this, f24566r[2]);
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC1615p0 m18638p() {
        return this._shouldRevertSleepEditLiveData;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC1615p0 m18639q() {
        return this._sleepScheduleVisibilityLiveData;
    }

    /* JADX INFO: renamed from: r */
    public final ConductorViewState m18640r() {
        return (ConductorViewState) this.viewState.getValue(this, f24566r[0]);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final InterfaceC13058l getViewStateAsFlow() {
        return this.viewStateAsFlow;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC1615p0 m18642t() {
        return this._viewStateLiveData;
    }

    /* JADX INFO: renamed from: u */
    public final void m18643u(EnumC25817b alarmOption) {
        AbstractC22676k.m65750j(alarmOption, "alarmOption");
        int i13 = b.f24587a[alarmOption.ordinal()];
        if (i13 != 1 && i13 != 2) {
            throw new IllegalStateException(AbstractC11895b.m31996o("Cannot shortcut ", alarmOption.name(), " alarm option!"));
        }
        C25820c c25820cM76153a = m18633k().m76153a(alarmOption);
        m18644v(c25820cM76153a);
    }

    /* JADX INFO: renamed from: v */
    public final void m18644v(C25820c c25820c) {
        AbstractC22676k.m65750j(c25820c, "<set-?>");
        this.alarmOptionDeepLinkViewState.setValue(this, f24566r[1], c25820c);
    }

    /* JADX INFO: renamed from: w */
    public final void m18645w(boolean z4) {
        this.expandedState.setValue(this, f24566r[3], Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: x */
    public final void m18646x(C6241c c6241c) {
        AbstractC22676k.m65750j(c6241c, "<set-?>");
        this.lowBatteryPopUpViewState.setValue(this, f24566r[4], c6241c);
    }

    /* JADX INFO: renamed from: y */
    public final void m18647y(C25846p c25846p) {
        AbstractC22676k.m65750j(c25846p, "<set-?>");
        this.onBackpressureHandlerViewState.setValue(this, f24566r[2], c25846p);
    }

    /* JADX INFO: renamed from: z */
    public final void m18648z(boolean z4) {
        this.shouldRevertSleepEditViewState.setValue(this, f24566r[6], Boolean.valueOf(z4));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6240b(InterfaceC30063j interfaceC30063j, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = AbstractC17182o.f65999a.mo8825s();
        }
        this(interfaceC30063j);
    }
}
