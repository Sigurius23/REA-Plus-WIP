package na3;

import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;

/* JADX INFO: renamed from: na3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C26530q {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f105468a;

    public C26530q(LinkedHashMap linkedHashMap) {
        this.f105468a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final C26530q m78604a() {
        LinkedHashMap linkedHashMap = this.f105468a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C26517d c26517d = (C26517d) entry.getValue();
            linkedHashMap2.put(key, new C26517d(c26517d.f105427a, c26517d.f105428b, c26517d.f105429c, true));
        }
        return new C26530q(linkedHashMap2);
    }
}
