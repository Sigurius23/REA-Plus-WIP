package nl0;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nl0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lnl0/g;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "destination", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26805g {

    /* JADX INFO: renamed from: d */
    public static final int f106846d = C9598e.f28134d | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String destination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e navigationAction;

    public C26805g(TextResource title, String str, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.destination = str;
        this.navigationAction = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26805g)) {
            return false;
        }
        C26805g c26805g = (C26805g) other;
        return AbstractC22676k.m65745e(this.title, c26805g.title) && AbstractC22676k.m65745e(this.destination, c26805g.destination) && AbstractC22676k.m65745e(this.navigationAction, c26805g.navigationAction);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.destination;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.navigationAction;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.destination;
        return AbstractC33745d.m106656o(AbstractC30007c.m91845o("BetaTagViewState(title=", textResource, ", destination=", str, ", navigationAction="), this.navigationAction, ")");
    }

    public /* synthetic */ C26805g(TextResource textResource, String str, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, (i13 & 4) != 0 ? null : c9598e);
    }
}
