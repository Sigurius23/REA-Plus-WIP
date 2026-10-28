package com.whoop.data.remote.domain.dto;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"isExactAlarm", "", "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;)Z", "isExactWeeklyPlanAlarm", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmartAlarmUserInfoDtoKt {
    public static final boolean isExactAlarm(SmartAlarmGoalType smartAlarmGoalType) {
        AbstractC22676k.m65750j(smartAlarmGoalType, "<this>");
        return smartAlarmGoalType == SmartAlarmGoalType.EXACT_TIME_GET_BY || smartAlarmGoalType == SmartAlarmGoalType.EXACT_TIME_PERFORM || smartAlarmGoalType == SmartAlarmGoalType.EXACT_TIME_PEAK || smartAlarmGoalType == SmartAlarmGoalType.EXACT_TIME_WEEKLY_PLAN || smartAlarmGoalType == SmartAlarmGoalType.EXACT_TIME_SLEEP_HOURS;
    }

    public static final boolean isExactWeeklyPlanAlarm(SmartAlarmGoalType smartAlarmGoalType) {
        AbstractC22676k.m65750j(smartAlarmGoalType, "<this>");
        return smartAlarmGoalType == SmartAlarmGoalType.EXACT_TIME_WEEKLY_PLAN || smartAlarmGoalType == SmartAlarmGoalType.EXACT_TIME_SLEEP_HOURS;
    }
}
