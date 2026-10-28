package o93;

import c93.InterfaceC4339a;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import lb3.AbstractC23763c0;

/* JADX INFO: renamed from: o93.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C27734f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111785w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC27736h f111786x;

    public /* synthetic */ C27734f(AbstractC27736h abstractC27736h, int i13) {
        this.f111785w = i13;
        this.f111786x = abstractC27736h;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f111785w;
        AbstractC27736h abstractC27736h = this.f111786x;
        switch (i13) {
            case 0:
                return Arrays.asList(abstractC27736h.m83824l().mo78658F(AbstractC27742n.f111886k), abstractC27736h.m83824l().mo78658F(AbstractC27742n.f111888m), abstractC27736h.m83824l().mo78658F(AbstractC27742n.f111889n), abstractC27736h.m83824l().mo78658F(AbstractC27742n.f111887l));
            default:
                EnumMap enumMap = new EnumMap(EnumC27738j.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (EnumC27738j enumC27738j : EnumC27738j.values()) {
                    String strM113817b = enumC27738j.f111806w.m113817b();
                    if (strM113817b == null) {
                        AbstractC27736h.m83809a(47);
                        throw null;
                    }
                    AbstractC23763c0 abstractC23763c0Mo60594i = abstractC27736h.m83823k(strM113817b).mo60594i();
                    if (abstractC23763c0Mo60594i == null) {
                        AbstractC27736h.m83809a(48);
                        throw null;
                    }
                    String strM113817b2 = enumC27738j.f111807x.m113817b();
                    if (strM113817b2 == null) {
                        AbstractC27736h.m83809a(47);
                        throw null;
                    }
                    AbstractC23763c0 abstractC23763c0Mo60594i2 = abstractC27736h.m83823k(strM113817b2).mo60594i();
                    if (abstractC23763c0Mo60594i2 == null) {
                        AbstractC27736h.m83809a(48);
                        throw null;
                    }
                    enumMap.put(enumC27738j, abstractC23763c0Mo60594i2);
                    map.put(abstractC23763c0Mo60594i, abstractC23763c0Mo60594i2);
                    map2.put(abstractC23763c0Mo60594i2, abstractC23763c0Mo60594i);
                }
                return new C27735g(enumMap, map, map2);
        }
    }
}
