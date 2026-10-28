package xq2;

import b91.C2886a;
import com.whoop.design.util.TextResource;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xq2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\u001a\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b\"\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001e\u0010,¨\u0006-"}, m65681d2 = {"Lxq2/i;", "", "Lcom/whoop/design/util/TextResource;", "metric", "Ly81/e;", "textColor", "Lb91/a;", "metricTextStyle", "Lxq2/f;", "alignment", "Lxq2/g;", "layout", "Lxq2/h;", "bar", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lxq2/f;Lxq2/g;Lxq2/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "e", "()Ly81/e;", "c", "Lb91/a;", "getMetricTextStyle", "()Lb91/a;", "Lxq2/f;", "()Lxq2/f;", "Lxq2/g;", "()Lxq2/g;", "f", "Lxq2/h;", "()Lxq2/h;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38569i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource metric;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e textColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2886a metricTextStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC38561f alignment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C38564g layout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C38567h bar;

    public C38569i(TextResource metric, InterfaceC39332e textColor, C2886a metricTextStyle, EnumC38561f alignment, C38564g layout, C38567h bar) {
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(metricTextStyle, "metricTextStyle");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(layout, "layout");
        AbstractC22676k.m65750j(bar, "bar");
        this.metric = metric;
        this.textColor = textColor;
        this.metricTextStyle = metricTextStyle;
        this.alignment = alignment;
        this.layout = layout;
        this.bar = bar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC38561f getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C38567h getBar() {
        return this.bar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C38564g getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getMetric() {
        return this.metric;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getTextColor() {
        return this.textColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38569i)) {
            return false;
        }
        C38569i c38569i = (C38569i) other;
        return AbstractC22676k.m65745e(this.metric, c38569i.metric) && AbstractC22676k.m65745e(this.textColor, c38569i.textColor) && AbstractC22676k.m65745e(this.metricTextStyle, c38569i.metricTextStyle) && this.alignment == c38569i.alignment && AbstractC22676k.m65745e(this.layout, c38569i.layout) && AbstractC22676k.m65745e(this.bar, c38569i.bar);
    }

    public int hashCode() {
        return this.bar.hashCode() + ((this.layout.hashCode() + ((this.alignment.hashCode() + AbstractC11895b.m31984c(this.metricTextStyle, AbstractC33745d.m106648g(this.textColor, this.metric.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    public String toString() {
        return "ComparisonBarViewState(metric=" + this.metric + ", textColor=" + this.textColor + ", metricTextStyle=" + this.metricTextStyle + ", alignment=" + this.alignment + ", layout=" + this.layout + ", bar=" + this.bar + ")";
    }
}
