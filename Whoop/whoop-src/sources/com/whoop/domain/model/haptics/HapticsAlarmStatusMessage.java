package com.whoop.domain.model.haptics;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "", "code", "", "description", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "UNKNOWN", "VALID_PATTERN", "INVALID_EFFECT", "INVALID_LOOPS", "INVALID_DURATION", "SUCCESSFUL_PLAY", "HAPTICS_FAILURE", "HAPTICS_TIMEOUT", "HAPTICS_BUSY", "HAPTICS_STOPPED", "INVALID_ALARM_TIME", "INVALID_ALARM_ID", "Companion", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum HapticsAlarmStatusMessage {
    UNKNOWN(0, "Unknown status"),
    VALID_PATTERN(1, "Input pattern is valid"),
    INVALID_EFFECT(2, "Input pattern has an invalid waveform effect"),
    INVALID_LOOPS(3, "Input pattern has an invalid number of loops"),
    INVALID_DURATION(4, "Input pattern has an invalid duration"),
    SUCCESSFUL_PLAY(5, "Alarm played successfully"),
    HAPTICS_FAILURE(6, "Haptics failure"),
    HAPTICS_TIMEOUT(7, "Haptics timed out"),
    HAPTICS_BUSY(8, "Haptics is busy"),
    HAPTICS_STOPPED(9, "Haptics stopped"),
    INVALID_ALARM_TIME(10, "Invalid alarm time"),
    INVALID_ALARM_ID(11, "Invalid alarm ID");

    private final int code;
    private final String description;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;", "", "<init>", "()V", "fromCode", "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "code", "", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final HapticsAlarmStatusMessage fromCode(int code) {
            for (HapticsAlarmStatusMessage hapticsAlarmStatusMessage : HapticsAlarmStatusMessage.values()) {
                if (hapticsAlarmStatusMessage.getCode() == code) {
                    if (hapticsAlarmStatusMessage == null) {
                        return HapticsAlarmStatusMessage.UNKNOWN;
                    }
                    return hapticsAlarmStatusMessage;
                }
            }
            hapticsAlarmStatusMessage = null;
            if (hapticsAlarmStatusMessage == null) {
                return HapticsAlarmStatusMessage.UNKNOWN;
            }
            return hapticsAlarmStatusMessage;
        }

        private Companion() {
        }
    }

    HapticsAlarmStatusMessage(int i13, String str) {
        this.code = i13;
        this.description = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}
