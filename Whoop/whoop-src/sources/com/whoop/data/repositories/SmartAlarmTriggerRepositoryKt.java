package com.whoop.data.repositories;

import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import org.joda.time.format.ISODateTimeFormat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sf2.C32448a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "Lsf2/a;", "generateCompositeId", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lsf2/a;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmartAlarmTriggerRepositoryKt {
    public static final C32448a generateCompositeId(SmartAlarmUserInfo smartAlarmUserInfo) {
        AbstractC22676k.m65750j(smartAlarmUserInfo, "<this>");
        return new C32448a(smartAlarmUserInfo.getWindowMinutes() + "_" + ISODateTimeFormat.dateTime().print(smartAlarmUserInfo.getUpperTimeBoundLocalDateTime()) + "_" + smartAlarmUserInfo.getSleepScoreGoal() + "_" + smartAlarmUserInfo.getRecoveryScoreGoal());
    }
}
