package o20;

import com.stripe.android.p056ui.core.elements.AddressSpec;
import com.stripe.android.p056ui.core.elements.EmailSpec;
import com.stripe.android.p056ui.core.elements.FormItemSpec;
import com.stripe.android.p056ui.core.elements.NameSpec;
import com.stripe.android.p056ui.core.elements.PhoneSpec;
import com.stripe.android.p056ui.core.elements.PlaceholderSpec;
import com.stripe.android.p056ui.core.elements.SepaMandateTextSpec;
import com.stripe.android.p056ui.core.elements.TranslationId;
import com.stripe.android.uicore.elements.IdentifierSpec;
import h20.C16689l1;
import h20.EnumC16673i3;
import h20.EnumC16677j1;
import h20.EnumC16683k1;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o20.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27462g {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static FormItemSpec m82870a(PlaceholderSpec.PlaceholderField field, List placeholderOverrideList, boolean z4, C16689l1 configuration, EnumC16673i3 enumC16673i3) {
        AbstractC22676k.m65750j(field, "field");
        AbstractC22676k.m65750j(placeholderOverrideList, "placeholderOverrideList");
        AbstractC22676k.m65750j(configuration, "configuration");
        EnumC16683k1 enumC16683k1 = configuration.f64189w;
        EnumC16683k1 enumC16683k2 = configuration.f64191y;
        EnumC16683k1 enumC16683k3 = configuration.f64190x;
        EnumC16677j1 enumC16677j1 = configuration.f64192z;
        switch (AbstractC27461f.f110668a[field.ordinal()]) {
            case 1:
                AddressSpec addressSpec = new AddressSpec(null, configuration.m47249b(), null, false, null, true, 29, null);
                if (enumC16677j1 == EnumC16677j1.f64133y || (placeholderOverrideList.contains(addressSpec.getApiPath()) && enumC16677j1 != EnumC16677j1.f64132x)) {
                    return addressSpec;
                }
                return null;
            case 2:
                NameSpec nameSpec = new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null);
                if (enumC16683k1 == EnumC16683k1.f64151y || (placeholderOverrideList.contains(nameSpec.getApiPath()) && enumC16683k1 != EnumC16683k1.f64150x)) {
                    return nameSpec;
                }
                return null;
            case 3:
                EmailSpec emailSpec = new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
                if (enumC16683k2 == EnumC16683k1.f64151y || (placeholderOverrideList.contains(emailSpec.getApiPath()) && enumC16683k2 != EnumC16683k1.f64150x)) {
                    return emailSpec;
                }
                return null;
            case 4:
                PhoneSpec phoneSpec = new PhoneSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
                if (enumC16683k3 == EnumC16683k1.f64151y || (placeholderOverrideList.contains(phoneSpec.getApiPath()) && enumC16683k3 != EnumC16683k1.f64150x)) {
                    return phoneSpec;
                }
                return null;
            case 5:
                AddressSpec addressSpec2 = new AddressSpec(null, configuration.m47249b(), null, false, null, false, 61, null);
                if (enumC16677j1 == EnumC16677j1.f64133y || (placeholderOverrideList.contains(addressSpec2.getApiPath()) && enumC16677j1 != EnumC16677j1.f64132x)) {
                    return addressSpec2;
                }
                return null;
            case 6:
                SepaMandateTextSpec sepaMandateTextSpec = new SepaMandateTextSpec((IdentifierSpec) null, 0, 3, (DefaultConstructorMarker) null);
                if (!z4 || enumC16673i3 == EnumC16673i3.f64122x) {
                    return null;
                }
                return sepaMandateTextSpec;
            default:
                return null;
        }
    }
}
