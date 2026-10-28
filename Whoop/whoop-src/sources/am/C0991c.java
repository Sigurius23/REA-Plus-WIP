package am;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25272z;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;

/* JADX INFO: renamed from: am.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C0991c implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f3720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC0996h f3721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f3722c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EnumC0995g f3723d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ EnumC0995g f3724e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ EnumC0989a f3725f;

    public C0991c(float f13, EnumC0996h enumC0996h, float f14, EnumC0995g enumC0995g, EnumC0995g enumC0995g2, EnumC0989a enumC0989a) {
        EnumC0994f enumC0994f = EnumC0994f.f3743w;
        this.f3720a = f13;
        this.f3721b = enumC0996h;
        this.f3722c = f14;
        this.f3723d = enumC0995g;
        this.f3724e = enumC0995g2;
        this.f3725f = enumC0989a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m2679f(ArrayList arrayList, C22665e0 c22665e0, InterfaceC39133t0 interfaceC39133t0, float f13, ArrayList arrayList2, ArrayList arrayList3, C22665e0 c22665e1, ArrayList arrayList4, C22665e0 c22665e2, C22665e0 c22665e3) {
        if (!arrayList.isEmpty()) {
            c22665e0.f89334w = interfaceC39133t0.mo724F(f13) + c22665e0.f89334w;
        }
        arrayList.add(AbstractC25265s.m74093D1(arrayList2));
        arrayList3.add(Integer.valueOf(c22665e1.f89334w));
        arrayList4.add(Integer.valueOf(c22665e0.f89334w));
        c22665e0.f89334w += c22665e1.f89334w;
        c22665e2.f89334w = Math.max(c22665e2.f89334w, c22665e3.f89334w);
        arrayList2.clear();
        c22665e3.f89334w = 0;
        c22665e1.f89334w = 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x007b  */
    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 Layout, List measurables, long j7) {
        AbstractC22676k.m65750j(Layout, "$this$Layout");
        AbstractC22676k.m65750j(measurables, "measurables");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C22665e0 c22665e0 = new C22665e0();
        C22665e0 c22665e1 = new C22665e0();
        ArrayList arrayList4 = new ArrayList();
        C22665e0 c22665e2 = new C22665e0();
        C22665e0 c22665e3 = new C22665e0();
        EnumC0994f enumC0994f = EnumC0994f.f3743w;
        int iM124767k = C39169a.m124767k(j7);
        int iM124765i = C39169a.m124765i(j7);
        int iM124766j = C39169a.m124766j(j7);
        long jM124770b = AbstractC39170b.m124770b(iM124765i, 0, 13);
        Iterator it = measurables.iterator();
        while (it.hasNext()) {
            AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) it.next()).mo448T(jM124770b);
            boolean zIsEmpty = arrayList4.isEmpty();
            long j13 = jM124770b;
            float f13 = this.f3720a;
            if (!zIsEmpty) {
                int iMo724F = Layout.mo724F(f13) + c22665e2.f89334w;
                EnumC0994f enumC0994f2 = EnumC0994f.f3743w;
                if (abstractC39104j1Mo448T.f168211w + iMo724F > iM124765i) {
                    m2679f(arrayList, c22665e1, Layout, this.f3722c, arrayList4, arrayList2, c22665e3, arrayList3, c22665e0, c22665e2);
                }
            }
            if (!arrayList4.isEmpty()) {
                c22665e2.f89334w = Layout.mo724F(f13) + c22665e2.f89334w;
            }
            arrayList4.add(abstractC39104j1Mo448T);
            int i13 = c22665e2.f89334w;
            EnumC0994f enumC0994f3 = EnumC0994f.f3743w;
            c22665e2.f89334w = abstractC39104j1Mo448T.f168211w + i13;
            c22665e3.f89334w = Math.max(c22665e3.f89334w, abstractC39104j1Mo448T.f168212x);
            jM124770b = j13;
        }
        if (!arrayList4.isEmpty()) {
            m2679f(arrayList, c22665e1, Layout, this.f3722c, arrayList4, arrayList2, c22665e3, arrayList3, c22665e0, c22665e2);
        }
        if (iM124765i == Integer.MAX_VALUE || this.f3721b != EnumC0996h.f3749x) {
            iM124765i = Math.max(c22665e0.f89334w, iM124767k);
        }
        int i14 = iM124765i;
        int iMax = Math.max(c22665e1.f89334w, iM124766j);
        EnumC0994f enumC0994f4 = EnumC0994f.f3743w;
        return Layout.mo86822W(i14, iMax, C25272z.f99163w, new C0990b(arrayList, Layout, this.f3720a, this.f3723d, this.f3724e, i14, this.f3725f, arrayList2, arrayList3));
    }
}
