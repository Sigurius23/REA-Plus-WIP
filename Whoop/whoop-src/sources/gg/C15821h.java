package gg;

import androidx.room.C1832u;
import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.SdkBaseException;
import aws.smithy.kotlin.runtime.ServiceException;
import java.util.Iterator;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import x30.AbstractC37926s0;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: gg.h */
/* JADX INFO: loaded from: classes.dex */
public class C15821h implements InterfaceC15820g {

    /* JADX INFO: renamed from: x */
    public static final C15821h f59715x = new C15821h();

    /* JADX INFO: renamed from: w */
    public final InterfaceC38174i f59716w;

    public C15821h() {
        C1832u c1832u = new C1832u(1, this, C15821h.class, "evaluateSpecificExceptions", "evaluateSpecificExceptions(Ljava/lang/Throwable;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", 0, 12);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        int i13 = 0;
        int i14 = 1;
        this.f59716w = AbstractC25260n.m74050X(new C15814a[]{new C15814a(c22673i0.getOrCreateKotlinClass(Throwable.class), c1832u), new C15814a(c22673i0.getOrCreateKotlinClass(ServiceException.class), new C1832u(i14, this, C15821h.class, "evaluateServiceException", "evaluateServiceException(Laws/smithy/kotlin/runtime/ServiceException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", i13, 13)), new C15814a(c22673i0.getOrCreateKotlinClass(ClientException.class), new C1832u(i14, this, C15821h.class, "evaluateClientException", "evaluateClientException(Laws/smithy/kotlin/runtime/ClientException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", i13, 14)), new C15814a(c22673i0.getOrCreateKotlinClass(SdkBaseException.class), new C1832u(i14, this, C15821h.class, "evaluateBaseException", "evaluateBaseException(Laws/smithy/kotlin/runtime/SdkBaseException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;", i13, 15))});
    }

    /* JADX INFO: renamed from: a */
    public AbstractC15818e mo9058a(Throwable ex3) {
        AbstractC22676k.m65750j(ex3, "ex");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // gg.InterfaceC15820g
    /* JADX INFO: renamed from: b */
    public final AbstractC15818e mo44620b(Object obj) {
        AbstractC15818e abstractC15818e;
        if (!(obj instanceof C23467m)) {
            return C15817d.f59709a;
        }
        Throwable thM68037a = C23468n.m68037a(obj);
        AbstractC22676k.m65747g(thM68037a);
        Iterator it = this.f59716w.iterator();
        do {
            abstractC15818e = null;
            if (!it.hasNext()) {
                break;
            }
            C15814a c15814a = (C15814a) it.next();
            c15814a.getClass();
            Throwable th3 = (Throwable) AbstractC37926s0.m121452D(c15814a.f59705a, thM68037a);
            if (th3 != null) {
                abstractC15818e = (AbstractC15818e) c15814a.f59706b.invoke(th3);
            }
        } while (abstractC15818e == null);
        return abstractC15818e == null ? C15816c.f59708a : abstractC15818e;
    }
}
