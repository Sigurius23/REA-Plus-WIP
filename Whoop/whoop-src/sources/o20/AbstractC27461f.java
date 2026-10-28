package o20;

import com.stripe.android.p056ui.core.elements.PlaceholderSpec;

/* JADX INFO: renamed from: o20.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC27461f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f110668a;

    static {
        int[] iArr = new int[PlaceholderSpec.PlaceholderField.values().length];
        try {
            iArr[PlaceholderSpec.PlaceholderField.BillingAddressWithoutCountry.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaceholderSpec.PlaceholderField.Name.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlaceholderSpec.PlaceholderField.Email.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlaceholderSpec.PlaceholderField.Phone.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlaceholderSpec.PlaceholderField.BillingAddress.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PlaceholderSpec.PlaceholderField.SepaMandate.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f110668a = iArr;
    }
}
