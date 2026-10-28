package androidx.health.platform.client.proto;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.v2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1541v2 {

    /* JADX INFO: renamed from: a */
    public static final Class f6122a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC1452d3 f6123b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1452d3 f6124c;

    /* JADX INFO: renamed from: d */
    public static final C1462f3 f6125d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.health.platform.client.proto.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f6122a = cls;
        f6123b = m4914v(false);
        f6124c = m4914v(true);
        f6125d = new C1462f3();
    }

    /* JADX INFO: renamed from: A */
    public static void m4877A(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                double dDoubleValue = ((Double) list.get(i14)).doubleValue();
                c1483k.getClass();
                c1483k.m4669K(i13, Double.doubleToRawLongBits(dDoubleValue));
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Double) list.get(i16)).getClass();
            Logger logger = C1483k.f6056g;
            i15 += 8;
        }
        c1483k.m4674P(i15);
        while (i14 < list.size()) {
            c1483k.m4670L(Double.doubleToRawLongBits(((Double) list.get(i14)).doubleValue()));
            i14++;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m4878B(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c1483k.m4673O(i13, 0);
                c1483k.m4671M(iIntValue);
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int iM4654A = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM4654A += C1483k.m4654A(((Integer) list.get(i15)).intValue());
        }
        c1483k.m4674P(iM4654A);
        for (int i16 = 0; i16 < list.size(); i16++) {
            c1483k.m4671M(((Integer) list.get(i16)).intValue());
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m4879C(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1483k.m4667I(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = C1483k.f6056g;
            i15 += 4;
        }
        c1483k.m4674P(i15);
        while (i14 < list.size()) {
            c1483k.m4668J(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m4880D(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1483k.m4669K(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = C1483k.f6056g;
            i15 += 8;
        }
        c1483k.m4674P(i15);
        while (i14 < list.size()) {
            c1483k.m4670L(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m4881E(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                float fFloatValue = ((Float) list.get(i14)).floatValue();
                c1483k.getClass();
                c1483k.m4667I(i13, Float.floatToRawIntBits(fFloatValue));
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Float) list.get(i16)).getClass();
            Logger logger = C1483k.f6056g;
            i15 += 4;
        }
        c1483k.m4674P(i15);
        while (i14 < list.size()) {
            c1483k.m4668J(Float.floatToRawIntBits(((Float) list.get(i14)).floatValue()));
            i14++;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m4882F(int i13, List list, C1465g1 c1465g1, InterfaceC1536u2 interfaceC1536u2) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1465g1.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            c1465g1.m4625b(i13, list.get(i14), interfaceC1536u2);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m4883G(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c1483k.m4673O(i13, 0);
                c1483k.m4671M(iIntValue);
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int iM4654A = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM4654A += C1483k.m4654A(((Integer) list.get(i15)).intValue());
        }
        c1483k.m4674P(iM4654A);
        for (int i16 = 0; i16 < list.size(); i16++) {
            c1483k.m4671M(((Integer) list.get(i16)).intValue());
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m4884H(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1483k.m4675Q(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int iM4658E = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM4658E += C1483k.m4658E(((Long) list.get(i15)).longValue());
        }
        c1483k.m4674P(iM4658E);
        while (i14 < list.size()) {
            c1483k.m4676R(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m4885I(int i13, List list, C1465g1 c1465g1, InterfaceC1536u2 interfaceC1536u2) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1465g1.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            c1465g1.m4626c(i13, list.get(i14), interfaceC1536u2);
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m4886J(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1483k.m4667I(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Integer) list.get(i16)).getClass();
            Logger logger = C1483k.f6056g;
            i15 += 4;
        }
        c1483k.m4674P(i15);
        while (i14 < list.size()) {
            c1483k.m4668J(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m4887K(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1483k.m4669K(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Long) list.get(i16)).getClass();
            Logger logger = C1483k.f6056g;
            i15 += 8;
        }
        c1483k.m4674P(i15);
        while (i14 < list.size()) {
            c1483k.m4670L(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m4888L(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c1483k.m4673O(i13, 0);
                c1483k.m4674P((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int iM4657D = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int iIntValue2 = ((Integer) list.get(i15)).intValue();
            iM4657D += C1483k.m4657D((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1483k.m4674P(iM4657D);
        for (int i16 = 0; i16 < list.size(); i16++) {
            int iIntValue3 = ((Integer) list.get(i16)).intValue();
            c1483k.m4674P((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m4889M(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                long jLongValue = ((Long) list.get(i14)).longValue();
                c1483k.m4675Q(i13, (jLongValue >> 63) ^ (jLongValue << 1));
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int iM4658E = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            long jLongValue2 = ((Long) list.get(i15)).longValue();
            iM4658E += C1483k.m4658E((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1483k.m4674P(iM4658E);
        while (i14 < list.size()) {
            long jLongValue3 = ((Long) list.get(i14)).longValue();
            c1483k.m4676R((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i14++;
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m4890N(int i13, List list, C1465g1 c1465g1) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!(list instanceof InterfaceC1435a1)) {
            while (i14 < list.size()) {
                String str = (String) list.get(i14);
                c1483k.m4673O(i13, 2);
                c1483k.m4672N(str);
                i14++;
            }
            return;
        }
        InterfaceC1435a1 interfaceC1435a1 = (InterfaceC1435a1) list;
        while (i14 < list.size()) {
            Object objMo4568x = interfaceC1435a1.mo4568x(i14);
            if (objMo4568x instanceof String) {
                c1483k.m4673O(i13, 2);
                c1483k.m4672N((String) objMo4568x);
            } else {
                c1483k.m4673O(i13, 2);
                c1483k.m4666H((C1468h) objMo4568x);
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m4891O(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                c1483k.m4673O(i13, 0);
                c1483k.m4674P(iIntValue);
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int iM4657D = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM4657D += C1483k.m4657D(((Integer) list.get(i15)).intValue());
        }
        c1483k.m4674P(iM4657D);
        for (int i16 = 0; i16 < list.size(); i16++) {
            c1483k.m4674P(((Integer) list.get(i16)).intValue());
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m4892P(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        int i14 = 0;
        if (!z4) {
            while (i14 < list.size()) {
                c1483k.m4675Q(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int iM4658E = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iM4658E += C1483k.m4658E(((Long) list.get(i15)).longValue());
        }
        c1483k.m4674P(iM4658E);
        while (i14 < list.size()) {
            c1483k.m4676R(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4893a(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4656C = C1483k.m4656C(i13) * size;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iM4656C += C1483k.m4660w((C1468h) list.get(i14));
        }
        return iM4656C;
    }

    /* JADX INFO: renamed from: b */
    public static int m4894b(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1483k.m4656C(i13) * size) + m4895c(list);
    }

    /* JADX INFO: renamed from: c */
    public static int m4895c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1539v0) {
            AbstractC1539v0 abstractC1539v0 = (AbstractC1539v0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1539v0.m4876d(0);
            throw null;
        }
        int iM4654A = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM4654A += C1483k.m4654A(((Integer) list.get(i13)).intValue());
        }
        return iM4654A;
    }

    /* JADX INFO: renamed from: d */
    public static int m4896d(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1483k.m4661x(i13) * size;
    }

    /* JADX INFO: renamed from: e */
    public static int m4897e(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m4898f(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1483k.m4662y(i13) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m4899g(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m4900h(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1483k.m4656C(i13) * size) + m4901i(list);
    }

    /* JADX INFO: renamed from: i */
    public static int m4901i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1539v0) {
            AbstractC1539v0 abstractC1539v0 = (AbstractC1539v0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1539v0.m4876d(0);
            throw null;
        }
        int iM4654A = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM4654A += C1483k.m4654A(((Integer) list.get(i13)).intValue());
        }
        return iM4654A;
    }

    /* JADX INFO: renamed from: j */
    public static int m4902j(int i13, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C1483k.m4656C(i13) * list.size()) + m4903k(list);
    }

    /* JADX INFO: renamed from: k */
    public static int m4903k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1455e1) {
            AbstractC1455e1 abstractC1455e1 = (AbstractC1455e1) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1455e1.m4595d(0);
            throw null;
        }
        int iM4658E = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM4658E += C1483k.m4658E(((Long) list.get(i13)).longValue());
        }
        return iM4658E;
    }

    /* JADX INFO: renamed from: l */
    public static int m4904l(int i13, List list, InterfaceC1536u2 interfaceC1536u2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4656C = C1483k.m4656C(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            int iMo4563b = ((AbstractC1433a) list.get(i14)).mo4563b(interfaceC1536u2);
            iM4656C += C1483k.m4657D(iMo4563b) + iMo4563b;
        }
        return iM4656C;
    }

    /* JADX INFO: renamed from: m */
    public static int m4905m(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1483k.m4656C(i13) * size) + m4906n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m4906n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1539v0) {
            AbstractC1539v0 abstractC1539v0 = (AbstractC1539v0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1539v0.m4876d(0);
            throw null;
        }
        int iM4657D = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = ((Integer) list.get(i13)).intValue();
            iM4657D += C1483k.m4657D((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM4657D;
    }

    /* JADX INFO: renamed from: o */
    public static int m4907o(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1483k.m4656C(i13) * size) + m4908p(list);
    }

    /* JADX INFO: renamed from: p */
    public static int m4908p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1455e1) {
            AbstractC1455e1 abstractC1455e1 = (AbstractC1455e1) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1455e1.m4595d(0);
            throw null;
        }
        int iM4658E = 0;
        for (int i13 = 0; i13 < size; i13++) {
            long jLongValue = ((Long) list.get(i13)).longValue();
            iM4658E += C1483k.m4658E((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM4658E;
    }

    /* JADX INFO: renamed from: q */
    public static int m4909q(int i13, List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int iM4656C = C1483k.m4656C(i13) * size;
        if (!(list instanceof InterfaceC1435a1)) {
            while (i14 < size) {
                Object obj = list.get(i14);
                if (obj instanceof C1468h) {
                    int size2 = ((C1468h) obj).size();
                    iM4656C = C1483k.m4657D(size2) + size2 + iM4656C;
                } else {
                    iM4656C = C1483k.m4655B((String) obj) + iM4656C;
                }
                i14++;
            }
            return iM4656C;
        }
        InterfaceC1435a1 interfaceC1435a1 = (InterfaceC1435a1) list;
        while (i14 < size) {
            Object objMo4568x = interfaceC1435a1.mo4568x(i14);
            if (objMo4568x instanceof C1468h) {
                int size3 = ((C1468h) objMo4568x).size();
                iM4656C = C1483k.m4657D(size3) + size3 + iM4656C;
            } else {
                iM4656C = C1483k.m4655B((String) objMo4568x) + iM4656C;
            }
            i14++;
        }
        return iM4656C;
    }

    /* JADX INFO: renamed from: r */
    public static int m4910r(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1483k.m4656C(i13) * size) + m4911s(list);
    }

    /* JADX INFO: renamed from: s */
    public static int m4911s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1539v0) {
            AbstractC1539v0 abstractC1539v0 = (AbstractC1539v0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1539v0.m4876d(0);
            throw null;
        }
        int iM4657D = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM4657D += C1483k.m4657D(((Integer) list.get(i13)).intValue());
        }
        return iM4657D;
    }

    /* JADX INFO: renamed from: t */
    public static int m4912t(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1483k.m4656C(i13) * size) + m4913u(list);
    }

    /* JADX INFO: renamed from: u */
    public static int m4913u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1455e1) {
            AbstractC1455e1 abstractC1455e1 = (AbstractC1455e1) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1455e1.m4595d(0);
            throw null;
        }
        int iM4658E = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iM4658E += C1483k.m4658E(((Long) list.get(i13)).longValue());
        }
        return iM4658E;
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC1452d3 m4914v(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.health.platform.client.proto.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (AbstractC1452d3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w */
    public static void m4915w(AbstractC1452d3 abstractC1452d3, Object obj, Object obj2) {
        ((C1462f3) abstractC1452d3).getClass();
        AbstractC1534u0 abstractC1534u0 = (AbstractC1534u0) obj;
        C1457e3 c1457e3 = abstractC1534u0.unknownFields;
        C1457e3 c1457e4 = ((AbstractC1534u0) obj2).unknownFields;
        C1457e3 c1457e5 = C1457e3.f6031f;
        if (!c1457e5.equals(c1457e4)) {
            if (c1457e5.equals(c1457e3)) {
                int i13 = c1457e3.f6032a + c1457e4.f6032a;
                int[] iArrCopyOf = Arrays.copyOf(c1457e3.f6033b, i13);
                System.arraycopy(c1457e4.f6033b, 0, iArrCopyOf, c1457e3.f6032a, c1457e4.f6032a);
                Object[] objArrCopyOf = Arrays.copyOf(c1457e3.f6034c, i13);
                System.arraycopy(c1457e4.f6034c, 0, objArrCopyOf, c1457e3.f6032a, c1457e4.f6032a);
                c1457e3 = new C1457e3(i13, iArrCopyOf, objArrCopyOf, true);
            } else {
                c1457e3.getClass();
                if (!c1457e4.equals(c1457e5)) {
                    if (!c1457e3.f6036e) {
                        throw new UnsupportedOperationException();
                    }
                    int i14 = c1457e3.f6032a + c1457e4.f6032a;
                    c1457e3.m4603a(i14);
                    System.arraycopy(c1457e4.f6033b, 0, c1457e3.f6033b, c1457e3.f6032a, c1457e4.f6032a);
                    System.arraycopy(c1457e4.f6034c, 0, c1457e3.f6034c, c1457e3.f6032a, c1457e4.f6032a);
                    c1457e3.f6032a = i14;
                }
            }
        }
        abstractC1534u0.unknownFields = c1457e3;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m4916x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static void m4917y(int i13, List list, C1465g1 c1465g1, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        if (!z4) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                boolean zBooleanValue = ((Boolean) list.get(i14)).booleanValue();
                c1483k.m4673O(i13, 0);
                c1483k.m4664F(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c1483k.m4673O(i13, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            ((Boolean) list.get(i16)).getClass();
            Logger logger = C1483k.f6056g;
            i15++;
        }
        c1483k.m4674P(i15);
        for (int i17 = 0; i17 < list.size(); i17++) {
            c1483k.m4664F(((Boolean) list.get(i17)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m4918z(int i13, List list, C1465g1 c1465g1) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1465g1.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            C1483k c1483k = (C1483k) c1465g1.f6042a;
            C1468h c1468h = (C1468h) list.get(i14);
            c1483k.m4673O(i13, 2);
            c1483k.m4666H(c1468h);
        }
    }
}
