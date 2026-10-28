package yi1;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: yi1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lyi1/a;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "body", "Lkd1/o;", "iconUrl", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lkd1/o;", "()Lkd1/o;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39567a implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f170227d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o iconUrl;

    static {
        int i13 = AbstractC22403o.f87638a;
        int i14 = TextResource.$stable;
        f170227d = i13 | i14 | i14;
    }

    public C39567a(TextResource title, TextResource body, AbstractC22403o iconUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        this.title = title;
        this.body = body;
        this.iconUrl = iconUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39567a)) {
            return false;
        }
        C39567a c39567a = (C39567a) other;
        return AbstractC22676k.m65745e(this.title, c39567a.title) && AbstractC22676k.m65745e(this.body, c39567a.body) && AbstractC22676k.m65745e(this.iconUrl, c39567a.iconUrl);
    }

    public int hashCode() {
        return this.iconUrl.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.body, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.body;
        AbstractC22403o abstractC22403o = this.iconUrl;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("HeartHealthProfileIneligibleViewState(title=", textResource, ", body=", textResource2, ", iconUrl=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
