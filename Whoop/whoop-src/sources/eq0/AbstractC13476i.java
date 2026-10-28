package eq0;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;

/* JADX INFO: renamed from: eq0.i */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13476i extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f47337a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f47338b;

    /* JADX INFO: renamed from: c */
    public final ImageView f47339c;

    /* JADX INFO: renamed from: d */
    public final EditText f47340d;

    /* JADX INFO: renamed from: e */
    public final ThrobberView f47341e;

    public AbstractC13476i(Object obj, View view, int i13, LinearLayout linearLayout, RecyclerView recyclerView, ImageView imageView, EditText editText, ThrobberView throbberView) {
        super(view, i13, obj);
        this.f47337a = linearLayout;
        this.f47338b = recyclerView;
        this.f47339c = imageView;
        this.f47340d = editText;
        this.f47341e = throbberView;
    }
}
