package jl2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.training.data.network.response.hrsettings.ZoneRow;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33218s1;
import p736sz0.C33224u1;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: jl2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "", "units", "", "areEditable", "Lsz0/s1;", "a", "(Ljava/util/List;Ljava/lang/String;Z)Ljava/util/List;", "training_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21777d {
    /* JADX INFO: renamed from: a */
    public static final List<C33218s1> m61598a(List<ZoneRow> list, String units, boolean z4) {
        EnumC21774a enumC21774a;
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(units, "units");
        List<ZoneRow> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (ZoneRow zoneRow : list2) {
            String id4 = zoneRow.getId();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(zoneRow.getLabel());
            String id5 = zoneRow.getId();
            EnumC21774a enumC21774a2 = EnumC21774a.ZONE_1;
            EnumC21774a[] enumC21774aArrValues = EnumC21774a.values();
            int length = enumC21774aArrValues.length;
            boolean z13 = false;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC21774a = null;
                    break;
                }
                enumC21774a = enumC21774aArrValues[i13];
                if (AbstractC22676k.m65745e(enumC21774a.name(), id5)) {
                    break;
                }
                i13++;
            }
            if (enumC21774a != null) {
                enumC21774a2 = enumC21774a;
            }
            EnumC39333f whoopColorKey = enumC21774a2.toWhoopColorKey();
            C33224u1 c33224u1 = new C33224u1(zoneRow.getMin(), AbstractC8693b.m21278l(String.valueOf(zoneRow.getMin())), z4);
            int max = zoneRow.getMax();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(String.valueOf(zoneRow.getMax()));
            if (!AbstractC22676k.m65745e(zoneRow.getId(), EnumC21774a.ZONE_5.getId())) {
                z13 = z4;
            }
            arrayList.add(new C33218s1(id4, textResourceM21278l, whoopColorKey, AbstractC8693b.m21278l(units), null, 0.0f, c33224u1, new C33224u1(max, textResourceM21278l2, z13), 48, null));
        }
        return arrayList;
    }
}
