package gf;

import java.util.Set;
import m83.C25235a0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C15768i implements InterfaceC15761b {

    /* JADX INFO: renamed from: w */
    public static final C15768i f59433w = new C15768i();

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: a */
    public final Set mo33081a() {
        return C25235a0.f99113w;
    }

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: b */
    public final Object mo33082b(C15760a key) {
        AbstractC22676k.m65750j(key, "key");
        return null;
    }

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: d */
    public final boolean mo33084d(C15760a key) {
        AbstractC22676k.m65750j(key, "key");
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC15761b) && ((InterfaceC15761b) obj).isEmpty();
    }

    @Override // gf.InterfaceC15761b
    public final boolean isEmpty() {
        return true;
    }
}
