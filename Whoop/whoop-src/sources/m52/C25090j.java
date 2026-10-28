package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.j */
/* JADX INFO: loaded from: classes10.dex */
public class C25090j extends AbstractC25089i {

    /* JADX INFO: renamed from: e */
    private static final C1191u f98333e = null;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f98334f;

    /* JADX INFO: renamed from: c */
    private final FrameLayout f98335c;

    /* JADX INFO: renamed from: d */
    private long f98336d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98334f = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86304O, 1);
        sparseIntArray.put(AbstractC22208d.f86306P, 2);
    }

    public C25090j(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f98333e, f98334f));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98336d = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98336d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98336d = 1L;
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

    private C25090j(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[1], (TextView) objArr[2]);
        this.f98336d = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f98335c = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
