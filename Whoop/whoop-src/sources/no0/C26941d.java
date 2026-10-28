package no0;

import c31.EnumC3919c;
import java.util.List;
import lo0.C24571b0;
import lo0.C24590l;
import p291l0.C23000t1;
import p292l1.C23196w3;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: no0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26941d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107461w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f107462x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f107463y;

    public /* synthetic */ C26941d(int i13, Object obj, Object obj2) {
        this.f107461w = i13;
        this.f107462x = obj;
        this.f107463y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107461w) {
            case 0:
                return AbstractC26943e.m80468d((Function1) this.f107462x, (InterfaceC25312u) this.f107463y, obj);
            case 1:
                return AbstractC26971s.m80772A((C24590l) this.f107463y, C23000t1.f90727a, (Function1) this.f107462x, (EnumC3919c) obj);
            case 2:
                return AbstractC26933a0.m80406k((C24571b0.b.C41960b) this.f107463y, (Function1) this.f107462x, (InterfaceC26064q) obj);
            case 3:
                return AbstractC26958l0.m80592F0((List) this.f107462x, (InterfaceC28601c1) this.f107463y, (InterfaceC26064q) obj);
            case 4:
                return AbstractC26958l0.m80636b0((Long) this.f107463y, (Function1) this.f107462x, obj);
            case 5:
                return AbstractC26958l0.m80608N0((C23196w3) this.f107462x, (InterfaceC28601c1) this.f107463y, (Throwable) obj);
            case 6:
                return AbstractC26962n0.m80719u((C24571b0.b.e) this.f107463y, (Function1) this.f107462x, (List) obj);
            default:
                return AbstractC26966p0.m80763t((String) this.f107463y, (Function1) this.f107462x, (String) obj);
        }
    }

    public /* synthetic */ C26941d(Object obj, Function1 function1, int i13) {
        this.f107461w = i13;
        this.f107463y = obj;
        this.f107462x = function1;
    }
}
