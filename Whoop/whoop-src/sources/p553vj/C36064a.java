package p553vj;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import m83.C25262p;
import p027b3.RunnableC2411n;
import p161g.C14923z;
import p161g.InterfaceC14897b0;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36064a implements InterfaceC1585g0, InterfaceC1583f2, InterfaceC29049f, InterfaceC14897b0 {

    /* JADX INFO: renamed from: E */
    public final C1593i0 f154010E;

    /* JADX INFO: renamed from: F */
    public final C14923z f154011F;

    /* JADX INFO: renamed from: G */
    public final C1579e2 f154012G;

    /* JADX INFO: renamed from: w */
    public final C29048e f154013w = new C29048e(new C31183a(this, new C25262p(this, 10)));

    /* JADX INFO: renamed from: x */
    public final Bundle f154014x = new Bundle();

    /* JADX INFO: renamed from: y */
    public final View f154015y;

    /* JADX INFO: renamed from: z */
    public final C1593i0 f154016z;

    public C36064a(ViewGroup viewGroup, Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView, "activity.window.decorView");
        this.f154015y = decorView;
        C1593i0 c1593i0 = new C1593i0(this);
        this.f154016z = c1593i0;
        this.f154010E = c1593i0;
        this.f154011F = new C14923z(new RunnableC2411n(1));
        this.f154012G = new C1579e2();
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        return this.f154010E;
    }

    @Override // p161g.InterfaceC14897b0
    public final C14923z getOnBackPressedDispatcher() {
        return this.f154011F;
    }

    @Override // p399pb.InterfaceC29049f
    public final C29047d getSavedStateRegistry() {
        return this.f154013w.f117551b;
    }

    @Override // androidx.lifecycle.InterfaceC1583f2
    public final C1579e2 getViewModelStore() {
        return this.f154012G;
    }
}
