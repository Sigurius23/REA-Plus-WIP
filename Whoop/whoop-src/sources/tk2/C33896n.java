package tk2;

import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: tk2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u0017\u0010$¨\u0006%"}, m65681d2 = {"Ltk2/n;", "", "", "currentProgress", "totalSteps", "Ly81/f;", "fillColorKey", "unfilledColorKey", "", "unfilledAlpha", "heightDp", "", "addBorders", "<init>", "(IILy81/f;Ly81/f;FIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "e", "c", "Ly81/f;", "()Ly81/f;", "d", "g", "F", "f", "()F", "Z", "()Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33896n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int currentProgress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int totalSteps;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f fillColorKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f unfilledColorKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float unfilledAlpha;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int heightDp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean addBorders;

    public C33896n(int i13, int i14, EnumC39333f fillColorKey, EnumC39333f unfilledColorKey, float f13, int i15, boolean z4) {
        AbstractC22676k.m65750j(fillColorKey, "fillColorKey");
        AbstractC22676k.m65750j(unfilledColorKey, "unfilledColorKey");
        this.currentProgress = i13;
        this.totalSteps = i14;
        this.fillColorKey = fillColorKey;
        this.unfilledColorKey = unfilledColorKey;
        this.unfilledAlpha = f13;
        this.heightDp = i15;
        this.addBorders = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAddBorders() {
        return this.addBorders;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getFillColorKey() {
        return this.fillColorKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHeightDp() {
        return this.heightDp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33896n)) {
            return false;
        }
        C33896n c33896n = (C33896n) other;
        return this.currentProgress == c33896n.currentProgress && this.totalSteps == c33896n.totalSteps && this.fillColorKey == c33896n.fillColorKey && this.unfilledColorKey == c33896n.unfilledColorKey && Float.compare(this.unfilledAlpha, c33896n.unfilledAlpha) == 0 && this.heightDp == c33896n.heightDp && this.addBorders == c33896n.addBorders;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getUnfilledAlpha() {
        return this.unfilledAlpha;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC39333f getUnfilledColorKey() {
        return this.unfilledColorKey;
    }

    public int hashCode() {
        return Boolean.hashCode(this.addBorders) + AbstractC11266d.m30448b(this.heightDp, AbstractC11266d.m30447a(this.unfilledAlpha, AbstractC21702c.m61132c(this.unfilledColorKey, AbstractC21702c.m61132c(this.fillColorKey, AbstractC11266d.m30448b(this.totalSteps, Integer.hashCode(this.currentProgress) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        int i13 = this.currentProgress;
        int i14 = this.totalSteps;
        EnumC39333f enumC39333f = this.fillColorKey;
        EnumC39333f enumC39333f2 = this.unfilledColorKey;
        float f13 = this.unfilledAlpha;
        int i15 = this.heightDp;
        boolean z4 = this.addBorders;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "TrackSessionProgressBarViewState(currentProgress=", ", totalSteps=", ", fillColorKey=");
        sbM30465s.append(enumC39333f);
        sbM30465s.append(", unfilledColorKey=");
        sbM30465s.append(enumC39333f2);
        sbM30465s.append(", unfilledAlpha=");
        sbM30465s.append(f13);
        sbM30465s.append(", heightDp=");
        sbM30465s.append(i15);
        sbM30465s.append(", addBorders=");
        return AbstractC18489d0.m53372m(sbM30465s, z4, ")");
    }

    public /* synthetic */ C33896n(int i13, int i14, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, float f13, int i15, boolean z4, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, enumC39333f, (i16 & 8) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f2, (i16 & 16) != 0 ? 0.1f : f13, (i16 & 32) != 0 ? 2 : i15, (i16 & 64) != 0 ? false : z4);
    }
}
