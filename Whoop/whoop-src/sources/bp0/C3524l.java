package bp0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bn0.C3497e;
import c93.InterfaceC4339a;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import dn0.AbstractC12216p;
import l83.InterfaceC23459e;
import p291l0.InterfaceC22997s1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import vy0.C36582j0;

/* JADX INFO: renamed from: bp0.l */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3524l implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f14031E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC23459e f14032F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14033w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f14034x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f14035y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f14036z;

    public /* synthetic */ C3524l(Object obj, Object obj2, float f13, Object obj3, InterfaceC23459e interfaceC23459e, int i13) {
        this.f14033w = i13;
        this.f14035y = obj;
        this.f14036z = obj2;
        this.f14034x = f13;
        this.f14031E = obj3;
        this.f14032F = interfaceC23459e;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14033w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC3531s.m10436O((Modifier) this.f14035y, (C36582j0) this.f14036z, this.f14034x, (CoachEntry) this.f14031E, (InterfaceC4339a) this.f14032F, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC12216p.m33890Q((C3497e) this.f14035y, (Function1) this.f14036z, this.f14034x, (Function1) this.f14031E, (Function1) this.f14032F, ((Integer) obj).intValue(), (Composer) obj2, iIntValue2);
        }
    }
}
