package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C5065x;
import gr.C16085a;
import p314m.C24839f0;
import p474s.C31976l;
import p474s.C32024x;
import p504tq.C34080b;
import pr.C29485a;

/* JADX INFO: loaded from: classes6.dex */
public class MaterialComponentsViewInflater extends C24839f0 {
    @Override // p314m.C24839f0
    /* JADX INFO: renamed from: a */
    public final C31976l mo15907a(Context context, AttributeSet attributeSet) {
        return new C5065x(context, attributeSet);
    }

    @Override // p314m.C24839f0
    /* JADX INFO: renamed from: b */
    public final AppCompatButton mo15908b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p314m.C24839f0
    /* JADX INFO: renamed from: c */
    public final AppCompatCheckBox mo15909c(Context context, AttributeSet attributeSet) {
        return new C34080b(context, attributeSet);
    }

    @Override // p314m.C24839f0
    /* JADX INFO: renamed from: d */
    public final C32024x mo15910d(Context context, AttributeSet attributeSet) {
        return new C16085a(context, attributeSet);
    }

    @Override // p314m.C24839f0
    /* JADX INFO: renamed from: e */
    public final AppCompatTextView mo15911e(Context context, AttributeSet attributeSet) {
        return new C29485a(context, attributeSet, R.attr.textViewStyle);
    }
}
