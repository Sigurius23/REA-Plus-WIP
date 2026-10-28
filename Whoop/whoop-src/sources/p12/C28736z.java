package p12;

import com.whoop.design.model.ParagraphInsets;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p12.z */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lp12/z;", "", "", "shouldShowProgressBar", "", "pageNumber", "totalPages", "Lcom/whoop/design/model/ParagraphInsets;", "insets", "<init>", "(ZIILcom/whoop/design/model/ParagraphInsets;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "I", "d", "Lcom/whoop/design/model/ParagraphInsets;", "()Lcom/whoop/design/model/ParagraphInsets;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28736z {

    /* JADX INFO: renamed from: e */
    public static final int f116308e = ParagraphInsets.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shouldShowProgressBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int pageNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int totalPages;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ParagraphInsets insets;

    public C28736z(boolean z4, int i13, int i14, ParagraphInsets insets) {
        AbstractC22676k.m65750j(insets, "insets");
        this.shouldShowProgressBar = z4;
        this.pageNumber = i13;
        this.totalPages = i14;
        this.insets = insets;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ParagraphInsets getInsets() {
        return this.insets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPageNumber() {
        return this.pageNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShouldShowProgressBar() {
        return this.shouldShowProgressBar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28736z)) {
            return false;
        }
        C28736z c28736z = (C28736z) other;
        return this.shouldShowProgressBar == c28736z.shouldShowProgressBar && this.pageNumber == c28736z.pageNumber && this.totalPages == c28736z.totalPages && AbstractC22676k.m65745e(this.insets, c28736z.insets);
    }

    public int hashCode() {
        return this.insets.hashCode() + AbstractC11266d.m30448b(this.totalPages, AbstractC11266d.m30448b(this.pageNumber, Boolean.hashCode(this.shouldShowProgressBar) * 31, 31), 31);
    }

    public String toString() {
        return "ProgressBarInfo(shouldShowProgressBar=" + this.shouldShowProgressBar + ", pageNumber=" + this.pageNumber + ", totalPages=" + this.totalPages + ", insets=" + this.insets + ")";
    }
}
