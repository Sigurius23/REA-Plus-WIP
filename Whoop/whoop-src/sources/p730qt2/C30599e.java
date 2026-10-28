package p730qt2;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.health.platform.client.proto.C1533u;
import androidx.work.impl.WorkDatabase;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.ShippingInfoWidget;
import com.stripe.android.view.StripeEditText;
import com.whoop.android.R;
import com.whoop.design.model.FeatureEducationCtaButton;
import com.whoop.educationModels.StickyButton;
import hu2.InterfaceC17654a;
import j93.InterfaceC21461d;
import java.util.UUID;
import l83.C23454a0;
import l83.C23465k;
import lz2.C24826b;
import ms0.C25928c;
import p132f0.C13821r1;
import p235iz.C21038b;
import p249jc.AbstractC21585k;
import p249jc.C21596v;
import p450r5.RunnableC30928b;
import p507tx.AbstractC34235f;
import p523uh.InterfaceC34959e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p732rs0.AbstractC42792e;
import p733ry2.AbstractC31912a;
import p733ry2.AbstractC31916e;
import p733ry2.AbstractC31917f;
import pu2.C29553a;
import qu2.AbstractC30640h;
import qy0.C30771d;
import qy0.C30775h;
import r20.C30866d;
import r21.C30885c;
import r21.C30886d;
import r51.C30936d;
import r80.AbstractC31062d;
import r80.C31063e;
import r81.AbstractC31066b;
import r81.C31068d;
import r90.AbstractC31101h;
import re1.AbstractC31323j;
import re1.AbstractC31326m;
import rm1.AbstractC31592f;
import ry0.C31906a;
import ry0.C31909d;
import s01.AbstractC32050f;
import s01.C32048d;
import s21.AbstractC32084g;
import s21.C32085h;
import s31.AbstractC32106c;
import s31.C32108e;
import s32.AbstractC32111c;
import s32.C32109a;
import ty2.AbstractC34268a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qt2.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C30599e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125861w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f125862x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f125863y;

    public /* synthetic */ C30599e(int i13, Object obj, Object obj2) {
        this.f125861w = i13;
        this.f125862x = obj;
        this.f125863y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f125861w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f125863y;
        Object obj2 = this.f125862x;
        switch (i13) {
            case 0:
                return AbstractC30600f.m93879h((Function1) obj2, (C30597d) obj);
            case 1:
                return AbstractC30608n.m93926f((Function1) obj2, (C30607m) obj);
            case 2:
                return AbstractC30613s.m93969o((Function1) obj2, (C30612r) obj);
            case 3:
                return AbstractC30618x.m93998h((Function1) obj2, (C30616v) obj);
            case 4:
                return AbstractC30640h.m94057A0((Function1) obj2, (InterfaceC17654a.u) obj);
            case 5:
                return AbstractC30640h.m94136j0((Function1) obj2, (C29553a) obj);
            case 6:
                return C30771d.m94522d((Function1) obj2, (C30775h) obj);
            case 7:
                ((C30866d) obj2).m94923f(obj);
                return c23454a0;
            case 8:
                return C30886d.m94945d((Function1) obj2, (C30885c) obj);
            case 9:
                return AbstractC31062d.m95663m((C31063e) obj, (Function1) obj2);
            case 10:
                return AbstractC31066b.m95699q((Function1) obj2, (C31068d) obj);
            case 11:
                return AbstractC31101h.m95840u((InterfaceC2994c0) obj2, (C13821r1) obj);
            case 12:
                C21596v c21596v = (C21596v) obj2;
                WorkDatabase workDatabase = c21596v.f82807c;
                AbstractC22676k.m65749i(workDatabase, "getWorkDatabase(...)");
                workDatabase.runInTransaction(new RunnableC30928b(5, c21596v, (UUID) obj));
                AbstractC21585k.m60632b(c21596v.f82806b, workDatabase, c21596v.f82809e);
                return c23454a0;
            case 13:
                return ((C30936d) obj2).invoke((WorkDatabase) obj);
            case 14:
                return AbstractC31323j.m96329C((FeatureEducationCtaButton) obj, (Function1) obj2);
            case 15:
                return AbstractC31326m.m96415g((Function1) obj2, (StickyButton) obj);
            case 16:
                return AbstractC37056f.m118958J(new C23465k((InterfaceC34959e) obj2, (InterfaceC21461d) obj));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC31592f.m97395s((InterfaceC4351m) obj2, (InterfaceC25305n) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC42792e.m98723g((C25928c) obj2, (InterfaceC4339a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C31906a.m99188d((Function1) obj2, (C31909d) obj);
            case 20:
                return AbstractC31912a.m99277f((C24826b) obj2, (InterfaceC4339a) obj);
            case 21:
                return AbstractC31916e.m99315O((Function1) obj2, (AbstractC34268a.i) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC31916e.m99342z((Function1) obj2, (AbstractC34268a.c) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC31916e.m99302B((Function1) obj2, (AbstractC34268a.d) obj);
            case 24:
                return Integer.valueOf(AbstractC31917f.m99355m((Function1) obj2, (Integer) obj));
            case 25:
                return AbstractC32050f.m99616t((Function1) obj2, (C32048d) obj);
            case 26:
                return AbstractC32084g.m99803k((Function1) obj2, (C32085h) obj);
            case 27:
                return AbstractC32106c.m99908h((C32108e) obj, (Function1) obj2);
            case 28:
                return AbstractC32111c.m99944m((Function1) obj2, (C32109a) obj);
            default:
                ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) obj;
                int i14 = ShippingInfoWidget.f22560T;
                LayoutInflater.from((Context) obj2).inflate(R.layout.stripe_address_widget, shippingInfoWidget);
                int i15 = R.id.country_autocomplete_aaw;
                CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) AbstractC34235f.m108203J(shippingInfoWidget, R.id.country_autocomplete_aaw);
                if (countryTextInputLayout != null) {
                    i15 = R.id.et_address_line_one_aaw;
                    StripeEditText stripeEditText = (StripeEditText) AbstractC34235f.m108203J(shippingInfoWidget, R.id.et_address_line_one_aaw);
                    if (stripeEditText != null) {
                        i15 = R.id.et_address_line_two_aaw;
                        StripeEditText stripeEditText2 = (StripeEditText) AbstractC34235f.m108203J(shippingInfoWidget, R.id.et_address_line_two_aaw);
                        if (stripeEditText2 != null) {
                            i15 = R.id.et_city_aaw;
                            StripeEditText stripeEditText3 = (StripeEditText) AbstractC34235f.m108203J(shippingInfoWidget, R.id.et_city_aaw);
                            if (stripeEditText3 != null) {
                                i15 = R.id.et_name_aaw;
                                StripeEditText stripeEditText4 = (StripeEditText) AbstractC34235f.m108203J(shippingInfoWidget, R.id.et_name_aaw);
                                if (stripeEditText4 != null) {
                                    i15 = R.id.et_phone_number_aaw;
                                    StripeEditText stripeEditText5 = (StripeEditText) AbstractC34235f.m108203J(shippingInfoWidget, R.id.et_phone_number_aaw);
                                    if (stripeEditText5 != null) {
                                        i15 = R.id.et_postal_code_aaw;
                                        StripeEditText stripeEditText6 = (StripeEditText) AbstractC34235f.m108203J(shippingInfoWidget, R.id.et_postal_code_aaw);
                                        if (stripeEditText6 != null) {
                                            i15 = R.id.et_state_aaw;
                                            StripeEditText stripeEditText7 = (StripeEditText) AbstractC34235f.m108203J(shippingInfoWidget, R.id.et_state_aaw);
                                            if (stripeEditText7 != null) {
                                                i15 = R.id.tl_address_line1_aaw;
                                                TextInputLayout textInputLayout = (TextInputLayout) AbstractC34235f.m108203J(shippingInfoWidget, R.id.tl_address_line1_aaw);
                                                if (textInputLayout != null) {
                                                    i15 = R.id.tl_address_line2_aaw;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) AbstractC34235f.m108203J(shippingInfoWidget, R.id.tl_address_line2_aaw);
                                                    if (textInputLayout2 != null) {
                                                        i15 = R.id.tl_city_aaw;
                                                        TextInputLayout textInputLayout3 = (TextInputLayout) AbstractC34235f.m108203J(shippingInfoWidget, R.id.tl_city_aaw);
                                                        if (textInputLayout3 != null) {
                                                            i15 = R.id.tl_name_aaw;
                                                            TextInputLayout textInputLayout4 = (TextInputLayout) AbstractC34235f.m108203J(shippingInfoWidget, R.id.tl_name_aaw);
                                                            if (textInputLayout4 != null) {
                                                                i15 = R.id.tl_phone_number_aaw;
                                                                TextInputLayout textInputLayout5 = (TextInputLayout) AbstractC34235f.m108203J(shippingInfoWidget, R.id.tl_phone_number_aaw);
                                                                if (textInputLayout5 != null) {
                                                                    i15 = R.id.tl_postal_code_aaw;
                                                                    TextInputLayout textInputLayout6 = (TextInputLayout) AbstractC34235f.m108203J(shippingInfoWidget, R.id.tl_postal_code_aaw);
                                                                    if (textInputLayout6 != null) {
                                                                        i15 = R.id.tl_state_aaw;
                                                                        TextInputLayout textInputLayout7 = (TextInputLayout) AbstractC34235f.m108203J(shippingInfoWidget, R.id.tl_state_aaw);
                                                                        if (textInputLayout7 != null) {
                                                                            return new C21038b(shippingInfoWidget, countryTextInputLayout, stripeEditText, stripeEditText2, stripeEditText3, stripeEditText4, stripeEditText5, stripeEditText6, stripeEditText7, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(shippingInfoWidget.getResources().getResourceName(i15)));
        }
    }

    public /* synthetic */ C30599e(Object obj, Function1 function1, int i13) {
        this.f125861w = i13;
        this.f125863y = obj;
        this.f125862x = function1;
    }
}
