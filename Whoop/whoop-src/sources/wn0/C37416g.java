package wn0;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: wn0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lwn0/g;", "", "", "ruleId", "Lcom/whoop/design/util/TextResource;", "errorMessage", "", "isValid", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRuleId", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Z", "()Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37416g {

    /* JADX INFO: renamed from: d */
    public static final int f160156d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String ruleId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource errorMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isValid;

    public C37416g(String ruleId, TextResource errorMessage, boolean z4) {
        AbstractC22676k.m65750j(ruleId, "ruleId");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.ruleId = ruleId;
        this.errorMessage = errorMessage;
        this.isValid = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37416g)) {
            return false;
        }
        C37416g c37416g = (C37416g) other;
        return AbstractC22676k.m65745e(this.ruleId, c37416g.ruleId) && AbstractC22676k.m65745e(this.errorMessage, c37416g.errorMessage) && this.isValid == c37416g.isValid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isValid) + AbstractC31061c.m95625a(this.ruleId.hashCode() * 31, this.errorMessage, 31);
    }

    public String toString() {
        String str = this.ruleId;
        TextResource textResource = this.errorMessage;
        return AbstractC18489d0.m53372m(AbstractC30007c.m91847q("ValidationResult(ruleId=", str, ", errorMessage=", textResource, ", isValid="), this.isValid, ")");
    }
}
