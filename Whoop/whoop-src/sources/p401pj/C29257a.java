package p401pj;

import l83.C23454a0;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p305lj.AbstractC24425e0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: pj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C29257a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118393w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f118394x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29257a(int i13, InterfaceC28601c1 interfaceC28601c1) {
        super(1);
        this.f118393w = i13;
        this.f118394x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f118393w) {
            case 0:
                String animatedContent = (String) obj;
                AbstractC22676k.m65750j(animatedContent, "animatedContent");
                this.f118394x.setValue(animatedContent);
                break;
            case 1:
                InterfaceC17886g0 graphicsLayer = (InterfaceC17886g0) obj;
                AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
                ((C17920x0) graphicsLayer).m51551a(((Boolean) this.f118394x.getValue()).booleanValue() ? 100.0f : 0.0f);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f118394x.setValue(bool);
                break;
            default:
                this.f118394x.setValue((AbstractC24425e0) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
