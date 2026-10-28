package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.community.presentation.chat.view.ChatImageView;
import com.whoop.community.presentation.chat.view.ChatReactionView;
import com.whoop.community.presentation.chat.view.ChatRichTextLinkView;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.k0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13487k0 extends AbstractC13482j0 {

    /* JADX INFO: renamed from: w */
    private static final C1191u f47407w = null;

    /* JADX INFO: renamed from: x */
    private static final SparseIntArray f47408x;

    /* JADX INFO: renamed from: v */
    private long f47409v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47408x = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165166R, 1);
        sparseIntArray.put(AbstractC38499a0.f165153P4, 2);
        sparseIntArray.put(AbstractC38499a0.f165284f0, 3);
        sparseIntArray.put(AbstractC38499a0.f165227Y4, 4);
        sparseIntArray.put(AbstractC38499a0.f165135N4, 5);
        sparseIntArray.put(AbstractC38499a0.f165254b6, 6);
        sparseIntArray.put(AbstractC38499a0.f165269d3, 7);
        sparseIntArray.put(AbstractC38499a0.f165148P, 8);
        sparseIntArray.put(AbstractC38499a0.f165126M4, 9);
        sparseIntArray.put(AbstractC38499a0.f165302h0, 10);
        sparseIntArray.put(AbstractC38499a0.f165136N5, 11);
        sparseIntArray.put(AbstractC38499a0.f165127M5, 12);
        sparseIntArray.put(AbstractC38499a0.f165100J5, 13);
        sparseIntArray.put(AbstractC38499a0.f165109K5, 14);
        sparseIntArray.put(AbstractC38499a0.f165163Q5, 15);
        sparseIntArray.put(AbstractC38499a0.f165145O5, 16);
        sparseIntArray.put(AbstractC38499a0.f165154P5, 17);
        sparseIntArray.put(AbstractC38499a0.f165293g0, 18);
        sparseIntArray.put(AbstractC38499a0.f165181S6, 19);
        sparseIntArray.put(AbstractC38499a0.f165219X4, 20);
    }

    public C13487k0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 21, f47407w, f47408x));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47409v = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47409v != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47409v = 1L;
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

    private C13487k0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (Barrier) objArr[8], (CircleImageView) objArr[1], (Barrier) objArr[3], (Barrier) objArr[18], (Barrier) objArr[10], (ChatImageView) objArr[7], (TextView) objArr[9], (TextView) objArr[5], (ConstraintLayout) objArr[0], (TextView) objArr[20], (TextView) objArr[4], (TextView) objArr[2], (ChatReactionView) objArr[13], (ChatReactionView) objArr[14], (ChatReactionView) objArr[12], (ChatReactionView) objArr[11], (ChatReactionView) objArr[16], (ChatReactionView) objArr[17], (ChatReactionView) objArr[15], (ChatRichTextLinkView) objArr[6], (Space) objArr[19]);
        this.f47409v = -1L;
        this.f47370i.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
