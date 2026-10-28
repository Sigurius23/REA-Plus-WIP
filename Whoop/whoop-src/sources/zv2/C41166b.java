package zv2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zv2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lzv2/b;", "", "", "title", "description", "primaryButton", "secondaryButton", "valuePrompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "e", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41166b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String primaryButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String secondaryButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String valuePrompt;

    public C41166b(String title, String description, String primaryButton, String secondaryButton, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        this.title = title;
        this.description = description;
        this.primaryButton = primaryButton;
        this.secondaryButton = secondaryButton;
        this.valuePrompt = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getValuePrompt() {
        return this.valuePrompt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41166b)) {
            return false;
        }
        C41166b c41166b = (C41166b) other;
        return AbstractC22676k.m65745e(this.title, c41166b.title) && AbstractC22676k.m65745e(this.description, c41166b.description) && AbstractC22676k.m65745e(this.primaryButton, c41166b.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, c41166b.secondaryButton) && AbstractC22676k.m65745e(this.valuePrompt, c41166b.valuePrompt);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description), 31, this.primaryButton), 31, this.secondaryButton);
        String str = this.valuePrompt;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.primaryButton;
        String str4 = this.secondaryButton;
        String str5 = this.valuePrompt;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OneRepMaxConfirmDialogViewState(title=", str, ", description=", str2, ", primaryButton=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", secondaryButton=", str4, ", valuePrompt=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }
}
