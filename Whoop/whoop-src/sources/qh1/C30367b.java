package qh1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: qh1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lqh1/b;", "", "", "quantity", "", "id", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "getId", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30367b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int quantity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String id;

    public C30367b(int i13, String str) {
        this.quantity = i13;
        this.id = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30367b)) {
            return false;
        }
        C30367b c30367b = (C30367b) other;
        return this.quantity == c30367b.quantity && AbstractC22676k.m65745e(this.id, c30367b.id);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.quantity) * 31;
        String str = this.id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30007c.m91838h(this.quantity, "OnQuantityChanged(quantity=", ", id=", this.id, ")");
    }
}
