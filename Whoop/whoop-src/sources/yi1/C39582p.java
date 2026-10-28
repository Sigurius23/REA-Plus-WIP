package yi1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: yi1.p */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lyi1/p;", "Lm91/u;", "Lyi1/o;", "menuItemState", "Lyi1/n;", "iconState", "<init>", "(Lyi1/o;Lyi1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyi1/o;", "b", "()Lyi1/o;", "Lyi1/n;", "()Lyi1/n;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39582p implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f170319c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39581o menuItemState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39580n iconState;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f170319c = i13 | i14 | i14;
    }

    public C39582p(C39581o menuItemState, EnumC39580n enumC39580n) {
        AbstractC22676k.m65750j(menuItemState, "menuItemState");
        this.menuItemState = menuItemState;
        this.iconState = enumC39580n;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39580n getIconState() {
        return this.iconState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39581o getMenuItemState() {
        return this.menuItemState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39582p)) {
            return false;
        }
        C39582p c39582p = (C39582p) other;
        return AbstractC22676k.m65745e(this.menuItemState, c39582p.menuItemState) && this.iconState == c39582p.iconState;
    }

    public int hashCode() {
        int iHashCode = this.menuItemState.hashCode() * 31;
        EnumC39580n enumC39580n = this.iconState;
        return iHashCode + (enumC39580n == null ? 0 : enumC39580n.hashCode());
    }

    public String toString() {
        return "ShepherdTileViewState(menuItemState=" + this.menuItemState + ", iconState=" + this.iconState + ")";
    }
}
