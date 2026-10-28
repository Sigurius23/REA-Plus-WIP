package p474s;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: s.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31994p1 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C32018v1 f132799w;

    public C31994p1(C32018v1 c32018v1) {
        this.f132799w = c32018v1;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i13, long j7) {
        C31974k1 c31974k1;
        if (i13 == -1 || (c31974k1 = this.f132799w.f132874y) == null) {
            return;
        }
        c31974k1.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
