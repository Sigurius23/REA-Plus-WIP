package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillImageButton;
import com.whoop.realtime.presentation.views.RealTimeCell;
import com.whoop.realtime.presentation.views.RealTimeStrainDial;
import com.whoop.realtime.presentation.views.RealTimeStrainRangeView;
import de.hdodenhof.circleimageview.CircleImageView;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.d */
/* JADX INFO: loaded from: classes10.dex */
public class C25084d extends AbstractC25083c {

    /* JADX INFO: renamed from: A */
    private static final C1191u f98302A = null;

    /* JADX INFO: renamed from: B */
    private static final SparseIntArray f98303B;

    /* JADX INFO: renamed from: y */
    private final LinearLayout f98304y;

    /* JADX INFO: renamed from: z */
    private long f98305z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98303B = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86354i1, 1);
        sparseIntArray.put(AbstractC22208d.f86380v0, 2);
        sparseIntArray.put(AbstractC22208d.f86355j, 3);
        sparseIntArray.put(AbstractC22208d.f86300M, 4);
        sparseIntArray.put(AbstractC22208d.f86388z0, 5);
        sparseIntArray.put(AbstractC22208d.f86291H0, 6);
        sparseIntArray.put(AbstractC22208d.f86293I0, 7);
        sparseIntArray.put(AbstractC22208d.f86285E0, 8);
        sparseIntArray.put(AbstractC22208d.f86374s0, 9);
        sparseIntArray.put(AbstractC22208d.f86376t0, 10);
        sparseIntArray.put(AbstractC22208d.f86302N, 11);
        sparseIntArray.put(AbstractC22208d.f86277A0, 12);
        sparseIntArray.put(AbstractC22208d.f86279B0, 13);
        sparseIntArray.put(AbstractC22208d.f86283D0, 14);
        sparseIntArray.put(AbstractC22208d.f86281C0, 15);
        sparseIntArray.put(AbstractC22208d.f86338d0, 16);
        sparseIntArray.put(AbstractC22208d.f86358k0, 17);
        sparseIntArray.put(AbstractC22208d.f86360l0, 18);
        sparseIntArray.put(AbstractC22208d.f86346g, 19);
        sparseIntArray.put(AbstractC22208d.f86381w, 20);
        sparseIntArray.put(AbstractC22208d.f86349h, 21);
        sparseIntArray.put(AbstractC22208d.f86350h0, 22);
        sparseIntArray.put(AbstractC22208d.f86352i, 23);
        sparseIntArray.put(AbstractC22208d.f86385y, 24);
    }

    public C25084d(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 25, f98302A, f98303B));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f98305z = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98305z != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98305z = 1L;
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

    private C25084d(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (LinearLayout) objArr[19], (View) objArr[21], (View) objArr[23], (LinearLayout) objArr[3], (RealTimeCell) objArr[20], (RealTimeCell) objArr[24], (TextView) objArr[11], (StrokedPillImageButton) objArr[4], (RealTimeCell) objArr[16], (RealTimeCell) objArr[22], (RealTimeStrainRangeView) objArr[17], (ComposeView) objArr[18], (LinearLayout) objArr[9], (CircleImageView) objArr[10], (RealTimeStrainDial) objArr[2], (LinearLayout) objArr[5], (LinearLayout) objArr[12], (ImageView) objArr[13], (TextView) objArr[15], (TextView) objArr[14], (TextView) objArr[8], (TextView) objArr[6], (TextView) objArr[7], (ImageView) objArr[1]);
        this.f98305z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f98304y = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
