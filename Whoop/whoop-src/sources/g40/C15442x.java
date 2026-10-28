package g40;

import ih0.AbstractC18489d0;
import java.util.Map;

/* JADX INFO: renamed from: g40.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C15442x implements InterfaceC15447y {

    /* JADX INFO: renamed from: a */
    public final Object f58030a;

    public C15442x(Map map) {
        this.f58030a = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // g40.InterfaceC15447y
    /* JADX INFO: renamed from: a */
    public final Map mo43609a() {
        return this.f58030a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15442x) && this.f58030a.equals(((C15442x) obj).f58030a);
    }

    public final int hashCode() {
        return this.f58030a.hashCode();
    }

    public final String toString() {
        return AbstractC18489d0.m53369j(this.f58030a, "OnValues(values=", ")");
    }
}
