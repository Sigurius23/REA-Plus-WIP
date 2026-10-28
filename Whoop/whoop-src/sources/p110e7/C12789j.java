package p110e7;

import android.health.connect.HealthConnectManager;
import android.health.connect.RecordIdFilter;
import bc3.C3033m;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import n83.C26460c;
import p027b3.AbstractC2378g1;
import p029b5.C2726e;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e7.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C12789j extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC21461d f43767E;

    /* JADX INFO: renamed from: w */
    public List f43768w;

    /* JADX INFO: renamed from: x */
    public int f43769x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12797r f43770y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ List f43771z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12789j(C12797r c12797r, List list, InterfaceC21461d interfaceC21461d, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f43770y = c12797r;
        this.f43771z = list;
        this.f43767E = interfaceC21461d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C12789j(this.f43770y, this.f43771z, this.f43767E, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C12789j) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC21461d interfaceC21461d;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f43769x;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = this.f43768w;
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        List list2 = this.f43771z;
        this.f43768w = list2;
        this.f43769x = 1;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(this));
        c3033m.m8774s();
        C12797r c12797r = this.f43770y;
        HealthConnectManager healthConnectManager = c12797r.f43797d;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        Iterator<E> it = C25271y.f99162w.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            interfaceC21461d = this.f43767E;
            if (!zHasNext) {
                break;
            }
            c26460cM119000x.add(RecordIdFilter.fromId(AbstractC2378g1.m7317E(interfaceC21461d), (String) it.next()));
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            c26460cM119000x.add(RecordIdFilter.fromClientRecordId(AbstractC2378g1.m7317E(interfaceC21461d), (String) it3.next()));
        }
        healthConnectManager.deleteRecords(AbstractC37056f.m118988k(c26460cM119000x), c12797r.f43795b, new C2726e(c3033m));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
        return objM8773r == enumC31071a ? enumC31071a : objM8773r;
    }
}
