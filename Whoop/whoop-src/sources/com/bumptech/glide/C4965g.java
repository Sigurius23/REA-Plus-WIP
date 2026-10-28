package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whoop.android.R;
import java.util.ArrayList;
import p429ql.C30459e;
import p429ql.InterfaceC30462h;
import p429ql.InterfaceC30463i;
import p429ql.ViewTreeObserverOnPreDrawListenerC30458d;
import p464rl.InterfaceC31508c;
import pf.AbstractC29125c;
import pl.C29342e;
import pl.InterfaceC29339b;

/* JADX INFO: renamed from: com.bumptech.glide.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C4965g implements InterfaceC30463i {

    /* JADX INFO: renamed from: w */
    public final C30459e f20324w;

    /* JADX INFO: renamed from: x */
    public final View f20325x;

    public C4965g(View view) {
        AbstractC29125c.m88539p(view, "Argument must not be null");
        this.f20325x = view;
        this.f20324w = new C30459e(view);
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: a */
    public final void mo15539a(InterfaceC30462h interfaceC30462h) {
        this.f20324w.f125166b.remove(interfaceC30462h);
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: b */
    public final void mo5838b(Object obj, InterfaceC31508c interfaceC31508c) {
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: c */
    public final void mo15540c(Drawable drawable) {
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: d */
    public final InterfaceC29339b mo15541d() {
        Object tag = this.f20325x.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC29339b) {
            return (InterfaceC29339b) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: e */
    public final void mo5839e(Drawable drawable) {
        C30459e c30459e = this.f20324w;
        ViewTreeObserver viewTreeObserver = c30459e.f125165a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c30459e.f125167c);
        }
        c30459e.f125167c = null;
        c30459e.f125166b.clear();
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: f */
    public final void mo15542f(InterfaceC29339b interfaceC29339b) {
        this.f20325x.setTag(R.id.glide_custom_view_target_tag, interfaceC29339b);
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: g */
    public final void mo15543g(Drawable drawable) {
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: h */
    public final void mo15544h(InterfaceC30462h interfaceC30462h) throws Throwable {
        C30459e c30459e = this.f20324w;
        ArrayList arrayList = c30459e.f125166b;
        View view = c30459e.f125165a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM93221a = c30459e.m93221a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM93221a2 = c30459e.m93221a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM93221a > 0 || iM93221a == Integer.MIN_VALUE) && (iM93221a2 > 0 || iM93221a2 == Integer.MIN_VALUE)) {
            ((C29342e) interfaceC30462h).m89342l(iM93221a, iM93221a2);
            return;
        }
        if (!arrayList.contains(interfaceC30462h)) {
            arrayList.add(interfaceC30462h);
        }
        if (c30459e.f125167c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC30458d viewTreeObserverOnPreDrawListenerC30458d = new ViewTreeObserverOnPreDrawListenerC30458d(c30459e);
            c30459e.f125167c = viewTreeObserverOnPreDrawListenerC30458d;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC30458d);
        }
    }

    @Override // ml.InterfaceC25662d
    public final void onDestroy() {
    }

    @Override // ml.InterfaceC25662d
    public final void onStart() {
    }

    @Override // ml.InterfaceC25662d
    public final void onStop() {
    }

    public final String toString() {
        return "Target for: " + this.f20325x;
    }
}
