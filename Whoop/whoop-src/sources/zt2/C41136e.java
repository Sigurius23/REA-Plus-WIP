package zt2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y71.C39274g;

/* JADX INFO: renamed from: zt2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006$"}, m65681d2 = {"Lzt2/e;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Ly71/g;", "icon", "Ly3/f;", "iconSize", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Ly71/g;FLcom/whoop/navigation/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Ly71/g;", "()Ly71/g;", "c", "F", "()F", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41136e implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f177347e = (C9598e.f28134d | C39274g.f168929c) | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float iconSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    public /* synthetic */ C41136e(TextResource textResource, C39274g c39274g, float f13, C9598e c9598e, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, c39274g, f13, c9598e);
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
    public final float getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41136e)) {
            return false;
        }
        C41136e c41136e = (C41136e) other;
        return AbstractC22676k.m65745e(this.title, c41136e.title) && AbstractC22676k.m65745e(this.icon, c41136e.icon) && C39174f.m124782b(this.iconSize, c41136e.iconSize) && AbstractC22676k.m65745e(this.destination, c41136e.destination);
    }

    public int hashCode() {
        return this.destination.hashCode() + AbstractC11266d.m30447a(this.iconSize, (this.icon.hashCode() + (this.title.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        C39274g c39274g = this.icon;
        String strM124783c = C39174f.m124783c(this.iconSize);
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("BannerCalloutTileState(title=");
        sb4.append(textResource);
        sb4.append(", icon=");
        sb4.append(c39274g);
        sb4.append(", iconSize=");
        return AbstractC13673n.m38563j(sb4, strM124783c, ", destination=", c9598e, ")");
    }

    private C41136e(TextResource title, C39274g icon, float f13, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(destination, "destination");
        this.title = title;
        this.icon = icon;
        this.iconSize = f13;
        this.destination = destination;
    }

    public C41136e(TextResource textResource, C39274g c39274g, float f13, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, c39274g, (i13 & 4) != 0 ? 6 * 4 : f13, c9598e, null);
    }
}
