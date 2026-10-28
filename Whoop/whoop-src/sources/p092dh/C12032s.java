package p092dh;

import android.os.Build;
import gh.C15845n;
import mh.C25545m;
import ne3.InterfaceC26620j;

/* JADX INFO: renamed from: dh.s */
/* JADX INFO: loaded from: classes.dex */
public final class C12032s implements InterfaceC12022i {
    @Override // p092dh.InterfaceC12022i
    /* JADX INFO: renamed from: a */
    public final InterfaceC12023j mo33147a(C15845n c15845n, C25545m c25545m) {
        InterfaceC26620j interfaceC26620jMo33152d1 = c15845n.f59848a.mo33152d1();
        if (!interfaceC26620jMo33152d1.mo79202d0(0L, AbstractC12031r.f39785b) && !interfaceC26620jMo33152d1.mo79202d0(0L, AbstractC12031r.f39784a) && (!interfaceC26620jMo33152d1.mo79202d0(0L, AbstractC12031r.f39786c) || !interfaceC26620jMo33152d1.mo79202d0(8L, AbstractC12031r.f39787d) || !interfaceC26620jMo33152d1.mo79202d0(12L, AbstractC12031r.f39788e) || !interfaceC26620jMo33152d1.request(17L) || ((byte) (interfaceC26620jMo33152d1.mo79205f().m79229s(16L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !interfaceC26620jMo33152d1.mo79202d0(4L, AbstractC12031r.f39789f)) {
                return null;
            }
            if (!interfaceC26620jMo33152d1.mo79202d0(8L, AbstractC12031r.f39790g) && !interfaceC26620jMo33152d1.mo79202d0(8L, AbstractC12031r.f39791h) && !interfaceC26620jMo33152d1.mo79202d0(8L, AbstractC12031r.f39792i)) {
                return null;
            }
        }
        return new C12036w(c15845n.f59848a, c25545m);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C12032s;
    }

    public final int hashCode() {
        return C12032s.class.hashCode();
    }
}
