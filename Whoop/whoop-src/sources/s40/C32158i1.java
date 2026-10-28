package s40;

import android.content.Context;
import android.graphics.Color;
import com.whoop.android.R;
import p479s4.AbstractC32122c;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: s40.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32158i1 {

    /* JADX INFO: renamed from: a */
    public final int f133214a;

    /* JADX INFO: renamed from: b */
    public final int f133215b;

    /* JADX INFO: renamed from: c */
    public final int f133216c;

    /* JADX INFO: renamed from: d */
    public final int f133217d;

    public C32158i1(Context context) {
        C32137b1 c32137b1 = new C32137b1(context);
        int iM100106a = m100106a(context, c32137b1.f133166b, R.color.stripe_accent_color_default);
        this.f133214a = iM100106a;
        m100106a(context, c32137b1.f133167c, R.color.stripe_control_normal_color_default);
        int iM100106a2 = m100106a(context, c32137b1.f133169e, R.color.stripe_color_text_secondary_default);
        this.f133215b = iM100106a2;
        this.f133216c = AbstractC35642a.m112838g(iM100106a, context.getResources().getInteger(R.integer.stripe_light_text_alpha_hex));
        this.f133217d = AbstractC35642a.m112838g(iM100106a2, context.getResources().getInteger(R.integer.stripe_light_text_alpha_hex));
    }

    /* JADX INFO: renamed from: a */
    public static int m100106a(Context context, int i13, int i14) {
        return Color.alpha(i13) < 16 ? AbstractC32122c.getColor(context, i14) : i13;
    }
}
