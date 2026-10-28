package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.realtime.presentation.views.RealTimeStrainRangeSegment;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.t */
/* JADX INFO: loaded from: classes10.dex */
public class C25100t extends AbstractC25099s {

    /* JADX INFO: renamed from: i */
    private static final C1191u f98379i = null;

    /* JADX INFO: renamed from: j */
    private static final SparseIntArray f98380j;

    /* JADX INFO: renamed from: g */
    private final FrameLayout f98381g;

    /* JADX INFO: renamed from: h */
    private long f98382h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98380j = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86339d1, 1);
        sparseIntArray.put(AbstractC22208d.f86351h1, 2);
        sparseIntArray.put(AbstractC22208d.f86348g1, 3);
        sparseIntArray.put(AbstractC22208d.f86336c1, 4);
        sparseIntArray.put(AbstractC22208d.f86345f1, 5);
        sparseIntArray.put(AbstractC22208d.f86342e1, 6);
    }

    public C25100t(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 7, f98379i, f98380j));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98382h = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98382h != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98382h = 1L;
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

    private C25100t(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (RealTimeStrainRangeSegment) objArr[4], (RealTimeStrainRangeSegment) objArr[1], (ImageView) objArr[6], (RealTimeStrainRangeSegment) objArr[5], (RealTimeStrainRangeSegment) objArr[3], (RealTimeStrainRangeSegment) objArr[2]);
        this.f98382h = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f98381g = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
