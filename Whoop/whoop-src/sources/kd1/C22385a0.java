package kd1;

import p000.AbstractC11266d;
import p027b3.InterfaceC2395j3;
import p031b9.AbstractC2875y;
import p636y3.C39176h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kd1.a0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006$"}, m65681d2 = {"Lkd1/a0;", "Lb3/j3;", "viewConfiguration", "", "longPressTimeoutMillis", "doubleTapTimeoutMillis", "doubleTapMinTimeMillis", "", "touchSlop", "Ly3/h;", "minimumTouchTargetSize", "<init>", "(Lb3/j3;JJJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb3/j3;", "b", "J", "c", "()J", "d", "e", "F", "g", "()F", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22385a0 implements InterfaceC2395j3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2395j3 viewConfiguration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long longPressTimeoutMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long doubleTapTimeoutMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long doubleTapMinTimeMillis;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float touchSlop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long minimumTouchTargetSize;

    public /* synthetic */ C22385a0(InterfaceC2395j3 interfaceC2395j3, long j7, long j13, long j14, float f13, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2395j3, j7, j13, j14, f13, j15);
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getDoubleTapTimeoutMillis() {
        return this.doubleTapTimeoutMillis;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: b, reason: from getter */
    public long getDoubleTapMinTimeMillis() {
        return this.doubleTapMinTimeMillis;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getLongPressTimeoutMillis() {
        return this.longPressTimeoutMillis;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: d */
    public /* bridge */ float mo7303d() {
        return 2.0f;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: e, reason: from getter */
    public long getMinimumTouchTargetSize() {
        return this.minimumTouchTargetSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22385a0)) {
            return false;
        }
        C22385a0 c22385a0 = (C22385a0) other;
        return AbstractC22676k.m65745e(this.viewConfiguration, c22385a0.viewConfiguration) && this.longPressTimeoutMillis == c22385a0.longPressTimeoutMillis && this.doubleTapTimeoutMillis == c22385a0.doubleTapTimeoutMillis && this.doubleTapMinTimeMillis == c22385a0.doubleTapMinTimeMillis && Float.compare(this.touchSlop, c22385a0.touchSlop) == 0 && C39176h.m124785a(this.minimumTouchTargetSize, c22385a0.minimumTouchTargetSize);
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: f */
    public /* bridge */ float mo7304f() {
        return Float.MAX_VALUE;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: g, reason: from getter */
    public float getTouchSlop() {
        return this.touchSlop;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: h */
    public /* bridge */ float mo7305h() {
        return 16.0f;
    }

    public int hashCode() {
        return Long.hashCode(this.minimumTouchTargetSize) + AbstractC11266d.m30447a(this.touchSlop, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.viewConfiguration.hashCode() * 31, this.longPressTimeoutMillis, 31), this.doubleTapTimeoutMillis, 31), this.doubleTapMinTimeMillis, 31), 31);
    }

    public String toString() {
        InterfaceC2395j3 interfaceC2395j3 = this.viewConfiguration;
        long j7 = this.longPressTimeoutMillis;
        long j13 = this.doubleTapTimeoutMillis;
        long j14 = this.doubleTapMinTimeMillis;
        float f13 = this.touchSlop;
        String strM124788d = C39176h.m124788d(this.minimumTouchTargetSize);
        StringBuilder sb4 = new StringBuilder("ViewConfigurationDelegate(viewConfiguration=");
        sb4.append(interfaceC2395j3);
        sb4.append(", longPressTimeoutMillis=");
        sb4.append(j7);
        AbstractC2875y.m8285A(sb4, ", doubleTapTimeoutMillis=", j13, ", doubleTapMinTimeMillis=");
        sb4.append(j14);
        sb4.append(", touchSlop=");
        sb4.append(f13);
        return AbstractC2875y.m8304q(sb4, ", minimumTouchTargetSize=", strM124788d, ")");
    }

    private C22385a0(InterfaceC2395j3 viewConfiguration, long j7, long j13, long j14, float f13, long j15) {
        AbstractC22676k.m65750j(viewConfiguration, "viewConfiguration");
        this.viewConfiguration = viewConfiguration;
        this.longPressTimeoutMillis = j7;
        this.doubleTapTimeoutMillis = j13;
        this.doubleTapMinTimeMillis = j14;
        this.touchSlop = f13;
        this.minimumTouchTargetSize = j15;
    }

    public /* synthetic */ C22385a0(InterfaceC2395j3 interfaceC2395j3, long j7, long j13, long j14, float f13, long j15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2395j3, (i13 & 2) != 0 ? interfaceC2395j3.getLongPressTimeoutMillis() : j7, (i13 & 4) != 0 ? interfaceC2395j3.getDoubleTapTimeoutMillis() : j13, (i13 & 8) != 0 ? interfaceC2395j3.getDoubleTapMinTimeMillis() : j14, (i13 & 16) != 0 ? interfaceC2395j3.getTouchSlop() : f13, (i13 & 32) != 0 ? interfaceC2395j3.getMinimumTouchTargetSize() : j15, null);
    }
}
