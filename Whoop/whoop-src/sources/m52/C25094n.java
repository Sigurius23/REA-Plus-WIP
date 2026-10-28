package m52;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.mapbox.maps.MapView;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.n */
/* JADX INFO: loaded from: classes10.dex */
public class C25094n extends AbstractC25093m {

    /* JADX INFO: renamed from: d */
    private static final C1191u f98344d = null;

    /* JADX INFO: renamed from: e */
    private static final SparseIntArray f98345e;

    /* JADX INFO: renamed from: b */
    private final ConstraintLayout f98346b;

    /* JADX INFO: renamed from: c */
    private long f98347c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98345e = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86310R, 1);
    }

    public C25094n(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 2, f98344d, f98345e));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98347c = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98347c != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98347c = 1L;
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

    private C25094n(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (MapView) objArr[1]);
        this.f98347c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f98346b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
