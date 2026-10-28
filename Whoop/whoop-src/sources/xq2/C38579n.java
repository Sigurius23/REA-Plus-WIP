package xq2;

import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import i91.AbstractC18247a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xq2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0018\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, m65681d2 = {"Lxq2/n;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "value", "valueSuffix", "", "fillPercentage", "Li91/a;", "progressStyle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;DLi91/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "I", "e", "f", "D", "()D", "Li91/a;", "()Li91/a;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38579n implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f166029g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource valueSuffix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double fillPercentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC18247a progressStyle;

    static {
        int i13 = AbstractC18247a.f71043a;
        int i14 = TextResource.$stable;
        f166029g = i13 | i14 | i14 | i14;
    }

    public C38579n(TextResource title, TextResource subtitle, int i13, TextResource valueSuffix, double d3, AbstractC18247a progressStyle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(valueSuffix, "valueSuffix");
        AbstractC22676k.m65750j(progressStyle, "progressStyle");
        this.title = title;
        this.subtitle = subtitle;
        this.value = i13;
        this.valueSuffix = valueSuffix;
        this.fillPercentage = d3;
        this.progressStyle = progressStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC18247a getProgressStyle() {
        return this.progressStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38579n)) {
            return false;
        }
        C38579n c38579n = (C38579n) other;
        return AbstractC22676k.m65745e(this.title, c38579n.title) && AbstractC22676k.m65745e(this.subtitle, c38579n.subtitle) && this.value == c38579n.value && AbstractC22676k.m65745e(this.valueSuffix, c38579n.valueSuffix) && Double.compare(this.fillPercentage, c38579n.fillPercentage) == 0 && AbstractC22676k.m65745e(this.progressStyle, c38579n.progressStyle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getValueSuffix() {
        return this.valueSuffix;
    }

    public int hashCode() {
        return this.progressStyle.hashCode() + AbstractC17176i.m48499a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.value, AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31), this.valueSuffix, 31), 31, this.fillPercentage);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        int i13 = this.value;
        TextResource textResource3 = this.valueSuffix;
        double d3 = this.fillPercentage;
        AbstractC18247a abstractC18247a = this.progressStyle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GaugeValueState(title=", textResource, ", subtitle=", textResource2, ", value=");
        sbM106658q.append(i13);
        sbM106658q.append(", valueSuffix=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", fillPercentage=");
        sbM106658q.append(d3);
        sbM106658q.append(", progressStyle=");
        sbM106658q.append(abstractC18247a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
