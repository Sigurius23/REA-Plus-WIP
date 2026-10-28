package i51;

import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDeviceKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i51.x */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Li51/x;", "", "<init>", "()V", "Li51/v$a;", "slot", "", "", "", "c", "(Li51/v$a;)Ljava/util/Map;", "Li51/v$b;", "d", "(Li51/v$b;)Ljava/util/Map;", "Li51/v$d;", "b", "(Li51/v$d;)Ljava/util/Map;", "Li51/v$c;", "e", "(Li51/v$c;)Ljava/util/Map;", "", "Li51/v;", "slots", "a", "(Ljava/util/List;)Ljava/util/Map;", "Ltr2/n;", "Ltr2/n;", "logger", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18127x {

    /* JADX INFO: renamed from: a */
    public static final C18127x f70420a = new C18127x();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("SlotResolver");

    /* JADX INFO: renamed from: c */
    public static final int f70422c = 8;

    private C18127x() {
    }

    /* JADX INFO: renamed from: b */
    private final Map<String, Integer> m52068b(AbstractC18125v.d slot) {
        int i13 = slot.getValue() ? 100 : 0;
        List<String> listM52061a = slot.m52061a();
        if (listM52061a == null) {
            listM52061a = C25271y.f99162w;
        }
        List<String> list = listM52061a;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(obj, Integer.valueOf(i13));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    private final Map<String, Integer> m52069c(AbstractC18125v.a slot) {
        String layerPattern = slot.getLayerPattern();
        if (layerPattern == null) {
            logger.mo85222m("SlotConfig.Cumulative is missing layerPattern — backend contract violation", new AbstractC30556a.a[0]);
            return C25272z.f99163w;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int max = slot.getMax();
        if (1 <= max) {
            int i13 = 1;
            while (true) {
                linkedHashMap.put(AbstractC39421y.m125926K(layerPattern, "{i}", String.valueOf(i13), false), Integer.valueOf(i13 <= slot.getSelected() ? 100 : 0));
                if (i13 == max) {
                    break;
                }
                i13++;
            }
        }
        List<String> listM52050a = slot.m52050a();
        if (listM52050a != null) {
            Iterator<T> it = listM52050a.iterator();
            while (it.hasNext()) {
                linkedHashMap.put((String) it.next(), Integer.valueOf(slot.getSelected() >= 1 ? 100 : 0));
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    private final Map<String, Integer> m52070d(AbstractC18125v.b slot) {
        String layerPattern = slot.getLayerPattern();
        if (layerPattern == null) {
            logger.mo85222m("SlotConfig.Exclusive is missing layerPattern — backend contract violation", new AbstractC30556a.a[0]);
            return C25272z.f99163w;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int max = slot.getMax();
        int i13 = 1;
        if (1 <= max) {
            while (true) {
                linkedHashMap.put(AbstractC39421y.m125926K(layerPattern, "{i}", String.valueOf(i13), false), Integer.valueOf(i13 == slot.getSelected() ? 100 : 0));
                if (i13 == max) {
                    break;
                }
                i13++;
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: e */
    private final Map<String, Integer> m52071e(AbstractC18125v.c slot) {
        int i13;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C18126w c18126w : slot.m52057a()) {
            boolean z4 = c18126w.getId() == slot.getSelectedGroup();
            List<String> listM52064b = c18126w.m52064b();
            if (listM52064b == null) {
                listM52064b = AbstractC37056f.m118958J(slot.getName() + "-" + c18126w.getId() + WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID);
            }
            List<String> listM52067e = c18126w.m52067e();
            if (listM52067e == null) {
                listM52067e = AbstractC37056f.m118958J(slot.getName() + "-" + c18126w.getId() + "-2");
            }
            String layerPattern = c18126w.getLayerPattern();
            if (layerPattern == null) {
                layerPattern = slot.getName() + "-" + c18126w.getId() + "-2-{i}";
            }
            Iterator<T> it = listM52064b.iterator();
            while (true) {
                int i14 = 100;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (!z4) {
                    i14 = 0;
                }
                linkedHashMap.put(str, Integer.valueOf(i14));
            }
            Iterator<T> it3 = listM52067e.iterator();
            while (it3.hasNext()) {
                linkedHashMap.put((String) it3.next(), Integer.valueOf((!z4 || slot.getSelectedLevel() < 1) ? 0 : 100));
            }
            int max = c18126w.getMax();
            if (1 <= max) {
                while (true) {
                    linkedHashMap.put(AbstractC39421y.m125926K(layerPattern, "{i}", String.valueOf(i13), false), Integer.valueOf((!z4 || i13 > slot.getSelectedLevel()) ? 0 : 100));
                    i13 = i13 != max ? i13 + 1 : 1;
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Integer> m52072a(List<? extends AbstractC18125v> slots) {
        AbstractC22676k.m65750j(slots, "slots");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AbstractC18125v abstractC18125v : slots) {
            if (abstractC18125v instanceof AbstractC18125v.a) {
                linkedHashMap.putAll(m52069c((AbstractC18125v.a) abstractC18125v));
            } else if (abstractC18125v instanceof AbstractC18125v.b) {
                linkedHashMap.putAll(m52070d((AbstractC18125v.b) abstractC18125v));
            } else if (abstractC18125v instanceof AbstractC18125v.d) {
                linkedHashMap.putAll(m52068b((AbstractC18125v.d) abstractC18125v));
            } else {
                if (!(abstractC18125v instanceof AbstractC18125v.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedHashMap.putAll(m52071e((AbstractC18125v.c) abstractC18125v));
            }
        }
        return linkedHashMap;
    }
}
