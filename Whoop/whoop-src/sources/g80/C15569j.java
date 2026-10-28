package g80;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g80.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lg80/j;", "", "Lg80/i;", "loginErrorState", "", "isLoading", "<init>", "(Lg80/i;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lg80/i;", "getLoginErrorState", "()Lg80/i;", "b", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15569j {

    /* JADX INFO: renamed from: c */
    public static final int f58486c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15568i loginErrorState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    public C15569j(C15568i c15568i, boolean z4) {
        this.loginErrorState = c15568i;
        this.isLoading = z4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15569j)) {
            return false;
        }
        C15569j c15569j = (C15569j) other;
        return AbstractC22676k.m65745e(this.loginErrorState, c15569j.loginErrorState) && this.isLoading == c15569j.isLoading;
    }

    public int hashCode() {
        C15568i c15568i = this.loginErrorState;
        return Boolean.hashCode(this.isLoading) + ((c15568i == null ? 0 : c15568i.hashCode()) * 31);
    }

    public String toString() {
        return "LoginViewState(loginErrorState=" + this.loginErrorState + ", isLoading=" + this.isLoading + ")";
    }

    public /* synthetic */ C15569j(C15568i c15568i, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c15568i, (i13 & 2) != 0 ? false : z4);
    }
}
