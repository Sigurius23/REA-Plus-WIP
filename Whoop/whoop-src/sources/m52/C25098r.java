package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.realtime.presentation.views.RealTimeCell;
import com.whoop.realtime.presentation.views.StrainCoachStrainGraph;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.r */
/* JADX INFO: loaded from: classes10.dex */
public class C25098r extends AbstractC25097q {

    /* JADX INFO: renamed from: s */
    private static final C1191u f98369s = null;

    /* JADX INFO: renamed from: t */
    private static final SparseIntArray f98370t;

    /* JADX INFO: renamed from: q */
    private final ConstraintLayout f98371q;

    /* JADX INFO: renamed from: r */
    private long f98372r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98370t = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86333b1, 1);
        sparseIntArray.put(AbstractC22208d.f86315T0, 2);
        sparseIntArray.put(AbstractC22208d.f86321W0, 3);
        sparseIntArray.put(AbstractC22208d.f86319V0, 4);
        sparseIntArray.put(AbstractC22208d.f86323X0, 5);
        sparseIntArray.put(AbstractC22208d.f86324Y, 6);
        sparseIntArray.put(AbstractC22208d.f86322X, 7);
        sparseIntArray.put(AbstractC22208d.f86320W, 8);
        sparseIntArray.put(AbstractC22208d.f86318V, 9);
        sparseIntArray.put(AbstractC22208d.f86288G, 10);
        sparseIntArray.put(AbstractC22208d.f86305O0, 11);
        sparseIntArray.put(AbstractC22208d.f86330a1, 12);
        sparseIntArray.put(AbstractC22208d.f86327Z0, 13);
        sparseIntArray.put(AbstractC22208d.f86362m0, 14);
        sparseIntArray.put(AbstractC22208d.f86295J0, 15);
        sparseIntArray.put(AbstractC22208d.f86325Y0, 16);
    }

    public C25098r(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 17, f98369s, f98370t));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98372r = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98372r != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98372r = 1L;
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

    private C25098r(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (TextView) objArr[10], (Guideline) objArr[9], (Guideline) objArr[8], (Guideline) objArr[7], (Guideline) objArr[6], (TextView) objArr[14], (TextView) objArr[15], (FrameLayout) objArr[11], (ConstraintLayout) objArr[2], (RealTimeCell) objArr[4], (RealTimeCell) objArr[3], (RealTimeCell) objArr[5], (TextView) objArr[16], (LinearLayout) objArr[13], (StrainCoachStrainGraph) objArr[12], (TextView) objArr[1]);
        this.f98372r = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f98371q = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
