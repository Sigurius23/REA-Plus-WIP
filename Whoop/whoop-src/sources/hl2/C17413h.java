package hl2;

import com.whoop.training.data.network.response.hrsettings.ZoneRow;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.EnumC33227v1;

/* JADX INFO: renamed from: hl2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ9\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J9\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lhl2/h;", "", "<init>", "()V", "", "zoneId", "", "e", "(Ljava/lang/String;)I", "d", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "zone", "selectedValue", "Lsz0/v1;", "zoneValueType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;ILsz0/v1;)Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "startIndex", "", "zones", "", "f", "(ILjava/util/List;)Ljava/util/List;", "currentIndex", "Ll83/a0;", "b", "(Ljava/util/List;I)V", "a", "maxHR", "rhr", "Ll83/k;", "g", "(Ljava/lang/String;Lsz0/v1;II)Ll83/k;", "c", "(ILsz0/v1;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17413h {

    /* JADX INFO: renamed from: hl2.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67498a;

        static {
            int[] iArr = new int[EnumC33227v1.values().length];
            try {
                iArr[EnumC33227v1.MANUAL_ZONE_MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33227v1.MANUAL_ZONE_MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67498a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m49421a(List<ZoneRow> zones, int currentIndex) {
        if (currentIndex >= zones.size() - 1) {
            return;
        }
        int i13 = currentIndex + 1;
        if (zones.get(currentIndex).getMin() - zones.get(i13).getMax() != 1) {
            zones.set(i13, ZoneRow.copy$default(zones.get(i13), null, null, null, 0, zones.get(currentIndex).getMin() - 1, 15, null));
            if (zones.get(i13).getMax() - zones.get(i13).getMin() < 2) {
                zones.set(i13, ZoneRow.copy$default(zones.get(i13), null, null, null, zones.get(i13).getMax() - 2, 0, 23, null));
            }
            m49421a(zones, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m49422b(List<ZoneRow> zones, int currentIndex) {
        if (currentIndex <= 0) {
            return;
        }
        int i13 = currentIndex - 1;
        if (zones.get(i13).getMin() - zones.get(currentIndex).getMax() != 1) {
            zones.set(i13, ZoneRow.copy$default(zones.get(i13), null, null, null, zones.get(currentIndex).getMax() + 1, 0, 23, null));
            if (zones.get(i13).getMax() - zones.get(i13).getMin() < 2) {
                zones.set(i13, ZoneRow.copy$default(zones.get(i13), null, null, null, 0, zones.get(i13).getMin() + 2, 15, null));
            }
            m49422b(zones, i13);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private final int m49423d(String zoneId) {
        switch (zoneId.hashCode()) {
            case -1642992546:
                if (zoneId.equals("ZONE_1")) {
                    return 4;
                }
                break;
            case -1642992545:
                if (zoneId.equals("ZONE_2")) {
                    return 3;
                }
                break;
            case -1642992544:
                if (zoneId.equals("ZONE_3")) {
                    return 2;
                }
                break;
            case -1642992543:
                if (zoneId.equals("ZONE_4")) {
                    return 1;
                }
                break;
            case -1642992542:
                if (zoneId.equals("ZONE_5")) {
                    return 0;
                }
                break;
        }
        throw new IllegalArgumentException("Invalid zone ID");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    private final int m49424e(String zoneId) {
        switch (zoneId.hashCode()) {
            case -1642992546:
                if (zoneId.equals("ZONE_1")) {
                    return 0;
                }
                break;
            case -1642992545:
                if (zoneId.equals("ZONE_2")) {
                    return 1;
                }
                break;
            case -1642992544:
                if (zoneId.equals("ZONE_3")) {
                    return 2;
                }
                break;
            case -1642992543:
                if (zoneId.equals("ZONE_4")) {
                    return 3;
                }
                break;
            case -1642992542:
                if (zoneId.equals("ZONE_5")) {
                    return 4;
                }
                break;
        }
        throw new IllegalArgumentException("Invalid zone ID");
    }

    /* JADX INFO: renamed from: f */
    private final List<ZoneRow> m49425f(int startIndex, List<ZoneRow> zones) {
        if (startIndex == 0) {
            m49421a(zones, startIndex);
            return zones;
        }
        if (startIndex == 1 || startIndex == 2 || startIndex == 3) {
            m49422b(zones, startIndex);
            m49421a(zones, startIndex);
            return zones;
        }
        if (startIndex != 4) {
            return zones;
        }
        m49422b(zones, startIndex);
        return zones;
    }

    /* JADX INFO: renamed from: h */
    private final ZoneRow m49426h(ZoneRow zone, int selectedValue, EnumC33227v1 zoneValueType) {
        int i13 = b.f67498a[zoneValueType.ordinal()];
        if (i13 == 1) {
            return ZoneRow.copy$default(zone, null, null, null, selectedValue, Math.max(zone.getMax(), selectedValue + 2), 7, null);
        }
        if (i13 == 2) {
            return ZoneRow.copy$default(zone, null, null, null, Math.min(zone.getMin(), selectedValue - 2), selectedValue, 7, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final List<ZoneRow> m49427c(int selectedValue, EnumC33227v1 zoneValueType, List<ZoneRow> zones, String zoneId) {
        AbstractC22676k.m65750j(zoneValueType, "zoneValueType");
        AbstractC22676k.m65750j(zones, "zones");
        AbstractC22676k.m65750j(zoneId, "zoneId");
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(zones);
        Iterator it = arrayListM74097F1.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(((ZoneRow) it.next()).getId(), zoneId)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("Zone with ID ", zoneId, " not found"));
        }
        arrayListM74097F1.set(i13, m49426h((ZoneRow) arrayListM74097F1.get(i13), selectedValue, zoneValueType));
        return m49425f(i13, arrayListM74097F1);
    }

    /* JADX INFO: renamed from: g */
    public final C23465k m49428g(String zoneId, EnumC33227v1 zoneValueType, int maxHR, int rhr) {
        AbstractC22676k.m65750j(zoneId, "zoneId");
        AbstractC22676k.m65750j(zoneValueType, "zoneValueType");
        int iMax = Math.max((int) (((double) maxHR) * 0.5d), rhr);
        int i13 = b.f67498a[zoneValueType.ordinal()];
        if (i13 == 1) {
            return new C23465k(Integer.valueOf((m49424e(zoneId) * 3) + iMax), Integer.valueOf((maxHR - (m49423d(zoneId) * 3)) - 2));
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new C23465k(Integer.valueOf((m49424e(zoneId) * 3) + iMax + 2), Integer.valueOf(maxHR - (m49423d(zoneId) * 3)));
    }
}
