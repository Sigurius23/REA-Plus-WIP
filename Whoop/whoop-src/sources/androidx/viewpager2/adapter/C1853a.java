package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C1853a extends FragmentManager$FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f7294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f7295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1861i f7296c;

    public C1853a(AbstractC1861i abstractC1861i, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, FrameLayout frameLayout) {
        this.f7296c = abstractC1861i;
        this.f7294a = abstractComponentCallbacksC1320m0;
        this.f7295b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: j */
    public final void mo4039j(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, View view) {
        if (abstractComponentCallbacksC1320m0 == this.f7294a) {
            abstractC1329o1.m4181m0(this);
            this.f7296c.addViewToContainer(view, this.f7295b);
        }
    }
}
