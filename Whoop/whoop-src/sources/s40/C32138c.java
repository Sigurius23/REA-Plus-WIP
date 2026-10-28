package s40;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.stripe.android.view.BecsDebitAccountNumberEditText;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;

/* JADX INFO: renamed from: s40.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32138c implements TextWatcher {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133171w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f133172x;

    public /* synthetic */ C32138c(View view, int i13) {
        this.f133171w = i13;
        this.f133172x = view;
    }

    /* JADX INFO: renamed from: a */
    private final void m100082a(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: b */
    private final void m100083b(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: c */
    private final void m100084c(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m100085d(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: e */
    private final void m100086e(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: f */
    private final void m100087f(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: g */
    private final void m100088g(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: h */
    private final void m100089h(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: i */
    private final void m100090i(int i13, int i14, int i15, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: j */
    private final void m100091j(int i13, int i14, int i15, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f133171w) {
            case 0:
                ((BecsDebitAccountNumberEditText) this.f133172x).setShouldShowError(false);
                break;
            case 1:
                ((CardMultilineWidget) this.f133172x).setShouldShowErrorIcon$payments_core_release(false);
                break;
            case 2:
                CvcEditText cvcEditText = (CvcEditText) this.f133172x;
                cvcEditText.setShouldShowError(false);
                if (cvcEditText.f22537V.m124355d(cvcEditText.getUnvalidatedCvc().f177706x)) {
                    cvcEditText.getCompletionCallback().invoke();
                }
                break;
            case 3:
                ((PostalCodeEditText) this.f133172x).setShouldShowError(false);
                break;
            default:
                InterfaceC32143d1 interfaceC32143d1 = ((StripeEditText) this.f133172x).f22582I;
                if (interfaceC32143d1 != null) {
                    String string = editable != null ? editable.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    interfaceC32143d1.mo100093a(string);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        int i16 = this.f133171w;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        int i16 = this.f133171w;
    }
}
