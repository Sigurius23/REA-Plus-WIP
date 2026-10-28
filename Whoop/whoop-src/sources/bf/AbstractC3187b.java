package bf;

import gf.C15760a;
import gf.C15762c;
import gf.InterfaceC15771l;
import java.util.Set;
import p091dg.C12002a;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bf.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3187b {

    /* JADX INFO: renamed from: a */
    public static final C15760a f12493a = new C15760a("aws.smithy.kotlin#BusinessMetrics");

    /* JADX INFO: renamed from: b */
    public static final C15760a f12494b = new C15760a("aws.smithy.kotlin#AccountIdBasedEndpointAccountId");

    /* JADX INFO: renamed from: c */
    public static final C15760a f12495c = new C15760a("aws.smithy.kotlin#ServiceEndpointOverride");

    /* JADX INFO: renamed from: a */
    public static final boolean m9169a(C12002a c12002a, EnumC3188c enumC3188c) {
        AbstractC22676k.m65750j(c12002a, "<this>");
        C15762c c15762c = c12002a.f39590y;
        C15760a c15760a = f12493a;
        return c15762c.mo33084d(c15760a) && ((Set) AbstractC21598x.m60654J(c15762c, c15760a)).contains(enumC3188c);
    }

    /* JADX INFO: renamed from: b */
    public static final void m9170b(C12002a c12002a, InterfaceC3186a metric) {
        AbstractC22676k.m65750j(c12002a, "<this>");
        AbstractC22676k.m65750j(metric, "metric");
        C15762c c15762c = c12002a.f39590y;
        C15760a c15760a = f12493a;
        if (c15762c.mo33084d(c15760a)) {
            ((Set) AbstractC21598x.m60654J(c15762c, c15760a)).add(metric);
        } else {
            c15762c.mo33083c(c15760a, AbstractC12350b.m34552A(metric));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9171c(InterfaceC15771l interfaceC15771l, InterfaceC3186a metric) {
        AbstractC22676k.m65750j(metric, "metric");
        C15760a c15760a = f12493a;
        if (interfaceC15771l.mo33084d(c15760a)) {
            ((Set) AbstractC21598x.m60654J(interfaceC15771l, c15760a)).add(metric);
        } else {
            interfaceC15771l.mo33083c(c15760a, AbstractC12350b.m34552A(metric));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C15760a m9172d() {
        return f12493a;
    }

    /* JADX INFO: renamed from: e */
    public static final C15760a m9173e() {
        return f12495c;
    }

    /* JADX INFO: renamed from: f */
    public static final void m9174f(C12002a c12002a, EnumC3188c enumC3188c) {
        AbstractC22676k.m65750j(c12002a, "<this>");
        C15762c c15762c = c12002a.f39590y;
        C15760a c15760a = f12493a;
        if (c15762c.mo33084d(c15760a)) {
            ((Set) AbstractC21598x.m60654J(c15762c, c15760a)).remove(enumC3188c);
        }
    }
}
