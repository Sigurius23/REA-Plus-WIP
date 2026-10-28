package p174gk;

import android.util.Log;
import fk.InterfaceC14544a;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gk.b */
/* JADX INFO: loaded from: classes.dex */
public final class C15923b implements InterfaceC14544a {

    /* JADX INFO: renamed from: a */
    public static final C15923b f60233a = new C15923b();

    @Override // fk.InterfaceC14544a
    public final void debug(String message) {
        AbstractC22676k.m65750j(message, "message");
        if (AbstractC12682p.m35482b(2, 1) <= 0) {
            Log.d("Amplitude", message);
        }
    }

    @Override // fk.InterfaceC14544a
    public final void error(String message) {
        AbstractC22676k.m65750j(message, "message");
        if (AbstractC12682p.m35482b(2, 4) <= 0) {
            Log.e("Amplitude", message);
        }
    }

    @Override // fk.InterfaceC14544a
    public final void info(String str) {
        if (AbstractC12682p.m35482b(2, 2) <= 0) {
            Log.i("Amplitude", str);
        }
    }

    @Override // fk.InterfaceC14544a
    public final void warn(String message) {
        AbstractC22676k.m65750j(message, "message");
        if (AbstractC12682p.m35482b(2, 3) <= 0) {
            Log.w("Amplitude", message);
        }
    }
}
