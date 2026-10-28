package na0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: na0.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\tJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m65681d2 = {"Lna0/f;", "", "", "testId", "Lna0/b;", "action", "<init>", "(Ljava/lang/String;Lna0/b;)V", "a", "()Ljava/lang/String;", "b", "()Lna0/b;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "Lna0/b;", "getAction", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C26510f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String testId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC26506b action;

    public C26510f(String str, AbstractC26506b action) {
        AbstractC22676k.m65750j(action, "action");
        this.testId = str;
        this.action = action;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC26506b getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: c */
    public final String m78589c() {
        return this.testId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26510f)) {
            return false;
        }
        C26510f c26510f = (C26510f) other;
        return AbstractC22676k.m65745e(this.testId, c26510f.testId) && AbstractC22676k.m65745e(this.action, c26510f.action);
    }

    public int hashCode() {
        String str = this.testId;
        return this.action.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "InternalState(testId=" + this.testId + ", action=" + this.action + ")";
    }

    public /* synthetic */ C26510f(String str, AbstractC26506b abstractC26506b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? AbstractC26506b.c.f105338a : abstractC26506b);
    }
}
