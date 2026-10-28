package ba3;

import aa3.C0652s0;
import p715kotlin.jvm.internal.C22686q;

/* JADX INFO: renamed from: ba3.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2904b extends C22686q {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f11685w = 0;

    static {
        new C2904b(C0652s0.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override // p715kotlin.jvm.internal.C22686q, j93.InterfaceC21490w
    public final Object get(Object obj) {
        return Integer.valueOf(((C0652s0) obj).f2277a);
    }

    @Override // p715kotlin.jvm.internal.C22686q, j93.InterfaceC21477l
    public final void set(Object obj, Object obj2) {
        ((C0652s0) obj).f2277a = ((Number) obj2).intValue();
    }
}
