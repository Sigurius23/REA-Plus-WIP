package p157fv;

import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ScreenCoordinate;
import f93.AbstractC14290b;
import j93.InterfaceC21493z;
import java.util.Iterator;
import p000.AbstractC11266d;
import p383ov.C28382d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fv.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14800f extends AbstractC14290b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54926w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14802h f54927x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14800f(C14802h c14802h, int i13) {
        super(null);
        this.f54926w = i13;
        this.f54927x = c14802h;
    }

    @Override // f93.AbstractC14290b
    public final void afterChange(InterfaceC21493z property, Object obj, Object obj2) {
        switch (this.f54926w) {
            case 0:
                AbstractC22676k.m65750j(property, "property");
                Point point = (Point) obj2;
                Point point2 = (Point) obj;
                if (point == null || AbstractC22676k.m65745e(point2, point)) {
                    return;
                }
                Iterator it = this.f54927x.f54953z.iterator();
                while (it.hasNext()) {
                    ((C28382d) it.next()).m86074a(point);
                }
                return;
            case 1:
                AbstractC22676k.m65750j(property, "property");
                Double d3 = (Double) obj2;
                Double d14 = (Double) obj;
                if (d3 != null) {
                    double dDoubleValue = d3.doubleValue();
                    if (AbstractC22676k.m65741a(d14, dDoubleValue)) {
                        return;
                    }
                    Iterator it3 = this.f54927x.f54932E.iterator();
                    while (it3.hasNext()) {
                        ((C28382d) it3.next()).m86074a(Double.valueOf(dDoubleValue));
                    }
                    return;
                }
                return;
            case 2:
                AbstractC22676k.m65750j(property, "property");
                EdgeInsets edgeInsets = (EdgeInsets) obj2;
                EdgeInsets edgeInsets2 = (EdgeInsets) obj;
                if (edgeInsets == null || AbstractC22676k.m65745e(edgeInsets2, edgeInsets)) {
                    return;
                }
                Iterator it4 = this.f54927x.f54933F.iterator();
                while (it4.hasNext()) {
                    ((C28382d) it4.next()).m86074a(edgeInsets);
                }
                return;
            case 3:
                AbstractC22676k.m65750j(property, "property");
                if (AbstractC22676k.m65745e((ScreenCoordinate) obj, (ScreenCoordinate) obj2)) {
                    return;
                }
                Iterator it5 = this.f54927x.f54934G.iterator();
                if (it5.hasNext()) {
                    throw AbstractC11266d.m30454h(it5);
                }
                return;
            case 4:
                AbstractC22676k.m65750j(property, "property");
                Double d15 = (Double) obj2;
                Double d16 = (Double) obj;
                if (d15 != null) {
                    double dDoubleValue2 = d15.doubleValue();
                    if (AbstractC22676k.m65741a(d16, dDoubleValue2)) {
                        return;
                    }
                    Iterator it6 = this.f54927x.f54935H.iterator();
                    while (it6.hasNext()) {
                        ((C28382d) it6.next()).m86074a(Double.valueOf(dDoubleValue2));
                    }
                    return;
                }
                return;
            default:
                AbstractC22676k.m65750j(property, "property");
                Double d17 = (Double) obj2;
                Double d18 = (Double) obj;
                if (d17 != null) {
                    double dDoubleValue3 = d17.doubleValue();
                    if (AbstractC22676k.m65741a(d18, dDoubleValue3)) {
                        return;
                    }
                    Iterator it7 = this.f54927x.f54936I.iterator();
                    while (it7.hasNext()) {
                        ((C28382d) it7.next()).m86074a(Double.valueOf(dDoubleValue3));
                    }
                    return;
                }
                return;
        }
    }
}
