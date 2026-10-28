package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import p211i5.C18093f;

/* JADX INFO: renamed from: com.google.android.material.textfield.r */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5059r {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f21263a;

    /* JADX INFO: renamed from: b */
    public final C5058q f21264b;

    /* JADX INFO: renamed from: c */
    public final Context f21265c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f21266d;

    public AbstractC5059r(C5058q c5058q) {
        this.f21263a = c5058q.f21259w;
        this.f21264b = c5058q;
        this.f21265c = c5058q.getContext();
        this.f21266d = c5058q.f21243G;
    }

    /* JADX INFO: renamed from: a */
    public void mo15836a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo15886b() {
    }

    /* JADX INFO: renamed from: c */
    public int mo15837c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int mo15838d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo15839e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo15840f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo15841g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public C5052k mo15850h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo15851i(int i13) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo15887j() {
        return this instanceof C5053l;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo15852k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void mo15842l(EditText editText) {
    }

    /* JADX INFO: renamed from: m */
    public void mo15853m(C18093f c18093f) {
    }

    /* JADX INFO: renamed from: n */
    public void mo15854n(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: o */
    public void mo15843o(boolean z4) {
    }

    /* JADX INFO: renamed from: p */
    public final void m15888p() {
        this.f21264b.m15877f(false);
    }

    /* JADX INFO: renamed from: q */
    public void mo15844q() {
    }

    /* JADX INFO: renamed from: r */
    public void mo15845r() {
    }
}
