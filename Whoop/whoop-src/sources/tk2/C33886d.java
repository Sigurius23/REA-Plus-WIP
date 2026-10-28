package tk2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import e93.AbstractC12889b;
import kk2.AbstractC22551d;
import mk2.C25639f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: tk2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ltk2/d;", "", "<init>", "()V", "Lmk2/f;", "map", "", "targetDistanceMeters", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "Ltk2/c;", "a", "(Lmk2/f;Ljava/lang/Double;Lcom/whoop/domain/model/UnitSystem;)Ltk2/c;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33886d {

    /* JADX INFO: renamed from: a */
    public static final C33886d f141967a = new C33886d();

    private C33886d() {
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: a */
    public final C33885c m107174a(C25639f map, Double targetDistanceMeters, UnitSystem unitSystem) {
        double dDoubleValue;
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        if (map == null) {
            return null;
        }
        Double distanceMeters = map.getDistanceMeters();
        if (distanceMeters != null) {
            dDoubleValue = distanceMeters.doubleValue();
            if (dDoubleValue < 0.0d) {
                dDoubleValue = 0.0d;
            }
        } else {
            dDoubleValue = 0.0d;
        }
        Double d3 = (targetDistanceMeters == null || targetDistanceMeters.doubleValue() <= 0.0d) ? null : targetDistanceMeters;
        C33884b c33884b = C33884b.f141961a;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(c33884b.m107167f(dDoubleValue, unitSystem));
        if (d3 == null) {
            return new C33885c(textResourceM21278l, c33884b.m107169i(unitSystem), AbstractC8693b.m21277k(AbstractC22551d.f88697k), null);
        }
        return new C33885c(textResourceM21278l, c33884b.m107168h(d3.doubleValue(), unitSystem), AbstractC8693b.m21277k(AbstractC22551d.f88697k), new C33896n(AbstractC12889b.m36258X(AbstractC12889b.m36283m((float) (dDoubleValue / d3.doubleValue()), 0.0f, 1.0f) * 1000), 1000, (dDoubleValue > d3.doubleValue() ? 1 : (dDoubleValue == d3.doubleValue() ? 0 : -1)) >= 0 ? EnumC39333f.ACCENT_ACTION : EnumC39333f.STRAIN, null, 0.0f, 0, false, 120, null));
    }
}
