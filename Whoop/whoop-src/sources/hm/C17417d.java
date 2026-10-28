package hm;

import a30.C0279c;
import a30.C0294h;
import ag.C0854d;
import ag.C0855e;
import ag.EnumC0856f;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.widget.EditText;
import android.widget.TextView;
import androidx.health.platform.client.proto.C1533u;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import b20.C2327g;
import bd3.C3143v;
import c00.C3800f;
import c13.AbstractC3855a;
import c20.C3879g;
import c93.InterfaceC4339a;
import ch.C4588i;
import com.google.android.gms.common.api.AbstractC4977h;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import e20.C12593a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import f93.C14289a;
import g40.C15347f;
import g40.C15382l;
import ge.AbstractC15719d;
import ge.C15716a;
import ge.C15717b;
import ge.C15720e;
import ge.C15721f;
import ge.C15722g;
import ge.C15724i;
import ge.C15725j;
import gm.C15990r;
import gw.AbstractC16252c;
import ht.ScheduledFutureC17620i;
import i20.AbstractC17960l1;
import i20.C17928b;
import i20.C17932c0;
import i20.C17970p0;
import i20.C17973r;
import i20.C17975s;
import i20.C17982v0;
import i20.EnumC17971q;
import i20.InterfaceC17980u0;
import im.InterfaceC18653b;
import io.sentry.C20412l5;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.InterfaceC20508q1;
import io.sentry.android.replay.video.C20245d;
import io.sentry.internal.C20375a;
import io.sentry.util.network.AbstractC20594b;
import io.sentry.vendor.gson.stream.C20611a;
import j20.C21241c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import javax.crypto.spec.SecretKeySpec;
import ke.C22416a;
import kh.C22467a;
import kh.C22468b;
import kh.InterfaceC22473g;
import l40.C23328a;
import la.C23548b;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import n53.C26318e;
import n83.C26460c;
import ng3.C26701n;
import ng3.C26702o;
import p023ay.C2149w;
import p029b5.C2725d;
import p048ce.AbstractC4482w;
import p073cq.C11040i;
import p091dg.C12002a;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17246g;
import p20.AbstractC28739a;
import p229ip.AbstractC20798i;
import p229ip.BinderC20791b;
import p229ip.BinderC20793d;
import p229ip.C20792c;
import p229ip.C20794e;
import p229ip.C20801l;
import p229ip.C20802m;
import p229ip.C20803n;
import p244j6.C21362g;
import p251jg.C21649b;
import p292l1.C23110i1;
import p298l8.AbstractC23420c;
import p326mf.C25483c;
import p402po.C29388e;
import p402po.C29390g;
import p402po.C29391h;
import p412q3.InterfaceC29884r;
import p470rv.AbstractC31834n;
import p477s2.AbstractC32069a;
import p499t9.C33623c0;
import p499t9.C33647p;
import p522uf.C34894u;
import p522uf.InterfaceC34888o;
import p530up.AbstractC35148d;
import p551vf.C35937b;
import p557vo.AbstractC36219a;
import p565vy.AbstractC36561a;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import s83.AbstractC32269c;
import to.InterfaceC33987n;
import uy.C35373a;
import v03.C35516c;
import v03.C35518e;
import v03.InterfaceC35521h;
import wb3.AbstractC37056f;
import y30.InterfaceC39190e;

/* JADX INFO: renamed from: hm.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C17417d implements InterfaceC18653b, InterfaceC17980u0, InterfaceC20508q1, InterfaceC33987n, InterfaceC34888o, InterfaceC17242c, InterfaceC17246g, InterfaceC22473g, InterfaceC29884r {

    /* JADX INFO: renamed from: y */
    public static Method f67505y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67506w;

    /* JADX INFO: renamed from: x */
    public Object f67507x;

    public /* synthetic */ C17417d(AbstractC4977h abstractC4977h, AbstractC36219a abstractC36219a, int i13) {
        this.f67506w = i13;
        this.f67507x = abstractC36219a;
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m49429i(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return AbstractC31834n.m98899h(AbstractC32069a.m99659A(bArr.length), bArr);
    }

    @Override // kh.InterfaceC22473g
    /* JADX INFO: renamed from: a */
    public void mo16046a(int i13) {
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) {
        int i13 = 0;
        switch (this.f67506w) {
            case 13:
                BinderC20791b binderC20791b = new BinderC20791b(0, (C11040i) obj2);
                C20802m c20802m = (C20802m) ((C20801l) obj).m111061j();
                C29391h c29391h = (C29391h) this.f67507x;
                Parcel parcelM57324s = c20802m.m57324s();
                int i14 = AbstractC20798i.f78089a;
                parcelM57324s.writeStrongBinder(binderC20791b);
                AbstractC20798i.m57336c(parcelM57324s, c29391h);
                c20802m.m57319X(parcelM57324s, 2);
                break;
            case 14:
                C20792c c20792c = (C20792c) this.f67507x;
                BinderC20793d binderC20793d = new BinderC20793d(i13, (C11040i) obj2);
                C20803n c20803n = (C20803n) ((C20794e) obj).m111061j();
                String str = c20792c.f78079a;
                Parcel parcelM57324s2 = c20803n.m57324s();
                int i15 = AbstractC20798i.f78089a;
                parcelM57324s2.writeStrongBinder(binderC20793d);
                parcelM57324s2.writeString(str);
                c20803n.m57319X(parcelM57324s2, 2);
                break;
            case 15:
                BinderC20791b binderC20791b2 = new BinderC20791b(1, (C11040i) obj2);
                C20803n c20803n2 = (C20803n) ((C20794e) obj).m111061j();
                C29388e c29388e = (C29388e) this.f67507x;
                Parcel parcelM57324s3 = c20803n2.m57324s();
                int i16 = AbstractC20798i.f78089a;
                parcelM57324s3.writeStrongBinder(binderC20791b2);
                AbstractC20798i.m57336c(parcelM57324s3, c29388e);
                c20803n2.m57319X(parcelM57324s3, 1);
                break;
            default:
                BinderC20791b binderC20791b3 = new BinderC20791b(2, (C11040i) obj2);
                C20803n c20803n3 = (C20803n) ((C20794e) obj).m111061j();
                C29390g c29390g = (C29390g) this.f67507x;
                Parcel parcelM57324s4 = c20803n3.m57324s();
                int i17 = AbstractC20798i.f78089a;
                parcelM57324s4.writeStrongBinder(binderC20791b3);
                AbstractC20798i.m57336c(parcelM57324s4, c29390g);
                c20803n3.m57319X(parcelM57324s4, 3);
                break;
        }
    }

    @Override // kh.InterfaceC22473g
    /* JADX INFO: renamed from: b */
    public void mo16048b() {
    }

    @Override // p522uf.InterfaceC34888o
    /* JADX INFO: renamed from: c */
    public void mo9061c(C25126d c25126d) {
        C0855e c0855e = (C0855e) ((C20245d) c25126d.f98484x).f76046b;
        EnumC0856f enumC0856f = EnumC0856f.f3061w;
        c0855e.getClass();
        c0855e.m2064c(new C0855e(this, 0), EnumC0856f.f3062x);
    }

    @Override // i20.InterfaceC17980u0
    public C17982v0 create(Class cls, AbstractC23420c extras) {
        AbstractC22676k.m65750j(extras, "extras");
        Application applicationM111160K = AbstractC35148d.m111160K(extras);
        C17932c0 c17932c0 = (C17932c0) this.f67507x;
        C33647p c33647p = new C33647p(7);
        C33623c0 c33623c0 = new C33623c0();
        InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C3879g(C35518e.m112679a(applicationM111160K), 8));
        C35518e c35518eM112679a = C35518e.m112679a(c17932c0);
        InterfaceC35521h interfaceC35521hM112678b2 = C35516c.m112678b(new C3800f(interfaceC35521hM112678b, c35518eM112679a, 3));
        InterfaceC35521h interfaceC35521hM112678b3 = C35516c.m112678b(new C3879g(c35518eM112679a, 7));
        InterfaceC35521h interfaceC35521hM112678b4 = C35516c.m112678b(new C12593a(c33647p, AbstractC28739a.f116320a, 5));
        InterfaceC35521h interfaceC35521hM112678b5 = C35516c.m112678b(new C35373a(c33623c0, 1));
        return new C17982v0((InterfaceC39190e) interfaceC35521hM112678b2.get(), (C17970p0) interfaceC35521hM112678b3.get(), (C21241c) C35516c.m112678b(new C0294h(C35516c.m112678b(new C2149w(new C2327g(interfaceC35521hM112678b4, interfaceC35521hM112678b5, 11), new C0279c(interfaceC35521hM112678b, C35516c.m112678b(new C0294h(interfaceC35521hM112678b, 27)), C35516c.m112678b(AbstractC28739a.f116321b), 2), interfaceC35521hM112678b5, 3)), 26)).get(), applicationM111160K);
    }

    @Override // p522uf.InterfaceC34888o
    /* JADX INFO: renamed from: d */
    public Object mo9062d(Object obj, C0854d c0854d) {
        C15717b c15717b = (C15717b) this.f67507x;
        C34894u c34894u = (C34894u) obj;
        C12002a c12002a = c34894u.f146958a;
        Object obj2 = c34894u.f146959b;
        C22416a c22416a = (C22416a) c12002a.mo33082b(C22416a.f87694c);
        if (c22416a != null) {
            C22416a c22416a2 = c15717b.f59223h;
            C22416a c22416a3 = new C22416a(AbstractC25247g0.m73995d0(c22416a2.f87695a, c22416a.f87695a), AbstractC25265s.m74129g1(c22416a2.f87696b, c22416a.f87696b));
            C15725j c15725j = c15717b.f59216a;
            C15716a c15716a = c15717b.f59217b;
            C15724i c15724i = c15717b.f59218c;
            C15722g c15722g = c15717b.f59219d;
            C15720e c15720e = c15717b.f59220e;
            C15721f c15721f = c15717b.f59221f;
            String str = c15717b.f59222g;
            c15717b.getClass();
            c15717b = new C15717b(c15725j, c15716a, c15724i, c15722g, c15720e, c15721f, str, c22416a3);
        }
        C35937b c35937b = (C35937b) obj2;
        C25483c c25483c = c35937b.f153017y;
        c15717b.getClass();
        C15725j c15725j2 = c15717b.f59216a;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add(c15725j2);
        C22416a c22416a4 = c15717b.f59223h;
        ArrayList arrayList = c22416a4.f87696b;
        LinkedHashMap linkedHashMap = c22416a4.f87695a;
        if (linkedHashMap != null) {
            if ((linkedHashMap.containsKey("internal") ? linkedHashMap : null) != null) {
                c26460cM119000x.add("md/internal");
            }
        }
        c26460cM119000x.add(AbstractC15719d.m44302c(4, "ua", "2.1", null));
        c26460cM119000x.add(c15717b.f59217b);
        c26460cM119000x.add(c15717b.f59218c);
        c26460cM119000x.add(c15717b.f59219d);
        C15720e c15720e2 = c15717b.f59220e;
        if (c15720e2 != null) {
            c26460cM119000x.add(c15720e2);
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                c26460cM119000x.add(it3.next());
            }
        }
        String str2 = c15717b.f59222g;
        if (str2 != null) {
            c26460cM119000x.add(AbstractC15719d.m44302c(2, "app", null, str2));
        }
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                c26460cM119000x.add(it5.next());
            }
        }
        C15721f c15721f2 = c15717b.f59221f;
        if (c15721f2 != null) {
            c26460cM119000x.add(c15721f2);
        }
        if (linkedHashMap != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!AbstractC22676k.m65745e((String) entry.getKey(), "internal")) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            c26460cM119000x.add(AbstractC4482w.m13996i0(linkedHashMap2));
        }
        c25483c.m380N(AbstractC25265s.m74110N0(AbstractC37056f.m118988k(c26460cM119000x), " ", null, null, null, 62), "User-Agent");
        c35937b.f153017y.m380N(String.valueOf(c15725j2), "x-amz-user-agent");
        return c34894u;
    }

    /* JADX INFO: renamed from: e */
    public Object m49430e(AbstractC32269c abstractC32269c) {
        InterfaceC13037f2 interfaceC13037f2 = (InterfaceC13037f2) this.f67507x;
        Object value = interfaceC13037f2.getValue();
        return value == null ? AbstractC13091v.m36575A(new C4588i(interfaceC13037f2, 2), abstractC32269c) : value;
    }

    @Override // kh.InterfaceC22473g
    /* JADX INFO: renamed from: f */
    public void mo16054f(C22467a c22467a, Bitmap bitmap, Map map) {
        ((C3143v) this.f67507x).m9046o(c22467a, bitmap, map, AbstractC29125c.m88546w(bitmap));
    }

    /* JADX INFO: renamed from: g */
    public SecretKeySpec m49431g(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws JOSEException {
        byte[] bArrM98899h = AbstractC31834n.m98899h(bArr, bArr2, bArr3, bArr4, bArr5);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Provider provider = (Provider) ((C23548b) this.f67507x).f93280x;
        try {
            MessageDigest messageDigest = provider == null ? MessageDigest.getInstance("SHA-256") : MessageDigest.getInstance("SHA-256", provider);
            int i13 = 1;
            while (true) {
                long digestLength = ((long) messageDigest.getDigestLength()) * 8;
                int i14 = (int) digestLength;
                if (i14 != digestLength) {
                    throw new IntegerOverflowException();
                }
                if (i13 > (i14 + 255) / i14) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    return byteArray.length == 32 ? new SecretKeySpec(byteArray, "AES") : new SecretKeySpec(AbstractC31834n.m98903l(byteArray, 0, 32), "AES");
                }
                messageDigest.update(AbstractC32069a.m99659A(i13));
                messageDigest.update(secretKeySpec.getEncoded());
                if (bArrM98899h != null) {
                    messageDigest.update(bArrM98899h);
                }
                try {
                    byteArrayOutputStream.write(messageDigest.digest());
                    i13++;
                } catch (IOException e5) {
                    throw new JOSEException(AbstractC3855a.m11824h(e5, new StringBuilder("Couldn't write derived key: ")), e5);
                }
            }
        } catch (NoSuchAlgorithmException e13) {
            throw new JOSEException("Couldn't get message digest for KDF: " + e13.getMessage(), e13);
        }
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        return new C15990r((Context) ((C14289a) this.f67507x).f52186x, new C26701n(14), new C26702o(13, false), 5);
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: h */
    public int mo45164h() {
        return ((C21649b) this.f67507x).mo45164h();
    }

    @Override // io.sentry.InterfaceC20508q1
    /* JADX INFO: renamed from: j */
    public boolean mo11171j() {
        if (C20375a.f76414c == null) {
            C20535s c20535sM56711a = C20375a.f76415d.m56711a();
            try {
                if (C20375a.f76414c == null) {
                    C20375a.f76414c = new C20375a();
                }
                c20535sM56711a.close();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        C20375a c20375a = C20375a.f76414c;
        if (!c20375a.f76416a) {
            try {
                C20535s c20535sM56711a2 = c20375a.f76417b.m56711a();
                try {
                    if (!c20375a.f76416a) {
                        Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                        while (resources.hasMoreElements()) {
                            try {
                                Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                                if (mainAttributes != null) {
                                    String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                    String value2 = mainAttributes.getValue("Implementation-Version");
                                    String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                    String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                    if (value != null && value2 != null) {
                                        String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                        if (value5 != null) {
                                            C20412l5.m56626d().m56628b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                            C20412l5.m56626d().m56627a("OpenTelemetry");
                                        }
                                        String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                        if (value6 != null) {
                                            C20412l5.m56626d().m56628b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                            C20412l5.m56626d().m56627a("OpenTelemetry-Agent");
                                        }
                                        if (value.equals("sentry.java.opentelemetry.agentless")) {
                                            C20412l5.m56626d().m56627a("OpenTelemetry-Agentless");
                                        }
                                        if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                            C20412l5.m56626d().m56627a("OpenTelemetry-Agentless-Spring");
                                        }
                                    }
                                    if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                        C20412l5.m56626d().m56628b(value4, value2);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    c20535sM56711a2.close();
                } catch (Throwable th5) {
                    try {
                        c20535sM56711a2.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException unused2) {
            } catch (Throwable th7) {
                c20375a.f76416a = true;
                throw th7;
            }
            c20375a.f76416a = true;
        }
        return C20412l5.m56626d().m56629c(((C20513q6) this.f67507x).getFatalLogger());
    }

    /* JADX INFO: renamed from: k */
    public boolean m49432k(AbstractC16252c abstractC16252c) {
        Set<String> set = abstractC16252c.f61790z;
        if (set == null) {
            return true;
        }
        for (String str : set) {
            if (!Collections.singleton("b64").contains(str) && !Collections.unmodifiableSet((Set) this.f67507x).contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public Serializable m49433l(C20611a c20611a, int i13) {
        C2725d c2725d = (C2725d) this.f67507x;
        if (c2725d.f10734x) {
            return null;
        }
        if (i13 >= 100) {
            c2725d.f10733w = true;
            return null;
        }
        try {
            switch (AbstractC20594b.f77100a[c20611a.peek().ordinal()]) {
                case 1:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
                        c20611a.beginObject();
                        while (c20611a.hasNext() && !c2725d.f10734x) {
                            linkedHashMap.put(c20611a.nextName(), m49433l(c20611a, i13 + 1));
                        }
                        c20611a.endObject();
                        return linkedHashMap;
                    } catch (Exception unused) {
                        c2725d.f10734x = true;
                        return linkedHashMap;
                    }
                case 2:
                    ArrayList arrayList = new ArrayList();
                    try {
                        c20611a.beginArray();
                        while (c20611a.hasNext() && !c2725d.f10734x) {
                            arrayList.add(m49433l(c20611a, i13 + 1));
                        }
                        c20611a.endArray();
                        return arrayList;
                    } catch (Exception unused2) {
                        c2725d.f10734x = true;
                        return arrayList;
                    }
                case 3:
                    return c20611a.nextString();
                case 4:
                    return Double.valueOf(c20611a.nextDouble());
                case 5:
                    return Boolean.valueOf(c20611a.m56748s());
                case 6:
                    c20611a.m56737J();
                    return null;
                default:
                    c2725d.f10734x = true;
                    return null;
            }
        } catch (Exception unused3) {
            c2725d.f10734x = true;
            return null;
        }
        c2725d.f10734x = true;
        return null;
    }

    /* JADX INFO: renamed from: m */
    public LinkedHashMap m49434m(C17928b c17928b) {
        C17973r c17973r;
        IdentifierSpec.Companion.getClass();
        IdentifierSpec identifierSpecM16892a = C5705a.m16892a("address");
        EnumC17971q enumC17971q = null;
        Map mapM51589p = AbstractC17960l1.m51589p(c17928b, null);
        C17975s c17975s = (C17975s) this.f67507x;
        Set set = c17975s != null ? c17975s.f69806y : AbstractC36561a.f156562a;
        AddressFieldConfiguration addressFieldConfiguration = AddressFieldConfiguration.REQUIRED;
        if (c17975s != null && (c17973r = c17975s.f69799E) != null) {
            enumC17971q = c17973r.f69796w;
        }
        Map mapM74000i0 = AbstractC25247g0.m74000i0((Iterable) ((InterfaceC4339a) ((C26318e) new C15347f(identifierSpecM16892a, mapM51589p, new C15382l(AbstractC17960l1.m51586m(enumC17971q), addressFieldConfiguration, 4), set, null, null, C25272z.f99163w, false, false, 400).mo43535e()).f104635y).invoke());
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM74000i0.size()));
        for (Map.Entry entry : mapM74000i0.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C23328a) entry.getValue()).f92491a);
        }
        return linkedHashMap;
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: n */
    public int mo15743n(int i13) {
        C23110i1 c23110i1 = (C23110i1) this.f67507x;
        if (i13 <= c23110i1.f91296b - 1) {
            return i13;
        }
        if (i13 <= c23110i1.f91297c - 1) {
            return i13 - 1;
        }
        int i14 = c23110i1.f91298d;
        return i13 <= i14 + 1 ? i13 - 2 : i14;
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: o */
    public String mo45166o() {
        return ((C21649b) this.f67507x).mo45166o();
    }

    @Override // kh.InterfaceC22473g
    /* JADX INFO: renamed from: p */
    public C22468b mo16070p(C22467a c22467a) {
        return null;
    }

    @Override // p194hg.InterfaceC17242c
    /* JADX INFO: renamed from: q */
    public Integer mo45167q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m49435r(Object obj) {
        ((ScheduledFutureC17620i) this.f67507x).m31066j(obj);
    }

    /* JADX INFO: renamed from: s */
    public void m49436s(Exception exc) {
        ((ScheduledFutureC17620i) this.f67507x).mo31067k(exc);
    }

    @Override // p194hg.InterfaceC17242c
    public void skipValue() {
        throw new DeserializationException("This should not be called during deserialization.");
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: v */
    public long mo45170v() {
        return ((C21649b) this.f67507x).mo45170v();
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: x */
    public int mo15749x(int i13) {
        C23110i1 c23110i1 = (C23110i1) this.f67507x;
        if (i13 < c23110i1.f91296b) {
            return i13;
        }
        if (i13 < c23110i1.f91297c) {
            return i13 + 1;
        }
        int i14 = c23110i1.f91298d;
        return i13 <= i14 ? i13 + 2 : i14 + 2;
    }

    public /* synthetic */ C17417d(Object obj, int i13) {
        this.f67506w = i13;
        this.f67507x = obj;
    }

    public C17417d(C15717b staticMetadata) {
        this.f67506w = 21;
        AbstractC22676k.m65750j(staticMetadata, "staticMetadata");
        this.f67507x = staticMetadata;
    }

    public C17417d(int i13) {
        this.f67506w = i13;
        switch (i13) {
            case 12:
                this.f67507x = new C2725d();
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f67507x = new C23548b(0);
                break;
            case 24:
                this.f67507x = Collections.EMPTY_SET;
                break;
        }
    }

    public C17417d(TextView textView) {
        this.f67506w = 20;
        this.f67507x = new C21362g(textView);
    }

    public C17417d(EditText editText) {
        this.f67506w = 19;
        this.f67507x = new C38445a(editText);
    }
}
