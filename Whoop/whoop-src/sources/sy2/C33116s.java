package sy2;

import android.net.Uri;
import android.webkit.ValueCallback;
import p027b3.InterfaceC2464x2;
import p390p1.InterfaceC28601c1;
import p510u0.InterfaceC34345p0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sy2.s */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33116s implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138125w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f138126x;

    public /* synthetic */ C33116s(Object obj, int i13) {
        this.f138125w = i13;
        this.f138126x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138125w) {
            case 0:
                return AbstractC33117t.m104981B((InterfaceC28601c1) this.f138126x, (ValueCallback) obj);
            case 1:
                return AbstractC33117t.m105007u((InterfaceC28601c1) this.f138126x, (Uri) obj);
            default:
                return AbstractC33113p.m104969w((InterfaceC2464x2) this.f138126x, (InterfaceC34345p0) obj);
        }
    }
}
