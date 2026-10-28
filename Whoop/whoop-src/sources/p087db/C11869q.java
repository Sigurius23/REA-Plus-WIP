package p087db;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import b30.ViewOnClickListenerC2558k3;
import com.whoop.android.R;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: db.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C11869q extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a */
    public final TextView f38742a;

    /* JADX INFO: renamed from: b */
    public final TextView f38743b;

    /* JADX INFO: renamed from: c */
    public final ImageView f38744c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C11882x f38745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11869q(C11882x c11882x, View view) {
        super(view);
        this.f38745d = c11882x;
        if (AbstractC38065t.f163031a < 26) {
            view.setFocusable(true);
        }
        this.f38742a = (TextView) view.findViewById(R.id.exo_main_text);
        this.f38743b = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f38744c = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new ViewOnClickListenerC2558k3(this, 5));
    }
}
