package p314m;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.iterable.iterableapi.C5327g1;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p036bq.RunnableC3543b;
import p184h5.AbstractC16901p0;
import p474s.C32011t2;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: m.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24845i0 extends AbstractC24830b {

    /* JADX INFO: renamed from: a */
    public final C32011t2 f97326a;

    /* JADX INFO: renamed from: b */
    public final Window.Callback f97327b;

    /* JADX INFO: renamed from: c */
    public final C24843h0 f97328c;

    /* JADX INFO: renamed from: d */
    public boolean f97329d;

    /* JADX INFO: renamed from: e */
    public boolean f97330e;

    /* JADX INFO: renamed from: f */
    public boolean f97331f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f97332g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final RunnableC3543b f97333h = new RunnableC3543b(this, 18);

    public C24845i0(Toolbar toolbar, CharSequence charSequence, WindowCallbackC24864w windowCallbackC24864w) {
        C24843h0 c24843h0 = new C24843h0(this);
        C32011t2 c32011t2 = new C32011t2(toolbar, false);
        this.f97326a = c32011t2;
        windowCallbackC24864w.getClass();
        this.f97327b = windowCallbackC24864w;
        c32011t2.f132838k = windowCallbackC24864w;
        toolbar.setOnMenuItemClickListener(c24843h0);
        if (!c32011t2.f132834g) {
            c32011t2.f132835h = charSequence;
            if ((c32011t2.f132829b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (c32011t2.f132834g) {
                    AbstractC16901p0.m47584o(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f97328c = new C24843h0(this);
    }

    /* JADX INFO: renamed from: A */
    public final void m72851A(int i13, int i14) {
        C32011t2 c32011t2 = this.f97326a;
        c32011t2.m99563b((i13 & i14) | ((~i14) & c32011t2.f132829b));
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: a */
    public final boolean mo72812a() {
        return this.f97326a.f132828a.m3324s();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: b */
    public final boolean mo72813b() {
        C32011t2 c32011t2 = this.f97326a;
        if (!c32011t2.f132828a.m3323r()) {
            return false;
        }
        c32011t2.f132828a.m3312e();
        return true;
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: c */
    public final void mo72814c(boolean z4) {
        if (z4 == this.f97331f) {
            return;
        }
        this.f97331f = z4;
        ArrayList arrayList = this.f97332g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: d */
    public final int mo72815d() {
        return this.f97326a.f132829b;
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: e */
    public final Context mo72816e() {
        return this.f97326a.f132828a.getContext();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: f */
    public final boolean mo72817f() {
        C32011t2 c32011t2 = this.f97326a;
        Toolbar toolbar = c32011t2.f132828a;
        RunnableC3543b runnableC3543b = this.f97333h;
        toolbar.removeCallbacks(runnableC3543b);
        Toolbar toolbar2 = c32011t2.f132828a;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        toolbar2.postOnAnimation(runnableC3543b);
        return true;
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: g */
    public final void mo72818g() {
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: h */
    public final void mo72819h() {
        this.f97326a.f132828a.removeCallbacks(this.f97333h);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: i */
    public final boolean mo72820i(int i13, KeyEvent keyEvent) {
        Menu menuM72852z = m72852z();
        if (menuM72852z == null) {
            return false;
        }
        menuM72852z.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM72852z.performShortcut(i13, keyEvent, 0);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: j */
    public final boolean mo72821j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo72822k();
        }
        return true;
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: k */
    public final boolean mo72822k() {
        return this.f97326a.f132828a.m3306J();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: l */
    public final void mo72823l(ColorDrawable colorDrawable) {
        this.f97326a.f132828a.setBackground(colorDrawable);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: m */
    public final void mo72824m(ThreeDS2Button threeDS2Button, C24828a c24828a) {
        threeDS2Button.setLayoutParams(c24828a);
        this.f97326a.m99562a(threeDS2Button);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: n */
    public final void mo72825n(boolean z4) {
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: o */
    public final void mo72826o(boolean z4) {
        m72851A(4, 4);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: p */
    public final void mo72827p() {
        m72851A(16, 16);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: q */
    public final void mo72828q() {
        m72851A(2, 2);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: r */
    public final void mo72829r(int i13) {
        C32011t2 c32011t2 = this.f97326a;
        Toolbar toolbar = c32011t2.f132828a;
        Drawable drawableM92133x = i13 != 0 ? AbstractC30060g.m92133x(toolbar.getContext(), i13) : null;
        c32011t2.f132833f = drawableM92133x;
        if ((c32011t2.f132829b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableM92133x == null) {
            drawableM92133x = c32011t2.f132842o;
        }
        toolbar.setNavigationIcon(drawableM92133x);
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: s */
    public final void mo72830s() {
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: t */
    public final void mo72831t() {
        C32011t2 c32011t2 = this.f97326a;
        c32011t2.f132832e = null;
        c32011t2.m99565d();
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: u */
    public final void mo72832u(boolean z4) {
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: v */
    public final void mo72833v() {
        C32011t2 c32011t2 = this.f97326a;
        CharSequence text = c32011t2.f132828a.getContext().getText(R.string.stripe_3ds2_hzv_header_label);
        c32011t2.f132834g = true;
        Toolbar toolbar = c32011t2.f132828a;
        c32011t2.f132835h = text;
        if ((c32011t2.f132829b & 8) != 0) {
            toolbar.setTitle(text);
            if (c32011t2.f132834g) {
                AbstractC16901p0.m47584o(toolbar.getRootView(), text);
            }
        }
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: w */
    public final void mo72834w(CharSequence charSequence) {
        C32011t2 c32011t2 = this.f97326a;
        c32011t2.f132834g = true;
        Toolbar toolbar = c32011t2.f132828a;
        c32011t2.f132835h = charSequence;
        if ((c32011t2.f132829b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c32011t2.f132834g) {
                AbstractC16901p0.m47584o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p314m.AbstractC24830b
    /* JADX INFO: renamed from: x */
    public final void mo72835x(CharSequence charSequence) {
        C32011t2 c32011t2 = this.f97326a;
        if (c32011t2.f132834g) {
            return;
        }
        Toolbar toolbar = c32011t2.f132828a;
        c32011t2.f132835h = charSequence;
        if ((c32011t2.f132829b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c32011t2.f132834g) {
                AbstractC16901p0.m47584o(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final Menu m72852z() {
        boolean z4 = this.f97330e;
        C32011t2 c32011t2 = this.f97326a;
        if (!z4) {
            c32011t2.f132828a.m3302F(new C5327g1(this), new C24843h0(this));
            this.f97330e = true;
        }
        return c32011t2.f132828a.getMenu();
    }
}
