package nf;

import bc3.C3058t;
import bc3.InterfaceC3055s;
import cf.AbstractC4530e;
import cf.AbstractC4537l;
import cf.C4529d;
import gf.InterfaceC15761b;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import md0.C25447b;
import p095dp.AbstractC12240d;
import p249jc.AbstractC21598x;
import p326mf.AbstractC25492l;
import p326mf.C25490j;
import p333n4.C26250f;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34881i;
import p551vf.C35937b;
import p551vf.C35943h;
import p551vf.InterfaceC35936a;
import p581we.AbstractC37178b0;
import p581we.AbstractC37185f;
import p581we.C37187g;
import p581we.C37189h;
import p581we.C37199o;
import p581we.C37206v;
import p581we.C37207w;
import p581we.C37209y;
import p581we.C37210z;
import p581we.EnumC37179c;
import p581we.EnumC37181d;
import p581we.EnumC37183e;
import p613xf.InterfaceC38255a;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.time.Duration;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sb3.AbstractC32350a;
import ug.C34913b;
import ve.C35920e;

/* JADX INFO: renamed from: nf.g */
/* JADX INFO: loaded from: classes.dex */
public final class C26653g implements InterfaceC26655i {

    /* JADX INFO: renamed from: a */
    public final C26250f f105946a;

    public C26653g(C26250f c26250f) {
        this.f105946a = c26250f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // nf.InterfaceC26655i
    /* JADX INFO: renamed from: a */
    public final Object mo79293a(C26657k c26657k, InterfaceC30057d interfaceC30057d) throws Throwable {
        C26652f c26652f;
        C35937b c35937bM79295a;
        Set set;
        AbstractC37178b0 abstractC37178b0;
        InterfaceC15761b interfaceC15761b;
        C37187g c37187g;
        Set set2;
        if (interfaceC30057d instanceof C26652f) {
            c26652f = (C26652f) interfaceC30057d;
            int i13 = c26652f.f105941F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26652f.f105941F = i13 - Integer.MIN_VALUE;
            } else {
                c26652f = new C26652f(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c26652f = new C26652f(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c26652f.f105945z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26652f.f105941F;
        C26250f c26250f = this.f105946a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!(c26657k.m79296b() instanceof C35920e)) {
                StringBuilder sb4 = new StringBuilder("invalid Identity type ");
                Class<?> cls = c26657k.m79296b().getClass();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                sb4.append(c22673i0.getOrCreateKotlinClass(cls));
                sb4.append("; expected ");
                sb4.append(c22673i0.getOrCreateKotlinClass(C35920e.class));
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            InterfaceC15761b interfaceC15761bM79297c = c26657k.m79297c();
            c35937bM79295a = c26657k.m79295a();
            AbstractC25492l abstractC25492lM114178c = c35937bM79295a.m114178c();
            AbstractC37178b0 abstractC37178b1 = (AbstractC37178b0) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119151d());
            EnumC37181d enumC37181d = (EnumC37181d) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119155h());
            String strM74110N0 = (String) AbstractC21598x.m60654J(interfaceC15761bM79297c, AbstractC37185f.m119157j());
            Set set3 = (Set) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119158k());
            Set set4 = (Set) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119148a());
            Boolean bool = (Boolean) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119160m());
            Boolean bool2 = (Boolean) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119152e());
            String str = (String) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119159l());
            Boolean bool3 = (Boolean) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119153f());
            Boolean bool4 = (Boolean) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119150c());
            boolean zBooleanValue = bool4 != null ? bool4.booleanValue() : false;
            C37187g c37187g2 = new C37187g();
            if (str == null && (str = (String) c26250f.f104375e) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            c37187g2.m119178r(str);
            InterfaceC38255a interfaceC38255aM79296b = c26657k.m79296b();
            AbstractC22676k.m65748h(interfaceC38255aM79296b, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.auth.awscredentials.Credentials");
            c37187g2.m119172l((C35920e) interfaceC38255aM79296b);
            c37187g2.m119171k((EnumC37183e) c26250f.f104377g);
            EnumC37183e enumC37183eM119162b = c37187g2.m119162b();
            EnumC37183e enumC37183e = EnumC37183e.SIGV4_ASYMMETRIC;
            if (enumC37183eM119162b == enumC37183e && (set2 = set4) != null && !set2.isEmpty()) {
                strM74110N0 = AbstractC25265s.m74110N0(set4, ",", null, null, null, 62);
            } else if (c37187g2.m119162b() == enumC37183e && (set = set3) != null && !set.isEmpty()) {
                strM74110N0 = AbstractC25265s.m74110N0(set3, ",", null, null, null, 62);
            }
            c37187g2.m119177q(strM74110N0);
            C34913b c34913bM110115d = (C34913b) interfaceC15761bM79297c.mo33082b(AbstractC37185f.m119156i());
            if (c34913bM110115d == null) {
                C33647p c33647p = C34913b.f147015x;
                C34913b c34913bM106274t = C33647p.m106274t();
                Duration duration = (Duration) interfaceC15761bM79297c.mo33082b(AbstractC34881i.m110029c());
                c34913bM110115d = c34913bM106274t.m110115d(duration != null ? duration.getRawValue() : Duration.INSTANCE.m134357getZEROUwyO8pc());
            }
            c37187g2.m119182v(c34913bM110115d);
            c37187g2.m119180t((EnumC37179c) c26250f.f104376f);
            c37187g2.m119176p(bool3 != null ? bool3.booleanValue() : false);
            c37187g2.m119175o(bool2 != null ? bool2.booleanValue() : c26250f.f104373c);
            c37187g2.m119183w(bool != null ? bool.booleanValue() : c26250f.f104372b);
            c37187g2.m119179s((C25447b) c26250f.f104379i);
            if (enumC37181d == null) {
                enumC37181d = (EnumC37181d) c26250f.f104378h;
            }
            c37187g2.m119181u(enumC37181d);
            AbstractC4530e abstractC4530e = (AbstractC4530e) interfaceC15761bM79297c.mo33082b(AbstractC4537l.m14187b());
            c37187g2.m119174n(abstractC4530e != null && abstractC4530e.m14181a(C4529d.f18261d));
            if (abstractC37178b1 != null) {
                abstractC37178b0 = abstractC37178b1;
            } else if (abstractC25492lM114178c instanceof C25490j) {
                abstractC37178b0 = C37207w.f159057b;
            } else if (AbstractC32350a.m100706n(abstractC25492lM114178c) && zBooleanValue) {
                abstractC37178b0 = c35937bM79295a.m114179d().m391o("x-amz-trailer") ? C37210z.f159060b : C37209y.f159059b;
            } else {
                abstractC37178b0 = C37206v.f159056a;
            }
            c37187g2.m119173m(abstractC37178b0);
            C37187g c37187gM119161a = c37187g2.m119161a();
            if (AbstractC32350a.m100703j(c37187gM119161a)) {
                AbstractC32350a.m100711s(c35937bM79295a);
            }
            C37199o c37199o = (C37199o) c26250f.f104374d;
            if (c37199o == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C35943h c35943hM114177b = c35937bM79295a.m114177b();
            c26652f.f105942w = interfaceC15761bM79297c;
            c26652f.f105943x = c35937bM79295a;
            c26652f.f105944y = c37187gM119161a;
            c26652f.f105941F = 1;
            Object objM119214T = c37199o.m119214T(c35943hM114177b, c37187gM119161a, c26652f);
            if (objM119214T == enumC31071a) {
                return enumC31071a;
            }
            interfaceC15761b = interfaceC15761bM79297c;
            obj = objM119214T;
            c37187g = c37187gM119161a;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C37187g c37187g3 = c26652f.f105944y;
            c35937bM79295a = c26652f.f105943x;
            interfaceC15761b = c26652f.f105942w;
            AbstractC34132o.m107864I(obj);
            c37187g = c37187g3;
        }
        C35937b c35937b = c35937bM79295a;
        C37189h c37189h = (C37189h) obj;
        InterfaceC35936a interfaceC35936a = (InterfaceC35936a) c37189h.m119185a();
        InterfaceC3055s interfaceC3055s = (InterfaceC3055s) interfaceC15761b.mo33082b(AbstractC37185f.m119154g());
        if (interfaceC3055s != null) {
            ((C3058t) interfaceC3055s).m8807L(c37189h.m119186b());
        }
        AbstractC12240d.m34076m(c35937b, interfaceC35936a);
        if (AbstractC32350a.m100703j(c37187g)) {
            C37199o c37199o2 = (C37199o) c26250f.f104374d;
            if (c37199o2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC32350a.m100710r(c35937b, c37199o2, c37187g, c37189h.m119186b(), c35937b.m114181f().m74900Q(), c26652f.getContext());
        }
        return C23454a0.f92919a;
    }
}
