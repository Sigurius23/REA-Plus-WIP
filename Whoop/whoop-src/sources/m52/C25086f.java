package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.views.LiveHeartRateView;
import com.whoop.p069ui.views.RealTimeHeartGraph;
import com.whoop.realtime.presentation.views.RealTimeCell;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.f */
/* JADX INFO: loaded from: classes10.dex */
public class C25086f extends AbstractC25085e {

    /* JADX INFO: renamed from: l */
    private static final C1191u f98315l = null;

    /* JADX INFO: renamed from: m */
    private static final SparseIntArray f98316m;

    /* JADX INFO: renamed from: j */
    private final FrameLayout f98317j;

    /* JADX INFO: renamed from: k */
    private long f98318k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98316m = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86329a0, 1);
        sparseIntArray.put(AbstractC22208d.f86335c0, 2);
        sparseIntArray.put(AbstractC22208d.f86354i1, 3);
        sparseIntArray.put(AbstractC22208d.f86346g, 4);
        sparseIntArray.put(AbstractC22208d.f86381w, 5);
        sparseIntArray.put(AbstractC22208d.f86349h, 6);
        sparseIntArray.put(AbstractC22208d.f86368p0, 7);
        sparseIntArray.put(AbstractC22208d.f86352i, 8);
        sparseIntArray.put(AbstractC22208d.f86385y, 9);
    }

    public C25086f(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 10, f98315l, f98316m));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98318k = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98318k != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98318k = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        return false;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C25086f(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (LinearLayout) objArr[4], (View) objArr[6], (View) objArr[8], (RealTimeCell) objArr[5], (RealTimeCell) objArr[9], (RealTimeHeartGraph) objArr[1], (LiveHeartRateView) objArr[2], (RealTimeCell) objArr[7], (ImageView) objArr[3]);
        this.f98318k = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f98317j = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
