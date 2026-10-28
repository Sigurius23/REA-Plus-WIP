package w20;

import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g40.AbstractC15376j4;
import l83.C23454a0;
import p026b2.C2314t;
import p097ds.AbstractC12314q;
import p390p1.C28655q;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: w20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C36728r implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157222w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36736z f157223x;

    public /* synthetic */ C36728r(C36736z c36736z, int i13) {
        this.f157222w = i13;
        this.f157223x = c36736z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157222w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC12314q.m34328h(AbstractC30060g.m92103Y(composer, this.f157223x.f157243d), AbstractC1136a.m3599a(C2314t.f9131w, "TEST_TAG_CVC_LABEL"), false, composer, 48, 4);
                    }
                } else {
                    AbstractC12314q.m34328h(AbstractC30060g.m92103Y(composer, this.f157223x.f157243d), AbstractC1136a.m3599a(C2314t.f9131w, "TEST_TAG_CVC_LABEL"), false, composer, 48, 4);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC15376j4.m43592h(this.f157223x.f157244e, false, null, composer2, 48, 4);
                    }
                } else {
                    AbstractC15376j4.m43592h(this.f157223x.f157244e, false, null, composer2, 48, 4);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
