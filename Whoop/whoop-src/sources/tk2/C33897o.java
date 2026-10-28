package tk2;

import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: tk2.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\r¨\u0006\u0019"}, m65681d2 = {"Ltk2/o;", "Lm91/u;", "", "iconRes", "titleRes", "subtitleRes", "hrMessageRes", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "e", "c", "d", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33897o implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int iconRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int titleRes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int subtitleRes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int hrMessageRes;

    public C33897o(int i13, int i14, int i15, int i16) {
        this.iconRes = i13;
        this.titleRes = i14;
        this.subtitleRes = i15;
        this.hrMessageRes = i16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHrMessageRes() {
        return this.hrMessageRes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33897o)) {
            return false;
        }
        C33897o c33897o = (C33897o) other;
        return this.iconRes == c33897o.iconRes && this.titleRes == c33897o.titleRes && this.subtitleRes == c33897o.subtitleRes && this.hrMessageRes == c33897o.hrMessageRes;
    }

    public int hashCode() {
        return Integer.hashCode(this.hrMessageRes) + AbstractC11266d.m30448b(this.subtitleRes, AbstractC11266d.m30448b(this.titleRes, Integer.hashCode(this.iconRes) * 31, 31), 31);
    }

    public String toString() {
        int i13 = this.iconRes;
        int i14 = this.titleRes;
        return AbstractC26725a.m79505i(AbstractC11266d.m30465s(i13, i14, "TrackSessionSleepContentItemViewState(iconRes=", ", titleRes=", ", subtitleRes="), this.subtitleRes, ", hrMessageRes=", this.hrMessageRes, ")");
    }
}
