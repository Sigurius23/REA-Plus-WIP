package p299l9;

import com.whoop.data.repositories.C6656c;
import p171g9.C15585b;
import p249jc.C21567b;
import p499t9.C33640l;
import p516u8.C34626x;
import p674z8.InterfaceC40169e;

/* JADX INFO: renamed from: l9.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23530u0 implements InterfaceC23485b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC40169e f93167a;

    /* JADX INFO: renamed from: b */
    public final C6656c f93168b;

    /* JADX INFO: renamed from: c */
    public final C15585b f93169c;

    /* JADX INFO: renamed from: d */
    public final C21567b f93170d;

    /* JADX INFO: renamed from: e */
    public final int f93171e;

    public C23530u0(InterfaceC40169e interfaceC40169e, C33640l c33640l) {
        C6656c c6656c = new C6656c(c33640l, 17);
        C15585b c15585b = new C15585b();
        C21567b c21567b = new C21567b(17);
        this.f93167a = interfaceC40169e;
        this.f93168b = c6656c;
        this.f93169c = c15585b;
        this.f93170d = c21567b;
        this.f93171e = 1048576;
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: b */
    public final AbstractC23481a mo5056b(C34626x c34626x) {
        c34626x.f145867b.getClass();
        return new C23532v0(c34626x, this.f93167a, this.f93168b, this.f93169c.m43882b(c34626x), this.f93170d, this.f93171e, null);
    }
}
