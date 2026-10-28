package i71;

import b61.C2759n;
import com.mapbox.maps.MapboxMap;
import e93.AbstractC12889b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k61.InterfaceC22229b;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i71.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\fJ=\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0011*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Li71/a;", "Li71/g;", "", "indexPadding", "<init>", "(I)V", "", "Lk61/b;", "data", "Li71/h;", "position", "d", "(Ljava/util/List;Li71/h;)I", "start", "b", "(I)I", "c", "T", "Li71/d;", MapboxMap.QFE_OFFSET, "a", "(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;", "I", "defaultStart", "Lb61/n;", "Lb61/n;", "pointSearcher", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18197a implements InterfaceC18203g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int indexPadding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int defaultStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2759n pointSearcher;

    public C18197a(int i13) {
        this.indexPadding = i13;
        this.pointSearcher = new C2759n();
    }

    /* JADX INFO: renamed from: b */
    private final int m52254b(int start) {
        return Math.max(0, start);
    }

    /* JADX INFO: renamed from: c */
    private final int m52255c(List<? extends InterfaceC22229b> data, C18204h position) {
        C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(data);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator it = c25263qM74105J1.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                break;
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            linkedHashMap.put((InterfaceC22229b) c25239c0.f99118b, Integer.valueOf(c25239c0.f99117a));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(Float.valueOf(((InterfaceC22229b) entry.getKey()).getXPercent()), entry.getValue());
        }
        return AbstractC12889b.m36285o(this.pointSearcher.m7812a(Float.intBitsToFloat((int) (position.m52267b() >> 32)), AbstractC25265s.m74093D1(linkedHashMap2.keySet())) + this.indexPadding, AbstractC37056f.m118950B(data));
    }

    /* JADX INFO: renamed from: d */
    private final int m52256d(List<? extends InterfaceC22229b> data, C18204h position) {
        C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(data);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator it = c25263qM74105J1.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                break;
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            linkedHashMap.put((InterfaceC22229b) c25239c0.f99118b, Integer.valueOf(c25239c0.f99117a));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(Float.valueOf(((InterfaceC22229b) entry.getKey()).getXPercent()), entry.getValue());
        }
        int iM7812a = this.pointSearcher.m7812a(Float.intBitsToFloat((int) (position.m52266a() >> 32)), AbstractC25265s.m74093D1(linkedHashMap2.keySet()));
        if (iM7812a == -1) {
            iM7812a = this.defaultStart;
        }
        return m52254b(iM7812a - this.indexPadding);
    }

    @Override // i71.InterfaceC18203g
    /* JADX INFO: renamed from: a */
    public <T extends InterfaceC22229b> List<T> mo52257a(List<? extends T> data, C18204h position, C18200d offset) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(offset, "offset");
        return data.isEmpty() ? C25271y.f99162w : data.subList(m52256d(data, position), m52255c(data, position) + 1);
    }

    public /* synthetic */ C18197a(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 1 : i13);
    }
}
