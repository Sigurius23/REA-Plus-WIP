package lf0;

import c13.AbstractC3855a;
import hy0.C17736e;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf0.k1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Llf0/k1;", "", "", "id", "Lhy0/e;", "header", "", "Llf0/d1;", "tests", "<init>", "(Ljava/lang/String;Lhy0/e;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lhy0/e;", "()Lhy0/e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23936k1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17736e header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C23908d1> tests;

    public C23936k1(String id4, C17736e c17736e, List<C23908d1> tests) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(tests, "tests");
        this.id = id4;
        this.header = c17736e;
        this.tests = tests;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C17736e getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: b */
    public final List<C23908d1> m70444b() {
        return this.tests;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23936k1)) {
            return false;
        }
        C23936k1 c23936k1 = (C23936k1) other;
        return AbstractC22676k.m65745e(this.id, c23936k1.id) && AbstractC22676k.m65745e(this.header, c23936k1.header) && AbstractC22676k.m65745e(this.tests, c23936k1.tests);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        C17736e c17736e = this.header;
        return this.tests.hashCode() + ((iHashCode + (c17736e == null ? 0 : c17736e.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        C17736e c17736e = this.header;
        List<C23908d1> list = this.tests;
        StringBuilder sb4 = new StringBuilder("LabsTestSelectionItem(id=");
        sb4.append(str);
        sb4.append(", header=");
        sb4.append(c17736e);
        sb4.append(", tests=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
