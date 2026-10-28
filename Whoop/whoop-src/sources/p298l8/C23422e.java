package p298l8;

import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C23422e extends AbstractC23420c {
    public C23422e(AbstractC23420c initialExtras) {
        AbstractC22676k.m65750j(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f92772a;
        AbstractC22676k.m65750j(initialExtras2, "initialExtras");
        this.f92772a.putAll(initialExtras2);
    }

    @Override // p298l8.AbstractC23420c
    /* JADX INFO: renamed from: a */
    public final Object mo67910a(InterfaceC23419b interfaceC23419b) {
        return this.f92772a.get(interfaceC23419b);
    }

    public /* synthetic */ C23422e(int i13) {
        this(C23418a.f92771b);
    }
}
