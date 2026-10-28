package a20;

import a00.C0076k;
import a30.C0279c;
import a30.C0294h;
import al0.C0971f;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.InterfaceC1563a2;
import b10.C2221a1;
import b10.C2222b;
import b10.C2224b1;
import b10.C2225c;
import b10.C2273z0;
import b10.EnumC2228d;
import b10.InterfaceC2227c1;
import b20.C2327g;
import b30.C2570m;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bz.InterfaceC3704c;
import c10.C3831n;
import c20.C3873a;
import c20.C3874b;
import c20.C3879g;
import c20.C3887o;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import cy.C11181b;
import cz.C11190b;
import cz.C11200g;
import cz.C11215n0;
import cz.C11217o0;
import cz.EnumC11202h;
import d20.C11487c;
import d20.C11488d;
import d20.C11494j;
import d20.C11496l;
import d20.C11502r;
import dz.C12466m;
import e10.C12570s0;
import e20.AbstractC12595c;
import e20.C12593a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import f30.C14042e;
import f30.C14043f;
import g20.AbstractC15266l;
import g20.C15259e;
import g20.C15261g;
import g20.C15262h;
import g20.C15263i;
import g20.C15264j;
import g20.C15265k;
import g20.C15272r;
import g20.C15278x;
import g73.C15556d;
import h20.C16651f;
import h20.C16652f0;
import h20.C16658g0;
import h20.C16686k4;
import h20.C16733s3;
import h20.C16754w0;
import h20.C16757w3;
import h20.C16759x;
import h53.C16940e;
import i20.InterfaceC17980u0;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.C22136a;
import k20.C22137b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import la.C23548b;
import m30.C24992h;
import m83.AbstractC25267u;
import m83.C25235a0;
import n10.C26138l;
import n10.C26139l0;
import n10.C26143n0;
import n10.C26145o0;
import n10.C26152s;
import n10.C26156v;
import n30.C26212c;
import n30.C26215f;
import ng3.C26701n;
import ng3.C26702o;
import o30.C27504b;
import p023ay.C2149w;
import p078d1.C11456i;
import p078d1.C11457j;
import p096dq.C12272p;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12667a;
import p127ev.C13668i;
import p160fz.AbstractC14884b;
import p160fz.C14885c;
import p20.C28744f;
import p20.C28746h;
import p20.C28747i;
import p298l8.AbstractC23420c;
import p30.C28789a;
import p352ny.C27231c;
import p352ny.C27232d;
import p408q.C29662f;
import p442qy.C30765d;
import p465rm.C31559p;
import p499t9.C33623c0;
import p499t9.C33647p;
import p530up.AbstractC35148d;
import p537ux.C35352q;
import p537ux.C35362x;
import p537ux.C35363y;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p599wz.C37751r0;
import p619xl.C38445a;
import p631xz.C38721f0;
import p664yy.AbstractC39877q;
import p664yy.C39857f;
import p664yy.C39865j;
import p695zx.C41193o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29902e0;
import q30.C29922o0;
import q30.C29924p0;
import q30.C29926q0;
import q30.C29934u0;
import q80.C30036h;
import q83.InterfaceC30063j;
import s10.AbstractC32060b;
import s10.C32061c;
import s10.C32062d;
import s10.C32064f;
import s40.C32142d0;
import s93.AbstractC32309k;
import sz.C33124c0;
import sz.C33142l0;
import sz.C33150p0;
import sz.InterfaceC33152q0;
import t10.C33282b;
import t10.C33287g;
import t10.C33294n;
import t10.C33296p;
import u00.C34377e;
import u10.AbstractC34422j;
import u10.C34417e;
import u10.C34421i;
import u10.C34434v;
import uy.C35373a;
import v00.C35459c0;
import v03.C35515b;
import v03.C35516c;
import v03.C35518e;
import v03.C35522i;
import v03.InterfaceC35521h;
import v10.C35525a;
import v20.C35566f;
import v20.C35576p;
import v20.C35578r;
import w20.C36708a;
import w20.C36721k;
import w20.C36734x;
import x20.C37838f;
import x20.C37839g;
import x20.C37851s;
import x20.C37855w;
import y00.C38831f7;
import y00.C38887l3;
import y00.C38928q;
import y00.C38937r;
import y00.C38972u7;
import y00.C38981v7;
import y00.InterfaceC38946s;
import y10.C39041c;
import y10.C39046h;
import y20.AbstractC39153a;
import yb3.AbstractC39397a;
import z10.AbstractC39982e;
import z20.C40013g;

/* JADX INFO: renamed from: a20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C0168h implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f499a;

    /* JADX INFO: renamed from: b */
    public final Object f500b;

    public /* synthetic */ C0168h(Object obj, int i13) {
        this.f499a = i13;
        this.f500b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x06fd  */
    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class cls, AbstractC23420c extras) throws CertificateException {
        boolean z4;
        int i13 = this.f499a;
        int i14 = 18;
        int i15 = 14;
        int i16 = 5;
        int i17 = 3;
        int i18 = 11;
        final int i19 = 1;
        int i24 = 12;
        int i25 = 7;
        Object obj = this.f500b;
        final int i26 = 0;
        AbstractC22676k.m65750j(extras, "extras");
        switch (i13) {
            case 0:
                Application applicationM111160K = AbstractC35148d.m111160K(extras);
                C1601k1 c1601k1M5015e = AbstractC1613o1.m5015e(extras);
                C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
                AbstractC39982e abstractC39982e = (AbstractC39982e) ((C0161a) obj).invoke();
                C29662f c29662f = new C29662f(new C33623c0(), new C34377e(12), new C33647p(i25), applicationM111160K, c13096w1M36592b, c1601k1M5015e, abstractC39982e);
                return new C0170j(abstractC39982e, c13096w1M36592b, new C39046h(c29662f.m91100T0()), new C39041c(c29662f.m91100T0()), new C39046h(c29662f.m91100T0()), c1601k1M5015e, (C30765d) ((InterfaceC35521h) c29662f.f121228E).get());
            case 1:
                Application applicationM111160K2 = AbstractC35148d.m111160K(extras);
                C11200g c11200g = (C11200g) obj;
                C11190b c11190b = c11200g.f35923x;
                Integer num = c11200g.f35924y;
                EnumC11202h enumC11202h = c11200g.f35922w;
                C1601k1 c1601k1M5015e2 = AbstractC1613o1.m5015e(extras);
                c11190b.getClass();
                enumC11202h.getClass();
                C15556d c15556d = new C15556d(27);
                C34377e c34377e = new C34377e(i24);
                C35518e c35518eM112679a = C35518e.m112679a(applicationM111160K2);
                C35518e c35518eM112679a2 = C35518e.m112679a(c11190b);
                C35518e c35518eM112679a3 = C35518e.m112679a(enumC11202h);
                C11181b c11181b = AbstractC14884b.f55543d;
                C11181b c11181b2 = new C11181b(8);
                C11181b c11181b3 = AbstractC14884b.f55540a;
                C2327g c2327g = new C2327g(c11181b2, c11181b3, 11);
                C3879g c3879g = new C3879g(c35518eM112679a, 2);
                C3879g c3879g2 = new C3879g(c35518eM112679a, 3);
                C14885c c14885c = new C14885c(c3879g2, 0);
                C11181b c11181b4 = AbstractC14884b.f55542c;
                C0279c c0279c = new C0279c(c3879g, c14885c, c11181b4, 2);
                C12466m c12466m = new C12466m(c2327g, c0279c);
                C2221a1 c2221a1 = new C2221a1(c3879g, c14885c, new C2225c(c34377e, 0), c11181b3, c11181b4, c0279c, c2327g, c11181b2, 0);
                C2327g c2327g2 = new C2327g(c14885c, new C14885c(c3879g2, 1), 10);
                int i27 = 4;
                C26139l0 c26139l0 = new C26139l0(c15556d, new C3879g(C35518e.m112679a(new C26138l(new C2570m(c2221a1, c2327g2, new C12593a(C35518e.m112679a(new C26145o0(new C26143n0(c2327g2))), c11181b2, 1), new C2225c(c11181b2, i27), c11181b2, 9))), 4), C35518e.m112679a(new C15278x(new C11457j(14, c11181b, c11181b4))), num == null ? C35518e.f151136x : new C35518e(num), c3879g2);
                C12466m c12466m2 = new C12466m(c0279c, c2327g);
                C12570s0 c12570s0 = new C12570s0(c12466m2, new C0294h(c35518eM112679a, 8), c11181b3, new C0279c(c2327g, c0279c, AbstractC14884b.f55541b, 9), c14885c, c11181b4);
                C0279c c0279c2 = new C0279c(c12466m2, c14885c, c11181b4, i27);
                int i28 = C35522i.f151140y;
                int i29 = 3;
                ArrayList arrayList = new ArrayList(3);
                List list = Collections.EMPTY_LIST;
                arrayList.add(c26139l0);
                arrayList.add(c12570s0);
                arrayList.add(c0279c2);
                C2225c c2225c = new C2225c(new C35522i(arrayList, list), i29);
                C35518e c35518eM112679a4 = C35518e.m112679a(c1601k1M5015e2);
                C11215n0 c11215n0 = (C11215n0) C35516c.m112678b(new C11217o0(c35518eM112679a, c35518eM112679a2, c35518eM112679a3, c11181b2, c12466m, c3879g2, new C12570s0(c2225c, c35518eM112679a4, c12466m2, c11181b3, c11181b2, new C0294h(new C2327g(c3879g, c11181b3, i29), 12)), new C2149w(new C0279c(c3879g, c11181b2, c12466m2, 8), c12466m, c12466m2, 1), c12466m2, c35518eM112679a4, new C0294h(c3879g, i29))).get();
                AbstractC22676k.m65748h(c11215n0, "null cannot be cast to non-null type T of com.stripe.android.customersheet.CustomerSheetViewModel.Factory.create");
                return c11215n0;
            case 2:
                C11496l c11496l = (C11496l) ((C11494j) obj).invoke();
                Application applicationM111160K3 = AbstractC35148d.m111160K(extras);
                C1601k1 c1601k1M5015e3 = AbstractC1613o1.m5015e(extras);
                boolean z13 = c11496l.f36962F;
                C11456i c11456i = new C11456i(c11496l, 2);
                Set set = c11496l.f36965I;
                boolean zM35436G = AbstractC12667a.m35436G(applicationM111160K3);
                set.getClass();
                C34377e c34377e2 = new C34377e(i24);
                C33623c0 c33623c0 = new C33623c0();
                C33647p c33647p = new C33647p(i25);
                Boolean boolValueOf = Boolean.valueOf(z13);
                InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C35373a(c33623c0, 1));
                C35518e c35518eM112679a5 = C35518e.m112679a(boolValueOf);
                InterfaceC35521h interfaceC35521hM112678b2 = C35516c.m112678b(new C12593a(c33647p, c35518eM112679a5, 5));
                C35518e c35518eM112679a6 = C35518e.m112679a(applicationM111160K3);
                InterfaceC35521h interfaceC35521hM112678b3 = C35516c.m112678b(new C0076k(c35518eM112679a6, c35518eM112679a5, interfaceC35521hM112678b, 2));
                InterfaceC35521h interfaceC35521hM112678b4 = C35516c.m112678b(AbstractC12595c.f42983b);
                C35518e c35518eM112679a7 = C35518e.m112679a(c11456i);
                C2225c c2225c2 = new C2225c(c34377e2, 0);
                C35518e c35518eM112679a8 = C35518e.m112679a(set);
                C0279c c0279c3 = new C0279c(c35518eM112679a6, c35518eM112679a7, c35518eM112679a8, 2);
                C2327g c2327g3 = new C2327g(interfaceC35521hM112678b2, interfaceC35521hM112678b, 11);
                InterfaceC35521h interfaceC35521hM112678b5 = C35516c.m112678b(new C11488d(new C2221a1(c35518eM112679a6, c35518eM112679a7, c2225c2, interfaceC35521hM112678b, c35518eM112679a8, c0279c3, c2327g3, interfaceC35521hM112678b2, 0), c2327g3, c0279c3, C35516c.m112678b(AbstractC39877q.f172194a), interfaceC35521hM112678b2, interfaceC35521hM112678b, 0));
                C2273z0 c2273z0 = new C2273z0(applicationM111160K3, c11456i, EnumC2228d.PaymentElement, (InterfaceC30063j) interfaceC35521hM112678b.get(), set, new C2222b(applicationM111160K3, set, c11456i), new C39865j((C30765d) interfaceC35521hM112678b2.get(), (InterfaceC30063j) interfaceC35521hM112678b.get()), (C30765d) interfaceC35521hM112678b2.get());
                C39865j c39865j = new C39865j((C30765d) interfaceC35521hM112678b2.get(), (InterfaceC30063j) interfaceC35521hM112678b.get());
                C2222b c2222b = new C2222b(applicationM111160K3, set, c11456i);
                C28789a c28789a = (C28789a) interfaceC35521hM112678b3.get();
                C29924p0 c29924p0 = (C29924p0) interfaceC35521hM112678b4.get();
                C11487c c11487c = (C11487c) interfaceC35521hM112678b5.get();
                InterfaceC30063j workContext = (InterfaceC30063j) interfaceC35521hM112678b.get();
                AbstractC22676k.m65750j(workContext, "workContext");
                boolean zMo124338q0 = c11496l.f36968y.mo124338q0();
                C29926q0 sdkTransactionId = c11496l.f36966w;
                C24992h uiCustomization = c11496l.f36967x.f150603x.f150611w;
                C38981v7 sdkData = c11496l.f36969z;
                AbstractC22676k.m65750j(sdkData, "sdkData");
                String source = sdkData.f167785w;
                String directoryServerName = sdkData.f167786x;
                String serverTransactionId = sdkData.f167787y;
                C38972u7 c38972u7 = sdkData.f167788z;
                String directoryServerId = c38972u7.f167745w;
                String dsCertificateData = c38972u7.f167746x;
                List rootCertsData = c38972u7.f167747y;
                String str = c38972u7.f167748z;
                AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
                AbstractC22676k.m65750j(dsCertificateData, "dsCertificateData");
                AbstractC22676k.m65750j(rootCertsData, "rootCertsData");
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = dsCertificateData.getBytes(AbstractC39397a.f169546a);
                AbstractC22676k.m65749i(bytes, "getBytes(...)");
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                AbstractC22676k.m65748h(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                PublicKey publicKey = ((X509Certificate) certificateGenerateCertificate).getPublicKey();
                AbstractC22676k.m65749i(publicKey, "getPublicKey(...)");
                List list2 = rootCertsData;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Iterator it3 = it;
                    CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X.509");
                    byte[] bytes2 = str2.getBytes(AbstractC39397a.f169546a);
                    AbstractC22676k.m65749i(bytes2, "getBytes(...)");
                    Certificate certificateGenerateCertificate2 = certificateFactory2.generateCertificate(new ByteArrayInputStream(bytes2));
                    AbstractC22676k.m65748h(certificateGenerateCertificate2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList2.add((X509Certificate) certificateGenerateCertificate2);
                    it = it3;
                    c28789a = c28789a;
                    c29924p0 = c29924p0;
                }
                C28789a c28789a2 = c28789a;
                C29924p0 c29924p1 = c29924p0;
                C38831f7 c38831f7 = new C38831f7(directoryServerId, publicKey, arrayList2, str);
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(directoryServerName, "directoryServerName");
                AbstractC22676k.m65750j(serverTransactionId, "serverTransactionId");
                AbstractC22676k.m65750j(sdkTransactionId, "sdkTransactionId");
                AbstractC22676k.m65750j(uiCustomization, "uiCustomization");
                C29922o0 c29922o0 = z13 ? C29922o0.f122221d : C29922o0.f122220c;
                C26212c c26212c = new C26212c(applicationM111160K3, new C26215f(sdkTransactionId), workContext, c29922o0, 240);
                C29902e0 c29902e0 = new C29902e0(zMo124338q0, c38831f7.f167147y, c26212c);
                C27504b c27504b = new C27504b(zMo124338q0);
                C23548b c23548b = new C23548b(c26212c, 29);
                C38445a c38445a = new C38445a(27, c26212c, workContext);
                C29934u0 c29934u0 = new C29934u0(workContext, 0);
                AbstractC22676k.m65750j(sdkTransactionId, "sdkTransactionId");
                AbstractC22676k.m65750j(uiCustomization, "uiCustomization");
                C13668i c13668i = new C13668i();
                c13668i.f48454a = sdkTransactionId;
                c13668i.f48455b = c29902e0;
                c13668i.f48456c = c27504b;
                c13668i.f48457d = c23548b;
                c13668i.f48458e = c38445a;
                c13668i.f48459f = c29934u0;
                c13668i.f48460g = uiCustomization;
                c13668i.f48461h = c26212c;
                c13668i.f48462i = c29922o0;
                return new C11502r(applicationM111160K3, c11496l, c2273z0, c39865j, c2222b, c28789a2, c29924p1, c11487c, c13668i, (InterfaceC30063j) interfaceC35521hM112678b.get(), c1601k1M5015e3, zM35436G);
            case 3:
                final AbstractC15266l abstractC15266l = (AbstractC15266l) ((C15259e) obj).invoke();
                Application applicationM111160K4 = AbstractC35148d.m111160K(extras);
                C1601k1 c1601k1M5015e4 = AbstractC1613o1.m5015e(extras);
                boolean zMo43361b = abstractC15266l.mo43361b();
                final int i34 = 0;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: g20.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i34) {
                            case 0:
                                return abstractC15266l.mo43364i();
                            default:
                                return abstractC15266l.mo43366s();
                        }
                    }
                };
                InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: g20.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return abstractC15266l.mo43364i();
                            default:
                                return abstractC15266l.mo43366s();
                        }
                    }
                };
                Set setMo43363h = abstractC15266l.mo43363h();
                boolean zMo43362f = abstractC15266l.mo43362f();
                setMo43363h.getClass();
                C34377e c34377e3 = new C34377e(23);
                C34377e c34377e4 = new C34377e(i24);
                C33623c0 c33623c1 = new C33623c0();
                C33647p c33647p2 = new C33647p(i25);
                Boolean boolValueOf2 = Boolean.valueOf(zMo43361b);
                Boolean boolValueOf3 = Boolean.valueOf(zMo43362f);
                InterfaceC35521h interfaceC35521hM112678b6 = C35516c.m112678b(new C35373a(c33623c1, i19));
                C35518e c35518eM112679a9 = C35518e.m112679a(boolValueOf2);
                InterfaceC35521h interfaceC35521hM112678b7 = C35516c.m112678b(new C12593a(c33647p2, c35518eM112679a9, 5));
                C35518e c35518eM112679a10 = C35518e.m112679a(applicationM111160K4);
                InterfaceC35521h interfaceC35521hM112678b8 = C35516c.m112678b(new C35373a(c33623c1, 0));
                C35518e c35518eM112679a11 = C35518e.m112679a(interfaceC4339a);
                C35518e c35518eM112679a12 = C35518e.m112679a(setMo43363h);
                C0279c c0279c4 = new C0279c(c35518eM112679a10, c35518eM112679a11, c35518eM112679a12, 2);
                InterfaceC35521h interfaceC35521hM112678b9 = C35516c.m112678b(new C3887o(c34377e3, c35518eM112679a10, c35518eM112679a9, interfaceC35521hM112678b6, interfaceC35521hM112678b8, c0279c4, c35518eM112679a11, c35518eM112679a12, new C0294h(c34377e3, c35518eM112679a10, 14), C35518e.m112679a(boolValueOf3)));
                InterfaceC35521h interfaceC35521hM112678b10 = C35516c.m112678b(new C0294h(c34377e3, c35518eM112679a10, 13));
                C35518e c35518eM112679a13 = C35518e.m112679a(interfaceC4339a2);
                C2221a1 c2221a2 = new C2221a1(c35518eM112679a10, c35518eM112679a11, new C2225c(c34377e4, 0), interfaceC35521hM112678b6, c35518eM112679a12, c0279c4, new C2327g(interfaceC35521hM112678b7, interfaceC35521hM112678b6, 11), interfaceC35521hM112678b7, 0);
                InterfaceC35521h interfaceC35521hM112678b11 = C35516c.m112678b(new C26139l0(c35518eM112679a10, c35518eM112679a11, c2221a2, interfaceC35521hM112678b7, interfaceC35521hM112678b6));
                InterfaceC35521h interfaceC35521hM112678b12 = C35516c.m112678b(new C26156v(c35518eM112679a10, c35518eM112679a11, c2221a2, interfaceC35521hM112678b7, interfaceC35521hM112678b6, 1));
                InterfaceC35521h interfaceC35521hM112678b13 = C35516c.m112678b(new C11181b(c34377e3));
                if (abstractC15266l instanceof C15262h) {
                    InterfaceC38946s interfaceC38946s = ((C15262h) abstractC15266l).f57301F;
                    if (interfaceC38946s instanceof C38928q) {
                        z4 = true;
                    } else {
                        if (!(interfaceC38946s instanceof C38937r)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z4 = false;
                    }
                } else if ((abstractC15266l instanceof C15261g) || (abstractC15266l instanceof C15263i)) {
                    z4 = true;
                } else if (abstractC15266l instanceof C15264j) {
                    z4 = false;
                } else {
                    if (!(abstractC15266l instanceof C15265k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z4 = ((C15265k) abstractC15266l).f57322F instanceof C38887l3;
                }
                return new C15272r(z4, new C2273z0(applicationM111160K4, interfaceC4339a, EnumC2228d.PaymentElement, (InterfaceC30063j) interfaceC35521hM112678b6.get(), setMo43363h, new C2222b(applicationM111160K4, setMo43363h, interfaceC4339a), new C39865j((C30765d) interfaceC35521hM112678b7.get(), (InterfaceC30063j) interfaceC35521hM112678b6.get()), (C30765d) interfaceC35521hM112678b7.get()), (C3873a) interfaceC35521hM112678b9.get(), (C35525a) interfaceC35521hM112678b10.get(), new C2327g(c35518eM112679a11, c35518eM112679a13, 10), C35516c.m112677a(interfaceC35521hM112678b11), C35516c.m112677a(interfaceC35521hM112678b12), new C39865j((C30765d) interfaceC35521hM112678b7.get(), (InterfaceC30063j) interfaceC35521hM112678b6.get()), new C2222b(applicationM111160K4, setMo43363h, interfaceC4339a), (InterfaceC30063j) interfaceC35521hM112678b8.get(), c1601k1M5015e4, AbstractC12667a.m35436G(applicationM111160K4), (InterfaceC3704c) interfaceC35521hM112678b13.get());
            case 4:
                Application applicationM111160K5 = AbstractC35148d.m111160K(extras);
                C1601k1 c1601k1M5015e5 = AbstractC1613o1.m5015e(extras);
                C16652f0 c16652f0 = (C16652f0) ((C16658g0) obj).invoke();
                C28744f c28744f = new C28744f(new C34377e(i24), new C26701n(i24), new C33623c0(), new C33647p(i25), applicationM111160K5, c1601k1M5015e5, c16652f0);
                C38721f0 c38721f0 = (C38721f0) c28744f.f116346d.get();
                C34377e c34377e5 = new C34377e(11);
                C37751r0 c37751r0 = (C37751r0) c28744f.f116364v.get();
                C22136a c22136a = (C22136a) c28744f.f116368z.get();
                C40013g c40013g = (C40013g) c28744f.f116334A.get();
                InterfaceC35521h interfaceC35521h = c28744f.f116356n;
                InterfaceC30063j interfaceC30063j = (InterfaceC30063j) interfaceC35521h.get();
                C16759x c16759x = (C16759x) c28744f.f116335B.get();
                Set set2 = c16652f0.f64028F;
                AbstractC32309k.m100574c(set2);
                return new C16754w0(c16652f0, c38721f0, c34377e5, c37751r0, c22136a, c40013g, interfaceC30063j, c1601k1M5015e5, c16759x, new C41193o(applicationM111160K5, set2, EnumC2228d.PaymentElement, new C39865j((C30765d) c28744f.f116359q.get(), (InterfaceC30063j) interfaceC35521h.get())), C2149w.m6698a(new C27232d(), C0279c.m817a(new C27232d(), new C27232d(), c28744f.m87482a(), applicationM111160K5, (InterfaceC30063j) interfaceC35521h.get()), new C27232d(), c28744f.m87482a(), new C27231c(c28744f.m87482a(), c28744f.f116337D, c28744f.f116338E)), (EventReporter$Mode) c28744f.f116365w.get());
            case 5:
                C16686k4 c16686k4 = (C16686k4) new C28746h(new C34377e(i24), new C33623c0(), new C33647p(i25), new C15556d(i14), new C26702o(11, false), new C26702o(12, false), new C15556d(27), AbstractC35148d.m111160K(extras), AbstractC1613o1.m5015e(extras), (C16757w3) ((C16733s3) obj).invoke()).f116427r.get();
                AbstractC22676k.m65748h(c16686k4, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create");
                return c16686k4;
            case 6:
                return ((InterfaceC17980u0) obj).create(cls, extras);
            case 7:
                C30036h c30036h = new C30036h(this, 26);
                InterfaceC2227c1.f8867a.getClass();
                return new C32142d0(new C31559p(this, 9), new C2273z0((Context) obj, c30036h, C2224b1.f8860b, null, null, null, null, null, null, 65528));
            case 8:
                final Application applicationM111160K6 = AbstractC35148d.m111160K(extras);
                C1601k1 c1601k1M5015e6 = AbstractC1613o1.m5015e(extras);
                InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a() { // from class: sz.m0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                Application context = applicationM111160K6;
                                AbstractC22676k.m65750j(context, "context");
                                C35363y c35363y = C35363y.f150632y;
                                if (c35363y == null) {
                                    SharedPreferences sharedPreferences = new C35362x(context).f150631a;
                                    String string = sharedPreferences.getString("key_publishable_key", null);
                                    c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                                    if (c35363y == null) {
                                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                                    }
                                    C35363y.f150632y = c35363y;
                                }
                                return c35363y.f150633w;
                            default:
                                Application context2 = applicationM111160K6;
                                AbstractC22676k.m65750j(context2, "context");
                                C35363y c35363y2 = C35363y.f150632y;
                                if (c35363y2 == null) {
                                    SharedPreferences sharedPreferences2 = new C35362x(context2).f150631a;
                                    String string2 = sharedPreferences2.getString("key_publishable_key", null);
                                    c35363y2 = string2 != null ? new C35363y(string2, sharedPreferences2.getString("key_account_id", null)) : null;
                                    if (c35363y2 == null) {
                                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                                    }
                                    C35363y.f150632y = c35363y2;
                                }
                                return c35363y2.f150634x;
                        }
                    }
                };
                InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: sz.m0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                Application context = applicationM111160K6;
                                AbstractC22676k.m65750j(context, "context");
                                C35363y c35363y = C35363y.f150632y;
                                if (c35363y == null) {
                                    SharedPreferences sharedPreferences = new C35362x(context).f150631a;
                                    String string = sharedPreferences.getString("key_publishable_key", null);
                                    c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                                    if (c35363y == null) {
                                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                                    }
                                    C35363y.f150632y = c35363y;
                                }
                                return c35363y.f150633w;
                            default:
                                Application context2 = applicationM111160K6;
                                AbstractC22676k.m65750j(context2, "context");
                                C35363y c35363y2 = C35363y.f150632y;
                                if (c35363y2 == null) {
                                    SharedPreferences sharedPreferences2 = new C35362x(context2).f150631a;
                                    String string2 = sharedPreferences2.getString("key_publishable_key", null);
                                    c35363y2 = string2 != null ? new C35363y(string2, sharedPreferences2.getString("key_account_id", null)) : null;
                                    if (c35363y2 == null) {
                                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                                    }
                                    C35363y.f150632y = c35363y2;
                                }
                                return c35363y2.f150634x;
                        }
                    }
                };
                Set setM34570S = AbstractC12350b.m34570S("GooglePayPaymentMethodLauncher");
                C33142l0 c33142l0 = (C33142l0) obj;
                C33124c0 c33124c0 = c33142l0.f138225w;
                InterfaceC35320a interfaceC35320a = c33142l0.f138221F;
                InterfaceC35322b interfaceC35322b = c33142l0.f138222G;
                c33124c0.getClass();
                interfaceC35320a.getClass();
                interfaceC35322b.getClass();
                C33623c0 c33623c2 = new C33623c0();
                C33647p c33647p3 = new C33647p(i25);
                Boolean bool = Boolean.FALSE;
                C35518e c35518eM112679a14 = C35518e.m112679a(c33124c0);
                C35518e c35518eM112679a15 = C35518e.m112679a(applicationM111160K6);
                InterfaceC35521h interfaceC35521hM112678b14 = C35516c.m112678b(new C2327g(c35518eM112679a14, C35516c.m112678b(new C3879g(c35518eM112679a15, 12)), i25));
                InterfaceC35521h interfaceC35521hM112678b15 = C35516c.m112678b(new C35373a(c33623c2, i19));
                InterfaceC35521h interfaceC35521hM112678b16 = C35516c.m112678b(new C12593a(c33647p3, C35518e.m112679a(bool), 5));
                C35518e c35518eM112679a16 = C35518e.m112679a(interfaceC4339a3);
                C35518e c35518eM112679a17 = C35518e.m112679a(interfaceC4339a4);
                C35518e c35518eM112679a18 = C35518e.m112679a(interfaceC35320a);
                C35518e c35518eM112679a19 = C35518e.m112679a(interfaceC35322b);
                return new C33150p0((C12272p) interfaceC35521hM112678b14.get(), new C39857f(interfaceC4339a3, interfaceC4339a4), c33142l0, new C2273z0(applicationM111160K6, interfaceC4339a3, EnumC2228d.PaymentElement, (InterfaceC30063j) interfaceC35521hM112678b15.get(), setM34570S, new C2222b(applicationM111160K6, setM34570S, interfaceC4339a3), new C39865j((C30765d) interfaceC35521hM112678b16.get(), (InterfaceC30063j) interfaceC35521hM112678b15.get()), (C30765d) interfaceC35521hM112678b16.get()), (C35352q) C35516c.m112678b(new C26152s(c35518eM112679a16, c35518eM112679a17, c35518eM112679a14, c35518eM112679a18, c35518eM112679a19, 1)).get(), (InterfaceC33152q0) C35516c.m112678b(new C11488d(c35518eM112679a15, c35518eM112679a14, interfaceC35521hM112678b16, C35516c.m112678b(new C2327g(new C2327g(interfaceC35521hM112678b16, interfaceC35521hM112678b15, 11), C35516c.m112678b(new C0279c(c35518eM112679a15, c35518eM112679a16, C35518e.m112679a(setM34570S), 2)), 0)), c35518eM112679a18, c35518eM112679a19, 2)).get(), c1601k1M5015e6);
            case 9:
                C33296p c33296p = (C33296p) ((C33287g) obj).invoke();
                C35459c0 c35459c0 = c33296p.f138861x;
                String str3 = c33296p.f138860w;
                boolean z14 = c33296p.f138862y;
                C3831n c3831n = c33296p.f138863z;
                Integer num2 = c33296p.f138858F;
                Application applicationM111160K7 = AbstractC35148d.m111160K(extras);
                String str4 = c33296p.f138857E;
                C1601k1 c1601k1M5015e7 = AbstractC1613o1.m5015e(extras);
                c35459c0.getClass();
                str3.getClass();
                c3831n.getClass();
                str4.getClass();
                C33282b c33282b = new C33282b(new C33647p(i25), new C34377e(i24), new C15556d(27), c35459c0, str3, Boolean.valueOf(z14), num2, c3831n, str4, applicationM111160K7, c1601k1M5015e7);
                ((C32064f) c33282b.f138785d.get()).m99630a(c33296p.f138859G);
                return new C33294n(c33282b, (InterfaceC2994c0) c33282b.f138781b.get());
            case 10:
                C1601k1 c1601k1M5015e8 = AbstractC1613o1.m5015e(extras);
                C34421i c34421i = (C34421i) ((C34417e) obj).invoke();
                String str5 = c34421i.f144659z;
                C35459c0 c35459c1 = c34421i.f144656w;
                Application applicationM111160K8 = AbstractC35148d.m111160K(extras);
                c35459c1.getClass();
                str5.getClass();
                C33647p c33647p4 = new C33647p(i25);
                C34377e c34377e6 = new C34377e(i24);
                C16940e c16940e = new C16940e();
                c16940e.f64998a = C35516c.m112678b(AbstractC34422j.f144660a);
                C35518e c35518eM112679a20 = C35518e.m112679a(c1601k1M5015e8);
                c16940e.f64999b = c35518eM112679a20;
                c16940e.f65000c = C35516c.m112678b(new C3879g(c35518eM112679a20, 11));
                C35518e c35518eM112679a21 = C35518e.m112679a(c35459c1);
                c16940e.f65001d = c35518eM112679a21;
                c16940e.f65002e = C35516c.m112678b(new C2149w((C35518e) c16940e.f64999b, (InterfaceC35521h) c16940e.f65000c, new C3879g(c35518eM112679a21, 14), i25));
                c16940e.f65003f = C35518e.m112679a(applicationM111160K8);
                InterfaceC35521h interfaceC35521hM112678b17 = C35516c.m112678b(new C12593a(c33647p4, AbstractC32060b.f132959d, i16));
                c16940e.f65004g = interfaceC35521hM112678b17;
                C11181b c11181b5 = AbstractC32060b.f132956a;
                c16940e.f65005h = new C2327g(interfaceC35521hM112678b17, c11181b5, i18);
                C35518e c35518e = (C35518e) c16940e.f65003f;
                c16940e.f65006i = new C0279c(c35518e, c11181b5, interfaceC35521hM112678b17, i17);
                C28747i c28747i = new C28747i(c35518e, 5);
                c16940e.f65007j = c28747i;
                C32062d c32062d = new C32062d(c28747i, 0);
                c16940e.f65008k = c32062d;
                C32061c c32061c = AbstractC32060b.f132961f;
                c16940e.f65009l = new C0279c(c35518e, c32062d, c32061c, 2);
                C28747i c28747i2 = new C28747i(C35518e.m112679a(str5), 6);
                C35518e c35518e2 = (C35518e) c16940e.f65003f;
                c16940e.f65010m = C35516c.m112678b(new C22137b(c35518e2, AbstractC32060b.f132960e, (C2327g) c16940e.f65005h, (C0279c) c16940e.f65006i, (C0279c) c16940e.f65009l, AbstractC32060b.f132958c, c28747i2, c11181b5, new C0294h(c35518e2, i17), (C35518e) c16940e.f65001d));
                C2225c c2225c3 = new C2225c(c34377e6, i26);
                C35518e c35518e3 = (C35518e) c16940e.f65003f;
                C32062d c32062d2 = (C32062d) c16940e.f65008k;
                C0279c c0279c5 = (C0279c) c16940e.f65009l;
                C2327g c2327g4 = (C2327g) c16940e.f65005h;
                InterfaceC35521h interfaceC35521h2 = (InterfaceC35521h) c16940e.f65004g;
                c16940e.f65011n = C35516c.m112678b(new C11488d(new C2221a1(c35518e3, c32062d2, c2225c3, c11181b5, c32061c, c0279c5, c2327g4, interfaceC35521h2, 0), (C28747i) c16940e.f65007j, interfaceC35521h2, new C2327g(c2327g4, c0279c5, i26), c11181b5, c32061c, 7));
                c16940e.f65012o = new C35515b();
                InterfaceC35521h interfaceC35521hM112678b18 = C35516c.m112678b(AbstractC32060b.f132962g);
                C35515b c35515b = new C35515b();
                c16940e.f65013p = c35515b;
                InterfaceC35521h interfaceC35521hM112678b19 = C35516c.m112678b(new C2225c(new C3887o((InterfaceC35521h) c16940e.f65010m, (InterfaceC35521h) c16940e.f65011n, (InterfaceC35521h) c16940e.f65000c, (InterfaceC35521h) c16940e.f65002e, (C35515b) c16940e.f65012o, (C35518e) c16940e.f65001d, interfaceC35521hM112678b18, (InterfaceC35521h) c16940e.f64998a, c35515b), i18));
                c16940e.f65014q = interfaceC35521hM112678b19;
                C35515b.m112676a((C35515b) c16940e.f65013p, new C11488d(interfaceC35521hM112678b19, (C35518e) c16940e.f65001d, (InterfaceC35521h) c16940e.f65002e, (InterfaceC35521h) c16940e.f65000c, (InterfaceC35521h) c16940e.f65010m, (C35515b) c16940e.f65012o, 5));
                C35518e c35518e4 = (C35518e) c16940e.f65001d;
                InterfaceC35521h interfaceC35521h3 = (InterfaceC35521h) c16940e.f65002e;
                InterfaceC35521h interfaceC35521h4 = (InterfaceC35521h) c16940e.f65000c;
                InterfaceC35521h interfaceC35521h5 = (InterfaceC35521h) c16940e.f65014q;
                InterfaceC35521h interfaceC35521h6 = (InterfaceC35521h) c16940e.f65010m;
                C35515b c35515b2 = (C35515b) c16940e.f65012o;
                C35515b.m112676a(c35515b2, C35516c.m112678b(new C2149w(new C3874b(2, new C11488d(c35518e4, interfaceC35521h3, interfaceC35521h4, interfaceC35521h5, interfaceC35521h6, c35515b2, 4), interfaceC35521h3, c35518e4, (C35515b) c16940e.f65013p), (InterfaceC35521h) c16940e.f64998a, interfaceC35521h6, 8)));
                ((C16651f) ((InterfaceC35521h) c16940e.f65002e).get()).m47225a(c34421i.f144657x);
                ((C32064f) ((InterfaceC35521h) c16940e.f65000c).get()).m99630a(c34421i.f144658y);
                return new C34434v(c16940e, (InterfaceC2994c0) ((InterfaceC35521h) c16940e.f64998a).get());
            case 11:
                C35566f c35566f = (C35566f) obj;
                return new C35578r(new C35576p(c35566f.f151297w, c35566f.f151298x, c35566f.f151299y, c35566f.f151300z));
            case 12:
                C36721k c36721k = (C36721k) obj;
                return new C36734x(new C36708a(c36721k.f157206w, c36721k.f157207x, c36721k.f157209z));
            default:
                C37851s c37851s = (C37851s) ((C37839g) obj).invoke();
                C14043f c14043f = new C14043f(c37851s.f162034a);
                Application applicationM111160K9 = AbstractC35148d.m111160K(extras);
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                executorC22364d.getClass();
                C33623c0 c33623c3 = new C33623c0();
                C33647p c33647p5 = new C33647p(i25);
                InterfaceC35521h interfaceC35521hM112678b20 = C35516c.m112678b(new C35373a(c33623c3, i19));
                InterfaceC35521h interfaceC35521hM112678b21 = C35516c.m112678b(new C12593a(c33647p5, AbstractC39153a.f168307a, i16));
                C2225c c2225c4 = new C2225c(new C3879g(C35518e.m112679a(applicationM111160K9), 16), i15);
                C1601k1 c1601k1M5015e9 = AbstractC1613o1.m5015e(extras);
                C0971f c0971f = new C0971f(applicationM111160K9, i14);
                EnumC2228d enumC2228d = EnumC2228d.PaymentElement;
                InterfaceC30063j interfaceC30063j2 = (InterfaceC30063j) interfaceC35521hM112678b20.get();
                C0971f c0971f2 = new C0971f(applicationM111160K9, i14);
                C25235a0 c25235a0 = C25235a0.f99113w;
                return new C37855w(c37851s, new C14042e(new C2273z0(applicationM111160K9, c0971f, enumC2228d, interfaceC30063j2, c25235a0, new C2222b(applicationM111160K9, c25235a0, c0971f2), new C39865j((C30765d) interfaceC35521hM112678b21.get(), (InterfaceC30063j) interfaceC35521hM112678b20.get()), (C30765d) interfaceC35521hM112678b21.get()), c2225c4, c14043f, executorC22364d), new C37838f(), c1601k1M5015e9);
        }
    }

    public C0168h(C36721k args) {
        this.f499a = 12;
        AbstractC22676k.m65750j(args, "args");
        this.f500b = args;
    }

    public C0168h(C35566f args) {
        this.f499a = 11;
        AbstractC22676k.m65750j(args, "args");
        this.f500b = args;
    }

    public C0168h(C33142l0 args) {
        this.f499a = 8;
        AbstractC22676k.m65750j(args, "args");
        this.f500b = args;
    }
}
