package androidx.viewpager2.adapter;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p190hc.AbstractC17145h;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C1856d extends AbstractC17145h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7299a;

    /* JADX INFO: renamed from: b */
    public final Object f7300b;

    public C1856d() {
        this.f7299a = 1;
        this.f7300b = new ArrayList(3);
    }

    @Override // p190hc.AbstractC17145h
    public final void onPageScrollStateChanged(int i13) {
        switch (this.f7299a) {
            case 0:
                ((C1859g) this.f7300b).m5504b(false);
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f7300b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC17145h) it.next()).onPageScrollStateChanged(i13);
                    }
                    return;
                } catch (ConcurrentModificationException e5) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                }
        }
    }

    @Override // p190hc.AbstractC17145h
    public void onPageScrolled(int i13, float f13, int i14) {
        switch (this.f7299a) {
            case 1:
                try {
                    Iterator it = ((ArrayList) this.f7300b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC17145h) it.next()).onPageScrolled(i13, f13, i14);
                    }
                    return;
                } catch (ConcurrentModificationException e5) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                }
            default:
                super.onPageScrolled(i13, f13, i14);
                return;
        }
    }

    @Override // p190hc.AbstractC17145h
    public final void onPageSelected(int i13) {
        switch (this.f7299a) {
            case 0:
                ((C1859g) this.f7300b).m5504b(false);
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f7300b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC17145h) it.next()).onPageSelected(i13);
                    }
                    return;
                } catch (ConcurrentModificationException e5) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                }
        }
    }

    public C1856d(C1859g c1859g) {
        this.f7299a = 0;
        this.f7300b = c1859g;
    }
}
