package eq0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import com.whoop.p069ui.WhoopSwitch;

/* JADX INFO: renamed from: eq0.s3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13530s3 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f47640a;

    /* JADX INFO: renamed from: b */
    public final TextView f47641b;

    /* JADX INFO: renamed from: c */
    public final WhoopSwitch f47642c;

    /* JADX INFO: renamed from: d */
    protected Drawable f47643d;

    /* JADX INFO: renamed from: e */
    protected String f47644e;

    public AbstractC13530s3(Object obj, View view, int i13, ImageView imageView, TextView textView, WhoopSwitch whoopSwitch) {
        super(view, i13, obj);
        this.f47640a = imageView;
        this.f47641b = textView;
        this.f47642c = whoopSwitch;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo38250c(Drawable drawable);

    /* JADX INFO: renamed from: d */
    public abstract void mo38251d(String str);
}
