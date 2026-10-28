package androidx.fragment.app;

import androidx.lifecycle.EnumC1635w;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1282c2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1356w0 f5561a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f5562b;

    /* JADX INFO: renamed from: d */
    public int f5564d;

    /* JADX INFO: renamed from: e */
    public int f5565e;

    /* JADX INFO: renamed from: f */
    public int f5566f;

    /* JADX INFO: renamed from: g */
    public int f5567g;

    /* JADX INFO: renamed from: h */
    public int f5568h;

    /* JADX INFO: renamed from: i */
    public boolean f5569i;

    /* JADX INFO: renamed from: k */
    public String f5571k;

    /* JADX INFO: renamed from: l */
    public int f5572l;

    /* JADX INFO: renamed from: m */
    public CharSequence f5573m;

    /* JADX INFO: renamed from: n */
    public int f5574n;

    /* JADX INFO: renamed from: o */
    public CharSequence f5575o;

    /* JADX INFO: renamed from: p */
    public ArrayList f5576p;

    /* JADX INFO: renamed from: q */
    public ArrayList f5577q;

    /* JADX INFO: renamed from: s */
    public ArrayList f5579s;

    /* JADX INFO: renamed from: c */
    public final ArrayList f5563c = new ArrayList();

    /* JADX INFO: renamed from: j */
    public boolean f5570j = true;

    /* JADX INFO: renamed from: r */
    public boolean f5578r = false;

    public AbstractC1282c2(AbstractC1356w0 abstractC1356w0, ClassLoader classLoader) {
        this.f5561a = abstractC1356w0;
        this.f5562b = classLoader;
    }

    /* JADX INFO: renamed from: b */
    public final void m4066b(C1278b2 c1278b2) {
        this.f5563c.add(c1278b2);
        c1278b2.f5550d = this.f5564d;
        c1278b2.f5551e = this.f5565e;
        c1278b2.f5552f = this.f5566f;
        c1278b2.f5553g = this.f5567g;
    }

    /* JADX INFO: renamed from: c */
    public final void m4067c(String str) {
        if (!this.f5570j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f5569i = true;
        this.f5571k = str;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4042d(int i13, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, String str, int i14);

    /* JADX INFO: renamed from: e */
    public final void m4068e(int i13, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, String str) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo4042d(i13, abstractComponentCallbacksC1320m0, str, 2);
    }

    /* JADX INFO: renamed from: f */
    public final void m4069f(int i13, int i14, int i15, int i16) {
        this.f5564d = i13;
        this.f5565e = i14;
        this.f5566f = i15;
        this.f5567g = i16;
    }

    /* JADX INFO: renamed from: g */
    public abstract C1271a mo4043g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, EnumC1635w enumC1635w);
}
