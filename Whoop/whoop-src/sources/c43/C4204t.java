package c43;

import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33392g2;

/* JADX INFO: renamed from: c43.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C4204t {

    /* JADX INFO: renamed from: a */
    public final C33392g2 f17062a;

    public C4204t(C33392g2 participant) {
        AbstractC22676k.m65750j(participant, "participant");
        this.f17062a = participant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4204t) && AbstractC22676k.m65745e(this.f17062a, ((C4204t) obj).f17062a);
    }

    public final int hashCode() {
        return this.f17062a.hashCode();
    }

    public final String toString() {
        return "ScreenSharingSession(participant=" + this.f17062a + ")";
    }
}
