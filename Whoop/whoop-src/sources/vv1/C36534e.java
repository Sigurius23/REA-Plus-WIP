package vv1;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import zv1.AbstractC41164a;

/* JADX INFO: renamed from: vv1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lvv1/e;", "", "Lzv1/a;", "state", "", "dunningBottomSheetHasNotBeenShown", "isDunningBottomSheetDisplayed", "<init>", "(Lzv1/a;ZZ)V", "a", "(Lzv1/a;ZZ)Lvv1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzv1/a;", "d", "()Lzv1/a;", "b", "Z", "c", "()Z", "e", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36534e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC41164a state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean dunningBottomSheetHasNotBeenShown;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isDunningBottomSheetDisplayed;

    public C36534e(AbstractC41164a abstractC41164a, boolean z4, boolean z13) {
        this.state = abstractC41164a;
        this.dunningBottomSheetHasNotBeenShown = z4;
        this.isDunningBottomSheetDisplayed = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36534e m117084b(C36534e c36534e, AbstractC41164a abstractC41164a, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC41164a = c36534e.state;
        }
        if ((i13 & 2) != 0) {
            z4 = c36534e.dunningBottomSheetHasNotBeenShown;
        }
        if ((i13 & 4) != 0) {
            z13 = c36534e.isDunningBottomSheetDisplayed;
        }
        return c36534e.m117085a(abstractC41164a, z4, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C36534e m117085a(AbstractC41164a state, boolean dunningBottomSheetHasNotBeenShown, boolean isDunningBottomSheetDisplayed) {
        return new C36534e(state, dunningBottomSheetHasNotBeenShown, isDunningBottomSheetDisplayed);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDunningBottomSheetHasNotBeenShown() {
        return this.dunningBottomSheetHasNotBeenShown;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC41164a getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsDunningBottomSheetDisplayed() {
        return this.isDunningBottomSheetDisplayed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36534e)) {
            return false;
        }
        C36534e c36534e = (C36534e) other;
        return AbstractC22676k.m65745e(this.state, c36534e.state) && this.dunningBottomSheetHasNotBeenShown == c36534e.dunningBottomSheetHasNotBeenShown && this.isDunningBottomSheetDisplayed == c36534e.isDunningBottomSheetDisplayed;
    }

    public int hashCode() {
        AbstractC41164a abstractC41164a = this.state;
        return Boolean.hashCode(this.isDunningBottomSheetDisplayed) + AbstractC2875y.m8289b((abstractC41164a == null ? 0 : abstractC41164a.hashCode()) * 31, 31, this.dunningBottomSheetHasNotBeenShown);
    }

    public String toString() {
        AbstractC41164a abstractC41164a = this.state;
        boolean z4 = this.dunningBottomSheetHasNotBeenShown;
        boolean z13 = this.isDunningBottomSheetDisplayed;
        StringBuilder sb4 = new StringBuilder("DunningBottomSheetInternalState(state=");
        sb4.append(abstractC41164a);
        sb4.append(", dunningBottomSheetHasNotBeenShown=");
        sb4.append(z4);
        sb4.append(", isDunningBottomSheetDisplayed=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ C36534e(AbstractC41164a abstractC41164a, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : abstractC41164a, (i13 & 2) != 0 ? true : z4, (i13 & 4) != 0 ? false : z13);
    }
}
