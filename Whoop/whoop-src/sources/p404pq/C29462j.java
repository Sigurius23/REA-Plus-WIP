package p404pq;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import bi.AbstractC3269g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import kr.C22788g;
import p006a4.AbstractC0354a;
import p014aj.C0929d;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p184h5.C16908r1;
import p184h5.C16911s1;
import p184h5.C16917u1;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: pq.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C29462j extends AbstractC29455c {

    /* JADX INFO: renamed from: a */
    public final Boolean f119630a;

    /* JADX INFO: renamed from: b */
    public final C16905q1 f119631b;

    /* JADX INFO: renamed from: c */
    public Window f119632c;

    /* JADX INFO: renamed from: d */
    public boolean f119633d;

    public C29462j(FrameLayout frameLayout, C16905q1 c16905q1) {
        ColorStateList colorStateListM47508c;
        this.f119631b = c16905q1;
        C22788g c22788g = BottomSheetBehavior.m15688O(frameLayout).f20812i;
        if (c22788g != null) {
            colorStateListM47508c = c22788g.f89748w.f89712c;
        } else {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            colorStateListM47508c = AbstractC16877h0.m47508c(frameLayout);
        }
        if (colorStateListM47508c != null) {
            this.f119630a = Boolean.valueOf(AbstractC31484o.m96971w(colorStateListM47508c.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListM976p = AbstractC0354a.m976p(frameLayout.getBackground());
        Integer numValueOf = colorStateListM976p != null ? Integer.valueOf(colorStateListM976p.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.f119630a = Boolean.valueOf(AbstractC31484o.m96971w(numValueOf.intValue()));
        } else {
            this.f119630a = null;
        }
    }

    @Override // p404pq.AbstractC29455c
    /* JADX INFO: renamed from: a */
    public final void mo89926a(View view) {
        m89929d(view);
    }

    @Override // p404pq.AbstractC29455c
    /* JADX INFO: renamed from: b */
    public final void mo5841b(View view, float f13) {
        m89929d(view);
    }

    @Override // p404pq.AbstractC29455c
    /* JADX INFO: renamed from: c */
    public final void mo5842c(View view, int i13) {
        m89929d(view);
    }

    /* JADX INFO: renamed from: d */
    public final void m89929d(View view) {
        AbstractC3269g c16911s1;
        AbstractC3269g c16911s2;
        int top = view.getTop();
        C16905q1 c16905q1 = this.f119631b;
        if (top < c16905q1.m47600d()) {
            Window window = this.f119632c;
            if (window != null) {
                Boolean bool = this.f119630a;
                boolean zBooleanValue = bool == null ? this.f119633d : bool.booleanValue();
                C0929d c0929d = new C0929d(window.getDecorView());
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 35) {
                    c16911s2 = new C16917u1(window, c0929d);
                } else {
                    c16911s2 = i13 >= 30 ? new C16911s1(window, c0929d) : new C16908r1(window, c0929d);
                }
                c16911s2.mo9526Y(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), c16905q1.m47600d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f119632c;
            if (window2 != null) {
                boolean z4 = this.f119633d;
                C0929d c0929d2 = new C0929d(window2.getDecorView());
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 35) {
                    c16911s1 = new C16917u1(window2, c0929d2);
                } else {
                    c16911s1 = i14 >= 30 ? new C16911s1(window2, c0929d2) : new C16908r1(window2, c0929d2);
                }
                c16911s1.mo9526Y(z4);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m89930e(Window window) {
        AbstractC3269g c16911s1;
        if (this.f119632c == window) {
            return;
        }
        this.f119632c = window;
        if (window != null) {
            C0929d c0929d = new C0929d(window.getDecorView());
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 35) {
                c16911s1 = new C16917u1(window, c0929d);
            } else {
                c16911s1 = i13 >= 30 ? new C16911s1(window, c0929d) : new C16908r1(window, c0929d);
            }
            this.f119633d = c16911s1.mo9522H();
        }
    }
}
