package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.google.android.material.imageview.ShapeableImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.w */
/* JADX INFO: loaded from: classes7.dex */
public class C13546w extends AbstractC13541v {

    /* JADX INFO: renamed from: g */
    private static final C1191u f47724g = null;

    /* JADX INFO: renamed from: h */
    private static final SparseIntArray f47725h;

    /* JADX INFO: renamed from: f */
    private long f47726f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47725h = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165233Z2, 1);
        sparseIntArray.put(AbstractC38499a0.f165182T, 2);
        sparseIntArray.put(AbstractC38499a0.f165399r7, 3);
        sparseIntArray.put(AbstractC38499a0.f165168R1, 4);
    }

    public C13546w(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 5, f47724g, f47725h));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47726f = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47726f != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47726f = 1L;
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

    private C13546w(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (View) objArr[2], (TextView) objArr[4], (ShapeableImageView) objArr[1], (ConstraintLayout) objArr[0], (TextView) objArr[3]);
        this.f47726f = -1L;
        this.f47704d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
