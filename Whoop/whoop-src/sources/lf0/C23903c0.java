package lf0;

import java.util.List;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf0.c0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Llf0/c0;", "", "", "Llf0/h0;", "items", "Lny0/h;", "button", "<init>", "(Ljava/util/List;Lny0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lny0/h;", "()Lny0/h;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23903c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C23923h0> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27256h button;

    public C23903c0(List<C23923h0> items, C27256h c27256h) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.button = c27256h;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b */
    public final List<C23923h0> m70263b() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23903c0)) {
            return false;
        }
        C23903c0 c23903c0 = (C23903c0) other;
        return AbstractC22676k.m65745e(this.items, c23903c0.items) && AbstractC22676k.m65745e(this.button, c23903c0.button);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        C27256h c27256h = this.button;
        return iHashCode + (c27256h == null ? 0 : c27256h.hashCode());
    }

    public String toString() {
        return "ClinicalReportCardBodyViewState(items=" + this.items + ", button=" + this.button + ")";
    }
}
