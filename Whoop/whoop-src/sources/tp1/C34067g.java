package tp1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: tp1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Ltp1/g;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "leftIcon", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "Ltp1/h;", "type", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;Ltp1/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ltp1/h;", "f", "()Ltp1/h;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34067g implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f142769f = C9598e.f28134d | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 leftIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC34068h type;

    public C34067g(TextResource title, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, C9598e c9598e, EnumC34068h enumC34068h) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.leftIcon = enumC16313m0;
        this.rightIcon = enumC16313m1;
        this.destination = c9598e;
        this.type = enumC34068h;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34067g)) {
            return false;
        }
        C34067g c34067g = (C34067g) other;
        return AbstractC22676k.m65745e(this.title, c34067g.title) && this.leftIcon == c34067g.leftIcon && this.rightIcon == c34067g.rightIcon && AbstractC22676k.m65745e(this.destination, c34067g.destination) && this.type == c34067g.type;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC34068h getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        EnumC34068h enumC34068h = this.type;
        return iHashCode4 + (enumC34068h != null ? enumC34068h.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        C9598e c9598e = this.destination;
        EnumC34068h enumC34068h = this.type;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("HormonalInsightsMenuItemState(title=", textResource, ", leftIcon=", enumC16313m0, ", rightIcon=");
        sbM61140k.append(enumC16313m1);
        sbM61140k.append(", destination=");
        sbM61140k.append(c9598e);
        sbM61140k.append(", type=");
        sbM61140k.append(enumC34068h);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }

    public /* synthetic */ C34067g(TextResource textResource, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, C9598e c9598e, EnumC34068h enumC34068h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, enumC16313m0, enumC16313m1, (i13 & 8) != 0 ? null : c9598e, (i13 & 16) != 0 ? null : enumC34068h);
    }
}
