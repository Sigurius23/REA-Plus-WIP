package rb3;

import ha3.C17062e;

/* JADX INFO: renamed from: rb3.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C31217y extends AbstractC31206n {

    /* JADX INFO: renamed from: d */
    public static final C31217y f128583d = new C31217y("must have no value parameters", 0);

    /* JADX INFO: renamed from: e */
    public static final C31217y f128584e = new C31217y("must have a single value parameter", 1);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f128585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31217y(String str, int i13) {
        super(str, 1);
        this.f128585c = i13;
    }

    @Override // rb3.InterfaceC31197e
    /* JADX INFO: renamed from: a */
    public final boolean mo96148a(C17062e c17062e) {
        switch (this.f128585c) {
            case 0:
                return c17062e.mo78676v().isEmpty();
            default:
                return c17062e.mo78676v().size() == 1;
        }
    }
}
