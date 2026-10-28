package p161g;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.RunnableC1319m;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import m83.C25262p;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.m */
/* JADX INFO: loaded from: classes5.dex */
public class DialogC14910m extends Dialog implements InterfaceC1585g0, InterfaceC14897b0, InterfaceC29049f {

    /* JADX INFO: renamed from: w */
    private C1593i0 f55589w;

    /* JADX INFO: renamed from: x */
    private final C29048e f55590x;

    /* JADX INFO: renamed from: y */
    private final C14923z f55591y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC14910m(Context context, int i13) {
        super(context, i13);
        AbstractC22676k.m65750j(context, "context");
        this.f55590x = new C29048e(new C31183a(this, new C25262p(this, 10)));
        this.f55591y = new C14923z(new RunnableC1319m(this, 24));
    }

    /* JADX INFO: renamed from: a */
    public static void m43001a(DialogC14910m dialogC14910m) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(view, "view");
        m43002b();
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public void m43002b() {
        Window window = getWindow();
        AbstractC22676k.m65747g(window);
        View decorView = window.getDecorView();
        AbstractC22676k.m65749i(decorView, "window!!.decorView");
        AbstractC1613o1.m5024n(decorView, this);
        Window window2 = getWindow();
        AbstractC22676k.m65747g(window2);
        View decorView2 = window2.getDecorView();
        AbstractC22676k.m65749i(decorView2, "window!!.decorView");
        AbstractC1772c1.m5376M(decorView2, this);
        Window window3 = getWindow();
        AbstractC22676k.m65747g(window3);
        View decorView3 = window3.getDecorView();
        AbstractC22676k.m65749i(decorView3, "window!!.decorView");
        AbstractC34132o.m107862G(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public AbstractC1638x getLifecycle() {
        C1593i0 c1593i0 = this.f55589w;
        if (c1593i0 != null) {
            return c1593i0;
        }
        C1593i0 c1593i1 = new C1593i0(this);
        this.f55589w = c1593i1;
        return c1593i1;
    }

    @Override // p161g.InterfaceC14897b0
    public final C14923z getOnBackPressedDispatcher() {
        return this.f55591y;
    }

    @Override // p399pb.InterfaceC29049f
    public C29047d getSavedStateRegistry() {
        return this.f55590x.f117551b;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f55591y.m43018d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C14923z c14923z = this.f55591y;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC22676k.m65749i(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c14923z.f55618e = onBackInvokedDispatcher;
            c14923z.m43019e(c14923z.f55620g);
        }
        this.f55590x.m88295a(bundle);
        C1593i0 c1593i0 = this.f55589w;
        if (c1593i0 == null) {
            c1593i0 = new C1593i0(this);
            this.f55589w = c1593i0;
        }
        c1593i0.m4991g(EnumC1632v.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC22676k.m65749i(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f55590x.m88296b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C1593i0 c1593i0 = this.f55589w;
        if (c1593i0 == null) {
            c1593i0 = new C1593i0(this);
            this.f55589w = c1593i0;
        }
        c1593i0.m4991g(EnumC1632v.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1593i0 c1593i0 = this.f55589w;
        if (c1593i0 == null) {
            c1593i0 = new C1593i0(this);
            this.f55589w = c1593i0;
        }
        c1593i0.m4991g(EnumC1632v.ON_DESTROY);
        this.f55589w = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i13) {
        m43002b();
        super.setContentView(i13);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC22676k.m65750j(view, "view");
        m43002b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(view, "view");
        m43002b();
        super.setContentView(view, layoutParams);
    }
}
