package ce3;

import c93.InterfaceC4339a;
import java.io.IOException;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17922y0;

/* JADX INFO: renamed from: ce3.h */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C4507h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18158w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f18159x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18160y;

    public /* synthetic */ C4507h(Object obj, long j7, int i13) {
        this.f18158w = i13;
        this.f18160y = obj;
        this.f18159x = j7;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        boolean z4;
        switch (this.f18158w) {
            case 0:
                C4516q c4516q = (C4516q) this.f18160y;
                long j7 = this.f18159x;
                synchronized (c4516q) {
                    long j13 = c4516q.f18192M;
                    long j14 = c4516q.f18191L;
                    if (j13 < j14) {
                        z4 = true;
                    } else {
                        c4516q.f18191L = j14 + 1;
                        z4 = false;
                    }
                }
                if (!z4) {
                    try {
                        c4516q.f18203X.m14165s(1, 0, false);
                    } catch (IOException e5) {
                        EnumC4496a enumC4496a = EnumC4496a.PROTOCOL_ERROR;
                        c4516q.m14133b(enumC4496a, enumC4496a, e5);
                    }
                    break;
                } else {
                    EnumC4496a enumC4496a2 = EnumC4496a.PROTOCOL_ERROR;
                    c4516q.m14133b(enumC4496a2, enumC4496a2, null);
                    j7 = -1;
                }
                return Long.valueOf(j7);
            default:
                return ((AbstractC17922y0) ((AbstractC17911t) this.f18160y)).mo29549b(this.f18159x);
        }
    }
}
