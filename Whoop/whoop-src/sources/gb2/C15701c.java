package gb2;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.p069ui.views.ColoredImageView;
import p705ea2.AbstractC12920q;

/* JADX INFO: renamed from: gb2.c */
/* JADX INFO: loaded from: classes10.dex */
public class C15701c extends AbstractC15700b {

    /* JADX INFO: renamed from: b0 */
    private static final C1191u f59013b0 = null;

    /* JADX INFO: renamed from: c0 */
    private static final SparseIntArray f59014c0;

    /* JADX INFO: renamed from: Z */
    private final ConstraintLayout f59015Z;

    /* JADX INFO: renamed from: a0 */
    private long f59016a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f59014c0 = sparseIntArray;
        sparseIntArray.put(AbstractC12920q.f44481F, 1);
        sparseIntArray.put(AbstractC12920q.f44527m0, 2);
        sparseIntArray.put(AbstractC12920q.f44548z, 3);
        sparseIntArray.put(AbstractC12920q.f44547y, 4);
        sparseIntArray.put(AbstractC12920q.f44477B, 5);
        sparseIntArray.put(AbstractC12920q.f44476A, 6);
        sparseIntArray.put(AbstractC12920q.f44546x, 7);
        sparseIntArray.put(AbstractC12920q.f44480E, 8);
        sparseIntArray.put(AbstractC12920q.f44478C, 9);
        sparseIntArray.put(AbstractC12920q.f44479D, 10);
        sparseIntArray.put(AbstractC12920q.f44518i, 11);
        sparseIntArray.put(AbstractC12920q.f44514g, 12);
        sparseIntArray.put(AbstractC12920q.f44516h, 13);
        sparseIntArray.put(AbstractC12920q.f44520j, 14);
        sparseIntArray.put(AbstractC12920q.f44542u, 15);
        sparseIntArray.put(AbstractC12920q.f44540t, 16);
        sparseIntArray.put(AbstractC12920q.f44545w, 17);
        sparseIntArray.put(AbstractC12920q.f44544v, 18);
        sparseIntArray.put(AbstractC12920q.f44504b, 19);
        sparseIntArray.put(AbstractC12920q.f44491P, 20);
        sparseIntArray.put(AbstractC12920q.f44512f, 21);
        sparseIntArray.put(AbstractC12920q.f44508d, 22);
        sparseIntArray.put(AbstractC12920q.f44510e, 23);
        sparseIntArray.put(AbstractC12920q.f44507c0, 24);
        sparseIntArray.put(AbstractC12920q.f44503a0, 25);
        sparseIntArray.put(AbstractC12920q.f44505b0, 26);
        sparseIntArray.put(AbstractC12920q.f44509d0, 27);
        sparseIntArray.put(AbstractC12920q.f44500Y, 28);
        sparseIntArray.put(AbstractC12920q.f44498W, 29);
        sparseIntArray.put(AbstractC12920q.f44499X, 30);
        sparseIntArray.put(AbstractC12920q.f44501Z, 31);
        sparseIntArray.put(AbstractC12920q.f44490O, 32);
        sparseIntArray.put(AbstractC12920q.f44488M, 33);
        sparseIntArray.put(AbstractC12920q.f44489N, 34);
        sparseIntArray.put(AbstractC12920q.f44521j0, 35);
        sparseIntArray.put(AbstractC12920q.f44517h0, 36);
        sparseIntArray.put(AbstractC12920q.f44519i0, 37);
        sparseIntArray.put(AbstractC12920q.f44526m, 38);
        sparseIntArray.put(AbstractC12920q.f44522k, 39);
        sparseIntArray.put(AbstractC12920q.f44524l, 40);
        sparseIntArray.put(AbstractC12920q.f44492Q, 41);
        sparseIntArray.put(AbstractC12920q.f44493R, 42);
        sparseIntArray.put(AbstractC12920q.f44497V, 43);
        sparseIntArray.put(AbstractC12920q.f44529n0, 44);
        sparseIntArray.put(AbstractC12920q.f44534q, 45);
        sparseIntArray.put(AbstractC12920q.f44538s, 46);
        sparseIntArray.put(AbstractC12920q.f44532p, 47);
        sparseIntArray.put(AbstractC12920q.f44536r, 48);
        sparseIntArray.put(AbstractC12920q.f44530o, 49);
        sparseIntArray.put(AbstractC12920q.f44528n, 50);
        sparseIntArray.put(AbstractC12920q.f44506c, 51);
    }

    public C15701c(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 52, f59013b0, f59014c0));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f59016a0 = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f59016a0 != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f59016a0 = 1L;
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

    private C15701c(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ComposeView) objArr[19], (ComposeView) objArr[51], (ColoredImageView) objArr[22], (TextView) objArr[23], (ConstraintLayout) objArr[21], (ColoredImageView) objArr[12], (TextView) objArr[13], (ConstraintLayout) objArr[11], (TextView) objArr[14], (ColoredImageView) objArr[39], (TextView) objArr[40], (ConstraintLayout) objArr[38], (ColoredImageView) objArr[50], (ConstraintLayout) objArr[49], (TextView) objArr[47], (ConstraintLayout) objArr[45], (TextView) objArr[48], (ColoredImageView) objArr[46], (ColoredImageView) objArr[16], (ConstraintLayout) objArr[15], (TextView) objArr[18], (TextView) objArr[17], (StrokedPillButton) objArr[7], (ColoredImageView) objArr[4], (ConstraintLayout) objArr[3], (TextView) objArr[6], (TextView) objArr[5], (View) objArr[9], (TextView) objArr[10], (ComposeView) objArr[8], (WhoopNewToolbar) objArr[1], (ColoredImageView) objArr[33], (TextView) objArr[34], (ConstraintLayout) objArr[32], (ComposeView) objArr[20], (View) objArr[41], (TextView) objArr[42], (ConstraintLayout) objArr[43], (ColoredImageView) objArr[29], (TextView) objArr[30], (ConstraintLayout) objArr[28], (TextView) objArr[31], (ColoredImageView) objArr[25], (TextView) objArr[26], (ConstraintLayout) objArr[24], (TextView) objArr[27], (ColoredImageView) objArr[36], (TextView) objArr[37], (ConstraintLayout) objArr[35], (NestedScrollView) objArr[2], (ColoredImageView) objArr[44]);
        this.f59016a0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f59015Z = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
