package o92;

import jk0.EnumC21747a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o92.k0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lo92/k0;", "", "", "title", "experimentVariant", "Ljk0/a;", "strapBodyStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljk0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljk0/a;", "()Ljk0/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27712k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String experimentVariant;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC21747a strapBodyStatus;

    public C27712k0(String title, String str, EnumC21747a enumC21747a) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.experimentVariant = str;
        this.strapBodyStatus = enumC21747a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExperimentVariant() {
        return this.experimentVariant;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC21747a getStrapBodyStatus() {
        return this.strapBodyStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27712k0)) {
            return false;
        }
        C27712k0 c27712k0 = (C27712k0) other;
        return AbstractC22676k.m65745e(this.title, c27712k0.title) && AbstractC22676k.m65745e(this.experimentVariant, c27712k0.experimentVariant) && this.strapBodyStatus == c27712k0.strapBodyStatus;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.experimentVariant;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC21747a enumC21747a = this.strapBodyStatus;
        return iHashCode2 + (enumC21747a != null ? enumC21747a.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.experimentVariant;
        EnumC21747a enumC21747a = this.strapBodyStatus;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StressMonitorPushNotificationTitleResult(title=", str, ", experimentVariant=", str2, ", strapBodyStatus=");
        sbM32001t.append(enumC21747a);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
