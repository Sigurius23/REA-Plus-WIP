package kp0;

import com.whoop.data.remote.domain.dto.SmartAlarmGoalType;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkp0/a;", "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "a", "(Lkp0/a;)Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22735b {
    /* JADX INFO: renamed from: a */
    public static final SmartAlarmGoalType m65817a(AbstractC22734a abstractC22734a) {
        AbstractC22676k.m65750j(abstractC22734a, "<this>");
        if (abstractC22734a instanceof C22739f) {
            return SmartAlarmGoalType.IN_THE_GREEN;
        }
        if (abstractC22734a instanceof C22747n) {
            AbstractC22748o sleepPercent = ((C22747n) abstractC22734a).getSleepPercent();
            if (AbstractC22676k.m65745e(sleepPercent, C22745l.f89475z)) {
                return SmartAlarmGoalType.SLEEP_HEALTH_PEAK;
            }
            if (AbstractC22676k.m65745e(sleepPercent, C22746m.f89477z)) {
                return SmartAlarmGoalType.SLEEP_HEALTH_PERFORM;
            }
            if (AbstractC22676k.m65745e(sleepPercent, C22737d.f89416z)) {
                return SmartAlarmGoalType.SLEEP_HEALTH_GET_BY;
            }
            if (sleepPercent instanceof C22744k) {
                return SmartAlarmGoalType.EXACT_TIME_OPTIMIZE_SLEEP;
            }
            if (sleepPercent instanceof C22750q) {
                return SmartAlarmGoalType.EXACT_TIME_WEEKLY_PLAN;
            }
            return sleepPercent instanceof C22751r ? SmartAlarmGoalType.EXACT_TIME_SLEEP_HOURS : SmartAlarmGoalType.SLEEP_HEALTH_PEAK;
        }
        if (!(abstractC22734a instanceof C22736c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC22748o sleepPercent2 = ((C22736c) abstractC22734a).getSleepPercent();
        if (AbstractC22676k.m65745e(sleepPercent2, C22745l.f89475z)) {
            return SmartAlarmGoalType.EXACT_TIME_PEAK;
        }
        if (AbstractC22676k.m65745e(sleepPercent2, C22746m.f89477z)) {
            return SmartAlarmGoalType.EXACT_TIME_PERFORM;
        }
        if (AbstractC22676k.m65745e(sleepPercent2, C22737d.f89416z)) {
            return SmartAlarmGoalType.EXACT_TIME_GET_BY;
        }
        if (sleepPercent2 instanceof C22750q) {
            return SmartAlarmGoalType.EXACT_TIME_WEEKLY_PLAN;
        }
        if (sleepPercent2 instanceof C22751r) {
            return SmartAlarmGoalType.EXACT_TIME_SLEEP_HOURS;
        }
        if (sleepPercent2 instanceof C22744k) {
            return SmartAlarmGoalType.EXACT_TIME_OPTIMIZE_SLEEP;
        }
        throw new NoWhenBranchMatchedException();
    }
}
