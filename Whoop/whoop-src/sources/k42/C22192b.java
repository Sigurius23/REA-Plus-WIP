package k42;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k42.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lk42/b;", "", "", "accountName", "dataSharingStatus", "buttonText", "iconName", "Lk42/a;", "accountDataSharing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk42/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "e", "Lk42/a;", "()Lk42/a;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22192b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String accountName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String dataSharingStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String buttonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String iconName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22191a accountDataSharing;

    public C22192b(String accountName, String dataSharingStatus, String buttonText, String iconName, C22191a accountDataSharing) {
        AbstractC22676k.m65750j(accountName, "accountName");
        AbstractC22676k.m65750j(dataSharingStatus, "dataSharingStatus");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(iconName, "iconName");
        AbstractC22676k.m65750j(accountDataSharing, "accountDataSharing");
        this.accountName = accountName;
        this.dataSharingStatus = dataSharingStatus;
        this.buttonText = buttonText;
        this.iconName = iconName;
        this.accountDataSharing = accountDataSharing;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22191a getAccountDataSharing() {
        return this.accountDataSharing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDataSharingStatus() {
        return this.dataSharingStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22192b)) {
            return false;
        }
        C22192b c22192b = (C22192b) other;
        return AbstractC22676k.m65745e(this.accountName, c22192b.accountName) && AbstractC22676k.m65745e(this.dataSharingStatus, c22192b.dataSharingStatus) && AbstractC22676k.m65745e(this.buttonText, c22192b.buttonText) && AbstractC22676k.m65745e(this.iconName, c22192b.iconName) && AbstractC22676k.m65745e(this.accountDataSharing, c22192b.accountDataSharing);
    }

    public int hashCode() {
        return this.accountDataSharing.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.accountName.hashCode() * 31, 31, this.dataSharingStatus), 31, this.buttonText), 31, this.iconName);
    }

    public String toString() {
        String str = this.accountName;
        String str2 = this.dataSharingStatus;
        String str3 = this.buttonText;
        String str4 = this.iconName;
        C22191a c22191a = this.accountDataSharing;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AccountDomainState(accountName=", str, ", dataSharingStatus=", str2, ", buttonText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", iconName=", str4, ", accountDataSharing=");
        sbM32001t.append(c22191a);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
