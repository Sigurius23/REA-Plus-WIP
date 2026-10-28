package tk2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tk2.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltk2/s;", "", "Lcom/whoop/design/util/TextResource;", "targetSuffix", "Ltk2/n;", "progressBar", "<init>", "(Lcom/whoop/design/util/TextResource;Ltk2/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ltk2/n;", "()Ltk2/n;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33901s {

    /* JADX INFO: renamed from: c */
    public static final int f142072c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource targetSuffix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33896n progressBar;

    public C33901s(TextResource textResource, C33896n c33896n) {
        this.targetSuffix = textResource;
        this.progressBar = c33896n;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C33896n getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTargetSuffix() {
        return this.targetSuffix;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33901s)) {
            return false;
        }
        C33901s c33901s = (C33901s) other;
        return AbstractC22676k.m65745e(this.targetSuffix, c33901s.targetSuffix) && AbstractC22676k.m65745e(this.progressBar, c33901s.progressBar);
    }

    public int hashCode() {
        TextResource textResource = this.targetSuffix;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        C33896n c33896n = this.progressBar;
        return iHashCode + (c33896n != null ? c33896n.hashCode() : 0);
    }

    public String toString() {
        return "TrackSessionToolbarDurationProgress(targetSuffix=" + this.targetSuffix + ", progressBar=" + this.progressBar + ")";
    }

    public /* synthetic */ C33901s(TextResource textResource, C33896n c33896n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : textResource, (i13 & 2) != 0 ? null : c33896n);
    }
}
