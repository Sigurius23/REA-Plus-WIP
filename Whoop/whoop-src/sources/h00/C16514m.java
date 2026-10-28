package h00;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2591o4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d40.C11671p;
import g00.AbstractC14930a;
import g00.AbstractC14936g;
import h20.EnumC16701n1;
import l83.C23454a0;
import p026b2.C2314t;
import p048ce.AbstractC4482w;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12667a;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15166v0;
import p163g1.C14970c1;
import p163g1.C15077m1;
import p163g1.C15117q1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.C22976l1;
import p390p1.C28655q;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import se.AbstractC32417h;

/* JADX INFO: renamed from: h00.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C16514m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63495w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f63496x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f63497y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC32417h f63498z;

    public C16514m(InterfaceC4339a interfaceC4339a, boolean z4, AbstractC32417h abstractC32417h, int i13) {
        this.f63495w = i13;
        switch (i13) {
            case 1:
                EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
                this.f63496x = interfaceC4339a;
                this.f63497y = z4;
                this.f63498z = abstractC32417h;
                break;
            default:
                EnumC16701n1 enumC16701n2 = EnumC16701n1.f64226w;
                this.f63496x = interfaceC4339a;
                this.f63497y = z4;
                this.f63498z = abstractC32417h;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f7  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        long j7;
        int i13 = this.f63495w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC32417h abstractC32417h = this.f63498z;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
                if ((iIntValue & 3) != 2) {
                    Modifier modifierM3405b = AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, AbstractC12667a.m35432C(composer).f9845c, 1);
                    float f13 = AbstractC16518o.f63508a;
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(-599650077);
                    c28655q.m87150e0(2087703904);
                    EnumC16701n1 enumC16701n2 = EnumC16701n1.f64226w;
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(modifierM3405b, "LinkButtonTestTag");
                    C33252i c33252iM105489e = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                    float f14 = 0;
                    C15117q1 c15117q1M43197b = AbstractC15166v0.m43197b(f14, f14, f14, f14, f14, composer, 28086, 0);
                    c28655q.m87150e0(1183860712);
                    c28655q.m87150e0(-1197332337);
                    AbstractC4482w.m13975K(c28655q).getClass();
                    long j13 = AbstractC14930a.f55657l;
                    AbstractC4482w.m13975K(c28655q).getClass();
                    long j14 = AbstractC14930a.f55646a;
                    AbstractC4482w.m13975K(c28655q).getClass();
                    AbstractC4482w.m13975K(c28655q).getClass();
                    j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j7);
                    } else {
                        AbstractC17918w0.m51536x(j7);
                    }
                    C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(j13, j14, j13, C17919x.m51541c(0.38f, j14), c28655q, 0, 0);
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    float f15 = AbstractC16518o.f63509b;
                    float f16 = AbstractC16518o.f63508a;
                    AbstractC12350b.m34578a(this.f63496x, modifierM3599a, this.f63497y, c15117q1M43197b, c33252iM105489e, null, c15077m1M43196a, new C22976l1(f15, f16, f15, f16), AbstractC37817c.m121344e(-1137735920, composer, new C2591o4(abstractC32417h)), composer, 905969664, 72);
                } else {
                    C28655q c28655q2 = (C28655q) composer;
                    if (!c28655q2.m87121F()) {
                        Modifier modifierM3405b2 = AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, AbstractC12667a.m35432C(composer).f9845c, 1);
                        float f17 = AbstractC16518o.f63508a;
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(-599650077);
                        c28655q.m87150e0(2087703904);
                        EnumC16701n1 enumC16701n3 = EnumC16701n1.f64226w;
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifierM3405b2, "LinkButtonTestTag");
                        C33252i c33252iM105489e2 = AbstractC33253j.m105489e(C11671p.f37684e.f37661c.f37656a);
                        float f18 = 0;
                        C15117q1 c15117q1M43197b2 = AbstractC15166v0.m43197b(f18, f18, f18, f18, f18, composer, 28086, 0);
                        c28655q.m87150e0(1183860712);
                        c28655q.m87150e0(-1197332337);
                        AbstractC4482w.m13975K(c28655q).getClass();
                        long j15 = AbstractC14930a.f55657l;
                        AbstractC4482w.m13975K(c28655q).getClass();
                        long j16 = AbstractC14930a.f55646a;
                        AbstractC4482w.m13975K(c28655q).getClass();
                        AbstractC4482w.m13975K(c28655q).getClass();
                        j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(j15, j16, j15, C17919x.m51541c(0.38f, j16), c28655q, 0, 0);
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                        float f19 = AbstractC16518o.f63509b;
                        float f110 = AbstractC16518o.f63508a;
                        AbstractC12350b.m34578a(this.f63496x, modifierM3599a2, this.f63497y, c15117q1M43197b2, c33252iM105489e2, null, c15077m1M43196a2, new C22976l1(f19, f110, f19, f110), AbstractC37817c.m121344e(-1137735920, composer, new C2591o4(abstractC32417h)), composer, 905969664, 72);
                    } else {
                        c28655q2.m87138X();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    EnumC16701n1 enumC16701n4 = EnumC16701n1.f64226w;
                    AbstractC14936g.m43027a(null, AbstractC37817c.m121344e(812086528, composer2, new C16514m(this.f63496x, this.f63497y, abstractC32417h, 0)), composer2, 48);
                } else {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (!c28655q3.m87121F()) {
                        EnumC16701n1 enumC16701n5 = EnumC16701n1.f64226w;
                        AbstractC14936g.m43027a(null, AbstractC37817c.m121344e(812086528, composer2, new C16514m(this.f63496x, this.f63497y, abstractC32417h, 0)), composer2, 48);
                    } else {
                        c28655q3.m87138X();
                    }
                }
                break;
        }
        return c23454a0;
    }
}
