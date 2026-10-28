package pz1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pz1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lpz1/b;", "", "Lpz1/c;", "state", "", "selectedCountry", "<init>", "(Lpz1/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpz1/c;", "()Lpz1/c;", "b", "Ljava/lang/String;", "getSelectedCountry", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29644b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC29645c state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedCountry;

    public C29644b(AbstractC29645c state, String str) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
        this.selectedCountry = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC29645c getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29644b)) {
            return false;
        }
        C29644b c29644b = (C29644b) other;
        return AbstractC22676k.m65745e(this.state, c29644b.state) && AbstractC22676k.m65745e(this.selectedCountry, c29644b.selectedCountry);
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        String str = this.selectedCountry;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NativeStoreDomainDomainState(state=" + this.state + ", selectedCountry=" + this.selectedCountry + ")";
    }
}
