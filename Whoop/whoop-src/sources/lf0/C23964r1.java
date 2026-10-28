package lf0;

import c93.InterfaceC4339a;
import java.util.List;
import p077d0.C11344e;
import p715kotlin.time.Duration;
import ug.C34913b;

/* JADX INFO: renamed from: lf0.r1 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C23964r1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94642w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f94643x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f94644y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f94645z;

    public /* synthetic */ C23964r1(C11344e c11344e, List list, long j7) {
        this.f94644y = c11344e;
        this.f94645z = list;
        this.f94643x = j7;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f94642w) {
            case 0:
                return AbstractC23968s1.m70639k((C11344e) this.f94644y, (List) this.f94645z, this.f94643x);
            default:
                return "client clock (" + ((C34913b) this.f94644y) + ") is skewed " + ((Object) Duration.m134302toStringimpl(this.f94643x)) + " from the server (" + ((C34913b) this.f94645z) + "), applying correction";
        }
    }

    public /* synthetic */ C23964r1(C34913b c34913b, long j7, C34913b c34913b2) {
        this.f94644y = c34913b;
        this.f94643x = j7;
        this.f94645z = c34913b2;
    }
}
