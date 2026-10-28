package p370oj;

import com.amplitude.android.engagement.types.AfterTimeTriggerConfig;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.SimulationContext;
import com.amplitude.android.engagement.types.TriggerConfig;
import l83.C23465k;
import l83.C23471q;
import m83.AbstractC25247g0;
import p305lj.C24437k0;
import p305lj.C24441m0;
import p305lj.C24443n0;
import p305lj.C24445o0;
import p305lj.C24447p0;
import p319m4.AbstractC25012a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oj.v */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27975v {

    /* JADX INFO: renamed from: a */
    public static final Object f112809a = AbstractC25247g0.m73990Y(new C23465k("CONTAINS", "Screen contains"), new C23465k("ENDS_WITH", "Screen ends with"), new C23465k("EXACT", "Screen matches exactly"), new C23465k("PATTERN", "Screen matches pattern"), new C23465k("REGEX", "Screen matches regex"), new C23465k("SIMPLE", "Screen matches"), new C23465k("STARTS_WITH", "Screen starts with"));

    /* JADX INFO: renamed from: a */
    public static C23471q m84395a(Nudge nudge) {
        TriggerConfig triggerConfig;
        if (nudge == null || (triggerConfig = nudge.getTriggerConfig()) == null) {
            return new C23471q("Immediately", null, null);
        }
        if (triggerConfig instanceof C24447p0) {
            int i13 = AbstractC27974u.f112807a[((C24447p0) triggerConfig).f95326a.getType().ordinal()];
            if (i13 == 1) {
                return new C23471q("Immediately", null, null);
            }
            if (i13 == 2) {
                return new C23471q("Smart delay", null, "Waiting for user activity...");
            }
            if (i13 == 3) {
                return new C23471q("On rage click", null, "Waiting for user rage click...");
            }
            if (i13 == 4) {
                return new C23471q("On user confusion", null, "Waiting for user confusion...");
            }
            if (i13 == 5) {
                return new C23471q("None", null, "No proactive trigger specified.");
            }
            throw new NoWhenBranchMatchedException();
        }
        if (triggerConfig instanceof C24445o0) {
            return new C23471q("On event tracked", ((C24445o0) triggerConfig).f95325a.getData().getEvent(), "Waiting for event...");
        }
        if (triggerConfig instanceof C24441m0) {
            return new C23471q("When element is visible", ((C24441m0) triggerConfig).f95323a.getData().getSelector(), "Waiting for element to become visible...");
        }
        if (triggerConfig instanceof C24443n0) {
            return new C23471q("When element is tapped", ((C24443n0) triggerConfig).f95324a.getData().getSelector(), "Waiting for element to be tapped...");
        }
        if (!(triggerConfig instanceof C24437k0)) {
            throw new NoWhenBranchMatchedException();
        }
        AfterTimeTriggerConfig afterTimeTriggerConfig = ((C24437k0) triggerConfig).f95322a;
        int value = afterTimeTriggerConfig.getData().getValue();
        String unit = afterTimeTriggerConfig.getData().getUnit();
        String str = "after " + value + ' ' + unit + 's';
        StringBuilder sb4 = new StringBuilder("Triggering after ");
        sb4.append(value);
        return new C23471q("Time on screen", str, AbstractC25012a.m73376i(AbstractC22676k.m65745e(unit, "minute") ? "m" : "s", " on screen", sb4));
    }

    /* JADX INFO: renamed from: b */
    public static DebugStatus m84396b(SimulationContext simulationContext) {
        if (simulationContext == null) {
            return DebugStatus.ERROR;
        }
        boolean passesPageTargeting = simulationContext.getPassesPageTargeting();
        boolean passesPinnedElement = simulationContext.getPassesPinnedElement();
        boolean shouldTemporarilyHide = simulationContext.getShouldTemporarilyHide();
        if (passesPageTargeting && passesPinnedElement && !shouldTemporarilyHide) {
            return !simulationContext.getPassesTriggerMatch() ? DebugStatus.INFO : DebugStatus.SUCCESS;
        }
        return DebugStatus.WARNING;
    }
}
