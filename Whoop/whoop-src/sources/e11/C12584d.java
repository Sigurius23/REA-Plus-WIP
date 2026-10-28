package e11;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: e11.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, m65681d2 = {"Le11/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "leadingIcon", "Lgz0/m0;", "trailingIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILgz0/m0;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "I", "Lgz0/m0;", "e", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12584d implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f42958f = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int leadingIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 trailingIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    public C12584d(TextResource textResource, TextResource textResource2, int i13, EnumC16313m0 enumC16313m0, C9598e c9598e) {
        this.title = textResource;
        this.subtitle = textResource2;
        this.leadingIcon = i13;
        this.trailingIcon = enumC16313m0;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getTrailingIcon() {
        return this.trailingIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12584d)) {
            return false;
        }
        C12584d c12584d = (C12584d) other;
        return AbstractC22676k.m65745e(this.title, c12584d.title) && AbstractC22676k.m65745e(this.subtitle, c12584d.subtitle) && this.leadingIcon == c12584d.leadingIcon && this.trailingIcon == c12584d.trailingIcon && AbstractC22676k.m65745e(this.destination, c12584d.destination);
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.subtitle;
        int iM30448b = AbstractC11266d.m30448b(this.leadingIcon, (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31);
        EnumC16313m0 enumC16313m0 = this.trailingIcon;
        int iHashCode2 = (iM30448b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        int i13 = this.leadingIcon;
        EnumC16313m0 enumC16313m0 = this.trailingIcon;
        C9598e c9598e = this.destination;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CurrentPlanTileState(title=", textResource, ", subtitle=", textResource2, ", leadingIcon=");
        sbM106658q.append(i13);
        sbM106658q.append(", trailingIcon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", destination=");
        return AbstractC33745d.m106656o(sbM106658q, c9598e, ")");
    }

    public /* synthetic */ C12584d(TextResource textResource, TextResource textResource2, int i13, EnumC16313m0 enumC16313m0, C9598e c9598e, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, i13, (i14 & 8) != 0 ? null : enumC16313m0, (i14 & 16) != 0 ? null : c9598e);
    }
}
