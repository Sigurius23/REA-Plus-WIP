package pg3;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: pg3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C29193j implements InterfaceC29187g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118181w;

    /* JADX INFO: renamed from: x */
    public final Type f118182x;

    public /* synthetic */ C29193j(int i13, Type type) {
        this.f118181w = i13;
        this.f118182x = type;
    }

    @Override // pg3.InterfaceC29187g
    public final Object adapt(InterfaceC29182e interfaceC29182e) {
        switch (this.f118181w) {
            case 0:
                C29174b0 c29174b0 = (C29174b0) interfaceC29182e;
                C29195k c29195k = new C29195k(c29174b0);
                c29174b0.mo88673R0(new C29191i(c29195k, 0));
                return c29195k;
            default:
                C29174b0 c29174b1 = (C29174b0) interfaceC29182e;
                C29195k c29195k2 = new C29195k(c29174b1);
                c29174b1.mo88673R0(new C29191i(c29195k2, 1));
                return c29195k2;
        }
    }

    @Override // pg3.InterfaceC29187g
    public final Type responseType() {
        switch (this.f118181w) {
            case 0:
                break;
        }
        return this.f118182x;
    }
}
