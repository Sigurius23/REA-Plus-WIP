package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.s */
/* JADX INFO: loaded from: classes7.dex */
public class C13526s extends AbstractC13521r {

    /* JADX INFO: renamed from: e */
    private static final C1191u f47624e = null;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f47625f;

    /* JADX INFO: renamed from: d */
    private long f47626d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47625f = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165118L5, 1);
        sparseIntArray.put(AbstractC38499a0.f165091I5, 2);
    }

    public C13526s(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f47624e, f47625f));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47626d = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47626d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47626d = 1L;
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

    private C13526s(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (TextView) objArr[2], (ImageView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f47626d = -1L;
        this.f47574c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
