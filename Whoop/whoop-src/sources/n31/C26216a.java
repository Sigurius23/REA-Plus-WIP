package n31;

import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: n31.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C26216a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103935w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f103936x;

    public /* synthetic */ C26216a(Object obj, int i13) {
        this.f103935w = i13;
        this.f103936x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f103935w) {
            case 0:
                return AbstractC26217b.m77850s((Function1) this.f103936x, obj);
            case 1:
                return AbstractC26217b.m77853v((Function1) this.f103936x, obj);
            default:
                return AbstractC26223h.m77882i((InterfaceC28601c1) this.f103936x, (String) obj);
        }
    }
}
