package r93;

import bd3.C3119e0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import u93.C34665a0;
import u93.C34673e0;
import va3.C35847e;
import va3.C35848f;
import z93.EnumC40212c;

/* JADX INFO: renamed from: r93.y */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC31166y {

    /* JADX INFO: renamed from: a */
    public static final C3119e0 f128383a = new C3119e0("InvalidModuleNotifier");

    /* JADX INFO: renamed from: a */
    public static final InterfaceC31126h m95883a(InterfaceC31135k interfaceC31135k) {
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31135k.mo60581g();
        if (interfaceC31135kMo60581g == null || (interfaceC31135k instanceof InterfaceC31124g0)) {
            return null;
        }
        if (!(interfaceC31135kMo60581g.mo60581g() instanceof InterfaceC31124g0)) {
            return m95883a(interfaceC31135kMo60581g);
        }
        if (interfaceC31135kMo60581g instanceof InterfaceC31126h) {
            return (InterfaceC31126h) interfaceC31135kMo60581g;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m95884b(InterfaceC31117e interfaceC31117e) {
        AbstractC22676k.m65750j(interfaceC31117e, "<this>");
        return interfaceC31117e.mo60498k() == EnumC31106a0.f128310x && interfaceC31117e.getKind() != EnumC31120f.f128330y;
    }

    /* JADX INFO: renamed from: c */
    public static final void m95885c(C34673e0 c34673e0) {
        if (c34673e0.mo78665r(f128383a) != null) {
            throw new ClassCastException();
        }
        String message = "Accessing invalid module descriptor " + c34673e0;
        AbstractC22676k.m65750j(message, "message");
        throw new InvalidModuleException(message);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC31117e m95886d(InterfaceC31109b0 interfaceC31109b0, C35847e fqName) {
        InterfaceC22712o interfaceC22712oMo60487H;
        EnumC40212c enumC40212c = EnumC40212c.f173637w;
        AbstractC22676k.m65750j(interfaceC31109b0, "<this>");
        AbstractC22676k.m65750j(fqName, "fqName");
        C35848f c35848f = fqName.f152613a;
        if (!c35848f.m113793c()) {
            InterfaceC31126h contributedClassifier = ((C34665a0) interfaceC31109b0.mo78658F(fqName.m113789b())).f146031H.getContributedClassifier(c35848f.m113796g(), enumC40212c);
            InterfaceC31117e interfaceC31117e = contributedClassifier instanceof InterfaceC31117e ? (InterfaceC31117e) contributedClassifier : null;
            if (interfaceC31117e != null) {
                return interfaceC31117e;
            }
            InterfaceC31117e interfaceC31117eM95886d = m95886d(interfaceC31109b0, fqName.m113789b());
            InterfaceC31126h contributedClassifier2 = (interfaceC31117eM95886d == null || (interfaceC22712oMo60487H = interfaceC31117eM95886d.mo60487H()) == null) ? null : interfaceC22712oMo60487H.getContributedClassifier(c35848f.m113796g(), enumC40212c);
            if (contributedClassifier2 instanceof InterfaceC31117e) {
                return (InterfaceC31117e) contributedClassifier2;
            }
        }
        return null;
    }
}
