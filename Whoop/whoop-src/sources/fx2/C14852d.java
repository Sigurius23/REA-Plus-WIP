package fx2;

import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fx2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C14852d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55429w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14855g f55430x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ProtocolStepResult f55431y;

    public /* synthetic */ C14852d(C14855g c14855g, ProtocolStepResult protocolStepResult, int i13) {
        this.f55429w = i13;
        this.f55430x = c14855g;
        this.f55431y = protocolStepResult;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55429w) {
            case 0:
                return this.f55430x.m42833W0(this.f55431y, (InterfaceC33687a) obj);
            default:
                return this.f55430x.m42841a1(this.f55431y, (InterfaceC33687a) obj);
        }
    }
}
