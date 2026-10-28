package bj;

import dj.AbstractC12064i;
import hg3.AbstractC17269i;
import java.io.EOFException;
import java.util.ArrayList;
import p049cj.C4736b;
import p049cj.C4738d;
import p119ej.C13224a;
import p372ol.C28007b;
import p426qi.C30387i;
import p502ti.C33828k;
import p581we.C37199o;
import p616xi.C38314b;
import p616xi.C38315c;
import p616xi.InterfaceC38318f;

/* JADX INFO: renamed from: bj.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3297a {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12854a = C37199o.m119195L("k", "x", "y");

    /* JADX INFO: renamed from: a */
    public static C28007b m9599a(C4738d c4738d, C30387i c30387i) throws C4736b, EOFException {
        ArrayList arrayList = new ArrayList();
        if (c4738d.mo14822i() == 1) {
            c4738d.beginArray();
            while (c4738d.hasNext()) {
                C4738d c4738d2 = c4738d;
                C30387i c30387i2 = c30387i;
                arrayList.add(new C33828k(c30387i2, AbstractC3317p.m9615b(c4738d2, c30387i2, AbstractC12064i.m33265c(), C3307f.f12871e, c4738d.mo14822i() == 3, false)));
                c4738d = c4738d2;
                c30387i = c30387i2;
            }
            c4738d.endArray();
            AbstractC3318q.m9617b(arrayList);
        } else {
            arrayList.add(new C13224a(AbstractC3316o.m9611b(c4738d, AbstractC12064i.m33265c())));
        }
        return new C28007b(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC38318f m9600b(C4738d c4738d, C30387i c30387i) throws C4736b, EOFException {
        c4738d.beginObject();
        C28007b c28007bM9599a = null;
        C38314b c38314bM48885c0 = null;
        boolean z4 = false;
        C38314b c38314bM48885c1 = null;
        while (c4738d.mo14822i() != 4) {
            int iMo14824m = c4738d.mo14824m(f12854a);
            if (iMo14824m == 0) {
                c28007bM9599a = m9599a(c4738d, c30387i);
            } else if (iMo14824m != 1) {
                if (iMo14824m != 2) {
                    c4738d.mo14825s();
                    c4738d.skipValue();
                } else if (c4738d.mo14822i() == 6) {
                    c4738d.skipValue();
                    z4 = true;
                } else {
                    c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                }
            } else if (c4738d.mo14822i() == 6) {
                c4738d.skipValue();
                z4 = true;
            } else {
                c38314bM48885c1 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
            }
        }
        c4738d.endObject();
        if (z4) {
            c30387i.m92858a("Lottie doesn't support expressions.");
        }
        return c28007bM9599a != null ? c28007bM9599a : new C38315c(c38314bM48885c1, c38314bM48885c0);
    }
}
