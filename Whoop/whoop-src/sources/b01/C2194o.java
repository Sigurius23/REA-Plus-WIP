package b01;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bb2.AbstractC2933i;
import bm.InterfaceC3389m;
import c93.InterfaceC4352n;
import com.whoop.universalcheckout.features.AbstractC10635a;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import h02.AbstractC16563b0;
import h02.C16565c0;
import java.util.List;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p409q0.InterfaceC29694r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import t21.AbstractC33349g;
import t21.C33346d;
import uz1.AbstractC35436n;
import uz1.C35437o;
import za2.C40241q;
import zk2.AbstractC40844e;

/* JADX INFO: renamed from: b01.o */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2194o implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8712w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f8713x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f8714y;

    public /* synthetic */ C2194o(int i13, Object obj, Object obj2) {
        this.f8712w = i13;
        this.f8713x = obj;
        this.f8714y = obj2;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f8712w) {
            case 0:
                return AbstractC2195p.m6901C((List) this.f8713x, (Function1) this.f8714y, (InterfaceC2189j) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return AbstractC2933i.m8561o((C40241q) this.f8713x, (Function3) this.f8714y, (InterfaceC3389m) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                return AbstractC16563b0.m46905m((List) this.f8713x, (C16565c0) this.f8714y, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 3:
                return AbstractC10635a.m27563x((Function3) this.f8713x, (UniversalCheckoutDestination) this.f8714y, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 4:
                return AbstractC33349g.m105768y((C33346d) this.f8713x, (Modifier) this.f8714y, (InterfaceC3764o) obj, (String) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 5:
                return AbstractC35436n.m112483l((C35437o) this.f8713x, (Function1) this.f8714y, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return AbstractC40844e.m132365j((Function3) this.f8714y, (List) this.f8713x, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
        }
    }

    public /* synthetic */ C2194o(Function3 function3, List list) {
        this.f8712w = 6;
        this.f8714y = function3;
        this.f8713x = list;
    }
}
