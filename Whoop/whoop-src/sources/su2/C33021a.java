package su2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: su2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lsu2/a;", "", "Lsu2/b;", "sendEventOnceSpinnerDisplayed", "Lcom/whoop/design/util/TextResource;", "progressModalTitle", "<init>", "(Lsu2/b;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsu2/b;", "()Lsu2/b;", "b", "Lcom/whoop/design/util/TextResource;", "getProgressModalTitle", "()Lcom/whoop/design/util/TextResource;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33021a {

    /* JADX INFO: renamed from: c */
    public static final int f137518c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33022b sendEventOnceSpinnerDisplayed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource progressModalTitle;

    public C33021a(InterfaceC33022b sendEventOnceSpinnerDisplayed, TextResource progressModalTitle) {
        AbstractC22676k.m65750j(sendEventOnceSpinnerDisplayed, "sendEventOnceSpinnerDisplayed");
        AbstractC22676k.m65750j(progressModalTitle, "progressModalTitle");
        this.sendEventOnceSpinnerDisplayed = sendEventOnceSpinnerDisplayed;
        this.progressModalTitle = progressModalTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC33022b getSendEventOnceSpinnerDisplayed() {
        return this.sendEventOnceSpinnerDisplayed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33021a)) {
            return false;
        }
        C33021a c33021a = (C33021a) other;
        return AbstractC22676k.m65745e(this.sendEventOnceSpinnerDisplayed, c33021a.sendEventOnceSpinnerDisplayed) && AbstractC22676k.m65745e(this.progressModalTitle, c33021a.progressModalTitle);
    }

    public int hashCode() {
        return this.progressModalTitle.hashCode() + (this.sendEventOnceSpinnerDisplayed.hashCode() * 31);
    }

    public String toString() {
        return "AsyncProcessStarted(sendEventOnceSpinnerDisplayed=" + this.sendEventOnceSpinnerDisplayed + ", progressModalTitle=" + this.progressModalTitle + ")";
    }
}
