package ep1;

import c93.InterfaceC4339a;
import l72.AbstractC23408o;
import m80.AbstractC25219a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ep1.n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13419n implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46994w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f46995x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f46996y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f46997z;

    public /* synthetic */ C13419n(Function1 function1, Function1 function2, boolean z4, int i13) {
        this.f46994w = i13;
        this.f46995x = function1;
        this.f46996y = function2;
        this.f46997z = z4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f46994w) {
            case 0:
                return AbstractC13422q.m38029Q(this.f46997z, this.f46995x, this.f46996y);
            case 1:
                return AbstractC23408o.m67852j0(this.f46995x, this.f46996y, this.f46997z);
            case 2:
                return AbstractC23408o.m67844f0(this.f46995x, this.f46996y, this.f46997z);
            default:
                return AbstractC25219a.m73856l(this.f46997z, this.f46995x, this.f46996y);
        }
    }

    public /* synthetic */ C13419n(boolean z4, Function1 function1, Function1 function2, int i13) {
        this.f46994w = i13;
        this.f46997z = z4;
        this.f46995x = function1;
        this.f46996y = function2;
    }
}
