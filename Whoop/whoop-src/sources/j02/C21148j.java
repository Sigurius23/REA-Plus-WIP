package j02;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j02.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lj02/j;", "", "", "title", "message", "cancelTitle", "confirmTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21148j {

    /* JADX INFO: renamed from: e */
    public static final int f80231e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String cancelTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String confirmTitle;

    public C21148j(String title, String message, String cancelTitle, String confirmTitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(cancelTitle, "cancelTitle");
        AbstractC22676k.m65750j(confirmTitle, "confirmTitle");
        this.title = title;
        this.message = message;
        this.cancelTitle = cancelTitle;
        this.confirmTitle = confirmTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCancelTitle() {
        return this.cancelTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConfirmTitle() {
        return this.confirmTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21148j)) {
            return false;
        }
        C21148j c21148j = (C21148j) other;
        return AbstractC22676k.m65745e(this.title, c21148j.title) && AbstractC22676k.m65745e(this.message, c21148j.message) && AbstractC22676k.m65745e(this.cancelTitle, c21148j.cancelTitle) && AbstractC22676k.m65745e(this.confirmTitle, c21148j.confirmTitle);
    }

    public int hashCode() {
        return this.confirmTitle.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.message), 31, this.cancelTitle);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ConfirmDismissContent(title=", str, ", message=", str2, ", cancelTitle="), this.cancelTitle, ", confirmTitle=", this.confirmTitle, ")");
    }
}
