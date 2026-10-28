package p083d7;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d7.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C11745a {

    /* JADX INFO: renamed from: a */
    public final String f38018a;

    public C11745a(String str) {
        this.f38018a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C11745a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.health.connect.client.changes.DeletionChange");
        return AbstractC22676k.m65745e(this.f38018a, ((C11745a) obj).f38018a);
    }

    public final int hashCode() {
        return this.f38018a.hashCode();
    }
}
