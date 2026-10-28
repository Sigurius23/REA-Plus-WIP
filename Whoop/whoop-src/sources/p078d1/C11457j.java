package p078d1;

import a20.C0162b;
import a53.C0402a;
import ai.C0896b;
import ai.C0897c;
import ai.C0901g;
import ai.C0902h;
import ai.C0904j;
import ai.InterfaceC0905k;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.NotificationManagerCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.recyclerview.widget.C1741u2;
import androidx.room.AbstractC1772c1;
import as1.C1949j;
import b20.C2326f;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import bs1.C3595n;
import c93.InterfaceC4339a;
import ca3.C4384k;
import ca3.InterfaceC4385l;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.datepicker.C5020n;
import com.squareup.moshi.JsonAdapter;
import com.whoop.android.R;
import e10.C12568r0;
import e33.C12659u;
import ed3.C13117a;
import g40.InterfaceC15318a0;
import g40.InterfaceC15452z;
import i20.C17966n1;
import i20.C17988y0;
import io.getstream.android.video.generated.models.VideoEvent;
import io.getstream.video.android.model.StreamCallId;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23470p;
import l83.EnumC23463i;
import lg3.AbstractC24060v;
import lg3.EnumC24061w;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import n30.C26212c;
import n33.C26243q;
import n53.C26318e;
import ne3.C26622k;
import ne3.C26624l;
import o30.C27507e;
import o30.C27508f;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import p002a0.AbstractC0065z0;
import p002a0.C0039m0;
import p002a0.C0049r0;
import p003a1.C0103b;
import p026b2.C2298d;
import p026b2.C2320z;
import p048ce.AbstractC4482w;
import p073cq.C11052u;
import p073cq.InterfaceC11039h;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p119ej.C13225b;
import p133f1.C13968p1;
import p151fn.C14629q;
import p151fn.C14630r;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17250k;
import p194hg.C17251l;
import p194hg.InterfaceC17243d;
import p194hg.InterfaceC17247h;
import p194hg.InterfaceC17253n;
import p20.C28747i;
import p219ig.C18457b;
import p219ig.C18458c;
import p219ig.C18459d;
import p219ig.C18460e;
import p284ko.C22629m;
import p284ko.C22634r;
import p284ko.InterfaceC22613d0;
import p284ko.InterfaceC22626k;
import p284ko.InterfaceC22628l;
import p309lo.AbstractC24567y;
import p309lo.C24566x;
import p319m4.AbstractC25012a;
import p337n8.C26444a;
import p389p0.C28506a0;
import p390p1.C28626i2;
import p390p1.InterfaceC28601c1;
import p410q1.InterfaceC29773k0;
import p441qx.C30722l0;
import p461rh.InterfaceC31421j;
import p588wm.C37361c;
import p588wm.InterfaceC37362d;
import p588wm.InterfaceC37368j;
import p589wn.AbstractC37406n;
import p599wz.C37751r0;
import p631xz.C38721f0;
import p635y2.C39143w1;
import p635y2.InterfaceC39146x1;
import p647yf.C39498k;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.C30065l;
import q83.InterfaceC30063j;
import s00.C32038a;
import se.AbstractC32417h;
import sr.C32894b;
import sr.C32903k;
import sr.C32906n;
import t23.C33366b4;
import t23.C33403i3;
import t23.C33450s0;
import t23.InterfaceC33408j3;
import tg.C33775g;
import x43.AbstractC37984p;
import x43.C37983o;
import x43.InterfaceC37973e;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: d1.j */
/* JADX INFO: loaded from: classes5.dex */
public class C11457j implements InterfaceC37973e, InterfaceC0905k, RTCStatsCollectorCallback, InterfaceC37362d, InterfaceC15452z, InterfaceC17253n, InterfaceC17247h, InterfaceC22626k, InterfaceC39146x1, InterfaceC29773k0, InterfaceC22613d0, InterfaceC11039h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36752w;

    /* JADX INFO: renamed from: x */
    public Object f36753x;

    /* JADX INFO: renamed from: y */
    public Object f36754y;

    public /* synthetic */ C11457j(int i13, Object obj, Object obj2) {
        this.f36752w = i13;
        this.f36753x = obj;
        this.f36754y = obj2;
    }

    /* JADX INFO: renamed from: A */
    public Object m30731A(float f13, float f14, Object obj, Object obj2, float f15, float f16, float f17) {
        C13225b c13225b = (C13225b) this.f36753x;
        c13225b.f45831a = f13;
        c13225b.f45832b = f14;
        c13225b.f45833c = obj;
        c13225b.f45834d = obj2;
        c13225b.f45835e = f15;
        c13225b.f45836f = f16;
        c13225b.f45837g = f17;
        return mo30755z(c13225b);
    }

    /* JADX INFO: renamed from: B */
    public void m30732B(C17248i c17248i, Function1 function1) throws IOException {
        String str = ((String) this.f36754y) + AbstractC12314q.m34332l(c17248i);
        Set set = c17248i.f66268c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!(((InterfaceC17243d) obj) instanceof C18458c)) {
                arrayList.add(obj);
            }
        }
        Set setM74101H1 = AbstractC25265s.m74101H1(arrayList);
        setM74101H1.add(new C18458c(str));
        C18457b c18457b = new C18457b((C18459d) this.f36753x, new C17248i(c17248i.f66266a, setM74101H1));
        function1.invoke(c18457b);
        C39498k c39498k = c18457b.f71879x;
        long j7 = c39498k.f169914w.f105866x;
        if (j7 == c18457b.f71880y) {
            if (j7 > 0) {
                c39498k.mo126148z(1, "&");
            }
            String strM34332l = AbstractC12314q.m34332l(c18457b.f71878w);
            c39498k.mo126148z(strM34332l.length(), strM34332l);
            c39498k.mo126148z(1, "=");
        }
    }

    /* JADX INFO: renamed from: C */
    public void m30733C(int i13, Notification notification, StreamCallId streamCallId) {
        AbstractC22676k.m65750j(streamCallId, "streamCallId");
        AbstractC22676k.m65750j(notification, "notification");
        C2345k c2345k = (C2345k) ((C23470p) this.f36754y).getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345k.f9273a)) {
            c2345k.f9274b.log(enumC2341g, c2345k.f9273a, AbstractC25012a.m73374g(i13, "[notify] callId: ", streamCallId.getId(), ", notificationId: "), null);
        }
        InterfaceC33408j3.f139483t.getClass();
        InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
        if (interfaceC33408j3 != null) {
            C33450s0 c33450s0 = ((C33366b4) interfaceC33408j3).m105796n(streamCallId.getType(), streamCallId.getId()).f139302p;
            if (c33450s0 != null) {
                c33450s0.m105867i(i13, notification);
            }
        }
        ((NotificationManagerCompat) this.f36753x).notify(i13, notification);
    }

    /* JADX INFO: renamed from: D */
    public void m30734D(int i13, int i14) {
        int[] iArr = (int[]) this.f36753x;
        if (iArr == null || i13 >= iArr.length) {
            return;
        }
        int i15 = i13 + i14;
        m30750u(i15);
        int[] iArr2 = (int[]) this.f36753x;
        System.arraycopy(iArr2, i13, iArr2, i15, (iArr2.length - i13) - i14);
        Arrays.fill((int[]) this.f36753x, i13, i15, -1);
        ArrayList arrayList = (ArrayList) this.f36754y;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1741u2 c1741u2 = (C1741u2) ((ArrayList) this.f36754y).get(size);
            int i16 = c1741u2.f6883w;
            if (i16 >= i13) {
                c1741u2.f6883w = i16 + i14;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m30735E(int i13, int i14) {
        int[] iArr = (int[]) this.f36753x;
        if (iArr == null || i13 >= iArr.length) {
            return;
        }
        int i15 = i13 + i14;
        m30750u(i15);
        int[] iArr2 = (int[]) this.f36753x;
        System.arraycopy(iArr2, i15, iArr2, i13, (iArr2.length - i13) - i14);
        int[] iArr3 = (int[]) this.f36753x;
        Arrays.fill(iArr3, iArr3.length - i14, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f36754y;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1741u2 c1741u2 = (C1741u2) ((ArrayList) this.f36754y).get(size);
            int i16 = c1741u2.f6883w;
            if (i16 >= i13) {
                if (i16 < i15) {
                    ((ArrayList) this.f36754y).remove(size);
                } else {
                    c1741u2.f6883w = i16 - i14;
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m30736F(String value) {
        AbstractC22676k.m65750j(value, "value");
        C39498k c39498k = ((C18459d) this.f36753x).f71883w;
        String strMo106776a = C33775g.f141362l.mo106776a(value);
        c39498k.mo126148z(strMo106776a.length(), strMo106776a);
    }

    /* JADX INFO: renamed from: G */
    public String m30737G(Object any) {
        AbstractC22676k.m65750j(any, "any");
        if (Map.class.isAssignableFrom(any.getClass())) {
            String json = ((JsonAdapter) this.f36754y).toJson((Map) any);
            AbstractC22676k.m65749i(json, "toJson(...)");
            return json;
        }
        Object value = ((C23470p) this.f36753x).getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        String json2 = ((C30722l0) value).m94398a(any.getClass()).toJson(any);
        AbstractC22676k.m65749i(json2, "toJson(...)");
        return json2;
    }

    /* JADX INFO: renamed from: H */
    public void m30738H(C17248i c17248i, InterfaceC4339a interfaceC4339a) throws IOException {
        String str = (String) this.f36754y;
        C39498k c39498k = ((C18459d) this.f36753x).f71883w;
        if (c39498k.f169914w.f105866x > 0) {
            c39498k.mo126148z(1, "&");
        }
        if (!AbstractC39414r.m125890i0(str)) {
            c39498k.mo126148z(str.length(), str);
        }
        String strM34332l = AbstractC12314q.m34332l(c17248i);
        c39498k.mo126148z(strM34332l.length(), strM34332l);
        c39498k.mo126148z(1, "=");
        interfaceC4339a.invoke();
    }

    @Override // p194hg.InterfaceC17253n
    /* JADX INFO: renamed from: a */
    public void mo30739a(C17248i c17248i, String value) throws IOException {
        AbstractC22676k.m65750j(value, "value");
        String str = (String) this.f36754y;
        C39498k c39498k = ((C18459d) this.f36753x).f71883w;
        if (c39498k.f169914w.f105866x > 0) {
            c39498k.mo126148z(1, "&");
        }
        if (!AbstractC39414r.m125890i0(str)) {
            c39498k.mo126148z(str.length(), str);
        }
        String strM34332l = AbstractC12314q.m34332l(c17248i);
        c39498k.mo126148z(strM34332l.length(), strM34332l);
        c39498k.mo126148z(1, "=");
        m30736F(value);
    }

    @Override // p635y2.InterfaceC39146x1
    /* JADX INFO: renamed from: b */
    public void mo30740b(C39143w1 c39143w1) {
        C0039m0 c0039m0 = (C0039m0) this.f36754y;
        c0039m0.m88a();
        C0049r0 c0049r0 = c39143w1.f168293w;
        Object[] objArr = c0049r0.f141b;
        long[] jArr = c0049r0.f142c;
        int i13 = c0049r0.f144e;
        while (i13 != Integer.MAX_VALUE) {
            int i14 = (int) ((jArr[i13] >> 31) & 2147483647L);
            Object obj = objArr[i13];
            Object objM86819b = ((C28506a0) this.f36753x).m86819b(obj);
            int iM91d = c0039m0.m91d(objM86819b);
            int i15 = iM91d >= 0 ? c0039m0.f116c[iM91d] : 0;
            if (i15 == 7) {
                c39143w1.remove(obj);
            } else {
                c0039m0.m95h(objM86819b, i15 + 1);
            }
            i13 = i14;
        }
    }

    @Override // p284ko.InterfaceC22613d0
    /* JADX INFO: renamed from: c */
    public AbstractC37406n mo30741c(Uri uri, C22629m c22629m) {
        AbstractC37406n abstractC37406nMo30741c = ((InterfaceC22613d0) this.f36753x).mo30741c(uri, c22629m);
        List list = (List) this.f36754y;
        return (list == null || list.isEmpty()) ? abstractC37406nMo30741c : (AbstractC37406n) abstractC37406nMo30741c.mo119754a(list);
    }

    @Override // ai.InterfaceC0905k
    public void clear() {
        switch (this.f36752w) {
            case 3:
                ((C0902h) this.f36754y).m2213u(-1L);
                break;
            default:
                int[] iArr = (int[]) this.f36753x;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f36754y = null;
                break;
        }
    }

    @Override // g40.InterfaceC15452z
    public InterfaceC15318a0 create() {
        return new C17966n1((C17988y0) this.f36753x, (C13968p1) this.f36754y);
    }

    @Override // p284ko.InterfaceC22626k
    public InterfaceC22628l createDataSource() {
        return new C22634r((Context) this.f36753x, ((C5020n) this.f36754y).createDataSource());
    }

    @Override // p588wm.InterfaceC37362d
    /* JADX INFO: renamed from: d */
    public void mo30742d() {
        C13117a c13117a = (C13117a) this.f36754y;
        byte[] bArr = AbstractC24567y.f95880f;
        c13117a.getClass();
        c13117a.m36687I(bArr.length, bArr);
    }

    @Override // p410q1.InterfaceC29773k0
    /* JADX INFO: renamed from: f */
    public List mo402f(Integer num) {
        List listMo402f = ((InterfaceC29773k0) this.f36753x).mo402f(null);
        C28626i2 c28626i2 = (C28626i2) this.f36754y;
        int i13 = c28626i2.f115802v;
        return i13 < 0 ? listMo402f : AbstractC25265s.m74129g1(AbstractC4482w.m14010t(c28626i2, num, i13, Integer.valueOf(c28626i2.m87039D(c28626i2.f115782b, i13))), listMo402f);
    }

    @Override // ai.InterfaceC0905k
    /* JADX INFO: renamed from: g */
    public void mo2229g(C0896b c0896b, InterfaceC31421j interfaceC31421j, Map map, long j7) {
        C0902h c0902h = (C0902h) this.f36754y;
        long j13 = c0902h.f3295x;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0902h.f3297z;
        if (j7 > j13) {
            Object objRemove = linkedHashMap.remove(c0896b);
            if (objRemove != null) {
                c0902h.f3296y = c0902h.m2208p() - c0902h.m2211s(c0896b, objRemove);
                c0902h.m2207o(c0896b, objRemove, null);
            }
            ((C0904j) this.f36753x).m2228o(c0896b, interfaceC31421j, map, j7);
            return;
        }
        C0901g c0901g = new C0901g(interfaceC31421j, map, j7);
        Object objPut = linkedHashMap.put(c0896b, c0901g);
        c0902h.f3296y = c0902h.m2211s(c0896b, c0901g) + c0902h.m2208p();
        if (objPut != null) {
            c0902h.f3296y = c0902h.m2208p() - c0902h.m2211s(c0896b, objPut);
            c0902h.m2207o(c0896b, objPut, c0901g);
        }
        c0902h.m2213u(c0902h.f3295x);
    }

    @Override // ai.InterfaceC0905k
    public long getSize() {
        return ((C0902h) this.f36754y).m2208p();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    @Override // p588wm.InterfaceC37362d
    /* JADX INFO: renamed from: h */
    public C37361c mo30743h(InterfaceC37368j interfaceC37368j, long j7) {
        int iM41828f;
        long position = interfaceC37368j.getPosition();
        int iMin = (int) Math.min(20000L, interfaceC37368j.getLength() - position);
        C13117a c13117a = (C13117a) this.f36754y;
        c13117a.m36686H(iMin);
        interfaceC37368j.mo3103p(c13117a.f45381a, 0, iMin);
        int i13 = -1;
        int i14 = -1;
        long j13 = -9223372036854775807L;
        while (c13117a.m36692a() >= 4) {
            if (C14629q.m41828f(c13117a.f45382b, c13117a.f45381a) != 442) {
                c13117a.m36690L(1);
            } else {
                c13117a.m36690L(4);
                long jM41830c = C14630r.m41830c(c13117a);
                if (jM41830c != -9223372036854775807L) {
                    long jM71660b = ((C24566x) this.f36753x).m71660b(jM41830c);
                    if (jM71660b > j7) {
                        return j13 == -9223372036854775807L ? new C37361c(-1, jM71660b, position) : new C37361c(0, -9223372036854775807L, position + ((long) i14));
                    }
                    if (jM71660b + 100000 > j7) {
                        return new C37361c(0, -9223372036854775807L, position + ((long) c13117a.f45382b));
                    }
                    j13 = jM71660b;
                    i14 = c13117a.f45382b;
                }
                int i15 = c13117a.f45383c;
                if (c13117a.m36692a() >= 10) {
                    c13117a.m36690L(9);
                    int iM36715y = c13117a.m36715y() & 7;
                    if (c13117a.m36692a() >= iM36715y) {
                        c13117a.m36690L(iM36715y);
                        if (c13117a.m36692a() >= 4) {
                            if (C14629q.m41828f(c13117a.f45382b, c13117a.f45381a) != 443) {
                                while (c13117a.m36692a() >= 4) {
                                    iM41828f = C14629q.m41828f(c13117a.f45382b, c13117a.f45381a);
                                    if (iM41828f == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            c13117a.m36690L(4);
                            int iM36682D = c13117a.m36682D();
                            if (c13117a.m36692a() < iM36682D) {
                                c13117a.m36689K(i15);
                            } else {
                                c13117a.m36690L(iM36682D);
                                while (c13117a.m36692a() >= 4) {
                                    iM41828f = C14629q.m41828f(c13117a.f45382b, c13117a.f45381a);
                                    if (iM41828f == 442 || iM41828f == 441 || (iM41828f >>> 8) != 1) {
                                        break;
                                    }
                                    c13117a.m36690L(4);
                                    if (c13117a.m36692a() < 2) {
                                        c13117a.m36689K(i15);
                                        break;
                                    }
                                    c13117a.m36689K(Math.min(c13117a.f45383c, c13117a.f45382b + c13117a.m36682D()));
                                }
                            }
                        } else {
                            c13117a.m36689K(i15);
                        }
                    } else {
                        c13117a.m36689K(i15);
                    }
                } else {
                    c13117a.m36689K(i15);
                }
                i13 = c13117a.f45382b;
            }
        }
        return j13 != -9223372036854775807L ? new C37361c(-2, j13, position + ((long) i13)) : C37361c.f159836d;
    }

    @Override // p073cq.InterfaceC11039h
    /* JADX INFO: renamed from: i */
    public C11052u mo8623i(Object obj) {
        C32894b c32894b = (C32894b) this.f36753x;
        return Tasks.m15640d(new C32903k(c32894b.f137096b, ((C32906n) this.f36754y).f137126a, ((Long) obj).longValue()));
    }

    @Override // ai.InterfaceC0905k
    /* JADX INFO: renamed from: k */
    public C0897c mo2230k(C0896b c0896b) {
        C0901g c0901g = (C0901g) ((LinkedHashMap) ((C0902h) this.f36754y).f3297z).get(c0896b);
        if (c0901g != null) {
            return new C0897c(c0901g.f3290a, c0901g.f3291b);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [c93.m, kotlin.jvm.internal.i] */
    @Override // p194hg.InterfaceC17253n
    /* JADX INFO: renamed from: l */
    public void mo30744l(C17248i c17248i, C17250k c17250k) {
        c17250k.f66271b.invoke(new C18459d(((C18459d) this.f36753x).f71883w, ((String) this.f36754y) + AbstractC12314q.m34332l(c17248i) + '.'), c17250k.f66270a);
    }

    @Override // ai.InterfaceC0905k
    /* JADX INFO: renamed from: m */
    public void mo2231m(long j7) {
        ((C0902h) this.f36754y).m2213u(j7);
    }

    @Override // p635y2.InterfaceC39146x1
    /* JADX INFO: renamed from: n */
    public boolean mo30745n(Object obj, Object obj2) {
        C28506a0 c28506a0 = (C28506a0) this.f36753x;
        return AbstractC22676k.m65745e(c28506a0.m86819b(obj), c28506a0.m86819b(obj2));
    }

    @Override // p194hg.InterfaceC17253n
    /* JADX INFO: renamed from: o */
    public void mo30746o() {
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        C26243q c26243q;
        C12659u c12659u = (C12659u) this.f36753x;
        C30065l c30065l = (C30065l) this.f36754y;
        if (rTCStatsReport != null) {
            try {
                c26243q = new C26243q(rTCStatsReport, AbstractC12313p.m34284e0(rTCStatsReport));
            } catch (Throwable th3) {
                C2345k c2345kM35417f = c12659u.m35417f();
                InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
                String str = c2345kM35417f.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM35417f.f9274b.log(enumC2341g, str, "[getStats] #sfu; #" + c12659u.f43277q + "; failed: " + th3, th3);
                }
                c30065l.resumeWith(null);
                return;
            }
        } else {
            c26243q = null;
        }
        c30065l.resumeWith(c26243q);
    }

    @Override // x43.InterfaceC37973e
    /* JADX INFO: renamed from: q */
    public C26624l mo30747q(Object obj) {
        VideoEvent event = (VideoEvent) obj;
        AbstractC22676k.m65750j(event, "event");
        String strM30737G = m30737G(event);
        C26622k c26622k = C26624l.f105882z;
        return C26622k.m79242c(-1234567890, AbstractC39421y.m125919D(strM30737G));
    }

    @Override // p194hg.InterfaceC17253n
    /* JADX INFO: renamed from: r */
    public void mo30748r(C17248i c17248i, boolean z4) throws IOException {
        String str = (String) this.f36754y;
        C18459d c18459d = (C18459d) this.f36753x;
        C39498k c39498k = c18459d.f71883w;
        if (c39498k.f169914w.f105866x > 0) {
            c39498k.mo126148z(1, "&");
        }
        if (!AbstractC39414r.m125890i0(str)) {
            c39498k.mo126148z(str.length(), str);
        }
        String strM34332l = AbstractC12314q.m34332l(c17248i);
        c39498k.mo126148z(strM34332l.length(), strM34332l);
        c39498k.mo126148z(1, "=");
        String strValueOf = String.valueOf(z4);
        C39498k c39498k2 = c18459d.f71883w;
        String strMo106776a = C33775g.f141362l.mo106776a(strValueOf);
        c39498k2.mo126148z(strMo106776a.length(), strMo106776a);
    }

    @Override // x43.InterfaceC37973e
    /* JADX INFO: renamed from: s */
    public AbstractC26205h mo30749s(byte[] raw) {
        C26204g c26204g;
        AbstractC22676k.m65750j(raw, "raw");
        Charset charset = AbstractC39397a.f169546a;
        String str = new String(raw, charset);
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, "Video:VideoParser")) {
            C2343i.f9271c.log(enumC2341g, "Video:VideoParser", "[decode] raw: ".concat(new String(raw, charset)), null);
        }
        AbstractC26205h abstractC26205hM30751v = m30751v(str, VideoEvent.class);
        if (abstractC26205hM30751v instanceof C26204g) {
            abstractC26205hM30751v = new C26204g(new C37983o((VideoEvent) ((C26204g) abstractC26205hM30751v).f103919a));
        } else if (!(abstractC26205hM30751v instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        C2320z c2320z = new C2320z(26, this, str);
        AbstractC22676k.m65750j(abstractC26205hM30751v, "<this>");
        if (abstractC26205hM30751v instanceof C26204g) {
            c26204g = (C26204g) abstractC26205hM30751v;
        } else {
            if (!(abstractC26205hM30751v instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            c26204g = new C26204g(c2320z.invoke(((C26203f) abstractC26205hM30751v).f103918a));
        }
        return new C26204g((AbstractC37984p) c26204g.f103919a);
    }

    @Override // ai.InterfaceC0905k
    /* JADX INFO: renamed from: t */
    public boolean mo2232t(C0896b c0896b) {
        C0902h c0902h = (C0902h) this.f36754y;
        Object objRemove = ((LinkedHashMap) c0902h.f3297z).remove(c0896b);
        if (objRemove != null) {
            c0902h.f3296y = c0902h.m2208p() - c0902h.m2211s(c0896b, objRemove);
            c0902h.m2207o(c0896b, objRemove, null);
        }
        return objRemove != null;
    }

    public String toString() {
        switch (this.f36752w) {
            case 2:
                return (String) this.f36753x;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m30750u(int i13) {
        int[] iArr = (int[]) this.f36753x;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i13, 10) + 1];
            this.f36753x = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int length = iArr.length;
            while (length <= i13) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f36753x = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f36753x;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: v */
    public AbstractC26205h m30751v(String str, Class cls) {
        try {
            Object value = ((C23470p) this.f36753x).getValue();
            AbstractC22676k.m65749i(value, "getValue(...)");
            Object objFromJson = ((C30722l0) value).m94398a(cls).fromJson(str);
            AbstractC22676k.m65747g(objFromJson);
            return new C26204g(objFromJson);
        } catch (Throwable th3) {
            return new C26203f(new C26201d("fromJsonOrError error parsing of " + cls + " into " + str, th3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX INFO: renamed from: w */
    public CctBackendFactory m30752w(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f36754y) == null) {
            Context context = (Context) this.f36753x;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f36754y = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f36754y = map;
        }
        String str4 = (String) ((Map) this.f36754y).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e5) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e5);
            return null;
        } catch (IllegalAccessException e13) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e13);
            return null;
        } catch (InstantiationException e14) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e14);
            return null;
        } catch (NoSuchMethodException e15) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e15);
            return null;
        } catch (InvocationTargetException e16) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e16);
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public ArrayList m30753x() {
        return (ArrayList) this.f36754y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: y */
    public InputMethodManager m30754y() {
        return (InputMethodManager) this.f36754y.getValue();
    }

    /* JADX INFO: renamed from: z */
    public Object mo30755z(C13225b c13225b) {
        return this.f36754y;
    }

    public /* synthetic */ C11457j(int i13, boolean z4) {
        this.f36752w = i13;
    }

    public C11457j(InterfaceC4339a dismissKeyboard, InterfaceC28601c1 isKeyboardVisible) {
        this.f36752w = 22;
        AbstractC22676k.m65750j(dismissKeyboard, "dismissKeyboard");
        AbstractC22676k.m65750j(isKeyboardVisible, "isKeyboardVisible");
        this.f36753x = dismissKeyboard;
        this.f36754y = isKeyboardVisible;
    }

    public C11457j(NotificationManagerCompat notificationManagerCompat) {
        this.f36752w = 12;
        this.f36753x = notificationManagerCompat;
        this.f36754y = AbstractC1772c1.m5382S(this, "DefaultNotificationDispatcher");
    }

    public C11457j(InterfaceC30063j ioDispatcher) {
        this.f36752w = 6;
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        this.f36753x = new C3595n(24);
        this.f36754y = ioDispatcher;
    }

    public C11457j(C27508f c27508f, C26212c c26212c) {
        this.f36752w = 24;
        C27507e c27507e = new C27507e(c26212c);
        this.f36753x = c27508f;
        this.f36754y = c27507e;
    }

    public C11457j(Object obj) {
        this.f36752w = 11;
        this.f36753x = new C13225b();
        this.f36754y = obj;
    }

    public C11457j(int i13) {
        this.f36752w = i13;
        switch (i13) {
            case 11:
                this.f36753x = new C13225b();
                this.f36754y = null;
                break;
            default:
                C23470p c23470pM92088H = AbstractC30060g.m92088H(new C0402a(0));
                this.f36753x = c23470pM92088H;
                Object value = c23470pM92088H.getValue();
                AbstractC22676k.m65749i(value, "getValue(...)");
                this.f36754y = ((C30722l0) value).m94398a(Map.class);
                break;
        }
    }

    public C11457j(C17988y0 launcher, C13968p1 c13968p1) {
        this.f36752w = 16;
        AbstractC22676k.m65750j(launcher, "launcher");
        this.f36753x = launcher;
        this.f36754y = c13968p1;
    }

    public C11457j(long j7, C0904j c0904j) {
        this.f36752w = 3;
        this.f36753x = c0904j;
        this.f36754y = new C0902h(j7, this);
    }

    public C11457j(View view) {
        this.f36752w = 0;
        this.f36753x = view;
        this.f36754y = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C11456i(this, 0));
    }

    public C11457j(C24566x c24566x) {
        this.f36752w = 13;
        this.f36753x = c24566x;
        this.f36754y = new C13117a();
    }

    public C11457j(C18459d c18459d, C17249j c17249j, String prefix) throws IOException {
        this.f36752w = 17;
        AbstractC22676k.m65750j(prefix, "prefix");
        this.f36753x = c18459d;
        this.f36754y = prefix;
        Set<InterfaceC17243d> set = c17249j.f66268c;
        ArrayList<C18460e> arrayList = new ArrayList();
        for (InterfaceC17243d interfaceC17243d : set) {
            C18460e c18460e = interfaceC17243d instanceof C18460e ? (C18460e) interfaceC17243d : null;
            if (c18460e != null) {
                arrayList.add(c18460e);
            }
        }
        for (C18460e c18460e2 : arrayList) {
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c(c18460e2.f71885a)}), 0);
            String str = (String) this.f36754y;
            C39498k c39498k = ((C18459d) this.f36753x).f71883w;
            if (c39498k.f169914w.f105866x > 0) {
                c39498k.mo126148z(1, "&");
            }
            if (!AbstractC39414r.m125890i0(str)) {
                c39498k.mo126148z(str.length(), str);
            }
            String strM34332l = AbstractC12314q.m34332l(c17248i);
            c39498k.mo126148z(strM34332l.length(), strM34332l);
            c39498k.mo126148z(1, "=");
            m30736F(c18460e2.f71886b);
        }
    }

    public C11457j(Context context, int i13) {
        this.f36752w = i13;
        switch (i13) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                this.f36753x = AbstractC32417h.m101213v(context, Integer.valueOf(R.raw.call_incoming_sound));
                this.f36754y = AbstractC32417h.m101213v(context, Integer.valueOf(R.raw.call_outgoing_sound));
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C5020n c5020n = new C5020n();
                this.f36753x = context.getApplicationContext();
                this.f36754y = c5020n;
                break;
            default:
                this.f36754y = null;
                this.f36753x = context;
                break;
        }
    }

    public C11457j(C26318e c26318e, C12568r0 confirmationHandler, C26444a c26444a, C2326f c2326f, C32038a linkInlineInteractor, C37751r0 c37751r0, C38721f0 linkAccountHolder, C28747i analyticsCallbackProvider, C0103b c0103b) {
        this.f36752w = 5;
        AbstractC22676k.m65750j(confirmationHandler, "confirmationHandler");
        AbstractC22676k.m65750j(linkInlineInteractor, "linkInlineInteractor");
        AbstractC22676k.m65750j(linkAccountHolder, "linkAccountHolder");
        AbstractC22676k.m65750j(analyticsCallbackProvider, "analyticsCallbackProvider");
        this.f36753x = c26318e;
        this.f36754y = linkInlineInteractor;
        AbstractC3006f0.m8732z(c26444a, null, null, new C0162b(this, null, 7), 3);
        AbstractC3269g.m9510q(c26318e, confirmationHandler.f42923k, linkInlineInteractor.f132913e, linkAccountHolder.f166664b, new C1949j(this, 1));
    }

    public C11457j(C28506a0 c28506a0) {
        this.f36752w = 25;
        this.f36753x = c28506a0;
        C0039m0 c0039m0 = AbstractC0065z0.f204a;
        this.f36754y = new C0039m0();
    }

    public C11457j(Map map) {
        this.f36752w = 20;
        this.f36753x = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (EnumC24061w enumC24061w : map.keySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry : ((Map) map.get(enumC24061w)).entrySet()) {
                Object value = entry.getValue();
                Object value2 = entry.getValue();
                Object key = entry.getKey();
                C2298d c2298d = AbstractC24060v.f95082a;
                map3.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, AbstractC24060v.f95082a);
            map2.put(enumC24061w, arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, AbstractC24060v.f95082a);
        this.f36754y = map2;
    }

    public C11457j(String name) {
        this.f36752w = 2;
        AbstractC22676k.m65750j(name, "name");
        this.f36753x = name;
        this.f36754y = new ArrayList(0);
        InterfaceC4385l.f17711a.getClass();
        List listM13764a = C4384k.m13764a();
        new ArrayList();
        Iterator it = listM13764a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4385l) it.next()).getClass();
        }
    }
}
