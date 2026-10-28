package p589wn;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p465rm.C31521c0;
import p466rn.C31607a;

/* JADX INFO: renamed from: wn.m */
/* JADX INFO: loaded from: classes6.dex */
public class C37405m extends AbstractC37406n {

    /* JADX INFO: renamed from: n */
    public static final C37405m f160056n;

    /* JADX INFO: renamed from: d */
    public final List f160057d;

    /* JADX INFO: renamed from: e */
    public final List f160058e;

    /* JADX INFO: renamed from: f */
    public final List f160059f;

    /* JADX INFO: renamed from: g */
    public final List f160060g;

    /* JADX INFO: renamed from: h */
    public final List f160061h;

    /* JADX INFO: renamed from: i */
    public final List f160062i;

    /* JADX INFO: renamed from: j */
    public final C31521c0 f160063j;

    /* JADX INFO: renamed from: k */
    public final List f160064k;

    /* JADX INFO: renamed from: l */
    public final Map f160065l;

    /* JADX INFO: renamed from: m */
    public final List f160066m;

    static {
        List list = Collections.EMPTY_LIST;
        f160056n = new C37405m("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C37405m(String str, List list, List list2, List list3, List list4, List list5, List list6, C31521c0 c31521c0, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list2.size(); i13++) {
            Uri uri = ((C37404l) list2.get(i13)).f160050a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m119755b(list3, arrayList);
        m119755b(list4, arrayList);
        m119755b(list5, arrayList);
        m119755b(list6, arrayList);
        this.f160057d = Collections.unmodifiableList(arrayList);
        this.f160058e = Collections.unmodifiableList(list2);
        this.f160059f = Collections.unmodifiableList(list3);
        this.f160060g = Collections.unmodifiableList(list4);
        this.f160061h = Collections.unmodifiableList(list5);
        this.f160062i = Collections.unmodifiableList(list6);
        this.f160063j = c31521c0;
        this.f160064k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f160065l = Collections.unmodifiableMap(map);
        this.f160066m = Collections.unmodifiableList(list8);
    }

    /* JADX INFO: renamed from: b */
    public static void m119755b(List list, ArrayList arrayList) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            Uri uri = ((C37403k) list.get(i13)).f160047a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m119756c(int i13, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i14 = 0; i14 < list.size(); i14++) {
            Object obj = list.get(i14);
            for (int i15 = 0; i15 < list2.size(); i15++) {
                C31607a c31607a = (C31607a) list2.get(i15);
                if (c31607a.f130620x == i13 && c31607a.f130621y == i14) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // p589wn.AbstractC37406n
    /* JADX INFO: renamed from: a */
    public final Object mo119754a(List list) {
        ArrayList arrayListM119756c = m119756c(0, this.f160058e, list);
        List list2 = Collections.EMPTY_LIST;
        return new C37405m(this.f160067a, this.f160068b, arrayListM119756c, list2, m119756c(1, this.f160060g, list), m119756c(2, this.f160061h, list), list2, this.f160063j, this.f160064k, this.f160069c, this.f160065l, this.f160066m);
    }
}
