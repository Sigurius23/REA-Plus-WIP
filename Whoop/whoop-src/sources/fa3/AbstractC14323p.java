package fa3;

import fb3.InterfaceC14343d;
import java.util.HashMap;
import r93.AbstractC31150q;
import r93.InterfaceC31111c;
import r93.InterfaceC31124g0;
import r93.InterfaceC31135k;
import r93.InterfaceC31144n;
import u93.AbstractC34677g0;
import v93.C35835a;
import v93.C35836b;
import v93.C35837c;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: fa3.p */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14323p {

    /* JADX INFO: renamed from: a */
    public static final C14322o f52285a;

    /* JADX INFO: renamed from: b */
    public static final C14322o f52286b;

    /* JADX INFO: renamed from: c */
    public static final C14322o f52287c;

    /* JADX INFO: renamed from: d */
    public static final HashMap f52288d;

    static {
        C35835a c35835a = C35835a.f152568c;
        C14322o c14322o = new C14322o(c35835a, 0);
        f52285a = c14322o;
        C35837c c35837c = C35837c.f152570c;
        C14322o c14322o2 = new C14322o(c35837c, 1);
        f52286b = c14322o2;
        C35836b c35836b = C35836b.f152569c;
        C14322o c14322o3 = new C14322o(c35836b, 2);
        f52287c = c14322o3;
        HashMap map = new HashMap();
        f52288d = map;
        map.put(c35835a, c14322o);
        map.put(c35837c, c14322o2);
        map.put(c35836b, c14322o3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m40932a(int i13) {
        String str = (i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 5 || i13 == 6) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i13 == 5 || i13 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i13 == 2 || i13 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i13 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i13 != 5 && i13 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40933b(InterfaceC14343d interfaceC14343d, InterfaceC31144n interfaceC31144n, InterfaceC31135k interfaceC31135k) {
        InterfaceC31144n interfaceC31144nM125536r;
        if (interfaceC31135k == null) {
            m40932a(1);
            throw null;
        }
        if (interfaceC31144n instanceof InterfaceC31111c) {
            interfaceC31144nM125536r = AbstractC39363f.m125536r((InterfaceC31111c) interfaceC31144n);
        } else {
            int i13 = AbstractC39363f.f169413a;
            interfaceC31144nM125536r = interfaceC31144n;
        }
        if (m40934c(interfaceC31144nM125536r, interfaceC31135k)) {
            return true;
        }
        return AbstractC31150q.f128351c.mo40931a(interfaceC14343d, interfaceC31144n, interfaceC31135k);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m40934c(InterfaceC31144n interfaceC31144n, InterfaceC31135k interfaceC31135k) {
        if (interfaceC31144n == null) {
            m40932a(2);
            throw null;
        }
        if (interfaceC31135k == null) {
            m40932a(3);
            throw null;
        }
        InterfaceC31124g0 interfaceC31124g0 = (InterfaceC31124g0) AbstractC39363f.m125526h(interfaceC31144n, InterfaceC31124g0.class, false);
        InterfaceC31124g0 interfaceC31124g1 = (InterfaceC31124g0) AbstractC39363f.m125526h(interfaceC31135k, InterfaceC31124g0.class, false);
        return (interfaceC31124g1 == null || interfaceC31124g0 == null || !((AbstractC34677g0) interfaceC31124g0).f146067F.equals(((AbstractC34677g0) interfaceC31124g1).f146067F)) ? false : true;
    }
}
