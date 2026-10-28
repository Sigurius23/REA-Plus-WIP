package p333n4;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: n4.g */
/* JADX INFO: loaded from: classes5.dex */
public class C26251g implements InterfaceC26249e {

    /* JADX INFO: renamed from: d */
    public final AbstractC26260p f104383d;

    /* JADX INFO: renamed from: f */
    public int f104385f;

    /* JADX INFO: renamed from: g */
    public int f104386g;

    /* JADX INFO: renamed from: a */
    public AbstractC26260p f104380a = null;

    /* JADX INFO: renamed from: b */
    public boolean f104381b = false;

    /* JADX INFO: renamed from: c */
    public boolean f104382c = false;

    /* JADX INFO: renamed from: e */
    public int f104384e = 1;

    /* JADX INFO: renamed from: h */
    public int f104387h = 1;

    /* JADX INFO: renamed from: i */
    public C26252h f104388i = null;

    /* JADX INFO: renamed from: j */
    public boolean f104389j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f104390k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f104391l = new ArrayList();

    public C26251g(AbstractC26260p abstractC26260p) {
        this.f104383d = abstractC26260p;
    }

    @Override // p333n4.InterfaceC26249e
    /* JADX INFO: renamed from: a */
    public final void mo77901a(InterfaceC26249e interfaceC26249e) {
        ArrayList<C26251g> arrayList = this.f104391l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C26251g) it.next()).f104389j) {
                return;
            }
        }
        this.f104382c = true;
        AbstractC26260p abstractC26260p = this.f104380a;
        if (abstractC26260p != null) {
            abstractC26260p.mo77901a(this);
        }
        if (this.f104381b) {
            this.f104383d.mo77901a(this);
            return;
        }
        C26251g c26251g = null;
        int i13 = 0;
        for (C26251g c26251g2 : arrayList) {
            if (!(c26251g2 instanceof C26252h)) {
                i13++;
                c26251g = c26251g2;
            }
        }
        if (c26251g != null && i13 == 1 && c26251g.f104389j) {
            C26252h c26252h = this.f104388i;
            if (c26252h != null) {
                if (!c26252h.f104389j) {
                    return;
                } else {
                    this.f104385f = this.f104387h * c26252h.f104386g;
                }
            }
            mo77918d(c26251g.f104386g + this.f104385f);
        }
        AbstractC26260p abstractC26260p2 = this.f104380a;
        if (abstractC26260p2 != null) {
            abstractC26260p2.mo77901a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77916b(AbstractC26260p abstractC26260p) {
        this.f104390k.add(abstractC26260p);
        if (this.f104389j) {
            abstractC26260p.mo77901a(abstractC26260p);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77917c() {
        this.f104391l.clear();
        this.f104390k.clear();
        this.f104389j = false;
        this.f104386g = 0;
        this.f104382c = false;
        this.f104381b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo77918d(int i13) {
        if (this.f104389j) {
            return;
        }
        this.f104389j = true;
        this.f104386g = i13;
        for (InterfaceC26249e interfaceC26249e : this.f104390k) {
            interfaceC26249e.mo77901a(interfaceC26249e);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f104383d.f104406b.f97924i0);
        sb4.append(":");
        switch (this.f104384e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb4.append(str);
        sb4.append("(");
        sb4.append(this.f104389j ? Integer.valueOf(this.f104386g) : "unresolved");
        sb4.append(") <t=");
        sb4.append(this.f104391l.size());
        sb4.append(":d=");
        sb4.append(this.f104390k.size());
        sb4.append(">");
        return sb4.toString();
    }
}
