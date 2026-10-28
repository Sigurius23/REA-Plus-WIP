package oa3;

import hb3.C17109d;
import hb3.C17119i;
import hb3.C17128q;
import java.util.Set;
import jb3.C21558r;
import jb3.C21564x;
import jb3.EnumC21549i;
import l83.C23465k;
import m83.AbstractC25260n;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import pa3.C29039b;
import pa3.EnumC29038a;
import qa3.C30134g0;
import qa3.C30145k;
import r93.InterfaceC31124g0;
import sa3.C32331e;
import ua3.C34726f;
import ua3.C34727g;
import w93.C36969b;

/* JADX INFO: renamed from: oa3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C27763f {

    /* JADX INFO: renamed from: b */
    public static final Set f111949b = AbstractC12350b.m34570S(EnumC29038a.CLASS);

    /* JADX INFO: renamed from: c */
    public static final Set f111950c = AbstractC25260n.m74059b1(new EnumC29038a[]{EnumC29038a.FILE_FACADE, EnumC29038a.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: d */
    public static final C32331e f111951d;

    /* JADX INFO: renamed from: e */
    public static final C32331e f111952e;

    /* JADX INFO: renamed from: a */
    public C17119i f111953a;

    static {
        new C32331e(new int[]{1, 1, 2}, false);
        f111951d = new C32331e(new int[]{1, 1, 11}, false);
        f111952e = new C32331e(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX INFO: renamed from: a */
    public final C21558r m83860a(InterfaceC31124g0 interfaceC31124g0, C36969b kotlinClass) {
        C23465k c23465kM109657i;
        AbstractC22676k.m65750j(kotlinClass, "kotlinClass");
        C29039b c29039b = kotlinClass.f158228b;
        String[] strArr = (String[]) c29039b.f117527f;
        if (strArr == null) {
            strArr = (String[]) c29039b.f117528g;
        }
        if (strArr != null) {
            if (!f111950c.contains((EnumC29038a) c29039b.f117525d)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            C32331e c32331e = (C32331e) c29039b.f117526e;
            String[] strArr2 = (String[]) c29039b.f117529h;
            if (strArr2 != null) {
                try {
                    try {
                        c23465kM109657i = C34727g.m109657i(strArr, strArr2);
                    } catch (InvalidProtocolBufferException e5) {
                        throw new IllegalStateException("Could not read data from " + kotlinClass.m118691a(), e5);
                    }
                } catch (Throwable th3) {
                    m83862c().f65737c.getClass();
                    if (c32331e.m100629b(m83864e())) {
                        throw th3;
                    }
                    c23465kM109657i = null;
                }
                if (c23465kM109657i != null) {
                    C34726f c34726f = (C34726f) c23465kM109657i.f92937w;
                    C30134g0 c30134g0 = (C30134g0) c23465kM109657i.f92938x;
                    m83863d(kotlinClass);
                    C27765h c27765h = new C27765h(kotlinClass, c30134g0, c34726f, m83865f(kotlinClass), m83861b(kotlinClass));
                    return new C21558r(interfaceC31124g0, c30134g0, c34726f, c32331e, c27765h, m83862c(), "scope for " + c27765h + " in " + interfaceC31124g0, C27762e.f111948w);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC21549i m83861b(C36969b c36969b) {
        m83862c().f65737c.getClass();
        int i13 = c36969b.f158228b.f117524c;
        return ((i13 & 16) == 0 || (i13 & 32) != 0) ? EnumC21549i.f82647w : EnumC21549i.f82648x;
    }

    /* JADX INFO: renamed from: c */
    public final C17119i m83862c() {
        C17119i c17119i = this.f111953a;
        if (c17119i != null) {
            return c17119i;
        }
        AbstractC22676k.m65757q("components");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final C17128q m83863d(C36969b c36969b) {
        m83862c().f65737c.getClass();
        if (((C32331e) c36969b.f158228b.f117526e).m100629b(m83864e())) {
            return null;
        }
        C32331e c32331e = (C32331e) c36969b.f158228b.f117526e;
        C32331e c32331e2 = C32331e.f133827g;
        C32331e c32331eM83864e = m83864e();
        C32331e c32331eM83864e2 = m83864e();
        boolean z4 = c32331e.f133829f;
        c32331eM83864e2.getClass();
        C32331e c32331e3 = z4 ? c32331e2 : C32331e.f133828h;
        int i13 = c32331e3.f133780b;
        int i14 = c32331eM83864e2.f133780b;
        if (i13 > i14 || (i13 >= i14 && c32331e3.f133781c > c32331eM83864e2.f133781c)) {
            c32331eM83864e2 = c32331e3;
        }
        return new C17128q(c32331e, c32331e2, c32331eM83864e, c32331eM83864e2, c36969b.m118691a());
    }

    /* JADX INFO: renamed from: e */
    public final C32331e m83864e() {
        m83862c().f65737c.getClass();
        return C32331e.f133827g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m83865f(C36969b c36969b) {
        m83862c().f65737c.getClass();
        m83862c().f65737c.getClass();
        C29039b c29039b = c36969b.f158228b;
        return (c29039b.f117524c & 2) != 0 && ((C32331e) c29039b.f117526e).equals(f111951d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX INFO: renamed from: g */
    public final C17109d m83866g(C36969b c36969b) {
        C23465k c23465kM109654f;
        C29039b c29039b = c36969b.f158228b;
        String[] strArr = (String[]) c29039b.f117527f;
        if (strArr == null) {
            strArr = (String[]) c29039b.f117528g;
        }
        if (strArr != null) {
            if (!f111949b.contains((EnumC29038a) c29039b.f117525d)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            C32331e c32331e = (C32331e) c29039b.f117526e;
            String[] strArr2 = (String[]) c29039b.f117529h;
            try {
                if (strArr2 != null) {
                    try {
                        c23465kM109654f = C34727g.m109654f(strArr, strArr2);
                        if (c23465kM109654f != null) {
                            C34726f c34726f = (C34726f) c23465kM109654f.f92937w;
                            C30145k c30145k = (C30145k) c23465kM109654f.f92938x;
                            m83863d(c36969b);
                            return new C17109d(c34726f, c30145k, c32331e, new C27774q(c36969b, new C21564x(m83865f(c36969b)), m83861b(c36969b)));
                        }
                    } catch (InvalidProtocolBufferException e5) {
                        throw new IllegalStateException("Could not read data from " + c36969b.m118691a(), e5);
                    }
                }
            } catch (Throwable th3) {
                m83862c().f65737c.getClass();
                if (c32331e.m100629b(m83864e())) {
                    throw th3;
                }
                c23465kM109654f = null;
            }
        }
        return null;
    }
}
