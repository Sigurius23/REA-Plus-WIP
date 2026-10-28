package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.WhoopZoomageView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.p1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13513p1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC13509o2 f47532a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13520q3 f47533b;

    /* JADX INFO: renamed from: c */
    public final WhoopZoomageView f47534c;

    /* JADX INFO: renamed from: d */
    public final Group f47535d;

    public AbstractC13513p1(Object obj, View view, int i13, AbstractC13509o2 abstractC13509o2, AbstractC13520q3 abstractC13520q3, WhoopZoomageView whoopZoomageView, Group group) {
        super(view, i13, obj);
        this.f47532a = abstractC13509o2;
        this.f47533b = abstractC13520q3;
        this.f47534c = whoopZoomageView;
        this.f47535d = group;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13513p1 m38233c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38234d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13513p1 m38234d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13513p1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165494P, viewGroup, z4, obj);
    }
}
