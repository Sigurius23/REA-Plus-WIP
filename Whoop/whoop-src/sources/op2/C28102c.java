package op2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: op2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lop2/c;", "", "", "hasError", "Lcom/whoop/design/util/TextResource;", "errorMessage", "<init>", "(ZLcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getHasError", "()Z", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28102c {

    /* JADX INFO: renamed from: c */
    public static final int f113656c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean hasError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource errorMessage;

    public C28102c(boolean z4, TextResource textResource) {
        this.hasError = z4;
        this.errorMessage = textResource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28102c)) {
            return false;
        }
        C28102c c28102c = (C28102c) other;
        return this.hasError == c28102c.hasError && AbstractC22676k.m65745e(this.errorMessage, c28102c.errorMessage);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasError) * 31;
        TextResource textResource = this.errorMessage;
        return iHashCode + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        return "ValidationState(hasError=" + this.hasError + ", errorMessage=" + this.errorMessage + ")";
    }
}
