package s40;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardMultilineWidget;
import com.whoop.android.R;
import f93.AbstractC14290b;
import j93.InterfaceC21493z;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s40.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C32179t extends AbstractC14290b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133267w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CardMultilineWidget f133268x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32179t(C32162k0 c32162k0, CardMultilineWidget cardMultilineWidget, int i13) {
        super(c32162k0);
        this.f133267w = i13;
        this.f133268x = cardMultilineWidget;
    }

    @Override // f93.AbstractC14290b
    public final void afterChange(InterfaceC21493z property, Object obj, Object obj2) {
        switch (this.f133267w) {
            case 0:
                AbstractC22676k.m65750j(property, "property");
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                CardMultilineWidget cardMultilineWidget = this.f133268x;
                if (!zBooleanValue) {
                    cardMultilineWidget.getPostalCodeEditText().setConfig$payments_core_release(EnumC32184v0.f133294w);
                } else {
                    cardMultilineWidget.getPostalCodeEditText().setConfig$payments_core_release(EnumC32184v0.f133295x);
                }
                break;
            case 1:
                AbstractC22676k.m65750j(property, "property");
                Integer num = (Integer) obj2;
                CardMultilineWidget cardMultilineWidget2 = this.f133268x;
                TextInputLayout expiryTextInputLayout = cardMultilineWidget2.getExpiryTextInputLayout();
                String string = num != null ? cardMultilineWidget2.getResources().getString(num.intValue()) : null;
                if (string == null) {
                    string = "";
                }
                expiryTextInputLayout.setPlaceholderText(string);
                break;
            case 2:
                AbstractC22676k.m65750j(property, "property");
                this.f133268x.getCardNumberEditText().setErrorMessageListener((InterfaceC32149f1) obj2);
                break;
            case 3:
                AbstractC22676k.m65750j(property, "property");
                this.f133268x.getExpiryDateEditText().setErrorMessageListener((InterfaceC32149f1) obj2);
                break;
            case 4:
                AbstractC22676k.m65750j(property, "property");
                this.f133268x.getCvcEditText().setErrorMessageListener((InterfaceC32149f1) obj2);
                break;
            default:
                AbstractC22676k.m65750j(property, "property");
                this.f133268x.getPostalCodeEditText().setErrorMessageListener((InterfaceC32149f1) obj2);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C32179t(int i13, CardMultilineWidget cardMultilineWidget) {
        this.f133267w = i13;
        switch (i13) {
            case 1:
                Integer numValueOf = Integer.valueOf(R.string.stripe_expiry_date_hint);
                this.f133268x = cardMultilineWidget;
                super(numValueOf);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.f133268x = cardMultilineWidget;
                super(bool);
                break;
        }
    }
}
