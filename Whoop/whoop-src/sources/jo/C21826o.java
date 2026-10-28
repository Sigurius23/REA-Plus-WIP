package jo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.whoop.android.R;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: jo.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C21826o extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a */
    public final TextView f84146a;

    /* JADX INFO: renamed from: b */
    public final TextView f84147b;

    /* JADX INFO: renamed from: c */
    public final ImageView f84148c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C21830s f84149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21826o(C21830s c21830s, View view) {
        super(view);
        this.f84149d = c21830s;
        if (AbstractC24567y.f95875a < 26) {
            view.setFocusable(true);
        }
        this.f84146a = (TextView) view.findViewById(R.id.exo_main_text);
        this.f84147b = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f84148c = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new ViewOnClickListenerC21821j(this, 1));
    }
}
