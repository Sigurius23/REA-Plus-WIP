package dv0;

import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: dv0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJX\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b \u0010%R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b&\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, m65681d2 = {"Ldv0/d;", "", "", "initialValue", "", "previousSequence", "", "previousSubSequence", "", "previousTimeInSeconds", "gapInSeconds", "packetsPublished", "timeToFirstPacketSeconds", "<init>", "(ZJIDDILjava/lang/Double;)V", "a", "(ZJIDDILjava/lang/Double;)Ldv0/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "J", "getPreviousSequence", "()J", "c", "I", "getPreviousSubSequence", "D", "f", "()D", "e", "g", "Ljava/lang/Double;", "()Ljava/lang/Double;", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12386d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean initialValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long previousSequence;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int previousSubSequence;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double previousTimeInSeconds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double gapInSeconds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int packetsPublished;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Double timeToFirstPacketSeconds;

    public C12386d(boolean z4, long j7, int i13, double d3, double d14, int i14, Double d15) {
        this.initialValue = z4;
        this.previousSequence = j7;
        this.previousSubSequence = i13;
        this.previousTimeInSeconds = d3;
        this.gapInSeconds = d14;
        this.packetsPublished = i14;
        this.timeToFirstPacketSeconds = d15;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12386d m34761b(C12386d c12386d, boolean z4, long j7, int i13, double d3, double d14, int i14, Double d15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z4 = c12386d.initialValue;
        }
        if ((i15 & 2) != 0) {
            j7 = c12386d.previousSequence;
        }
        if ((i15 & 4) != 0) {
            i13 = c12386d.previousSubSequence;
        }
        if ((i15 & 8) != 0) {
            d3 = c12386d.previousTimeInSeconds;
        }
        if ((i15 & 16) != 0) {
            d14 = c12386d.gapInSeconds;
        }
        if ((i15 & 32) != 0) {
            i14 = c12386d.packetsPublished;
        }
        if ((i15 & 64) != 0) {
            d15 = c12386d.timeToFirstPacketSeconds;
        }
        double d16 = d14;
        int i16 = i13;
        return c12386d.m34762a(z4, j7, i16, d3, d16, i14, d15);
    }

    /* JADX INFO: renamed from: a */
    public final C12386d m34762a(boolean initialValue, long previousSequence, int previousSubSequence, double previousTimeInSeconds, double gapInSeconds, int packetsPublished, Double timeToFirstPacketSeconds) {
        return new C12386d(initialValue, previousSequence, previousSubSequence, previousTimeInSeconds, gapInSeconds, packetsPublished, timeToFirstPacketSeconds);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getGapInSeconds() {
        return this.gapInSeconds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInitialValue() {
        return this.initialValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPacketsPublished() {
        return this.packetsPublished;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12386d)) {
            return false;
        }
        C12386d c12386d = (C12386d) other;
        return this.initialValue == c12386d.initialValue && this.previousSequence == c12386d.previousSequence && this.previousSubSequence == c12386d.previousSubSequence && Double.compare(this.previousTimeInSeconds, c12386d.previousTimeInSeconds) == 0 && Double.compare(this.gapInSeconds, c12386d.gapInSeconds) == 0 && this.packetsPublished == c12386d.packetsPublished && AbstractC22676k.m65745e(this.timeToFirstPacketSeconds, c12386d.timeToFirstPacketSeconds);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getPreviousTimeInSeconds() {
        return this.previousTimeInSeconds;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getTimeToFirstPacketSeconds() {
        return this.timeToFirstPacketSeconds;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.packetsPublished, AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30448b(this.previousSubSequence, AbstractC11266d.m30451e(Boolean.hashCode(this.initialValue) * 31, this.previousSequence, 31), 31), 31, this.previousTimeInSeconds), 31, this.gapInSeconds), 31);
        Double d3 = this.timeToFirstPacketSeconds;
        return iM30448b + (d3 == null ? 0 : d3.hashCode());
    }

    public String toString() {
        boolean z4 = this.initialValue;
        long j7 = this.previousSequence;
        int i13 = this.previousSubSequence;
        double d3 = this.previousTimeInSeconds;
        double d14 = this.gapInSeconds;
        int i14 = this.packetsPublished;
        Double d15 = this.timeToFirstPacketSeconds;
        StringBuilder sb4 = new StringBuilder("RealtimePacketsCounter(initialValue=");
        sb4.append(z4);
        sb4.append(", previousSequence=");
        sb4.append(j7);
        sb4.append(", previousSubSequence=");
        sb4.append(i13);
        sb4.append(", previousTimeInSeconds=");
        sb4.append(d3);
        AbstractC31061c.m95622B(sb4, ", gapInSeconds=", d14, ", packetsPublished=");
        sb4.append(i14);
        sb4.append(", timeToFirstPacketSeconds=");
        sb4.append(d15);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C12386d(boolean z4, long j7, int i13, double d3, double d14, int i14, Double d15, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? true : z4, (i15 & 2) != 0 ? 0L : j7, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0.0d : d3, (i15 & 16) != 0 ? 0.0d : d14, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? null : d15);
    }
}
