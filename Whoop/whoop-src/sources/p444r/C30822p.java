package p444r;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p408q.InterfaceC29659c;

/* JADX INFO: renamed from: r.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C30822p extends FrameLayout implements InterfaceC29659c {

    /* JADX INFO: renamed from: w */
    public final CollapsibleActionView f127113w;

    /* JADX WARN: Multi-variable type inference failed */
    public C30822p(View view) {
        super(view.getContext());
        this.f127113w = (CollapsibleActionView) view;
        addView(view);
    }
}
