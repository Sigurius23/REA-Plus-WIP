package s21;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s21.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m65681d2 = {"Ls21/b;", "", "", "eventName", "category", "label", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32079b {

    /* JADX INFO: renamed from: e */
    public static final int f133035e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String value;

    public C32079b(String str, String str2, String str3, String str4) {
        this.eventName = str;
        this.category = str2;
        this.label = str3;
        this.value = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32079b)) {
            return false;
        }
        C32079b c32079b = (C32079b) other;
        return AbstractC22676k.m65745e(this.eventName, c32079b.eventName) && AbstractC22676k.m65745e(this.category, c32079b.category) && AbstractC22676k.m65745e(this.label, c32079b.label) && AbstractC22676k.m65745e(this.value, c32079b.value);
    }

    public int hashCode() {
        String str = this.eventName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.value;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventName;
        String str2 = this.category;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("MilestoneAnalyticsViewState(eventName=", str, ", category=", str2, ", label="), this.label, ", value=", this.value, ")");
    }
}
