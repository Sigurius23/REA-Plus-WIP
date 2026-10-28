package w93;

import hb3.InterfaceC17126o;
import java.util.ArrayList;
import ma3.InterfaceC25375d;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import x93.AbstractC38126r;

/* JADX INFO: renamed from: w93.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C36971d implements InterfaceC17126o {

    /* JADX INFO: renamed from: b */
    public static final C36971d f158230b = new C36971d();

    /* JADX INFO: renamed from: c */
    public static final C36971d f158231c = new C36971d();

    @Override // hb3.InterfaceC17126o
    /* JADX INFO: renamed from: a */
    public void mo48367a(InterfaceC31111c descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // hb3.InterfaceC17126o
    /* JADX INFO: renamed from: b */
    public void mo48368b(InterfaceC31117e interfaceC31117e, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC31117e.getName() + ", unresolved classes " + arrayList);
    }

    /* JADX INFO: renamed from: c */
    public C36973f m118692c(InterfaceC25375d javaElement) {
        AbstractC22676k.m65750j(javaElement, "javaElement");
        return new C36973f((AbstractC38126r) javaElement);
    }
}
