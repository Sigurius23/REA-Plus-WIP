package ht1;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ht1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lht1/b;", "", "Lht1/d;", "currentScreenType", "Lht1/e;", "selectedWrist", "", "willOverwriteReading", "<init>", "(Lht1/d;Lht1/e;Z)V", "a", "(Lht1/d;Lht1/e;Z)Lht1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lht1/d;", "c", "()Lht1/d;", "b", "Lht1/e;", "d", "()Lht1/e;", "Z", "e", "()Z", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17625b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC17627d currentScreenType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC17628e selectedWrist;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean willOverwriteReading;

    public C17625b(InterfaceC17627d currentScreenType, EnumC17628e enumC17628e, boolean z4) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        this.currentScreenType = currentScreenType;
        this.selectedWrist = enumC17628e;
        this.willOverwriteReading = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17625b m50176b(C17625b c17625b, InterfaceC17627d interfaceC17627d, EnumC17628e enumC17628e, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC17627d = c17625b.currentScreenType;
        }
        if ((i13 & 2) != 0) {
            enumC17628e = c17625b.selectedWrist;
        }
        if ((i13 & 4) != 0) {
            z4 = c17625b.willOverwriteReading;
        }
        return c17625b.m50177a(interfaceC17627d, enumC17628e, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C17625b m50177a(InterfaceC17627d currentScreenType, EnumC17628e selectedWrist, boolean willOverwriteReading) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        return new C17625b(currentScreenType, selectedWrist, willOverwriteReading);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC17627d getCurrentScreenType() {
        return this.currentScreenType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC17628e getSelectedWrist() {
        return this.selectedWrist;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getWillOverwriteReading() {
        return this.willOverwriteReading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17625b)) {
            return false;
        }
        C17625b c17625b = (C17625b) other;
        return AbstractC22676k.m65745e(this.currentScreenType, c17625b.currentScreenType) && this.selectedWrist == c17625b.selectedWrist && this.willOverwriteReading == c17625b.willOverwriteReading;
    }

    public int hashCode() {
        int iHashCode = this.currentScreenType.hashCode() * 31;
        EnumC17628e enumC17628e = this.selectedWrist;
        return Boolean.hashCode(this.willOverwriteReading) + ((iHashCode + (enumC17628e == null ? 0 : enumC17628e.hashCode())) * 31);
    }

    public String toString() {
        InterfaceC17627d interfaceC17627d = this.currentScreenType;
        EnumC17628e enumC17628e = this.selectedWrist;
        boolean z4 = this.willOverwriteReading;
        StringBuilder sb4 = new StringBuilder("LabradorDeviceLocationDomainResult(currentScreenType=");
        sb4.append(interfaceC17627d);
        sb4.append(", selectedWrist=");
        sb4.append(enumC17628e);
        sb4.append(", willOverwriteReading=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C17625b(InterfaceC17627d interfaceC17627d, EnumC17628e enumC17628e, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC17627d.b.f68364a : interfaceC17627d, (i13 & 2) != 0 ? null : enumC17628e, (i13 & 4) != 0 ? false : z4);
    }
}
