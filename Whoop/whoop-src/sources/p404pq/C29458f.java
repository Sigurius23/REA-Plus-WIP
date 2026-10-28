package p404pq;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;

/* JADX INFO: renamed from: pq.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C29458f implements InterfaceC16915u {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DialogC29463k f119625w;

    public C29458f(DialogC29463k dialogC29463k) {
        this.f119625w = dialogC29463k;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public final C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        DialogC29463k dialogC29463k = this.f119625w;
        if (dialogC29463k.f119642N != null) {
            BottomSheetBehavior bottomSheetBehavior = dialogC29463k.f119634F;
            bottomSheetBehavior.f20795W.remove(dialogC29463k.f119642N);
        }
        dialogC29463k.f119642N = new C29462j(dialogC29463k.f119637I, c16905q1);
        dialogC29463k.f119642N.m89930e(dialogC29463k.getWindow());
        dialogC29463k.f119634F.m15690I(dialogC29463k.f119642N);
        return c16905q1;
    }
}
