package qb2;

import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import y71.C39274g;

/* JADX INFO: renamed from: qb2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lqb2/a;", "", "Ly71/g;", "icon", "", "title", "subtitle", "trackingId", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ly71/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly71/g;", "b", "()Ly71/g;", "Ljava/lang/String;", "d", "c", "e", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30182a {

    /* JADX INFO: renamed from: f */
    public static final int f123562f = C9598e.f28134d | C39274g.f168929c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String trackingId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    public C30182a(C39274g icon, String title, String subtitle, String trackingId, C9598e destination) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(trackingId, "trackingId");
        AbstractC22676k.m65750j(destination, "destination");
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.trackingId = trackingId;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTrackingId() {
        return this.trackingId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30182a)) {
            return false;
        }
        C30182a c30182a = (C30182a) other;
        return AbstractC22676k.m65745e(this.icon, c30182a.icon) && AbstractC22676k.m65745e(this.title, c30182a.title) && AbstractC22676k.m65745e(this.subtitle, c30182a.subtitle) && AbstractC22676k.m65745e(this.trackingId, c30182a.trackingId) && AbstractC22676k.m65745e(this.destination, c30182a.destination);
    }

    public int hashCode() {
        return this.destination.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.trackingId);
    }

    public String toString() {
        C39274g c39274g = this.icon;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.trackingId;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("GiftHubItemViewState(icon=");
        sb4.append(c39274g);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", subtitle=");
        AbstractC11266d.m30444B(sb4, str2, ", trackingId=", str3, ", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }
}
