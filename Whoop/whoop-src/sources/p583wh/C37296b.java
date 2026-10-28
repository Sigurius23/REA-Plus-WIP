package p583wh;

import android.os.Build;
import ki.InterfaceC22490b;
import p552vh.C36033a;
import sh.InterfaceC32484j;

/* JADX INFO: renamed from: wh.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C37296b implements InterfaceC22490b {
    @Override // ki.InterfaceC22490b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32484j mo64991a() {
        return new C36033a(Build.VERSION.SDK_INT < 34);
    }
}
