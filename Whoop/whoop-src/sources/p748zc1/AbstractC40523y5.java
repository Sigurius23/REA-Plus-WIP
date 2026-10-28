package p748zc1;

import b91.AbstractC2890e;
import b91.C2886a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.C22396h;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p636y3.C39174f;
import p700bd1.C3090h;
import p700bd1.C3103u;
import p700bd1.C3107y;
import p715kotlin.Metadata;
import p745y81.AbstractC42793j;
import p747z81.AbstractC42794f;
import p747z81.Function1;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: zc1.y5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003¨\u0006\b"}, m65681d2 = {"", "Lbd1/h;", "a", "()Ljava/util/List;", "Lbd1/y;", "c", "Lbd1/u;", "b", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40523y5 {
    /* JADX INFO: renamed from: a */
    public static final List<C3090h> m131218a() {
        List<C22396h<C17919x>> listM125331D = AbstractC42793j.m125436c().m125331D();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125331D, 10));
        Iterator<T> it = listM125331D.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3090h((C22396h) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final List<C3103u> m131219b() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = Function1.m128938q().m128917a().iterator();
        while (it.hasNext()) {
            arrayList.add(new C3103u((C22396h) it.next(), null, null, null, 14, null));
        }
        Iterator<T> it3 = AbstractC42794f.m128943c().m128940a().iterator();
        while (it3.hasNext()) {
            arrayList.add(new C3103u(null, (C22396h) it3.next(), null, null, 13, null));
        }
        for (int i13 = 1; i13 < 9; i13++) {
            arrayList.add(new C3103u(null, null, AbstractC31061c.m95635k(i13 * 4, "dp radius"), new C39174f(i13 * 4), 3, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final List<C3107y> m131220c() {
        List<C22396h<C2886a>> listM8431l = AbstractC2890e.m8450e().m8431l();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM8431l, 10));
        Iterator<T> it = listM8431l.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3107y((C22396h) it.next()));
        }
        return arrayList;
    }
}
