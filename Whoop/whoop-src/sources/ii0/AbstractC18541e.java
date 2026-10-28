package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.e */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18541e extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final View f72251a;

    /* JADX INFO: renamed from: b */
    public final TextView f72252b;

    /* JADX INFO: renamed from: c */
    public final TextInputEditText f72253c;

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f72254d;

    /* JADX INFO: renamed from: e */
    public final ProgressBar f72255e;

    /* JADX INFO: renamed from: f */
    public final TextView f72256f;

    /* JADX INFO: renamed from: g */
    public final ImageView f72257g;

    /* JADX INFO: renamed from: h */
    public final TextView f72258h;

    /* JADX INFO: renamed from: i */
    public final View f72259i;

    public AbstractC18541e(Object obj, View view, int i13, View view2, TextView textView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ProgressBar progressBar, TextView textView2, ImageView imageView, TextView textView3, View view3) {
        super(view, i13, obj);
        this.f72251a = view2;
        this.f72252b = textView;
        this.f72253c = textInputEditText;
        this.f72254d = textInputLayout;
        this.f72255e = progressBar;
        this.f72256f = textView2;
        this.f72257g = imageView;
        this.f72258h = textView3;
        this.f72259i = view3;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18541e m53757c(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53758d(layoutInflater, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18541e m53758d(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC18541e) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66881c, null, false, obj);
    }
}
