package com.whoop.data.local.room.entity;

import com.whoop.data.remote.domain.dto.SmartAlarmGoalType;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;", "", "<init>", "()V", "fromSmartGoalType", "", "goalType", "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "toSmartGoalType", WeeklyPlanApiKt.GOAL, "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmartAlarmGoalTypeConverter {
    public final String fromSmartGoalType(SmartAlarmGoalType goalType) {
        AbstractC22676k.m65750j(goalType, "goalType");
        return goalType.getGoalType();
    }

    public final SmartAlarmGoalType toSmartGoalType(String goal) {
        AbstractC22676k.m65750j(goal, "goal");
        return SmartAlarmGoalType.valueOf(goal);
    }
}
