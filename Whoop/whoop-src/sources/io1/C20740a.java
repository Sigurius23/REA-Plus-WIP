package io1;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ>\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001b\u0010\r¨\u0006\u001d"}, m65681d2 = {"Lio1/a;", "", "Lio1/f;", "domainState", "", "requestDate", "menstruation", "cervicalMucus", "<init>", "(Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio1/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio1/f;", "d", "()Lio1/f;", "b", "Ljava/lang/String;", "f", "c", "e", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C20740a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C20745f domainState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String requestDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String menstruation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String cervicalMucus;

    public C20740a(C20745f domainState, String str, String str2, String str3) {
        AbstractC22676k.m65750j(domainState, "domainState");
        this.domainState = domainState;
        this.requestDate = str;
        this.menstruation = str2;
        this.cervicalMucus = str3;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20740a m57059b(C20740a c20740a, C20745f c20745f, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c20745f = c20740a.domainState;
        }
        if ((i13 & 2) != 0) {
            str = c20740a.requestDate;
        }
        if ((i13 & 4) != 0) {
            str2 = c20740a.menstruation;
        }
        if ((i13 & 8) != 0) {
            str3 = c20740a.cervicalMucus;
        }
        return c20740a.m57060a(c20745f, str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final C20740a m57060a(C20745f domainState, String requestDate, String menstruation, String cervicalMucus) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return new C20740a(domainState, requestDate, menstruation, cervicalMucus);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCervicalMucus() {
        return this.cervicalMucus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C20745f getDomainState() {
        return this.domainState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMenstruation() {
        return this.menstruation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20740a)) {
            return false;
        }
        C20740a c20740a = (C20740a) other;
        return AbstractC22676k.m65745e(this.domainState, c20740a.domainState) && AbstractC22676k.m65745e(this.requestDate, c20740a.requestDate) && AbstractC22676k.m65745e(this.menstruation, c20740a.menstruation) && AbstractC22676k.m65745e(this.cervicalMucus, c20740a.cervicalMucus);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRequestDate() {
        return this.requestDate;
    }

    public int hashCode() {
        int iHashCode = this.domainState.hashCode() * 31;
        String str = this.requestDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.menstruation;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cervicalMucus;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        C20745f c20745f = this.domainState;
        String str = this.requestDate;
        String str2 = this.menstruation;
        String str3 = this.cervicalMucus;
        StringBuilder sb4 = new StringBuilder("AccumulatedState(domainState=");
        sb4.append(c20745f);
        sb4.append(", requestDate=");
        sb4.append(str);
        sb4.append(", menstruation=");
        return AbstractC11266d.m30464r(sb4, str2, ", cervicalMucus=", str3, ")");
    }

    public /* synthetic */ C20740a(C20745f c20745f, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C20745f(InterfaceC20743d.c.f77843a, null, false, false, null, null, 62, null) : c20745f, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
