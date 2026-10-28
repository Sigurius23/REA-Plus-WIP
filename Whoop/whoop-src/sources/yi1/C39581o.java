package yi1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: yi1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, m65681d2 = {"Lyi1/o;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "leftIcon", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "I", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39581o implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f170313f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int leftIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int rightIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f170313f = i13 | i14 | i14;
    }

    public C39581o(TextResource textResource, TextResource textResource2, int i13, int i14, C9598e c9598e) {
        this.title = textResource;
        this.subtitle = textResource2;
        this.leftIcon = i13;
        this.rightIcon = i14;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRightIcon() {
        return this.rightIcon;
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
        if (!(other instanceof C39581o)) {
            return false;
        }
        C39581o c39581o = (C39581o) other;
        return AbstractC22676k.m65745e(this.title, c39581o.title) && AbstractC22676k.m65745e(this.subtitle, c39581o.subtitle) && this.leftIcon == c39581o.leftIcon && this.rightIcon == c39581o.rightIcon && AbstractC22676k.m65745e(this.destination, c39581o.destination);
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.subtitle;
        int iM30448b = AbstractC11266d.m30448b(this.rightIcon, AbstractC11266d.m30448b(this.leftIcon, (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31), 31);
        C9598e c9598e = this.destination;
        return iM30448b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        int i13 = this.leftIcon;
        int i14 = this.rightIcon;
        C9598e c9598e = this.destination;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ShepherdMenuItemState(title=", textResource, ", subtitle=", textResource2, ", leftIcon=");
        AbstractC30802r.m94773v(sbM106658q, i13, ", rightIcon=", i14, ", destination=");
        return AbstractC33745d.m106656o(sbM106658q, c9598e, ")");
    }
}
