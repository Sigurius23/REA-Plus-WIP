package p299l9;

import p658yr.InterfaceC39722i;
import sn.InterfaceC32761u;

/* JADX INFO: renamed from: l9.n */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23515n implements InterfaceC39722i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93073w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Class f93074x;

    public /* synthetic */ C23515n(int i13, Class cls) {
        this.f93073w = i13;
        this.f93074x = cls;
    }

    @Override // p658yr.InterfaceC39722i
    public final Object get() {
        switch (this.f93073w) {
            case 0:
                try {
                    return (InterfaceC23485b0) this.f93074x.getConstructor(null).newInstance(null);
                } catch (Exception e5) {
                    throw new IllegalStateException(e5);
                }
            default:
                try {
                    return (InterfaceC32761u) this.f93074x.getConstructor(null).newInstance(null);
                } catch (Exception e13) {
                    throw new IllegalStateException(e13);
                }
        }
    }
}
