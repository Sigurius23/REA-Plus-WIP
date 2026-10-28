package bs1;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.edit.EditProfileContentKt;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import ds1.C12341k;
import p163g1.C15199y3;
import p164g2.InterfaceC15237i;
import p238j0.InterfaceC21083i;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import tr2.InterfaceC34116n;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: bs1.u */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3602u implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f14613E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f14614F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f14615G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f14616H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f14617I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f14618J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f14619K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f14620L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14621w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f14622x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f14623y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f14624z;

    public /* synthetic */ C3602u(C12341k c12341k, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, AbstractC35664f.a aVar, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
        this.f14613E = c12341k;
        this.f14622x = function1;
        this.f14614F = interfaceC2994c0;
        this.f14615G = c15199y3;
        this.f14616H = aVar;
        this.f14623y = function2;
        this.f14624z = function3;
        this.f14617I = interfaceC28601c1;
        this.f14618J = interfaceC28601c2;
        this.f14619K = interfaceC28601c3;
        this.f14620L = interfaceC28601c4;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14621w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC3583c0.m10752F1((C12341k) this.f14613E, this.f14622x, (InterfaceC2994c0) this.f14614F, (C15199y3) this.f14615G, (AbstractC35664f.a) this.f14616H, this.f14623y, this.f14624z, (InterfaceC28601c1) this.f14617I, (InterfaceC28601c1) this.f14618J, (InterfaceC28601c1) this.f14619K, (InterfaceC28601c1) this.f14620L, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return EditProfileContentKt.EditProfileContent$lambda$4((InterfaceC21083i) this.f14613E, (InterfaceC15237i) this.f14614F, (EditProfileViewState) this.f14615G, this.f14622x, this.f14623y, (EditProfileFormState) this.f14616H, (InterfaceC34116n) this.f14617I, (InterfaceC4351m) this.f14618J, this.f14624z, (InterfaceC4339a) this.f14619K, (InterfaceC4339a) this.f14620L, (InterfaceC4351m) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C3602u(InterfaceC21083i interfaceC21083i, InterfaceC15237i interfaceC15237i, EditProfileViewState editProfileViewState, Function1 function1, Function1 function2, EditProfileFormState editProfileFormState, InterfaceC34116n interfaceC34116n, InterfaceC4351m interfaceC4351m, Function1 function3, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f14613E = interfaceC21083i;
        this.f14614F = interfaceC15237i;
        this.f14615G = editProfileViewState;
        this.f14622x = function1;
        this.f14623y = function2;
        this.f14616H = editProfileFormState;
        this.f14617I = interfaceC34116n;
        this.f14618J = interfaceC4351m;
        this.f14624z = function3;
        this.f14619K = interfaceC4339a;
        this.f14620L = interfaceC4339a2;
    }
}
