package androidx.room;

import a33.C0352d;
import be.C3151d;
import c93.InterfaceC4353o;
import c93.InterfaceC4354p;
import ec3.C13068n1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import g40.C15317a;
import l83.C23454a0;
import n00.C26083k;
import p631xz.C38747x;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import x30.C37928t;

/* JADX INFO: renamed from: androidx.room.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C1844y implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7216w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f7217x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f7218y;

    public /* synthetic */ C1844y(int i13, Object obj, Object obj2) {
        this.f7216w = i13;
        this.f7217x = obj;
        this.f7218y = obj2;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        switch (this.f7216w) {
            case 0:
                Object objCollect = ((InterfaceC13058l) this.f7217x).collect(new C1841x(0, interfaceC13062m, (String[]) this.f7218y), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            case 1:
                Object objCollect2 = ((InterfaceC13058l) this.f7217x).collect(new C1841x(2, interfaceC13062m, this.f7218y), interfaceC30057d);
                return objCollect2 == EnumC31071a.f128113w ? objCollect2 : C23454a0.f92919a;
            case 2:
                Object objM41038a = AbstractC14371b.m41038a(C13068n1.f45159w, interfaceC13062m, new C3151d((InterfaceC30057d) null, this.f7218y, 1), interfaceC30057d, (InterfaceC13058l[]) this.f7217x);
                return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
            case 3:
                InterfaceC13058l[] interfaceC13058lArr = (InterfaceC13058l[]) this.f7217x;
                Object objM41038a2 = AbstractC14371b.m41038a(new C15317a(interfaceC13058lArr, 7), interfaceC13062m, new C3151d((InterfaceC30057d) null, (C0352d) this.f7218y, 2), interfaceC30057d, interfaceC13058lArr);
                return objM41038a2 == EnumC31071a.f128113w ? objM41038a2 : C23454a0.f92919a;
            case 4:
                Object objCollect3 = ((InterfaceC13058l) this.f7217x).collect(new C1841x(11, interfaceC13062m, (C26083k) this.f7218y), interfaceC30057d);
                return objCollect3 == EnumC31071a.f128113w ? objCollect3 : C23454a0.f92919a;
            case 5:
                InterfaceC13058l[] interfaceC13058lArr2 = (InterfaceC13058l[]) this.f7217x;
                Object objM41038a3 = AbstractC14371b.m41038a(new C15317a(interfaceC13058lArr2, 13), interfaceC13062m, new C3151d((InterfaceC30057d) null, (InterfaceC4353o) this.f7218y, 4), interfaceC30057d, interfaceC13058lArr2);
                return objM41038a3 == EnumC31071a.f128113w ? objM41038a3 : C23454a0.f92919a;
            case 6:
                InterfaceC13058l[] interfaceC13058lArr3 = (InterfaceC13058l[]) this.f7217x;
                Object objM41038a4 = AbstractC14371b.m41038a(new C15317a(interfaceC13058lArr3, 14), interfaceC13062m, new C3151d((InterfaceC30057d) null, (InterfaceC4354p) this.f7218y, 5), interfaceC30057d, interfaceC13058lArr3);
                return objM41038a4 == EnumC31071a.f128113w ? objM41038a4 : C23454a0.f92919a;
            case 7:
                InterfaceC13058l[] interfaceC13058lArr4 = (InterfaceC13058l[]) this.f7217x;
                Object objM41038a5 = AbstractC14371b.m41038a(new C15317a(interfaceC13058lArr4, 16), interfaceC13062m, new C3151d((InterfaceC30057d) null, (C37928t) this.f7218y, 10), interfaceC30057d, interfaceC13058lArr4);
                return objM41038a5 == EnumC31071a.f128113w ? objM41038a5 : C23454a0.f92919a;
            default:
                Object objCollect4 = ((InterfaceC13058l) this.f7217x).collect(new C1841x(23, interfaceC13062m, (C38747x) this.f7218y), interfaceC30057d);
                return objCollect4 == EnumC31071a.f128113w ? objCollect4 : C23454a0.f92919a;
        }
    }
}
