package hc3;

import bc3.AbstractC3006f0;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.internal.AbstractC22691v;

/* JADX INFO: renamed from: hc3.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17177j extends AbstractC22691v {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17177j(int i13, int i14, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i13);
        this.f65986w = i14;
    }

    @Override // j93.InterfaceC21488u
    public final Object get() {
        switch (this.f65986w) {
            case 0:
                return this.receiver.getClass().getSimpleName();
            case 1:
                return ((InterfaceC28670t2) this.receiver).getValue();
            case 2:
                return ((InterfaceC28670t2) this.receiver).getValue();
            case 3:
                return ((InterfaceC28670t2) this.receiver).getValue();
            case 4:
                return ((InterfaceC28670t2) this.receiver).getValue();
            case 5:
                return ((InterfaceC28670t2) this.receiver).getValue();
            case 6:
                return ((InterfaceC28670t2) this.receiver).getValue();
            default:
                return ((InterfaceC28670t2) this.receiver).getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17177j(C17178k c17178k) {
        super(c17178k, AbstractC3006f0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.f65986w = 0;
    }
}
