package p301le;

import aws.smithy.kotlin.runtime.ServiceException;
import gg.AbstractC15818e;
import gg.C15815b;
import gg.C15821h;
import gg.EnumC15819f;
import l83.C23465k;
import m83.AbstractC25247g0;
import p326mf.C25500t;
import p501te.C33740e;
import p501te.InterfaceC33739d;
import p715kotlin.jvm.internal.AbstractC22676k;
import wf.C37236a;

/* JADX INFO: renamed from: le.a */
/* JADX INFO: loaded from: classes.dex */
public final class C23871a extends C15821h {

    /* JADX INFO: renamed from: E */
    public static final Object f94389E;

    /* JADX INFO: renamed from: y */
    public static final C23871a f94390y = new C23871a();

    /* JADX INFO: renamed from: z */
    public static final Object f94391z;

    static {
        EnumC15819f enumC15819f = EnumC15819f.f59713y;
        C23465k c23465k = new C23465k("BandwidthLimitExceeded", enumC15819f);
        C23465k c23465k2 = new C23465k("EC2ThrottledException", enumC15819f);
        EnumC15819f enumC15819f2 = EnumC15819f.f59714z;
        f94391z = AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("IDPCommunicationError", enumC15819f2), new C23465k("LimitExceededException", enumC15819f), new C23465k("PriorRequestNotComplete", enumC15819f), new C23465k("ProvisionedThroughputExceededException", enumC15819f), new C23465k("RequestLimitExceeded", enumC15819f), new C23465k("RequestThrottled", enumC15819f), new C23465k("RequestThrottledException", enumC15819f), new C23465k("RequestTimeout", enumC15819f2), new C23465k("RequestTimeoutException", enumC15819f2), new C23465k("SlowDown", enumC15819f), new C23465k("ThrottledException", enumC15819f), new C23465k("Throttling", enumC15819f), new C23465k("ThrottlingException", enumC15819f), new C23465k("TooManyRequestsException", enumC15819f), new C23465k("TransactionInProgressException", enumC15819f));
        f94389E = AbstractC25247g0.m73990Y(new C23465k(500, enumC15819f2), new C23465k(502, enumC15819f2), new C23465k(503, enumC15819f2), new C23465k(504, enumC15819f2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    @Override // gg.C15821h
    /* JADX INFO: renamed from: a */
    public final AbstractC15818e mo9058a(Throwable ex3) {
        C25500t c25500tM119336b;
        AbstractC22676k.m65750j(ex3, "ex");
        if (ex3 instanceof ServiceException) {
            C33740e f8399w = ((ServiceException) ex3).getF8399w();
            EnumC15819f enumC15819f = (EnumC15819f) f94391z.get(f8399w.m106624e());
            if (enumC15819f == null) {
                InterfaceC33739d interfaceC33739dM106627h = f8399w.m106627h();
                C37236a c37236a = interfaceC33739dM106627h instanceof C37236a ? (C37236a) interfaceC33739dM106627h : null;
                enumC15819f = (EnumC15819f) f94389E.get((c37236a == null || (c25500tM119336b = c37236a.m119336b()) == null) ? null : Integer.valueOf(c25500tM119336b.m74906a()));
            }
            if (enumC15819f != null) {
                return new C15815b(enumC15819f);
            }
        }
        return null;
    }
}
