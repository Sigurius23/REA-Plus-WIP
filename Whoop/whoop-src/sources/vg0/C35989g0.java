package vg0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg0.g0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lvg0/g0;", "", "", "fingerprint", "turnId", "", "ttfmtMs", "ttpiaMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "J", "()J", "Ljava/lang/Long;", "()Ljava/lang/Long;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35989g0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String turnId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long ttfmtMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Long ttpiaMs;

    public C35989g0(String fingerprint, String turnId, long j7, Long l7) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(turnId, "turnId");
        this.fingerprint = fingerprint;
        this.turnId = turnId;
        this.ttfmtMs = j7;
        this.ttpiaMs = l7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTtfmtMs() {
        return this.ttfmtMs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getTtpiaMs() {
        return this.ttpiaMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35989g0)) {
            return false;
        }
        C35989g0 c35989g0 = (C35989g0) other;
        return AbstractC22676k.m65745e(this.fingerprint, c35989g0.fingerprint) && AbstractC22676k.m65745e(this.turnId, c35989g0.turnId) && this.ttfmtMs == c35989g0.ttfmtMs && AbstractC22676k.m65745e(this.ttpiaMs, c35989g0.ttpiaMs);
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.turnId), this.ttfmtMs, 31);
        Long l7 = this.ttpiaMs;
        return iM30451e + (l7 == null ? 0 : l7.hashCode());
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.turnId;
        long j7 = this.ttfmtMs;
        Long l7 = this.ttpiaMs;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MarkTurnAsSeenAction(fingerprint=", str, ", turnId=", str2, ", ttfmtMs=");
        sbM32001t.append(j7);
        sbM32001t.append(", ttpiaMs=");
        sbM32001t.append(l7);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
