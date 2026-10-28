package nj2;

import com.whoop.design.util.TextResource;
import com.whoop.util.TrendKey;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nj2.u */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lnj2/u;", "", "Lcom/whoop/design/util/TextResource;", "text", "Lgz0/m0;", "icon", "", "currentDate", "Lcom/whoop/util/TrendKey;", "trendKey", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/util/TrendKey;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "()Lgz0/m0;", "Ljava/lang/String;", "d", "Lcom/whoop/util/TrendKey;", "()Lcom/whoop/util/TrendKey;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26774u {

    /* JADX INFO: renamed from: e */
    public static final int f106639e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String currentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TrendKey trendKey;

    public C26774u(TextResource text, EnumC16313m0 icon, String str, TrendKey trendKey) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(trendKey, "trendKey");
        this.text = text;
        this.icon = icon;
        this.currentDate = str;
        this.trendKey = trendKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TrendKey getTrendKey() {
        return this.trendKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26774u)) {
            return false;
        }
        C26774u c26774u = (C26774u) other;
        return AbstractC22676k.m65745e(this.text, c26774u.text) && this.icon == c26774u.icon && AbstractC22676k.m65745e(this.currentDate, c26774u.currentDate) && this.trendKey == c26774u.trendKey;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.icon, this.text.hashCode() * 31, 31);
        String str = this.currentDate;
        return this.trendKey.hashCode() + ((iM48500b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.text;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str = this.currentDate;
        TrendKey trendKey = this.trendKey;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("StressTrendCtaState(text=", textResource, ", icon=", enumC16313m0, ", currentDate=");
        sbM61140k.append(str);
        sbM61140k.append(", trendKey=");
        sbM61140k.append(trendKey);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }
}
