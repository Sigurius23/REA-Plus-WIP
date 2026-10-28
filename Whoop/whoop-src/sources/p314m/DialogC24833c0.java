package p314m;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1613o1;
import androidx.room.AbstractC1772c1;
import androidx.room.ExecutorC1834u1;
import com.whoop.android.R;
import p161g.DialogC14910m;
import p184h5.InterfaceC16882j;
import p408q.AbstractC29658b;
import p408q.InterfaceC29657a;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: m.c0 */
/* JADX INFO: loaded from: classes5.dex */
public class DialogC24833c0 extends DialogC14910m implements InterfaceC24854n {

    /* JADX INFO: renamed from: E */
    private final InterfaceC16882j f97252E;

    /* JADX INFO: renamed from: z */
    private AbstractC24858q f97253z;

    public DialogC24833c0(Context context, int i13) {
        int i14;
        if (i13 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i14 = typedValue.resourceId;
        } else {
            i14 = i13;
        }
        super(context, i14);
        this.f97252E = new InterfaceC16882j() { // from class: m.b0
            @Override // p184h5.InterfaceC16882j
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f97251w.m72839e(keyEvent);
            }
        };
        AbstractC24858q abstractC24858qM72837c = m72837c();
        if (i13 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i13 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C24829a0) abstractC24858qM72837c).f97244t0 = i13;
        abstractC24858qM72837c.mo72798i();
    }

    @Override // p161g.DialogC14910m, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) m72837c();
        layoutInflaterFactory2C24829a0.m72784B();
        ((ViewGroup) layoutInflaterFactory2C24829a0.f97225a0.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C24829a0.f97211M.m72894a(layoutInflaterFactory2C24829a0.f97210L.getCallback());
    }

    /* JADX INFO: renamed from: c */
    public AbstractC24858q m72837c() {
        if (this.f97253z == null) {
            ExecutorC1834u1 executorC1834u1 = AbstractC24858q.f97382w;
            this.f97253z = new LayoutInflaterFactory2C24829a0(getContext(), getWindow(), this, this);
        }
        return this.f97253z;
    }

    /* JADX INFO: renamed from: d */
    public final void m72838d() {
        AbstractC1613o1.m5024n(getWindow().getDecorView(), this);
        AbstractC34132o.m107862G(getWindow().getDecorView(), this);
        AbstractC1772c1.m5376M(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m72837c().mo72799j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return AbstractC35903f.m114019p(this.f97252E, keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public boolean m72839e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean m72840f(int i13) {
        return m72837c().mo72800l(i13);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i13) {
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) m72837c();
        layoutInflaterFactory2C24829a0.m72784B();
        return (T) layoutInflaterFactory2C24829a0.f97210L.findViewById(i13);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m72837c().mo72797g();
    }

    @Override // p161g.DialogC14910m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m72837c().mo72796f();
        super.onCreate(bundle);
        m72837c().mo72798i();
    }

    @Override // p161g.DialogC14910m, android.app.Dialog
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) m72837c();
        layoutInflaterFactory2C24829a0.m72787E();
        AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
        if (abstractC24830b != null) {
            abstractC24830b.mo72832u(false);
        }
    }

    @Override // p314m.InterfaceC24854n
    public void onSupportActionModeFinished(AbstractC29658b abstractC29658b) {
    }

    @Override // p314m.InterfaceC24854n
    public void onSupportActionModeStarted(AbstractC29658b abstractC29658b) {
    }

    @Override // p314m.InterfaceC24854n
    public AbstractC29658b onWindowStartingSupportActionMode(InterfaceC29657a interfaceC29657a) {
        return null;
    }

    @Override // p161g.DialogC14910m, android.app.Dialog
    public void setContentView(int i13) {
        m72838d();
        m72837c().mo72801m(i13);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m72837c().mo72804p(charSequence);
    }

    @Override // p161g.DialogC14910m, android.app.Dialog
    public void setContentView(View view) {
        m72838d();
        m72837c().mo72802n(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        super.setTitle(i13);
        m72837c().mo72804p(getContext().getString(i13));
    }

    @Override // p161g.DialogC14910m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m72838d();
        m72837c().mo72803o(view, layoutParams);
    }
}
