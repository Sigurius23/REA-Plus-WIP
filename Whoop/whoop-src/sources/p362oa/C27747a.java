package p362oa;

import java.math.BigInteger;
import p123en.AbstractC13361h;
import p123en.C13355b;
import p499t9.C33625d0;
import p499t9.C33629f0;
import p499t9.InterfaceC33627e0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: oa.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C27747a implements InterfaceC33627e0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13355b f111908a;

    public C27747a(C13355b c13355b) {
        this.f111908a = c13355b;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        C13355b c13355b = this.f111908a;
        long j13 = (((long) ((AbstractC13361h) c13355b.f46677M).f46701f) * j7) / 1000000;
        long j14 = c13355b.f46679x;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j13);
        long j15 = c13355b.f46680y;
        C33629f0 c33629f0 = new C33629f0(j7, AbstractC38065t.m121915h((bigIntegerValueOf.multiply(BigInteger.valueOf(j15 - j14)).divide(BigInteger.valueOf(c13355b.f46669E)).longValue() + j14) - 30000, c13355b.f46679x, j15 - 1));
        return new C33625d0(c33629f0, c33629f0);
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return true;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        C13355b c13355b = this.f111908a;
        return (c13355b.f46669E * 1000000) / ((long) ((AbstractC13361h) c13355b.f46677M).f46701f);
    }
}
