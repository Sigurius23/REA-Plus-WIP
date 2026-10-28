package z41;

import d51.AbstractC11717e;
import i93.C18279e;
import i93.InterfaceC18280f;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11333b0;
import p077d0.InterfaceC11419z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z41.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lz41/f;", "", "", "baseValue", "endOfLifeMultiplier", "Ld0/z;", "changeOverLifeEasing", "Li93/f;", "randomRangeMultiplier", "<init>", "(FFLd0/z;Li93/f;)V", "d", "()F", "Lz41/c;", "e", "()Lz41/c;", "a", "(FFLd0/z;Li93/f;)Lz41/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "c", "b", "getEndOfLifeMultiplier", "Ld0/z;", "getChangeOverLifeEasing", "()Ld0/z;", "Li93/f;", "getRandomRangeMultiplier", "()Li93/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40071f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float baseValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float endOfLifeMultiplier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC11419z changeOverLifeEasing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC18280f randomRangeMultiplier;

    public C40071f(float f13, float f14, InterfaceC11419z changeOverLifeEasing, InterfaceC18280f randomRangeMultiplier) {
        AbstractC22676k.m65750j(changeOverLifeEasing, "changeOverLifeEasing");
        AbstractC22676k.m65750j(randomRangeMultiplier, "randomRangeMultiplier");
        this.baseValue = f13;
        this.endOfLifeMultiplier = f14;
        this.changeOverLifeEasing = changeOverLifeEasing;
        this.randomRangeMultiplier = randomRangeMultiplier;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C40071f m128422b(C40071f c40071f, float f13, float f14, InterfaceC11419z interfaceC11419z, InterfaceC18280f interfaceC18280f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c40071f.baseValue;
        }
        if ((i13 & 2) != 0) {
            f14 = c40071f.endOfLifeMultiplier;
        }
        if ((i13 & 4) != 0) {
            interfaceC11419z = c40071f.changeOverLifeEasing;
        }
        if ((i13 & 8) != 0) {
            interfaceC18280f = c40071f.randomRangeMultiplier;
        }
        return c40071f.m128423a(f13, f14, interfaceC11419z, interfaceC18280f);
    }

    /* JADX INFO: renamed from: a */
    public final C40071f m128423a(float baseValue, float endOfLifeMultiplier, InterfaceC11419z changeOverLifeEasing, InterfaceC18280f randomRangeMultiplier) {
        AbstractC22676k.m65750j(changeOverLifeEasing, "changeOverLifeEasing");
        AbstractC22676k.m65750j(randomRangeMultiplier, "randomRangeMultiplier");
        return new C40071f(baseValue, endOfLifeMultiplier, changeOverLifeEasing, randomRangeMultiplier);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getBaseValue() {
        return this.baseValue;
    }

    /* JADX INFO: renamed from: d */
    public final float m128425d() {
        return AbstractC11717e.m31313b(this.randomRangeMultiplier, (float) Math.random()) * this.baseValue;
    }

    /* JADX INFO: renamed from: e */
    public final C40068c m128426e() {
        return new C40068c(m128425d(), this.endOfLifeMultiplier, this.changeOverLifeEasing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40071f)) {
            return false;
        }
        C40071f c40071f = (C40071f) other;
        return Float.compare(this.baseValue, c40071f.baseValue) == 0 && Float.compare(this.endOfLifeMultiplier, c40071f.endOfLifeMultiplier) == 0 && AbstractC22676k.m65745e(this.changeOverLifeEasing, c40071f.changeOverLifeEasing) && AbstractC22676k.m65745e(this.randomRangeMultiplier, c40071f.randomRangeMultiplier);
    }

    public int hashCode() {
        return this.randomRangeMultiplier.hashCode() + ((this.changeOverLifeEasing.hashCode() + AbstractC11266d.m30447a(this.endOfLifeMultiplier, Float.hashCode(this.baseValue) * 31, 31)) * 31);
    }

    public String toString() {
        float f13 = this.baseValue;
        float f14 = this.endOfLifeMultiplier;
        InterfaceC11419z interfaceC11419z = this.changeOverLifeEasing;
        InterfaceC18280f interfaceC18280f = this.randomRangeMultiplier;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("ParticleSystemAttribute(baseValue=", f13, ", endOfLifeMultiplier=", f14, ", changeOverLifeEasing=");
        sbM8307t.append(interfaceC11419z);
        sbM8307t.append(", randomRangeMultiplier=");
        sbM8307t.append(interfaceC18280f);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    public C40071f(float f13, float f14, InterfaceC11419z interfaceC11419z, InterfaceC18280f interfaceC18280f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, (i13 & 2) != 0 ? 1.0f : f14, (i13 & 4) != 0 ? AbstractC11333b0.f36312c : interfaceC11419z, (i13 & 8) != 0 ? new C18279e(1.0f, 1.0f) : interfaceC18280f);
    }
}
