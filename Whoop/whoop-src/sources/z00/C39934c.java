package z00;

import ad3.AbstractC0757c;
import ad3.C0775r;
import com.stripe.android.model.ConsentUi;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionRefresh;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.model.LinkAuthIntent;
import org.json.JSONException;
import org.json.JSONObject;
import p474s.AbstractC32004s;
import p505ts.AbstractC34132o;
import p565vy.InterfaceC36562b;
import p598wy.InterfaceC37689b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yz1.C39913g;

/* JADX INFO: renamed from: z00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C39934c implements InterfaceC37689b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172383w;

    /* JADX INFO: renamed from: x */
    public final C0775r f172384x;

    public C39934c(int i13) {
        this.f172383w = i13;
        switch (i13) {
            case 1:
                this.f172384x = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C39913g(3));
                break;
            default:
                this.f172384x = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C39913g(2));
                break;
        }
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public final InterfaceC36562b mo8011m(JSONObject jSONObject) throws JSONException {
        DisplayablePaymentDetails displayablePaymentDetails;
        LinkAuthIntent linkAuthIntent;
        switch (this.f172383w) {
            case 0:
                boolean z4 = false;
                if (jSONObject.has("exists") && jSONObject.optBoolean("exists", false)) {
                    z4 = true;
                }
                boolean z13 = z4;
                ConsumerSession consumerSessionM128097a = C39933b.m128097a(jSONObject);
                String strM99551t = AbstractC32004s.m99551t("error_message", jSONObject);
                String strM99551t2 = AbstractC32004s.m99551t("publishable_key", jSONObject);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("displayable_payment_details");
                ConsentUi consentUi = null;
                if (jSONObjectOptJSONObject != null) {
                    displayablePaymentDetails = new DisplayablePaymentDetails(AbstractC32004s.m99551t("default_card_brand", jSONObjectOptJSONObject), AbstractC32004s.m99551t("default_payment_type", jSONObjectOptJSONObject), AbstractC32004s.m99551t("last_4", jSONObjectOptJSONObject), !jSONObjectOptJSONObject.has("number_of_saved_payment_details") ? null : Long.valueOf(jSONObjectOptJSONObject.optLong("number_of_saved_payment_details")));
                } else {
                    displayablePaymentDetails = null;
                }
                String strM99551t3 = AbstractC32004s.m99551t("consent_ui", jSONObject);
                if (strM99551t3 != null) {
                    C0775r c0775r = this.f172384x;
                    c0775r.getClass();
                    consentUi = (ConsentUi) c0775r.m1831b(ConsentUi.Companion.serializer(), strM99551t3);
                }
                return new ConsumerSessionLookup(z13, consumerSessionM128097a, strM99551t, strM99551t2, displayablePaymentDetails, consentUi, AbstractC32004s.m99551t("suggested_email", jSONObject));
            default:
                ConsumerSession consumerSessionM128097a2 = C39933b.m128097a(jSONObject);
                AbstractC22676k.m65747g(consumerSessionM128097a2);
                String strM99551t4 = AbstractC32004s.m99551t("link_auth_intent", jSONObject);
                if (strM99551t4 != null) {
                    C0775r c0775r2 = this.f172384x;
                    c0775r2.getClass();
                    linkAuthIntent = (LinkAuthIntent) c0775r2.m1831b(LinkAuthIntent.Companion.serializer(), strM99551t4);
                } else {
                    linkAuthIntent = null;
                }
                return new ConsumerSessionRefresh(consumerSessionM128097a2, linkAuthIntent);
        }
    }
}
