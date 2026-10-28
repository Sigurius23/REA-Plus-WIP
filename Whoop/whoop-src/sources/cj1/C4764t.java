package cj1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cj1.t */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, m65681d2 = {"Lcj1/t;", "", "Lcom/whoop/design/util/TextResource;", "title", "supertitle", "metricTitle", "Lgz0/m0;", "icon", "statusText", "Ly81/f;", "activeColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "d", "Lgz0/m0;", "()Lgz0/m0;", "Ly81/f;", "()Ly81/f;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4764t {

    /* JADX INFO: renamed from: g */
    public static final int f19634g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource supertitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource metricTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource statusText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f activeColor;

    public C4764t(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC16313m0 enumC16313m0, TextResource textResource4, EnumC39333f activeColor) {
        AbstractC22676k.m65750j(activeColor, "activeColor");
        this.title = textResource;
        this.supertitle = textResource2;
        this.metricTitle = textResource3;
        this.icon = enumC16313m0;
        this.statusText = textResource4;
        this.activeColor = activeColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getActiveColor() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getMetricTitle() {
        return this.metricTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getStatusText() {
        return this.statusText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSupertitle() {
        return this.supertitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4764t)) {
            return false;
        }
        C4764t c4764t = (C4764t) other;
        return AbstractC22676k.m65745e(this.title, c4764t.title) && AbstractC22676k.m65745e(this.supertitle, c4764t.supertitle) && AbstractC22676k.m65745e(this.metricTitle, c4764t.metricTitle) && this.icon == c4764t.icon && AbstractC22676k.m65745e(this.statusText, c4764t.statusText) && this.activeColor == c4764t.activeColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.supertitle;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.metricTitle;
        int iHashCode3 = (iHashCode2 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode4 = (iHashCode3 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        TextResource textResource4 = this.statusText;
        return this.activeColor.hashCode() + ((iHashCode4 + (textResource4 != null ? textResource4.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.supertitle;
        TextResource textResource3 = this.metricTitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource4 = this.statusText;
        EnumC39333f enumC39333f = this.activeColor;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MenstrualCycleInsightsCardBodyState(title=", textResource, ", supertitle=", textResource2, ", metricTitle=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", icon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", statusText=");
        sbM106658q.append(textResource4);
        sbM106658q.append(", activeColor=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C4764t(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC16313m0 enumC16313m0, TextResource textResource4, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : textResource, (i13 & 2) != 0 ? null : textResource2, textResource3, enumC16313m0, textResource4, enumC39333f);
    }
}
