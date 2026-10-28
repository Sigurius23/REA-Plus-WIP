package p706eo0;

import androidx.core.app.NotificationCompat;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: eo0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\n¨\u0006\u0017"}, m65681d2 = {"Leo0/h;", "", "", "resetToken", "", "isExpired", NotificationCompat.CATEGORY_EMAIL, "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13377h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String resetToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isExpired;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String email;

    public C13377h(String str, boolean z4, String str2) {
        this.resetToken = str;
        this.isExpired = z4;
        this.email = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getResetToken() {
        return this.resetToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13377h)) {
            return false;
        }
        C13377h c13377h = (C13377h) other;
        return AbstractC22676k.m65745e(this.resetToken, c13377h.resetToken) && this.isExpired == c13377h.isExpired && AbstractC22676k.m65745e(this.email, c13377h.email);
    }

    public int hashCode() {
        String str = this.resetToken;
        int iM8289b = AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.isExpired);
        String str2 = this.email;
        return iM8289b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.email, ")", AbstractC25012a.m73379l("ResetPasswordScreenArgs(resetToken=", this.resetToken, ", isExpired=", ", email=", this.isExpired));
    }

    public /* synthetic */ C13377h(String str, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str2);
    }
}
