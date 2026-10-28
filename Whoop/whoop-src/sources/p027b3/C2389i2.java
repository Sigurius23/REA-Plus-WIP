package p027b3;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import p002a0.C0006a1;
import p005a3.C0248r2;
import p021av.C2088b;
import p078d1.C11462o;
import p078d1.InputConnectionC11463p;
import p412q3.C29882p;
import p412q3.InputConnectionC29881o;
import p446r1.C30849c;

/* JADX INFO: renamed from: b3.i2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2389i2 {

    /* JADX INFO: renamed from: a */
    public final C11462o f9439a;

    /* JADX INFO: renamed from: b */
    public final C2088b f9440b;

    /* JADX INFO: renamed from: c */
    public final Object f9441c = new Object();

    /* JADX INFO: renamed from: d */
    public final C30849c f9442d = new C30849c(new C0248r2[16]);

    /* JADX INFO: renamed from: e */
    public boolean f9443e;

    public C2389i2(C11462o c11462o, C2088b c2088b) {
        this.f9439a = c11462o;
        this.f9440b = c2088b;
    }

    /* JADX INFO: renamed from: a */
    public final InputConnectionC29881o m7392a(EditorInfo editorInfo) {
        synchronized (this.f9441c) {
            if (this.f9443e) {
                return null;
            }
            InputConnectionC11463p inputConnectionC11463pM30757a = this.f9439a.m30757a(editorInfo);
            C0006a1 c0006a1 = new C0006a1(this, 10);
            InputConnectionC29881o c29882p = Build.VERSION.SDK_INT >= 34 ? new C29882p(inputConnectionC11463pM30757a, c0006a1) : new InputConnectionC29881o(inputConnectionC11463pM30757a, c0006a1);
            this.f9442d.m94885b(new C0248r2(c29882p));
            return c29882p;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7393b() {
        return !this.f9443e;
    }
}
