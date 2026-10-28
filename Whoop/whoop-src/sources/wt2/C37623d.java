package wt2;

import com.whoop.design.util.TextResource;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: wt2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lwt2/d;", "", "", "nextDateTime", "prevDateTime", "Lcom/whoop/design/util/TextResource;", "currentDateRange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37623d {

    /* JADX INFO: renamed from: d */
    public static final int f160998d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String nextDateTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String prevDateTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource currentDateRange;

    public C37623d(String str, String str2, TextResource currentDateRange) {
        AbstractC22676k.m65750j(currentDateRange, "currentDateRange");
        this.nextDateTime = str;
        this.prevDateTime = str2;
        this.currentDateRange = currentDateRange;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCurrentDateRange() {
        return this.currentDateRange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextDateTime() {
        return this.nextDateTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPrevDateTime() {
        return this.prevDateTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37623d)) {
            return false;
        }
        C37623d c37623d = (C37623d) other;
        return AbstractC22676k.m65745e(this.nextDateTime, c37623d.nextDateTime) && AbstractC22676k.m65745e(this.prevDateTime, c37623d.prevDateTime) && AbstractC22676k.m65745e(this.currentDateRange, c37623d.currentDateRange);
    }

    public int hashCode() {
        String str = this.nextDateTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prevDateTime;
        return this.currentDateRange.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.nextDateTime;
        String str2 = this.prevDateTime;
        return AbstractC30007c.m91841k(AbstractC11895b.m32001t("DateSelectorState(nextDateTime=", str, ", prevDateTime=", str2, ", currentDateRange="), this.currentDateRange, ")");
    }
}
