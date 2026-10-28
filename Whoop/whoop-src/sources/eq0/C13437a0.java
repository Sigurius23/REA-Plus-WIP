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
import com.whoop.community.presentation.p059ui.PillRadioGroup;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.a0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13437a0 extends AbstractC13558z {

    /* JADX INFO: renamed from: n */
    private static final C1191u f47109n = null;

    /* JADX INFO: renamed from: o */
    private static final SparseIntArray f47110o;

    /* JADX INFO: renamed from: m */
    private long f47111m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47110o = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165207W0, 1);
        sparseIntArray.put(AbstractC38499a0.f165199V0, 2);
        sparseIntArray.put(AbstractC38499a0.f165223Y0, 3);
        sparseIntArray.put(AbstractC38499a0.f165215X0, 4);
        sparseIntArray.put(AbstractC38499a0.f165073G5, 5);
        sparseIntArray.put(AbstractC38499a0.f165055E5, 6);
        sparseIntArray.put(AbstractC38499a0.f165082H5, 7);
        sparseIntArray.put(AbstractC38499a0.f165064F5, 8);
        sparseIntArray.put(AbstractC38499a0.f165191U0, 9);
        sparseIntArray.put(AbstractC38499a0.f165142O2, 10);
        sparseIntArray.put(AbstractC38499a0.f165160Q2, 11);
    }

    public C13437a0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 12, f47109n, f47110o));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47111m = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47111m != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47111m = 1L;
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

    private C13437a0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (StrokedPillButton) objArr[9], (TextView) objArr[2], (ImageView) objArr[1], (ConstraintLayout) objArr[0], (TextView) objArr[4], (PillRadioGroup) objArr[3], (Guideline) objArr[10], (Guideline) objArr[11], (RadioButton) objArr[6], (RadioButton) objArr[8], (RadioGroup) objArr[5], (RadioButton) objArr[7]);
        this.f47111m = -1L;
        this.f47791d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
