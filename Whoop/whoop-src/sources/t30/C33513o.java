package t30;

import androidx.fragment.app.AbstractC1356w0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import m30.C24992h;
import n30.InterfaceC26213d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29906g0;
import q30.C29920n0;
import q30.C29936v0;
import q30.InterfaceC29913k;
import r30.EnumC30905j;

/* JADX INFO: renamed from: t30.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C33513o extends AbstractC1356w0 {

    /* JADX INFO: renamed from: b */
    public final C24992h f139908b;

    /* JADX INFO: renamed from: c */
    public final C29906g0 f139909c;

    /* JADX INFO: renamed from: d */
    public final C29936v0 f139910d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC26213d f139911e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC29913k f139912f;

    /* JADX INFO: renamed from: g */
    public final EnumC30905j f139913g;

    /* JADX INFO: renamed from: h */
    public final C29920n0 f139914h;

    public C33513o(C24992h uiCustomization, C29906g0 transactionTimer, C29936v0 errorRequestExecutor, InterfaceC26213d errorReporter, InterfaceC29913k challengeActionHandler, EnumC30905j enumC30905j, C29920n0 intentData) {
        AbstractC22676k.m65750j(uiCustomization, "uiCustomization");
        AbstractC22676k.m65750j(transactionTimer, "transactionTimer");
        AbstractC22676k.m65750j(errorRequestExecutor, "errorRequestExecutor");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(challengeActionHandler, "challengeActionHandler");
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f139908b = uiCustomization;
        this.f139909c = transactionTimer;
        this.f139910d = errorRequestExecutor;
        this.f139911e = errorReporter;
        this.f139912f = challengeActionHandler;
        this.f139913g = enumC30905j;
        this.f139914h = intentData;
    }

    @Override // androidx.fragment.app.AbstractC1356w0
    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC1320m0 mo4083a(ClassLoader classLoader, String className) {
        AbstractC22676k.m65750j(classLoader, "classLoader");
        AbstractC22676k.m65750j(className, "className");
        if (className.equals(C33512n.class.getName())) {
            return new C33512n(this.f139908b, this.f139909c, this.f139910d, this.f139911e, this.f139912f, this.f139913g, this.f139914h);
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = super.mo4083a(classLoader, className);
        AbstractC22676k.m65747g(abstractComponentCallbacksC1320m0Mo4083a);
        return abstractComponentCallbacksC1320m0Mo4083a;
    }
}
