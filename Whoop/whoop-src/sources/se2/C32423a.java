package se2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: se2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lse2/a;", "", "", "notificationId", "Lse2/b;", "domainAction", "<init>", "(Ljava/lang/String;Lse2/b;)V", "a", "(Ljava/lang/String;Lse2/b;)Lse2/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lse2/b;", "c", "()Lse2/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C32423a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC32424b domainAction;

    public C32423a(String str, InterfaceC32424b domainAction) {
        AbstractC22676k.m65750j(domainAction, "domainAction");
        this.notificationId = str;
        this.domainAction = domainAction;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32423a m101232b(C32423a c32423a, String str, InterfaceC32424b interfaceC32424b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c32423a.notificationId;
        }
        if ((i13 & 2) != 0) {
            interfaceC32424b = c32423a.domainAction;
        }
        return c32423a.m101233a(str, interfaceC32424b);
    }

    /* JADX INFO: renamed from: a */
    public final C32423a m101233a(String notificationId, InterfaceC32424b domainAction) {
        AbstractC22676k.m65750j(domainAction, "domainAction");
        return new C32423a(notificationId, domainAction);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC32424b getDomainAction() {
        return this.domainAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNotificationId() {
        return this.notificationId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32423a)) {
            return false;
        }
        C32423a c32423a = (C32423a) other;
        return AbstractC22676k.m65745e(this.notificationId, c32423a.notificationId) && AbstractC22676k.m65745e(this.domainAction, c32423a.domainAction);
    }

    public int hashCode() {
        String str = this.notificationId;
        return this.domainAction.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "Accumulator(notificationId=" + this.notificationId + ", domainAction=" + this.domainAction + ")";
    }

    public /* synthetic */ C32423a(String str, InterfaceC32424b interfaceC32424b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? new InterfaceC32424b.b(null) : interfaceC32424b);
    }
}
