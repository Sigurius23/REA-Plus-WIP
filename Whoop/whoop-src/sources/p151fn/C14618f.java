package p151fn;

import a33.C0352d;
import androidx.health.platform.client.proto.C1533u;
import ed3.C13117a;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p012ab.C0683i;
import p012ab.C0697r;
import p012ab.C0699t;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p619xl.C38445a;
import p658yr.AbstractC39717d;

/* JADX INFO: renamed from: fn.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14618f {

    /* JADX INFO: renamed from: a */
    public final int f53875a;

    /* JADX INFO: renamed from: b */
    public final List f53876b;

    public /* synthetic */ C14618f(int i13, List list) {
        this.f53875a = i13;
        this.f53876b = list;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC14638z m41819a(int i13, C0352d c0352d) {
        String str = (String) c0352d.f1237x;
        if (i13 != 2) {
            if (i13 == 3 || i13 == 4) {
                return new C14628p(new C14627o(str));
            }
            if (i13 == 21) {
                return new C14628p(new C0683i(3));
            }
            if (i13 == 27) {
                if (m41821c(4)) {
                    return null;
                }
                return new C14628p(new C0697r(new C20378c(m41820b(c0352d)), m41821c(1), m41821c(8)));
            }
            if (i13 == 36) {
                return new C14628p(new C0699t(new C20378c(m41820b(c0352d))));
            }
            if (i13 == 89) {
                return new C14628p(new C0683i((List) c0352d.f1238y, 2));
            }
            if (i13 != 138) {
                if (i13 == 172) {
                    return new C14628p(new C14614b(str, 1));
                }
                if (i13 == 257) {
                    return new C14634v(new C0352d("application/vnd.dvb.ait", 21));
                }
                if (i13 == 134) {
                    if (m41821c(16)) {
                        return null;
                    }
                    return new C14634v(new C0352d("application/x-scte35", 21));
                }
                if (i13 != 135) {
                    switch (i13) {
                        case 15:
                            if (m41821c(2)) {
                                return null;
                            }
                            return new C14628p(new C14617e(false, str));
                        case 16:
                            return new C14628p(new C14624l(new C38445a(m41820b(c0352d), 11)));
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            if (m41821c(2)) {
                                return null;
                            }
                            return new C14628p(new C14626n(str));
                        default:
                            switch (i13) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!m41821c(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new C14628p(new C14614b(str, 0));
            }
            return new C14628p(new C14619g(str));
        }
        return new C14628p(new C14622j(new C38445a(m41820b(c0352d), 11)));
    }

    /* JADX INFO: renamed from: b */
    public List m41820b(C0352d c0352d) {
        String str;
        int i13;
        boolean zM41821c = m41821c(32);
        List list = this.f53876b;
        if (zM41821c) {
            return list;
        }
        C13117a c13117a = new C13117a((byte[]) c0352d.f1239z, 1, (byte) 0);
        while (c13117a.m36692a() > 0) {
            int iM36715y = c13117a.m36715y();
            int iM36715y2 = c13117a.f45382b + c13117a.m36715y();
            if (iM36715y == 134) {
                ArrayList arrayList = new ArrayList();
                int iM36715y3 = c13117a.m36715y() & 31;
                for (int i14 = 0; i14 < iM36715y3; i14++) {
                    String strM36712v = c13117a.m36712v(3, AbstractC39717d.f170958c);
                    int iM36715y4 = c13117a.m36715y();
                    boolean z4 = (iM36715y4 & 128) != 0;
                    if (z4) {
                        i13 = iM36715y4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i13 = 1;
                    }
                    byte bM36715y = (byte) c13117a.m36715y();
                    c13117a.m36690L(1);
                    List listSingletonList = z4 ? Collections.singletonList((bM36715y & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C31518b0 c31518b0 = new C31518b0();
                    c31518b0.f130047k = str;
                    c31518b0.f130039c = strM36712v;
                    c31518b0.f130035C = i13;
                    c31518b0.f130049m = listSingletonList;
                    arrayList.add(new C31521c0(c31518b0));
                }
                list = arrayList;
            }
            c13117a.m36689K(iM36715y2);
        }
        return list;
    }

    /* JADX INFO: renamed from: c */
    public boolean m41821c(int i13) {
        return (i13 & this.f53875a) != 0;
    }
}
