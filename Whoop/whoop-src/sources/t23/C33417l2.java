package t23;

import d33.C11602h1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.l2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33417l2 implements InterfaceC33442q2 {

    /* JADX INFO: renamed from: a */
    public final C11602h1 f139538a;

    public C33417l2(C11602h1 c11602h1) {
        this.f139538a = c11602h1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33417l2) && AbstractC22676k.m65745e(this.f139538a, ((C33417l2) obj).f139538a);
    }

    public final int hashCode() {
        return this.f139538a.hashCode();
    }

    public final String toString() {
        return "Joined(session=" + this.f139538a + ")";
    }
}
