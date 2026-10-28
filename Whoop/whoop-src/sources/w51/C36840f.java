package w51;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: w51.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b!\u0010%¨\u0006&"}, m65681d2 = {"Lw51/f;", "", "Lkd1/o;", "icon", "Lcom/whoop/design/util/TextResource;", "activityName", "avgStrain", "activityCount", "", "barFillPercentage", "Lw51/a;", "barStyle", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLw51/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "f", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "d", "e", "F", "()F", "Lw51/a;", "()Lw51/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36840f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource activityName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource avgStrain;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource activityCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float barFillPercentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC36835a barStyle;

    public C36840f(AbstractC22403o icon, TextResource activityName, TextResource avgStrain, TextResource activityCount, float f13, EnumC36835a barStyle) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(activityName, "activityName");
        AbstractC22676k.m65750j(avgStrain, "avgStrain");
        AbstractC22676k.m65750j(activityCount, "activityCount");
        AbstractC22676k.m65750j(barStyle, "barStyle");
        this.icon = icon;
        this.activityName = activityName;
        this.avgStrain = avgStrain;
        this.activityCount = activityCount;
        this.barFillPercentage = f13;
        this.barStyle = barStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getActivityCount() {
        return this.activityCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getAvgStrain() {
        return this.avgStrain;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getBarFillPercentage() {
        return this.barFillPercentage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC36835a getBarStyle() {
        return this.barStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36840f)) {
            return false;
        }
        C36840f c36840f = (C36840f) other;
        return AbstractC22676k.m65745e(this.icon, c36840f.icon) && AbstractC22676k.m65745e(this.activityName, c36840f.activityName) && AbstractC22676k.m65745e(this.avgStrain, c36840f.avgStrain) && AbstractC22676k.m65745e(this.activityCount, c36840f.activityCount) && Float.compare(this.barFillPercentage, c36840f.barFillPercentage) == 0 && this.barStyle == c36840f.barStyle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.barStyle.hashCode() + AbstractC11266d.m30447a(this.barFillPercentage, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.icon.hashCode() * 31, this.activityName, 31), this.avgStrain, 31), this.activityCount, 31), 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.icon;
        TextResource textResource = this.activityName;
        TextResource textResource2 = this.avgStrain;
        TextResource textResource3 = this.activityCount;
        float f13 = this.barFillPercentage;
        EnumC36835a enumC36835a = this.barStyle;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("ExpandableStatisticListItemViewState(icon=", textResource, abstractC22403o, ", activityName=", ", avgStrain=");
        AbstractC30007c.m91855y(sbM114683k, textResource2, ", activityCount=", textResource3, ", barFillPercentage=");
        sbM114683k.append(f13);
        sbM114683k.append(", barStyle=");
        sbM114683k.append(enumC36835a);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }
}
