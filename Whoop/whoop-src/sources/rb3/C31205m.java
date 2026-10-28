package rb3;

import ha3.C17062e;

/* JADX INFO: renamed from: rb3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C31205m extends AbstractC31206n {

    /* JADX INFO: renamed from: d */
    public static final C31205m f128544d = new C31205m("must be a member function", 0);

    /* JADX INFO: renamed from: e */
    public static final C31205m f128545e = new C31205m("must be a member or an extension function", 1);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f128546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31205m(String str, int i13) {
        super(str, 0);
        this.f128546c = i13;
    }

    @Override // rb3.InterfaceC31197e
    /* JADX INFO: renamed from: a */
    public final boolean mo96148a(C17062e c17062e) {
        switch (this.f128546c) {
            case 0:
                return c17062e.f146197K != null;
            default:
                return (c17062e.f146197K == null && c17062e.f146196J == null) ? false : true;
        }
    }
}
