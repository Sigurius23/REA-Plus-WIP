package ok2;

import com.whoop.design.util.TextResource;
import com.whoop.hrZones.network.ZoneID;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kk2.AbstractC22551d;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ok2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ja\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lok2/b;", "", "<init>", "()V", "", "Lok2/a;", "f", "()Ljava/util/List;", "Lcom/whoop/hrZones/network/ZoneID;", "activeZone", "", "", "durationsMillis", "maxDurationMillis", "", "thumbPercent", "goalDurationsMillis", "c", "(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;Ljava/lang/Long;FLjava/util/Map;)Ljava/util/List;", "zoneID", "", "isActive", "durationMillis", "goalDurationMillis", "b", "(Lcom/whoop/hrZones/network/ZoneID;ZFJJJ)Lok2/a;", "e", "(JLjava/util/Map;)J", "actualDurationMillis", "Lok2/d;", "a", "(JJJ)Lok2/d;", "Lok2/j;", "i", "(J)Lok2/j;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/hrZones/network/ZoneID;)I", "g", "(JJ)F", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27996b {

    /* JADX INFO: renamed from: a */
    public static final C27996b f112906a = new C27996b();

    private C27996b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m84442d(C27996b c27996b, ZoneID zoneID, Map map, Long l7, float f13, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            zoneID = null;
        }
        int i14 = i13 & 2;
        C25272z c25272z = C25272z.f99163w;
        if (i14 != 0) {
            map = c25272z;
        }
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        if ((i13 & 8) != 0) {
            f13 = 0.5f;
        }
        if ((i13 & 16) != 0) {
            map2 = c25272z;
        }
        return c27996b.m84445c(zoneID, map, l7, f13, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C27998d m84443a(long goalDurationMillis, long maxDurationMillis, long actualDurationMillis) {
        float fM84448g = m84448g(goalDurationMillis, maxDurationMillis);
        if (goalDurationMillis <= 0 || fM84448g <= 0.0f) {
            return null;
        }
        return new C27998d(fM84448g, m84450i(goalDurationMillis), actualDurationMillis >= goalDurationMillis, actualDurationMillis != goalDurationMillis);
    }

    /* JADX INFO: renamed from: b */
    public final C27995a m84444b(ZoneID zoneID, boolean isActive, float thumbPercent, long durationMillis, long maxDurationMillis, long goalDurationMillis) {
        AbstractC22676k.m65750j(zoneID, "zoneID");
        EnumC39333f enumC39333fM84470a = AbstractC28005k.m84470a(zoneID);
        float fM84448g = m84448g(durationMillis, maxDurationMillis);
        return new C27995a(zoneID, enumC39333fM84470a, isActive, thumbPercent, m84450i(durationMillis), durationMillis, fM84448g, durationMillis > 0 && fM84448g > 0.0f, isActive ? enumC39333fM84470a : EnumC39333f.WHITE_70, isActive ? 1.0f : 0.3f, m84443a(goalDurationMillis, maxDurationMillis, durationMillis));
    }

    /* JADX INFO: renamed from: c */
    public final List<C27995a> m84445c(ZoneID activeZone, Map<ZoneID, Long> durationsMillis, Long maxDurationMillis, float thumbPercent, Map<ZoneID, Long> goalDurationsMillis) {
        Long lValueOf;
        long jLongValue;
        AbstractC22676k.m65750j(durationsMillis, "durationsMillis");
        AbstractC22676k.m65750j(goalDurationsMillis, "goalDurationsMillis");
        if (maxDurationMillis != null) {
            jLongValue = maxDurationMillis.longValue();
        } else {
            Long l7 = (Long) AbstractC25265s.m74115S0(durationsMillis.values());
            if (l7 != null) {
                long jLongValue2 = l7.longValue();
                if (jLongValue2 < 1) {
                    jLongValue2 = 1;
                }
                lValueOf = Long.valueOf(jLongValue2);
            } else {
                lValueOf = null;
            }
            jLongValue = lValueOf != null ? lValueOf.longValue() : 1L;
        }
        long jM84446e = m84446e(jLongValue, goalDurationsMillis);
        InterfaceC33616a<ZoneID> entries = ZoneID.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(entries, 10));
        for (ZoneID zoneID : entries) {
            boolean z4 = zoneID == activeZone;
            C27996b c27996b = f112906a;
            float f13 = z4 ? thumbPercent : 0.0f;
            Long l12 = durationsMillis.get(zoneID);
            long jLongValue3 = 0;
            long jLongValue4 = l12 != null ? l12.longValue() : 0L;
            Long l13 = goalDurationsMillis.get(zoneID);
            if (l13 != null) {
                jLongValue3 = l13.longValue();
            }
            arrayList.add(c27996b.m84444b(zoneID, z4, f13, jLongValue4, jM84446e, jLongValue3));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final long m84446e(long maxDurationMillis, Map<ZoneID, Long> goalDurationsMillis) {
        AbstractC22676k.m65750j(goalDurationsMillis, "goalDurationsMillis");
        Long l7 = (Long) AbstractC25265s.m74115S0(goalDurationsMillis.values());
        long jMax = Math.max(maxDurationMillis, l7 != null ? l7.longValue() : 0L);
        if (jMax < 1) {
            return 1L;
        }
        return jMax;
    }

    /* JADX INFO: renamed from: f */
    public final List<C27995a> m84447f() {
        return m84442d(this, null, null, null, 0.0f, null, 31, null);
    }

    /* JADX INFO: renamed from: g */
    public final float m84448g(long durationMillis, long maxDurationMillis) {
        if (durationMillis <= 0 || maxDurationMillis <= 0) {
            return 0.0f;
        }
        return AbstractC12889b.m36283m(durationMillis / maxDurationMillis, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: h */
    public final int m84449h(ZoneID zoneID) {
        AbstractC22676k.m65750j(zoneID, "zoneID");
        return zoneID.ordinal();
    }

    /* JADX INFO: renamed from: i */
    public final C28004j m84450i(long durationMillis) {
        long j7 = durationMillis / 1000;
        if (j7 < 0) {
            j7 = 0;
        }
        long j13 = j7 / 3600;
        long j14 = (j7 % 3600) / 60;
        return new C28004j(j13 > 0 ? new TextResource.C8688b(AbstractC22551d.f88690d, new TextResource.AbstractC8690d.a(Long.valueOf(j13)), new TextResource.AbstractC8690d.a(Long.valueOf(j14))) : new TextResource.C8688b(AbstractC22551d.f88691e, new TextResource.AbstractC8690d.a(Long.valueOf(j14))), new TextResource.C8688b(AbstractC22551d.f88692f, new TextResource.AbstractC8690d.a(Long.valueOf(j7 % 60))));
    }
}
