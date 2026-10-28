package bj;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import hg3.AbstractC17269i;
import java.util.List;
import p049cj.C4738d;
import p119ej.C13224a;
import p119ej.C13226c;
import p372ol.C28007b;
import p426qi.C30387i;
import p581we.C37199o;
import p616xi.C38313a;
import p616xi.C38314b;
import p616xi.C38315c;
import p616xi.C38317e;
import p616xi.InterfaceC38318f;

/* JADX INFO: renamed from: bj.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3301c {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12860a = C37199o.m119195L("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b */
    public static final C37199o f12861b = C37199o.m119195L("k");

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:75:0x0178  */
    /* JADX INFO: renamed from: a */
    public static C38317e m9602a(C4738d c4738d, C30387i c30387i) {
        C38313a c38313a;
        C38314b c38314bM48885c0;
        List list;
        C38314b c38314b;
        C38314b c38314b2;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z4 = c4738d.mo14822i() == 3;
        if (z4) {
            c4738d.beginObject();
        }
        C38314b c38314b3 = null;
        C38314b c38314bM48885c1 = null;
        C28007b c28007bM9599a = null;
        InterfaceC38318f interfaceC38318fM9600b = null;
        C38313a c38313a2 = null;
        C38314b c38314bM48885c2 = null;
        C38313a c38313aM48889e0 = null;
        C38314b c38314bM48885c3 = null;
        C38314b c38314bM48885c4 = null;
        while (c4738d.hasNext()) {
            switch (c4738d.mo14824m(f12860a)) {
                case 0:
                    c4738d.beginObject();
                    while (c4738d.hasNext()) {
                        if (c4738d.mo14824m(f12861b) != 0) {
                            c4738d.mo14825s();
                            c4738d.skipValue();
                        } else {
                            c28007bM9599a = AbstractC3297a.m9599a(c4738d, c30387i);
                        }
                    }
                    c4738d.endObject();
                    c38314bM48885c1 = c38314bM48885c1;
                    break;
                case 1:
                    interfaceC38318fM9600b = AbstractC3297a.m9600b(c4738d, c30387i);
                    break;
                case 2:
                    c38313a2 = new C38313a(AbstractC3318q.m9616a(c4738d, c30387i, 1.0f, C3307f.f12873g, false), 4);
                    c38314bM48885c1 = c38314bM48885c1;
                    break;
                case 3:
                    c30387i.m92858a("Lottie doesn't support 3D layers.");
                    c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    list = (List) c38314bM48885c0.f3536x;
                    if (list.isEmpty()) {
                        c38314b = c38314bM48885c0;
                        c38314b2 = c38314bM48885c1;
                        list.add(new C13224a(c30387i, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(c30387i.f124693m)));
                    } else {
                        c38314b = c38314bM48885c0;
                        c38314b2 = c38314bM48885c1;
                        if (((C13224a) list.get(0)).f45816b == null) {
                            list.set(0, new C13224a(c30387i, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(c30387i.f124693m)));
                        }
                    }
                    c38314bM48885c1 = c38314b2;
                    c38314b3 = c38314b;
                    break;
                case 4:
                    c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    list = (List) c38314bM48885c0.f3536x;
                    if (list.isEmpty()) {
                        c38314b = c38314bM48885c0;
                        c38314b2 = c38314bM48885c1;
                        list.add(new C13224a(c30387i, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(c30387i.f124693m)));
                    } else {
                        c38314b = c38314bM48885c0;
                        c38314b2 = c38314bM48885c1;
                        if (((C13224a) list.get(0)).f45816b == null) {
                            list.set(0, new C13224a(c30387i, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(c30387i.f124693m)));
                        }
                    }
                    c38314bM48885c1 = c38314b2;
                    c38314b3 = c38314b;
                    break;
                case 5:
                    c38313aM48889e0 = AbstractC17269i.m48889e0(c4738d, c30387i);
                    break;
                case 6:
                    c38314bM48885c3 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    break;
                case 7:
                    c38314bM48885c4 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    break;
                case 8:
                    c38314bM48885c2 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    break;
                case 9:
                    c38314bM48885c1 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                    break;
                default:
                    c4738d.mo14825s();
                    c4738d.skipValue();
                    break;
            }
        }
        C38314b c38314b4 = c38314bM48885c1;
        if (z4) {
            c4738d.endObject();
        }
        C28007b c28007b = (c28007bM9599a == null || (c28007bM9599a.mo2421p0() && ((PointF) ((C13224a) c28007bM9599a.f112939w.get(0)).f45816b).equals(0.0f, 0.0f))) ? null : c28007bM9599a;
        if (interfaceC38318fM9600b == null || (!(interfaceC38318fM9600b instanceof C38315c) && interfaceC38318fM9600b.mo2421p0() && ((PointF) ((C13224a) interfaceC38318fM9600b.mo2420m0().get(0)).f45816b).equals(0.0f, 0.0f))) {
            interfaceC38318fM9600b = null;
        }
        C38314b c38314b5 = (c38314b3 == null || (c38314b3.mo2421p0() && ((Float) ((C13224a) ((List) c38314b3.f3536x).get(0)).f45816b).floatValue() == 0.0f)) ? null : c38314b3;
        if (c38313a2 == null) {
            c38313a = null;
        } else {
            if (c38313a2.mo2421p0()) {
                C13226c c13226c = (C13226c) ((C13224a) ((List) c38313a2.f3536x).get(0)).f45816b;
                if (c13226c.f45838a == 1.0f && c13226c.f45839b == 1.0f) {
                    c38313a = null;
                }
            }
            c38313a = c38313a2;
        }
        return new C38317e(c28007b, interfaceC38318fM9600b, c38313a, c38314b5, c38313aM48889e0, c38314bM48885c3, c38314bM48885c4, (c38314bM48885c2 == null || (c38314bM48885c2.mo2421p0() && ((Float) ((C13224a) ((List) c38314bM48885c2.f3536x).get(0)).f45816b).floatValue() == 0.0f)) ? null : c38314bM48885c2, (c38314b4 == null || (c38314b4.mo2421p0() && ((Float) ((C13224a) ((List) c38314b4.f3536x).get(0)).f45816b).floatValue() == 0.0f)) ? null : c38314b4);
    }
}
