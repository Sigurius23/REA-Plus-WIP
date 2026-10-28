package p027b3;

import android.content.ClipboardManager;
import android.content.Context;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2391j implements InterfaceC2438s1 {

    /* JADX INFO: renamed from: a */
    public final ClipboardManager f9446a;

    public C2391j(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f9446a = (ClipboardManager) systemService;
    }
}
