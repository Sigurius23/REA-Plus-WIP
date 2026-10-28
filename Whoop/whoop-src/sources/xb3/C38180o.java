package xb3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import m83.AbstractC25269w;
import p002a0.C0053t0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xb3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C38180o implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163486a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC38174i f163487b;

    /* JADX INFO: renamed from: c */
    public final Object f163488c;

    public /* synthetic */ C38180o(InterfaceC38174i interfaceC38174i, Object obj, int i13) {
        this.f163486a = i13;
        this.f163487b = interfaceC38174i;
        this.f163488c = obj;
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        switch (this.f163486a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f163487b.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                AbstractC25269w.m74166l0(arrayList, (Comparator) this.f163488c);
                return arrayList.iterator();
            case 1:
                return new C38183r(this);
            default:
                return new C0053t0(this);
        }
    }

    public C38180o(InterfaceC38174i sequence, Function1 function1) {
        this.f163486a = 1;
        AbstractC22676k.m65750j(sequence, "sequence");
        this.f163487b = sequence;
        this.f163488c = function1;
    }
}
