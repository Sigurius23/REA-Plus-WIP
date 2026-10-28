package vl2;

import java.time.LocalDateTime;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vl2.a0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\f¨\u0006\u001b"}, m65681d2 = {"Lvl2/a0;", "", "Ljava/time/LocalDateTime;", "scoreDateTime", "", "vo2maxScore", "", "source", "id", "<init>", "(Ljava/time/LocalDateTime;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDateTime;", "b", "()Ljava/time/LocalDateTime;", "I", "d", "c", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36107a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LocalDateTime scoreDateTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int vo2maxScore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String id;

    public C36107a0(LocalDateTime scoreDateTime, int i13, String source, String str) {
        AbstractC22676k.m65750j(scoreDateTime, "scoreDateTime");
        AbstractC22676k.m65750j(source, "source");
        this.scoreDateTime = scoreDateTime;
        this.vo2maxScore = i13;
        this.source = source;
        this.id = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDateTime getScoreDateTime() {
        return this.scoreDateTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getVo2maxScore() {
        return this.vo2maxScore;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36107a0)) {
            return false;
        }
        C36107a0 c36107a0 = (C36107a0) other;
        return AbstractC22676k.m65745e(this.scoreDateTime, c36107a0.scoreDateTime) && this.vo2maxScore == c36107a0.vo2maxScore && AbstractC22676k.m65745e(this.source, c36107a0.source) && AbstractC22676k.m65745e(this.id, c36107a0.id);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.vo2maxScore, this.scoreDateTime.hashCode() * 31, 31), 31, this.source);
        String str = this.id;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        LocalDateTime localDateTime = this.scoreDateTime;
        int i13 = this.vo2maxScore;
        String str = this.source;
        String str2 = this.id;
        StringBuilder sb4 = new StringBuilder("Vo2ManualMeasurement(scoreDateTime=");
        sb4.append(localDateTime);
        sb4.append(", vo2maxScore=");
        sb4.append(i13);
        sb4.append(", source=");
        return AbstractC11266d.m30464r(sb4, str, ", id=", str2, ")");
    }
}
