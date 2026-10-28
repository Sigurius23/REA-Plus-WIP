package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.m1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13498m1 extends AbstractC13493l1 {

    /* JADX INFO: renamed from: x */
    private static final C1191u f47463x = null;

    /* JADX INFO: renamed from: y */
    private static final SparseIntArray f47464y;

    /* JADX INFO: renamed from: v */
    private final ConstraintLayout f47465v;

    /* JADX INFO: renamed from: w */
    private long f47466w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47464y = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165103K, 1);
        sparseIntArray.put(AbstractC38499a0.f165094J, 2);
        sparseIntArray.put(AbstractC38499a0.f165317i6, 3);
        sparseIntArray.put(AbstractC38499a0.f165308h6, 4);
        sparseIntArray.put(AbstractC38499a0.f165263c6, 5);
        sparseIntArray.put(AbstractC38499a0.f165272d6, 6);
        sparseIntArray.put(AbstractC38499a0.f165299g6, 7);
        sparseIntArray.put(AbstractC38499a0.f165290f6, 8);
        sparseIntArray.put(AbstractC38499a0.f165281e6, 9);
        sparseIntArray.put(AbstractC38499a0.f165344l6, 10);
        sparseIntArray.put(AbstractC38499a0.f165326j6, 11);
        sparseIntArray.put(AbstractC38499a0.f165335k6, 12);
        sparseIntArray.put(AbstractC38499a0.f165196U5, 13);
        sparseIntArray.put(AbstractC38499a0.f165204V5, 14);
        sparseIntArray.put(AbstractC38499a0.f165112L, 15);
        sparseIntArray.put(AbstractC38499a0.f165341l3, 16);
        sparseIntArray.put(AbstractC38499a0.f165188T5, 17);
        sparseIntArray.put(AbstractC38499a0.f165083H6, 18);
        sparseIntArray.put(AbstractC38499a0.f165092I6, 19);
        sparseIntArray.put(AbstractC38499a0.f165074G6, 20);
        sparseIntArray.put(AbstractC38499a0.f165101J6, 21);
    }

    public C13498m1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 22, f47463x, f47464y));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47466w = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47466w != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47466w = 1L;
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

    private C13498m1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (FrameLayout) objArr[2], (WhoopNewToolbar) objArr[1], (TextView) objArr[15], (StrokedPillButton) objArr[16], (RecyclerView) objArr[17], (ImageView) objArr[13], (TextView) objArr[14], (ImageView) objArr[5], (ImageView) objArr[6], (ImageView) objArr[9], (TextView) objArr[8], (TextView) objArr[7], (ImageView) objArr[4], (EditText) objArr[3], (TextView) objArr[11], (ImageView) objArr[12], (TextView) objArr[10], (TextView) objArr[20], (FrameLayout) objArr[18], (TextView) objArr[19], (ImageView) objArr[21]);
        this.f47466w = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47465v = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
