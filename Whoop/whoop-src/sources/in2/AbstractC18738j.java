package in2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C4965g;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;

/* JADX INFO: renamed from: in2.j */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public abstract class AbstractC18738j {
    /* JADX INFO: renamed from: a */
    public static void m54483a(TextView textView, int i13) {
        textView.setTypeface(AbstractC34523k.m109098b(textView.getContext(), i13));
    }

    /* JADX INFO: renamed from: b */
    public static int m54484b(float f13, int i13) {
        return Color.rgb((int) (Color.red(i13) * f13), (int) (Color.green(i13) * f13), (int) (Color.blue(i13) * f13));
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static int m54485c(Context context, int i13) {
        if (context == null) {
            return -1;
        }
        return AbstractC32122c.getColor(context, i13);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static Drawable m54486d(Context context, int i13) {
        return AbstractC32122c.getDrawable(context, i13);
    }

    /* JADX INFO: renamed from: e */
    public static void m54487e(int i13, ImageView imageView) {
        ComponentCallbacks2C4966h componentCallbacks2C4966hM15529e = ComponentCallbacks2C4960b.m15529e(imageView.getContext());
        componentCallbacks2C4966hM15529e.getClass();
        componentCallbacks2C4966hM15529e.m15547k(new C4965g(imageView));
        imageView.setImageResource(i13);
    }
}
