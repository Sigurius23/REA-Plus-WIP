package gf2;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.coaching.sleepcoach.harvard.view.OptimalSleepView;
import com.whoop.coaching.sleepcoach.harvard.view.TonightSleepBar;
import qe2.AbstractC30312e;

/* JADX INFO: renamed from: gf2.d */
/* JADX INFO: loaded from: classes10.dex */
public class C15795d extends AbstractC15794c {

    /* JADX INFO: renamed from: n */
    private static final C1191u f59550n = null;

    /* JADX INFO: renamed from: o */
    private static final SparseIntArray f59551o;

    /* JADX INFO: renamed from: l */
    private final ConstraintLayout f59552l;

    /* JADX INFO: renamed from: m */
    private long f59553m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f59551o = sparseIntArray;
        sparseIntArray.put(AbstractC30312e.f124163j0, 1);
        sparseIntArray.put(AbstractC30312e.f124206x1, 2);
        sparseIntArray.put(AbstractC30312e.f124058A1, 3);
        sparseIntArray.put(AbstractC30312e.f124212z1, 4);
        sparseIntArray.put(AbstractC30312e.f124124W1, 5);
        sparseIntArray.put(AbstractC30312e.f124112S1, 6);
        sparseIntArray.put(AbstractC30312e.f124208y0, 7);
        sparseIntArray.put(AbstractC30312e.f124064C1, 8);
        sparseIntArray.put(AbstractC30312e.f124122W, 9);
        sparseIntArray.put(AbstractC30312e.f124116U, 10);
        sparseIntArray.put(AbstractC30312e.f124067D1, 11);
    }

    public C15795d(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 12, f59550n, f59551o));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f59553m = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f59553m != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f59553m = 1L;
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

    /* JADX WARN: Illegal instructions before constructor call */
    private C15795d(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        Guideline guideline = (Guideline) objArr[10];
        Guideline guideline2 = (Guideline) objArr[9];
        Object obj = objArr[1];
        super(interfaceC1176f, view, 0, guideline, guideline2, obj != null ? C15808q.m44605a((View) obj) : null, (OptimalSleepView) objArr[7], (ConstraintLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (TonightSleepBar) objArr[8], (View) objArr[11], (TextView) objArr[6], (TextView) objArr[5]);
        this.f59553m = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f59552l = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
