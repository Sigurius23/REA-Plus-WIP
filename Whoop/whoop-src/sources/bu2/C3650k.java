package bu2;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: bu2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lbu2/k;", "", "Lcom/whoop/design/util/TextResource;", "maxText", "", "maxPercentage", "maxLabel", "minText", "minPercentage", "minLabel", "Ly81/e;", "color", "<init>", "(Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Ly81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "F", "()F", "c", "getMaxLabel", "d", "e", "f", "g", "Ly81/e;", "getColor", "()Ly81/e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3650k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource maxText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float maxPercentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource maxLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource minText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float minPercentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource minLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    public C3650k(TextResource maxText, float f13, TextResource maxLabel, TextResource minText, float f14, TextResource minLabel, InterfaceC39332e color) {
        AbstractC22676k.m65750j(maxText, "maxText");
        AbstractC22676k.m65750j(maxLabel, "maxLabel");
        AbstractC22676k.m65750j(minText, "minText");
        AbstractC22676k.m65750j(minLabel, "minLabel");
        AbstractC22676k.m65750j(color, "color");
        this.maxText = maxText;
        this.maxPercentage = f13;
        this.maxLabel = maxLabel;
        this.minText = minText;
        this.minPercentage = f14;
        this.minLabel = minLabel;
        this.color = color;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getMaxPercentage() {
        return this.maxPercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getMaxText() {
        return this.maxText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getMinLabel() {
        return this.minLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMinPercentage() {
        return this.minPercentage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getMinText() {
        return this.minText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3650k)) {
            return false;
        }
        C3650k c3650k = (C3650k) other;
        return AbstractC22676k.m65745e(this.maxText, c3650k.maxText) && Float.compare(this.maxPercentage, c3650k.maxPercentage) == 0 && AbstractC22676k.m65745e(this.maxLabel, c3650k.maxLabel) && AbstractC22676k.m65745e(this.minText, c3650k.minText) && Float.compare(this.minPercentage, c3650k.minPercentage) == 0 && AbstractC22676k.m65745e(this.minLabel, c3650k.minLabel) && AbstractC22676k.m65745e(this.color, c3650k.color);
    }

    public int hashCode() {
        return this.color.hashCode() + AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.minPercentage, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.maxPercentage, this.maxText.hashCode() * 31, 31), this.maxLabel, 31), this.minText, 31), 31), this.minLabel, 31);
    }

    public String toString() {
        TextResource textResource = this.maxText;
        float f13 = this.maxPercentage;
        TextResource textResource2 = this.maxLabel;
        TextResource textResource3 = this.minText;
        float f14 = this.minPercentage;
        TextResource textResource4 = this.minLabel;
        InterfaceC39332e interfaceC39332e = this.color;
        StringBuilder sb4 = new StringBuilder("MetricSliderRange(maxText=");
        sb4.append(textResource);
        sb4.append(", maxPercentage=");
        sb4.append(f13);
        sb4.append(", maxLabel=");
        AbstractC30007c.m91855y(sb4, textResource2, ", minText=", textResource3, ", minPercentage=");
        sb4.append(f14);
        sb4.append(", minLabel=");
        sb4.append(textResource4);
        sb4.append(", color=");
        sb4.append(interfaceC39332e);
        sb4.append(")");
        return sb4.toString();
    }
}
