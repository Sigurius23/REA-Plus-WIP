package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.b3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13445b3 extends AbstractC13440a3 {

    /* JADX INFO: renamed from: d */
    private static final C1191u f47144d = null;

    /* JADX INFO: renamed from: e */
    private static final SparseIntArray f47145e;

    /* JADX INFO: renamed from: b */
    private final ConstraintLayout f47146b;

    /* JADX INFO: renamed from: c */
    private long f47147c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47145e = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165150P1, 1);
    }

    public C13445b3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 2, f47144d, f47145e));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47147c = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47147c != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47147c = 1L;
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

    private C13445b3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (TextView) objArr[1]);
        this.f47147c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47146b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
