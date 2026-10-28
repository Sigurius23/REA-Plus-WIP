package mh0;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mh0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m65681d2 = {"Lmh0/e;", "", "", "isEnabled", "", "pendingTurnId", "<init>", "(ZLjava/lang/String;)V", "a", "(ZLjava/lang/String;)Lmh0/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "Ljava/lang/String;", "c", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25553e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String pendingTurnId;

    public C25553e(boolean z4, String str) {
        this.isEnabled = z4;
        this.pendingTurnId = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C25553e m75136b(C25553e c25553e, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c25553e.isEnabled;
        }
        if ((i13 & 2) != 0) {
            str = c25553e.pendingTurnId;
        }
        return c25553e.m75137a(z4, str);
    }

    /* JADX INFO: renamed from: a */
    public final C25553e m75137a(boolean isEnabled, String pendingTurnId) {
        return new C25553e(isEnabled, pendingTurnId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPendingTurnId() {
        return this.pendingTurnId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25553e)) {
            return false;
        }
        C25553e c25553e = (C25553e) other;
        return this.isEnabled == c25553e.isEnabled && AbstractC22676k.m65745e(this.pendingTurnId, c25553e.pendingTurnId);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.pendingTurnId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC3855a.m11825i("StartTurnButtonMiniArchViewState(isEnabled=", ", pendingTurnId=", this.pendingTurnId, ")", this.isEnabled);
    }

    public /* synthetic */ C25553e(boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? null : str);
    }
}
