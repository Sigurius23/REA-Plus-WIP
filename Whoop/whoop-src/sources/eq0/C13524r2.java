package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.community.presentation.p059ui.PillRadioGroup;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.r2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13524r2 extends AbstractC13519q2 {

    /* JADX INFO: renamed from: n */
    private static final C1191u f47616n = null;

    /* JADX INFO: renamed from: o */
    private static final SparseIntArray f47617o;

    /* JADX INFO: renamed from: l */
    private final LinearLayout f47618l;

    /* JADX INFO: renamed from: m */
    private long f47619m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47617o = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165209W2, 1);
        sparseIntArray.put(AbstractC38499a0.f165230Z, 2);
        sparseIntArray.put(AbstractC38499a0.f165244a5, 3);
        sparseIntArray.put(AbstractC38499a0.f165369o4, 4);
        sparseIntArray.put(AbstractC38499a0.f165338l0, 5);
        sparseIntArray.put(AbstractC38499a0.f165371o6, 6);
        sparseIntArray.put(AbstractC38499a0.f165164Q6, 7);
        sparseIntArray.put(AbstractC38499a0.f165237Z6, 8);
        sparseIntArray.put(AbstractC38499a0.f165038C6, 9);
        sparseIntArray.put(AbstractC38499a0.f165342l4, 10);
        sparseIntArray.put(AbstractC38499a0.f165180S5, 11);
    }

    public C13524r2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 12, f47616n, f47617o));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47619m = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47619m != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47619m = 1L;
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

    private C13524r2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[2], (StrokedPillButton) objArr[5], (FrameLayout) objArr[1], (TextView) objArr[10], (ImageView) objArr[4], (TextView) objArr[3], (View) objArr[11], (PillRadioGroup) objArr[6], (TextView) objArr[9], (TextView) objArr[7], (TextView) objArr[8]);
        this.f47619m = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f47618l = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
