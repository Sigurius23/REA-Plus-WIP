package p730qt2;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import mt2.AbstractC25946g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: qt2.m */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, m65681d2 = {"Lqt2/m;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "buttonTitle", "Lgz0/m0;", "icon", "Lmt2/g;", "navDestination", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lmt2/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Lgz0/m0;", "()Lgz0/m0;", "Lmt2/g;", "()Lmt2/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30607m implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f125868f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC25946g navDestination;

    public C30607m(TextResource title, TextResource subtitle, TextResource textResource, EnumC16313m0 enumC16313m0, AbstractC25946g abstractC25946g) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.buttonTitle = textResource;
        this.icon = enumC16313m0;
        this.navDestination = abstractC25946g;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC25946g getNavDestination() {
        return this.navDestination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30607m)) {
            return false;
        }
        C30607m c30607m = (C30607m) other;
        return AbstractC22676k.m65745e(this.title, c30607m.title) && AbstractC22676k.m65745e(this.subtitle, c30607m.subtitle) && AbstractC22676k.m65745e(this.buttonTitle, c30607m.buttonTitle) && this.icon == c30607m.icon && AbstractC22676k.m65745e(this.navDestination, c30607m.navDestination);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31);
        TextResource textResource = this.buttonTitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC25946g abstractC25946g = this.navDestination;
        return iHashCode2 + (abstractC25946g != null ? abstractC25946g.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.buttonTitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        AbstractC25946g abstractC25946g = this.navDestination;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("HeaderItemState(title=", textResource, ", subtitle=", textResource2, ", buttonTitle=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", icon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", navDestination=");
        sbM106658q.append(abstractC25946g);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
