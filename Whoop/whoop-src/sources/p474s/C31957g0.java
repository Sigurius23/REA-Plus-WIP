package p474s;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.oss.licenses.OssLicensesActivity;
import p403pp.C29408d;
import p656yp.C39699f;

/* JADX INFO: renamed from: s.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31957g0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132676w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f132677x;

    public /* synthetic */ C31957g0(Object obj, int i13) {
        this.f132676w = i13;
        this.f132677x = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j7) {
        switch (this.f132676w) {
            case 0:
                C31965i0 c31965i0 = (C31965i0) this.f132677x;
                C31977l0 c31977l0 = c31965i0.f132712g0;
                c31977l0.setSelection(i13);
                if (c31977l0.getOnItemClickListener() != null) {
                    c31977l0.performItemClick(view, i13, c31965i0.f132709d0.getItemId(i13));
                }
                c31965i0.dismiss();
                break;
            default:
                C29408d c29408d = (C29408d) adapterView.getItemAtPosition(i13);
                C39699f c39699f = (C39699f) this.f132677x;
                Intent intent = new Intent(c39699f.f170863F, (Class<?>) OssLicensesActivity.class);
                intent.putExtra("license", c29408d);
                c39699f.startActivity(intent);
                break;
        }
    }
}
