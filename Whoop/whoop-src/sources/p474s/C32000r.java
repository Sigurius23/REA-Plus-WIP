package p474s;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import hm.C17417d;
import p290l.AbstractC22932a;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: s.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C32000r {

    /* JADX INFO: renamed from: a */
    public final TextView f132802a;

    /* JADX INFO: renamed from: b */
    public final C17417d f132803b;

    public C32000r(TextView textView) {
        this.f132802a = textView;
        this.f132803b = new C17417d(textView);
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m99516a(InputFilter[] inputFilterArr) {
        return ((AbstractC35903f) this.f132803b.f67507x).mo59956s(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m99517b(AttributeSet attributeSet, int i13) {
        TypedArray typedArrayObtainStyledAttributes = this.f132802a.getContext().obtainStyledAttributes(attributeSet, AbstractC22932a.f90516i, i13, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m99519d(z4);
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m99518c(boolean z4) {
        ((AbstractC35903f) this.f132803b.f67507x).mo59953N(z4);
    }

    /* JADX INFO: renamed from: d */
    public final void m99519d(boolean z4) {
        ((AbstractC35903f) this.f132803b.f67507x).mo59954O(z4);
    }
}
