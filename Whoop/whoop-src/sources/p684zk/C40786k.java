package p684zk;

import p586wk.EnumC37323a;

/* JADX INFO: renamed from: zk.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C40786k {

    /* JADX INFO: renamed from: b */
    public static final C40786k f175891b = new C40786k(0);

    /* JADX INFO: renamed from: c */
    public static final C40786k f175892c = new C40786k(1);

    /* JADX INFO: renamed from: d */
    public static final C40786k f175893d = new C40786k(2);

    /* JADX INFO: renamed from: e */
    public static final C40786k f175894e = new C40786k(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175895a;

    public /* synthetic */ C40786k(int i13) {
        this.f175895a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m132286a(EnumC37323a enumC37323a) {
        switch (this.f175895a) {
            case 0:
                return enumC37323a == EnumC37323a.f159582x;
            case 1:
                return false;
            case 2:
                return (enumC37323a == EnumC37323a.f159583y || enumC37323a == EnumC37323a.f159579E) ? false : true;
            default:
                return enumC37323a == EnumC37323a.f159582x;
        }
    }
}
