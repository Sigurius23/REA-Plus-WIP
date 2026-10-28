package p244j6;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: j6.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C21361f extends AbstractC35903f {

    /* JADX INFO: renamed from: a */
    public final TextView f81707a;

    /* JADX INFO: renamed from: b */
    public final C21359d f81708b;

    /* JADX INFO: renamed from: c */
    public boolean f81709c = true;

    public C21361f(TextView textView) {
        this.f81707a = textView;
        this.f81708b = new C21359d(textView);
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: N */
    public final void mo59953N(boolean z4) {
        if (z4) {
            TextView textView = this.f81707a;
            textView.setTransformationMethod(mo59955Y(textView.getTransformationMethod()));
        }
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: O */
    public final void mo59954O(boolean z4) {
        this.f81709c = z4;
        TextView textView = this.f81707a;
        textView.setTransformationMethod(mo59955Y(textView.getTransformationMethod()));
        textView.setFilters(mo59956s(textView.getFilters()));
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: Y */
    public final TransformationMethod mo59955Y(TransformationMethod transformationMethod) {
        if (this.f81709c) {
            return ((transformationMethod instanceof C21365j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C21365j(transformationMethod);
        }
        return transformationMethod instanceof C21365j ? ((C21365j) transformationMethod).f81715w : transformationMethod;
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: s */
    public final InputFilter[] mo59956s(InputFilter[] inputFilterArr) {
        if (!this.f81709c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i13 = 0; i13 < inputFilterArr.length; i13++) {
                InputFilter inputFilter = inputFilterArr[i13];
                if (inputFilter instanceof C21359d) {
                    sparseArray.put(i13, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                if (sparseArray.indexOfKey(i15) < 0) {
                    inputFilterArr2[i14] = inputFilterArr[i15];
                    i14++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i16 = 0;
        while (true) {
            C21359d c21359d = this.f81708b;
            if (i16 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c21359d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i16] == c21359d) {
                return inputFilterArr;
            }
            i16++;
        }
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: x */
    public final boolean mo59957x() {
        return this.f81709c;
    }
}
