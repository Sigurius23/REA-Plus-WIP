package hb3;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p390p1.InterfaceC28599c;
import r93.InterfaceC31155s0;
import sa3.C32334h;
import sa3.InterfaceC32332f;
import va3.C35847e;

/* JADX INFO: renamed from: hb3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17104a0 implements InterfaceC28599c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65704w;

    /* JADX INFO: renamed from: x */
    public final Object f65705x;

    /* JADX INFO: renamed from: y */
    public final Object f65706y;

    /* JADX INFO: renamed from: z */
    public Object f65707z;

    public AbstractC17104a0(InterfaceC32332f interfaceC32332f, C32334h c32334h, InterfaceC31155s0 interfaceC31155s0) {
        this.f65704w = 0;
        this.f65705x = interfaceC32332f;
        this.f65706y = c32334h;
        this.f65707z = interfaceC31155s0;
    }

    /* JADX INFO: renamed from: c */
    public static void m48351c(ArrayList arrayList, int i13, int i14, int i15) {
        int i16 = i13 > i14 ? i14 : i14 - i15;
        if (i15 != 1) {
            List listSubList = arrayList.subList(i13, i15 + i13);
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(listSubList);
            listSubList.clear();
            arrayList.addAll(i16, arrayListM74097F1);
            return;
        }
        if (i13 == i14 + 1 || i13 == i14 - 1) {
            arrayList.set(i13, arrayList.set(i14, arrayList.get(i13)));
        } else {
            arrayList.add(i16, arrayList.remove(i13));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m48352a() {
        ((ArrayList) this.f65706y).clear();
        this.f65707z = this.f65705x;
        mo752j();
    }

    /* JADX INFO: renamed from: b */
    public abstract C35847e mo48353b();

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: i */
    public Object mo703i() {
        return this.f65707z;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo752j();

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: l */
    public void mo706l(Object obj) {
        ((ArrayList) this.f65706y).add(this.f65707z);
        this.f65707z = obj;
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: p */
    public void mo710p() {
        ArrayList arrayList = (ArrayList) this.f65706y;
        this.f65707z = arrayList.remove(arrayList.size() - 1);
    }

    public String toString() {
        switch (this.f65704w) {
            case 0:
                return getClass().getSimpleName() + ": " + mo48353b();
            default:
                return super.toString();
        }
    }

    public AbstractC17104a0(Object obj) {
        this.f65704w = 1;
        this.f65705x = obj;
        this.f65706y = new ArrayList();
        this.f65707z = obj;
    }
}
