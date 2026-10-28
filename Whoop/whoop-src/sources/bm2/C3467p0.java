package bm2;

import am2.C1034o;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c41.AbstractC4012e;
import c41.EnumC4026g;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.EditProfileBottomSheetKt;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import hy0.EnumC17775o1;
import java.util.List;
import ot2.C28334c;
import p163g1.C15199y3;
import p291l0.InterfaceC22973k1;
import p390p1.InterfaceC28601c1;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import pt2.AbstractC29530l;
import so1.C32810e;
import v41.AbstractC35664f;
import v71.AbstractC35767h;
import v71.C35768i;
import wo1.AbstractC37456k;
import y71.C39274g;

/* JADX INFO: renamed from: bm2.p0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3467p0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f13599E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f13600F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f13601G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f13602H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13603w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f13604x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f13605y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f13606z;

    public /* synthetic */ C3467p0(Modifier modifier, InterfaceC22973k1 interfaceC22973k1, C35768i c35768i, Function1 function1, Function1 function2, Function1 function3, FeatureFlagChecker featureFlagChecker) {
        this.f13603w = 4;
        this.f13606z = modifier;
        this.f13599E = interfaceC22973k1;
        this.f13600F = c35768i;
        this.f13602H = function1;
        this.f13601G = function2;
        this.f13604x = function3;
        this.f13605y = featureFlagChecker;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13603w) {
            case 0:
                return AbstractC3469q0.m10197e((List) this.f13606z, (C3451j0) this.f13599E, (C1034o) this.f13600F, (C3454k0) this.f13601G, (Function1) this.f13602H, (TextResource) this.f13604x, (TextResource) this.f13605y, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC4012e.m12171h((C39274g) this.f13606z, (EnumC4026g) this.f13599E, (TextResource) this.f13604x, (TextResource) this.f13605y, (TextResource) this.f13600F, (EnumC17775o1) this.f13601G, (C39274g) this.f13602H, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$26((Function3) this.f13606z, (EditProfileFormState) this.f13599E, (InterfaceC2994c0) this.f13600F, (C15199y3) this.f13601G, (InterfaceC28601c1) this.f13602H, (InterfaceC28601c1) this.f13604x, (InterfaceC28601c1) this.f13605y, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC29530l.m90302G((C28334c) this.f13606z, (Function1) this.f13602H, (Function1) this.f13599E, (InterfaceC2994c0) this.f13600F, (AbstractC35664f.a) this.f13601G, (InterfaceC28601c1) this.f13604x, (InterfaceC28601c1) this.f13605y, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC35767h.m113353u((Modifier) this.f13606z, (InterfaceC22973k1) this.f13599E, (C35768i) this.f13600F, (Function1) this.f13602H, (Function1) this.f13601G, (Function1) this.f13604x, (FeatureFlagChecker) this.f13605y, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC37456k.m119976m((C32810e) this.f13606z, (InterfaceC39171c) this.f13599E, (Function1) this.f13602H, (Function1) this.f13600F, (InterfaceC28601c1) this.f13601G, (InterfaceC28601c1) this.f13604x, (Function1) this.f13605y, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C3467p0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i13) {
        this.f13603w = i13;
        this.f13606z = obj;
        this.f13599E = obj2;
        this.f13600F = obj3;
        this.f13601G = obj4;
        this.f13602H = obj5;
        this.f13604x = obj6;
        this.f13605y = obj7;
    }

    public /* synthetic */ C3467p0(C28334c c28334c, Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f13603w = 3;
        this.f13606z = c28334c;
        this.f13602H = function1;
        this.f13599E = function2;
        this.f13600F = interfaceC2994c0;
        this.f13601G = aVar;
        this.f13604x = interfaceC28601c1;
        this.f13605y = interfaceC28601c2;
    }

    public /* synthetic */ C3467p0(C32810e c32810e, InterfaceC39171c interfaceC39171c, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function3) {
        this.f13603w = 5;
        this.f13606z = c32810e;
        this.f13599E = interfaceC39171c;
        this.f13602H = function1;
        this.f13600F = function2;
        this.f13601G = interfaceC28601c1;
        this.f13604x = interfaceC28601c2;
        this.f13605y = function3;
    }

    public /* synthetic */ C3467p0(C39274g c39274g, EnumC4026g enumC4026g, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC17775o1 enumC17775o1, C39274g c39274g2) {
        this.f13603w = 1;
        this.f13606z = c39274g;
        this.f13599E = enumC4026g;
        this.f13604x = textResource;
        this.f13605y = textResource2;
        this.f13600F = textResource3;
        this.f13601G = enumC17775o1;
        this.f13602H = c39274g2;
    }
}
