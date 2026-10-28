package sq2;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sq2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u0010¨\u0006$"}, m65681d2 = {"Lsq2/b;", "", "Li2/x;", "color", "", "fillPercentage", "", "isPrimary", "", "statistic", "value", "<init>", "(JFZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(JFZLjava/lang/String;Ljava/lang/String;)Lsq2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "c", "()J", "b", "F", "d", "()F", "Z", "g", "()Z", "Ljava/lang/String;", "e", "f", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32885b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float fillPercentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isPrimary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String statistic;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String value;

    public /* synthetic */ C32885b(long j7, float f13, boolean z4, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, f13, z4, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32885b m103239b(C32885b c32885b, long j7, float f13, boolean z4, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = c32885b.color;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            f13 = c32885b.fillPercentage;
        }
        float f14 = f13;
        if ((i13 & 4) != 0) {
            z4 = c32885b.isPrimary;
        }
        boolean z13 = z4;
        if ((i13 & 8) != 0) {
            str = c32885b.statistic;
        }
        String str3 = str;
        if ((i13 & 16) != 0) {
            str2 = c32885b.value;
        }
        return c32885b.m103240a(j13, f14, z13, str3, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C32885b m103240a(long color, float fillPercentage, boolean isPrimary, String statistic, String value) {
        AbstractC22676k.m65750j(statistic, "statistic");
        AbstractC22676k.m65750j(value, "value");
        return new C32885b(color, fillPercentage, isPrimary, statistic, value, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatistic() {
        return this.statistic;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32885b)) {
            return false;
        }
        C32885b c32885b = (C32885b) other;
        return C17919x.m51542d(this.color, c32885b.color) && Float.compare(this.fillPercentage, c32885b.fillPercentage) == 0 && this.isPrimary == c32885b.isPrimary && AbstractC22676k.m65745e(this.statistic, c32885b.statistic) && AbstractC22676k.m65745e(this.value, c32885b.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    public int hashCode() {
        long j7 = this.color;
        int i13 = C17919x.f69638o;
        return this.value.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.fillPercentage, Long.hashCode(j7) * 31, 31), 31, this.isPrimary), 31, this.statistic);
    }

    public String toString() {
        String strM51548j = C17919x.m51548j(this.color);
        float f13 = this.fillPercentage;
        boolean z4 = this.isPrimary;
        String str = this.statistic;
        String str2 = this.value;
        StringBuilder sb4 = new StringBuilder("DonutStatItem(color=");
        sb4.append(strM51548j);
        sb4.append(", fillPercentage=");
        sb4.append(f13);
        sb4.append(", isPrimary=");
        AbstractC38963t7.m124391u(sb4, z4, ", statistic=", str, ", value=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    private C32885b(long j7, float f13, boolean z4, String statistic, String value) {
        AbstractC22676k.m65750j(statistic, "statistic");
        AbstractC22676k.m65750j(value, "value");
        this.color = j7;
        this.fillPercentage = f13;
        this.isPrimary = z4;
        this.statistic = statistic;
        this.value = value;
    }
}
