package we2;

import af2.EnumC0819i;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import xe2.EnumC38232a;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: we2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lwe2/b;", "", "Lz82/b;", "analyticsManager", "<init>", "(Lz82/b;)V", "Lxe2/a;", "alarmMode", "", "a", "(Lxe2/a;)Ljava/lang/String;", "Laf2/i;", "sleepGoal", "b", "(Lxe2/a;Laf2/i;)Ljava/lang/String;", "action", "label", "eventName", "", "properties", "Ll83/a0;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lwe2/a;", "analyticEvent", "c", "(Lwe2/a;)V", "Lz82/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37233b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: we2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f159229a;

        static {
            int[] iArr = new int[EnumC38232a.values().length];
            try {
                iArr[EnumC38232a.EXACT_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38232a.SLEEP_GOAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC38232a.IN_THE_GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC38232a.NO_ALARM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f159229a = iArr;
        }
    }

    public C37233b(InterfaceC40188b analyticsManager) {
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        this.analyticsManager = analyticsManager;
    }

    /* JADX INFO: renamed from: a */
    private final String m119329a(EnumC38232a alarmMode) {
        int i13 = a.f159229a[alarmMode.ordinal()];
        if (i13 == 1) {
            return "Exact Time";
        }
        if (i13 == 2) {
            return "Sleep Goal";
        }
        if (i13 == 3) {
            return "In The Green";
        }
        if (i13 == 4) {
            return "No Alarm";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    private final String m119330b(EnumC38232a alarmMode, EnumC0819i sleepGoal) {
        if (alarmMode == EnumC38232a.EXACT_TIME) {
            return "Exact Time";
        }
        if (alarmMode == EnumC38232a.IN_THE_GREEN) {
            return "67%";
        }
        EnumC38232a enumC38232a = EnumC38232a.SLEEP_GOAL;
        if (alarmMode == enumC38232a && sleepGoal == EnumC0819i.PEAK) {
            return "Peak";
        }
        if (alarmMode == enumC38232a && sleepGoal == EnumC0819i.PERFORM) {
            return "Perform";
        }
        if (alarmMode == enumC38232a && sleepGoal == EnumC0819i.GET_BY) {
            return "Get By";
        }
        return alarmMode == EnumC38232a.NO_ALARM ? "No Alarm" : "";
    }

    /* JADX INFO: renamed from: d */
    private final void m119331d(String action, String label, String eventName, Map<String, ? extends Object> properties) {
        this.analyticsManager.mo41428k("Sleep Coach", action, label, AbstractC11266d.m30461o("Sleep Coach - ", eventName), properties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m119332e(C37233b c37233b, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        if ((i13 & 8) != 0) {
            map = C25272z.f99163w;
        }
        c37233b.m119331d(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: c */
    public final void m119333c(AbstractC37232a analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        if (analyticEvent.equals(AbstractC37232a.e.f159225a)) {
            m119332e(this, "View", null, "View Schedule Page", AbstractC31061c.m95645u("object", "Schedule Page"), 2, null);
            return;
        }
        if (analyticEvent instanceof AbstractC37232a.d) {
            m119331d("Press", ((AbstractC37232a.d) analyticEvent).getLabel(), "Press Schedule Card", AbstractC31061c.m95645u("object", "Schedule Card"));
            return;
        }
        if (analyticEvent.equals(AbstractC37232a.b.f159222a)) {
            m119332e(this, "Press", null, "Create Schedule", null, 10, null);
            return;
        }
        if (analyticEvent instanceof AbstractC37232a.a) {
            m119331d("Press", m119329a(((AbstractC37232a.a) analyticEvent).getAlarmMode()), "Create Schedule", AbstractC31061c.m95645u("object", "Alarm Mode"));
            return;
        }
        if (analyticEvent instanceof AbstractC37232a.c) {
            m119331d("Press", String.valueOf(((AbstractC37232a.c) analyticEvent).getDaysSelected()), "Create Schedule", AbstractC31061c.m95645u("object", "Recurring Days"));
        } else {
            if (!(analyticEvent instanceof AbstractC37232a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC37232a.f fVar = (AbstractC37232a.f) analyticEvent;
            m119331d("Press", m119330b(fVar.getAlarmModeState(), fVar.getSleepGoal()), "Create Schedule", AbstractC31061c.m95645u("object", "Wake Time"));
        }
    }
}
