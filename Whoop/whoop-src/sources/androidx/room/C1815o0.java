package androidx.room;

import c93.InterfaceC4339a;
import com.whoop.design.models.items.TrackedBehaviorModel;
import mo1.AbstractC25748c;
import p31.AbstractC28803n;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;

/* JADX INFO: renamed from: androidx.room.o0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1815o0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7136w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f7137x;

    public /* synthetic */ C1815o0(InterfaceC4339a interfaceC4339a, int i13) {
        this.f7136w = i13;
        this.f7137x = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f7136w) {
            case 0:
                AbstractC22676k.m65750j((InterfaceC33687a) it, "it");
                return this.f7137x.invoke();
            case 1:
                return AbstractC25748c.m75965c(this.f7137x, (TrackedBehaviorModel) it);
            case 2:
                return AbstractC28803n.m87600I(this.f7137x, it);
            case 3:
                return AbstractC33199m0.m105220L(this.f7137x, it);
            default:
                AbstractC22676k.m65750j(it, "it");
                return this.f7137x.invoke();
        }
    }
}
