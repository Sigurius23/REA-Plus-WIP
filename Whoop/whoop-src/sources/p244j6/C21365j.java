package p244j6;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p185h6.C16955j;

/* JADX INFO: renamed from: j6.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C21365j implements TransformationMethod {

    /* JADX INFO: renamed from: w */
    public final TransformationMethod f81715w;

    public C21365j(TransformationMethod transformationMethod) {
        this.f81715w = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f81715w;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C16955j.m47708a().m47711c() != 1) {
            return charSequence;
        }
        C16955j c16955jM47708a = C16955j.m47708a();
        c16955jM47708a.getClass();
        return c16955jM47708a.m47714g(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i13, Rect rect) {
        TransformationMethod transformationMethod = this.f81715w;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i13, rect);
        }
    }
}
