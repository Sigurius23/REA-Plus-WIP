package p457rc;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import ge3.AbstractC15751g;
import ht2.C17632d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p185h6.RunnableC16957l;
import p218ic.AbstractC18381r0;
import p218ic.C18348b;
import p218ic.C18389w;
import p218ic.EnumC18368l;
import p218ic.EnumC18371m0;
import p249jc.AbstractC21585k;
import p249jc.C21589o;
import p249jc.C21596v;
import p392p3.C28761b0;
import p420qc.C30191a;
import p420qc.C30193c;
import p420qc.C30201k;
import p420qc.C30202l;
import p420qc.C30205o;
import p420qc.C30207q;
import p420qc.C30208r;
import p420qc.C30211u;
import p420qc.C30213w;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q11.C29793c;

/* JADX INFO: renamed from: rc.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31218a {

    /* JADX INFO: renamed from: a */
    public static final String f128586a = C18389w.m52887f("EnqueueRunnable");

    /* JADX INFO: renamed from: a */
    public static void m96155a(C21589o c21589o) {
        boolean z4;
        C21596v c21596v = c21589o.f82785a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(c21589o.f82789e);
        HashSet hashSetM60633V = C21589o.m60633V(c21589o);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(c21589o.f82789e);
                z4 = false;
                break;
            } else if (hashSetM60633V.contains((String) it.next())) {
                z4 = true;
                break;
            }
        }
        if (z4) {
            throw new IllegalStateException("WorkContinuation has cycles (" + c21589o + ")");
        }
        WorkDatabase workDatabase = c21596v.f82807c;
        C18348b c18348b = c21596v.f82806b;
        workDatabase.beginTransaction();
        try {
            AbstractC34132o.m107883g(workDatabase, c18348b, c21589o);
            boolean zM96156b = m96156b(c21589o);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (zM96156b) {
                AbstractC21585k.m60632b(c18348b, c21596v.f82807c, c21596v.f82809e);
            }
        } catch (Throwable th3) {
            workDatabase.endTransaction();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0195  */
    /* JADX INFO: renamed from: b */
    public static boolean m96156b(C21589o c21589o) {
        boolean z4;
        boolean z13;
        boolean z14;
        List list;
        boolean z15;
        WorkDatabase workDatabase;
        boolean z16;
        boolean z17;
        boolean z18;
        HashSet hashSetM60633V = C21589o.m60633V(c21589o);
        C21596v c21596v = c21589o.f82785a;
        List list2 = c21589o.f82788d;
        String[] strArr = (String[]) hashSetM60633V.toArray(new String[0]);
        String str = c21589o.f82786b;
        EnumC18368l enumC18368l = c21589o.f82787c;
        c21596v.f82806b.f71449d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = c21596v.f82807c;
        boolean z19 = strArr != null && strArr.length > 0;
        if (z19) {
            int length = strArr.length;
            int i13 = 0;
            z13 = false;
            z14 = false;
            z4 = true;
            while (true) {
                if (i13 < length) {
                    String str2 = strArr[i13];
                    C30207q c30207qM92434e = workDatabase2.mo5521h().m92434e(str2);
                    if (c30207qM92434e == null) {
                        C18389w.m52886d().m52889b(f128586a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        EnumC18371m0 enumC18371m0 = c30207qM92434e.f123635b;
                        z4 &= enumC18371m0 == EnumC18371m0.f71517y;
                        if (enumC18371m0 == EnumC18371m0.f71518z) {
                            z14 = true;
                        } else if (enumC18371m0 == EnumC18371m0.f71513F) {
                            z13 = true;
                        }
                        i13++;
                    }
                }
                z18 = false;
                z17 = true;
                c21589o.f82791g = z17;
                return z18;
            }
        }
        z4 = true;
        z13 = false;
        z14 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z19) {
            list = list2;
            z15 = zIsEmpty;
            workDatabase = workDatabase2;
            z16 = false;
        } else {
            List listM92435f = workDatabase2.mo5521h().m92435f(str);
            if (listM92435f.isEmpty()) {
                list = list2;
                z15 = zIsEmpty;
                workDatabase = workDatabase2;
            } else if (enumC18368l == EnumC18368l.f71505y || enumC18368l == EnumC18368l.f71506z) {
                C30193c c30193cMo5515b = workDatabase2.mo5515b();
                ArrayList arrayList = new ArrayList();
                Iterator it = listM92435f.iterator();
                while (it.hasNext()) {
                    C30205o c30205o = (C30205o) it.next();
                    List list3 = list2;
                    String id4 = c30205o.f123613a;
                    c30193cMo5515b.getClass();
                    boolean z24 = zIsEmpty;
                    AbstractC22676k.m65750j(id4, "id");
                    WorkDatabase workDatabase3 = workDatabase2;
                    Iterator it3 = it;
                    if (!((Boolean) AbstractC15751g.m44432L(c30193cMo5515b.f123588a, true, false, new C17632d(id4, 25))).booleanValue()) {
                        EnumC18371m0 enumC18371m1 = c30205o.f123614b;
                        boolean z25 = (enumC18371m1 == EnumC18371m0.f71517y) & z4;
                        if (enumC18371m1 == EnumC18371m0.f71518z) {
                            z14 = true;
                        } else if (enumC18371m1 == EnumC18371m0.f71513F) {
                            z13 = true;
                        }
                        arrayList.add(c30205o.f123613a);
                        z4 = z25;
                    }
                    list2 = list3;
                    zIsEmpty = z24;
                    workDatabase2 = workDatabase3;
                    it = it3;
                }
                list = list2;
                z15 = zIsEmpty;
                workDatabase = workDatabase2;
                List list4 = arrayList;
                list4 = arrayList;
                if (enumC18368l == EnumC18368l.f71506z && (z13 || z14)) {
                    C30211u c30211uMo5521h = workDatabase.mo5521h();
                    Iterator it4 = c30211uMo5521h.m92435f(str).iterator();
                    while (it4.hasNext()) {
                        c30211uMo5521h.m92432c(((C30205o) it4.next()).f123613a);
                    }
                    z13 = false;
                    z14 = false;
                    list4 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) list4.toArray(strArr);
                z19 = strArr.length > 0;
            } else {
                if (enumC18368l == EnumC18368l.f71504x) {
                    Iterator it5 = listM92435f.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            EnumC18371m0 enumC18371m2 = ((C30205o) it5.next()).f123614b;
                            if (enumC18371m2 == EnumC18371m0.f71515w || enumC18371m2 == EnumC18371m0.f71516x) {
                                z18 = false;
                                z17 = true;
                                c21589o.f82791g = z17;
                                return z18;
                            }
                        }
                    }
                }
                AbstractC22676k.m65749i(workDatabase2, "getWorkDatabase(...)");
                workDatabase2.runInTransaction(new RunnableC16957l(workDatabase2, str, c21596v, 6));
                C30211u c30211uMo5521h2 = workDatabase2.mo5521h();
                Iterator it6 = listM92435f.iterator();
                while (it6.hasNext()) {
                    c30211uMo5521h2.m92432c(((C30205o) it6.next()).f123613a);
                }
                list = list2;
                z15 = zIsEmpty;
                workDatabase = workDatabase2;
                z16 = true;
            }
            z16 = false;
        }
        Iterator it7 = list.iterator();
        boolean z26 = z16;
        while (it7.hasNext()) {
            AbstractC18381r0 abstractC18381r0 = (AbstractC18381r0) it7.next();
            C30207q c30207q = abstractC18381r0.f71548b;
            UUID uuid = abstractC18381r0.f71547a;
            if (!z19 || z4) {
                c30207q.f123647n = jCurrentTimeMillis;
            } else if (z14) {
                c30207q.f123635b = EnumC18371m0.f71518z;
            } else if (z13) {
                c30207q.f123635b = EnumC18371m0.f71513F;
            } else {
                c30207q.f123635b = EnumC18371m0.f71512E;
            }
            if (c30207q.f123635b == EnumC18371m0.f71515w) {
                z26 = true;
            }
            C30211u c30211uMo5521h3 = workDatabase.mo5521h();
            C30207q c30207qM107876U = AbstractC34132o.m107876U(c21596v.f82809e, c30207q);
            c30211uMo5521h3.getClass();
            C21596v c21596v2 = c21596v;
            Iterator it8 = it7;
            AbstractC15751g.m44432L(c30211uMo5521h3.f123665a, false, true, new C30208r(c30211uMo5521h3, c30207qM107876U, 0));
            if (z19) {
                int i14 = 0;
                for (int length2 = strArr.length; i14 < length2; length2 = length2) {
                    String str3 = strArr[i14];
                    String[] strArr2 = strArr;
                    String string = uuid.toString();
                    AbstractC22676k.m65749i(string, "toString(...)");
                    C30191a c30191a = new C30191a(string, str3);
                    C30193c c30193cMo5515b2 = workDatabase.mo5515b();
                    c30193cMo5515b2.getClass();
                    AbstractC15751g.m44432L(c30193cMo5515b2.f123588a, false, true, new C29793c(4, c30193cMo5515b2, c30191a));
                    i14++;
                    strArr = strArr2;
                }
            }
            String[] strArr3 = strArr;
            C30213w c30213wMo5522i = workDatabase.mo5522i();
            String string2 = uuid.toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            c30213wMo5522i.m92441a(string2, abstractC18381r0.f71549c);
            if (!z15) {
                C30202l c30202lMo5519f = workDatabase.mo5519f();
                String string3 = uuid.toString();
                AbstractC22676k.m65749i(string3, "toString(...)");
                C30201k c30201k = new C30201k(str, string3);
                c30202lMo5519f.getClass();
                AbstractC15751g.m44432L(c30202lMo5519f.f123607a, false, true, new C28761b0(4, c30202lMo5519f, c30201k));
            }
            c21596v = c21596v2;
            it7 = it8;
            strArr = strArr3;
        }
        z17 = true;
        z18 = z26;
        c21589o.f82791g = z17;
        return z18;
    }
}
