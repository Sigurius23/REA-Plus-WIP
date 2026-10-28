package pk2;

import com.whoop.hrZones.network.ZoneID;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import ok2.C27995a;
import ok2.C27996b;
import ok2.C28000f;
import ok2.C28002h;
import ok2.EnumC27997c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JU\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0017\u0010\u0010J9\u0010\u0018\u001a\u00020\u000e2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lpk2/a;", "", "<init>", "()V", "Lcom/whoop/hrZones/network/ZoneID;", "activeZone", "", "Ljava/time/Duration;", "hrZoneDurations", "", "thumbPercent", "", "maxDurationMillis", "goalDurations", "Lok2/h;", "e", "(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Lok2/h;", "", "Lok2/a;", "zoneBars", "Lok2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;)Lok2/c;", "a", "g", "(Ljava/util/Map;Ljava/util/Map;)Lok2/h;", "Lok2/f;", "c", "(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;)Lok2/f;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29336a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C28002h m89290b(C29336a c29336a, ZoneID zoneID, Map map, float f13, Long l7, Map map2, int i13, Object obj) {
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
        return c29336a.m89295a(zoneID, map, f14, l12, map2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C28000f m89291d(C29336a c29336a, ZoneID zoneID, Map map, float f13, Long l7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f13 = 0.5f;
        }
        if ((i13 & 8) != 0) {
            l7 = null;
        }
        return c29336a.m89296c(zoneID, map, f13, l7);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    private final C28002h m89292e(ZoneID activeZone, Map<ZoneID, Duration> hrZoneDurations, float thumbPercent, Long maxDurationMillis, Map<ZoneID, Duration> goalDurations) {
        C27996b c27996b = C27996b.f112906a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(hrZoneDurations.size()));
        Iterator<T> it = hrZoneDurations.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Long.valueOf(((Duration) entry.getValue()).toMillis()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(goalDurations.size()));
        Iterator<T> it3 = goalDurations.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            linkedHashMap2.put(entry2.getKey(), Long.valueOf(((Duration) entry2.getValue()).toMillis()));
        }
        List<C27995a> listM84445c = c27996b.m84445c(activeZone, linkedHashMap, maxDurationMillis, thumbPercent, linkedHashMap2);
        return new C28002h(null, listM84445c, m89294h(listM84445c), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C28002h m89293f(C29336a c29336a, ZoneID zoneID, Map map, float f13, Long l7, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            zoneID = null;
        }
        int i14 = i13 & 2;
        C25272z c25272z = C25272z.f99163w;
        if (i14 != 0) {
            map = c25272z;
        }
        if ((i13 & 4) != 0) {
            f13 = 0.5f;
        }
        if ((i13 & 8) != 0) {
            l7 = null;
        }
        if ((i13 & 16) != 0) {
            map2 = c25272z;
        }
        return c29336a.m89292e(zoneID, map, f13, l7, map2);
    }

    /* JADX INFO: renamed from: h */
    private final EnumC27997c m89294h(List<C27995a> zoneBars) {
        List<C27995a> list = zoneBars;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C27995a) it.next()).getCom.whoop.weeklyplan.api.WeeklyPlanApiKt.GOAL java.lang.String() != null) {
                    return EnumC27997c.FullWithGoals;
                }
            }
        }
        return EnumC27997c.Full;
    }

    /* JADX INFO: renamed from: a */
    public final C28002h m89295a(ZoneID activeZone, Map<ZoneID, Duration> hrZoneDurations, float thumbPercent, Long maxDurationMillis, Map<ZoneID, Duration> goalDurations) {
        AbstractC22676k.m65750j(activeZone, "activeZone");
        AbstractC22676k.m65750j(hrZoneDurations, "hrZoneDurations");
        AbstractC22676k.m65750j(goalDurations, "goalDurations");
        return m89292e(activeZone, hrZoneDurations, thumbPercent, maxDurationMillis, goalDurations);
    }

    /* JADX INFO: renamed from: c */
    public final C28000f m89296c(ZoneID activeZone, Map<ZoneID, Duration> hrZoneDurations, float thumbPercent, Long maxDurationMillis) {
        AbstractC22676k.m65750j(activeZone, "activeZone");
        AbstractC22676k.m65750j(hrZoneDurations, "hrZoneDurations");
        return new C28000f(null, m89290b(this, activeZone, hrZoneDurations, thumbPercent, maxDurationMillis, null, 16, null).m84463b(), EnumC27997c.Compact, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final C28002h m89297g(Map<ZoneID, Duration> hrZoneDurations, Map<ZoneID, Duration> goalDurations) {
        AbstractC22676k.m65750j(hrZoneDurations, "hrZoneDurations");
        AbstractC22676k.m65750j(goalDurations, "goalDurations");
        return m89293f(this, null, hrZoneDurations, 0.0f, null, goalDurations, 13, null);
    }
}
