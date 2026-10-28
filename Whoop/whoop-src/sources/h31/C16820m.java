package h31;

import com.whoop.navigation.C9598e;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h31.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0018\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lh31/m;", "", "Lh31/q;", "tile", "", "showCommitError", "Lcom/whoop/navigation/e;", "dismiss", "", "followupMessage", "<init>", "(Lh31/q;ZLcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lh31/q;", "d", "()Lh31/q;", "b", "Z", "c", "()Z", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16820m {

    /* JADX INFO: renamed from: e */
    public static final int f64605e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16824q tile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showCommitError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e dismiss;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String followupMessage;

    public C16820m(C16824q tile, boolean z4, C9598e c9598e, String str) {
        AbstractC22676k.m65750j(tile, "tile");
        this.tile = tile;
        this.showCommitError = z4;
        this.dismiss = c9598e;
        this.followupMessage = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDismiss() {
        return this.dismiss;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFollowupMessage() {
        return this.followupMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowCommitError() {
        return this.showCommitError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C16824q getTile() {
        return this.tile;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16820m)) {
            return false;
        }
        C16820m c16820m = (C16820m) other;
        return AbstractC22676k.m65745e(this.tile, c16820m.tile) && this.showCommitError == c16820m.showCommitError && AbstractC22676k.m65745e(this.dismiss, c16820m.dismiss) && AbstractC22676k.m65745e(this.followupMessage, c16820m.followupMessage);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.tile.hashCode() * 31, 31, this.showCommitError);
        C9598e c9598e = this.dismiss;
        int iHashCode = (iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.followupMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationTileMiniArchViewState(tile=" + this.tile + ", showCommitError=" + this.showCommitError + ", dismiss=" + this.dismiss + ", followupMessage=" + this.followupMessage + ")";
    }

    public /* synthetic */ C16820m(C16824q c16824q, boolean z4, C9598e c9598e, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16824q, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : str);
    }
}
