package p184h5;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.whoop.android.R;

/* JADX INFO: renamed from: h5.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16865d0 {

    /* JADX INFO: renamed from: a */
    public final int f64795a;

    /* JADX INFO: renamed from: b */
    public final Class f64796b;

    /* JADX INFO: renamed from: c */
    public final int f64797c;

    /* JADX INFO: renamed from: d */
    public final int f64798d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f64799e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16865d0(int i13) {
        this(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
        this.f64799e = i13;
        switch (i13) {
            case 1:
                this(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
                break;
            case 2:
                this(R.id.tag_state_description, CharSequence.class, 64, 30);
                break;
            case 3:
                this(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
                break;
            default:
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m47492a(View view) {
        if (Build.VERSION.SDK_INT < this.f64797c) {
            Object tag = view.getTag(this.f64795a);
            if (this.f64796b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        switch (this.f64799e) {
            case 0:
                return Boolean.valueOf(AbstractC16889l0.m47553c(view));
            case 1:
                return AbstractC16889l0.m47551a(view);
            case 2:
                return AbstractC16895n0.m47565a(view);
            default:
                return Boolean.valueOf(AbstractC16889l0.m47552b(view));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053 A[PHI: r3
      0x0053: PHI (r3v1 boolean) = (r3v0 boolean), (r3v2 boolean) binds: [B:41:0x008a, B:24:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0031. Please report as an issue. */
    /* JADX INFO: renamed from: b */
    public final void m47493b(View view, Object obj) {
        boolean z4;
        boolean z13;
        boolean zEquals;
        boolean z14;
        C16858b c16858b;
        if (Build.VERSION.SDK_INT >= this.f64797c) {
            switch (this.f64799e) {
                case 0:
                    AbstractC16889l0.m47556f(view, ((Boolean) obj).booleanValue());
                    break;
                case 1:
                    AbstractC16889l0.m47555e(view, (CharSequence) obj);
                    break;
                case 2:
                    AbstractC16895n0.m47567c(view, (CharSequence) obj);
                    break;
                default:
                    AbstractC16889l0.m47554d(view, ((Boolean) obj).booleanValue());
                    break;
            }
            return;
        }
        Object objM47492a = m47492a(view);
        switch (this.f64799e) {
            case 0:
                Boolean bool = (Boolean) objM47492a;
                Boolean bool2 = (Boolean) obj;
                z4 = false;
                z13 = true;
                if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                    z4 = z13;
                }
                z14 = !z4;
                break;
            case 1:
                zEquals = TextUtils.equals((CharSequence) objM47492a, (CharSequence) obj);
                z14 = !zEquals;
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) objM47492a, (CharSequence) obj);
                z14 = !zEquals;
                break;
            default:
                Boolean bool3 = (Boolean) objM47492a;
                Boolean bool4 = (Boolean) obj;
                z4 = false;
                z13 = true;
                if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                    z4 = z13;
                }
                z14 = !z4;
                break;
        }
        if (z14) {
            View.AccessibilityDelegate accessibilityDelegateM47572c = AbstractC16901p0.m47572c(view);
            if (accessibilityDelegateM47572c == null) {
                c16858b = null;
            } else {
                c16858b = accessibilityDelegateM47572c instanceof C16855a ? ((C16855a) accessibilityDelegateM47572c).f64770a : new C16858b(accessibilityDelegateM47572c);
            }
            if (c16858b == null) {
                c16858b = new C16858b();
            }
            AbstractC16901p0.m47583n(view, c16858b);
            view.setTag(this.f64795a, obj);
            AbstractC16901p0.m47577h(view, this.f64798d);
        }
    }

    public C16865d0(int i13, Class cls, int i14, int i15) {
        this.f64795a = i13;
        this.f64796b = cls;
        this.f64798d = i14;
        this.f64797c = i15;
    }
}
