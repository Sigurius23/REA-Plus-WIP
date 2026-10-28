package ca3;

import c93.InterfaceC4339a;
import java.util.List;
import java.util.ServiceLoader;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ca3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C4383j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C4383j f17708w = new C4383j();

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C4384k c4384k = C4384k.f17709a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC4385l.class, InterfaceC4385l.class.getClassLoader());
        AbstractC22676k.m65749i(serviceLoaderLoad, "load(...)");
        List listM74093D1 = AbstractC25265s.m74093D1(serviceLoaderLoad);
        if (listM74093D1.isEmpty()) {
            throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return listM74093D1;
    }
}
