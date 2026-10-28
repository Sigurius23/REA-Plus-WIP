package vg0;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lvg0/i;", "", "", "fingerprint", "recommendationId", "", "committed", "replacementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35992i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String recommendationId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean committed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String replacementId;

    public C35992i(String fingerprint, String recommendationId, boolean z4, String str) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        this.fingerprint = fingerprint;
        this.recommendationId = recommendationId;
        this.committed = z4;
        this.replacementId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCommitted() {
        return this.committed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRecommendationId() {
        return this.recommendationId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReplacementId() {
        return this.replacementId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35992i)) {
            return false;
        }
        C35992i c35992i = (C35992i) other;
        return AbstractC22676k.m65745e(this.fingerprint, c35992i.fingerprint) && AbstractC22676k.m65745e(this.recommendationId, c35992i.recommendationId) && this.committed == c35992i.committed && AbstractC22676k.m65745e(this.replacementId, c35992i.replacementId);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.recommendationId), 31, this.committed);
        String str = this.replacementId;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.recommendationId;
        return AbstractC21702c.m61139j(AbstractC11895b.m32001t("CommitRecommendationAction(fingerprint=", str, ", recommendationId=", str2, ", committed="), this.committed, ", replacementId=", this.replacementId, ")");
    }
}
