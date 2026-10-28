package p007a6;

import a11.C0129g;
import c93.InterfaceC4339a;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a6.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0441m0 implements InterfaceC0421f1 {

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f1512d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public static final Object f1513e = new Object();

    /* JADX INFO: renamed from: a */
    public final InterfaceC0465y0 f1514a;

    /* JADX INFO: renamed from: b */
    public final Function1 f1515b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4339a f1516c;

    public C0441m0(InterfaceC0465y0 interfaceC0465y0, InterfaceC4339a interfaceC4339a) {
        C0129g c0129g = new C0129g(1);
        this.f1514a = interfaceC0465y0;
        this.f1515b = c0129g;
        this.f1516c = interfaceC4339a;
    }

    @Override // p007a6.InterfaceC0421f1
    /* JADX INFO: renamed from: a */
    public final InterfaceC0424g1 mo1101a() throws IOException {
        File canonicalFile = ((File) this.f1516c.invoke()).getCanonicalFile();
        synchronized (f1513e) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = f1512d;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            AbstractC22676k.m65747g(absolutePath);
            linkedHashSet.add(absolutePath);
        }
        return new C0447p0(canonicalFile, this.f1514a, (C0415d1) this.f1515b.invoke(canonicalFile), new C0438l0(canonicalFile, 0));
    }
}
