package eq0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.AbstractC1168a0;
import com.whoop.community.presentation.p059ui.SwipelessViewPager;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.WhoopZoomageView;
import com.whoop.p069ui.pills.StrokedPillButton;

/* JADX INFO: renamed from: eq0.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13436a extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final WhoopZoomageView f47103a;

    /* JADX INFO: renamed from: b */
    public final SwipelessViewPager f47104b;

    /* JADX INFO: renamed from: c */
    public final ImageView f47105c;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f47106d;

    /* JADX INFO: renamed from: e */
    public final StrokedPillButton f47107e;

    /* JADX INFO: renamed from: f */
    public final ThrobberView f47108f;

    public AbstractC13436a(Object obj, View view, int i13, WhoopZoomageView whoopZoomageView, SwipelessViewPager swipelessViewPager, ImageView imageView, FrameLayout frameLayout, StrokedPillButton strokedPillButton, ThrobberView throbberView) {
        super(view, i13, obj);
        this.f47103a = whoopZoomageView;
        this.f47104b = swipelessViewPager;
        this.f47105c = imageView;
        this.f47106d = frameLayout;
        this.f47107e = strokedPillButton;
        this.f47108f = throbberView;
    }
}
