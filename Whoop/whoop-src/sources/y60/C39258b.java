package y60;

import com.whoop.activation.dayzero.model.DayZeroSplashResponse;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y60.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ly60/b;", "", "Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;", "response", "", "isLoading", "isError", "<init>", "(Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;", "()Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;", "b", "Z", "c", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39258b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DayZeroSplashResponse response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isError;

    public C39258b(DayZeroSplashResponse dayZeroSplashResponse, boolean z4, boolean z13) {
        this.response = dayZeroSplashResponse;
        this.isLoading = z4;
        this.isError = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DayZeroSplashResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39258b)) {
            return false;
        }
        C39258b c39258b = (C39258b) other;
        return AbstractC22676k.m65745e(this.response, c39258b.response) && this.isLoading == c39258b.isLoading && this.isError == c39258b.isError;
    }

    public int hashCode() {
        DayZeroSplashResponse dayZeroSplashResponse = this.response;
        return Boolean.hashCode(this.isError) + AbstractC2875y.m8289b((dayZeroSplashResponse == null ? 0 : dayZeroSplashResponse.hashCode()) * 31, 31, this.isLoading);
    }

    public String toString() {
        DayZeroSplashResponse dayZeroSplashResponse = this.response;
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        StringBuilder sb4 = new StringBuilder("DayZeroSplashDomainResult(response=");
        sb4.append(dayZeroSplashResponse);
        sb4.append(", isLoading=");
        sb4.append(z4);
        sb4.append(", isError=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ C39258b(DayZeroSplashResponse dayZeroSplashResponse, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : dayZeroSplashResponse, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13);
    }
}
