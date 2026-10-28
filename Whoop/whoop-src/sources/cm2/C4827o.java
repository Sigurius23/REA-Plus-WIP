package cm2;

import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cm2.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcm2/o;", "", "", "nextToken", "", "Lcm2/p;", "reportsState", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4827o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String nextToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C4828p> reportsState;

    public C4827o(String str, List<C4828p> reportsState) {
        AbstractC22676k.m65750j(reportsState, "reportsState");
        this.nextToken = str;
        this.reportsState = reportsState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNextToken() {
        return this.nextToken;
    }

    /* JADX INFO: renamed from: b */
    public final List<C4828p> m15245b() {
        return this.reportsState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4827o)) {
            return false;
        }
        C4827o c4827o = (C4827o) other;
        return AbstractC22676k.m65745e(this.nextToken, c4827o.nextToken) && AbstractC22676k.m65745e(this.reportsState, c4827o.reportsState);
    }

    public int hashCode() {
        String str = this.nextToken;
        return this.reportsState.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("ReportSectionsViewState(nextToken=", this.nextToken, ", reportsState=", ")", this.reportsState);
    }
}
