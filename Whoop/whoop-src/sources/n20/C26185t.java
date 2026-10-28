package n20;

import al0.C0971f;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.InterfaceC1563a2;
import ar0.C1926a;
import b10.C2222b;
import b10.C2224b1;
import b10.C2225c;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import b20.C2326f;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import cd.C4421a;
import com.google.android.gms.common.api.C4976g;
import g40.InterfaceC15452z;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p077d0.C11387o2;
import p096dq.AbstractC12277u;
import p096dq.C12272p;
import p096dq.C12276t;
import p098dt.AbstractC12350b;
import p298l8.AbstractC23420c;
import p408q.C29662f;
import p442qy.C30765d;
import p442qy.C30766e;
import p499t9.C33623c0;
import p508ty.C34249c;
import p530up.AbstractC35148d;
import p537ux.C35330f;
import p537ux.C35334h;
import p537ux.C35338j;
import p537ux.C35352q;
import p537ux.C35357s0;
import p537ux.C35362x;
import p537ux.C35363y;
import p537ux.EnumC35336i;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import s93.AbstractC32309k;
import sz.AbstractC33155t;
import sz.C33125d;
import sz.C33137j;
import sz.C33161z;
import sz.EnumC33131g;
import t20.C33341v;
import t20.C33342w;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: n20.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C26185t implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103853a = 2;

    /* JADX INFO: renamed from: b */
    public final Object f103854b;

    /* JADX INFO: renamed from: c */
    public final Object f103855c;

    public C26185t(Integer num, String str) {
        this.f103854b = num;
        this.f103855c = str;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class cls, AbstractC23420c extras) {
        EnumC35336i enumC35336i;
        int i13 = this.f103853a;
        Object obj = this.f103854b;
        Object obj2 = this.f103855c;
        AbstractC22676k.m65750j(extras, "extras");
        switch (i13) {
            case 0:
                return new C26186u(AbstractC35148d.m111160K(extras), AbstractC1613o1.m5015e(extras), (String) obj2, (Integer) obj);
            case 1:
                Application applicationM111160K = AbstractC35148d.m111160K(extras);
                AbstractC33155t abstractC33155t = (AbstractC33155t) obj;
                EnumC33131g environment = abstractC33155t.mo105019b().f138213w;
                C35363y c35363y = C35363y.f150632y;
                if (c35363y == null) {
                    SharedPreferences sharedPreferences = new C35362x(applicationM111160K).f150631a;
                    String string = sharedPreferences.getString("key_publishable_key", null);
                    c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                }
                String str = c35363y.f150633w;
                String str2 = c35363y.f150634x;
                Set setM34570S = AbstractC12350b.m34570S("GooglePayLauncher");
                C2222b c2222b = new C2222b(applicationM111160K, setM34570S, str);
                C1926a c1926a = new C1926a(str, 11);
                InterfaceC2227c1.f8867a.getClass();
                C30765d c30765d = C30766e.f126697b;
                C2273z0 c2273z0 = new C2273z0(applicationM111160K, c1926a, C2224b1.f8860b, c30765d, (InterfaceC30063j) obj2, setM34570S, null, c2222b, null, 63368);
                Context applicationContext = applicationM111160K.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                C2326f c2326f = new C2326f(new C39865j(c30765d, executorC22364d), new C2222b(applicationContext, setM34570S, new C0971f(applicationContext, 1)));
                EnumC33131g enumC33131g = abstractC33155t.mo105019b().f138213w;
                C33137j c33137j = abstractC33155t.mo105019b().f138209E;
                AbstractC22676k.m65750j(c33137j, "<this>");
                boolean z4 = c33137j.f138203w;
                int iOrdinal = c33137j.f138204x.ordinal();
                if (iOrdinal == 0) {
                    enumC35336i = EnumC35336i.Min;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enumC35336i = EnumC35336i.Full;
                }
                C35338j c35338j = new C35338j(z4, enumC35336i, c33137j.f138205y);
                boolean z13 = abstractC33155t.mo105019b().f138210F;
                boolean z14 = abstractC33155t.mo105019b().f138211G;
                C35330f c35330f = C35330f.f150532w;
                C35334h c35334h = C35334h.f150537w;
                C33125d c33125d = new C33125d(applicationM111160K, enumC33131g, c35338j, z13, z14, c2326f, c30765d, c35330f, c35334h);
                AbstractC22676k.m65750j(environment, "environment");
                C11387o2 c11387o2 = new C11387o2(2);
                c11387o2.m30623o(environment.f138197w);
                C12272p c12272p = new C12272p(applicationM111160K, null, AbstractC12277u.f41106a, new C12276t(c11387o2), C4976g.f20501c);
                C39857f c39857f = new C39857f(str, str2, 4);
                AbstractC33155t abstractC33155t2 = (AbstractC33155t) obj;
                C35357s0 c35357s0 = new C35357s0(applicationM111160K, new C1926a(str, 11), c2273z0, (InterfaceC30063j) obj2, 480);
                C4421a c4421a = new C4421a(str, str2);
                boolean zM125921F = AbstractC39421y.m125921F(abstractC33155t.mo105019b().f138214x, Locale.JAPAN.getCountry(), true);
                List additionalEnabledNetworks = abstractC33155t.mo105019b().f138212H;
                AbstractC22676k.m65750j(additionalEnabledNetworks, "additionalEnabledNetworks");
                return new C33161z(c12272p, c39857f, abstractC33155t2, c2273z0, c35357s0, new C35352q(c4421a, zM125921F, additionalEnabledNetworks, c35330f, c35334h), c33125d, AbstractC1613o1.m5015e(extras), c2326f, (InterfaceC30063j) obj2);
            default:
                C34249c c34249c = (C34249c) ((C26166a) new C29662f(new C33623c0(), AbstractC35148d.m111160K(extras)).f121232z).get();
                C1601k1 c1601k1M5015e = AbstractC1613o1.m5015e(extras);
                C33341v c33341v = (C33341v) ((InterfaceC4339a) obj2).invoke();
                c33341v.getClass();
                C29662f c29662f = (C29662f) c34249c.f143660x;
                return new C33342w(c33341v, (Application) c29662f.f121230x, (C2225c) c29662f.f121228E, c1601k1M5015e, (InterfaceC15452z) obj);
        }
    }

    public C26185t(AbstractC33155t args) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d workContext = ExecutorC22364d.f87316w;
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f103854b = args;
        this.f103855c = workContext;
    }

    public C26185t(InterfaceC15452z interfaceC15452z, InterfaceC4339a argsSupplier) {
        AbstractC22676k.m65750j(argsSupplier, "argsSupplier");
        this.f103854b = interfaceC15452z;
        this.f103855c = argsSupplier;
    }
}
