package p510u0;

import c41.C4014e1;
import java.util.ArrayList;
import java.util.List;
import m83.C25272z;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;

/* JADX INFO: renamed from: u0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C34305c implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public static final C34305c f144055a = new C34305c();

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((InterfaceC39124q0) list.get(i13)).mo448T(j7));
        }
        return interfaceC39133t0.mo86822W(C39169a.m124765i(j7), C39169a.m124764h(j7), C25272z.f99163w, new C4014e1(arrayList, 5));
    }
}
