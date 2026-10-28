package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.u */
/* JADX INFO: loaded from: classes7.dex */
public class C13536u extends AbstractC13531t {

    /* JADX INFO: renamed from: k */
    private static final C1191u f47673k = null;

    /* JADX INFO: renamed from: l */
    private static final SparseIntArray f47674l;

    /* JADX INFO: renamed from: j */
    private long f47675j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47674l = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165455y0, 1);
        sparseIntArray.put(AbstractC38499a0.f165464z0, 2);
        sparseIntArray.put(AbstractC38499a0.f165023B0, 3);
        sparseIntArray.put(AbstractC38499a0.f165014A0, 4);
        sparseIntArray.put(AbstractC38499a0.f165446x0, 5);
        sparseIntArray.put(AbstractC38499a0.f165032C0, 6);
        sparseIntArray.put(AbstractC38499a0.f165142O2, 7);
        sparseIntArray.put(AbstractC38499a0.f165160Q2, 8);
    }

    public C13536u(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, f47673k, f47674l));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47675j = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47675j != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47675j = 1L;
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

    private C13536u(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (RadioButton) objArr[5], (ImageView) objArr[1], (TextView) objArr[2], (RadioButton) objArr[4], (RadioGroup) objArr[3], (ConstraintLayout) objArr[0], (StrokedPillButton) objArr[6], (Guideline) objArr[7], (Guideline) objArr[8]);
        this.f47675j = -1L;
        this.f47650f.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
