package jf2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: jf2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Ljf2/a;", "", "Lcom/whoop/design/util/TextResource;", "errorTitle", "errorDescription", "tryAgainActionDisplayText", "dismissActionDisplayText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21643a {

    /* JADX INFO: renamed from: e */
    public static final int f83149e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource errorTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource errorDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource tryAgainActionDisplayText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource dismissActionDisplayText;

    public C21643a(TextResource errorTitle, TextResource errorDescription, TextResource tryAgainActionDisplayText, TextResource dismissActionDisplayText) {
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(errorDescription, "errorDescription");
        AbstractC22676k.m65750j(tryAgainActionDisplayText, "tryAgainActionDisplayText");
        AbstractC22676k.m65750j(dismissActionDisplayText, "dismissActionDisplayText");
        this.errorTitle = errorTitle;
        this.errorDescription = errorDescription;
        this.tryAgainActionDisplayText = tryAgainActionDisplayText;
        this.dismissActionDisplayText = dismissActionDisplayText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDismissActionDisplayText() {
        return this.dismissActionDisplayText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getErrorDescription() {
        return this.errorDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTryAgainActionDisplayText() {
        return this.tryAgainActionDisplayText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21643a)) {
            return false;
        }
        C21643a c21643a = (C21643a) other;
        return AbstractC22676k.m65745e(this.errorTitle, c21643a.errorTitle) && AbstractC22676k.m65745e(this.errorDescription, c21643a.errorDescription) && AbstractC22676k.m65745e(this.tryAgainActionDisplayText, c21643a.tryAgainActionDisplayText) && AbstractC22676k.m65745e(this.dismissActionDisplayText, c21643a.dismissActionDisplayText);
    }

    public int hashCode() {
        return this.dismissActionDisplayText.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.errorTitle.hashCode() * 31, this.errorDescription, 31), this.tryAgainActionDisplayText, 31);
    }

    public String toString() {
        TextResource textResource = this.errorTitle;
        TextResource textResource2 = this.errorDescription;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("ScheduleSaveErrorActionViewState(errorTitle=", textResource, ", errorDescription=", textResource2, ", tryAgainActionDisplayText="), this.tryAgainActionDisplayText, ", dismissActionDisplayText=", this.dismissActionDisplayText, ")");
    }
}
