package ji2;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ji2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b\u001a\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b&\u0010,¨\u0006-"}, m65681d2 = {"Lji2/l;", "", "", "isLoading", "isError", "Lji2/g;", "settingsUnconnected", "Lji2/f;", "settingsConnected", "Lji2/e;", "selectableActivity", "Lji2/b;", "disconnectConfirmationModal", "Lji2/h;", "success", "<init>", "(ZZLji2/g;Lji2/f;Lji2/e;Lji2/b;Lji2/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "g", "()Z", "b", "f", "c", "Lji2/g;", "d", "()Lji2/g;", "Lji2/f;", "()Lji2/f;", "e", "Lji2/e;", "()Lji2/e;", "Lji2/b;", "()Lji2/b;", "Lji2/h;", "()Lji2/h;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21733l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21728g settingsUnconnected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21727f settingsConnected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C21726e selectableActivity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C21723b disconnectConfirmationModal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C21729h success;

    public C21733l(boolean z4, boolean z13, C21728g c21728g, C21727f c21727f, C21726e c21726e, C21723b c21723b, C21729h c21729h) {
        this.isLoading = z4;
        this.isError = z13;
        this.settingsUnconnected = c21728g;
        this.settingsConnected = c21727f;
        this.selectableActivity = c21726e;
        this.disconnectConfirmationModal = c21723b;
        this.success = c21729h;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C21723b getDisconnectConfirmationModal() {
        return this.disconnectConfirmationModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C21726e getSelectableActivity() {
        return this.selectableActivity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C21727f getSettingsConnected() {
        return this.settingsConnected;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C21728g getSettingsUnconnected() {
        return this.settingsUnconnected;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C21729h getSuccess() {
        return this.success;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21733l)) {
            return false;
        }
        C21733l c21733l = (C21733l) other;
        return this.isLoading == c21733l.isLoading && this.isError == c21733l.isError && AbstractC22676k.m65745e(this.settingsUnconnected, c21733l.settingsUnconnected) && AbstractC22676k.m65745e(this.settingsConnected, c21733l.settingsConnected) && AbstractC22676k.m65745e(this.selectableActivity, c21733l.selectableActivity) && AbstractC22676k.m65745e(this.disconnectConfirmationModal, c21733l.disconnectConfirmationModal) && AbstractC22676k.m65745e(this.success, c21733l.success);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        C21728g c21728g = this.settingsUnconnected;
        int iHashCode = (iM8289b + (c21728g == null ? 0 : c21728g.hashCode())) * 31;
        C21727f c21727f = this.settingsConnected;
        int iHashCode2 = (iHashCode + (c21727f == null ? 0 : c21727f.hashCode())) * 31;
        C21726e c21726e = this.selectableActivity;
        int iHashCode3 = (iHashCode2 + (c21726e == null ? 0 : c21726e.hashCode())) * 31;
        C21723b c21723b = this.disconnectConfirmationModal;
        int iHashCode4 = (iHashCode3 + (c21723b == null ? 0 : c21723b.hashCode())) * 31;
        C21729h c21729h = this.success;
        return iHashCode4 + (c21729h != null ? c21729h.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        C21728g c21728g = this.settingsUnconnected;
        C21727f c21727f = this.settingsConnected;
        C21726e c21726e = this.selectableActivity;
        C21723b c21723b = this.disconnectConfirmationModal;
        C21729h c21729h = this.success;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("StravaViewState(isLoading=", ", isError=", ", settingsUnconnected=", z4, z13);
        sbM32002u.append(c21728g);
        sbM32002u.append(", settingsConnected=");
        sbM32002u.append(c21727f);
        sbM32002u.append(", selectableActivity=");
        sbM32002u.append(c21726e);
        sbM32002u.append(", disconnectConfirmationModal=");
        sbM32002u.append(c21723b);
        sbM32002u.append(", success=");
        sbM32002u.append(c21729h);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C21733l(boolean z4, boolean z13, C21728g c21728g, C21727f c21727f, C21726e c21726e, C21723b c21723b, C21729h c21729h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c21728g, (i13 & 8) != 0 ? null : c21727f, (i13 & 16) != 0 ? null : c21726e, (i13 & 32) != 0 ? null : c21723b, (i13 & 64) != 0 ? null : c21729h);
    }
}
