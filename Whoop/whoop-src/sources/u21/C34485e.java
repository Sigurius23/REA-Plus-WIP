package u21;

import i51.C18112i;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: u21.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lu21/e;", "Lm91/u;", "Lkd1/o;", "imageSource", "Li51/i;", "celebrationMedia", "<init>", "(Lkd1/o;Li51/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Li51/i;", "()Li51/i;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34485e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C18112i celebrationMedia;

    public C34485e(AbstractC22403o imageSource, C18112i c18112i) {
        AbstractC22676k.m65750j(imageSource, "imageSource");
        this.imageSource = imageSource;
        this.celebrationMedia = c18112i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C18112i getCelebrationMedia() {
        return this.celebrationMedia;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34485e)) {
            return false;
        }
        C34485e c34485e = (C34485e) other;
        return AbstractC22676k.m65745e(this.imageSource, c34485e.imageSource) && AbstractC22676k.m65745e(this.celebrationMedia, c34485e.celebrationMedia);
    }

    public int hashCode() {
        int iHashCode = this.imageSource.hashCode() * 31;
        C18112i c18112i = this.celebrationMedia;
        return iHashCode + (c18112i == null ? 0 : c18112i.hashCode());
    }

    public String toString() {
        return "MilestoneState(imageSource=" + this.imageSource + ", celebrationMedia=" + this.celebrationMedia + ")";
    }

    public /* synthetic */ C34485e(AbstractC22403o abstractC22403o, C18112i c18112i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC22403o, (i13 & 2) != 0 ? null : c18112i);
    }
}
