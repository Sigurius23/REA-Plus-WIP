package p348nt;

import java.util.Date;
import java.util.HashMap;
import lt.InterfaceC24720c;
import lt.InterfaceC24722e;
import lt.InterfaceC24723f;
import mt.InterfaceC25930a;

/* JADX INFO: renamed from: nt.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C27111d implements InterfaceC25930a {

    /* JADX INFO: renamed from: f */
    public static final C27109b f108354f;

    /* JADX INFO: renamed from: g */
    public static final C27109b f108355g;

    /* JADX INFO: renamed from: a */
    public final HashMap f108357a;

    /* JADX INFO: renamed from: b */
    public final HashMap f108358b;

    /* JADX INFO: renamed from: c */
    public final C27108a f108359c;

    /* JADX INFO: renamed from: d */
    public boolean f108360d;

    /* JADX INFO: renamed from: e */
    public static final C27108a f108353e = new C27108a(0);

    /* JADX INFO: renamed from: h */
    public static final C27110c f108356h = new C27110c();

    /* JADX WARN: Type inference failed for: r0v1, types: [nt.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [nt.b] */
    static {
        final int i13 = 0;
        f108354f = new InterfaceC24722e() { // from class: nt.b
            @Override // lt.InterfaceC24718a
            /* JADX INFO: renamed from: a */
            public final void mo41739a(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        ((InterfaceC24723f) obj2).mo72383c((String) obj);
                        break;
                    default:
                        ((InterfaceC24723f) obj2).mo72384e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i14 = 1;
        f108355g = new InterfaceC24722e() { // from class: nt.b
            @Override // lt.InterfaceC24718a
            /* JADX INFO: renamed from: a */
            public final void mo41739a(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        ((InterfaceC24723f) obj2).mo72383c((String) obj);
                        break;
                    default:
                        ((InterfaceC24723f) obj2).mo72384e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C27111d() {
        HashMap map = new HashMap();
        this.f108357a = map;
        HashMap map2 = new HashMap();
        this.f108358b = map2;
        this.f108359c = f108353e;
        this.f108360d = false;
        map2.put(String.class, f108354f);
        map.remove(String.class);
        map2.put(Boolean.class, f108355g);
        map.remove(Boolean.class);
        map2.put(Date.class, f108356h);
        map.remove(Date.class);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC25930a m81481a(Class cls, InterfaceC24720c interfaceC24720c) {
        this.f108357a.put(cls, interfaceC24720c);
        this.f108358b.remove(cls);
        return this;
    }
}
