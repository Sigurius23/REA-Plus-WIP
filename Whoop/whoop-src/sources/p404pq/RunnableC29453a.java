package p404pq;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: pq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC29453a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119614w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f119615x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ View f119616y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f119617z;

    public RunnableC29453a(TextView textView, int i13, Typeface typeface) {
        this.f119616y = textView;
        this.f119617z = typeface;
        this.f119615x = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f119614w) {
            case 0:
                ((BottomSheetBehavior) this.f119617z).m15704Z(this.f119616y, this.f119615x, false);
                break;
            default:
                ((TextView) this.f119616y).setTypeface((Typeface) this.f119617z, this.f119615x);
                break;
        }
    }

    public RunnableC29453a(BottomSheetBehavior bottomSheetBehavior, View view, int i13) {
        this.f119617z = bottomSheetBehavior;
        this.f119616y = view;
        this.f119615x = i13;
    }
}
