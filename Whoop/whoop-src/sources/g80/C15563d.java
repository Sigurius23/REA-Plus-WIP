package g80;

import com.whoop.metrics.common.ScreenState;
import f70.C14201q0;
import fy1.InterfaceC14875k;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g80.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b#\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lg80/d;", "Lfy1/k;", "Lf70/q0;", "memberInfo", "Lg80/g;", "bffScreenContainerState", "Lg80/i;", "loginErrorState", "Lg80/j;", "loginViewState", "", "isFullScreenError", "isFullScreenLoading", "<init>", "(Lf70/q0;Lg80/g;Lg80/i;Lg80/j;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lf70/q0;", "c", "()Lf70/q0;", "Lg80/g;", "()Lg80/g;", "d", "Lg80/i;", "getLoginErrorState", "()Lg80/i;", "e", "Lg80/j;", "getLoginViewState", "()Lg80/j;", "f", "Z", "()Z", "g", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15563d implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14201q0 memberInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C15566g bffScreenContainerState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15568i loginErrorState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C15569j loginViewState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isFullScreenError;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isFullScreenLoading;

    public C15563d(C14201q0 memberInfo, C15566g c15566g, C15568i c15568i, C15569j loginViewState, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(memberInfo, "memberInfo");
        AbstractC22676k.m65750j(loginViewState, "loginViewState");
        this.memberInfo = memberInfo;
        this.bffScreenContainerState = c15566g;
        this.loginErrorState = c15568i;
        this.loginViewState = loginViewState;
        this.isFullScreenError = z4;
        this.isFullScreenLoading = z13;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C15566g getBffScreenContainerState() {
        return this.bffScreenContainerState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C14201q0 getMemberInfo() {
        return this.memberInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsFullScreenError() {
        return this.isFullScreenError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsFullScreenLoading() {
        return this.isFullScreenLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15563d)) {
            return false;
        }
        C15563d c15563d = (C15563d) other;
        return AbstractC22676k.m65745e(this.memberInfo, c15563d.memberInfo) && AbstractC22676k.m65745e(this.bffScreenContainerState, c15563d.bffScreenContainerState) && AbstractC22676k.m65745e(this.loginErrorState, c15563d.loginErrorState) && AbstractC22676k.m65745e(this.loginViewState, c15563d.loginViewState) && this.isFullScreenError == c15563d.isFullScreenError && this.isFullScreenLoading == c15563d.isFullScreenLoading;
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        boolean z4 = this.isFullScreenLoading;
        if (z4) {
            return ScreenState.LOADING;
        }
        if (this.loginErrorState != null || this.isFullScreenError) {
            return ScreenState.ERROR;
        }
        return (this.bffScreenContainerState == null || z4) ? ScreenState.UNKNOWN : ScreenState.SUCCESS;
    }

    public int hashCode() {
        int iHashCode = this.memberInfo.hashCode() * 31;
        C15566g c15566g = this.bffScreenContainerState;
        int iHashCode2 = (iHashCode + (c15566g == null ? 0 : c15566g.hashCode())) * 31;
        C15568i c15568i = this.loginErrorState;
        return Boolean.hashCode(this.isFullScreenLoading) + AbstractC2875y.m8289b((this.loginViewState.hashCode() + ((iHashCode2 + (c15568i != null ? c15568i.hashCode() : 0)) * 31)) * 31, 31, this.isFullScreenError);
    }

    public String toString() {
        C14201q0 c14201q0 = this.memberInfo;
        C15566g c15566g = this.bffScreenContainerState;
        C15568i c15568i = this.loginErrorState;
        C15569j c15569j = this.loginViewState;
        boolean z4 = this.isFullScreenError;
        boolean z13 = this.isFullScreenLoading;
        StringBuilder sb4 = new StringBuilder("ActivationState(memberInfo=");
        sb4.append(c14201q0);
        sb4.append(", bffScreenContainerState=");
        sb4.append(c15566g);
        sb4.append(", loginErrorState=");
        sb4.append(c15568i);
        sb4.append(", loginViewState=");
        sb4.append(c15569j);
        sb4.append(", isFullScreenError=");
        return AbstractC36095b.m114682j(sb4, z4, ", isFullScreenLoading=", z13, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C15563d(C14201q0 c14201q0, C15566g c15566g, C15568i c15568i, C15569j c15569j, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        C15569j c15569j2;
        C14201q0 c14201q1 = (i13 & 1) != 0 ? new C14201q0(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741823, null) : c14201q0;
        C15568i c15568i2 = null;
        Object[] objArr = 0;
        C15566g c15566g2 = (i13 & 2) != 0 ? null : c15566g;
        C15568i c15568i3 = (i13 & 4) != 0 ? null : c15568i;
        boolean z14 = false;
        if ((i13 & 8) != 0) {
            c15569j2 = new C15569j(c15568i2, z14, 3, objArr == true ? 1 : 0);
        } else {
            c15569j2 = c15569j;
        }
        this(c14201q1, c15566g2, c15568i3, c15569j2, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13);
    }
}
