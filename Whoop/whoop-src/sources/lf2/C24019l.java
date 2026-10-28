package lf2;

import af2.C0811a;
import af2.C0813c;
import af2.C0814d;
import af2.C0815e;
import af2.C0817g;
import af2.C0818h;
import af2.C0821k;
import af2.EnumC0812b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jf2.AbstractC21644b;
import jf2.AbstractC21646d;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import or2.C28205u0;
import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import xe2.AbstractC38237f;
import xe2.EnumC38232a;

/* JADX INFO: renamed from: lf2.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b*\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020#2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020#H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J#\u00106\u001a\b\u0012\u0004\u0012\u0002050\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u000bH\u0002¢\u0006\u0004\b6\u0010\u000fJ\u0015\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, m65681d2 = {"Llf2/l;", "", "Lor2/u0;", "localizedDateTimeFormatter", "<init>", "(Lor2/u0;)V", "Laf2/d;", "repeatDays", "Llf2/d;", "g", "(Laf2/d;)Llf2/d;", "", "Laf2/e;", "Llf2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;)Ljava/util/List;", "Laf2/k;", "wakeMode", "Llf2/j;", "k", "(Laf2/k;)Llf2/j;", "Laf2/a;", "Llf2/a;", "f", "alarmModeTypeList", "Llf2/c;", "c", "(Ljava/util/List;)Llf2/c;", "Laf2/c;", "wakeTime", "Lxe2/a;", "currentAlarmModeState", "Llf2/m;", "l", "(Laf2/c;Lxe2/a;)Llf2/m;", "", "a", "(Laf2/c;Lxe2/a;)Ljava/lang/String;", "Ly81/f;", "d", "(Lxe2/a;)Ly81/f;", "Lorg/joda/time/LocalTime;", "latestWakeTime", "wakeTimeTemplate", "b", "(Lorg/joda/time/LocalTime;Ljava/lang/String;)Ljava/lang/String;", "Laf2/g;", "sleepGoal", "Llf2/g;", "j", "(Laf2/g;)Llf2/g;", "Laf2/h;", "sleepGoalList", "Llf2/f;", "i", "Lxe2/f;", "result", "Llf2/k;", "e", "(Lxe2/f;)Llf2/k;", "Lor2/u0;", "getLocalizedDateTimeFormatter", "()Lor2/u0;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24019l {

    /* JADX INFO: renamed from: b */
    public static final int f94874b = C28205u0.f113964d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: lf2.l$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94876a;

        static {
            int[] iArr = new int[EnumC38232a.values().length];
            try {
                iArr[EnumC38232a.SLEEP_GOAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38232a.IN_THE_GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC38232a.EXACT_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC38232a.NO_ALARM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f94876a = iArr;
        }
    }

    public C24019l(C28205u0 localizedDateTimeFormatter) {
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
    }

    /* JADX INFO: renamed from: a */
    private final String m70861a(C0813c wakeTime, EnumC38232a currentAlarmModeState) {
        int i13 = a.f94876a[currentAlarmModeState.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? "" : m70862b(wakeTime.getLatestWakeTime(), wakeTime.getInTheGreenWakeTimeTemplate());
        }
        return m70862b(wakeTime.getLatestWakeTime(), wakeTime.getSleepGoalWakeTimeTemplate());
    }

    /* JADX INFO: renamed from: b */
    private final String m70862b(LocalTime latestWakeTime, String wakeTimeTemplate) {
        C28205u0 c28205u0 = this.localizedDateTimeFormatter;
        LocalTime localTimeMinusHours = latestWakeTime.minusHours(1);
        AbstractC22676k.m65749i(localTimeMinusHours, "minusHours(...)");
        return String.format(wakeTimeTemplate, Arrays.copyOf(new Object[]{C28205u0.m85379j(c28205u0, localTimeMinusHours, false, 2, null), C28205u0.m85379j(this.localizedDateTimeFormatter, latestWakeTime, false, 2, null)}, 2));
    }

    /* JADX INFO: renamed from: c */
    private final C24010c m70863c(List<C0811a> alarmModeTypeList) {
        for (C0811a c0811a : alarmModeTypeList) {
            if (c0811a.getAlarmModeState() == EnumC38232a.NO_ALARM) {
                return new C24010c(c0811a.getAlarmModeTypeDisplay(), c0811a.getAlarmModeTypeDescriptionDisplay(), EnumC24009b.INSTANCE.m70817a(c0811a.getAlarmModeState()));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: d */
    private final EnumC39333f m70864d(EnumC38232a currentAlarmModeState) {
        int i13 = a.f94876a[currentAlarmModeState.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.ACCENT_ACTION;
        }
        if (i13 == 2) {
            return EnumC39333f.RECOVERY_HIGH_RECOVERY;
        }
        if (i13 != 3 && i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return EnumC39333f.BRAND_WHITE;
    }

    /* JADX INFO: renamed from: f */
    private final List<C24008a> m70865f(List<C0811a> list) {
        ArrayList<C0811a> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C0811a) obj).getAlarmModeState() != EnumC38232a.NO_ALARM) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (C0811a c0811a : arrayList) {
            arrayList2.add(new C24008a(c0811a.getAlarmModeTypeDisplay(), c0811a.getAlarmModeTypeDescriptionDisplay(), EnumC24009b.INSTANCE.m70817a(c0811a.getAlarmModeState())));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: g */
    private final C24011d m70866g(C0814d repeatDays) {
        String daysToScheduleLabelDisplay = repeatDays.getDaysToScheduleLabelDisplay();
        String repeatDaysHelperTextDisplay = repeatDays.getRepeatDaysHelperTextDisplay();
        String daysToScheduleButtonLabelDisplay = repeatDays.getDaysToScheduleButtonLabelDisplay();
        List<C24012e> listM70867h = m70867h(repeatDays.m1988g());
        List<C0815e> listM1988g = repeatDays.m1988g();
        boolean z4 = false;
        if (!(listM1988g instanceof Collection) || !listM1988g.isEmpty()) {
            Iterator<T> it = listM1988g.iterator();
            while (it.hasNext()) {
                if (((C0815e) it.next()).getSelectionState() == EnumC0812b.CURRENT_SCHEDULE) {
                    z4 = true;
                    break;
                }
            }
        }
        return new C24011d(daysToScheduleLabelDisplay, repeatDaysHelperTextDisplay, daysToScheduleButtonLabelDisplay, listM70867h, repeatDays.getHelpIconLink(), z4);
    }

    /* JADX INFO: renamed from: h */
    private final List<C24012e> m70867h(List<C0815e> list) {
        List<C0815e> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C0815e c0815e : list2) {
            boolean z4 = false;
            boolean z13 = c0815e.getSelectionState() != EnumC0812b.OTHER_SCHEDULE;
            if (c0815e.getSelectionState() == EnumC0812b.CURRENT_SCHEDULE) {
                z4 = true;
            }
            arrayList.add(new C24012e(z13, z4, c0815e.getDayLabelDisplay(), c0815e.getDayOfWeekValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private final List<C24013f> m70868i(List<C0818h> sleepGoalList) {
        List<C0818h> list = sleepGoalList;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C0818h c0818h : list) {
            arrayList.add(new C24013f(c0818h.getToggleSelected() ? c0818h.getSleepGoalLabelToggledDisplay() : c0818h.getSleepGoalLabelNotToggledDisplay(), EnumC24015h.INSTANCE.m70838a(c0818h.getSleepGoalValue()), c0818h.getToggleSelected()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    private final C24014g m70869j(C0817g sleepGoal) {
        C25239c0 c25239c0;
        String sleepGoalTextDisplay = sleepGoal.getSleepGoalTextDisplay();
        String sleepGoalButtonTextDisplay = sleepGoal.getSleepGoalButtonTextDisplay();
        List<C24013f> listM70868i = m70868i(sleepGoal.m2001f());
        Iterator it = AbstractC25265s.m74105J1(sleepGoal.m2001f()).iterator();
        do {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            c25239c0 = (C25239c0) c25241d0.next();
        } while (!((C0818h) c25239c0.f99118b).getToggleSelected());
        return new C24014g(sleepGoalTextDisplay, sleepGoalButtonTextDisplay, listM70868i, c25239c0.f99117a, sleepGoal.getHelpIconLink());
    }

    /* JADX INFO: renamed from: k */
    private final C24017j m70870k(C0821k wakeMode) {
        return new C24017j(wakeMode.getAlarmModeDisplay(), m70865f(wakeMode.m2023d()), m70863c(wakeMode.m2023d()), wakeMode.getHelpIconLink());
    }

    /* JADX INFO: renamed from: l */
    private final C24020m m70871l(C0813c wakeTime, EnumC38232a currentAlarmModeState) {
        return new C24020m(wakeTime.getWakeTimeLabelDisplay(), m70861a(wakeTime, currentAlarmModeState), wakeTime.getWakeTimeSaveButtonLabelDisplay(), wakeTime.getLatestWakeTime(), m70864d(currentAlarmModeState), wakeTime.getHelpIconLink());
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC24018k m70872e(AbstractC38237f result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof AbstractC38237f.e) {
            return new AbstractC24018k.c(m70866g(((AbstractC38237f.e) result).getRepeatDaysDomainObject()));
        }
        if (result instanceof AbstractC38237f.j) {
            return new AbstractC24018k.i(m70870k(((AbstractC38237f.j) result).getWakeMode()));
        }
        if (result instanceof AbstractC38237f.c) {
            AbstractC38237f.c cVar = (AbstractC38237f.c) result;
            return new AbstractC24018k.j(m70871l(cVar.getWakeTime(), cVar.getCurrentAlarmModeState()));
        }
        if (result instanceof AbstractC38237f.i) {
            return new AbstractC24018k.h(m70869j(((AbstractC38237f.i) result).getSleepGoal()));
        }
        if (result instanceof AbstractC38237f.g) {
            return new AbstractC24018k.f(AbstractC21646d.m60912a(((AbstractC38237f.g) result).getScheduleSaveSuccessDomainObject()));
        }
        if (result instanceof AbstractC38237f.f) {
            return new AbstractC24018k.d(AbstractC21644b.m60909a(((AbstractC38237f.f) result).getScheduleSaveErrorDomainObject()));
        }
        if (result instanceof AbstractC38237f.d) {
            return new AbstractC24018k.g(AbstractC21646d.m60912a(((AbstractC38237f.d) result).getScheduleSaveDomainObject()));
        }
        if (result.equals(AbstractC38237f.b.f163929a)) {
            return AbstractC24018k.b.f94862a;
        }
        if (result.equals(AbstractC38237f.a.f163928a)) {
            return AbstractC24018k.a.f94861a;
        }
        if (result.equals(AbstractC38237f.h.f163936a)) {
            return AbstractC24018k.e.f94866a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
