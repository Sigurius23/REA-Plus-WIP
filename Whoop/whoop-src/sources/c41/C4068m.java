package c41;

import androidx.room.AbstractC1772c1;
import androidx.work.impl.WorkDatabase;
import c93.InterfaceC4339a;
import com.whoop.navigation.C9598e;
import e61.C12764g;
import ge3.AbstractC15751g;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p218ic.AbstractC18381r0;
import p218ic.C18348b;
import p218ic.EnumC18368l;
import p218ic.EnumC18371m0;
import p218ic.EnumC18375o0;
import p249jc.AbstractC21585k;
import p249jc.C21577g;
import p249jc.C21589o;
import p249jc.C21596v;
import p249jc.InterfaceC21581i;
import p31.AbstractC28795f;
import p319m4.AbstractC25012a;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p420qc.C30204n;
import p420qc.C30205o;
import p420qc.C30207q;
import p420qc.C30208r;
import p420qc.C30211u;
import p420qc.C30213w;
import p457rc.AbstractC31218a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p741vn1.C36213q;
import ud3.C34797a;
import ud3.C34804c0;
import ud3.C34825l;
import um1.AbstractC35086d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c41.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4068m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16531w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f16532x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f16533y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f16534z;

    public /* synthetic */ C4068m(Object obj, Object obj2, Object obj3, int i13) {
        this.f16531w = i13;
        this.f16532x = obj;
        this.f16533y = obj2;
        this.f16534z = obj3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        final boolean z4;
        switch (this.f16531w) {
            case 0:
                return AbstractC4075n.m12506k((AbstractC4145x) this.f16532x, (C9598e) this.f16533y, (Function1) this.f16534z);
            case 1:
                C21596v c21596v = (C21596v) this.f16532x;
                String str = (String) this.f16533y;
                AbstractC18381r0 abstractC18381r0 = (AbstractC18381r0) this.f16534z;
                C30211u c30211uMo5521h = c21596v.f82807c.mo5521h();
                List listM92435f = c30211uMo5521h.m92435f(str);
                if (listM92435f.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                C30205o c30205o = (C30205o) AbstractC25265s.m74100H0(listM92435f);
                if (c30205o == null) {
                    AbstractC31218a.m96155a(new C21589o(c21596v, str, EnumC18368l.f71504x, AbstractC37056f.m118958J(abstractC18381r0), 0));
                } else {
                    String str2 = c30205o.f123613a;
                    C30207q c30207qM92434e = c30211uMo5521h.m92434e(str2);
                    if (c30207qM92434e == null) {
                        throw new IllegalStateException(AbstractC2875y.m8300m("WorkSpec with ", str2, ", that matches a name \"", str, "\", wasn't found"));
                    }
                    if (!c30207qM92434e.m92426c()) {
                        throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    }
                    if (c30205o.f123614b == EnumC18371m0.f71513F) {
                        c30211uMo5521h.m92432c(str2);
                        AbstractC31218a.m96155a(new C21589o(c21596v, str, EnumC18368l.f71504x, AbstractC37056f.m118958J(abstractC18381r0), 0));
                    } else {
                        final C30207q c30207qM92424b = C30207q.m92424b(abstractC18381r0.f71548b, c30205o.f123613a, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        C21577g c21577g = c21596v.f82810f;
                        AbstractC22676k.m65749i(c21577g, "getProcessor(...)");
                        final WorkDatabase workDatabase = c21596v.f82807c;
                        AbstractC22676k.m65749i(workDatabase, "getWorkDatabase(...)");
                        C18348b c18348b = c21596v.f82806b;
                        AbstractC22676k.m65749i(c18348b, "<get-configuration>(...)");
                        final List list = c21596v.f82809e;
                        AbstractC22676k.m65749i(list, "getSchedulers(...)");
                        final Set set = abstractC18381r0.f71549c;
                        final String str3 = c30207qM92424b.f123634a;
                        final C30207q c30207qM92434e2 = workDatabase.mo5521h().m92434e(str3);
                        if (c30207qM92434e2 == null) {
                            throw new IllegalArgumentException(AbstractC11895b.m31996o("Worker with ", str3, " doesn't exist"));
                        }
                        if (c30207qM92434e2.f123635b.m52871a()) {
                            EnumC18375o0[] enumC18375o0Arr = EnumC18375o0.f71535w;
                        } else {
                            if (c30207qM92434e2.m92426c() ^ c30207qM92424b.m92426c()) {
                                StringBuilder sb4 = new StringBuilder("Can't update ");
                                sb4.append(c30207qM92434e2.m92426c() ? "Periodic" : "OneTime");
                                sb4.append(" Worker to ");
                                throw new UnsupportedOperationException(AbstractC25012a.m73376i(c30207qM92424b.m92426c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type.", sb4));
                            }
                            synchronized (c21577g.f82749k) {
                                z4 = c21577g.m60621c(str3) != null;
                                break;
                            }
                            if (!z4) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC21581i) it.next()).mo60623a(str3);
                                }
                            }
                            workDatabase.runInTransaction(new Runnable() { // from class: jc.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WorkDatabase workDatabase2 = workDatabase;
                                    C30211u c30211uMo5521h2 = workDatabase2.mo5521h();
                                    C30213w c30213wMo5522i = workDatabase2.mo5522i();
                                    C30207q c30207q = c30207qM92434e2;
                                    EnumC18371m0 enumC18371m0 = c30207q.f123635b;
                                    int i13 = c30207q.f123644k;
                                    long j7 = c30207q.f123647n;
                                    int i14 = c30207q.f123653t + 1;
                                    int i15 = c30207q.f123652s;
                                    long j13 = c30207q.f123654u;
                                    int i16 = c30207q.f123655v;
                                    C30207q c30207q2 = c30207qM92424b;
                                    C30207q c30207qM92424b2 = C30207q.m92424b(c30207q2, null, enumC18371m0, null, null, i13, j7, i15, i14, j13, i16, 29613053);
                                    if (c30207q2.f123655v == 1) {
                                        c30207qM92424b2.f123654u = c30207q2.f123654u;
                                        c30207qM92424b2.f123655v++;
                                    }
                                    C30207q c30207qM107876U = AbstractC34132o.m107876U(list, c30207qM92424b2);
                                    c30211uMo5521h2.getClass();
                                    AbstractC15751g.m44432L(c30211uMo5521h2.f123665a, false, true, new C30208r(c30211uMo5521h2, c30207qM107876U, 1));
                                    c30213wMo5522i.getClass();
                                    String id4 = str3;
                                    AbstractC22676k.m65750j(id4, "id");
                                    AbstractC15751g.m44432L(c30213wMo5522i.f123670a, false, true, new C12764g(id4, 19));
                                    c30213wMo5522i.m92441a(id4, set);
                                    if (z4) {
                                        return;
                                    }
                                    c30211uMo5521h2.m92436g(-1L, id4);
                                    C30204n c30204nMo5520g = workDatabase2.mo5520g();
                                    c30204nMo5520g.getClass();
                                    AbstractC15751g.m44432L(c30204nMo5520g.f123611a, false, true, new C12764g(id4, 8));
                                }
                            });
                            if (!z4) {
                                AbstractC21585k.m60632b(c18348b, workDatabase, list);
                            }
                            EnumC18375o0[] enumC18375o0Arr2 = EnumC18375o0.f71535w;
                        }
                    }
                }
                return C23454a0.f92919a;
            case 2:
                return AbstractC28795f.m87548D((Function1) this.f16534z, (Function1) this.f16532x, (InterfaceC28601c1) this.f16533y);
            case 3:
                return AbstractC35086d.m110970z((C36213q) this.f16532x, (Function1) this.f16534z, (InterfaceC28670t2) this.f16533y);
            default:
                C34825l c34825l = (C34825l) this.f16532x;
                C34804c0 c34804c0 = (C34804c0) this.f16533y;
                C34797a c34797a = (C34797a) this.f16534z;
                AbstractC1772c1 abstractC1772c1 = c34825l.f146640b;
                AbstractC22676k.m65747g(abstractC1772c1);
                return abstractC1772c1.mo5411h(c34797a.f146519h.f146565d, c34804c0.m109862a());
        }
    }

    public /* synthetic */ C4068m(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1) {
        this.f16531w = 2;
        this.f16534z = function1;
        this.f16532x = function2;
        this.f16533y = interfaceC28601c1;
    }

    public /* synthetic */ C4068m(C36213q c36213q, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f16531w = 3;
        this.f16532x = c36213q;
        this.f16534z = function1;
        this.f16533y = interfaceC28601c1;
    }
}
