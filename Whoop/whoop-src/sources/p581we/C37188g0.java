package p581we;

import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import gf.C15774o;
import java.util.LinkedHashMap;
import mc3.AbstractC25438d;
import p027b3.AbstractC2351b;
import p499t9.C33647p;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.C30064k;
import q83.InterfaceC30057d;
import s40.C32139c0;
import se.AbstractC32416g;
import tg.AbstractC33774f;
import ug.C34913b;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: we.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37188g0 extends AbstractC2351b {

    /* JADX INFO: renamed from: d */
    public final InterfaceC4339a f159016d;

    /* JADX INFO: renamed from: e */
    public final C15774o f159017e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C37188g0() {
        C37186f0 c37186f0 = C37186f0.f159001w;
        super(EnumC37183e.SIGV4_ASYMMETRIC, c37186f0);
        this.f159016d = c37186f0;
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(1, DurationUnit.HOURS);
        C15774o c15774o = new C15774o();
        c15774o.f59443a = duration;
        c15774o.f59444b = new LinkedHashMap();
        c15774o.f59445c = AbstractC25438d.m74669a();
        C33647p c33647p = C34913b.f147015x;
        c15774o.f59446d = C33647p.m106274t().m110115d(duration);
        this.f159017e = c15774o;
    }

    @Override // p581we.InterfaceC37194j0
    /* JADX INFO: renamed from: a */
    public final byte[] mo119146a(C37187g c37187g) {
        return (byte[]) AbstractC3006f0.m8699E(C30064k.f122676w, new C32139c0(this, c37187g, (InterfaceC30057d) null, 21));
    }

    @Override // p581we.InterfaceC37194j0
    /* JADX INFO: renamed from: d */
    public final String mo119147d(String stringToSign, byte[] signingKey) {
        AbstractC22676k.m65750j(signingKey, "signingKey");
        AbstractC22676k.m65750j(stringToSign, "stringToSign");
        return AbstractC33774f.m106780a(AbstractC32416g.m101164u(signingKey, AbstractC39421y.m125919D(stringToSign)));
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: t */
    public final InterfaceC4339a mo7266t() {
        return this.f159016d;
    }
}
