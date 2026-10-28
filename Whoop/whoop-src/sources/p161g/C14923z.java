package p161g;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.C1833u0;
import java.util.Iterator;
import java.util.ListIterator;
import m83.C25258m;
import p021av.C2088b;
import p029b5.AbstractC2724c;
import p043c4.C3978u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.z */
/* JADX INFO: loaded from: classes.dex */
public final class C14923z {

    /* JADX INFO: renamed from: a */
    public final Runnable f55614a;

    /* JADX INFO: renamed from: b */
    public final C25258m f55615b = new C25258m();

    /* JADX INFO: renamed from: c */
    public AbstractC14917t f55616c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f55617d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f55618e;

    /* JADX INFO: renamed from: f */
    public boolean f55619f;

    /* JADX INFO: renamed from: g */
    public boolean f55620g;

    public C14923z(Runnable runnable) {
        this.f55614a = runnable;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            this.f55617d = i13 >= 34 ? new C14920w(new C14918u(this, 0), new C14918u(this, 1), new C14919v(this, 0), new C14919v(this, 1)) : new C3978u(new C2088b(this, 18), 2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43015a(InterfaceC1585g0 owner, AbstractC14917t onBackPressedCallback) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC22676k.m65750j(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1638x lifecycle = owner.getLifecycle();
        if (lifecycle.mo4987b() == EnumC1635w.f6325w) {
            return;
        }
        onBackPressedCallback.m43008a(new C14921x(this, lifecycle, onBackPressedCallback));
        m43020f();
        onBackPressedCallback.m43014k(new C1833u0(0, this, C14923z.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3));
    }

    /* JADX INFO: renamed from: b */
    public final C14922y m43016b(AbstractC14917t onBackPressedCallback) {
        AbstractC22676k.m65750j(onBackPressedCallback, "onBackPressedCallback");
        this.f55615b.addLast(onBackPressedCallback);
        C14922y c14922y = new C14922y(this, onBackPressedCallback);
        onBackPressedCallback.m43008a(c14922y);
        m43020f();
        onBackPressedCallback.m43014k(new C1833u0(0, this, C14923z.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4));
        return c14922y;
    }

    /* JADX INFO: renamed from: c */
    public final void m43017c() {
        Object objPrevious;
        AbstractC14917t abstractC14917t = this.f55616c;
        if (abstractC14917t == null) {
            C25258m c25258m = this.f55615b;
            ListIterator<E> listIterator = c25258m.listIterator(c25258m.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((AbstractC14917t) objPrevious).m43010g());
            abstractC14917t = (AbstractC14917t) objPrevious;
        }
        this.f55616c = null;
        if (abstractC14917t != null) {
            abstractC14917t.mo4072c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m43018d() {
        Object objPrevious;
        AbstractC14917t abstractC14917t = this.f55616c;
        if (abstractC14917t == null) {
            C25258m c25258m = this.f55615b;
            ListIterator listIterator = c25258m.listIterator(c25258m.mo74007a());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((AbstractC14917t) objPrevious).m43010g());
            abstractC14917t = (AbstractC14917t) objPrevious;
        }
        this.f55616c = null;
        if (abstractC14917t != null) {
            abstractC14917t.mo4073d();
        } else {
            this.f55614a.run();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m43019e(boolean z4) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f55618e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f55617d) == null) {
            return;
        }
        if (z4 && !this.f55619f) {
            AbstractC2724c.m7692d(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f55619f = true;
        } else {
            if (z4 || !this.f55619f) {
                return;
            }
            AbstractC2724c.m7693e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f55619f = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m43020f() {
        boolean z4 = this.f55620g;
        boolean z13 = false;
        C25258m c25258m = this.f55615b;
        if (c25258m == null || !c25258m.isEmpty()) {
            Iterator<E> it = c25258m.iterator();
            while (it.hasNext()) {
                if (((AbstractC14917t) it.next()).m43010g()) {
                    z13 = true;
                    break;
                }
            }
        }
        this.f55620g = z13;
        if (z13 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m43019e(z13);
    }
}
