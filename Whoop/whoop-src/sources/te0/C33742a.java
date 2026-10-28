package te0;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: te0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lte0/a;", "", "", "navigationTitle", "Lgz0/m0;", "navigationRightIcon", "Lcom/whoop/navigation/e;", "navigationRightDestination", "<init>", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lgz0/m0;", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33742a {

    /* JADX INFO: renamed from: d */
    public static final int f141132d = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 navigationRightIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e navigationRightDestination;

    public C33742a(String navigationTitle, EnumC16313m0 enumC16313m0, C9598e c9598e) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        this.navigationTitle = navigationTitle;
        this.navigationRightIcon = enumC16313m0;
        this.navigationRightDestination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getNavigationRightDestination() {
        return this.navigationRightDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getNavigationRightIcon() {
        return this.navigationRightIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33742a)) {
            return false;
        }
        C33742a c33742a = (C33742a) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c33742a.navigationTitle) && this.navigationRightIcon == c33742a.navigationRightIcon && AbstractC22676k.m65745e(this.navigationRightDestination, c33742a.navigationRightDestination);
    }

    public int hashCode() {
        int iHashCode = this.navigationTitle.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.navigationRightIcon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.navigationRightDestination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationTitle;
        EnumC16313m0 enumC16313m0 = this.navigationRightIcon;
        return AbstractC33745d.m106656o(AbstractC21702c.m61141l("NavigationBarViewState(navigationTitle=", str, ", navigationRightIcon=", enumC16313m0, ", navigationRightDestination="), this.navigationRightDestination, ")");
    }
}
