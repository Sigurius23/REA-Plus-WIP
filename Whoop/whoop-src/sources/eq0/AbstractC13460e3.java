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

/* JADX INFO: renamed from: eq0.e3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13460e3 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final CircleImageView f47231a;

    /* JADX INFO: renamed from: b */
    public final TextView f47232b;

    public AbstractC13460e3(Object obj, View view, int i13, CircleImageView circleImageView, TextView textView) {
        super(view, i13, obj);
        this.f47231a = circleImageView;
        this.f47232b = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13460e3 m38183c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38184d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13460e3 m38184d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13460e3) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165540r0, viewGroup, z4, obj);
    }
}
