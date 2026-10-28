package v11;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: v11.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jj\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b$\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b*\u0010/¨\u00060"}, m65681d2 = {"Lv11/j;", "Lm91/u;", "Lm91/n;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "subtext", "Lkd1/o;", "image", "Lv11/b;", "startButton", "endButton", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lv11/b;Lv11/b;Lcom/whoop/navigation/e;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lv11/b;Lv11/b;Lcom/whoop/navigation/e;)Lv11/j;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "c", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Lkd1/o;", "()Lkd1/o;", "f", "Lv11/b;", "g", "()Lv11/b;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35552j implements InterfaceC25312u, InterfaceC25305n<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C35544b startButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C35544b endButton;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C9598e navigation;

    public C35552j(String id4, TextResource title, TextResource subtitle, TextResource textResource, AbstractC22403o abstractC22403o, C35544b c35544b, C35544b c35544b2, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = id4;
        this.title = title;
        this.subtitle = subtitle;
        this.subtext = textResource;
        this.image = abstractC22403o;
        this.startButton = c35544b;
        this.endButton = c35544b2;
        this.navigation = c9598e;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35552j m112746b(C35552j c35552j, String str, TextResource textResource, TextResource textResource2, TextResource textResource3, AbstractC22403o abstractC22403o, C35544b c35544b, C35544b c35544b2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c35552j.id;
        }
        if ((i13 & 2) != 0) {
            textResource = c35552j.title;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c35552j.subtitle;
        }
        if ((i13 & 8) != 0) {
            textResource3 = c35552j.subtext;
        }
        if ((i13 & 16) != 0) {
            abstractC22403o = c35552j.image;
        }
        if ((i13 & 32) != 0) {
            c35544b = c35552j.startButton;
        }
        if ((i13 & 64) != 0) {
            c35544b2 = c35552j.endButton;
        }
        if ((i13 & 128) != 0) {
            c9598e = c35552j.navigation;
        }
        C35544b c35544b3 = c35544b2;
        C9598e c9598e2 = c9598e;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        C35544b c35544b4 = c35544b;
        return c35552j.m112747a(str, textResource, textResource2, textResource3, abstractC22403o2, c35544b4, c35544b3, c9598e2);
    }

    /* JADX INFO: renamed from: a */
    public final C35552j m112747a(String id4, TextResource title, TextResource subtitle, TextResource subtext, AbstractC22403o image, C35544b startButton, C35544b endButton, C9598e navigation) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new C35552j(id4, title, subtitle, subtext, image, startButton, endButton, navigation);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C35544b getEndButton() {
        return this.endButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35552j)) {
            return false;
        }
        C35552j c35552j = (C35552j) other;
        return AbstractC22676k.m65745e(this.id, c35552j.id) && AbstractC22676k.m65745e(this.title, c35552j.title) && AbstractC22676k.m65745e(this.subtitle, c35552j.subtitle) && AbstractC22676k.m65745e(this.subtext, c35552j.subtext) && AbstractC22676k.m65745e(this.image, c35552j.image) && AbstractC22676k.m65745e(this.startButton, c35552j.startButton) && AbstractC22676k.m65745e(this.endButton, c35552j.endButton) && AbstractC22676k.m65745e(this.navigation, c35552j.navigation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C35544b getStartButton() {
        return this.startButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getSubtext() {
        return this.subtext;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), this.subtitle, 31);
        TextResource textResource = this.subtext;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C35544b c35544b = this.startButton;
        int iHashCode3 = (iHashCode2 + (c35544b == null ? 0 : c35544b.hashCode())) * 31;
        C35544b c35544b2 = this.endButton;
        int iHashCode4 = (iHashCode3 + (c35544b2 == null ? 0 : c35544b2.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        return iHashCode4 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.subtext;
        AbstractC22403o abstractC22403o = this.image;
        C35544b c35544b = this.startButton;
        C35544b c35544b2 = this.endButton;
        C9598e c9598e = this.navigation;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("FollowerRequestCardState(id=", str, ", title=", textResource, ", subtitle=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", subtext=", textResource3, ", image=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", startButton=");
        sbM91847q.append(c35544b);
        sbM91847q.append(", endButton=");
        sbM91847q.append(c35544b2);
        sbM91847q.append(", navigation=");
        sbM91847q.append(c9598e);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }
}
