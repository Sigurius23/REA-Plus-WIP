package cj1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: cj1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lcj1/e;", "Lm91/u;", "Lcj1/b;", "header", "", "items", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "Lcj1/n;", "heartScreenerUpdatedAtInfo", "<init>", "(Lcj1/b;Ljava/util/List;Lcom/whoop/navigation/e;Lcj1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcj1/b;", "()Lcj1/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "d", "Lcj1/n;", "getHeartScreenerUpdatedAtInfo", "()Lcj1/n;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4749e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4746b header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4758n heartScreenerUpdatedAtInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public C4749e(C4746b header, List<? extends InterfaceC25312u> items, C9598e c9598e, C4758n c4758n) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        this.header = header;
        this.items = items;
        this.navigation = c9598e;
        this.heartScreenerUpdatedAtInfo = c4758n;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4746b getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m14939b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4749e)) {
            return false;
        }
        C4749e c4749e = (C4749e) other;
        return AbstractC22676k.m65745e(this.header, c4749e.header) && AbstractC22676k.m65745e(this.items, c4749e.items) && AbstractC22676k.m65745e(this.navigation, c4749e.navigation) && AbstractC22676k.m65745e(this.heartScreenerUpdatedAtInfo, c4749e.heartScreenerUpdatedAtInfo);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.items);
        C9598e c9598e = this.navigation;
        int iHashCode = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        C4758n c4758n = this.heartScreenerUpdatedAtInfo;
        return iHashCode + (c4758n != null ? c4758n.hashCode() : 0);
    }

    public String toString() {
        return "DataVisualizationCardViewState(header=" + this.header + ", items=" + this.items + ", navigation=" + this.navigation + ", heartScreenerUpdatedAtInfo=" + this.heartScreenerUpdatedAtInfo + ")";
    }

    public /* synthetic */ C4749e(C4746b c4746b, List list, C9598e c9598e, C4758n c4758n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C4746b(null, null, 0, 7, null) : c4746b, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : c4758n);
    }
}
