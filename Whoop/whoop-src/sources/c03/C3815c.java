package c03;

import c41.C4069m0;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c03.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lc03/c;", "", "", "shouldDisplay", "Lc41/m0;", "alertTileViewState", "", "statusUrl", "<init>", "(ZLc41/m0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lc41/m0;", "()Lc41/m0;", "c", "Ljava/lang/String;", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3815c {

    /* JADX INFO: renamed from: d */
    public static final int f15649d = C4069m0.f16535h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shouldDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4069m0 alertTileViewState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String statusUrl;

    public C3815c(boolean z4, C4069m0 c4069m0, String statusUrl) {
        AbstractC22676k.m65750j(statusUrl, "statusUrl");
        this.shouldDisplay = z4;
        this.alertTileViewState = c4069m0;
        this.statusUrl = statusUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4069m0 getAlertTileViewState() {
        return this.alertTileViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldDisplay() {
        return this.shouldDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatusUrl() {
        return this.statusUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3815c)) {
            return false;
        }
        C3815c c3815c = (C3815c) other;
        return this.shouldDisplay == c3815c.shouldDisplay && AbstractC22676k.m65745e(this.alertTileViewState, c3815c.alertTileViewState) && AbstractC22676k.m65745e(this.statusUrl, c3815c.statusUrl);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.shouldDisplay) * 31;
        C4069m0 c4069m0 = this.alertTileViewState;
        return this.statusUrl.hashCode() + ((iHashCode + (c4069m0 == null ? 0 : c4069m0.hashCode())) * 31);
    }

    public String toString() {
        boolean z4 = this.shouldDisplay;
        C4069m0 c4069m0 = this.alertTileViewState;
        String str = this.statusUrl;
        StringBuilder sb4 = new StringBuilder("WhoopStatusViewState(shouldDisplay=");
        sb4.append(z4);
        sb4.append(", alertTileViewState=");
        sb4.append(c4069m0);
        sb4.append(", statusUrl=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C3815c(boolean z4, C4069m0 c4069m0, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : c4069m0, (i13 & 4) != 0 ? "https://status.whoop.com" : str);
    }
}
