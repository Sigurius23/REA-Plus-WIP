package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.views.ColoredImageView;

/* JADX INFO: renamed from: m52.v */
/* JADX INFO: loaded from: classes10.dex */
public class C25102v extends AbstractC25101u {

    /* JADX INFO: renamed from: e */
    private static final C1191u f98386e = null;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f98387f = null;

    /* JADX INFO: renamed from: d */
    private long f98388d;

    public C25102v(InterfaceC1176f interfaceC1176f, View[] viewArr) {
        this(interfaceC1176f, viewArr, AbstractC1168a0.mapBindings(interfaceC1176f, viewArr, 3, f98386e, f98387f));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98388d = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98388d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98388d = 1L;
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

    private C25102v(InterfaceC1176f interfaceC1176f, View[] viewArr, Object[] objArr) {
        super(interfaceC1176f, viewArr[0], 0, (ColoredImageView) objArr[0], (TextView) objArr[1], (TextView) objArr[2]);
        this.f98388d = -1L;
        this.f98383a.setTag(null);
        this.f98384b.setTag(null);
        this.f98385c.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
