package n42;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: n42.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, m65681d2 = {"Ln42/b;", "", "Lcom/whoop/design/util/TextResource;", "accountName", "dataSharingStatus", "buttonText", "", "icon", "Ln42/a;", "accountDataSharing", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILn42/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "getDataSharingStatus", "c", "d", "I", "e", "Ln42/a;", "()Ln42/a;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26278b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource accountName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource dataSharingStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C26277a accountDataSharing;

    public C26278b(TextResource accountName, TextResource dataSharingStatus, TextResource buttonText, int i13, C26277a accountDataSharing) {
        AbstractC22676k.m65750j(accountName, "accountName");
        AbstractC22676k.m65750j(dataSharingStatus, "dataSharingStatus");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(accountDataSharing, "accountDataSharing");
        this.accountName = accountName;
        this.dataSharingStatus = dataSharingStatus;
        this.buttonText = buttonText;
        this.icon = i13;
        this.accountDataSharing = accountDataSharing;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26277a getAccountDataSharing() {
        return this.accountDataSharing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getAccountName() {
        return this.accountName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26278b)) {
            return false;
        }
        C26278b c26278b = (C26278b) other;
        return AbstractC22676k.m65745e(this.accountName, c26278b.accountName) && AbstractC22676k.m65745e(this.dataSharingStatus, c26278b.dataSharingStatus) && AbstractC22676k.m65745e(this.buttonText, c26278b.buttonText) && this.icon == c26278b.icon && AbstractC22676k.m65745e(this.accountDataSharing, c26278b.accountDataSharing);
    }

    public int hashCode() {
        return this.accountDataSharing.hashCode() + AbstractC11266d.m30448b(this.icon, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.accountName.hashCode() * 31, this.dataSharingStatus, 31), this.buttonText, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.accountName;
        TextResource textResource2 = this.dataSharingStatus;
        TextResource textResource3 = this.buttonText;
        int i13 = this.icon;
        C26277a c26277a = this.accountDataSharing;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("AccountViewState(accountName=", textResource, ", dataSharingStatus=", textResource2, ", buttonText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", icon=");
        sbM106658q.append(i13);
        sbM106658q.append(", accountDataSharing=");
        sbM106658q.append(c26277a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
