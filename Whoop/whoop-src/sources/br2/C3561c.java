package br2;

import b91.C2886a;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: br2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b%\u00104R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b'\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b!\u00107R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b8\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b5\u00104R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b/\u0010;¨\u0006<"}, m65681d2 = {"Lbr2/c;", "", "Lcom/whoop/design/util/TextResource;", "title", "metric", "subMetric", "Lkd1/o;", "icon", "", "isPrimary", "", "opacity", "Ly81/f;", "color", "fillPercentage", "Lbr2/b;", "barType", "useGradientBackground", "textColor", "Lb91/a;", "titleTextStyle", "metricTextStyle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;ZFLy81/f;FLbr2/b;ZLy81/f;Lb91/a;Lb91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "Lkd1/o;", "()Lkd1/o;", "Z", "m", "()Z", "f", "F", "g", "()F", "Ly81/f;", "()Ly81/f;", "i", "Lbr2/b;", "()Lbr2/b;", "l", "k", "Lb91/a;", "()Lb91/a;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3561c {

    /* JADX INFO: renamed from: n */
    public static final int f14397n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource metric;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subMetric;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isPrimary;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float opacity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float fillPercentage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC3560b barType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean useGradientBackground;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC39333f textColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C2886a titleTextStyle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C2886a metricTextStyle;

    static {
        int i13 = C2886a.f11498d | AbstractC22403o.f87638a;
        int i14 = TextResource.$stable;
        f14397n = i13 | i14 | i14 | i14;
    }

    public C3561c(TextResource title, TextResource metric, TextResource textResource, AbstractC22403o abstractC22403o, boolean z4, float f13, EnumC39333f color, float f14, EnumC3560b barType, boolean z13, EnumC39333f enumC39333f, C2886a titleTextStyle, C2886a metricTextStyle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(barType, "barType");
        AbstractC22676k.m65750j(titleTextStyle, "titleTextStyle");
        AbstractC22676k.m65750j(metricTextStyle, "metricTextStyle");
        this.title = title;
        this.metric = metric;
        this.subMetric = textResource;
        this.icon = abstractC22403o;
        this.isPrimary = z4;
        this.opacity = f13;
        this.color = color;
        this.fillPercentage = f14;
        this.barType = barType;
        this.useGradientBackground = z13;
        this.textColor = enumC39333f;
        this.titleTextStyle = titleTextStyle;
        this.metricTextStyle = metricTextStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC3560b getBarType() {
        return this.barType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getMetric() {
        return this.metric;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3561c)) {
            return false;
        }
        C3561c c3561c = (C3561c) other;
        return AbstractC22676k.m65745e(this.title, c3561c.title) && AbstractC22676k.m65745e(this.metric, c3561c.metric) && AbstractC22676k.m65745e(this.subMetric, c3561c.subMetric) && AbstractC22676k.m65745e(this.icon, c3561c.icon) && this.isPrimary == c3561c.isPrimary && Float.compare(this.opacity, c3561c.opacity) == 0 && this.color == c3561c.color && Float.compare(this.fillPercentage, c3561c.fillPercentage) == 0 && this.barType == c3561c.barType && this.useGradientBackground == c3561c.useGradientBackground && this.textColor == c3561c.textColor && AbstractC22676k.m65745e(this.titleTextStyle, c3561c.titleTextStyle) && AbstractC22676k.m65745e(this.metricTextStyle, c3561c.metricTextStyle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C2886a getMetricTextStyle() {
        return this.metricTextStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getSubMetric() {
        return this.subMetric;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.metric, 31);
        TextResource textResource = this.subMetric;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.icon;
        int iM8289b = AbstractC2875y.m8289b((this.barType.hashCode() + AbstractC11266d.m30447a(this.fillPercentage, AbstractC21702c.m61132c(this.color, AbstractC11266d.m30447a(this.opacity, AbstractC2875y.m8289b((iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.isPrimary), 31), 31), 31)) * 31, 31, this.useGradientBackground);
        EnumC39333f enumC39333f = this.textColor;
        return this.metricTextStyle.hashCode() + AbstractC11895b.m31984c(this.titleTextStyle, (iM8289b + (enumC39333f != null ? enumC39333f.hashCode() : 0)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC39333f getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C2886a getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getUseGradientBackground() {
        return this.useGradientBackground;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.metric;
        TextResource textResource3 = this.subMetric;
        AbstractC22403o abstractC22403o = this.icon;
        boolean z4 = this.isPrimary;
        float f13 = this.opacity;
        EnumC39333f enumC39333f = this.color;
        float f14 = this.fillPercentage;
        EnumC3560b enumC3560b = this.barType;
        boolean z13 = this.useGradientBackground;
        EnumC39333f enumC39333f2 = this.textColor;
        C2886a c2886a = this.titleTextStyle;
        C2886a c2886a2 = this.metricTextStyle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BarViewState(title=", textResource, ", metric=", textResource2, ", subMetric=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", icon=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", isPrimary=");
        sbM106658q.append(z4);
        sbM106658q.append(", opacity=");
        sbM106658q.append(f13);
        sbM106658q.append(", color=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(", fillPercentage=");
        sbM106658q.append(f14);
        sbM106658q.append(", barType=");
        sbM106658q.append(enumC3560b);
        sbM106658q.append(", useGradientBackground=");
        sbM106658q.append(z13);
        sbM106658q.append(", textColor=");
        sbM106658q.append(enumC39333f2);
        sbM106658q.append(", titleTextStyle=");
        sbM106658q.append(c2886a);
        sbM106658q.append(", metricTextStyle=");
        sbM106658q.append(c2886a2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
