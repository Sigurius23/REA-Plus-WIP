package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.p069ui.ThrobberView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.o0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13507o0 extends AbstractC13502n0 {

    /* JADX INFO: renamed from: n */
    private static final C1191u f47503n;

    /* JADX INFO: renamed from: o */
    private static final SparseIntArray f47504o;

    /* JADX INFO: renamed from: k */
    private final CoordinatorLayout f47505k;

    /* JADX INFO: renamed from: l */
    private final ConstraintLayout f47506l;

    /* JADX INFO: renamed from: m */
    private long f47507m;

    static {
        C1191u c1191u = new C1191u(12);
        f47503n = c1191u;
        c1191u.m3737a(0, new int[]{5, 6}, new int[]{AbstractC38501b0.f165534o0, AbstractC38501b0.f165531n}, new String[]{"message_actions", "chat_report_settings"});
        c1191u.m3737a(1, new int[]{2, 3, 4}, new int[]{AbstractC38501b0.f165549w, AbstractC38501b0.f165547v, AbstractC38501b0.f165535p}, new String[]{"compose_messages", "compose_message_menu", "chat_try_again"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47504o = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165144O4, 7);
        sparseIntArray.put(AbstractC38499a0.f165030B7, 8);
        sparseIntArray.put(AbstractC38499a0.f165039C7, 9);
        sparseIntArray.put(AbstractC38499a0.f165437w0, 10);
        sparseIntArray.put(AbstractC38499a0.f165453x7, 11);
    }

    public C13507o0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 12, f47503n, f47504o));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38222e(AbstractC13557y2 abstractC13557y2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47507m |= 4;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m38223f(AbstractC13531t abstractC13531t, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47507m |= 16;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private boolean m38224g(AbstractC13462f0 abstractC13462f0, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47507m |= 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private boolean m38225h(AbstractC13452d0 abstractC13452d0, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47507m |= 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    private boolean m38226i(AbstractC13550x abstractC13550x, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47507m |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47507m = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47482d);
        AbstractC1168a0.executeBindingsOn(this.f47483e);
        AbstractC1168a0.executeBindingsOn(this.f47486h);
        AbstractC1168a0.executeBindingsOn(this.f47480b);
        AbstractC1168a0.executeBindingsOn(this.f47481c);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47507m != 0) {
                    return true;
                }
                return this.f47482d.hasPendingBindings() || this.f47483e.hasPendingBindings() || this.f47486h.hasPendingBindings() || this.f47480b.hasPendingBindings() || this.f47481c.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47507m = 32L;
        }
        this.f47482d.invalidateAll();
        this.f47483e.invalidateAll();
        this.f47486h.invalidateAll();
        this.f47480b.invalidateAll();
        this.f47481c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 == 0) {
            return m38225h((AbstractC13452d0) obj, i14);
        }
        if (i13 == 1) {
            return m38224g((AbstractC13462f0) obj, i14);
        }
        if (i13 == 2) {
            return m38222e((AbstractC13557y2) obj, i14);
        }
        if (i13 == 3) {
            return m38226i((AbstractC13550x) obj, i14);
        }
        if (i13 != 4) {
            return false;
        }
        return m38223f((AbstractC13531t) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47482d.setLifecycleOwner(interfaceC1585g0);
        this.f47483e.setLifecycleOwner(interfaceC1585g0);
        this.f47486h.setLifecycleOwner(interfaceC1585g0);
        this.f47480b.setLifecycleOwner(interfaceC1585g0);
        this.f47481c.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13507o0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 5, (ThrobberView) objArr[10], (AbstractC13557y2) objArr[5], (AbstractC13531t) objArr[6], (AbstractC13462f0) objArr[2], (AbstractC13452d0) objArr[3], (MessageListView) objArr[7], (View) objArr[11], (AbstractC13550x) objArr[4], (ImageView) objArr[8], (TextView) objArr[9]);
        this.f47507m = -1L;
        setContainedBinding(this.f47480b);
        setContainedBinding(this.f47481c);
        setContainedBinding(this.f47482d);
        setContainedBinding(this.f47483e);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f47505k = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f47506l = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f47486h);
        setRootTag(view);
        invalidateAll();
    }
}
