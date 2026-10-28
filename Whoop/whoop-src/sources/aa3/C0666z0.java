package aa3;

import ba3.C2907e;
import ba3.C2910h;
import ca3.C4384k;
import ca3.InterfaceC4385l;
import ea3.C12933d;
import ea3.C12935f;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import sa3.AbstractC32330d;
import sa3.C32328b;

/* JADX INFO: renamed from: aa3.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0666z0 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ InterfaceC21493z[] f2307l;

    /* JADX INFO: renamed from: a */
    public int f2308a;

    /* JADX INFO: renamed from: b */
    public final C0603a1 f2309b;

    /* JADX INFO: renamed from: c */
    public final C0603a1 f2310c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f2311d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f2312e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2313f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2314g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2315h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2316i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f2317j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f2318k;

    static {
        C22686q c22686q = new C22686q(C0666z0.class, "_hasSetter", "get_hasSetter()Z", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f2307l = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C0666z0.class, "_hasGetter", "get_hasGetter()Z", 0, c22673i0)};
    }

    public C0666z0(int i13, int i14, int i15, String name) {
        int i16;
        AbstractC22676k.m65750j(name, "name");
        this.f2308a = i13;
        C32328b HAS_SETTER = AbstractC32330d.f133785A;
        AbstractC22676k.m65749i(HAS_SETTER, "HAS_SETTER");
        C2910h c2910h = new C2910h(HAS_SETTER);
        C2907e c2907e = C2907e.f11688w;
        int i17 = c2910h.f11692b;
        if (i17 != 1 || (i16 = c2910h.f11693c) != 1) {
            throw new IllegalArgumentException(AbstractC11266d.m30460n("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", c2910h, " was passed").toString());
        }
        C32328b HAS_GETTER = AbstractC32330d.f133826z;
        AbstractC22676k.m65749i(HAS_GETTER, "HAS_GETTER");
        C2910h c2910h2 = new C2910h(HAS_GETTER);
        if (c2910h2.f11692b != 1 || c2910h2.f11693c != 1) {
            throw new IllegalArgumentException(AbstractC11266d.m30460n("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", c2910h2, " was passed").toString());
        }
        int i18 = 1 << c2910h2.f11691a;
        C0603a1 c0603a1 = new C0603a1(i14);
        InterfaceC21493z[] interfaceC21493zArr = f2307l;
        InterfaceC21493z property = interfaceC21493zArr[1];
        AbstractC22676k.m65750j(property, "property");
        c2907e.set(this, Integer.valueOf(i18 | this.f2308a));
        this.f2309b = c0603a1;
        InterfaceC21493z property2 = interfaceC21493zArr[0];
        AbstractC22676k.m65750j(property2, "property");
        this.f2310c = ((((Number) c2907e.get(this)).intValue() >>> c2910h.f11691a) & ((1 << i17) - 1)) == i16 ? new C0603a1(i15) : null;
        this.f2311d = new ArrayList(0);
        this.f2312e = new ArrayList(0);
        new ArrayList(0);
        this.f2313f = new ArrayList();
        this.f2314g = new ArrayList(0);
        this.f2315h = new ArrayList(0);
        this.f2316i = new ArrayList(0);
        this.f2317j = new ArrayList(0);
        InterfaceC4385l.f17711a.getClass();
        List listM13764a = C4384k.m13764a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM13764a, 10));
        Iterator it = listM13764a.iterator();
        while (it.hasNext()) {
            ((C12933d) ((InterfaceC4385l) it.next())).getClass();
            arrayList.add(new C12935f());
        }
        this.f2318k = arrayList;
    }
}
