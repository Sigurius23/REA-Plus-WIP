package er;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.whoop.android.R;
import p161g.C14894a;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: er.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13568a {

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator f47913a;

    /* JADX INFO: renamed from: b */
    public final View f47914b;

    /* JADX INFO: renamed from: c */
    public final int f47915c;

    /* JADX INFO: renamed from: d */
    public final int f47916d;

    /* JADX INFO: renamed from: e */
    public final int f47917e;

    /* JADX INFO: renamed from: f */
    public C14894a f47918f;

    public AbstractC13568a(View view) {
        this.f47914b = view;
        Context context = view.getContext();
        this.f47913a = AbstractC36259c.m115699l0(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.f47915c = AbstractC36259c.m115697k0(context, R.attr.motionDurationMedium2, 300);
        this.f47916d = AbstractC36259c.m115697k0(context, R.attr.motionDurationShort3, 150);
        this.f47917e = AbstractC36259c.m115697k0(context, R.attr.motionDurationShort2, 100);
    }
}
