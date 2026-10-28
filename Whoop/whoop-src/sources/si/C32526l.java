package si;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p108e4.AbstractC12682p;
import p502ti.C33834q;
import p649yi.C39552g;

/* JADX INFO: renamed from: si.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C32526l implements InterfaceC32527m, InterfaceC32524j {

    /* JADX INFO: renamed from: a */
    public final Path f134775a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f134776b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f134777c = new Path();

    /* JADX INFO: renamed from: d */
    public final ArrayList f134778d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final C39552g f134779e;

    public C32526l(C39552g c39552g) {
        this.f134779e = c39552g;
    }

    /* JADX INFO: renamed from: a */
    public final void m101542a(Path.Op op3) {
        Path path = this.f134776b;
        path.reset();
        Path path2 = this.f134775a;
        path2.reset();
        ArrayList arrayList = this.f134778d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            InterfaceC32527m interfaceC32527m = (InterfaceC32527m) arrayList.get(size);
            if (interfaceC32527m instanceof C32518d) {
                C32518d c32518d = (C32518d) interfaceC32527m;
                ArrayList arrayList2 = (ArrayList) c32518d.m101535f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((InterfaceC32527m) arrayList2.get(size2)).getPath();
                    Matrix matrixM107002e = c32518d.f134715d;
                    C33834q c33834q = c32518d.f134723l;
                    if (c33834q != null) {
                        matrixM107002e = c33834q.m107002e();
                    } else {
                        matrixM107002e.reset();
                    }
                    path3.transform(matrixM107002e);
                    path.addPath(path3);
                }
            } else {
                path.addPath(interfaceC32527m.getPath());
            }
        }
        int i13 = 0;
        InterfaceC32527m interfaceC32527m2 = (InterfaceC32527m) arrayList.get(0);
        if (interfaceC32527m2 instanceof C32518d) {
            C32518d c32518d2 = (C32518d) interfaceC32527m2;
            List listM101535f = c32518d2.m101535f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listM101535f;
                if (i13 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((InterfaceC32527m) arrayList3.get(i13)).getPath();
                Matrix matrixM107002e2 = c32518d2.f134715d;
                C33834q c33834q2 = c32518d2.f134723l;
                if (c33834q2 != null) {
                    matrixM107002e2 = c33834q2.m107002e();
                } else {
                    matrixM107002e2.reset();
                }
                path4.transform(matrixM107002e2);
                path2.addPath(path4);
                i13++;
            }
        } else {
            path2.set(interfaceC32527m2.getPath());
        }
        this.f134777c.op(path2, path, op3);
    }

    @Override // si.InterfaceC32517c
    /* JADX INFO: renamed from: b */
    public final void mo101530b(List list, List list2) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f134778d;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((InterfaceC32527m) arrayList.get(i13)).mo101530b(list, list2);
            i13++;
        }
    }

    @Override // si.InterfaceC32524j
    /* JADX INFO: renamed from: f */
    public final void mo101541f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC32517c interfaceC32517c = (InterfaceC32517c) listIterator.previous();
            if (interfaceC32517c instanceof InterfaceC32527m) {
                this.f134778d.add((InterfaceC32527m) interfaceC32517c);
                listIterator.remove();
            }
        }
    }

    @Override // si.InterfaceC32527m
    public final Path getPath() {
        Path path = this.f134777c;
        path.reset();
        C39552g c39552g = this.f134779e;
        if (!c39552g.f170160b) {
            int iM35485e = AbstractC12682p.m35485e(c39552g.f170159a);
            if (iM35485e == 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList = this.f134778d;
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((InterfaceC32527m) arrayList.get(i13)).getPath());
                    i13++;
                }
            } else {
                if (iM35485e == 1) {
                    m101542a(Path.Op.UNION);
                    return path;
                }
                if (iM35485e == 2) {
                    m101542a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iM35485e == 3) {
                    m101542a(Path.Op.INTERSECT);
                    return path;
                }
                if (iM35485e == 4) {
                    m101542a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
