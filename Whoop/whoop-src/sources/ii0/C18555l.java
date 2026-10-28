package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.views.AdvancedSettingsItemView;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.l */
/* JADX INFO: loaded from: classes7.dex */
public class C18555l extends AbstractC18553k {

    /* JADX INFO: renamed from: w */
    private static final C1191u f72330w = null;

    /* JADX INFO: renamed from: x */
    private static final SparseIntArray f72331x;

    /* JADX INFO: renamed from: u */
    private final ScrollView f72332u;

    /* JADX INFO: renamed from: v */
    private long f72333v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72331x = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66769k1, 1);
        sparseIntArray.put(AbstractC17307e.f66726e0, 2);
        sparseIntArray.put(AbstractC17307e.f66782m0, 3);
        sparseIntArray.put(AbstractC17307e.f66733f0, 4);
        sparseIntArray.put(AbstractC17307e.f66789n0, 5);
        sparseIntArray.put(AbstractC17307e.f66740g0, 6);
        sparseIntArray.put(AbstractC17307e.f66796o0, 7);
        sparseIntArray.put(AbstractC17307e.f66845v0, 8);
        sparseIntArray.put(AbstractC17307e.f66540A0, 9);
        sparseIntArray.put(AbstractC17307e.f66838u0, 10);
        sparseIntArray.put(AbstractC17307e.f66831t0, 11);
        sparseIntArray.put(AbstractC17307e.f66873z0, 12);
        sparseIntArray.put(AbstractC17307e.f66859x0, 13);
        sparseIntArray.put(AbstractC17307e.f66866y0, 14);
        sparseIntArray.put(AbstractC17307e.f66775l0, 15);
        sparseIntArray.put(AbstractC17307e.f66768k0, 16);
        sparseIntArray.put(AbstractC17307e.f66754i0, 17);
        sparseIntArray.put(AbstractC17307e.f66761j0, 18);
        sparseIntArray.put(AbstractC17307e.f66747h0, 19);
        sparseIntArray.put(AbstractC17307e.f66852w0, 20);
    }

    public C18555l(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 21, f72330w, f72331x));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72333v = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72333v != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72333v = 1L;
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

    private C18555l(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[6], (AdvancedSettingsItemView) objArr[19], (AdvancedSettingsItemView) objArr[17], (AdvancedSettingsItemView) objArr[18], (AdvancedSettingsItemView) objArr[16], (AdvancedSettingsItemView) objArr[15], (ImageView) objArr[3], (TextView) objArr[5], (TextView) objArr[7], (AdvancedSettingsItemView) objArr[11], (AdvancedSettingsItemView) objArr[10], (TextView) objArr[8], (AdvancedSettingsItemView) objArr[20], (AdvancedSettingsItemView) objArr[13], (AdvancedSettingsItemView) objArr[14], (AdvancedSettingsItemView) objArr[12], (Barrier) objArr[9], (ComposeView) objArr[1]);
        this.f72333v = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f72332u = scrollView;
        scrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
