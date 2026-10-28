package s40;

import android.text.Editable;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.whoop.android.R;
import e93.AbstractC12889b;
import m83.AbstractC25265s;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C32147f extends AbstractC32155h1 {

    /* JADX INFO: renamed from: w */
    public boolean f133189w;

    /* JADX INFO: renamed from: x */
    public Integer f133190x;

    /* JADX INFO: renamed from: y */
    public String f133191y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ BecsDebitBsbEditText f133192z;

    public C32147f(BecsDebitBsbEditText becsDebitBsbEditText) {
        this.f133192z = becsDebitBsbEditText;
    }

    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        if (this.f133189w) {
            return;
        }
        this.f133189w = true;
        BecsDebitBsbEditText becsDebitBsbEditText = this.f133192z;
        if (!becsDebitBsbEditText.isLastKeyDelete && (str = this.f133191y) != null) {
            becsDebitBsbEditText.setText(str);
            Integer num = this.f133190x;
            if (num != null) {
                becsDebitBsbEditText.setSelection(AbstractC12889b.m36284n(num.intValue(), 0, becsDebitBsbEditText.getFieldText$payments_core_release().length()));
            }
        }
        this.f133191y = null;
        this.f133190x = null;
        this.f133189w = false;
        boolean z4 = becsDebitBsbEditText.getBank() == null && becsDebitBsbEditText.getFieldText$payments_core_release().length() >= 2;
        becsDebitBsbEditText.setErrorMessage$payments_core_release(z4 ? becsDebitBsbEditText.getResources().getString(R.string.stripe_becs_widget_bsb_invalid) : null);
        becsDebitBsbEditText.setShouldShowError(becsDebitBsbEditText.getErrorMessage() != null);
        becsDebitBsbEditText.getOnBankChangedCallback().invoke(becsDebitBsbEditText.getBank());
        becsDebitBsbEditText.setCompoundDrawablesRelativeWithIntrinsicBounds(z4 ? R.drawable.stripe_ic_bank_error : R.drawable.stripe_ic_bank_becs, 0, 0, 0);
        if (becsDebitBsbEditText.m16896e()) {
            becsDebitBsbEditText.getOnCompletedCallback().invoke();
        }
    }

    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        if (!this.f133189w && i13 <= 4) {
            String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            StringBuilder sb4 = new StringBuilder();
            int length = string.length();
            for (int i16 = 0; i16 < length; i16++) {
                char cCharAt = string.charAt(i16);
                if (Character.isDigit(cCharAt)) {
                    sb4.append(cCharAt);
                }
            }
            String string2 = sb4.toString();
            int i17 = BecsDebitBsbEditText.f22466b0;
            if (string2.length() >= 3) {
                string2 = AbstractC25265s.m74110N0(AbstractC37056f.m118959K(AbstractC39414r.m125866L0(3, string2), AbstractC39414r.m125867M0(string2.length() - 3, string2)), "-", null, null, null, 62);
            }
            this.f133191y = string2;
            this.f133190x = string2 != null ? Integer.valueOf(string2.length()) : null;
        }
    }
}
