package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.whoop.android.R;

/* JADX INFO: renamed from: com.google.android.material.textfield.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C5066y extends AbstractC5059r {

    /* JADX INFO: renamed from: e */
    public final int f21313e;

    /* JADX INFO: renamed from: f */
    public EditText f21314f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC5034a f21315g;

    public C5066y(C5058q c5058q, int i13) {
        super(c5058q);
        this.f21313e = R.drawable.design_password_eye;
        this.f21315g = new ViewOnClickListenerC5034a(this, 2);
        if (i13 != 0) {
            this.f21313e = i13;
        }
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: b */
    public final void mo15886b() {
        m15888p();
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: c */
    public final int mo15837c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: d */
    public final int mo15838d() {
        return this.f21313e;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo15840f() {
        return this.f21315g;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: j */
    public final boolean mo15887j() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: k */
    public final boolean mo15852k() {
        EditText editText = this.f21314f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: l */
    public final void mo15842l(EditText editText) {
        this.f21314f = editText;
        m15888p();
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: q */
    public final void mo15844q() {
        EditText editText = this.f21314f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f21314f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: r */
    public final void mo15845r() {
        EditText editText = this.f21314f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
