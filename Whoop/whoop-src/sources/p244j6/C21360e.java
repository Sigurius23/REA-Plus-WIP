package p244j6;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import g73.C15556d;
import p005a3.C0237p;

/* JADX INFO: renamed from: j6.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C21360e implements KeyListener {

    /* JADX INFO: renamed from: w */
    public final KeyListener f81705w;

    /* JADX INFO: renamed from: x */
    public final C15556d f81706x;

    public C21360e(KeyListener keyListener) {
        C15556d c15556d = new C15556d(11);
        this.f81705w = keyListener;
        this.f81706x = c15556d;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i13) {
        this.f81705w.clearMetaKeyState(view, editable, i13);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f81705w.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i13, KeyEvent keyEvent) {
        boolean zM669u;
        boolean z4;
        this.f81706x.getClass();
        if (i13 != 67) {
            zM669u = i13 != 112 ? false : C0237p.m669u(editable, keyEvent, true);
        } else {
            zM669u = C0237p.m669u(editable, keyEvent, false);
        }
        if (zM669u) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z4 = true;
        } else {
            z4 = false;
        }
        return z4 || this.f81705w.onKeyDown(view, editable, i13, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f81705w.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i13, KeyEvent keyEvent) {
        return this.f81705w.onKeyUp(view, editable, i13, keyEvent);
    }
}
