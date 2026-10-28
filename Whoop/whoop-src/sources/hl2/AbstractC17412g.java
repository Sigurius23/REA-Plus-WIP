package hl2;

import com.whoop.hrZones.network.Zone;
import com.whoop.hrZones.network.ZoneID;
import com.whoop.training.data.network.response.hrsettings.HeartRateEntryRow;
import com.whoop.training.data.network.response.hrsettings.ZoneRow;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: hl2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000*\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "Lcom/whoop/hrZones/network/Zone;", "e", "(Ljava/util/List;)Ljava/util/List;", "zoneRows", "d", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "zones", "f", "b", "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;", "", "maxHr", "c", "(Ljava/util/List;I)Ljava/util/List;", "training_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17412g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final List<Zone> m49416b(List<Zone> list) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Zone) next).getId() != ZoneID.ZONE_0);
        if (((Zone) next) != null) {
            C18284j c18284jM118950B = AbstractC37056f.m118950B(list);
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B, 10));
            Iterator it3 = c18284jM118950B.iterator();
            while (((C18283i) it3).f71138y) {
                arrayList.add(list.get((list.size() - 1) - ((AbstractC25243e0) it3).nextInt()));
            }
            return arrayList;
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(list);
        arrayListM74097F1.add(new Zone(ZoneID.ZONE_0, 0, ((Zone) AbstractC25265s.m74112P0(list)).getMin() - 1));
        C18284j c18284jM118950B2 = AbstractC37056f.m118950B(arrayListM74097F1);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B2, 10));
        Iterator it4 = c18284jM118950B2.iterator();
        while (((C18283i) it4).f71138y) {
            arrayList2.add((Zone) arrayListM74097F1.get((arrayListM74097F1.size() - 1) - ((AbstractC25243e0) it4).nextInt()));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public static final List<HeartRateEntryRow> m49417c(List<HeartRateEntryRow> list, int i13) {
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(list);
        arrayListM74097F1.set(1, HeartRateEntryRow.copy$default((HeartRateEntryRow) arrayListM74097F1.get(1), null, null, i13, null, false, 0, 0, 123, null));
        return arrayListM74097F1;
    }

    /* JADX INFO: renamed from: d */
    public static final List<ZoneRow> m49418d(List<Zone> list, List<ZoneRow> zoneRows) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(zoneRows, "zoneRows");
        C18284j c18284jM118950B = AbstractC37056f.m118950B(list);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B, 10));
        Iterator it = c18284jM118950B.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get((list.size() - 1) - ((AbstractC25243e0) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Zone) obj).getId() != ZoneID.ZONE_0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        int i13 = 0;
        for (Object obj2 : arrayList2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            Zone zone = (Zone) obj2;
            arrayList3.add(ZoneRow.copy$default(zoneRows.get(i13), null, null, null, zone.getMin(), zone.getMax(), 7, null));
            i13 = i14;
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: e */
    public static final List<Zone> m49419e(List<ZoneRow> list) {
        AbstractC22676k.m65750j(list, "<this>");
        List<ZoneRow> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (ZoneRow zoneRow : list2) {
            arrayList.add(new Zone(ZoneID.valueOf(zoneRow.getId()), zoneRow.getMin(), zoneRow.getMax()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static final List<ZoneRow> m49420f(List<ZoneRow> list, List<Zone> zones) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(zones, "zones");
        C18284j c18284jM118950B = AbstractC37056f.m118950B(zones);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B, 10));
        Iterator it = c18284jM118950B.iterator();
        while (it.hasNext()) {
            arrayList.add(zones.get((zones.size() - 1) - ((AbstractC25243e0) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Zone) obj).getId() != ZoneID.ZONE_0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        int i13 = 0;
        for (Object obj2 : arrayList2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList3.add(AbstractC22676k.m65745e(list.get(i13).getId(), "ZONE_5") ? ZoneRow.copy$default(list.get(i13), null, null, null, 0, ((Zone) obj2).getMax(), 15, null) : list.get(i13));
            i13 = i14;
        }
        return arrayList3;
    }
}
