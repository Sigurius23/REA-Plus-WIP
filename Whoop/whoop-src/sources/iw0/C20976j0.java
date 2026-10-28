package iw0;

import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4339a;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iw0.j0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20976j0 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f79250E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f79251F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79252w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f79253x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f79254y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f79255z;

    public /* synthetic */ C20976j0(C20980l0 c20980l0, boolean z4, Modifier modifier, Function1 function1, boolean z13) {
        this.f79250E = c20980l0;
        this.f79253x = z4;
        this.f79251F = modifier;
        this.f79254y = function1;
        this.f79255z = z13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79252w) {
            case 0:
                return AbstractC20978k0.m58315l((C20980l0) this.f79250E, this.f79253x, (Modifier) this.f79251F, this.f79254y, this.f79255z, (InterfaceC26064q) obj);
            default:
                return new C23196w3(this.f79253x, (InterfaceC4339a) this.f79250E, (InterfaceC4339a) this.f79251F, (EnumC23202x3) obj, this.f79254y, this.f79255z);
        }
    }

    public /* synthetic */ C20976j0(boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, boolean z13) {
        this.f79253x = z4;
        this.f79250E = interfaceC4339a;
        this.f79251F = interfaceC4339a2;
        this.f79254y = function1;
        this.f79255z = z13;
    }
}
