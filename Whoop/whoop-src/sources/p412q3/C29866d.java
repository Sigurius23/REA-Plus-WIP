package p412q3;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p005a3.C0237p;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p208i2.C17896l0;
import p294l3.C23277r0;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C29866d {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f122068a;

    /* JADX INFO: renamed from: b */
    public final C0237p f122069b;

    /* JADX INFO: renamed from: d */
    public boolean f122071d;

    /* JADX INFO: renamed from: e */
    public boolean f122072e;

    /* JADX INFO: renamed from: f */
    public boolean f122073f;

    /* JADX INFO: renamed from: g */
    public boolean f122074g;

    /* JADX INFO: renamed from: h */
    public boolean f122075h;

    /* JADX INFO: renamed from: i */
    public boolean f122076i;

    /* JADX INFO: renamed from: j */
    public C29891y f122077j;

    /* JADX INFO: renamed from: k */
    public C23277r0 f122078k;

    /* JADX INFO: renamed from: l */
    public InterfaceC29884r f122079l;

    /* JADX INFO: renamed from: n */
    public C16618c f122081n;

    /* JADX INFO: renamed from: o */
    public C16618c f122082o;

    /* JADX INFO: renamed from: c */
    public final Object f122070c = new Object();

    /* JADX INFO: renamed from: m */
    public Function1 f122080m = C29864c.f122063x;

    /* JADX INFO: renamed from: p */
    public final CursorAnchorInfo.Builder f122083p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q */
    public final float[] f122084q = C17896l0.m51471a();

    /* JADX INFO: renamed from: r */
    public final Matrix f122085r = new Matrix();

    public C29866d(AndroidComposeView androidComposeView, C0237p c0237p) {
        this.f122068a = androidComposeView;
        this.f122069b = c0237p;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: a */
    public final void m91494a() {
        C0237p c0237p = this.f122069b;
        ?? r10 = c0237p.f813y;
        InputMethodManager inputMethodManager = (InputMethodManager) r10.getValue();
        View view = (View) c0237p.f812x;
        if (inputMethodManager.isActive(view)) {
            Function1 function1 = this.f122080m;
            float[] fArr = this.f122084q;
            function1.invoke(new C17896l0(fArr));
            this.f122068a.m3590u(fArr);
            Matrix matrix = this.f122085r;
            AbstractC17918w0.m51499A(matrix, fArr);
            C29891y c29891y = this.f122077j;
            AbstractC22676k.m65747g(c29891y);
            InterfaceC29884r interfaceC29884r = this.f122079l;
            AbstractC22676k.m65747g(interfaceC29884r);
            C23277r0 c23277r0 = this.f122078k;
            AbstractC22676k.m65747g(c23277r0);
            C16618c c16618c = this.f122081n;
            AbstractC22676k.m65747g(c16618c);
            C16618c c16618c2 = this.f122082o;
            AbstractC22676k.m65747g(c16618c2);
            ((InputMethodManager) r10.getValue()).updateCursorAnchorInfo(view, AbstractC35785b.m113414i(this.f122083p, c29891y, interfaceC29884r, c23277r0, matrix, c16618c, c16618c2, this.f122073f, this.f122074g, this.f122075h, this.f122076i));
            this.f122072e = false;
        }
    }
}
