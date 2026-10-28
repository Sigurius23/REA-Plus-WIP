package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.y */
/* JADX INFO: loaded from: classes7.dex */
public class C13554y extends AbstractC13550x {

    /* JADX INFO: renamed from: g */
    private static final C1191u f47761g = null;

    /* JADX INFO: renamed from: h */
    private static final SparseIntArray f47762h;

    /* JADX INFO: renamed from: f */
    private long f47763f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47762h = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165471z7, 1);
        sparseIntArray.put(AbstractC38499a0.f165245a6, 2);
        sparseIntArray.put(AbstractC38499a0.f165021A7, 3);
        sparseIntArray.put(AbstractC38499a0.f165462y7, 4);
    }

    public C13554y(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 5, f47761g, f47762h));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47763f = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47763f != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47763f = 1L;
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

    private C13554y(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (TextView) objArr[2], (StrokedPillButton) objArr[4], (ConstraintLayout) objArr[0], (ImageView) objArr[1], (TextView) objArr[3]);
        this.f47763f = -1L;
        this.f47741c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
