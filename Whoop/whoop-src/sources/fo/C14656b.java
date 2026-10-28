package fo;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import java.util.regex.Pattern;
import p690zr.AbstractC41032j0;

/* JADX INFO: renamed from: fo.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C14656b {

    /* JADX INFO: renamed from: d */
    public static final Pattern f54084d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e */
    public static final AbstractC41032j0 f54085e = AbstractC41032j0.m133263l(2, UserState.Sources.AUTO, "none");

    /* JADX INFO: renamed from: f */
    public static final AbstractC41032j0 f54086f = AbstractC41032j0.m133263l(3, "dot", "sesame", "circle");

    /* JADX INFO: renamed from: g */
    public static final AbstractC41032j0 f54087g = AbstractC41032j0.m133263l(2, "filled", ProfileAnalyticsKt.OPEN);

    /* JADX INFO: renamed from: h */
    public static final AbstractC41032j0 f54088h = AbstractC41032j0.m133263l(3, "after", "before", "outside");

    /* JADX INFO: renamed from: a */
    public final int f54089a;

    /* JADX INFO: renamed from: b */
    public final int f54090b;

    /* JADX INFO: renamed from: c */
    public final int f54091c;

    public C14656b(int i13, int i14, int i15) {
        this.f54089a = i13;
        this.f54090b = i14;
        this.f54091c = i15;
    }
}
