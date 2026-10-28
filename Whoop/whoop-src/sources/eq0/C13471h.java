package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.WhoopEditText;
import com.whoop.p069ui.WhoopToolbar;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.h */
/* JADX INFO: loaded from: classes7.dex */
public class C13471h extends AbstractC13466g {

    /* JADX INFO: renamed from: s */
    private static final C1191u f47321s = null;

    /* JADX INFO: renamed from: t */
    private static final SparseIntArray f47322t;

    /* JADX INFO: renamed from: r */
    private long f47323r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47322t = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165315i4, 1);
        sparseIntArray.put(AbstractC38499a0.f165174S, 2);
        sparseIntArray.put(AbstractC38499a0.f165306h4, 3);
        sparseIntArray.put(AbstractC38499a0.f165320j0, 4);
        sparseIntArray.put(AbstractC38499a0.f165311i0, 5);
        sparseIntArray.put(AbstractC38499a0.f165261c4, 6);
        sparseIntArray.put(AbstractC38499a0.f165288f4, 7);
        sparseIntArray.put(AbstractC38499a0.f165332k3, 8);
        sparseIntArray.put(AbstractC38499a0.f165323j3, 9);
        sparseIntArray.put(AbstractC38499a0.f165270d4, 10);
        sparseIntArray.put(AbstractC38499a0.f165279e4, 11);
        sparseIntArray.put(AbstractC38499a0.f165297g4, 12);
        sparseIntArray.put(AbstractC38499a0.f165142O2, 13);
        sparseIntArray.put(AbstractC38499a0.f165133N2, 14);
        sparseIntArray.put(AbstractC38499a0.f165185T2, 15);
        sparseIntArray.put(AbstractC38499a0.f165160Q2, 16);
    }

    public C13471h(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 17, f47321s, f47322t));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47323r = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47323r != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47323r = 1L;
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

    private C13471h(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[2], (TextView) objArr[5], (TextView) objArr[4], (Guideline) objArr[14], (Guideline) objArr[13], (Guideline) objArr[16], (Guideline) objArr[15], (TextView) objArr[9], (TextView) objArr[8], (StrokedPillButton) objArr[6], (WhoopEditText) objArr[10], (TextView) objArr[11], (ImageView) objArr[7], (ScrollView) objArr[0], (StrokedPillButton) objArr[12], (TextView) objArr[3], (WhoopToolbar) objArr[1]);
        this.f47323r = -1L;
        this.f47302n.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
