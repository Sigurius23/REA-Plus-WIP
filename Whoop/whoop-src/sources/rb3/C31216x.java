package rb3;

import ha3.C17062e;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: rb3.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C31216x extends AbstractC31206n {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f128581c = 1;

    /* JADX INFO: renamed from: d */
    public final int f128582d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C31216x(int i13) {
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "must have at least ", " value parameter");
        sbM30466t.append(i13 > 1 ? "s" : "");
        super(sbM30466t.toString(), 1);
        this.f128582d = i13;
    }

    @Override // rb3.InterfaceC31197e
    /* JADX INFO: renamed from: a */
    public final boolean mo96148a(C17062e c17062e) {
        switch (this.f128581c) {
            case 0:
                return c17062e.mo78676v().size() >= this.f128582d;
            default:
                return c17062e.mo78676v().size() == this.f128582d;
        }
    }

    public C31216x() {
        super("must have exactly 2 value parameters", 1);
        this.f128582d = 2;
    }
}
