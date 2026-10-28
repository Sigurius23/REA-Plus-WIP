package yk2;

import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: yk2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lyk2/e;", "Lm91/u;", "", "id", "selectedActivityInternalName", "", "gpsTrackingEnabled", "Lcom/whoop/navigation/e;", "restoreSessionDestination", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "Z", "()Z", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39605e implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f170359e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedActivityInternalName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean gpsTrackingEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e restoreSessionDestination;

    public C39605e(String id4, String selectedActivityInternalName, boolean z4, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        this.id = id4;
        this.selectedActivityInternalName = selectedActivityInternalName;
        this.gpsTrackingEnabled = z4;
        this.restoreSessionDestination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getRestoreSessionDestination() {
        return this.restoreSessionDestination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSelectedActivityInternalName() {
        return this.selectedActivityInternalName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39605e)) {
            return false;
        }
        C39605e c39605e = (C39605e) other;
        return AbstractC22676k.m65745e(this.id, c39605e.id) && AbstractC22676k.m65745e(this.selectedActivityInternalName, c39605e.selectedActivityInternalName) && this.gpsTrackingEnabled == c39605e.gpsTrackingEnabled && AbstractC22676k.m65745e(this.restoreSessionDestination, c39605e.restoreSessionDestination);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.selectedActivityInternalName), 31, this.gpsTrackingEnabled);
        C9598e c9598e = this.restoreSessionDestination;
        return iM8289b + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.selectedActivityInternalName;
        boolean z4 = this.gpsTrackingEnabled;
        C9598e c9598e = this.restoreSessionDestination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackSessionMiniArchItemViewState(id=", str, ", selectedActivityInternalName=", str2, ", gpsTrackingEnabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", restoreSessionDestination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
