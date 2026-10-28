package p314m;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: m.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C24834d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C24842h f97254w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24836e f97255x;

    public C24834d(C24836e c24836e, C24842h c24842h) {
        this.f97255x = c24836e;
        this.f97254w = c24842h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j7) {
        C24836e c24836e = this.f97255x;
        DialogInterface.OnClickListener onClickListener = c24836e.f97273r;
        C24842h c24842h = this.f97254w;
        onClickListener.onClick(c24842h.f97298b, i13);
        if (c24836e.f97275t) {
            return;
        }
        c24842h.f97298b.dismiss();
    }
}
