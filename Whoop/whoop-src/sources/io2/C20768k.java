package io2;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: io2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio2/k;", "Lm91/u;", "", "Lio2/a;", "details", "Lio2/m;", "total", "<init>", "(Ljava/util/List;Lio2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lio2/m;", "()Lio2/m;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20768k implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C20748a> details;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C20772m total;

    public C20768k(List<C20748a> details, C20772m c20772m) {
        AbstractC22676k.m65750j(details, "details");
        this.details = details;
        this.total = c20772m;
    }

    /* JADX INFO: renamed from: a */
    public final List<C20748a> m57192a() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C20772m getTotal() {
        return this.total;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20768k)) {
            return false;
        }
        C20768k c20768k = (C20768k) other;
        return AbstractC22676k.m65745e(this.details, c20768k.details) && AbstractC22676k.m65745e(this.total, c20768k.total);
    }

    public int hashCode() {
        int iHashCode = this.details.hashCode() * 31;
        C20772m c20772m = this.total;
        return iHashCode + (c20772m == null ? 0 : c20772m.hashCode());
    }

    public String toString() {
        return "CheckoutInfoViewState(details=" + this.details + ", total=" + this.total + ")";
    }
}
