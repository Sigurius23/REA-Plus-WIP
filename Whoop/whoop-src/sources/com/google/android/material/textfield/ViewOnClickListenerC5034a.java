package com.google.android.material.textfield;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.textfield.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ViewOnClickListenerC5034a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21185w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC5059r f21186x;

    public /* synthetic */ ViewOnClickListenerC5034a(AbstractC5059r abstractC5059r, int i13) {
        this.f21185w = i13;
        this.f21186x = abstractC5059r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f21185w) {
            case 0:
                C5042e c5042e = (C5042e) this.f21186x;
                EditText editText = c5042e.f21204i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c5042e.m15888p();
                    break;
                }
                break;
            case 1:
                ((C5053l) this.f21186x).m15856t();
                break;
            default:
                C5066y c5066y = (C5066y) this.f21186x;
                EditText editText2 = c5066y.f21314f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c5066y.f21314f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c5066y.f21314f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c5066y.f21314f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c5066y.f21314f.setSelection(selectionEnd);
                    }
                    c5066y.m15888p();
                    break;
                }
                break;
        }
    }
}
