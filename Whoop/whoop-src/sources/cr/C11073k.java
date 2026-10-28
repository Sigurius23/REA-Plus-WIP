package cr;

import android.content.Context;
import android.text.TextPaint;
import hr.C17574d;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: cr.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C11073k {

    /* JADX INFO: renamed from: c */
    public float f35027c;

    /* JADX INFO: renamed from: d */
    public float f35028d;

    /* JADX INFO: renamed from: f */
    public final WeakReference f35030f;

    /* JADX INFO: renamed from: g */
    public C17574d f35031g;

    /* JADX INFO: renamed from: a */
    public final TextPaint f35025a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final C11071i f35026b = new C11071i(this, 0);

    /* JADX INFO: renamed from: e */
    public boolean f35029e = true;

    public C11073k(InterfaceC11072j interfaceC11072j) {
        this.f35030f = new WeakReference(null);
        this.f35030f = new WeakReference(interfaceC11072j);
    }

    /* JADX INFO: renamed from: a */
    public final void m29865a(String str) {
        TextPaint textPaint = this.f35025a;
        this.f35027c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f35028d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f35029e = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m29866b(C17574d c17574d, Context context) {
        if (this.f35031g != c17574d) {
            this.f35031g = c17574d;
            if (c17574d != null) {
                TextPaint textPaint = this.f35025a;
                C11071i c11071i = this.f35026b;
                c17574d.m50027f(context, textPaint, c11071i);
                InterfaceC11072j interfaceC11072j = (InterfaceC11072j) this.f35030f.get();
                if (interfaceC11072j != null) {
                    textPaint.drawableState = interfaceC11072j.getState();
                }
                c17574d.m50026e(context, textPaint, c11071i);
                this.f35029e = true;
            }
            InterfaceC11072j interfaceC11072j2 = (InterfaceC11072j) this.f35030f.get();
            if (interfaceC11072j2 != null) {
                interfaceC11072j2.mo29864a();
                interfaceC11072j2.onStateChange(interfaceC11072j2.getState());
            }
        }
    }
}
