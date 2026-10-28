package ye;

import cf.InterfaceC4526a;
import gf.C15760a;
import gm.C15990r;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p091dg.C12002a;
import p368og.InterfaceC27910g;
import p485sf.C32433e;
import p485sf.C32440l;
import p499t9.C33647p;
import p522uf.AbstractC34881i;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30063j;
import ug.C34913b;
import vv1.C36532c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ye.b */
/* JADX INFO: loaded from: classes.dex */
public final class C39475b implements InterfaceC4526a {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f169854b;

    /* JADX INFO: renamed from: c */
    public static final long f169855c;

    /* JADX INFO: renamed from: d */
    public static final List f169856d;

    /* JADX INFO: renamed from: e */
    public static final List f169857e;

    /* JADX INFO: renamed from: a */
    public volatile /* synthetic */ Object f169858a = null;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f169855c = DurationKt.toDuration(4, DurationUnit.MINUTES);
        f169856d = AbstractC37056f.m118959K("RequestTimeTooSkewed", "RequestExpired", "RequestInTheFuture");
        f169857e = AbstractC37056f.m118959K("InvalidSignatureException", "SignatureDoesNotMatch", "AuthFailure");
        f169854b = AtomicReferenceFieldUpdater.newUpdater(C39475b.class, Object.class, "a");
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: a */
    public final Object mo14167a(C32433e c32433e, C32440l c32440l) {
        InterfaceC30063j context = c32440l.getContext();
        String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39475b.class).getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
        }
        C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
        Duration duration = (Duration) this.f169858a;
        if (duration != null) {
            duration.getRawValue();
            InterfaceC27910g.m84216k(c15990rM113984B, new C36532c(duration, 26));
            c32433e.m101254a().mo33083c(AbstractC34881i.m110029c(), duration);
        }
        C12002a c12002aM101254a = c32433e.m101254a();
        C15760a c15760aM110030d = AbstractC34881i.m110030d();
        C33647p c33647p = C34913b.f147015x;
        c12002aM101254a.mo33083c(c15760aM110030d, C33647p.m106274t());
        return c32433e.m101255b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        r0 = s30.AbstractC32100b.m99866o(r0);
     */
    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo14173g(p485sf.C32429a r8, q83.InterfaceC30057d r9) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.C39475b.mo14173g(sf.a, q83.d):java.lang.Object");
    }
}
