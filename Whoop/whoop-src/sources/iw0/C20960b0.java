package iw0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p409q0.AbstractC29701y;
import p713jm0.AbstractC21789d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iw0.b0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20960b0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f79191E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f79192F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f79193G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f79194H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f79195I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f79196J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79197w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f79198x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f79199y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f79200z;

    public /* synthetic */ C20960b0(C20980l0 c20980l0, int i13, AbstractC29701y abstractC29701y, InterfaceC4339a interfaceC4339a, Function1 function1, boolean z4, boolean z13, int i14, int i15) {
        this.f79194H = c20980l0;
        this.f79200z = i13;
        this.f79195I = abstractC29701y;
        this.f79199y = interfaceC4339a;
        this.f79196J = function1;
        this.f79198x = z4;
        this.f79191E = z13;
        this.f79192F = i14;
        this.f79193G = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f79197w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC20962c0.m58259p((C20980l0) this.f79194H, this.f79200z, (AbstractC29701y) this.f79195I, this.f79199y, (Function1) this.f79196J, this.f79198x, this.f79191E, this.f79192F, this.f79193G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21789d.m61641t(this.f79198x, this.f79199y, this.f79200z, (TextResource) this.f79194H, (String) this.f79195I, (Modifier) this.f79196J, this.f79191E, this.f79192F, this.f79193G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C20960b0(boolean z4, InterfaceC4339a interfaceC4339a, int i13, TextResource textResource, String str, Modifier modifier, boolean z13, int i14, int i15) {
        this.f79198x = z4;
        this.f79199y = interfaceC4339a;
        this.f79200z = i13;
        this.f79194H = textResource;
        this.f79195I = str;
        this.f79196J = modifier;
        this.f79191E = z13;
        this.f79192F = i14;
        this.f79193G = i15;
    }
}
