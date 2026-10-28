package oq0;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: oq0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001c\u0010\u0012¨\u0006#"}, m65681d2 = {"Loq0/g;", "", "", "progressVisible", "", "inviteCode", "", "inviteCodeErrorTextId", "inviteCodeErrorVisibility", "inviteCodeSelection", "backgroundResId", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)V", "a", "(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)Loq0/g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getProgressVisible", "()Z", "b", "Ljava/lang/String;", "d", "c", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "I", "f", "g", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28110g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean progressVisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String inviteCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer inviteCodeErrorTextId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int inviteCodeErrorVisibility;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer inviteCodeSelection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int backgroundResId;

    public C28110g(boolean z4, String inviteCode, Integer num, int i13, Integer num2, int i14) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        this.progressVisible = z4;
        this.inviteCode = inviteCode;
        this.inviteCodeErrorTextId = num;
        this.inviteCodeErrorVisibility = i13;
        this.inviteCodeSelection = num2;
        this.backgroundResId = i14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C28110g m84979b(C28110g c28110g, boolean z4, String str, Integer num, int i13, Integer num2, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z4 = c28110g.progressVisible;
        }
        if ((i15 & 2) != 0) {
            str = c28110g.inviteCode;
        }
        if ((i15 & 4) != 0) {
            num = c28110g.inviteCodeErrorTextId;
        }
        if ((i15 & 8) != 0) {
            i13 = c28110g.inviteCodeErrorVisibility;
        }
        if ((i15 & 16) != 0) {
            num2 = c28110g.inviteCodeSelection;
        }
        if ((i15 & 32) != 0) {
            i14 = c28110g.backgroundResId;
        }
        Integer num3 = num2;
        int i16 = i14;
        return c28110g.m84980a(z4, str, num, i13, num3, i16);
    }

    /* JADX INFO: renamed from: a */
    public final C28110g m84980a(boolean progressVisible, String inviteCode, Integer inviteCodeErrorTextId, int inviteCodeErrorVisibility, Integer inviteCodeSelection, int backgroundResId) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        return new C28110g(progressVisible, inviteCode, inviteCodeErrorTextId, inviteCodeErrorVisibility, inviteCodeSelection, backgroundResId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBackgroundResId() {
        return this.backgroundResId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getInviteCodeErrorTextId() {
        return this.inviteCodeErrorTextId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28110g)) {
            return false;
        }
        C28110g c28110g = (C28110g) other;
        return this.progressVisible == c28110g.progressVisible && AbstractC22676k.m65745e(this.inviteCode, c28110g.inviteCode) && AbstractC22676k.m65745e(this.inviteCodeErrorTextId, c28110g.inviteCodeErrorTextId) && this.inviteCodeErrorVisibility == c28110g.inviteCodeErrorVisibility && AbstractC22676k.m65745e(this.inviteCodeSelection, c28110g.inviteCodeSelection) && this.backgroundResId == c28110g.backgroundResId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getInviteCodeErrorVisibility() {
        return this.inviteCodeErrorVisibility;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getInviteCodeSelection() {
        return this.inviteCodeSelection;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Boolean.hashCode(this.progressVisible) * 31, 31, this.inviteCode);
        Integer num = this.inviteCodeErrorTextId;
        int iM30448b = AbstractC11266d.m30448b(this.inviteCodeErrorVisibility, (iM30450d + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.inviteCodeSelection;
        return Integer.hashCode(this.backgroundResId) + ((iM30448b + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        boolean z4 = this.progressVisible;
        String str = this.inviteCode;
        Integer num = this.inviteCodeErrorTextId;
        int i13 = this.inviteCodeErrorVisibility;
        Integer num2 = this.inviteCodeSelection;
        int i14 = this.backgroundResId;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("InviteCodeViewState(progressVisible=", ", inviteCode=", str, ", inviteCodeErrorTextId=", z4);
        sbM38567n.append(num);
        sbM38567n.append(", inviteCodeErrorVisibility=");
        sbM38567n.append(i13);
        sbM38567n.append(", inviteCodeSelection=");
        sbM38567n.append(num2);
        sbM38567n.append(", backgroundResId=");
        sbM38567n.append(i14);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public /* synthetic */ C28110g(boolean z4, String str, Integer num, int i13, Integer num2, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? false : z4, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? 8 : i13, (i15 & 16) != 0 ? null : num2, (i15 & 32) != 0 ? AbstractC36510a.f156018a : i14);
    }
}
