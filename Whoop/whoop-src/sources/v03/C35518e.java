package v03;

import u03.InterfaceC34393a;

/* JADX INFO: renamed from: v03.e */
/* JADX INFO: loaded from: classes11.dex */
public final class C35518e implements InterfaceC35517d, InterfaceC34393a {

    /* JADX INFO: renamed from: x */
    public static final C35518e f151136x = new C35518e(null);

    /* JADX INFO: renamed from: w */
    public final Object f151137w;

    public C35518e(Object obj) {
        this.f151137w = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C35518e m112679a(Object obj) {
        if (obj != null) {
            return new C35518e(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        return this.f151137w;
    }
}
