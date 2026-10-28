package i11;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p291l0.InterfaceC22965i;
import p712j91.InterfaceC21430b;
import p715kotlin.jvm.functions.Function1;
import p745y81.InterfaceC39332e;
import y71.C39274g;

/* JADX INFO: renamed from: i11.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17859b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f69480E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f69481F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f69482G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f69483H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f69484I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f69485J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f69486K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f69487L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f69488M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object f69489N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Object f69490O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Object f69491P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Object f69492Q;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69493w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f69494x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f69495y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f69496z;

    public /* synthetic */ C17859b(Modifier modifier, EnumC27269n0 enumC27269n0, TextResource textResource, C39274g c39274g, C39274g c39274g2, boolean z4, InterfaceC39332e interfaceC39332e, InterfaceC21430b interfaceC21430b, boolean z13, boolean z14, Float f13, Object obj, Function1 function1, int i13, int i14, int i15) {
        this.f69494x = modifier;
        this.f69486K = enumC27269n0;
        this.f69495y = textResource;
        this.f69487L = c39274g;
        this.f69488M = c39274g2;
        this.f69496z = z4;
        this.f69489N = interfaceC39332e;
        this.f69490O = interfaceC21430b;
        this.f69480E = z13;
        this.f69481F = z14;
        this.f69491P = f13;
        this.f69492Q = obj;
        this.f69482G = function1;
        this.f69483H = i13;
        this.f69484I = i14;
        this.f69485J = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69493w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17862e.m51361t(this.f69494x, this.f69496z, (InterfaceC22965i) this.f69486K, this.f69495y, this.f69480E, this.f69481F, (String) this.f69487L, (String) this.f69488M, (GenericInteraction) this.f69489N, (GenericInteraction) this.f69490O, (GenericInteraction) this.f69491P, (C17864g) this.f69492Q, this.f69482G, this.f69483H, this.f69484I, this.f69485J, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC27265l0.m82225q(this.f69494x, (EnumC27269n0) this.f69486K, this.f69495y, (C39274g) this.f69487L, (C39274g) this.f69488M, this.f69496z, (InterfaceC39332e) this.f69489N, (InterfaceC21430b) this.f69490O, this.f69480E, this.f69481F, (Float) this.f69491P, this.f69492Q, this.f69482G, this.f69483H, this.f69484I, this.f69485J, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C17859b(Modifier modifier, boolean z4, InterfaceC22965i interfaceC22965i, TextResource textResource, boolean z13, boolean z14, String str, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, C17864g c17864g, Function1 function1, int i13, int i14, int i15) {
        this.f69494x = modifier;
        this.f69496z = z4;
        this.f69486K = interfaceC22965i;
        this.f69495y = textResource;
        this.f69480E = z13;
        this.f69481F = z14;
        this.f69487L = str;
        this.f69488M = str2;
        this.f69489N = genericInteraction;
        this.f69490O = genericInteraction2;
        this.f69491P = genericInteraction3;
        this.f69492Q = c17864g;
        this.f69482G = function1;
        this.f69483H = i13;
        this.f69484I = i14;
        this.f69485J = i15;
    }
}
