package sv;

import com.mapbox.geojson.Point;
import o52.C27573q;
import p470rv.InterfaceC31836p;
import p470rv.InterfaceC31840t;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sv.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C33030f extends AbstractC33028d {

    /* JADX INFO: renamed from: F */
    public final InterfaceC31840t f137573F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33030f(C27573q indicatorPositionChangedListener) {
        super(AbstractC33025a.f137559a);
        AbstractC22676k.m65750j(indicatorPositionChangedListener, "indicatorPositionChangedListener");
        this.f137573F = indicatorPositionChangedListener;
    }

    @Override // sv.AbstractC33028d
    /* JADX INFO: renamed from: c */
    public final void mo104295c(Object obj, float f13) {
        Point value = (Point) obj;
        AbstractC22676k.m65750j(value, "value");
        InterfaceC31836p interfaceC31836p = this.f137569y;
        if (interfaceC31836p != null) {
            interfaceC31836p.mo91099T(value);
        }
        this.f137573F.mo83270a(value);
    }
}
