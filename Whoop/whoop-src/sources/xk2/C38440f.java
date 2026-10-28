package xk2;

import java.util.List;
import m83.C25271y;
import mk2.C25642i;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xk2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, m65681d2 = {"Lxk2/f;", "", "Lmk2/i;", "strain", "", "Lxk2/j;", "buffer", "", "lastProcessedTimestampMillis", "Lxk2/h;", "profile", "<init>", "(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;)V", "a", "(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;)Lxk2/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmk2/i;", "e", "()Lmk2/i;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "d", "Lxk2/h;", "()Lxk2/h;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38440f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25642i strain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C38444j> buffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Long lastProcessedTimestampMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C38442h profile;

    public C38440f(C25642i strain, List<C38444j> buffer, Long l7, C38442h c38442h) {
        AbstractC22676k.m65750j(strain, "strain");
        AbstractC22676k.m65750j(buffer, "buffer");
        this.strain = strain;
        this.buffer = buffer;
        this.lastProcessedTimestampMillis = l7;
        this.profile = c38442h;
    }

    /* JADX INFO: renamed from: a */
    public final C38440f m123143a(C25642i strain, List<C38444j> buffer, Long lastProcessedTimestampMillis, C38442h profile) {
        AbstractC22676k.m65750j(strain, "strain");
        AbstractC22676k.m65750j(buffer, "buffer");
        return new C38440f(strain, buffer, lastProcessedTimestampMillis, profile);
    }

    /* JADX INFO: renamed from: b */
    public final List<C38444j> m123144b() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getLastProcessedTimestampMillis() {
        return this.lastProcessedTimestampMillis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C38442h getProfile() {
        return this.profile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C25642i getStrain() {
        return this.strain;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38440f)) {
            return false;
        }
        C38440f c38440f = (C38440f) other;
        return AbstractC22676k.m65745e(this.strain, c38440f.strain) && AbstractC22676k.m65745e(this.buffer, c38440f.buffer) && AbstractC22676k.m65745e(this.lastProcessedTimestampMillis, c38440f.lastProcessedTimestampMillis) && AbstractC22676k.m65745e(this.profile, c38440f.profile);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.strain.hashCode() * 31, 31, this.buffer);
        Long l7 = this.lastProcessedTimestampMillis;
        int iHashCode = (iM31983b + (l7 == null ? 0 : l7.hashCode())) * 31;
        C38442h c38442h = this.profile;
        return iHashCode + (c38442h != null ? c38442h.hashCode() : 0);
    }

    public String toString() {
        return "StrainAccumulation(strain=" + this.strain + ", buffer=" + this.buffer + ", lastProcessedTimestampMillis=" + this.lastProcessedTimestampMillis + ", profile=" + this.profile + ")";
    }

    public /* synthetic */ C38440f(C25642i c25642i, List list, Long l7, C38442h c38442h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C25642i(0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0d, 0.0d, 255, null) : c25642i, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : l7, (i13 & 8) == 0 ? c38442h : null);
    }
}
