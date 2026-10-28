package f01;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: f01.e0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lf01/e0;", "Lm91/u;", "", "titleDisplay", "contentDisplay", "", "isMarkdown", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13855e0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String contentDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isMarkdown;

    public C13855e0(String titleDisplay, String contentDisplay, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(contentDisplay, "contentDisplay");
        this.titleDisplay = titleDisplay;
        this.contentDisplay = contentDisplay;
        this.isMarkdown = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentDisplay() {
        return this.contentDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsMarkdown() {
        return this.isMarkdown;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13855e0)) {
            return false;
        }
        C13855e0 c13855e0 = (C13855e0) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c13855e0.titleDisplay) && AbstractC22676k.m65745e(this.contentDisplay, c13855e0.contentDisplay) && this.isMarkdown == c13855e0.isMarkdown;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isMarkdown) + AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.contentDisplay);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.contentDisplay;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("ContentBlockCardViewState(titleDisplay=", str, ", contentDisplay=", str2, ", isMarkdown="), this.isMarkdown, ")");
    }
}
