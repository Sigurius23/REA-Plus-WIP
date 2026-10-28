package p027b3;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import p512u2.C34447a;
import p512u2.InterfaceC34469o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2407m0 {

    /* JADX INFO: renamed from: a */
    public static final C2407m0 f9462a = new C2407m0();

    /* JADX INFO: renamed from: b */
    public static PointerIcon m7403b(Context context, InterfaceC34469o interfaceC34469o) {
        return interfaceC34469o instanceof C34447a ? PointerIcon.getSystemIcon(context, ((C34447a) interfaceC34469o).f144742b) : PointerIcon.getSystemIcon(context, 1000);
    }

    /* JADX INFO: renamed from: a */
    public final void m7404a(View view, InterfaceC34469o interfaceC34469o) {
        PointerIcon pointerIconM7403b = m7403b(view.getContext(), interfaceC34469o);
        if (AbstractC22676k.m65745e(view.getPointerIcon(), pointerIconM7403b)) {
            return;
        }
        view.setPointerIcon(pointerIconM7403b);
    }
}
