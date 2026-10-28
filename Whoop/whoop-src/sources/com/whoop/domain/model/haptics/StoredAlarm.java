package com.whoop.domain.model.haptics;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/domain/model/haptics/StoredAlarm;", "", "strapAlarmIdentifiable", "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;", "hapticsPattern", "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "alarmTimeMillis", "", "<init>", "(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)V", "getStrapAlarmIdentifiable", "()Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;", "getHapticsPattern", "()Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "getAlarmTimeMillis", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class StoredAlarm {
    private final long alarmTimeMillis;
    private final AlarmHapticsPattern hapticsPattern;
    private final StrapAlarmIdentifiable strapAlarmIdentifiable;

    public StoredAlarm(StrapAlarmIdentifiable strapAlarmIdentifiable, AlarmHapticsPattern hapticsPattern, long j7) {
        AbstractC22676k.m65750j(strapAlarmIdentifiable, "strapAlarmIdentifiable");
        AbstractC22676k.m65750j(hapticsPattern, "hapticsPattern");
        this.strapAlarmIdentifiable = strapAlarmIdentifiable;
        this.hapticsPattern = hapticsPattern;
        this.alarmTimeMillis = j7;
    }

    public static /* synthetic */ StoredAlarm copy$default(StoredAlarm storedAlarm, StrapAlarmIdentifiable strapAlarmIdentifiable, AlarmHapticsPattern alarmHapticsPattern, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            strapAlarmIdentifiable = storedAlarm.strapAlarmIdentifiable;
        }
        if ((i13 & 2) != 0) {
            alarmHapticsPattern = storedAlarm.hapticsPattern;
        }
        if ((i13 & 4) != 0) {
            j7 = storedAlarm.alarmTimeMillis;
        }
        return storedAlarm.copy(strapAlarmIdentifiable, alarmHapticsPattern, j7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StrapAlarmIdentifiable getStrapAlarmIdentifiable() {
        return this.strapAlarmIdentifiable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AlarmHapticsPattern getHapticsPattern() {
        return this.hapticsPattern;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAlarmTimeMillis() {
        return this.alarmTimeMillis;
    }

    public final StoredAlarm copy(StrapAlarmIdentifiable strapAlarmIdentifiable, AlarmHapticsPattern hapticsPattern, long alarmTimeMillis) {
        AbstractC22676k.m65750j(strapAlarmIdentifiable, "strapAlarmIdentifiable");
        AbstractC22676k.m65750j(hapticsPattern, "hapticsPattern");
        return new StoredAlarm(strapAlarmIdentifiable, hapticsPattern, alarmTimeMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredAlarm)) {
            return false;
        }
        StoredAlarm storedAlarm = (StoredAlarm) other;
        return AbstractC22676k.m65745e(this.strapAlarmIdentifiable, storedAlarm.strapAlarmIdentifiable) && AbstractC22676k.m65745e(this.hapticsPattern, storedAlarm.hapticsPattern) && this.alarmTimeMillis == storedAlarm.alarmTimeMillis;
    }

    public final long getAlarmTimeMillis() {
        return this.alarmTimeMillis;
    }

    public final AlarmHapticsPattern getHapticsPattern() {
        return this.hapticsPattern;
    }

    public final StrapAlarmIdentifiable getStrapAlarmIdentifiable() {
        return this.strapAlarmIdentifiable;
    }

    public int hashCode() {
        return Long.hashCode(this.alarmTimeMillis) + ((this.hapticsPattern.hashCode() + (this.strapAlarmIdentifiable.hashCode() * 31)) * 31);
    }

    public String toString() {
        StrapAlarmIdentifiable strapAlarmIdentifiable = this.strapAlarmIdentifiable;
        AlarmHapticsPattern alarmHapticsPattern = this.hapticsPattern;
        long j7 = this.alarmTimeMillis;
        StringBuilder sb4 = new StringBuilder("StoredAlarm(strapAlarmIdentifiable=");
        sb4.append(strapAlarmIdentifiable);
        sb4.append(", hapticsPattern=");
        sb4.append(alarmHapticsPattern);
        sb4.append(", alarmTimeMillis=");
        return AbstractC11266d.m30457k(j7, ")", sb4);
    }
}
