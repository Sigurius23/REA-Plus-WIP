package wr0;

import b91.C2886a;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wr0.w */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, m65681d2 = {"Lwr0/w;", "", "Lkd1/o;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lb91/a;", "titleStyle", "subtitleStyle", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/a;Lb91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Lb91/a;", "e", "()Lb91/a;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37560w {

    /* JADX INFO: renamed from: f */
    public static final int f160627f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2886a titleStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C2886a subtitleStyle;

    static {
        int i13 = C2886a.f11498d;
        int i14 = TextResource.$stable;
        f160627f = i13 | i14 | i14 | AbstractC22403o.f87638a;
    }

    public C37560w(AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, C2886a c2886a, C2886a c2886a2) {
        this.icon = abstractC22403o;
        this.title = textResource;
        this.subtitle = textResource2;
        this.titleStyle = c2886a;
        this.subtitleStyle = c2886a2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C2886a getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C2886a getTitleStyle() {
        return this.titleStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37560w)) {
            return false;
        }
        C37560w c37560w = (C37560w) other;
        return AbstractC22676k.m65745e(this.icon, c37560w.icon) && AbstractC22676k.m65745e(this.title, c37560w.title) && AbstractC22676k.m65745e(this.subtitle, c37560w.subtitle) && AbstractC22676k.m65745e(this.titleStyle, c37560w.titleStyle) && AbstractC22676k.m65745e(this.subtitleStyle, c37560w.subtitleStyle);
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.icon;
        int iHashCode = (abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        C2886a c2886a = this.titleStyle;
        int iHashCode4 = (iHashCode3 + (c2886a == null ? 0 : c2886a.hashCode())) * 31;
        C2886a c2886a2 = this.subtitleStyle;
        return iHashCode4 + (c2886a2 != null ? c2886a2.hashCode() : 0);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C2886a c2886a = this.titleStyle;
        C2886a c2886a2 = this.subtitleStyle;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("MomentCardFooter(icon=", textResource, abstractC22403o, ", title=", ", subtitle=");
        sbM114683k.append(textResource2);
        sbM114683k.append(", titleStyle=");
        sbM114683k.append(c2886a);
        sbM114683k.append(", subtitleStyle=");
        sbM114683k.append(c2886a2);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }
}
