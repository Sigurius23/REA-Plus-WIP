package p554vk;

import ad3.C0783z;
import p093dl.C12135d;
import p093dl.C12137e;
import p093dl.C12161z;
import p093dl.InterfaceC12155t;
import p093dl.InterfaceC12156u;
import p121el.C13307a;
import ud3.C34826l0;
import ud3.InterfaceC34819i;

/* JADX INFO: renamed from: vk.b */
/* JADX INFO: loaded from: classes.dex */
public final class C36074b implements InterfaceC12156u {

    /* JADX INFO: renamed from: c */
    public static volatile C34826l0 f154055c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154056a;

    /* JADX INFO: renamed from: b */
    public final Object f154057b;

    public C36074b(int i13) {
        this.f154056a = i13;
        switch (i13) {
            case 1:
                this.f154057b = new C12137e(1);
                return;
            case 2:
                this.f154057b = new C0783z(8);
                return;
            default:
                if (f154055c == null) {
                    synchronized (C36074b.class) {
                        try {
                            if (f154055c == null) {
                                f154055c = new C34826l0();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                this.f154057b = f154055c;
                return;
        }
    }

    @Override // p093dl.InterfaceC12156u
    /* JADX INFO: renamed from: a */
    public final InterfaceC12155t mo33589a(C12161z c12161z) {
        switch (this.f154056a) {
            case 0:
                return new C12135d((InterfaceC34819i) this.f154057b, 3);
            case 1:
                return new C12135d((C12137e) this.f154057b, 1);
            default:
                return new C13307a((C0783z) this.f154057b);
        }
    }
}
