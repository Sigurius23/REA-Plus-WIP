package eq0;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import de.hdodenhof.circleimageview.CircleImageView;

/* JADX INFO: renamed from: eq0.f0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13462f0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f47237a;

    /* JADX INFO: renamed from: b */
    public final ImageView f47238b;

    /* JADX INFO: renamed from: c */
    public final TextView f47239c;

    /* JADX INFO: renamed from: d */
    public final EditText f47240d;

    /* JADX INFO: renamed from: e */
    public final FrameLayout f47241e;

    /* JADX INFO: renamed from: f */
    public final RecyclerView f47242f;

    /* JADX INFO: renamed from: g */
    public final RecyclerView f47243g;

    /* JADX INFO: renamed from: h */
    public final LinearProgressIndicator f47244h;

    /* JADX INFO: renamed from: i */
    public final CircleImageView f47245i;

    public AbstractC13462f0(Object obj, View view, int i13, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, EditText editText, FrameLayout frameLayout, RecyclerView recyclerView, RecyclerView recyclerView2, LinearProgressIndicator linearProgressIndicator, CircleImageView circleImageView) {
        super(view, i13, obj);
        this.f47237a = constraintLayout;
        this.f47238b = imageView;
        this.f47239c = textView;
        this.f47240d = editText;
        this.f47241e = frameLayout;
        this.f47242f = recyclerView;
        this.f47243g = recyclerView2;
        this.f47244h = linearProgressIndicator;
        this.f47245i = circleImageView;
    }
}
