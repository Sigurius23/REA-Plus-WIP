package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.h0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13472h0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f47324a;

    /* JADX INFO: renamed from: b */
    public final CircleImageView f47325b;

    /* JADX INFO: renamed from: c */
    public final TextView f47326c;

    public AbstractC13472h0(Object obj, View view, int i13, TextView textView, CircleImageView circleImageView, TextView textView2) {
        super(view, i13, obj);
        this.f47324a = textView;
        this.f47325b = circleImageView;
        this.f47326c = textView2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13472h0 m38195c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38196d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13472h0 m38196d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13472h0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165553y, viewGroup, z4, obj);
    }
}
