package p027b3;

import android.content.ClipboardManager;
import com.squareup.wire.AbstractC5583n;

/* JADX INFO: renamed from: b3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2386i implements InterfaceC2433r1 {

    /* JADX INFO: renamed from: a */
    public final C2391j f9436a;

    public C2386i(C2391j c2391j) {
        this.f9436a = c2391j;
    }

    /* JADX INFO: renamed from: a */
    public final void m7389a(C2428q1 c2428q1) {
        ClipboardManager clipboardManager = this.f9436a.f9446a;
        if (c2428q1 == null) {
            AbstractC5583n.m16790p(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(c2428q1.m7427a());
        }
    }
}
