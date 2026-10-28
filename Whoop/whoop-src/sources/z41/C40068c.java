package z41;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p077d0.InterfaceC11419z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lz41/c;", "", "", "initialValue", "endOfLifeMultiplier", "Ld0/z;", "changeOverLifeEasing", "<init>", "(FFLd0/z;)V", "percent", "a", "(F)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getInitialValue", "()F", "b", "getEndOfLifeMultiplier", "c", "Ld0/z;", "getChangeOverLifeEasing", "()Ld0/z;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40068c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float initialValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float endOfLifeMultiplier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC11419z changeOverLifeEasing;

    public C40068c(float f13, float f14, InterfaceC11419z changeOverLifeEasing) {
        AbstractC22676k.m65750j(changeOverLifeEasing, "changeOverLifeEasing");
        this.initialValue = f13;
        this.endOfLifeMultiplier = f14;
        this.changeOverLifeEasing = changeOverLifeEasing;
    }

    /* JADX INFO: renamed from: a */
    public final float m128412a(float percent) {
        return ((this.changeOverLifeEasing.mo7226i(percent) * (this.endOfLifeMultiplier - 1.0f)) + 1.0f) * this.initialValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40068c)) {
            return false;
        }
        C40068c c40068c = (C40068c) other;
        return Float.compare(this.initialValue, c40068c.initialValue) == 0 && Float.compare(this.endOfLifeMultiplier, c40068c.endOfLifeMultiplier) == 0 && AbstractC22676k.m65745e(this.changeOverLifeEasing, c40068c.changeOverLifeEasing);
    }

    public int hashCode() {
        return this.changeOverLifeEasing.hashCode() + AbstractC11266d.m30447a(this.endOfLifeMultiplier, Float.hashCode(this.initialValue) * 31, 31);
    }

    public String toString() {
        float f13 = this.initialValue;
        float f14 = this.endOfLifeMultiplier;
        InterfaceC11419z interfaceC11419z = this.changeOverLifeEasing;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("ParticleLifetimeAttribute(initialValue=", f13, ", endOfLifeMultiplier=", f14, ", changeOverLifeEasing=");
        sbM8307t.append(interfaceC11419z);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }
}
