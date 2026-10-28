package ic2;

import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ic2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, m65681d2 = {"Lic2/g;", "", "", "isLoading", "", "Lic2/a;", "settings", "Lic2/h;", "shepherdSetting", "isShepherdDetectionOn", "<init>", "(ZLjava/util/List;Lic2/h;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lic2/h;", "()Lic2/h;", "d", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18402g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C18396a> settings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18403h shepherdSetting;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isShepherdDetectionOn;

    public C18402g(boolean z4, List<C18396a> settings, C18403h c18403h, boolean z13) {
        AbstractC22676k.m65750j(settings, "settings");
        this.isLoading = z4;
        this.settings = settings;
        this.shepherdSetting = c18403h;
        this.isShepherdDetectionOn = z13;
    }

    /* JADX INFO: renamed from: a */
    public final List<C18396a> m52944a() {
        return this.settings;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18403h getShepherdSetting() {
        return this.shepherdSetting;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsShepherdDetectionOn() {
        return this.isShepherdDetectionOn;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18402g)) {
            return false;
        }
        C18402g c18402g = (C18402g) other;
        return this.isLoading == c18402g.isLoading && AbstractC22676k.m65745e(this.settings, c18402g.settings) && AbstractC22676k.m65745e(this.shepherdSetting, c18402g.shepherdSetting) && this.isShepherdDetectionOn == c18402g.isShepherdDetectionOn;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(Boolean.hashCode(this.isLoading) * 31, 31, this.settings);
        C18403h c18403h = this.shepherdSetting;
        return Boolean.hashCode(this.isShepherdDetectionOn) + ((iM31983b + (c18403h == null ? 0 : c18403h.hashCode())) * 31);
    }

    public String toString() {
        return "SettingsNotificationViewState(isLoading=" + this.isLoading + ", settings=" + this.settings + ", shepherdSetting=" + this.shepherdSetting + ", isShepherdDetectionOn=" + this.isShepherdDetectionOn + ")";
    }

    public /* synthetic */ C18402g(boolean z4, List list, C18403h c18403h, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : c18403h, (i13 & 8) != 0 ? false : z13);
    }
}
