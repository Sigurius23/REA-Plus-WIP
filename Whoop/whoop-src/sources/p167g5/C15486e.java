package p167g5;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g5.e */
/* JADX INFO: loaded from: classes.dex */
public class C15486e implements InterfaceC15485d {

    /* JADX INFO: renamed from: w */
    public final Object[] f58142w;

    /* JADX INFO: renamed from: x */
    public int f58143x;

    public C15486e(int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f58142w = new Object[i13];
    }

    @Override // p167g5.InterfaceC15485d
    /* JADX INFO: renamed from: a */
    public boolean mo43683a(Object instance) {
        Object[] objArr;
        boolean z4;
        AbstractC22676k.m65750j(instance, "instance");
        int i13 = this.f58143x;
        int i14 = 0;
        while (true) {
            objArr = this.f58142w;
            if (i14 >= i13) {
                z4 = false;
                break;
            }
            if (objArr[i14] == instance) {
                z4 = true;
                break;
            }
            i14++;
        }
        if (z4) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i15 = this.f58143x;
        if (i15 >= objArr.length) {
            return false;
        }
        objArr[i15] = instance;
        this.f58143x = i15 + 1;
        return true;
    }

    @Override // p167g5.InterfaceC15485d
    /* JADX INFO: renamed from: b */
    public Object mo43684b() {
        int i13 = this.f58143x;
        if (i13 <= 0) {
            return null;
        }
        int i14 = i13 - 1;
        Object[] objArr = this.f58142w;
        Object obj = objArr[i14];
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i14] = null;
        this.f58143x--;
        return obj;
    }
}
