package cf;

import gf.C15760a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cf.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4537l {

    /* JADX INFO: renamed from: a */
    public static final C15760a f18268a = new C15760a("aws.smithy.kotlin#OperationName");

    /* JADX INFO: renamed from: b */
    public static final C15760a f18269b = new C15760a("aws.smithy.kotlin#ServiceName");

    /* JADX INFO: renamed from: c */
    public static final C15760a f18270c = new C15760a("aws.smithy.kotlin#ClientName");

    /* JADX INFO: renamed from: d */
    public static final C15760a f18271d;

    static {
        if (AbstractC39414r.m125890i0("aws.smithy.kotlin#IdempotencyTokenProvider")) {
            throw new IllegalArgumentException("AttributeKey name must not be blank");
        }
        f18271d = new C15760a("aws.smithy.kotlin#LogMode");
        if (AbstractC39414r.m125890i0("aws.smithy.kotlin#EndpointDiscoveryEnabled")) {
            throw new IllegalArgumentException("AttributeKey name must not be blank");
        }
    }

    /* JADX INFO: renamed from: a */
    public static C15760a m14186a() {
        return f18270c;
    }

    /* JADX INFO: renamed from: b */
    public static C15760a m14187b() {
        return f18271d;
    }

    /* JADX INFO: renamed from: c */
    public static C15760a m14188c() {
        return f18268a;
    }
}
