package p083d7;

import p322m7.InterfaceC25170r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d7.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C11746b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC25170r0 f38019a;

    public C11746b(InterfaceC25170r0 interfaceC25170r0) {
        this.f38019a = interfaceC25170r0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C11746b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.health.connect.client.changes.UpsertionChange");
        return AbstractC22676k.m65745e(this.f38019a, ((C11746b) obj).f38019a);
    }

    public final int hashCode() {
        return this.f38019a.hashCode();
    }
}
