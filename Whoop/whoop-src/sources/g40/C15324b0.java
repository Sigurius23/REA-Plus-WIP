package g40;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25272z;
import p163g1.C14968c;
import p635y2.AbstractC39083d;
import p635y2.AbstractC39104j1;
import p635y2.C39111m;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p635y2.InterfaceC39151z0;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15324b0 implements InterfaceC39151z0 {

    /* JADX INFO: renamed from: a */
    public static final C15324b0 f57582a = new C15324b0();

    @Override // p635y2.InterfaceC39151z0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo43536a(InterfaceC39133t0 Layout, List list, long j7) {
        AbstractC22676k.m65750j(Layout, "$this$Layout");
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        if (list2.size() != 1) {
            throw new IllegalArgumentException("startContentMeasurables should only emit one composable");
        }
        if (list3.size() != 1) {
            throw new IllegalArgumentException("textContentMeasurables should only emit one composable");
        }
        AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) AbstractC25265s.m74096F0(list2)).mo448T(C39169a.m124758b(j7, 0, Integer.MAX_VALUE, 0, 0, 12));
        int iM124765i = C39169a.m124765i(j7) - abstractC39104j1Mo448T.f168211w;
        AbstractC39104j1 abstractC39104j1Mo448T2 = ((InterfaceC39124q0) AbstractC25265s.m74096F0(list3)).mo448T(C39169a.m124758b(j7, iM124765i, iM124765i, 0, 0, 12));
        C39111m c39111m = AbstractC39083d.f168140a;
        if (abstractC39104j1Mo448T2.mo450c0(c39111m) == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("textContentPlaceable should have a first baseline");
        }
        int iMo450c0 = (int) (((double) abstractC39104j1Mo448T2.mo450c0(c39111m)) * 1.2d);
        int iAbs = Math.abs(abstractC39104j1Mo448T.f168212x - iMo450c0) / 2;
        int i13 = abstractC39104j1Mo448T.f168211w + abstractC39104j1Mo448T2.f168211w;
        int i14 = abstractC39104j1Mo448T.f168212x;
        return Layout.mo86822W(i13, iMo450c0 > i14 ? Math.max(i14 + iAbs, abstractC39104j1Mo448T2.f168212x) : Math.max(i14, abstractC39104j1Mo448T2.f168212x + iAbs), C25272z.f99163w, new C14968c(iMo450c0, abstractC39104j1Mo448T, iAbs, abstractC39104j1Mo448T2));
    }
}
