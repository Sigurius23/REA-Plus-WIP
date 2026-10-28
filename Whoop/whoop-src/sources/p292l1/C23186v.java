package p292l1;

import a40.InterfaceC0358c;
import a40.InterfaceC0360e;
import androidx.compose.p018ui.node.NodeCoordinator;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import ec3.C13081r1;
import g40.C15436v3;
import g40.C15446x3;
import g40.InterfaceC15421s3;
import j93.AbstractC21478l0;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Locale;
import l83.C23454a0;
import n20.C26175j;
import n43.C26285a;
import p005a3.C0271z0;
import p291l0.C22976l1;
import p294l3.C23283u0;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24917o;
import p316m1.C24919q;
import p316m1.C24922t;
import p329n0.C26057j;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p445r0.C30838f;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import x30.C37917p0;
import y00.EnumC38853i;

/* JADX INFO: renamed from: l1.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C23186v extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f91713E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f91714F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91715w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f91716x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f91717y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f91718z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23186v(Long l7, AbstractC24917o abstractC24917o, C24922t c24922t, Locale locale, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f91715w = 0;
        this.f91716x = l7;
        this.f91717y = abstractC24917o;
        this.f91718z = c24922t;
        this.f91713E = locale;
        this.f91714F = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91715w) {
            case 0:
                return new C23186v((Long) this.f91716x, (AbstractC24917o) this.f91717y, (C24922t) this.f91718z, (Locale) this.f91713E, (InterfaceC28601c1) this.f91714F, interfaceC30057d);
            case 1:
                C23186v c23186v = new C23186v((C30838f) this.f91717y, (NodeCoordinator) this.f91718z, (C0271z0) this.f91713E, (C26057j) this.f91714F, interfaceC30057d, 1);
                c23186v.f91716x = obj;
                return c23186v;
            default:
                C23186v c23186v2 = new C23186v((InterfaceC0360e) this.f91717y, (C37917p0) this.f91718z, (InterfaceC0358c) this.f91713E, (InterfaceC28601c1) this.f91714F, interfaceC30057d, 2);
                c23186v2.f91716x = obj;
                return c23186v2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91715w) {
            case 0:
                C23186v c23186v = (C23186v) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c23186v.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                return ((C23186v) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                C23186v c23186v2 = (C23186v) create((InterfaceC15421s3) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c23186v2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f91715w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f91713E;
        Object obj3 = this.f91717y;
        Object obj4 = this.f91714F;
        Object obj5 = this.f91718z;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                Long l7 = (Long) this.f91716x;
                if (l7 != null) {
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj4;
                    long jLongValue = l7.longValue();
                    String str = ((C24922t) obj5).f97607c;
                    ZoneId zoneId = C24919q.f97596e;
                    String str2 = Instant.ofEpochMilli(jLongValue).atZone(C24919q.f97596e).toLocalDate().format(AbstractC24899e0.m73000g(str, (Locale) obj2, ((C24919q) ((AbstractC24917o) obj3)).f97594b));
                    C29891y c29891y = new C29891y(4, str2, str2.length() == 0 ? C23283u0.f92251b : AbstractC21478l0.m60431f(str2.length(), str2.length()));
                    C22976l1 c22976l1 = AbstractC23192w.f91750a;
                    interfaceC28601c1.setValue(c29891y);
                }
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f91716x;
                C30838f c30838f = (C30838f) obj3;
                InterfaceC30057d interfaceC30057d = null;
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C26285a(c30838f, (NodeCoordinator) obj5, (C0271z0) obj2, interfaceC30057d, 15), 3);
                return AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C26175j(c30838f, (C26057j) obj4, interfaceC30057d, 21), 3);
            default:
                C13081r1 c13081r1 = ((C37917p0) obj5).f162365t;
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj4;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC15421s3 interfaceC15421s3 = (InterfaceC15421s3) this.f91716x;
                if (interfaceC15421s3 instanceof C15446x3) {
                    ((InterfaceC0360e) obj3).mo993a();
                    interfaceC28601c2.setValue(null);
                } else if (!(interfaceC15421s3 instanceof C15436v3)) {
                    interfaceC28601c2.setValue(null);
                } else if (((C15436v3) interfaceC15421s3).f58029a.getMessage() == R.string.stripe_disallowed_card_brand && ((EnumC38853i) interfaceC28601c2.getValue()) != c13081r1.f45200w.getValue()) {
                    ((InterfaceC0358c) obj2).mo992a((EnumC38853i) c13081r1.f45200w.getValue());
                    interfaceC28601c2.setValue((EnumC38853i) c13081r1.f45200w.getValue());
                }
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23186v(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f91715w = i13;
        this.f91717y = obj;
        this.f91718z = obj2;
        this.f91713E = obj3;
        this.f91714F = obj4;
    }
}
