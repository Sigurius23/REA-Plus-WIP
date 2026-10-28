package t30;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whoop.android.R;
import m30.AbstractC24985a;
import m30.C24990f;
import m30.InterfaceC24993i;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t30.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C33519u extends LinearLayout {

    /* JADX INFO: renamed from: w */
    public final TextInputLayout f139936w;

    /* JADX INFO: renamed from: x */
    public final TextInputEditText f139937x;

    public C33519u(AbstractActivityC1340r0 abstractActivityC1340r0) {
        super(abstractActivityC1340r0, null, 0);
        View viewInflate = LayoutInflater.from(abstractActivityC1340r0).inflate(R.layout.stripe_challenge_zone_text_view, (ViewGroup) this, false);
        addView(viewInflate);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate;
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC34235f.m108203J(viewInflate, R.id.text_entry);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.text_entry)));
        }
        this.f139936w = textInputLayout;
        this.f139937x = textInputEditText;
    }

    public final TextInputLayout getInfoLabel$3ds2sdk_release() {
        return this.f139936w;
    }

    public final TextInputEditText getTextEntryView$3ds2sdk_release() {
        return this.f139937x;
    }

    public String getUserEntry() {
        Editable text = this.f139937x.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final void setText(String text) {
        AbstractC22676k.m65750j(text, "text");
        this.f139937x.setText(text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextBoxCustomization(InterfaceC24993i interfaceC24993i) {
        if (interfaceC24993i == 0) {
            return;
        }
        AbstractC24985a abstractC24985a = (AbstractC24985a) interfaceC24993i;
        String str = abstractC24985a.f97783x;
        TextInputEditText textInputEditText = this.f139937x;
        if (str != null) {
            textInputEditText.setTextColor(Color.parseColor(str));
        }
        Integer numValueOf = Integer.valueOf(abstractC24985a.f97784y);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            textInputEditText.setTextSize(2, numValueOf.intValue());
        }
        C24990f c24990f = (C24990f) interfaceC24993i;
        int i13 = c24990f.f97791F;
        TextInputLayout textInputLayout = this.f139936w;
        if (i13 >= 0) {
            float f13 = i13;
            textInputLayout.m15835z(f13, f13, f13, f13);
        }
        String str2 = c24990f.f97790E;
        if (str2 != null) {
            textInputLayout.setBoxBackgroundMode(2);
            textInputLayout.setBoxStrokeColor(Color.parseColor(str2));
        }
        String str3 = c24990f.f97792G;
        if (str3 != null) {
            textInputLayout.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(str3)));
        }
    }

    public final void setTextEntryLabel(String str) {
        this.f139936w.setHint(str);
    }
}
