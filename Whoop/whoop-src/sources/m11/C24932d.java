package m11;

import c13.AbstractC3855a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: m11.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lm11/d;", "Lm91/u;", "", "numberOfColumns", "", "", "tableTitles", "Lm11/a;", "rows", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24932d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int numberOfColumns;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> tableTitles;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<List<C24929a>> rows;

    /* JADX WARN: Multi-variable type inference failed */
    public C24932d(int i13, List<String> tableTitles, List<? extends List<C24929a>> rows) {
        AbstractC22676k.m65750j(tableTitles, "tableTitles");
        AbstractC22676k.m65750j(rows, "rows");
        this.numberOfColumns = i13;
        this.tableTitles = tableTitles;
        this.rows = rows;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNumberOfColumns() {
        return this.numberOfColumns;
    }

    /* JADX INFO: renamed from: b */
    public final List<List<C24929a>> m73037b() {
        return this.rows;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m73038c() {
        return this.tableTitles;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24932d)) {
            return false;
        }
        C24932d c24932d = (C24932d) other;
        return this.numberOfColumns == c24932d.numberOfColumns && AbstractC22676k.m65745e(this.tableTitles, c24932d.tableTitles) && AbstractC22676k.m65745e(this.rows, c24932d.rows);
    }

    public int hashCode() {
        return this.rows.hashCode() + AbstractC11895b.m31983b(Integer.hashCode(this.numberOfColumns) * 31, 31, this.tableTitles);
    }

    public String toString() {
        int i13 = this.numberOfColumns;
        List<String> list = this.tableTitles;
        List<List<C24929a>> list2 = this.rows;
        StringBuilder sb4 = new StringBuilder("ExerciseBreakdownViewState(numberOfColumns=");
        sb4.append(i13);
        sb4.append(", tableTitles=");
        sb4.append(list);
        sb4.append(", rows=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }
}
