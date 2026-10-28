package p306ll;

import gl.C15959x;
import p283kl.C22553b;
import p283kl.C22558g;
import p586wk.C37330h;
import p684zk.InterfaceC40801z;
import tl.AbstractC33902a;

/* JADX INFO: renamed from: ll.c */
/* JADX INFO: loaded from: classes.dex */
public final class C24500c implements InterfaceC24498a {

    /* JADX INFO: renamed from: x */
    public static final C24500c f95557x = new C24500c(0);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95558w;

    public /* synthetic */ C24500c(int i13) {
        this.f95558w = i13;
    }

    @Override // p306ll.InterfaceC24498a
    /* JADX INFO: renamed from: t */
    public final InterfaceC40801z mo714t(InterfaceC40801z interfaceC40801z, C37330h c37330h) {
        switch (this.f95558w) {
            case 0:
                return interfaceC40801z;
            default:
                return new C15959x(AbstractC33902a.m107252b(((C22558g) ((C22553b) interfaceC40801z.get()).f88726w.f7566b).m65285a()));
        }
    }
}
