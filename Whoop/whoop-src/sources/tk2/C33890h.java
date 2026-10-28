package tk2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.hrZones.network.ZoneID;
import com.whoop.p069ui.AbstractC10538f;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kk2.AbstractC22551d;
import mk2.C25638e;
import mk2.C25639f;
import mk2.C25642i;
import mk2.C25645l;
import ok2.AbstractC28005k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: tk2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\r\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J+\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010!J#\u0010#\u001a\u00020\u001f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Ltk2/h;", "", "<init>", "()V", "Lmk2/l;", "", "a", "(Lmk2/l;)Ljava/lang/String;", "d", "Ly81/f;", "e", "(Lmk2/l;)Ly81/f;", "m", "c", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "f", "(Lmk2/l;Lcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;", "b", "value", "", "labelRes", "valueColor", "Ltk2/f;", "i", "(Ljava/lang/String;ILy81/f;)Ltk2/f;", "Lcom/whoop/design/util/TextResource;", "label", "j", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;)Ltk2/f;", "session", "Ltk2/g;", "g", "(Lmk2/l;)Ltk2/g;", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lmk2/l;Lcom/whoop/domain/model/UnitSystem;)Ltk2/g;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33890h {

    /* JADX INFO: renamed from: a */
    public static final C33890h f141975a = new C33890h();

    private C33890h() {
    }

    /* JADX INFO: renamed from: a */
    private final String m107181a(C25645l c25645l) {
        C25638e heartRate;
        Double averageBpm;
        if (c25645l == null || (heartRate = c25645l.getHeartRate()) == null || (averageBpm = heartRate.getAverageBpm()) == null) {
            return null;
        }
        return String.valueOf(AbstractC12889b.m36257W(averageBpm.doubleValue()));
    }

    /* JADX INFO: renamed from: b */
    private final String m107182b(C25645l c25645l, UnitSystem unitSystem) {
        C25639f map;
        Double distanceMeters;
        if (c25645l != null && (map = c25645l.getMap()) != null && (distanceMeters = map.getDistanceMeters()) != null) {
            if (distanceMeters.doubleValue() <= 0.0d) {
                distanceMeters = null;
            }
            if (distanceMeters != null) {
                double dDoubleValue = distanceMeters.doubleValue();
                C33884b c33884b = C33884b.f141961a;
                long seconds = c25645l.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String().getActive().getSeconds();
                return c33884b.m107166e(seconds >= 1 ? seconds : 1L, dDoubleValue, unitSystem);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final String m107183c(C25645l c25645l) {
        C25642i strain;
        if (c25645l != null && (strain = c25645l.getStrain()) != null) {
            Double dValueOf = Double.valueOf(strain.getCalories());
            if (dValueOf.doubleValue() <= 0.0d) {
                dValueOf = null;
            }
            if (dValueOf != null) {
                return String.valueOf(AbstractC12889b.m36257W(dValueOf.doubleValue()));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final String m107184d(C25645l c25645l) {
        C25638e heartRate;
        AbstractC39529d live2 = (c25645l == null || (heartRate = c25645l.getHeartRate()) == null) ? null : heartRate.getLive();
        AbstractC39529d.a aVar = live2 instanceof AbstractC39529d.a ? (AbstractC39529d.a) live2 : null;
        if (aVar != null) {
            return String.valueOf(aVar.getHeartRate());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final EnumC39333f m107185e(C25645l c25645l) {
        ZoneID zoneID;
        EnumC39333f enumC39333fM84470a;
        C25638e heartRate;
        AbstractC39529d live2 = (c25645l == null || (heartRate = c25645l.getHeartRate()) == null) ? null : heartRate.getLive();
        AbstractC39529d.a aVar = live2 instanceof AbstractC39529d.a ? (AbstractC39529d.a) live2 : null;
        return (aVar == null || (zoneID = aVar.getZoneID()) == null || (enumC39333fM84470a = AbstractC28005k.m84470a(zoneID)) == null) ? EnumC39333f.BRAND_WHITE : enumC39333fM84470a;
    }

    /* JADX INFO: renamed from: f */
    private final String m107186f(C25645l c25645l, UnitSystem unitSystem) {
        C25639f map;
        Double distanceMeters;
        if (c25645l != null && (map = c25645l.getMap()) != null && (distanceMeters = map.getDistanceMeters()) != null) {
            if (distanceMeters.doubleValue() <= 0.0d) {
                distanceMeters = null;
            }
            if (distanceMeters != null) {
                return C33884b.f141961a.m107167f(distanceMeters.doubleValue(), unitSystem);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    private final C33888f m107187i(String value, int labelRes, EnumC39333f valueColor) {
        return m107188j(value, AbstractC8693b.m21277k(labelRes), valueColor);
    }

    /* JADX INFO: renamed from: j */
    private final C33888f m107188j(String value, TextResource label, EnumC39333f valueColor) {
        if (value == null) {
            value = "--";
        }
        return new C33888f(AbstractC8693b.m21278l(value), label, valueColor);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C33888f m107189k(C33890h c33890h, String str, int i13, EnumC39333f enumC39333f, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            enumC39333f = EnumC39333f.BRAND_WHITE;
        }
        return c33890h.m107187i(str, i13, enumC39333f);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C33888f m107190l(C33890h c33890h, String str, TextResource textResource, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            enumC39333f = EnumC39333f.BRAND_WHITE;
        }
        return c33890h.m107188j(str, textResource, enumC39333f);
    }

    /* JADX INFO: renamed from: m */
    private final String m107191m(C25645l c25645l) {
        C25642i strain;
        if (c25645l != null && (strain = c25645l.getStrain()) != null) {
            Float fValueOf = Float.valueOf(strain.getScore());
            if (fValueOf.floatValue() <= 0.0f) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                return AbstractC10538f.m27183h(fValueOf.floatValue());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C33889g m107192g(C25645l session) {
        return new C33889g(null, AbstractC37056f.m118959K(m107189k(this, m107181a(session), AbstractC22551d.f88711y, null, 4, null), m107189k(this, m107191m(session), AbstractC22551d.f88662D, null, 4, null), m107189k(this, m107183c(session), AbstractC22551d.f88659A, null, 4, null)), 1, null);
    }

    /* JADX INFO: renamed from: h */
    public final C33889g m107193h(C25645l session, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        String strM107182b = m107182b(session, unitSystem);
        C33884b c33884b = C33884b.f141961a;
        return new C33889g(null, AbstractC37056f.m118959K(m107190l(this, strM107182b, c33884b.m107164a(unitSystem), null, 4, null), m107189k(this, m107184d(session), AbstractC22551d.f88661C, null, 4, null), m107190l(this, m107186f(session, unitSystem), c33884b.m107165c(unitSystem), null, 4, null)), 1, null);
    }

    /* JADX INFO: renamed from: n */
    public final C33889g m107194n(C25645l session) {
        return new C33889g(null, AbstractC37056f.m118959K(m107189k(this, m107181a(session), AbstractC22551d.f88711y, null, 4, null), m107187i(m107184d(session), AbstractC22551d.f88661C, m107185e(session)), m107189k(this, m107183c(session), AbstractC22551d.f88659A, null, 4, null)), 1, null);
    }
}
