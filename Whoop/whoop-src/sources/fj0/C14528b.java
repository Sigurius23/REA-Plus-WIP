package fj0;

import androidx.core.app.NotificationCompat;
import hc3.AbstractC17176i;
import java.util.List;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fj0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lfj0/b;", "", "", "isMfaEnabled", "", "preferredMfaSetting", "", "userMFASettingList", NotificationCompat.CATEGORY_EMAIL, "phoneNumber", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14528b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isMfaEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String preferredMfaSetting;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> userMFASettingList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String email;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String phoneNumber;

    public C14528b(boolean z4, String str, List<String> list, String str2, String str3) {
        this.isMfaEnabled = z4;
        this.preferredMfaSetting = str;
        this.userMFASettingList = list;
        this.email = str2;
        this.phoneNumber = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPreferredMfaSetting() {
        return this.preferredMfaSetting;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m41463d() {
        return this.userMFASettingList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14528b)) {
            return false;
        }
        C14528b c14528b = (C14528b) other;
        return this.isMfaEnabled == c14528b.isMfaEnabled && AbstractC22676k.m65745e(this.preferredMfaSetting, c14528b.preferredMfaSetting) && AbstractC22676k.m65745e(this.userMFASettingList, c14528b.userMFASettingList) && AbstractC22676k.m65745e(this.email, c14528b.email) && AbstractC22676k.m65745e(this.phoneNumber, c14528b.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isMfaEnabled) * 31;
        String str = this.preferredMfaSetting;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.userMFASettingList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isMfaEnabled;
        String str = this.preferredMfaSetting;
        List<String> list = this.userMFASettingList;
        String str2 = this.email;
        String str3 = this.phoneNumber;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("UserMfaStatus(isMfaEnabled=", ", preferredMfaSetting=", str, ", userMFASettingList=", z4);
        AbstractC17176i.m48511m(", email=", str2, ", phoneNumber=", sbM38567n, list);
        return AbstractC25012a.m73376i(str3, ")", sbM38567n);
    }
}
