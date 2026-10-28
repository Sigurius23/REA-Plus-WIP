package si;

import android.graphics.Path;
import dj.AbstractC12062g;
import io.sentry.C20318e2;
import java.util.ArrayList;
import java.util.List;
import p078d1.C11457j;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p502ti.C33830m;
import p502ti.InterfaceC33818a;
import p584wi.C37305e;
import p649yi.C39560o;
import p682zi.AbstractC40652b;

/* JADX INFO: renamed from: si.r */
/* JADX INFO: loaded from: classes.dex */
public final class C32532r implements InterfaceC32527m, InterfaceC33818a, InterfaceC32525k {

    /* JADX INFO: renamed from: b */
    public final String f134823b;

    /* JADX INFO: renamed from: c */
    public final boolean f134824c;

    /* JADX INFO: renamed from: d */
    public final C30402w f134825d;

    /* JADX INFO: renamed from: e */
    public final C33830m f134826e;

    /* JADX INFO: renamed from: f */
    public boolean f134827f;

    /* JADX INFO: renamed from: a */
    public final Path f134822a = new Path();

    /* JADX INFO: renamed from: g */
    public final C20318e2 f134828g = new C20318e2(2);

    public C32532r(C30402w c30402w, AbstractC40652b abstractC40652b, C39560o c39560o) {
        this.f134823b = c39560o.f170195a;
        this.f134824c = c39560o.f170198d;
        this.f134825d = c30402w;
        C33830m c33830m = new C33830m((List) c39560o.f170197c.f3536x);
        this.f134826e = c33830m;
        abstractC40652b.m131926f(c33830m);
        c33830m.m106977a(this);
    }

    @Override // p502ti.InterfaceC33818a
    /* JADX INFO: renamed from: a */
    public final void mo101529a() {
        this.f134827f = false;
        this.f134825d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[SYNTHETIC] */
    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i13 >= arrayList2.size()) {
                this.f134826e.f141677m = arrayList;
                return;
            }
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) arrayList2.get(i13);
            if (interfaceC32517c instanceof C32534t) {
                C32534t c32534t = (C32534t) interfaceC32517c;
                if (c32534t.f134836c == 1) {
                    this.f134828g.f76298a.add(c32534t);
                    c32534t.m101544d(this);
                } else if (!(interfaceC32517c instanceof C32531q)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    C32531q c32531q = (C32531q) interfaceC32517c;
                    c32531q.f134820b.m106977a(this);
                    arrayList.add(c32531q);
                }
            } else if (!(interfaceC32517c instanceof C32531q)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C32531q c32531q2 = (C32531q) interfaceC32517c;
                c32531q2.f134820b.m106977a(this);
                arrayList.add(c32531q2);
            }
            i13++;
        }
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: d */
    public final void mo101532d(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2) {
        AbstractC12062g.m33257g(c37305e, i13, arrayList, c37305e2, this);
    }

    @Override // p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        if (obj == InterfaceC30372a0.f124619K) {
            this.f134826e.m106986j(c11457j);
        }
    }

    @Override // si.InterfaceC32517c
    public final String getName() {
        return this.f134823b;
    }

    @Override // si.InterfaceC32527m
    public final Path getPath() {
        boolean z4 = this.f134827f;
        C33830m c33830m = this.f134826e;
        Path path = this.f134822a;
        if (z4 && c33830m.f141649e == null) {
            return path;
        }
        path.reset();
        if (this.f134824c) {
            this.f134827f = true;
            return path;
        }
        Path path2 = (Path) c33830m.mo106981e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f134828g.m56474a(path);
        this.f134827f = true;
        return path;
    }
}
