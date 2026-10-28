package q00;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m83.AbstractC25265s;
import m83.C25272z;
import p292l1.C23151p0;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q00.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C29736r implements InterfaceC39127r0 {
    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 measure, List measurables, long j7) {
        AbstractC22676k.m65750j(measure, "$this$measure");
        AbstractC22676k.m65750j(measurables, "measurables");
        long jM124758b = C39169a.m124758b(j7, 0, 0, 0, 0, 11);
        AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) measurables.get(0)).mo448T(jM124758b);
        AbstractC39104j1 abstractC39104j1Mo448T2 = ((InterfaceC39124q0) measurables.get(2)).mo448T(jM124758b);
        int iM124765i = (C39169a.m124765i(j7) - abstractC39104j1Mo448T.f168211w) - abstractC39104j1Mo448T2.f168211w;
        AbstractC39104j1 abstractC39104j1Mo448T3 = ((InterfaceC39124q0) measurables.get(1)).mo448T(C39169a.m124758b(jM124758b, iM124765i, iM124765i, 0, 0, 12));
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) AbstractC25265s.m74102I0(3, measurables);
        AbstractC39104j1 abstractC39104j1Mo448T4 = interfaceC39124q0 != null ? interfaceC39124q0.mo448T(jM124758b) : null;
        int iMax = Math.max(abstractC39104j1Mo448T.f168212x, Math.max(abstractC39104j1Mo448T3.f168212x, abstractC39104j1Mo448T2.f168212x));
        return measure.mo86822W(C39169a.m124765i(j7), Math.max(C39169a.m124766j(j7), (abstractC39104j1Mo448T4 != null ? abstractC39104j1Mo448T4.f168212x : 0) + iMax), C25272z.f99163w, new C23151p0(abstractC39104j1Mo448T, iMax, abstractC39104j1Mo448T3, abstractC39104j1Mo448T2, abstractC39104j1Mo448T4));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        AbstractC22676k.m65750j(interfaceC39126r, "<this>");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iMo438C = ((InterfaceC39124q0) it.next()).mo438C(i13);
        while (it.hasNext()) {
            int iMo438C2 = ((InterfaceC39124q0) it.next()).mo438C(i13);
            if (iMo438C < iMo438C2) {
                iMo438C = iMo438C2;
            }
        }
        return iMo438C;
    }
}
