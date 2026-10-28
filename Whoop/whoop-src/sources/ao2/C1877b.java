package ao2;

import com.whoop.navigation.C9598e;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ao2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lao2/b;", "", "", "count", "Lcom/whoop/navigation/e;", "destination", "", "cartId", "<init>", "(ILcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/navigation/e;", "c", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1877b {

    /* JADX INFO: renamed from: d */
    public static final int f7412d = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int count;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String cartId;

    public C1877b(int i13, C9598e c9598e, String str) {
        this.count = i13;
        this.destination = c9598e;
        this.cartId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1877b)) {
            return false;
        }
        C1877b c1877b = (C1877b) other;
        return this.count == c1877b.count && AbstractC22676k.m65745e(this.destination, c1877b.destination) && AbstractC22676k.m65745e(this.cartId, c1877b.cartId);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.cartId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.count;
        C9598e c9598e = this.destination;
        String str = this.cartId;
        StringBuilder sb4 = new StringBuilder("CartIndicatorState(count=");
        sb4.append(i13);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", cartId=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C1877b(int i13, C9598e c9598e, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? null : c9598e, (i14 & 4) != 0 ? null : str);
    }
}
