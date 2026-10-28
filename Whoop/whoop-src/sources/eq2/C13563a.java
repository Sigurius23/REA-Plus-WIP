package eq2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.HeaderStyle;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: eq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Leq2/a;", "", "Lkd1/o;", "imageSource", "Lcom/whoop/design/util/TextResource;", "title", "Lcom/whoop/user/journey/model/HeaderStyle;", "headerStyle", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/user/journey/model/HeaderStyle;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Lcom/whoop/user/journey/model/HeaderStyle;", "()Lcom/whoop/user/journey/model/HeaderStyle;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13563a {

    /* JADX INFO: renamed from: d */
    public static final int f47857d = TextResource.$stable | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final HeaderStyle headerStyle;

    public C13563a(AbstractC22403o imageSource, TextResource title, HeaderStyle headerStyle) {
        AbstractC22676k.m65750j(imageSource, "imageSource");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(headerStyle, "headerStyle");
        this.imageSource = imageSource;
        this.title = title;
        this.headerStyle = headerStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final HeaderStyle getHeaderStyle() {
        return this.headerStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13563a)) {
            return false;
        }
        C13563a c13563a = (C13563a) other;
        return AbstractC22676k.m65745e(this.imageSource, c13563a.imageSource) && AbstractC22676k.m65745e(this.title, c13563a.title) && this.headerStyle == c13563a.headerStyle;
    }

    public int hashCode() {
        return this.headerStyle.hashCode() + AbstractC31061c.m95625a(this.imageSource.hashCode() * 31, this.title, 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.imageSource;
        TextResource textResource = this.title;
        HeaderStyle headerStyle = this.headerStyle;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("HeaderViewState(imageSource=", textResource, abstractC22403o, ", title=", ", headerStyle=");
        sbM114683k.append(headerStyle);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }
}
