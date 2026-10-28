package pk2;

import com.whoop.design.util.TextResource;
import com.whoop.hrZones.network.ZoneID;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Duration;
import java.util.Map;
import kk2.AbstractC22551d;
import m83.C25272z;
import mk2.C25638e;
import mk2.C25645l;
import mk2.C25650q;
import ok2.AbstractC28005k;
import ok2.C27996b;
import ok2.C27999e;
import ok2.C28000f;
import ok2.C28002h;
import ok2.C28003i;
import ok2.EnumC27997c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25292c0;
import tk2.C33883a;
import tk2.C33889g;
import tk2.C33890h;
import wb3.AbstractC37056f;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: pk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0014J-\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001f\u0010 J]\u0010&\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b&\u0010'JU\u0010(\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+J9\u0010,\u001a\u00020\u00152\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001b2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104¨\u00065"}, m65681d2 = {"Lpk2/b;", "", "Lpk2/a;", "zonesReducer", "<init>", "(Lpk2/a;)V", "Lcom/whoop/hrZones/network/ZoneID;", "activeZone", "", "heartRateBpm", "Lok2/i;", "a", "(Lcom/whoop/hrZones/network/ZoneID;I)Lok2/i;", "Lcom/whoop/design/util/TextResource;", "n", "(Lcom/whoop/hrZones/network/ZoneID;)Lcom/whoop/design/util/TextResource;", "Lmk2/q;", "domainState", "Ltk2/a;", "l", "(Lmk2/q;)Ltk2/a;", "Lok2/h;", "j", "(Lmk2/q;)Lok2/h;", "m", "Lyg2/d;", "heartRate", "", "Ljava/time/Duration;", "hrZoneDurations", "Lok2/f;", "f", "(Lyg2/d;Ljava/util/Map;)Lok2/f;", "", "thumbPercent", "", "maxDurationMillis", "goalDurations", "b", "(Lcom/whoop/hrZones/network/ZoneID;ILjava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Ltk2/a;", "d", "(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Lok2/h;", "g", "()Ltk2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/Map;Ljava/util/Map;)Lok2/h;", "Ltk2/g;", "metricsItem", "k", "(ILtk2/g;)Ltk2/a;", "i", "(Ltk2/g;)Ltk2/a;", "Lpk2/a;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29337b {

    /* JADX INFO: renamed from: b */
    private static final a f118855b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final float f118856c = ((float) 5.5d) * 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29336a zonesReducer;

    /* JADX INFO: renamed from: pk2.b$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lpk2/b$a;", "", "<init>", "()V", "", "PinnedTrailingMetricsCount", "I", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C29337b(C29336a zonesReducer) {
        AbstractC22676k.m65750j(zonesReducer, "zonesReducer");
        this.zonesReducer = zonesReducer;
    }

    /* JADX INFO: renamed from: a */
    private final C28003i m89298a(ZoneID activeZone, int heartRateBpm) {
        return new C28003i(null, Integer.valueOf(heartRateBpm), true, new C27999e(m89301n(activeZone), AbstractC28005k.m84470a(activeZone)), false, 17, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C33883a m89299c(C29337b c29337b, ZoneID zoneID, int i13, Map map, float f13, Long l7, Map map2, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            f13 = 0.5f;
        }
        float f14 = f13;
        if ((i14 & 16) != 0) {
            l7 = null;
        }
        Long l12 = l7;
        if ((i14 & 32) != 0) {
            map2 = C25272z.f99163w;
        }
        return c29337b.m89302b(zoneID, i13, map, f14, l12, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C28002h m89300e(C29337b c29337b, ZoneID zoneID, Map map, float f13, Long l7, Map map2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f13 = 0.5f;
        }
        float f14 = f13;
        if ((i13 & 8) != 0) {
            l7 = null;
        }
        Long l12 = l7;
        if ((i13 & 16) != 0) {
            map2 = C25272z.f99163w;
        }
        return c29337b.m89303d(zoneID, map, f14, l12, map2);
    }

    /* JADX INFO: renamed from: n */
    private final TextResource m89301n(ZoneID activeZone) {
        return new TextResource.C8688b(AbstractC22551d.f88689c, new TextResource.AbstractC8690d.a(Integer.valueOf(C27996b.f112906a.m84449h(activeZone))));
    }

    /* JADX INFO: renamed from: b */
    public final C33883a m89302b(ZoneID activeZone, int heartRateBpm, Map<ZoneID, Duration> hrZoneDurations, float thumbPercent, Long maxDurationMillis, Map<ZoneID, Duration> goalDurations) {
        AbstractC22676k.m65750j(activeZone, "activeZone");
        AbstractC22676k.m65750j(hrZoneDurations, "hrZoneDurations");
        AbstractC22676k.m65750j(goalDurations, "goalDurations");
        return new C33883a(AbstractC37056f.m118958J(m89298a(activeZone, heartRateBpm)), false, 0, false, 10, null);
    }

    /* JADX INFO: renamed from: d */
    public final C28002h m89303d(ZoneID activeZone, Map<ZoneID, Duration> hrZoneDurations, float thumbPercent, Long maxDurationMillis, Map<ZoneID, Duration> goalDurations) {
        AbstractC22676k.m65750j(activeZone, "activeZone");
        AbstractC22676k.m65750j(hrZoneDurations, "hrZoneDurations");
        AbstractC22676k.m65750j(goalDurations, "goalDurations");
        return this.zonesReducer.m89295a(activeZone, hrZoneDurations, thumbPercent, maxDurationMillis, goalDurations);
    }

    /* JADX INFO: renamed from: f */
    public final C28000f m89304f(AbstractC39529d heartRate, Map<ZoneID, Duration> hrZoneDurations) {
        AbstractC22676k.m65750j(hrZoneDurations, "hrZoneDurations");
        return heartRate instanceof AbstractC39529d.a ? C29336a.m89291d(this.zonesReducer, ((AbstractC39529d.a) heartRate).getZoneID(), hrZoneDurations, 0.0f, null, 12, null) : new C28000f(null, C27996b.f112906a.m84447f(), EnumC27997c.Compact, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final C33883a m89305g() {
        return new C33883a(AbstractC37056f.m118958J(new C28003i(null, null, false, null, false, 31, null)), false, 0, false, 10, null);
    }

    /* JADX INFO: renamed from: h */
    public final C28002h m89306h(Map<ZoneID, Duration> hrZoneDurations, Map<ZoneID, Duration> goalDurations) {
        AbstractC22676k.m65750j(hrZoneDurations, "hrZoneDurations");
        AbstractC22676k.m65750j(goalDurations, "goalDurations");
        return this.zonesReducer.m89297g(hrZoneDurations, goalDurations);
    }

    /* JADX INFO: renamed from: i */
    public final C33883a m89307i(C33889g metricsItem) {
        AbstractC22676k.m65750j(metricsItem, "metricsItem");
        return new C33883a(AbstractC37056f.m118959K(new C28003i(null, null, false, null, true, 15, null), new C25292c0(0.0f, f118856c, 1, null), metricsItem), true, 2, true);
    }

    /* JADX INFO: renamed from: j */
    public final C28002h m89308j(C25650q domainState) {
        C25638e heartRate;
        AbstractC22676k.m65750j(domainState, "domainState");
        C25645l trackSessionState = domainState.getTrackSessionState();
        AbstractC39529d live2 = (trackSessionState == null || (heartRate = trackSessionState.getHeartRate()) == null) ? null : heartRate.getLive();
        Map<ZoneID, Duration> hrZoneTargets = domainState.getTargets().getHrZoneTargets();
        if (live2 instanceof AbstractC39529d.a) {
            return m89300e(this, ((AbstractC39529d.a) live2).getZoneID(), trackSessionState.m75460c(), 0.0f, null, hrZoneTargets, 12, null);
        }
        Map<ZoneID, Duration> mapM75460c = trackSessionState != null ? trackSessionState.m75460c() : null;
        if (mapM75460c == null) {
            mapM75460c = C25272z.f99163w;
        }
        return m89306h(mapM75460c, hrZoneTargets);
    }

    /* JADX INFO: renamed from: k */
    public final C33883a m89309k(int heartRateBpm, C33889g metricsItem) {
        AbstractC22676k.m65750j(metricsItem, "metricsItem");
        return new C33883a(AbstractC37056f.m118959K(new C28003i(null, Integer.valueOf(heartRateBpm), true, null, true, 9, null), new C25292c0(0.0f, f118856c, 1, null), metricsItem), true, 2, true);
    }

    /* JADX INFO: renamed from: l */
    public final C33883a m89310l(C25650q domainState) {
        C25638e heartRate;
        AbstractC22676k.m65750j(domainState, "domainState");
        C25645l trackSessionState = domainState.getTrackSessionState();
        AbstractC39529d live2 = (trackSessionState == null || (heartRate = trackSessionState.getHeartRate()) == null) ? null : heartRate.getLive();
        if (!(live2 instanceof AbstractC39529d.a)) {
            return m89305g();
        }
        AbstractC39529d.a aVar = (AbstractC39529d.a) live2;
        return m89299c(this, aVar.getZoneID(), aVar.getHeartRate(), trackSessionState.m75460c(), 0.0f, null, null, 56, null);
    }

    /* JADX INFO: renamed from: m */
    public final C33883a m89311m(C25650q domainState) {
        C25638e heartRate;
        AbstractC22676k.m65750j(domainState, "domainState");
        C25645l trackSessionState = domainState.getTrackSessionState();
        AbstractC39529d live2 = (trackSessionState == null || (heartRate = trackSessionState.getHeartRate()) == null) ? null : heartRate.getLive();
        C33889g c33889gM107192g = C33890h.f141975a.m107192g(trackSessionState);
        return live2 instanceof AbstractC39529d.a ? m89309k(((AbstractC39529d.a) live2).getHeartRate(), c33889gM107192g) : m89307i(c33889gM107192g);
    }

    public /* synthetic */ C29337b(C29336a c29336a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C29336a() : c29336a);
    }
}
