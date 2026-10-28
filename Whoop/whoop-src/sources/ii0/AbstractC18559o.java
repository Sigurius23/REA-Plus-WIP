package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.pills.StrokedPillButton;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.o */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18559o extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final StrokedPillButton f72352a;

    /* JADX INFO: renamed from: b */
    public final ImageView f72353b;

    /* JADX INFO: renamed from: c */
    public final TextView f72354c;

    /* JADX INFO: renamed from: d */
    public final TextView f72355d;

    /* JADX INFO: renamed from: e */
    public final TextView f72356e;

    /* JADX INFO: renamed from: f */
    public final ImageView f72357f;

    /* JADX INFO: renamed from: g */
    public final TextView f72358g;

    /* JADX INFO: renamed from: h */
    public final TextView f72359h;

    public AbstractC18559o(Object obj, View view, int i13, StrokedPillButton strokedPillButton, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4, TextView textView5) {
        super(view, i13, obj);
        this.f72352a = strokedPillButton;
        this.f72353b = imageView;
        this.f72354c = textView;
        this.f72355d = textView2;
        this.f72356e = textView3;
        this.f72357f = imageView2;
        this.f72358g = textView4;
        this.f72359h = textView5;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18559o m53771c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53772d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18559o m53772d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC18559o) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66886h, viewGroup, z4, obj);
    }
}
