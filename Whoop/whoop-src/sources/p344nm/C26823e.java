package p344nm;

import android.content.Context;
import im.InterfaceC18653b;
import k83.InterfaceC22297a;

/* JADX INFO: renamed from: nm.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C26823e implements InterfaceC18653b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106981w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC22297a f106982x;

    public /* synthetic */ C26823e(InterfaceC22297a interfaceC22297a, int i13) {
        this.f106981w = i13;
        this.f106982x = interfaceC22297a;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f106981w) {
            case 0:
                String packageName = ((Context) this.f106982x.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new C26829k((Context) this.f106982x.get(), "com.google.android.datatransport.events", Integer.valueOf(C26829k.f106996z).intValue());
        }
    }
}
