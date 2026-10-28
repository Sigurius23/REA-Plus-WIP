package bu2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import e21.AbstractC12598c;
import e21.C12597b;
import p291l0.InterfaceC23004v;
import p294l3.C23281t0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bu2.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3644e implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f14835E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14836w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f14837x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC25312u f14838y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f14839z;

    public /* synthetic */ C3644e(C3643d c3643d, Modifier modifier, float f13, Function1 function1) {
        this.f14838y = c3643d;
        this.f14839z = modifier;
        this.f14837x = f13;
        this.f14835E = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14836w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC3646g.m11244h((C3643d) this.f14838y, (Modifier) this.f14839z, this.f14837x, (Function1) this.f14835E, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC12598c.m35306d((C12597b) this.f14838y, this.f14837x, (C23281t0) this.f14839z, (C2886a) this.f14835E, (InterfaceC23004v) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C3644e(C12597b c12597b, float f13, C23281t0 c23281t0, C2886a c2886a) {
        this.f14838y = c12597b;
        this.f14837x = f13;
        this.f14839z = c23281t0;
        this.f14835E = c2886a;
    }
}
