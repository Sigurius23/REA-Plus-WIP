package p395p6;

import java.util.Map;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p6.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28892k0 {

    /* JADX INFO: renamed from: a */
    public final Map f116945a;

    /* JADX INFO: renamed from: b */
    public final Map f116946b;

    public C28892k0(Map map, Map map2) {
        this.f116945a = map;
        this.f116946b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28892k0)) {
            return false;
        }
        C28892k0 c28892k0 = (C28892k0) obj;
        return AbstractC22676k.m65745e(this.f116945a, c28892k0.f116945a) && AbstractC22676k.m65745e(this.f116946b, c28892k0.f116946b);
    }

    public final int hashCode() {
        return this.f116946b.hashCode() + (this.f116945a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("State(receiverToProviderName=");
        sb4.append(this.f116945a);
        sb4.append(", providerNameToReceivers=");
        return AbstractC30802r.m94764m(sb4, this.f116946b, ')');
    }
}
