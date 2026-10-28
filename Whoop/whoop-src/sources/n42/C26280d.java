package n42;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: n42.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Ln42/d;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "viewableBy", "", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "I", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26280d {

    /* JADX INFO: renamed from: e */
    public static final int f104466e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource viewableBy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int icon;

    public C26280d(TextResource title, TextResource subtitle, TextResource viewableBy, int i13) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(viewableBy, "viewableBy");
        this.title = title;
        this.subtitle = subtitle;
        this.viewableBy = viewableBy;
        this.icon = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getViewableBy() {
        return this.viewableBy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26280d)) {
            return false;
        }
        C26280d c26280d = (C26280d) other;
        return AbstractC22676k.m65745e(this.title, c26280d.title) && AbstractC22676k.m65745e(this.subtitle, c26280d.subtitle) && AbstractC22676k.m65745e(this.viewableBy, c26280d.viewableBy) && this.icon == c26280d.icon;
    }

    public int hashCode() {
        return Integer.hashCode(this.icon) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), this.viewableBy, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.viewableBy;
        int i13 = this.icon;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("DataSharingBoxViewState(title=", textResource, ", subtitle=", textResource2, ", viewableBy=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", icon=");
        sbM106658q.append(i13);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
