package bm2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.archv2.feature.domain.C6005m;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.navigation.ProfileNavigationRouter;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.edit.EditProfileContentKt;
import com.whoop.profile.view.edit.EditProfileFieldsContentKt;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import com.whoop.profile.view.navigation.ProfileNavHostKt;
import com.whoop.universalcheckout.features.AbstractC10635a;
import j02.EnumC21177x0;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p715kotlin.jvm.functions.Function1;
import p739ui0.AbstractC35012n;
import p745y81.InterfaceC39332e;
import qi0.C30406a;
import qi0.C30409d;
import to2.AbstractC34023a;
import tr2.InterfaceC34116n;
import ul2.EnumC35069b;
import v41.AbstractC35676l;
import v41.EnumC35673j0;
import v41.EnumC35675k0;
import v41.EnumC35677l0;

/* JADX INFO: renamed from: bm2.f1 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3440f1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f13470E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f13471F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f13472G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f13473H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f13474I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f13475J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f13476K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f13477L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f13478M;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13479w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f13480x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f13481y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f13482z;

    public /* synthetic */ C3440f1(TextResource textResource, TextResource textResource2, TextResource textResource3, Enum r10, TextResource textResource4, Enum r14, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, Enum r15, int i13, int i14, int i15) {
        this.f13479w = i15;
        this.f13482z = textResource;
        this.f13470E = textResource2;
        this.f13471F = textResource3;
        this.f13474I = r10;
        this.f13472G = textResource4;
        this.f13475J = r14;
        this.f13476K = interfaceC39332e;
        this.f13473H = textResource5;
        this.f13477L = interfaceC39332e2;
        this.f13478M = r15;
        this.f13480x = i13;
        this.f13481y = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13479w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3455k1.m10116v((TextResource) this.f13482z, (TextResource) this.f13470E, (TextResource) this.f13471F, (EnumC3477u0) this.f13474I, (TextResource) this.f13472G, (EnumC35069b) this.f13475J, (InterfaceC39332e) this.f13476K, (TextResource) this.f13473H, (InterfaceC39332e) this.f13477L, (EnumC3479v0) this.f13478M, this.f13480x, this.f13481y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return EditProfileContentKt.EditProfileMainContent$lambda$3((EditProfileViewState) this.f13482z, (EditProfileFormState) this.f13470E, (InterfaceC34116n) this.f13471F, (Function1) this.f13472G, (Function1) this.f13473H, (InterfaceC4351m) this.f13474I, (InterfaceC4351m) this.f13475J, (Function1) this.f13476K, (InterfaceC4339a) this.f13477L, (InterfaceC4339a) this.f13478M, this.f13480x, this.f13481y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$7((Modifier) this.f13482z, (EditProfileViewState) this.f13470E, (EditProfileFormState) this.f13471F, (InterfaceC34116n) this.f13472G, (Function1) this.f13473H, (InterfaceC4351m) this.f13474I, (InterfaceC4351m) this.f13475J, (Function1) this.f13476K, (InterfaceC4339a) this.f13477L, (InterfaceC4339a) this.f13478M, this.f13480x, this.f13481y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC10635a.m27560u((C12991u0) this.f13482z, (AbstractC12939a0) this.f13470E, (AbstractActivityC1340r0) this.f13471F, (String) this.f13472G, (String) this.f13473H, (String) this.f13474I, (String) this.f13475J, (String) this.f13476K, (EnumC21177x0) this.f13477L, (String) this.f13478M, this.f13480x, this.f13481y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC34023a.m107606m((String) this.f13482z, (String) this.f13470E, (String) this.f13471F, (String) this.f13472G, (String) this.f13473H, (EnumC21177x0) this.f13474I, (AbstractC12939a0) this.f13475J, (AbstractC12939a0) this.f13476K, (AbstractActivityC1340r0) this.f13477L, (C12982q) this.f13478M, this.f13480x, this.f13481y, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC35012n.m110601w((C30409d) this.f13482z, (C30406a) this.f13470E, (ApiRequest) this.f13471F, (String) this.f13472G, (ScreenAnalyticEventModel) this.f13473H, (String) this.f13474I, (CachePolicyModel) this.f13475J, (GenericInteraction) this.f13476K, (C6005m) this.f13477L, (InterfaceC4351m) this.f13478M, this.f13480x, this.f13481y, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC35676l.m113014n((TextResource) this.f13482z, (TextResource) this.f13470E, (TextResource) this.f13471F, (EnumC35673j0) this.f13474I, (TextResource) this.f13472G, (EnumC35677l0) this.f13475J, (InterfaceC39332e) this.f13476K, (TextResource) this.f13473H, (InterfaceC39332e) this.f13477L, (EnumC35675k0) this.f13478M, this.f13480x, this.f13481y, (Composer) obj, iIntValue7);
            default:
                int iIntValue8 = ((Integer) obj2).intValue();
                return ProfileNavHostKt.ProfileNavHost$lambda$1((ProfileNavigationRouter) this.f13482z, (ProfileActionRouter) this.f13470E, (C12991u0) this.f13471F, (InterfaceC34116n) this.f13472G, (String) this.f13473H, (AbstractActivityC1340r0) this.f13474I, (String) this.f13475J, (Integer) this.f13476K, (Integer) this.f13477L, (String) this.f13478M, this.f13480x, this.f13481y, (Composer) obj, iIntValue8);
        }
    }

    public /* synthetic */ C3440f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i13, int i14, int i15) {
        this.f13479w = i15;
        this.f13482z = obj;
        this.f13470E = obj2;
        this.f13471F = obj3;
        this.f13472G = obj4;
        this.f13473H = obj5;
        this.f13474I = obj6;
        this.f13475J = obj7;
        this.f13476K = obj8;
        this.f13477L = obj9;
        this.f13478M = obj10;
        this.f13480x = i13;
        this.f13481y = i14;
    }
}
