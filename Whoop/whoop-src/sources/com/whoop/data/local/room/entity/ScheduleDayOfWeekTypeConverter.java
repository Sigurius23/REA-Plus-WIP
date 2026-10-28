package com.whoop.data.local.room.entity;

import com.whoop.data.remote.domain.dto.DayOfWeekType;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\t"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;", "", "<init>", "()V", "fromDayOfWeekType", "", "dayOfWeek", "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;", "toDayOfWeekType", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ScheduleDayOfWeekTypeConverter {
    public final String fromDayOfWeekType(DayOfWeekType dayOfWeek) {
        if (dayOfWeek != null) {
            return dayOfWeek.getDayOfWeek();
        }
        return null;
    }

    public final DayOfWeekType toDayOfWeekType(String dayOfWeek) {
        if (dayOfWeek != null) {
            return DayOfWeekType.valueOf(dayOfWeek);
        }
        return null;
    }
}
