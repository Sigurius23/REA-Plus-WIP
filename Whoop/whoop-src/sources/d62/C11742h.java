package d62;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: d62.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001e\u0010'¨\u0006("}, m65681d2 = {"Ld62/h;", "Lm91/u;", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "description", "subtitle", "", "Lhy0/c2;", "items", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "c", "()Lgz0/m0;", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11742h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C17731c2> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    public C11742h(EnumC16313m0 icon, TextResource title, TextResource description, TextResource subtitle, List<C17731c2> items, C9598e destination) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(destination, "destination");
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.subtitle = subtitle;
        this.items = items;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e */
    public final List<C17731c2> m31434e() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11742h)) {
            return false;
        }
        C11742h c11742h = (C11742h) other;
        return this.icon == c11742h.icon && AbstractC22676k.m65745e(this.title, c11742h.title) && AbstractC22676k.m65745e(this.description, c11742h.description) && AbstractC22676k.m65745e(this.subtitle, c11742h.subtitle) && AbstractC22676k.m65745e(this.items, c11742h.items) && AbstractC22676k.m65745e(this.destination, c11742h.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.destination.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.icon.hashCode() * 31, this.title, 31), this.description, 31), this.subtitle, 31), 31, this.items);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.subtitle;
        List<C17731c2> list = this.items;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("RecoveryInsightsTileState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", description=");
        AbstractC30007c.m91855y(sb4, textResource2, ", subtitle=", textResource3, ", items=");
        sb4.append(list);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(")");
        return sb4.toString();
    }
}
