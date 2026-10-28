package p144fc;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: fc.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C14353i extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewPager f52410a;

    public C14353i(ViewPager viewPager) {
        this.f52410a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f52410a.m5482g();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f52410a.m5482g();
    }
}
