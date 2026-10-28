package pt1;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pt1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lpt1/b;", "", "Lpt1/c;", "readingDomainStateType", "", "readingInterruptedCount", "", "isCalibrating", "<init>", "(Lpt1/c;IZ)V", "a", "(Lpt1/c;IZ)Lpt1/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lpt1/c;", "c", "()Lpt1/c;", "b", "I", "d", "Z", "e", "()Z", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29512b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC29513c readingDomainStateType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int readingInterruptedCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isCalibrating;

    public C29512b(InterfaceC29513c readingDomainStateType, int i13, boolean z4) {
        AbstractC22676k.m65750j(readingDomainStateType, "readingDomainStateType");
        this.readingDomainStateType = readingDomainStateType;
        this.readingInterruptedCount = i13;
        this.isCalibrating = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29512b m90160b(C29512b c29512b, InterfaceC29513c interfaceC29513c, int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            interfaceC29513c = c29512b.readingDomainStateType;
        }
        if ((i14 & 2) != 0) {
            i13 = c29512b.readingInterruptedCount;
        }
        if ((i14 & 4) != 0) {
            z4 = c29512b.isCalibrating;
        }
        return c29512b.m90161a(interfaceC29513c, i13, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C29512b m90161a(InterfaceC29513c readingDomainStateType, int readingInterruptedCount, boolean isCalibrating) {
        AbstractC22676k.m65750j(readingDomainStateType, "readingDomainStateType");
        return new C29512b(readingDomainStateType, readingInterruptedCount, isCalibrating);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC29513c getReadingDomainStateType() {
        return this.readingDomainStateType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getReadingInterruptedCount() {
        return this.readingInterruptedCount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCalibrating() {
        return this.isCalibrating;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29512b)) {
            return false;
        }
        C29512b c29512b = (C29512b) other;
        return AbstractC22676k.m65745e(this.readingDomainStateType, c29512b.readingDomainStateType) && this.readingInterruptedCount == c29512b.readingInterruptedCount && this.isCalibrating == c29512b.isCalibrating;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCalibrating) + AbstractC11266d.m30448b(this.readingInterruptedCount, this.readingDomainStateType.hashCode() * 31, 31);
    }

    public String toString() {
        InterfaceC29513c interfaceC29513c = this.readingDomainStateType;
        int i13 = this.readingInterruptedCount;
        boolean z4 = this.isCalibrating;
        StringBuilder sb4 = new StringBuilder("LabradorReadingDomainState(readingDomainStateType=");
        sb4.append(interfaceC29513c);
        sb4.append(", readingInterruptedCount=");
        sb4.append(i13);
        sb4.append(", isCalibrating=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C29512b(InterfaceC29513c interfaceC29513c, int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? InterfaceC29513c.g.f120049a : interfaceC29513c, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? false : z4);
    }
}
