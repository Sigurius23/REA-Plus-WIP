package l80;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import c93.InterfaceC4356r;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l80.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23429f implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f92805E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28670t2 f92806F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92807w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f92808x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f92809y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f92810z;

    public /* synthetic */ C23429f(Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f92807w = i13;
        this.f92808x = function1;
        this.f92809y = function2;
        this.f92810z = function3;
        this.f92805E = interfaceC4356r;
        this.f92806F = interfaceC28670t2;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f92807w) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                return AbstractC23437n.m67924J(this.f92808x, this.f92809y, this.f92810z, (InterfaceC4356r) this.f92805E, this.f92806F, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj4).intValue();
                return AbstractC23437n.m67966m0(this.f92808x, this.f92809y, this.f92810z, (InterfaceC4356r) this.f92805E, this.f92806F, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj4).intValue();
                return AbstractC23437n.m67932R(this.f92808x, this.f92809y, this.f92810z, (InterfaceC4356r) this.f92805E, this.f92806F, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj4).intValue();
                return AbstractC23437n.m67923I(this.f92808x, this.f92809y, this.f92810z, this.f92806F, (InterfaceC28670t2) this.f92805E, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue4);
        }
    }

    public /* synthetic */ C23429f(Function1 function1, Function1 function2, Function1 function3, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3) {
        this.f92807w = 3;
        this.f92808x = function1;
        this.f92809y = function2;
        this.f92810z = function3;
        this.f92806F = interfaceC28670t2;
        this.f92805E = interfaceC28670t3;
    }
}
