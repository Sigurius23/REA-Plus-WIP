package b30;

import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C2514f extends AbstractC32073e {

    /* JADX INFO: renamed from: a */
    public final C2474a f9783a;

    public C2514f(C2474a initialVisibilityTrackerData) {
        AbstractC22676k.m65750j(initialVisibilityTrackerData, "initialVisibilityTrackerData");
        this.f9783a = initialVisibilityTrackerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2514f) && AbstractC22676k.m65745e(this.f9783a, ((C2514f) obj).f9783a);
    }

    public final int hashCode() {
        return this.f9783a.hashCode();
    }

    public final String toString() {
        return "UpdatePaymentMethodVisibility(initialVisibilityTrackerData=" + this.f9783a + ")";
    }
}
