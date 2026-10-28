package mc2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: mc2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0017\u0010$¨\u0006%"}, m65681d2 = {"Lmc2/h;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lmc2/d;", "style", "", "iconKey", "shareMessage", "Lcom/whoop/navigation/e;", "action", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lmc2/d;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Lmc2/d;", "()Lmc2/d;", "Ljava/lang/String;", "getShareMessage", "f", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25429h {

    /* JADX INFO: renamed from: g */
    public static final int f99602g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC25425d style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String iconKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String shareMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e action;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f99602g = i13 | i14 | i14;
    }

    public C25429h(TextResource title, TextResource subtitle, EnumC25425d style, String str, String shareMessage, C9598e action) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(action, "action");
        this.title = title;
        this.subtitle = subtitle;
        this.style = style;
        this.iconKey = str;
        this.shareMessage = shareMessage;
        this.action = action;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIconKey() {
        return this.iconKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC25425d getStyle() {
        return this.style;
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
        if (!(other instanceof C25429h)) {
            return false;
        }
        C25429h c25429h = (C25429h) other;
        return AbstractC22676k.m65745e(this.title, c25429h.title) && AbstractC22676k.m65745e(this.subtitle, c25429h.subtitle) && this.style == c25429h.style && AbstractC22676k.m65745e(this.iconKey, c25429h.iconKey) && AbstractC22676k.m65745e(this.shareMessage, c25429h.shareMessage) && AbstractC22676k.m65745e(this.action, c25429h.action);
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31)) * 31;
        String str = this.iconKey;
        return this.action.hashCode() + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.shareMessage);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        EnumC25425d enumC25425d = this.style;
        String str = this.iconKey;
        String str2 = this.shareMessage;
        C9598e c9598e = this.action;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ReferAFiendMenuItem(title=", textResource, ", subtitle=", textResource2, ", style=");
        sbM106658q.append(enumC25425d);
        sbM106658q.append(", iconKey=");
        sbM106658q.append(str);
        sbM106658q.append(", shareMessage=");
        return AbstractC13673n.m38563j(sbM106658q, str2, ", action=", c9598e, ")");
    }
}
