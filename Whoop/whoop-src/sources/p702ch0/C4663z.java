package p702ch0;

import bc3.InterfaceC2994c0;
import com.whoop.p057ai.chat.models.TurnFeedback;
import p163g1.C15199y3;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ch0.z */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4663z implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f19083E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19084w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f19085x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f19086y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f19087z;

    public /* synthetic */ C4663z(C4650s0 c4650s0, C4642o0 c4642o0, Function1 function1, String str) {
        this.f19084w = 2;
        this.f19086y = c4650s0;
        this.f19087z = c4642o0;
        this.f19085x = function1;
        this.f19083E = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19084w) {
            case 0:
                return AbstractC4609c0.m14297O(this.f19085x, (Function1) this.f19086y, (Function1) this.f19087z, (String) this.f19083E, obj);
            case 1:
                return Function1.m14400I(this.f19085x, (InterfaceC2994c0) this.f19086y, (C15199y3) this.f19087z, (InterfaceC28601c1) this.f19083E, (TurnFeedback) obj);
            default:
                return AbstractC4646q0.m14605t((C4650s0) this.f19086y, (C4642o0) this.f19087z, this.f19085x, (String) this.f19083E, (C28624i0) obj);
        }
    }

    public /* synthetic */ C4663z(Function1 function1, Object obj, Object obj2, Object obj3, int i13) {
        this.f19084w = i13;
        this.f19085x = function1;
        this.f19086y = obj;
        this.f19087z = obj2;
        this.f19083E = obj3;
    }
}
