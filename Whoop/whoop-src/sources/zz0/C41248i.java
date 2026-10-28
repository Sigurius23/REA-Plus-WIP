package zz0;

import com.whoop.design.util.TextResource;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: zz0.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lzz0/i;", "", "Lcom/whoop/design/util/TextResource;", "monthName", "", "yesCount", "", "dayHeaders", "Lzz0/c;", "weeks", "<init>", "(Lcom/whoop/design/util/TextResource;ILjava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "I", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41248i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource monthName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int yesCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<TextResource> dayHeaders;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<List<C41242c>> weeks;

    /* JADX WARN: Multi-variable type inference failed */
    public C41248i(TextResource monthName, int i13, List<? extends TextResource> dayHeaders, List<? extends List<C41242c>> weeks) {
        AbstractC22676k.m65750j(monthName, "monthName");
        AbstractC22676k.m65750j(dayHeaders, "dayHeaders");
        AbstractC22676k.m65750j(weeks, "weeks");
        this.monthName = monthName;
        this.yesCount = i13;
        this.dayHeaders = dayHeaders;
        this.weeks = weeks;
    }

    /* JADX INFO: renamed from: a */
    public final List<TextResource> m134000a() {
        return this.dayHeaders;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getMonthName() {
        return this.monthName;
    }

    /* JADX INFO: renamed from: c */
    public final List<List<C41242c>> m134002c() {
        return this.weeks;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getYesCount() {
        return this.yesCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41248i)) {
            return false;
        }
        C41248i c41248i = (C41248i) other;
        return AbstractC22676k.m65745e(this.monthName, c41248i.monthName) && this.yesCount == c41248i.yesCount && AbstractC22676k.m65745e(this.dayHeaders, c41248i.dayHeaders) && AbstractC22676k.m65745e(this.weeks, c41248i.weeks);
    }

    public int hashCode() {
        return this.weeks.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.yesCount, this.monthName.hashCode() * 31, 31), 31, this.dayHeaders);
    }

    public String toString() {
        TextResource textResource = this.monthName;
        int i13 = this.yesCount;
        List<TextResource> list = this.dayHeaders;
        List<List<C41242c>> list2 = this.weeks;
        StringBuilder sb4 = new StringBuilder("BehaviorsCalendarMonthViewState(monthName=");
        sb4.append(textResource);
        sb4.append(", yesCount=");
        sb4.append(i13);
        sb4.append(", dayHeaders=");
        return AbstractC30007c.m91843m(sb4, list, ", weeks=", list2, ")");
    }
}
