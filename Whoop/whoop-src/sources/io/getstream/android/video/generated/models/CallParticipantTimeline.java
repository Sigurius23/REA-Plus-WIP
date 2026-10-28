package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallParticipantTimeline;", "", "", "severity", "Ljg3/i;", "timestamp", "type", "", "data", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljg3/i;", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/android/video/generated/models/CallParticipantTimeline;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSeverity", "Ljg3/i;", "getTimestamp", "getType", "Ljava/util/Map;", "getData", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallParticipantTimeline {
    private final Map<String, Object> data;
    private final String severity;
    private final C21682i timestamp;
    private final String type;

    public CallParticipantTimeline(@InterfaceC30731q(name = "severity") String severity, @InterfaceC30731q(name = "timestamp") C21682i timestamp, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "data") Map<String, ? extends Object> data) {
        AbstractC22676k.m65750j(severity, "severity");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(data, "data");
        this.severity = severity;
        this.timestamp = timestamp;
        this.type = type;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallParticipantTimeline copy$default(CallParticipantTimeline callParticipantTimeline, String str, C21682i c21682i, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callParticipantTimeline.severity;
        }
        if ((i13 & 2) != 0) {
            c21682i = callParticipantTimeline.timestamp;
        }
        if ((i13 & 4) != 0) {
            str2 = callParticipantTimeline.type;
        }
        if ((i13 & 8) != 0) {
            map = callParticipantTimeline.data;
        }
        return callParticipantTimeline.copy(str, c21682i, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSeverity() {
        return this.severity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Map<String, Object> component4() {
        return this.data;
    }

    public final CallParticipantTimeline copy(@InterfaceC30731q(name = "severity") String severity, @InterfaceC30731q(name = "timestamp") C21682i timestamp, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "data") Map<String, ? extends Object> data) {
        AbstractC22676k.m65750j(severity, "severity");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(data, "data");
        return new CallParticipantTimeline(severity, timestamp, type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallParticipantTimeline)) {
            return false;
        }
        CallParticipantTimeline callParticipantTimeline = (CallParticipantTimeline) other;
        return AbstractC22676k.m65745e(this.severity, callParticipantTimeline.severity) && AbstractC22676k.m65745e(this.timestamp, callParticipantTimeline.timestamp) && AbstractC22676k.m65745e(this.type, callParticipantTimeline.type) && AbstractC22676k.m65745e(this.data, callParticipantTimeline.data);
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getSeverity() {
        return this.severity;
    }

    public final C21682i getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.data.hashCode() + AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.timestamp, this.severity.hashCode() * 31, 31), 31, this.type);
    }

    public String toString() {
        String str = this.severity;
        C21682i c21682i = this.timestamp;
        return AbstractC30007c.m91842l(AbstractC30802r.m94767p("CallParticipantTimeline(severity=", c21682i, str, ", timestamp=", ", type="), this.type, ", data=", this.data, ")");
    }

    public /* synthetic */ CallParticipantTimeline(String str, C21682i c21682i, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, str2, (i13 & 8) != 0 ? C25272z.f99163w : map);
    }
}
