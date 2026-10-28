package kc2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: kc2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lkc2/i;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "shareMessage", "Lkc2/a;", "hub", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkc2/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/lang/String;", "Lkc2/a;", "()Lkc2/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22359i {

    /* JADX INFO: renamed from: e */
    public static final int f87285e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String shareMessage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C22351a hub;

    public C22359i(TextResource title, TextResource subtitle, String shareMessage, C22351a c22351a) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        this.title = title;
        this.subtitle = subtitle;
        this.shareMessage = shareMessage;
        this.hub = c22351a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22351a getHub() {
        return this.hub;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getShareMessage() {
        return this.shareMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22359i)) {
            return false;
        }
        C22359i c22359i = (C22359i) other;
        return AbstractC22676k.m65745e(this.title, c22359i.title) && AbstractC22676k.m65745e(this.subtitle, c22359i.subtitle) && AbstractC22676k.m65745e(this.shareMessage, c22359i.shareMessage) && AbstractC22676k.m65745e(this.hub, c22359i.hub);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.shareMessage);
        C22351a c22351a = this.hub;
        return iM30450d + (c22351a == null ? 0 : c22351a.hashCode());
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str = this.shareMessage;
        C22351a c22351a = this.hub;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SettingsReferAFriendViewState(title=", textResource, ", subtitle=", textResource2, ", shareMessage=");
        sbM106658q.append(str);
        sbM106658q.append(", hub=");
        sbM106658q.append(c22351a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C22359i(TextResource textResource, TextResource textResource2, String str, C22351a c22351a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? null : c22351a);
    }
}
