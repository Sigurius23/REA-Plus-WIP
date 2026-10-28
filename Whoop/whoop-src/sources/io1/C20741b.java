package io1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lio1/b;", "", "Lio1/e;", "action", "", "storedDate", "<init>", "(Lio1/e;Ljava/lang/String;)V", "a", "(Lio1/e;Ljava/lang/String;)Lio1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio1/e;", "c", "()Lio1/e;", "b", "Ljava/lang/String;", "d", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C20741b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC20744e action;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String storedDate;

    public C20741b(AbstractC20744e abstractC20744e, String str) {
        this.action = abstractC20744e;
        this.storedDate = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20741b m57065b(C20741b c20741b, AbstractC20744e abstractC20744e, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC20744e = c20741b.action;
        }
        if ((i13 & 2) != 0) {
            str = c20741b.storedDate;
        }
        return c20741b.m57066a(abstractC20744e, str);
    }

    /* JADX INFO: renamed from: a */
    public final C20741b m57066a(AbstractC20744e action, String storedDate) {
        return new C20741b(action, storedDate);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC20744e getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStoredDate() {
        return this.storedDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20741b)) {
            return false;
        }
        C20741b c20741b = (C20741b) other;
        return AbstractC22676k.m65745e(this.action, c20741b.action) && AbstractC22676k.m65745e(this.storedDate, c20741b.storedDate);
    }

    public int hashCode() {
        AbstractC20744e abstractC20744e = this.action;
        int iHashCode = (abstractC20744e == null ? 0 : abstractC20744e.hashCode()) * 31;
        String str = this.storedDate;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DateAccumulator(action=" + this.action + ", storedDate=" + this.storedDate + ")";
    }

    public /* synthetic */ C20741b(AbstractC20744e abstractC20744e, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : abstractC20744e, (i13 & 2) != 0 ? null : str);
    }
}
