package d23;

import p144fc.InterfaceC14351g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11513a implements InterfaceC14351g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f37085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f37086b;

    public C11513a(Function1 function1, Function1 function2) {
        this.f37085a = function1;
        this.f37086b = function2;
    }

    @Override // p144fc.InterfaceC14351g
    /* JADX INFO: renamed from: a */
    public final void mo24184a(int i13, float f13, int i14) {
    }

    @Override // p144fc.InterfaceC14351g
    /* JADX INFO: renamed from: b */
    public final void mo24185b(int i13) {
        Function1 function1 = this.f37086b;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i13));
        }
    }

    @Override // p144fc.InterfaceC14351g
    /* JADX INFO: renamed from: c */
    public final void mo19079c(int i13) {
        Function1 function1 = this.f37085a;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i13));
        }
    }
}
