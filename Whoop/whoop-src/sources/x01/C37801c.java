package x01;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: x01.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Lx01/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lkd1/o;", "icon", "endText", "endSubText", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Lkd1/o;", "c", "()Lkd1/o;", "d", "e", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37801c implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f161910f = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource endText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource endSubText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e navigation;

    public C37801c(TextResource title, AbstractC22403o abstractC22403o, TextResource endText, TextResource endSubText, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(endText, "endText");
        AbstractC22676k.m65750j(endSubText, "endSubText");
        this.title = title;
        this.icon = abstractC22403o;
        this.endText = endText;
        this.endSubText = endSubText;
        this.navigation = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getEndSubText() {
        return this.endSubText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getEndText() {
        return this.endText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37801c)) {
            return false;
        }
        C37801c c37801c = (C37801c) other;
        return AbstractC22676k.m65745e(this.title, c37801c.title) && AbstractC22676k.m65745e(this.icon, c37801c.icon) && AbstractC22676k.m65745e(this.endText, c37801c.endText) && AbstractC22676k.m65745e(this.endSubText, c37801c.endSubText) && AbstractC22676k.m65745e(this.navigation, c37801c.navigation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AbstractC22403o abstractC22403o = this.icon;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.endText, 31), this.endSubText, 31);
        C9598e c9598e = this.navigation;
        return iM95625a + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        AbstractC22403o abstractC22403o = this.icon;
        TextResource textResource2 = this.endText;
        TextResource textResource3 = this.endSubText;
        C9598e c9598e = this.navigation;
        StringBuilder sb4 = new StringBuilder("CommunityTeamTileState(title=");
        sb4.append(textResource);
        sb4.append(", icon=");
        sb4.append(abstractC22403o);
        sb4.append(", endText=");
        AbstractC30007c.m91855y(sb4, textResource2, ", endSubText=", textResource3, ", navigation=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }
}
