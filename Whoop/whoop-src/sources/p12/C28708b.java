package p12;

import km0.C22581e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: p12.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lp12/b;", "", "Lp12/b0;", "storyPrimaryCTA", "Lp12/c0;", "storySecondaryCTA", "<init>", "(Lp12/b0;Lp12/c0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp12/b0;", "()Lp12/b0;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28708b {

    /* JADX INFO: renamed from: b */
    public static final int f116115b = C22581e.f88865n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28709b0 storyPrimaryCTA;

    public C28708b(C28709b0 c28709b0, AbstractC28711c0 abstractC28711c0) {
        this.storyPrimaryCTA = c28709b0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C28709b0 getStoryPrimaryCTA() {
        return this.storyPrimaryCTA;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C28708b) && AbstractC22676k.m65745e(this.storyPrimaryCTA, ((C28708b) other).storyPrimaryCTA);
    }

    public int hashCode() {
        C28709b0 c28709b0 = this.storyPrimaryCTA;
        return (c28709b0 == null ? 0 : c28709b0.hashCode()) * 31;
    }

    public String toString() {
        return "CTAButtons(storyPrimaryCTA=" + this.storyPrimaryCTA + ", storySecondaryCTA=null)";
    }

    public /* synthetic */ C28708b(C28709b0 c28709b0, AbstractC28711c0 abstractC28711c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c28709b0, (i13 & 2) != 0 ? null : abstractC28711c0);
    }
}
