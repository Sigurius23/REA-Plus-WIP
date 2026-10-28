package p437qt;

import aa3.C0627i1;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import gt.C16177p;
import gt.InterfaceC16166e;
import java.util.concurrent.Executor;
import p037bu.C3631b;
import p098dt.C12355g;

/* JADX INFO: renamed from: qt.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C30579b implements InterfaceC16166e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125822w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16177p f125823x;

    public /* synthetic */ C30579b(C16177p c16177p, int i13) {
        this.f125822w = i13;
        this.f125823x = c16177p;
    }

    @Override // gt.InterfaceC16166e
    /* JADX INFO: renamed from: f */
    public final Object mo7223f(C0627i1 c0627i1) {
        switch (this.f125822w) {
            case 0:
                return new C30581d((Context) c0627i1.mo1617a(Context.class), ((C12355g) c0627i1.mo1617a(C12355g.class)).m34611c(), c0627i1.mo1620d(C16177p.m45715a(C30582e.class)), c0627i1.mo1621e(C3631b.class), (Executor) c0627i1.mo1624h(this.f125823x));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f125823x, c0627i1);
        }
    }
}
