package c42;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c42.q */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001e\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b'\u0010+¨\u0006,"}, m65681d2 = {"Lc42/q;", "", "Lc42/s;", "pregnancyToggle", "Lc42/b;", "dueDate", "Lc42/u;", "privacy", "Lc42/c;", "exitDialog", "Lc42/a;", "dueDateOptions", "Lc42/t;", "previousPregnanciesSection", "<init>", "(Lc42/s;Lc42/b;Lc42/u;Lc42/c;Lc42/a;Lc42/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc42/s;", "d", "()Lc42/s;", "b", "Lc42/b;", "()Lc42/b;", "c", "Lc42/u;", "f", "()Lc42/u;", "Lc42/c;", "()Lc42/c;", "e", "Lc42/a;", "()Lc42/a;", "Lc42/t;", "()Lc42/t;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4180q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4182s pregnancyToggle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4165b dueDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4184u privacy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4166c exitDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4164a dueDateOptions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4183t previousPregnanciesSection;

    public C4180q(C4182s pregnancyToggle, C4165b dueDate, C4184u privacy, C4166c exitDialog, C4164a dueDateOptions, C4183t c4183t) {
        AbstractC22676k.m65750j(pregnancyToggle, "pregnancyToggle");
        AbstractC22676k.m65750j(dueDate, "dueDate");
        AbstractC22676k.m65750j(privacy, "privacy");
        AbstractC22676k.m65750j(exitDialog, "exitDialog");
        AbstractC22676k.m65750j(dueDateOptions, "dueDateOptions");
        this.pregnancyToggle = pregnancyToggle;
        this.dueDate = dueDate;
        this.privacy = privacy;
        this.exitDialog = exitDialog;
        this.dueDateOptions = dueDateOptions;
        this.previousPregnanciesSection = c4183t;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4165b getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4164a getDueDateOptions() {
        return this.dueDateOptions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4166c getExitDialog() {
        return this.exitDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C4182s getPregnancyToggle() {
        return this.pregnancyToggle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C4183t getPreviousPregnanciesSection() {
        return this.previousPregnanciesSection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4180q)) {
            return false;
        }
        C4180q c4180q = (C4180q) other;
        return AbstractC22676k.m65745e(this.pregnancyToggle, c4180q.pregnancyToggle) && AbstractC22676k.m65745e(this.dueDate, c4180q.dueDate) && AbstractC22676k.m65745e(this.privacy, c4180q.privacy) && AbstractC22676k.m65745e(this.exitDialog, c4180q.exitDialog) && AbstractC22676k.m65745e(this.dueDateOptions, c4180q.dueDateOptions) && AbstractC22676k.m65745e(this.previousPregnanciesSection, c4180q.previousPregnanciesSection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C4184u getPrivacy() {
        return this.privacy;
    }

    public int hashCode() {
        int iHashCode = (this.dueDateOptions.hashCode() + ((this.exitDialog.hashCode() + ((this.privacy.hashCode() + ((this.dueDate.hashCode() + (this.pregnancyToggle.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        C4183t c4183t = this.previousPregnanciesSection;
        return iHashCode + (c4183t == null ? 0 : c4183t.hashCode());
    }

    public String toString() {
        return "PregnancySettingsScreenViewState(pregnancyToggle=" + this.pregnancyToggle + ", dueDate=" + this.dueDate + ", privacy=" + this.privacy + ", exitDialog=" + this.exitDialog + ", dueDateOptions=" + this.dueDateOptions + ", previousPregnanciesSection=" + this.previousPregnanciesSection + ")";
    }
}
