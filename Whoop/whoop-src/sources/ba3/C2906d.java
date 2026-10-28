package ba3;

import aa3.C0603a1;
import p715kotlin.jvm.internal.C22686q;

/* JADX INFO: renamed from: ba3.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2906d extends C22686q {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f11687w = 0;

    static {
        new C2906d(C0603a1.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override // p715kotlin.jvm.internal.C22686q, j93.InterfaceC21490w
    public final Object get(Object obj) {
        return Integer.valueOf(((C0603a1) obj).f2148a);
    }

    @Override // p715kotlin.jvm.internal.C22686q, j93.InterfaceC21477l
    public final void set(Object obj, Object obj2) {
        ((C0603a1) obj).f2148a = ((Number) obj2).intValue();
    }
}
