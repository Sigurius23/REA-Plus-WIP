package s40;

import android.app.Application;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import b10.C2222b;
import bc3.AbstractC3050q0;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import n30.InterfaceC26213d;
import p098dt.AbstractC12350b;
import p442qy.C30765d;
import p663yx.C39838b;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29906g0;
import q30.InterfaceC29913k;
import t30.C33505g;

/* JADX INFO: renamed from: s40.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32176r0 implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133259a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f133260b;

    /* JADX INFO: renamed from: c */
    public final Object f133261c;

    /* JADX INFO: renamed from: d */
    public final Object f133262d;

    public C32176r0(InterfaceC29913k challengeActionHandler, C29906g0 transactionTimer, InterfaceC26213d errorReporter) {
        AbstractC22676k.m65750j(challengeActionHandler, "challengeActionHandler");
        AbstractC22676k.m65750j(transactionTimer, "transactionTimer");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f133260b = challengeActionHandler;
        this.f133261c = transactionTimer;
        this.f133262d = errorReporter;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        int i13 = this.f133259a;
        Object obj = this.f133262d;
        Object obj2 = this.f133261c;
        Object obj3 = this.f133260b;
        AbstractC22676k.m65750j(modelClass, "modelClass");
        switch (i13) {
            case 0:
                C39838b c39838b = (C39838b) obj;
                C22365e c22365e = AbstractC3050q0.f12077a;
                return new C32180t0(c39838b, new C39865j((C30765d) obj2, ExecutorC22364d.f87316w), new C2222b((Application) obj3, AbstractC12350b.m34570S("PaymentAuthWebViewActivity"), c39838b.f172022L));
            default:
                return new C33505g((InterfaceC29913k) obj3, (C29906g0) obj2, (InterfaceC26213d) obj);
        }
    }

    public C32176r0(Application application, C30765d logger, C39838b c39838b) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f133260b = application;
        this.f133261c = logger;
        this.f133262d = c39838b;
    }
}
