package s51;

import com.whoop.design.atomic.organism.datahighlight.StreaksBadgeStyle;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: s51.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006$"}, m65681d2 = {"Ls51/o;", "Lm91/u;", "", "id", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;", "style", "<init>", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "e", "Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;", "()Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32218o implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final StreaksBadgeStyle style;

    public C32218o(String id4, EnumC16313m0 icon, TextResource title, TextResource textResource, StreaksBadgeStyle style) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.icon = icon;
        this.title = title;
        this.subtitle = textResource;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StreaksBadgeStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32218o)) {
            return false;
        }
        C32218o c32218o = (C32218o) other;
        return AbstractC22676k.m65745e(this.id, c32218o.id) && this.icon == c32218o.icon && AbstractC22676k.m65745e(this.title, c32218o.title) && AbstractC22676k.m65745e(this.subtitle, c32218o.subtitle) && this.style == c32218o.style;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC17176i.m48500b(this.icon, this.id.hashCode() * 31, 31), this.title, 31);
        TextResource textResource = this.subtitle;
        return this.style.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        StreaksBadgeStyle streaksBadgeStyle = this.style;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("StreakBadgeState(id=", str, ", icon=", enumC16313m0, ", title=");
        AbstractC30007c.m91855y(sbM61141l, textResource, ", subtitle=", textResource2, ", style=");
        sbM61141l.append(streaksBadgeStyle);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }
}
