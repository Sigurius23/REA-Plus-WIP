package p087db;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.whoop.android.R;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: db.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C11873s extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a */
    public final TextView f38751a;

    /* JADX INFO: renamed from: b */
    public final View f38752b;

    public C11873s(View view) {
        super(view);
        if (AbstractC38065t.f163031a < 26) {
            view.setFocusable(true);
        }
        this.f38751a = (TextView) view.findViewById(R.id.exo_text);
        this.f38752b = view.findViewById(R.id.exo_check);
    }
}
