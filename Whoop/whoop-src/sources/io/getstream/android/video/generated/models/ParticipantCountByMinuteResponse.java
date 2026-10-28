package io.getstream.android.video.generated.models;

import jg3.C21682i;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ParticipantCountByMinuteResponse;", "", "", "first", "last", "max", "min", "Ljg3/i;", "startTs", "<init>", "(IIIILjg3/i;)V", "component1", "()I", "component2", "component3", "component4", "component5", "()Ljg3/i;", "copy", "(IIIILjg3/i;)Lio/getstream/android/video/generated/models/ParticipantCountByMinuteResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getFirst", "getLast", "getMax", "getMin", "Ljg3/i;", "getStartTs", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ParticipantCountByMinuteResponse {
    private final int first;
    private final int last;
    private final int max;
    private final int min;
    private final C21682i startTs;

    public ParticipantCountByMinuteResponse(@InterfaceC30731q(name = "first") int i13, @InterfaceC30731q(name = "last") int i14, @InterfaceC30731q(name = "max") int i15, @InterfaceC30731q(name = "min") int i16, @InterfaceC30731q(name = "start_ts") C21682i startTs) {
        AbstractC22676k.m65750j(startTs, "startTs");
        this.first = i13;
        this.last = i14;
        this.max = i15;
        this.min = i16;
        this.startTs = startTs;
    }

    public static /* synthetic */ ParticipantCountByMinuteResponse copy$default(ParticipantCountByMinuteResponse participantCountByMinuteResponse, int i13, int i14, int i15, int i16, C21682i c21682i, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = participantCountByMinuteResponse.first;
        }
        if ((i17 & 2) != 0) {
            i14 = participantCountByMinuteResponse.last;
        }
        if ((i17 & 4) != 0) {
            i15 = participantCountByMinuteResponse.max;
        }
        if ((i17 & 8) != 0) {
            i16 = participantCountByMinuteResponse.min;
        }
        if ((i17 & 16) != 0) {
            c21682i = participantCountByMinuteResponse.startTs;
        }
        C21682i c21682i2 = c21682i;
        int i18 = i15;
        return participantCountByMinuteResponse.copy(i13, i14, i18, i16, c21682i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLast() {
        return this.last;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C21682i getStartTs() {
        return this.startTs;
    }

    public final ParticipantCountByMinuteResponse copy(@InterfaceC30731q(name = "first") int first, @InterfaceC30731q(name = "last") int last, @InterfaceC30731q(name = "max") int max, @InterfaceC30731q(name = "min") int min, @InterfaceC30731q(name = "start_ts") C21682i startTs) {
        AbstractC22676k.m65750j(startTs, "startTs");
        return new ParticipantCountByMinuteResponse(first, last, max, min, startTs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantCountByMinuteResponse)) {
            return false;
        }
        ParticipantCountByMinuteResponse participantCountByMinuteResponse = (ParticipantCountByMinuteResponse) other;
        return this.first == participantCountByMinuteResponse.first && this.last == participantCountByMinuteResponse.last && this.max == participantCountByMinuteResponse.max && this.min == participantCountByMinuteResponse.min && AbstractC22676k.m65745e(this.startTs, participantCountByMinuteResponse.startTs);
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getLast() {
        return this.last;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final C21682i getStartTs() {
        return this.startTs;
    }

    public int hashCode() {
        return this.startTs.hashCode() + AbstractC11266d.m30448b(this.min, AbstractC11266d.m30448b(this.max, AbstractC11266d.m30448b(this.last, Integer.hashCode(this.first) * 31, 31), 31), 31);
    }

    public String toString() {
        int i13 = this.first;
        int i14 = this.last;
        int i15 = this.max;
        int i16 = this.min;
        C21682i c21682i = this.startTs;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ParticipantCountByMinuteResponse(first=", ", last=", ", max=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", min=", i16, ", startTs=");
        sbM30465s.append(c21682i);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
