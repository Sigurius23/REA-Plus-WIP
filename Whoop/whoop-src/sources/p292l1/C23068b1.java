package p292l1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import i93.C18284j;
import l83.C23454a0;
import p164g2.C15247s;
import p316m1.AbstractC24917o;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23068b1 implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC24917o f90988E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C18284j f90989F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C23085e0 f90990G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC23142n3 f90991H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C23204y f90992I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C15247s f90993J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Long f90994w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f90995x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f90996y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f90997z;

    public C23068b1(Long l7, long j7, Function1 function1, Function1 function2, AbstractC24917o abstractC24917o, C18284j c18284j, C23085e0 c23085e0, InterfaceC23142n3 interfaceC23142n3, C23204y c23204y, C15247s c15247s) {
        this.f90994w = l7;
        this.f90995x = j7;
        this.f90996y = function1;
        this.f90997z = function2;
        this.f90988E = abstractC24917o;
        this.f90989F = c18284j;
        this.f90990G = c23085e0;
        this.f90991H = interfaceC23142n3;
        this.f90992I = c23204y;
        this.f90993J = c15247s;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13 = ((C23122k1) obj2).f91354a;
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        if (i13 == 0) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1567031954);
            AbstractC23092f1.m67069c(this.f90994w, this.f90995x, this.f90996y, this.f90997z, this.f90988E, this.f90989F, this.f90990G, this.f90991H, this.f90992I, c28655q, 0);
            c28655q.m87173q(false);
        } else if (i13 == 1) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1567050592);
            AbstractC23192w.m67147a(this.f90994w, this.f90996y, this.f90988E, this.f90989F, this.f90990G, this.f90991H, this.f90992I, this.f90993J, c28655q2, 0);
            c28655q2.m87173q(false);
        } else {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(1334373351);
            c28655q3.m87173q(false);
        }
        return C23454a0.f92919a;
    }
}
