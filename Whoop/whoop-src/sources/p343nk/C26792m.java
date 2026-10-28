package p343nk;

import al.AbstractC0954a;
import androidx.lifecycle.C1578e1;
import androidx.room.C1778e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import dk.C12100f;
import fk.InterfaceC14544a;
import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import p000.C11327d0;
import p007a6.C0448q;
import p023ay.C2147u;
import p173gj.C15906g;
import p255jk.C21743a;
import p282kk.C22533b;
import p371ok.C27984a;
import p371ok.C27985b;
import p371ok.C27987d;
import p371ok.C27988e;
import p371ok.C27989f;
import p371ok.C27990g;
import p371ok.EnumC27986c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;
import xb3.C38173h;
import yb3.AbstractC39414r;
import yb3.C39412p;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: nk.m */
/* JADX INFO: loaded from: classes.dex */
public final class C26792m {

    /* JADX INFO: renamed from: a */
    public final C12100f f106715a;

    /* JADX INFO: renamed from: b */
    public final C22533b f106716b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2994c0 f106717c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3076z f106718d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC14544a f106719e;

    public C26792m(C12100f c12100f, C22533b c22533b, C15906g c15906g, InterfaceC2994c0 scope, AbstractC3076z abstractC3076z, InterfaceC14544a interfaceC14544a) {
        AbstractC22676k.m65750j(scope, "scope");
        this.f106715a = c12100f;
        this.f106716b = c22533b;
        this.f106717c = scope;
        this.f106718d = abstractC3076z;
        this.f106719e = interfaceC14544a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x011b  */
    /* JADX INFO: renamed from: a */
    public Boolean m79823a(AbstractC0954a abstractC0954a, Object events, String str) throws JSONException {
        AbstractC22676k.m65750j(events, "events");
        if (abstractC0954a instanceof C27988e) {
            C27988e c27988e = (C27988e) abstractC0954a;
            AbstractC22676k.m65750j(events, "events");
            String str2 = (String) events;
            InterfaceC14544a interfaceC14544a = this.f106719e;
            if (interfaceC14544a != null) {
                interfaceC14544a.debug("Handle response, status: " + ((EnumC27986c) c27988e.f3536x));
            }
            m79825c(EnumC27986c.SUCCESS.f112883w.f71133w, "Event sent success.", AbstractC17269i.m48905n0(m79824b(str, str2)));
            AbstractC3006f0.m8732z(this.f106717c, this.f106718d, null, new C26791l(this, str2, null, 1), 2);
            return null;
        }
        if (!(abstractC0954a instanceof C27984a)) {
            if (abstractC0954a instanceof C27987d) {
                C27987d c27987d = (C27987d) abstractC0954a;
                AbstractC22676k.m65750j(events, "events");
                InterfaceC14544a interfaceC14544a2 = this.f106719e;
                if (interfaceC14544a2 != null) {
                    interfaceC14544a2.debug("Handle response, status: " + ((EnumC27986c) c27987d.f3536x) + ", error: " + c27987d.m84419H0());
                }
                String str3 = (String) events;
                JSONArray jSONArrayM79824b = m79824b(str, str3);
                int length = jSONArrayM79824b.length();
                AbstractC3076z abstractC3076z = this.f106718d;
                InterfaceC2994c0 interfaceC2994c0 = this.f106717c;
                InterfaceC30057d interfaceC30057d = null;
                if (length == 1) {
                    m79825c(EnumC27986c.PAYLOAD_TOO_LARGE.f112883w.f71133w, c27987d.m84419H0(), AbstractC17269i.m48905n0(jSONArrayM79824b));
                    AbstractC3006f0.m8732z(interfaceC2994c0, abstractC3076z, null, new C26791l(this, str3, interfaceC30057d, 0), 2);
                } else {
                    AbstractC3006f0.m8732z(interfaceC2994c0, abstractC3076z, null, new C2147u(this, str3, jSONArrayM79824b, interfaceC30057d, 14), 2);
                }
                return Boolean.TRUE;
            }
            if (abstractC0954a instanceof C27990g) {
                C27990g c27990g = (C27990g) abstractC0954a;
                AbstractC22676k.m65750j(events, "events");
                InterfaceC14544a interfaceC14544a3 = this.f106719e;
                if (interfaceC14544a3 != null) {
                    interfaceC14544a3.debug("Handle response, status: " + ((EnumC27986c) c27990g.f3536x) + ", error: " + c27990g.m84420H0());
                }
                AbstractC3006f0.m8732z(this.f106717c, this.f106718d, null, new C26790k(this, events, null, 3), 2);
                return Boolean.TRUE;
            }
            if (abstractC0954a instanceof C27989f) {
                C27989f c27989f = (C27989f) abstractC0954a;
                AbstractC22676k.m65750j(events, "events");
                InterfaceC14544a interfaceC14544a4 = this.f106719e;
                if (interfaceC14544a4 != null) {
                    interfaceC14544a4.debug("Handle response, status: " + ((EnumC27986c) c27989f.f3536x));
                }
                AbstractC3006f0.m8732z(this.f106717c, this.f106718d, null, new C26790k(this, events, null, 2), 2);
                return Boolean.TRUE;
            }
            C27985b c27985b = (C27985b) abstractC0954a;
            AbstractC22676k.m65750j(events, "events");
            InterfaceC14544a interfaceC14544a5 = this.f106719e;
            if (interfaceC14544a5 != null) {
                interfaceC14544a5.debug("Handle response, status: " + ((EnumC27986c) c27985b.f3536x) + ", error: " + c27985b.m84418H0());
            }
            AbstractC3006f0.m8732z(this.f106717c, this.f106718d, null, new C26790k(this, events, null, 1), 2);
            return Boolean.TRUE;
        }
        C27984a c27984a = (C27984a) abstractC0954a;
        String str4 = c27984a.f112873y;
        AbstractC22676k.m65750j(events, "events");
        InterfaceC14544a interfaceC14544a6 = this.f106719e;
        if (interfaceC14544a6 != null) {
            interfaceC14544a6.debug("Handle response, status: " + ((EnumC27986c) c27984a.f3536x) + ", error: " + str4);
        }
        String str5 = (String) events;
        ArrayList arrayListM48905n0 = AbstractC17269i.m48905n0(m79824b(str, str5));
        String lowerCase = str4.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean z4 = false;
        boolean zM125876U = AbstractC39414r.m125876U(lowerCase, "invalid api key", false);
        AbstractC3076z abstractC3076z2 = this.f106718d;
        InterfaceC2994c0 interfaceC2994c1 = this.f106717c;
        InterfaceC30057d interfaceC30057d2 = null;
        if (zM125876U) {
            m79825c(EnumC27986c.BAD_REQUEST.f112883w.f71133w, str4, arrayListM48905n0);
            AbstractC3006f0.m8732z(interfaceC2994c1, abstractC3076z2, null, new C0448q(this, str5, interfaceC30057d2, 10), 2);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(c27984a.f112874z);
            linkedHashSet.addAll(c27984a.f112870E);
            linkedHashSet.addAll(c27984a.f112871F);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            for (Object obj : arrayListM48905n0) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C21743a event = (C21743a) obj;
                if (linkedHashSet.contains(Integer.valueOf(i13))) {
                    arrayList.add(event);
                } else {
                    AbstractC22676k.m65750j(event, "event");
                    String str6 = event.f83630b;
                    if (str6 != null ? c27984a.f112872G.contains(str6) : false) {
                        arrayList.add(event);
                    } else {
                        arrayList2.add(event);
                    }
                }
                i13 = i14;
            }
            if (arrayList.isEmpty()) {
                AbstractC3006f0.m8732z(interfaceC2994c1, abstractC3076z2, null, new C26790k(this, events, interfaceC30057d2, 0), 2);
                z4 = true;
            } else {
                m79825c(EnumC27986c.BAD_REQUEST.f112883w.f71133w, str4, arrayList);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.f106716b.m65128a((C21743a) it.next());
                }
                AbstractC3006f0.m8732z(interfaceC2994c1, abstractC3076z2, null, new C11327d0(this, str5, arrayList, arrayList2, null, 4), 2);
                z4 = false;
            }
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m79824b(String str, String str2) throws JSONException {
        try {
            return new JSONArray(str);
        } catch (JSONException e5) {
            InterfaceC30057d interfaceC30057d = null;
            C26791l c26791l = new C26791l(this, str2, interfaceC30057d, 2);
            InterfaceC2994c0 interfaceC2994c0 = this.f106717c;
            AbstractC3076z abstractC3076z = this.f106718d;
            AbstractC3006f0.m8732z(interfaceC2994c0, abstractC3076z, null, c26791l, 2);
            C38173h c38173h = new C38173h(C39412p.m125847b(str, new C39412p("\"insert_id\":\"(.{36})\",")));
            while (c38173h.hasNext()) {
                AbstractC3006f0.m8732z(interfaceC2994c0, abstractC3076z, null, new C1778e(this, (InterfaceC39407k) c38173h.next(), interfaceC30057d, 28), 2);
            }
            throw e5;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m79825c(int i13, String str, ArrayList arrayList) {
        int i14;
        String str2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21743a c21743a = (C21743a) it.next();
            String str3 = c21743a.f83634f;
            if (str3 != null) {
                i14 = i13;
                str2 = str;
                AbstractC3006f0.m8732z(this.f106717c, this.f106718d, null, new C1578e1(this, str3, c21743a, i14, str2, (InterfaceC30057d) null), 2);
            } else {
                i14 = i13;
                str2 = str;
            }
            i13 = i14;
            str = str2;
        }
    }
}
