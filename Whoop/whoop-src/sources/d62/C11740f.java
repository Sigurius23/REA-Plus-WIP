package d62;

import android.graphics.Path;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao_Impl;
import java.util.ArrayList;
import l83.C23454a0;
import p000.AbstractC11266d;
import p208i2.C17891j;
import p294l3.C23242a;
import p294l3.C23290y;
import p318m3.C24983m;
import p448r3.AbstractC30895a;
import p500tb.InterfaceC33687a;
import p635y2.AbstractC39101i1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d62.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C11740f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38004w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f38005x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f38006y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f38007z;

    public /* synthetic */ C11740f(int i13, int i14, UserDao_Impl userDao_Impl) {
        this.f38004w = 1;
        this.f38005x = i13;
        this.f38006y = i14;
        this.f38007z = userDao_Impl;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38004w) {
            case 0:
                return AbstractC11741g.m31402K((ArrayList) this.f38007z, this.f38005x, this.f38006y, (AbstractC39101i1) obj);
            case 1:
                return UserDao_Impl.m54775d(this.f38005x, this.f38006y, (UserDao_Impl) this.f38007z, (InterfaceC33687a) obj);
            default:
                C17891j c17891j = (C17891j) this.f38007z;
                C23290y c23290y = (C23290y) obj;
                C23242a c23242a = c23290y.f92270a;
                int iM67387d = c23290y.m67387d(this.f38005x);
                int iM67387d2 = c23290y.m67387d(this.f38006y);
                CharSequence charSequence = c23242a.f92102e;
                if (iM67387d < 0 || iM67387d > iM67387d2 || iM67387d2 > charSequence.length()) {
                    StringBuilder sbM30465s = AbstractC11266d.m30465s(iM67387d, iM67387d2, "start(", ") or end(", ") is out of range [0..");
                    sbM30465s.append(charSequence.length());
                    sbM30465s.append("], or start > end!");
                    AbstractC30895a.m95015a(sbM30465s.toString());
                }
                Path path = new Path();
                C24983m c24983m = c23242a.f92101d;
                c24983m.f97768f.getSelectionPath(iM67387d, iM67387d2, path);
                int i13 = c24983m.f97770h;
                if (i13 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i13);
                }
                C17891j c17891j2 = new C17891j(path);
                c17891j2.m51466m((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c23290y.f92275f)) & 4294967295L));
                c17891j.m51457d(c17891j2, 0L);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C11740f(Object obj, int i13, int i14, int i15) {
        this.f38004w = i15;
        this.f38007z = obj;
        this.f38005x = i13;
        this.f38006y = i14;
    }
}
