package b30;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g40.AbstractC15376j4;
import g40.InterfaceC15391m3;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p390p1.C28655q;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;

/* JADX INFO: renamed from: b30.x2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2654x2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10368w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10369x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10370y;

    public C2654x2(InterfaceC15391m3 interfaceC15391m3, boolean z4) {
        this.f10368w = 2;
        this.f10370y = interfaceC15391m3;
        this.f10369x = z4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.f10368w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC1090b.m3351f(this.f10369x, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, null, null, AbstractC37817c.m121344e(409471539, composer, new C2557k2((C37816b) this.f10370y, 2)), composer, 196656, 28);
                    }
                } else {
                    AbstractC1090b.m3351f(this.f10369x, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, null, null, AbstractC37817c.m121344e(409471539, composer, new C2557k2((C37816b) this.f10370y, 2)), composer, 196656, 28);
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        if (this.f10369x) {
                            str = "";
                        } else {
                            str = (String) this.f10370y;
                        }
                        AbstractC15011f9.m43114b(str, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, composer2, 48, 0, 130556);
                    }
                } else {
                    if (this.f10369x) {
                        str = (String) this.f10370y;
                    } else {
                        str = "";
                    }
                    AbstractC15011f9.m43114b(str, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, composer2, 48, 0, 130556);
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer3;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC15376j4.m43587c((InterfaceC15391m3) this.f10370y, this.f10369x, 6, null, null, 0, 0, null, false, false, composer3, 384, MessageListItemViewType.UNREAD_SEPARATOR);
                    }
                } else {
                    AbstractC15376j4.m43587c((InterfaceC15391m3) this.f10370y, this.f10369x, 6, null, null, 0, 0, null, false, false, composer3, 384, MessageListItemViewType.UNREAD_SEPARATOR);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2654x2(boolean z4, Object obj, int i13) {
        this.f10368w = i13;
        this.f10369x = z4;
        this.f10370y = obj;
    }
}
