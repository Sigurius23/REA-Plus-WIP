package p734sl0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.bot.models.feedback.FeedbackReason;
import iz0.C21054m;
import java.util.List;
import ml0.AbstractC25669a;
import p270k2.InterfaceC22131e;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p715kotlin.jvm.functions.Function1;
import zk0.C40819i0;

/* JADX INFO: renamed from: sl0.u */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32678u implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135596w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135597x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f135598y;

    public /* synthetic */ C32678u(int i13, Object obj, Object obj2) {
        this.f135596w = i13;
        this.f135597x = obj;
        this.f135598y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135596w) {
            case 0:
                return AbstractC32686w.m102499E((C32659q) this.f135597x, (InterfaceC4339a) this.f135598y, (AbstractC25669a) obj);
            case 1:
                return AbstractC32686w.m102496B((C32659q) this.f135597x, (InterfaceC2994c0) this.f135598y, (C28624i0) obj);
            case 2:
                return AbstractC32656p1.m102148t((List) this.f135597x, (Function1) this.f135598y, (InterfaceC26064q) obj);
            case 3:
                return AbstractC32637l2.m101931G((C21054m) this.f135597x, (C40819i0) this.f135598y, (InterfaceC22131e) obj);
            default:
                return AbstractC32681u2.m102453F((Function1) this.f135597x, (FeedbackReason) this.f135598y, ((Boolean) obj).booleanValue());
        }
    }
}
