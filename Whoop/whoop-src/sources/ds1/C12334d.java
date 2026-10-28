package ds1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ds1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u0016\u0010\u001f¨\u0006\""}, m65681d2 = {"Lds1/d;", "", "", "shouldShowExitConfirmationDialog", "doesUserWantToShowExitConfirmationDialog", "Lcom/whoop/design/util/TextResource;", "title", "subText", "primaryActionText", "secondaryActionText", "doNotRemindText", "<init>", "(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "getDoesUserWantToShowExitConfirmationDialog", "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "e", "g", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12334d {

    /* JADX INFO: renamed from: h */
    public static final int f41424h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shouldShowExitConfirmationDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean doesUserWantToShowExitConfirmationDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource primaryActionText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource secondaryActionText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource doNotRemindText;

    public C12334d(boolean z4, boolean z13, TextResource title, TextResource subText, TextResource primaryActionText, TextResource secondaryActionText, TextResource doNotRemindText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subText, "subText");
        AbstractC22676k.m65750j(primaryActionText, "primaryActionText");
        AbstractC22676k.m65750j(secondaryActionText, "secondaryActionText");
        AbstractC22676k.m65750j(doNotRemindText, "doNotRemindText");
        this.shouldShowExitConfirmationDialog = z4;
        this.doesUserWantToShowExitConfirmationDialog = z13;
        this.title = title;
        this.subText = subText;
        this.primaryActionText = primaryActionText;
        this.secondaryActionText = secondaryActionText;
        this.doNotRemindText = doNotRemindText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDoNotRemindText() {
        return this.doNotRemindText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPrimaryActionText() {
        return this.primaryActionText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSecondaryActionText() {
        return this.secondaryActionText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShouldShowExitConfirmationDialog() {
        return this.shouldShowExitConfirmationDialog;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12334d)) {
            return false;
        }
        C12334d c12334d = (C12334d) other;
        return this.shouldShowExitConfirmationDialog == c12334d.shouldShowExitConfirmationDialog && this.doesUserWantToShowExitConfirmationDialog == c12334d.doesUserWantToShowExitConfirmationDialog && AbstractC22676k.m65745e(this.title, c12334d.title) && AbstractC22676k.m65745e(this.subText, c12334d.subText) && AbstractC22676k.m65745e(this.primaryActionText, c12334d.primaryActionText) && AbstractC22676k.m65745e(this.secondaryActionText, c12334d.secondaryActionText) && AbstractC22676k.m65745e(this.doNotRemindText, c12334d.doNotRemindText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.doNotRemindText.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(Boolean.hashCode(this.shouldShowExitConfirmationDialog) * 31, 31, this.doesUserWantToShowExitConfirmationDialog), this.title, 31), this.subText, 31), this.primaryActionText, 31), this.secondaryActionText, 31);
    }

    public String toString() {
        boolean z4 = this.shouldShowExitConfirmationDialog;
        boolean z13 = this.doesUserWantToShowExitConfirmationDialog;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subText;
        TextResource textResource3 = this.primaryActionText;
        TextResource textResource4 = this.secondaryActionText;
        TextResource textResource5 = this.doNotRemindText;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ExitConfirmationDialog(shouldShowExitConfirmationDialog=", ", doesUserWantToShowExitConfirmationDialog=", ", title=", z4, z13);
        AbstractC30007c.m91855y(sbM32002u, textResource, ", subText=", textResource2, ", primaryActionText=");
        AbstractC30007c.m91855y(sbM32002u, textResource3, ", secondaryActionText=", textResource4, ", doNotRemindText=");
        return AbstractC30007c.m91841k(sbM32002u, textResource5, ")");
    }

    public /* synthetic */ C12334d(boolean z4, boolean z13, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 64) != 0 ? AbstractC8693b.m21267a() : textResource5);
    }
}
