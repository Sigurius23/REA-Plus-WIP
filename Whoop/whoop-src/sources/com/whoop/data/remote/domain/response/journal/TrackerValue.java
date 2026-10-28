package com.whoop.data.remote.domain.response.journal;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/TrackerValue;", "", "behaviorTrackerId", "", "answered", "", "timeInputLabel", "", "timeInputValue", "", "magnitudeInputLabel", "magnitudeInputValue", "", "<init>", "(IZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)V", "getBehaviorTrackerId", "()I", "getAnswered", "()Z", "getTimeInputLabel", "()Ljava/lang/String;", "getTimeInputValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMagnitudeInputLabel", "getMagnitudeInputValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/response/journal/TrackerValue;", "equals", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TrackerValue {
    private final boolean answered;
    private final int behaviorTrackerId;
    private final String magnitudeInputLabel;
    private final Double magnitudeInputValue;
    private final String timeInputLabel;
    private final Long timeInputValue;

    public TrackerValue(int i13, boolean z4, String str, Long l7, String str2, Double d3) {
        this.behaviorTrackerId = i13;
        this.answered = z4;
        this.timeInputLabel = str;
        this.timeInputValue = l7;
        this.magnitudeInputLabel = str2;
        this.magnitudeInputValue = d3;
    }

    public static /* synthetic */ TrackerValue copy$default(TrackerValue trackerValue, int i13, boolean z4, String str, Long l7, String str2, Double d3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = trackerValue.behaviorTrackerId;
        }
        if ((i14 & 2) != 0) {
            z4 = trackerValue.answered;
        }
        if ((i14 & 4) != 0) {
            str = trackerValue.timeInputLabel;
        }
        if ((i14 & 8) != 0) {
            l7 = trackerValue.timeInputValue;
        }
        if ((i14 & 16) != 0) {
            str2 = trackerValue.magnitudeInputLabel;
        }
        if ((i14 & 32) != 0) {
            d3 = trackerValue.magnitudeInputValue;
        }
        String str3 = str2;
        Double d14 = d3;
        return trackerValue.copy(i13, z4, str, l7, str3, d14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAnswered() {
        return this.answered;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMagnitudeInputLabel() {
        return this.magnitudeInputLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getMagnitudeInputValue() {
        return this.magnitudeInputValue;
    }

    public final TrackerValue copy(int behaviorTrackerId, boolean answered, String timeInputLabel, Long timeInputValue, String magnitudeInputLabel, Double magnitudeInputValue) {
        return new TrackerValue(behaviorTrackerId, answered, timeInputLabel, timeInputValue, magnitudeInputLabel, magnitudeInputValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackerValue)) {
            return false;
        }
        TrackerValue trackerValue = (TrackerValue) other;
        return this.behaviorTrackerId == trackerValue.behaviorTrackerId && this.answered == trackerValue.answered && AbstractC22676k.m65745e(this.timeInputLabel, trackerValue.timeInputLabel) && AbstractC22676k.m65745e(this.timeInputValue, trackerValue.timeInputValue) && AbstractC22676k.m65745e(this.magnitudeInputLabel, trackerValue.magnitudeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputValue, trackerValue.magnitudeInputValue);
    }

    public final boolean getAnswered() {
        return this.answered;
    }

    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    public final String getMagnitudeInputLabel() {
        return this.magnitudeInputLabel;
    }

    public final Double getMagnitudeInputValue() {
        return this.magnitudeInputValue;
    }

    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Integer.hashCode(this.behaviorTrackerId) * 31, 31, this.answered);
        String str = this.timeInputLabel;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.timeInputValue;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.magnitudeInputLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.magnitudeInputValue;
        return iHashCode3 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        return "TrackerValue(behaviorTrackerId=" + this.behaviorTrackerId + ", answered=" + this.answered + ", timeInputLabel=" + this.timeInputLabel + ", timeInputValue=" + this.timeInputValue + ", magnitudeInputLabel=" + this.magnitudeInputLabel + ", magnitudeInputValue=" + this.magnitudeInputValue + ")";
    }

    public /* synthetic */ TrackerValue(int i13, boolean z4, String str, Long l7, String str2, Double d3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, z4, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : l7, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : d3);
    }
}
