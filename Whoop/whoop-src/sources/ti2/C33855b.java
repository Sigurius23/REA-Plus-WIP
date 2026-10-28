package ti2;

import gv1.AbstractC16241o;
import jk0.EnumC21747a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qi2.InterfaceC30414b;

/* JADX INFO: renamed from: ti2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lti2/b;", "", "Lqi2/b;", "domainResult", "Ljk0/a;", "bodyStatus", "Lti2/d;", "streaksLottieState", "<init>", "(Lqi2/b;Ljk0/a;Lti2/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqi2/b;", "b", "()Lqi2/b;", "Ljk0/a;", "()Ljk0/a;", "c", "Lti2/d;", "()Lti2/d;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33855b {

    /* JADX INFO: renamed from: d */
    public static final int f141786d = AbstractC16241o.f61698a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC30414b domainResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC21747a bodyStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33857d streaksLottieState;

    public C33855b(InterfaceC30414b domainResult, EnumC21747a bodyStatus, C33857d streaksLottieState) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(bodyStatus, "bodyStatus");
        AbstractC22676k.m65750j(streaksLottieState, "streaksLottieState");
        this.domainResult = domainResult;
        this.bodyStatus = bodyStatus;
        this.streaksLottieState = streaksLottieState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC21747a getBodyStatus() {
        return this.bodyStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC30414b getDomainResult() {
        return this.domainResult;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33857d getStreaksLottieState() {
        return this.streaksLottieState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33855b)) {
            return false;
        }
        C33855b c33855b = (C33855b) other;
        return AbstractC22676k.m65745e(this.domainResult, c33855b.domainResult) && this.bodyStatus == c33855b.bodyStatus && AbstractC22676k.m65745e(this.streaksLottieState, c33855b.streaksLottieState);
    }

    public int hashCode() {
        return this.streaksLottieState.hashCode() + ((this.bodyStatus.hashCode() + (this.domainResult.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "StreaksAccumulator(domainResult=" + this.domainResult + ", bodyStatus=" + this.bodyStatus + ", streaksLottieState=" + this.streaksLottieState + ")";
    }
}
