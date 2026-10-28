package x30;

import ad3.AbstractC0767j;
import ad3.AbstractC0770m;
import androidx.core.app.NotificationCompat;
import com.stripe.android.p056ui.core.elements.AddressSpec;
import com.stripe.android.p056ui.core.elements.AffirmTextSpec;
import com.stripe.android.p056ui.core.elements.AfterpayClearpayTextSpec;
import com.stripe.android.p056ui.core.elements.AuBankAccountNumberSpec;
import com.stripe.android.p056ui.core.elements.AuBecsDebitMandateTextSpec;
import com.stripe.android.p056ui.core.elements.BsbSpec;
import com.stripe.android.p056ui.core.elements.CountrySpec;
import com.stripe.android.p056ui.core.elements.DropdownSpec;
import com.stripe.android.p056ui.core.elements.EmailSpec;
import com.stripe.android.p056ui.core.elements.EmptyFormSpec;
import com.stripe.android.p056ui.core.elements.FormItemSpec;
import com.stripe.android.p056ui.core.elements.IbanSpec;
import com.stripe.android.p056ui.core.elements.KlarnaHeaderStaticTextSpec;
import com.stripe.android.p056ui.core.elements.MandateTextSpec;
import com.stripe.android.p056ui.core.elements.NameSpec;
import com.stripe.android.p056ui.core.elements.PlaceholderSpec;
import com.stripe.android.p056ui.core.elements.SepaMandateTextSpec;
import com.stripe.android.p056ui.core.elements.SimpleTextSpec;
import com.stripe.android.p056ui.core.elements.StaticTextSpec;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;

/* JADX INFO: renamed from: x30.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37935w0 extends AbstractC0767j {

    /* JADX INFO: renamed from: c */
    public static final C37935w0 f162401c = new C37935w0(AbstractC22671h0.f89337a.getOrCreateKotlinClass(FormItemSpec.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ad3.AbstractC0767j
    /* JADX INFO: renamed from: a */
    public final InterfaceC37137b mo1836a(JsonElement element) {
        AbstractC22676k.m65750j(element, "element");
        JsonElement jsonElement = (JsonElement) AbstractC0770m.m1847i(element).get((Object) "type");
        String content = jsonElement != null ? AbstractC0770m.m1848j(jsonElement).getContent() : null;
        if (content != null) {
            switch (content.hashCode()) {
                case -1922029177:
                    if (content.equals("klarna_header")) {
                        return KlarnaHeaderStaticTextSpec.Companion.serializer();
                    }
                    break;
                case -1884659095:
                    if (content.equals("affirm_header")) {
                        return AffirmTextSpec.Companion.serializer();
                    }
                    break;
                case -910686504:
                    if (content.equals("au_becs_bsb_number")) {
                        return BsbSpec.Companion.serializer();
                    }
                    break;
                case -516244944:
                    if (content.equals("billing_address")) {
                        return AddressSpec.Companion.serializer();
                    }
                    break;
                case -185531168:
                    if (content.equals("afterpay_header")) {
                        return AfterpayClearpayTextSpec.Companion.serializer();
                    }
                    break;
                case -9348212:
                    if (content.equals("sepa_mandate")) {
                        return SepaMandateTextSpec.Companion.serializer();
                    }
                    break;
                case 3225350:
                    if (content.equals("iban")) {
                        return IbanSpec.Companion.serializer();
                    }
                    break;
                case 3373707:
                    if (content.equals("name")) {
                        return NameSpec.Companion.serializer();
                    }
                    break;
                case 3556653:
                    if (content.equals("text")) {
                        return SimpleTextSpec.Companion.serializer();
                    }
                    break;
                case 40435420:
                    if (content.equals("au_becs_account_number")) {
                        return AuBankAccountNumberSpec.Companion.serializer();
                    }
                    break;
                case 96619420:
                    if (content.equals(NotificationCompat.CATEGORY_EMAIL)) {
                        return EmailSpec.Companion.serializer();
                    }
                    break;
                case 598246771:
                    if (content.equals("placeholder")) {
                        return PlaceholderSpec.Companion.serializer();
                    }
                    break;
                case 709160924:
                    if (content.equals("klarna_country")) {
                        return CountrySpec.Companion.serializer();
                    }
                    break;
                case 835344392:
                    if (content.equals("mandate")) {
                        return MandateTextSpec.Companion.serializer();
                    }
                    break;
                case 885589086:
                    if (content.equals("static_text")) {
                        return StaticTextSpec.Companion.serializer();
                    }
                    break;
                case 957831062:
                    if (content.equals("country")) {
                        return CountrySpec.Companion.serializer();
                    }
                    break;
                case 1191572447:
                    if (content.equals("selector")) {
                        return DropdownSpec.Companion.serializer();
                    }
                    break;
                case 1255817703:
                    if (content.equals("au_becs_mandate")) {
                        return AuBecsDebitMandateTextSpec.Companion.serializer();
                    }
                    break;
            }
        }
        return EmptyFormSpec.INSTANCE.serializer();
    }
}
