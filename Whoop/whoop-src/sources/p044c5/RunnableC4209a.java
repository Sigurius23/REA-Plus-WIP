package p044c5;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C5019m;
import p190hc.C17149l;
import p217ib.C18306c0;
import p508ty.C34249c;
import p513u4.AbstractC34514b;
import to.C34003v;

/* JADX INFO: renamed from: c5.a */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC4209a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17072w;

    /* JADX INFO: renamed from: x */
    public final int f17073x;

    /* JADX INFO: renamed from: y */
    public final Object f17074y;

    public /* synthetic */ RunnableC4209a(Object obj, int i13, int i14) {
        this.f17072w = i14;
        this.f17074y = obj;
        this.f17073x = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17072w) {
            case 0:
                AbstractC34514b abstractC34514b = (AbstractC34514b) ((C34249c) this.f17074y).f143660x;
                if (abstractC34514b != null) {
                    abstractC34514b.mo50020j(this.f17073x);
                }
                break;
            case 1:
                ((C5019m) this.f17074y).f20922H.smoothScrollToPosition(this.f17073x);
                break;
            case 2:
                ((RecyclerView) this.f17074y).smoothScrollToPosition(this.f17073x);
                break;
            case 3:
                C18306c0 c18306c0 = (C18306c0) this.f17074y;
                if (!c18306c0.f71308I.get()) {
                    int i13 = c18306c0.f71312y.f71299a;
                    if (!c18306c0.f71272L.mo52720c()) {
                        int i14 = this.f17073x * i13;
                        c18306c0.f71272L.m52698h(3, i14, Math.min(i13, c18306c0.f71313z.size() - i14), c18306c0.f71310w, c18306c0.f71273M);
                    } else {
                        c18306c0.m52727d();
                    }
                    break;
                }
                break;
            default:
                ((C34003v) this.f17074y).m107476b(this.f17073x);
                break;
        }
    }

    public RunnableC4209a(int i13, C17149l c17149l) {
        this.f17072w = 2;
        this.f17073x = i13;
        this.f17074y = c17149l;
    }
}
