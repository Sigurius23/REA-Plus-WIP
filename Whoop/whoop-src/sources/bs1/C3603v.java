package bs1;

import al0.C0971f;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import b10.C2222b;
import b20.C2321a;
import b20.EnumC2325e;
import bc3.AbstractC3050q0;
import bu1.AbstractC3636b;
import c20.C3873a;
import c21.AbstractC3889b;
import c21.C3891d;
import c31.AbstractC3923g;
import c41.AbstractC4013e0;
import c41.AbstractC4021f1;
import c41.AbstractC4039h5;
import c41.AbstractC4050j2;
import c41.AbstractC4060k5;
import c41.AbstractC4106r2;
import c41.AbstractC4117t;
import c41.AbstractC4133v1;
import c41.AbstractC4162z3;
import c41.C3985a0;
import c41.C3989a4;
import c41.C4020f0;
import c41.C4028g1;
import c41.C4046i5;
import c41.C4064l2;
import c41.C4067l5;
import c41.C4092p2;
import c41.C4103r;
import c41.C4104r0;
import c41.C4118t0;
import c41.C4120t2;
import c41.C4140w1;
import c41.C4141w2;
import c41.C4152y;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.AbstractC4787j;
import ck1.AbstractC4788k;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.paymentsheet.PaymentSheetNextActionHandlers;
import com.whoop.labrador.fragment.LabradorDetailsFragment;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.ProfileHeaderKt;
import com.whoop.profile.view.edit.EditProfileFieldsContentKt;
import com.whoop.profile.view.edit.EditProfileFullScreenModalKt;
import com.whoop.profile.view.edit.EditProfileScreenKt;
import com.whoop.profile.view.edit.GenderSelectionContentKt;
import com.whoop.profile.view.edit.PhysiologicalBaselineSelectionContentKt;
import com.whoop.profile.view.edit.StateSelectionContentKt;
import com.whoop.profile.view.edit.form.ClickableFieldConfig;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import cp0.AbstractC11009x0;
import d11.AbstractC11471f;
import d11.C11474i;
import ds1.C12344n;
import ft1.InterfaceC14770c;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import p114eb.AbstractC12939a0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p442qy.C30766e;
import p479s4.AbstractC32123d;
import p664yy.C39865j;
import p702ch0.C4656v0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;

/* JADX INFO: renamed from: bs1.v */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3603v implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14625w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14626x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f14627y;

    public /* synthetic */ C3603v(int i13, Object obj, Object obj2) {
        this.f14625w = i13;
        this.f14626x = obj;
        this.f14627y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f14625w;
        Object obj = this.f14627y;
        Object obj2 = this.f14626x;
        switch (i13) {
            case 0:
                return AbstractC3583c0.m10843h1((Function1) obj2, (C12344n) obj);
            case 1:
                return AbstractC3585d0.m10925f((AbstractC3589h.b) obj, (Function1) obj2);
            case 2:
                return AbstractC3636b.m11196k((InterfaceC14770c.g) obj, (Function1) obj2);
            case 3:
                Context context = (Context) obj;
                boolean z4 = ((C3873a) obj2).f15851c;
                C25272z c25272z = C25272z.f99163w;
                if (!z4) {
                    return c25272z;
                }
                try {
                    PaymentSheetNextActionHandlers paymentSheetNextActionHandlers = PaymentSheetNextActionHandlers.INSTANCE;
                    Object obj3 = PaymentSheetNextActionHandlers.class.getDeclaredField("INSTANCE").get(null);
                    Object objInvoke = obj3.getClass().getDeclaredMethod("get", null).invoke(obj3, null);
                    AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.collections.Map<java.lang.Class<out com.stripe.android.model.StripeIntent.NextActionData>, @[JvmSuppressWildcards(suppress = <null>)] com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>>");
                    return (Map) objInvoke;
                } catch (Exception e5) {
                    AbstractC22676k.m65750j(context, "context");
                    Context applicationContext = context.getApplicationContext();
                    AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                    C22365e c22365e = AbstractC3050q0.f12077a;
                    ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                    AbstractC32309k.m100574c(executorC22364d);
                    C39865j c39865j = new C39865j(C30766e.f126697b, executorC22364d);
                    C2222b c2222b = new C2222b(applicationContext, C25235a0.f99113w, new C0971f(applicationContext, 1));
                    EnumC2325e enumC2325e = EnumC2325e.PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND;
                    int i14 = StripeException.f22154E;
                    StripeException stripeExceptionM100024d = AbstractC32123d.m100024d(e5);
                    if ((4 & 2) != 0) {
                        stripeExceptionM100024d = null;
                    }
                    C25272z additionalNonPiiParams = (4 & 4) != 0 ? c25272z : null;
                    AbstractC22676k.m65750j(additionalNonPiiParams, "additionalNonPiiParams");
                    c39865j.m127938a(c2222b.mo7052a(enumC2325e, AbstractC25247g0.m73995d0(stripeExceptionM100024d == null ? c25272z : C2321a.m7173b(stripeExceptionM100024d), additionalNonPiiParams)));
                    return c25272z;
                }
            case 4:
                return AbstractC3889b.m11871i((C3891d) obj, (Function1) obj2);
            case 5:
                return AbstractC3923g.m11912g((InterfaceC29805a) obj, (Function1) obj2);
            case 6:
                return AbstractC4117t.m12690g((C4103r) obj, (Function1) obj2);
            case 7:
                return C4152y.m12932d((Function1) obj2, (C3985a0) obj);
            case 8:
                return AbstractC4013e0.m12183g((C4020f0) obj, (Function1) obj2);
            case 9:
                return C4104r0.m12638e((Function1) obj2, (C4118t0) obj);
            case 10:
                return AbstractC4021f1.m12233j((C4028g1) obj, (Function1) obj2);
            case 11:
                return AbstractC4133v1.m12768J((C4140w1) obj, (Function1) obj2);
            case 12:
                return AbstractC4050j2.m12379l((C4064l2) obj, (Function1) obj2);
            case 13:
                return AbstractC4106r2.m12651j((C4092p2) obj, (Function1) obj2);
            case 14:
                return C4120t2.m12698d((Function1) obj2, (C4141w2) obj);
            case 15:
                return AbstractC4162z3.m12993g((C3989a4) obj, (Function1) obj2);
            case 16:
                return AbstractC4039h5.m12314j((C4046i5) obj, (Function1) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC4060k5.m12411h((Function1) obj2, (C4067l5) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC4787j.m15117k((AbstractC4788k) obj, (Function1) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ProfileHeaderKt.ProfileHeader$lambda$2$1$0$1$0$0((ProfileViewState.Metadata) obj, (Function1) obj2);
            case 20:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$0$2$0$0((InterfaceC4351m) obj2, (ClickableFieldConfig) obj);
            case 21:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$1$0$0((Function1) obj2, (EditProfileFormState) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$0$0$0((Function1) obj2, (EditProfileEvent) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EditProfileScreenKt.EditProfileScreen$lambda$25$0((AbstractC12939a0) obj2, (InterfaceC28601c1) obj);
            case 24:
                return GenderSelectionContentKt.GenderSelectionContent$lambda$0$0$0$0((Function1) obj2, (Gender) obj);
            case 25:
                return PhysiologicalBaselineSelectionContentKt.PhysiologicalBaselineSelectionContent$lambda$0$0$0$0((Function1) obj2, (PhysiologicalBaseline) obj);
            case 26:
                return StateSelectionContentKt.StateSelectionContent$lambda$0$0$0$0((Function1) obj2, (EditProfileViewState.State) obj);
            case 27:
                return AbstractC11009x0.m29420C0((C4656v0) obj2, (InterfaceC4339a) obj);
            case 28:
                return LabradorDetailsFragment.m22473f0((LabradorDetailsFragment) obj2, (InterfaceC28670t2) obj);
            default:
                return AbstractC11471f.m30788m((C11474i) obj2, (InterfaceC4339a) obj);
        }
    }

    public /* synthetic */ C3603v(Object obj, Function1 function1, int i13) {
        this.f14625w = i13;
        this.f14627y = obj;
        this.f14626x = function1;
    }
}
