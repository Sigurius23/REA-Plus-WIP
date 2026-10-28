package vv1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import zv1.AbstractC41164a;

/* JADX INFO: renamed from: vv1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lvv1/b;", "", "Lzv1/a;", "state", "", "showDunningBottomSheet", "<init>", "(Lzv1/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lzv1/a;", "b", "()Lzv1/a;", "Z", "()Z", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36531b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC41164a state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showDunningBottomSheet;

    public C36531b(AbstractC41164a abstractC41164a, boolean z4) {
        this.state = abstractC41164a;
        this.showDunningBottomSheet = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShowDunningBottomSheet() {
        return this.showDunningBottomSheet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC41164a getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36531b)) {
            return false;
        }
        C36531b c36531b = (C36531b) other;
        return AbstractC22676k.m65745e(this.state, c36531b.state) && this.showDunningBottomSheet == c36531b.showDunningBottomSheet;
    }

    public int hashCode() {
        AbstractC41164a abstractC41164a = this.state;
        return Boolean.hashCode(this.showDunningBottomSheet) + ((abstractC41164a == null ? 0 : abstractC41164a.hashCode()) * 31);
    }

    public String toString() {
        return "DunningBottomSheetFlowData(state=" + this.state + ", showDunningBottomSheet=" + this.showDunningBottomSheet + ")";
    }

    public /* synthetic */ C36531b(AbstractC41164a abstractC41164a, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : abstractC41164a, (i13 & 2) != 0 ? false : z4);
    }
}
