package z31;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: z31.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lz31/e;", "Lm91/u;", "Lz31/d;", NotificationCompat.CATEGORY_STATUS, "", "rowItems", "Lz31/c;", "footerButtons", "<init>", "(Lz31/d;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz31/d;", "getStatus", "()Lz31/d;", "b", "Ljava/util/List;", "getRowItems", "()Ljava/util/List;", "c", "getFooterButtons", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40048e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC40047d status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> rowItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C40046c> footerButtons;

    /* JADX WARN: Multi-variable type inference failed */
    public C40048e(EnumC40047d status, List<? extends InterfaceC25312u> rowItems, List<C40046c> footerButtons) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(rowItems, "rowItems");
        AbstractC22676k.m65750j(footerButtons, "footerButtons");
        this.status = status;
        this.rowItems = rowItems;
        this.footerButtons = footerButtons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40048e)) {
            return false;
        }
        C40048e c40048e = (C40048e) other;
        return this.status == c40048e.status && AbstractC22676k.m65745e(this.rowItems, c40048e.rowItems) && AbstractC22676k.m65745e(this.footerButtons, c40048e.footerButtons);
    }

    public int hashCode() {
        return this.footerButtons.hashCode() + AbstractC11895b.m31983b(this.status.hashCode() * 31, 31, this.rowItems);
    }

    public String toString() {
        EnumC40047d enumC40047d = this.status;
        List<InterfaceC25312u> list = this.rowItems;
        List<C40046c> list2 = this.footerButtons;
        StringBuilder sb4 = new StringBuilder("TargetRecommendationWidgetViewState(status=");
        sb4.append(enumC40047d);
        sb4.append(", rowItems=");
        sb4.append(list);
        sb4.append(", footerButtons=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }
}
