package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillButton;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.j */
/* JADX INFO: loaded from: classes7.dex */
public class C18551j extends AbstractC18549i {

    /* JADX INFO: renamed from: g */
    private static final C1191u f72292g = null;

    /* JADX INFO: renamed from: h */
    private static final SparseIntArray f72293h;

    /* JADX INFO: renamed from: e */
    private final ConstraintLayout f72294e;

    /* JADX INFO: renamed from: f */
    private long f72295f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72293h = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66609L1, 1);
        sparseIntArray.put(AbstractC17307e.f66621N1, 2);
        sparseIntArray.put(AbstractC17307e.f66615M1, 3);
        sparseIntArray.put(AbstractC17307e.f66575F3, 4);
    }

    public C18551j(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 5, f72292g, f72293h));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72295f = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72295f != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72295f = 1L;
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

    private C18551j(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[2], (StrokedPillButton) objArr[4]);
        this.f72295f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72294e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
