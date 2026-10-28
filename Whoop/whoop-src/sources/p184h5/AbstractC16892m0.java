package p184h5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: h5.m0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16892m0 {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m47561a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static void m47562b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i13, int i14) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i13, i14);
    }
}
