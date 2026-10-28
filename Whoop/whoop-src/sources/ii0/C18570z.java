package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.z */
/* JADX INFO: loaded from: classes7.dex */
public class C18570z extends AbstractC18569y {

    /* JADX INFO: renamed from: g */
    private static final C1191u f72555g = null;

    /* JADX INFO: renamed from: h */
    private static final SparseIntArray f72556h;

    /* JADX INFO: renamed from: e */
    private final ConstraintLayout f72557e;

    /* JADX INFO: renamed from: f */
    private long f72558f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72556h = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66803p0, 1);
        sparseIntArray.put(AbstractC17307e.f66817r0, 2);
        sparseIntArray.put(AbstractC17307e.f66824s0, 3);
        sparseIntArray.put(AbstractC17307e.f66810q0, 4);
    }

    public C18570z(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 5, f72555g, f72556h));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72558f = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72558f != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72558f = 1L;
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

    private C18570z(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (View) objArr[1], (TextView) objArr[4], (ImageView) objArr[2], (TextView) objArr[3]);
        this.f72558f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72557e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
