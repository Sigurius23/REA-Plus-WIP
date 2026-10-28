package iq0;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import lq0.C24654b;

/* JADX INFO: renamed from: iq0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnClickListenerC20817a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78154w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC1717o2 f78155x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC1692i1 f78156y;

    public /* synthetic */ ViewOnClickListenerC20817a(AbstractC1692i1 abstractC1692i1, AbstractC1717o2 abstractC1717o2, int i13) {
        this.f78154w = i13;
        this.f78155x = abstractC1717o2;
        this.f78156y = abstractC1692i1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f78154w) {
            case 0:
                C20819b.m57408d((C20819b.a) this.f78155x, (C20819b) this.f78156y, view);
                break;
            default:
                C20825e.m57441d((C24654b) this.f78155x, (C20825e) this.f78156y, view);
                break;
        }
    }
}
