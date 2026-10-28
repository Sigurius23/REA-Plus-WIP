package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.WhoopNewToolbar;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.v1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13543v1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f47710a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f47711b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout f47712c;

    /* JADX INFO: renamed from: d */
    public final WhoopNewToolbar f47713d;

    /* JADX INFO: renamed from: e */
    public final ImageView f47714e;

    /* JADX INFO: renamed from: f */
    public final EditText f47715f;

    /* JADX INFO: renamed from: g */
    public final ThrobberView f47716g;

    public AbstractC13543v1(Object obj, View view, int i13, LinearLayout linearLayout, RecyclerView recyclerView, FrameLayout frameLayout, WhoopNewToolbar whoopNewToolbar, ImageView imageView, EditText editText, ThrobberView throbberView) {
        super(view, i13, obj);
        this.f47710a = linearLayout;
        this.f47711b = recyclerView;
        this.f47712c = frameLayout;
        this.f47713d = whoopNewToolbar;
        this.f47714e = imageView;
        this.f47715f = editText;
        this.f47716g = throbberView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13543v1 m38261c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38262d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13543v1 m38262d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13543v1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165498T, viewGroup, z4, obj);
    }
}
