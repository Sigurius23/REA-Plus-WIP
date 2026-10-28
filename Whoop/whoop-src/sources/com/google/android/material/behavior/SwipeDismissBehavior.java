package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import la.C23548b;
import mr.C25900f;
import p184h5.AbstractC16901p0;
import p211i5.C18091d;
import p346nq.C27037a;
import p413q4.AbstractC29957b;
import p573w5.C36833d;

/* JADX INFO: loaded from: classes6.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC29957b {

    /* JADX INFO: renamed from: a */
    public C36833d f20765a;

    /* JADX INFO: renamed from: b */
    public C25900f f20766b;

    /* JADX INFO: renamed from: c */
    public boolean f20767c;

    /* JADX INFO: renamed from: d */
    public boolean f20768d;

    /* JADX INFO: renamed from: e */
    public int f20769e = 2;

    /* JADX INFO: renamed from: f */
    public float f20770f = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f20771g = 0.5f;

    /* JADX INFO: renamed from: h */
    public final C27037a f20772h = new C27037a(this);

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: H */
    public final boolean mo15684H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f20765a == null) {
            return false;
        }
        if (this.f20768d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f20765a.m118080j(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: I */
    public boolean mo15685I(View view) {
        return true;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: o */
    public boolean mo15686o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM3664o = this.f20767c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM3664o = coordinatorLayout.m3664o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f20767c = zM3664o;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f20767c = false;
        }
        if (zM3664o) {
            if (this.f20765a == null) {
                this.f20765a = new C36833d(coordinatorLayout.getContext(), coordinatorLayout, this.f20772h);
            }
            if (!this.f20768d && this.f20765a.m118086p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public final boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC16901p0.m47580k(view, 1048576);
            AbstractC16901p0.m47577h(view, 0);
            if (mo15685I(view)) {
                AbstractC16901p0.m47581l(view, C18091d.f70308l, new C23548b(this, 19));
            }
        }
        return false;
    }
}
