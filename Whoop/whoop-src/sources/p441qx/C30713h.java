package p441qx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: qx.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C30713h extends AbstractC34235f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126470a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f126471b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Executable f126472c;

    public /* synthetic */ C30713h(Executable executable, Class cls, int i13) {
        this.f126470a = i13;
        this.f126472c = executable;
        this.f126471b = cls;
    }

    @Override // p507tx.AbstractC34235f
    /* JADX INFO: renamed from: U */
    public final Object mo94384U() {
        switch (this.f126470a) {
            case 0:
                return ((Constructor) this.f126472c).newInstance(null);
            default:
                return ((Method) this.f126472c).invoke(null, this.f126471b, Object.class);
        }
    }

    public final String toString() {
        switch (this.f126470a) {
            case 0:
                break;
        }
        return this.f126471b.getName();
    }
}
