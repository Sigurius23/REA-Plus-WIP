package g40;

import java.util.Map;
import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C15437w implements InterfaceC15447y {

    /* JADX INFO: renamed from: a */
    public final Map f58021a;

    public C15437w(Map map) {
        this.f58021a = map;
    }

    @Override // g40.InterfaceC15447y
    /* JADX INFO: renamed from: a */
    public final Map mo43609a() {
        return this.f58021a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15437w) && AbstractC22676k.m65745e(this.f58021a, ((C15437w) obj).f58021a);
    }

    public final int hashCode() {
        Map map = this.f58021a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return AbstractC26725a.m79504h("OnExpandForm(values=", ")", this.f58021a);
    }
}
