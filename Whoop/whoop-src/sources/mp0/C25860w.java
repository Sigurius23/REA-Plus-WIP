package mp0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.coaching.sleepcoach.wizard.ConductorViewState;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;
import z82.C40191e;

/* JADX INFO: renamed from: mp0.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\"8\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R(\u00102\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b5\u0010\u0016\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0014R(\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u00101\u0012\u0004\b9\u0010\u0016\u001a\u0004\b7\u00103\"\u0004\b8\u0010\u0014¨\u0006;"}, m65681d2 = {"Lmp0/w;", "Landroidx/lifecycle/w1;", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Lz82/e;", "eventDispatcher", "Ltr2/n;", "log", "<init>", "(Lcom/whoop/coaching/sleepcoach/wizard/b;Lz82/e;Ltr2/n;)V", "", "action", "eventName", "label", "Ll83/a0;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "isAlarmEnabled", "o", "(Z)V", "p", "()V", "shouldRevertAlarmEdit", "n", "t", "r", "(Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/coaching/sleepcoach/wizard/b;", "x", "Lz82/e;", "y", "Ltr2/n;", "Landroidx/lifecycle/p0;", "Lmp0/p;", "z", "Landroidx/lifecycle/p0;", "j", "()Landroidx/lifecycle/p0;", "onBackPressHandlerLiveData", "Lmp0/c;", "E", "g", "alarmOptionFlowLiveData", "F", "l", "shouldRevertSleepEditLiveData", "G", "Z", "isAlarmEdited", "()Z", "setAlarmEdited", "isAlarmEdited$annotations", "H", "getPreviousState", "setPreviousState", "getPreviousState$annotations", "previousState", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25860w extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final AbstractC1615p0 alarmOptionFlowLiveData;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final AbstractC1615p0 shouldRevertSleepEditLiveData;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isAlarmEdited;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean previousState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final AbstractC1615p0 onBackPressHandlerLiveData;

    public C25860w(C6240b conductorRepository, C40191e eventDispatcher, InterfaceC34116n log) {
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(log, "log");
        this.conductorRepository = conductorRepository;
        this.eventDispatcher = eventDispatcher;
        this.log = log;
        this.onBackPressHandlerLiveData = conductorRepository.m18636n();
        this.alarmOptionFlowLiveData = conductorRepository.m18632j();
        this.shouldRevertSleepEditLiveData = conductorRepository.m18638p();
    }

    /* JADX INFO: renamed from: q */
    private final void m76393q(String action, String eventName, String label) {
        this.eventDispatcher.m129043l0(action, AbstractC2875y.m8299l(eventName, " Set Alarm Waketime Prompt"), label, AbstractC31061c.m95645u("object", "Set Alarm Waketime Prompt"));
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC1615p0 getAlarmOptionFlowLiveData() {
        return this.alarmOptionFlowLiveData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC1615p0 getOnBackPressHandlerLiveData() {
        return this.onBackPressHandlerLiveData;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AbstractC1615p0 getShouldRevertSleepEditLiveData() {
        return this.shouldRevertSleepEditLiveData;
    }

    /* JADX INFO: renamed from: n */
    public final void m76397n(boolean shouldRevertAlarmEdit) {
        boolean z4;
        if (shouldRevertAlarmEdit && (z4 = this.isAlarmEdited)) {
            InterfaceC34116n interfaceC34116n = this.log;
            boolean z13 = this.previousState;
            ConductorViewState conductorViewStateM18640r = this.conductorRepository.m18640r();
            StringBuilder sbM32002u = AbstractC11895b.m32002u("reset to previous state  isAlarmEdited: ", ", previousState - ", ",  viewState - ", z4, z13);
            sbM32002u.append(conductorViewStateM18640r);
            interfaceC34116n.mo85228t(sbM32002u.toString(), new AbstractC30556a.a[0]);
            boolean zIsAlarmEnabledPreviously = this.conductorRepository.m18640r().isAlarmEnabledPreviously();
            C6240b c6240b = this.conductorRepository;
            c6240b.m18631B(ConductorViewState.copy$default(c6240b.m18640r(), null, null, zIsAlarmEnabledPreviously, this.previousState, 0, false, false, null, null, false, false, null, 4083, null));
        }
        this.isAlarmEdited = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m76398o(boolean isAlarmEnabled) {
        if (isAlarmEnabled) {
            this.isAlarmEdited = true;
            this.previousState = this.conductorRepository.m18640r().isAlarmEnabledPreviously();
            boolean currentSelectedAlarm = this.conductorRepository.m18640r().getCurrentSelectedAlarm();
            C6240b c6240b = this.conductorRepository;
            c6240b.m18631B(ConductorViewState.copy$default(c6240b.m18640r(), null, null, true, currentSelectedAlarm, 0, false, false, null, null, false, false, null, 4083, null));
            InterfaceC34116n interfaceC34116n = this.log;
            boolean z4 = this.previousState;
            ConductorViewState conductorViewStateM18640r = this.conductorRepository.m18640r();
            StringBuilder sbM32002u = AbstractC11895b.m32002u("setAndSaveAlarm previousState ", ", currentAlarm: ", " viewState: ", z4, currentSelectedAlarm);
            sbM32002u.append(conductorViewStateM18640r);
            interfaceC34116n.mo85228t(sbM32002u.toString(), new AbstractC30556a.a[0]);
        }
        C6240b c6240b2 = this.conductorRepository;
        c6240b2.m18631B(ConductorViewState.copy$default(c6240b2.m18640r(), null, null, false, false, 0, false, !isAlarmEnabled, null, null, false, false, null, 4031, null));
        C6240b c6240b3 = this.conductorRepository;
        c6240b3.m18644v(c6240b3.m18633k().m76153a(EnumC25817b.SAVING_STATE_FLOW));
    }

    /* JADX INFO: renamed from: p */
    public final void m76399p() {
        C6240b c6240b = this.conductorRepository;
        c6240b.m18644v(c6240b.m18633k().m76153a(EnumC25817b.EMPTY_STATE));
    }

    /* JADX INFO: renamed from: r */
    public final void m76400r(String label) {
        AbstractC22676k.m65750j(label, "label");
        m76393q("Press", "Sleep Coach - Press", label);
    }

    /* JADX INFO: renamed from: t */
    public final void m76401t() {
        m76393q("View", "Sleep Coach - View", "");
    }

    public /* synthetic */ C25860w(C6240b c6240b, C40191e c40191e, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6240b, c40191e, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SleepCoachAlarmSetReminderViewModel") : interfaceC34116n);
    }
}
