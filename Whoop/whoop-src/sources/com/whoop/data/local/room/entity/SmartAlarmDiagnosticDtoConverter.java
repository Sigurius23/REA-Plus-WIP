package com.whoop.data.local.room.entity;

import f82.EnumC14250a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;", "", "<init>", "()V", "Lf82/a;", "eventType", "", "fromSmartAlarmEventType", "(Lf82/a;)Ljava/lang/String;", "eventTypeName", "toSmartAlarmEventType", "(Ljava/lang/String;)Lf82/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmartAlarmDiagnosticDtoConverter {
    public static final int $stable = 0;

    public final String fromSmartAlarmEventType(EnumC14250a eventType) {
        AbstractC22676k.m65750j(eventType, "eventType");
        return eventType.name();
    }

    public final EnumC14250a toSmartAlarmEventType(String eventTypeName) {
        AbstractC22676k.m65750j(eventTypeName, "eventTypeName");
        return EnumC14250a.valueOf(eventTypeName);
    }
}
