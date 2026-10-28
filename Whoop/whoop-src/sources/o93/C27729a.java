package o93;

import c93.InterfaceC4339a;
import java.util.ServiceLoader;
import kb3.C22342k;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o93.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C27729a implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C27729a f111777x = new C27729a(0);

    /* JADX INFO: renamed from: y */
    public static final C27729a f111778y = new C27729a(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111779w;

    public /* synthetic */ C27729a(int i13) {
        this.f111779w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f111779w) {
            case 0:
                C27730b c27730b = C27730b.f111780a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC27731c.class, InterfaceC27731c.class.getClassLoader());
                AbstractC22676k.m65747g(serviceLoaderLoad);
                InterfaceC27731c interfaceC27731c = (InterfaceC27731c) AbstractC25265s.m74098G0(serviceLoaderLoad);
                if (interfaceC27731c != null) {
                    return interfaceC27731c;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                C27733e c27733e = new C27733e(new C22342k("DefaultBuiltIns"));
                c27733e.m83815c(false);
                return c27733e;
        }
    }
}
