package qz2;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.views.LiveHeartRateView;
import com.whoop.whooplive.live.views.WhoopGraphView;
import pz2.AbstractC29652e;

/* JADX INFO: renamed from: qz2.b */
/* JADX INFO: loaded from: classes11.dex */
public class C30801b extends AbstractC30800a {

    /* JADX INFO: renamed from: t */
    private static final C1191u f126966t = null;

    /* JADX INFO: renamed from: u */
    private static final SparseIntArray f126967u;

    /* JADX INFO: renamed from: r */
    private final ConstraintLayout f126968r;

    /* JADX INFO: renamed from: s */
    private long f126969s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f126967u = sparseIntArray;
        sparseIntArray.put(AbstractC29652e.f121122T, 3);
        sparseIntArray.put(AbstractC29652e.f121121S, 4);
        sparseIntArray.put(AbstractC29652e.f121116N, 5);
        sparseIntArray.put(AbstractC29652e.f121115M, 6);
        sparseIntArray.put(AbstractC29652e.f121134c0, 7);
        sparseIntArray.put(AbstractC29652e.f121126X, 8);
        sparseIntArray.put(AbstractC29652e.f121127Y, 9);
        sparseIntArray.put(AbstractC29652e.f121125W, 10);
        sparseIntArray.put(AbstractC29652e.f121128Z, 11);
        sparseIntArray.put(AbstractC29652e.f121124V, 12);
        sparseIntArray.put(AbstractC29652e.f121132b0, 13);
        sparseIntArray.put(AbstractC29652e.f121130a0, 14);
        sparseIntArray.put(AbstractC29652e.f121136d0, 15);
        sparseIntArray.put(AbstractC29652e.f121152l0, 16);
        sparseIntArray.put(AbstractC29652e.f121123U, 17);
    }

    public C30801b(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 18, f126966t, f126967u));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f126969s = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f126969s != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f126969s = 1L;
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

    private C30801b(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (RelativeLayout) objArr[2], (TextView) objArr[6], (ImageView) objArr[5], (RelativeLayout) objArr[1], (TextView) objArr[4], (ImageView) objArr[3], (Guideline) objArr[17], (Guideline) objArr[12], (WhoopGraphView) objArr[10], (TextView) objArr[8], (RelativeLayout) objArr[9], (TextView) objArr[11], (LiveHeartRateView) objArr[14], (ConstraintLayout) objArr[13], (TextView) objArr[7], (ImageView) objArr[15], (Guideline) objArr[16]);
        this.f126969s = -1L;
        this.f126949a.setTag(null);
        this.f126952d.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f126968r = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
