package cu2;

import androidx.compose.runtime.Composer;
import com.whoop.weightlifting.AbstractC10757a;
import com.whoop.weightlifting.StrengthTrainerDestination;
import fi0.InterfaceC14515a;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: cu2.m */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11133m implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC21159o0 f35534E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35535w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC14515a f35536x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12991u0 f35537y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC12939a0 f35538z;

    public /* synthetic */ C11133m(C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, InterfaceC14515a interfaceC14515a) {
        this.f35537y = c12991u0;
        this.f35538z = abstractC12939a0;
        this.f35534E = interfaceC21159o0;
        this.f35536x = interfaceC14515a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f35535w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC10757a.m28141E(this.f35537y, this.f35538z, this.f35534E, this.f35536x, (StrengthTrainerDestination.C10742e.a) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC10757a.m28146J(this.f35536x, this.f35537y, this.f35538z, this.f35534E, (StrengthTrainerDestination.C10744g.a) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C11133m(InterfaceC14515a interfaceC14515a, C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0) {
        this.f35536x = interfaceC14515a;
        this.f35537y = c12991u0;
        this.f35538z = abstractC12939a0;
        this.f35534E = interfaceC21159o0;
    }
}
