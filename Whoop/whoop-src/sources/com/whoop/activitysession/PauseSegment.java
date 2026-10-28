package com.whoop.activitysession;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m65681d2 = {"Lcom/whoop/activitysession/PauseSegment;", "", "", "startTimeMs", "endTimeMs", "<init>", "(JLjava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activity_session_release", "(Lcom/whoop/activitysession/PauseSegment;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/Long;", "copy", "(JLjava/lang/Long;)Lcom/whoop/activitysession/PauseSegment;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getStartTimeMs", "Ljava/lang/Long;", "getEndTimeMs", "Companion", "$serializer", "a", "activity-session_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PauseSegment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long endTimeMs;
    private final long startTimeMs;

    /* JADX INFO: renamed from: com.whoop.activitysession.PauseSegment$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activitysession/PauseSegment$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activitysession/PauseSegment;", "serializer", "()Lwc3/c;", "activity-session_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PauseSegment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PauseSegment(int i13, long j7, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, PauseSegment$$serializer.INSTANCE.getDescriptor());
        }
        this.startTimeMs = j7;
        if ((i13 & 2) == 0) {
            this.endTimeMs = null;
        } else {
            this.endTimeMs = l7;
        }
    }

    public static /* synthetic */ PauseSegment copy$default(PauseSegment pauseSegment, long j7, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = pauseSegment.startTimeMs;
        }
        if ((i13 & 2) != 0) {
            l7 = pauseSegment.endTimeMs;
        }
        return pauseSegment.copy(j7, l7);
    }

    public static final /* synthetic */ void write$Self$activity_session_release(PauseSegment self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.startTimeMs);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.endTimeMs == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.endTimeMs);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final PauseSegment copy(long startTimeMs, Long endTimeMs) {
        return new PauseSegment(startTimeMs, endTimeMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PauseSegment)) {
            return false;
        }
        PauseSegment pauseSegment = (PauseSegment) other;
        return this.startTimeMs == pauseSegment.startTimeMs && AbstractC22676k.m65745e(this.endTimeMs, pauseSegment.endTimeMs);
    }

    public final Long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.startTimeMs) * 31;
        Long l7 = this.endTimeMs;
        return iHashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public String toString() {
        return "PauseSegment(startTimeMs=" + this.startTimeMs + ", endTimeMs=" + this.endTimeMs + ")";
    }

    public PauseSegment(long j7, Long l7) {
        this.startTimeMs = j7;
        this.endTimeMs = l7;
    }

    public /* synthetic */ PauseSegment(long j7, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, (i13 & 2) != 0 ? null : l7);
    }
}
