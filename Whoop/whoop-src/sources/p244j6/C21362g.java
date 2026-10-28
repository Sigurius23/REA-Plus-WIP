package p244j6;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import p185h6.C16955j;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: j6.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C21362g extends AbstractC35903f {

    /* JADX INFO: renamed from: a */
    public final C21361f f81710a;

    public C21362g(TextView textView) {
        this.f81710a = new C21361f(textView);
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: N */
    public final void mo59953N(boolean z4) {
        if (C16955j.m47709d()) {
            this.f81710a.mo59953N(z4);
        }
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: O */
    public final void mo59954O(boolean z4) {
        boolean zM47709d = C16955j.m47709d();
        C21361f c21361f = this.f81710a;
        if (zM47709d) {
            c21361f.mo59954O(z4);
        } else {
            c21361f.f81709c = z4;
        }
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: Y */
    public final TransformationMethod mo59955Y(TransformationMethod transformationMethod) {
        return !C16955j.m47709d() ? transformationMethod : this.f81710a.mo59955Y(transformationMethod);
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: s */
    public final InputFilter[] mo59956s(InputFilter[] inputFilterArr) {
        return !C16955j.m47709d() ? inputFilterArr : this.f81710a.mo59956s(inputFilterArr);
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: x */
    public final boolean mo59957x() {
        return this.f81710a.f81709c;
    }
}
