package jo;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.whoop.android.R;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: jo.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C21827p extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a */
    public final TextView f84150a;

    /* JADX INFO: renamed from: b */
    public final View f84151b;

    public C21827p(View view) {
        super(view);
        if (AbstractC24567y.f95875a < 26) {
            view.setFocusable(true);
        }
        this.f84150a = (TextView) view.findViewById(R.id.exo_text);
        this.f84151b = view.findViewById(R.id.exo_check);
    }
}
