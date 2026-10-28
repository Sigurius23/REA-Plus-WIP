package com.whoop.p069ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import nf1.AbstractC26663d;

/* JADX INFO: loaded from: classes10.dex */
public class WhoopToolbar extends Toolbar {

    /* JADX INFO: renamed from: x0 */
    private TextView f31588x0;

    public WhoopToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: L */
    private void m26695L() {
        this.f31588x0 = (TextView) findViewById(AbstractC26663d.f105993l);
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: H */
    public void mo3304H(Context context, int i13) {
        TextView textView = this.f31588x0;
        if (textView != null) {
            textView.setTextAppearance(context, i13);
        } else {
            super.mo3304H(context, i13);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m26695L();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i13) {
        String string = getContext().getString(i13);
        TextView textView = this.f31588x0;
        if (textView != null) {
            textView.setText(string);
        } else {
            super.setTitle(string);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i13) {
        TextView textView = this.f31588x0;
        if (textView != null) {
            textView.setTextColor(i13);
        } else {
            super.setTitleTextColor(i13);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f31588x0;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }
}
