package oe0;

import c13.AbstractC3855a;
import hy0.C17736e;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: oe0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Loe0/b;", "", "", "id", "Lhy0/e;", "sectionHeader", "", "Lm91/u;", "items", "<init>", "(Ljava/lang/String;Lhy0/e;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lhy0/e;", "c", "()Lhy0/e;", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27867b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17736e sectionHeader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C27867b(String id4, C17736e c17736e, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.sectionHeader = c17736e;
        this.items = items;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m84116b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17736e getSectionHeader() {
        return this.sectionHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27867b)) {
            return false;
        }
        C27867b c27867b = (C27867b) other;
        return AbstractC22676k.m65745e(this.id, c27867b.id) && AbstractC22676k.m65745e(this.sectionHeader, c27867b.sectionHeader) && AbstractC22676k.m65745e(this.items, c27867b.items);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        C17736e c17736e = this.sectionHeader;
        return this.items.hashCode() + ((iHashCode + (c17736e == null ? 0 : c17736e.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        C17736e c17736e = this.sectionHeader;
        List<InterfaceC25312u> list = this.items;
        StringBuilder sb4 = new StringBuilder("AdvancedLabsTestHistorySectionViewState(id=");
        sb4.append(str);
        sb4.append(", sectionHeader=");
        sb4.append(c17736e);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
