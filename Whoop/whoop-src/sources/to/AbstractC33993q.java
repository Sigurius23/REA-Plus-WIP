package to;

import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.InterfaceC4973d;
import e73.C12803b;
import p073cq.C11040i;

/* JADX INFO: renamed from: to.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33993q {

    /* JADX INFO: renamed from: a */
    public final C4986c[] f142472a;

    /* JADX INFO: renamed from: b */
    public final boolean f142473b;

    /* JADX INFO: renamed from: c */
    public final int f142474c;

    public AbstractC33993q() {
        this.f142472a = null;
        this.f142473b = false;
        this.f142474c = 0;
    }

    /* JADX INFO: renamed from: a */
    public static C12803b m107465a() {
        C12803b c12803b = new C12803b(5);
        c12803b.f43824b = true;
        c12803b.f43826d = 0;
        return c12803b;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo107449b(InterfaceC4973d interfaceC4973d, C11040i c11040i);

    /* JADX INFO: renamed from: c */
    public final int m107466c() {
        return this.f142474c;
    }

    public AbstractC33993q(C4986c[] c4986cArr, boolean z4, int i13) {
        this.f142472a = c4986cArr;
        boolean z13 = false;
        if (c4986cArr != null && z4) {
            z13 = true;
        }
        this.f142473b = z13;
        this.f142474c = i13;
    }
}
