package g90;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: g90.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, m65681d2 = {"Lg90/g;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "learnMore", "navigationBarText", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "d", "Ljava/lang/String;", "e", "getNavigationBarText", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15601g implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f58563f = TextResource.$stable | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String learnMore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource navigationBarText;

    public C15601g(AbstractC22403o abstractC22403o, TextResource title, TextResource subtitle, String str, TextResource navigationBarText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        this.image = abstractC22403o;
        this.title = title;
        this.subtitle = subtitle;
        this.learnMore = str;
        this.navigationBarText = navigationBarText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLearnMore() {
        return this.learnMore;
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
        if (!(other instanceof C15601g)) {
            return false;
        }
        C15601g c15601g = (C15601g) other;
        return AbstractC22676k.m65745e(this.image, c15601g.image) && AbstractC22676k.m65745e(this.title, c15601g.title) && AbstractC22676k.m65745e(this.subtitle, c15601g.subtitle) && AbstractC22676k.m65745e(this.learnMore, c15601g.learnMore) && AbstractC22676k.m65745e(this.navigationBarText, c15601g.navigationBarText);
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.image;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31, this.title, 31), this.subtitle, 31);
        String str = this.learnMore;
        return this.navigationBarText.hashCode() + ((iM95625a + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str = this.learnMore;
        TextResource textResource3 = this.navigationBarText;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("GoogleHealthConnectState(image=", textResource, abstractC22403o, ", title=", ", subtitle=");
        AbstractC30007c.m91856z(sbM114683k, textResource2, ", learnMore=", str, ", navigationBarText=");
        return AbstractC30007c.m91841k(sbM114683k, textResource3, ")");
    }
}
