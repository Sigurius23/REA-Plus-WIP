package p388p;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C28504a implements TransformationMethod {

    /* JADX INFO: renamed from: w */
    public Locale f115389w;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f115389w);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i13, Rect rect) {
    }
}
