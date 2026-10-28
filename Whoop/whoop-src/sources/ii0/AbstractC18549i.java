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

/* JADX INFO: renamed from: ii0.i */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18549i extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f72286a;

    /* JADX INFO: renamed from: b */
    public final TextView f72287b;

    /* JADX INFO: renamed from: c */
    public final TextView f72288c;

    /* JADX INFO: renamed from: d */
    public final StrokedPillButton f72289d;

    public AbstractC18549i(Object obj, View view, int i13, ImageView imageView, TextView textView, TextView textView2, StrokedPillButton strokedPillButton) {
        super(view, i13, obj);
        this.f72286a = imageView;
        this.f72287b = textView;
        this.f72288c = textView2;
        this.f72289d = strokedPillButton;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18549i m53761c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53762d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18549i m53762d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC18549i) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66883e, viewGroup, z4, obj);
    }
}
