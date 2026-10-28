package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.l */
/* JADX INFO: loaded from: classes10.dex */
public class C25092l extends AbstractC25091k {

    /* JADX INFO: renamed from: e */
    private static final C1191u f98340e = null;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f98341f;

    /* JADX INFO: renamed from: d */
    private long f98342d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98341f = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86307P0, 1);
        sparseIntArray.put(AbstractC22208d.f86317U0, 2);
    }

    public C25092l(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f98340e, f98341f));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98342d = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98342d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98342d = 1L;
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

    private C25092l(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (LinearLayout) objArr[0], (TabLayout) objArr[1], (ViewPager2) objArr[2]);
        this.f98342d = -1L;
        this.f98337a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
