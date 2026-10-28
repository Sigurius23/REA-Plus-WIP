package ds1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr1.EnumC32914f;

/* JADX INFO: renamed from: ds1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lds1/j;", "", "Lcom/whoop/design/util/TextResource;", "isError", "Lsr1/f;", "errorType", "<init>", "(Lcom/whoop/design/util/TextResource;Lsr1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Lsr1/f;", "()Lsr1/f;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12340j {

    /* JADX INFO: renamed from: c */
    public static final int f41473c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource isError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC32914f errorType;

    public C12340j(TextResource isError, EnumC32914f errorType) {
        AbstractC22676k.m65750j(isError, "isError");
        AbstractC22676k.m65750j(errorType, "errorType");
        this.isError = isError;
        this.errorType = errorType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC32914f getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12340j)) {
            return false;
        }
        C12340j c12340j = (C12340j) other;
        return AbstractC22676k.m65745e(this.isError, c12340j.isError) && this.errorType == c12340j.errorType;
    }

    public int hashCode() {
        return this.errorType.hashCode() + (this.isError.hashCode() * 31);
    }

    public String toString() {
        return "JournalError(isError=" + this.isError + ", errorType=" + this.errorType + ")";
    }

    public /* synthetic */ C12340j(TextResource textResource, EnumC32914f enumC32914f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21278l("") : textResource, (i13 & 2) != 0 ? EnumC32914f.COULD_NOT_LOAD_ENTRIES : enumC32914f);
    }
}
