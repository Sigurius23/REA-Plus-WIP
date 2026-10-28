package p299l9;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p141f9.C14278t;
import p249jc.C21567b;
import p499t9.C33640l;
import p499t9.C33650s;
import p516u8.AbstractC34587d0;
import p516u8.C34581a0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34616s;
import p516u8.C34618t;
import p516u8.C34620u;
import p516u8.C34622v;
import p516u8.C34624w;
import p516u8.C34625w0;
import p516u8.C34626x;
import p607x8.AbstractC38065t;
import p674z8.InterfaceC40169e;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C23519p implements InterfaceC23485b0 {

    /* JADX INFO: renamed from: a */
    public final C23517o f93084a;

    /* JADX INFO: renamed from: b */
    public InterfaceC40169e f93085b;

    /* JADX INFO: renamed from: c */
    public C21567b f93086c;

    /* JADX INFO: renamed from: d */
    public final long f93087d;

    /* JADX INFO: renamed from: e */
    public final long f93088e;

    /* JADX INFO: renamed from: f */
    public final long f93089f;

    /* JADX INFO: renamed from: g */
    public final float f93090g;

    /* JADX INFO: renamed from: h */
    public final float f93091h;

    /* JADX INFO: renamed from: i */
    public boolean f93092i;

    public C23519p(InterfaceC40169e interfaceC40169e) {
        this(interfaceC40169e, new C33640l());
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC23485b0 m68091e(Class cls, InterfaceC40169e interfaceC40169e) {
        try {
            return (InterfaceC23485b0) cls.getConstructor(InterfaceC40169e.class).newInstance(interfaceC40169e);
        } catch (Exception e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: a */
    public final void mo5055a(C21567b c21567b) {
        this.f93086c = c21567b;
        C23517o c23517o = this.f93084a;
        c23517o.f93082f = c21567b;
        C33640l c33640l = (C33640l) c23517o.f93078b;
        synchronized (c33640l) {
            c33640l.f140416z = c21567b;
        }
        Iterator it = ((HashMap) c23517o.f93080d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC23485b0) it.next()).mo5055a(c21567b);
        }
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: b */
    public final AbstractC23481a mo5056b(C34626x c34626x) {
        C34626x c34626x2;
        List list;
        Uri uri;
        String str;
        long j7;
        c34626x.f145867b.getClass();
        String scheme = c34626x.f145867b.f145852a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c34626x.f145867b.f145853b, "application/x-image-uri")) {
            long j13 = c34626x.f145867b.f145856e;
            int i13 = AbstractC38065t.f163031a;
            throw null;
        }
        C34620u c34620u = c34626x.f145867b;
        int iM121890D = AbstractC38065t.m121890D(c34620u.f145852a, c34620u.f145853b);
        if (c34626x.f145867b.f145856e != -9223372036854775807L) {
            C33640l c33640l = (C33640l) this.f93084a.f93078b;
            synchronized (c33640l) {
                c33640l.f140412E = 1;
            }
        }
        try {
            C23517o c23517o = this.f93084a;
            HashMap map = (HashMap) c23517o.f93080d;
            InterfaceC23485b0 interfaceC23485b0 = (InterfaceC23485b0) map.get(Integer.valueOf(iM121890D));
            if (interfaceC23485b0 == null) {
                interfaceC23485b0 = (InterfaceC23485b0) c23517o.m68090a(iM121890D).get();
                interfaceC23485b0.mo5055a((C21567b) c23517o.f93082f);
                interfaceC23485b0.mo5058d(c23517o.f93077a);
                interfaceC23485b0.mo5057c();
                map.put(Integer.valueOf(iM121890D), interfaceC23485b0);
            }
            C14278t c14278tM109415a = c34626x.f145868c.m109415a();
            C34618t c34618t = c34626x.f145868c;
            if (c34618t.f145827a == -9223372036854775807L) {
                c14278tM109415a.f52132a = this.f93087d;
            }
            if (c34618t.f145830d == -3.4028235E38f) {
                c14278tM109415a.f52135d = this.f93090g;
            }
            if (c34618t.f145831e == -3.4028235E38f) {
                c14278tM109415a.f52136e = this.f93091h;
            }
            if (c34618t.f145828b == -9223372036854775807L) {
                c14278tM109415a.f52133b = this.f93088e;
            }
            if (c34618t.f145829c == -9223372036854775807L) {
                c14278tM109415a.f52134c = this.f93089f;
            }
            C34618t c34618t2 = new C34618t(c14278tM109415a);
            if (c34618t2.equals(c34626x.f145868c)) {
                c34626x2 = c34626x;
            } else {
                new C34625w0();
                List list2 = Collections.EMPTY_LIST;
                AbstractC41023g0 abstractC41023g0 = C41060w0.f177067E;
                C34622v c34622v = C34622v.f145862a;
                C34616s c34616s = c34626x.f145870e;
                C33650s c33650s = new C33650s();
                c33650s.f140436a = c34616s.f145805a;
                String str2 = c34626x.f145866a;
                C34581a0 c34581a0 = c34626x.f145869d;
                c34626x.f145868c.m109415a();
                C34622v c34622v2 = c34626x.f145871f;
                C34620u c34620u2 = c34626x.f145867b;
                if (c34620u2 != null) {
                    String str3 = c34620u2.f145853b;
                    Uri uri2 = c34620u2.f145852a;
                    List list3 = c34620u2.f145854c;
                    abstractC41023g0 = c34620u2.f145855d;
                    new C34625w0();
                    str = str3;
                    uri = uri2;
                    list = list3;
                    j7 = c34620u2.f145856e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j7 = -9223372036854775807L;
                }
                AbstractC41023g0 abstractC41023g1 = abstractC41023g0;
                C14278t c14278tM109415a2 = c34618t2.m109415a();
                C34620u c34620u3 = uri != null ? new C34620u(uri, str, null, list, abstractC41023g1, j7) : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = str2;
                C34616s c34616s2 = new C34616s(c33650s);
                C34618t c34618t3 = new C34618t(c14278tM109415a2);
                if (c34581a0 == null) {
                    c34581a0 = C34581a0.f145608B;
                }
                c34626x2 = new C34626x(str4, c34616s2, c34620u3, c34618t3, c34581a0, c34622v2);
            }
            AbstractC23481a abstractC23481aMo5056b = interfaceC23485b0.mo5056b(c34626x2);
            AbstractC41023g0 abstractC41023g2 = c34626x2.f145867b.f145855d;
            if (!abstractC41023g2.isEmpty()) {
                AbstractC23481a[] abstractC23481aArr = new AbstractC23481a[abstractC41023g2.size() + 1];
                abstractC23481aArr[0] = abstractC23481aMo5056b;
                if (abstractC41023g2.size() > 0) {
                    if (!this.f93092i) {
                        this.f93085b.getClass();
                        C34624w c34624w = (C34624w) abstractC41023g2.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                        C41060w0 c41060w0 = C41060w0.f177067E;
                        List list4 = Collections.EMPTY_LIST;
                        C41060w0 c41060w1 = C41060w0.f177067E;
                        C34622v c34622v3 = C34622v.f145862a;
                        Uri uri3 = Uri.EMPTY;
                        c34624w.getClass();
                        throw null;
                    }
                    C34608o c34608o = new C34608o();
                    ((C34624w) abstractC41023g2.get(0)).getClass();
                    ArrayList arrayList = AbstractC34587d0.f145645a;
                    c34608o.f145741m = null;
                    ((C34624w) abstractC41023g2.get(0)).getClass();
                    c34608o.f145732d = null;
                    ((C34624w) abstractC41023g2.get(0)).getClass();
                    c34608o.f145733e = 0;
                    ((C34624w) abstractC41023g2.get(0)).getClass();
                    c34608o.f145734f = 0;
                    ((C34624w) abstractC41023g2.get(0)).getClass();
                    c34608o.f145730b = null;
                    ((C34624w) abstractC41023g2.get(0)).getClass();
                    c34608o.f145729a = null;
                    C34610p c34610p = new C34610p(c34608o);
                    if (this.f93086c.mo60610g(c34610p)) {
                        C34608o c34608oM109410a = c34610p.m109410a();
                        c34608oM109410a.f145741m = AbstractC34587d0.m109382o("application/x-media3-cues");
                        c34608oM109410a.f145738j = c34610p.f145783n;
                        c34608oM109410a.f145725I = this.f93086c.mo60612i(c34610p);
                        new C34610p(c34608oM109410a);
                    }
                    ((C34624w) abstractC41023g2.get(0)).getClass();
                    throw null;
                }
                abstractC23481aMo5056b = new C23514m0(abstractC23481aArr);
            }
            C34616s c34616s3 = c34626x2.f145870e;
            if (c34616s3.f145805a != Long.MIN_VALUE) {
                C23490d c23490d = new C23490d(abstractC23481aMo5056b);
                AbstractC35849g.m113807i(!c23490d.f92987d);
                long j14 = c34616s3.f145805a;
                AbstractC35849g.m113807i(!c23490d.f92987d);
                c23490d.f92985b = j14;
                AbstractC35849g.m113807i(!c23490d.f92987d);
                c23490d.f92986c = true;
                AbstractC35849g.m113807i(!c23490d.f92987d);
                AbstractC35849g.m113807i(!c23490d.f92987d);
                c23490d.f92987d = true;
                abstractC23481aMo5056b = new C23496f(c23490d);
            }
            c34626x2.f145867b.getClass();
            c34626x2.f145867b.getClass();
            return abstractC23481aMo5056b;
        } catch (ClassNotFoundException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: c */
    public final void mo5057c() {
        C23517o c23517o = this.f93084a;
        c23517o.getClass();
        synchronized (((C33640l) c23517o.f93078b)) {
        }
    }

    @Override // p299l9.InterfaceC23485b0
    /* JADX INFO: renamed from: d */
    public final void mo5058d(boolean z4) {
        this.f93092i = z4;
        C23517o c23517o = this.f93084a;
        c23517o.f93077a = z4;
        C33640l c33640l = (C33640l) c23517o.f93078b;
        synchronized (c33640l) {
            c33640l.f140415y = z4;
        }
        Iterator it = ((HashMap) c23517o.f93080d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC23485b0) it.next()).mo5058d(z4);
        }
    }

    public C23519p(InterfaceC40169e interfaceC40169e, C33640l c33640l) {
        this.f93085b = interfaceC40169e;
        C21567b c21567b = new C21567b(19);
        this.f93086c = c21567b;
        C23517o c23517o = new C23517o(c33640l, c21567b);
        this.f93084a = c23517o;
        if (interfaceC40169e != ((InterfaceC40169e) c23517o.f93081e)) {
            c23517o.f93081e = interfaceC40169e;
            ((HashMap) c23517o.f93079c).clear();
            ((HashMap) c23517o.f93080d).clear();
        }
        this.f93087d = -9223372036854775807L;
        this.f93088e = -9223372036854775807L;
        this.f93089f = -9223372036854775807L;
        this.f93090g = -3.4028235E38f;
        this.f93091h = -3.4028235E38f;
        this.f93092i = true;
    }
}
