package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import jg3.C21682i;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m65681d2 = {"Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;", "", "", "maxPoints", "Ljg3/i;", "since", "stepSeconds", "until", "<init>", "(ILjg3/i;ILjg3/i;)V", "component1", "()I", "component2", "()Ljg3/i;", "component3", "component4", "copy", "(ILjg3/i;ILjg3/i;)Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMaxPoints", "Ljg3/i;", "getSince", "getStepSeconds", "getUntil", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ParticipantSeriesTimeframe {
    private final int maxPoints;
    private final C21682i since;
    private final int stepSeconds;
    private final C21682i until;

    public ParticipantSeriesTimeframe(@InterfaceC30731q(name = "max_points") int i13, @InterfaceC30731q(name = "since") C21682i since, @InterfaceC30731q(name = "step_seconds") int i14, @InterfaceC30731q(name = "until") C21682i until) {
        AbstractC22676k.m65750j(since, "since");
        AbstractC22676k.m65750j(until, "until");
        this.maxPoints = i13;
        this.since = since;
        this.stepSeconds = i14;
        this.until = until;
    }

    public static /* synthetic */ ParticipantSeriesTimeframe copy$default(ParticipantSeriesTimeframe participantSeriesTimeframe, int i13, C21682i c21682i, int i14, C21682i c21682i2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = participantSeriesTimeframe.maxPoints;
        }
        if ((i15 & 2) != 0) {
            c21682i = participantSeriesTimeframe.since;
        }
        if ((i15 & 4) != 0) {
            i14 = participantSeriesTimeframe.stepSeconds;
        }
        if ((i15 & 8) != 0) {
            c21682i2 = participantSeriesTimeframe.until;
        }
        return participantSeriesTimeframe.copy(i13, c21682i, i14, c21682i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxPoints() {
        return this.maxPoints;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getSince() {
        return this.since;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStepSeconds() {
        return this.stepSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C21682i getUntil() {
        return this.until;
    }

    public final ParticipantSeriesTimeframe copy(@InterfaceC30731q(name = "max_points") int maxPoints, @InterfaceC30731q(name = "since") C21682i since, @InterfaceC30731q(name = "step_seconds") int stepSeconds, @InterfaceC30731q(name = "until") C21682i until) {
        AbstractC22676k.m65750j(since, "since");
        AbstractC22676k.m65750j(until, "until");
        return new ParticipantSeriesTimeframe(maxPoints, since, stepSeconds, until);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantSeriesTimeframe)) {
            return false;
        }
        ParticipantSeriesTimeframe participantSeriesTimeframe = (ParticipantSeriesTimeframe) other;
        return this.maxPoints == participantSeriesTimeframe.maxPoints && AbstractC22676k.m65745e(this.since, participantSeriesTimeframe.since) && this.stepSeconds == participantSeriesTimeframe.stepSeconds && AbstractC22676k.m65745e(this.until, participantSeriesTimeframe.until);
    }

    public final int getMaxPoints() {
        return this.maxPoints;
    }

    public final C21682i getSince() {
        return this.since;
    }

    public final int getStepSeconds() {
        return this.stepSeconds;
    }

    public final C21682i getUntil() {
        return this.until;
    }

    public int hashCode() {
        return this.until.hashCode() + AbstractC11266d.m30448b(this.stepSeconds, AbstractC3855a.m11822f(this.since, Integer.hashCode(this.maxPoints) * 31, 31), 31);
    }

    public String toString() {
        return "ParticipantSeriesTimeframe(maxPoints=" + this.maxPoints + ", since=" + this.since + ", stepSeconds=" + this.stepSeconds + ", until=" + this.until + ")";
    }
}
