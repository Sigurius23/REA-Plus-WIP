package er;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: er.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C13573f {

    /* JADX INFO: renamed from: a */
    public final C13570c f47922a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13569b f47923b;

    /* JADX INFO: renamed from: c */
    public final View f47924c;

    public C13573f(InterfaceC13569b interfaceC13569b, View view) {
        int i13 = Build.VERSION.SDK_INT;
        this.f47922a = i13 >= 34 ? new C13572e() : i13 >= 33 ? new C13570c() : null;
        this.f47923b = interfaceC13569b;
        this.f47924c = view;
    }
}
