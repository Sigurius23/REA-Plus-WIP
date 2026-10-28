package o31;

import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o31.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C27512c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110782w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f110783x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f110784y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C27514e f110785z;

    public /* synthetic */ C27512c(Function1 function1, InterfaceC28601c1 interfaceC28601c1, C27514e c27514e) {
        this.f110783x = function1;
        this.f110784y = interfaceC28601c1;
        this.f110785z = c27514e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110782w) {
            case 0:
                return AbstractC27513d.m82934i(this.f110785z, this.f110784y, this.f110783x, ((Boolean) obj).booleanValue());
            default:
                return AbstractC27513d.m82935j(this.f110783x, this.f110784y, this.f110785z, obj);
        }
    }

    public /* synthetic */ C27512c(C27514e c27514e, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        this.f110785z = c27514e;
        this.f110784y = interfaceC28601c1;
        this.f110783x = function1;
    }
}
