package wr0;

import c13.AbstractC3855a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: wr0.x0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lwr0/x0;", "Lm91/u;", "Lm91/n;", "", "id", "accessibilityLabel", "", "Lwr0/b0;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37563x0 implements InterfaceC25312u, InterfaceC25305n<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String accessibilityLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C37519b0> items;

    public C37563x0(String id4, String str, List<C37519b0> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.accessibilityLabel = str;
        this.items = items;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: b */
    public final List<C37519b0> m120567b() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37563x0)) {
            return false;
        }
        C37563x0 c37563x0 = (C37563x0) other;
        return AbstractC22676k.m65745e(this.id, c37563x0.id) && AbstractC22676k.m65745e(this.accessibilityLabel, c37563x0.accessibilityLabel) && AbstractC22676k.m65745e(this.items, c37563x0.items);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.accessibilityLabel;
        return this.items.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.accessibilityLabel;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("MomentStackState(id=", str, ", accessibilityLabel=", str2, ", items="), this.items, ")");
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }
}
