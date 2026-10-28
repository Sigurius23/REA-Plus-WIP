package wb0;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: wb0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lwb0/d;", "", "", "title", "message", "Lcom/whoop/design/util/TextResource;", "primaryButtonText", "secondaryButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37033d {

    /* JADX INFO: renamed from: e */
    public static final int f158427e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource primaryButtonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource secondaryButtonText;

    public C37033d(String title, String message, TextResource primaryButtonText, TextResource secondaryButtonText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        this.title = title;
        this.message = message;
        this.primaryButtonText = primaryButtonText;
        this.secondaryButtonText = secondaryButtonText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37033d)) {
            return false;
        }
        C37033d c37033d = (C37033d) other;
        return AbstractC22676k.m65745e(this.title, c37033d.title) && AbstractC22676k.m65745e(this.message, c37033d.message) && AbstractC22676k.m65745e(this.primaryButtonText, c37033d.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, c37033d.secondaryButtonText);
    }

    public int hashCode() {
        return this.secondaryButtonText.hashCode() + AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.message), this.primaryButtonText, 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        return AbstractC33745d.m106655n(AbstractC11895b.m32001t("EditBiomarkerDependentWarningState(title=", str, ", message=", str2, ", primaryButtonText="), this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, ")");
    }
}
