package p474s;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p404pq.RunnableC29453a;
import p513u4.AbstractC34514b;

/* JADX INFO: renamed from: s.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31985n0 extends AbstractC34514b {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f132775h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f132776i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ WeakReference f132777j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C32001r0 f132778k;

    public C31985n0(C32001r0 c32001r0, int i13, int i14, WeakReference weakReference) {
        this.f132778k = c32001r0;
        this.f132775h = i13;
        this.f132776i = i14;
        this.f132777j = weakReference;
    }

    @Override // p513u4.AbstractC34514b
    /* JADX INFO: renamed from: j */
    public final void mo50020j(int i13) {
    }

    @Override // p513u4.AbstractC34514b
    /* JADX INFO: renamed from: k */
    public final void mo50021k(Typeface typeface) {
        int i13 = this.f132775h;
        if (i13 != -1) {
            typeface = AbstractC31997q0.m99514a(typeface, i13, (this.f132776i & 2) != 0);
        }
        C32001r0 c32001r0 = this.f132778k;
        if (c32001r0.f132816m) {
            c32001r0.f132815l = typeface;
            TextView textView = (TextView) this.f132777j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC29453a(textView, c32001r0.f132813j, typeface));
                } else {
                    textView.setTypeface(typeface, c32001r0.f132813j);
                }
            }
        }
    }
}
