package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.community.presentation.p059ui.PillRadioGroup;
import com.whoop.community.presentation.teams.calendar.TeamCalendarView;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.v2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13544v2 extends AbstractC13539u2 {

    /* JADX INFO: renamed from: s */
    private static final C1191u f47717s = null;

    /* JADX INFO: renamed from: t */
    private static final SparseIntArray f47718t;

    /* JADX INFO: renamed from: r */
    private long f47719r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47718t = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165360n4, 1);
        sparseIntArray.put(AbstractC38499a0.f165201V2, 2);
        sparseIntArray.put(AbstractC38499a0.f165363n7, 3);
        sparseIntArray.put(AbstractC38499a0.f165374p0, 4);
        sparseIntArray.put(AbstractC38499a0.f165410t0, 5);
        sparseIntArray.put(AbstractC38499a0.f165235Z4, 6);
        sparseIntArray.put(AbstractC38499a0.f165401s0, 7);
        sparseIntArray.put(AbstractC38499a0.f165264c7, 8);
        sparseIntArray.put(AbstractC38499a0.f165184T1, 9);
        sparseIntArray.put(AbstractC38499a0.f165173R6, 10);
        sparseIntArray.put(AbstractC38499a0.f165155P6, 11);
        sparseIntArray.put(AbstractC38499a0.f165329k0, 12);
        sparseIntArray.put(AbstractC38499a0.f165142O2, 13);
        sparseIntArray.put(AbstractC38499a0.f165177S2, 14);
        sparseIntArray.put(AbstractC38499a0.f165160Q2, 15);
        sparseIntArray.put(AbstractC38499a0.f165169R2, 16);
    }

    public C13544v2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 17, f47717s, f47718t));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47719r = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47719r != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47719r = 1L;
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

    private C13544v2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (StrokedPillButton) objArr[12], (ImageView) objArr[7], (ImageView) objArr[5], (PillRadioGroup) objArr[4], (View) objArr[9], (Guideline) objArr[13], (Guideline) objArr[15], (Guideline) objArr[16], (Guideline) objArr[14], (ImageView) objArr[2], (ConstraintLayout) objArr[1], (LinearLayout) objArr[0], (TextView) objArr[6], (TextView) objArr[10], (PillRadioGroup) objArr[11], (TeamCalendarView) objArr[8], (TextView) objArr[3]);
        this.f47719r = -1L;
        this.f47694l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
