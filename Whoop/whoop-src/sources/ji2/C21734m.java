package ji2;

import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ji2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006!"}, m65681d2 = {"Lji2/m;", "", "", "shareToStrava", "shareAllActivities", "", "templateName", "", "Lji2/c;", "sharedActivityNames", "navBack", "importActivities", "<init>", "(ZZLjava/lang/String;Ljava/util/List;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "c", "Ljava/lang/String;", "f", "Ljava/util/List;", "e", "()Ljava/util/List;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21734m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shareToStrava;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean shareAllActivities;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String templateName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C21724c> sharedActivityNames;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean navBack;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean importActivities;

    public C21734m(boolean z4, boolean z13, String templateName, List<C21724c> sharedActivityNames, boolean z14, boolean z15) {
        AbstractC22676k.m65750j(templateName, "templateName");
        AbstractC22676k.m65750j(sharedActivityNames, "sharedActivityNames");
        this.shareToStrava = z4;
        this.shareAllActivities = z13;
        this.templateName = templateName;
        this.sharedActivityNames = sharedActivityNames;
        this.navBack = z14;
        this.importActivities = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getImportActivities() {
        return this.importActivities;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNavBack() {
        return this.navBack;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShareAllActivities() {
        return this.shareAllActivities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShareToStrava() {
        return this.shareToStrava;
    }

    /* JADX INFO: renamed from: e */
    public final List<C21724c> m61305e() {
        return this.sharedActivityNames;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21734m)) {
            return false;
        }
        C21734m c21734m = (C21734m) other;
        return this.shareToStrava == c21734m.shareToStrava && this.shareAllActivities == c21734m.shareAllActivities && AbstractC22676k.m65745e(this.templateName, c21734m.templateName) && AbstractC22676k.m65745e(this.sharedActivityNames, c21734m.sharedActivityNames) && this.navBack == c21734m.navBack && this.importActivities == c21734m.importActivities;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.importActivities) + AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.shareToStrava) * 31, 31, this.shareAllActivities), 31, this.templateName), 31, this.sharedActivityNames), 31, this.navBack);
    }

    public String toString() {
        boolean z4 = this.shareToStrava;
        boolean z13 = this.shareAllActivities;
        String str = this.templateName;
        List<C21724c> list = this.sharedActivityNames;
        boolean z14 = this.navBack;
        boolean z15 = this.importActivities;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("UpdateSettingsData(shareToStrava=", ", shareAllActivities=", ", templateName=", z4, z13);
        AbstractC36095b.m114694v(str, ", sharedActivityNames=", ", navBack=", sbM32002u, list);
        return AbstractC36095b.m114682j(sbM32002u, z14, ", importActivities=", z15, ")");
    }

    public /* synthetic */ C21734m(boolean z4, boolean z13, String str, List list, boolean z14, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, z13, str, list, (i13 & 16) != 0 ? false : z14, z15);
    }
}
