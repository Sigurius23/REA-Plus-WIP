package h02;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h02.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lh02/k;", "", "", "id", "label", "cost", "", "isStatic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lh02/k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "e", "c", "Z", "f", "()Z", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16580k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String cost;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isStatic;

    public C16580k(String id4, String label, String cost, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(cost, "cost");
        this.id = id4;
        this.label = label;
        this.cost = cost;
        this.isStatic = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16580k m47032b(C16580k c16580k, String str, String str2, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c16580k.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c16580k.label;
        }
        if ((i13 & 4) != 0) {
            str3 = c16580k.cost;
        }
        if ((i13 & 8) != 0) {
            z4 = c16580k.isStatic;
        }
        return c16580k.m47033a(str, str2, str3, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C16580k m47033a(String id4, String label, String cost, boolean isStatic) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(cost, "cost");
        return new C16580k(id4, label, cost, isStatic);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCost() {
        return this.cost;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16580k)) {
            return false;
        }
        C16580k c16580k = (C16580k) other;
        return AbstractC22676k.m65745e(this.id, c16580k.id) && AbstractC22676k.m65745e(this.label, c16580k.label) && AbstractC22676k.m65745e(this.cost, c16580k.cost) && this.isStatic == c16580k.isStatic;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsStatic() {
        return this.isStatic;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isStatic) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label), 31, this.cost);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        return AbstractC21702c.m61137h(AbstractC11895b.m32001t("PriceBreakdownItemUiState(id=", str, ", label=", str2, ", cost="), this.cost, ", isStatic=", this.isStatic, ")");
    }

    public /* synthetic */ C16580k(String str, String str2, String str3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? false : z4);
    }
}
