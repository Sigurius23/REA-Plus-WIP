package cp0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4353o;
import com.whoop.stress.domain.model.StressCustomizationDrawerItem;
import f31.C14044a;
import nj2.AbstractC26755b;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import pj2.AbstractC29318q;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: cp0.k1 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10973k1 implements InterfaceC4353o {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f34129E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f34130F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34131w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f34132x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f34133y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f34134z;

    public /* synthetic */ C10973k1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f34131w = i13;
        this.f34132x = obj;
        this.f34133y = obj2;
        this.f34134z = obj3;
        this.f34129E = obj4;
        this.f34130F = obj5;
    }

    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34131w) {
            case 0:
                return AbstractC10979m1.m29265q((Function1) this.f34132x, (Function1) this.f34133y, (Function1) this.f34134z, (Function1) this.f34129E, (Function1) this.f34130F, (InterfaceC4339a) obj, (InterfaceC4339a) obj2, (InterfaceC4339a) obj3, (String) obj4, ((Boolean) obj5).booleanValue());
            default:
                return AbstractC29318q.m89160o0((AbstractC26755b.a) this.f34132x, (InterfaceC2994c0) this.f34133y, (AbstractC35664f.a) this.f34134z, (InterfaceC28601c1) this.f34129E, (InterfaceC28601c1) this.f34130F, (InterfaceC1103a) obj, (StressCustomizationDrawerItem) obj2, (C14044a) obj3, (Composer) obj4, ((Integer) obj5).intValue());
        }
    }
}
