package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;

/* JADX INFO: renamed from: m52.x */
/* JADX INFO: loaded from: classes10.dex */
public class C25104x extends AbstractC25103w {

    /* JADX INFO: renamed from: d */
    private static final C1191u f98391d = null;

    /* JADX INFO: renamed from: e */
    private static final SparseIntArray f98392e = null;

    /* JADX INFO: renamed from: c */
    private long f98393c;

    public C25104x(InterfaceC1176f interfaceC1176f, View[] viewArr) {
        this(interfaceC1176f, viewArr, AbstractC1168a0.mapBindings(interfaceC1176f, viewArr, 2, f98391d, f98392e));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98393c = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98393c != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98393c = 1L;
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

    private C25104x(InterfaceC1176f interfaceC1176f, View[] viewArr, Object[] objArr) {
        super(interfaceC1176f, viewArr[0], 0, (ImageView) objArr[0], (TextView) objArr[1]);
        this.f98393c = -1L;
        this.f98389a.setTag(null);
        this.f98390b.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
