package androidx.lifecycle;

import android.os.Handler;
import android.widget.FrameLayout;
import androidx.viewpager2.adapter.AbstractC1861i;
import androidx.viewpager2.adapter.C1862j;
import androidx.viewpager2.adapter.RunnableC1854b;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.lifecycle.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1570c1 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6194w = 2;

    /* JADX INFO: renamed from: x */
    public final Object f6195x;

    /* JADX INFO: renamed from: y */
    public final Object f6196y;

    public C1570c1(InterfaceC1581f0 interfaceC1581f0) {
        this.f6195x = interfaceC1581f0;
        C1580f c1580f = C1580f.f6215c;
        Class<?> cls = interfaceC1581f0.getClass();
        C1572d c1572d = (C1572d) c1580f.f6216a.get(cls);
        this.f6196y = c1572d == null ? c1580f.m4977a(cls, null) : c1572d;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        switch (this.f6194w) {
            case 0:
                HashMap map = ((C1572d) this.f6196y).f6197a;
                List list = (List) map.get(enumC1632v);
                Object obj = this.f6195x;
                C1572d.m4974a(list, interfaceC1585g0, enumC1632v, obj);
                C1572d.m4974a((List) map.get(EnumC1632v.ON_ANY), interfaceC1585g0, enumC1632v, obj);
                break;
            case 1:
                C1862j c1862j = (C1862j) this.f6195x;
                AbstractC1861i abstractC1861i = (AbstractC1861i) this.f6196y;
                if (!abstractC1861i.shouldDelayFragmentTransactions()) {
                    interfaceC1585g0.getLifecycle().mo4988d(this);
                    if (((FrameLayout) c1862j.itemView).isAttachedToWindow()) {
                        abstractC1861i.placeFragmentInViewHolder(c1862j);
                    }
                    break;
                }
                break;
            default:
                if (enumC1632v == EnumC1632v.ON_DESTROY) {
                    ((Handler) this.f6195x).removeCallbacks((RunnableC1854b) this.f6196y);
                    interfaceC1585g0.getLifecycle().mo4988d(this);
                }
                break;
        }
    }

    public C1570c1(AbstractC1861i abstractC1861i, C1862j c1862j) {
        this.f6196y = abstractC1861i;
        this.f6195x = c1862j;
    }

    public C1570c1(Handler handler, RunnableC1854b runnableC1854b) {
        this.f6195x = handler;
        this.f6196y = runnableC1854b;
    }
}
