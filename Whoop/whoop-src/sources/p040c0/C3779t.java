package p040c0;

import androidx.compose.animation.AbstractC1089a;
import p077d0.AbstractC11348f;
import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11403t1;
import p390p1.InterfaceC28670t2;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C3779t extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15418w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3782u f15419x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f15420y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3779t(C3782u c3782u, long j7, int i13) {
        super(1);
        this.f15418w = i13;
        this.f15419x = c3782u;
        this.f15420y = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j7;
        InterfaceC11337c0 interfaceC11337c0;
        long j13;
        switch (this.f15418w) {
            case 0:
                InterfaceC11403t1 interfaceC11403t1 = (InterfaceC11403t1) obj;
                Object objMo11596c = interfaceC11403t1.mo11596c();
                C3782u c3782u = this.f15419x;
                if (AbstractC22676k.m65745e(objMo11596c, c3782u.f15425R.mo11596c())) {
                    j7 = C39180l.m124799a(c3782u.f15426S, AbstractC1089a.f4472a) ? this.f15420y : c3782u.f15426S;
                } else {
                    InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) c3782u.f15425R.f15451e.m129g(interfaceC11403t1.mo11596c());
                    j7 = interfaceC28670t2 != null ? ((C39180l) interfaceC28670t2.getValue()).f168422a : 0L;
                }
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) c3782u.f15425R.f15451e.m129g(interfaceC11403t1.mo11595b());
                long j14 = interfaceC28670t3 != null ? ((C39180l) interfaceC28670t3.getValue()).f168422a : 0L;
                C3775r1 c3775r1 = (C3775r1) c3782u.f15424Q.getValue();
                return (c3775r1 == null || (interfaceC11337c0 = (InterfaceC11337c0) c3775r1.f15409b.invoke(new C39180l(j7), new C39180l(j14))) == null) ? AbstractC11348f.m30573u(0.0f, 400.0f, 5, null) : interfaceC11337c0;
            default:
                C3782u c3782u2 = this.f15419x;
                if (AbstractC22676k.m65745e(obj, c3782u2.f15425R.mo11596c())) {
                    j13 = C39180l.m124799a(c3782u2.f15426S, AbstractC1089a.f4472a) ? this.f15420y : c3782u2.f15426S;
                } else {
                    InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) c3782u2.f15425R.f15451e.m129g(obj);
                    j13 = interfaceC28670t4 != null ? ((C39180l) interfaceC28670t4.getValue()).f168422a : 0L;
                }
                return new C39180l(j13);
        }
    }
}
