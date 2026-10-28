package p312lx;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;

/* JADX INFO: renamed from: lx.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24783d extends AbstractC1717o2 {
    public Context getContext() {
        View view = this.itemView;
        if (view != null) {
            return view.getContext();
        }
        return null;
    }
}
