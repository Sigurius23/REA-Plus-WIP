package p249jc;

import android.text.TextUtils;
import androidx.room.AbstractC1772c1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p007a6.C0438l0;
import p218ic.AbstractC18381r0;
import p218ic.C18357f0;
import p218ic.C18389w;
import p218ic.EnumC18368l;
import p218ic.InterfaceC18355e0;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc.C32352b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jc.o */
/* JADX INFO: loaded from: classes.dex */
public final class C21589o extends AbstractC1772c1 {

    /* JADX INFO: renamed from: i */
    public static final String f82784i = C18389w.m52887f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final C21596v f82785a;

    /* JADX INFO: renamed from: b */
    public final String f82786b;

    /* JADX INFO: renamed from: c */
    public final EnumC18368l f82787c;

    /* JADX INFO: renamed from: d */
    public final List f82788d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f82789e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f82790f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f82791g;

    /* JADX INFO: renamed from: h */
    public C18357f0 f82792h;

    public C21589o(C21596v c21596v, String str, EnumC18368l enumC18368l, List list, int i13) {
        this.f82785a = c21596v;
        this.f82786b = str;
        this.f82787c = enumC18368l;
        this.f82788d = list;
        this.f82789e = new ArrayList(list.size());
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (enumC18368l == EnumC18368l.f71503w && ((AbstractC18381r0) list.get(i14)).f71548b.f123654u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((AbstractC18381r0) list.get(i14)).f71547a.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            this.f82789e.add(string);
            this.f82790f.add(string);
        }
    }

    /* JADX INFO: renamed from: V */
    public static HashSet m60633V(C21589o c21589o) {
        HashSet hashSet = new HashSet();
        c21589o.getClass();
        return hashSet;
    }

    /* JADX INFO: renamed from: U */
    public final InterfaceC18355e0 m60634U() {
        if (this.f82791g) {
            C18389w.m52886d().m52892g(f82784i, "Already enqueued work ids (" + TextUtils.join(", ", this.f82789e) + ")");
        } else {
            C21596v c21596v = this.f82785a;
            this.f82792h = AbstractC37056f.m118957I(c21596v.f82806b.f71458m, "EnqueueRunnable_" + this.f82787c.name(), ((C32352b) c21596v.f82808d).f133915a, new C0438l0(this, 25));
        }
        return this.f82792h;
    }
}
