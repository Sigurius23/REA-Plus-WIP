package xd2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xd2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Lxd2/b;", "", "", "historyDate", "Lcom/whoop/design/util/TextResource;", "pageTitle", "warningMessage", "primaryButtonText", "secondaryButtonText", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "e", "d", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38206b {

    /* JADX INFO: renamed from: f */
    public static final int f163701f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String historyDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource pageTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource warningMessage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource primaryButtonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource secondaryButtonText;

    public C38206b(String str, TextResource pageTitle, TextResource warningMessage, TextResource primaryButtonText, TextResource secondaryButtonText) {
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(warningMessage, "warningMessage");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        this.historyDate = str;
        this.pageTitle = pageTitle;
        this.warningMessage = warningMessage;
        this.primaryButtonText = primaryButtonText;
        this.secondaryButtonText = secondaryButtonText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHistoryDate() {
        return this.historyDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getWarningMessage() {
        return this.warningMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38206b)) {
            return false;
        }
        C38206b c38206b = (C38206b) other;
        return AbstractC22676k.m65745e(this.historyDate, c38206b.historyDate) && AbstractC22676k.m65745e(this.pageTitle, c38206b.pageTitle) && AbstractC22676k.m65745e(this.warningMessage, c38206b.warningMessage) && AbstractC22676k.m65745e(this.primaryButtonText, c38206b.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, c38206b.secondaryButtonText);
    }

    public int hashCode() {
        String str = this.historyDate;
        return this.secondaryButtonText.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.pageTitle, 31), this.warningMessage, 31), this.primaryButtonText, 31);
    }

    public String toString() {
        String str = this.historyDate;
        TextResource textResource = this.pageTitle;
        TextResource textResource2 = this.warningMessage;
        TextResource textResource3 = this.primaryButtonText;
        TextResource textResource4 = this.secondaryButtonText;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("ShepherdClearHistoryDialogViewState(historyDate=", str, ", pageTitle=", textResource, ", warningMessage=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", primaryButtonText=", textResource3, ", secondaryButtonText=");
        return AbstractC30007c.m91841k(sbM91847q, textResource4, ")");
    }

    public /* synthetic */ C38206b(String str, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, textResource, textResource2, textResource3, textResource4);
    }
}
