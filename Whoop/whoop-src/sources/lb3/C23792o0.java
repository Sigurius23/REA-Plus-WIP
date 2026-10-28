package lb3;

import ob3.InterfaceC27797g;
import ob3.InterfaceC27798h;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C23792o0 extends AbstractC32073e {

    /* JADX INFO: renamed from: b */
    public static final C23792o0 f94172b = new C23792o0(0);

    /* JADX INFO: renamed from: c */
    public static final C23792o0 f94173c = new C23792o0(1);

    /* JADX INFO: renamed from: d */
    public static final C23792o0 f94174d = new C23792o0(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94175a;

    public /* synthetic */ C23792o0(int i13) {
        this.f94175a = i13;
    }

    @Override // p477s2.AbstractC32073e
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC27798h mo69898i0(C23794p0 state, InterfaceC27797g type) {
        switch (this.f94175a) {
            case 0:
                AbstractC22676k.m65750j(state, "state");
                AbstractC22676k.m65750j(type, "type");
                return state.f94180c.mo74557f(type);
            case 1:
                AbstractC22676k.m65750j(state, "state");
                AbstractC22676k.m65750j(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                AbstractC22676k.m65750j(state, "state");
                AbstractC22676k.m65750j(type, "type");
                return state.f94180c.mo74570l0(type);
        }
    }
}
