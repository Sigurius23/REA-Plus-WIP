package mp0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1630u0;
import bc3.InterfaceC2994c0;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.coaching.sleepcoach.wizard.ConductorViewState;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.Map;
import kp0.AbstractC22734a;
import kp0.AbstractC22748o;
import kp0.C22745l;
import kp0.C22750q;
import kp0.C22751r;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import np0.AbstractC27021n;
import np0.C27009b;
import np0.C27011d;
import np0.C27012e;
import np0.C27016i;
import np0.C27017j;
import np0.C27019l;
import np0.C27020m;
import np0.EnumC27008a;
import np0.EnumC27022o;
import or2.C28180m;
import org.joda.time.LocalTime;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22684o;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import z82.C40191e;

/* JADX INFO: renamed from: mp0.b1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010\u001eJ\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010\u001eJ\r\u0010%\u001a\u00020\u0016¢\u0006\u0004\b%\u0010\u001eJ\u0015\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0019¢\u0006\u0004\b,\u0010\u001cJ\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0016¢\u0006\u0004\b0\u0010\u001eJ\u001f\u00105\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00162\u0006\u00107\u001a\u0002012\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u0002012\u0006\u00107\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b=\u00106J\u000f\u0010>\u001a\u00020\u0016H\u0002¢\u0006\u0004\b>\u0010\u001eJ\u000f\u0010?\u001a\u00020\u001fH\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020H0\f8\u0006¢\u0006\f\n\u0004\b!\u0010I\u001a\u0004\bF\u0010\u000fR1\u0010R\u001a\u00020H2\u0006\u0010K\u001a\u00020H8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bQ\u0010\u001e\u001a\u0004\bD\u0010N\"\u0004\bO\u0010PR\u001a\u0010U\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010S\u001a\u0004\bT\u0010@R\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010WR\u0017\u0010Y\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\bA\u0010@R$\u0010_\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010d\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00108B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006e"}, m65681d2 = {"Lmp0/b1;", "Lhj0/o;", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Lz82/e;", "eventDispatcher", "Lsr2/y;", "urlProvider", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/coaching/sleepcoach/wizard/b;Lz82/e;Lsr2/y;Lbc3/c0;)V", "Landroidx/lifecycle/p0;", "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "R", "()Landroidx/lifecycle/p0;", "Lmp0/c;", "y", "Lmp0/p;", "C", "Lnp0/a;", "type", "Ll83/a0;", "M", "(Lnp0/a;)V", "Lorg/joda/time/LocalTime;", "localTime", "Q", "(Lorg/joda/time/LocalTime;)V", "c0", "()V", "", "navigationSource", "I", "(Ljava/lang/String;)V", "b0", "X", "V", "Lkp0/o;", "sleepGoal", "O", "(Lkp0/o;)V", "N", "pickedTime", "P", "", "Z", "()Z", "K", "Lnp0/o;", "wizardScreen", "Lnp0/n;", "wizardFlow", "B", "(Lnp0/o;Lnp0/n;)Lnp0/o;", "currentScreen", "S", "(Lnp0/o;Ljava/lang/String;)V", "Lnp0/b;", "d0", "()Lnp0/b;", "A", "L", "F", "()Ljava/lang/String;", "E", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "Lz82/e;", "G", "Lsr2/y;", "H", "Lbc3/c0;", "Lnp0/m;", "Landroidx/lifecycle/p0;", "viewStateLiveData", "<set-?>", "J", "Lf93/d;", "()Lnp0/m;", "Y", "(Lnp0/m;)V", "getViewState$annotations", "viewState", "Ljava/lang/String;", "o", "logTag", "Lkp0/a;", "Lkp0/a;", "alarmStateOnStartOfWizardFlow", "sleepCoachHelpUrl", "value", "D", "()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "W", "(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V", "parentDataViewState", "z", "()Lmp0/c;", "U", "(Lmp0/c;)V", "alarmOptionFlowState", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25819b1 extends AbstractC17356o {

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f101606N = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25819b1.class, "viewState", "getViewState()Lcom/whoop/coaching/sleepcoach/wizard/model/WizardConductorViewState;", 0))};

    /* JADX INFO: renamed from: O */
    public static final int f101607O = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final AbstractC1615p0 viewStateLiveData;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private AbstractC22734a alarmStateOnStartOfWizardFlow;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final String sleepCoachHelpUrl;

    /* JADX INFO: renamed from: mp0.b1$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101617a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f101618b;

        static {
            int[] iArr = new int[EnumC27022o.values().length];
            try {
                iArr[EnumC27022o.ALARM_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27022o.SLEEP_PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27022o.TIME_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC27022o.COLLAPSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f101617a = iArr;
            int[] iArr2 = new int[EnumC25817b.values().length];
            try {
                iArr2[EnumC25817b.COLLAPSED_STATE_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC25817b.LATEST_WAKE_TIME_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f101618b = iArr2;
        }
    }

    /* JADX INFO: renamed from: mp0.b1$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"mp0/b1$d", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C27020m value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25819b1 f101620x;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, C25819b1 c25819b1) {
            this.f101620x = c25819b1;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C27020m getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C27020m value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C25819b1 c25819b1 = this.f101620x;
            c25819b1.m49138t(c25819b1.getViewStateLiveData(), this.f101620x.m76136G());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25819b1(C6240b conductorRepository, C40191e eventDispatcher, AbstractC32943y urlProvider, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.conductorRepository = conductorRepository;
        this.eventDispatcher = eventDispatcher;
        this.urlProvider = urlProvider;
        this.coroutineScope = coroutineScope;
        this.viewStateLiveData = new C1630u0();
        this.viewState = new d(new C27020m(null, null, null, false, null, null, null, 127, null), this);
        this.logTag = "ConductorViewModel";
        this.alarmStateOnStartOfWizardFlow = conductorRepository.m18640r().getPreviousAlarm();
        this.sleepCoachHelpUrl = AbstractC2875y.m8299l(urlProvider.getApiBaseUrl(), "/url-mapping-service/v1/SLEEP_COACH_HAPTIC");
    }

    /* JADX INFO: renamed from: A */
    private final EnumC27022o m76123A(EnumC27022o currentScreen, AbstractC27021n wizardFlow) {
        EnumC27022o enumC27022o = (EnumC27022o) AbstractC25265s.m74102I0(wizardFlow.m81017a().indexOf(currentScreen) - 1, wizardFlow.m81017a());
        return enumC27022o == null ? EnumC27022o.COLLAPSED : enumC27022o;
    }

    /* JADX INFO: renamed from: B */
    private final EnumC27022o m76124B(EnumC27022o wizardScreen, AbstractC27021n wizardFlow) {
        if (wizardFlow.m81017a().isEmpty()) {
            return EnumC27022o.COLLAPSED;
        }
        int iIndexOf = wizardFlow.m81017a().indexOf(wizardScreen);
        EnumC27022o enumC27022o = (EnumC27022o) AbstractC25265s.m74102I0(iIndexOf + 1, wizardFlow.m81017a());
        return enumC27022o == null ? wizardFlow.m81017a().get(iIndexOf) : enumC27022o;
    }

    /* JADX INFO: renamed from: D */
    private final ConductorViewState m76125D() {
        return this.conductorRepository.m18640r();
    }

    /* JADX INFO: renamed from: F */
    private final String m76126F() {
        int i13 = a.f101617a[m76136G().getCurrentScreen().ordinal()];
        if (i13 == 1) {
            return "Alarm Type";
        }
        if (i13 == 2) {
            return "Sleep Goal";
        }
        if (i13 == 3) {
            return "Wake Time";
        }
        if (i13 == 4) {
            return "Collapsed";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: L */
    private final void m76127L() {
        this.eventDispatcher.m129043l0("Save", "Sleep Coach - Save Sleep Goal", "", AbstractC25247g0.m73990Y(new C23465k("object", "Sleep Goal"), new C23465k("selectedPercent", m76136G().getCurrentAlarm().getSleepPercent())));
    }

    /* JADX INFO: renamed from: S */
    private final void m76128S(EnumC27022o currentScreen, String navigationSource) {
        String str;
        Map<String, Object> mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("Source", navigationSource), new C23465k("object", m76126F()));
        int i13 = a.f101617a[currentScreen.ordinal()];
        if (i13 == 1) {
            str = "Sleep Coach - Close Alarm Type Selector";
        } else if (i13 == 2) {
            str = "Sleep Coach - Close Sleep Goal";
        } else if (i13 == 3) {
            str = "Sleep Coach - Close Wake Time Selector";
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Collapsed";
        }
        this.eventDispatcher.m129043l0("Close", str, "", mapM73990Y);
    }

    /* JADX INFO: renamed from: U */
    private final void m76129U(C25820c c25820c) {
        new C22684o(this.conductorRepository) { // from class: mp0.b1.b
            @Override // p715kotlin.jvm.internal.C22684o, j93.InterfaceC21488u
            public Object get() {
                return ((C6240b) this.receiver).m18633k();
            }

            @Override // p715kotlin.jvm.internal.C22684o, j93.InterfaceC21473j
            public void set(Object obj) {
                ((C6240b) this.receiver).m18644v((C25820c) obj);
            }
        }.set(c25820c);
    }

    /* JADX INFO: renamed from: W */
    private final void m76130W(ConductorViewState conductorViewState) {
        new C22684o(this.conductorRepository) { // from class: mp0.b1.c
            @Override // p715kotlin.jvm.internal.C22684o, j93.InterfaceC21488u
            public Object get() {
                return ((C6240b) this.receiver).m18640r();
            }

            @Override // p715kotlin.jvm.internal.C22684o, j93.InterfaceC21473j
            public void set(Object obj) {
                ((C6240b) this.receiver).m18631B((ConductorViewState) obj);
            }
        }.set(conductorViewState);
    }

    /* JADX INFO: renamed from: d0 */
    private final C27009b m76131d0() {
        AbstractC22734a previousAlarm = m76125D().getPreviousAlarm();
        int i13 = a.f101618b[m76133z().getExpendedStateFlow().ordinal()];
        if (i13 == 1) {
            return m76136G().getCurrentAlarm();
        }
        if (i13 == 2) {
            return C27009b.m80998b(m76136G().getCurrentAlarm(), null, null, previousAlarm.getLatestWakeTime(), false, 11, null);
        }
        int i14 = a.f101617a[m76136G().getCurrentScreen().ordinal()];
        if (i14 == 1) {
            return previousAlarm.m65816c(m76125D().getCurrentSelectedAlarm());
        }
        if (i14 == 2) {
            return C27009b.m80998b(m76136G().getCurrentAlarm(), null, m76125D().getPreviousAlarm().m65814a(), null, false, 13, null);
        }
        if (i14 == 3) {
            return C27009b.m80998b(m76136G().getCurrentAlarm(), null, null, previousAlarm.getLatestWakeTime(), false, 11, null);
        }
        if (i14 == 4) {
            return m76136G().getCurrentAlarm();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: z */
    private final C25820c m76133z() {
        return this.conductorRepository.m18633k();
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC1615p0 m76134C() {
        return this.conductorRepository.m18636n();
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getSleepCoachHelpUrl() {
        return this.sleepCoachHelpUrl;
    }

    /* JADX INFO: renamed from: G */
    public final C27020m m76136G() {
        return (C27020m) this.viewState.getValue(this, f101606N[0]);
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final AbstractC1615p0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: I */
    public final void m76138I(String navigationSource) {
        AbstractC22676k.m65750j(navigationSource, "navigationSource");
        m76128S(m76136G().getCurrentScreen(), navigationSource);
        EnumC27022o enumC27022oM76123A = m76123A(m76136G().getCurrentScreen(), m76136G().getWizardFlow());
        if (enumC27022oM76123A != EnumC27022o.COLLAPSED) {
            C27009b c27009bM76131d0 = m76131d0();
            m76148Y(C27020m.m81008b(m76136G(), null, enumC27022oM76123A, c27009bM76131d0, false, null, null, null, 121, null));
            m76130W(ConductorViewState.copy$default(m76125D(), c27009bM76131d0.m81004g(), null, false, false, 0, false, false, null, null, false, false, null, 4030, null));
        } else {
            m76148Y(C27020m.m81008b(m76136G(), C27011d.f107709b, enumC27022oM76123A, m76131d0(), true, null, null, null, 112, null));
            ConductorViewState conductorViewStateM76125D = m76125D();
            AbstractC22734a abstractC22734a = this.alarmStateOnStartOfWizardFlow;
            m76130W(ConductorViewState.copy$default(conductorViewStateM76125D, abstractC22734a, abstractC22734a, m76125D().isAlarmEnabledPreviously(), false, 0, false, false, null, null, false, false, null, 3512, null));
            m76129U(m76133z().m76153a(EnumC25817b.COLLAPSED_STATE_FLOW));
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m76139K() {
        this.eventDispatcher.m129031d0(m76126F(), null);
    }

    /* JADX INFO: renamed from: M */
    public final void m76140M(EnumC27008a type) {
        AbstractC22748o abstractC22748oM65814a;
        AbstractC22676k.m65750j(type, "type");
        EnumC27008a enumC27008a = EnumC27008a.SLEEP_GOAL;
        AbstractC27021n abstractC27021n = type != enumC27008a ? C27019l.f107720b : C27016i.f107716b;
        EnumC27022o enumC27022oM76124B = m76124B(m76136G().getCurrentScreen(), abstractC27021n);
        C27009b c27009bM65816c = m76125D().getCurrentAlarm().m65816c(m76125D().getCurrentSelectedAlarm());
        if (type == EnumC27008a.IN_THE_GREEN) {
            abstractC22748oM65814a = C22745l.f89475z;
        } else {
            abstractC22748oM65814a = ((type == enumC27008a && (m76125D().getCurrentAlarm().m65814a() instanceof C22750q)) || (m76125D().getCurrentAlarm().m65814a() instanceof C22751r)) ? C22745l.f89475z : m76125D().getCurrentAlarm().m65814a();
        }
        C27009b c27009bM80998b = C27009b.m80998b(c27009bM65816c, type, abstractC22748oM65814a, null, false, 12, null);
        m76130W(ConductorViewState.copy$default(m76125D(), c27009bM80998b.m81004g(), m76125D().getCurrentAlarm(), false, false, 0, false, false, null, null, false, false, null, 4092, null));
        m76148Y(C27020m.m81008b(m76136G(), abstractC27021n, enumC27022oM76124B, c27009bM80998b, false, m76125D().getWeeklyPlan(), m76125D().getWeeklyPlanHoursOfSleep(), m76125D().getOptimizeSleep(), 8, null));
        this.eventDispatcher.m129043l0("Select", "Sleep Coach - Select Alarm Type", "", AbstractC25247g0.m73990Y(new C23465k("value", type.getAnalyticsValue()), new C23465k("object", "Alarm Type")));
    }

    /* JADX INFO: renamed from: N */
    public final void m76141N(AbstractC22748o sleepGoal) {
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        C27009b c27009bM80998b = C27009b.m80998b(m76125D().getCurrentAlarm().m65816c(m76125D().getCurrentSelectedAlarm()), null, sleepGoal, null, false, 13, null);
        m76148Y(C27020m.m81008b(m76136G(), null, null, c27009bM80998b, false, null, null, null, 123, null));
        m76130W(ConductorViewState.copy$default(m76125D(), c27009bM80998b.m81004g(), null, false, false, 0, false, false, null, null, false, false, null, 4094, null));
    }

    /* JADX INFO: renamed from: O */
    public final void m76142O(AbstractC22748o sleepGoal) {
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        EnumC27022o enumC27022oM76124B = m76124B(m76136G().getCurrentScreen(), m76136G().getWizardFlow());
        C27009b c27009bM80998b = C27009b.m80998b(m76125D().getCurrentAlarm().m65816c(m76125D().getCurrentSelectedAlarm()), null, sleepGoal, null, false, 13, null);
        m76148Y(C27020m.m81008b(m76136G(), null, enumC27022oM76124B, c27009bM80998b, false, null, null, null, 121, null));
        m76130W(ConductorViewState.copy$default(m76125D(), c27009bM80998b.m81004g(), null, false, false, 0, false, AbstractC22676k.m65745e(m76136G().getWizardFlow(), C27017j.f107718b), null, null, false, false, null, 4030, null));
        if (m76136G().getWizardFlow() instanceof C27017j) {
            m76129U(m76133z().m76153a(EnumC25817b.SAVING_STATE_FLOW));
        }
        m76127L();
    }

    /* JADX INFO: renamed from: P */
    public final void m76143P(LocalTime pickedTime) {
        AbstractC22676k.m65750j(pickedTime, "pickedTime");
        C27009b c27009bM80998b = C27009b.m80998b(m76125D().getCurrentAlarm().m65816c(m76125D().getCurrentSelectedAlarm()), null, null, pickedTime, false, 11, null);
        m76148Y(C27020m.m81008b(m76136G(), null, null, c27009bM80998b, false, null, null, null, 123, null));
        m76130W(ConductorViewState.copy$default(m76125D(), c27009bM80998b.m81004g(), null, false, false, 0, false, false, null, null, false, false, null, 4094, null));
    }

    /* JADX INFO: renamed from: Q */
    public final void m76144Q(LocalTime localTime) {
        AbstractC22676k.m65750j(localTime, "localTime");
        EnumC27022o enumC27022oM76124B = m76124B(m76136G().getCurrentScreen(), m76136G().getWizardFlow());
        C27009b c27009bM80998b = C27009b.m80998b(m76125D().getCurrentAlarm().m65816c(m76125D().getCurrentSelectedAlarm()), null, null, localTime, false, 11, null);
        m76148Y(C27020m.m81008b(m76136G(), null, enumC27022oM76124B, c27009bM80998b, false, null, null, null, 121, null));
        m76130W(ConductorViewState.copy$default(m76125D(), c27009bM80998b.m81004g(), m76133z().getExpendedStateFlow() == EnumC25817b.ALARM_SET_TO_FLOW ? m76125D().getPreviousAlarm() : m76125D().getCurrentAlarm(), false, false, 0, false, false, null, null, false, false, null, 4092, null));
        m76129U((m76125D().getCurrentSelectedAlarm() || !AbstractC22676k.m65745e(m76136G().getWizardFlow(), C27012e.f107711b)) ? m76133z().m76153a(EnumC25817b.SAVING_STATE_FLOW) : m76133z().m76153a(EnumC25817b.ALARM_SET_REMINDER_FLOW));
        this.eventDispatcher.m129043l0("Save", "Sleep Coach - Save Wake Time", "", AbstractC25247g0.m73990Y(new C23465k("value", localTime), new C23465k("object", "Wake Time")));
    }

    /* JADX INFO: renamed from: R */
    public final AbstractC1615p0 m76145R() {
        return this.conductorRepository.m18642t();
    }

    /* JADX INFO: renamed from: V */
    public final void m76146V() {
        m76148Y(C27020m.m81008b(m76136G(), C27011d.f107709b, EnumC27022o.COLLAPSED, null, false, null, null, null, 124, null));
    }

    /* JADX INFO: renamed from: X */
    public final void m76147X() {
        m76148Y(C27020m.m81008b(m76136G(), C27017j.f107718b, EnumC27022o.SLEEP_PERCENTAGE, m76125D().getCurrentAlarm().m65816c(m76125D().getCurrentSelectedAlarm()), false, m76125D().getWeeklyPlan(), m76125D().getWeeklyPlanHoursOfSleep(), m76125D().getOptimizeSleep(), 8, null));
        m76130W(ConductorViewState.copy$default(m76125D(), null, m76125D().getCurrentAlarm(), false, false, 0, false, false, null, null, false, false, null, 4093, null));
        this.alarmStateOnStartOfWizardFlow = m76125D().getPreviousAlarm();
    }

    /* JADX INFO: renamed from: Y */
    public final void m76148Y(C27020m c27020m) {
        AbstractC22676k.m65750j(c27020m, "<set-?>");
        this.viewState.setValue(this, f101606N[0], c27020m);
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m76149Z() {
        return !this.conductorRepository.m18640r().getEligibleForSmartAlarms();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m76150b0() {
        m76148Y(m76136G().m81009a(C27012e.f107711b, EnumC27022o.TIME_PICKER, m76125D().getCurrentAlarm().m65816c(m76125D().getCurrentSelectedAlarm()), false, m76125D().getWeeklyPlan(), m76125D().getWeeklyPlanHoursOfSleep(), m76125D().getOptimizeSleep()));
        m76130W(ConductorViewState.copy$default(m76125D(), null, m76125D().getCurrentAlarm(), false, false, 0, false, false, null, null, false, false, null, 4093, null));
        this.alarmStateOnStartOfWizardFlow = m76125D().getPreviousAlarm();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m76151c0() {
        if (!(m76136G().getWizardFlow() instanceof C27016i)) {
            m76148Y(C27020m.m81008b(m76136G(), C27016i.f107716b, EnumC27022o.ALARM_MODE, null, false, null, null, null, 116, null));
        }
        this.alarmStateOnStartOfWizardFlow = m76125D().getPreviousAlarm();
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC1615p0 m76152y() {
        return this.conductorRepository.m18632j();
    }

    public /* synthetic */ C25819b1(C6240b c6240b, C40191e c40191e, AbstractC32943y abstractC32943y, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6240b, c40191e, abstractC32943y, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
