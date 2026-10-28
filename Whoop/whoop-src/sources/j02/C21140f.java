package j02;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j02.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lj02/f;", "", "", "selectedTabId", "", "isTabRoot", "overlayVisible", "<init>", "(Ljava/lang/String;ZZ)V", "a", "(Ljava/lang/String;ZZ)Lj02/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Z", "e", "()Z", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21140f {

    /* JADX INFO: renamed from: d */
    public static final int f80217d = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String selectedTabId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isTabRoot;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean overlayVisible;

    public C21140f(String str, boolean z4, boolean z13) {
        this.selectedTabId = str;
        this.isTabRoot = z4;
        this.overlayVisible = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21140f m58981b(C21140f c21140f, String str, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c21140f.selectedTabId;
        }
        if ((i13 & 2) != 0) {
            z4 = c21140f.isTabRoot;
        }
        if ((i13 & 4) != 0) {
            z13 = c21140f.overlayVisible;
        }
        return c21140f.m58982a(str, z4, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C21140f m58982a(String selectedTabId, boolean isTabRoot, boolean overlayVisible) {
        return new C21140f(selectedTabId, isTabRoot, overlayVisible);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getOverlayVisible() {
        return this.overlayVisible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSelectedTabId() {
        return this.selectedTabId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsTabRoot() {
        return this.isTabRoot;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21140f)) {
            return false;
        }
        C21140f c21140f = (C21140f) other;
        return AbstractC22676k.m65745e(this.selectedTabId, c21140f.selectedTabId) && this.isTabRoot == c21140f.isTabRoot && this.overlayVisible == c21140f.overlayVisible;
    }

    public int hashCode() {
        String str = this.selectedTabId;
        return Boolean.hashCode(this.overlayVisible) + AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.isTabRoot);
    }

    public String toString() {
        String str = this.selectedTabId;
        boolean z4 = this.isTabRoot;
        return AbstractC18489d0.m53372m(AbstractC25012a.m73379l("BottomNavNavInput(selectedTabId=", str, ", isTabRoot=", ", overlayVisible=", z4), this.overlayVisible, ")");
    }

    public /* synthetic */ C21140f(String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13);
    }
}
