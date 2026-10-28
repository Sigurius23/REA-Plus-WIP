package s40;

import android.text.Editable;
import android.view.View;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.StripeEditText;
import j93.InterfaceC21493z;

/* JADX INFO: renamed from: s40.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C32177s extends AbstractC32155h1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133263w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f133264x;

    public /* synthetic */ C32177s(View view, int i13) {
        this.f133263w = i13;
        this.f133264x = view;
    }

    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.f133263w) {
            case 0:
                CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) this.f133264x;
                InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                cardMultilineWidget.getClass();
                break;
        }
    }

    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        switch (this.f133263w) {
            case 1:
                ((StripeEditText) this.f133264x).setLastKeyDelete$payments_core_release(i15 == 0);
                break;
        }
    }
}
