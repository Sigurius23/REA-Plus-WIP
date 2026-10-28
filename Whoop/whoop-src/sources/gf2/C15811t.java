package gf2;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import qe2.AbstractC30308a;
import qe2.AbstractC30312e;

/* JADX INFO: renamed from: gf2.t */
/* JADX INFO: loaded from: classes10.dex */
public class C15811t extends AbstractC15810s {

    /* JADX INFO: renamed from: n */
    private static final C1191u f59689n = null;

    /* JADX INFO: renamed from: o */
    private static final SparseIntArray f59690o;

    /* JADX INFO: renamed from: l */
    private final ConstraintLayout f59691l;

    /* JADX INFO: renamed from: m */
    private long f59692m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f59690o = sparseIntArray;
        sparseIntArray.put(AbstractC30312e.f124167k1, 1);
        sparseIntArray.put(AbstractC30312e.f124072F0, 2);
        sparseIntArray.put(AbstractC30312e.f124075G0, 3);
        sparseIntArray.put(AbstractC30312e.f124078H0, 4);
        sparseIntArray.put(AbstractC30312e.f124069E0, 5);
        sparseIntArray.put(AbstractC30312e.f124081I0, 6);
        sparseIntArray.put(AbstractC30312e.f124084J0, 7);
        sparseIntArray.put(AbstractC30312e.f124087K0, 8);
    }

    public C15811t(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, f59689n, f59690o));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f59692m = 0L;
        }
    }

    @Override // gf2.AbstractC15810s
    /* JADX INFO: renamed from: g */
    public void mo44614g(int i13) {
        this.f59686i = i13;
    }

    @Override // gf2.AbstractC15810s
    /* JADX INFO: renamed from: h */
    public void mo44615h(String str) {
        this.f59688k = str;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f59692m != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // gf2.AbstractC15810s
    /* JADX INFO: renamed from: i */
    public void mo44616i(int i13) {
        this.f59687j = i13;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f59692m = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        return false;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        if (AbstractC30308a.f124021b == i13) {
            mo44615h((String) obj);
            return true;
        }
        if (AbstractC30308a.f124020a == i13) {
            mo44614g(((Integer) obj).intValue());
            return true;
        }
        if (AbstractC30308a.f124022c != i13) {
            return false;
        }
        mo44616i(((Integer) obj).intValue());
        return true;
    }

    private C15811t(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (RadioButton) objArr[5], (RadioButton) objArr[2], (RadioButton) objArr[3], (RadioButton) objArr[4], (RadioButton) objArr[6], (RadioButton) objArr[7], (RadioButton) objArr[8], (RadioGroup) objArr[1]);
        this.f59692m = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f59691l = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
