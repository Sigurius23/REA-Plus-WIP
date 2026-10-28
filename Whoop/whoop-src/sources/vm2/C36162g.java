package vm2;

import j02.AbstractC21155m0;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vm2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lvm2/g;", "", "Lj02/m0;", HMSTrackSource.SCREEN, "", "isTabRoot", "<init>", "(Lj02/m0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lj02/m0;", "()Lj02/m0;", "b", "Z", "()Z", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36162g {

    /* JADX INFO: renamed from: c */
    public static final int f154736c = AbstractC21155m0.f80247a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21155m0 screen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isTabRoot;

    public C36162g(AbstractC21155m0 screen, boolean z4) {
        AbstractC22676k.m65750j(screen, "screen");
        this.screen = screen;
        this.isTabRoot = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC21155m0 getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsTabRoot() {
        return this.isTabRoot;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36162g)) {
            return false;
        }
        C36162g c36162g = (C36162g) other;
        return AbstractC22676k.m65745e(this.screen, c36162g.screen) && this.isTabRoot == c36162g.isTabRoot;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTabRoot) + (this.screen.hashCode() * 31);
    }

    public String toString() {
        return "DestinationResolution(screen=" + this.screen + ", isTabRoot=" + this.isTabRoot + ")";
    }
}
