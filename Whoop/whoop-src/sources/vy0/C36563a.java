package vy0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p181h2.C16617b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: vy0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lvy0/a;", "", "Lh2/b;", "startOffset", "endOffset", "", "intensity", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C36563a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long startOffset;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long endOffset;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float intensity;

    public /* synthetic */ C36563a(long j7, long j13, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j13, f13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEndOffset() {
        return this.endOffset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getIntensity() {
        return this.intensity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getStartOffset() {
        return this.startOffset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36563a)) {
            return false;
        }
        C36563a c36563a = (C36563a) other;
        return C16617b.m47187c(this.startOffset, c36563a.startOffset) && C16617b.m47187c(this.endOffset, c36563a.endOffset) && Float.compare(this.intensity, c36563a.intensity) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.intensity) + AbstractC11266d.m30451e(Long.hashCode(this.startOffset) * 31, this.endOffset, 31);
    }

    public String toString() {
        return AbstractC30007c.m91837g(this.intensity, ")", AbstractC11895b.m32001t("BorderGradientAnimation(startOffset=", C16617b.m47194j(this.startOffset), ", endOffset=", C16617b.m47194j(this.endOffset), ", intensity="));
    }

    private C36563a(long j7, long j13, float f13) {
        this.startOffset = j7;
        this.endOffset = j13;
        this.intensity = f13;
    }
}
